package abcd;

import abcd.b30;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class v90 extends ba0 {
    private final jf0 FH;
    private final p70 Hw;

    public v90(t90 t90Var, sf0 sf0Var) {
        this.Hw = t90Var.WB;
        jf0 jf0Var = new jf0(t90Var.mb);
        this.FH = jf0Var;
        jf0Var.SI(sf0Var);
        this.FH.KD(sf0Var.FH());
    }

    private static boolean Hw(b30 b30Var) {
        return b30Var.FH() == b30.a.RENAME || b30Var.FH() == b30.a.COPY;
    }

    private void v5(a70[] a70VarArr) {
        jf0 jf0Var = this.FH;
        c90 c90Var = (c90) jf0Var.u7();
        jf0Var.SI(sf0.DW);
        jf0Var.nw(a70VarArr);
        List<b30> listWs = b30.Ws(jf0Var);
        o30 o30Var = new o30(this.Hw);
        o30Var.DW(listWs);
        Iterator<b30> it = o30Var.Zo().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b30 next = it.next();
            if (Hw(next) && next.gn().equals(c90Var.v5())) {
                c90 c90VarHw = c90.Hw(next.EQ());
                i90 i90VarZo = c90Var.Zo();
                if (i90VarZo != null) {
                    i90VarZo.j6(next);
                    c90VarHw.VH(i90VarZo);
                }
                c90Var = c90VarHw;
            }
        }
        jf0Var.SI(c90Var);
    }

    @Override // abcd.ba0
    public boolean DW(t90 t90Var, k90 k90Var) {
        k90[] k90VarArr = k90Var.Z1;
        int length = k90VarArr.length;
        jf0 jf0Var = this.FH;
        a70[] a70VarArr = new a70[length + 1];
        for (int i = 0; i < length; i++) {
            k90 k90Var2 = k90Var.Z1[i];
            if ((1 & k90Var2.cT) == 0) {
                k90Var2.OW(t90Var);
            }
            a70VarArr[i] = k90Var2.Eq();
        }
        a70VarArr[length] = k90Var.Eq();
        jf0Var.nw(a70VarArr);
        if (length == 1) {
            int i2 = 0;
            int i3 = 0;
            while (jf0Var.rN()) {
                i2++;
                if (jf0Var.J8(0) != 0 || jf0Var.J8(1) == 0) {
                    break;
                }
                i3++;
            }
            if (i2 == 0) {
                k90Var.cT |= 8;
                return false;
            }
            if (i3 > 0 && (jf0Var.u7() instanceof c90)) {
                v5(a70VarArr);
            }
            return true;
        }
        if (length == 0) {
            if (jf0Var.rN()) {
                return true;
            }
            k90Var.cT |= 8;
            return false;
        }
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        while (jf0Var.rN()) {
            int iJ8 = jf0Var.J8(length);
            for (int i4 = 0; i4 < length; i4++) {
                int iJ82 = jf0Var.J8(i4);
                if (iJ8 != iJ82 || !jf0Var.aM(i4, length)) {
                    iArr[i4] = iArr[i4] + 1;
                    if (iJ82 == 0 && iJ8 != 0) {
                        iArr2[i4] = iArr2[i4] + 1;
                    }
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        for (int i5 = 0; i5 < length; i5++) {
            if (iArr[i5] == 0) {
                k90 k90Var3 = k90VarArr[i5];
                if ((k90Var3.cT & 4) == 0) {
                    k90Var.cT |= 8;
                    k90Var.Z1 = new k90[]{k90Var3};
                    return false;
                }
                z2 = true;
            } else {
                if (iArr[i5] == iArr2[i5]) {
                    k90VarArr[i5].Z1 = k90.Jl;
                }
                z = true;
            }
        }
        if (z && !z2) {
            return true;
        }
        k90Var.cT |= 8;
        return false;
    }

    @Override // abcd.ba0
    public boolean FH() {
        return false;
    }

    @Override // abcd.ba0
    /* renamed from: j6 */
    public ba0 clone() {
        throw new UnsupportedOperationException();
    }
}
