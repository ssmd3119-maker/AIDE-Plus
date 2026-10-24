package com.aide.appwizard;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.appwizard.runtime.a;
import com.aide.common.MessageBox;
import com.aide.common.PropertiesDialog;
import com.aide.common.ValueRunnable;
import com.aide.ui.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@cy(clazz = 3947348440358438304L, container = 3947348440358438304L, user = true)
/* loaded from: classes.dex */
public class b {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -119322325207946560L)
    private a.d DW;

    @dy(field = -2194784078686983268L)
    private AppWizardDesignActivity j6;

    @cy(clazz = -5959149736594528825L, container = 3947348440358438304L, user = true)
    class a implements ValueRunnable<Boolean> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 4435943578918570676L)
        final /* synthetic */ a.c j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -326001545803777951L)
        a(b bVar, a.c cVar) {
            this.j6 = cVar;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -5988553370174489448L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(Boolean bool) {
            try {
                if (DW) {
                    iy.tp(6875799961447635392L, this, bool);
                }
                this.j6.tp(bool);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 6875799961447635392L, this, bool);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5959267943416838244L, container = 3947348440358438304L, user = true)
    /* renamed from: com.aide.appwizard.b$b, reason: collision with other inner class name */
    class C0038b implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -1716271260488473248L)
        final /* synthetic */ a.c j6;

        @cy(clazz = 1348005174006936735L, container = 3947348440358438304L, user = true)
        /* renamed from: com.aide.appwizard.b$b$a */
        class a implements ValueRunnable<String> {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -173994456121258025L)
            a() {
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = -3012189419957897952L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(String str) {
                try {
                    if (DW) {
                        iy.tp(2741394182441030775L, this, str);
                    }
                    C0038b.this.j6.gn(a.e.j6(str));
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 2741394182441030775L, this, str);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(C0038b.class);
        }

        @ey(method = 60381884266600280L)
        C0038b(a.c cVar) {
            this.j6 = cVar;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -2231761984251562648L)
        public boolean DW() {
            try {
                if (!FH) {
                    return true;
                }
                iy.gn(2271182229061646747L, this);
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 2271182229061646747L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 4167638427189528949L)
        public String FH() {
            try {
                if (!FH) {
                    return null;
                }
                iy.gn(-5553104129336220920L, this);
                return null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -5553104129336220920L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -2255862451587791648L)
        public String getName() {
            try {
                if (FH) {
                    iy.gn(-2778322862320383609L, this);
                }
                return b.this.EQ("Navigation", this.j6.VH().WB);
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -2778322862320383609L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 227328992530044721L)
        public int j6() {
            try {
                if (FH) {
                    iy.gn(-3888364004946295640L, this);
                }
                return p.icon_manage;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -3888364004946295640L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 1454238650694272256L)
        public void run() {
            try {
                if (FH) {
                    iy.gn(-188244682859533547L, this);
                }
                MessageBox.VH(b.this.j6, "Navigation", a.e.DW(), new a());
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -188244682859533547L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5959386150235084369L, container = 3947348440358438304L, user = true)
    class c implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 2058730467118361513L)
        final /* synthetic */ a.c j6;

        @cy(clazz = 1348189584755133136L, container = 3947348440358438304L, user = true)
        class a implements ValueRunnable<String> {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -126013330895740593L)
            a() {
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = -1257362144261286445L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(String str) {
                try {
                    if (DW) {
                        iy.tp(-664660288682136768L, this, str);
                    }
                    c.this.j6.J0(a.f.j6(str));
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -664660288682136768L, this, str);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(c.class);
        }

        @ey(method = -249332574779406611L)
        c(a.c cVar) {
            this.j6 = cVar;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 3119790367286612015L)
        public boolean DW() {
            try {
                if (!FH) {
                    return true;
                }
                iy.gn(-340413900191111760L, this);
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -340413900191111760L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -1309882448783624688L)
        public String FH() {
            try {
                if (!FH) {
                    return null;
                }
                iy.gn(2275630233347677171L, this);
                return null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 2275630233347677171L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 1563830277192623469L)
        public String getName() {
            try {
                if (FH) {
                    iy.gn(-167090728814874864L, this);
                }
                return b.this.EQ("Theme", this.j6.v5().WB);
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -167090728814874864L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 667400365271083976L)
        public int j6() {
            try {
                if (FH) {
                    iy.gn(2155421918968716645L, this);
                }
                return p.icon_manage;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 2155421918968716645L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 2017470811522244015L)
        public void run() {
            try {
                if (FH) {
                    iy.gn(3403337636083842240L, this);
                }
                MessageBox.VH(b.this.j6, "Theme", a.f.DW(), new a());
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 3403337636083842240L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5959504357049267200L, container = 3947348440358438304L, user = true)
    class d implements PropertiesDialog.b {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = -1444625027376872800L)
        final /* synthetic */ String DW;

        @dy(field = -2412644874490459875L)
        final /* synthetic */ ValueRunnable FH;

        @dy(field = -1545641724335463335L)
        final /* synthetic */ String j6;

        @cy(clazz = 1348374007217686975L, container = 3947348440358438304L, user = true)
        class a implements ValueRunnable<String> {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 170563555583152644L)
            a() {
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = -3357108372060538725L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(String str) {
                try {
                    if (DW) {
                        iy.tp(-100771940738376608L, this, str);
                    }
                    d.this.FH.j6(str);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -100771940738376608L, this, str);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(d.class);
        }

        @ey(method = 737120126780653145L)
        d(String str, String str2, ValueRunnable valueRunnable) {
            this.j6 = str;
            this.DW = str2;
            this.FH = valueRunnable;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 2162328985879485548L)
        public boolean DW() {
            try {
                if (!v5) {
                    return true;
                }
                iy.gn(473069342145301520L, this);
                return true;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 473069342145301520L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 3946863606899296439L)
        public String FH() {
            try {
                if (!v5) {
                    return null;
                }
                iy.gn(1116492232080200775L, this);
                return null;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 1116492232080200775L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 768811669296540320L)
        public String getName() {
            try {
                if (v5) {
                    iy.gn(1471930839089720000L, this);
                }
                return b.this.we(this.j6, this.DW);
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 1471930839089720000L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 4721971111402930575L)
        public int j6() {
            try {
                if (v5) {
                    iy.gn(-3700509652453258863L, this);
                }
                return p.icon_manage;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -3700509652453258863L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -455276591793821928L)
        public void run() {
            try {
                if (v5) {
                    iy.gn(180131650061299608L, this);
                }
                MessageBox.aM(b.this.j6, this.j6, null, this.DW, new a());
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 180131650061299608L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5959622563859386737L, container = 3947348440358438304L, user = true)
    class e implements PropertiesDialog.b {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = -1671247895703621771L)
        final /* synthetic */ ValueRunnable DW;

        @dy(field = -485979223280234560L)
        final /* synthetic */ Boolean FH;

        @dy(field = -586384791880486335L)
        final /* synthetic */ String j6;

        @cy(clazz = 1348558441394598252L, container = 3947348440358438304L, user = true)
        class a implements ValueRunnable<String> {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            @cy(clazz = -66461498161289305L, container = 3947348440358438304L, user = true)
            /* renamed from: com.aide.appwizard.b$e$a$a, reason: collision with other inner class name */
            class C0039a implements ValueRunnable<String> {

                @fy
                private static /* synthetic */ boolean DW;

                @gy
                private static /* synthetic */ boolean FH;

                static {
                    iy.Zo(C0039a.class);
                }

                @ey(method = -30711438306771651L)
                C0039a() {
                }

                @Override // com.aide.common.ValueRunnable
                @ey(method = 4092246980471877825L)
                /* renamed from: DW, reason: merged with bridge method [inline-methods] */
                public void j6(String str) {
                    try {
                        if (DW) {
                            iy.tp(-2335785180652355117L, this, str);
                        }
                        if ("none".equals(str)) {
                            e.this.DW.j6(null);
                        } else if ("true".equals(str)) {
                            e.this.DW.j6(Boolean.TRUE);
                        } else {
                            e.this.DW.j6(Boolean.FALSE);
                        }
                    } catch (Throwable th) {
                        if (FH) {
                            iy.j3(th, -2335785180652355117L, this, str);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(a.class);
            }

            @ey(method = 300922833523941984L)
            a() {
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = 231052043030703840L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(String str) {
                try {
                    if (DW) {
                        iy.tp(2432894581941518256L, this, str);
                    }
                    new C0039a().j6(str);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 2432894581941518256L, this, str);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(e.class);
        }

        @ey(method = 72127825213151240L)
        e(String str, ValueRunnable valueRunnable, Boolean bool) {
            this.j6 = str;
            this.DW = valueRunnable;
            this.FH = bool;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 2926131489850939580L)
        public boolean DW() {
            try {
                if (!v5) {
                    return true;
                }
                iy.gn(777748705054129639L, this);
                return true;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 777748705054129639L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -1163258883087071553L)
        public String FH() {
            try {
                if (!v5) {
                    return null;
                }
                iy.gn(-2908248955640480712L, this);
                return null;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -2908248955640480712L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 3434375510036220512L)
        public String getName() {
            try {
                if (v5) {
                    iy.gn(-1496038027929426477L, this);
                }
                return b.this.EQ(this.j6, this.FH == null ? null : Boolean.toString(this.FH.booleanValue()));
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -1496038027929426477L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -4829807785621060409L)
        public int j6() {
            try {
                if (v5) {
                    iy.gn(-1005241352338936104L, this);
                }
                return p.icon_manage;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -1005241352338936104L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -1520541859899521544L)
        public void run() {
            try {
                if (v5) {
                    iy.gn(55993828611122545L, this);
                }
                MessageBox.VH(b.this.j6, this.j6, Arrays.asList("true", "false", "none"), new a());
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 55993828611122545L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1900379412809399859L, container = 3947348440358438304L, user = true)
    class f implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(f.class);
        }

        @ey(method = -758927935229243616L)
        f() {
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -126059112597297840L)
        public boolean DW() {
            try {
                if (!DW) {
                    return true;
                }
                iy.gn(331263528662145607L, this);
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 331263528662145607L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 2854210220378319465L)
        public String FH() {
            try {
                if (!DW) {
                    return null;
                }
                iy.gn(4028791470118103808L, this);
                return null;
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 4028791470118103808L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -499306343297023584L)
        public String getName() {
            try {
                if (!DW) {
                    return "Activity";
                }
                iy.gn(2432391671631304163L, this);
                return "Activity";
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 2432391671631304163L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -2621361449097666723L)
        public int j6() {
            try {
                if (DW) {
                    iy.gn(7079921733713355240L, this);
                }
                return p.icon_goto;
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 7079921733713355240L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -2432886692056224624L)
        public void run() {
            try {
                if (DW) {
                    iy.gn(-977115300266090475L, this);
                }
                b.this.DW = null;
                b.this.J0();
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -977115300266090475L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1900421089113485092L, container = 3947348440358438304L, user = true)
    class g implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 692377804547248512L)
        final /* synthetic */ a.d j6;

        static {
            iy.Zo(g.class);
        }

        @ey(method = -193454387970707997L)
        g(a.d dVar) {
            this.j6 = dVar;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -832616205190167300L)
        public boolean DW() {
            try {
                if (!FH) {
                    return true;
                }
                iy.gn(333198434884673016L, this);
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 333198434884673016L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -2277436582801535393L)
        public String FH() {
            try {
                if (!FH) {
                    return null;
                }
                iy.gn(4032112398581674147L, this);
                return null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 4032112398581674147L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -1287010755059017440L)
        public String getName() {
            try {
                if (!FH) {
                    return "Delete";
                }
                iy.gn(2434821033178293104L, this);
                return "Delete";
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 2434821033178293104L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -1101443581502495161L)
        public int j6() {
            try {
                if (FH) {
                    iy.gn(7083728441434432983L, this);
                }
                return p.icon_delete;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 7083728441434432983L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -1833224036654489768L)
        public void run() {
            try {
                if (FH) {
                    iy.gn(-976177164429594304L, this);
                }
                this.j6.j6();
                b.this.DW = null;
                b.this.J0();
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -976177164429594304L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1900462765421633619L, container = 3947348440358438304L, user = true)
    class h implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 2312148131873020883L)
        final /* synthetic */ a.d j6;

        static {
            iy.Zo(h.class);
        }

        @ey(method = 223014510413578020L)
        h(b bVar, a.d dVar) {
            this.j6 = dVar;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = 4074241433226666327L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (DW) {
                    iy.tp(2456336965788545571L, this, str);
                }
                this.j6.VH(str);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 2456336965788545571L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1900504441733845440L, container = 3947348440358438304L, user = true)
    class i implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -4510166110081997184L)
        final /* synthetic */ a.d j6;

        static {
            iy.Zo(i.class);
        }

        @ey(method = -327624929497299525L)
        i(a.d dVar) {
            this.j6 = dVar;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 1836206960171426700L)
        public boolean DW() {
            try {
                if (!FH) {
                    return true;
                }
                iy.gn(335133825300025515L, this);
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 335133825300025515L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 450488748764832519L)
        public String FH() {
            try {
                if (!FH) {
                    return null;
                }
                iy.gn(4035433811238069576L, this);
                return null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 4035433811238069576L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -3366185893281138240L)
        public String getName() {
            try {
                if (FH) {
                    iy.gn(2437250878918107135L, this);
                }
                return b.this.EQ("Layout", this.j6.Hw());
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 2437250878918107135L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -1533659172789790737L)
        public int j6() {
            try {
                if (FH) {
                    iy.gn(7087535633348335816L, this);
                }
                return p.icon_manage;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 7087535633348335816L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -966349846118595160L)
        public void run() {
            try {
                if (FH) {
                    iy.gn(-975238544400273043L, this);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -975238544400273043L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1900546118050120555L, container = 3947348440358438304L, user = true)
    class j implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 2826609265547913417L)
        final /* synthetic */ a.d j6;

        static {
            iy.Zo(j.class);
        }

        @ey(method = -452912926320828288L)
        j(a.d dVar) {
            this.j6 = dVar;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -1160953864749728145L)
        public boolean DW() {
            try {
                if (!FH) {
                    return true;
                }
                iy.gn(1327051729830574680L, this);
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 1327051729830574680L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -3359886119519436288L)
        public String FH() {
            try {
                if (!FH) {
                    return null;
                }
                iy.gn(-827825224488691429L, this);
                return null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -827825224488691429L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 2793167779054561245L)
        public String getName() {
            try {
                if (FH) {
                    iy.gn(4791782041236113216L, this);
                }
                return "Fragment &quot;<b>" + this.j6.v5() + "</b>&quot;";
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 4791782041236113216L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 3014822448360808016L)
        public int j6() {
            try {
                if (FH) {
                    iy.gn(81028210221950947L, this);
                }
                return p.icon_goto;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 81028210221950947L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 751010292439115095L)
        public void run() {
            try {
                if (FH) {
                    iy.gn(-3924331231233538320L, this);
                }
                b.this.DW = this.j6;
                b.this.J0();
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -3924331231233538320L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1900587794370458964L, container = 3947348440358438304L, user = true)
    class k implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -2489554447430289841L)
        final /* synthetic */ a.c j6;

        static {
            iy.Zo(k.class);
        }

        @ey(method = -386407677281763544L)
        k(a.c cVar) {
            this.j6 = cVar;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -955152634807419504L)
        public boolean DW() {
            try {
                if (!FH) {
                    return true;
                }
                iy.gn(1329876608148673795L, this);
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 1329876608148673795L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 4377036271174619305L)
        public String FH() {
            try {
                if (!FH) {
                    return null;
                }
                iy.gn(-823991904608279368L, this);
                return null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -823991904608279368L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 1714127764001398240L)
        public String getName() {
            try {
                if (!FH) {
                    return "Add Fragment";
                }
                iy.gn(4795159060281749507L, this);
                return "Add Fragment";
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 4795159060281749507L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -502525213317422883L)
        public int j6() {
            try {
                if (FH) {
                    iy.gn(81342300682074120L, this);
                }
                return p.icon_add;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 81342300682074120L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 2375032823295668368L)
        public void run() {
            try {
                if (FH) {
                    iy.gn(-3922929534159699375L, this);
                }
                b.this.DW = this.j6.j6();
                b.this.J0();
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -3922929534159699375L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1900629470694860667L, container = 3947348440358438304L, user = true)
    class l implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 345138223018611155L)
        final /* synthetic */ a.c j6;

        static {
            iy.Zo(l.class);
        }

        @ey(method = -392569344073639440L)
        l(b bVar, a.c cVar) {
            this.j6 = cVar;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = 1370528484207072840L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (DW) {
                    iy.tp(1787592656130344315L, this, str);
                }
                this.j6.J8(str);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 1787592656130344315L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1900671147023325664L, container = 3947348440358438304L, user = true)
    class m implements ValueRunnable<Boolean> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 5406020044916502451L)
        final /* synthetic */ a.c j6;

        static {
            iy.Zo(m.class);
        }

        @ey(method = -114940399559277272L)
        m(b bVar, a.c cVar) {
            this.j6 = cVar;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = 5285026130750908875L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(Boolean bool) {
            try {
                if (DW) {
                    iy.tp(7347717509102492004L, this, bool);
                }
                this.j6.EQ(bool);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 7347717509102492004L, this, bool);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1900712823355853955L, container = 3947348440358438304L, user = true)
    class n implements ValueRunnable<Boolean> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 3036417579115101775L)
        final /* synthetic */ a.c j6;

        static {
            iy.Zo(n.class);
        }

        @ey(method = -316378746631311240L)
        n(b bVar, a.c cVar) {
            this.j6 = cVar;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -1075569941971050057L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(Boolean bool) {
            try {
                if (DW) {
                    iy.tp(7111859736497056435L, this, bool);
                }
                this.j6.u7(bool);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 7111859736497056435L, this, bool);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(b.class);
    }

    @ey(method = 1386340423530811983L)
    public b(AppWizardDesignActivity appWizardDesignActivity) {
        try {
            if (FH) {
                iy.tp(-425007188381565617L, null, appWizardDesignActivity);
            }
            this.j6 = appWizardDesignActivity;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -425007188381565617L, null, appWizardDesignActivity);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 432456299891089119L)
    public String EQ(String str, String str2) {
        try {
            if (FH) {
                iy.EQ(145829374660606507L, this, str, str2);
            }
            if (str2 == null) {
                return str;
            }
            return str + " = <b>" + str2 + "</b>";
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 145829374660606507L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 2136045333170136936L)
    private void VH(List<PropertiesDialog.b> list, String str, String str2, ValueRunnable<String> valueRunnable) {
        try {
            if (FH) {
                iy.J0(-4570842829380256352L, this, list, str, str2, valueRunnable);
            }
            list.add(new d(str, str2, valueRunnable));
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -4570842829380256352L, this, list, str, str2, valueRunnable);
            }
            throw th;
        }
    }

    @ey(method = -2784757224471345444L)
    private void Zo(List<PropertiesDialog.b> list, a.c cVar) {
        try {
            if (FH) {
                iy.EQ(2160859413410613840L, this, list, cVar);
            }
            list.add(new C0038b(cVar));
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 2160859413410613840L, this, list, cVar);
            }
            throw th;
        }
    }

    @ey(method = -5962017558637850175L)
    private void gn(List<PropertiesDialog.b> list, a.c cVar) {
        try {
            if (FH) {
                iy.EQ(3810775062842195793L, this, list, cVar);
            }
            list.add(new c(cVar));
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 3810775062842195793L, this, list, cVar);
            }
            throw th;
        }
    }

    @ey(method = -2092020680233591143L)
    private List<? extends PropertiesDialog.b> tp(a.d dVar) {
        try {
            if (FH) {
                iy.tp(-3489616603797823103L, this, dVar);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new f());
            if (dVar.DW().Hw().size() > 1) {
                arrayList.add(new g(dVar));
            }
            VH(arrayList, "Title", dVar.v5(), new h(this, dVar));
            arrayList.add(new i(dVar));
            return arrayList;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -3489616603797823103L, this, dVar);
            }
            throw th;
        }
    }

    @ey(method = -175498574952083328L)
    private List<? extends PropertiesDialog.b> u7(a.c cVar) {
        try {
            if (FH) {
                iy.tp(-757870497926421264L, this, cVar);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<a.d> it = cVar.Hw().iterator();
            while (it.hasNext()) {
                arrayList.add(new j(it.next()));
            }
            arrayList.add(new k(cVar));
            VH(arrayList, "Title", cVar.Zo(), new l(this, cVar));
            Zo(arrayList, cVar);
            gn(arrayList, cVar);
            v5(arrayList, "Show Title", cVar.Mr(), new m(this, cVar));
            v5(arrayList, "Show Action Bar", cVar.QX(), new n(this, cVar));
            v5(arrayList, "Fullscreen", cVar.aM(), new a(this, cVar));
            return arrayList;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -757870497926421264L, this, cVar);
            }
            throw th;
        }
    }

    @ey(method = -6961360701991494444L)
    private void v5(List<PropertiesDialog.b> list, String str, Boolean bool, ValueRunnable<Boolean> valueRunnable) {
        try {
            if (FH) {
                iy.J0(138542902559513616L, this, list, str, bool, valueRunnable);
            }
            list.add(new e(str, valueRunnable, bool));
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 138542902559513616L, this, list, str, bool, valueRunnable);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -460634347084192692L)
    public String we(String str, String str2) {
        try {
            if (FH) {
                iy.EQ(6003390928539563520L, this, str, str2);
            }
            if (str2 == null) {
                return str;
            }
            return str + " = <b>&quot;" + str2 + "&quot;</b>";
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 6003390928539563520L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 2164442553501468156L)
    public void J0() {
        try {
            if (FH) {
                iy.gn(-2629781559517107456L, this);
            }
            if (this.DW == null) {
                MessageBox.gW(this.j6, new PropertiesDialog("Activity \"" + this.j6.lg().VH().Zo() + "\"", u7(this.j6.lg().VH())));
                return;
            }
            MessageBox.gW(this.j6, new PropertiesDialog("Activity \"" + this.j6.lg().VH().Zo() + "\" > Fragment \"" + this.DW.v5() + "\"", tp(this.DW)));
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -2629781559517107456L, this);
            }
            throw th;
        }
    }
}
