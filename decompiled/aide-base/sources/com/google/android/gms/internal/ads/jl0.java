package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ll0;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class jl0<T extends ll0> implements uk0, vk0, jo0<el0> {
    boolean Jl;
    private long Q6;
    private final int WB;
    private final dl0 Z1;
    private final rk0 cT;
    private final T fY;
    private final LinkedList<cl0> hK;
    private final boolean[] jw;
    private final rj0 k2;
    long kf;
    private final int[] mb;
    private zzfs n5;
    private final rk0[] q7;
    private final wk0<jl0<T>> qp;
    private final int zh;
    private final io0 AL = new io0("Loader:ChunkSampleStream");
    private final il0 w9 = new il0();

    public jl0(int i, int[] iArr, T t, wk0<jl0<T>> wk0Var, vn0 vn0Var, long j, int i2, rj0 rj0Var) {
        this.WB = i;
        this.mb = iArr;
        this.fY = t;
        this.qp = wk0Var;
        this.k2 = rj0Var;
        this.zh = i2;
        LinkedList<cl0> linkedList = new LinkedList<>();
        this.hK = linkedList;
        Collections.unmodifiableList(linkedList);
        int i3 = 0;
        int length = iArr == null ? 0 : iArr.length;
        this.q7 = new rk0[length];
        this.jw = new boolean[length];
        int i4 = length + 1;
        int[] iArr2 = new int[i4];
        rk0[] rk0VarArr = new rk0[i4];
        rk0 rk0Var = new rk0(vn0Var);
        this.cT = rk0Var;
        iArr2[0] = i;
        rk0VarArr[0] = rk0Var;
        while (i3 < length) {
            rk0 rk0Var2 = new rk0(vn0Var);
            this.q7[i3] = rk0Var2;
            int i5 = i3 + 1;
            rk0VarArr[i5] = rk0Var2;
            iArr2[i5] = iArr[i3];
            i3 = i5;
        }
        this.Z1 = new dl0(iArr2, rk0VarArr);
        this.Q6 = j;
        this.kf = j;
    }

    @Override // com.google.android.gms.internal.ads.vk0
    public final long DW() {
        if (a8()) {
            return this.Q6;
        }
        if (this.Jl) {
            return Long.MIN_VALUE;
        }
        return this.hK.getLast().VH;
    }

    @Override // com.google.android.gms.internal.ads.vk0
    public final boolean FH(long j) {
        if (this.Jl || this.AL.DW()) {
            return false;
        }
        T t = this.fY;
        cl0 last = this.hK.isEmpty() ? null : this.hK.getLast();
        long j2 = this.Q6;
        if (j2 == -9223372036854775807L) {
            j2 = j;
        }
        t.FH(last, j2, this.w9);
        il0 il0Var = this.w9;
        boolean z = il0Var.DW;
        el0 el0Var = il0Var.j6;
        il0Var.j6 = null;
        il0Var.DW = false;
        if (z) {
            this.Q6 = -9223372036854775807L;
            this.Jl = true;
            return true;
        }
        if (el0Var == null) {
            return false;
        }
        if (el0Var instanceof cl0) {
            this.Q6 = -9223372036854775807L;
            cl0 cl0Var = (cl0) el0Var;
            cl0Var.VH(this.Z1);
            this.hK.add(cl0Var);
        }
        this.k2.VH(el0Var.j6, el0Var.DW, this.WB, el0Var.FH, el0Var.Hw, el0Var.v5, el0Var.Zo, el0Var.VH, this.AL.FH(el0Var, this, this.zh));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.uk0
    public final int Hw(xe0 xe0Var, tg0 tg0Var, boolean z) {
        if (a8()) {
            return -3;
        }
        int iAM = this.cT.aM();
        if (!this.hK.isEmpty()) {
            while (this.hK.size() > 1 && this.hK.get(1).gn(0) <= iAM) {
                this.hK.removeFirst();
            }
            cl0 first = this.hK.getFirst();
            zzfs zzfsVar = first.FH;
            if (!zzfsVar.equals(this.n5)) {
                this.k2.Zo(this.WB, zzfsVar, first.Hw, first.v5, first.Zo);
            }
            this.n5 = zzfsVar;
        }
        return this.cT.Zo(xe0Var, tg0Var, z, this.Jl, this.kf);
    }

    @Override // com.google.android.gms.internal.ads.jo0
    public final /* synthetic */ int J0(lo0 lo0Var, long j, long j2, IOException iOException) {
        boolean z;
        el0 el0Var = (el0) lo0Var;
        long jHw = el0Var.Hw();
        boolean z2 = el0Var instanceof cl0;
        if (this.fY.Hw(el0Var, !z2 || jHw == 0 || this.hK.size() > 1, iOException)) {
            if (z2) {
                cl0 cl0VarRemoveLast = this.hK.removeLast();
                ro0.Hw(cl0VarRemoveLast == el0Var);
                this.cT.we(cl0VarRemoveLast.gn(0));
                int i = 0;
                while (true) {
                    rk0[] rk0VarArr = this.q7;
                    if (i >= rk0VarArr.length) {
                        break;
                    }
                    rk0 rk0Var = rk0VarArr[i];
                    i++;
                    rk0Var.we(cl0VarRemoveLast.gn(i));
                }
                if (this.hK.isEmpty()) {
                    this.Q6 = this.kf;
                }
            }
            z = true;
        } else {
            z = false;
        }
        this.k2.gn(el0Var.j6, el0Var.DW, this.WB, el0Var.FH, el0Var.Hw, el0Var.v5, el0Var.Zo, el0Var.VH, j, j2, jHw, iOException, z);
        if (!z) {
            return 0;
        }
        this.qp.Hw(this);
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.uk0
    public final boolean KD() {
        if (this.Jl) {
            return true;
        }
        return !a8() && this.cT.j3();
    }

    public final void Mr(long j) {
        int i = 0;
        while (true) {
            rk0[] rk0VarArr = this.q7;
            if (i >= rk0VarArr.length) {
                return;
            }
            if (!this.jw[i]) {
                rk0VarArr[i].J8(j, true);
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.jo0
    public final /* synthetic */ void QX(lo0 lo0Var, long j, long j2) {
        el0 el0Var = (el0) lo0Var;
        this.fY.v5(el0Var);
        this.k2.tp(el0Var.j6, el0Var.DW, this.WB, el0Var.FH, el0Var.Hw, el0Var.v5, el0Var.Zo, el0Var.VH, j, j2, el0Var.Hw());
        this.qp.Hw(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U2(long r7) {
        /*
            r6 = this;
            r6.kf = r7
            boolean r0 = r6.a8()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1f
            com.google.android.gms.internal.ads.rk0 r0 = r6.cT
            long r3 = r6.DW()
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            boolean r0 = r0.J8(r7, r3)
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L52
        L22:
            java.util.LinkedList<com.google.android.gms.internal.ads.cl0> r0 = r6.hK
            int r0 = r0.size()
            if (r0 <= r2) goto L44
            java.util.LinkedList<com.google.android.gms.internal.ads.cl0> r0 = r6.hK
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.cl0 r0 = (com.google.android.gms.internal.ads.cl0) r0
            int r0 = r0.gn(r1)
            com.google.android.gms.internal.ads.rk0 r3 = r6.cT
            int r3 = r3.aM()
            if (r0 > r3) goto L44
            java.util.LinkedList<com.google.android.gms.internal.ads.cl0> r0 = r6.hK
            r0.removeFirst()
            goto L22
        L44:
            com.google.android.gms.internal.ads.rk0[] r0 = r6.q7
            int r3 = r0.length
        L47:
            if (r1 >= r3) goto L51
            r4 = r0[r1]
            r4.J8(r7, r2)
            int r1 = r1 + 1
            goto L47
        L51:
            return
        L52:
            r6.Q6 = r7
            r6.Jl = r1
            java.util.LinkedList<com.google.android.gms.internal.ads.cl0> r7 = r6.hK
            r7.clear()
            com.google.android.gms.internal.ads.io0 r7 = r6.AL
            boolean r7 = r7.DW()
            if (r7 == 0) goto L69
            com.google.android.gms.internal.ads.io0 r7 = r6.AL
            r7.tp()
            return
        L69:
            com.google.android.gms.internal.ads.rk0 r7 = r6.cT
            r7.rN(r2)
            com.google.android.gms.internal.ads.rk0[] r7 = r6.q7
            int r8 = r7.length
        L71:
            if (r1 >= r8) goto L7b
            r0 = r7[r1]
            r0.rN(r2)
            int r1 = r1 + 1
            goto L71
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jl0.U2(long):void");
    }

    public final void XL() {
        this.cT.v5();
        for (rk0 rk0Var : this.q7) {
            rk0Var.v5();
        }
        this.AL.VH(null);
    }

    @Override // com.google.android.gms.internal.ads.jo0
    public final /* synthetic */ void Zo(lo0 lo0Var, long j, long j2, boolean z) {
        el0 el0Var = (el0) lo0Var;
        this.k2.EQ(el0Var.j6, el0Var.DW, this.WB, el0Var.FH, el0Var.Hw, el0Var.v5, el0Var.Zo, el0Var.VH, j, j2, el0Var.Hw());
        if (z) {
            return;
        }
        this.cT.rN(true);
        for (rk0 rk0Var : this.q7) {
            rk0Var.rN(true);
        }
        this.qp.Hw(this);
    }

    final boolean a8() {
        return this.Q6 != -9223372036854775807L;
    }

    public final kl0 aM(long j, int i) {
        for (int i2 = 0; i2 < this.q7.length; i2++) {
            if (this.mb[i2] == i) {
                ro0.Hw(!this.jw[i2]);
                this.jw[i2] = true;
                this.q7[i2].J8(j, true);
                return new kl0(this, this, this.q7[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    public final long gn() {
        if (this.Jl) {
            return Long.MIN_VALUE;
        }
        if (a8()) {
            return this.Q6;
        }
        long jMax = this.kf;
        cl0 last = this.hK.getLast();
        if (!last.Zo()) {
            if (this.hK.size() > 1) {
                last = this.hK.get(r2.size() - 2);
            } else {
                last = null;
            }
        }
        if (last != null) {
            jMax = Math.max(jMax, last.VH);
        }
        return Math.max(jMax, this.cT.Ws());
    }

    @Override // com.google.android.gms.internal.ads.uk0
    public final void j6() throws IOException {
        this.AL.u7(Integer.MIN_VALUE);
        if (this.AL.DW()) {
            return;
        }
        this.fY.j6();
    }

    public final T lg() {
        return this.fY;
    }

    @Override // com.google.android.gms.internal.ads.uk0
    public final void u7(long j) {
        if (!this.Jl || j <= this.cT.Ws()) {
            this.cT.J8(j, true);
        } else {
            this.cT.U2();
        }
    }
}
