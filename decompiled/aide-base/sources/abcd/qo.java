package abcd;

import abcd.zn;

/* loaded from: classes.dex */
public final class qo {
    private final short[] DW;
    private final short[] FH;
    private final short[] Hw;
    private final int[] j6;
    private final short[] v5;
    private final to Zo = new to();
    private final to VH = new to();
    private final to gn = new to();
    private final to u7 = new to();
    private final to tp = new to();
    private final to EQ = new to();

    private final class a extends eo {
        private final ss DW;

        public a(dodo dodoVar, ss ssVar) {
            super(dodoVar);
            this.DW = ssVar;
        }

        private void XL(rs rsVar, ss ssVar, int i) {
            for (int i2 = 0; i2 < i; i2++) {
                ssVar.writeByte(rsVar.readByte());
            }
        }

        private void aM(int i, int i2) {
            int i3 = mt.j6(i2, 255) <= 0 ? 1 : mt.j6(i2, 65535) <= 0 ? 2 : mt.j6(i2, 16777215) <= 0 ? 3 : 4;
            this.DW.writeByte(i | ((i3 - 1) << 5));
            for (int i4 = 0; i4 < i3; i4++) {
                this.DW.writeByte(i2 & 255);
                i2 >>>= 8;
            }
        }

        @Override // abcd.eo
        public void EQ(int i) {
            this.DW.writeByte(i);
        }

        @Override // abcd.eo
        public void J0(int i, int i2) {
            aM(i, qo.this.Mr(i2));
        }

        @Override // abcd.eo
        public void J8(int i, int i2, int i3, int i4) {
            this.DW.writeByte(i);
            XL(this.j6, this.DW, i4);
        }

        @Override // abcd.eo
        public void QX(int i, int i2) {
            aM(i, qo.this.er(i2));
        }

        @Override // abcd.eo
        public void VH(int i) {
            this.DW.writeByte(i);
        }

        @Override // abcd.eo
        public void Ws(int i, int i2) {
            aM(i, qo.this.rN(i2));
        }

        @Override // abcd.eo
        public void Zo(int i) {
            et.v5(this.DW, qo.this.rN(i));
        }

        @Override // abcd.eo
        public void gn(int i) {
            et.v5(this.DW, i);
        }

        @Override // abcd.eo
        public void tp(int i) {
            this.DW.writeByte(i);
        }

        @Override // abcd.eo
        public void u7(int i) {
            this.DW.writeByte(i);
        }

        @Override // abcd.eo
        public void v5(int i, int i2) {
            et.v5(this.DW, qo.this.er(i));
            et.v5(this.DW, i2);
        }

        @Override // abcd.eo
        public void we(int i, int i2) {
            aM(i, qo.this.XL(i2));
        }
    }

    public qo(int i, int i2, int i3, int i4, int i5) {
        this.j6 = new int[i];
        this.DW = new short[i2];
        this.FH = new short[i3];
        this.Hw = new short[i4];
        this.v5 = new short[i5];
        this.Zo.VH(0, 0);
        this.gn.VH(0, 0);
        this.tp.VH(0, 0);
        this.EQ.VH(0, 0);
    }

    private zn.b U2(zn.b bVar) {
        return new zn.b(Mr(bVar.FH()), bVar.j6(), bVar.DW());
    }

