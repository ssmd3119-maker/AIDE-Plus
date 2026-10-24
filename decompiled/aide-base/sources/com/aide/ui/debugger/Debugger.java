package com.aide.ui.debugger;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.aide.ui.MainActivity;
import com.aide.ui.ServiceContainer;
import com.aide.ui.services.LogcatService;
import com.aide.ui.util.FileSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@cy(clazz = 1693385072073297168L, container = 1693385072073297168L, user = true)
/* loaded from: classes.dex */
public class Debugger {

    @dy(field = 2226000144543224441L)
    private static Debugger a8;

    @fy
    private static /* synthetic */ boolean lg;

    @gy
    private static /* synthetic */ boolean rN;

    @dy(field = -377712880735157077L)
    private String DW;

    @dy(field = -2498185276083881573L)
    private ArrayList<String> EQ;

    @dy(field = -4662176038868336196L)
    private ArrayList<String> FH;

    @dy(field = -2717589875298917577L)
    private boolean Hw;

    @dy(field = 880466551848696055L)
    private ArrayList<String> J0;

    @dy(field = 1104771818372648580L)
    private ArrayList<String> J8;

    @dy(field = -4183665106007325403L)
    private Runnable Mr;

    @dy(field = 7694214165200734969L)
    private ArrayList<String> QX;

    @dy(field = 3031884323457046960L)
    private String U2;

    @dy(field = 403701158562187560L)
    private String VH;

    @dy(field = 130197554055560565L)
    private ArrayList<String> Ws;

    @dy(field = 4882768283852280005L)
    private ArrayList<String> XL;

    @dy(field = 4302443980714934295L)
    private boolean Zo;

    @dy(field = 2001510835453029663L)
    private ArrayList<String> aM;

    @dy(field = -2941704923068349496L)
    private String gn;

    @dy(field = -611385479192747960L)
    private Handler j3;

    @dy(field = 1500907585095901125L)
    private Context j6;

    @dy(field = 4725325320273532160L)
    private ArrayList<String> tp;

    @dy(field = -2611155994805691919L)
    private int u7;

    @dy(field = -852471338336189175L)
    private boolean v5;

    @dy(field = -750694708462589760L)
    private ArrayList<String> we;

    @cy(clazz = -1681528837798169575L, container = 1693385072073297168L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 1816046716070259799L)
        a() {
        }

        @Override // java.lang.Runnable
        @ey(method = 2321772466446668720L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(539977015220927115L, this);
                }
                if (Debugger.this.v5) {
                    return;
                }
                ServiceContainer.getMainActivity().cn().Hw();
                if (Build.VERSION.SDK_INT < 24 || !ServiceContainer.getMainActivity().isInMultiWindowMode()) {
                    ServiceContainer.getMainActivity().moveTaskToBack(true);
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 539977015220927115L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1681562570888520328L, container = 1693385072073297168L, user = true)
    class b implements Comparator<c> {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -6430725216152145285L)
        b(Debugger debugger) {
        }

