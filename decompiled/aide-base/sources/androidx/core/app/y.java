package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class y implements w, v {
    private Bundle DW;
    private RemoteViews FH;
    private RemoteViews Hw;
    private int Zo;
    private Notification.Builder j6;
    private RemoteViews v5;

    public y(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList<String> arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3, RemoteViews remoteViews2, RemoteViews remoteViews3, RemoteViews remoteViews4, int i7) {
        PendingIntent pendingIntent3;
        boolean z6 = true;
        Notification.Builder deleteIntent = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) != 0) {
            pendingIntent3 = pendingIntent2;
        } else {
            pendingIntent3 = pendingIntent2;
            z6 = false;
        }
        this.j6 = deleteIntent.setFullScreenIntent(pendingIntent3, z6).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2);
        Bundle bundle2 = new Bundle();
        this.DW = bundle2;
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            this.j6.addPerson(it.next());
        }
        this.FH = remoteViews2;
        this.Hw = remoteViews3;
        this.v5 = remoteViews4;
        this.Zo = i7;
    }

    private void DW(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & (-2);
        notification.defaults = i;
        notification.defaults = i & (-3);
    }

    @Override // androidx.core.app.w
    public Notification BT() {
        this.j6.setExtras(this.DW);
        Notification notificationBuild = this.j6.build();
        RemoteViews remoteViews = this.FH;
        if (remoteViews != null) {
            notificationBuild.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.Hw;
        if (remoteViews2 != null) {
            notificationBuild.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.v5;
        if (remoteViews3 != null) {
            notificationBuild.headsUpContentView = remoteViews3;
        }
        if (this.Zo != 0) {
            if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && this.Zo == 2) {
                DW(notificationBuild);
            }
            if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && this.Zo == 1) {
                DW(notificationBuild);
            }
        }
        return notificationBuild;
    }

    @Override // androidx.core.app.v
    public void j6(b0 b0Var) {
        x.j6(this.j6, b0Var);
    }

    @Override // androidx.core.app.w
    public Notification.Builder vy() {
        return this.j6;
    }
}
