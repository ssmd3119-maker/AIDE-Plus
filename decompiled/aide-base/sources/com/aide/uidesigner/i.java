package com.aide.uidesigner;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;
import com.aide.common.ColorPickerDialog;
import com.aide.common.MessageBox;
import com.aide.common.SizePickerDialog;
import com.aide.common.ValueRunnable;
import com.aide.uidesigner.h;
import com.probelytics.api.UserTouchAction;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@cy(clazz = 2051778340695604592L, container = 2051778340695604592L, user = true)
/* loaded from: classes.dex */
public class i {

    @dy(field = -5980997643940799179L)
    private static com.aide.uidesigner.a DW;

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -4959448495746857200L)
    private static com.aide.uidesigner.f j6;

    @cy(clazz = -3476757842972596567L, container = 2051778340695604592L, user = true)
    static class a implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = 3565045900365073883L)
        final /* synthetic */ com.aide.uidesigner.a DW;

        @dy(field = -4510361289131622224L)
        final /* synthetic */ Activity FH;

        @dy(field = 909443906441487000L)
        final /* synthetic */ com.aide.uidesigner.f j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -36121626615590560L)
        a(com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar, Activity activity) {
            this.j6 = fVar;
            this.DW = aVar;
            this.FH = activity;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = 4195710493438311392L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (Hw) {
                    iy.tp(300942786749748933L, this, str);
                }
                if (str.equals("Wrap Content")) {
                    this.j6.lg(this.DW, "wrap_content");
                } else if (str.equals("Match Parent")) {
                    this.j6.lg(this.DW, "match_parent");
                } else {
                    i.gW(this.FH, this.j6, this.DW, ("match_parent".equals(this.DW.DW) || "wrap_content".equals(this.DW.DW)) ? "10dp" : this.DW.DW, "10dp");
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 300942786749748933L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3476833526870713440L, container = 2051778340695604592L, user = true)
    static class b implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 685806529405152167L)
        final /* synthetic */ com.aide.uidesigner.a DW;

        @dy(field = -2900689648420932432L)
        final /* synthetic */ com.aide.uidesigner.f j6;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -4063193215713708179L)
        b(com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
            this.j6 = fVar;
            this.DW = aVar;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -8245536693385977396L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (FH) {
                    iy.tp(-4310754117006148479L, this, str);
                }
                if (str.length() == 0) {
                    str = null;
                }
                this.j6.lg(this.DW, str);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -4310754117006148479L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3476909210764767019L, container = 2051778340695604592L, user = true)
    static class c implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -445200762995516116L)
        final /* synthetic */ com.aide.uidesigner.f WB;

        @dy(field = 3533754093884827197L)
        final /* synthetic */ com.aide.uidesigner.a mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 1814926216433045895L)
        c(com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
            this.WB = fVar;
            this.mb = aVar;
        }

        @Override // java.lang.Runnable
        @ey(method = 1965606887908451172L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(-726291421633187269L, this);
                }
                this.WB.lg(this.mb, null);
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, -726291421633187269L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3476984894654757304L, container = 2051778340695604592L, user = true)
    static class d implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -5243500916573326752L)
        final /* synthetic */ com.aide.uidesigner.a DW;

        @dy(field = 3018226308989424071L)
        final /* synthetic */ com.aide.uidesigner.f j6;

        static {
            iy.Zo(d.class);
        }

        @ey(method = 6236961143788067616L)
        d(com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
            this.j6 = fVar;
            this.DW = aVar;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -7767341536031030973L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (FH) {
                    iy.tp(3654192249247646700L, this, str);
                }
                if (str.length() == 0) {
                    str = null;
                }
                this.j6.lg(this.DW, str);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 3654192249247646700L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3477060578540684295L, container = 2051778340695604592L, user = true)
    static class e implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -3156481164667120735L)
        final /* synthetic */ com.aide.uidesigner.f WB;

        @dy(field = 4271122396254003696L)
        final /* synthetic */ com.aide.uidesigner.a mb;

        static {
            iy.Zo(e.class);
        }

        @ey(method = -4397339952429701436L)
        e(com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
            this.WB = fVar;
            this.mb = aVar;
        }

        @Override // java.lang.Runnable
        @ey(method = 1818244047642369991L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(823730582088214992L, this);
                }
                this.WB.lg(this.mb, null);
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, 823730582088214992L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3477136262422547992L, container = 2051778340695604592L, user = true)
    static class f implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 1781754066476683080L)
        final /* synthetic */ Activity DW;

        @dy(field = -3306397255461682400L)
        final /* synthetic */ com.aide.uidesigner.f j6;

        @cy(clazz = 4489685352655330365L, container = 2051778340695604592L, user = true)
        class a implements ValueRunnable<String> {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 78479574758154033L)
            a() {
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = 2502723265103708763L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(String str) {
                try {
                    if (DW) {
                        iy.tp(-1317124347317994117L, this, str);
                    }
                    if (str.length() == 0) {
                        f.this.j6.setStyle(null);
                    } else {
                        f.this.j6.setStyle(str);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -1317124347317994117L, this, str);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 4489766800818113928L, container = 2051778340695604592L, user = true)
        class b implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 17312979923669639L)
            b() {
            }

            @Override // java.lang.Runnable
            @ey(method = 624732898083168875L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(2701056343618763225L, this);
                    }
                    f.this.j6.setStyle(null);
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 2701056343618763225L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(f.class);
        }

        @ey(method = 7962686775543902577L)
        f(com.aide.uidesigner.f fVar, Activity activity) {
            this.j6 = fVar;
            this.DW = activity;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -2307519777298019328L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (FH) {
                    iy.tp(6573503237724167056L, this, str);
                }
                if (str.equals("none")) {
                    this.j6.setStyle(null);
                }
                if (str.equals("other...")) {
                    MessageBox.Mr(this.DW, "Style", null, "None", this.j6.getStyle(), new a(), new b());
                } else {
                    this.j6.setStyle(str);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 6573503237724167056L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3477211946300348395L, container = 2051778340695604592L, user = true)
    static class g implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -28863730424994875L)
        final /* synthetic */ com.aide.uidesigner.f j6;

        static {
            iy.Zo(g.class);
        }

        @ey(method = -3680500642233309L)
        g(com.aide.uidesigner.f fVar) {
            this.j6 = fVar;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = 3320432118450810909L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (DW) {
                    iy.tp(-3309017621433256523L, this, str);
                }
                if (str.length() == 0) {
                    str = null;
                }
                this.j6.setViewID(str);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -3309017621433256523L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3477287630174085504L, container = 2051778340695604592L, user = true)
    static class h implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 2233553214610104928L)
        final /* synthetic */ com.aide.uidesigner.f WB;

        static {
            iy.Zo(h.class);
        }

        @ey(method = 4899717122922962124L)
        h(com.aide.uidesigner.f fVar) {
            this.WB = fVar;
        }

        @Override // java.lang.Runnable
        @ey(method = 2021587017518416968L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-4331419455015052017L, this);
                }
                this.WB.setViewID(null);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -4331419455015052017L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3477363314043759319L, container = 2051778340695604592L, user = true)
    /* renamed from: com.aide.uidesigner.i$i, reason: collision with other inner class name */
    static /* synthetic */ class C0101i {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -943952462471486820L)
        static final /* synthetic */ int[] j6;

        static {
            try {
                iy.Zo(C0101i.class);
                if (DW) {
                    iy.gn(-3258552498422085767L, null);
                }
                int[] iArr = new int[h.c.values().length];
                j6 = iArr;
                try {
                    iArr[h.c.Drawable.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    j6[h.c.DrawableResource.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    j6[h.c.Color.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    j6[h.c.Float.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    j6[h.c.Int.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    j6[h.c.TextSize.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    j6[h.c.Size.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    j6[h.c.FloatSize.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    j6[h.c.LayoutSize.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    j6[h.c.Bool.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    j6[h.c.Text.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    j6[h.c.Event.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    j6[h.c.EnumConstant.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    j6[h.c.IntConstant.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    j6[h.c.ID.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    j6[h.c.TextAppearance.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -3258552498422085767L, null);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2148565882117044501L, container = 2051778340695604592L, user = true)
    static class j implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 2688121331740066803L)
        final /* synthetic */ Intent j6;

        static {
            iy.Zo(j.class);
        }

        @ey(method = -77672893693996341L)
        j(Intent intent) {
            this.j6 = intent;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = 460387904875949040L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (DW) {
                    iy.tp(306635115026556288L, this, str);
                }
                i.j6.Zo(str, this.j6);
                i.j6.lg(i.DW, "@drawable/" + str);
                com.aide.uidesigner.f unused = i.j6 = null;
                com.aide.uidesigner.a unused2 = i.DW = null;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 306635115026556288L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2148618001439564160L, container = 2051778340695604592L, user = true)
    static class k implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = 4167527714623218573L)
        final /* synthetic */ com.aide.uidesigner.f DW;

        @dy(field = 3973515644028993560L)
        final /* synthetic */ com.aide.uidesigner.a FH;

        @dy(field = -1068310911741522447L)
        final /* synthetic */ Activity j6;

        @cy(clazz = -4911411436004507295L, container = 2051778340695604592L, user = true)
        class a implements ValueRunnable<String> {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -156522775149838448L)
            a() {
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = -4109317072823286069L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(String str) {
                try {
                    if (DW) {
                        iy.tp(2192006514068757120L, this, str);
                    }
                    k.this.DW.rN(k.this.FH, null, str);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 2192006514068757120L, this, str);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(k.class);
        }

        @ey(method = -939903493221248075L)
        k(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
            this.j6 = activity;
            this.DW = fVar;
            this.FH = aVar;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = 5996794367510936527L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (Hw) {
                    iy.tp(-3676945501268453043L, this, str);
                }
                if (str.equals("View...")) {
                    i.nw(this.j6, this.DW, this.FH);
                } else {
                    if (!str.equals("id...")) {
                        this.DW.lg(this.FH, null);
                        return;
                    }
                    ArrayList arrayList = new ArrayList(this.DW.getAllIDs());
                    Collections.sort(arrayList);
                    MessageBox.VH(this.j6, this.FH.j6.DW(), arrayList, new a());
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, -3676945501268453043L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2148670120766147113L, container = 2051778340695604592L, user = true)
    static class l implements ValueRunnable<com.aide.uidesigner.f> {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = -2384720491065318324L)
        final /* synthetic */ com.aide.uidesigner.a DW;

        @dy(field = -1568538769470838389L)
        final /* synthetic */ Activity FH;

        @dy(field = 3602259465276114335L)
        final /* synthetic */ com.aide.uidesigner.f j6;

        static {
            iy.Zo(l.class);
        }

        @ey(method = 646765001242825077L)
        l(com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar, Activity activity) {
            this.j6 = fVar;
            this.DW = aVar;
            this.FH = activity;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = 434870954962979600L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(com.aide.uidesigner.f fVar) {
            try {
                if (Hw) {
                    iy.tp(-4791861369533368800L, this, fVar);
                }
                if (fVar.getViewID() == null) {
                    this.j6.rN(this.DW, fVar, fVar.gW());
                } else {
                    this.j6.rN(this.DW, null, fVar.getViewID());
                }
                Toast.makeText(this.FH, "View was selected for attribute " + this.DW.j6.DW(), 0).show();
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, -4791861369533368800L, this, fVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2148722240096793360L, container = 2051778340695604592L, user = true)
    static class m implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -4789910066044142828L)
        final /* synthetic */ com.aide.uidesigner.a DW;

        @dy(field = -2611213307738528661L)
        final /* synthetic */ com.aide.uidesigner.f j6;

        static {
            iy.Zo(m.class);
        }

        @ey(method = -921295183176931600L)
        m(com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
            this.j6 = fVar;
            this.DW = aVar;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -4620680205964825623L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (FH) {
                    iy.tp(1697448135774281792L, this, str);
                }
                this.j6.lg(this.DW, str);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 1697448135774281792L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2148774359431502901L, container = 2051778340695604592L, user = true)
    static class n implements ValueRunnable<Integer> {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = 2795762282931599889L)
        final /* synthetic */ com.aide.uidesigner.f DW;

        @dy(field = 2181172812961368472L)
        final /* synthetic */ com.aide.uidesigner.a FH;

        @dy(field = 3104114107568253120L)
        final /* synthetic */ String[] Hw;

        @dy(field = 4781295215279584704L)
        final /* synthetic */ ArrayList j6;

        static {
            iy.Zo(n.class);
        }

        @ey(method = 4451364665431214832L)
        n(ArrayList arrayList, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar, String[] strArr) {
            this.j6 = arrayList;
            this.DW = fVar;
            this.FH = aVar;
            this.Hw = strArr;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = 863213966894867924L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(Integer num) {
            try {
                if (v5) {
                    iy.tp(-2933095158329763920L, this, num);
                }
                if (((String) this.j6.get(num.intValue())).equals("none")) {
                    this.DW.lg(this.FH, null);
                } else {
                    this.DW.lg(this.FH, this.Hw[num.intValue()]);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -2933095158329763920L, this, num);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2148826478770275736L, container = 2051778340695604592L, user = true)
    static class o implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = 3410102190049113056L)
        final /* synthetic */ com.aide.uidesigner.f DW;

        @dy(field = 1227338279771752263L)
        final /* synthetic */ com.aide.uidesigner.a FH;

        @dy(field = -1796343538272161760L)
        final /* synthetic */ Activity j6;

        static {
            iy.Zo(o.class);
        }

        @ey(method = -1375828492955440988L)
        o(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
            this.j6 = activity;
            this.DW = fVar;
            this.FH = aVar;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -5358581029720838976L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (Hw) {
                    iy.tp(7957711318513413560L, this, str);
                }
                if (str.equals("Color...")) {
                    i.J0(this.j6, this.DW, this.FH);
                } else if (str.equals("Drawable...")) {
                    i.Ws(this.j6, this.DW, this.FH);
                } else {
                    this.DW.lg(this.FH, null);
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 7957711318513413560L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2148878598113111865L, container = 2051778340695604592L, user = true)
    static class p implements ValueRunnable<Integer> {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = 1475315836592550771L)
        final /* synthetic */ com.aide.uidesigner.f DW;

        @dy(field = 1494255134773870976L)
        final /* synthetic */ com.aide.uidesigner.a FH;

        @dy(field = -3767914714913556249L)
        final /* synthetic */ Activity Hw;

        @dy(field = 5153519680401136000L)
        final /* synthetic */ List j6;

        @dy(field = 1043397122473222056L)
        final /* synthetic */ ArrayList v5;

        static {
            iy.Zo(p.class);
        }

        @ey(method = 267646500423344099L)
        p(List list, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar, Activity activity, ArrayList arrayList) {
            this.j6 = list;
            this.DW = fVar;
            this.FH = aVar;
            this.Hw = activity;
            this.v5 = arrayList;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -5811126370284434680L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(Integer num) {
            try {
                if (Zo) {
                    iy.tp(3339260184219208879L, this, num);
                }
                String str = (String) this.j6.get(num.intValue());
                if (str.equals("none")) {
                    this.DW.lg(this.FH, null);
                    return;
                }
                if (str.equals("other...")) {
                    i.P8(this.Hw, this.DW, this.FH, "@drawable/");
                } else if (str.equals("add...")) {
                    i.U2(this.Hw, this.DW, this.FH);
                } else {
                    this.DW.lg(this.FH, (String) this.v5.get(num.intValue()));
                }
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, 3339260184219208879L, this, num);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2148930717460011288L, container = 2051778340695604592L, user = true)
    static class q implements ValueRunnable<Integer> {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = 587334366834075795L)
        final /* synthetic */ com.aide.uidesigner.f DW;

        @dy(field = 4664728441809491524L)
        final /* synthetic */ com.aide.uidesigner.a FH;

        @dy(field = -4636198735982810337L)
        final /* synthetic */ Activity Hw;

        @dy(field = -3565573697840223240L)
        final /* synthetic */ ArrayList Zo;

        @dy(field = -5698585795446339216L)
        final /* synthetic */ List j6;

        @dy(field = 4072607937586518048L)
        final /* synthetic */ String v5;

        static {
            iy.Zo(q.class);
        }

        @ey(method = -1314113725835074407L)
        q(List list, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar, Activity activity, String str, ArrayList arrayList) {
            this.j6 = list;
            this.DW = fVar;
            this.FH = aVar;
            this.Hw = activity;
            this.v5 = str;
            this.Zo = arrayList;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = 2227168565746557160L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(Integer num) {
            try {
                if (VH) {
                    iy.tp(-1445056508723827032L, this, num);
                }
                String str = (String) this.j6.get(num.intValue());
                if (str.equals("none")) {
                    this.DW.lg(this.FH, null);
                } else if (str.equals("other...")) {
                    i.P8(this.Hw, this.DW, this.FH, this.v5);
                } else {
                    this.DW.lg(this.FH, (String) this.Zo.get(num.intValue()));
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -1445056508723827032L, this, num);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2148982836810974005L, container = 2051778340695604592L, user = true)
    static class r implements ColorPickerDialog.f {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -1693860814485840675L)
        final /* synthetic */ com.aide.uidesigner.a DW;

        @dy(field = 72840104140731500L)
        final /* synthetic */ com.aide.uidesigner.f j6;

        static {
            iy.Zo(r.class);
        }

        @ey(method = -934329994585383851L)
        r(com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
            this.j6 = fVar;
            this.DW = aVar;
        }

        @Override // com.aide.common.ColorPickerDialog.f
        @ey(method = -1835257434871494119L)
        public void j6(int i, String str) {
            try {
                if (FH) {
                    iy.EQ(3596944155035310880L, this, new Integer(i), str);
                }
                this.j6.lg(this.DW, str);
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, 3596944155035310880L, this, new Integer(i), str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(i.class);
    }

    @ey(method = -2042482795593696244L)
    public i() {
        try {
            if (FH) {
                iy.gn(28778740740534600L, null);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 28778740740534600L, null);
            }
            throw th;
        }
    }

    @ey(method = 173731908889020855L)
    public static void BT(Activity activity, com.aide.uidesigner.f fVar) {
        try {
            if (FH) {
                iy.EQ(-1517536325098742816L, null, activity, fVar);
            }
            ArrayList arrayList = new ArrayList(fVar.getAllUserStyles());
            Collections.sort(arrayList);
            arrayList.add("other...");
            arrayList.add("none");
            MessageBox.VH(activity, "Style", arrayList, new f(fVar, activity));
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -1517536325098742816L, null, activity, fVar);
            }
            throw th;
        }
    }

    @ey(method = 494792637829249935L)
    public static void EQ(Activity activity, Intent intent) {
        try {
            if (FH) {
                iy.EQ(715108979836938084L, null, activity, intent);
            }
            if (j6 != null) {
                MessageBox.aM(activity, "Choose Name", "Enter a name for the image", j6.yS(), new j(intent));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 715108979836938084L, null, activity, intent);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2152729137236443936L)
    public static void J0(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
        try {
            if (FH) {
                iy.we(-3373378528347596289L, null, activity, fVar, aVar);
            }
            MessageBox.gW(activity, new ColorPickerDialog(aVar.j6.DW(), aVar.DW, new r(fVar, aVar)));
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -3373378528347596289L, null, activity, fVar, aVar);
            }
            throw th;
        }
    }

    @ey(method = 353579590572593511L)
    private static void J8(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
        try {
            if (FH) {
                iy.we(-65978018837029320L, null, activity, fVar, aVar);
            }
            if (aVar.DW == null) {
                MessageBox.VH(activity, aVar.j6.DW(), Arrays.asList("Color...", "Drawable...", "none"), new o(activity, fVar, aVar));
            } else if (aVar.DW.startsWith("#")) {
                J0(activity, fVar, aVar);
            } else {
                Ws(activity, fVar, aVar);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -65978018837029320L, null, activity, fVar, aVar);
            }
            throw th;
        }
    }

    @ey(method = -2073714533731865332L)
    private static void Mr(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
        try {
            if (FH) {
                iy.we(-29985993058513239L, null, activity, fVar, aVar);
            }
            if (aVar.DW == null) {
                nw(activity, fVar, aVar);
            } else {
                MessageBox.VH(activity, aVar.j6.DW(), Arrays.asList("View...", "none"), new k(activity, fVar, aVar));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -29985993058513239L, null, activity, fVar, aVar);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1740071476523258971L)
    public static void P8(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar, String str) {
        try {
            if (FH) {
                iy.J0(156701052413333672L, null, activity, fVar, aVar, str);
            }
            String str2 = aVar.DW;
            MessageBox.Mr(activity, aVar.j6.DW(), null, "None", str2 == null ? str : str2, new d(fVar, aVar), new e(fVar, aVar));
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 156701052413333672L, null, activity, fVar, aVar, str);
            }
            throw th;
        }
    }

    @ey(method = -1912468315732494885L)
    private static void QX(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
        try {
            if (FH) {
                iy.we(-1389135928833652688L, null, activity, fVar, aVar);
            }
            if ("android.widget.ImageView$ScaleType".equals(aVar.j6.VH)) {
                yS(activity, fVar, aVar, "matrix", "fitXY", "fitStart", "fitCenter", "fitEnd", "center", "centerCrop", "centerInside");
            } else if ("android.text.TextUtils$TruncateAt".equals(aVar.j6.VH)) {
                yS(activity, fVar, aVar, "start", "middle", "end", "marquee");
            } else {
                P8(activity, fVar, aVar, "");
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -1389135928833652688L, null, activity, fVar, aVar);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 18678944857778968L)
    public static void U2(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
        try {
            if (FH) {
                iy.we(4745848013109277833L, null, activity, fVar, aVar);
            }
            Intent intent = new Intent();
            intent.setType("image/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            activity.startActivityForResult(intent, 3424345);
            j6 = fVar;
            DW = aVar;
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 4745848013109277833L, null, activity, fVar, aVar);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1054673934552909799L)
    public static void Ws(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
        try {
            if (FH) {
                iy.we(-121503139297225984L, null, activity, fVar, aVar);
            }
            ArrayList arrayList = new ArrayList(fVar.getAllUserDrawables());
            Collections.sort(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.aide.uidesigner.a.DW((String) it.next()));
            }
            arrayList2.add("other...");
            arrayList2.add("add...");
            arrayList2.add("none");
            MessageBox.u7(activity, aVar.j6.DW(), arrayList2, new p(arrayList2, fVar, aVar, activity, arrayList));
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -121503139297225984L, null, activity, fVar, aVar);
            }
            throw th;
        }
    }

    @ey(method = 2010827179277068368L)
    private static void XL(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar, String str, List<String> list) {
        try {
            if (FH) {
                iy.J8(-1280708677041101633L, null, activity, fVar, aVar, str, list);
            }
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.aide.uidesigner.a.DW((String) it.next()));
            }
            arrayList2.add("other...");
            arrayList2.add("none");
            MessageBox.u7(activity, aVar.j6.DW(), arrayList2, new q(arrayList2, fVar, aVar, activity, str, arrayList));
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -1280708677041101633L, null, activity, fVar, aVar, str, list);
            }
            throw th;
        }
    }

    @ey(method = 1993814663591816599L)
    private static void a8(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
        try {
            if (FH) {
                iy.we(-895850946703636392L, null, activity, fVar, aVar);
            }
            if ("android:visibility".equals(aVar.j6.Hw)) {
                yS(activity, fVar, aVar, "visible", "invisible", "gone");
                return;
            }
            if ("android:orientation".equals(aVar.j6.Hw)) {
                yS(activity, fVar, aVar, "horizontal", "vertical");
                return;
            }
            if ("android:typeface".equals(aVar.j6.Hw)) {
                yS(activity, fVar, aVar, "normal", "sans", "serif", "monospace");
                return;
            }
            if ("android:alignmentMode".equals(aVar.j6.Hw)) {
                yS(activity, fVar, aVar, "alignBounds", "alignMargins");
                return;
            }
            if ("android:textAlignment".equals(aVar.j6.Hw)) {
                yS(activity, fVar, aVar, "inherit", "gravity", "textStart", "textEnd", "center", "viewStart", "viewEnd");
                return;
            }
            if ("android.view.Gravity".equals(aVar.j6.VH)) {
                er(activity, fVar, aVar, "top", "bottom", "left", "right", "center", "center_vertical", "center_horizontal", "fill", "fill_vertical", "fill_horizontal", "clip_vertical", "clip_horizontal", "start", "end");
                return;
            }
            if (aVar.j6.gn == null || aVar.j6.FH == null) {
                P8(activity, fVar, aVar, "");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Field field : aVar.j6.Zo.getFields()) {
                String name = field.getName();
                if ((field.getModifiers() & 8) != 0 && name.startsWith(aVar.j6.gn)) {
                    arrayList.add(name.substring(aVar.j6.gn.length()).replace("_", ""));
                }
            }
            Collections.sort(arrayList);
            rN(activity, fVar, aVar, arrayList);
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -895850946703636392L, null, activity, fVar, aVar);
            }
            throw th;
        }
    }

    @ey(method = 1537002333442138464L)
    private static void aM(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar, String str, String... strArr) {
        try {
            if (FH) {
                iy.J8(-909963853786902595L, null, activity, fVar, aVar, str, strArr);
            }
            XL(activity, fVar, aVar, str, Arrays.asList(strArr));
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -909963853786902595L, null, activity, fVar, aVar, str, strArr);
            }
            throw th;
        }
    }

    @ey(method = 1637183307642709260L)
    public static void ei(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
        try {
            if (FH) {
                iy.we(-199477826138700013L, null, activity, fVar, aVar);
            }
            switch (C0101i.j6[aVar.j6.v5.ordinal()]) {
                case 1:
                    J8(activity, fVar, aVar);
                    return;
                case 2:
                    Ws(activity, fVar, aVar);
                    return;
                case 3:
                    J0(activity, fVar, aVar);
                    return;
                case 4:
                    P8(activity, fVar, aVar, "1.0");
                    return;
                case 5:
                    P8(activity, fVar, aVar, "1");
                    return;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    gW(activity, fVar, aVar, aVar.DW, "10sp");
                    return;
                case UserTouchAction.CLICK_KIND /* 7 */:
                case 8:
                    gW(activity, fVar, aVar, aVar.DW, "10dp");
                    return;
                case 9:
                    lg(activity, fVar, aVar);
                    return;
                case 10:
                    we(activity, fVar, aVar);
                    return;
                case 11:
                    P8(activity, fVar, aVar, "");
                    return;
                case 12:
                    P8(activity, fVar, aVar, "");
                    return;
                case 13:
                    QX(activity, fVar, aVar);
                    return;
                case 14:
                    a8(activity, fVar, aVar);
                    return;
                case 15:
                    Mr(activity, fVar, aVar);
                    return;
                case 16:
                    vy(activity, fVar, aVar);
                    return;
                default:
                    P8(activity, fVar, aVar, "");
                    return;
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -199477826138700013L, null, activity, fVar, aVar);
            }
            throw th;
        }
    }

    @ey(method = -6754499492487883665L)
    private static void er(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar, String... strArr) {
        try {
            if (FH) {
                iy.J0(-5389415207739713280L, null, activity, fVar, aVar, strArr);
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                arrayList.add(com.aide.uidesigner.a.DW(str));
            }
            MessageBox.J0(activity, aVar.j6.DW(), Arrays.asList(strArr), arrayList, aVar.DW, new m(fVar, aVar));
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -5389415207739713280L, null, activity, fVar, aVar, strArr);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 3225116787713462576L)
    public static void gW(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar, String str, String str2) {
        try {
            if (FH) {
                iy.J8(1425978316435705725L, null, activity, fVar, aVar, str, str2);
            }
            MessageBox.gW(activity, new SizePickerDialog(aVar.j6.DW(), str == null ? str2 : str, new b(fVar, aVar), new c(fVar, aVar)));
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 1425978316435705725L, null, activity, fVar, aVar, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 123262657200307875L)
    public static void j3(Activity activity, com.aide.uidesigner.f fVar) {
        try {
            if (FH) {
                iy.EQ(1577388307852217168L, null, activity, fVar);
            }
            MessageBox.Mr(activity, "ID", null, "None", fVar.getViewID() != null ? fVar.getViewID() : fVar.gW(), new g(fVar), new h(fVar));
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 1577388307852217168L, null, activity, fVar);
            }
            throw th;
        }
    }

    @ey(method = -533331036259378236L)
    private static void lg(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
        try {
            if (FH) {
                iy.we(59394711500843085L, null, activity, fVar, aVar);
            }
            MessageBox.VH(activity, aVar.j6.DW(), Arrays.asList("Wrap Content", "Match Parent", "Fixed size..."), new a(fVar, aVar, activity));
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 59394711500843085L, null, activity, fVar, aVar);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1405867015791855552L)
    public static void nw(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
        try {
            if (FH) {
                iy.we(-3316322168945826183L, null, activity, fVar, aVar);
            }
            Toast.makeText(activity, "Select another view", 0).show();
            fVar.er(new l(fVar, aVar, activity));
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -3316322168945826183L, null, activity, fVar, aVar);
            }
            throw th;
        }
    }

    @ey(method = 5901572919764762625L)
    private static void rN(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar, List<String> list) {
        try {
            if (FH) {
                iy.J0(5754110875469342904L, null, activity, fVar, aVar, list);
            }
            er(activity, fVar, aVar, (String[]) list.toArray(new String[list.size()]));
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 5754110875469342904L, null, activity, fVar, aVar, list);
            }
            throw th;
        }
    }

    @ey(method = 495942782007439760L)
    private static void vy(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
        try {
            if (FH) {
                iy.we(6933850848823222603L, null, activity, fVar, aVar);
            }
            aM(activity, fVar, aVar, "?android:attr/", "?android:attr/textAppearanceSmall", "?android:attr/textAppearanceMedium", "?android:attr/textAppearanceLarge");
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 6933850848823222603L, null, activity, fVar, aVar);
            }
            throw th;
        }
    }

    @ey(method = 238741641814319585L)
    private static void we(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar) {
        try {
            if (FH) {
                iy.we(-4195348454891185576L, null, activity, fVar, aVar);
            }
            yS(activity, fVar, aVar, "true", "false");
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -4195348454891185576L, null, activity, fVar, aVar);
            }
            throw th;
        }
    }

    @ey(method = -2663837737152084924L)
    private static void yS(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar, String... strArr) {
        try {
            if (FH) {
                iy.J0(585535013346904095L, null, activity, fVar, aVar, strArr);
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                arrayList.add(com.aide.uidesigner.a.DW(str));
            }
            arrayList.add("none");
            MessageBox.u7(activity, aVar.j6.DW(), arrayList, new n(arrayList, fVar, aVar, strArr));
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 585535013346904095L, null, activity, fVar, aVar, strArr);
            }
            throw th;
        }
    }
}