        @Override // java.util.Comparator
        @ey(method = 60290718605040000L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            try {
                if (WB) {
                    iy.EQ(-911111694508386428L, this, cVar, cVar2);
                }
                int iCompareTo = cVar.DW.compareTo(cVar2.DW);
                return iCompareTo != 0 ? iCompareTo : cVar.FH - cVar2.FH;
            } catch (Throwable th) {
                if (mb) {
                    iy.Mr(th, -911111694508386428L, this, cVar, cVar2);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 72458525063499133L, container = 72458525063499133L, user = true)
    public class c {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = -869315839631871984L)
        public String DW;

        @dy(field = -243313627624399379L)
        public int FH;

        @dy(field = -1030640521788560000L)
        public String j6;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -4126237643791469515L)
        public c(Debugger debugger, String str, String str2, int i) {
            try {
                if (Hw) {
                    iy.J0(1106310527286105312L, null, debugger, str, str2, new Integer(i));
                }
                this.j6 = str;
                this.DW = str2;
                this.FH = i;
            } catch (Throwable th) {
                if (v5) {
                    iy.a8(th, 1106310527286105312L, null, debugger, str, str2, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -372499357441328645L)
        public void j6() {
            try {
                if (Hw) {
                    iy.gn(2824715648157269335L, this);
                }
                String strAj = ServiceContainer.getProjectService().aj(this.j6);
                if (strAj != null) {
                    ServiceContainer.getMainActivity().aq(new FileSpan(strAj, this.FH, 1, this.FH, 1));
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, 2824715648157269335L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 591747073554812436L, container = 591747073554812436L, user = true)
    public class d {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = -644023624885418184L)
        public String DW;

        @dy(field = -240131814551312733L)
        public String FH;

        @dy(field = -2513107411226954280L)
        public String j6;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -1482890436487382400L)
        public d(Debugger debugger, String str, String str2, String str3) {
            try {
                if (Hw) {
                    iy.J0(5738513149098129675L, null, debugger, str, str2, str3);
                }
                this.j6 = str2;
                this.DW = str;
                this.FH = str3;
            } catch (Throwable th) {
                if (v5) {
                    iy.a8(th, 5738513149098129675L, null, debugger, str, str2, str3);
                }
                throw th;
            }
        }

        @ey(method = 1982129245930713389L)
        public void DW() {
            try {
                if (Hw) {
                    iy.gn(-359972978652046368L, this);
                }
                try {
                    String[] strArrSplit = this.j6.split(":");
                    String str = strArrSplit[0];
                    int i = Integer.parseInt(strArrSplit[1]);
                    String strAj = ServiceContainer.getProjectService().aj(str);
                    if (strAj != null) {
                        ServiceContainer.getMainActivity().aq(new FileSpan(strAj, i, 1, i, 1));
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -359972978652046368L, this);
                }
                throw th;
            }
        }

        @ey(method = 1239859604942284788L)
        public boolean j6() {
            try {
                if (Hw) {
                    iy.gn(-407432205435342191L, this);
                }
                return "D".equals(this.FH);
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -407432205435342191L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1063089823829463296L, container = 1063089823829463296L, user = true)
    public class e {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = -693185849456100000L)
        public String DW;

        @dy(field = 912258756682447755L)
        public String FH;

        @dy(field = -2223500584862607597L)
        @hy
        final /* synthetic */ Debugger Hw;

        @dy(field = 914446355136403824L)
        public String j6;

        @cy(clazz = 182150711713746657L, container = 1063089823829463296L, user = true)
        class a implements Runnable {

            @fy
            private static /* synthetic */ boolean WB;

            @gy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -8570462608069326356L)
            a(e eVar) {
            }

            @Override // java.lang.Runnable
            @ey(method = 1552075641675159412L)
            public void run() {
                try {
                    if (WB) {
                        iy.gn(-188947404734676480L, this);
                    }
                    ServiceContainer.getMainActivity().cn().Hw();
                } catch (Throwable th) {
                    if (mb) {
                        iy.aM(th, -188947404734676480L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(e.class);
        }

        @ey(method = 2132598484377443520L)
        public e(Debugger debugger, String str, String str2, String str3) {
            try {
                if (v5) {
                    iy.J0(-673466796962272467L, null, debugger, str, str2, str3);
                }
                this.Hw = debugger;
                this.j6 = str;
                this.DW = str2;
                this.FH = str3;
            } catch (Throwable th) {
                if (Zo) {
                    iy.a8(th, -673466796962272467L, null, debugger, str, str2, str3);
                }
                throw th;
            }
        }

        @ey(method = 3930828294860729592L)
        public boolean DW() {
            try {
                if (v5) {
                    iy.gn(3019582111716993201L, this);
                }
                return "I".equals(this.FH);
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 3019582111716993201L, this);
                }
                throw th;
            }
        }

        @ey(method = -753005019288597867L)
        public boolean FH() {
            try {
                if (v5) {
                    iy.gn(1525535327018026440L, this);
                }
                return "M".equals(this.FH);
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 1525535327018026440L, this);
                }
                throw th;
            }
        }

        @ey(method = 1948483492886586513L)
        public boolean Hw() {
            try {
                if (v5) {
                    iy.gn(-2703075033443130056L, this);
                }
                return "O".equals(this.FH);
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -2703075033443130056L, this);
                }
                throw th;
            }
        }

        @ey(method = -1881542875366616160L)
        public void j6() {
            try {
                if (v5) {
                    iy.gn(-1282975309877022375L, this);
                }
                if (this.j6.length() == 0) {
                    this.Hw.lg();
                } else {
                    this.Hw.Zo(this.j6);
                }
                new Handler().postDelayed(new a(this), 200L);
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -1282975309877022375L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(Debugger.class);
    }

    @ey(method = -238120788092523080L)
    public Debugger(Context context) {
        try {
            if (lg) {
                iy.tp(-234882752767915373L, null, context);
            }
            this.FH = new ArrayList<>();
            this.j6 = context;
            this.j3 = new Handler();
            this.Mr = new a();
            this.Hw = context.getSharedPreferences("Debugger", 0).getBoolean("connected", false);
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -234882752767915373L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 200433074190641793L)
    private void Hw() {
        try {
            if (lg) {
                iy.gn(223332340617203505L, this);
            }
            this.J0 = new ArrayList<>();
            this.J8 = new ArrayList<>();
            this.Ws = new ArrayList<>();
            this.J0.add("");
            this.J8.add("...");
            this.Ws.add("O");
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 223332340617203505L, this);
            }
            throw th;
        }
    }

    @ey(method = -449263681278177945L)
    private String J0() {
        try {
            if (lg) {
                iy.gn(-3978496570694584409L, this);
            }
            if (this.DW != null) {
                return this.DW;
            }
            String string = this.j6.getSharedPreferences("Debugger", 0).getString("Package", null);
            this.DW = string;
            return string;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -3978496570694584409L, this);
            }
            throw th;
        }
    }

    @ey(method = -2735035704547112611L)
    private void KD(boolean z) {
        try {
            if (lg) {
                iy.Ws(-1376189834752262031L, this, z);
            }
            this.Hw = z;
            this.j6.getSharedPreferences("Debugger", 0).edit().putBoolean("connected", z).commit();
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -1376189834752262031L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 174805373499951115L)
    private void Sf() {
        try {
            if (lg) {
                iy.gn(-3166108253946467765L, this);
            }
            this.v5 = false;
            KD(false);
            this.Zo = true;
            this.U2 = null;
            ServiceContainer.getMainActivity().q7();
            ServiceContainer.getMainActivity().cn().Hw();
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -3166108253946467765L, this);
            }
            throw th;
        }
    }

