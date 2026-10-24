package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.INotificationSideChannel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class NotificationManagerCompat {
    private static String DW;
    private static final Object j6 = new Object();
    private static Set<String> FH = new HashSet();

    private static class SideChannelManager implements Handler.Callback, ServiceConnection {
        private final Context WB;
        private final Handler jw;
        private final HandlerThread mb;
        private final Map<ComponentName, a> fY = new HashMap();
        private Set<String> qp = new HashSet();

        private static class a {
            public INotificationSideChannel FH;
            public final ComponentName j6;
            public boolean DW = false;
            public LinkedList<b> Hw = new LinkedList<>();
            public int v5 = 0;

            public a(ComponentName componentName) {
                this.j6 = componentName;
            }
        }

        public SideChannelManager(Context context) {
            this.WB = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.mb = handlerThread;
            handlerThread.start();
            this.jw = new Handler(this.mb.getLooper(), this);
        }

        private void DW(a aVar) {
            if (aVar.DW) {
                this.WB.unbindService(this);
                aVar.DW = false;
            }
            aVar.FH = null;
        }

        private void FH(b bVar) {
            u7();
            for (a aVar : this.fY.values()) {
                aVar.Hw.add(bVar);
                VH(aVar);
            }
        }

        private void Hw(ComponentName componentName) {
            a aVar = this.fY.get(componentName);
            if (aVar != null) {
                VH(aVar);
            }
        }

        private void VH(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.j6 + ", " + aVar.Hw.size() + " queued tasks");
            }
            if (aVar.Hw.isEmpty()) {
                return;
            }
            if (!j6(aVar) || aVar.FH == null) {
                gn(aVar);
                return;
            }
            while (true) {
                b bVarPeek = aVar.Hw.peek();
                if (bVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + bVarPeek);
                    }
                    bVarPeek.j6(aVar.FH);
                    aVar.Hw.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.j6);
                    }
                } catch (RemoteException e) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.j6, e);
                }
            }
            if (aVar.Hw.isEmpty()) {
                return;
            }
            gn(aVar);
        }

        private void Zo(ComponentName componentName) {
            a aVar = this.fY.get(componentName);
            if (aVar != null) {
                DW(aVar);
            }
        }

        private void gn(a aVar) {
            if (this.jw.hasMessages(3, aVar.j6)) {
                return;
            }
            int i = aVar.v5 + 1;
            aVar.v5 = i;
            if (i <= 6) {
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i2 + " ms");
                }
                this.jw.sendMessageDelayed(this.jw.obtainMessage(3, aVar.j6), i2);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.Hw.size() + " tasks to " + aVar.j6 + " after " + aVar.v5 + " retries");
            aVar.Hw.clear();
        }

        private boolean j6(a aVar) {
            if (aVar.DW) {
                return true;
            }
            boolean zBindService = this.WB.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.j6), this, 33);
            aVar.DW = zBindService;
            if (zBindService) {
                aVar.v5 = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.j6);
                this.WB.unbindService(this);
            }
            return aVar.DW;
        }

        private void u7() {
            Set<String> setJ6 = NotificationManagerCompat.j6(this.WB);
            if (setJ6.equals(this.qp)) {
                return;
            }
            this.qp = setJ6;
            List<ResolveInfo> listQueryIntentServices = this.WB.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setJ6.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.fY.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.fY.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.fY.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    DW(next.getValue());
                    it.remove();
                }
            }
        }

        private void v5(ComponentName componentName, IBinder iBinder) {
            a aVar = this.fY.get(componentName);
            if (aVar != null) {
                aVar.FH = INotificationSideChannel.Sub.asInterface(iBinder);
                aVar.v5 = 0;
                VH(aVar);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                FH((b) message.obj);
                return true;
            }
            if (i == 1) {
                a aVar = (a) message.obj;
                v5(aVar.j6, aVar.DW);
                return true;
            }
            if (i == 2) {
                Zo((ComponentName) message.obj);
                return true;
            }
            if (i != 3) {
                return false;
            }
            Hw((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.jw.obtainMessage(1, new a(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.jw.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private static class a {
        final IBinder DW;
        final ComponentName j6;

        a(ComponentName componentName, IBinder iBinder) {
            this.j6 = componentName;
            this.DW = iBinder;
        }
    }

    private interface b {
        void j6(INotificationSideChannel iNotificationSideChannel);
    }

    public static Set<String> j6(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (j6) {
            if (string != null) {
                if (!string.equals(DW)) {
                    String[] strArrSplit = string.split(":");
                    HashSet hashSet = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    FH = hashSet;
                    DW = string;
                }
                set = FH;
            } else {
                set = FH;
            }
        }
        return set;
    }
}
