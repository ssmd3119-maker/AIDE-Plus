package abcd;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class g90 extends t90 {
    private k90 Jl;
    private List<o90> Q6;
    private a e3;
    private a eU;
    private k90 iW;
    private t80 kf;
    private boolean pO;
    private byte[] sE;
    private int sg;

    private static class a {
        o90 DW;
        byte[] FH;
        int Hw;
        int VH;
        int Zo;
        a j6;
        int v5;

        private a() {
        }

        public /* synthetic */ a(a aVar) {
            this();
        }
    }

    public g90(p70 p70Var) {
        this(p70Var.yS());
    }

    private void Xa(o90 o90Var) {
        int i = o90Var.cT;
        if ((i & 8) == 0) {
            o90Var.cT = i | 8;
            this.Q6.add(o90Var);
            this.kf.j6(o90Var);
        }
    }

    private static int aq(byte[] bArr, int i) {
        do {
            int i2 = i + 1;
            if (bArr[i2] == 0) {
                return i2 + 1;
            }
            int i3 = i2 + 1;
            if (bArr[i3] == 0) {
                return i3 + 1;
            }
            int i4 = i3 + 1;
            if (bArr[i4] == 0) {
                return i4 + 1;
            }
            int i5 = i4 + 1;
            if (bArr[i5] == 0) {
                return i5 + 1;
            }
            int i6 = i5 + 1;
            if (bArr[i6] == 0) {
                return i6 + 1;
            }
            int i7 = i6 + 1;
            if (bArr[i7] == 0) {
                return i7 + 1;
            }
            int i8 = i7 + 1;
            if (bArr[i8] == 0) {
                return i8 + 1;
            }
            int i9 = i8 + 1;
            if (bArr[i9] == 0) {
                return i9 + 1;
            }
            int i10 = i9 + 1;
            if (bArr[i10] == 0) {
                return i10 + 1;
            }
            int i11 = i10 + 1;
            if (bArr[i11] == 0) {
                return i11 + 1;
            }
            int i12 = i11 + 1;
            if (bArr[i12] == 0) {
                return i12 + 1;
            }
            int i13 = i12 + 1;
            if (bArr[i13] == 0) {
                return i13 + 1;
            }
            int i14 = i13 + 1;
            if (bArr[i14] == 0) {
                return i14 + 1;
            }
            int i15 = i14 + 1;
            if (bArr[i15] == 0) {
                return i15 + 1;
            }
            int i16 = i15 + 1;
            if (bArr[i16] == 0) {
                return i16 + 1;
            }
            i = i16 + 1;
        } while (bArr[i] != 0);
        return i + 1;
    }

    private static int fY(byte[] bArr, int i, int i2, a aVar) {
        int i3 = bArr[i] - 48;
        while (true) {
            i++;
            byte b = bArr[i];
            if (32 == b) {
                break;
            }
            i3 = (i3 << 3) + (b - 48);
            i++;
            byte b2 = bArr[i];
            if (32 == b2) {
                break;
            }
            i3 = (i3 << 3) + (b2 - 48);
            i++;
            byte b3 = bArr[i];
            if (32 == b3) {
                break;
            }
            i3 = (i3 << 3) + (b3 - 48);
            i++;
            byte b4 = bArr[i];
            if (32 == b4) {
                break;
            }
            i3 = (i3 << 3) + (b4 - 48);
            i++;
            byte b5 = bArr[i];
            if (32 == b5) {
                break;
            }
            i3 = (i3 << 3) + (b5 - 48);
            i++;
            byte b6 = bArr[i];
            if (32 == b6) {
                break;
            }
            i3 = (i3 << 3) + (b6 - 48);
            i++;
            byte b7 = bArr[i];
            if (32 == b7) {
                break;
            }
            i3 = (i3 << 3) + (b7 - 48);
        }
        aVar.Hw = i2;
        aVar.v5 = i + 1;
        aVar.Zo = i2 - 21;
        return i3;
    }

    private o90 hz(o90 o90Var) {
        a aVarMb = mb(o90Var);
        aVarMb.j6 = this.e3;
        this.e3 = aVarMb;
        return o90Var;
    }

    private int k2(a aVar) {
        if (aVar == null) {
            return 0;
        }
        int i = aVar.Zo;
        if (i == 0) {
            return k2(aVar.j6);
        }
        int iK2 = aVar.VH;
        if (iK2 == 0) {
            iK2 = k2(aVar.j6);
            if (iK2 == this.sE.length) {
                ko(iK2);
            }
            if (iK2 != 0) {
                this.sE[iK2] = 47;
                iK2++;
            }
            aVar.VH = iK2;
        }
        int i2 = aVar.v5;
        int i3 = i - i2;
        int i4 = iK2 + i3;
        while (true) {
            byte[] bArr = this.sE;
            if (bArr.length >= i4) {
                System.arraycopy(aVar.FH, i2, bArr, iK2, i3);
                return i4;
            }
            ko(iK2);
        }
    }

    private void ko(int i) {
        byte[] bArr = this.sE;
        byte[] bArr2 = new byte[bArr.length << 1];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        this.sE = bArr2;
    }

    private a mb(o90 o90Var) {
        a aVar = this.eU;
        if (aVar != null) {
            this.eU = aVar.j6;
            aVar.Hw = 0;
            aVar.v5 = 0;
            aVar.Zo = 0;
            aVar.VH = 0;
        } else {
            aVar = new a(null);
        }
        aVar.DW = o90Var;
        aVar.FH = this.mb.QX(o90Var, 2).Hw();
        return aVar;
    }

    private void qp(a aVar) {
        aVar.FH = null;
        aVar.j6 = this.eU;
        this.eU = aVar;
    }

    private void ye(s90 s90Var) throws i40 {
        int i = s90Var.cT;
        if ((i & 4) != 0) {
            return;
        }
        s90Var.cT = i | 4;
        byte[] bArrHw = this.mb.QX(s90Var, 2).Hw();
        int i2 = 0;
        while (i2 < bArrHw.length) {
            int i3 = bArrHw[i2] - 48;
            while (true) {
                i2++;
                byte b = bArrHw[i2];
                if (32 == b) {
                    break;
                } else {
                    i3 = (i3 << 3) + (b - 48);
                }
            }
            do {
                i2++;
            } while (bArrHw[i2] != 0);
            int i4 = i2 + 1;
            int i5 = i3 >>> 12;
            if (i5 == 4) {
                this.jw.sG(bArrHw, i4);
                ye(dx(this.jw));
            } else if (i5 == 8 || i5 == 10) {
                this.jw.sG(bArrHw, i4);
                KD(this.jw).cT |= 4;
            } else if (i5 != 14) {
                this.jw.sG(bArrHw, i4);
                throw new i40(MessageFormat.format(JGitText.DW().corruptObjectInvalidMode3, String.format("%o", Integer.valueOf(i3)), this.jw.BT(), "", s90Var));
            }
            i2 = i4 + 20;
        }
    }

    public void Eq() throws i40, j40, q40 {
        while (g3() != null) {
        }
        while (true) {
            o90 o90VarJw = jw();
            if (o90VarJw == null) {
                return;
            }
            if ((o90VarJw instanceof j90) && !this.mb.EQ(o90VarJw)) {
                throw new q40(o90VarJw, 3);
            }
        }
    }

    public void Ev(o90 o90Var) {
        while (o90Var instanceof r90) {
            Xa(o90Var);
            o90Var = ((r90) o90Var).br();
            x9(o90Var);
        }
        if (o90Var instanceof k90) {
            super.ef((k90) o90Var);
        } else {
            Xa(o90Var);
        }
    }

    public byte[] FN() {
        if (this.sg == 0) {
            this.sg = k2(this.e3);
        }
        return this.sE;
    }

    @Override // abcd.t90
    public void QX() {
        super.QX();
        this.kf = new t80();
        this.Jl = null;
        this.iW = null;
        this.e3 = null;
        this.eU = null;
    }

    public void WB(o90 o90Var) throws i40 {
        while (o90Var instanceof r90) {
            o90Var.cT |= 4;
            if (this.pO) {
                Xa(o90Var);
            }
            o90Var = ((r90) o90Var).br();
            x9(o90Var);
        }
        if (o90Var instanceof k90) {
            super.Sf((k90) o90Var);
        } else if (o90Var instanceof s90) {
            ye((s90) o90Var);
        } else {
            o90Var.cT |= 4;
        }
        if (o90Var.aj() == 1 || !this.pO) {
            return;
        }
        Xa(o90Var);
    }

    @Override // abcd.t90
    public void br(int i) {
        super.br(i);
        Iterator<o90> it = this.Q6.iterator();
        while (it.hasNext()) {
            it.next().cT &= -9;
        }
        this.Q6 = new ArrayList();
        this.kf = new t80();
        this.Jl = null;
        this.iW = null;
        this.e3 = null;
        this.eU = null;
    }

    @Override // abcd.t90
    public void et(q90 q90Var, boolean z) {
        super.et(q90Var, z);
        this.pO = vy(q90.BOUNDARY);
    }

    @Override // abcd.t90
    public k90 g3() throws i40 {
        k90 k90VarG3;
        do {
            k90VarG3 = super.g3();
            if (k90VarG3 == null) {
                k90 k90Var = this.Jl;
                if (k90Var == null) {
                    return null;
                }
                this.mb.Mr(this, k90Var, this.iW);
                return null;
            }
            if ((k90VarG3.cT & 4) == 0) {
                if (this.Jl == null) {
                    this.Jl = k90VarG3;
                }
                this.iW = k90VarG3;
                this.kf.j6(k90VarG3.Eq());
                return k90VarG3;
            }
            ye(k90VarG3.Eq());
        } while (!this.pO);
        return k90VarG3;
    }

    public int jO() {
        byte[] bArr;
        int iMax;
        a aVar = this.e3;
        int i = 0;
        if (aVar == null) {
            return 0;
        }
        int i2 = aVar.Zo;
        if (i2 == 0) {
            aVar = aVar.j6;
            if (aVar == null) {
                return 0;
            }
            i2 = aVar.Zo;
        }
        if (16 <= i2 - aVar.v5) {
            bArr = aVar.FH;
            iMax = i2 - 16;
        } else {
            int iK2 = this.sg;
            if (iK2 == 0) {
                iK2 = k2(this.e3);
                this.sg = iK2;
            }
            i2 = iK2;
            bArr = this.sE;
            iMax = Math.max(0, i2 - 16);
        }
        while (iMax < i2) {
            byte b = bArr[iMax];
            if (b != 32) {
                i = (i >>> 2) + (b << 24);
            }
            iMax++;
        }
        return i;
    }

    public o90 jw() throws i40, j40 {
        this.sg = 0;
        a aVar = this.e3;
        while (aVar != null) {
            byte[] bArr = aVar.FH;
            int i = aVar.Hw;
            while (i < bArr.length) {
                int iAq = aq(bArr, i);
                this.jw.sG(bArr, iAq);
                int i2 = iAq + 20;
                o90 o90Var = (o90) this.fY.Ws(this.jw);
                if (o90Var == null || (o90Var.cT & 2) == 0) {
                    int iFY = fY(bArr, i, i2, aVar);
                    int i3 = iFY >>> 12;
                    if (i3 != 4) {
                        if (i3 == 8 || i3 == 10) {
                            if (o90Var == null) {
                                j90 j90Var = new j90(this.jw);
                                j90Var.cT = 2;
                                this.fY.v5(j90Var);
                                return j90Var;
                            }
                            if (!(o90Var instanceof j90)) {
                                throw new j40(o90Var, 3);
                            }
                            int i4 = o90Var.cT | 2;
                            o90Var.cT = i4;
                            if ((i4 & 4) == 0 || this.pO) {
                                return o90Var;
                            }
                        } else if (i3 != 14) {
                            throw new i40(MessageFormat.format(JGitText.DW().corruptObjectInvalidMode3, String.format("%o", Integer.valueOf(iFY)), this.jw.BT(), kg0.gn(bArr, aVar.v5, aVar.Zo), aVar.DW));
                        }
                    } else {
                        if (o90Var == null) {
                            s90 s90Var = new s90(this.jw);
                            s90Var.cT = 2;
                            this.fY.v5(s90Var);
                            hz(s90Var);
                            return s90Var;
                        }
                        if (!(o90Var instanceof s90)) {
                            throw new j40(o90Var, 2);
                        }
                        int i5 = o90Var.cT | 2;
                        o90Var.cT = i5;
                        if ((i5 & 4) == 0) {
                            hz(o90Var);
                            return o90Var;
                        }
                        if (this.pO) {
                            hz(o90Var);
                            return o90Var;
                        }
                    }
                }
                i = i2;
            }
            this.e3 = aVar.j6;
            qp(aVar);
            aVar = this.e3;
        }
        while (true) {
            o90 o90VarDW = this.kf.DW();
            if (o90VarDW == null) {
                this.mb.U2();
                return null;
            }
            int i6 = o90VarDW.cT;
            if ((i6 & 2) == 0) {
                int i7 = i6 | 2;
                o90VarDW.cT = i7;
                if (((i7 & 4) == 0) | this.pO) {
                    if (o90VarDW instanceof s90) {
                        a aVarMb = mb(o90VarDW);
                        aVarMb.j6 = null;
                        this.e3 = aVarMb;
                    }
                    return o90VarDW;
                }
            }
        }
    }

    public int oY() {
        if (this.sg == 0) {
            this.sg = k2(this.e3);
        }
        return this.sg;
    }

    @Override // abcd.t90
    public void wc(q90 q90Var) {
        super.wc(q90Var);
        this.pO = vy(q90.BOUNDARY);
    }

    public g90(g70 g70Var) {
        super(g70Var);
        this.Q6 = new ArrayList();
        this.kf = new t80();
        this.sE = new byte[256];
    }
}