    @ey(method = -1759340187862812249L)
    public static Debugger XL(Context context) {
        try {
            if (lg) {
                iy.tp(-551090681624805505L, null, context);
            }
            if (a8 == null) {
                a8 = new Debugger(context);
            }
            return a8;
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -551090681624805505L, null, context);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 3944933202278840400L)
    public void Zo(String str) {
        try {
            if (lg) {
                iy.tp(-2446268638080574520L, this, str);
            }
            Hw();
            if (this.U2 == null) {
                this.U2 = str;
            } else if (str.startsWith("[")) {
                this.U2 += str;
            } else {
                this.U2 += "." + str;
            }
            if (!this.v5 || this.DW == null) {
                return;
            }
            com.aide.ui.debugger.a.FH(this.j6, this.DW, this.U2);
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -2446268638080574520L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -380515202160263208L)
    private void cn() {
        try {
            if (lg) {
                iy.gn(4144642941736998448L, this);
            }
            this.j3.removeCallbacks(this.Mr);
            this.j3.postDelayed(this.Mr, 200L);
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 4144642941736998448L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2793824934728431565L)
    public void lg() {
        try {
            if (lg) {
                iy.gn(-2020180609382424869L, this);
            }
            if (this.U2 != null) {
                Hw();
                int iMax = Math.max(this.U2.lastIndexOf(46), this.U2.lastIndexOf(91));
                if (iMax == -1) {
                    this.U2 = null;
                    return;
                }
                String strSubstring = this.U2.substring(0, iMax);
                this.U2 = strSubstring;
                if (!this.v5 || this.DW == null) {
                    return;
                }
                com.aide.ui.debugger.a.FH(this.j6, this.DW, strSubstring);
            }
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -2020180609382424869L, this);
            }
            throw th;
        }
    }

