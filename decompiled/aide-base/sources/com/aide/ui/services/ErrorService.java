package com.aide.ui.services;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.aide.engine.SyntaxError;
import com.aide.engine.service.IEngineErrorListener;
import com.aide.ui.ServiceContainer;
import com.aide.ui.q;
import com.aide.ui.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@cy(clazz = 7280145652699390275L, container = 7280145652699390275L, user = true)
/* loaded from: classes.dex */
public class ErrorService {

    @gy
    private static /* synthetic */ boolean QX;

    @fy
    private static /* synthetic */ boolean Ws;

    @dy(field = -4863873756997046120L)
    private HashSet<String> DW;

    @dy(field = -7218176575508134464L)
    private HashMap<String, List<SyntaxError>> EQ;

    @dy(field = -4069557312301949588L)
    private HashMap<String, Boolean> FH;

    @dy(field = 2846363599630113539L)
    private HashSet<String> Hw;

    @dy(field = 3904056600187910725L)
    private Set<ErrorListener> J0;

    @dy(field = -686851500446748605L)
    private Toast J8;

    @dy(field = -5827013279424254533L)
    private int VH;

    @dy(field = -1699830633004757019L)
    private int Zo;

    @dy(field = 7580735089989095440L)
    private int gn;

    @dy(field = -2226007883273782845L)
    private Object j6;

    @dy(field = -3935693940636718280L)
    private boolean tp;

    @dy(field = 4887464436083391736L)
    private int u7;

    @dy(field = 2543642664292346035L)
    private HashMap<String, SyntaxError[]> v5;

    @dy(field = 671959081182101984L)
    private int we;

    @cy(clazz = -1690314311695308625L, container = -1690314311695308625L, user = true)
    public interface ErrorListener {
        @ey(method = 4635607722099076665L)
        void DW();

        @ey(method = 1745761817541737655L)
        void Hw(String str);
    }

    @cy(clazz = 4898372310333821568L, container = 7280145652699390275L, user = true)
    class a extends IEngineErrorListener.Sub {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -332741298040772767L)
        public a() {
        }

