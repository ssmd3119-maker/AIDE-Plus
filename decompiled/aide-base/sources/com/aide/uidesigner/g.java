package com.aide.uidesigner;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import com.aide.common.MessageBox;
import com.aide.common.PropertiesDialog;
import com.aide.common.ValueRunnable;
import com.aide.ui.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@cy(clazz = -2150908242116545680L, container = -2150908242116545680L, user = true)
/* loaded from: classes.dex */
public class g {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = 1617484165872262363L, container = -2150908242116545680L, user = true)
    static class a implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -4455527143292160L)
        final /* synthetic */ com.aide.uidesigner.f j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -91866128053634368L)
        a(com.aide.uidesigner.f fVar) {
            this.j6 = fVar;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -918083210080508160L)
        public boolean DW() {
            try {
                if (!DW) {
                    return true;
                }
                iy.gn(-1425688635480284079L, this);
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -1425688635480284079L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -4514722426076927679L)
        public String FH() {
            try {
                if (!DW) {
                    return null;
                }
                iy.gn(-1347483128017638960L, this);
                return null;
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -1347483128017638960L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 3615774045734714400L)
        public String getName() {
            try {
                if (!DW) {
                    return "Delete";
                }
                iy.gn(-1102297860518017545L, this);
                return "Delete";
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -1102297860518017545L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -3996229685742928827L)
        public int j6() {
            try {
                if (DW) {
                    iy.gn(-80502791170273280L, this);
                }
                return p.icon_delete;
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -80502791170273280L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -1184921961840368528L)
        public void run() {
            try {
                if (DW) {
                    iy.gn(-3859698186871560055L, this);
                }
                this.j6.j3();
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -3859698186871560055L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1617529547957793300L, container = -2150908242116545680L, user = true)
    static class b implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -3189733830352961784L)
        final /* synthetic */ Activity DW;

        @dy(field = 2336405330027526680L)
        final /* synthetic */ com.aide.uidesigner.f j6;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 41736837693057849L)
        b(com.aide.uidesigner.f fVar, Activity activity) {
            this.j6 = fVar;
            this.DW = activity;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 1001625053124869328L)
        public boolean DW() {
            try {
                if (!FH) {
                    return true;
                }
                iy.gn(-7794994760446145359L, this);
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -7794994760446145359L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -2173642494898043713L)
        public String FH() {
            try {
                if (!FH) {
                    return null;
                }
                iy.gn(-2083788495779802112L, this);
                return null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -2083788495779802112L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -982931332484852516L)
        public String getName() {
            try {
                if (FH) {
                    iy.gn(6517907273955910135L, this);
                }
                if (this.j6.getViewID() == null) {
                    return "ID";
                }
                return "ID = <b>" + this.j6.getViewID() + "</b>";
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 6517907273955910135L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 2614941319922182035L)
        public int j6() {
            try {
                if (FH) {
                    iy.gn(-1180184352292338800L, this);
                }
                return p.icon_manage;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1180184352292338800L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 1286126248999795184L)
        public void run() {
            try {
                if (FH) {
                    iy.gn(2614861568723765325L, this);
                }
                com.aide.uidesigner.i.j3(this.DW, this.j6);
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 2614861568723765325L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1617574930047387531L, container = -2150908242116545680L, user = true)
    static class c implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 1661243035214936313L)
        final /* synthetic */ Activity DW;

        @dy(field = -3554296057197011763L)
        final /* synthetic */ com.aide.uidesigner.f j6;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 130775180829128000L)
        c(com.aide.uidesigner.f fVar, Activity activity) {
            this.j6 = fVar;
            this.DW = activity;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -1437889433957036829L)
        public boolean DW() {
            try {
                if (!FH) {
                    return true;
                }
                iy.gn(-7682352803083562856L, this);
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -7682352803083562856L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 3810648028575235040L)
        public String FH() {
            try {
                if (!FH) {
                    return null;
                }
                iy.gn(-2055039347214755697L, this);
                return null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -2055039347214755697L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 1823114978723022449L)
        public String getName() {
            try {
                if (FH) {
                    iy.gn(6641044588201911420L, this);
                }
                if (this.j6.getStyle() == null) {
                    return "Style";
                }
                return "Style = <b>" + com.aide.uidesigner.a.DW(this.j6.getStyle()) + "</b>";
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 6641044588201911420L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -2483750480072756160L)
        public int j6() {
            try {
                if (FH) {
                    iy.gn(-1140843149002494127L, this);
                }
                return p.icon_manage;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1140843149002494127L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 1256727980383698795L)
        public void run() {
            try {
                if (FH) {
                    iy.gn(2701709192057039560L, this);
                }
                com.aide.uidesigner.i.BT(this.DW, this.j6);
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 2701709192057039560L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3465637652979732503L, container = -2150908242116545680L, user = true)
    static class d implements PropertiesDialog.b {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = -3732292740697117695L)
        final /* synthetic */ com.aide.uidesigner.f DW;

        @dy(field = -4967004898352409752L)
        final /* synthetic */ com.aide.uidesigner.a FH;

        @dy(field = -350163249943069267L)
        final /* synthetic */ String Hw;

        @dy(field = 897777807011241957L)
        final /* synthetic */ Activity j6;

        static {
            iy.Zo(d.class);
        }

        @ey(method = 3943015345346439969L)
        d(Activity activity, com.aide.uidesigner.f fVar, com.aide.uidesigner.a aVar, String str) {
            this.j6 = activity;
            this.DW = fVar;
            this.FH = aVar;
            this.Hw = str;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -978225807076991309L)
        public boolean DW() {
            try {
                if (!v5) {
                    return true;
                }
                iy.gn(-1605155157478027320L, this);
                return true;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -1605155157478027320L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 3323694992878050372L)
        public String FH() {
            try {
                if (v5) {
                    iy.gn(-2388375187176642125L, this);
                }
                return "android/R.attr.html#" + this.Hw;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -2388375187176642125L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -2929096771286013855L)
        public String getName() {
            try {
                if (v5) {
                    iy.gn(2062525704029306880L, this);
                }
                return this.Hw;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 2062525704029306880L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -3366257397117172568L)
        public int j6() {
            try {
                if (v5) {
                    iy.gn(-716752480598264187L, this);
                }
                return p.icon_manage;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -716752480598264187L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 563435446538865399L)
        public void run() {
            try {
                if (v5) {
                    iy.gn(427249139152789800L, this);
                }
                com.aide.uidesigner.i.ei(this.j6, this.DW, this.FH);
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 427249139152789800L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3465748138059786092L, container = -2150908242116545680L, user = true)
    static class e implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 438253639868105993L)
        final /* synthetic */ Activity DW;

        @dy(field = -4258964359288010019L)
        final /* synthetic */ com.aide.uidesigner.f j6;

        static {
            iy.Zo(e.class);
        }

        @ey(method = 4474222005082481344L)
        e(com.aide.uidesigner.f fVar, Activity activity) {
            this.j6 = fVar;
            this.DW = activity;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 2832587422726922163L)
        public boolean DW() {
            try {
                if (FH) {
                    iy.gn(-2262252031204524975L, this);
                }
                return this.j6.getParentView() != null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -2262252031204524975L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -1581299585232508896L)
        public String FH() {
            try {
                if (!FH) {
                    return null;
                }
                iy.gn(-1502979019025429664L, this);
                return null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1502979019025429664L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -3177164415591234687L)
        public String getName() {
            try {
                if (!FH) {
                    return "Parent View...";
                }
                iy.gn(-2012615097595016057L, this);
                return "Parent View...";
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -2012615097595016057L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -3430983447563987040L)
        public int j6() {
            try {
                if (FH) {
                    iy.gn(-320912604758017120L, this);
                }
                return p.icon_goto;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -320912604758017120L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 1128286686571817435L)
        public void run() {
            try {
                if (FH) {
                    iy.gn(-4483922117678605815L, this);
                }
                g.Hw(this.DW, this.j6.getParentView());
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -4483922117678605815L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3465858623143902975L, container = -2150908242116545680L, user = true)
    static class f implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -3613325523586027040L)
        final /* synthetic */ com.aide.uidesigner.f DW;

        @dy(field = 1066958340710854016L)
        final /* synthetic */ Activity j6;

        static {
            iy.Zo(f.class);
        }

        @ey(method = -3840388375363248577L)
        f(Activity activity, com.aide.uidesigner.f fVar) {
            this.j6 = activity;
            this.DW = fVar;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -1401743438351848240L)
        public boolean DW() {
            try {
                if (FH) {
                    iy.gn(-2157747275340796680L, this);
                }
                return this.j6 instanceof XmlLayoutDesignActivity;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -2157747275340796680L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 910842869863880885L)
        public String FH() {
            try {
                if (!FH) {
                    return null;
                }
                iy.gn(-1483607701251257643L, this);
                return null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1483607701251257643L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -3299016468432106760L)
        public String getName() {
            try {
                if (!FH) {
                    return "Source code...";
                }
                iy.gn(-1898891111562193060L, this);
                return "Source code...";
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1898891111562193060L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -2808958646933939111L)
        public int j6() {
            try {
                if (FH) {
                    iy.gn(-290927046661350957L, this);
                }
                return p.icon_goto;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -290927046661350957L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -29805834047796000L)
        public void run() {
            try {
                if (FH) {
                    iy.gn(-4405959794929526912L, this);
                }
                if (this.j6 instanceof XmlLayoutDesignActivity) {
                    this.DW.Mr((XmlLayoutDesignActivity) this.j6);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -4405959794929526912L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3465969108232083152L, container = -2150908242116545680L, user = true)
    /* renamed from: com.aide.uidesigner.g$g, reason: collision with other inner class name */
    static class C0100g implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -3009203374816364128L)
        final /* synthetic */ Activity DW;

        @dy(field = 2022470158170903648L)
        final /* synthetic */ com.aide.uidesigner.f j6;

        @cy(clazz = -111923101435714449L, container = -2150908242116545680L, user = true)
        /* renamed from: com.aide.uidesigner.g$g$a */
        class a implements ValueRunnable<com.aide.uidesigner.b> {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 226937573760950701L)
            a() {
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = -1900228308837539023L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(com.aide.uidesigner.b bVar) {
                try {
                    if (DW) {
                        iy.tp(-28055762614283177L, this, bVar);
                    }
                    C0100g.this.j6.we(bVar);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -28055762614283177L, this, bVar);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(C0100g.class);
        }

        @ey(method = -5357057776331467955L)
        C0100g(com.aide.uidesigner.f fVar, Activity activity) {
            this.j6 = fVar;
            this.DW = activity;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 2986865284287492992L)
        public boolean DW() {
            try {
                if (FH) {
                    iy.gn(-2053223757019410723L, this);
                }
                return this.j6.XL();
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -2053223757019410723L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -2864926228942326789L)
        public String FH() {
            try {
                if (!FH) {
                    return null;
                }
                iy.gn(-1464217621019427960L, this);
                return null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1464217621019427960L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 1527553831725325908L)
        public String getName() {
            try {
                if (!FH) {
                    return "Add inside...";
                }
                iy.gn(-1785148363071712401L, this);
                return "Add inside...";
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1785148363071712401L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 12358786767347127L)
        public int j6() {
            try {
                if (FH) {
                    iy.gn(-260922726107027132L, this);
                }
                return p.icon_add;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -260922726107027132L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -1369487509388592264L)
        public void run() {
            try {
                if (FH) {
                    iy.gn(-4327978709722790347L, this);
                }
                com.aide.uidesigner.k.v5(this.DW, "Add inside " + this.j6.getNodeName() + "...", new a());
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -4327978709722790347L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3466079593324326623L, container = -2150908242116545680L, user = true)
    static class h implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -3628837922264241752L)
        final /* synthetic */ Activity DW;

        @dy(field = 1345822716968919928L)
        final /* synthetic */ com.aide.uidesigner.f j6;

        @cy(clazz = -111853294939266660L, container = -2150908242116545680L, user = true)
        class a implements ValueRunnable<com.aide.uidesigner.b> {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 85862530711527752L)
            a() {
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = 2979169324479903153L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(com.aide.uidesigner.b bVar) {
                try {
                    if (DW) {
                        iy.tp(446293166790258096L, this, bVar);
                    }
                    h.this.j6.gn(bVar);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 446293166790258096L, this, bVar);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(h.class);
        }

        @ey(method = -298548667798930311L)
        h(com.aide.uidesigner.f fVar, Activity activity) {
            this.j6 = fVar;
            this.DW = activity;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 1079671859570195408L)
        public boolean DW() {
            try {
                if (FH) {
                    iy.gn(-1948681476240367104L, this);
                }
                return this.j6.J0();
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1948681476240367104L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -4009468297818268065L)
        public String FH() {
            try {
                if (!FH) {
                    return null;
                }
                iy.gn(-1444808778329940615L, this);
                return null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1444808778329940615L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -731644057723113380L)
        public String getName() {
            try {
                if (!FH) {
                    return "Add above...";
                }
                iy.gn(-1671386852123574080L, this);
                return "Add above...";
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1671386852123574080L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -2938658294116840429L)
        public int j6() {
            try {
                if (FH) {
                    iy.gn(-230899643095045645L, this);
                }
                return p.icon_add;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -230899643095045645L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 744848427637051920L)
        public void run() {
            try {
                if (FH) {
                    iy.gn(-4249978862058396120L, this);
                }
                com.aide.uidesigner.k.v5(this.DW, "Add above " + this.j6.getNodeName() + "...", new a());
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -4249978862058396120L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3466190078420633388L, container = -2150908242116545680L, user = true)
    static class i implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 3252188178506457372L)
        final /* synthetic */ Activity DW;

        @dy(field = -1456855481315135388L)
        final /* synthetic */ com.aide.uidesigner.f j6;

        @cy(clazz = -111783476728461433L, container = -2150908242116545680L, user = true)
        class a implements ValueRunnable<com.aide.uidesigner.b> {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -137285705005708392L)
            a() {
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = -2311503993434596845L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(com.aide.uidesigner.b bVar) {
                try {
                    if (DW) {
                        iy.tp(1824443278483723L, this, bVar);
                    }
                    i.this.j6.EQ(bVar);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 1824443278483723L, this, bVar);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(i.class);
        }

        @ey(method = 6100362300391485975L)
        i(com.aide.uidesigner.f fVar, Activity activity) {
            this.j6 = fVar;
            this.DW = activity;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 1799032561970511456L)
        public boolean DW() {
            try {
                if (FH) {
                    iy.gn(-1844120433003665823L, this);
                }
                return this.j6.QX();
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1844120433003665823L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 2622759954947966449L)
        public String FH() {
            try {
                if (!FH) {
                    return null;
                }
                iy.gn(-1425381173182795608L, this);
                return null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1425381173182795608L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 2696872583789426744L)
        public String getName() {
            try {
                if (!FH) {
                    return "Add below...";
                }
                iy.gn(-1557606578717778097L, this);
                return "Add below...";
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1557606578717778097L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -980773884784283319L)
        public int j6() {
            try {
                if (FH) {
                    iy.gn(-200857797625406496L, this);
                }
                return p.icon_add;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -200857797625406496L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -562522844408023428L)
        public void run() {
            try {
                if (FH) {
                    iy.gn(-4171960251936344231L, this);
                }
                com.aide.uidesigner.k.v5(this.DW, "Add below " + this.j6.getNodeName() + "...", new a());
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -4171960251936344231L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3466300563521003447L, container = -2150908242116545680L, user = true)
    static class j implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 4236370496925589957L)
        final /* synthetic */ Activity DW;

        @dy(field = -508477973612722927L)
        final /* synthetic */ com.aide.uidesigner.f j6;

        @cy(clazz = -111713646803298768L, container = -2150908242116545680L, user = true)
        class a implements ValueRunnable<com.aide.uidesigner.b> {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -95221127793543700L)
            a() {
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = -4337124943033321380L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(com.aide.uidesigner.b bVar) {
                try {
                    if (DW) {
                        iy.tp(-449178619979846040L, this, bVar);
                    }
                    j.this.j6.u7(bVar);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -449178619979846040L, this, bVar);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(j.class);
        }

        @ey(method = 633333602633428840L)
        j(com.aide.uidesigner.f fVar, Activity activity) {
            this.j6 = fVar;
            this.DW = activity;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -2643395490841318869L)
        public boolean DW() {
            try {
                if (FH) {
                    iy.gn(-1739540627309306880L, this);
                }
                return this.j6.J8();
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1739540627309306880L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 1255212442846585140L)
        public String FH() {
            try {
                if (!FH) {
                    return null;
                }
                iy.gn(-1405934805577992939L, this);
                return null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1405934805577992939L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 3359551170259133673L)
        public String getName() {
            try {
                if (!FH) {
                    return "Add before...";
                }
                iy.gn(-1443807542854324452L, this);
                return "Add before...";
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1443807542854324452L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -958273975952613824L)
        public int j6() {
            try {
                if (FH) {
                    iy.gn(-170797189698109685L, this);
                }
                return p.icon_add;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -170797189698109685L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -1719230510717434905L)
        public void run() {
            try {
                if (FH) {
                    iy.gn(-4093922879356634680L, this);
                }
                com.aide.uidesigner.k.v5(this.DW, "Add before " + this.j6.getNodeName() + "...", new a());
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -4093922879356634680L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3466411048625436800L, container = -2150908242116545680L, user = true)
    static class k implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 4441245303853087864L)
        final /* synthetic */ Activity DW;

        @dy(field = -275186284120257016L)
        final /* synthetic */ com.aide.uidesigner.f j6;

        @cy(clazz = -111643805163778665L, container = -2150908242116545680L, user = true)
        class a implements ValueRunnable<com.aide.uidesigner.b> {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -138289464759974220L)
            a() {
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = -4502235806499031920L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(com.aide.uidesigner.b bVar) {
                try {
                    if (DW) {
                        iy.tp(32588905129121223L, this, bVar);
                    }
                    k.this.j6.tp(bVar);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 32588905129121223L, this, bVar);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(k.class);
        }

        @ey(method = 3148775131890752877L)
        k(com.aide.uidesigner.f fVar, Activity activity) {
            this.j6 = fVar;
            this.DW = activity;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -3073628696947065920L)
        public boolean DW() {
            try {
                if (FH) {
                    iy.gn(-1634942059157290275L, this);
                }
                return this.j6.Ws();
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1634942059157290275L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -139237749334249309L)
        public String FH() {
            try {
                if (!FH) {
                    return null;
                }
                iy.gn(-1386469675515532608L, this);
                return null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1386469675515532608L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 1922428253310160596L)
        public String getName() {
            try {
                if (!FH) {
                    return "Add behind...";
                }
                iy.gn(-1329989744533213145L, this);
                return "Add behind...";
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1329989744533213145L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -1241285742715056441L)
        public int j6() {
            try {
                if (FH) {
                    iy.gn(-140717819313155212L, this);
                }
                return p.icon_add;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -140717819313155212L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 1213284910229595216L)
        public void run() {
            try {
                if (FH) {
                    iy.gn(-4015866744319267467L, this);
                }
                com.aide.uidesigner.k.v5(this.DW, "Add behind " + this.j6.getNodeName() + "...", new a());
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -4015866744319267467L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3466521533733933447L, container = -2150908242116545680L, user = true)
    static class l implements PropertiesDialog.b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -1747901955319884881L)
        final /* synthetic */ com.aide.uidesigner.f DW;

        @dy(field = 2940239808701159355L)
        final /* synthetic */ Activity j6;

        @cy(clazz = -111573951809901124L, container = -2150908242116545680L, user = true)
        class a implements ValueRunnable<com.aide.uidesigner.b> {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 188967110165454780L)
            a() {
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = 1391269189773257369L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(com.aide.uidesigner.b bVar) {
                try {
                    if (DW) {
                        iy.tp(-424727433886296280L, this, bVar);
                    }
                    l.this.DW.BT(bVar);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -424727433886296280L, this, bVar);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(l.class);
        }

        @ey(method = -785988678987074080L)
        l(Activity activity, com.aide.uidesigner.f fVar) {
            this.j6 = activity;
            this.DW = fVar;
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 2420929976063971413L)
        public boolean DW() {
            try {
                if (!FH) {
                    return true;
                }
                iy.gn(-1530324728547616008L, this);
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1530324728547616008L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -865018437470870760L)
        public String FH() {
            try {
                if (!FH) {
                    return null;
                }
                iy.gn(-1366985782995414615L, this);
                return null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1366985782995414615L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -3068738100660847125L)
        public String getName() {
            try {
                if (!FH) {
                    return "Surround with...";
                }
                iy.gn(-1216153183754444176L, this);
                return "Surround with...";
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1216153183754444176L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = 1958947964415619436L)
        public int j6() {
            try {
                if (FH) {
                    iy.gn(-110619686470543077L, this);
                }
                return p.icon_add;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -110619686470543077L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.common.PropertiesDialog.b
        @ey(method = -752582219022939295L)
        public void run() {
            try {
                if (FH) {
                    iy.gn(-3937791846824242592L, this);
                }
                com.aide.uidesigner.k.Hw(this.j6, "Surround " + this.DW.getNodeName() + " with...", new a());
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -3937791846824242592L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(g.class);
    }

    @ey(method = 3051673648546458768L)
    public g() {
        try {
            if (j6) {
                iy.gn(-5203276896473754525L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -5203276896473754525L, null);
            }
            throw th;
        }
    }

    @ey(method = -3459724401338190993L)
    private static List<PropertiesDialog.b> DW(Activity activity, com.aide.uidesigner.f fVar) {
        try {
            if (j6) {
                iy.EQ(4087902274621270701L, null, activity, fVar);
            }
            return Arrays.asList(new e(fVar, activity), new f(activity, fVar), new C0100g(fVar, activity), new h(fVar, activity), new i(fVar, activity), new j(fVar, activity), new k(fVar, activity), new l(activity, fVar), new a(fVar), new b(fVar, activity), new c(fVar, activity));
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 4087902274621270701L, null, activity, fVar);
            }
            throw th;
        }
    }

    @ey(method = -2382694599864101963L)
    private static List<PropertiesDialog.b> FH(Activity activity, com.aide.uidesigner.f fVar) {
        String strDW;
        try {
            if (j6) {
                iy.EQ(1756864205468733015L, null, activity, fVar);
            }
            ArrayList arrayList = new ArrayList();
            for (com.aide.uidesigner.a aVar : fVar.getAttributes()) {
                if (aVar.Hw()) {
                    strDW = aVar.j6.DW() + " styled <b>" + aVar.j6() + "</b>";
                } else if (aVar.FH()) {
                    strDW = aVar.j6.DW() + " = <b>" + aVar.j6() + "</b>";
                } else {
                    strDW = aVar.j6.DW();
                }
                arrayList.add(new d(activity, fVar, aVar, strDW));
            }
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1756864205468733015L, null, activity, fVar);
            }
            throw th;
        }
    }

    @ey(method = 3347511577329537499L)
    public static void Hw(Activity activity, com.aide.uidesigner.f fVar) {
        try {
            if (j6) {
                iy.EQ(-5678331379897073831L, null, activity, fVar);
            }
            MessageBox.gW(activity, new PropertiesDialog(fVar.getPath(), j6(activity, fVar)));
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -5678331379897073831L, null, activity, fVar);
            }
            throw th;
        }
    }

    @ey(method = 1448757450179201013L)
    private static List<PropertiesDialog.b> j6(Activity activity, com.aide.uidesigner.f fVar) {
        try {
            if (j6) {
                iy.EQ(-424790971500819665L, null, activity, fVar);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(DW(activity, fVar));
            arrayList.addAll(FH(activity, fVar));
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -424790971500819665L, null, activity, fVar);
            }
            throw th;
        }
    }
}
