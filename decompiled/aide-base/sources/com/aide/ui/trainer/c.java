package com.aide.ui.trainer;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.content.res.Resources;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.services.ProjectSupport;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@cy(clazz = -993302590746004176L, container = -993302590746004176L, user = true)
/* loaded from: classes.dex */
public class c {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -691869674983840000L)
    private String DW;

    @dy(field = -688443317531605845L)
    private List<b> j6;

    @cy(clazz = -1402165132050376295L, container = -993302590746004176L, user = true)
    class a implements Comparator<b> {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 2814586420648148601L)
        a(c cVar) {
        }

        @Override // java.util.Comparator
        @ey(method = 358588286953115584L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            try {
                if (WB) {
                    iy.EQ(889594008419192700L, this, bVar, bVar2);
                }
                return bVar.we() - bVar2.we();
            } catch (Throwable th) {
                if (mb) {
                    iy.Mr(th, 889594008419192700L, this, bVar, bVar2);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -6765686040277610215L, container = -6765686040277610215L, user = true)
    public static class b extends d {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        static {
            iy.Zo(b.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -2696139747873568421L)
        public b(String str, Document document, int i, C0094c c0094c) {
            super(str, document, i, c0094c);
            try {
                if (u7) {
                    iy.J0(7840283776164288800L, null, str, document, new Integer(i), c0094c);
                }
            } catch (Throwable th) {
                if (tp) {
                    iy.a8(th, 7840283776164288800L, null, str, document, new Integer(i), c0094c);
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = 3137279440135751757L)
        public i U2() {
            try {
                if (u7) {
                    iy.gn(-566529925795326783L, this);
                }
                return new i(c.J8(this.j6, "Files"));
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -566529925795326783L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.trainer.c.d
        @ey(method = -832898653046290379L)
        /* renamed from: a8, reason: merged with bridge method [inline-methods] */
        public h VH(int i) {
            try {
                if (u7) {
                    iy.u7(-1175119095842610159L, this, i);
                }
                return new h(this, tp(i), i, i >= this.FH);
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, -1175119095842610159L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 3376179178101862368L)
        public InputStream er(String str) {
            try {
                if (u7) {
                    iy.tp(-5739883546076470656L, this, str);
                }
                return c.ei("templates", v5(), str);
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, -5739883546076470656L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.trainer.c.d
        @ey(method = -468114952550051040L)
        /* renamed from: lg, reason: merged with bridge method [inline-methods] */
        public h gn(String str) {
            try {
                if (u7) {
                    iy.tp(-705371189166181888L, this, str);
                }
                return (h) super.gn(str);
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, -705371189166181888L, this, str);
                }
                throw th;
            }
        }

        @ey(method = 2750697615911900111L)
        public String rN() {
            try {
                if (u7) {
                    iy.gn(4272037751344810787L, this);
                }
                return c.rN(this.j6, "full_title");
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, 4272037751344810787L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5122221461780211243L, container = -5122221461780211243L, user = true)
    /* renamed from: com.aide.ui.trainer.c$c, reason: collision with other inner class name */
    public static class C0094c {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = 1728858149439749523L)
        public int DW;

        @dy(field = 1558341171034280268L)
        public String[] FH;

        @dy(field = -203284564619748955L)
        public String j6;

        static {
            iy.Zo(C0094c.class);
        }

        @ey(method = -1068648355434934399L)
        public C0094c(String str, int i, String[] strArr) {
            try {
                if (Hw) {
                    iy.we(359559201492285879L, null, str, new Integer(i), strArr);
                }
                this.j6 = str;
                this.DW = i;
                this.FH = strArr;
            } catch (Throwable th) {
                if (v5) {
                    iy.U2(th, 359559201492285879L, null, str, new Integer(i), strArr);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2032974213187745272L, container = 2032974213187745272L, user = true)
    public static class d {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = 1871148059592314761L)
        private String DW;

        @dy(field = -3344462113535016405L)
        protected int FH;

        @dy(field = 1618827939621421965L)
        private int Hw;

        @dy(field = -278076957190012715L)
        private C0094c Zo;

        @dy(field = -3994006271425825645L)
        protected Element j6;

        @dy(field = 1006899535482333535L)
        private boolean v5;

        static {
            iy.Zo(d.class);
        }

        @ey(method = 7270428816126899040L)
        public d(String str, Document document, int i, C0094c c0094c) {
            try {
                if (VH) {
                    iy.J0(-2375987367477742941L, null, str, document, new Integer(i), c0094c);
                }
                this.j6 = c.Ws(document, 0);
                this.DW = str;
                this.Hw = i;
                this.Zo = c0094c;
                this.v5 = ServiceContainer.ca() || Arrays.asList(c0094c.FH).contains(ServiceContainer.P8);
                if (ServiceContainer.g3()) {
                    this.FH = 3;
                } else {
                    this.FH = 2;
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.a8(th, -2375987367477742941L, null, str, document, new Integer(i), c0094c);
                }
                throw th;
            }
        }

        @ey(method = -4030626747103223429L)
        public String DW() {
            try {
                if (VH) {
                    iy.gn(5873076587671154616L, this);
                }
                return c.rN(this.j6, "code_template");
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 5873076587671154616L, this);
                }
                throw th;
            }
        }

        @ey(method = 3574688848923288316L)
        public int EQ() {
            try {
                if (VH) {
                    iy.gn(-2896103936826309461L, this);
                }
                return this.Hw;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -2896103936826309461L, this);
                }
                throw th;
            }
        }

        @ey(method = 2731352819839337456L)
        public String FH() {
            try {
                if (VH) {
                    iy.gn(-7478577487981611909L, this);
                }
                return c.rN(this.j6, "explore_section");
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -7478577487981611909L, this);
                }
                throw th;
            }
        }

        @ey(method = -125133442588490220L)
        public int Hw() {
            try {
                if (VH) {
                    iy.gn(65179785578040573L, this);
                }
                String strWe = c.we(this.j6, "icon");
                if (strWe.length() <= 0) {
                    return 2131165304;
                }
                try {
                    return ((Integer) R$drawable.class.getDeclaredField(strWe).get(null)).intValue();
                } catch (Exception unused) {
                    return 2131165304;
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 65179785578040573L, this);
                }
                throw th;
            }
        }

        @ey(method = -5197017462301666341L)
        public long J0() {
            try {
                if (VH) {
                    iy.gn(-2524805889827186084L, this);
                }
                try {
                    return new SimpleDateFormat("yyyy-MM-dd").parse(c.we(this.j6, "release_date")).getTime();
                } catch (ParseException unused) {
                    return 0L;
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -2524805889827186084L, this);
                }
                throw th;
            }
        }

        @ey(method = 1949314774628252160L)
        public k J8(int i) {
            try {
                if (VH) {
                    iy.u7(724128354374839875L, this, i);
                }
                return new k(this, c.QX(this.j6, "Sample", i));
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 724128354374839875L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -3736531479167934780L)
        public List<k> QX() {
            try {
                if (VH) {
                    iy.gn(-1511297403287800401L, this);
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < Ws(); i++) {
                    arrayList.add(J8(i));
                }
                return arrayList;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -1511297403287800401L, this);
                }
                throw th;
            }
        }

        @ey(method = 1240036765120762972L)
        public j VH(int i) {
            try {
                if (VH) {
                    iy.u7(215121920876090371L, this, i);
                }
                return new j(this, tp(i), i, i >= this.FH);
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 215121920876090371L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -817311711774997712L)
        public int Ws() {
            try {
                if (VH) {
                    iy.gn(1534489530421510585L, this);
                }
                return c.XL(this.j6, "Sample");
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 1534489530421510585L, this);
                }
                throw th;
            }
        }

        @ey(method = -3634031619328646307L)
        public String[] XL() {
            try {
                if (VH) {
                    iy.gn(2715590823475051800L, this);
                }
                String strRN = c.rN(this.j6, "title");
                int iLastIndexOf = strRN.lastIndexOf(" ");
                return new String[]{strRN.substring(0, iLastIndexOf), strRN.substring(iLastIndexOf + 1)};
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 2715590823475051800L, this);
                }
                throw th;
            }
        }

        @ey(method = -1435295528985683631L)
        public long Zo() {
            try {
                if (VH) {
                    iy.gn(-6007721509864879680L, this);
                }
                long jJ0 = J0();
                int iU7 = u7();
                for (int i = 0; i < iU7; i++) {
                    Date dateU7 = VH(i).u7();
                    if (dateU7 != null) {
                        jJ0 = Math.max(jJ0, dateU7.getTime());
                    }
                }
                return jJ0;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -6007721509864879680L, this);
                }
                throw th;
            }
        }

        @ey(method = 509002016623767425L)
        public boolean aM(String str) {
            try {
                if (VH) {
                    iy.tp(-453154085904874692L, this, str);
                }
                return gn(str).j6();
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -453154085904874692L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -117890754360234975L)
        public boolean equals(Object obj) {
            try {
                if (VH) {
                    iy.tp(58083287476658880L, this, obj);
                }
                if (obj instanceof d) {
                    if (((d) obj).DW.equals(this.DW)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 58083287476658880L, this, obj);
                }
                throw th;
            }
        }

        @ey(method = -1486392185365196135L)
        public j gn(String str) {
            try {
                if (VH) {
                    iy.tp(1640470809410567244L, this, str);
                }
                int iU7 = u7();
                int i = 0;
                while (i < iU7 && !VH(i).Zo().equals(str)) {
                    i++;
                }
                return VH(i);
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 1640470809410567244L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -1594951283166405108L)
        public boolean j3() {
            try {
                if (VH) {
                    iy.gn(1248595826956952825L, this);
                }
                return this.v5;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 1248595826956952825L, this);
                }
                throw th;
            }
        }

        @ey(method = -757883935312104884L)
        public String j6() {
            try {
                if (VH) {
                    iy.gn(-2194517380544776245L, this);
                }
                return c.rN(this.j6, "code_section");
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -2194517380544776245L, this);
                }
                throw th;
            }
        }

        @ey(method = 2395555322758204104L)
        protected Element tp(int i) {
            try {
                if (VH) {
                    iy.u7(-3152369509503153969L, this, i);
                }
                return c.QX(this.j6, "Lesson", i);
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -3152369509503153969L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -4814632618280841240L)
        public int u7() {
            try {
                if (VH) {
                    iy.gn(-2162011056604030763L, this);
                }
                return c.XL(this.j6, "Lesson");
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -2162011056604030763L, this);
                }
                throw th;
            }
        }

        @ey(method = 143440366787286840L)
        public String v5() {
            try {
                if (VH) {
                    iy.gn(-1788210428555103797L, this);
                }
                return this.DW;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -1788210428555103797L, this);
                }
                throw th;
            }
        }

        @ey(method = 1984738281004073661L)
        public int we() {
            try {
                if (VH) {
                    iy.gn(-4179425645871008720L, this);
                }
                return this.Zo.DW;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -4179425645871008720L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -8250854631810403780L, container = -8250854631810403780L, user = true)
    public static class e {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 1893228719790663455L)
        private h DW;

        @dy(field = 3858152228756027337L)
        private Element j6;

        static {
            iy.Zo(e.class);
        }

        @ey(method = -420963780008896728L)
        public e(Element element, h hVar) {
            try {
                if (FH) {
                    iy.EQ(-1736715116228713832L, null, element, hVar);
                }
                this.j6 = element;
                this.DW = hVar;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, -1736715116228713832L, null, element, hVar);
                }
                throw th;
            }
        }

        @ey(method = 3569498364685859424L)
        public int DW() {
            try {
                if (FH) {
                    iy.gn(1811620952272369832L, this);
                }
                if (c.J8(this.j6, "CodeHint") != null) {
                    return 0;
                }
                if (c.J8(this.j6, "CodeHint_1") != null) {
                    return 1;
                }
                if (c.J8(this.j6, "CodeHint_2") != null) {
                    return 2;
                }
                if (c.J8(this.j6, "CodeHint_3") != null) {
                    return 3;
                }
                if (c.J8(this.j6, "CodeHint_4") != null) {
                    return 4;
                }
                if (c.J8(this.j6, "CodeHint_5") != null) {
                    return 5;
                }
                if (c.J8(this.j6, "CodeHint_6") != null) {
                    return 6;
                }
                if (c.J8(this.j6, "CodeHint_7") != null) {
                    return 7;
                }
                if (c.J8(this.j6, "CodeHint_8") != null) {
                    return 8;
                }
                if (c.J8(this.j6, "CodeHint_9") != null) {
                    return 9;
                }
                return c.J8(this.j6, "CodeHint_10") != null ? 10 : -1;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 1811620952272369832L, this);
                }
                throw th;
            }
        }

        @ey(method = -3906582606583822935L)
        public g EQ(int i) {
            try {
                if (FH) {
                    iy.u7(1036312778239171213L, this, i);
                }
                return new g(c.QX(this.j6, "SourceCode", i));
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 1036312778239171213L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -797632486659476307L)
        public String FH() {
            try {
                if (FH) {
                    iy.gn(-1892696638759932663L, this);
                }
                return QX() ? c.rN(this.j6, "designer_task") : Ws();
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1892696638759932663L, this);
                }
                throw th;
            }
        }

        @ey(method = 3490301952689866860L)
        public f Hw(int i) {
            try {
                if (FH) {
                    iy.u7(-1656919242738387628L, this, i);
                }
                return new f(c.QX(this.j6, "ExpectedCode", i));
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -1656919242738387628L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 638204021117777088L)
        public int J0() {
            try {
                if (FH) {
                    iy.gn(1207704843941494400L, this);
                }
                return c.lg(c.J8(this.j6, "Run"), "success_duration", 10);
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 1207704843941494400L, this);
                }
                throw th;
            }
        }

        @ey(method = -16385507919424373L)
        public String J8() {
            try {
                if (FH) {
                    iy.gn(-7740714552449470865L, this);
                }
                return c.rN(c.J8(this.j6, "Run"), "success");
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -7740714552449470865L, this);
                }
                throw th;
            }
        }

        @ey(method = -4441979660039516096L)
        public boolean QX() {
            try {
                if (FH) {
                    iy.gn(3191394215822675216L, this);
                }
                return c.gW(this.j6, "designer_task");
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 3191394215822675216L, this);
                }
                throw th;
            }
        }

        @ey(method = -249926466381497920L)
        public String VH() {
            try {
                if (FH) {
                    iy.gn(-1632305700854928000L, this);
                }
                return this.DW.VH();
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1632305700854928000L, this);
                }
                throw th;
            }
        }

        @ey(method = -3452524370277289200L)
        public String Ws() {
            try {
                if (FH) {
                    iy.gn(-4515771330804701536L, this);
                }
                return c.rN(this.j6, "task");
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -4515771330804701536L, this);
                }
                throw th;
            }
        }

        @ey(method = 3269300852522385720L)
        public boolean XL() {
            try {
                if (FH) {
                    iy.gn(-1495369091191866720L, this);
                }
                return gn() == 1;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1495369091191866720L, this);
                }
                throw th;
            }
        }

        @ey(method = -1403239521781011003L)
        public String Zo() {
            try {
                if (FH) {
                    iy.gn(6524859607240166553L, this);
                }
                return c.J0(c.J8(this.j6, "ExpectedOutput"));
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 6524859607240166553L, this);
                }
                throw th;
            }
        }

        @ey(method = 1616390068328247819L)
        public String aM() {
            try {
                if (FH) {
                    iy.gn(-3205366564468855897L, this);
                }
                return c.rN(c.J8(this.j6, "Run"), "file");
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -3205366564468855897L, this);
                }
                throw th;
            }
        }

        @ey(method = 1428851477486837928L)
        public int gn() {
            try {
                if (FH) {
                    iy.gn(-3013313329185756344L, this);
                }
                return c.lg(this.j6, "level", -1);
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -3013313329185756344L, this);
                }
                throw th;
            }
        }

        @ey(method = 3825761505497654751L)
        public boolean j3() {
            try {
                if (FH) {
                    iy.gn(2026391741138159867L, this);
                }
                return c.J8(this.j6, "Run") != null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 2026391741138159867L, this);
                }
                throw th;
            }
        }

        @ey(method = 1427622907127723136L)
        public String j6() {
            try {
                if (FH) {
                    iy.gn(-3339733376723365440L, this);
                }
                return c.we(this.j6, "code_file");
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -3339733376723365440L, this);
                }
                throw th;
            }
        }

        @ey(method = -485987923672001743L)
        public String tp() {
            try {
                if (FH) {
                    iy.gn(-572971557939266691L, this);
                }
                return c.rN(c.J8(this.j6, "ExpectedOutput"), "fail") + " " + u7();
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -572971557939266691L, this);
                }
                throw th;
            }
        }

        @ey(method = -10881820220531885L)
        public String u7() {
            try {
                if (FH) {
                    iy.gn(-2496150541369383185L, this);
                }
                return c.rN(c.J8(this.j6, "ExpectedOutput"), "hint");
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -2496150541369383185L, this);
                }
                throw th;
            }
        }

        @ey(method = -2167053690592721025L)
        public int v5() {
            try {
                if (FH) {
                    iy.gn(-1776030578198801685L, this);
                }
                return c.XL(this.j6, "ExpectedCode");
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1776030578198801685L, this);
                }
                throw th;
            }
        }

        @ey(method = -2266942421100981609L)
        public int we() {
            try {
                if (FH) {
                    iy.gn(-4905834462517254965L, this);
                }
                return c.XL(this.j6, "SourceCode");
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -4905834462517254965L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -23258662957994793L, container = -23258662957994793L, user = true)
    public static class f {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -1937894292219908608L)
        private Element j6;

        static {
            iy.Zo(f.class);
        }

        @ey(method = -405201673178002055L)
        public f(Element element) {
            try {
                if (DW) {
                    iy.tp(-7001333715488716863L, null, element);
                }
                this.j6 = element;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -7001333715488716863L, null, element);
                }
                throw th;
            }
        }

        @ey(method = -4199555245281670725L)
        public int DW() {
            try {
                if (DW) {
                    iy.gn(1618348940417759820L, this);
                }
                return c.lg(this.j6, "end_line", Integer.MAX_VALUE);
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 1618348940417759820L, this);
                }
                throw th;
            }
        }

        @ey(method = -5065185074137131856L)
        public String FH() {
            try {
                if (DW) {
                    iy.gn(1817653937487518575L, this);
                }
                return c.rN(this.j6, "fail");
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 1817653937487518575L, this);
                }
                throw th;
            }
        }

        @ey(method = 2921255805336661485L)
        public int Hw() {
            try {
                if (DW) {
                    iy.gn(6408981009628116096L, this);
                }
                return c.lg(this.j6, "count", -1);
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 6408981009628116096L, this);
                }
                throw th;
            }
        }

        @ey(method = -2257217967991165953L)
        public String j6() {
            try {
                if (DW) {
                    iy.gn(-1309781986342346160L, this);
                }
                return c.J0(this.j6);
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -1309781986342346160L, this);
                }
                throw th;
            }
        }

        @ey(method = -3293266330817658272L)
        public int v5() {
            try {
                if (DW) {
                    iy.gn(1415930953951033415L, this);
                }
                return c.lg(this.j6, "start_line", 1);
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 1415930953951033415L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4013082557874897164L, container = -4013082557874897164L, user = true)
    public static class g {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -2985623065235026600L)
        private Element j6;

        static {
            iy.Zo(g.class);
        }

        @ey(method = 75167972719528029L)
        public g(Element element) {
            try {
                if (DW) {
                    iy.tp(3544532125458268941L, null, element);
                }
                this.j6 = element;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 3544532125458268941L, null, element);
                }
                throw th;
            }
        }

        @ey(method = 4105930090608435256L)
        public String DW() {
            try {
                if (DW) {
                    iy.gn(-251720755327937920L, this);
                }
                return c.we(this.j6, "code_file");
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -251720755327937920L, this);
                }
                throw th;
            }
        }

        @ey(method = -2046767459334467405L)
        public String j6() {
            try {
                if (DW) {
                    iy.gn(723728620582508447L, this);
                }
                return c.J0(this.j6);
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 723728620582508447L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 5110256496684089604L, container = 5110256496684089604L, user = true)
    public static class h extends j {

        @fy
        private static /* synthetic */ boolean gn;

        @gy
        private static /* synthetic */ boolean u7;

        @dy(field = 1128719674085233888L)
        private b VH;

        static {
            iy.Zo(h.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -3663966272138339409L)
        public h(b bVar, Element element, int i, boolean z) {
            super(bVar, element, i, z);
            try {
                if (gn) {
                    iy.J0(-400632563231544841L, null, bVar, element, new Integer(i), new Boolean(z));
                }
                this.VH = bVar;
            } catch (Throwable th) {
                if (u7) {
                    iy.a8(th, -400632563231544841L, null, bVar, element, new Integer(i), new Boolean(z));
                }
                throw th;
            }
        }

        @ey(method = 713716861867598673L)
        public boolean J8() {
            try {
                if (gn) {
                    iy.gn(-2264346491619106071L, this);
                }
                if (gn() == 1) {
                    if (ServiceContainer.g3()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (u7) {
                    iy.aM(th, -2264346491619106071L, this);
                }
                throw th;
            }
        }

        @ey(method = -3926917627872757777L)
        public i Mr() {
            try {
                if (gn) {
                    iy.gn(-2915079235952684265L, this);
                }
                Element elementJ8 = c.J8(this.j6, "Files");
                return elementJ8 != null ? new i(elementJ8) : this.VH.U2();
            } catch (Throwable th) {
                if (u7) {
                    iy.aM(th, -2915079235952684265L, this);
                }
                throw th;
            }
        }

        @ey(method = -4344954959091542843L)
        public float QX() {
            try {
                if (gn) {
                    iy.gn(-750980563211738755L, this);
                }
                float fGn = 0.0f;
                int iJ3 = j3();
                for (int i = 0; i < iJ3; i++) {
                    fGn += aM(i).gn();
                }
                return fGn / iJ3;
            } catch (Throwable th) {
                if (u7) {
                    iy.aM(th, -750980563211738755L, this);
                }
                throw th;
            }
        }

        @ey(method = -425463713580498744L)
        public boolean Ws() {
            try {
                if (gn) {
                    iy.gn(75689899466285720L, this);
                }
                return gn() == 0;
            } catch (Throwable th) {
                if (u7) {
                    iy.aM(th, 75689899466285720L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.trainer.c.j
        @ey(method = 3377678553254926935L)
        /* renamed from: XL, reason: merged with bridge method [inline-methods] */
        public b DW() {
            try {
                if (gn) {
                    iy.gn(2648694203622230191L, this);
                }
                return this.VH;
            } catch (Throwable th) {
                if (u7) {
                    iy.aM(th, 2648694203622230191L, this);
                }
                throw th;
            }
        }

        @ey(method = 2312570045627550431L)
        public e aM(int i) {
            try {
                if (gn) {
                    iy.u7(-2318913412497320265L, this, i);
                }
                return new e(c.QX(this.j6, "Exercise", i), this);
            } catch (Throwable th) {
                if (u7) {
                    iy.j3(th, -2318913412497320265L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -4627587656625690711L)
        public int j3() {
            try {
                if (gn) {
                    iy.gn(629188892085250001L, this);
                }
                if (this.j6 == null) {
                    return 1;
                }
                return c.XL(this.j6, "Exercise");
            } catch (Throwable th) {
                if (u7) {
                    iy.aM(th, 629188892085250001L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.trainer.c.j
        @ey(method = 5153288539285804515L)
        public int v5() {
            try {
                if (gn) {
                    iy.gn(3747769896056122747L, this);
                }
                return j3() * 2;
            } catch (Throwable th) {
                if (u7) {
                    iy.aM(th, 3747769896056122747L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 146356023243298461L, container = 146356023243298461L, user = true)
    public static class i {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 4069282971999914593L)
        private Element j6;

        static {
            iy.Zo(i.class);
        }

        @ey(method = 8389474425476071588L)
        public i(Element element) {
            try {
                if (DW) {
                    iy.tp(-1287991534601975237L, null, element);
                }
                this.j6 = element;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -1287991534601975237L, null, element);
                }
                throw th;
            }
        }

        @ey(method = -1562579348792143297L)
        public String DW() {
            try {
                if (DW) {
                    iy.gn(7365186393412346893L, this);
                }
                return c.we(this.j6, "template2");
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 7365186393412346893L, this);
                }
                throw th;
            }
        }

        @ey(method = 271031993226269484L)
        public String FH() {
            try {
                if (DW) {
                    iy.gn(2876321311259981568L, this);
                }
                return c.we(this.j6, "package_name");
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 2876321311259981568L, this);
                }
                throw th;
            }
        }

        @ey(method = -3619317361160997425L)
        public String Hw() {
            try {
                if (DW) {
                    iy.gn(-615673037961656051L, this);
                }
                return c.we(this.j6, "project_name");
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -615673037961656051L, this);
                }
                throw th;
            }
        }

        @ey(method = 4449251591062519100L)
        public String Zo() {
            try {
                if (DW) {
                    iy.gn(4638732052682023200L, this);
                }
                return c.we(this.j6, "template");
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 4638732052682023200L, this);
                }
                throw th;
            }
        }

        @ey(method = 2604081990362584160L)
        public List<String> j6() {
            try {
                if (DW) {
                    iy.gn(-1072096825509648360L, this);
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < c.XL(this.j6, "CodeFile"); i++) {
                    arrayList.add(c.we(c.QX(this.j6, "CodeFile", i), AppMeasurementSdk.ConditionalUserProperty.NAME));
                }
                return arrayList;
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -1072096825509648360L, this);
                }
                throw th;
            }
        }

        @ey(method = -5739640148122318624L)
        public String v5() {
            try {
                if (DW) {
                    iy.gn(3547461207823939552L, this);
                }
                return c.we(this.j6, "open_path");
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 3547461207823939552L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2102089122967884329L, container = -2102089122967884329L, user = true)
    public static class j {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = -390061831656893197L)
        private int DW;

        @dy(field = -479455877723558205L)
        private d FH;

        @dy(field = -2761438094623207025L)
        private boolean Hw;

        @dy(field = 4078373527284893016L)
        protected Element j6;

        static {
            iy.Zo(j.class);
        }

        @ey(method = -157141558834330651L)
        public j(d dVar, Element element, int i, boolean z) {
            try {
                if (v5) {
                    iy.J0(795878009132061559L, null, dVar, element, new Integer(i), new Boolean(z));
                }
                this.j6 = element;
                this.FH = dVar;
                this.DW = i;
                this.Hw = z;
            } catch (Throwable th) {
                if (Zo) {
                    iy.a8(th, 795878009132061559L, null, dVar, element, new Integer(i), new Boolean(z));
                }
                throw th;
            }
        }

        @ey(method = 571095699088866088L)
        public d DW() {
            try {
                if (v5) {
                    iy.gn(2155870240163226785L, this);
                }
                return this.FH;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 2155870240163226785L, this);
                }
                throw th;
            }
        }

        @ey(method = 126842060789114517L)
        public String EQ() {
            try {
                if (v5) {
                    iy.gn(-530794501232830464L, this);
                }
                return c.rN(this.j6, "title");
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -530794501232830464L, this);
                }
                throw th;
            }
        }

        @ey(method = -4962106213035085464L)
        public String FH() {
            try {
                if (v5) {
                    iy.gn(6036700149904100103L, this);
                }
                return c.rN(this.j6, "description");
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 6036700149904100103L, this);
                }
                throw th;
            }
        }

        @ey(method = 802095058948420575L)
        public String Hw() {
            try {
                if (v5) {
                    iy.gn(1223429971340825300L, this);
                }
                String strFH = FH();
                if (we()) {
                    strFH = strFH + " (en)";
                }
                if (c.we(this.j6, "example").length() <= 0) {
                    return strFH;
                }
                return strFH + "<br/><br/><b>" + c.we(this.j6, "example").replace("<", "&lt;").replace(">", "&gt;") + "</b>";
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 1223429971340825300L, this);
                }
                throw th;
            }
        }

        @ey(method = 991036166945572488L)
        public boolean J0() {
            try {
                if (v5) {
                    iy.gn(-1191056713009837891L, this);
                }
                return this.Hw;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -1191056713009837891L, this);
                }
                throw th;
            }
        }

        @ey(method = -3725333364906201465L)
        public String VH() {
            try {
                if (v5) {
                    iy.gn(-1036180560223433628L, this);
                }
                return c.er(this.j6, "title");
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -1036180560223433628L, this);
                }
                throw th;
            }
        }

        @ey(method = 1402045969068265232L)
        public String Zo() {
            try {
                if (v5) {
                    iy.gn(1771144425505446949L, this);
                }
                if (c.gW(this.j6, "id")) {
                    return c.we(this.j6, "id");
                }
                return DW().XL()[0] + " " + EQ();
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 1771144425505446949L, this);
                }
                throw th;
            }
        }

        @ey(method = -2928210703729080000L)
        public int gn() {
            try {
                if (v5) {
                    iy.gn(-1241262621956508975L, this);
                }
                return this.DW;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -1241262621956508975L, this);
                }
                throw th;
            }
        }

        @ey(method = 2730388162346767909L)
        public boolean j6() {
            try {
                if (v5) {
                    iy.gn(2098623341845350900L, this);
                }
                return this.j6 != null;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 2098623341845350900L, this);
                }
                throw th;
            }
        }

        @ey(method = 5196771108084539L)
        public String toString() {
            try {
                if (v5) {
                    iy.gn(-657804903927645040L, this);
                }
                return Zo();
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -657804903927645040L, this);
                }
                throw th;
            }
        }

        @ey(method = -2052111330083900283L)
        public String tp() {
            try {
                if (v5) {
                    iy.gn(-3597937480222124736L, this);
                }
                return c.rN(this.j6, "section");
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -3597937480222124736L, this);
                }
                throw th;
            }
        }

        @ey(method = 2265742758541090360L)
        public Date u7() {
            try {
                if (v5) {
                    iy.gn(778533736015150327L, this);
                }
                try {
                    return new SimpleDateFormat("yyyy-MM-dd").parse(c.we(this.j6, "release_date"));
                } catch (ParseException unused) {
                    return null;
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 778533736015150327L, this);
                }
                throw th;
            }
        }

        @ey(method = 2920080966645596064L)
        public int v5() {
            try {
                if (v5) {
                    iy.gn(-1966389672938436395L, this);
                }
                return c.lg(this.j6, "time", -1);
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -1966389672938436395L, this);
                }
                throw th;
            }
        }

        @ey(method = -2455685188554528973L)
        public boolean we() {
            try {
                if (v5) {
                    iy.gn(1589262225799279376L, this);
                }
                if ("en".equals(VH())) {
                    if (!"en".equals(c.yS())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 1589262225799279376L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 326293778639416119L, container = 326293778639416119L, user = true)
    public static class k {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 895925174014560699L)
        private d DW;

        @dy(field = -1529900739524859768L)
        private Element j6;

        static {
            iy.Zo(k.class);
        }

        @ey(method = -3060529391146048745L)
        public k(d dVar, Element element) {
            try {
                if (FH) {
                    iy.EQ(-3589145604975760432L, null, dVar, element);
                }
                this.j6 = element;
                this.DW = dVar;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, -3589145604975760432L, null, dVar, element);
                }
                throw th;
            }
        }

        @ey(method = 64303336811345856L)
        public d DW() {
            try {
                if (FH) {
                    iy.gn(309801622313483492L, this);
                }
                return this.DW;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 309801622313483492L, this);
                }
                throw th;
            }
        }

        @ey(method = 5998252362344352096L)
        public String FH() {
            try {
                if (FH) {
                    iy.gn(5165283106204830700L, this);
                }
                String strRN = c.rN(this.j6, "description");
                if (!u7()) {
                    return strRN;
                }
                return strRN + " (en)";
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 5165283106204830700L, this);
                }
                throw th;
            }
        }

        @ey(method = 2033241201865460112L)
        public String Hw() {
            try {
                if (FH) {
                    iy.gn(-1689775095112513268L, this);
                }
                return c.we(this.j6, "id");
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1689775095112513268L, this);
                }
                throw th;
            }
        }

        @ey(method = -1191545855658703479L)
        public long VH() {
            try {
                if (FH) {
                    iy.gn(4269892148297726049L, this);
                }
                try {
                    return new SimpleDateFormat("yyyy-MM-dd").parse(c.we(this.j6, "release_date")).getTime();
                } catch (ParseException unused) {
                    return 0L;
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 4269892148297726049L, this);
                }
                throw th;
            }
        }

        @ey(method = 3716860024870157199L)
        public String Zo() {
            try {
                if (FH) {
                    iy.gn(3452318942965628175L, this);
                }
                return c.we(this.j6, "project_dir");
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 3452318942965628175L, this);
                }
                throw th;
            }
        }

        @ey(method = -374857298203659645L)
        public String gn() {
            try {
                if (FH) {
                    iy.gn(2017197086101409807L, this);
                }
                return c.rN(this.j6, "title");
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 2017197086101409807L, this);
                }
                throw th;
            }
        }

        @ey(method = -3170383422436433400L)
        public List<String> j6() {
            try {
                if (FH) {
                    iy.gn(934533128641557480L, this);
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < c.XL(this.j6, "CodeFile"); i++) {
                    arrayList.add(c.we(c.QX(this.j6, "CodeFile", i), AppMeasurementSdk.ConditionalUserProperty.NAME));
                }
                return arrayList;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 934533128641557480L, this);
                }
                throw th;
            }
        }

        @ey(method = 22989811041425437L)
        public boolean u7() {
            try {
                if (FH) {
                    iy.gn(-1080590385866493635L, this);
                }
                if ("en".equals(v5())) {
                    if (!"en".equals(c.yS())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1080590385866493635L, this);
                }
                throw th;
            }
        }

        @ey(method = -4606780041575981939L)
        public String v5() {
            try {
                if (FH) {
                    iy.gn(-1778049965812775039L, this);
                }
                return c.er(this.j6, "title");
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1778049965812775039L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(c.class);
    }

    @ey(method = -1376355844952555347L)
    public c() {
        try {
            if (FH) {
                iy.gn(4473019401161803111L, null);
            }
            this.j6 = new ArrayList();
            int i2 = 0;
            for (ProjectSupport projectSupport : ServiceContainer.getProjectSupports()) {
                List<C0094c> listXL = projectSupport.XL();
                if (listXL != null) {
                    for (C0094c c0094c : listXL) {
                        int i3 = i2 + 1;
                        try {
                            b bVarVy = vy(c0094c.j6, i2, c0094c);
                            if (bVarVy.j3()) {
                                this.j6.add(bVarVy);
                            }
                        } catch (Exception e2) {
                            this.DW = e2.toString();
                        }
                        i2 = i3;
                    }
                }
            }
            Collections.sort(this.j6, new a(this));
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 4473019401161803111L, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -3357295804980189552L)
    public static String J0(Element element) {
        try {
            if (FH) {
                iy.tp(2486627548539788027L, null, element);
            }
            if (element == null) {
                return null;
            }
            NodeList childNodes = element.getChildNodes();
            for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
                Node nodeItem = childNodes.item(i2);
                if (nodeItem instanceof CharacterData) {
                    return ((CharacterData) nodeItem).getTextContent().trim();
                }
            }
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 2486627548539788027L, null, element);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -8743893620348226344L)
    public static Element J8(Element element, String str) {
        try {
            if (FH) {
                iy.EQ(2875064011597458655L, null, element, str);
            }
            if (element == null) {
                return null;
            }
            return (Element) element.getElementsByTagName(str).item(0);
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 2875064011597458655L, null, element, str);
            }
            throw th;
        }
    }

    @ey(method = -4624373758400798581L)
    private b Mr(String str) {
        try {
            if (FH) {
                iy.tp(339144835559248944L, this, str);
            }
            for (b bVar : this.j6) {
                if (bVar.aM(str)) {
                    return bVar;
                }
            }
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 339144835559248944L, this, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2882174060870128780L)
    public static Element QX(Node node, String str, int i2) {
        try {
            if (FH) {
                iy.we(-1840817153135528865L, null, node, str, new Integer(i2));
            }
            if (node == null) {
                return null;
            }
            NodeList childNodes = node.getChildNodes();
            int i3 = 0;
            for (int i4 = 0; i4 < childNodes.getLength(); i4++) {
                Node nodeItem = childNodes.item(i4);
                if ((nodeItem instanceof Element) && (str == null || str.equals(nodeItem.getNodeName()))) {
                    if (i3 == i2) {
                        return (Element) nodeItem;
                    }
                    i3++;
                }
            }
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -1840817153135528865L, null, node, str, new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -6051363715098716200L)
    public static Element Ws(Node node, int i2) {
        try {
            if (FH) {
                iy.EQ(3064309052054338605L, null, node, new Integer(i2));
            }
            return QX(node, null, i2);
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 3064309052054338605L, null, node, new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 3940685716210939977L)
    public static int XL(Element element, String str) {
        try {
            if (FH) {
                iy.EQ(-2570507846025397200L, null, element, str);
            }
            if (element == null) {
                return 0;
            }
            NodeList childNodes = element.getChildNodes();
            int i2 = 0;
            for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
                Node nodeItem = childNodes.item(i3);
                if ((nodeItem instanceof Element) && (str == null || str.equals(nodeItem.getNodeName()))) {
                    i2++;
                }
            }
            return i2;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -2570507846025397200L, null, element, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -4455265990695004176L)
    public static InputStream ei(String str, String str2, String str3) {
        try {
            if (FH) {
                iy.we(-1361394985436033685L, null, str, str2, str3);
            }
            return ServiceContainer.getContext().getAssets().open(str + "/" + str2 + "_" + str3);
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -1361394985436033685L, null, str, str2, str3);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -323960302113301L)
    public static String er(Element element, String str) {
        try {
            if (FH) {
                iy.EQ(-217323645645554180L, null, element, str);
            }
            if ("en".equals(yS())) {
                return "en";
            }
            String strWe = we(element, str);
            if (strWe.startsWith("@string/")) {
                try {
                    String str2 = strWe.split(" ")[0].substring(8) + "_language";
                    Context context = ServiceContainer.getContext();
                    Resources resources = context.getResources();
                    String string = resources.getString(resources.getIdentifier(str2, "string", context.getPackageName()));
                    if (yS().equals(string)) {
                        return string;
                    }
                } catch (Exception unused) {
                }
            }
            return "en";
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -217323645645554180L, null, element, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 2365918161695555328L)
    public static boolean gW(Element element, String str) {
        try {
            if (FH) {
                iy.EQ(4911801033935756675L, null, element, str);
            }
            if (element == null) {
                return false;
            }
            return element.hasAttribute(str);
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 4911801033935756675L, null, element, str);
            }
            throw th;
        }
    }

    @ey(method = 2198710085943634720L)
    public static int lg(Element element, String str, int i2) {
        try {
            if (FH) {
                iy.we(1248643962861220527L, null, element, str, new Integer(i2));
            }
            try {
                return Integer.parseInt(we(element, str));
            } catch (Exception unused) {
                return i2;
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 1248643962861220527L, null, element, str, new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2996254984727259412L)
    public static String rN(Element element, String str) {
        try {
            if (FH) {
                iy.EQ(-1023178045581407525L, null, element, str);
            }
            String strWe = we(element, str);
            if (strWe.startsWith("@string/")) {
                try {
                    String[] strArrSplit = strWe.split(" ");
                    String[] strArrSplit2 = strWe.substring(strWe.indexOf(32) + 1).split(" ");
                    String strSubstring = strArrSplit[0].substring(8);
                    Context context = ServiceContainer.getContext();
                    Resources resources = context.getResources();
                    strWe = resources.getString(resources.getIdentifier(strSubstring, "string", context.getPackageName()), strArrSplit2);
                } catch (Exception unused) {
                }
            }
            return strWe.replace("<", "&lt;").replace(">", "&gt;").replace("'_", "<i>").replace("_'", "</i>").replace("!_", "<b>").replace("_!", "</b>").replace("__", "$UNDERSCORE$").replace("_", " ").replace("$UNDERSCORE$", "_").replace("\\n", "\n");
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -1023178045581407525L, null, element, str);
            }
            throw th;
        }
    }

    @ey(method = -1003261762571447696L)
    private b vy(String str, int i2, C0094c c0094c) {
        try {
            if (FH) {
                iy.we(6905919883591483875L, this, str, new Integer(i2), c0094c);
            }
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setCoalescing(true);
            DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryNewInstance.newDocumentBuilder();
            InputStream inputStreamEi = ei("trainer", str, "en.xml");
            Document document = documentBuilderNewDocumentBuilder.parse(inputStreamEi);
            inputStreamEi.close();
            return new b(str, document, i2, c0094c);
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 6905919883591483875L, this, str, new Integer(i2), c0094c);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 77489199214716784L)
    public static String we(Element element, String str) {
        try {
            if (FH) {
                iy.EQ(3143875571849258979L, null, element, str);
            }
            return element == null ? "" : element.getAttribute(str);
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 3143875571849258979L, null, element, str);
            }
            throw th;
        }
    }

    @ey(method = -3239587187828718740L)
    public static String yS() {
        try {
            if (FH) {
                iy.gn(2398874023979876385L, null);
            }
            if ("en".equals(Locale.getDefault().getLanguage())) {
                return "en";
            }
            try {
                Context context = ServiceContainer.getContext();
                Resources resources = context.getResources();
                return resources.getString(resources.getIdentifier("trainer_language", "string", context.getPackageName()));
            } catch (Exception unused) {
                return "en";
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 2398874023979876385L, null);
            }
            throw th;
        }
    }

    @ey(method = -3002481767234463885L)
    public List<d> BT() {
        try {
            if (FH) {
                iy.gn(-3264456351855514900L, this);
            }
            return this.j6;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -3264456351855514900L, this);
            }
            throw th;
        }
    }

    @ey(method = 8145278940284051475L)
    public String EQ(String str) {
        try {
            if (FH) {
                iy.tp(-4058125537365323336L, this, str);
            }
            if (Mr(str) != null) {
                return str;
            }
            String strA8 = a8(U2());
            return strA8.length() > 0 ? strA8 : a8(this.j6.get(0).v5());
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -4058125537365323336L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -109527421930553877L)
    public b P8(String str) {
        try {
            if (FH) {
                iy.tp(-5784914998224072820L, this, str);
            }
            return Mr(str);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -5784914998224072820L, this, str);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    @ey(method = 4066098832869920640L)
    public String U2() {
        long jV5 = -4868317514726911395;
        try {
            if (FH) {
                iy.gn(-4868317514726911395L, this);
            }
            for (b bVar : this.j6) {
                if (bVar.j3()) {
                    jV5 = bVar.v5();
                    return jV5;
                }
            }
            return "";
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, jV5, this);
            }
            throw th;
        }
    }

    @ey(method = 3374320507388297919L)
    public String a8(String str) {
        try {
            if (FH) {
                iy.tp(-1760347054679188576L, this, str);
            }
            try {
                return aM(str).VH(0).Zo();
            } catch (Exception unused) {
                return "";
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -1760347054679188576L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 518657598426991452L)
    public b aM(String str) {
        try {
            if (FH) {
                iy.tp(532570093295010355L, this, str);
            }
            for (b bVar : this.j6) {
                if (bVar.v5().equals(str)) {
                    return bVar;
                }
            }
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 532570093295010355L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2387311875205938576L)
    public String j3() {
        try {
            if (FH) {
                iy.gn(3442052997155114079L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 3442052997155114079L, this);
            }
            throw th;
        }
    }
}