        @Override // com.aide.engine.service.IEngineErrorListener
        @ey(method = -28857773258685423L)
        public void Of() {
            try {
                if (fY) {
                    iy.gn(1187152642542186585L, this);
                }
                ErrorService.this.J8();
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, 1187152642542186585L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.IEngineErrorListener
        @ey(method = 934342744633766481L)
        public void Qs(String str, SyntaxError[] syntaxErrorArr, boolean z) {
            try {
                if (fY) {
                    iy.we(2791883182209795249L, this, str, syntaxErrorArr, new Boolean(z));
                }
                ErrorService.this.Ws(str, syntaxErrorArr, z);
            } catch (Throwable th) {
                if (qp) {
                    iy.U2(th, 2791883182209795249L, this, str, syntaxErrorArr, new Boolean(z));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.IEngineErrorListener
        @ey(method = -1912735560368456353L)
        public void UT(String str) {
            try {
                if (fY) {
                    iy.tp(5589878294827060351L, this, str);
                }
                ErrorService.this.XL(str);
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, 5589878294827060351L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.IEngineErrorListener
        @ey(method = -3399415646117181264L)
        public void aj(String str) {
            try {
                if (fY) {
                    iy.tp(1456481490972365484L, this, str);
                }
                ErrorService.this.J0(str);
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, 1456481490972365484L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.IEngineErrorListener
        @ey(method = -3327833849004446927L)
        public void eU() {
            try {
                if (fY) {
                    iy.gn(522301321931098245L, this);
                }
                ErrorService.this.QX();
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, 522301321931098245L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 4898448937961907195L, container = 7280145652699390275L, user = true)
    class b implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 1308591821933777241L)
        final /* synthetic */ String WB;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -1120146361782112945L)
        public b(String str) {
            this.WB = str;
        }

        @Override // java.lang.Runnable
        @ey(method = -703793692570751523L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(558009766810328361L, this);
                }
                ErrorService.this.er(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, 558009766810328361L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 4898525565594056116L, container = 7280145652699390275L, user = true)
    class c implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 7856734463750520L)
        public c() {
        }

        @Override // java.lang.Runnable
        @ey(method = 2595839563360278180L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(558932496391935312L, this);
                }
                ErrorService.this.rN();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 558932496391935312L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 4898602193230268331L, container = 7280145652699390275L, user = true)
    class d implements Comparator<SyntaxError> {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -708739579988780679L)
        public d() {
        }

        @Override // java.util.Comparator
        @ey(method = -1019004872127376969L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(SyntaxError syntaxError, SyntaxError syntaxError2) {
            try {
                if (mb) {
                    iy.EQ(2182834501697785472L, this, syntaxError, syntaxError2);
                }
                return ErrorService.this.Mr(syntaxError.jw, syntaxError.fY, syntaxError2.jw, syntaxError2.fY);
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, 2182834501697785472L, this, syntaxError, syntaxError2);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 4898678820870543840L, container = 7280145652699390275L, user = true)
    class e implements Comparator<SyntaxError> {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(e.class);
        }

        @ey(method = 755009442413820960L)
        public e() {
        }

        @Override // java.util.Comparator
        @ey(method = -52263760203445464L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(SyntaxError syntaxError, SyntaxError syntaxError2) {
            try {
                if (mb) {
                    iy.EQ(-1872313321674864112L, this, syntaxError, syntaxError2);
                }
                return ErrorService.this.Mr(syntaxError.jw, syntaxError.fY, syntaxError2.jw, syntaxError2.fY);
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, -1872313321674864112L, this, syntaxError, syntaxError2);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(ErrorService.class);
    }

    @ey(method = -2949269441415757193L)
    public ErrorService() {
        try {
            if (Ws) {
                iy.gn(-4462276676758114725L, null);
            }
            this.j6 = new Object();
            this.DW = new HashSet<>();
            this.FH = new HashMap<>();
            this.Hw = new HashSet<>();
            this.v5 = new HashMap<>();
            this.EQ = new HashMap<>();
            this.J0 = new HashSet();
        } catch (Throwable th) {
            if (QX) {
                iy.aM(th, -4462276676758114725L, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -4619245317439229905L)
    public void J0(String str) {
        try {
            if (Ws) {
                iy.tp(1175817815983409920L, this, str);
            }
            this.Hw.add(str);
        } catch (Throwable th) {
            if (QX) {
                iy.j3(th, 1175817815983409920L, this, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -4545681042702756780L)
    public void J8() {
        HashMap<String, Boolean> map;
        int i;
        int iLg;
        try {
            if (Ws) {
                iy.gn(-2877600955492365927L, this);
            }
            synchronized (this.j6) {
                map = this.FH;
                this.FH = new HashMap<>();
                i = 0;
                this.tp = false;
            }
            HashSet hashSet = new HashSet();
            int i2 = 0;
            for (String str : this.v5.keySet()) {
                if (!this.Hw.contains(str)) {
                    hashSet.add(str);
                    map.put(str, Boolean.TRUE);
                } else if (this.DW.contains(str) && (iLg = lg(str, this.v5.get(str))) != 0) {
                    i++;
                    i2 += iLg;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                synchronized (this.j6) {
                    this.v5.remove(str2);
                }
            }
            synchronized (this.j6) {
                this.VH = i;
                this.Zo = i2;
            }
            Iterator<String> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                map.get(it2.next());
                Boolean bool = Boolean.TRUE;
            }
            x9();
        } catch (Throwable th) {
            if (QX) {
                iy.aM(th, -2877600955492365927L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 4305779849087798432L)
    public int Mr(int i, int i2, int i3, int i4) {
        try {
            if (Ws) {
                iy.J0(-2322235505769476189L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            if (i < i3) {
                return -1;
            }
            if (i > i3) {
                return 1;
            }
            return i2 - i4;
        } catch (Throwable th) {
            if (QX) {
                iy.a8(th, -2322235505769476189L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 2314398242636878464L)
    public void QX() {
        try {
            if (Ws) {
                iy.gn(907185713538071625L, this);
            }
            this.Hw.clear();
            synchronized (this.j6) {
                this.tp = true;
                this.gn = 0;
                this.u7 = 0;
            }
            x9();
        } catch (Throwable th) {
            if (QX) {
                iy.aM(th, 907185713538071625L, this);
            }
            throw th;
        }
    }

    @ey(method = -110175885192975771L)
    private void Qq(String str, SyntaxError[] syntaxErrorArr) {
        try {
            if (Ws) {
                iy.EQ(-447719187341546100L, this, str, syntaxErrorArr);
            }
            ServiceContainer.aj(new b(str));
        } catch (Throwable th) {
            if (QX) {
                iy.Mr(th, -447719187341546100L, this, str, syntaxErrorArr);
            }
            throw th;
        }
    }

    @ey(method = -901301393838274005L)
    private boolean Sf(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
        int i9;
        try {
            if (Ws) {
                iy.QX(-5494258034984205432L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            }
            if (U2(i, i2, i3, i4, i5, i6)) {
                return true;
            }
            i9 = 8;
            try {
                return U2(i, i2, i3, i4, i7, i8);
            } catch (Throwable th) {
                th = th;
                if (QX) {
                    Object[] objArr = new Object[i9];
                    objArr[0] = new Integer(i);
                    objArr[1] = new Integer(i2);
                    objArr[2] = new Integer(i3);
                    objArr[3] = new Integer(i4);
                    objArr[4] = new Integer(i5);
                    objArr[5] = new Integer(i6);
                    objArr[6] = new Integer(i7);
                    objArr[7] = new Integer(i8);
                    iy.rN(th, -5494258034984205432L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i9 = 8;
        }
    }

    @ey(method = 246996406631547440L)
    private boolean U2(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            if (Ws) {
                iy.QX(437965806155014507L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            }
            if (i == i3) {
                return i5 == i && i2 <= i6 && i4 >= i6;
            }
            if (i < i5 && i3 > i5) {
                return true;
            }
            if (i != i5 || i2 > i6) {
                return i3 == i5 && i4 >= i6;
            }
            return true;
        } catch (Throwable th) {
            if (QX) {
                iy.rN(th, 437965806155014507L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 536427937631784828L)
    public void Ws(String str, SyntaxError[] syntaxErrorArr, boolean z) {
        try {
            if (Ws) {
                iy.we(330580316906410845L, this, str, syntaxErrorArr, new Boolean(z));
            }
            synchronized (this.j6) {
                if (z) {
                    this.DW.add(str);
                    SyntaxError[] syntaxErrorArr2 = this.v5.get(str);
                    int iLg = lg(str, syntaxErrorArr2);
                    int iLg2 = lg(str, syntaxErrorArr);
                    if (iLg != iLg2) {
                        this.Zo += iLg2 - iLg;
                        if (iLg2 == 0) {
                            this.VH--;
                        } else if (iLg == 0) {
                            this.VH++;
                        }
                    } else if (iLg == 0 && iLg2 == 0 && syntaxErrorArr.length == 0 && syntaxErrorArr2 != null) {
                        int length = syntaxErrorArr2.length;
                    }
                } else {
                    this.DW.remove(str);
                }
                if (syntaxErrorArr.length == 0) {
                    this.v5.remove(str);
                } else {
                    this.v5.put(str, syntaxErrorArr);
                }
                if (this.FH.containsKey(str)) {
                    this.FH.remove(str);
                }
                if (this.gn < this.u7) {
                    this.gn++;
                }
            }
            this.Hw.add(str);
            Qq(str, syntaxErrorArr);
        } catch (Throwable th) {
            if (QX) {
                iy.U2(th, 330580316906410845L, this, str, syntaxErrorArr, new Boolean(z));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 2349120047632909600L)
    public void XL(String str) {
        try {
            if (Ws) {
                iy.tp(-2092456225757620949L, this, str);
            }
            synchronized (this.j6) {
                if (!this.FH.containsKey(str)) {
                    this.FH.put(str, Boolean.FALSE);
                }
                this.u7++;
            }
        } catch (Throwable th) {
            if (QX) {
                iy.j3(th, -2092456225757620949L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 136434864307249792L)
    private SyntaxError dx(List<SyntaxError> list, int i, int i2) {
        try {
            if (Ws) {
                iy.we(-7646178790261864345L, this, list, new Integer(i), new Integer(i2));
            }
            Collections.sort(list, new d());
            Collections.reverse(list);
            for (SyntaxError syntaxError : list) {
                if (Mr(i, i2, syntaxError.jw, syntaxError.fY) > 0) {
                    return syntaxError;
                }
            }
            return null;
        } catch (Throwable th) {
            if (QX) {
                iy.U2(th, -7646178790261864345L, this, list, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1062017327055049999L)
    public void er(String str) {
        try {
            if (Ws) {
                iy.tp(-2009814508936443180L, this, str);
            }
            if (this.J0 != null) {
                Iterator<ErrorListener> it = this.J0.iterator();
                while (it.hasNext()) {
                    it.next().Hw(str);
                }
            }
        } catch (Throwable th) {
            if (QX) {
                iy.j3(th, -2009814508936443180L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2135059312680162960L)
    private boolean g3(String str, SyntaxError syntaxError) {
        try {
            if (!Ws) {
                return false;
            }
            iy.EQ(-1118051786422299505L, this, str, syntaxError);
            return false;
        } catch (Throwable th) {
            if (QX) {
                iy.Mr(th, -1118051786422299505L, this, str, syntaxError);
            }
            throw th;
        }
    }

    @ey(method = -3344265392795872195L)
    private int lg(String str, SyntaxError[] syntaxErrorArr) {
        try {
            if (Ws) {
                iy.EQ(535546948916449756L, this, str, syntaxErrorArr);
            }
            if (syntaxErrorArr == null) {
                return 0;
            }
            int i = 0;
            for (SyntaxError syntaxError : syntaxErrorArr) {
                if (!g3(str, syntaxError) && syntaxError.Hw()) {
                    i++;
                }
            }
            return i;
        } catch (Throwable th) {
            if (QX) {
                iy.Mr(th, 535546948916449756L, this, str, syntaxErrorArr);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1087324494910622041L)
    public void rN() {
        try {
            if (Ws) {
                iy.gn(566554583035412552L, this);
            }
            if (this.J0 != null) {
                Iterator<ErrorListener> it = this.J0.iterator();
                while (it.hasNext()) {
                    it.next().DW();
                }
            }
        } catch (Throwable th) {
            if (QX) {
                iy.aM(th, 566554583035412552L, this);
            }
            throw th;
        }
    }

    @ey(method = 40998764434044944L)
    private SyntaxError ro(List<SyntaxError> list, int i, int i2) {
        try {
            if (Ws) {
                iy.we(3435483604778707965L, this, list, new Integer(i), new Integer(i2));
            }
            Collections.sort(list, new e());
            for (SyntaxError syntaxError : list) {
                if (Mr(i, i2, syntaxError.jw, syntaxError.fY) < 0) {
                    return syntaxError;
                }
            }
            return null;
        } catch (Throwable th) {
            if (QX) {
                iy.U2(th, 3435483604778707965L, this, list, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -268548208628683180L)
    private void tp(String str, SyntaxError syntaxError) {
        try {
            if (Ws) {
                iy.EQ(4333707487388497323L, this, str, syntaxError);
            }
            this.we++;
            if (!this.EQ.containsKey(str)) {
                this.EQ.put(str, new ArrayList());
            }
            this.EQ.get(str).add(syntaxError);
        } catch (Throwable th) {
            if (QX) {
                iy.Mr(th, 4333707487388497323L, this, str, syntaxError);
            }
            throw th;
        }
    }

    @ey(method = 2248988157178380288L)
    private void we(String str, Map<String, List<SyntaxError>> map) {
        try {
            if (Ws) {
                iy.EQ(2482708222448227455L, this, str, map);
            }
            for (Map.Entry<String, List<SyntaxError>> entry : map.entrySet()) {
                String key = entry.getKey();
                Iterator<SyntaxError> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    tp(key, it.next());
                }
            }
        } catch (Throwable th) {
            if (QX) {
                iy.Mr(th, 2482708222448227455L, this, str, map);
            }
            throw th;
        }
    }

    @ey(method = 3730877025401246240L)
    private void x9() {
        try {
            if (Ws) {
                iy.gn(2774130755386903011L, this);
            }
            ServiceContainer.aj(new c());
        } catch (Throwable th) {
            if (QX) {
                iy.aM(th, 2774130755386903011L, this);
            }
            throw th;
        }
    }

    @ey(method = -759150220404530248L)
    private void yS(HashSet<String> hashSet) {
        try {
            if (Ws) {
                iy.tp(3774102222032663053L, this, hashSet);
            }
            Iterator<String> it = hashSet.iterator();
            while (it.hasNext()) {
                er(it.next());
            }
            rN();
        } catch (Throwable th) {
            if (QX) {
                iy.j3(th, 3774102222032663053L, this, hashSet);
            }
            throw th;
        }
    }

    @ey(method = -297992063062515707L)
    public SyntaxError BT(String str, int i, int i2, int i3, int i4) {
        try {
            if (Ws) {
                iy.J8(-567704102018040L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            SyntaxError syntaxError = null;
            for (SyntaxError syntaxError2 : ei(str)) {
                if (Sf(syntaxError2.jw, syntaxError2.fY, syntaxError2.qp, syntaxError2.k2, i, i2, i3, i4) && (syntaxError == null || syntaxError.AL == null)) {
                    syntaxError = syntaxError2;
                }
            }
            return syntaxError;
        } catch (Throwable th) {
            if (QX) {
                iy.lg(th, -567704102018040L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 1125821351561748625L)
    public void EQ(String str, Map<String, List<SyntaxError>> map) {
        try {
            if (Ws) {
                iy.EQ(-3958357429281665280L, this, str, map);
            }
            we(str, map);
            HashSet<String> hashSet = new HashSet<>();
            hashSet.addAll(this.EQ.keySet());
            yS(hashSet);
        } catch (Throwable th) {
            if (QX) {
                iy.Mr(th, -3958357429281665280L, this, str, map);
            }
            throw th;
        }
    }

    @ey(method = -221847290955190040L)
    public void I(SyntaxError syntaxError) {
        try {
            if (Ws) {
                iy.tp(-3789978626481871455L, this, syntaxError);
            }
            View viewInflate = LayoutInflater.from(ServiceContainer.getContext()).inflate(r.error_popup, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(q.errorPopupText)).setText(syntaxError.j6());
            if (this.J8 != null) {
                this.J8.cancel();
            }
            Toast toast = new Toast(ServiceContainer.getContext());
            this.J8 = toast;
            toast.setDuration(0);
            this.J8.setView(viewInflate);
            this.J8.show();
        } catch (Throwable th) {
            if (QX) {
                iy.j3(th, -3789978626481871455L, this, syntaxError);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009c  */
    @abcd.ey(method = 771531498861589224L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair<com.aide.ui.util.FileSpan, com.aide.engine.SyntaxError> KD(java.lang.String r18, int r19, int r20) throws java.lang.Throwable {
        /*
            r17 = this;
            r8 = r17
            r7 = r18
            boolean r0 = com.aide.ui.services.ErrorService.Ws     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L26
            r1 = 1800493986015936211(0x18fca3bda8b4fed3, double:2.5711645042598482E-188)
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> L93
            r9 = r19
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> L23
            r10 = r20
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L91
            r3 = r17
            r4 = r18
            abcd.iy.we(r1, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L91
            goto L2a
        L23:
            r0 = move-exception
            goto L96
        L26:
            r9 = r19
            r10 = r20
        L2a:
            java.util.List r0 = r17.nw()     // Catch: java.lang.Throwable -> L91
            java.util.Collections.sort(r0)     // Catch: java.lang.Throwable -> L91
            r1 = 0
            r2 = 0
        L33:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L91
            r4 = 1
            if (r2 >= r3) goto L53
            java.lang.Object r3 = r0.get(r2)     // Catch: java.lang.Throwable -> L91
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L91
            boolean r5 = r3.equals(r7)     // Catch: java.lang.Throwable -> L91
            if (r5 == 0) goto L47
            goto L53
        L47:
            int r3 = r3.compareTo(r7)     // Catch: java.lang.Throwable -> L91
            if (r3 <= 0) goto L50
            r9 = 1
            r10 = 1
            goto L53
        L50:
            int r2 = r2 + 1
            goto L33
        L53:
            r3 = r2
            r5 = 0
        L55:
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L91
            if (r3 < r6) goto L5c
            r3 = 0
        L5c:
            java.lang.Object r6 = r0.get(r3)     // Catch: java.lang.Throwable -> L91
            r12 = r6
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L91
            java.util.List r6 = r8.P8(r12)     // Catch: java.lang.Throwable -> L91
            com.aide.engine.SyntaxError r6 = r8.ro(r6, r9, r10)     // Catch: java.lang.Throwable -> L91
            if (r6 == 0) goto L83
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.Throwable -> L91
            com.aide.ui.util.FileSpan r1 = new com.aide.ui.util.FileSpan     // Catch: java.lang.Throwable -> L91
            int r13 = r6.jw     // Catch: java.lang.Throwable -> L91
            int r14 = r6.fY     // Catch: java.lang.Throwable -> L91
            int r15 = r6.qp     // Catch: java.lang.Throwable -> L91
            int r2 = r6.k2     // Catch: java.lang.Throwable -> L91
            r11 = r1
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L91
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L91
            return r0
        L83:
            int r3 = r3 + 1
            if (r5 == 0) goto L89
            r0 = 0
            return r0
        L89:
            if (r3 != r2) goto L8d
            r5 = 1
            goto L8e
        L8d:
            r5 = 0
        L8e:
            r9 = 1
            r10 = 1
            goto L55
        L91:
            r0 = move-exception
            goto L98
        L93:
            r0 = move-exception
            r9 = r19
        L96:
            r10 = r20
        L98:
            boolean r1 = com.aide.ui.services.ErrorService.QX
            if (r1 == 0) goto Lb4
            r2 = 1800493986015936211(0x18fca3bda8b4fed3, double:2.5711645042598482E-188)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r10)
            r1 = r0
            r4 = r17
            r5 = r18
            r7 = r9
            abcd.iy.U2(r1, r2, r4, r5, r6, r7)
        Lb4:
            goto Lb6
        Lb5:
            throw r0
        Lb6:
            goto Lb5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.services.ErrorService.KD(java.lang.String, int, int):android.util.Pair");
    }

    @ey(method = 2985714078150308193L)
    public void Mz(ErrorListener errorListener) {
        try {
            if (Ws) {
                iy.tp(630563308902908004L, this, errorListener);
            }
            this.J0.remove(errorListener);
        } catch (Throwable th) {
            if (QX) {
                iy.j3(th, 630563308902908004L, this, errorListener);
            }
            throw th;
        }
    }

    @ey(method = 1187678975872932016L)
    public List<SyntaxError> P8(String str) {
        ArrayList arrayList;
        try {
            if (Ws) {
                iy.tp(-881587552857227175L, this, str);
            }
            synchronized (this.j6) {
                arrayList = new ArrayList();
                if (str != null && this.v5.containsKey(str)) {
                    for (SyntaxError syntaxError : this.v5.get(str)) {
                        if (syntaxError.Hw()) {
                            arrayList.add(syntaxError);
                        }
                    }
                }
                if (str != null && this.EQ.containsKey(str)) {
                    arrayList.addAll(this.EQ.get(str));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (QX) {
                iy.j3(th, -881587552857227175L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 6149761307723786400L)
    public List<String> SI() {
        try {
            if (Ws) {
                iy.gn(-3024841889717324195L, this);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, SyntaxError[]> entry : this.v5.entrySet()) {
                if (entry.getKey().endsWith(".java")) {
                    for (SyntaxError syntaxError : entry.getValue()) {
                        if (syntaxError.v5()) {
                            arrayList.add(syntaxError.DW());
                        }
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (QX) {
                iy.aM(th, -3024841889717324195L, this);
            }
            throw th;
        }
    }

    @ey(method = 39879903147195043L)
    public boolean a8(String str) {
        try {
            if (Ws) {
                iy.tp(-4441585724885288L, this, str);
            }
            Iterator<Map.Entry<String, SyntaxError[]>> it = this.v5.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    return false;
                }
                Map.Entry<String, SyntaxError[]> next = it.next();
                if (next.getKey().endsWith(str)) {
                    for (SyntaxError syntaxError : next.getValue()) {
                        if (syntaxError.Hw()) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (QX) {
                iy.j3(th, -4441585724885288L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -2238729952676112840L)
    public void aM() {
        try {
            if (Ws) {
                iy.gn(-691422872440070927L, this);
            }
            j3();
            this.DW.clear();
            this.FH.clear();
            this.Hw.clear();
            this.v5.clear();
            this.Zo = 0;
            this.VH = 0;
            x9();
        } catch (Throwable th) {
            if (QX) {
                iy.aM(th, -691422872440070927L, this);
            }
            throw th;
        }
    }

    @ey(method = 3123585767042433693L)
    public void ca() {
        try {
            if (Ws) {
                iy.gn(395281164242289600L, this);
            }
            this.J0 = null;
        } catch (Throwable th) {
            if (QX) {
                iy.aM(th, 395281164242289600L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    @abcd.ey(method = -890547876868838160L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair<com.aide.ui.util.FileSpan, com.aide.engine.SyntaxError> cb(java.lang.String r19, int r20, int r21) throws java.lang.Throwable {
        /*
            r18 = this;
            r8 = r18
            r7 = r19
            boolean r0 = com.aide.ui.services.ErrorService.Ws     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L26
            r1 = 3736361243502609953(0x33da38c13f828621, double:6.527121272771486E-59)
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> La0
            r9 = r20
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> L23
            r10 = r21
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L9e
            r3 = r18
            r4 = r19
            abcd.iy.we(r1, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9e
            goto L2a
        L23:
            r0 = move-exception
            goto La3
        L26:
            r9 = r20
            r10 = r21
        L2a:
            java.util.List r0 = r18.nw()     // Catch: java.lang.Throwable -> L9e
            java.util.Collections.sort(r0)     // Catch: java.lang.Throwable -> L9e
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L9e
            r2 = 1
            int r1 = r1 - r2
        L37:
            r3 = 1000000(0xf4240, float:1.401298E-39)
            if (r1 < 0) goto L59
            java.lang.Object r4 = r0.get(r1)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L9e
            boolean r5 = r4.equals(r7)     // Catch: java.lang.Throwable -> L9e
            if (r5 == 0) goto L49
            goto L59
        L49:
            int r4 = r4.compareTo(r7)     // Catch: java.lang.Throwable -> L9e
            if (r4 >= 0) goto L56
            r9 = 1000000(0xf4240, float:1.401298E-39)
            r10 = 1000000(0xf4240, float:1.401298E-39)
            goto L59
        L56:
            int r1 = r1 + (-1)
            goto L37
        L59:
            r4 = 0
            r5 = r1
            r6 = 0
        L5c:
            if (r5 >= 0) goto L63
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L9e
            int r5 = r5 - r2
        L63:
            java.lang.Object r11 = r0.get(r5)     // Catch: java.lang.Throwable -> L9e
            r13 = r11
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L9e
            java.util.List r11 = r8.P8(r13)     // Catch: java.lang.Throwable -> L9e
            com.aide.engine.SyntaxError r11 = r8.dx(r11, r9, r10)     // Catch: java.lang.Throwable -> L9e
            if (r11 == 0) goto L8c
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.Throwable -> L9e
            com.aide.ui.util.FileSpan r1 = new com.aide.ui.util.FileSpan     // Catch: java.lang.Throwable -> L9e
            int r14 = r11.jw     // Catch: java.lang.Throwable -> L9e
            int r15 = r11.fY     // Catch: java.lang.Throwable -> L9e
            int r2 = r11.qp     // Catch: java.lang.Throwable -> L9e
            int r3 = r11.k2     // Catch: java.lang.Throwable -> L9e
            r12 = r1
            r16 = r2
            r17 = r3
            r12.<init>(r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L9e
            r0.<init>(r1, r11)     // Catch: java.lang.Throwable -> L9e
            return r0
        L8c:
            int r5 = r5 + (-1)
            if (r6 == 0) goto L92
            r0 = 0
            return r0
        L92:
            if (r5 != r1) goto L96
            r6 = 1
            goto L97
        L96:
            r6 = 0
        L97:
            r9 = 1000000(0xf4240, float:1.401298E-39)
            r10 = 1000000(0xf4240, float:1.401298E-39)
            goto L5c
        L9e:
            r0 = move-exception
            goto La5
        La0:
            r0 = move-exception
            r9 = r20
        La3:
            r10 = r21
        La5:
            boolean r1 = com.aide.ui.services.ErrorService.QX
            if (r1 == 0) goto Lc1
            r2 = 3736361243502609953(0x33da38c13f828621, double:6.527121272771486E-59)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r10)
            r1 = r0
            r4 = r18
            r5 = r19
            r7 = r9
            abcd.iy.U2(r1, r2, r4, r5, r6, r7)
        Lc1:
            goto Lc3
        Lc2:
            throw r0
        Lc3:
            goto Lc2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.services.ErrorService.cb(java.lang.String, int, int):android.util.Pair");
    }

    @ey(method = 790092134260613605L)
    public int cn() {
        int i;
        try {
            if (Ws) {
                iy.gn(-2240174328558790900L, this);
            }
            synchronized (this.j6) {
                i = this.gn;
            }
            return i;
        } catch (Throwable th) {
            if (QX) {
                iy.aM(th, -2240174328558790900L, this);
            }
            throw th;
        }
    }

    @ey(method = -2744857671614015685L)
    public void ef() {
        try {
            if (Ws) {
                iy.gn(2674153954221393960L, this);
            }
            ServiceContainer.getEngineService().I(new a());
        } catch (Throwable th) {
            if (QX) {
                iy.aM(th, 2674153954221393960L, this);
            }
            throw th;
        }
    }

    @ey(method = 286128498393665688L)
    public List<SyntaxError> ei(String str) {
        ArrayList arrayList;
        try {
            if (Ws) {
                iy.tp(2348559977434942899L, this, str);
            }
            synchronized (this.j6) {
                arrayList = new ArrayList();
                if (str != null && this.v5.containsKey(str)) {
                    for (SyntaxError syntaxError : this.v5.get(str)) {
                        if (syntaxError.Hw() || syntaxError.Zo()) {
                            arrayList.add(syntaxError);
                        }
                    }
                }
                if (str != null && this.EQ.containsKey(str)) {
                    arrayList.addAll(this.EQ.get(str));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (QX) {
                iy.j3(th, 2348559977434942899L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -5290140451982754456L)
    public int gW() {
        int i;
        try {
            if (Ws) {
                iy.gn(-4828112959657813067L, this);
            }
            synchronized (this.j6) {
                i = this.Zo + this.we;
            }
            return i;
        } catch (Throwable th) {
            if (QX) {
                iy.aM(th, -4828112959657813067L, this);
            }
            throw th;
        }
    }

    @ey(method = -1244666230890445188L)
    public void j3() {
        try {
            if (Ws) {
                iy.gn(4510870918669962599L, this);
            }
            HashSet<String> hashSet = new HashSet<>(this.EQ.keySet());
            this.EQ.clear();
            this.we = 0;
            yS(hashSet);
        } catch (Throwable th) {
            if (QX) {
                iy.aM(th, 4510870918669962599L, this);
            }
            throw th;
        }
    }

    @ey(method = 251012630065196165L)
    public List<String> nw() {
        ArrayList arrayList;
        try {
            if (Ws) {
                iy.gn(474246063975623980L, this);
            }
            synchronized (this.j6) {
                HashSet hashSet = new HashSet(this.v5.keySet());
                hashSet.addAll(this.EQ.keySet());
                arrayList = new ArrayList(hashSet);
            }
            return arrayList;
        } catch (Throwable th) {
            if (QX) {
                iy.aM(th, 474246063975623980L, this);
            }
            throw th;
        }
    }

    @ey(method = -3777307087808647185L)
    public List<SyntaxError> sG(String str) {
        ArrayList arrayList;
        try {
            if (Ws) {
                iy.tp(1044523065692054204L, this, str);
            }
            synchronized (this.j6) {
                arrayList = new ArrayList();
                if (str != null && this.v5.containsKey(str)) {
                    for (SyntaxError syntaxError : this.v5.get(str)) {
                        if (syntaxError.Hw() || syntaxError.Zo() || syntaxError.FH()) {
                            arrayList.add(syntaxError);
                        }
                    }
                }
                if (str != null && this.EQ.containsKey(str)) {
                    arrayList.addAll(this.EQ.get(str));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (QX) {
                iy.j3(th, 1044523065692054204L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -2248829536143181824L)
    public int sh() {
        int i;
        try {
            if (Ws) {
                iy.gn(-1551024376683851103L, this);
            }
            synchronized (this.j6) {
                i = this.u7;
            }
            return i;
        } catch (Throwable th) {
            if (QX) {
                iy.aM(th, -1551024376683851103L, this);
            }
            throw th;
        }
    }

    @ey(method = -178446112901248000L)
    public void u7(ErrorListener errorListener) {
        try {
            if (Ws) {
                iy.tp(-386385262987750513L, this, errorListener);
            }
            this.J0.add(errorListener);
        } catch (Throwable th) {
            if (QX) {
                iy.j3(th, -386385262987750513L, this, errorListener);
            }
            throw th;
        }
    }

    @ey(method = 1135022302894514679L)
    public boolean vJ() {
        boolean z;
        try {
            if (Ws) {
                iy.gn(-1939687651977980256L, this);
            }
            synchronized (this.j6) {
                z = this.tp;
            }
            return z;
        } catch (Throwable th) {
            if (QX) {
                iy.aM(th, -1939687651977980256L, this);
            }
            throw th;
        }
    }

    @ey(method = 5057200126480824360L)
    public SyntaxError vy(String str, int i, int i2, int i3, int i4) {
        try {
            if (Ws) {
                iy.J8(-1879109525606687755L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            SyntaxError syntaxError = null;
            for (SyntaxError syntaxError2 : ei(str)) {
                if (Sf(syntaxError2.jw, syntaxError2.fY, syntaxError2.qp, syntaxError2.k2, i, i2, i3, i4) && (syntaxError == null || syntaxError.AL == null)) {
                    syntaxError = syntaxError2;
                }
            }
            if (syntaxError == null) {
                for (SyntaxError syntaxError3 : ei(str)) {
                    if (Sf(syntaxError3.jw, 1, syntaxError3.qp, Integer.MAX_VALUE, i, 1, i3, Integer.MAX_VALUE) && (syntaxError == null || syntaxError.AL == null)) {
                        syntaxError = syntaxError3;
                    }
                }
            }
            return syntaxError;
        } catch (Throwable th) {
            if (QX) {
                iy.lg(th, -1879109525606687755L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }
}