    private zn.b[] a8(zn.b[] bVarArr) {
        zn.b[] bVarArr2 = new zn.b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = U2(bVarArr[i]);
        }
        return bVarArr2;
    }

    private zn.a aM(zn.a aVar) {
        return new zn.a(XL(aVar.DW()), aVar.j6());
    }

    private zn.a[] j3(zn.a[] aVarArr) {
        zn.a[] aVarArr2 = new zn.a[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            aVarArr2[i] = aM(aVarArr[i]);
        }
        return aVarArr2;
    }

    public void BT(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.tp.VH(i, i2);
    }

    public vn DW(vn vnVar) {
        int iWe = we(vnVar.j6());
        int[] iArr = (int[]) vnVar.FH().clone();
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = XL(iArr[i]);
        }
        int[] iArr2 = (int[]) vnVar.DW().clone();
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            iArr2[i2] = we(iArr2[i2]);
        }
        int[] iArr3 = (int[]) vnVar.v5().clone();
        for (int i3 = 0; i3 < iArr3.length; i3++) {
            iArr3[i3] = Mr(iArr3[i3]);
        }
        int[] iArr4 = (int[]) vnVar.Hw().clone();
        for (int i4 = 0; i4 < iArr4.length; i4++) {
            iArr4[i4] = we(iArr4[i4]);
        }
        int[] iArr5 = (int[]) vnVar.VH().clone();
        for (int i5 = 0; i5 < iArr5.length; i5++) {
            iArr5[i5] = Mr(iArr5[i5]);
        }
        int[] iArr6 = (int[]) vnVar.Zo().clone();
        for (int i6 = 0; i6 < iArr6.length; i6++) {
            iArr6[i6] = J0(iArr6[i6]);
        }
        return new vn(iWe, iArr, iArr2, iArr3, iArr4, iArr5, iArr6);
    }

    public int EQ(int i) {
        return this.tp.v5(i);
    }

    public wn FH(wn wnVar) {
        int[] iArr = (int[]) wnVar.j6().clone();
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = tp(iArr[i]);
        }
        return new wn(iArr);
    }

    public xn Hw(xn xnVar) {
        int[] iArrJ6 = xnVar.j6();
        for (int i = 0; i < iArrJ6.length; i++) {
            iArrJ6[i] = we(iArrJ6[i]);
        }
        return new xn(iArrJ6);
    }

    public int J0(int i) {
        return this.u7.v5(i);
    }

    public int J8(int i) {
        return this.EQ.v5(i);
    }

    public void KD(int i, int i2) {
        this.v5[i] = (short) i2;
    }

    public int Mr(int i) {
        return this.v5[i] & 65535;
    }

    public void P8(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.gn.VH(i, i2);
    }

    public dodo QX(dodo dodoVar) {
        ps psVar = new ps(32);
        new a(dodoVar, psVar).Hw();
        return new dodo(psVar.aM());
    }

    public void SI(int i, int i2) {
        this.Hw[i] = (short) i2;
    }

    public fo VH(fo foVar) {
        return new fo(null, er(foVar.DW()), er(foVar.v5()), rN(foVar.FH()));
    }

    public dodo Ws(dodo dodoVar) {
        ps psVar = new ps(32);
        new a(dodoVar, psVar).DW();
        return new dodo(psVar.aM());
    }

    public int XL(int i) {
        return this.Hw[i] & 65535;
    }

    public ao Zo(ao aoVar) {
        return new ao(null, aoVar.v5(), er(aoVar.u7()), aoVar.j6(), er(aoVar.gn()), gW(aoVar.Hw()), rN(aoVar.Zo()), EQ(aoVar.DW()), aoVar.FH(), J8(aoVar.VH()));
    }

    public void cb(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.Zo.VH(i, i2);
    }

    public void cn(int i, int i2) {
        this.j6[i] = i2;
    }

    public void ei(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.u7.VH(i, i2);
    }

    public int er(int i) {
        if (i == -1) {
            return -1;
        }
        return 65535 & this.DW[i];
    }

    public int gW(int i) {
        return this.Zo.v5(i);
    }

    public ho gn(ho hoVar) {
        return new ho(null, er(hoVar.DW()), lg(hoVar.v5()), rN(hoVar.FH()));
    }

    public un j6(un unVar) {
        int[] iArr = (int[]) unVar.DW().clone();
        dodo[] dodoVarArr = (dodo[]) unVar.v5().clone();
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = rN(iArr[i]);
            dodoVarArr[i] = QX(dodoVarArr[i]);
        }
        return new un(null, unVar.Zo(), er(unVar.FH()), iArr, dodoVarArr);
    }

    public int lg(int i) {
        return this.FH[i] & 65535;
    }

    public void nw(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.EQ.VH(i, i2);
    }

    public int rN(int i) {
        if (i == -1) {
            return -1;
        }
        return this.j6[i];
    }

    public void ro(int i, int i2) {
        this.FH[i] = (short) i2;
    }

    public void sh(int i, int i2) {
        this.DW[i] = (short) i2;
    }

    public int tp(int i) {
        return this.VH.v5(i);
    }

    public ko u7(ko koVar) {
        return new ko(null, rN(koVar.v5()), er(koVar.FH()), gW(koVar.DW()));
    }

    public zn v5(zn znVar) {
        return new zn(j3(znVar.Hw()), j3(znVar.FH()), a8(znVar.DW()), a8(znVar.v5()));
    }

    public void vy(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.VH.VH(i, i2);
    }

    public int we(int i) {
        return this.gn.v5(i);
    }

    public mo yS(mo moVar) {
        if (moVar == mo.jw) {
            return moVar;
        }
        short[] sArr = (short[]) moVar.DW().clone();
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = (short) er(sArr[i]);
        }
        return new mo(null, sArr);
    }
}
