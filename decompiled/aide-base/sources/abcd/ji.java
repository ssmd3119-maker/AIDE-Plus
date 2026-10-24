package abcd;

import com.probelytics.api.UserTouchAction;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class ji {
    private final ar DW;
    private final int[] FH;
    private int Hw;
    private final os j6;
    private cj v5;

    public ji(os osVar) {
        int iJ8 = osVar.J8(8);
        this.j6 = osVar;
        this.DW = new ar(iJ8);
        this.FH = new int[iJ8];
        this.Hw = -1;
    }

    private void Hw() {
        StringBuilder sb;
        String string;
        j6();
        cj cjVar = this.v5;
        if (cjVar != null) {
            cjVar.FH(this.j6, 8, 2, "constant_pool_count: " + xs.VH(this.FH.length));
            this.v5.FH(this.j6, 10, 0, "\nconstant_pool:");
            this.v5.DW(1);
        }
        BitSet bitSet = new BitSet(this.FH.length);
        int i = 1;
        while (true) {
            int[] iArr = this.FH;
            if (i >= iArr.length) {
                break;
            }
            if (iArr[i] != 0 && this.DW.BT(i) == null) {
                v5(i, bitSet);
            }
            i++;
        }
        if (this.v5 != null) {
            for (int i2 = 1; i2 < this.FH.length; i2++) {
                bq bqVarBT = this.DW.BT(i2);
                if (bqVarBT != null) {
                    int i3 = this.FH[i2];
                    int i4 = this.Hw;
                    int i5 = i2 + 1;
                    while (true) {
                        int[] iArr2 = this.FH;
                        if (i5 >= iArr2.length) {
                            break;
                        }
                        int i6 = iArr2[i5];
                        if (i6 != 0) {
                            i4 = i6;
                            break;
                        }
                        i5++;
                    }
                    if (bitSet.get(i2)) {
                        sb = new StringBuilder();
                        sb.append(xs.VH(i2));
                        sb.append(": utf8{\"");
                        sb.append(bqVarBT.Zo());
                        string = "\"}";
                    } else {
                        sb = new StringBuilder();
                        sb.append(xs.VH(i2));
                        sb.append(": ");
                        string = bqVarBT.toString();
                    }
                    sb.append(string);
                    this.v5.FH(this.j6, i3, i4 - i3, sb.toString());
                }
            }
            this.v5.DW(-1);
            this.v5.FH(this.j6, this.Hw, 0, "end constant_pool");
        }
    }

    private yq VH(int i) {
        int iJ8 = this.j6.J8(i + 1);
        int i2 = i + 3;
        try {
            return new yq(this.j6.aM(i2, iJ8 + i2));
        } catch (IllegalArgumentException e) {
            throw new bj(e);
        }
    }

    private void Zo() {
        if (this.Hw < 0) {
            Hw();
        }
    }

    private void j6() {
        int i;
        int iJ8 = 10;
        int i2 = 1;
        while (true) {
            int[] iArr = this.FH;
            if (i2 >= iArr.length) {
                this.Hw = iJ8;
                return;
            }
            iArr[i2] = iJ8;
            int iWe = this.j6.we(iJ8);
            switch (iWe) {
                case 1:
                    iJ8 += this.j6.J8(iJ8 + 1) + 3;
                    break;
                case 2:
                default:
                    bj bjVar = new bj("unknown tag byte: " + xs.Zo(iWe));
                    bjVar.j6("...while preparsing cst " + xs.VH(i2) + " at offset " + xs.tp(iJ8));
                    throw bjVar;
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    iJ8 += 5;
                    break;
                case 5:
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    i = 2;
                    iJ8 += 9;
                    continue;
                    i2 += i;
                case UserTouchAction.CLICK_KIND /* 7 */:
                case 8:
                    iJ8 += 3;
                    break;
            }
            i = 1;
            i2 += i;
        }
    }

    private bq v5(int i, BitSet bitSet) {
        bq lqVar;
        bq bqVarBT = this.DW.BT(i);
        if (bqVarBT != null) {
            return bqVarBT;
        }
        int i2 = this.FH[i];
        try {
            switch (this.j6.we(i2)) {
                case 1:
                    bqVarBT = VH(i2);
                    bitSet.set(i);
                    break;
                case 3:
                    bqVarBT = nq.yS(this.j6.u7(i2 + 1));
                    break;
                case 4:
                    bqVarBT = mq.a8(this.j6.u7(i2 + 1));
                    break;
                case 5:
                    bqVarBT = tq.yS(this.j6.tp(i2 + 1));
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    bqVarBT = jq.a8(this.j6.tp(i2 + 1));
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    bqVarBT = new zq(fr.yS(((yq) v5(this.j6.J8(i2 + 1), bitSet)).J0()));
                    break;
                case 8:
                    bqVarBT = v5(this.j6.J8(i2 + 1), bitSet);
                    break;
                case 9:
                    lqVar = new lq((zq) v5(this.j6.J8(i2 + 1), bitSet), (wq) v5(this.j6.J8(i2 + 3), bitSet));
                    bqVarBT = lqVar;
                    break;
                case 10:
                    lqVar = new vq((zq) v5(this.j6.J8(i2 + 1), bitSet), (wq) v5(this.j6.J8(i2 + 3), bitSet));
                    bqVarBT = lqVar;
                    break;
                case 11:
                    lqVar = new oq((zq) v5(this.j6.J8(i2 + 1), bitSet), (wq) v5(this.j6.J8(i2 + 3), bitSet));
                    bqVarBT = lqVar;
                    break;
                case 12:
                    lqVar = new wq((yq) v5(this.j6.J8(i2 + 1), bitSet), (yq) v5(this.j6.J8(i2 + 3), bitSet));
                    bqVarBT = lqVar;
                    break;
            }
            this.DW.vy(i, bqVarBT);
            return bqVarBT;
        } catch (bj e) {
            e.j6("...while parsing cst " + xs.VH(i) + " at offset " + xs.tp(i2));
            throw e;
        } catch (RuntimeException e2) {
            bj bjVar = new bj(e2);
            bjVar.j6("...while parsing cst " + xs.VH(i) + " at offset " + xs.tp(i2));
            throw bjVar;
        }
    }

    public int DW() {
        Zo();
        return this.Hw;
    }

    public ar FH() {
        Zo();
        return this.DW;
    }

    public void gn(cj cjVar) {
        this.v5 = cjVar;
    }
}