    @ey(method = -1129401813044162196L)
    private void nw() {
        try {
            if (lg) {
                iy.gn(1420578574214314336L, this);
            }
            this.v5 = false;
            ServiceContainer.getMainActivity().q7();
            ServiceContainer.getMainActivity().sh().invalidate();
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 1420578574214314336L, this);
            }
            throw th;
        }
    }

    @ey(method = 5219456269682567339L)
    private void rN() {
        try {
            if (lg) {
                iy.gn(-93265089786965205L, this);
            }
            this.FH = new ArrayList<>(Arrays.asList(this.j6.getSharedPreferences("Debugger", 0).getString("Breakpoints", "").split("\n")));
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -93265089786965205L, this);
            }
            throw th;
        }
    }

    @ey(method = 1881834197457739320L)
    private void ro(String str) {
        try {
            if (lg) {
                iy.tp(-3407687230720131288L, this, str);
            }
            this.DW = str;
            this.j6.getSharedPreferences("Debugger", 0).edit().putString("Package", str).commit();
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -3407687230720131288L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -6317899509861116723L)
    private void vJ() {
        try {
            if (lg) {
                iy.gn(1275276236858568081L, this);
            }
            this.j6.getSharedPreferences("Debugger", 0).edit().putString("Breakpoints", TextUtils.join("\n", this.FH)).commit();
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 1275276236858568081L, this);
            }
            throw th;
        }
    }

    @ey(method = -976264133391806793L)
    public void BT(Context context, String[] strArr) {
        try {
            if (lg) {
                iy.EQ(6255260409039758127L, this, context, strArr);
            }
            for (String str : strArr) {
                LogcatService.Ws(str);
            }
        } catch (Throwable th) {
            if (rN) {
                iy.Mr(th, 6255260409039758127L, this, context, strArr);
            }
            throw th;
        }
    }

    @ey(method = 4366696246544023392L)
    public FileSpan EQ() {
        try {
            if (lg) {
                iy.gn(2183193374706327968L, this);
            }
            return new FileSpan(tp(), we(), 1, we(), 1);
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 2183193374706327968L, this);
            }
            throw th;
        }
    }

    @ey(method = -564802133462640055L)
    public List<e> J8() {
        try {
            if (lg) {
                iy.gn(-69176136712527855L, this);
            }
            ArrayList arrayList = new ArrayList();
            if (this.v5) {
                for (int i = 0; i < this.tp.size(); i++) {
                    arrayList.add(new e(this, this.tp.get(i), this.EQ.get(i), this.we.get(i)));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -69176136712527855L, this);
            }
            throw th;
        }
    }

    @ey(method = 5989961785212528L)
    public boolean Mr() {
        try {
            if (lg) {
                iy.gn(-2775627411737720L, this);
            }
            return this.DW != null;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -2775627411737720L, this);
            }
            throw th;
        }
    }

    @ey(method = 613732421817246237L)
    public void P8(String str, boolean z) {
        try {
            if (lg) {
                iy.EQ(-2888471822177428075L, this, str, new Boolean(z));
            }
            if (!z) {
                v5();
            }
            if (str != null) {
                ro(str);
                rN();
            }
        } catch (Throwable th) {
            if (rN) {
                iy.Mr(th, -2888471822177428075L, this, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -5572983237327451881L)
    public String QX() {
        try {
            if (lg) {
                iy.gn(1870770005579768727L, this);
            }
            return this.U2;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 1870770005579768727L, this);
            }
            throw th;
        }
    }

    @ey(method = -1158335258050130615L)
    public void SI(String str, List<Integer> list) {
        try {
            if (lg) {
                iy.EQ(363089374439167557L, this, str, list);
            }
            String strLp = ServiceContainer.getProjectService().lp(str);
            if (strLp == null) {
                return;
            }
            String str2 = strLp + ":";
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(str2 + it.next().intValue());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                if (!this.FH.contains(str3)) {
                    arrayList2.add(str3);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator<String> it3 = this.FH.iterator();
            while (it3.hasNext()) {
                String next = it3.next();
                if (next.startsWith(str2) && !arrayList.contains(next)) {
                    arrayList3.add(next);
                }
            }
            if (arrayList2.size() > 0 || arrayList3.size() > 0) {
                this.FH.removeAll(arrayList3);
                this.FH.addAll(arrayList2);
                vJ();
                ServiceContainer.getMainActivity().cn().Hw();
                if (this.DW != null) {
                    com.aide.ui.debugger.a.j6(this.j6, this.DW, this.FH);
                }
            }
        } catch (Throwable th) {
            if (rN) {
                iy.Mr(th, 363089374439167557L, this, str, list);
            }
            throw th;
        }
    }

    @ey(method = 568896236771978880L)
    public boolean U2() {
        try {
            if (lg) {
                iy.gn(-2820196717777107360L, this);
            }
            return this.Zo;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -2820196717777107360L, this);
            }
            throw th;
        }
    }

    @ey(method = 3962434720354954853L)
    public List<Integer> VH(String str) {
        try {
            if (lg) {
                iy.tp(582549777651418693L, this, str);
            }
            ArrayList arrayList = new ArrayList();
            String strLp = ServiceContainer.getProjectService().lp(str);
            if (strLp == null) {
                return arrayList;
            }
            String str2 = strLp + ":";
            Iterator<String> it = this.FH.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith(str2)) {
                    try {
                        arrayList.add(Integer.valueOf(Integer.parseInt(next.substring(str2.length()))));
                    } catch (Throwable unused) {
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, 582549777651418693L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1761818214197233808L)
    public List<d> Ws() {
        try {
            if (lg) {
                iy.gn(-5183642316649330200L, this);
            }
            ArrayList arrayList = new ArrayList();
            if (this.v5 && this.QX != null) {
                for (int i = 0; i < this.QX.size(); i++) {
                    arrayList.add(new d(this, this.QX.get(i), this.XL.get(i), this.aM.get(i)));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -5183642316649330200L, this);
            }
            throw th;
        }
    }

    @ey(method = 3602186599547379108L)
    public boolean a8() {
        try {
            if (lg) {
                iy.gn(3563974630994614944L, this);
            }
            return this.v5;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 3563974630994614944L, this);
            }
            throw th;
        }
    }

    @ey(method = 1696082570644692776L)
    public boolean aM() {
        try {
            if (lg) {
                iy.gn(1895542856932564008L, this);
            }
            return this.Hw;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 1895542856932564008L, this);
            }
            throw th;
        }
    }

    @ey(method = -3220727871733934844L)
    public void cb() {
        try {
            if (lg) {
                iy.gn(-1240966529089387456L, this);
            }
            if (this.DW != null) {
                nw();
                com.aide.ui.debugger.a.VH(this.j6, this.DW);
                cn();
            }
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -1240966529089387456L, this);
            }
            throw th;
        }
    }

    @ey(method = -1569356929270517425L)
    public void dx() {
        try {
            if (lg) {
                iy.gn(-3139904403419612257L, this);
            }
            if (this.DW != null) {
                nw();
                com.aide.ui.debugger.a.gn(this.j6, this.DW);
                cn();
            }
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -3139904403419612257L, this);
            }
            throw th;
        }
    }

    @ey(method = 597695890664166525L)
    public void ef() {
        try {
            if (lg) {
                iy.gn(2455255414962707469L, this);
            }
            if (this.DW == null || !this.Hw) {
                return;
            }
            com.aide.ui.debugger.a.Hw(this.j6, this.DW);
            Sf();
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 2455255414962707469L, this);
            }
            throw th;
        }
    }

    @ey(method = 1677239638992215448L)
    public void ei() {
        try {
            if (lg) {
                iy.gn(2896993758529286024L, this);
            }
            if (this.DW != null) {
                nw();
                com.aide.ui.debugger.a.v5(this.j6, this.DW);
                cn();
            }
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 2896993758529286024L, this);
            }
            throw th;
        }
    }

    @ey(method = -567726628418455625L)
    public void er(Context context, String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, ArrayList<String> arrayList4, ArrayList<String> arrayList5, ArrayList<String> arrayList6) {
        try {
            if (lg) {
                iy.QX(1274378208363448731L, this, new Object[]{context, str, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6});
            }
            Log.d("ADRT", "onBreakpointHit " + str);
            if (!str.equals(J0())) {
                Log.d("ADRT", "sendDisconnect " + str);
                com.aide.ui.debugger.a.DW(context, str);
                return;
            }
            if (this.v5) {
                return;
            }
            KD(true);
            this.v5 = true;
            try {
                this.VH = null;
                this.gn = null;
                this.u7 = 0;
                String[] strArrSplit = arrayList2.get(0).split(":");
                this.VH = strArrSplit[0];
                this.u7 = Integer.parseInt(strArrSplit[1]);
            } catch (Throwable unused) {
            }
            this.QX = arrayList;
            this.XL = arrayList2;
            this.aM = arrayList3;
            this.tp = arrayList4;
            this.EQ = arrayList5;
            this.we = arrayList6;
            MainActivity.fN(context);
            if (this.U2 != null) {
                com.aide.ui.debugger.a.FH(context, str, this.U2);
            }
        } catch (Throwable th) {
            if (rN) {
                iy.rN(th, 1274378208363448731L, this, new Object[]{context, str, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6});
            }
            throw th;
        }
    }

    @ey(method = -8643996757669283108L)
    public void g3(String str) {
        try {
            if (lg) {
                iy.tp(5094217814995161472L, this, str);
            }
            ef();
            ro(str);
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, 5094217814995161472L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -3765082597649570080L)
    public void gW(Context context, String str, String str2, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        try {
            if (lg) {
                iy.QX(-939195824568004292L, this, new Object[]{context, str, str2, arrayList, arrayList2, arrayList3});
            }
            if (!ServiceContainer.vJ() && str.equals(this.DW) && str2.equals(this.U2)) {
                this.J0 = arrayList;
                this.J8 = arrayList2;
                this.Ws = arrayList3;
                ServiceContainer.getMainActivity().cn().Hw();
            }
        } catch (Throwable th) {
            if (rN) {
                iy.rN(th, -939195824568004292L, this, new Object[]{context, str, str2, arrayList, arrayList2, arrayList3});
            }
            throw th;
        }
    }

    @ey(method = 4025770879710082503L)
    public List<c> gn() {
        try {
            if (lg) {
                iy.gn(2374690043258670699L, this);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = this.FH.iterator();
            while (it.hasNext()) {
                try {
                    String[] strArrSplit = it.next().split(":");
                    int i = Integer.parseInt(strArrSplit[1]);
                    String str = strArrSplit[0];
                    arrayList.add(new c(this, str, str.substring(str.lastIndexOf(47) + 1), i));
                } catch (Throwable unused) {
                }
            }
            Collections.sort(arrayList, new b(this));
            return arrayList;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 2374690043258670699L, this);
            }
            throw th;
        }
    }

    @ey(method = -627392130817600768L)
    public boolean j3(String str, int i) {
        try {
            if (lg) {
                iy.EQ(-462697607840020812L, this, str, new Integer(i));
            }
            if (this.v5 && i == this.u7 && str != null) {
                return str.equals(tp());
            }
            return false;
        } catch (Throwable th) {
            if (rN) {
                iy.Mr(th, -462697607840020812L, this, str, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3312348027750528019L)
    public void sG() {
        try {
            if (lg) {
                iy.gn(-448980322529703611L, this);
            }
            if (this.DW != null) {
                nw();
                com.aide.ui.debugger.a.u7(this.j6, this.DW);
                cn();
            }
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -448980322529703611L, this);
            }
            throw th;
        }
    }

    @ey(method = -1721512660169886144L)
    public void sh() {
        try {
            if (lg) {
                iy.gn(913561730875708200L, this);
            }
            this.Zo = false;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 913561730875708200L, this);
            }
            throw th;
        }
    }

    @ey(method = 4353147597957253577L)
    public String tp() {
        try {
            if (lg) {
                iy.gn(2171677986126384873L, this);
            }
            if (this.gn == null && this.VH != null) {
                this.gn = ServiceContainer.getProjectService().aj(this.VH);
            }
            return this.gn;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 2171677986126384873L, this);
            }
            throw th;
        }
    }

    @ey(method = 5587037882993843647L)
    public List<e> u7() {
        try {
            if (lg) {
                iy.gn(-3748331198109263053L, this);
            }
            ArrayList arrayList = new ArrayList();
            if (this.v5 && this.U2 != null && this.J0 != null) {
                for (int i = 0; i < this.J0.size(); i++) {
                    arrayList.add(new e(this, this.J0.get(i), this.J8.get(i), this.Ws.get(i)));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -3748331198109263053L, this);
            }
            throw th;
        }
    }

    @ey(method = 2362916972152692336L)
    public void v5() {
        try {
            if (lg) {
                iy.gn(-2911951198356601936L, this);
            }
            if (this.DW != null) {
                com.aide.ui.debugger.a.DW(this.j6, this.DW);
                ro(null);
                this.FH = new ArrayList<>();
                vJ();
                this.v5 = false;
                KD(false);
                this.Zo = false;
                this.U2 = null;
                ServiceContainer.getMainActivity().q7();
                ServiceContainer.getMainActivity().cn().Hw();
            }
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -2911951198356601936L, this);
            }
            throw th;
        }
    }

    @ey(method = 2138985614707642480L)
    public void vy(Context context, String str) {
        try {
            if (lg) {
                iy.EQ(2265783083659499712L, this, context, str);
            }
            if (ServiceContainer.vJ() || this.DW == null || !this.DW.equals(str)) {
                return;
            }
            Sf();
        } catch (Throwable th) {
            if (rN) {
                iy.Mr(th, 2265783083659499712L, this, context, str);
            }
            throw th;
        }
    }

    @ey(method = -5703055275941325328L)
    public int we() {
        try {
            if (lg) {
                iy.gn(4606965027223344128L, this);
            }
            return this.u7;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 4606965027223344128L, this);
            }
            throw th;
        }
    }

    @ey(method = 580776648886699929L)
    public void yS(Context context, String str) {
        try {
            if (lg) {
                iy.EQ(1217589706307194649L, this, context, str);
            }
            Log.d("ADRT", "onConnect " + str);
            if (!str.equals(J0())) {
                Log.d("ADRT", "sendDisconnect");
                com.aide.ui.debugger.a.DW(context, str);
                return;
            }
            if (ServiceContainer.vJ()) {
                rN();
            }
            Log.d("ADRT", "sendResume " + this.FH.size());
            com.aide.ui.debugger.a.Zo(context, str, this.FH);
            KD(true);
            if (ServiceContainer.vJ()) {
                return;
            }
            ServiceContainer.getMainActivity().cn().Hw();
            ServiceContainer.getMainActivity().q7();
        } catch (Throwable th) {
            if (rN) {
                iy.Mr(th, 1217589706307194649L, this, context, str);
            }
            throw th;
        }
    }
}
