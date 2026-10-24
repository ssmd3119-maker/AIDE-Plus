package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ln0 extends rn0 {
    private final SparseArray<Map<al0, nn0>> DW = new SparseArray<>();
    private final SparseBooleanArray FH = new SparseBooleanArray();

    @Override // com.google.android.gms.internal.ads.rn0
    public final tn0 DW(ef0[] ef0VarArr, al0 al0Var) {
        int[] iArr;
        int[] iArr2 = new int[ef0VarArr.length + 1];
        int length = ef0VarArr.length + 1;
        yk0[][] yk0VarArr = new yk0[length][];
        int[][][] iArr3 = new int[ef0VarArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = al0Var.j6;
            yk0VarArr[i] = new yk0[i2];
            iArr3[i] = new int[i2][];
        }
        int length2 = ef0VarArr.length;
        int[] iArr4 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr4[i3] = ef0VarArr[i3].j6();
        }
        for (int i4 = 0; i4 < al0Var.j6; i4++) {
            yk0 yk0VarDW = al0Var.DW(i4);
            int length3 = ef0VarArr.length;
            int i5 = 0;
            for (int i6 = 0; i6 < ef0VarArr.length; i6++) {
                ef0 ef0Var = ef0VarArr[i6];
                for (int i7 = 0; i7 < yk0VarDW.j6; i7++) {
                    int iDW = ef0Var.DW(yk0VarDW.j6(i7)) & 3;
                    if (iDW > i5) {
                        length3 = i6;
                        if (iDW == 3) {
                            break;
                        }
                        i5 = iDW;
                    }
                }
            }
            if (length3 == ef0VarArr.length) {
                iArr = new int[yk0VarDW.j6];
            } else {
                ef0 ef0Var2 = ef0VarArr[length3];
                int[] iArr5 = new int[yk0VarDW.j6];
                for (int i8 = 0; i8 < yk0VarDW.j6; i8++) {
                    iArr5[i8] = ef0Var2.DW(yk0VarDW.j6(i8));
                }
                iArr = iArr5;
            }
            int i9 = iArr2[length3];
            yk0VarArr[length3][i9] = yk0VarDW;
            iArr3[length3][i9] = iArr;
            iArr2[length3] = iArr2[length3] + 1;
        }
        al0[] al0VarArr = new al0[ef0VarArr.length];
        int[] iArr6 = new int[ef0VarArr.length];
        for (int i10 = 0; i10 < ef0VarArr.length; i10++) {
            int i11 = iArr2[i10];
            al0VarArr[i10] = new al0((yk0[]) Arrays.copyOf(yk0VarArr[i10], i11));
            iArr3[i10] = (int[][]) Arrays.copyOf(iArr3[i10], i11);
            iArr6[i10] = ef0VarArr[i10].sh();
        }
        al0 al0Var2 = new al0((yk0[]) Arrays.copyOf(yk0VarArr[ef0VarArr.length], iArr2[ef0VarArr.length]));
        on0[] on0VarArrV5 = v5(ef0VarArr, al0VarArr, iArr3);
        int i12 = 0;
        while (true) {
            if (i12 >= ef0VarArr.length) {
                mn0 mn0Var = new mn0(iArr6, al0VarArr, iArr4, iArr3, al0Var2);
                ff0[] ff0VarArr = new ff0[ef0VarArr.length];
                for (int i13 = 0; i13 < ef0VarArr.length; i13++) {
                    ff0VarArr[i13] = on0VarArrV5[i13] != null ? ff0.DW : null;
                }
                return new tn0(al0Var, new qn0(on0VarArrV5), mn0Var, ff0VarArr);
            }
            if (this.FH.get(i12)) {
                on0VarArrV5[i12] = null;
            } else {
                al0 al0Var3 = al0VarArr[i12];
                Map<al0, nn0> map = this.DW.get(i12);
                if ((map != null ? map.get(al0Var3) : null) != null) {
                    throw new NoSuchMethodError();
                }
            }
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.ads.rn0
    public final void Hw(Object obj) {
    }

    public final void Zo(int i, boolean z) {
        if (this.FH.get(i) == z) {
            return;
        }
        this.FH.put(i, z);
        j6();
    }

    protected abstract on0[] v5(ef0[] ef0VarArr, al0[] al0VarArr, int[][][] iArr);
}
