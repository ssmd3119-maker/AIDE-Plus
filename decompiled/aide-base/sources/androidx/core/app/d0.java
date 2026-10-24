package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d0 implements w, v {
    private Bundle DW;
    private List<Bundle> FH = new ArrayList();
    private RemoteViews Hw;
    private Notification.Builder j6;
    private RemoteViews v5;

    public d0(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList<String> arrayList, Bundle bundle, String str, boolean z5, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
        PendingIntent pendingIntent3;
        boolean z6 = false;
        Notification.Builder deleteIntent = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) != 0) {
            pendingIntent3 = pendingIntent2;
            z6 = true;
        } else {
            pendingIntent3 = pendingIntent2;
        }
        this.j6 = deleteIntent.setFullScreenIntent(pendingIntent3, z6).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z);
        Bundle bundle2 = new Bundle();
        this.DW = bundle2;
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            this.DW.putStringArray("android.people", (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        if (z4) {
            this.DW.putBoolean("android.support.localOnly", true);
        }
        if (str != null) {
            this.DW.putString("android.support.groupKey", str);
            if (z5) {
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
        SparseArray<Bundle> sparseArrayDW = c0.DW(this.FH);
        if (sparseArrayDW != null) {
            this.DW.putSparseParcelableArray("android.support.actionExtras", sparseArrayDW);
        }
        this.j6.setExtras(this.DW);
        Notification notificationBuild = this.j6.build();
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
