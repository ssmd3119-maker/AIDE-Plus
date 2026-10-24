package abcd;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class qp implements gr, kt, Comparable<qp> {
    private static final HashMap<Object, qp> fY = new HashMap<>(1000);
    private static final b qp = new b();
    private final int WB;
    private final kp jw;
    private final gr mb;

    private static class b {
        private gr DW;
        private kp FH;
        private int j6;

        private b() {
        }

        public void Hw(int i, gr grVar, kp kpVar) {
            this.j6 = i;
            this.DW = grVar;
            this.FH = kpVar;
        }

        public boolean equals(Object obj) {
            if (obj instanceof qp) {
                return ((qp) obj).tp(this.j6, this.DW, this.FH);
            }
            return false;
        }

        public int hashCode() {
            return qp.yS(this.j6, this.DW, this.FH);
        }

        public qp v5() {
            return new qp(this.j6, this.DW, this.FH);
        }
    }

    private static qp BT(int i, gr grVar, kp kpVar) {
        synchronized (fY) {
            qp.Hw(i, grVar, kpVar);
            qp qpVar = fY.get(qp);
            if (qpVar != null) {
                return qpVar;
            }
            qp qpVarV5 = qp.v5();
            fY.put(qpVarV5, qpVarV5);
            return qpVarV5;
        }
    }

    public static qp cn(int i, gr grVar, kp kpVar) {
        if (kpVar != null) {
            return BT(i, grVar, kpVar);
        }
        throw new NullPointerException("local  == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String ef(boolean r4) {
        /*
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = r3.dx()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            abcd.kp r1 = r3.jw
            if (r1 == 0) goto L1e
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L1e:
            abcd.gr r1 = r3.mb
            abcd.fr r1 = r1.j6()
            r0.append(r1)
            abcd.gr r2 = r3.mb
            if (r1 == r2) goto L57
            java.lang.String r1 = "="
            r0.append(r1)
            if (r4 == 0) goto L42
            abcd.gr r1 = r3.mb
            boolean r2 = r1 instanceof abcd.yq
            if (r2 == 0) goto L42
            abcd.yq r1 = (abcd.yq) r1
            java.lang.String r4 = r1.yS()
            r0.append(r4)
            goto L57
        L42:
            if (r4 == 0) goto L52
            abcd.gr r4 = r3.mb
            boolean r1 = r4 instanceof abcd.bq
            if (r1 == 0) goto L52
            java.lang.String r4 = r4.Zo()
            r0.append(r4)
            goto L57
        L52:
            abcd.gr r4 = r3.mb
            r0.append(r4)
        L57:
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.qp.ef(boolean):java.lang.String");
    }

    public static qp ro(int i, gr grVar) {
        return BT(i, grVar, null);
    }

    public static String sG(int i) {
        return "v" + i;
    }

    public static qp sh(int i, gr grVar, kp kpVar) {
        return BT(i, grVar, kpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tp(int i, gr grVar, kp kpVar) {
        kp kpVar2;
        return this.WB == i && this.mb.equals(grVar) && ((kpVar2 = this.jw) == kpVar || (kpVar2 != null && kpVar2.equals(kpVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int yS(int i, gr grVar, kp kpVar) {
        return ((((kpVar != null ? kpVar.hashCode() : 0) * 31) + grVar.hashCode()) * 31) + i;
    }

    public qp I(gr grVar) {
        return sh(this.WB, grVar, this.jw);
    }

    public int J0() {
        return this.mb.j6().tp();
    }

    public boolean KD() {
        return this.mb.j6().cn();
    }

    public int Mr() {
        return this.WB;
    }

    public qp Mz() {
        gr grVar = this.mb;
        fr frVarJ6 = grVar instanceof fr ? (fr) grVar : grVar.j6();
        if (frVarJ6.sG()) {
            frVarJ6 = frVarJ6.Mr();
        }
        return frVarJ6 == grVar ? this : sh(this.WB, frVarJ6, this.jw);
    }

    public kp QX() {
        return this.jw;
    }

    public qp Sf(kp kpVar) {
        kp kpVar2 = this.jw;
        return (kpVar2 == kpVar || (kpVar2 != null && kpVar2.equals(kpVar))) ? this : sh(this.WB, this.mb, kpVar);
    }

    @Override // abcd.gr
    public final int U2() {
        return this.mb.U2();
    }

    @Override // abcd.gr
    public final boolean XL() {
        return false;
    }

    @Override // abcd.kt
    public String Zo() {
        return ef(true);
    }

    public gr a8() {
        return this.mb;
    }

    public int aM() {
        return this.WB + J0();
    }

    public boolean cb(qp qpVar) {
        if (qpVar == null || !this.mb.j6().equals(qpVar.mb.j6())) {
            return false;
        }
        kp kpVar = this.jw;
        kp kpVar2 = qpVar.jw;
        return kpVar == kpVar2 || (kpVar != null && kpVar.equals(kpVar2));
    }

    public String dx() {
        return sG(this.WB);
    }

    public boolean equals(Object obj) {
        if (obj instanceof qp) {
            qp qpVar = (qp) obj;
            return tp(qpVar.WB, qpVar.mb, qpVar.jw);
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return tp(bVar.j6, bVar.DW, bVar.FH);
    }

    public qp g3(int i) {
        return this.WB == i ? this : sh(i, this.mb, this.jw);
    }

    public int hashCode() {
        return yS(this.WB, this.mb, this.jw);
    }

    @Override // abcd.gr
    public fr j6() {
        return this.mb.j6();
    }

    @Override // abcd.gr
    public gr rN() {
        return this.mb.rN();
    }

    public String toString() {
        return ef(false);
    }

    @Override // abcd.gr
    public final int u7() {
        return this.mb.u7();
    }

    @Override // java.lang.Comparable
    /* renamed from: v5, reason: merged with bridge method [inline-methods] */
    public int compareTo(qp qpVar) {
        int i = this.WB;
        int i2 = qpVar.WB;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int iCompareTo = this.mb.j6().compareTo(qpVar.mb.j6());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        kp kpVar = this.jw;
        if (kpVar == null) {
            return qpVar.jw == null ? 0 : -1;
        }
        kp kpVar2 = qpVar.jw;
        if (kpVar2 == null) {
            return 1;
        }
        return kpVar.compareTo(kpVar2);
    }

    public qp vJ(int i) {
        return i == 0 ? this : g3(this.WB + i);
    }

    public qp vy(qp qpVar, boolean z) {
        gr grVarJ6;
        if (this == qpVar) {
            return this;
        }
        if (qpVar == null || this.WB != qpVar.Mr()) {
            return null;
        }
        kp kpVar = this.jw;
        kp kpVar2 = (kpVar == null || !kpVar.equals(qpVar.QX())) ? null : this.jw;
        boolean z2 = kpVar2 == this.jw;
        if ((z && !z2) || (grVarJ6 = j6()) != qpVar.j6()) {
            return null;
        }
        if (this.mb.equals(qpVar.a8())) {
            grVarJ6 = this.mb;
        }
        if (grVarJ6 == this.mb && z2) {
            return this;
        }
        int i = this.WB;
        return kpVar2 == null ? ro(i, grVarJ6) : cn(i, grVarJ6, kpVar2);
    }

    public boolean we(qp qpVar) {
        return cb(qpVar) && this.WB == qpVar.WB;
    }

    private qp(int i, gr grVar, kp kpVar) {
        if (i < 0) {
            throw new IllegalArgumentException("reg < 0");
        }
        if (grVar == null) {
            throw new NullPointerException("type == null");
        }
        this.WB = i;
        this.mb = grVar;
        this.jw = kpVar;
    }
}
