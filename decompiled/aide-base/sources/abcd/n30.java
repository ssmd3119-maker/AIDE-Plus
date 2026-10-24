package abcd;

/* loaded from: classes.dex */
public abstract class n30 extends q30<m30> {
    public static final n30 j6 = new a();

    class a extends n30 {
        @Override // abcd.n30
        public int VH(byte[] bArr, int i, int i2) {
            int i3 = 5381;
            while (i < i2) {
                i3 = (bArr[i] & 255) + (i3 << 5) + i3;
                i++;
            }
            return i3;
        }

        @Override // abcd.q30
        /* renamed from: u7, reason: merged with bridge method [inline-methods] */
        public boolean j6(m30 m30Var, int i, m30 m30Var2, int i2) {
            int i3 = i + 1;
            int i4 = i2 + 1;
            int iHw = m30Var.DW.Hw(i3);
            int iHw2 = m30Var2.DW.Hw(i4);
            int iHw3 = m30Var.DW.Hw(i3 + 1);
            if (iHw3 - iHw != m30Var2.DW.Hw(i4 + 1) - iHw2) {
                return false;
            }
            while (iHw < iHw3) {
                int i5 = iHw + 1;
                int i6 = iHw2 + 1;
                if (m30Var.j6[iHw] != m30Var2.j6[iHw2]) {
                    return false;
                }
                iHw = i5;
                iHw2 = i6;
            }
            return true;
        }
    }

    private static int Hw(fg0 fg0Var, int i, int i2) {
        int iVH = fg0Var.VH() - 2;
        while (i < iVH && fg0Var.Hw(i + 2) < i2) {
            i++;
        }
        return i;
    }

    private static int v5(fg0 fg0Var, int i, int i2) {
        while (i > 0 && i2 <= fg0Var.Hw(i)) {
            i--;
        }
        return i;
    }

    @Override // abcd.q30
    public /* bridge */ /* synthetic */ d30 FH(p30 p30Var, p30 p30Var2, d30 d30Var) {
        gn((m30) p30Var, (m30) p30Var2, d30Var);
        return d30Var;
    }

    public abstract int VH(byte[] bArr, int i, int i2);

    @Override // abcd.q30
    /* renamed from: Zo, reason: merged with bridge method [inline-methods] */
    public int DW(m30 m30Var, int i) {
        return VH(m30Var.j6, m30Var.DW.Hw(i + 1), m30Var.DW.Hw(i + 2));
    }

    public d30 gn(m30 m30Var, m30 m30Var2, d30 d30Var) {
        int i = d30Var.j6;
        if (i == d30Var.DW || d30Var.FH == d30Var.Hw) {
            return d30Var;
        }
        byte[] bArr = m30Var.j6;
        byte[] bArr2 = m30Var2.j6;
        int iHw = m30Var.DW.Hw(i + 1);
        int iHw2 = m30Var.DW.Hw(d30Var.FH + 1);
        int iHw3 = m30Var.DW.Hw(d30Var.DW + 1);
        int iHw4 = m30Var2.DW.Hw(d30Var.Hw + 1);
        if (iHw < 0 || iHw2 < 0 || iHw3 > bArr.length || iHw4 > bArr2.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        while (iHw < iHw3 && iHw2 < iHw4 && bArr[iHw] == bArr2[iHw2]) {
            iHw++;
            iHw2++;
        }
        while (iHw < iHw3 && iHw2 < iHw4 && bArr[iHw3 - 1] == bArr2[iHw4 - 1]) {
            iHw3--;
            iHw4--;
        }
        d30Var.j6 = Hw(m30Var.DW, d30Var.j6, iHw);
        d30Var.FH = Hw(m30Var2.DW, d30Var.FH, iHw2);
        int iV5 = v5(m30Var.DW, d30Var.DW, iHw3);
        d30Var.DW = iV5;
        boolean z = iHw3 < m30Var.DW.Hw(iV5 + 1);
        if (z) {
            iHw4 += m30Var.DW.Hw(d30Var.DW + 1) - iHw3;
        }
        int iV52 = v5(m30Var2.DW, d30Var.Hw, iHw4);
        d30Var.Hw = iV52;
        if (!z && iHw4 < m30Var2.DW.Hw(iV52 + 1)) {
            d30Var.DW++;
        }
        super.FH(m30Var, m30Var2, d30Var);
        return d30Var;
    }
}
