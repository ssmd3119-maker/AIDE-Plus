package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c0 {
    private static Field DW;
    private static boolean FH;
    private static final Object j6 = new Object();

    public static class a implements w, v {
        private final Bundle DW;
        private List<Bundle> FH = new ArrayList();
        private RemoteViews Hw;
        private Notification.Builder j6;
        private RemoteViews v5;

        public a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, int i4, CharSequence charSequence4, boolean z3, Bundle bundle, String str, boolean z4, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
            PendingIntent pendingIntent3;
            boolean z5 = false;
            Notification.Builder deleteIntent = new Notification.Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
            if ((notification.flags & 128) != 0) {
                pendingIntent3 = pendingIntent2;
                z5 = true;
            } else {
                pendingIntent3 = pendingIntent2;
            }
            this.j6 = deleteIntent.setFullScreenIntent(pendingIntent3, z5).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z2).setPriority(i4).setProgress(i2, i3, z);
            Bundle bundle2 = new Bundle();
            this.DW = bundle2;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (z3) {
                this.DW.putBoolean("android.support.localOnly", true);
            }
            if (str != null) {
                this.DW.putString("android.support.groupKey", str);
                if (z4) {
                    this.DW.putBoolean("android.support.isGroupSummary", true);
                } else {
                    this.DW.putBoolean("android.support.useSideChannel", true);
                }
            }
            if (str2 != null) {
                this.DW.putString("android.support.sortKey", str2);
            }
            this.Hw = remoteViews2;
            this.v5 = remoteViews3;
        }

        @Override // androidx.core.app.w
        public Notification BT() {
            Notification notificationBuild = this.j6.build();
            Bundle bundleFH = c0.FH(notificationBuild);
            Bundle bundle = new Bundle(this.DW);
            for (String str : this.DW.keySet()) {
                if (bundleFH.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            bundleFH.putAll(bundle);
            SparseArray<Bundle> sparseArrayDW = c0.DW(this.FH);
            if (sparseArrayDW != null) {
                c0.FH(notificationBuild).putSparseParcelableArray("android.support.actionExtras", sparseArrayDW);
            }
            RemoteViews remoteViews = this.Hw;
            if (remoteViews != null) {
                notificationBuild.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.v5;
            if (remoteViews2 != null) {
                notificationBuild.bigContentView = remoteViews2;
            }
            return notificationBuild;
        }

        @Override // androidx.core.app.v
        public void j6(b0 b0Var) {
            this.FH.add(c0.Hw(this.j6, b0Var));
        }

        @Override // androidx.core.app.w
        public Notification.Builder vy() {
            return this.j6;
        }
    }

    public static SparseArray<Bundle> DW(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle FH(Notification notification) {
        synchronized (j6) {
            if (FH) {
                return null;
            }
            try {
                if (DW == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        FH = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    DW = declaredField;
                }
                Bundle bundle = (Bundle) DW.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    DW.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                FH = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                FH = true;
                return null;
            }
        }
    }

    public static Bundle Hw(Notification.Builder builder, b0 b0Var) {
        builder.addAction(b0Var.v5(), b0Var.VH(), b0Var.j6());
        Bundle bundle = new Bundle(b0Var.Hw());
        if (b0Var.Zo() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", i0.DW(b0Var.Zo()));
        }
        if (b0Var.FH() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", i0.DW(b0Var.FH()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", b0Var.DW());
        return bundle;
    }

    public static void j6(w wVar, CharSequence charSequence, boolean z, CharSequence charSequence2, CharSequence charSequence3) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(wVar.vy()).setBigContentTitle(charSequence).bigText(charSequence3);
        if (z) {
            bigTextStyleBigText.setSummaryText(charSequence2);
        }
    }
}
