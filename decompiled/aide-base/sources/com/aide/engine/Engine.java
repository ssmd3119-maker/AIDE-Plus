package com.aide.engine;

import abcd.cy;
import abcd.d4;
import abcd.dy;
import abcd.e4;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import abcd.l1;
import abcd.q2;
import abcd.x2;
import abcd.y2;
import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.BomReaderFactory;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeStyles;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.Variable;
import com.aide.codemodel.api.abstraction.CodeModel;
import com.aide.codemodel.api.abstraction.FormatOption;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.abstraction.Syntax;
import com.aide.codemodel.api.callback.APISearcherCallback;
import com.aide.codemodel.api.callback.CodeCompleterCallback;
import com.aide.codemodel.api.callback.CodeMetricsCallback;
import com.aide.codemodel.api.callback.DebugMetadataCallback;
import com.aide.codemodel.api.callback.OpenFileCallback;
import com.aide.codemodel.api.callback.RefactoringCallback;
import com.aide.codemodel.api.callback.StopCallback;
import com.aide.codemodel.api.callback.StructureCallback;
import com.aide.codemodel.api.callback.SymbolSearcherCallback;
import com.aide.codemodel.api.callback.TemplateEvaluatorCallback;
import com.aide.codemodel.api.callback.UsageSearcherCallback;
import com.aide.codemodel.api.collections.FunctionOfIntLong;
import com.aide.codemodel.api.collections.HashtableOfInt;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.common.AppLog;
import com.aide.engine.FindResult;
import com.aide.ui.tools.ThreadFactory;
import com.aide.uidesigner.ProxyTextView;
import java.io.CharArrayReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

@cy(clazz = 5570126736506189045L, container = 5570126736506189045L, user = true)
/* loaded from: classes.dex */
public class Engine {

    @fy
    private static /* synthetic */ boolean fh;

    @dy(field = -323571979516157248L)
    private static final boolean iK;

    @gy
    private static /* synthetic */ boolean sv;

    @dy(field = -1400125023956206263L)
    private int AE;

    @dy(field = -3944399722672098256L)
    private String AL;

    @dy(field = 5256763317037746041L)
    private List<v> AR;

    @dy(field = 6447913673061241488L)
    private int Ak;

    @dy(field = -1125292304987338488L)
    private int An;

    @dy(field = -4571415351208300855L)
    private int BR;

    @dy(field = 779195356285683381L)
    private Hashtable<String, String> Bx;

    @dy(field = -904937286838710363L)
    private int CU;

    @dy(field = -6656763990409013187L)
    private List<String> Cz;

    @dy(field = 4954864901516818560L)
    private b0 DW;

    @dy(field = -2522102119081759008L)
    private List<List<w>> E4;

    @dy(field = -965850780044952329L)
    private j EQ;

    @dy(field = 1636700463300898431L)
    private String[] Ej;

    @dy(field = -3258767748284223264L)
    private boolean Eq;

    @dy(field = 2005924384875387235L)
    private String Ev;

    @dy(field = 5197938537597483680L)
    private com.aide.engine.c FH;

    @dy(field = 7019025106279797936L)
    private boolean FN;

    @dy(field = -957239248435700587L)
    private List<v> Fd;

    @dy(field = -4567262673268517155L)
    private v GK;

    @dy(field = -355159391441729757L)
    private int GT;

    @dy(field = 1093884550988666936L)
    private int Gj;

    @dy(field = -758144656694208000L)
    private String Hl;

    @dy(field = -4832554689649110400L)
    private com.aide.engine.d Hw;

    @dy(field = 1799183737637349237L)
    private boolean I;

    @dy(field = 892475337313547317L)
    private int IS;

    @dy(field = -2689340970852617452L)
    private String J0;

    @dy(field = -2150255284122103823L)
    private long J8;

    @dy(field = 3480849538487100989L)
    private int Jl;

    @dy(field = 4340402237435048424L)
    private String Jm;

    @dy(field = 958113479436063544L)
    private boolean KD;

    @dy(field = 240396220881931400L)
    private List<v> Lz;

    @dy(field = -2112396781063683477L)
    private Stack<String> MP;

    @dy(field = 1098841442740719600L)
    private boolean Mr;

    @dy(field = -1453394814022156200L)
    private boolean Mz;

    @dy(field = -2635477890776157465L)
    private List<SourceEntity> N0;

    @dy(field = 3999864708162980920L)
    private String Nh;

    @dy(field = 6423261817255662544L)
    private boolean OW;

    @dy(field = 2264684540197113580L)
    private int Od;

    @dy(field = 2865960996465386720L)
    private Stack<String> Of;

    @dy(field = -1875354973850331504L)
    private boolean P8;

    @dy(field = -5266233138286614183L)
    private k PH;

    @dy(field = 842460376074456880L)
    private Stack<Integer> PT;

    @dy(field = -5209595852869631475L)
    private x Pa;

    @dy(field = -2297669055868334204L)
    private int Q6;

    @dy(field = -6960752139324707829L)
    private int QO;

    @dy(field = -3178667571357830960L)
    private boolean Qq;

    @dy(field = 807055141753609504L)
    private boolean SI;

    @dy(field = 5747442930796349376L)
    private boolean Sf;

    @dy(field = 1980480902079029360L)
    private boolean[] T6;

    @dy(field = 6885036377790720960L)
    private List<k> TI;

    @dy(field = 2462847222710357400L)
    private boolean U2;

    @dy(field = 3334421532892881868L)
    private com.aide.engine.a VH;

    @dy(field = -5451430639119019312L)
    private String WB;

    @dy(field = 4672689908532827328L)
    private boolean XG;

    @dy(field = -2031277399337898345L)
    private boolean XX;

    @dy(field = -3458021715560882691L)
    private int Xa;

    @dy(field = 1202566087838692215L)
    private int Yi;

    @dy(field = -4885784794877833593L)
    private String Z1;

    @dy(field = -2664658038669387600L)
    private int Za;

    @dy(field = 192447808445863305L)
    private y Zo;

    @dy(field = -6015100952197382220L)
    private int a5;

    @dy(field = -3182109418895196921L)
    private boolean a8;

    @dy(field = -1457253914372234368L)
    private String aX;

    @dy(field = 1236307815800170280L)
    private boolean aj;

    @dy(field = 2241000141663611328L)
    private boolean aq;

    @dy(field = 448814939223561067L)
    private int b;

    @dy(field = 1932523389389504612L)
    private Stack<Reader> b1;

    @dy(field = 5382768480474230717L)
    private int ba;

    @dy(field = -1249044529897869600L)
    private boolean br;

    @dy(field = -3836304623530208517L)
    private int cT;

    @dy(field = -1910379840101528600L)
    private boolean ca;

    @dy(field = 2657910800354798576L)
    private boolean cb;

    @dy(field = 3764637087809787520L)
    private int cc;

    @dy(field = -176893843022048375L)
    private String[] ce;

    @dy(field = 1649398680846874409L)
    private boolean cn;

    @dy(field = 1720530464087178672L)
    private ICodeModelsFactory codeModelsFactory;

    @dy(field = -5150828549946603855L)
    private HashMap<String, List<Object>> ct;

    @dy(field = 5880219039176598000L)
    private List<String> d8;

    @dy(field = 8519583851170145712L)
    private String dW;

    @dy(field = 1750156237633634848L)
    private boolean dx;

    @dy(field = -6263172878354803336L)
    private int e3;

    @dy(field = -2770770453037684864L)
    private String e9;

    @dy(field = 584045096442216696L)
    private Map<String, String> eN;

    @dy(field = -2316270338751639816L)
    private int eU;

    @dy(field = -1197786583347305064L)
    private boolean ef;

    @dy(field = -1944508159906965856L)
    private boolean ei;

    @dy(field = 1591520362010331201L)
    private EngineSolution engineSolution;

    @dy(field = -2553085428690699405L)
    private boolean er;

    @dy(field = 4680785664807415527L)
    private int et;

    @dy(field = 3010075303515941515L)
    private SyntaxError fN;

    @dy(field = 25170327262887645L)
    private int fP;

    @dy(field = -4816590385672645760L)
    private b fY;

    @dy(field = 2226192502881077907L)
    private boolean g3;

    @dy(field = 4623492513349810512L)
    private String gG;

    @dy(field = -4553037800968458495L)
    private boolean gW;

    @dy(field = -4022819673478984512L)
    private e0 gn;

    @dy(field = -4925127639646869873L)
    private int hK;

    @dy(field = -660462211075837360L)
    private k hp;

    @dy(field = 1975037215241954268L)
    private boolean hz;

    @dy(field = -2599251355810846747L)
    private int iW;

    @dy(field = -4985700136599874785L)
    private Hashtable<String, z> j3;

    @dy(field = 2752675108064845392L)
    private UsageSearcherListener j6;

    @dy(field = -5305360582312846776L)
    private String jJ;

    @dy(field = 2610195489788322672L)
    private boolean jO;

    @dy(field = -57862772822960271L)
    private int jw;

    @dy(field = -5758754911526368980L)
    private int k2;

    @dy(field = -4631112977387596539L)
    private boolean kQ;

    @dy(field = -1866763836640064120L)
    private String kf;

    @dy(field = -5073923666099131515L)
    private boolean ko;

    @dy(field = 1154432699062298409L)
    private int lg;

    @dy(field = 1727121847574393115L)
    private Object lock1;

    @dy(field = -4467714427242199785L)
    private Object lock2;

    @dy(field = 5600631862553112960L)
    private Object lock3;

    @dy(field = -33445656881464959L)
    private boolean lp;

    @dy(field = -3866663369035188983L)
    private int mb;

    @dy(field = -3487494092384474128L)
    private int n5;

    @dy(field = -3419869804582512464L)
    private int nl;

    @dy(field = -3189604424085505420L)
    private boolean nw;

    @dy(field = -196691760107952903L)
    private boolean oY;

    @dy(field = 1851204181116132864L)
    private SourceEntity oa;

    @dy(field = -4317907075396679135L)
    private l1 oh;

    @dy(field = -4257097478360964949L)
    private String om;

    @dy(field = -6792112390382893680L)
    private String oy;

    @dy(field = -3345467061807204464L)
    private d pN;

    @dy(field = -1941733659204124436L)
    private String pO;

    @dy(field = -4639416566490345541L)
    private Stack<l> pl;

    @dy(field = 1188018312882839397L)
    private SourceEntity q7;

    @dy(field = 7043019246555653697L)
    private List<Modification> qP;

    @dy(field = -4464227382103543264L)
    private b qp;

    @dy(field = -2388320983072095500L)
    private boolean rN;

    @dy(field = 1870075294845145401L)
    private boolean ro;

    @dy(field = -2569620075090430441L)
    private int sE;

    @dy(field = 4766425812028866105L)
    private boolean sG;

    @dy(field = -5773546240379648625L)
    private int sM;

    @dy(field = -139043119099252544L)
    private List<k> sT;

    @dy(field = 1751992849845595203L)
    private int sg;

    @dy(field = -4354209503444512732L)
    private boolean sh;

    @dy(field = 1857434546976218275L)
    private boolean shutdown;

    @dy(field = -1946277229093373272L)
    private boolean sy;

    @dy(field = 5094834519551145300L)
    private boolean ti;

    @dy(field = -3700080924480648000L)
    private i tp;

    @dy(field = -4214513052146186160L)
    private g u7;

    @dy(field = -2986354911197452795L)
    private int u9;

    @dy(field = 1689917094840854949L)
    private d0 v5;

    @dy(field = -1723098471791065635L)
    private boolean vJ;

    @dy(field = 1022319116800448388L)
    private boolean vy;

    @dy(field = -6094942299820806068L)
    private String w9;

    @dy(field = -7775374545862047885L)
    private String wE;

    @dy(field = 750569063319337691L)
    private String wc;

    @dy(field = -1269703599479239752L)
    private boolean we;

    @dy(field = -900904342605600377L)
    private boolean x9;

    @dy(field = 4937003759268247720L)
    private v xg;

    @dy(field = -3661000242455585095L)
    private boolean yO;

    @dy(field = 171634490298288796L)
    private boolean yS;

    @dy(field = 334158636010510920L)
    private boolean ye;

    @dy(field = -3071600659811750256L)
    private int ys;

    @dy(field = 3787281864992899847L)
    private String zf;

    @dy(field = 1819457445843253940L)
    private int zh;

    @cy(clazz = 41810092155919680L, container = 5570126736506189045L, user = true)
    static /* synthetic */ class a {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -4449306025306910205L)
        static final /* synthetic */ int[] j6;

