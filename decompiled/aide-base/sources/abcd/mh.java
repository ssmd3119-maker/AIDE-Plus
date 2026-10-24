package abcd;

import abcd.ph;
import abcd.rh;
import com.aide.uidesigner.ProxyTextView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class mh implements rh.c {
    private final int[] DW;
    private final int[] FH;
    private final int[] Hw;
    private int VH;
    private final ph[] Zo;
    private final sh j6;
    private final at[] v5;

    private mh(sh shVar) {
        if (shVar == null) {
            throw new NullPointerException("method == null");
        }
        this.j6 = shVar;
        int iTp = shVar.tp().tp() + 1;
        this.DW = ns.u7(iTp);
        this.FH = ns.u7(iTp);
        this.Hw = ns.u7(iTp);
        this.v5 = new at[iTp];
        this.Zo = new ph[iTp];
        this.VH = -1;
    }

    private void EQ() {
        rh rhVarTp = this.j6.tp();
        ph phVarU7 = this.j6.u7();
        int size = phVarU7.size();
        ns.EQ(this.DW, 0);
        ns.EQ(this.Hw, 0);
        while (!ns.gn(this.DW)) {
            try {
                rhVarTp.u7(this.DW, this);
                for (int i = 0; i < size; i++) {
                    ph.a aVarSG = phVarU7.sG(i);
                    int iV5 = aVarSG.v5();
                    int iDW = aVarSG.DW();
                    if (ns.j6(this.FH, iV5, iDW)) {
                        ns.EQ(this.Hw, iV5);
                        ns.EQ(this.Hw, iDW);
                        tp(aVarSG.Hw(), true);
                    }
                }
            } catch (IllegalArgumentException e) {
                throw new fi("flow of control falls off end of method", e);
            }
        }
    }

    public static oh J0(sh shVar) {
        mh mhVar = new mh(shVar);
        mhVar.EQ();
        return mhVar.we();
    }

    private void J8(int i, int i2, boolean z) {
        ns.EQ(this.FH, i);
        if (z) {
            tp(i + i2, false);
        } else {
            ns.EQ(this.Hw, i + i2);
        }
    }

    private void Ws(int i, int i2, boolean z) {
        int i3 = i2 + i;
        if (z) {
            tp(i3, true);
        }
        ph phVarEf = this.j6.u7().ef(i);
        this.Zo[i] = phVarEf;
        at[] atVarArr = this.v5;
        if (!z) {
            i3 = -1;
        }
        atVarArr[i] = phVarEf.Mz(i3);
    }

    private void tp(int i, boolean z) {
        if (!ns.Zo(this.FH, i)) {
            ns.EQ(this.DW, i);
        }
        if (z) {
            ns.EQ(this.Hw, i);
        }
    }

    private oh we() {
        ph phVar;
        nh[] nhVarArr = new nh[this.j6.tp().tp()];
        int i = 0;
        int i2 = 0;
        while (true) {
            int iV5 = ns.v5(this.Hw, i + 1);
            if (iV5 < 0) {
                break;
            }
            if (ns.Zo(this.FH, i)) {
                at atVarDx = null;
                int i3 = iV5 - 1;
                while (true) {
                    if (i3 < i) {
                        i3 = -1;
                        break;
                    }
                    atVarDx = this.v5[i3];
                    if (atVarDx != null) {
                        break;
                    }
                    i3--;
                }
                if (atVarDx == null) {
                    atVarDx = at.dx(iV5);
                    phVar = ph.jw;
                } else {
                    phVar = this.Zo[i3];
                    if (phVar == null) {
                        phVar = ph.jw;
                    }
                }
                nhVarArr[i2] = new nh(i, i, iV5, atVarDx, phVar);
                i2++;
            }
            i = iV5;
        }
        oh ohVar = new oh(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            ohVar.x9(i4, nhVarArr[i4]);
        }
        return ohVar;
    }

    @Override // abcd.rh.c
    public void DW(int i, int i2, int i3, bq bqVar, int i4) {
        J8(i2, i3, true);
        if ((bqVar instanceof uq) || (bqVar instanceof zq) || (bqVar instanceof yq)) {
            Ws(i2, i3, true);
        }
    }

    @Override // abcd.rh.c
    public int FH() {
        return this.VH;
    }

    @Override // abcd.rh.c
    public void Hw(int i, int i2, int i3, int i4) {
        if (i != 167) {
            if (i == 168) {
                tp(i2, true);
            }
            int i5 = i2 + i3;
            J8(i2, i3, true);
            tp(i5, true);
            this.v5[i2] = at.sG(i5, i4);
        } else {
            J8(i2, i3, false);
            this.v5[i2] = at.dx(i4);
        }
        tp(i4, true);
    }

    @Override // abcd.rh.c
    public void VH(int i, int i2, zq zqVar, ArrayList<bq> arrayList) {
        J8(i, i2, true);
        Ws(i, i2, true);
    }

    @Override // abcd.rh.c
    public void Zo(int i, int i2, int i3, hi hiVar, int i4) {
        J8(i2, i3, false);
        tp(hiVar.vy(), true);
        int size = hiVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            tp(hiVar.KD(i5), true);
        }
        this.v5[i2] = hiVar.ro();
    }

    @Override // abcd.rh.c
    public void gn(int i, int i2, int i3) {
        J8(i2, i3, true);
    }

    @Override // abcd.rh.c
    public void j6(int i, int i2, int i3, fr frVar) {
        if (i == 108 || i == 112) {
            J8(i2, i3, true);
            if (frVar == fr.n5 || frVar == fr.Q6) {
                Ws(i2, i3, true);
                return;
            }
            return;
        }
        if (i == 172 || i == 177) {
            J8(i2, i3, false);
            this.v5[i2] = at.qp;
            return;
        }
        if (i != 190) {
            if (i == 191) {
                J8(i2, i3, false);
                Ws(i2, i3, false);
                return;
            } else if (i != 194 && i != 195) {
                switch (i) {
                    case 46:
                    case 47:
                    case 48:
                    case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                        break;
                    default:
                        switch (i) {
                            case 79:
                            case 80:
                            case ProxyTextView.INPUTTYPE_textLongMessage /* 81 */:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 86:
                                break;
                            default:
                                J8(i2, i3, true);
                                break;
                        }
                        return;
                }
            }
        }
        J8(i2, i3, true);
        Ws(i2, i3, true);
    }

    @Override // abcd.rh.c
    public void u7(int i, int i2, int i3, int i4, fr frVar, int i5) {
        if (i != 169) {
            J8(i2, i3, true);
        } else {
            J8(i2, i3, false);
            this.v5[i2] = at.qp;
        }
    }

    @Override // abcd.rh.c
    public void v5(int i) {
        this.VH = i;
    }
}
