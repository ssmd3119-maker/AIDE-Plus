package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class z {

    public static class a implements w, v {
        private int DW;
        private Notification.Builder j6;

        public a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList<String> arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3, CharSequence[] charSequenceArr, RemoteViews remoteViews2, RemoteViews remoteViews3, RemoteViews remoteViews4, int i7) {
            PendingIntent pendingIntent3;
            boolean z6 = true;
            Notification.Builder deleteIntent = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
            if ((notification.flags & 128) != 0) {
                pendingIntent3 = pendingIntent2;
            } else {
                pendingIntent3 = pendingIntent2;
                z6 = false;
            }
            Notification.Builder remoteInputHistory = deleteIntent.setFullScreenIntent(pendingIntent3, z6).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setExtras(bundle).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2).setRemoteInputHistory(charSequenceArr);
            this.j6 = remoteInputHistory;
            if (remoteViews2 != null) {
                remoteInputHistory.setCustomContentView(remoteViews2);
            }
            if (remoteViews3 != null) {
                this.j6.setCustomBigContentView(remoteViews3);
            }
            if (remoteViews4 != null) {
                this.j6.setCustomHeadsUpContentView(remoteViews4);
            }
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                this.j6.addPerson(it.next());
            }
            this.DW = i7;
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
            Notification notificationBuild = this.j6.build();
            if (this.DW != 0) {
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && this.DW == 2) {
                    DW(notificationBuild);
                }
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && this.DW == 1) {
                    DW(notificationBuild);
                }
            }
            return notificationBuild;
        }

        @Override // androidx.core.app.v
        public void j6(b0 b0Var) {
            z.j6(this.j6, b0Var);
        }

        @Override // androidx.core.app.w
        public Notification.Builder vy() {
            return this.j6;
        }
    }

    public static void j6(Notification.Builder builder, b0 b0Var) {
        Notification.Action.Builder builder2 = new Notification.Action.Builder(b0Var.v5(), b0Var.VH(), b0Var.j6());
        if (b0Var.Zo() != null) {
            for (RemoteInput remoteInput : g0.j6(b0Var.Zo())) {
                builder2.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = b0Var.Hw() != null ? new Bundle(b0Var.Hw()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", b0Var.DW());
        builder2.setAllowGeneratedReplies(b0Var.DW());
        builder2.addExtras(bundle);
        builder.addAction(builder2.build());
    }
}