        static {
            try {
                iy.Zo(a.class);
                if (DW) {
                    iy.gn(-1931527392302520100L, null);
                }
                int[] iArr = new int[d.values().length];
                j6 = iArr;
                try {
                    iArr[d.AUTOFORMAT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    j6[d.AUTOINDENTAFTERPASTE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    j6[d.LEARN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    j6[d.INDENT_AFTER_ENTER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    j6[d.INDENT_AFTER_TYPING.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    j6[d.OUTCOMMENT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    j6[d.AUTOFORMAT_ASYNC.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    j6[d.UNOUTCOMMENT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -1931527392302520100L, null);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = -3530911425580111167L, container = -3530911425580111167L, user = true)
    private static final class b {

        @dy(field = -2831201320600220635L)
        public static final b EXPRESSION_MEMBERS;

        @dy(field = 2409998700780978803L)
        public static final b FULL_TYPE;

        @dy(field = 2104633886245948512L)
        public static final b MEMBERS;

        @dy(field = -1448028806469067557L)
        public static final b PARAMETERS;

        @dy(field = -823673175881554935L)
        public static final b PARAMETERS_AFTER_CHAREVENT;

        @dy(field = 7192143735731856825L)
        public static final b PARAMETERS_AFTER_EVENT;

        @dy(field = -1771949726136811551L)
        public static final b SUPER_METHODS;

        @dy(field = -79342066220957125L)
        public static final b UPDATE_EXPRESSION_MEMBERS_AFTER_CHAREVENT;

        @dy(field = 2592460786240061295L)
        public static final b UPDATE_EXPRESSION_MEMBERS_AFTER_EVENT;

        @dy(field = -75643154318539008L)
        public static final b UPDATE_MEMBERS_AFTER_CHAREVENT;

        @dy(field = 865048995813229624L)
        public static final b UPDATE_MEMBERS_AFTER_EVENT;

        @fy
        private static /* synthetic */ boolean Z1;

        @gy
        private static /* synthetic */ boolean n5;

        @dy(field = 636115577806708727L)
        private static final /* synthetic */ b[] q7;

        static {
            try {
                iy.Zo(b.class);
                if (Z1) {
                    iy.gn(-3058807210657716928L, null);
                }
                MEMBERS = new b("MEMBERS", 0);
                UPDATE_MEMBERS_AFTER_EVENT = new b("UPDATE_MEMBERS_AFTER_EVENT", 1);
                UPDATE_MEMBERS_AFTER_CHAREVENT = new b("UPDATE_MEMBERS_AFTER_CHAREVENT", 2);
                PARAMETERS = new b("PARAMETERS", 3);
                PARAMETERS_AFTER_EVENT = new b("PARAMETERS_AFTER_EVENT", 4);
                PARAMETERS_AFTER_CHAREVENT = new b("PARAMETERS_AFTER_CHAREVENT", 5);
                EXPRESSION_MEMBERS = new b("EXPRESSION_MEMBERS", 6);
                UPDATE_EXPRESSION_MEMBERS_AFTER_EVENT = new b("UPDATE_EXPRESSION_MEMBERS_AFTER_EVENT", 7);
                UPDATE_EXPRESSION_MEMBERS_AFTER_CHAREVENT = new b("UPDATE_EXPRESSION_MEMBERS_AFTER_CHAREVENT", 8);
                FULL_TYPE = new b("FULL_TYPE", 9);
                b bVar = new b("SUPER_METHODS", 10);
                SUPER_METHODS = bVar;
                q7 = new b[]{MEMBERS, UPDATE_MEMBERS_AFTER_EVENT, UPDATE_MEMBERS_AFTER_CHAREVENT, PARAMETERS, PARAMETERS_AFTER_EVENT, PARAMETERS_AFTER_CHAREVENT, EXPRESSION_MEMBERS, UPDATE_EXPRESSION_MEMBERS_AFTER_EVENT, UPDATE_EXPRESSION_MEMBERS_AFTER_CHAREVENT, FULL_TYPE, bVar};
            } catch (Throwable th) {
                if (n5) {
                    iy.aM(th, -3058807210657716928L, null);
                }
                throw th;
            }
        }

        @ey(method = 201071475716377989L)
        private b(String str, int i) {
            try {
                if (Z1) {
                    iy.EQ(-2778988121126635647L, null, str, new Integer(i));
                }
            } catch (Throwable th) {
                if (n5) {
                    iy.Mr(th, -2778988121126635647L, null, str, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -1120843742508869180L)
        public static b valueOf(String str) {
            try {
                if (Z1) {
                    iy.tp(449594192812041840L, null, str);
                }
                return (b) Enum.valueOf(b.class, str);
            } catch (Throwable th) {
                if (n5) {
                    iy.j3(th, 449594192812041840L, null, str);
                }
                throw th;
            }
        }

        @ey(method = 13707779215697520L)
        public static b[] values() {
            try {
                if (Z1) {
                    iy.gn(-1458931129044427220L, null);
                }
                return (b[]) q7.clone();
            } catch (Throwable th) {
                if (n5) {
                    iy.aM(th, -1458931129044427220L, null);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1000874962104681600L, container = -1000874962104681600L, user = true)
    private class c implements Runnable {

        @gy
        private static /* synthetic */ boolean aX;

        @fy
        private static /* synthetic */ boolean oy;

        @dy(field = 1296822755941424992L)
        private b AL;

        @dy(field = -420722644411758597L)
        private boolean Cz;

        @dy(field = -4304026682322591492L)
        private FunctionOfIntLong Gj;

        @dy(field = 1802816619838198000L)
        private g Jl;

        @dy(field = 690691094322915507L)
        private n Q6;

        @dy(field = -1368944388857780415L)
        private EngineSolution WB;

        @dy(field = -5555727340898912688L)
        private d Z1;

        @dy(field = 5079876138240315657L)
        private C0048c cT;

        @dy(field = -75522828465855475L)
        private boolean e3;

        @dy(field = -1285274841581953532L)
        private boolean eU;

        @dy(field = -2688353602257278928L)
        @hy
        final /* synthetic */ Engine engine;

        @dy(field = 2228429633179180396L)
        private SetOfFileEntry fN;

        @dy(field = 3750045515915788485L)
        private j fY;

        @dy(field = 1302422399770679L)
        private p hK;

        @dy(field = -825083407619939853L)
        private m iW;

        @dy(field = -5824596956010008355L)
        private h jw;

        @dy(field = -5963071131672382728L)
        private HighlighterCallback k2;

        @dy(field = -4227240332530944680L)
        private f kf;

        @dy(field = -2037544757866060485L)
        private AIDEModel mb;

        @dy(field = 533015356199878487L)
        private o n5;

        @dy(field = 4577939307264111192L)
        private SetOfFileEntry pO;

        @dy(field = -5926359579697615584L)
        private a q7;

        @dy(field = 4927799132093853880L)
        private k qp;

        @dy(field = 570518986553001480L)
        private int sE;

        @dy(field = -1009381668359869440L)
        private SetOfFileEntry sg;

        @dy(field = 5540499458098598133L)
        private i w9;

        @dy(field = 2974676401978426275L)
        private l zh;

        @cy(clazz = 2405701540722987188L, container = 2405701540722987188L, user = true)
        private class a implements APISearcherCallback {

            @fy
            private static /* synthetic */ boolean FH;

            @gy
            private static /* synthetic */ boolean Hw;

            @dy(field = -856740526800231185L)
            final /* synthetic */ c DW;

            @dy(field = 3033779257434448565L)
            private ArrayList<SourceEntity> j6;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -46193767913134296L)
            private a(c cVar) {
                try {
                    if (FH) {
                        iy.tp(-1066891688946939375L, null, cVar);
                    }
                    this.DW = cVar;
                } catch (Throwable th) {
                    if (Hw) {
                        iy.j3(th, -1066891688946939375L, null, cVar);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.APISearcherCallback
            @ey(method = -2380112415170977633L)
            public void DW(Entity entity) {
                try {
                    if (FH) {
                        iy.tp(-2374741171269245240L, this, entity);
                    }
                    SourceEntity sourceEntity = new SourceEntity(this.DW.mb, entity);
                    sourceEntity.j6(this.DW.mb);
                    this.j6.add(sourceEntity);
                } catch (Throwable th) {
                    if (Hw) {
                        iy.j3(th, -2374741171269245240L, this, entity);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.APISearcherCallback
            @ey(method = -583586799230599248L)
            public void FH(String str) {
                try {
                    if (FH) {
                        iy.tp(-1527958535409785955L, this, str);
                    }
                    if (this.DW.engine.v5 != null) {
                        this.DW.engine.v5.pl(str);
                    }
                } catch (Throwable th) {
                    if (Hw) {
                        iy.j3(th, -1527958535409785955L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.APISearcherCallback
            @ey(method = 1526932803821183144L)
            public void Hw() {
                try {
                    if (FH) {
                        iy.gn(980826804257730465L, this);
                    }
                    if (this.DW.engine.v5 != null) {
                        this.DW.engine.v5.Ej(this.j6);
                    }
                    this.j6 = null;
                } catch (Throwable th) {
                    if (Hw) {
                        iy.aM(th, 980826804257730465L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.APISearcherCallback
            @ey(method = 312146975043212800L)
            public void j6() {
                try {
                    if (FH) {
                        iy.gn(-3762105489179789535L, this);
                    }
                    this.j6 = new ArrayList<>();
                    if (this.DW.engine.v5 != null) {
                        this.DW.engine.v5.pl("");
                    }
                } catch (Throwable th) {
                    if (Hw) {
                        iy.aM(th, -3762105489179789535L, this);
                    }
                    throw th;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = -7722959247193167825L)
            /* synthetic */ a(c cVar, a aVar) {
                this(cVar);
                try {
                    if (FH) {
                        iy.EQ(6391013326848606488L, null, cVar, aVar);
                    }
                } catch (Throwable th) {
                    if (Hw) {
                        iy.Mr(th, 6391013326848606488L, null, cVar, aVar);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 146584725529417780L, container = 146584725529417780L, user = true)
        /* renamed from: com.aide.engine.Engine$c$c, reason: collision with other inner class name */
        private class C0048c implements CodeMetricsCallback {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            @dy(field = 1922849274818504880L)
            final /* synthetic */ c j6;

            static {
                iy.Zo(C0048c.class);
            }

            @ey(method = 153703597262803245L)
            private C0048c(c cVar) {
                try {
                    if (DW) {
                        iy.tp(-1283811485438869812L, null, cVar);
                    }
                    this.j6 = cVar;
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -1283811485438869812L, null, cVar);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeMetricsCallback
            @ey(method = 1391020043627735388L)
            public void DW() {
                try {
                    if (DW) {
                        iy.gn(-2942171326473870333L, this);
                    }
                    this.j6.engine.Zo.DW();
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, -2942171326473870333L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeMetricsCallback
            @ey(method = 5513241486188998035L)
            public void FH(FileEntry fileEntry, long j, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
                int i7;
                try {
                    if (DW) {
                        iy.QX(-2154932580437148840L, this, new Object[]{fileEntry, new Long(j), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
                    }
                    i7 = 8;
                    try {
                        this.j6.engine.Zo.Hw(fileEntry.getPathString(), j, i, i2, i3, i4, i5, i6);
                    } catch (Throwable th) {
                        th = th;
                        if (FH) {
                            Object[] objArr = new Object[i7];
                            objArr[0] = fileEntry;
                            objArr[1] = new Long(j);
                            objArr[2] = new Integer(i);
                            objArr[3] = new Integer(i2);
                            objArr[4] = new Integer(i3);
                            objArr[5] = new Integer(i4);
                            objArr[6] = new Integer(i5);
                            objArr[7] = new Integer(i6);
                            iy.rN(th, -2154932580437148840L, this, objArr);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i7 = 8;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeMetricsCallback
            @ey(method = 133314375149785464L)
            public void Hw(FileEntry fileEntry, long j, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
                int i7;
                try {
                    if (DW) {
                        iy.QX(-3757739163402500011L, this, new Object[]{fileEntry, new Long(j), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
                    }
                    i7 = 8;
                    try {
                        this.j6.engine.Zo.FH(fileEntry.getPathString(), j, i, i2, i3, i4, i5, i6);
                    } catch (Throwable th) {
                        th = th;
                        if (FH) {
                            Object[] objArr = new Object[i7];
                            objArr[0] = fileEntry;
                            objArr[1] = new Long(j);
                            objArr[2] = new Integer(i);
                            objArr[3] = new Integer(i2);
                            objArr[4] = new Integer(i3);
                            objArr[5] = new Integer(i4);
                            objArr[6] = new Integer(i5);
                            objArr[7] = new Integer(i6);
                            iy.rN(th, -3757739163402500011L, this, objArr);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i7 = 8;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeMetricsCallback
            @ey(method = -658471817100451887L)
            public void j6(long j, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
                int i7;
                try {
                    if (DW) {
                        iy.QX(6382120914324823980L, this, new Object[]{new Long(j), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
                    }
                    i7 = 7;
                    try {
                        this.j6.engine.Zo.j6(j, i, i2, i3, i4, i5, i6);
                    } catch (Throwable th) {
                        th = th;
                        if (FH) {
                            Object[] objArr = new Object[i7];
                            objArr[0] = new Long(j);
                            objArr[1] = new Integer(i);
                            objArr[2] = new Integer(i2);
                            objArr[3] = new Integer(i3);
                            objArr[4] = new Integer(i4);
                            objArr[5] = new Integer(i5);
                            objArr[6] = new Integer(i6);
                            iy.rN(th, 6382120914324823980L, this, objArr);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i7 = 7;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = -82760321079177456L)
            /* synthetic */ C0048c(c cVar, a aVar) {
                this(cVar);
                try {
                    if (DW) {
                        iy.EQ(-2882658236983564011L, null, cVar, aVar);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, -2882658236983564011L, null, cVar, aVar);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -873911202693743019L, container = -873911202693743019L, user = true)
        private class d implements DebugMetadataCallback {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            @dy(field = 2138980754222811593L)
            final /* synthetic */ c j6;

            static {
                iy.Zo(d.class);
            }

            @ey(method = 170500947763464720L)
            private d(c cVar) {
                try {
                    if (DW) {
                        iy.tp(3259396928877974572L, null, cVar);
                    }
                    this.j6 = cVar;
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 3259396928877974572L, null, cVar);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.DebugMetadataCallback
            @ey(method = -2717354592688669764L)
            public void DW(boolean z, boolean z2, String str, String str2) {
                try {
                    if (DW) {
                        iy.J0(-2748514767390758121L, this, new Boolean(z), new Boolean(z2), str, str2);
                    }
                    this.j6.engine.pl.push(new q(z, z2, str, str2, (com.aide.engine.l) this.j6.engine.pl.pop()));
                } catch (Throwable th) {
                    if (FH) {
                        iy.a8(th, -2748514767390758121L, this, new Boolean(z), new Boolean(z2), str, str2);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.DebugMetadataCallback
            @ey(method = -1132330172462980575L)
            public void FH(Object obj) {
                try {
                    if (DW) {
                        iy.tp(-481151499669662416L, this, obj);
                    }
                    this.j6.engine.pl.push(new com.aide.engine.p(obj));
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -481151499669662416L, this, obj);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.DebugMetadataCallback
            @ey(method = 312371922075277029L)
            public void Hw() {
                try {
                    if (DW) {
                        iy.gn(300974573090959200L, this);
                    }
                    com.aide.engine.l lVar = (com.aide.engine.l) this.j6.engine.pl.pop();
                    this.j6.engine.pl.push(new com.aide.engine.m((com.aide.engine.l) this.j6.engine.pl.pop(), lVar));
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, 300974573090959200L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.DebugMetadataCallback
            @ey(method = 4607459989091722083L)
            public void VH(boolean z, String str, String str2, String str3, int i) {
                try {
                    if (DW) {
                        iy.J8(-1305427324748215048L, this, new Boolean(z), str, str2, str3, new Integer(i));
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList.add(0, this.j6.engine.pl.pop());
                    }
                    this.j6.engine.pl.push(new r(z, str, str2, str3, arrayList, (com.aide.engine.l) this.j6.engine.pl.pop()));
                } catch (Throwable th) {
                    if (FH) {
                        iy.lg(th, -1305427324748215048L, this, new Boolean(z), str, str2, str3, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.DebugMetadataCallback
            @ey(method = 2816363990571817424L)
            public void Zo(Class cls, Class cls2) {
                try {
                    if (DW) {
                        iy.EQ(2254243092473670441L, this, cls, cls2);
                    }
                    this.j6.engine.pl.push(new s((com.aide.engine.l) this.j6.engine.pl.pop(), cls, cls2));
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, 2254243092473670441L, this, cls, cls2);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.DebugMetadataCallback
            @ey(method = 6847514688275096199L)
            public void gn(String str) {
                try {
                    if (DW) {
                        iy.tp(-1043017504760784740L, this, str);
                    }
                    this.j6.engine.pl.push(new t((com.aide.engine.l) this.j6.engine.pl.pop(), str));
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -1043017504760784740L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.DebugMetadataCallback
            @ey(method = -3328571959651311384L)
            public void j6(String str) {
                try {
                    if (DW) {
                        iy.tp(2849942666736043011L, this, str);
                    }
                    this.j6.engine.pl.push(new u(str));
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 2849942666736043011L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.DebugMetadataCallback
            @ey(method = -1149511427569262025L)
            public void u7() {
                try {
                    if (DW) {
                        iy.gn(-142930316909449216L, this);
                    }
                    this.j6.engine.pl.push(new com.aide.engine.n((com.aide.engine.l) this.j6.engine.pl.pop()));
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, -142930316909449216L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.DebugMetadataCallback
            @ey(method = 232681357690240041L)
            public void v5(String str) {
                try {
                    if (DW) {
                        iy.tp(5201106316889663952L, this, str);
                    }
                    com.aide.engine.l lVar = (com.aide.engine.l) this.j6.engine.pl.pop();
                    this.j6.engine.pl.push(new com.aide.engine.o((com.aide.engine.l) this.j6.engine.pl.pop(), lVar, str));
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 5201106316889663952L, this, str);
                    }
                    throw th;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = 327173463423479277L)
            /* synthetic */ d(c cVar, a aVar) {
                this(cVar);
                try {
                    if (DW) {
                        iy.EQ(445872770094662045L, null, cVar, aVar);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, 445872770094662045L, null, cVar, aVar);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -1407756988511425944L, container = -1407756988511425944L, user = true)
        private class f implements q2 {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            @dy(field = -624779433511002048L)
            final /* synthetic */ c j6;

            static {
                iy.Zo(f.class);
            }

            @ey(method = -136425551400042689L)
            private f(c cVar) {
                try {
                    if (DW) {
                        iy.tp(1523751140974820800L, null, cVar);
                    }
                    this.j6 = cVar;
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 1523751140974820800L, null, cVar);
                    }
                    throw th;
                }
            }

            @Override // abcd.q2
            @ey(method = 283621755025848855L)
            public void j6(FileEntry fileEntry, String str) {
                try {
                    if (DW) {
                        iy.EQ(4384740037264631944L, this, fileEntry, str);
                    }
                    if (this.j6.engine.tp != null) {
                        this.j6.engine.tp.j6(fileEntry.getPathString(), str);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, 4384740037264631944L, this, fileEntry, str);
                    }
                    throw th;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = 577037645034507072L)
            /* synthetic */ f(c cVar, a aVar) {
                this(cVar);
                try {
                    if (DW) {
                        iy.EQ(397867781815245841L, null, cVar, aVar);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, 397867781815245841L, null, cVar, aVar);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1641652758547993860L, container = 1641652758547993860L, user = true)
        private class g implements BomReaderFactory {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            @dy(field = -3142829447970705036L)
            final /* synthetic */ c j6;

            static {
                iy.Zo(g.class);
            }

            @ey(method = 538523617151490545L)
            private g(c cVar) {
                try {
                    if (DW) {
                        iy.tp(-2158015333203702661L, null, cVar);
                    }
                    this.j6 = cVar;
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -2158015333203702661L, null, cVar);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.BomReaderFactory
            @ey(method = -3769373116794252708L)
            public Reader createBomReader(InputStream inputStream, String str) {
                try {
                    if (DW) {
                        iy.EQ(6755883663963460320L, this, inputStream, str);
                    }
                    if (this.j6.engine.EQ != null) {
                        return this.j6.engine.EQ.j6(inputStream, str);
                    }
                    PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 4);
                    byte[] bArr = new byte[4];
                    int i = 0;
                    while (i < 4) {
                        int i2 = pushbackInputStream.read(bArr, i, 4 - i);
                        if (i2 == -1) {
                            break;
                        }
                        i += i2;
                    }
                    String str2 = null;
                    if (i == 4) {
                        if ((bArr[0] & 255) == 0 && (bArr[1] & 255) == 0 && (bArr[2] & 255) == 254 && (bArr[3] & 255) == 255) {
                            str2 = "UTF-32BE";
                        } else if ((bArr[0] & 255) == 255 && (bArr[1] & 255) == 254 && (bArr[2] & 255) == 0 && (bArr[3] & 255) == 0) {
                            str2 = "UTF-32LE";
                        }
                    }
                    if (str2 == null && i >= 3 && (bArr[0] & 255) == 239 && (bArr[1] & 255) == 187 && (bArr[2] & 255) == 191) {
                        str2 = Engine.iK ? "UTF8" : "UTF-8";
                        pushbackInputStream.unread(bArr, 3, i - 3);
                    }
                    if (str2 == null && i >= 2) {
                        if ((bArr[0] & 255) == 254 && (bArr[1] & 255) == 255) {
                            str2 = Engine.iK ? "Cp1201" : "UTF-16BE";
                        } else if ((bArr[0] & 255) == 255 && (bArr[1] & 255) == 254) {
                            str2 = Engine.iK ? "Cp1200" : "UTF-16LE";
                            pushbackInputStream.unread(bArr, 2, i - 2);
                        }
                    }
                    if (str2 != null) {
                        return new InputStreamReader(pushbackInputStream, str2);
                    }
                    pushbackInputStream.unread(bArr, 0, i);
                    return str != null ? new InputStreamReader(pushbackInputStream, str) : new InputStreamReader(pushbackInputStream);
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, 6755883663963460320L, this, inputStream, str);
                    }
                    throw th;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = -515764594666254840L)
            /* synthetic */ g(c cVar, a aVar) {
                this(cVar);
                try {
                    if (DW) {
                        iy.EQ(-3563235414777178416L, null, cVar, aVar);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, -3563235414777178416L, null, cVar, aVar);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 2283880104722689047L, container = 2283880104722689047L, user = true)
        private class i implements RefactoringCallback {

            @gy
            private static /* synthetic */ boolean Zo;

            @fy
            private static /* synthetic */ boolean v5;

            @dy(field = -1920649960431841680L)
            private ArrayList<Modification> DW;

            @dy(field = -927192682710027328L)
            private ArrayList<String> FH;

            @dy(field = -2033354854118914560L)
            final /* synthetic */ c Hw;

            @dy(field = 2889278994500131791L)
            private x j6;

            static {
                iy.Zo(i.class);
            }

            @ey(method = 76987278253911069L)
            private i(c cVar) {
                try {
                    if (v5) {
                        iy.tp(2368964024522860013L, null, cVar);
                    }
                    this.Hw = cVar;
                } catch (Throwable th) {
                    if (Zo) {
                        iy.j3(th, 2368964024522860013L, null, cVar);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 7642377391303118565L)
            public void BT() {
                try {
                    if (v5) {
                        iy.gn(-3073553869161261348L, this);
                    }
                    this.Hw.engine.DW.rN(this.DW);
                    this.DW = null;
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, -3073553869161261348L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 1175578516676556795L)
            public void DW(String str) {
                try {
                    if (v5) {
                        iy.tp(-1416703743034001600L, this, str);
                    }
                    this.Hw.engine.DW.DW(str);
                } catch (Throwable th) {
                    if (Zo) {
                        iy.j3(th, -1416703743034001600L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 4217394396904855752L)
            public void EQ(Language language, Set<? extends FormatOption> set) {
                try {
                    if (v5) {
                        iy.EQ(-1946220759105004965L, this, language, set);
                    }
                    this.Hw.engine.DW.ei(language.getName(), set);
                } catch (Throwable th) {
                    if (Zo) {
                        iy.Mr(th, -1946220759105004965L, this, language, set);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -5093108526319264552L)
            public void FH(String str, String str2) {
                try {
                    if (v5) {
                        iy.EQ(-5055632230651460685L, this, str, str2);
                    }
                    this.Hw.engine.DW.FH(str, str2);
                } catch (Throwable th) {
                    if (Zo) {
                        iy.Mr(th, -5055632230651460685L, this, str, str2);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -286725647358196125L)
            public void Hw() {
                try {
                    if (v5) {
                        iy.gn(-45170852614070472L, this);
                    }
                    this.Hw.engine.DW.Hw();
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, -45170852614070472L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 41753650898845300L)
            public void I(FileEntry fileEntry, int i, int i2, int i3, int i4) {
                try {
                    if (v5) {
                        iy.J8(-2539387754624869789L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    this.DW.add(new Modification(i, i2, i3, i4, fileEntry.getPathString(), true));
                } catch (Throwable th) {
                    if (Zo) {
                        iy.lg(th, -2539387754624869789L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 369084989717655673L)
            public void J0() {
                try {
                    if (v5) {
                        iy.gn(-791333591927834300L, this);
                    }
                    this.Hw.engine.DW.XL(this.DW);
                    this.DW = null;
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, -791333591927834300L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -364887740168569191L)
            public void J8() {
                try {
                    if (v5) {
                        iy.gn(-71167104906699456L, this);
                    }
                    this.Hw.engine.DW.nw(this.DW);
                    this.DW = null;
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, -71167104906699456L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 415766194891549848L)
            public void KD() {
                try {
                    if (v5) {
                        iy.gn(-758438250125510193L, this);
                    }
                    this.Hw.engine.DW.P8(this.DW, this.FH);
                    this.DW = null;
                    this.FH = null;
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, -758438250125510193L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -322914057007290385L)
            public void Mr() {
                try {
                    if (v5) {
                        iy.gn(-407678575681319760L, this);
                    }
                    this.Hw.engine.DW.we(this.DW);
                    this.DW = null;
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, -407678575681319760L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 3586738756875656680L)
            public void Mz() {
                try {
                    if (v5) {
                        iy.gn(1888081112627643489L, this);
                    }
                    this.Hw.engine.DW.vy(this.DW);
                    this.DW = null;
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, 1888081112627643489L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 2589583740255546552L)
            public void P8(String str) {
                try {
                    if (v5) {
                        iy.tp(1233348944312959443L, this, str);
                    }
                    this.Hw.engine.DW.tp(str);
                } catch (Throwable th) {
                    if (Zo) {
                        iy.j3(th, 1233348944312959443L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -1101304780403556744L)
            public void QX(String str) {
                try {
                    if (v5) {
                        iy.tp(293882311153625095L, this, str);
                    }
                    this.Hw.engine.DW.er(str);
                } catch (Throwable th) {
                    if (Zo) {
                        iy.j3(th, 293882311153625095L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 143154493265623968L)
            public void SI(String str) {
                try {
                    if (v5) {
                        iy.tp(7610042473961646027L, this, str);
                    }
                    this.Hw.engine.DW.a8(str);
                } catch (Throwable th) {
                    if (Zo) {
                        iy.j3(th, 7610042473961646027L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 1983723241971048864L)
            public void Sf(FileEntry fileEntry, int i, int i2) {
                try {
                    if (v5) {
                        iy.we(3574997633556050359L, this, fileEntry, new Integer(i), new Integer(i2));
                    }
                    this.DW.add(new Modification(i, i2, fileEntry.getPathString()));
                } catch (Throwable th) {
                    if (Zo) {
                        iy.U2(th, 3574997633556050359L, this, fileEntry, new Integer(i), new Integer(i2));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -384509692968837093L)
            public void U2(FileEntry fileEntry, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
                int i7;
                try {
                    if (v5) {
                        iy.QX(2321581548662805280L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
                    }
                    i7 = 7;
                    try {
                        this.DW.add(new Modification(i, i2, i3, i4, fileEntry.getPathString(), i5, i6));
                    } catch (Throwable th) {
                        th = th;
                        if (Zo) {
                            Object[] objArr = new Object[i7];
                            objArr[0] = fileEntry;
                            objArr[1] = new Integer(i);
                            objArr[2] = new Integer(i2);
                            objArr[3] = new Integer(i3);
                            objArr[4] = new Integer(i4);
                            objArr[5] = new Integer(i5);
                            objArr[6] = new Integer(i6);
                            iy.rN(th, 2321581548662805280L, this, objArr);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i7 = 7;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -1073036185830781396L)
            public void VH(String str) {
                try {
                    if (v5) {
                        iy.tp(290166776311201501L, this, str);
                    }
                    this.Hw.engine.DW.VH(str);
                } catch (Throwable th) {
                    if (Zo) {
                        iy.j3(th, 290166776311201501L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -510405582492935700L)
            public void Ws(FileEntry fileEntry, int i, int i2, int i3, int i4) {
                try {
                    if (v5) {
                        iy.J8(-972629890483016697L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    this.DW.add(new Modification(i, i2, i3, i4, fileEntry.getPathString()));
                } catch (Throwable th) {
                    if (Zo) {
                        iy.lg(th, -972629890483016697L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 2011127956028641457L)
            public void XL() {
                try {
                    if (v5) {
                        iy.gn(-919153216088940928L, this);
                    }
                    this.Hw.engine.qP = this.DW;
                    this.DW = null;
                    synchronized (this.Hw.engine.lock3) {
                        this.Hw.engine.lock3.notify();
                    }
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, -919153216088940928L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -3366744770349088455L)
            public void Zo(String str) {
                try {
                    if (v5) {
                        iy.tp(-4469719796602016944L, this, str);
                    }
                    this.Hw.engine.DW.Zo(str);
                } catch (Throwable th) {
                    if (Zo) {
                        iy.j3(th, -4469719796602016944L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -2615620137063375024L)
            public void a8(FileEntry fileEntry, int i, int i2, int i3, int i4, String str) throws Throwable {
                int i5;
                try {
                    if (v5) {
                        iy.QX(2251303861922721031L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str});
                    }
                    i5 = 6;
                    try {
                        this.DW.add(new Modification(i, i2, i3, i4, fileEntry.getPathString(), str, false));
                    } catch (Throwable th) {
                        th = th;
                        if (Zo) {
                            Object[] objArr = new Object[i5];
                            objArr[0] = fileEntry;
                            objArr[1] = new Integer(i);
                            objArr[2] = new Integer(i2);
                            objArr[3] = new Integer(i3);
                            objArr[4] = new Integer(i4);
                            objArr[5] = str;
                            iy.rN(th, 2251303861922721031L, this, objArr);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i5 = 6;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -472368184847259960L)
            public void aM() {
                try {
                    if (v5) {
                        iy.gn(-559109446653604335L, this);
                    }
                    this.Hw.engine.DW.Ws(this.DW);
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, -559109446653604335L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -4509393630752486895L)
            public void ca() {
                try {
                    if (v5) {
                        iy.gn(30678045665013264L, this);
                    }
                    this.Hw.engine.DW.gW(this.DW);
                    this.DW = null;
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, 30678045665013264L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 5769236309927455840L)
            public void cb() {
                try {
                    if (v5) {
                        iy.gn(3989447949820151795L, this);
                    }
                    this.Hw.engine.DW.U2(this.DW);
                    this.DW = null;
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, 3989447949820151795L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -8457795241556571264L)
            public void cn() {
                try {
                    if (v5) {
                        iy.gn(7790561427189223611L, this);
                    }
                    this.Hw.engine.DW.BT(this.DW, this.FH);
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, 7790561427189223611L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 2172115625492829085L)
            public void dx(FileEntry fileEntry, String str) {
                try {
                    if (v5) {
                        iy.EQ(-2256404486372390312L, this, fileEntry, str);
                    }
                    this.DW.add(new Modification(fileEntry.getPathString(), str, 0));
                } catch (Throwable th) {
                    if (Zo) {
                        iy.Mr(th, -2256404486372390312L, this, fileEntry, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 1051263471241881625L)
            public void ef(String str) {
                try {
                    if (v5) {
                        iy.tp(154513840760143380L, this, str);
                    }
                    this.Hw.engine.DW.aM(str);
                } catch (Throwable th) {
                    if (Zo) {
                        iy.j3(th, 154513840760143380L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 1324521052033104029L)
            public void ei(FileEntry fileEntry, int i, int i2, List<Integer> list, List<String> list2, List<String> list3, List<String> list4) {
                try {
                    if (v5) {
                        iy.QX(-803694971742017040L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), list, list2, list3, list4});
                    }
                    this.Hw.engine.oy = fileEntry.getPathString();
                    this.Hw.engine.QO = i;
                    this.Hw.engine.sM = i2;
                    this.j6.FH = list3;
                    this.j6.DW = list2;
                    this.j6.Hw = list4;
                    this.j6.j6 = list;
                    this.Hw.engine.DW.QX(this.j6);
                } catch (Throwable th) {
                    if (Zo) {
                        iy.rN(th, -803694971742017040L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), list, list2, list3, list4});
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 2784101546427342576L)
            public void er(String str) {
                try {
                    if (v5) {
                        iy.tp(-2872407100235180993L, this, str);
                    }
                    this.FH.add(str);
                } catch (Throwable th) {
                    if (Zo) {
                        iy.j3(th, -2872407100235180993L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -4674556157307876223L)
            public void g3() {
                try {
                    if (v5) {
                        iy.gn(5015430610911407316L, this);
                    }
                    this.DW = new ArrayList<>();
                    this.FH = new ArrayList<>();
                    this.j6 = new x();
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, 5015430610911407316L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 3854700177276160212L)
            public void gW(FileEntry fileEntry, int i, int i2, int i3) {
                try {
                    if (v5) {
                        iy.J0(-1308467251635328447L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3));
                    }
                    this.DW.add(new Modification(fileEntry.getPathString(), i, i2, i3));
                } catch (Throwable th) {
                    if (Zo) {
                        iy.a8(th, -1308467251635328447L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -7948890340070877961L)
            public void gn(String str) {
                try {
                    if (v5) {
                        iy.tp(6419842451201251792L, this, str);
                    }
                    this.Hw.engine.DW.gn(str);
                } catch (Throwable th) {
                    if (Zo) {
                        iy.j3(th, 6419842451201251792L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -4553394267096893L)
            public void j3() {
                try {
                    if (v5) {
                        iy.gn(-1075857629219500880L, this);
                    }
                    this.Hw.engine.DW.J8(this.DW);
                    this.DW = null;
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, -1075857629219500880L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -1260077399009975425L)
            public void j6(String str, String str2, boolean z, String str3, int i, int i2, int i3) throws Throwable {
                int i4;
                try {
                    if (v5) {
                        iy.QX(189444325131532872L, this, new Object[]{str, str2, new Boolean(z), str3, new Integer(i), new Integer(i2), new Integer(i3)});
                    }
                    i4 = 7;
                    try {
                        this.Hw.engine.DW.j6(str, str2, z, str3, i, i2, i3);
                    } catch (Throwable th) {
                        th = th;
                        if (Zo) {
                            Object[] objArr = new Object[i4];
                            objArr[0] = str;
                            objArr[1] = str2;
                            objArr[2] = new Boolean(z);
                            objArr[3] = str3;
                            objArr[4] = new Integer(i);
                            objArr[5] = new Integer(i2);
                            objArr[6] = new Integer(i3);
                            iy.rN(th, 189444325131532872L, this, objArr);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i4 = 7;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 5413783023359219373L)
            public void lg(FileEntry fileEntry, FileEntry fileEntry2) {
                try {
                    if (v5) {
                        iy.EQ(3795985650465669600L, this, fileEntry, fileEntry2);
                    }
                    this.DW.add(new Modification(fileEntry.getPathString(), fileEntry2.getPathString(), true));
                } catch (Throwable th) {
                    if (Zo) {
                        iy.Mr(th, 3795985650465669600L, this, fileEntry, fileEntry2);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 151306328497970412L)
            public void nw(FileEntry fileEntry, int i, int i2, int i3, int i4, String str) throws Throwable {
                int i5;
                try {
                    if (v5) {
                        iy.QX(252464168229268189L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str});
                    }
                    if (i <= 0 || i3 < 0) {
                        return;
                    }
                    i5 = 6;
                    try {
                        this.DW.add(new Modification(i, i2, i3, i4, fileEntry.getPathString(), str, true));
                    } catch (Throwable th) {
                        th = th;
                        if (Zo) {
                            Object[] objArr = new Object[i5];
                            objArr[0] = fileEntry;
                            objArr[1] = new Integer(i);
                            objArr[2] = new Integer(i2);
                            objArr[3] = new Integer(i3);
                            objArr[4] = new Integer(i4);
                            objArr[5] = str;
                            iy.rN(th, 252464168229268189L, this, objArr);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i5 = 6;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 5277448700989769983L)
            public void rN() {
                try {
                    if (v5) {
                        iy.gn(-7849392110147592144L, this);
                    }
                    this.Hw.engine.DW.yS(this.DW);
                    this.DW = null;
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, -7849392110147592144L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -3587819514673355L)
            public void ro() {
                try {
                    if (v5) {
                        iy.gn(2004976842666034944L, this);
                    }
                    this.Hw.engine.DW.EQ(this.DW);
                    this.DW = null;
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, 2004976842666034944L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -6422841506572783509L)
            public void sG(FileEntry fileEntry, String str) {
                try {
                    if (v5) {
                        iy.EQ(-6289713235589156032L, this, fileEntry, str);
                    }
                    this.DW.add(new Modification(fileEntry.getPathString(), str));
                } catch (Throwable th) {
                    if (Zo) {
                        iy.Mr(th, -6289713235589156032L, this, fileEntry, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 1039530239698925631L)
            public void sh(FileEntry fileEntry, int i, int i2, int i3, int i4) {
                try {
                    if (v5) {
                        iy.J8(-233125027307537696L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                } catch (Throwable th) {
                    if (Zo) {
                        iy.lg(th, -233125027307537696L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -53875584360178335L)
            public void tp(String str) {
                try {
                    if (v5) {
                        iy.tp(-152333950162639608L, this, str);
                    }
                    this.Hw.engine.DW.J0(str);
                } catch (Throwable th) {
                    if (Zo) {
                        iy.j3(th, -152333950162639608L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -1736151600195204300L)
            public void u7(String str) {
                try {
                    if (v5) {
                        iy.tp(4917964021058210115L, this, str);
                    }
                    this.Hw.engine.DW.u7(str);
                } catch (Throwable th) {
                    if (Zo) {
                        iy.j3(th, 4917964021058210115L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 505152163822243019L)
            public void v5(String str, Hashtable<String, String[]> hashtable) {
                try {
                    if (v5) {
                        iy.EQ(2597624169650374832L, this, str, hashtable);
                    }
                    this.Hw.engine.DW.v5(str, hashtable);
                } catch (Throwable th) {
                    if (Zo) {
                        iy.Mr(th, 2597624169650374832L, this, str, hashtable);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -4390275574328205936L)
            public void vJ() {
                try {
                    if (v5) {
                        iy.gn(-274653299798441095L, this);
                    }
                    this.Hw.engine.DW.lg(this.DW);
                    this.DW = null;
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, -274653299798441095L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -6878209545860371901L)
            public void vy(FileEntry fileEntry, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
                int i7;
                try {
                    if (v5) {
                        iy.QX(-3284207214699842112L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
                    }
                    i7 = 7;
                } catch (Throwable th) {
                    th = th;
                    i7 = 7;
                }
                try {
                    this.DW.add(new Modification(i, i2, i3, i4, fileEntry.getPathString(), i5, i6, true));
                } catch (Throwable th2) {
                    th = th2;
                    if (Zo) {
                        Object[] objArr = new Object[i7];
                        objArr[0] = fileEntry;
                        objArr[1] = new Integer(i);
                        objArr[2] = new Integer(i2);
                        objArr[3] = new Integer(i3);
                        objArr[4] = new Integer(i4);
                        objArr[5] = new Integer(i5);
                        objArr[6] = new Integer(i6);
                        iy.rN(th, -3284207214699842112L, this, objArr);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = 2328977401352018125L)
            public void we(FileEntry fileEntry, int i, int i2) {
                try {
                    if (v5) {
                        iy.we(-4697636280229342740L, this, fileEntry, new Integer(i), new Integer(i2));
                    }
                    this.DW.add(new Modification(i, i2, fileEntry.getPathString(), true));
                } catch (Throwable th) {
                    if (Zo) {
                        iy.U2(th, -4697636280229342740L, this, fileEntry, new Integer(i), new Integer(i2));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -3291465036725094567L)
            public void x9() {
                try {
                    if (v5) {
                        iy.gn(529047800871429424L, this);
                    }
                    this.Hw.engine.DW.j3(this.DW);
                    this.DW = null;
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, 529047800871429424L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.RefactoringCallback
            @ey(method = -2206072071557888064L)
            public void yS() {
                try {
                    if (v5) {
                        iy.gn(1177583363078011175L, this);
                    }
                    this.Hw.engine.DW.Mr(this.DW);
                    this.DW = null;
                } catch (Throwable th) {
                    if (Zo) {
                        iy.aM(th, 1177583363078011175L, this);
                    }
                    throw th;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = 1944571167495735240L)
            /* synthetic */ i(c cVar, a aVar) {
                this(cVar);
                try {
                    if (v5) {
                        iy.EQ(-3625120175460233128L, null, cVar, aVar);
                    }
                } catch (Throwable th) {
                    if (Zo) {
                        iy.Mr(th, -3625120175460233128L, null, cVar, aVar);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 278602058690636381L, container = 278602058690636381L, user = true)
        private class j implements StopCallback {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            @dy(field = 2487811319062713380L)
            final /* synthetic */ c j6;

            static {
                iy.Zo(j.class);
            }

            @ey(method = -145355360616218685L)
            private j(c cVar) {
                try {
                    if (DW) {
                        iy.tp(-2318382342655149952L, null, cVar);
                    }
                    this.j6 = cVar;
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -2318382342655149952L, null, cVar);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.StopCallback
            @ey(method = -3899331332263688191L)
            public boolean CU() {
                try {
                    if (DW) {
                        iy.gn(4940134128658074705L, this);
                    }
                    if (!this.j6.engine.P8 && !this.j6.engine.KD && !this.j6.engine.br && !this.j6.engine.XX && !this.j6.engine.kQ && !this.j6.engine.yO) {
                        if (!this.j6.engine.cn) {
                            return false;
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, 4940134128658074705L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.StopCallback
            @ey(method = 6563719713495490872L)
            public boolean Eq() {
                try {
                    if (DW) {
                        iy.gn(-3893372951362308888L, this);
                    }
                    return jO();
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, -3893372951362308888L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.StopCallback
            @ey(method = 3993752366447546795L)
            public boolean FN() {
                try {
                    if (DW) {
                        iy.gn(860157387706320855L, this);
                    }
                    if (!this.j6.engine.Mr) {
                        if (!this.j6.engine.cn) {
                            return false;
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, 860157387706320855L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.StopCallback
            @ey(method = -4185751123343064731L)
            public boolean Xa() {
                try {
                    if (DW) {
                        iy.gn(3174632107358063557L, this);
                    }
                    return this.j6.engine.a8;
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, 3174632107358063557L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.StopCallback
            @ey(method = -6958571368117093155L)
            public boolean aq() {
                try {
                    if (DW) {
                        iy.gn(-1709810686764432339L, this);
                    }
                    if (!this.j6.engine.vJ) {
                        if (!this.j6.engine.Sf) {
                            return false;
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, -1709810686764432339L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.StopCallback
            @ey(method = -1960529992206224432L)
            public boolean et() {
                try {
                    if (DW) {
                        iy.gn(-4400361270050757456L, this);
                    }
                    return this.j6.engine.U2;
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, -4400361270050757456L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.StopCallback
            @ey(method = 3189557925671941917L)
            public boolean hz() {
                try {
                    if (DW) {
                        iy.gn(1948735198031158817L, this);
                    }
                    return this.j6.engine.ei;
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, 1948735198031158817L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.StopCallback
            @ey(method = 3920297261332085376L)
            public boolean jO() {
                try {
                    if (DW) {
                        iy.gn(1029482837491418548L, this);
                    }
                    if (!this.j6.engine.P8 && !this.j6.engine.er && !this.j6.engine.br && !this.j6.engine.XX && !this.j6.engine.cn && !this.j6.engine.SI && !this.j6.engine.shutdown && !this.j6.engine.kQ && !this.j6.engine.yO && !this.j6.engine.XG && !this.j6.engine.KD && !this.j6.engine.sG && !this.j6.engine.gW && !this.j6.engine.Sf && !this.j6.engine.vJ && !this.j6.engine.sh && !this.j6.engine.cb && !this.j6.engine.dx && !this.j6.engine.vy && this.j6.engine.lg <= 0) {
                        if (!this.j6.engine.ef) {
                            return false;
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, 1029482837491418548L, this);
                    }
                    throw th;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = -208832997763497516L)
            /* synthetic */ j(c cVar, a aVar) {
                this(cVar);
                try {
                    if (DW) {
                        iy.EQ(204145604905105253L, null, cVar, aVar);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, 204145604905105253L, null, cVar, aVar);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -180755818237080772L, container = -180755818237080772L, user = true)
        private class l implements SymbolSearcherCallback {

            @fy
            private static /* synthetic */ boolean Hw;

            @gy
            private static /* synthetic */ boolean v5;

            @dy(field = 804900259078008615L)
            private String DW;

            @dy(field = -1672950245756465136L)
            final /* synthetic */ c FH;

            @dy(field = -2737633123100162816L)
            private ArrayList<SourceEntity> j6;

            static {
                iy.Zo(l.class);
            }

            @ey(method = 677071711086407433L)
            private l(c cVar) {
                try {
                    if (Hw) {
                        iy.tp(4906058514423382389L, null, cVar);
                    }
                    this.FH = cVar;
                } catch (Throwable th) {
                    if (v5) {
                        iy.j3(th, 4906058514423382389L, null, cVar);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.SymbolSearcherCallback
            @ey(method = -3018426877367398192L)
            public void DW(Entity entity) {
                try {
                    if (Hw) {
                        iy.tp(-1897145606835618720L, this, entity);
                    }
                    SourceEntity sourceEntity = new SourceEntity(this.FH.mb, entity);
                    sourceEntity.j6(this.FH.mb);
                    this.j6.add(sourceEntity);
                } catch (Throwable th) {
                    if (v5) {
                        iy.j3(th, -1897145606835618720L, this, entity);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.SymbolSearcherCallback
            @ey(method = -4438047414112635456L)
            public void FH() {
                try {
                    if (Hw) {
                        iy.gn(-1293830545629949344L, this);
                    }
                    if (this.FH.engine.v5 != null) {
                        this.FH.engine.v5.qp(this.DW, this.j6);
                    }
                } catch (Throwable th) {
                    if (v5) {
                        iy.aM(th, -1293830545629949344L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.SymbolSearcherCallback
            @ey(method = -4149421832936422216L)
            public void Hw() {
                try {
                    if (Hw) {
                        iy.gn(-7132705460025148404L, this);
                    }
                    if (this.FH.engine.v5 != null) {
                        this.FH.engine.v5.GK(this.DW, this.j6);
                    }
                } catch (Throwable th) {
                    if (v5) {
                        iy.aM(th, -7132705460025148404L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.SymbolSearcherCallback
            @ey(method = -3267971314542593279L)
            public void VH(String str) {
                try {
                    if (Hw) {
                        iy.tp(1101149150056463739L, this, str);
                    }
                    this.j6 = new ArrayList<>();
                    this.DW = str;
                } catch (Throwable th) {
                    if (v5) {
                        iy.j3(th, 1101149150056463739L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.SymbolSearcherCallback
            @ey(method = 1314949312337627136L)
            public void Zo() {
                try {
                    if (Hw) {
                        iy.gn(-3563008824823350440L, this);
                    }
                    if (this.FH.engine.v5 != null) {
                        this.FH.engine.v5.WB(this.DW);
                    }
                } catch (Throwable th) {
                    if (v5) {
                        iy.aM(th, -3563008824823350440L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.SymbolSearcherCallback
            @ey(method = -2765317377405532092L)
            public void gn(FileEntry fileEntry) {
                try {
                    if (Hw) {
                        iy.tp(-2940270859164189720L, this, fileEntry);
                    }
                    this.j6.add(new SourceEntity(this.FH.mb, fileEntry));
                } catch (Throwable th) {
                    if (v5) {
                        iy.j3(th, -2940270859164189720L, this, fileEntry);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.SymbolSearcherCallback
            @ey(method = -6415385099082813384L)
            public void v5() {
                try {
                    if (Hw) {
                        iy.gn(-5400690707578681620L, this);
                    }
                    if (this.FH.engine.v5 != null) {
                        this.FH.engine.v5.dW(this.DW);
                    }
                } catch (Throwable th) {
                    if (v5) {
                        iy.aM(th, -5400690707578681620L, this);
                    }
                    throw th;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = -187249795048595968L)
            /* synthetic */ l(c cVar, a aVar) {
                this(cVar);
                try {
                    if (Hw) {
                        iy.EQ(712283357628906840L, null, cVar, aVar);
                    }
                } catch (Throwable th) {
                    if (v5) {
                        iy.Mr(th, 712283357628906840L, null, cVar, aVar);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 3434273790659739819L, container = 3434273790659739819L, user = true)
        private class m implements x2 {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(m.class);
            }

            @ey(method = -57237806958752700L)
            private m(c cVar) {
                try {
                    if (j6) {
                        iy.tp(-5166872219421114265L, null, cVar);
                    }
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, -5166872219421114265L, null, cVar);
                    }
                    throw th;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = 121029167885655425L)
            /* synthetic */ m(c cVar, a aVar) {
                this(cVar);
                try {
                    if (j6) {
                        iy.EQ(3412703421424336876L, null, cVar, aVar);
                    }
                } catch (Throwable th) {
                    if (DW) {
                        iy.Mr(th, 3412703421424336876L, null, cVar, aVar);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 29589459889790835L, container = 29589459889790835L, user = true)
        private class n implements y2 {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            @dy(field = 2095477025821741659L)
            final /* synthetic */ c j6;

            static {
                iy.Zo(n.class);
            }

            @ey(method = -86240450609251244L)
            private n(c cVar) {
                try {
                    if (DW) {
                        iy.tp(2687530187768833800L, null, cVar);
                    }
                    this.j6 = cVar;
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 2687530187768833800L, null, cVar);
                    }
                    throw th;
                }
            }

            @Override // abcd.y2
            @ey(method = -1543752745253706264L)
            public void DW(FileEntry fileEntry, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
                int i9;
                try {
                    if (DW) {
                        iy.QX(-2471932537515158445L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                    }
                    if (this.j6.engine.v5 != null) {
                        i9 = 9;
                        try {
                            this.j6.engine.v5.hp(fileEntry.getPathString(), i, i2, i3, i4, i5, i6, i7, i8);
                        } catch (Throwable th) {
                            th = th;
                            if (FH) {
                                Object[] objArr = new Object[i9];
                                objArr[0] = fileEntry;
                                objArr[1] = new Integer(i);
                                objArr[2] = new Integer(i2);
                                objArr[3] = new Integer(i3);
                                objArr[4] = new Integer(i4);
                                objArr[5] = new Integer(i5);
                                objArr[6] = new Integer(i6);
                                objArr[7] = new Integer(i7);
                                objArr[8] = new Integer(i8);
                                iy.rN(th, -2471932537515158445L, this, objArr);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i9 = 9;
                }
            }

            @Override // abcd.y2
            @ey(method = -205177689106707915L)
            public void FH(FileEntry fileEntry) {
                try {
                    if (DW) {
                        iy.tp(-274800519416987160L, this, fileEntry);
                    }
                    if (this.j6.engine.v5 != null) {
                        this.j6.engine.v5.Hl(fileEntry.getPathString());
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -274800519416987160L, this, fileEntry);
                    }
                    throw th;
                }
            }

            @Override // abcd.y2
            @ey(method = -100010561455452981L)
            public void j6(Language language, int i, int i2, int i3, int i4, boolean z) throws Throwable {
                int i5;
                try {
                    if (DW) {
                        iy.QX(-1964061824694172992L, this, new Object[]{language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
                    }
                    if (this.j6.engine.v5 != null) {
                        i5 = 6;
                        try {
                            this.j6.engine.v5.Fd(language.getName(), i, i2, i3, i4, z);
                        } catch (Throwable th) {
                            th = th;
                            if (FH) {
                                Object[] objArr = new Object[i5];
                                objArr[0] = language;
                                objArr[1] = new Integer(i);
                                objArr[2] = new Integer(i2);
                                objArr[3] = new Integer(i3);
                                objArr[4] = new Integer(i4);
                                objArr[5] = new Boolean(z);
                                iy.rN(th, -1964061824694172992L, this, objArr);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i5 = 6;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = 263924343665177625L)
            /* synthetic */ n(c cVar, a aVar) {
                this(cVar);
                try {
                    if (DW) {
                        iy.EQ(-6318664952136798789L, null, cVar, aVar);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, -6318664952136798789L, null, cVar, aVar);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -154390351782867496L, container = -154390351782867496L, user = true)
        private class o implements TemplateEvaluatorCallback {

            @fy
            private static /* synthetic */ boolean FH;

            @gy
            private static /* synthetic */ boolean Hw;

            @dy(field = 391630311462519523L)
            final /* synthetic */ c DW;

            @dy(field = -948263873784466539L)
            private List<SourceEntity> j6;

            static {
                iy.Zo(o.class);
            }

            @ey(method = -697999748692704920L)
            private o(c cVar) {
                try {
                    if (FH) {
                        iy.tp(1199349747011554424L, null, cVar);
                    }
                    this.DW = cVar;
                } catch (Throwable th) {
                    if (Hw) {
                        iy.j3(th, 1199349747011554424L, null, cVar);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.TemplateEvaluatorCallback
            @ey(method = -709717770882806093L)
            public void DW(Entity entity) {
                try {
                    if (FH) {
                        iy.tp(-290891677060081167L, this, entity);
                    }
                    this.j6.add(entity.isClassType() ? new SourceEntity(this.DW.mb, entity, 0) : new SourceEntity(this.DW.mb, entity));
                } catch (Throwable th) {
                    if (Hw) {
                        iy.j3(th, -290891677060081167L, this, entity);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.TemplateEvaluatorCallback
            @ey(method = -2866317715028389545L)
            public void FH() {
                try {
                    if (FH) {
                        iy.gn(-397474537807223019L, this);
                    }
                    this.DW.engine.N0 = this.j6;
                    this.j6 = null;
                } catch (Throwable th) {
                    if (Hw) {
                        iy.aM(th, -397474537807223019L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.TemplateEvaluatorCallback
            @ey(method = 3941326670037901592L)
            public void Hw(String str) {
                try {
                    if (FH) {
                        iy.tp(-1803155837007176076L, this, str);
                    }
                    this.j6.add(new SourceEntity(str, true));
                } catch (Throwable th) {
                    if (Hw) {
                        iy.j3(th, -1803155837007176076L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.TemplateEvaluatorCallback
            @ey(method = -2263084304052852000L)
            public void j6() {
                try {
                    if (FH) {
                        iy.gn(-3310861026369618580L, this);
                    }
                    this.j6 = new ArrayList();
                } catch (Throwable th) {
                    if (Hw) {
                        iy.aM(th, -3310861026369618580L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.TemplateEvaluatorCallback
            @ey(method = 5153645270180234100L)
            public void v5(Variable variable) {
                try {
                    if (FH) {
                        iy.tp(-3429951263818014600L, this, variable);
                    }
                    this.j6.add(new SourceEntity((Model) this.DW.mb, false, variable));
                } catch (Throwable th) {
                    if (Hw) {
                        iy.j3(th, -3429951263818014600L, this, variable);
                    }
                    throw th;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = 37769996861189431L)
            /* synthetic */ o(c cVar, a aVar) {
                this(cVar);
                try {
                    if (FH) {
                        iy.EQ(5814049517972173875L, null, cVar, aVar);
                    }
                } catch (Throwable th) {
                    if (Hw) {
                        iy.Mr(th, 5814049517972173875L, null, cVar, aVar);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(c.class);
        }

        @ey(method = 117048763785459960L)
        public c(Engine engine, boolean z) {
            try {
                if (oy) {
                    iy.EQ(-4344833074754007520L, null, engine, new Boolean(z));
                }
                this.engine = engine;
            } catch (Throwable th) {
                if (aX) {
                    iy.Mr(th, -4344833074754007520L, null, engine, new Boolean(z));
                }
                throw th;
            }
        }

        @ey(method = 128792909681912987L)
        private void BT(boolean z) {
            try {
                if (oy) {
                    iy.Ws(46868327280444096L, this, z);
                }
                this.mb.a8(z);
                if (z) {
                    this.engine.ct.clear();
                }
            } catch (Throwable th) {
                if (aX) {
                    iy.j3(th, 46868327280444096L, this, new Boolean(z));
                }
                throw th;
            }
        }

        @ey(method = 5138511291987847956L)
        private String EQ() {
            try {
                if (oy) {
                    iy.gn(3951146083282456947L, this);
                }
                return this.engine.J0 + File.separator + ".xxxxxxxxxxxx" + tp();
            } catch (Throwable th) {
                if (aX) {
                    iy.aM(th, 3951146083282456947L, this);
                }
                throw th;
            }
        }

        @ey(method = 6711852791925224181L)
        private void FH(FileEntry fileEntry, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            try {
                if (oy) {
                    iy.QX(2077721105318373840L, this, new Object[]{fileEntry, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5)});
                }
                this.eU = false;
                try {
                    try {
                        try {
                            List<SyntaxTree> listQX = this.mb.syntaxTreeSpace.QX(fileEntry);
                            for (SyntaxTree syntaxTree : listQX) {
                                this.mb.errorTable.yS(fileEntry, syntaxTree.getLanguage());
                                if (syntaxTree.getLanguage().getCodeAnalyzer() != null) {
                                    syntaxTree.getLanguage().getCodeAnalyzer().v5(syntaxTree);
                                }
                                this.mb.I.j6(syntaxTree);
                                if (syntaxTree.getLanguage().getCodeAnalyzer() != null) {
                                    this.mb.nw.j6(syntaxTree);
                                }
                                if (fileEntry.isOpen() && !this.jw.Zo()) {
                                    synchronized (this.engine.lock1) {
                                        this.engine.P8 = true;
                                    }
                                    return;
                                } else {
                                    synchronized (this.engine.lock1) {
                                        if (this.fY.jO()) {
                                            this.engine.P8 = true;
                                            return;
                                        }
                                    }
                                    this.mb.P8.gn(syntaxTree);
                                }
                            }
                            this.engine.ct.remove(fileEntry.getPathString());
                            this.mb.j3.er(fileEntry, listQX, z2, z3 || z4 || z5);
                            if ((z3 || z4) && this.mb.j3.P8() > 200000) {
                                this.mb.j3.vy();
                            }
                            if (z) {
                                this.mb.Sf.DW(fileEntry, listQX);
                            }
                            this.mb.vy.j6(fileEntry);
                            Iterator<SyntaxTree> it = listQX.iterator();
                            while (it.hasNext()) {
                                this.mb.syntaxTreeSpace.releaseSyntaxTree(it.next());
                            }
                            er(fileEntry);
                            this.mb.lg();
                            int i2 = this.sE;
                            this.sE = i2 + 1;
                            if (i2 > 100) {
                                this.sE = 0;
                                ei();
                            }
                        } catch (Throwable th) {
                            AppLog.FH("Error compiling " + fileEntry.getPathString());
                            if (this.engine.FH != null) {
                                if (th instanceof OutOfMemoryError) {
                                    this.engine.FH.oa();
                                } else {
                                    this.engine.FH.MP(th);
                                }
                            }
                        }
                    } catch (OutOfMemoryError e) {
                        throw e;
                    }
                } catch (StackOverflowError e2) {
                    throw e2;
                }
            } catch (Throwable th2) {
                if (aX) {
                    iy.rN(th2, 2077721105318373840L, this, new Object[]{fileEntry, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5)});
                }
                throw th2;
            }
        }

        @ey(method = 486359301346251659L)
        private void J0() {
            try {
                if (oy) {
                    iy.gn(1461012177464407200L, this);
                }
                if (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory() > 4.0E7f) {
                    for (int i2 = 0; i2 < 5; i2++) {
                        System.gc();
                        float f2 = Runtime.getRuntime().totalMemory();
                        if ((f2 - Runtime.getRuntime().freeMemory()) / f2 > 0.3f) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                if (aX) {
                    iy.aM(th, 1461012177464407200L, this);
                }
                throw th;
            }
        }

        @ey(method = -576796999345025748L)
        private SetOfFileEntry J8(List<v> list, List<com.aide.engine.k> list2) {
            try {
                if (oy) {
                    iy.EQ(390965205118496143L, this, list, list2);
                }
                SetOfFileEntry setOfFileEntry = new SetOfFileEntry(this.mb.fileSpace);
                Iterator<v> it = list.iterator();
                while (it.hasNext()) {
                    setOfFileEntry.gn(this.mb.fileSpace.lg(it.next().FH()));
                }
                for (com.aide.engine.k kVar : list2) {
                    for (CodeModel codeModel : this.mb.fileSpace.getCodeModels()) {
                        if (codeModel.getDebugger() != null) {
                            try {
                                setOfFileEntry.gn(codeModel.getDebugger().FH(kVar.DW(), kVar.Hw(), kVar.FH()).getFile());
                            } catch (e4 unused) {
                            }
                        }
                    }
                }
                return setOfFileEntry;
            } catch (Throwable th) {
                if (aX) {
                    iy.Mr(th, 390965205118496143L, this, list, list2);
                }
                throw th;
            }
        }

        @ey(method = -195349828081651360L)
        private void Mr(boolean z, boolean z2, boolean z3, boolean z4) {
            List<com.aide.engine.k> list;
            List<v> list2;
            int i2;
            FileEntry fileEntry;
            boolean z5;
            FileEntry fileEntry2;
            FileEntry fileEntry3;
            try {
                if (oy) {
                    iy.J0(522930726013581651L, this, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4));
                }
                try {
                    ListOfInt listOfInt = new ListOfInt();
                    this.jw.VH().j6.init();
                    while (this.jw.VH().j6.hasMoreElements()) {
                        listOfInt.add(this.jw.VH().j6.nextKey().getId());
                    }
                    int i3 = 0;
                    while (i3 < listOfInt.size()) {
                        int i4 = i3 + 1;
                        int i5 = i3;
                        for (int i6 = i4; i6 < listOfInt.size(); i6++) {
                            if (this.mb.fileSpace.getFileEntry(listOfInt.get(i5)).getVersion() < this.mb.fileSpace.getFileEntry(listOfInt.get(i6)).getVersion()) {
                                i5 = i6;
                            }
                        }
                        int i7 = listOfInt.get(i3);
                        listOfInt.gn(i3, listOfInt.get(i5));
                        listOfInt.gn(i5, i7);
                        i3 = i4;
                    }
                    this.sg.clear();
                    this.sg.u7(this.mb.fileSpace.KD());
                    this.sg.u7(this.jw.VH());
                    synchronized (this.engine.lock1) {
                        list = this.engine.TI;
                        list2 = this.engine.AR;
                    }
                    this.pO.clear();
                    if (z4) {
                        SetOfFileEntry setOfFileEntryJ8 = J8(list2, list);
                        setOfFileEntryJ8.j6.init();
                        while (setOfFileEntryJ8.j6.hasMoreElements()) {
                            FileEntry fileEntryNextKey = setOfFileEntryJ8.j6.nextKey();
                            if (this.mb.fileSpace.Mz(fileEntryNextKey) && !this.engine.ct.containsKey(fileEntryNextKey.getPathString())) {
                                this.pO.gn(fileEntryNextKey);
                            }
                        }
                        this.sg.u7(this.pO);
                    }
                    SetOfInt setOfInt = new SetOfInt();
                    this.Gj.j6.DW();
                    while (this.Gj.j6.j6()) {
                        int iFH = this.Gj.j6.FH();
                        if (!this.mb.fileSpace.getFileEntry(iFH).isOpen()) {
                            setOfInt.put(iFH);
                        }
                    }
                    setOfInt.default_Iterator.init();
                    while (setOfInt.default_Iterator.hasMoreElements()) {
                        this.Gj.remove(setOfInt.default_Iterator.nextKey());
                    }
                    this.fN.clear();
                    this.sg.j6.init();
                    while (this.sg.j6.hasMoreElements()) {
                        FileEntry fileEntryNextKey2 = this.sg.j6.nextKey();
                        if (!this.mb.P8.a8(fileEntryNextKey2) || (((z || z3) && this.mb.j3.cn(fileEntryNextKey2)) || (z2 && fileEntryNextKey2.getCodeModel() != null && fileEntryNextKey2.getCodeModel().getCompiler() != null))) {
                            this.fN.gn(fileEntryNextKey2);
                        }
                    }
                    if (this.fN.we() > 0) {
                        this.engine.Hw.eU();
                    }
                    this.fN.j6.init();
                    while (this.fN.j6.hasMoreElements()) {
                        this.engine.Hw.Lz(this.fN.j6.nextKey().getPathString());
                    }
                    if (z2) {
                        this.mb.j3.Mr();
                    }
                    this.fN.clear();
                    this.sg.j6.init();
                    FileEntry fileEntry4 = null;
                    int i8 = 0;
                    while (true) {
                        FileEntry successorFile = fileEntry4 == null ? null : fileEntry4.getSuccessorFile();
                        if (i8 < listOfInt.size()) {
                            fileEntry = this.mb.fileSpace.getFileEntry(listOfInt.get(i8));
                            i2 = i8 + 1;
                            z5 = true;
                        } else {
                            SetOfFileEntry setOfFileEntryGn = this.mb.syntaxTreeSpace.gn();
                            if (successorFile == null || !setOfFileEntryGn.contains(successorFile) || this.fN.contains(successorFile) || !this.sg.contains(successorFile)) {
                                setOfFileEntryGn.j6.init();
                                while (true) {
                                    if (setOfFileEntryGn.j6.hasMoreElements()) {
                                        FileEntry fileEntryNextKey3 = setOfFileEntryGn.j6.nextKey();
                                        if (!this.fN.contains(fileEntryNextKey3) && this.sg.contains(fileEntryNextKey3)) {
                                            i2 = i8;
                                            fileEntry = fileEntryNextKey3;
                                            break;
                                        }
                                    } else if (successorFile == null || this.fN.contains(successorFile) || !this.sg.contains(successorFile)) {
                                        while (this.sg.j6.hasMoreElements()) {
                                            successorFile = this.sg.j6.nextKey();
                                            if (!this.fN.contains(successorFile)) {
                                            }
                                        }
                                        i2 = i8;
                                        fileEntry = null;
                                    }
                                }
                                z5 = false;
                            }
                            fileEntry = successorFile;
                            i2 = i8;
                            z5 = false;
                        }
                        if (fileEntry == null) {
                            if (z || z2) {
                                for (int i9 = 0; i9 < listOfInt.size(); i9++) {
                                    FileEntry fileEntry5 = this.mb.fileSpace.getFileEntry(listOfInt.get(i9));
                                    if (!this.sg.contains(fileEntry5)) {
                                        this.mb.j3.dx(fileEntry5);
                                    }
                                }
                            }
                            this.engine.Hw.Of();
                            if (z4) {
                                synchronized (this.engine.lock1) {
                                    this.engine.sy = false;
                                }
                                synchronized (this.engine.lock2) {
                                    this.engine.lock2.notify();
                                }
                            }
                            this.engine.Hw.sT();
                            SetOfFileEntry setOfFileEntryJ0 = this.mb.P8.J0();
                            if (setOfFileEntryJ0 != null) {
                                setOfFileEntryJ0.j6.init();
                                while (setOfFileEntryJ0.j6.hasMoreElements()) {
                                    yS(setOfFileEntryJ0.j6.nextKey());
                                }
                            }
                            this.sg.clear();
                            this.sg.u7(this.mb.fileSpace.KD());
                            this.sg.j6.init();
                            while (this.sg.j6.hasMoreElements()) {
                                FileEntry fileEntryNextKey4 = this.sg.j6.nextKey();
                                if (setOfFileEntryJ0 == null || !setOfFileEntryJ0.contains(fileEntryNextKey4)) {
                                    if (this.mb.errorTable.P8(fileEntryNextKey4)) {
                                        this.engine.Hw.b1(fileEntryNextKey4.getPathString());
                                    }
                                }
                            }
                            this.engine.Hw.hp();
                            if (z3) {
                                try {
                                    synchronized (this.engine.lock1) {
                                        this.engine.x9 = false;
                                    }
                                    HashSet hashSet = new HashSet();
                                    Hashtable<String, byte[]> hashtable = new Hashtable<>();
                                    this.mb.j3.SI(hashSet, hashtable);
                                    if (this.engine.VH != null) {
                                        this.engine.VH.cT(hashSet, hashtable);
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace(System.out);
                                    if (this.engine.VH != null) {
                                        this.engine.VH.w9(e);
                                    }
                                }
                            }
                            if (z || z2) {
                                try {
                                    if (this.fY.jO()) {
                                        this.engine.P8 = true;
                                        return;
                                    }
                                    synchronized (this.engine.lock1) {
                                        this.engine.g3 = false;
                                        this.engine.ca = false;
                                    }
                                    this.mb.j3.yS();
                                    HashSet hashSet2 = new HashSet();
                                    SetOfInt setOfInt2 = new SetOfInt();
                                    HashSet hashSet3 = new HashSet();
                                    this.sg.clear();
                                    this.sg.u7(this.mb.fileSpace.KD());
                                    this.sg.j6.init();
                                    while (this.sg.j6.hasMoreElements()) {
                                        FileEntry fileEntryNextKey5 = this.sg.j6.nextKey();
                                        if (this.mb.j3.KD(fileEntryNextKey5)) {
                                            hashSet3.add(fileEntryNextKey5.getPathString());
                                            setOfInt2.put(fileEntryNextKey5.gn());
                                        }
                                    }
                                    this.sg.clear();
                                    this.sg.u7(this.mb.fileSpace.getResourceFiles());
                                    this.sg.j6.init();
                                    while (this.sg.j6.hasMoreElements()) {
                                        FileEntry fileEntryNextKey6 = this.sg.j6.nextKey();
                                        if (this.mb.j3.ro(fileEntryNextKey6)) {
                                            hashSet3.add(fileEntryNextKey6.getPathString());
                                            setOfInt2.put(fileEntryNextKey6.gn());
                                        }
                                    }
                                    setOfInt2.default_Iterator.init();
                                    while (setOfInt2.default_Iterator.hasMoreElements()) {
                                        hashSet2.add(this.mb.fileSpace.XL(setOfInt2.default_Iterator.nextKey()));
                                    }
                                    HashMap map = new HashMap();
                                    this.sg.clear();
                                    this.sg.u7(this.mb.fileSpace.KD());
                                    this.sg.j6.init();
                                    while (this.sg.j6.hasMoreElements()) {
                                        FileEntry fileEntryNextKey7 = this.sg.j6.nextKey();
                                        String strWB = this.mb.entitySpace.WB(fileEntryNextKey7);
                                        if (strWB.length() > 0) {
                                            map.put(fileEntryNextKey7.getPathString(), strWB);
                                        }
                                    }
                                    if (this.engine.VH != null) {
                                        this.engine.VH.hK(hashSet2, hashSet3, map);
                                    }
                                    boolean zJ3 = this.mb.j3.j3(true);
                                    if (this.engine.VH != null) {
                                        this.engine.VH.AL(zJ3);
                                    }
                                    this.eU = false;
                                    if (!this.mb.j3.cb()) {
                                        this.mb.j3.Sf();
                                        BT(true);
                                    }
                                    ei();
                                } catch (IOException e2) {
                                    e2.printStackTrace(System.out);
                                    if (this.engine.VH != null) {
                                        this.engine.VH.w9(e2);
                                    }
                                    if (this.engine.VH != null) {
                                        this.engine.VH.AL(true);
                                    }
                                }
                            }
                            if (!this.e3) {
                                this.e3 = true;
                                BT(true);
                            }
                            P8();
                            this.sE = 0;
                            return;
                        }
                        this.fN.gn(fileEntry);
                        if (fileEntry.vJ()) {
                            if (!this.mb.P8.a8(fileEntry) || (((z || z3) && this.mb.j3.cn(fileEntry)) || ((z2 && fileEntry.getCodeModel().getCompiler() != null) || this.pO.contains(fileEntry)))) {
                                System.currentTimeMillis();
                                fileEntry3 = fileEntry;
                                FH(fileEntry, z5, this.pO.contains(fileEntry), z, z2, z3);
                            } else {
                                if (this.mb.errorTable.vy(fileEntry)) {
                                    this.engine.Hw.aj(fileEntry.getPathString());
                                }
                                if (z5) {
                                    this.mb.Sf.j6(fileEntry);
                                }
                                fileEntry3 = fileEntry;
                            }
                            synchronized (this.engine.lock1) {
                                if (this.fY.jO()) {
                                    this.engine.P8 = true;
                                    return;
                                }
                            }
                            if (!z5 || this.Gj.v5(fileEntry3.getId()) == fileEntry3.getVersion()) {
                                fileEntry2 = fileEntry3;
                            } else {
                                this.Gj.put(fileEntry3.getId(), fileEntry3.getVersion());
                                fileEntry2 = fileEntry3;
                                this.mb.nw.FH(fileEntry2);
                            }
                        } else {
                            fileEntry2 = fileEntry;
                            if (fileEntry2.I()) {
                                if (z5 && this.Gj.v5(fileEntry2.getId()) != fileEntry2.getVersion()) {
                                    this.Gj.put(fileEntry2.getId(), fileEntry2.getVersion());
                                    this.mb.nw.FH(fileEntry2);
                                }
                                if (z5) {
                                    this.mb.Sf.j6(fileEntry2);
                                }
                            }
                        }
                        fileEntry4 = fileEntry2;
                        i8 = i2;
                    }
                } catch (d4 e3) {
                    this.engine.P8 = true;
                    throw e3;
                }
            } finally {
            }
        }

        @ey(method = 5801608533461052456L)
        private void P8() {
            try {
                if (oy) {
                    iy.gn(-4212395285288008651L, this);
                }
                if (this.WB == null || new File(gn()).exists()) {
                    return;
                }
                this.mb.J8();
                ei();
            } catch (Throwable th) {
                if (aX) {
                    iy.aM(th, -4212395285288008651L, this);
                }
                throw th;
            }
        }

        @ey(method = -2465953104222077919L)
        private SetOf<Entity> QX(List<v> list, List<com.aide.engine.k> list2) {
            try {
                if (oy) {
                    iy.EQ(152477465531017840L, this, list, list2);
                }
                SetOf<Entity> setOf = new SetOf<>(this.mb.entitySpace);
                for (v vVar : list) {
                    FileEntry fileEntryLg = this.mb.fileSpace.lg(vVar.FH());
                    if (fileEntryLg.getCodeModel() != null && fileEntryLg.getCodeModel().getDebugger() != null) {
                        try {
                            setOf.put(fileEntryLg.getCodeModel().getDebugger().Zo(fileEntryLg, vVar.Hw(), vVar.DW()));
                        } catch (e4 unused) {
                        }
                    }
                }
                for (com.aide.engine.k kVar : list2) {
                    for (CodeModel codeModel : this.mb.fileSpace.getCodeModels()) {
                        if (codeModel.getDebugger() != null) {
                            try {
                                setOf.put(codeModel.getDebugger().FH(kVar.DW(), kVar.Hw(), kVar.FH()));
                            } catch (e4 unused2) {
                            }
                        }
                    }
                }
                return setOf;
            } catch (Throwable th) {
                if (aX) {
                    iy.Mr(th, 152477465531017840L, this, list, list2);
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:60:0x0198 A[Catch: all -> 0x06ae, TryCatch #3 {all -> 0x06ae, blocks: (B:3:0x0005, B:5:0x0009, B:6:0x000c, B:7:0x001a, B:8:0x001d, B:11:0x0031, B:12:0x0037, B:15:0x003f, B:16:0x0045, B:19:0x0053, B:21:0x0061, B:23:0x006f, B:26:0x00a9, B:28:0x00ad, B:29:0x00ca, B:31:0x00ce, B:33:0x00dc, B:34:0x00ec, B:35:0x0103, B:37:0x0107, B:38:0x0127, B:40:0x012f, B:41:0x0143, B:42:0x014c, B:43:0x0162, B:44:0x0165, B:56:0x018c, B:58:0x0194, B:60:0x0198, B:61:0x01ad, B:63:0x01b1, B:64:0x01cc, B:66:0x01d0, B:67:0x01e5, B:69:0x01e9, B:70:0x0204, B:72:0x0208, B:73:0x021d, B:75:0x0221, B:76:0x0256, B:78:0x025a, B:79:0x0269, B:81:0x026d, B:82:0x028a, B:84:0x028e, B:85:0x02af, B:87:0x02b3, B:88:0x02e0, B:90:0x02e4, B:91:0x0313, B:93:0x0317, B:95:0x0325, B:97:0x0333, B:100:0x036d, B:99:0x0341, B:101:0x038e, B:103:0x0392, B:104:0x03a7, B:106:0x03ab, B:107:0x03c0, B:109:0x03c4, B:111:0x03d2, B:113:0x03e0, B:116:0x041a, B:115:0x03ee, B:117:0x043b, B:119:0x043f, B:121:0x044d, B:123:0x045b, B:126:0x0495, B:125:0x0469, B:127:0x04b6, B:129:0x04ba, B:130:0x04cf, B:132:0x04d3, B:133:0x04fc, B:135:0x0500, B:136:0x0515, B:138:0x0519, B:139:0x052e, B:141:0x0532, B:143:0x0540, B:145:0x054e, B:148:0x0588, B:147:0x055c, B:149:0x05a9, B:151:0x05ad, B:152:0x05c8, B:154:0x05cc, B:155:0x05e7, B:157:0x05eb, B:158:0x0606, B:160:0x060a, B:161:0x0619, B:163:0x061d, B:164:0x063a, B:166:0x063e, B:167:0x0658, B:169:0x065c, B:170:0x0670, B:172:0x0674, B:173:0x0688, B:175:0x068c, B:45:0x016a, B:47:0x0170, B:48:0x017b, B:54:0x0189, B:25:0x007d, B:179:0x06aa, B:182:0x06ad, B:49:0x017c, B:50:0x0185, B:17:0x0046, B:18:0x0052, B:13:0x0038, B:14:0x003e), top: B:196:0x0005, inners: #0, #1, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01ad A[Catch: all -> 0x06ae, TryCatch #3 {all -> 0x06ae, blocks: (B:3:0x0005, B:5:0x0009, B:6:0x000c, B:7:0x001a, B:8:0x001d, B:11:0x0031, B:12:0x0037, B:15:0x003f, B:16:0x0045, B:19:0x0053, B:21:0x0061, B:23:0x006f, B:26:0x00a9, B:28:0x00ad, B:29:0x00ca, B:31:0x00ce, B:33:0x00dc, B:34:0x00ec, B:35:0x0103, B:37:0x0107, B:38:0x0127, B:40:0x012f, B:41:0x0143, B:42:0x014c, B:43:0x0162, B:44:0x0165, B:56:0x018c, B:58:0x0194, B:60:0x0198, B:61:0x01ad, B:63:0x01b1, B:64:0x01cc, B:66:0x01d0, B:67:0x01e5, B:69:0x01e9, B:70:0x0204, B:72:0x0208, B:73:0x021d, B:75:0x0221, B:76:0x0256, B:78:0x025a, B:79:0x0269, B:81:0x026d, B:82:0x028a, B:84:0x028e, B:85:0x02af, B:87:0x02b3, B:88:0x02e0, B:90:0x02e4, B:91:0x0313, B:93:0x0317, B:95:0x0325, B:97:0x0333, B:100:0x036d, B:99:0x0341, B:101:0x038e, B:103:0x0392, B:104:0x03a7, B:106:0x03ab, B:107:0x03c0, B:109:0x03c4, B:111:0x03d2, B:113:0x03e0, B:116:0x041a, B:115:0x03ee, B:117:0x043b, B:119:0x043f, B:121:0x044d, B:123:0x045b, B:126:0x0495, B:125:0x0469, B:127:0x04b6, B:129:0x04ba, B:130:0x04cf, B:132:0x04d3, B:133:0x04fc, B:135:0x0500, B:136:0x0515, B:138:0x0519, B:139:0x052e, B:141:0x0532, B:143:0x0540, B:145:0x054e, B:148:0x0588, B:147:0x055c, B:149:0x05a9, B:151:0x05ad, B:152:0x05c8, B:154:0x05cc, B:155:0x05e7, B:157:0x05eb, B:158:0x0606, B:160:0x060a, B:161:0x0619, B:163:0x061d, B:164:0x063a, B:166:0x063e, B:167:0x0658, B:169:0x065c, B:170:0x0670, B:172:0x0674, B:173:0x0688, B:175:0x068c, B:45:0x016a, B:47:0x0170, B:48:0x017b, B:54:0x0189, B:25:0x007d, B:179:0x06aa, B:182:0x06ad, B:49:0x017c, B:50:0x0185, B:17:0x0046, B:18:0x0052, B:13:0x0038, B:14:0x003e), top: B:196:0x0005, inners: #0, #1, #2 }] */
        @abcd.ey(method = -1328090680802251247L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void U2() {
            /*
                Method dump skipped, instructions count: 1762
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.engine.Engine.c.U2():void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = -675218258326309888L)
        public SyntaxStyleType Ws(Syntax syntax, int i2) {
            try {
                if (oy) {
                    iy.EQ(-869392948840524777L, this, syntax, new Integer(i2));
                }
                if (syntax.isOperator(i2)) {
                    return SyntaxStyleType.OPERATOR;
                }
                if (syntax.isSeparator(i2)) {
                    return SyntaxStyleType.SEPARATOR;
                }
                if (syntax.isTypeIdentifier(i2)) {
                    return SyntaxStyleType.TYPE_IDENTIFIER;
                }
                if (syntax.isBooleanLiteral(i2)) {
                    return SyntaxStyleType.LITERAL;
                }
                if (syntax.isToken(i2)) {
                    return SyntaxStyleType.KEYWORD;
                }
                if (syntax.isDocComment(i2)) {
                    return SyntaxStyleType.DOC_COMMENT;
                }
                if (syntax.isComment(i2)) {
                    return SyntaxStyleType.COMMENT;
                }
                return null;
            } catch (Throwable th) {
                if (aX) {
                    iy.Mr(th, -869392948840524777L, this, syntax, new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -6117509193328131291L)
        private int XL(int i2) {
            try {
                if (oy) {
                    iy.u7(-5503656191709430692L, this, i2);
                }
                if (i2 == 1 || i2 == 21) {
                    return 2;
                }
                if (i2 == 70) {
                    return 1;
                }
                if (i2 == 100) {
                    return 302;
                }
                if (i2 == 200) {
                    return 400;
                }
                if (i2 == 300) {
                    return 500;
                }
                if (i2 == 60) {
                    return 250;
                }
                if (i2 == 61) {
                    return 251;
                }
                if (i2 == 90) {
                    return 301;
                }
                if (i2 == 91) {
                    return 300;
                }
                switch (i2) {
                    case 40:
                        return 104;
                    case 41:
                        return 105;
                    case 42:
                        return 106;
                    case 43:
                        return 107;
                    case 44:
                        return 108;
                    case 45:
                        return 109;
                    case 46:
                        return 110;
                    case 47:
                        return 101;
                    case 48:
                        return 102;
                    case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                        return 103;
                    case 50:
                        return 112;
                    case 51:
                        return 111;
                    default:
                        switch (i2) {
                            case 80:
                                return 201;
                            case ProxyTextView.INPUTTYPE_textLongMessage /* 81 */:
                                return 200;
                            case 82:
                                return 203;
                            case 83:
                                return 202;
                            case 84:
                                return 204;
                            default:
                                return 0;
                        }
                }
            } catch (Throwable th) {
                if (aX) {
                    iy.j3(th, -5503656191709430692L, this, new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -1655453807768167281L)
        private void a8() {
            try {
                if (oy) {
                    iy.gn(-2702935021817302272L, this);
                }
                if (this.WB != null && this.engine.we) {
                    new File(gn()).delete();
                }
            } catch (Throwable th) {
                if (aX) {
                    iy.aM(th, -2702935021817302272L, this);
                }
                throw th;
            }
        }

        @ey(method = -5347470403357880511L)
        private boolean aM(int i2) {
            try {
                if (oy) {
                    iy.u7(3950006587151486820L, this, i2);
                }
                return i2 == 70 || i2 == 100 || i2 == 90 || i2 == 91;
            } catch (Throwable th) {
                if (aX) {
                    iy.j3(th, 3950006587151486820L, this, new Integer(i2));
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00e2 A[Catch: all -> 0x00ec, TRY_LEAVE, TryCatch #3 {all -> 0x00ec, blocks: (B:3:0x0005, B:5:0x0009, B:6:0x000c, B:9:0x0011, B:40:0x00e2, B:38:0x00db), top: B:52:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
        @abcd.ey(method = 488509600795416075L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void ei() {
            /*
                Method dump skipped, instructions count: 245
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.engine.Engine.c.ei():void");
        }

        @ey(method = 3840066759654270505L)
        private void er(FileEntry fileEntry) {
            try {
                if (oy) {
                    iy.tp(3153580342657248792L, this, fileEntry);
                }
                List<Language> languages = fileEntry.getCodeModel().getLanguages();
                boolean z = false;
                int i2 = 0;
                for (Language language : languages) {
                    int iSI = this.mb.errorTable.SI(fileEntry, language);
                    for (int i3 = 0; i3 < iSI; i3++) {
                        if (fileEntry.vJ() || aM(this.mb.errorTable.cb(fileEntry, language, i3))) {
                            i2++;
                        }
                    }
                }
                String name = fileEntry.getCodeModel().getName();
                SyntaxError[] syntaxErrorArr = new SyntaxError[i2];
                int i4 = 0;
                for (Language language2 : languages) {
                    String name2 = language2.getName();
                    int iSI2 = this.mb.errorTable.SI(fileEntry, language2);
                    int i5 = 0;
                    while (i5 < iSI2) {
                        if (fileEntry.vJ() || aM(this.mb.errorTable.cb(fileEntry, language2, i5))) {
                            syntaxErrorArr[i4] = new SyntaxError();
                            syntaxErrorArr[i4].cT = fileEntry.getId();
                            syntaxErrorArr[i4].q7 = i5;
                            syntaxErrorArr[i4].n5 = this.mb.fileSpace.getLanguageId(language2);
                            syntaxErrorArr[i4].w9 = name;
                            syntaxErrorArr[i4].hK = name2;
                            syntaxErrorArr[i4].Z1 = z;
                            syntaxErrorArr[i4].WB = XL(this.mb.errorTable.cb(fileEntry, language2, i5));
                            syntaxErrorArr[i4].mb = this.mb.errorTable.nw(fileEntry, language2, i5);
                            syntaxErrorArr[i4].jw = this.mb.errorTable.sG(fileEntry, language2, i5);
                            syntaxErrorArr[i4].fY = this.mb.errorTable.dx(fileEntry, language2, i5);
                            syntaxErrorArr[i4].qp = this.mb.errorTable.ro(fileEntry, language2, i5);
                            syntaxErrorArr[i4].k2 = this.mb.errorTable.KD(fileEntry, language2, i5);
                            syntaxErrorArr[i4].zh = this.mb.errorTable.ef(fileEntry, language2, i5);
                            int iSh = this.mb.errorTable.sh(fileEntry, language2, i5);
                            if (iSh > 0) {
                                syntaxErrorArr[i4].AL = new String[iSh];
                                for (int i6 = 0; i6 < iSh; i6++) {
                                    syntaxErrorArr[i4].AL[i6] = this.mb.errorTable.cn(fileEntry, language2, i5, i6);
                                }
                            }
                            i4++;
                        }
                        i5++;
                        z = false;
                    }
                }
                this.engine.Hw.Fd(fileEntry.getPathString(), syntaxErrorArr, fileEntry.I());
            } catch (Throwable th) {
                if (aX) {
                    iy.j3(th, 3153580342657248792L, this, fileEntry);
                }
                throw th;
            }
        }

        @ey(method = -215889452459751405L)
        private void gW() {
            try {
                if (oy) {
                    iy.gn(-1433452454604028800L, this);
                }
                if (this.engine.ko) {
                    this.mb.KD.VH(this.engine.Ev);
                    return;
                }
                FileEntry fileEntryLg = this.mb.fileSpace.lg(this.engine.jJ);
                if (fileEntryLg.I() && fileEntryLg.canCodeAnalyzer()) {
                    if (this.engine.hz) {
                        this.mb.KD.u7(fileEntryLg, this.engine.Eq);
                        return;
                    }
                    if (this.engine.oY) {
                        this.mb.cn.Hw(fileEntryLg, this.engine.CU, this.engine.Xa, true);
                        return;
                    }
                    if (this.engine.ye) {
                        this.mb.cn.FH(fileEntryLg, this.engine.CU, this.engine.Xa);
                        return;
                    }
                    if (this.engine.aq) {
                        this.mb.cn.u7(fileEntryLg, this.engine.CU, this.engine.Xa, true);
                        return;
                    }
                    if (this.engine.jO) {
                        this.mb.cn.DW(fileEntryLg, this.engine.CU, this.engine.Xa, true);
                    } else if (this.engine.FN) {
                        this.mb.cn.j6(fileEntryLg, this.engine.CU, this.engine.Xa, true);
                    } else {
                        this.mb.KD.gn(fileEntryLg, this.engine.CU, this.engine.Xa, this.engine.Eq);
                    }
                }
            } catch (Throwable th) {
                if (aX) {
                    iy.aM(th, -1433452454604028800L, this);
                }
                throw th;
            }
        }

        @ey(method = -2699505144802648832L)
        private String gn() {
            try {
                if (oy) {
                    iy.gn(-4035731555239169331L, this);
                }
                return this.engine.J0 + File.separator + "." + Long.toHexString(this.WB.Hw() ^ this.engine.codeModelsFactory.getId()) + tp();
            } catch (Throwable th) {
                if (aX) {
                    iy.aM(th, -4035731555239169331L, this);
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00ca A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #0 {all -> 0x00d4, blocks: (B:3:0x0005, B:5:0x0009, B:6:0x000c, B:37:0x00ca, B:35:0x00ae), top: B:44:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
        @abcd.ey(method = 4143379093251347200L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void j3() {
            /*
                r8 = this;
                r0 = -1472736937936701927(0xeb8fc98eceafb619, double:-1.3062945602985588E210)
                boolean r2 = com.aide.engine.Engine.c.oy     // Catch: java.lang.Throwable -> Ld4
                if (r2 == 0) goto Lc
                abcd.iy.gn(r0, r8)     // Catch: java.lang.Throwable -> Ld4
            Lc:
                r2 = 1
                r8.eU = r2     // Catch: java.lang.Throwable -> Ld4
                r3 = 0
                com.aide.engine.Engine r4 = r8.engine     // Catch: java.lang.Throwable -> Lab
                boolean r4 = com.aide.engine.Engine.j6(r4)     // Catch: java.lang.Throwable -> Lab
                if (r4 == 0) goto La3
                com.aide.engine.EngineSolution r4 = r8.WB     // Catch: java.lang.Throwable -> Lab
                if (r4 == 0) goto L9b
                com.aide.engine.Engine r3 = r8.engine     // Catch: java.lang.Throwable -> L99
                com.aide.engine.d r3 = com.aide.engine.Engine.qP(r3)     // Catch: java.lang.Throwable -> L99
                r3.xg()     // Catch: java.lang.Throwable -> L99
                java.lang.String r3 = r8.gn()     // Catch: java.lang.Throwable -> L99
                java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L99
                r4.<init>(r3)     // Catch: java.lang.Throwable -> L99
                boolean r4 = r4.exists()     // Catch: java.lang.Throwable -> L99
                if (r4 == 0) goto L82
                r8.u7()     // Catch: java.lang.Throwable -> L99
                java.util.zip.Inflater r4 = new java.util.zip.Inflater     // Catch: java.lang.Throwable -> L99
                r4.<init>()     // Catch: java.lang.Throwable -> L99
                com.aide.codemodel.api.collections.StoreInputStream r5 = new com.aide.codemodel.api.collections.StoreInputStream     // Catch: java.lang.Throwable -> L99
                r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L99
                java.lang.String r4 = r5.readUTF()     // Catch: java.lang.Throwable -> L7d
                java.lang.String r6 = "3.0_35"
                boolean r4 = r4.equals(r6)     // Catch: java.lang.Throwable -> L7d
                if (r4 == 0) goto L74
                com.aide.codemodel.AIDEModel r4 = r8.mb     // Catch: java.lang.Throwable -> L7d
                r4.load(r5)     // Catch: java.lang.Throwable -> L7d
                java.io.PrintStream r4 = java.lang.System.out     // Catch: java.lang.Throwable -> L7d
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
                r6.<init>()     // Catch: java.lang.Throwable -> L7d
                java.lang.String r7 = "Model loaded "
                r6.append(r7)     // Catch: java.lang.Throwable -> L7d
                r6.append(r3)     // Catch: java.lang.Throwable -> L7d
                java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L7d
                r4.println(r3)     // Catch: java.lang.Throwable -> L7d
                r5.close()     // Catch: java.lang.Throwable -> L99
                r8.Hw()     // Catch: java.lang.Throwable -> L99
                r8.VH()     // Catch: java.lang.Throwable -> L99
                r8.e3 = r2     // Catch: java.lang.Throwable -> L99
                goto Lc8
            L74:
                r5.close()     // Catch: java.lang.Throwable -> L7d
                java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L7d
                r3.<init>()     // Catch: java.lang.Throwable -> L7d
                throw r3     // Catch: java.lang.Throwable -> L7d
            L7d:
                r3 = move-exception
                r5.close()     // Catch: java.lang.Throwable -> L99
                throw r3     // Catch: java.lang.Throwable -> L99
            L82:
                java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L99
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
                r5.<init>()     // Catch: java.lang.Throwable -> L99
                java.lang.String r6 = "Cache file does not exist: "
                r5.append(r6)     // Catch: java.lang.Throwable -> L99
                r5.append(r3)     // Catch: java.lang.Throwable -> L99
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L99
                r4.<init>(r3)     // Catch: java.lang.Throwable -> L99
                throw r4     // Catch: java.lang.Throwable -> L99
            L99:
                r3 = move-exception
                goto Lae
            L9b:
                java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> Lab
                java.lang.String r4 = "No solution"
                r2.<init>(r4)     // Catch: java.lang.Throwable -> Lab
                throw r2     // Catch: java.lang.Throwable -> Lab
            La3:
                java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> Lab
                java.lang.String r4 = "No persistence mode"
                r2.<init>(r4)     // Catch: java.lang.Throwable -> Lab
                throw r2     // Catch: java.lang.Throwable -> Lab
            Lab:
                r2 = move-exception
                r3 = r2
                r2 = 0
            Lae:
                java.io.PrintStream r4 = java.lang.System.out     // Catch: java.lang.Throwable -> Ld4
                r3.printStackTrace(r4)     // Catch: java.lang.Throwable -> Ld4
                com.aide.engine.Engine r3 = r8.engine     // Catch: java.lang.Throwable -> Ld4
                com.aide.engine.d r3 = com.aide.engine.Engine.qP(r3)     // Catch: java.lang.Throwable -> Ld4
                r3.eU()     // Catch: java.lang.Throwable -> Ld4
                r8.a8()     // Catch: java.lang.Throwable -> Ld4
                r8.u7()     // Catch: java.lang.Throwable -> Ld4
                r8.Hw()     // Catch: java.lang.Throwable -> Ld4
                r8.VH()     // Catch: java.lang.Throwable -> Ld4
            Lc8:
                if (r2 == 0) goto Ld3
                com.aide.engine.Engine r2 = r8.engine     // Catch: java.lang.Throwable -> Ld4
                com.aide.engine.d r2 = com.aide.engine.Engine.qP(r2)     // Catch: java.lang.Throwable -> Ld4
                r2.ct()     // Catch: java.lang.Throwable -> Ld4
            Ld3:
                return
            Ld4:
                r2 = move-exception
                boolean r3 = com.aide.engine.Engine.c.aX
                if (r3 == 0) goto Ldc
                abcd.iy.aM(r2, r0, r8)
            Ldc:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.engine.Engine.c.j3():void");
        }

        @ey(method = -5269947878442396821L)
        private void lg() {
            try {
                if (oy) {
                    iy.gn(2242005458565715752L, this);
                }
                this.engine.Hw.eU();
                this.sg.clear();
                this.sg.u7(this.mb.fileSpace.KD());
                SetOfFileEntry setOfFileEntrySf = this.mb.errorTable.Sf();
                setOfFileEntrySf.j6.init();
                while (setOfFileEntrySf.j6.hasMoreElements()) {
                    FileEntry fileEntryNextKey = setOfFileEntrySf.j6.nextKey();
                    if (this.mb.errorTable.vy(fileEntryNextKey)) {
                        er(fileEntryNextKey);
                    }
                }
                this.engine.Hw.Of();
            } catch (Throwable th) {
                if (aX) {
                    iy.aM(th, 2242005458565715752L, this);
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
        @abcd.ey(method = -715594731048553284L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void nw() {
            /*
                Method dump skipped, instructions count: 5400
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.engine.Engine.c.nw():void");
        }

        @ey(method = 64379176577176279L)
        private void rN() {
            try {
                if (oy) {
                    iy.gn(-1746710697658219524L, this);
                }
                this.engine.Hw.sT();
                this.sg.clear();
                this.sg.u7(this.mb.fileSpace.KD());
                this.sg.j6.init();
                while (this.sg.j6.hasMoreElements()) {
                    FileEntry fileEntryNextKey = this.sg.j6.nextKey();
                    if (this.mb.errorTable.vJ(fileEntryNextKey) > 0) {
                        yS(fileEntryNextKey);
                    }
                }
                this.engine.Hw.hp();
            } catch (Throwable th) {
                if (aX) {
                    iy.aM(th, -1746710697658219524L, this);
                }
                throw th;
            }
        }

        @ey(method = 3075104255071599760L)
        private String tp() {
            try {
                if (!oy) {
                    return ".cgc";
                }
                iy.gn(2987165611456167669L, this);
                return ".cgc";
            } catch (Throwable th) {
                if (aX) {
                    iy.aM(th, 2987165611456167669L, this);
                }
                throw th;
            }
        }

        @ey(method = 3898120814645633304L)
        private void u7() {
            try {
                if (oy) {
                    iy.gn(-3495159258486528129L, this);
                }
                we();
                J0();
                this.e3 = false;
                this.engine.ct = new HashMap();
                a aVar = null;
                this.jw = new h(this, aVar);
                this.fY = new j(this, aVar);
                this.k2 = new HighlighterCallback(this, aVar);
                this.qp = new k(this, aVar);
                this.zh = new l(this, aVar);
                this.AL = new b(this, aVar);
                this.w9 = new i(this, aVar);
                this.hK = new p(this, aVar);
                this.cT = new C0048c(this, aVar);
                this.q7 = new a(this, aVar);
                this.Z1 = new d(this, aVar);
                this.n5 = new o(this, aVar);
                this.Q6 = new n(this, aVar);
                this.kf = new f(this, aVar);
                this.Jl = new g(this, aVar);
                this.iW = new m(this, aVar);
                this.mb = new AIDEModel(this.jw, this.fY, this.qp, this.k2, this.zh, this.AL, this.w9, this.hK, this.cT, this.q7, this.Z1, this.n5, this.Q6, this.kf, this.iW, this.Jl);
                this.sg = new SetOfFileEntry(this.mb.fileSpace);
                this.pO = new SetOfFileEntry(this.mb.fileSpace);
                this.fN = new SetOfFileEntry(this.mb.fileSpace);
                this.Gj = new FunctionOfIntLong();
            } catch (Throwable th) {
                if (aX) {
                    iy.aM(th, -3495159258486528129L, this);
                }
                throw th;
            }
        }

        @ey(method = -663572182917535308L)
        private void vy(String str) {
            long length;
            try {
                if (oy) {
                    iy.tp(21653516417769379L, this, str);
                }
                if (this.engine.we && new File(this.engine.J0).exists()) {
                    do {
                        length = 0;
                        long j2 = Long.MAX_VALUE;
                        String str2 = "";
                        String[] list = new File(this.engine.J0).list();
                        if (list != null) {
                            for (int i2 = 0; i2 < list.length; i2++) {
                                if (list[i2].endsWith(tp())) {
                                    String str3 = this.engine.J0 + File.separator + list[i2];
                                    if (new File(str3).exists() && new File(str3).isFile()) {
                                        length += new File(str3).length();
                                        long jLastModified = new File(str3).lastModified();
                                        if (jLastModified < j2 && !str3.equals(str)) {
                                            str2 = str3;
                                            j2 = jLastModified;
                                        }
                                    }
                                }
                            }
                            if (str2.length() > 0 && length > this.engine.J8) {
                                System.out.println("Deleted " + str2);
                                new File(str2).delete();
                            }
                        }
                        if (str2.length() <= 0) {
                            return;
                        }
                    } while (length > this.engine.J8);
                }
            } catch (Throwable th) {
                if (aX) {
                    iy.j3(th, 21653516417769379L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -734376641172094845L)
        private void we() {
            try {
                if (oy) {
                    iy.gn(-2375131993945472608L, this);
                }
                this.engine.ct = null;
                this.sg = null;
                this.pO = null;
                this.fN = null;
                this.mb = null;
                this.jw = null;
                this.fY = null;
                this.AL = null;
                this.w9 = null;
                this.k2 = null;
                this.qp = null;
                this.zh = null;
                this.hK = null;
                this.cT = null;
                this.q7 = null;
                this.Z1 = null;
                this.n5 = null;
                this.Q6 = null;
                this.kf = null;
                this.Jl = null;
                this.iW = null;
            } catch (Throwable th) {
                if (aX) {
                    iy.aM(th, -2375131993945472608L, this);
                }
                throw th;
            }
        }

        @ey(method = 5962788473408347295L)
        private void yS(FileEntry fileEntry) {
            try {
                if (oy) {
                    iy.tp(5241238754648263480L, this, fileEntry);
                }
                int iVJ = this.mb.errorTable.vJ(fileEntry);
                int i2 = 0;
                for (int i3 = 0; i3 < iVJ; i3++) {
                    if (fileEntry.vJ() || aM(this.mb.errorTable.x9(fileEntry, i3))) {
                        i2++;
                    }
                }
                SyntaxError[] syntaxErrorArr = new SyntaxError[i2];
                int i4 = 0;
                int i5 = 0;
                while (i4 < iVJ) {
                    if (fileEntry.vJ() || aM(this.mb.errorTable.x9(fileEntry, i4))) {
                        syntaxErrorArr[i4] = new SyntaxError();
                        syntaxErrorArr[i5].cT = fileEntry.getId();
                        syntaxErrorArr[i5].q7 = i4;
                        syntaxErrorArr[i5].Z1 = true;
                        syntaxErrorArr[i5].WB = XL(this.mb.errorTable.x9(fileEntry, i4));
                        syntaxErrorArr[i5].jw = this.mb.errorTable.sy(fileEntry, i4);
                        syntaxErrorArr[i5].fY = this.mb.errorTable.Qq(fileEntry, i4);
                        syntaxErrorArr[i5].qp = this.mb.errorTable.Mz(fileEntry, i4);
                        syntaxErrorArr[i5].k2 = this.mb.errorTable.g3(fileEntry, i4);
                        syntaxErrorArr[i5].zh = this.mb.errorTable.aj(fileEntry, i4);
                        int iCa = this.mb.errorTable.ca(fileEntry, i4);
                        if (iCa > 0) {
                            syntaxErrorArr[i5].AL = new String[iCa];
                            for (int i6 = 0; i6 < iCa; i6++) {
                                syntaxErrorArr[i5].AL[i6] = this.mb.errorTable.I(fileEntry, i4, i6);
                            }
                        }
                    }
                    i4++;
                    i5++;
                }
                this.engine.Hw.PT(fileEntry.getPathString(), syntaxErrorArr);
            } catch (Throwable th) {
                if (aX) {
                    iy.j3(th, 5241238754648263480L, this, fileEntry);
                }
                throw th;
            }
        }

        @ey(method = 619959464311702704L)
        public void Hw() {
            try {
                if (oy) {
                    iy.gn(-210495840690377715L, this);
                }
                this.mb.tp(this.engine.codeModelsFactory.makeCodeModels(this.mb, this.WB != null ? this.WB.codeModelNames : new ArrayList<>()));
            } catch (Throwable th) {
                if (aX) {
                    iy.aM(th, -210495840690377715L, this);
                }
                throw th;
            }
        }

        @ey(method = -2439868353938705512L)
        public void VH() {
            try {
                if (oy) {
                    iy.gn(-4901769172249322665L, this);
                }
                this.mb.U2(this.engine.oh, this.engine.Ej, this.engine.T6);
                if (this.WB != null) {
                    this.WB.FH(this.mb);
                } else {
                    this.mb.J0();
                }
            } catch (Throwable th) {
                if (aX) {
                    iy.aM(th, -4901769172249322665L, this);
                }
                throw th;
            }
        }

        @Override // java.lang.Runnable
        @ey(method = -200312351303551968L)
        public void run() {
            try {
                if (oy) {
                    iy.gn(1784882231727509805L, this);
                }
                synchronized (this.engine.lock1) {
                    while (this.engine.lg > 0) {
                        try {
                            this.engine.lock1.wait(200L);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
                j3();
                do {
                    synchronized (this.engine.lock1) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        while (!this.engine.er && !this.engine.cn && !this.engine.gW && !this.engine.P8 && !this.engine.g3 && !this.engine.Mz && !this.engine.I && !this.engine.ca && !this.engine.x9 && !this.engine.KD && !this.engine.ro && !this.engine.Sf && !this.engine.vJ && !this.engine.nw && !this.engine.shutdown && !this.engine.rN && !this.engine.br && !this.engine.XX && !this.engine.XG && !this.engine.OW && !this.engine.kQ && !this.engine.yO && !this.engine.sy && !this.engine.Qq && !this.engine.aj && !this.engine.lp && !this.engine.sh && !this.engine.cb && !this.engine.dx && !this.engine.vy && !this.engine.ef && !this.engine.yS) {
                            try {
                                this.engine.lock1.wait(5000L);
                            } catch (InterruptedException unused2) {
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            if (!this.mb.stopCallback.jO() && !this.eU && jCurrentTimeMillis2 > 300000) {
                                BT(true);
                                ei();
                            }
                        }
                        while (this.engine.lg > 0) {
                            try {
                                this.engine.lock1.wait(50L);
                            } catch (InterruptedException unused3) {
                            }
                        }
                        if (!this.engine.er && !this.engine.cn) {
                            boolean z = false;
                            boolean z2 = false;
                            boolean z3 = false;
                            boolean z4 = false;
                            while (true) {
                                z |= this.engine.KD;
                                z2 |= this.engine.cb;
                                z3 |= this.engine.P8;
                                z4 |= this.engine.yS;
                                Engine engine = this.engine;
                                Engine engine2 = this.engine;
                                Engine engine3 = this.engine;
                                this.engine.yS = false;
                                engine3.cb = false;
                                engine2.KD = false;
                                engine.P8 = false;
                                if (z) {
                                    try {
                                        this.engine.lock1.wait(20L);
                                    } catch (InterruptedException unused4) {
                                    }
                                } else if (z3 || z2) {
                                    this.engine.lock1.wait(50L);
                                } else if (z4) {
                                    this.engine.lock1.wait(2000L);
                                }
                                if (!this.engine.P8 && !this.engine.KD && !this.engine.cb && !this.engine.yS) {
                                    break;
                                }
                            }
                            this.engine.P8 = z3;
                            this.engine.KD = z;
                            this.engine.cb = z2;
                            this.engine.yS = z4;
                        }
                        this.engine.Mr = false;
                        this.engine.U2 = false;
                        this.engine.a8 = false;
                    }
                    nw();
                } while (!this.engine.shutdown);
            } catch (Throwable th) {
                if (aX) {
                    iy.aM(th, 1784882231727509805L, this);
                }
                throw th;
            }
        }

        @cy(clazz = 618473117572183064L, container = 618473117572183064L, user = true)
        private class k implements StructureCallback {

            @fy
            private static /* synthetic */ boolean FH;

            @gy
            private static /* synthetic */ boolean Hw;

            @dy(field = 71755701651486000L)
            final /* synthetic */ c DW;

            @dy(field = -805465463585668500L)
            private ArrayList<SourceEntity> j6;

            static {
                iy.Zo(k.class);
            }

            @ey(method = -590068154316852361L)
            private k(c cVar) {
                try {
                    if (FH) {
                        iy.tp(-1294332010630714423L, null, cVar);
                    }
                    this.DW = cVar;
                    this.j6 = new ArrayList<>();
                } catch (Throwable th) {
                    if (Hw) {
                        iy.j3(th, -1294332010630714423L, null, cVar);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.StructureCallback
            @ey(method = -232803384537060891L)
            public void DW(String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
                int i9;
                try {
                    if (FH) {
                        iy.QX(-1571382333104892453L, this, new Object[]{str, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                    }
                    ArrayList arrayList = new ArrayList(i8);
                    for (int i10 = 0; i10 < i8; i10++) {
                        arrayList.add(this.j6.get((this.j6.size() - i8) + i10));
                    }
                    for (int i11 = 0; i11 < i8; i11++) {
                        this.j6.remove(this.j6.size() - 1);
                    }
                    i9 = 10;
                    try {
                        this.j6.add(new SourceEntity(this.DW.mb, str, z, i, i2, i3, i4, i5, i6, i7, arrayList));
                    } catch (Throwable th) {
                        th = th;
                        if (Hw) {
                            Object[] objArr = new Object[i9];
                            objArr[0] = str;
                            objArr[1] = new Boolean(z);
                            objArr[2] = new Integer(i);
                            objArr[3] = new Integer(i2);
                            objArr[4] = new Integer(i3);
                            objArr[5] = new Integer(i4);
                            objArr[6] = new Integer(i5);
                            objArr[7] = new Integer(i6);
                            objArr[8] = new Integer(i7);
                            objArr[9] = new Integer(i8);
                            iy.rN(th, -1571382333104892453L, this, objArr);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i9 = 10;
                }
            }

            @Override // com.aide.codemodel.api.callback.StructureCallback
            @ey(method = -3022154545298527856L)
            public void FH(FileEntry fileEntry, int i) {
                try {
                    if (FH) {
                        iy.EQ(1123304350554712460L, this, fileEntry, new Integer(i));
                    }
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList.add(this.j6.get((this.j6.size() - i) + i2));
                    }
                    if (this.DW.engine.v5 != null) {
                        this.DW.engine.v5.Yi(fileEntry.getPathString(), fileEntry.getVersion(), arrayList);
                    }
                    this.j6.clear();
                } catch (Throwable th) {
                    if (Hw) {
                        iy.Mr(th, 1123304350554712460L, this, fileEntry, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.StructureCallback
            @ey(method = 4009737040209378128L)
            public void Hw(Entity entity, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
                int i9;
                try {
                    if (FH) {
                        iy.QX(279928140382985580L, this, new Object[]{entity, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                    }
                    ArrayList arrayList = new ArrayList(i8);
                    for (int i10 = 0; i10 < i8; i10++) {
                        arrayList.add(this.j6.get((this.j6.size() - i8) + i10));
                    }
                    for (int i11 = 0; i11 < i8; i11++) {
                        this.j6.remove(this.j6.size() - 1);
                    }
                    i9 = 9;
                    try {
                        this.j6.add(new SourceEntity(this.DW.mb, entity, i, i2, i3, i4, i5, i6, i7, arrayList));
                    } catch (Throwable th) {
                        th = th;
                        if (Hw) {
                            Object[] objArr = new Object[i9];
                            objArr[0] = entity;
                            objArr[1] = new Integer(i);
                            objArr[2] = new Integer(i2);
                            objArr[3] = new Integer(i3);
                            objArr[4] = new Integer(i4);
                            objArr[5] = new Integer(i5);
                            objArr[6] = new Integer(i6);
                            objArr[7] = new Integer(i7);
                            objArr[8] = new Integer(i8);
                            iy.rN(th, 279928140382985580L, this, objArr);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i9 = 9;
                }
            }

            @Override // com.aide.codemodel.api.callback.StructureCallback
            @ey(method = -258209442170866353L)
            public void Zo() {
                try {
                    if (FH) {
                        iy.gn(360352445115020121L, this);
                    }
                    this.j6.clear();
                } catch (Throwable th) {
                    if (Hw) {
                        iy.aM(th, 360352445115020121L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.StructureCallback
            @ey(method = -314095904149521216L)
            public void j6(Language language, int i) {
                try {
                    if (FH) {
                        iy.EQ(3276645795876234880L, this, language, new Integer(i));
                    }
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList.add(this.j6.get((this.j6.size() - i) + i2));
                    }
                    for (int i3 = 0; i3 < i; i3++) {
                        this.j6.remove(this.j6.size() - 1);
                    }
                    this.j6.add(new SourceEntity(this.DW.mb, language, arrayList));
                } catch (Throwable th) {
                    if (Hw) {
                        iy.Mr(th, 3276645795876234880L, this, language, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.StructureCallback
            @ey(method = -1453777227386367687L)
            public void v5(Entity entity, int i, int i2, int i3, int i4, int i5, int i6, int i7) throws Throwable {
                int i8;
                try {
                    if (FH) {
                        iy.QX(269189243264358375L, this, new Object[]{entity, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7)});
                    }
                    i8 = 8;
                    try {
                        this.j6.add(new SourceEntity(this.DW.mb, entity, i, i2, i3, i4, i5, i6, i7));
                    } catch (Throwable th) {
                        th = th;
                        if (Hw) {
                            Object[] objArr = new Object[i8];
                            objArr[0] = entity;
                            objArr[1] = new Integer(i);
                            objArr[2] = new Integer(i2);
                            objArr[3] = new Integer(i3);
                            objArr[4] = new Integer(i4);
                            objArr[5] = new Integer(i5);
                            objArr[6] = new Integer(i6);
                            objArr[7] = new Integer(i7);
                            iy.rN(th, 269189243264358375L, this, objArr);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i8 = 8;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = 375225741529910348L)
            /* synthetic */ k(c cVar, a aVar) {
                this(cVar);
                try {
                    if (FH) {
                        iy.EQ(1402040516580123344L, null, cVar, aVar);
                    }
                } catch (Throwable th) {
                    if (Hw) {
                        iy.Mr(th, 1402040516580123344L, null, cVar, aVar);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -1553976681540910025L, container = -1553976681540910025L, user = true)
        private class p implements UsageSearcherCallback {

            @gy
            private static /* synthetic */ boolean VH;

            @fy
            private static /* synthetic */ boolean Zo;

            @dy(field = -2376441394757661000L)
            private FileEntry DW;

            @dy(field = -2933028296189690184L)
            private Map<Language, SyntaxTreeStyles> FH;

            @dy(field = 3939137462651996859L)
            private List<String> Hw;

            @dy(field = -2470416631008321033L)
            private List<FindResult> j6;

            @dy(field = -207037413478456176L)
            final /* synthetic */ c v5;

            static {
                iy.Zo(p.class);
            }

            @ey(method = 410825052013511205L)
            private p(c cVar) {
                try {
                    if (Zo) {
                        iy.tp(910053416013669692L, null, cVar);
                    }
                    this.v5 = cVar;
                    this.FH = new HashMap();
                } catch (Throwable th) {
                    if (VH) {
                        iy.j3(th, 910053416013669692L, null, cVar);
                    }
                    throw th;
                }
            }

            @ey(method = 838448540352063088L)
            private void VH(FileEntry fileEntry) {
                try {
                    if (Zo) {
                        iy.tp(-187709941749810312L, this, fileEntry);
                    }
                    if (fileEntry != this.DW) {
                        gn();
                        this.DW = fileEntry;
                        try {
                            this.Hw = fileEntry.a8();
                            this.FH = new HashMap();
                            if (fileEntry.getCodeModel() != null) {
                                Reader reader = fileEntry.getReader();
                                try {
                                    Iterator<Language> it = fileEntry.getCodeModel().getLanguages().iterator();
                                    while (it.hasNext()) {
                                        this.FH.put(it.next(), this.v5.mb.U2.makeSyntaxTreeStyles());
                                    }
                                    fileEntry.getCodeModel().fillSyntaxTree(fileEntry, reader, this.FH);
                                    reader.close();
                                } catch (Throwable th) {
                                    reader.close();
                                    throw th;
                                }
                            }
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    if (VH) {
                        iy.j3(th2, -187709941749810312L, this, fileEntry);
                    }
                    throw th2;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
            @ey(method = -2401368739610848228L)
            private String Zo(int i) {
                try {
                    if (Zo) {
                        iy.u7(1426930185485556128L, this, i);
                    }
                    if (i < 0 || i > this.Hw.size()) {
                        return "";
                    }
                    String str = this.Hw.get(i);
                    if (str.length() <= 200) {
                        return str;
                    }
                    i = str.substring(0, 200);
                    return i;
                } catch (Throwable th) {
                    if (VH) {
                        iy.j3(th, 1426930185485556128L, this, new Integer(i));
                    }
                    throw th;
                }
            }

            @ey(method = 1362814563215293297L)
            private void gn() {
                try {
                    if (Zo) {
                        iy.gn(2370852699818803205L, this);
                    }
                    if (this.DW != null) {
                        Iterator<Language> it = this.DW.getCodeModel().getLanguages().iterator();
                        while (it.hasNext()) {
                            this.v5.mb.U2.DW(this.FH.get(it.next()));
                        }
                        this.DW = null;
                        this.FH = null;
                        this.Hw = null;
                    }
                } catch (Throwable th) {
                    if (VH) {
                        iy.aM(th, 2370852699818803205L, this);
                    }
                    throw th;
                }
            }

            @ey(method = -1975408946123818275L)
            private List<FindResult.Highlighting> v5(int i, int i2) {
                try {
                    if (Zo) {
                        iy.EQ(7421917420754031933L, this, new Integer(i), new Integer(i2));
                    }
                    ArrayList arrayList = new ArrayList();
                    if (this.DW.getCodeModel() != null) {
                        for (Language language : this.DW.getCodeModel().getLanguages()) {
                            SyntaxTreeStyles syntaxTreeStyles = this.FH.get(language);
                            Syntax syntax = language.getSyntax();
                            for (int i3 = 0; i3 < syntaxTreeStyles.size; i3++) {
                                if (syntaxTreeStyles.endColumns[i3] <= 200 && syntaxTreeStyles.startLines[i3] <= i && syntaxTreeStyles.endLines[i3] >= i2) {
                                    SyntaxStyleType syntaxStyleTypeWs = this.v5.Ws(syntax, syntaxTreeStyles.syntaxTags[i3]);
                                    if (syntaxStyleTypeWs != null) {
                                        arrayList.add(new FindResult.Highlighting(syntaxStyleTypeWs, syntaxTreeStyles.startLines[i3], syntaxTreeStyles.startColumns[i3], syntaxTreeStyles.endLines[i3], syntaxTreeStyles.endColumns[i3]));
                                    }
                                }
                            }
                            this.v5.mb.U2.DW(syntaxTreeStyles);
                        }
                    }
                    return arrayList;
                } catch (Throwable th) {
                    if (VH) {
                        iy.Mr(th, 7421917420754031933L, this, new Integer(i), new Integer(i2));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.UsageSearcherCallback
            @ey(method = 4768506041858638220L)
            public void DW() {
                try {
                    if (Zo) {
                        iy.gn(5532622169491470048L, this);
                    }
                    this.v5.engine.j6.ce(this.j6);
                    gn();
                } catch (Throwable th) {
                    if (VH) {
                        iy.aM(th, 5532622169491470048L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.UsageSearcherCallback
            @ey(method = -544449034967218425L)
            public void FH(String str) {
                try {
                    if (Zo) {
                        iy.tp(44610939854376735L, this, str);
                    }
                    this.v5.engine.j6.hz(str);
                } catch (Throwable th) {
                    if (VH) {
                        iy.j3(th, 44610939854376735L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.UsageSearcherCallback
            @ey(method = -4000857408567163193L)
            public void Hw() {
                try {
                    if (Zo) {
                        iy.gn(3022004783576702343L, this);
                    }
                    this.j6 = new ArrayList();
                    this.v5.engine.j6.Cz();
                    gn();
                } catch (Throwable th) {
                    if (VH) {
                        iy.aM(th, 3022004783576702343L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.UsageSearcherCallback
            @ey(method = -23735111743728204L)
            public void j6(FileEntry fileEntry, int i, int i2, int i3, int i4) {
                try {
                    if (Zo) {
                        iy.J8(-854155026434430960L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    if (i <= 0 || i != i3) {
                        return;
                    }
                    VH(fileEntry);
                    this.j6.add(new FindResult(fileEntry.getPathString(), Zo(i), v5(i, i3), i, i2, i4));
                } catch (Throwable th) {
                    if (VH) {
                        iy.lg(th, -854155026434430960L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = -59071536350852872L)
            /* synthetic */ p(c cVar, a aVar) {
                this(cVar);
                try {
                    if (Zo) {
                        iy.EQ(1065381060345064813L, null, cVar, aVar);
                    }
                } catch (Throwable th) {
                    if (VH) {
                        iy.Mr(th, 1065381060345064813L, null, cVar, aVar);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -110657526766071675L, container = -110657526766071675L, user = true)
        private class h implements OpenFileCallback {

            @fy
            private static /* synthetic */ boolean gn;

            @gy
            private static /* synthetic */ boolean u7;

            @dy(field = 2090442511216872524L)
            private Hashtable<String, z> DW;

            @dy(field = 3262070492891202696L)
            private SetOfFileEntry FH;

            @dy(field = -2106202524960669712L)
            private SetOfFileEntry Hw;

            @dy(field = -1792532614775099925L)
            final /* synthetic */ c VH;

            @dy(field = -1525415646889154196L)
            private HashtableOfInt<z> Zo;

            @dy(field = 3791849359358519595L)
            private Hashtable<String, z> j6;

            @dy(field = -278880864191794185L)
            private HashtableOfInt<OpenFile> v5;

            static {
                iy.Zo(h.class);
            }

            @ey(method = 58748469389021880L)
            private h(c cVar) {
                try {
                    if (gn) {
                        iy.tp(-409493191119777387L, null, cVar);
                    }
                    this.VH = cVar;
                    this.j6 = new Hashtable<>();
                    this.DW = new Hashtable<>();
                    this.v5 = new HashtableOfInt<>();
                    this.Zo = new HashtableOfInt<>();
                } catch (Throwable th) {
                    if (u7) {
                        iy.j3(th, -409493191119777387L, null, cVar);
                    }
                    throw th;
                }
            }

            @ey(method = 625255751233955444L)
            private void gn() {
                try {
                    if (gn) {
                        iy.gn(-1790359473747327548L, this);
                    }
                    if (this.Hw == null) {
                        this.Hw = new SetOfFileEntry(this.VH.mb.fileSpace);
                    }
                    if (this.FH == null) {
                        this.FH = new SetOfFileEntry(this.VH.mb.fileSpace);
                    }
                    if (this.DW != null) {
                        if (!this.DW.equals(this.j6)) {
                            HashtableOfInt<OpenFile> hashtableOfInt = new HashtableOfInt<>();
                            this.Zo.FH();
                            this.Hw.clear();
                            Enumeration<String> enumerationKeys = this.j6.keys();
                            while (enumerationKeys.hasMoreElements()) {
                                String strNextElement = enumerationKeys.nextElement();
                                z zVar = this.j6.get(strNextElement);
                                FileEntry fileEntryLg = this.VH.mb.fileSpace.lg(strNextElement);
                                this.Hw.gn(fileEntryLg);
                                this.Zo.VH(fileEntryLg.getId(), zVar);
                                fileEntryLg.synchronize();
                                if (this.v5.Hw(fileEntryLg.getId())) {
                                    hashtableOfInt.VH(fileEntryLg.getId(), this.v5.v5(fileEntryLg.getId()));
                                } else {
                                    hashtableOfInt.VH(fileEntryLg.getId(), new OpenFile());
                                }
                            }
                            this.v5 = hashtableOfInt;
                            this.FH.clear();
                            this.Zo.j6.DW();
                            while (this.Zo.j6.j6()) {
                                this.FH.gn(this.VH.mb.fileSpace.getFileEntry(this.Zo.j6.FH()).getParentDirectory());
                            }
                        }
                        this.DW = null;
                    }
                } catch (Throwable th) {
                    if (u7) {
                        iy.aM(th, -1790359473747327548L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.OpenFileCallback
            @ey(method = -5341617038430173664L)
            public long DW(FileEntry fileEntry) {
                try {
                    if (gn) {
                        iy.tp(6159709620455143200L, this, fileEntry);
                    }
                    gn();
                    return this.v5.v5(fileEntry.getId()).FH;
                } catch (Throwable th) {
                    if (u7) {
                        iy.j3(th, 6159709620455143200L, this, fileEntry);
                    }
                    throw th;
                }
            }

            @ey(method = -2598129739363305268L)
            public SetOfFileEntry VH() {
                try {
                    if (gn) {
                        iy.gn(-752453669599154516L, this);
                    }
                    gn();
                    return this.Hw;
                } catch (Throwable th) {
                    if (u7) {
                        iy.aM(th, -752453669599154516L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 1060393846359568160L)
            public boolean Zo() {
                try {
                    if (gn) {
                        iy.gn(-114512426155367784L, this);
                    }
                    this.v5.j6.DW();
                    while (this.v5.j6.j6()) {
                        if (this.v5.j6.Hw().FH != this.Zo.v5(this.VH.mb.fileSpace.getFileEntry(this.v5.j6.FH()).getId()).we()) {
                            return false;
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    if (u7) {
                        iy.aM(th, -114512426155367784L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.OpenFileCallback
            @ey(method = 6286641078751226559L)
            public long getOpenFileSize(FileEntry fileEntry) {
                try {
                    if (gn) {
                        iy.tp(-3215709139978150929L, this, fileEntry);
                    }
                    gn();
                    return this.v5.v5(fileEntry.getId()).length;
                } catch (Throwable th) {
                    if (u7) {
                        iy.j3(th, -3215709139978150929L, this, fileEntry);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.OpenFileCallback
            @ey(method = -77545822989261560L)
            public boolean isOpenFile(FileEntry fileEntry) {
                try {
                    if (gn) {
                        iy.tp(1429706406955066896L, this, fileEntry);
                    }
                    gn();
                    return this.v5.Hw(fileEntry.getId());
                } catch (Throwable th) {
                    if (u7) {
                        iy.j3(th, 1429706406955066896L, this, fileEntry);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.OpenFileCallback
            @ey(method = 5796805601530434645L)
            public Reader j6(FileEntry fileEntry) {
                try {
                    if (gn) {
                        iy.tp(4332080899815563853L, this, fileEntry);
                    }
                    gn();
                    OpenFile openFileV5 = this.v5.v5(fileEntry.getId());
                    return new CharArrayReader(openFileV5.charArray, 0, openFileV5.length);
                } catch (Throwable th) {
                    if (u7) {
                        iy.j3(th, 4332080899815563853L, this, fileEntry);
                    }
                    throw th;
                }
            }

            @ey(method = -3408977660349026952L)
            public void u7(Hashtable<String, z> hashtable) {
                try {
                    if (gn) {
                        iy.tp(-3459514769658946512L, this, hashtable);
                    }
                    this.DW = this.j6;
                    this.j6 = new Hashtable<>();
                    Enumeration<String> enumerationKeys = hashtable.keys();
                    while (enumerationKeys.hasMoreElements()) {
                        String strNextElement = enumerationKeys.nextElement();
                        this.j6.put(strNextElement, hashtable.get(strNextElement));
                    }
                } catch (Throwable th) {
                    if (u7) {
                        iy.j3(th, -3459514769658946512L, this, hashtable);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.OpenFileCallback
            @ey(method = -2921904335313624192L)
            public void v5() {
                try {
                    if (gn) {
                        iy.gn(-1861525063994178464L, this);
                    }
                    gn();
                    this.v5.j6.DW();
                    while (this.v5.j6.j6()) {
                        FileEntry fileEntry = this.VH.mb.fileSpace.getFileEntry(this.v5.j6.FH());
                        OpenFile openFileHw = this.v5.j6.Hw();
                        if (openFileHw.FH == 0) {
                            this.Zo.v5(fileEntry.getId()).J8(fileEntry.getDiskVersion());
                        }
                        if (openFileHw.FH != this.Zo.v5(fileEntry.getId()).we()) {
                            try {
                                this.Zo.v5(fileEntry.getId()).J0(openFileHw);
                            } catch (IOException unused) {
                                openFileHw.length = 0;
                                openFileHw.FH = 0L;
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (u7) {
                        iy.aM(th, -1861525063994178464L, this);
                    }
                    throw th;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = -220207723574024445L)
            /* synthetic */ h(c cVar, a aVar) {
                this(cVar);
                try {
                    if (gn) {
                        iy.EQ(-2944156848407209800L, null, cVar, aVar);
                    }
                } catch (Throwable th) {
                    if (u7) {
                        iy.Mr(th, -2944156848407209800L, null, cVar, aVar);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -908926651448273920L, container = -908926651448273920L, user = true)
        private class HighlighterCallback implements com.aide.codemodel.api.callback.HighlighterCallback {

            @fy
            private static /* synthetic */ boolean gn;

            @gy
            private static /* synthetic */ boolean u7;

            @dy(field = -55627988489538255L)
            final /* synthetic */ c VH;

            @dy(field = 2132272042644084768L)
            private int[] endColumns;

            @dy(field = -28343950904655384L)
            private int[] endLines;

            @dy(field = 12603267439315920L)
            private int size;

            @dy(field = -3045146863124031345L)
            private int[] startColumns;

            @dy(field = 4495350752567906495L)
            private int[] startLines;

            @dy(field = 1071814919626566595L)
            private SyntaxStyleType[] syntaxStyleTypes;

            static {
                iy.Zo(HighlighterCallback.class);
            }

            @ey(method = 488600160395970048L)
            private HighlighterCallback(c cVar) {
                try {
                    if (gn) {
                        iy.tp(2502569671236302765L, null, cVar);
                    }
                    this.VH = cVar;
                    this.syntaxStyleTypes = new SyntaxStyleType[10000];
                    this.startLines = new int[10000];
                    this.startColumns = new int[10000];
                    this.endLines = new int[10000];
                    this.endColumns = new int[10000];
                } catch (Throwable th) {
                    if (u7) {
                        iy.j3(th, 2502569671236302765L, null, cVar);
                    }
                    throw th;
                }
            }

            @ey(method = 1310049252531812871L)
            private void EQ(SyntaxStyleType syntaxStyleType, int i, int i2, int i3, int i4) {
                try {
                    if (gn) {
                        iy.J8(56241465750005408L, this, syntaxStyleType, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    ensureExplicitCapacity(this.size + 1);
                    if (i > 0) {
                        this.syntaxStyleTypes[this.size] = syntaxStyleType;
                        this.startLines[this.size] = i;
                        this.startColumns[this.size] = i2;
                        this.endLines[this.size] = i3;
                        this.endColumns[this.size] = i4;
                        this.size++;
                    }
                } catch (Throwable th) {
                    if (u7) {
                        iy.lg(th, 56241465750005408L, this, syntaxStyleType, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @ey(method = 1130508938040676815L)
            private void ensureExplicitCapacity(int i) {
                try {
                    if (gn) {
                        iy.u7(-1353418910230944492L, this, i);
                    }
                    if (this.syntaxStyleTypes.length <= i) {
                        int i2 = (i * 5) / 4;
                        SyntaxStyleType[] syntaxStyleTypeArr = new SyntaxStyleType[i2];
                        System.arraycopy(this.syntaxStyleTypes, 0, syntaxStyleTypeArr, 0, this.size);
                        this.syntaxStyleTypes = syntaxStyleTypeArr;
                        int[] iArr = new int[i2];
                        System.arraycopy(this.startLines, 0, iArr, 0, this.size);
                        this.startLines = iArr;
                        int[] iArr2 = new int[i2];
                        System.arraycopy(this.endLines, 0, iArr2, 0, this.size);
                        this.endLines = iArr2;
                        int[] iArr3 = new int[i2];
                        System.arraycopy(this.startColumns, 0, iArr3, 0, this.size);
                        this.startColumns = iArr3;
                        int[] iArr4 = new int[i2];
                        System.arraycopy(this.endColumns, 0, iArr4, 0, this.size);
                        this.endColumns = iArr4;
                    }
                } catch (Throwable th) {
                    if (u7) {
                        iy.j3(th, -1353418910230944492L, this, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.HighlighterCallback
            @ey(method = 4987853366862212892L)
            public void addSyntaxTreeStyles(Language language, SyntaxTreeStyles syntaxTreeStyles) {
                try {
                    if (gn) {
                        iy.EQ(2553904192241738235L, this, language, syntaxTreeStyles);
                    }
                    ensureExplicitCapacity(this.size + syntaxTreeStyles.size);
                    System.arraycopy(syntaxTreeStyles.startLines, 0, this.startLines, this.size, syntaxTreeStyles.size);
                    System.arraycopy(syntaxTreeStyles.endLines, 0, this.endLines, this.size, syntaxTreeStyles.size);
                    System.arraycopy(syntaxTreeStyles.startColumns, 0, this.startColumns, this.size, syntaxTreeStyles.size);
                    System.arraycopy(syntaxTreeStyles.endColumns, 0, this.endColumns, this.size, syntaxTreeStyles.size);
                    Syntax syntax = language.getSyntax();
                    for (int i = 0; i < syntaxTreeStyles.size; i++) {
                        int i2 = syntaxTreeStyles.syntaxTags[i];
                        if (syntaxTreeStyles.startLines[i] <= 0 || syntaxTreeStyles.endLines[i] <= 0) {
                            this.syntaxStyleTypes[this.size] = null;
                        } else {
                            this.syntaxStyleTypes[this.size] = this.VH.Ws(syntax, i2);
                        }
                        this.size++;
                    }
                } catch (Throwable th) {
                    if (u7) {
                        iy.Mr(th, 2553904192241738235L, this, language, syntaxTreeStyles);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.HighlighterCallback
            @ey(method = 54620787646320441L)
            public void delegateFound(Language language, int i, int i2, int i3, int i4) {
                try {
                    if (gn) {
                        iy.J8(4585916131710223260L, this, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    EQ(SyntaxStyleType.DELEGATE_IDENTIFIER, i, i2, i3, i4);
                } catch (Throwable th) {
                    if (u7) {
                        iy.lg(th, 4585916131710223260L, this, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.HighlighterCallback
            @ey(method = -1767480542439033600L)
            public void fileFinished(FileEntry fileEntry) {
                try {
                    if (gn) {
                        iy.tp(261243887538549513L, this, fileEntry);
                    }
                    if (this.VH.engine.u7 != null) {
                        this.VH.engine.u7.j6(fileEntry.getPathString(), 0, fileEntry.getVersion(), this.syntaxStyleTypes, this.startLines, this.startColumns, this.endLines, this.endColumns, this.size);
                    }
                } catch (Throwable th) {
                    if (u7) {
                        iy.j3(th, 261243887538549513L, this, fileEntry);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.HighlighterCallback
            @ey(method = -1028807787589877595L)
            public void identifierFound(Language language, int i, int i2, int i3, int i4) {
                try {
                    if (gn) {
                        iy.J8(1661776183233478884L, this, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    EQ(SyntaxStyleType.IDENTIFIER, i, i2, i3, i4);
                } catch (Throwable th) {
                    if (u7) {
                        iy.lg(th, 1661776183233478884L, this, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.HighlighterCallback
            @ey(method = 2889757317592847711L)
            public void j6() {
                try {
                    if (gn) {
                        iy.gn(-1157791983238694304L, this);
                    }
                    this.size = 0;
                } catch (Throwable th) {
                    if (u7) {
                        iy.aM(th, -1157791983238694304L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.HighlighterCallback
            @ey(method = 1141463130132628671L)
            public void keywordFound(Language language, int i, int i2, int i3, int i4) {
                try {
                    if (gn) {
                        iy.J8(-4753923421749055872L, this, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    EQ(SyntaxStyleType.KEYWORD, i, i2, i3, i4);
                } catch (Throwable th) {
                    if (u7) {
                        iy.lg(th, -4753923421749055872L, this, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.HighlighterCallback
            @ey(method = -2548858027409602819L)
            public void namespaceFound(Language language, int i, int i2, int i3, int i4) {
                try {
                    if (gn) {
                        iy.J8(1504317089438338392L, this, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    EQ(SyntaxStyleType.NAMESPACE_IDENTIFIER, i, i2, i3, i4);
                } catch (Throwable th) {
                    if (u7) {
                        iy.lg(th, 1504317089438338392L, this, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.HighlighterCallback
            @ey(method = -2766760325221180276L)
            public void releaseSyntaxTree() {
                try {
                    if (gn) {
                        iy.gn(3446151062278740075L, this);
                    }
                    this.size = 0;
                } catch (Throwable th) {
                    if (u7) {
                        iy.aM(th, 3446151062278740075L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.HighlighterCallback
            @ey(method = -1254729357268200660L)
            public void typeFound(Language language, int i, int i2, int i3, int i4) {
                try {
                    if (gn) {
                        iy.J8(-557731047688449919L, this, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    EQ(SyntaxStyleType.TYPE_IDENTIFIER, i, i2, i3, i4);
                } catch (Throwable th) {
                    if (u7) {
                        iy.lg(th, -557731047688449919L, this, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.HighlighterCallback
            @ey(method = 2092694370804269064L)
            public void unifedLineFound(FileEntry fileEntry, int i) {
                try {
                    if (gn) {
                        iy.EQ(292364020693898623L, this, fileEntry, new Integer(i));
                    }
                    if (this.VH.engine.u7 != null) {
                        this.VH.engine.u7.DW(fileEntry.getPathString(), i, fileEntry.getVersion(), this.syntaxStyleTypes, this.startLines, this.startColumns, this.endLines, this.endColumns, this.size);
                    }
                } catch (Throwable th) {
                    if (u7) {
                        iy.Mr(th, 292364020693898623L, this, fileEntry, new Integer(i));
                    }
                    throw th;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = -548814338124700803L)
            /* synthetic */ HighlighterCallback(c cVar, a aVar) {
                this(cVar);
                try {
                    if (gn) {
                        iy.EQ(-2358651439577587088L, null, cVar, aVar);
                    }
                } catch (Throwable th) {
                    if (u7) {
                        iy.Mr(th, -2358651439577587088L, null, cVar, aVar);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 2444273338061260125L, container = 2444273338061260125L, user = true)
        private class b implements CodeCompleterCallback {

            @gy
            private static /* synthetic */ boolean QX;

            @fy
            private static /* synthetic */ boolean Ws;

            @dy(field = -2677892403008453720L)
            private ArrayList<SourceEntity> DW;

            @dy(field = 11388831110634260L)
            private ClassType EQ;

            @dy(field = 3212825748532319244L)
            private Entity FH;

            @dy(field = 2322720759163722397L)
            private String Hw;

            @dy(field = -1129742743761666276L)
            private Map<ClassType, SourceEntity> J0;

            @dy(field = 576880182431847640L)
            final /* synthetic */ c J8;

            @dy(field = -6389594829033375288L)
            private ClassType VH;

            @dy(field = 5635491904047738271L)
            private boolean Zo;

            @dy(field = -5088736116131058856L)
            private long gn;

            @dy(field = -3605182256950186320L)
            private ArrayList<SourceEntity> j6;

            @dy(field = 1485466906252771809L)
            private boolean tp;

            @dy(field = 5006613311128390780L)
            private ArrayList<SourceEntity> u7;

            @dy(field = 2345757757609968104L)
            private ArrayList<SourceEntity> v5;

            @dy(field = 56828532749749420L)
            private long we;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 664006692089556695L)
            private b(c cVar) {
                try {
                    if (Ws) {
                        iy.tp(-148361457631176251L, null, cVar);
                    }
                    this.J8 = cVar;
                    this.j6 = new ArrayList<>();
                    this.DW = new ArrayList<>();
                    this.v5 = new ArrayList<>();
                    this.u7 = new ArrayList<>();
                    this.J0 = new HashMap();
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, -148361457631176251L, null, cVar);
                    }
                    throw th;
                }
            }

            @ey(method = 1202365084701698636L)
            private void lg(SourceEntity sourceEntity) {
                try {
                    if (Ws) {
                        iy.tp(-2176409211937784265L, this, sourceEntity);
                    }
                    if (this.tp) {
                        this.u7.add(sourceEntity);
                    }
                    if (this.Zo) {
                        this.v5.add(sourceEntity);
                    }
                    this.DW.add(sourceEntity);
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, -2176409211937784265L, this, sourceEntity);
                    }
                    throw th;
                }
            }

            @ey(method = 2121057501734959893L)
            private void rN() {
                try {
                    if (Ws) {
                        iy.gn(-2872962047872796100L, this);
                    }
                    this.tp = false;
                    this.Zo = false;
                } catch (Throwable th) {
                    if (QX) {
                        iy.aM(th, -2872962047872796100L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = -1958810528264552235L)
            public void DW(String str) {
                try {
                    if (Ws) {
                        iy.tp(485735956027598360L, this, str);
                    }
                    lg(new SourceEntity(str, true));
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, 485735956027598360L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = 1999531653806480549L)
            public void EQ(FileEntry fileEntry, int i, int i2) {
                try {
                    if (Ws) {
                        iy.we(113101748412800256L, this, fileEntry, new Integer(i), new Integer(i2));
                    }
                    if (this.J8.engine.v5 != null) {
                        this.J8.engine.v5.Lz(fileEntry.getPathString(), fileEntry.getVersion(), i, i2);
                    }
                } catch (Throwable th) {
                    if (QX) {
                        iy.U2(th, 113101748412800256L, this, fileEntry, new Integer(i), new Integer(i2));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = 32581843995981533L)
            public boolean FH(SyntaxTree syntaxTree, ClassType classType) {
                try {
                    if (Ws) {
                        iy.EQ(1657915237574318656L, this, syntaxTree, classType);
                    }
                    rN();
                    if (this.VH != null && this.VH == classType && this.gn == syntaxTree.getDeclarationDigest()) {
                        this.DW.addAll(this.v5);
                        return false;
                    }
                    this.VH = classType;
                    this.gn = syntaxTree.getDeclarationDigest();
                    this.v5.clear();
                    this.Zo = true;
                    return true;
                } catch (Throwable th) {
                    if (QX) {
                        iy.Mr(th, 1657915237574318656L, this, syntaxTree, classType);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = -2939297573498887256L)
            public void Hw(Type type) {
                try {
                    if (Ws) {
                        iy.tp(2883356733820043889L, this, type);
                    }
                    this.j6.add(new SourceEntity(this.J8.mb, type));
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, 2883356733820043889L, this, type);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = 326154740683413465L)
            public void J0(Variable variable) {
                try {
                    if (Ws) {
                        iy.tp(-859374195097844328L, this, variable);
                    }
                    lg(new SourceEntity((Model) this.J8.mb, false, variable));
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, -859374195097844328L, this, variable);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = 43762876798461332L)
            public void J8(FileEntry fileEntry, Language language, int i, int i2, int i3, boolean z, boolean z2) throws Throwable {
                int i4;
                try {
                    if (Ws) {
                        iy.QX(6598617610824418681L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2)});
                    }
                    String pathString = fileEntry.getPathString();
                    long version = fileEntry.getVersion();
                    if (this.DW.size() == 0) {
                        if (this.J8.engine.v5 != null) {
                            this.J8.engine.v5.jw(pathString, version, i, i2);
                            return;
                        }
                        return;
                    }
                    SourceEntity sourceEntity = null;
                    if (this.FH != null) {
                        sourceEntity = new SourceEntity(this.J8.mb, this.FH);
                    } else if (this.Hw != null) {
                        sourceEntity = new SourceEntity(this.Hw);
                    }
                    if (this.J8.engine.v5 != null) {
                        if (z) {
                            this.J8.engine.v5.oh(pathString, version, i, i2, i3, this.DW);
                            return;
                        }
                        if (z2) {
                            this.J8.engine.v5.xg(pathString, version, i, i2, i3, this.DW);
                            return;
                        }
                        i4 = 7;
                        try {
                            this.J8.engine.v5.GT(pathString, version, i, i2, i3, sourceEntity, this.DW, language.getName());
                        } catch (Throwable th) {
                            th = th;
                            if (QX) {
                                Object[] objArr = new Object[i4];
                                objArr[0] = fileEntry;
                                objArr[1] = language;
                                objArr[2] = new Integer(i);
                                objArr[3] = new Integer(i2);
                                objArr[4] = new Integer(i3);
                                objArr[5] = new Boolean(z);
                                objArr[6] = new Boolean(z2);
                                iy.rN(th, 6598617610824418681L, this, objArr);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i4 = 7;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = -1334552754966963532L)
            public void Mr(Entity entity) {
                try {
                    if (Ws) {
                        iy.tp(203934876861269521L, this, entity);
                    }
                    lg(new SourceEntity(this.J8.mb, entity));
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, 203934876861269521L, this, entity);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = -1885444907230270240L)
            public void QX(FileEntry fileEntry) {
                try {
                    if (Ws) {
                        iy.tp(-461087895615256027L, this, fileEntry);
                    }
                    String pathString = fileEntry.getPathString();
                    long version = fileEntry.getVersion();
                    if (this.J8.engine.v5 != null) {
                        this.J8.engine.v5.PH(pathString, version);
                    }
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, -461087895615256027L, this, fileEntry);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = -1704442423238722467L)
            public void U2(Entity entity) {
                try {
                    if (Ws) {
                        iy.tp(3076134120786826176L, this, entity);
                    }
                    this.FH = entity;
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, 3076134120786826176L, this, entity);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = -69004603993354029L)
            public boolean VH(SyntaxTree syntaxTree, ClassType classType) {
                try {
                    if (Ws) {
                        iy.EQ(-9581928685751072L, this, syntaxTree, classType);
                    }
                    rN();
                    if (this.EQ != null && this.EQ == classType && this.we == syntaxTree.getDeclarationDigest()) {
                        this.DW.addAll(this.u7);
                        return false;
                    }
                    this.EQ = classType;
                    this.we = syntaxTree.getDeclarationDigest();
                    this.u7.clear();
                    this.tp = true;
                    return true;
                } catch (Throwable th) {
                    if (QX) {
                        iy.Mr(th, -9581928685751072L, this, syntaxTree, classType);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = 2445509606124656457L)
            public void Ws(ClassType classType) {
                try {
                    if (Ws) {
                        iy.tp(467389109628365680L, this, classType);
                    }
                    if (!classType.getFile().isArchiveEntry()) {
                        SourceEntity sourceEntity = new SourceEntity(this.J8.mb, classType);
                        sourceEntity.Hw(this.J8.mb);
                        lg(sourceEntity);
                    } else {
                        SourceEntity sourceEntity2 = this.J0.get(classType);
                        if (sourceEntity2 == null) {
                            sourceEntity2 = new SourceEntity(this.J8.mb, classType);
                            sourceEntity2.Hw(this.J8.mb);
                            this.J0.put(classType, sourceEntity2);
                        }
                        lg(sourceEntity2);
                    }
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, 467389109628365680L, this, classType);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = -1318087505957901921L)
            public void XL(Entity entity, Type type, boolean z) {
                try {
                    if (Ws) {
                        iy.we(563847090742121788L, this, entity, type, new Boolean(z));
                    }
                    SourceEntity sourceEntity = new SourceEntity(this.J8.mb, entity, z);
                    sourceEntity.gn(this.J8.mb, type);
                    lg(sourceEntity);
                } catch (Throwable th) {
                    if (QX) {
                        iy.U2(th, 563847090742121788L, this, entity, type, new Boolean(z));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = -436402611300480893L)
            public void Zo(String str) {
                try {
                    if (Ws) {
                        iy.tp(-1825012544948636472L, this, str);
                    }
                    lg(new SourceEntity(str));
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, -1825012544948636472L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = -3997473462728727435L)
            public void a8(FileEntry fileEntry, int i, int i2) {
                try {
                    if (Ws) {
                        iy.we(1541302236157140840L, this, fileEntry, new Integer(i), new Integer(i2));
                    }
                    if (this.J8.engine.v5 != null) {
                        this.J8.engine.v5.jw(fileEntry.getPathString(), fileEntry.getVersion(), i, i2);
                    }
                } catch (Throwable th) {
                    if (QX) {
                        iy.U2(th, 1541302236157140840L, this, fileEntry, new Integer(i), new Integer(i2));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = 7148523728243700440L)
            public void aM(Entity entity, String str) {
                try {
                    if (Ws) {
                        iy.EQ(-4007603948349311349L, this, entity, str);
                    }
                    lg(new SourceEntity(this.J8.mb, entity, str));
                } catch (Throwable th) {
                    if (QX) {
                        iy.Mr(th, -4007603948349311349L, this, entity, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = 5498167094225979264L)
            public void gn(String str) {
                try {
                    if (Ws) {
                        iy.tp(-430323656749913009L, this, str);
                    }
                    this.Hw = str;
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, -430323656749913009L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = 3117169291461233875L)
            public void j3(Entity entity, boolean z) {
                try {
                    if (Ws) {
                        iy.EQ(-2903559504933634368L, this, entity, new Boolean(z));
                    }
                    lg(new SourceEntity(this.J8.mb, entity, z));
                } catch (Throwable th) {
                    if (QX) {
                        iy.Mr(th, -2903559504933634368L, this, entity, new Boolean(z));
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = -974249470431648495L)
            public void j6() {
                try {
                    if (Ws) {
                        iy.gn(3441360520464050560L, this);
                    }
                    this.FH = null;
                    this.Hw = null;
                    this.DW = new ArrayList<>();
                    rN();
                } catch (Throwable th) {
                    if (QX) {
                        iy.aM(th, 3441360520464050560L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = -1819669383930676557L)
            public void tp(Entity entity, Type type) {
                try {
                    if (Ws) {
                        iy.EQ(-823944207714474924L, this, entity, type);
                    }
                    SourceEntity sourceEntity = new SourceEntity(this.J8.mb, entity);
                    sourceEntity.gn(this.J8.mb, type);
                    sourceEntity.FH();
                    lg(sourceEntity);
                } catch (Throwable th) {
                    if (QX) {
                        iy.Mr(th, -823944207714474924L, this, entity, type);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = 926030301083005632L)
            public void u7(FileEntry fileEntry, int i, int i2, int[] iArr, int[] iArr2) {
                try {
                    if (Ws) {
                        iy.J8(548710969039796485L, this, fileEntry, new Integer(i), new Integer(i2), iArr, iArr2);
                    }
                    if (this.j6.size() == 0) {
                        if (this.J8.engine.v5 != null) {
                            this.J8.engine.v5.Lz(fileEntry.getPathString(), fileEntry.getVersion(), i, i2);
                        }
                    } else if (this.J8.engine.v5 != null) {
                        this.J8.engine.v5.sT(fileEntry.getPathString(), fileEntry.getVersion(), i, i2, iArr, iArr2, this.j6);
                    }
                    this.j6 = new ArrayList<>();
                } catch (Throwable th) {
                    if (QX) {
                        iy.lg(th, 548710969039796485L, this, fileEntry, new Integer(i), new Integer(i2), iArr, iArr2);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = -831254026297752000L)
            public void v5(List<Variable> list) {
                try {
                    if (Ws) {
                        iy.tp(-2199894017573036459L, this, list);
                    }
                    this.j6.add(new SourceEntity(this.J8.mb, list));
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, -2199894017573036459L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.codemodel.api.callback.CodeCompleterCallback
            @ey(method = 290915512968396309L)
            public void we(Entity entity, Type type) {
                try {
                    if (Ws) {
                        iy.EQ(-6139601420420120900L, this, entity, type);
                    }
                    SourceEntity sourceEntity = new SourceEntity(this.J8.mb, entity);
                    sourceEntity.v5(this.J8.mb, type);
                    this.j6.add(sourceEntity);
                } catch (Throwable th) {
                    if (QX) {
                        iy.Mr(th, -6139601420420120900L, this, entity, type);
                    }
                    throw th;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = -283330869599873600L)
            /* synthetic */ b(c cVar, a aVar) {
                this(cVar);
                try {
                    if (Ws) {
                        iy.EQ(327532130455105608L, null, cVar, aVar);
                    }
                } catch (Throwable th) {
                    if (QX) {
                        iy.Mr(th, 327532130455105608L, null, cVar, aVar);
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = -3556686258273154167L, container = -3556686258273154167L, user = true)
    private static final class d {

        @dy(field = 1791616869508519245L)
        public static final d ADD_IMPORT;

        @dy(field = -3408071613516445064L)
        public static final d AUTOFORMAT;

        @dy(field = -1562778723968170263L)
        public static final d AUTOFORMAT_ASYNC;

        @dy(field = -7290427911966378344L)
        public static final d AUTOINDENTAFTERPASTE;

        @dy(field = -4516000607913320600L)
        public static final d CONVERT_FILE;

        @dy(field = 532457166056860737L)
        public static final d CONVERT_PROJECT;

        @dy(field = -1160697396251380260L)
        public static final d COPY_CLASS;

        @dy(field = -6654932435114170857L)
        public static final d CREATE_CONSTRUCTOR;

        @dy(field = 5680978920483389772L)
        public static final d CREATE_PROPERTY;

        @dy(field = 2099111601893481189L)
        public static final d DOCUMENTIZE;

        @dy(field = 4004403740795792688L)
        public static final d DOCUMENTIZE_FILE;

        @dy(field = 1531472642454879795L)
        public static final d DO_CHANGE_SIGNATURE;

        @dy(field = -2689152292403757999L)
        public static final d DO_EXTRACT;

        @dy(field = -2199818494310076607L)
        public static final d DO_EXTRACT_RESOURCES;

        @dy(field = -2662973927874460581L)
        public static final d DO_MOVE;

        @dy(field = 1028781177819307440L)
        public static final d DO_RENAME;

        @dy(field = 3305183414580552471L)
        public static final d IMPLEMENT;

        @dy(field = -4192439322289444620L)
        public static final d INDENT_AFTER_ENTER;

        @dy(field = -4176298125087126649L)
        public static final d INDENT_AFTER_TYPING;

        @dy(field = -5744647745085674040L)
        public static final d INIT_CHANGE_SIGNATURE;

        @dy(field = -3075026114308225779L)
        public static final d INIT_INTRODUCE_VARIABLE;

        @dy(field = -159169862282408728L)
        public static final d INIT_MOVE;

        @dy(field = -1142359212647043627L)
        public static final d INIT_RENAME;

        @dy(field = 1565997849740476975L)
        public static final d INLINE_METHOD;

        @dy(field = -350113915551329064L)
        public static final d INLINE_VARIABLE;

        @dy(field = -833028009739232192L)
        private static final /* synthetic */ d[] IS;

        @dy(field = -2013880112313223608L)
        public static final d LEARN;

        @dy(field = -2561180064078749053L)
        public static final d MOVE;

        @gy
        private static /* synthetic */ boolean Nh;

        @dy(field = -2360226247670439159L)
        public static final d ORGANIZE;

        @dy(field = -2402282472754219041L)
        public static final d OUTCOMMENT;

        @dy(field = 51761041450235360L)
        public static final d OVERRIDE;

        @dy(field = -1278705848163314095L)
        public static final d RENAME_FILE;

        @dy(field = 3211525388111242184L)
        public static final d REPLACE_TEXT;

        @dy(field = -5416478855291894208L)
        public static final d SURROUND_WITH_TRYCATCH;

        @dy(field = 3445233363261693632L)
        public static final d UNOUTCOMMENT;

        @fy
        private static /* synthetic */ boolean gG;

        static {
            try {
                iy.Zo(d.class);
                if (gG) {
                    iy.gn(-1697876580222488743L, null);
                }
                IMPLEMENT = new d("IMPLEMENT", 0);
                OVERRIDE = new d("OVERRIDE", 1);
                DOCUMENTIZE = new d("DOCUMENTIZE", 2);
                DOCUMENTIZE_FILE = new d("DOCUMENTIZE_FILE", 3);
                CONVERT_PROJECT = new d("CONVERT_PROJECT", 4);
                CONVERT_FILE = new d("CONVERT_FILE", 5);
                CREATE_PROPERTY = new d("CREATE_PROPERTY", 6);
                CREATE_CONSTRUCTOR = new d("CREATE_CONSTRUCTOR", 7);
                DO_EXTRACT = new d("DO_EXTRACT", 8);
                DO_EXTRACT_RESOURCES = new d("DO_EXTRACT_RESOURCES", 9);
                INIT_INTRODUCE_VARIABLE = new d("INIT_INTRODUCE_VARIABLE", 10);
                ADD_IMPORT = new d("ADD_IMPORT", 11);
                ORGANIZE = new d("ORGANIZE", 12);
                MOVE = new d("MOVE", 13);
                COPY_CLASS = new d("COPY_CLASS", 14);
                RENAME_FILE = new d("RENAME_FILE", 15);
                DO_RENAME = new d("DO_RENAME", 16);
                INIT_CHANGE_SIGNATURE = new d("INIT_CHANGE_SIGNATURE", 17);
                DO_CHANGE_SIGNATURE = new d("DO_CHANGE_SIGNATURE", 18);
                INIT_RENAME = new d("INIT_RENAME", 19);
                INIT_MOVE = new d("INIT_MOVE", 20);
                DO_MOVE = new d("DO_MOVE", 21);
                INLINE_VARIABLE = new d("INLINE_VARIABLE", 22);
                INLINE_METHOD = new d("INLINE_METHOD", 23);
                SURROUND_WITH_TRYCATCH = new d("SURROUND_WITH_TRYCATCH", 24);
                AUTOFORMAT = new d("AUTOFORMAT", 25);
                AUTOINDENTAFTERPASTE = new d("AUTOINDENTAFTERPASTE", 26);
                OUTCOMMENT = new d("OUTCOMMENT", 27);
                UNOUTCOMMENT = new d("UNOUTCOMMENT", 28);
                LEARN = new d("LEARN", 29);
                REPLACE_TEXT = new d("REPLACE_TEXT", 30);
                INDENT_AFTER_ENTER = new d("INDENT_AFTER_ENTER", 31);
                INDENT_AFTER_TYPING = new d("INDENT_AFTER_TYPING", 32);
                d dVar = new d("AUTOFORMAT_ASYNC", 33);
                AUTOFORMAT_ASYNC = dVar;
                IS = new d[]{IMPLEMENT, OVERRIDE, DOCUMENTIZE, DOCUMENTIZE_FILE, CONVERT_PROJECT, CONVERT_FILE, CREATE_PROPERTY, CREATE_CONSTRUCTOR, DO_EXTRACT, DO_EXTRACT_RESOURCES, INIT_INTRODUCE_VARIABLE, ADD_IMPORT, ORGANIZE, MOVE, COPY_CLASS, RENAME_FILE, DO_RENAME, INIT_CHANGE_SIGNATURE, DO_CHANGE_SIGNATURE, INIT_RENAME, INIT_MOVE, DO_MOVE, INLINE_VARIABLE, INLINE_METHOD, SURROUND_WITH_TRYCATCH, AUTOFORMAT, AUTOINDENTAFTERPASTE, OUTCOMMENT, UNOUTCOMMENT, LEARN, REPLACE_TEXT, INDENT_AFTER_ENTER, INDENT_AFTER_TYPING, dVar};
            } catch (Throwable th) {
                if (Nh) {
                    iy.aM(th, -1697876580222488743L, null);
                }
                throw th;
            }
        }

        @ey(method = -260619995565857088L)
        private d(String str, int i) {
            try {
                if (gG) {
                    iy.EQ(-2137553881764756260L, null, str, new Integer(i));
                }
            } catch (Throwable th) {
                if (Nh) {
                    iy.Mr(th, -2137553881764756260L, null, str, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 22426786334690187L)
        public static d valueOf(String str) {
            try {
                if (gG) {
                    iy.tp(397053690141373705L, null, str);
                }
                return (d) Enum.valueOf(d.class, str);
            } catch (Throwable th) {
                if (Nh) {
                    iy.j3(th, 397053690141373705L, null, str);
                }
                throw th;
            }
        }

        @ey(method = -149853302867501271L)
        public static d[] values() {
            try {
                if (gG) {
                    iy.gn(-480479706715777617L, null);
                }
                return (d[]) IS.clone();
            } catch (Throwable th) {
                if (Nh) {
                    iy.aM(th, -480479706715777617L, null);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(Engine.class);
            if (fh) {
                iy.gn(-1931527392302520100L, null);
            }
            iK = System.getProperty("os.name").toUpperCase(Locale.US).indexOf("WINDOWS") != -1;
        } catch (Throwable th) {
            if (sv) {
                iy.aM(th, -1931527392302520100L, null);
            }
            throw th;
        }
    }

    @ey(method = -85426199436549925L)
    public Engine(ICodeModelsFactory iCodeModelsFactory) {
        try {
            if (fh) {
                iy.tp(-5014647192554219389L, null, iCodeModelsFactory);
            }
            new HashMap();
            this.MP = new Stack<>();
            this.Of = new Stack<>();
            this.PT = new Stack<>();
            this.b1 = new Stack<>();
            this.oh = new l1();
            this.Ej = new String[0];
            this.T6 = new boolean[0];
            this.eN = null;
            this.zf = null;
            this.fP = 0;
            this.codeModelsFactory = iCodeModelsFactory;
            this.lock1 = new Object();
            this.lock2 = new Object();
            this.lock3 = new Object();
            synchronized (this.lock1) {
                this.j3 = new Hashtable<>();
                this.we = false;
                this.lg = 1;
            }
            c cVar = new c(this, true);
            if (ThreadFactory.getSingleton() != null) {
                Thread threadMakeThread = ThreadFactory.getSingleton().makeThread(null, cVar, "Engine", 2000000L);
                threadMakeThread.setPriority(2);
                threadMakeThread.start();
            } else {
                Thread thread = new Thread(null, cVar, "Engine", 1048576L);
                thread.setPriority(2);
                thread.start();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.j3(th, -5014647192554219389L, null, iCodeModelsFactory);
            }
            throw th;
        }
    }

    @ey(method = -1190227466589264060L)
    public void Af(boolean z, boolean z2, boolean z3, boolean z4, int i, String str, String[] strArr, boolean[] zArr, int i2, Map<String, Integer> map, Map<String, Set<? extends FormatOption>> map2) {
        try {
            if (fh) {
                iy.QX(6512199187676159085L, this, new Object[]{new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Integer(i), str, strArr, zArr, new Integer(i2), map, map2});
            }
            synchronized (this.lock1) {
                if (str.length() > 0) {
                    this.oh.j6 = str;
                } else {
                    this.oh.j6 = null;
                }
                this.oh.DW = z2;
                this.oh.FH = z;
                this.oh.Hw = z3;
                this.oh.v5 = i;
                this.oh.Zo = z4;
                this.oh.VH = i2;
                this.oh.gn = map;
                this.oh.u7 = map2;
                this.Ej = strArr;
                this.T6 = zArr;
                this.SI = true;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.rN(th, 6512199187676159085L, this, new Object[]{new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Integer(i), str, strArr, zArr, new Integer(i2), map, map2});
            }
            throw th;
        }
    }

    @ey(method = 2821310737539513475L)
    public void BJ(String str, int i, int i2, int i3, int i4) {
        try {
            if (fh) {
                iy.J8(308793758653365840L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.pN = d.CREATE_CONSTRUCTOR;
                this.oy = str;
                this.QO = i;
                this.sM = i2;
                this.a5 = i3;
                this.ys = i4;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.lg(th, 308793758653365840L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -143622551068313915L)
    public void CN(String str, int i, int i2, int i3, int i4) {
        try {
            if (fh) {
                iy.J8(-4869140472959777024L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.pN = d.DO_EXTRACT;
                this.oy = str;
                this.QO = i;
                this.sM = i2;
                this.a5 = i3;
                this.ys = i4;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.lg(th, -4869140472959777024L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -6048949604054418845L)
    public void DV(com.aide.engine.a aVar) {
        try {
            if (fh) {
                iy.tp(-2179309940822628144L, this, aVar);
            }
            this.VH = aVar;
        } catch (Throwable th) {
            if (sv) {
                iy.j3(th, -2179309940822628144L, this, aVar);
            }
            throw th;
        }
    }

    @ey(method = -4500390976349453877L)
    public void Dm(SyntaxError syntaxError, int i) {
        try {
            if (fh) {
                iy.EQ(-5644635729536027616L, this, syntaxError, new Integer(i));
            }
            synchronized (this.lock1) {
                this.vy = true;
                this.fN = syntaxError;
                this.Gj = i;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.Mr(th, -5644635729536027616L, this, syntaxError, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -4250612546395571776L)
    public void Do(com.aide.engine.c cVar) {
        try {
            if (fh) {
                iy.tp(4669396322895886499L, this, cVar);
            }
            synchronized (this.lock1) {
                this.FH = cVar;
            }
        } catch (Throwable th) {
            if (sv) {
                iy.j3(th, 4669396322895886499L, this, cVar);
            }
            throw th;
        }
    }

    @ey(method = 1186453977281020245L)
    public List<Modification> IM(String str, int i, int i2, int i3) {
        try {
            if (fh) {
                iy.J0(582231732853623860L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            System.currentTimeMillis();
            synchronized (this.lock1) {
                this.qP = null;
                this.oy = str;
                this.QO = i;
                this.sM = i2;
                this.a5 = i;
                this.ys = i2;
                this.IS = i3;
                this.pN = d.INDENT_AFTER_ENTER;
                this.cn = true;
                this.ei = true;
                this.lock1.notify();
            }
            synchronized (this.lock3) {
                try {
                } catch (InterruptedException unused) {
                }
                synchronized (this.lock1) {
                    if (this.cn) {
                        this.lock3.wait(1000L);
                    }
                }
            }
            return this.qP;
        } catch (Throwable th) {
            if (sv) {
                iy.a8(th, 582231732853623860L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -3910013073533496408L)
    public void J1(String str, int i, int i2, int i3) {
        try {
            if (fh) {
                iy.J0(3434384531969210645L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.ei = true;
                this.IS = i3;
                this.pN = d.AUTOFORMAT_ASYNC;
                this.oy = str;
                this.QO = i;
                this.sM = 1;
                this.a5 = i2;
                this.ys = 1;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.a8(th, 3434384531969210645L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 5056705092474655392L)
    public void JT(String str, int i, int i2) {
        try {
            if (fh) {
                iy.we(4985958408679542567L, this, str, new Integer(i), new Integer(i2));
            }
            synchronized (this.lock1) {
                this.n5 = i;
                this.Q6 = i2;
                this.Z1 = str;
                this.sh = true;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.U2(th, 4985958408679542567L, this, str, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1021160564355025731L)
    public void LA(String str, int i, int i2, SourceEntity sourceEntity) {
        try {
            if (fh) {
                iy.J0(166736098237246740L, this, str, new Integer(i), new Integer(i2), sourceEntity);
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.pN = d.OVERRIDE;
                this.oy = str;
                this.QO = i;
                this.sM = i2;
                this.a5 = i;
                this.ys = i2;
                this.q7 = sourceEntity;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.a8(th, 166736098237246740L, this, str, new Integer(i), new Integer(i2), sourceEntity);
            }
            throw th;
        }
    }

    @ey(method = -2878020907531329120L)
    public void MX(String str, int i) {
        try {
            if (fh) {
                iy.EQ(439741745632152975L, this, str, new Integer(i));
            }
            synchronized (this.lock1) {
                this.wc = str;
                this.et = i;
                this.Sf = true;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.Mr(th, 439741745632152975L, this, str, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 23621774573268421L)
    public List<Modification> N2(String str, int i, int i2, int i3) {
        try {
            if (fh) {
                iy.J0(153384860132428176L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            System.currentTimeMillis();
            synchronized (this.lock1) {
                this.qP = null;
                this.IS = i3;
                this.pN = d.AUTOFORMAT;
                this.oy = str;
                this.QO = i;
                this.a5 = i2;
                this.cn = true;
                this.ei = true;
                this.lock1.notify();
            }
            synchronized (this.lock3) {
                try {
                } catch (InterruptedException unused) {
                }
                synchronized (this.lock1) {
                    if (this.cn) {
                        this.lock3.wait(20000L);
                    }
                }
            }
            return this.qP;
        } catch (Throwable th) {
            if (sv) {
                iy.a8(th, 153384860132428176L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 2047377534079802560L)
    public void NH(String str, int i, int i2) {
        try {
            if (fh) {
                iy.we(-1944418689252142785L, this, str, new Integer(i), new Integer(i2));
            }
            synchronized (this.lock1) {
                this.mb = i;
                this.jw = i2;
                this.WB = str;
                this.fY = b.MEMBERS;
                this.KD = true;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.U2(th, -1944418689252142785L, this, str, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 4254326173524370521L)
    public List<Modification> NZ(String str, int i, int i2, char c2, int i3) {
        try {
            if (fh) {
                iy.J8(-1950235353419355988L, this, str, new Integer(i), new Integer(i2), new Character(c2), new Integer(i3));
            }
            System.currentTimeMillis();
            synchronized (this.lock1) {
                this.qP = null;
                this.oy = str;
                this.QO = i;
                this.sM = i2;
                this.a5 = i;
                this.ys = i2;
                this.IS = i3;
                this.pN = d.INDENT_AFTER_TYPING;
                this.cn = true;
                this.ei = true;
                this.lock1.notify();
            }
            synchronized (this.lock3) {
                try {
                } catch (InterruptedException unused) {
                }
                synchronized (this.lock1) {
                    if (this.cn) {
                        this.lock3.wait(1000L);
                    }
                }
            }
            return this.qP;
        } catch (Throwable th) {
            if (sv) {
                iy.lg(th, -1950235353419355988L, this, str, new Integer(i), new Integer(i2), new Character(c2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -4053422053127142456L)
    public void Sc(String str, int i, int i2, int i3, int i4) {
        try {
            if (fh) {
                iy.J8(-5778428441560229823L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.pN = d.CREATE_PROPERTY;
                this.oy = str;
                this.QO = i;
                this.sM = i2;
                this.a5 = i3;
                this.ys = i4;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.lg(th, -5778428441560229823L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 2302536700496053367L)
    public void Sg() {
        try {
            if (fh) {
                iy.gn(-1914233810586701760L, this);
            }
            synchronized (this.lock1) {
                this.lg++;
            }
        } catch (Throwable th) {
            if (sv) {
                iy.aM(th, -1914233810586701760L, this);
            }
            throw th;
        }
    }

    @ey(method = -2527061684098826700L)
    public void Sx(d0 d0Var) {
        try {
            if (fh) {
                iy.tp(2120932870497279509L, this, d0Var);
            }
            this.v5 = d0Var;
        } catch (Throwable th) {
            if (sv) {
                iy.j3(th, 2120932870497279509L, this, d0Var);
            }
            throw th;
        }
    }

    @ey(method = -1355117605918919656L)
    public void TE(String str, int i, int i2) {
        try {
            if (fh) {
                iy.we(-622660782540640589L, this, str, new Integer(i), new Integer(i2));
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.pN = d.INLINE_VARIABLE;
                this.oy = str;
                this.QO = i;
                this.sM = i2;
                this.a5 = i;
                this.ys = i2;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.U2(th, -622660782540640589L, this, str, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -4005883219270882281L)
    public void TJ() {
        try {
            if (fh) {
                iy.gn(1042106131790190864L, this);
            }
            synchronized (this.lock1) {
                this.Mr = true;
            }
        } catch (Throwable th) {
            if (sv) {
                iy.aM(th, 1042106131790190864L, this);
            }
            throw th;
        }
    }

    @ey(method = 1311214450982264400L)
    public void UF(String str, int i, int i2, int i3, int i4, String str2, String str3) {
        try {
            if (fh) {
                iy.QX(-550236624051289483L, this, new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str2, str3});
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.pN = d.REPLACE_TEXT;
                this.oy = str;
                this.QO = i;
                this.sM = i2;
                this.a5 = i3;
                this.ys = i4;
                this.e9 = str2;
                this.aX = str3;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.rN(th, -550236624051289483L, this, new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str2, str3});
            }
            throw th;
        }
    }

    @ey(method = -1666414971272042577L)
    public void YM(String str) {
        try {
            if (fh) {
                iy.tp(5912989817889325920L, this, str);
            }
            synchronized (this.lock1) {
                this.j3.remove(str);
                this.sG = true;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.j3(th, 5912989817889325920L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -634518874985987157L)
    public void cz(String str, String str2) {
        try {
            if (fh) {
                iy.EQ(-2033005043690750216L, this, str, str2);
            }
            synchronized (this.lock1) {
                if (this.j3.containsKey(str)) {
                    this.j3.put(str2, this.j3.get(str));
                    this.j3.remove(str);
                }
                this.sG = true;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.Mr(th, -2033005043690750216L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 275076763614519240L)
    public void d5(String str, z zVar) {
        try {
            if (fh) {
                iy.EQ(31472032060797419L, this, str, zVar);
            }
            synchronized (this.lock1) {
                this.j3.put(str, zVar);
                this.sG = true;
            }
        } catch (Throwable th) {
            if (sv) {
                iy.Mr(th, 31472032060797419L, this, str, zVar);
            }
            throw th;
        }
    }

    @ey(method = -280917616045207568L)
    public void dP(g gVar) {
        try {
            if (fh) {
                iy.tp(-954724682273016375L, this, gVar);
            }
            this.u7 = gVar;
        } catch (Throwable th) {
            if (sv) {
                iy.j3(th, -954724682273016375L, this, gVar);
            }
            throw th;
        }
    }

    @ey(method = -2215300412709425620L)
    public void df(String str, int i, int i2, int i3, int i4) {
        try {
            if (fh) {
                iy.J8(-3879653892237548293L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.pN = d.INIT_INTRODUCE_VARIABLE;
                this.oy = str;
                this.QO = i;
                this.sM = i2;
                this.a5 = i3;
                this.ys = i4;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.lg(th, -3879653892237548293L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -3315248873889976320L)
    public void e4() {
        try {
            if (fh) {
                iy.gn(-772159547690516167L, this);
            }
            synchronized (this.lock1) {
                this.nw = true;
                this.ca = true;
                this.P8 = true;
                this.ei = true;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.aM(th, -772159547690516167L, this);
            }
            throw th;
        }
    }

    @ey(method = -1254280869644787925L)
    public void eQ() {
        try {
            if (fh) {
                iy.gn(-1953183901221396420L, this);
            }
            synchronized (this.lock1) {
                this.g3 = true;
                this.P8 = true;
                this.ei = true;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.aM(th, -1953183901221396420L, this);
            }
            throw th;
        }
    }

    @ey(method = -286922718004745856L)
    public void ek(String str, long j) {
        try {
            if (fh) {
                iy.EQ(5132024678458297191L, this, str, new Long(j));
            }
            synchronized (this.lock1) {
                this.J0 = str;
                this.J8 = j;
                this.we = true;
                if (j == 0 || str == null || "".equals(str) || !new File(this.J0).exists()) {
                    this.we = false;
                }
            }
        } catch (Throwable th) {
            if (sv) {
                iy.Mr(th, 5132024678458297191L, this, str, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = -150238595539315997L)
    public void fD(SourceEntity sourceEntity) {
        try {
            if (fh) {
                iy.tp(-104109799702462740L, this, sourceEntity);
            }
            synchronized (this.lock1) {
                this.q7 = sourceEntity;
                this.dx = true;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.j3(th, -104109799702462740L, this, sourceEntity);
            }
            throw th;
        }
    }

    @ey(method = 2761030777239484784L)
    public void fp() {
        try {
            if (fh) {
                iy.gn(-1321152769403397L, this);
            }
            synchronized (this.lock1) {
                if (this.lg > 0) {
                    this.lg--;
                }
            }
        } catch (Throwable th) {
            if (sv) {
                iy.aM(th, -1321152769403397L, this);
            }
            throw th;
        }
    }

    @ey(method = 629996602642448808L)
    public void ik(b0 b0Var) {
        try {
            if (fh) {
                iy.tp(690949352433326613L, this, b0Var);
            }
            synchronized (this.lock1) {
                this.DW = b0Var;
            }
        } catch (Throwable th) {
            if (sv) {
                iy.j3(th, 690949352433326613L, this, b0Var);
            }
            throw th;
        }
    }

    @ey(method = -6574150190885293245L)
    public void j7(com.aide.engine.d dVar) {
        try {
            if (fh) {
                iy.tp(-1800812004611738224L, this, dVar);
            }
            synchronized (this.lock1) {
                this.Hw = dVar;
            }
        } catch (Throwable th) {
            if (sv) {
                iy.j3(th, -1800812004611738224L, this, dVar);
            }
            throw th;
        }
    }

    @ey(method = -1113294336750916576L)
    public void jD(String str) {
        try {
            if (fh) {
                iy.tp(-773307906932871045L, this, str);
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.pN = d.DO_RENAME;
                this.aX = str;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.j3(th, -773307906932871045L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -3279607292564744792L)
    public void jH() {
        try {
            if (fh) {
                iy.gn(-745205431502235215L, this);
            }
            synchronized (this.lock1) {
                this.P8 = true;
                this.ei = true;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.aM(th, -745205431502235215L, this);
            }
            throw th;
        }
    }

    @ey(method = -507394141803150336L)
    public void jT() {
        try {
            if (fh) {
                iy.gn(6636024659994587835L, this);
            }
            synchronized (this.lock1) {
                this.gW = true;
            }
        } catch (Throwable th) {
            if (sv) {
                iy.aM(th, 6636024659994587835L, this);
            }
            throw th;
        }
    }

    @ey(method = -2119629236520419904L)
    public List<Modification> jg(String str, int i, int i2, int i3) {
        try {
            if (fh) {
                iy.J0(-4375263581417296825L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            System.currentTimeMillis();
            synchronized (this.lock1) {
                this.qP = null;
                this.IS = i3;
                this.pN = d.AUTOINDENTAFTERPASTE;
                this.oy = str;
                this.QO = i;
                this.a5 = i2;
                this.cn = true;
                this.ei = true;
                this.lock1.notify();
            }
            synchronized (this.lock3) {
                try {
                } catch (InterruptedException unused) {
                }
                synchronized (this.lock1) {
                    if (this.cn) {
                        this.lock3.wait(1000L);
                    }
                }
            }
            return this.qP;
        } catch (Throwable th) {
            if (sv) {
                iy.a8(th, -4375263581417296825L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -3869079692061667189L)
    public void lj(String str, String str2) {
        try {
            if (fh) {
                iy.EQ(-2228369245126369488L, this, str, str2);
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.pN = d.RENAME_FILE;
                this.oy = str;
                this.aX = str2;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.Mr(th, -2228369245126369488L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -778590236558007779L)
    public void mn(String str, String str2, int i) {
        try {
            if (fh) {
                iy.we(35963783047729044L, this, str, str2, new Integer(i));
            }
            try {
                FileReader fileReader = new FileReader(str2);
                synchronized (this.lock1) {
                    this.Of.addElement(str);
                    this.PT.addElement(Integer.valueOf(i));
                    this.b1.addElement(fileReader);
                    this.P8 = true;
                    this.ei = true;
                    this.lock1.notify();
                }
            } catch (FileNotFoundException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (sv) {
                iy.U2(th, 35963783047729044L, this, str, str2, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -7629646601104133415L)
    public void mu(String str, Hashtable<String, String> hashtable) {
        try {
            if (fh) {
                iy.EQ(-7021578161999656240L, this, str, hashtable);
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.pN = d.ORGANIZE;
                this.oy = str;
                this.Bx = hashtable;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.Mr(th, -7021578161999656240L, this, str, hashtable);
            }
            throw th;
        }
    }

    @ey(method = -99104550780355341L)
    public void n8(String str) {
        try {
            if (fh) {
                iy.tp(1779353185301942280L, this, str);
            }
            synchronized (this.lock1) {
                this.jJ = null;
                this.Ev = str;
                this.Eq = false;
                this.hz = false;
                this.ko = true;
                this.ye = false;
                this.oY = false;
                this.aq = false;
                this.FN = false;
                this.jO = false;
                this.oY = false;
                this.er = true;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.j3(th, 1779353185301942280L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1594522014776392631L)
    public void oC(String str, String str2, int i, int i2, int i3, int i4) {
        try {
            if (fh) {
                iy.QX(660532302315411504L, this, new Object[]{str, str2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.pN = d.DO_EXTRACT_RESOURCES;
                this.oy = str;
                this.QO = i;
                this.sM = i2;
                this.a5 = i3;
                this.ys = i4;
                this.Jm = str2;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.rN(th, 660532302315411504L, this, new Object[]{str, str2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            throw th;
        }
    }

    @ey(method = -1196010091307510583L)
    public void oP(String str, int i, int i2) {
        try {
            if (fh) {
                iy.we(-1237256118062610984L, this, str, new Integer(i), new Integer(i2));
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.pN = d.OUTCOMMENT;
                this.oy = str;
                this.QO = i;
                this.sM = 1;
                this.a5 = i2;
                this.ys = 1;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.U2(th, -1237256118062610984L, this, str, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2122188808533771263L)
    public void p8(String str, int i) {
        try {
            if (fh) {
                iy.EQ(-1859280196490523000L, this, str, new Integer(i));
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.pN = d.LEARN;
                this.oy = str;
                this.IS = i;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.Mr(th, -1859280196490523000L, this, str, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 858647997254230947L)
    public void rB(String str, int i, int i2, int i3, int i4) {
        try {
            if (fh) {
                iy.J8(-1985334029533086720L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            synchronized (this.lock1) {
                this.kQ = true;
                this.Nh = str;
                this.BR = i;
                this.AE = i2;
                this.Za = i3;
                this.An = i4;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.lg(th, -1985334029533086720L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 4764150667511338352L)
    public void rC(String str, int i, int i2) {
        try {
            if (fh) {
                iy.we(4233155840076961069L, this, str, new Integer(i), new Integer(i2));
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.pN = d.UNOUTCOMMENT;
                this.oy = str;
                this.QO = i;
                this.sM = 1;
                this.a5 = i2;
                this.ys = 1;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.U2(th, 4233155840076961069L, this, str, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -529390998057888993L)
    public void re(String str, int i, int i2) {
        try {
            if (fh) {
                iy.we(917462520766635864L, this, str, new Integer(i), new Integer(i2));
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.pN = d.INIT_RENAME;
                this.oy = str;
                this.QO = i;
                this.sM = i2;
                this.a5 = i;
                this.ys = i2;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.U2(th, 917462520766635864L, this, str, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 2450841961508394279L)
    public void setEngineSolution(EngineSolution engineSolution) {
        try {
            if (fh) {
                iy.tp(2253937211508673780L, this, engineSolution);
            }
            synchronized (this.lock1) {
                this.engineSolution = engineSolution;
                this.SI = true;
                this.gW = true;
            }
        } catch (Throwable th) {
            if (sv) {
                iy.j3(th, 2253937211508673780L, this, engineSolution);
            }
            throw th;
        }
    }

    @ey(method = -1939369324584180088L)
    public void setUsageSearcherListener2(UsageSearcherListener usageSearcherListener) {
        try {
            if (fh) {
                iy.tp(-565575345652542525L, this, usageSearcherListener);
            }
            synchronized (this.lock1) {
                this.j6 = usageSearcherListener;
            }
        } catch (Throwable th) {
            if (sv) {
                iy.j3(th, -565575345652542525L, this, usageSearcherListener);
            }
            throw th;
        }
    }

    @ey(method = -2993730165217243949L)
    public void shutdown() {
        try {
            if (fh) {
                iy.gn(-92308266706243560L, this);
            }
            synchronized (this.lock1) {
                this.shutdown = true;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.aM(th, -92308266706243560L, this);
            }
            throw th;
        }
    }

    @ey(method = 4596602773088286628L)
    public void tn(String str, int i, int i2, boolean z) {
        try {
            if (fh) {
                iy.J0(4474768545648275103L, this, str, new Integer(i), new Integer(i2), new Boolean(z));
            }
            synchronized (this.lock1) {
                this.jJ = str;
                this.CU = i;
                this.Xa = i2;
                this.Eq = z;
                this.ko = false;
                this.hz = false;
                this.ye = false;
                this.oY = false;
                this.aq = false;
                this.FN = false;
                this.jO = false;
                this.er = true;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.a8(th, 4474768545648275103L, this, str, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -34175276611002353L)
    public void uF(String str, int i, int i2, int i3, int i4) {
        try {
            if (fh) {
                iy.J8(2758596626911164800L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.pN = d.SURROUND_WITH_TRYCATCH;
                this.oy = str;
                this.QO = i;
                this.sM = i2;
                this.a5 = i3;
                this.ys = i4;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.lg(th, 2758596626911164800L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -4854398694948341024L)
    public void w2(String str, int i) {
        try {
            if (fh) {
                iy.EQ(1874176418101755825L, this, str, new Integer(i));
            }
            synchronized (this.lock1) {
                this.wc = str;
                this.et = i;
                this.vJ = true;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.Mr(th, 1874176418101755825L, this, str, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 923009855812590653L)
    public void wu() {
        try {
            if (fh) {
                iy.gn(-1118582550536070000L, this);
            }
            synchronized (this.lock1) {
                this.U2 = true;
            }
        } catch (Throwable th) {
            if (sv) {
                iy.aM(th, -1118582550536070000L, this);
            }
            throw th;
        }
    }

    @ey(method = 3250905176225791460L)
    public void yu() {
        try {
            if (fh) {
                iy.gn(-3590204763141923073L, this);
            }
            synchronized (this.lock1) {
                this.P8 = true;
                this.nw = true;
                this.ei = true;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.aM(th, -3590204763141923073L, this);
            }
            throw th;
        }
    }

    @ey(method = -2192122056405045152L)
    public void zg(String str, SourceEntity sourceEntity) {
        try {
            if (fh) {
                iy.EQ(569141944517203525L, this, str, sourceEntity);
            }
            synchronized (this.lock1) {
                this.cn = true;
                this.pN = d.ADD_IMPORT;
                this.oy = str;
                this.oa = sourceEntity;
                this.lock1.notify();
            }
        } catch (Throwable th) {
            if (sv) {
                iy.Mr(th, 569141944517203525L, this, str, sourceEntity);
            }
            throw th;
        }
    }
}
