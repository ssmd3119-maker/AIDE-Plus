package com.aide.appwizard.runtime;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@cy(clazz = 4136550149595440731L, container = 4136550149595440731L, user = true)
/* loaded from: classes.dex */
public class a {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -505859424202625024L)
    protected Document DW;

    @dy(field = -1820927581626770964L)
    protected AppWizardActivity j6;

    @cy(clazz = -1824270371302218892L, container = 4136550149595440731L, user = true)
    /* renamed from: com.aide.appwizard.runtime.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0040a {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -154425185823208551L)
        static final /* synthetic */ int[] j6;

        static {
            try {
                iy.Zo(C0040a.class);
                if (DW) {
                    iy.gn(-3241048879321721908L, null);
                }
                int[] iArr = new int[e.values().length];
                j6 = iArr;
                try {
                    iArr[e.SliderDrawer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    j6[e.SpinnerDrawer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    j6[e.TabsDrawer.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    j6[e.Drawer.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    j6[e.Spinner.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -3241048879321721908L, null);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1306509483419979212L, container = -1306509483419979212L, user = true)
    public class b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -572582800080407340L)
        @hy
        final /* synthetic */ a DW;

        @dy(field = 1190719544853572280L)
        private Element j6;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 67808217131392759L)
        public b(a aVar, Element element) {
            try {
                if (FH) {
                    iy.EQ(3516212287528188339L, null, aVar, element);
                }
                this.DW = aVar;
                this.j6 = element;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, 3516212287528188339L, null, aVar, element);
                }
                throw th;
            }
        }

        @ey(method = 1252457154601944489L)
        public c DW() {
            try {
                if (FH) {
                    iy.gn(-4639242331643436320L, this);
                }
                return new c(this.DW, (Element) this.DW.DW.getElementsByTagName("activity").item(0));
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -4639242331643436320L, this);
                }
                throw th;
            }
        }

        @ey(method = 629505048805255575L)
        public c j6() {
            try {
                if (FH) {
                    iy.gn(4145710251922180720L, this);
                }
                Node nodeAppendChild = this.j6.appendChild(this.DW.DW.createElement("activity"));
                this.DW.EQ(1);
                return new c(this.DW, (Element) nodeAppendChild);
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 4145710251922180720L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -708008207123869275L, container = -708008207123869275L, user = true)
    public class c {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -1194566701010973552L)
        @hy
        final /* synthetic */ a DW;

        @dy(field = 2831507827959610240L)
        private Element j6;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -161228883610042121L)
        public c(a aVar, Element element) {
            try {
                if (FH) {
                    iy.EQ(-674206457155955776L, null, aVar, element);
                }
                this.DW = aVar;
                this.j6 = element;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, -674206457155955776L, null, aVar, element);
                }
                throw th;
            }
        }

        @ey(method = -1560475266036820328L)
        private d DW() {
            try {
                if (FH) {
                    iy.gn(-383778040582831965L, this);
                }
                int size = Hw().size();
                Element elementCreateElement = this.DW.DW.createElement("fragment");
                this.j6.appendChild(elementCreateElement);
                d dVar = new d(this.DW, elementCreateElement, size);
                dVar.VH("Section " + (size + 1));
                return dVar;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -383778040582831965L, this);
                }
                throw th;
            }
        }

        @ey(method = -6220129697231463L)
        private void we(Boolean bool) {
            try {
                if (FH) {
                    iy.tp(11736670178950332L, this, bool);
                }
                this.DW.tp(this.j6, "showtitle", bool);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 11736670178950332L, this, bool);
                }
                throw th;
            }
        }

        @ey(method = 2536888015538924795L)
        public void EQ(Boolean bool) {
            try {
                if (FH) {
                    iy.tp(-473320284855031172L, this, bool);
                }
                we(bool);
                this.DW.EQ(2);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -473320284855031172L, this, bool);
                }
                throw th;
            }
        }

        @ey(method = 2324553820758026880L)
        public d FH(int i) {
            try {
                if (FH) {
                    iy.u7(-1982596911851114967L, this, i);
                }
                return Hw().get(i);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -1982596911851114967L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 4177808776711175196L)
        public List<d> Hw() {
            try {
                if (FH) {
                    iy.gn(593021763670637769L, this);
                }
                ArrayList arrayList = new ArrayList();
                NodeList childNodes = this.j6.getChildNodes();
                int i = 0;
                for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
                    if (childNodes.item(i2) instanceof Element) {
                        Element element = (Element) childNodes.item(i2);
                        if ("fragment".equals(element.getTagName())) {
                            int i3 = i + 1;
                            arrayList.add(new d(this.DW, element, i));
                            i = i3;
                        }
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 593021763670637769L, this);
                }
                throw th;
            }
        }

        @ey(method = 486322762858040529L)
        public void J0(f fVar) {
            try {
                if (FH) {
                    iy.tp(-223567980805873616L, this, fVar);
                }
                this.j6.setAttribute("theme", fVar.name());
                this.DW.EQ(1);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -223567980805873616L, this, fVar);
                }
                throw th;
            }
        }

        @ey(method = 644900153677680927L)
        public void J8(String str) {
            try {
                if (FH) {
                    iy.tp(740392166154567784L, this, str);
                }
                this.j6.setAttribute("title", str);
                this.DW.EQ(2);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 740392166154567784L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -3671502612005684113L)
        public Boolean Mr() {
            try {
                if (FH) {
                    iy.gn(1853168409681259032L, this);
                }
                return this.DW.v5(this.j6, "showtitle");
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 1853168409681259032L, this);
                }
                throw th;
            }
        }

        @ey(method = -214671848593366416L)
        public Boolean QX() {
            try {
                if (FH) {
                    iy.gn(825566806623122255L, this);
                }
                return this.DW.v5(this.j6, "showactionbar");
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 825566806623122255L, this);
                }
                throw th;
            }
        }

        @ey(method = -258171195623278405L)
        public e VH() {
            try {
                if (FH) {
                    iy.gn(2480839748886490560L, this);
                }
                String strZo = this.DW.Zo(this.j6, AppMeasurement.Param.TYPE);
                return strZo != null ? e.valueOf(strZo) : e.Tabs;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 2480839748886490560L, this);
                }
                throw th;
            }
        }

        @ey(method = -3368141835098712991L)
        public boolean Ws() {
            try {
                if (FH) {
                    iy.gn(-3749934042892293552L, this);
                }
                return !Boolean.FALSE.equals(QX());
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -3749934042892293552L, this);
                }
                throw th;
            }
        }

        @ey(method = 4452788773733867725L)
        public boolean XL() {
            try {
                if (FH) {
                    iy.gn(-1842350009435335884L, this);
                }
                return Boolean.TRUE.equals(aM());
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1842350009435335884L, this);
                }
                throw th;
            }
        }

        @ey(method = -487891765606500651L)
        public String Zo() {
            try {
                if (FH) {
                    iy.gn(1001058009136545728L, this);
                }
                String strZo = this.DW.Zo(this.j6, "title");
                return strZo != null ? strZo : "MyApp";
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 1001058009136545728L, this);
                }
                throw th;
            }
        }

        @ey(method = 8035502276134863760L)
        public Boolean aM() {
            try {
                if (FH) {
                    iy.gn(-3574379288936874375L, this);
                }
                return this.DW.v5(this.j6, "fullscreen");
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -3574379288936874375L, this);
                }
                throw th;
            }
        }

        @ey(method = 2179286052302775637L)
        public void gn(e eVar) {
            try {
                if (FH) {
                    iy.tp(2806915491090483184L, this, eVar);
                }
                this.j6.setAttribute(AppMeasurement.Param.TYPE, eVar.name());
                we(Boolean.valueOf(eVar.v5()));
                if (eVar.FH() && Hw().size() < 2) {
                    DW();
                }
                this.DW.EQ(1);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 2806915491090483184L, this, eVar);
                }
                throw th;
            }
        }

        @ey(method = 3471919335874657616L)
        public boolean j3() {
            try {
                if (FH) {
                    iy.gn(-1714939279897329739L, this);
                }
                return !Boolean.FALSE.equals(Mr());
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1714939279897329739L, this);
                }
                throw th;
            }
        }

        @ey(method = 1114247367263179944L)
        public d j6() {
            try {
                if (FH) {
                    iy.gn(-3001312941186728155L, this);
                }
                d dVarDW = DW();
                this.DW.EQ(2);
                return dVarDW;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -3001312941186728155L, this);
                }
                throw th;
            }
        }

        @ey(method = 957458818271001240L)
        public void tp(Boolean bool) {
            try {
                if (FH) {
                    iy.tp(1773122701396174275L, this, bool);
                }
                this.DW.tp(this.j6, "fullscreen", bool);
                this.DW.EQ(1);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 1773122701396174275L, this, bool);
                }
                throw th;
            }
        }

        @ey(method = -4461545235210037128L)
        public void u7(Boolean bool) {
            try {
                if (FH) {
                    iy.tp(3508286572153299321L, this, bool);
                }
                this.DW.tp(this.j6, "showactionbar", bool);
                this.DW.EQ(2);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 3508286572153299321L, this, bool);
                }
                throw th;
            }
        }

        @ey(method = -489694094085839880L)
        public f v5() {
            try {
                if (FH) {
                    iy.gn(996944302804518255L, this);
                }
                String strZo = this.DW.Zo(this.j6, "theme");
                return strZo != null ? f.valueOf(strZo) : f.HoloLightDarkActionBar;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 996944302804518255L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -404897390490125028L, container = -404897390490125028L, user = true)
    public class d {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = 1639798589376002615L)
        private int DW;

        @dy(field = -1949131180311798096L)
        @hy
        final /* synthetic */ a FH;

        @dy(field = -151999950586864176L)
        private Element j6;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -1155423222778790692L)
        public d(a aVar, Element element, int i) {
            try {
                if (Hw) {
                    iy.we(1257111394116314000L, null, aVar, element, new Integer(i));
                }
                this.FH = aVar;
                this.j6 = element;
                this.DW = i;
            } catch (Throwable th) {
                if (v5) {
                    iy.U2(th, 1257111394116314000L, null, aVar, element, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -1650742353035785000L)
        public c DW() {
            try {
                if (Hw) {
                    iy.gn(-2474043622959430809L, this);
                }
                return this.FH.VH();
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -2474043622959430809L, this);
                }
                throw th;
            }
        }

        @ey(method = 2624709334814413288L)
        public int FH() {
            try {
                if (Hw) {
                    iy.gn(757410798985454627L, this);
                }
                return this.DW;
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, 757410798985454627L, this);
                }
                throw th;
            }
        }

        @ey(method = 1704484403291396167L)
        public String Hw() {
            try {
                if (Hw) {
                    iy.gn(-1714474251821067640L, this);
                }
                return this.FH.Zo(this.j6, "layout");
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -1714474251821067640L, this);
                }
                throw th;
            }
        }

        @ey(method = -1872577920889965961L)
        public void VH(String str) {
            try {
                if (Hw) {
                    iy.tp(-320441403928005360L, this, str);
                }
                this.j6.setAttribute("title", str);
                this.FH.EQ(2);
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, -320441403928005360L, this, str);
                }
                throw th;
            }
        }

        @ey(method = 6470646623215476023L)
        public void Zo(String str) {
            try {
                if (Hw) {
                    iy.tp(5104627437618689040L, this, str);
                }
                this.j6.setAttribute("layout", str);
                this.FH.EQ(0);
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 5104627437618689040L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -157412742700664520L)
        public void j6() {
            try {
                if (Hw) {
                    iy.gn(-1364085835274056275L, this);
                }
                this.j6.getParentNode().removeChild(this.j6);
                this.FH.EQ(2);
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -1364085835274056275L, this);
                }
                throw th;
            }
        }

        @ey(method = -2910602299506740787L)
        public String v5() {
            try {
                if (Hw) {
                    iy.gn(-116681196939594000L, this);
                }
                return this.FH.Zo(this.j6, "title");
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -116681196939594000L, this);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = -4604390756329882245L, container = -4604390756329882245L, user = true)
    public static final class e {

        @dy(field = -3000194630081855409L)
        public static final e Drawer;

        @dy(field = -2710311163904645240L)
        public static final e Single;

        @dy(field = -2576425704960031443L)
        public static final e Slider;

        @dy(field = 4355174516892396912L)
        public static final e SliderDrawer;

        @dy(field = 3140446006819792095L)
        public static final e Spinner;

        @dy(field = 5427248690152015060L)
        public static final e SpinnerDrawer;

        @dy(field = 875053928666295568L)
        public static final e Tabs;

        @dy(field = -1706108933016827189L)
        public static final e TabsDrawer;

        @fy
        private static /* synthetic */ boolean cT;

        @dy(field = -2214022465290384308L)
        private static final /* synthetic */ e[] hK;

        @gy
        private static /* synthetic */ boolean q7;

        @dy(field = 913260621678764477L)
        public String WB;

        static {
            try {
                iy.Zo(e.class);
                if (cT) {
                    iy.gn(2741704959502285972L, null);
                }
                Single = new e("Single", 0, "Single Section");
                Drawer = new e("Drawer", 1, "Single Section with Drawer");
                Slider = new e("Slider", 2, "Scrollable Tabs");
                SliderDrawer = new e("SliderDrawer", 3, "Scrollable Tabs with Drawer");
                Tabs = new e("Tabs", 4, "Fixed Tabs");
                TabsDrawer = new e("TabsDrawer", 5, "Fixed Tabs with Drawer");
                Spinner = new e("Spinner", 6, "Dropdown List");
                e eVar = new e("SpinnerDrawer", 7, "Dropdown List with Drawer");
                SpinnerDrawer = eVar;
                hK = new e[]{Single, Drawer, Slider, SliderDrawer, Tabs, TabsDrawer, Spinner, eVar};
            } catch (Throwable th) {
                if (q7) {
                    iy.aM(th, 2741704959502285972L, null);
                }
                throw th;
            }
        }

        @ey(method = 3280572883675172640L)
        private e(String str, int i, String str2) {
            try {
                if (cT) {
                    iy.we(2566226735923928805L, null, str, new Integer(i), str2);
                }
                this.WB = str2;
            } catch (Throwable th) {
                if (q7) {
                    iy.U2(th, 2566226735923928805L, null, str, new Integer(i), str2);
                }
                throw th;
            }
        }

        @ey(method = 1367787738963491388L)
        public static List<String> DW() {
            try {
                if (cT) {
                    iy.gn(-2784427341184626401L, null);
                }
                ArrayList arrayList = new ArrayList();
                for (e eVar : values()) {
                    arrayList.add(eVar.WB);
                }
                return arrayList;
            } catch (Throwable th) {
                if (q7) {
                    iy.aM(th, -2784427341184626401L, null);
                }
                throw th;
            }
        }

        @ey(method = 182343646985320757L)
        public static e j6(String str) {
            try {
                if (cT) {
                    iy.tp(182287153849865772L, null, str);
                }
                for (e eVar : values()) {
                    if (eVar.WB.equals(str)) {
                        return eVar;
                    }
                }
                return Single;
            } catch (Throwable th) {
                if (q7) {
                    iy.j3(th, 182287153849865772L, null, str);
                }
                throw th;
            }
        }

        @ey(method = -562674261003940677L)
        public static e valueOf(String str) {
            try {
                if (cT) {
                    iy.tp(-246496543910301960L, null, str);
                }
                return (e) Enum.valueOf(e.class, str);
            } catch (Throwable th) {
                if (q7) {
                    iy.j3(th, -246496543910301960L, null, str);
                }
                throw th;
            }
        }

        @ey(method = 2677110499416106201L)
        public static e[] values() {
            try {
                if (cT) {
                    iy.gn(1446932069865490288L, null);
                }
                return (e[]) hK.clone();
            } catch (Throwable th) {
                if (q7) {
                    iy.aM(th, 1446932069865490288L, null);
                }
                throw th;
            }
        }

        @ey(method = -754853412129308408L)
        public boolean FH() {
            try {
                if (cT) {
                    iy.gn(3078581091693428951L, this);
                }
                int i = C0040a.j6[ordinal()];
                return i == 1 || i == 2 || i == 3 || i == 4;
            } catch (Throwable th) {
                if (q7) {
                    iy.aM(th, 3078581091693428951L, this);
                }
                throw th;
            }
        }

        @ey(method = -7617771598624957840L)
        public boolean v5() {
            try {
                if (cT) {
                    iy.gn(7244829157542468951L, this);
                }
                int i = C0040a.j6[ordinal()];
                return (i == 2 || i == 5) ? false : true;
            } catch (Throwable th) {
                if (q7) {
                    iy.aM(th, 7244829157542468951L, this);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = 7488561427838058888L, container = 7488561427838058888L, user = true)
    public static final class f {

        @dy(field = 4364622546508204275L)
        public static final f DeviceDefault;

        @dy(field = 2581810165294116273L)
        public static final f DeviceDefaultLight;

        @dy(field = -1459848229085481124L)
        public static final f DeviceDefaultLightDarkActionBar;

        @dy(field = 1509490142896033440L)
        public static final f HoloDark;

        @dy(field = 1922745494133934924L)
        public static final f HoloLight;

        @dy(field = 5755528697234618547L)
        public static final f HoloLightDarkActionBar;

        @dy(field = 619470661628380287L)
        public static final f HoloLightHoloActionBar;

        @gy
        private static /* synthetic */ boolean cT;

        @fy
        private static /* synthetic */ boolean hK;

        @dy(field = 1772383043271603072L)
        private static final /* synthetic */ f[] w9;

        @dy(field = 1073875767933801573L)
        public String WB;

        static {
            try {
                iy.Zo(f.class);
                if (hK) {
                    iy.gn(1797550341084023828L, null);
                }
                HoloDark = new f("HoloDark", 0, "Holo Dark");
                HoloLight = new f("HoloLight", 1, "Holo Light");
                HoloLightHoloActionBar = new f("HoloLightHoloActionBar", 2, "Holo Light Holo ActionBar");
                HoloLightDarkActionBar = new f("HoloLightDarkActionBar", 3, "Holo Light Dark ActionBar");
                DeviceDefault = new f("DeviceDefault", 4, "Device Default Dark");
                DeviceDefaultLight = new f("DeviceDefaultLight", 5, "Device Default Light");
                f fVar = new f("DeviceDefaultLightDarkActionBar", 6, "Device Default Light Dark ActionBar");
                DeviceDefaultLightDarkActionBar = fVar;
                w9 = new f[]{HoloDark, HoloLight, HoloLightHoloActionBar, HoloLightDarkActionBar, DeviceDefault, DeviceDefaultLight, fVar};
            } catch (Throwable th) {
                if (cT) {
                    iy.aM(th, 1797550341084023828L, null);
                }
                throw th;
            }
        }

        @ey(method = 883853409448579608L)
        private f(String str, int i, String str2) {
            try {
                if (hK) {
                    iy.we(-76355220123665324L, null, str, new Integer(i), str2);
                }
                this.WB = str2;
            } catch (Throwable th) {
                if (cT) {
                    iy.U2(th, -76355220123665324L, null, str, new Integer(i), str2);
                }
                throw th;
            }
        }

        @ey(method = -1542551977384800192L)
        public static List<String> DW() {
            try {
                if (hK) {
                    iy.gn(4362824624622547055L, null);
                }
                ArrayList arrayList = new ArrayList();
                for (f fVar : values()) {
                    arrayList.add(fVar.WB);
                }
                return arrayList;
            } catch (Throwable th) {
                if (cT) {
                    iy.aM(th, 4362824624622547055L, null);
                }
                throw th;
            }
        }

        @ey(method = 649293848061306111L)
        public static f j6(String str) {
            try {
                if (hK) {
                    iy.tp(47391348789990060L, null, str);
                }
                for (f fVar : values()) {
                    if (fVar.WB.equals(str)) {
                        return fVar;
                    }
                }
                return HoloLightDarkActionBar;
            } catch (Throwable th) {
                if (cT) {
                    iy.j3(th, 47391348789990060L, null, str);
                }
                throw th;
            }
        }

        @ey(method = 109821644785358205L)
        public static f valueOf(String str) {
            try {
                if (hK) {
                    iy.tp(-296509002529399576L, null, str);
                }
                return (f) Enum.valueOf(f.class, str);
            } catch (Throwable th) {
                if (cT) {
                    iy.j3(th, -296509002529399576L, null, str);
                }
                throw th;
            }
        }

        @ey(method = -494187598408699125L)
        public static f[] values() {
            try {
                if (hK) {
                    iy.gn(-2796084798225889248L, null);
                }
                return (f[]) w9.clone();
            } catch (Throwable th) {
                if (cT) {
                    iy.aM(th, -2796084798225889248L, null);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(a.class);
    }

    @ey(method = -199617437452814336L)
    public a(AppWizardActivity appWizardActivity) {
        try {
            if (FH) {
                iy.tp(5483039264126565141L, null, appWizardActivity);
            }
            this.j6 = appWizardActivity;
            Document documentP8 = appWizardActivity.P8();
            this.DW = documentP8;
            if (documentP8 == null) {
                FH();
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 5483039264126565141L, null, appWizardActivity);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 8212348414248936L)
    public void EQ(int i) {
        try {
            if (FH) {
                iy.u7(7697171020155544944L, this, i);
            }
            if (this.j6.lg() != null) {
                this.j6.nw(this.DW, i);
                gn(i);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 7697171020155544944L, this, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1161102720058875125L)
    public String Zo(Element element, String str) {
        try {
            if (FH) {
                iy.EQ(-872204956856419509L, this, element, str);
            }
            String attribute = element.getAttribute(str);
            if (attribute == null) {
                return null;
            }
            if (attribute.length() > 0) {
                return attribute;
            }
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -872204956856419509L, this, element, str);
            }
            throw th;
        }
    }

    @ey(method = 3049021838972733273L)
    private void gn(int i) {
        try {
            if (FH) {
                iy.u7(-2841115541658087995L, this, i);
            }
            if (i == 1) {
                this.j6.recreate();
            } else {
                if (i != 2) {
                    return;
                }
                this.j6.ei();
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -2841115541658087995L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3923978078290762233L)
    public void FH() {
        try {
            if (FH) {
                iy.gn(-184845895394263135L, this);
            }
            try {
                Document documentNewDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
                this.DW = documentNewDocument;
                documentNewDocument.appendChild(documentNewDocument.createElement("app"));
                EQ(1);
            } catch (ParserConfigurationException unused) {
            }
            c cVarJ6 = Hw().j6();
            cVarJ6.j6();
            cVarJ6.j6();
            cVarJ6.j6();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -184845895394263135L, this);
            }
            throw th;
        }
    }

    @ey(method = 2220078923454950893L)
    public b Hw() {
        try {
            if (FH) {
                iy.gn(2124900456956236625L, this);
            }
            return new b(this, (Element) this.DW.getElementsByTagName("app").item(0));
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 2124900456956236625L, this);
            }
            throw th;
        }
    }

    @ey(method = -160152733509462200L)
    public c VH() {
        try {
            if (FH) {
                iy.gn(-633402251954826200L, this);
            }
            return Hw().DW();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -633402251954826200L, this);
            }
            throw th;
        }
    }

    @ey(method = -86909940712893504L)
    public void tp(Element element, String str, Boolean bool) {
        try {
            if (FH) {
                iy.we(4164126699753548076L, this, element, str, bool);
            }
            if (bool == null) {
                element.setAttribute(str, null);
            } else {
                element.setAttribute(str, Boolean.toString(bool.booleanValue()));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 4164126699753548076L, this, element, str, bool);
            }
            throw th;
        }
    }

    @ey(method = 4893919988220143925L)
    public void u7(Document document, int i) {
        try {
            if (FH) {
                iy.EQ(-2445587626810945995L, this, document, new Integer(i));
            }
            this.DW = document;
            gn(i);
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -2445587626810945995L, this, document, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -108713519527539927L)
    public Boolean v5(Element element, String str) {
        try {
            if (FH) {
                iy.EQ(414009716376104337L, this, element, str);
            }
            String strZo = Zo(element, str);
            if (strZo == null) {
                return null;
            }
            return Boolean.valueOf("true".equals(strZo));
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 414009716376104337L, this, element, str);
            }
            throw th;
        }
    }
}
