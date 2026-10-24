package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.a;
import android.support.v4.media.b;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {
    static final boolean DW = Log.isLoggable("MediaBrowserCompat", 3);
    private final e j6;

    private static class CustomActionResultReceiver extends ResultReceiver {
        private final String fY;
        private final c k2;
        private final Bundle qp;

        @Override // android.support.v4.os.ResultReceiver
        protected void j6(int i, Bundle bundle) {
            c cVar = this.k2;
            if (cVar == null) {
                return;
            }
            if (i == -1) {
                cVar.j6(this.fY, this.qp, bundle);
                return;
            }
            if (i == 0) {
                cVar.FH(this.fY, this.qp, bundle);
                return;
            }
            if (i == 1) {
                cVar.DW(this.fY, this.qp, bundle);
                return;
            }
            Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.qp + ", resultData=" + bundle + ")");
        }
    }

    private static class ItemReceiver extends ResultReceiver {
        private final String fY;
        private final d qp;

        @Override // android.support.v4.os.ResultReceiver
        protected void j6(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.qp.j6(this.fY);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.qp.DW((MediaItem) parcelable);
            } else {
                this.qp.j6(this.fY);
            }
        }
    }

    private static class SearchResultReceiver extends ResultReceiver {
        private final String fY;
        private final k k2;
        private final Bundle qp;

        @Override // android.support.v4.os.ResultReceiver
        protected void j6(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.k2.j6(this.fY, this.qp);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            this.k2.DW(this.fY, this.qp, arrayList);
        }
    }

    private static class a extends Handler {
        private WeakReference<Messenger> DW;
        private final WeakReference<j> j6;

        a(j jVar) {
            this.j6 = new WeakReference<>(jVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.DW;
            if (weakReference == null || weakReference.get() == null || this.j6.get() == null) {
                return;
            }
            Bundle data = message.getData();
            data.setClassLoader(MediaSessionCompat.class.getClassLoader());
            j jVar = this.j6.get();
            Messenger messenger = this.DW.get();
            try {
                int i = message.what;
                if (i == 1) {
                    jVar.Zo(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), data.getBundle("data_root_hints"));
                } else if (i == 2) {
                    jVar.gn(messenger);
                } else if (i != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                } else {
                    jVar.VH(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), data.getBundle("data_options"));
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    jVar.gn(messenger);
                }
            }
        }

        void j6(Messenger messenger) {
            this.DW = new WeakReference<>(messenger);
        }
    }

    public static class b {
        a DW;
        final Object j6;

        interface a {
            void FH();

            void Hw();

            void j6();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b, reason: collision with other inner class name */
        private class C0020b implements a.InterfaceC0021a {
            C0020b() {
            }

            @Override // android.support.v4.media.a.InterfaceC0021a
            public void FH() {
                a aVar = b.this.DW;
                if (aVar != null) {
                    aVar.FH();
                }
                b.this.j6();
            }

            @Override // android.support.v4.media.a.InterfaceC0021a
            public void Hw() {
                a aVar = b.this.DW;
                if (aVar != null) {
                    aVar.Hw();
                }
                b.this.DW();
            }

            @Override // android.support.v4.media.a.InterfaceC0021a
            public void j6() {
                a aVar = b.this.DW;
                if (aVar != null) {
                    aVar.j6();
                }
                b.this.FH();
            }
        }

        public b() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.j6 = android.support.v4.media.a.FH(new C0020b());
            } else {
                this.j6 = null;
            }
        }

        public void DW() {
            throw null;
        }

        public void FH() {
            throw null;
        }

        void Hw(a aVar) {
            this.DW = aVar;
        }

        public void j6() {
            throw null;
        }
    }

    public static abstract class c {
        public abstract void DW(String str, Bundle bundle, Bundle bundle2);

        public abstract void FH(String str, Bundle bundle, Bundle bundle2);

        public abstract void j6(String str, Bundle bundle, Bundle bundle2);
    }

    public static abstract class d {
        public abstract void DW(MediaItem mediaItem);

        public abstract void j6(String str);
    }

    interface e {
        void DW();

        void disconnect();

        MediaSessionCompat.Token v5();
    }

    static class f implements e, j, b.a {
        protected final Object DW;
        protected final Bundle FH;
        protected Messenger VH;
        protected l Zo;
        private MediaSessionCompat.Token gn;
        final Context j6;
        protected final a Hw = new a(this);
        private final ArrayMap<String, m> v5 = new ArrayMap<>();

        public f(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            this.j6 = context;
            bundle = bundle == null ? new Bundle() : bundle;
            bundle.putInt("extra_client_version", 1);
            this.FH = new Bundle(bundle);
            bVar.Hw(this);
            this.DW = android.support.v4.media.a.DW(context, componentName, bVar.j6, this.FH);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void DW() {
            android.support.v4.media.a.j6(this.DW);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void FH() {
            Bundle bundleZo = android.support.v4.media.a.Zo(this.DW);
            if (bundleZo == null) {
                return;
            }
            IBinder iBinderJ6 = androidx.core.app.g.j6(bundleZo, "extra_messenger");
            if (iBinderJ6 != null) {
                this.Zo = new l(iBinderJ6, this.FH);
                Messenger messenger = new Messenger(this.Hw);
                this.VH = messenger;
                this.Hw.j6(messenger);
                try {
                    this.Zo.Hw(this.VH);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                }
            }
            IMediaSession iMediaSessionAsInterface = IMediaSession.Sub.asInterface(androidx.core.app.g.j6(bundleZo, "extra_session_binder"));
            if (iMediaSessionAsInterface != null) {
                this.gn = MediaSessionCompat.Token.DW(android.support.v4.media.a.VH(this.DW), iMediaSessionAsInterface);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void Hw() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void VH(Messenger messenger, String str, List list, Bundle bundle) {
            if (this.VH != messenger) {
                return;
            }
            m mVar = this.v5.get(str);
            if (mVar == null) {
                if (MediaBrowserCompat.DW) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                    return;
                }
                return;
            }
            n nVarJ6 = mVar.j6(this.j6, bundle);
            if (nVarJ6 != null) {
                if (bundle == null) {
                    if (list == null) {
                        nVarJ6.Hw(str);
                        return;
                    } else {
                        nVarJ6.DW(str, list);
                        return;
                    }
                }
                if (list == null) {
                    nVarJ6.v5(str, bundle);
                } else {
                    nVarJ6.FH(str, list, bundle);
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void Zo(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void disconnect() {
            Messenger messenger;
            l lVar = this.Zo;
            if (lVar != null && (messenger = this.VH) != null) {
                try {
                    lVar.Zo(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            android.support.v4.media.a.v5(this.DW);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void gn(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void j6() {
            this.Zo = null;
            this.VH = null;
            this.gn = null;
            this.Hw.j6(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public MediaSessionCompat.Token v5() {
            if (this.gn == null) {
                this.gn = MediaSessionCompat.Token.j6(android.support.v4.media.a.VH(this.DW));
            }
            return this.gn;
        }
    }

    static class g extends f {
        public g(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    static class h extends g {
        public h(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    static class i implements e, j {
        final ComponentName DW;
        private String EQ;
        final b FH;
        final Bundle Hw;
        private Bundle J0;
        c gn;
        final Context j6;
        Messenger tp;
        l u7;
        private MediaSessionCompat.Token we;
        final a v5 = new a(this);
        private final ArrayMap<String, m> Zo = new ArrayMap<>();
        int VH = 1;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i iVar = i.this;
                if (iVar.VH == 0) {
                    return;
                }
                iVar.VH = 2;
                if (MediaBrowserCompat.DW && iVar.gn != null) {
                    throw new RuntimeException("mServiceConnection should be null. Instead it is " + i.this.gn);
                }
                i iVar2 = i.this;
                if (iVar2.u7 != null) {
                    throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + i.this.u7);
                }
                if (iVar2.tp != null) {
                    throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + i.this.tp);
                }
                Intent intent = new Intent("android.media.browse.MediaBrowserService");
                intent.setComponent(i.this.DW);
                i iVar3 = i.this;
                iVar3.gn = iVar3.new c();
                boolean zBindService = false;
                try {
                    zBindService = i.this.j6.bindService(intent, i.this.gn, 1);
                } catch (Exception unused) {
                    Log.e("MediaBrowserCompat", "Failed binding to service " + i.this.DW);
                }
                if (!zBindService) {
                    i.this.FH();
                    i.this.FH.DW();
                }
                if (MediaBrowserCompat.DW) {
                    Log.d("MediaBrowserCompat", "connect...");
                    i.this.j6();
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i iVar = i.this;
                Messenger messenger = iVar.tp;
                if (messenger != null) {
                    try {
                        iVar.u7.FH(messenger);
                    } catch (RemoteException unused) {
                        Log.w("MediaBrowserCompat", "RemoteException during connect for " + i.this.DW);
                    }
                }
                i iVar2 = i.this;
                int i = iVar2.VH;
                iVar2.FH();
                if (i != 0) {
                    i.this.VH = i;
                }
                if (MediaBrowserCompat.DW) {
                    Log.d("MediaBrowserCompat", "disconnect...");
                    i.this.j6();
                }
            }
        }

        private class c implements ServiceConnection {

            class a implements Runnable {
                final /* synthetic */ ComponentName WB;
                final /* synthetic */ IBinder mb;

                a(ComponentName componentName, IBinder iBinder) {
                    this.WB = componentName;
                    this.mb = iBinder;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (MediaBrowserCompat.DW) {
                        Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceConnected name=" + this.WB + " binder=" + this.mb);
                        i.this.j6();
                    }
                    if (c.this.j6("onServiceConnected")) {
                        i iVar = i.this;
                        iVar.u7 = new l(this.mb, iVar.Hw);
                        i.this.tp = new Messenger(i.this.v5);
                        i iVar2 = i.this;
                        iVar2.v5.j6(iVar2.tp);
                        i.this.VH = 2;
                        try {
                            if (MediaBrowserCompat.DW) {
                                Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                i.this.j6();
                            }
                            i.this.u7.DW(i.this.j6, i.this.tp);
                        } catch (RemoteException unused) {
                            Log.w("MediaBrowserCompat", "RemoteException during connect for " + i.this.DW);
                            if (MediaBrowserCompat.DW) {
                                Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                i.this.j6();
                            }
                        }
                    }
                }
            }

            class b implements Runnable {
                final /* synthetic */ ComponentName WB;

                b(ComponentName componentName) {
                    this.WB = componentName;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (MediaBrowserCompat.DW) {
                        Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceDisconnected name=" + this.WB + " this=" + this + " mServiceConnection=" + i.this.gn);
                        i.this.j6();
                    }
                    if (c.this.j6("onServiceDisconnected")) {
                        i iVar = i.this;
                        iVar.u7 = null;
                        iVar.tp = null;
                        iVar.v5.j6(null);
                        i iVar2 = i.this;
                        iVar2.VH = 4;
                        iVar2.FH.FH();
                    }
                }
            }

            c() {
            }

            private void DW(Runnable runnable) {
                if (Thread.currentThread() == i.this.v5.getLooper().getThread()) {
                    runnable.run();
                } else {
                    i.this.v5.post(runnable);
                }
            }

            boolean j6(String str) {
                int i;
                i iVar = i.this;
                if (iVar.gn == this && (i = iVar.VH) != 0 && i != 1) {
                    return true;
                }
                int i2 = i.this.VH;
                if (i2 == 0 || i2 == 1) {
                    return false;
                }
                Log.i("MediaBrowserCompat", str + " for " + i.this.DW + " with mServiceConnection=" + i.this.gn + " this=" + this);
                return false;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                DW(new a(componentName, iBinder));
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                DW(new b(componentName));
            }
        }

        public i(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            }
            if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            }
            if (bVar == null) {
                throw new IllegalArgumentException("connection callback must not be null");
            }
            this.j6 = context;
            this.DW = componentName;
            this.FH = bVar;
            this.Hw = bundle == null ? null : new Bundle(bundle);
        }

        private static String Hw(int i) {
            if (i == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            return "UNKNOWN/" + i;
        }

        private boolean tp(Messenger messenger, String str) {
            int i;
            if (this.tp == messenger && (i = this.VH) != 0 && i != 1) {
                return true;
            }
            int i2 = this.VH;
            if (i2 == 0 || i2 == 1) {
                return false;
            }
            Log.i("MediaBrowserCompat", str + " for " + this.DW + " with mCallbacksMessenger=" + this.tp + " this=" + this);
            return false;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void DW() {
            int i = this.VH;
            if (i == 0 || i == 1) {
                this.VH = 2;
                this.v5.post(new a());
            } else {
                throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + Hw(this.VH) + ")");
            }
        }

        void FH() {
            c cVar = this.gn;
            if (cVar != null) {
                this.j6.unbindService(cVar);
            }
            this.VH = 1;
            this.gn = null;
            this.u7 = null;
            this.tp = null;
            this.v5.j6(null);
            this.EQ = null;
            this.we = null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void VH(Messenger messenger, String str, List list, Bundle bundle) {
            if (tp(messenger, "onLoadChildren")) {
                if (MediaBrowserCompat.DW) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for " + this.DW + " id=" + str);
                }
                m mVar = this.Zo.get(str);
                if (mVar == null) {
                    if (MediaBrowserCompat.DW) {
                        Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                        return;
                    }
                    return;
                }
                n nVarJ6 = mVar.j6(this.j6, bundle);
                if (nVarJ6 != null) {
                    if (bundle == null) {
                        if (list == null) {
                            nVarJ6.Hw(str);
                            return;
                        } else {
                            nVarJ6.DW(str, list);
                            return;
                        }
                    }
                    if (list == null) {
                        nVarJ6.v5(str, bundle);
                    } else {
                        nVarJ6.FH(str, list, bundle);
                    }
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void Zo(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (tp(messenger, "onConnect")) {
                if (this.VH != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + Hw(this.VH) + "... ignoring");
                    return;
                }
                this.EQ = str;
                this.we = token;
                this.J0 = bundle;
                this.VH = 3;
                if (MediaBrowserCompat.DW) {
                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                    j6();
                }
                this.FH.j6();
                try {
                    for (Map.Entry<String, m> entry : this.Zo.entrySet()) {
                        String key = entry.getKey();
                        m value = entry.getValue();
                        List<n> listDW = value.DW();
                        List<Bundle> listFH = value.FH();
                        for (int i = 0; i < listDW.size(); i++) {
                            this.u7.j6(key, listDW.get(i).DW, listFH.get(i), this.tp);
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void disconnect() {
            this.VH = 0;
            this.v5.post(new b());
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void gn(Messenger messenger) {
            Log.e("MediaBrowserCompat", "onConnectFailed for " + this.DW);
            if (tp(messenger, "onConnectFailed")) {
                if (this.VH == 2) {
                    FH();
                    this.FH.DW();
                    return;
                }
                Log.w("MediaBrowserCompat", "onConnect from service while mState=" + Hw(this.VH) + "... ignoring");
            }
        }

        void j6() {
            Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
            Log.d("MediaBrowserCompat", "  mServiceComponent=" + this.DW);
            Log.d("MediaBrowserCompat", "  mCallback=" + this.FH);
            Log.d("MediaBrowserCompat", "  mRootHints=" + this.Hw);
            Log.d("MediaBrowserCompat", "  mState=" + Hw(this.VH));
            Log.d("MediaBrowserCompat", "  mServiceConnection=" + this.gn);
            Log.d("MediaBrowserCompat", "  mServiceBinderWrapper=" + this.u7);
            Log.d("MediaBrowserCompat", "  mCallbacksMessenger=" + this.tp);
            Log.d("MediaBrowserCompat", "  mRootId=" + this.EQ);
            Log.d("MediaBrowserCompat", "  mMediaSessionToken=" + this.we);
        }

        public boolean u7() {
            return this.VH == 3;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public MediaSessionCompat.Token v5() {
            if (u7()) {
                return this.we;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.VH + ")");
        }
    }

    interface j {
        void VH(Messenger messenger, String str, List list, Bundle bundle);

        void Zo(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void gn(Messenger messenger);
    }

    public static abstract class k {
        public abstract void DW(String str, Bundle bundle, List<MediaItem> list);

        public abstract void j6(String str, Bundle bundle);
    }

    private static class l {
        private Bundle DW;
        private Messenger j6;

        public l(IBinder iBinder, Bundle bundle) {
            this.j6 = new Messenger(iBinder);
            this.DW = bundle;
        }

        private void v5(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.j6.send(messageObtain);
        }

        void DW(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.DW);
            v5(1, bundle, messenger);
        }

        void FH(Messenger messenger) throws RemoteException {
            v5(2, null, messenger);
        }

        void Hw(Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putBundle("data_root_hints", this.DW);
            v5(6, bundle, messenger);
        }

        void Zo(Messenger messenger) throws RemoteException {
            v5(7, null, messenger);
        }

        void j6(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws IllegalAccessException, NoSuchMethodException, SecurityException, RemoteException, IllegalArgumentException, InvocationTargetException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            androidx.core.app.g.DW(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            v5(3, bundle2, messenger);
        }
    }

    private static class m {
        private final List<n> j6 = new ArrayList();
        private final List<Bundle> DW = new ArrayList();

        public List<n> DW() {
            return this.j6;
        }

        public List<Bundle> FH() {
            return this.DW;
        }

        public n j6(Context context, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(context.getClassLoader());
            }
            for (int i = 0; i < this.DW.size(); i++) {
                if (android.support.v4.media.c.j6(this.DW.get(i), bundle)) {
                    return this.j6.get(i);
                }
            }
            return null;
        }
    }

    public static abstract class n {
        private final IBinder DW;
        WeakReference<m> FH;
        private final Object j6;

        private class a implements a.d {
            a() {
            }

            @Override // android.support.v4.media.a.d
            public void Hw(String str, List<?> list) {
                WeakReference<m> weakReference = n.this.FH;
                m mVar = weakReference == null ? null : weakReference.get();
                if (mVar == null) {
                    n.this.DW(str, MediaItem.DW(list));
                    return;
                }
                List<MediaItem> listDW = MediaItem.DW(list);
                List<n> listDW2 = mVar.DW();
                List<Bundle> listFH = mVar.FH();
                for (int i = 0; i < listDW2.size(); i++) {
                    Bundle bundle = listFH.get(i);
                    if (bundle == null) {
                        n.this.DW(str, listDW);
                    } else {
                        n.this.FH(str, v5(listDW, bundle), bundle);
                    }
                }
            }

            @Override // android.support.v4.media.a.d
            public void j6(String str) {
                n.this.Hw(str);
            }

            List<MediaItem> v5(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int size = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.EMPTY_LIST;
                }
                if (size > list.size()) {
                    size = list.size();
                }
                return list.subList(i3, size);
            }
        }

        private class b extends a implements b.a {
            b() {
                super();
            }

            @Override // android.support.v4.media.b.a
            public void DW(String str, Bundle bundle) {
                n.this.v5(str, bundle);
            }

            @Override // android.support.v4.media.b.a
            public void FH(String str, List<?> list, Bundle bundle) {
                n.this.FH(str, MediaItem.DW(list), bundle);
            }
        }

        public n() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                this.j6 = android.support.v4.media.b.j6(new b());
                this.DW = null;
            } else if (i < 21) {
                this.DW = new Binder();
            } else {
                this.j6 = android.support.v4.media.a.Hw(new a());
                this.DW = new Binder();
            }
        }

        public void DW(String str, List<MediaItem> list) {
        }

        public void FH(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void Hw(String str) {
        }

        public void v5(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, b bVar, Bundle bundle) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.j6 = new h(context, componentName, bVar, bundle);
            return;
        }
        if (i2 >= 23) {
            this.j6 = new g(context, componentName, bVar, bundle);
        } else if (i2 >= 21) {
            this.j6 = new f(context, componentName, bVar, bundle);
        } else {
            this.j6 = new i(context, componentName, bVar, bundle);
        }
    }

    public void DW() {
        this.j6.disconnect();
    }

    public MediaSessionCompat.Token FH() {
        return this.j6.v5();
    }

    public void j6() {
        this.j6.DW();
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();
        private final int WB;
        private final MediaDescriptionCompat mb;

        static class a implements Parcelable.Creator<MediaItem> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: j6, reason: merged with bridge method [inline-methods] */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.FH())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.WB = i;
            this.mb = mediaDescriptionCompat;
        }

        public static List<MediaItem> DW(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(j6(it.next()));
            }
            return arrayList;
        }

        public static MediaItem j6(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.j6(a.c.j6(obj)), a.c.DW(obj));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.WB + ", mDescription=" + this.mb + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.WB);
            this.mb.writeToParcel(parcel, i);
        }

        MediaItem(Parcel parcel) {
            this.WB = parcel.readInt();
            this.mb = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
