package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class sl0 implements lk0, wk0<jl0<ql0>> {
    private final al0 AL;
    private List<jm0> Q6;
    final int WB;
    private km0 Z1;
    private jl0<ql0>[] cT;
    private final rj0 fY;
    private mk0 hK;
    private final int jw;
    private final no0 k2;
    private final rl0 mb;
    private int n5;
    private zj0 q7;
    private final long qp;
    private final tl0[] w9;
    private final vn0 zh;

    public sl0(int i, km0 km0Var, int i2, rl0 rl0Var, int i3, rj0 rj0Var, long j, no0 no0Var, vn0 vn0Var) {
        int i4;
        boolean z;
        boolean z2;
        nm0 nm0Var;
        int i5;
        this.WB = i;
        this.Z1 = km0Var;
        this.n5 = i2;
        this.mb = rl0Var;
        this.jw = i3;
        this.fY = rj0Var;
        this.qp = j;
        this.k2 = no0Var;
        this.zh = vn0Var;
        jl0<ql0>[] jl0VarArr = new jl0[0];
        this.cT = jl0VarArr;
        this.q7 = new zj0(jl0VarArr);
        List<jm0> list = km0Var.j6(i2).FH;
        this.Q6 = list;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            sparseIntArray.put(list.get(i6).j6, i6);
        }
        int[][] iArr = new int[size][];
        boolean[] zArr = new boolean[size];
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            if (!zArr[i8]) {
                zArr[i8] = true;
                List<nm0> list2 = list.get(i8).v5;
                int i9 = 0;
                while (true) {
                    if (i9 >= list2.size()) {
                        nm0Var = null;
                        break;
                    }
                    nm0 nm0Var2 = list2.get(i9);
                    if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(nm0Var2.j6)) {
                        nm0Var = nm0Var2;
                        break;
                    }
                    i9++;
                }
                if (nm0Var == null) {
                    i5 = i7 + 1;
                    iArr[i7] = new int[]{i8};
                } else {
                    String[] strArrSplit = nm0Var.DW.split(",");
                    int[] iArr2 = new int[strArrSplit.length + 1];
                    iArr2[0] = i8;
                    int i10 = 0;
                    while (i10 < strArrSplit.length) {
                        int i11 = sparseIntArray.get(Integer.parseInt(strArrSplit[i10]));
                        zArr[i11] = true;
                        i10++;
                        iArr2[i10] = i11;
                    }
                    i5 = i7 + 1;
                    iArr[i7] = iArr2;
                }
                i7 = i5;
            }
        }
        iArr = i7 < size ? (int[][]) Arrays.copyOf(iArr, i7) : iArr;
        int length = iArr.length;
        boolean[] zArr2 = new boolean[length];
        boolean[] zArr3 = new boolean[length];
        int i12 = length;
        for (int i13 = 0; i13 < length; i13++) {
            int[] iArr3 = iArr[i13];
            int length2 = iArr3.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    z = false;
                    break;
                }
                List<qm0> list3 = list.get(iArr3[i14]).FH;
                for (int i15 = 0; i15 < list3.size(); i15++) {
                    if (!list3.get(i15).Hw.isEmpty()) {
                        z = true;
                        break;
                    }
                }
                i14++;
            }
            if (z) {
                zArr2[i13] = true;
                i12++;
            }
            int[] iArr4 = iArr[i13];
            int length3 = iArr4.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length3) {
                    z2 = false;
                    break;
                }
                List<nm0> list4 = list.get(iArr4[i16]).Hw;
                for (int i17 = 0; i17 < list4.size(); i17++) {
                    if ("urn:scte:dash:cc:cea-608:2015".equals(list4.get(i17).j6)) {
                        z2 = true;
                        break;
                    }
                }
                i16++;
            }
            if (z2) {
                zArr3[i13] = true;
                i12++;
            }
        }
        yk0[] yk0VarArr = new yk0[i12];
        tl0[] tl0VarArr = new tl0[i12];
        int i18 = 0;
        int i19 = 0;
        while (i18 < length) {
            int[] iArr5 = iArr[i18];
            ArrayList arrayList = new ArrayList();
            for (int i20 : iArr5) {
                arrayList.addAll(list.get(i20).FH);
            }
            int size2 = arrayList.size();
            zzfs[] zzfsVarArr = new zzfs[size2];
            for (int i21 = 0; i21 < size2; i21++) {
                zzfsVarArr[i21] = ((qm0) arrayList.get(i21)).j6;
            }
            jm0 jm0Var = list.get(iArr5[0]);
            boolean z3 = zArr2[i18];
            boolean z4 = zArr3[i18];
            yk0VarArr[i19] = new yk0(zzfsVarArr);
            int i22 = i19 + 1;
            tl0VarArr[i19] = new tl0(jm0Var.DW, iArr5, i19, true, z3, z4);
            if (z3) {
                int i23 = jm0Var.j6;
                StringBuilder sb = new StringBuilder(16);
                sb.append(i23);
                sb.append(":emsg");
                yk0VarArr[i22] = new yk0(zzfs.EQ(sb.toString(), "application/x-emsg", null, -1, null));
                tl0VarArr[i22] = new tl0(4, iArr5, i19, false, false, false);
                i22++;
            }
            if (z4) {
                int i24 = jm0Var.j6;
                StringBuilder sb2 = new StringBuilder(18);
                sb2.append(i24);
                sb2.append(":cea608");
                yk0VarArr[i22] = new yk0(zzfs.tp(sb2.toString(), "application/cea-608", null, -1, 0, null, null));
                i4 = i22 + 1;
                tl0VarArr[i22] = new tl0(3, iArr5, i19, false, false, false);
            } else {
                i4 = i22;
            }
            i18++;
            i19 = i4;
        }
        Pair pairCreate = Pair.create(new al0(yk0VarArr), tl0VarArr);
        this.AL = (al0) pairCreate.first;
        this.w9 = (tl0[]) pairCreate.second;
    }

    private static void u7(uk0 uk0Var) {
        if (uk0Var instanceof kl0) {
            ((kl0) uk0Var).DW();
        }
    }

    @Override // com.google.android.gms.internal.ads.lk0, com.google.android.gms.internal.ads.vk0
    public final long DW() {
        return this.q7.DW();
    }

    @Override // com.google.android.gms.internal.ads.lk0
    public final void EQ(long j) {
        for (jl0<ql0> jl0Var : this.cT) {
            jl0Var.Mr(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.lk0, com.google.android.gms.internal.ads.vk0
    public final boolean FH(long j) {
        return this.q7.FH(j);
    }

    @Override // com.google.android.gms.internal.ads.wk0
    public final /* synthetic */ void Hw(vk0 vk0Var) {
        this.hK.Hw(this);
    }

    public final void J0(km0 km0Var, int i) {
        this.Z1 = km0Var;
        this.n5 = i;
        this.Q6 = km0Var.j6(i).FH;
        jl0<ql0>[] jl0VarArr = this.cT;
        if (jl0VarArr != null) {
            for (jl0<ql0> jl0Var : jl0VarArr) {
                ((ql0) jl0Var.lg()).DW(km0Var, i);
            }
            this.hK.Hw(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013b  */
    @Override // com.google.android.gms.internal.ads.lk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long J8(com.google.android.gms.internal.ads.on0[] r30, boolean[] r31, com.google.android.gms.internal.ads.uk0[] r32, boolean[] r33, long r34) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sl0.J8(com.google.android.gms.internal.ads.on0[], boolean[], com.google.android.gms.internal.ads.uk0[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.lk0
    public final long VH(long j) {
        for (jl0<ql0> jl0Var : this.cT) {
            jl0Var.U2(j);
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.lk0
    public final void Ws() {
        this.k2.j6();
    }

    @Override // com.google.android.gms.internal.ads.lk0
    public final long gn() {
        long jMin = Long.MAX_VALUE;
        for (jl0<ql0> jl0Var : this.cT) {
            long jGn = jl0Var.gn();
            if (jGn != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jGn);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    public final void j6() {
        for (jl0<ql0> jl0Var : this.cT) {
            jl0Var.XL();
        }
    }

    @Override // com.google.android.gms.internal.ads.lk0
    public final al0 tp() {
        return this.AL;
    }

    @Override // com.google.android.gms.internal.ads.lk0
    public final void v5(mk0 mk0Var, long j) {
        this.hK = mk0Var;
        mk0Var.Zo(this);
    }

    @Override // com.google.android.gms.internal.ads.lk0
    public final long we() {
        return -9223372036854775807L;
    }
}
