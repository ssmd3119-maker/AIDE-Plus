package abcd;

import abcd.pg0;
import abcd.tb0;
import abcd.z80;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class gc0 {
    private static /* synthetic */ int[] P8;
    private static final Map<WeakReference<gc0>, Boolean> vy = new ConcurrentHashMap();
    private Collection<? extends a70> BT;
    private final b70<dc0> DW;
    private final ec0 EQ;
    private List<dc0> FH;
    private List<sb0> Hw;
    private final c J0;
    private final WeakReference<gc0> J8;
    private boolean Mr;
    private List<dc0> QX;
    private boolean U2;
    private xa0 VH;
    private e.a Ws;
    private byte[] XL;
    private xa0[] Zo;
    private boolean a8;
    private boolean aM;
    private boolean er;
    private int gW;
    private Deflater gn;
    private boolean j3;
    private final uf0<dc0>[] j6;
    private boolean lg;
    private boolean rN;
    private final cc0 tp;
    private final g70 u7;
    private Set<a70> v5;
    private final e we;
    private boolean yS;

    class a implements Comparator<dc0> {
        public a(gc0 gc0Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(dc0 dc0Var, dc0 dc0Var2) {
            int i = (dc0Var.CU() ? 1 : 0) - (dc0Var2.CU() ? 1 : 0);
            if (i != 0) {
                return i;
            }
            int iJJ = dc0Var.jJ() - dc0Var2.jJ();
            if (iJJ != 0) {
                return iJJ;
            }
            int iXG = (dc0Var.XG() >>> 1) - (dc0Var2.XG() >>> 1);
            if (iXG != 0) {
                return iXG;
            }
            int iXG2 = (dc0Var.XG() & 1) - (dc0Var2.XG() & 1);
            if (iXG2 != 0) {
                return iXG2;
            }
            int i2 = (!dc0Var.Xa() ? 1 : 0) - (!dc0Var2.Xa() ? 1 : 0);
            return i2 != 0 ? i2 : dc0Var2.wc() - dc0Var.wc();
        }
    }

    class b implements Runnable {
        private final /* synthetic */ yb0 WB;
        private final /* synthetic */ List mb;

        public b(gc0 gc0Var, yb0 yb0Var, List list) {
            this.WB = yb0Var;
            this.mb = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.WB.call();
            } catch (Throwable th) {
                this.mb.add(th);
            }
        }
    }

    private class c {
        private volatile d j6;

        public c(gc0 gc0Var) {
            d dVar = d.COUNTING;
            if (gc0Var.EQ.J0()) {
                if (gc0Var.EQ.EQ() <= 0) {
                    Runtime.getRuntime().availableProcessors();
                }
                gc0Var.EQ.Zo();
                gc0Var.EQ.DW();
            }
        }
    }

    public enum d {
        COUNTING,
        GETTING_SIZES,
        FINDING_SOURCES,
        COMPRESSING,
        WRITING;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] dVarArrValuesCustom = values();
            int length = dVarArrValuesCustom.length;
            d[] dVarArr = new d[length];
            System.arraycopy(dVarArrValuesCustom, 0, dVarArr, 0, length);
            return dVarArr;
        }
    }

    public static class e {
        Set<a70> DW;
        long EQ;
        Collection<sb0> FH;
        int Hw;
        long J0;
        long J8;
        long QX;
        long VH;
        long Ws;
        long XL;
        int Zo;
        a[] aM;
        long gn;
        Set<a70> j6;
        long tp;
        long u7;
        int v5;
        long we;

        public static class a {
            long DW;
            long FH;
            long Hw;
            long Zo;
            long j6;
            long v5;
        }

        public e() {
            a[] aVarArr = new a[5];
            this.aM = aVarArr;
            aVarArr[1] = new a();
            this.aM[2] = new a();
            this.aM[3] = new a();
            this.aM[4] = new a();
        }

        public long DW() {
            return this.XL;
        }

        public String j6() {
            return MessageFormat.format(JGitText.DW().packWriterStatistics, Long.valueOf(this.VH), Long.valueOf(this.gn), Long.valueOf(this.u7), Long.valueOf(this.tp));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gc0(ec0 ec0Var, g70 g70Var) {
        uf0<dc0>[] uf0VarArr = new uf0[5];
        this.j6 = uf0VarArr;
        uf0VarArr[1] = new uf0<>();
        this.j6[2] = new uf0<>();
        this.j6[3] = new uf0<>();
        this.j6[4] = new uf0<>();
        this.DW = new b70<>();
        this.FH = new uf0();
        this.Hw = new ArrayList(2);
        this.v5 = Collections.emptySet();
        this.rN = true;
        this.EQ = ec0Var;
        this.u7 = g70Var;
        if (g70Var instanceof cc0) {
            this.tp = (cc0) g70Var;
        } else {
            this.tp = null;
        }
        this.aM = ec0Var.we();
        this.j3 = ec0Var.J8();
        this.U2 = true;
        this.we = new e();
        this.J0 = new c(this);
        WeakReference<gc0> weakReference = new WeakReference<>(this);
        this.J8 = weakReference;
        vy.put(weakReference, Boolean.TRUE);
    }

    private void BT(j70 j70Var, List<dc0> list) {
        this.er = false;
        this.tp.Zo(this, j70Var, list);
        if (this.er) {
            U2(list);
        }
    }

    private void EQ(j70 j70Var) {
        j70Var.FH();
    }

    private void Hw(o90 o90Var, int i) {
        cc0 cc0Var = this.tp;
        dc0 dc0VarJ6 = cc0Var != null ? cc0Var.j6(o90Var) : new dc0(o90Var);
        dc0VarJ6.jw(i);
        this.j6[o90Var.aj()].add(dc0VarJ6);
        this.DW.v5(dc0VarJ6);
    }

    private void I(fc0 fc0Var) {
        ca(fc0Var, this.j6[1]);
        ca(fc0Var, this.j6[4]);
        ca(fc0Var, this.j6[2]);
        ca(fc0Var, this.j6[3]);
    }

    private int J0(dc0[] dc0VarArr, int i, int i2) {
        Iterator<dc0> it = this.j6[i2].iterator();
        while (it.hasNext()) {
            dc0 next = it.next();
            if (!next.CU() && !next.et()) {
                next.qp(0);
                dc0VarArr[i] = next;
                i++;
            }
        }
        return i;
    }

    private void J8(j70 j70Var, g90 g90Var, Set<? extends a70> set, Set<? extends a70> set2) throws i40, j40 {
        n90 n90Var;
        m90 m90Var;
        long j;
        List<o90> list;
        m90 m90Var2;
        o90 next;
        n90 n90Var2;
        m90 m90Var3;
        long j2;
        List<o90> list2;
        HashSet hashSet;
        m90 m90Var4;
        long jCurrentTimeMillis = System.currentTimeMillis();
        v5(d.COUNTING, j70Var, 0L);
        Set<? extends a70> setEmptySet = set2 == null ? Collections.emptySet() : set2;
        this.we.j6 = Collections.unmodifiableSet(new HashSet(set));
        this.we.DW = Collections.unmodifiableSet(new HashSet(setEmptySet));
        ArrayList arrayList = new ArrayList(set.size() + setEmptySet.size());
        arrayList.addAll(set);
        arrayList.addAll(setEmptySet);
        HashMap map = new HashMap();
        m90 m90VarVJ = g90Var.vJ("inCachedPack");
        m90 m90VarVJ2 = g90Var.vJ("include");
        m90 m90VarVJ3 = g90Var.vJ("added");
        n90 n90Var3 = new n90();
        n90Var3.add(m90VarVJ);
        g90Var.yO(false);
        g90Var.EQ(m90VarVJ2);
        int size = setEmptySet.size();
        if (setEmptySet.isEmpty()) {
            g90Var.wc(q90.COMMIT_TIME_DESC);
            if (this.lg && this.tp != null) {
                HashSet hashSet2 = new HashSet(set);
                LinkedList linkedList = new LinkedList();
                Iterator<sb0> it = this.tp.Hw().iterator();
                while (it.hasNext()) {
                    Iterator<sb0> it2 = it;
                    sb0 next2 = it.next();
                    if (hashSet2.containsAll(next2.FH())) {
                        hashSet2.removeAll(next2.FH());
                        linkedList.add(next2);
                    }
                    Iterator<a70> it3 = next2.FH().iterator();
                    while (it3.hasNext()) {
                        Iterator<a70> it4 = it3;
                        a70 next3 = it3.next();
                        map.put(next3, next2);
                        arrayList.add(next3);
                        it3 = it4;
                    }
                    it = it2;
                }
                if (hashSet2.isEmpty() && !linkedList.isEmpty()) {
                    this.Hw.addAll(linkedList);
                    Iterator it5 = linkedList.iterator();
                    while (it5.hasNext()) {
                        j70Var.v5((int) ((sb0) it5.next()).DW());
                    }
                    EQ(j70Var);
                    this.we.J0 = System.currentTimeMillis() - jCurrentTimeMillis;
                    return;
                }
                size += map.size();
            }
        } else {
            g90Var.wc(q90.TOPO);
            if (this.a8) {
                g90Var.et(q90.BOUNDARY, true);
            }
        }
        List<o90> arrayList2 = new ArrayList<>(set.size());
        List<o90> arrayList3 = new ArrayList<>(size);
        ArrayList arrayList4 = new ArrayList(set.size());
        s80 s80VarMz = g90Var.Mz(arrayList, true);
        while (true) {
            try {
                try {
                    next = s80VarMz.next();
                } catch (q40 e2) {
                    e = e2;
                    n90Var = n90Var3;
                    m90Var = m90VarVJ3;
                    j = jCurrentTimeMillis;
                    list = arrayList2;
                    m90Var2 = m90VarVJ2;
                }
                if (next == null) {
                    s80VarMz.j6();
                    if (!arrayList4.isEmpty()) {
                        ArrayList arrayList5 = new ArrayList(arrayList4.size());
                        Iterator it6 = arrayList4.iterator();
                        while (it6.hasNext()) {
                            arrayList5.add(((r90) it6.next()).br());
                        }
                        do {
                            try {
                            } finally {
                            }
                        } while (g90Var.Mz(arrayList5, true).next() != null);
                    }
                    if (g90Var instanceof z80.b) {
                        z80.b bVar = (z80.b) g90Var;
                        Iterator<o90> it7 = arrayList2.iterator();
                        while (it7.hasNext()) {
                            bVar.zh(it7.next());
                        }
                        Collection<? extends a70> collection = this.BT;
                        if (collection != null) {
                            Iterator<? extends a70> it8 = collection.iterator();
                            while (it8.hasNext()) {
                                bVar.AL(g90Var.I(it8.next()));
                            }
                        }
                    } else {
                        Iterator<o90> it9 = arrayList2.iterator();
                        while (it9.hasNext()) {
                            g90Var.Ev(it9.next());
                            m90VarVJ2 = m90VarVJ2;
                            n90Var3 = n90Var3;
                            m90VarVJ3 = m90VarVJ3;
                            arrayList2 = arrayList2;
                        }
                    }
                    Iterator<o90> it10 = arrayList3.iterator();
                    while (it10.hasNext()) {
                        g90Var.WB(it10.next());
                        m90VarVJ2 = m90VarVJ2;
                        n90Var3 = n90Var3;
                        m90VarVJ3 = m90VarVJ3;
                        arrayList2 = arrayList2;
                    }
                    int iVH = this.EQ.VH();
                    HashSet hashSet3 = new HashSet();
                    uf0 uf0Var = new uf0();
                    while (true) {
                        k90 k90VarG3 = g90Var.g3();
                        if (k90VarG3 == null) {
                            break;
                        }
                        if (we(k90VarG3)) {
                            n90Var2 = n90Var3;
                            m90Var3 = m90VarVJ3;
                            j2 = jCurrentTimeMillis;
                            list2 = arrayList2;
                            hashSet = hashSet3;
                            m90Var4 = m90VarVJ2;
                        } else {
                            if (k90VarG3.lp(m90VarVJ)) {
                                j2 = jCurrentTimeMillis;
                                sb0 sb0Var = (sb0) map.get(k90VarG3);
                                if (XL(sb0Var, m90VarVJ2, g90Var)) {
                                    hashSet = hashSet3;
                                    n90 n90Var4 = n90Var3;
                                    n90Var2 = n90Var3;
                                    List<o90> list3 = arrayList2;
                                    m90Var3 = m90VarVJ3;
                                    list2 = arrayList2;
                                    m90Var4 = m90VarVJ2;
                                    cb(g90Var, n90Var4, list3, arrayList3, sb0Var);
                                    uf0Var = new uf0();
                                    EQ(j70Var);
                                    v5(d.COUNTING, j70Var, 0L);
                                    hashSet3 = hashSet;
                                    m90VarVJ2 = m90Var4;
                                    jCurrentTimeMillis = j2;
                                    n90Var3 = n90Var2;
                                    m90VarVJ3 = m90Var3;
                                    arrayList2 = list2;
                                } else {
                                    hashSet = hashSet3;
                                    n90Var2 = n90Var3;
                                    m90Var3 = m90VarVJ3;
                                    list2 = arrayList2;
                                }
                            } else {
                                n90Var2 = n90Var3;
                                m90Var3 = m90VarVJ3;
                                j2 = jCurrentTimeMillis;
                                list2 = arrayList2;
                                hashSet = hashSet3;
                            }
                            m90Var4 = m90VarVJ2;
                            if (!k90VarG3.lp(m90.Hw)) {
                                uf0Var.add(k90VarG3);
                                j70Var.v5(1);
                                hashSet3 = hashSet;
                                m90VarVJ2 = m90Var4;
                                jCurrentTimeMillis = j2;
                                n90Var3 = n90Var2;
                                m90VarVJ3 = m90Var3;
                                arrayList2 = list2;
                            } else if (hashSet.size() <= iVH) {
                                hashSet.add(k90VarG3.Eq());
                            }
                        }
                        hashSet3 = hashSet;
                        m90VarVJ2 = m90Var4;
                        jCurrentTimeMillis = j2;
                        n90Var3 = n90Var2;
                        m90VarVJ3 = m90Var3;
                        arrayList2 = list2;
                    }
                    if (this.yS) {
                        Iterator it11 = uf0Var.iterator();
                        while (it11.hasNext()) {
                            Hw((k90) it11.next(), 0);
                        }
                    } else {
                        Iterator it12 = uf0Var.iterator();
                        int i = 0;
                        boolean z = false;
                        while (it12.hasNext()) {
                            k90 k90Var = (k90) it12.next();
                            if (!k90Var.lp(m90VarVJ3)) {
                                k90Var.x9(m90VarVJ3);
                                Hw(k90Var, 0);
                                i++;
                            }
                            for (int i2 = 0; i2 < k90Var.et(); i2++) {
                                o90 o90VarWc = k90Var.wc(i2);
                                if (!o90VarWc.lp(m90VarVJ3) && !o90VarWc.lp(m90.Hw)) {
                                    o90VarWc.x9(m90VarVJ3);
                                    Hw(o90VarWc, 0);
                                    i++;
                                }
                            }
                            if (!z && 4096 < i) {
                                Iterator<a70> it13 = this.v5.iterator();
                                while (it13.hasNext()) {
                                    o90 o90VarCb = g90Var.cb(it13.next());
                                    if ((o90VarCb instanceof k90) && o90VarCb.lp(m90VarVJ2) && !o90VarCb.lp(m90.Hw) && !o90VarCb.lp(m90VarVJ3)) {
                                        o90VarCb.x9(m90VarVJ3);
                                        Hw(o90VarCb, 0);
                                    }
                                }
                                z = true;
                            }
                        }
                    }
                    if (!this.a8 || hashSet3.isEmpty()) {
                        while (true) {
                            o90 o90VarJw = g90Var.jw();
                            if (o90VarJw == null) {
                                break;
                            }
                            if (!o90VarJw.lp(m90.Hw) && !we(o90VarJw)) {
                                Hw(o90VarJw, g90Var.jO());
                                j70Var.v5(1);
                            }
                        }
                    } else {
                        qb0 qb0Var = new qb0(j70Var, hashSet3, this.DW, this.FH, this.u7);
                        while (true) {
                            o90 o90VarJw2 = g90Var.jw();
                            if (o90VarJw2 == null) {
                                break;
                            }
                            if (!o90VarJw2.lp(m90.Hw) && !we(o90VarJw2)) {
                                int iJO = g90Var.jO();
                                qb0Var.DW(o90VarJw2.aj(), g90Var.FN(), g90Var.oY(), iJO);
                                Hw(o90VarJw2, iJO);
                                j70Var.v5(1);
                            }
                        }
                    }
                    Iterator<sb0> it14 = this.Hw.iterator();
                    while (it14.hasNext()) {
                        j70Var.v5((int) it14.next().DW());
                    }
                    EQ(j70Var);
                    this.we.J0 = System.currentTimeMillis() - jCurrentTimeMillis;
                    return;
                }
                n90Var = n90Var3;
                m90Var = m90VarVJ3;
                j = jCurrentTimeMillis;
                List<o90> list4 = arrayList2;
                m90Var2 = m90VarVJ2;
                try {
                    if (map.containsKey(next)) {
                        next.x9(m90VarVJ);
                    }
                    if (setEmptySet.contains(next)) {
                        arrayList3.add(next);
                    }
                } catch (q40 e3) {
                    e = e3;
                }
                try {
                } catch (q40 e4) {
                    e = e4;
                    list = list4;
                    if (this.rN) {
                        break;
                    } else {
                        break;
                    }
                    throw e;
                }
                if (set.contains(next)) {
                    next.x9(m90Var2);
                    list = list4;
                    try {
                        list.add(next);
                        if (next instanceof r90) {
                            arrayList4.add((r90) next);
                        }
                    } catch (q40 e5) {
                        e = e5;
                        if (this.rN || !setEmptySet.contains(e.j6())) {
                            break;
                            throw e;
                        }
                        m90VarVJ2 = m90Var2;
                        n90Var3 = n90Var;
                        m90VarVJ3 = m90Var;
                        arrayList2 = list;
                        jCurrentTimeMillis = j;
                    }
                    m90VarVJ2 = m90Var2;
                    n90Var3 = n90Var;
                    m90VarVJ3 = m90Var;
                    arrayList2 = list;
                    jCurrentTimeMillis = j;
                } else {
                    m90VarVJ2 = m90Var2;
                    jCurrentTimeMillis = j;
                    n90Var3 = n90Var;
                    m90VarVJ3 = m90Var;
                    arrayList2 = list4;
                }
            } finally {
            }
        }
    }

    private void Mz(fc0 fc0Var, dc0 dc0Var) throws IOException {
        if (dc0Var.k2()) {
            this.j3 = false;
            dc0Var.lp();
            dc0Var.OW();
            this.tp.Zo(this, x60.j6, Collections.singleton(dc0Var));
        }
        dc0Var.aq();
        while (dc0Var.Eq()) {
            sG(fc0Var, dc0Var.XX());
            if (dc0Var.hz()) {
                return;
            }
            fc0Var.u7();
            dc0Var.aj(fc0Var.gn());
            try {
                this.tp.v5(fc0Var, dc0Var, this.U2);
                fc0Var.DW();
                dc0Var.sy(fc0Var.FH());
                this.Ws.FH++;
                if (dc0Var.et()) {
                    this.Ws.Hw++;
                    this.Ws.Zo += fc0Var.gn() - dc0Var.Qq();
                    return;
                }
                return;
            } catch (e50 e2) {
                if (dc0Var.Qq() != fc0Var.gn()) {
                    i40 i40Var = new i40((a70) dc0Var, "");
                    i40Var.initCause(e2);
                    throw i40Var;
                }
                dc0Var.aj(0L);
                dc0Var.lp();
                dc0Var.OW();
                this.tp.Zo(this, x60.j6, Collections.singleton(dc0Var));
            }
        }
        if (dc0Var.et()) {
            Sf(fc0Var, dc0Var);
        } else {
            Qq(fc0Var, dc0Var);
        }
        fc0Var.DW();
        dc0Var.sy(fc0Var.FH());
    }

    private void Qq(fc0 fc0Var, dc0 dc0Var) throws IOException {
        Deflater deflaterU7 = u7();
        f70 f70VarQX = this.u7.QX(dc0Var, dc0Var.jJ());
        fc0Var.u7();
        dc0Var.aj(fc0Var.gn());
        fc0Var.EQ(dc0Var, f70VarQX.Zo());
        deflaterU7.reset();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(fc0Var, deflaterU7);
        f70VarQX.DW(deflaterOutputStream);
        deflaterOutputStream.finish();
    }

    private void Sf(fc0 fc0Var, dc0 dc0Var) throws IOException {
        byte[] bArr;
        sG(fc0Var, dc0Var.XX());
        fc0Var.u7();
        dc0Var.aj(fc0Var.gn());
        tb0.a aVarFN = dc0Var.FN();
        if (aVarFN != null && (bArr = aVarFN.get()) != null) {
            fc0Var.EQ(dc0Var, dc0Var.br());
            fc0Var.write(bArr);
            return;
        }
        pg0.c cVarTp = tp(dc0Var);
        fc0Var.EQ(dc0Var, cVarTp.gn());
        Deflater deflaterU7 = u7();
        deflaterU7.reset();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(fc0Var, deflaterU7);
        cVarTp.Ws(deflaterOutputStream, null);
        deflaterOutputStream.finish();
        e.a aVar = this.Ws;
        aVar.DW++;
        aVar.Zo += fc0Var.gn() - dc0Var.Qq();
    }

    private static void U2(List<dc0> list) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            dc0 dc0Var = list.get(i2);
            if (!dc0Var.Xa()) {
                if (i != i2) {
                    list.set(i, dc0Var);
                }
                i++;
            }
        }
        while (i < list.size()) {
            list.remove(list.size() - 1);
        }
    }

    public static byte[] VH(ec0 ec0Var, g70 g70Var, j60 j60Var) {
        return g70Var.Ws(j60Var).v5(ec0Var.DW());
    }

    private static boolean XL(sb0 sb0Var, m90 m90Var, g90 g90Var) {
        Iterator<a70> it = sb0Var.FH().iterator();
        while (it.hasNext()) {
            if (!g90Var.cb(it.next()).lp(m90Var)) {
                return false;
            }
        }
        return true;
    }

    private byte[] Zo(j60 j60Var) {
        return VH(this.EQ, this.u7, j60Var);
    }

    private void ca(fc0 fc0Var, List<dc0> list) {
        if (list.isEmpty()) {
            return;
        }
        this.Ws = this.we.aM[list.get(0).jJ()];
        long jGn = fc0Var.gn();
        cc0 cc0Var = this.tp;
        if (cc0Var != null) {
            cc0Var.DW(fc0Var, list);
        } else {
            Iterator<dc0> it = list.iterator();
            while (it.hasNext()) {
                fc0Var.we(it.next());
            }
        }
        this.Ws.v5 += fc0Var.gn() - jGn;
        this.Ws.j6 = list.size();
    }

    private void cb(g90 g90Var, n90 n90Var, List<o90> list, List<o90> list2, sb0 sb0Var) throws i40 {
        this.Hw.add(sb0Var);
        Iterator<a70> it = sb0Var.FH().iterator();
        while (it.hasNext()) {
            list2.add(g90Var.cb(it.next()));
        }
        ro(true);
        g90Var.XX(n90Var);
        g90Var.wc(q90.TOPO);
        g90Var.et(q90.BOUNDARY, true);
        Iterator<o90> it2 = list.iterator();
        while (it2.hasNext()) {
            g90Var.Ev(it2.next());
        }
        Iterator<o90> it3 = list2.iterator();
        while (it3.hasNext()) {
            g90Var.WB(it3.next());
        }
    }

    private void ef(fc0 fc0Var) throws IOException {
        byte[] bArrZo = fc0Var.Zo();
        this.XL = bArrZo;
        fc0Var.write(bArrZo);
    }

    private void er(j70 j70Var) throws ExecutionException, InterruptedException, IOException {
        dc0[] dc0VarArr = new dc0[this.j6[2].size() + this.j6[3].size() + this.FH.size()];
        int iJ0 = J0(dc0VarArr, J0(dc0VarArr, 0, 2), 3);
        if (iJ0 == 0) {
            return;
        }
        int i = iJ0;
        for (dc0 dc0Var : this.FH) {
            dc0Var.qp(0);
            dc0VarArr[i] = dc0Var;
            i++;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        v5(d.GETTING_SIZES, j70Var, i);
        l60 l60VarTp = this.u7.tp(Arrays.asList(dc0VarArr).subList(0, i), false);
        try {
            long jDW = this.EQ.DW();
            while (l60VarTp.next()) {
                try {
                    dc0 dc0Var2 = (dc0) l60VarTp.Hw();
                    if (dc0Var2 == null) {
                        dc0Var2 = (dc0) this.DW.Ws(l60VarTp.DW());
                    }
                    long jV5 = l60VarTp.v5();
                    if (jDW <= jV5 || 2147483647L <= jV5 || jV5 <= 16) {
                        dc0Var2.WB(true);
                    } else {
                        dc0Var2.qp((int) jV5);
                    }
                    j70Var.v5(1);
                } catch (q40 e2) {
                    j70Var.v5(1);
                    if (!this.rN) {
                        throw e2;
                    }
                    dc0 dc0Var3 = (dc0) l60VarTp.Hw();
                    if (dc0Var3 == null || !dc0Var3.Xa()) {
                        dc0 dc0Var4 = (dc0) this.DW.Ws(e2.j6());
                        if (dc0Var4 == null) {
                            throw e2;
                        }
                        if (!dc0Var4.Xa()) {
                            throw e2;
                        }
                        dc0Var4.WB(true);
                    } else {
                        dc0Var3.WB(true);
                    }
                }
            }
            l60VarTp.j6();
            EQ(j70Var);
            this.we.Ws = System.currentTimeMillis() - jCurrentTimeMillis;
            Arrays.sort(dc0VarArr, 0, i, new a(this));
            int i2 = i;
            while (i2 > 0) {
                int i3 = i2 - 1;
                if (!dc0VarArr[i3].CU()) {
                    break;
                }
                if (!dc0VarArr[i3].Xa()) {
                    iJ0--;
                }
                i2--;
            }
            if (i2 == 0) {
                return;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            v5(d.COMPRESSING, j70Var, iJ0);
            yS(j70Var, dc0VarArr, i2);
            EQ(j70Var);
            e eVar = this.we;
            eVar.v5 = iJ0;
            eVar.QX = System.currentTimeMillis() - jCurrentTimeMillis2;
            for (int i4 = 0; i4 < i2; i4++) {
                if (!dc0VarArr[i4].Xa() && dc0VarArr[i4].et()) {
                    this.we.Zo++;
                }
            }
        } catch (Throwable th) {
            l60VarTp.j6();
            throw th;
        }
    }

    private void gW(j70 j70Var) {
        long size = this.j6[1].size() + 0 + this.j6[2].size() + this.j6[3].size() + this.j6[4].size();
        long jCurrentTimeMillis = System.currentTimeMillis();
        v5(d.FINDING_SOURCES, j70Var, size);
        if (size <= 4096) {
            uf0 uf0Var = new uf0((int) size);
            uf0Var.VH(this.j6[4]);
            uf0Var.VH(this.j6[1]);
            uf0Var.VH(this.j6[2]);
            uf0Var.VH(this.j6[3]);
            BT(j70Var, uf0Var);
            if (this.er) {
                U2(this.j6[1]);
                U2(this.j6[2]);
                U2(this.j6[3]);
                U2(this.j6[4]);
            }
        } else {
            BT(j70Var, this.j6[4]);
            BT(j70Var, this.j6[1]);
            BT(j70Var, this.j6[2]);
            BT(j70Var, this.j6[3]);
        }
        EQ(j70Var);
        this.we.J8 = System.currentTimeMillis() - jCurrentTimeMillis;
    }

    public static /* synthetic */ int[] j6() {
        int[] iArr = P8;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[d.valuesCustom().length];
        try {
            iArr2[d.COMPRESSING.ordinal()] = 4;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[d.COUNTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[d.FINDING_SOURCES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[d.GETTING_SIZES.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[d.WRITING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        P8 = iArr2;
        return iArr2;
    }

    private boolean lg(dc0 dc0Var) {
        int iJJ = dc0Var.jJ();
        return iJJ != 1 ? iJJ != 4 : this.Mr;
    }

    private void rN(ExecutorService executorService, v70 v70Var, List<yb0> list, List<Throwable> list2) throws ExecutionException, InterruptedException, IOException {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<yb0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(executorService.submit(it.next()));
        }
        try {
            v70Var.u7();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    ((Future) it2.next()).get();
                } catch (ExecutionException e2) {
                    list2.add(e2.getCause());
                }
            }
        } catch (InterruptedException unused) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((Future) it3.next()).cancel(true);
            }
            throw new IOException(JGitText.DW().packingCancelledDuringObjectsWriting);
        }
    }

    private void sG(fc0 fc0Var, dc0 dc0Var) {
        if (dc0Var == null || dc0Var.hz() || dc0Var.Xa()) {
            return;
        }
        Mz(fc0Var, dc0Var);
    }

    private List<dc0> sh() {
        if (this.QX == null) {
            uf0 uf0Var = new uf0(this.j6[1].size() + 0 + this.j6[2].size() + this.j6[3].size() + this.j6[4].size());
            this.QX = uf0Var;
            uf0Var.addAll(this.j6[1]);
            this.QX.addAll(this.j6[2]);
            this.QX.addAll(this.j6[3]);
            this.QX.addAll(this.j6[4]);
            Collections.sort(this.QX);
        }
        return this.QX;
    }

    private pg0.c tp(dc0 dc0Var) {
        vb0 vb0Var = new vb0(Zo(dc0Var.kQ()));
        byte[] bArrZo = Zo(dc0Var);
        pg0.c cVar = new pg0.c(bArrZo.length);
        vb0Var.FH(cVar, bArrZo);
        return cVar;
    }

    private Deflater u7() {
        if (this.gn == null) {
            this.gn = new Deflater(this.EQ.FH());
        }
        return this.gn;
    }

    private void v5(d dVar, j70 j70Var, long j) {
        String str;
        this.J0.j6 = dVar;
        int i = j6()[dVar.ordinal()];
        if (i == 1) {
            str = JGitText.DW().countingObjects;
        } else if (i == 2) {
            str = JGitText.DW().searchForSizes;
        } else if (i == 3) {
            str = JGitText.DW().searchForReuse;
        } else if (i == 4) {
            str = JGitText.DW().compressingObjects;
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().illegalPackingPhase, dVar));
            }
            str = JGitText.DW().writingObjects;
        }
        j70Var.j6(str, (int) j);
    }

    private boolean we(j60 j60Var) {
        if (this.Zo == null) {
            return false;
        }
        if (this.VH.J8(j60Var)) {
            return true;
        }
        for (xa0 xa0Var : this.Zo) {
            if (xa0Var.J8(j60Var)) {
                this.VH = xa0Var;
                return true;
            }
        }
        return false;
    }

    private void yS(j70 j70Var, dc0[] dc0VarArr, int i) throws ExecutionException, InterruptedException, IOException {
        int iEQ = this.EQ.EQ();
        if (iEQ == 0) {
            iEQ = Runtime.getRuntime().availableProcessors();
        }
        int i2 = iEQ;
        int i3 = 0;
        if (i2 <= 1 || i <= this.EQ.VH() * 2) {
            new zb0(this.EQ, new tb0(this.EQ), this.u7).QX(j70Var, dc0VarArr, 0, i);
            return;
        }
        ic0 ic0Var = new ic0(this.EQ);
        v70 v70Var = new v70(j70Var);
        int i4 = i2 * 2;
        int iVH = i / i4;
        if (iVH < this.EQ.VH() * 2) {
            iVH = this.EQ.VH() * 2;
        }
        int i5 = iVH;
        ArrayList arrayList = new ArrayList(i4);
        int i6 = 0;
        while (i6 < i) {
            int i7 = i - i6;
            if (i7 >= i5) {
                int i8 = i6 + i5;
                while (i8 < i) {
                    if (dc0VarArr[i8 - 1].XG() != dc0VarArr[i8].XG()) {
                        break;
                    } else {
                        i8++;
                    }
                }
                i7 = i8 - i6;
            }
            int i9 = i7;
            int i10 = i2;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new yb0(this.EQ, this.u7, ic0Var, v70Var, i9, i6, dc0VarArr));
            arrayList = arrayList2;
            i6 += i9;
            i2 = i10;
            i5 = i5;
            i3 = 0;
        }
        v70Var.gn(arrayList.size());
        Executor executorGn = this.EQ.gn();
        List<Throwable> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        if (executorGn instanceof ExecutorService) {
            rN((ExecutorService) executorGn, v70Var, arrayList, listSynchronizedList);
        } else if (executorGn == null) {
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i2);
            try {
                rN(executorServiceNewFixedThreadPool, v70Var, arrayList, listSynchronizedList);
                executorServiceNewFixedThreadPool.shutdown();
                do {
                    try {
                    } catch (InterruptedException unused) {
                        throw new IOException(JGitText.DW().packingCancelledDuringObjectsWriting);
                    }
                } while (!executorServiceNewFixedThreadPool.awaitTermination(60L, TimeUnit.SECONDS));
            } catch (Throwable th) {
                executorServiceNewFixedThreadPool.shutdown();
                do {
                    try {
                    } catch (InterruptedException unused2) {
                        throw new IOException(JGitText.DW().packingCancelledDuringObjectsWriting);
                    }
                } while (!executorServiceNewFixedThreadPool.awaitTermination(60L, TimeUnit.SECONDS));
                throw th;
            }
        } else {
            Iterator<yb0> it = arrayList.iterator();
            while (it.hasNext()) {
                executorGn.execute(new b(this, it.next(), listSynchronizedList));
            }
            try {
                v70Var.u7();
            } catch (InterruptedException unused3) {
                throw new IOException(JGitText.DW().packingCancelledDuringObjectsWriting);
            }
        }
        if (listSynchronizedList.isEmpty()) {
            return;
        }
        Throwable th2 = listSynchronizedList.get(i3);
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof IOException) {
            throw ((IOException) th2);
        }
        IOException iOException = new IOException(th2.getMessage());
        iOException.initCause(th2);
        throw iOException;
    }

    public void FH(o90 o90Var) {
        if (we(o90Var)) {
            return;
        }
        Hw(o90Var, 0);
    }

    public void KD(Set<a70> set) {
        this.v5 = set;
    }

    public void Mr(j70 j70Var, g90 g90Var, Set<? extends a70> set, Set<? extends a70> set2) throws i40, j40 {
        if (j70Var == null) {
            j70Var = x60.j6;
        }
        if (this.yS && !(g90Var instanceof z80.b)) {
            g90Var = new z80.b(this.u7, this.gW);
        }
        J8(j70Var, g90Var, set, set2);
    }

    public void P8(boolean z) {
        this.aM = z;
    }

    public e QX() {
        return this.we;
    }

    public void SI(int i, Collection<? extends a70> collection) {
        this.yS = true;
        this.gW = i;
        this.BT = collection;
    }

    public long Ws() {
        long j = this.we.VH;
        if (j != 0) {
            return j;
        }
        long size = this.j6[1].size() + 0 + this.j6[2].size() + this.j6[3].size() + this.j6[4].size();
        Iterator<sb0> it = this.Hw.iterator();
        while (it.hasNext()) {
            size += it.next().DW();
        }
        return size;
    }

    public void a8() {
        this.u7.XL();
        Deflater deflater = this.gn;
        if (deflater != null) {
            deflater.end();
            this.gn = null;
        }
        vy.remove(this.J8);
    }

    public boolean aM() {
        return this.aM;
    }

    public void cn(boolean z) {
        this.lg = z;
    }

    public boolean dx(j60 j60Var) {
        dc0 dc0Var = (dc0) this.DW.Ws(j60Var);
        return (dc0Var == null || dc0Var.Xa()) ? false : true;
    }

    public void ei(boolean z) {
        this.Mr = z;
    }

    public void g3(fc0 fc0Var, dc0 dc0Var) {
        if (dc0Var.hz()) {
            return;
        }
        Mz(fc0Var, dc0Var);
    }

    public a70 gn() {
        byte[] bArr = new byte[20];
        MessageDigest messageDigestZo = r60.Zo();
        Iterator<dc0> it = sh().iterator();
        while (it.hasNext()) {
            it.next().tp(bArr, 0);
            messageDigestZo.update(bArr, 0, 20);
        }
        return a70.sG(messageDigestZo.digest());
    }

    public void j3(j70 j70Var, Set<? extends a70> set, Set<? extends a70> set2) throws i40, j40 {
        Mr(j70Var, this.yS ? new z80.b(this.u7, this.gW) : new g90(this.u7), set, set2);
    }

    public void nw(boolean z) {
        this.U2 = z;
    }

    public void ro(boolean z) {
        this.a8 = z;
    }

    public void vJ(OutputStream outputStream) throws IOException {
        if (!this.Hw.isEmpty()) {
            throw new IOException(JGitText.DW().cachedPacksPreventsIndexCreation);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<dc0> listSh = sh();
        int iU7 = this.EQ.u7();
        (iU7 <= 0 ? ab0.j6(outputStream, listSh) : ab0.DW(outputStream, iU7)).FH(listSh, this.XL);
        this.we.XL += System.currentTimeMillis() - jCurrentTimeMillis;
    }

    public void vy(dc0 dc0Var, hc0 hc0Var) {
        int iDW = hc0Var.DW();
        if (!this.Hw.isEmpty()) {
            if (dc0Var.Xa()) {
                return;
            }
            if ((iDW == 0) | (iDW == 1)) {
                Iterator<sb0> it = this.Hw.iterator();
                while (it.hasNext()) {
                    if (it.next().Hw(dc0Var, hc0Var)) {
                        dc0Var.mb();
                        dc0Var.lp();
                        dc0Var.OW();
                        this.er = true;
                        return;
                    }
                }
            }
        }
        if (iDW == 0 && this.j3 && lg(dc0Var)) {
            a70 a70VarJ6 = hc0Var.j6();
            dc0 dc0Var2 = (dc0) this.DW.Ws(a70VarJ6);
            if (dc0Var2 != null && !dc0Var2.Xa()) {
                dc0Var.Ev(dc0Var2);
                dc0Var.fY();
            } else if (this.a8 && dc0Var2 != null && dc0Var2.Xa()) {
                dc0Var.Ev(a70VarJ6);
                dc0Var.fY();
            } else {
                dc0Var.lp();
                dc0Var.OW();
            }
        } else if (iDW == 1 && this.EQ.Ws()) {
            int iFH = hc0Var.FH();
            if (dc0Var.Eq() && !dc0Var.et() && dc0Var.wc() <= iFH) {
                return;
            }
            dc0Var.lp();
            dc0Var.fY();
            dc0Var.qp(iFH);
        } else {
            dc0Var.lp();
            dc0Var.OW();
        }
        dc0Var.jO(hc0Var);
    }

    public void x9(j70 j70Var, j70 j70Var2, OutputStream outputStream) throws ExecutionException, InterruptedException, IOException {
        if (j70Var == null) {
            j70Var = x60.j6;
        }
        if (j70Var2 == null) {
            j70Var2 = x60.j6;
        }
        this.Zo = null;
        this.VH = null;
        boolean z = this.tp != null && (this.j3 || this.EQ.Ws() || !this.Hw.isEmpty());
        if (j70Var instanceof o60) {
            long j = 1000;
            if (z && this.EQ.J0()) {
                j = 500;
            }
            ((o60) j70Var).tp(j, TimeUnit.MILLISECONDS);
        }
        if (z) {
            gW(j70Var);
        }
        if (this.EQ.J0()) {
            er(j70Var);
        }
        fc0 fc0Var = new fc0(j70Var2, outputStream, this);
        long jWs = Ws();
        this.we.VH = jWs;
        v5(d.WRITING, j70Var2, jWs);
        long jCurrentTimeMillis = System.currentTimeMillis();
        fc0Var.tp(2, jWs);
        fc0Var.flush();
        I(fc0Var);
        if (!this.FH.isEmpty() || !this.Hw.isEmpty()) {
            for (e.a aVar : this.we.aM) {
                if (aVar != null) {
                    this.we.we += aVar.v5;
                }
            }
        }
        for (sb0 sb0Var : this.Hw) {
            long jJ6 = sb0Var.j6();
            this.we.u7 += sb0Var.DW();
            e eVar = this.we;
            eVar.tp += jJ6;
            eVar.gn += jJ6;
            this.tp.FH(fc0Var, sb0Var, this.U2);
        }
        ef(fc0Var);
        fc0Var.flush();
        this.we.XL = System.currentTimeMillis() - jCurrentTimeMillis;
        this.we.EQ = fc0Var.gn();
        this.we.FH = Collections.unmodifiableList(this.Hw);
        e eVar2 = this.we;
        eVar2.Hw = this.gW;
        for (e.a aVar2 : eVar2.aM) {
            if (aVar2 != null) {
                long j2 = aVar2.DW;
                long j3 = aVar2.Hw;
                long j4 = j2 + j3;
                aVar2.DW = j4;
                e eVar3 = this.we;
                eVar3.u7 += aVar2.FH;
                eVar3.tp += j3;
                eVar3.gn += j4;
            }
        }
        this.u7.XL();
        EQ(j70Var2);
    }
}
