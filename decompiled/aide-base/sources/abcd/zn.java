package abcd;

import abcd.no;

/* loaded from: classes.dex */
public final class zn {
    private final a[] DW;
    private final b[] FH;
    private final b[] Hw;
    private final a[] j6;

    public static class a {
        private final int DW;
        private final int j6;

        public a(int i, int i2) {
            this.j6 = i;
            this.DW = i2;
        }

        public int DW() {
            return this.j6;
        }

        public int j6() {
            return this.DW;
        }
    }

    public static class b {
        private final int DW;
        private int FH;
        private final int j6;

        public b(int i, int i2, int i3) {
            this.j6 = i;
            this.DW = i2;
            this.FH = i3;
        }

        public int DW() {
            return this.FH;
        }

        public int FH() {
            return this.j6;
        }

        public void Hw(int i) {
            this.FH = i;
        }

        public int j6() {
            return this.DW;
        }
    }

    public zn(a[] aVarArr, a[] aVarArr2, b[] bVarArr, b[] bVarArr2) {
        this.j6 = aVarArr;
        this.DW = aVarArr2;
        this.FH = bVarArr;
        this.Hw = bVarArr2;
    }

    private void VH(no.b bVar, b[] bVarArr) {
        int length = bVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            b bVar2 = bVarArr[i];
            int iFH = bVar2.FH();
            bVar.ro(iFH - i2);
            bVar.ro(bVar2.j6());
            bVar.ro(bVar2.DW());
            i++;
            i2 = iFH;
        }
    }

    private void Zo(no.b bVar, a[] aVarArr) {
        int length = aVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            a aVar = aVarArr[i];
            int iDW = aVar.DW();
            bVar.ro(iDW - i2);
            bVar.ro(aVar.j6());
            i++;
            i2 = iDW;
        }
    }

    public b[] DW() {
        return this.FH;
    }

    public a[] FH() {
        return this.DW;
    }

    public a[] Hw() {
        return this.j6;
    }

    public void gn(no.b bVar) {
        bVar.ro(this.j6.length);
        bVar.ro(this.DW.length);
        bVar.ro(this.FH.length);
        bVar.ro(this.Hw.length);
        Zo(bVar, this.j6);
        Zo(bVar, this.DW);
        VH(bVar, this.FH);
        VH(bVar, this.Hw);
    }

    public b[] j6() {
        b[] bVarArr = this.FH;
        b[] bVarArr2 = new b[bVarArr.length + this.Hw.length];
        System.arraycopy(bVarArr, 0, bVarArr2, 0, bVarArr.length);
        b[] bVarArr3 = this.Hw;
        System.arraycopy(bVarArr3, 0, bVarArr2, this.FH.length, bVarArr3.length);
        return bVarArr2;
    }

    public b[] v5() {
        return this.Hw;
    }
}
