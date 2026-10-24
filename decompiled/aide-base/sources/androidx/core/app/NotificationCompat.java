package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.c0;
import androidx.core.app.x;
import androidx.core.app.z;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class NotificationCompat {
    static final k j6;

    public static class BigTextStyle extends Style {
        private CharSequence v5;

        @Override // androidx.core.app.NotificationCompat.Style
        public void DW(w wVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                c0.j6(wVar, this.DW, this.Hw, this.FH, this.v5);
            }
        }

        public BigTextStyle bigText(CharSequence charSequence) {
            this.v5 = Builder.v5(charSequence);
            return this;
        }
    }

    public static abstract class Style {
        CharSequence DW;
        CharSequence FH;
        boolean Hw = false;
        protected Builder j6;

        public abstract void DW(w wVar);

        public RemoteViews FH(w wVar) {
            return null;
        }

        public RemoteViews Hw(w wVar) {
            return null;
        }

        public void Zo(Builder builder) {
            if (this.j6 != builder) {
                this.j6 = builder;
                if (builder != null) {
                    builder.setStyle(this);
                }
            }
        }

        public void j6(Bundle bundle) {
        }

        public RemoteViews v5(w wVar) {
            return null;
        }
    }

    public static class a extends b0 {
        private final f0[] DW;
        private final f0[] FH;
        private boolean Hw;
        public PendingIntent VH;
        public CharSequence Zo;
        final Bundle j6;
        public int v5;

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, null, true);
        }

        @Override // androidx.core.app.b0
        public boolean DW() {
            return this.Hw;
        }

        @Override // androidx.core.app.b0
        public Bundle Hw() {
            return this.j6;
        }

        @Override // androidx.core.app.b0
        public CharSequence VH() {
            return this.Zo;
        }

        @Override // androidx.core.app.b0
        /* renamed from: gn, reason: merged with bridge method [inline-methods] */
        public f0[] FH() {
            return this.FH;
        }

        @Override // androidx.core.app.b0
        public PendingIntent j6() {
            return this.VH;
        }

        @Override // androidx.core.app.b0
        /* renamed from: u7, reason: merged with bridge method [inline-methods] */
        public f0[] Zo() {
            return this.DW;
        }

        @Override // androidx.core.app.b0
        public int v5() {
            return this.v5;
        }

        a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, f0[] f0VarArr, f0[] f0VarArr2, boolean z) {
            this.v5 = i;
            this.Zo = Builder.v5(charSequence);
            this.VH = pendingIntent;
            this.j6 = bundle == null ? new Bundle() : bundle;
            this.DW = f0VarArr;
            this.FH = f0VarArr2;
            this.Hw = z;
        }
    }

    protected static class c {
        protected c() {
        }

        public Notification j6(Builder builder, w wVar) {
            Style style;
            RemoteViews remoteViewsV5;
            Style style2;
            RemoteViews remoteViewsFH;
            Style style3 = builder.J0;
            RemoteViews remoteViewsHw = style3 != null ? style3.Hw(wVar) : null;
            Notification notificationBT = wVar.BT();
            if (remoteViewsHw != null) {
                notificationBT.contentView = remoteViewsHw;
            } else {
                RemoteViews remoteViews = builder.ei;
                if (remoteViews != null) {
                    notificationBT.contentView = remoteViews;
                }
            }
            if (Build.VERSION.SDK_INT >= 16 && (style2 = builder.J0) != null && (remoteViewsFH = style2.FH(wVar)) != null) {
                notificationBT.bigContentView = remoteViewsFH;
            }
            if (Build.VERSION.SDK_INT >= 21 && (style = builder.J0) != null && (remoteViewsV5 = style.v5(wVar)) != null) {
                notificationBT.headsUpContentView = remoteViewsV5;
            }
            return notificationBT;
        }
    }

    static class d extends j {
        d() {
        }

        @Override // androidx.core.app.NotificationCompat.j, androidx.core.app.NotificationCompat.k
        public Notification j6(Builder builder, c cVar) {
            Bundle bundleDW;
            c0.a aVar = new c0.a(builder.j6, builder.dx, builder.DW, builder.FH, builder.gn, builder.Zo, builder.u7, builder.Hw, builder.v5, builder.VH, builder.QX, builder.XL, builder.aM, builder.we, builder.tp, builder.J8, builder.lg, builder.gW, builder.j3, builder.Mr, builder.U2, builder.ei, builder.nw);
            NotificationCompat.j6(aVar, builder.a8);
            Style style = builder.J0;
            if (style != null) {
                style.DW(aVar);
            }
            Notification notificationJ6 = cVar.j6(builder, aVar);
            if (builder.J0 != null && (bundleDW = NotificationCompat.DW(notificationJ6)) != null) {
                builder.J0.j6(bundleDW);
            }
            return notificationJ6;
        }
    }

    static class e extends d {
        e() {
        }

        @Override // androidx.core.app.NotificationCompat.d, androidx.core.app.NotificationCompat.j, androidx.core.app.NotificationCompat.k
        public Notification j6(Builder builder, c cVar) {
            d0 d0Var = new d0(builder.j6, builder.dx, builder.DW, builder.FH, builder.gn, builder.Zo, builder.u7, builder.Hw, builder.v5, builder.VH, builder.QX, builder.XL, builder.aM, builder.EQ, builder.we, builder.tp, builder.J8, builder.lg, builder.sG, builder.gW, builder.j3, builder.Mr, builder.U2, builder.ei, builder.nw);
            NotificationCompat.j6(d0Var, builder.a8);
            Style style = builder.J0;
            if (style != null) {
                style.DW(d0Var);
            }
            return cVar.j6(builder, d0Var);
        }
    }

    static class f extends e {
        f() {
        }

        @Override // androidx.core.app.NotificationCompat.e, androidx.core.app.NotificationCompat.d, androidx.core.app.NotificationCompat.j, androidx.core.app.NotificationCompat.k
        public Notification j6(Builder builder, c cVar) {
            x.a aVar = new x.a(builder.j6, builder.dx, builder.DW, builder.FH, builder.gn, builder.Zo, builder.u7, builder.Hw, builder.v5, builder.VH, builder.QX, builder.XL, builder.aM, builder.EQ, builder.we, builder.tp, builder.J8, builder.lg, builder.sG, builder.gW, builder.j3, builder.Mr, builder.U2, builder.ei, builder.nw, builder.cb);
            NotificationCompat.j6(aVar, builder.a8);
            Style style = builder.J0;
            if (style != null) {
                style.DW(aVar);
            }
            Notification notificationJ6 = cVar.j6(builder, aVar);
            Style style2 = builder.J0;
            if (style2 != null) {
                style2.j6(NotificationCompat.DW(notificationJ6));
            }
            return notificationJ6;
        }
    }

    static class g extends f {
        g() {
        }

        @Override // androidx.core.app.NotificationCompat.f, androidx.core.app.NotificationCompat.e, androidx.core.app.NotificationCompat.d, androidx.core.app.NotificationCompat.j, androidx.core.app.NotificationCompat.k
        public Notification j6(Builder builder, c cVar) {
            y yVar = new y(builder.j6, builder.dx, builder.DW, builder.FH, builder.gn, builder.Zo, builder.u7, builder.Hw, builder.v5, builder.VH, builder.QX, builder.XL, builder.aM, builder.EQ, builder.we, builder.tp, builder.J8, builder.lg, builder.yS, builder.sG, builder.gW, builder.BT, builder.vy, builder.P8, builder.j3, builder.Mr, builder.U2, builder.ei, builder.nw, builder.SI, builder.cb);
            NotificationCompat.j6(yVar, builder.a8);
            Style style = builder.J0;
            if (style != null) {
                style.DW(yVar);
            }
            Notification notificationJ6 = cVar.j6(builder, yVar);
            Style style2 = builder.J0;
            if (style2 != null) {
                style2.j6(NotificationCompat.DW(notificationJ6));
            }
            return notificationJ6;
        }
    }

    static class h extends g {
        h() {
        }

        @Override // androidx.core.app.NotificationCompat.g, androidx.core.app.NotificationCompat.f, androidx.core.app.NotificationCompat.e, androidx.core.app.NotificationCompat.d, androidx.core.app.NotificationCompat.j, androidx.core.app.NotificationCompat.k
        public Notification j6(Builder builder, c cVar) {
            z.a aVar = new z.a(builder.j6, builder.dx, builder.DW, builder.FH, builder.gn, builder.Zo, builder.u7, builder.Hw, builder.v5, builder.VH, builder.QX, builder.XL, builder.aM, builder.EQ, builder.we, builder.tp, builder.J8, builder.lg, builder.yS, builder.sG, builder.gW, builder.BT, builder.vy, builder.P8, builder.j3, builder.Mr, builder.U2, builder.Ws, builder.ei, builder.nw, builder.SI, builder.cb);
            NotificationCompat.j6(aVar, builder.a8);
            Style style = builder.J0;
            if (style != null) {
                style.DW(aVar);
            }
            Notification notificationJ6 = cVar.j6(builder, aVar);
            Style style2 = builder.J0;
            if (style2 != null) {
                style2.j6(NotificationCompat.DW(notificationJ6));
            }
            return notificationJ6;
        }
    }

    static class i extends h {
        i() {
        }

        @Override // androidx.core.app.NotificationCompat.h, androidx.core.app.NotificationCompat.g, androidx.core.app.NotificationCompat.f, androidx.core.app.NotificationCompat.e, androidx.core.app.NotificationCompat.d, androidx.core.app.NotificationCompat.j, androidx.core.app.NotificationCompat.k
        public Notification j6(Builder builder, c cVar) {
            a0 a0Var = new a0(builder.j6, builder.dx, builder.DW, builder.FH, builder.gn, builder.Zo, builder.u7, builder.Hw, builder.v5, builder.VH, builder.QX, builder.XL, builder.aM, builder.EQ, builder.we, builder.tp, builder.J8, builder.lg, builder.yS, builder.sG, builder.gW, builder.BT, builder.vy, builder.P8, builder.j3, builder.Mr, builder.U2, builder.Ws, builder.ei, builder.nw, builder.SI, builder.KD, builder.ro, builder.cn, builder.sh, builder.rN, builder.er, builder.cb);
            NotificationCompat.j6(a0Var, builder.a8);
            Style style = builder.J0;
            if (style != null) {
                style.DW(a0Var);
            }
            Notification notificationJ6 = cVar.j6(builder, a0Var);
            Style style2 = builder.J0;
            if (style2 != null) {
                style2.j6(NotificationCompat.DW(notificationJ6));
            }
            return notificationJ6;
        }
    }

    static class j implements k {

        public static class a implements w {
            private Notification.Builder j6;

            a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z) {
                boolean z2 = true;
                Notification.Builder deleteIntent = new Notification.Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
                if ((notification.flags & 128) == 0) {
                    z2 = false;
                }
                this.j6 = deleteIntent.setFullScreenIntent(pendingIntent2, z2).setLargeIcon(bitmap).setNumber(i).setProgress(i2, i3, z);
            }

            @Override // androidx.core.app.w
            public Notification BT() {
                return this.j6.getNotification();
            }

            @Override // androidx.core.app.w
            public Notification.Builder vy() {
                return this.j6;
            }
        }

        j() {
        }

        @Override // androidx.core.app.NotificationCompat.k
        public Notification j6(Builder builder, c cVar) {
            return cVar.j6(builder, new a(builder.j6, builder.dx, builder.DW, builder.FH, builder.gn, builder.Zo, builder.u7, builder.Hw, builder.v5, builder.VH, builder.QX, builder.XL, builder.aM));
        }
    }

    interface k {
        Notification j6(Builder builder, c cVar);
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            j6 = new i();
            return;
        }
        if (i2 >= 24) {
            j6 = new h();
            return;
        }
        if (i2 >= 21) {
            j6 = new g();
            return;
        }
        if (i2 >= 20) {
            j6 = new f();
            return;
        }
        if (i2 >= 19) {
            j6 = new e();
        } else if (i2 >= 16) {
            j6 = new d();
        } else {
            j6 = new j();
        }
    }

    public static Bundle DW(Notification notification) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            return notification.extras;
        }
        if (i2 >= 16) {
            return c0.FH(notification);
        }
        return null;
    }

    static void j6(v vVar, ArrayList<a> arrayList) {
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            vVar.j6(it.next());
        }
    }

    public static class Builder {
        int BT;
        public CharSequence DW;
        boolean EQ;
        public CharSequence FH;
        PendingIntent Hw;
        public Style J0;
        public CharSequence J8;
        String KD;
        boolean Mr;
        Notification P8;
        int QX;
        RemoteViews SI;
        String U2;
        public Bitmap VH;
        public CharSequence[] Ws;
        int XL;
        RemoteViews Zo;
        public ArrayList<a> a8;
        boolean aM;
        private int cb;
        String cn;
        public Notification dx;
        RemoteViews ei;
        boolean er;
        Bundle gW;
        public CharSequence gn;
        String j3;
        public Context j6;
        boolean lg;
        RemoteViews nw;
        boolean rN;
        int ro;
        public ArrayList<String> sG;
        long sh;
        int tp;
        public int u7;
        PendingIntent v5;
        int vy;
        public boolean we;
        String yS;

        public Builder(Context context, String str) {
            this.EQ = true;
            this.a8 = new ArrayList<>();
            this.lg = false;
            this.BT = 0;
            this.vy = 0;
            this.ro = 0;
            this.cb = 0;
            Notification notification = new Notification();
            this.dx = notification;
            this.j6 = context;
            this.KD = str;
            notification.when = System.currentTimeMillis();
            this.dx.audioStreamType = -1;
            this.tp = 0;
            this.sG = new ArrayList<>();
        }

        protected static CharSequence v5(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void we(int i, boolean z) {
            if (z) {
                Notification notification = this.dx;
                notification.flags = i | notification.flags;
            } else {
                Notification notification2 = this.dx;
                notification2.flags = (i ^ (-1)) & notification2.flags;
            }
        }

        protected c Hw() {
            return new c();
        }

        public Builder addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.a8.add(new a(i, charSequence, pendingIntent));
            return this;
        }

        public Notification build() {
            return NotificationCompat.j6.j6(this, Hw());
        }

        public Builder setAutoCancel(boolean z) {
            we(16, z);
            return this;
        }

        public Builder setChannelId(String str) {
            this.KD = str;
            return this;
        }

        public Builder setContentIntent(PendingIntent pendingIntent) {
            this.Hw = pendingIntent;
            return this;
        }

        public Builder setContentText(CharSequence charSequence) {
            this.FH = v5(charSequence);
            return this;
        }

        public Builder setContentTitle(CharSequence charSequence) {
            this.DW = v5(charSequence);
            return this;
        }

        public Builder setDefaults(int i) {
            Notification notification = this.dx;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public Builder setLocalOnly(boolean z) {
            this.lg = z;
            return this;
        }

        public Builder setNumber(int i) {
            this.u7 = i;
            return this;
        }

        public Builder setPriority(int i) {
            this.tp = i;
            return this;
        }

        public Builder setSmallIcon(int i) {
            this.dx.icon = i;
            return this;
        }

        public Builder setStyle(Style style) {
            if (this.J0 != style) {
                this.J0 = style;
                if (style != null) {
                    style.Zo(this);
                }
            }
            return this;
        }

        public Builder setTicker(CharSequence charSequence) {
            this.dx.tickerText = v5(charSequence);
            return this;
        }

        public Builder setWhen(long j) {
            this.dx.when = j;
            return this;
        }

        @Deprecated
        public Builder(Context context) {
            this(context, null);
        }
    }
}
