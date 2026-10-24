package abcd;

import abcd.eq;
import java.util.Collection;

/* loaded from: classes.dex */
public final class tn {
    private final ls DW;
    private final km j6;

    public tn(km kmVar, ls lsVar) {
        if (kmVar == null) {
            throw new NullPointerException("file == null");
        }
        if (lsVar == null) {
            throw new NullPointerException("out == null");
        }
        this.j6 = kmVar;
        this.DW = lsVar;
    }

    public static void DW(km kmVar, bq bqVar) {
        if (bqVar instanceof dq) {
            j6(kmVar, ((dq) bqVar).we());
            return;
        }
        if (!(bqVar instanceof eq)) {
            kmVar.a8(bqVar);
            return;
        }
        eq.a aVarWe = ((eq) bqVar).we();
        int size = aVarWe.size();
        for (int i = 0; i < size; i++) {
            DW(kmVar, aVarWe.get(i));
        }
    }

    public static String FH(bq bqVar) {
        if (Hw(bqVar) == 30) {
            return "null";
        }
        return bqVar.tp() + ' ' + bqVar.Zo();
    }

    private static int Hw(bq bqVar) {
        if (bqVar instanceof hq) {
            return 0;
        }
        if (bqVar instanceof xq) {
            return 2;
        }
        if (bqVar instanceof iq) {
            return 3;
        }
        if (bqVar instanceof nq) {
            return 4;
        }
        if (bqVar instanceof tq) {
            return 6;
        }
        if (bqVar instanceof mq) {
            return 16;
        }
        if (bqVar instanceof jq) {
            return 17;
        }
        if (bqVar instanceof yq) {
            return 23;
        }
        if (bqVar instanceof zq) {
            return 24;
        }
        if (bqVar instanceof lq) {
            return 25;
        }
        if (bqVar instanceof vq) {
            return 26;
        }
        if (bqVar instanceof kq) {
            return 27;
        }
        if (bqVar instanceof eq) {
            return 28;
        }
        if (bqVar instanceof dq) {
            return 29;
        }
        if (bqVar instanceof pq) {
            return 30;
        }
        if (bqVar instanceof gq) {
            return 31;
        }
        throw new RuntimeException("Shouldn't happen");
    }

    private void gn(int i, long j) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        int i2 = (iNumberOfTrailingZeros + 7) >> 3;
        long j2 = j >> (64 - (i2 * 8));
        this.DW.writeByte(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            this.DW.writeByte((byte) j2);
            j2 >>= 8;
            i2--;
        }
    }

    public static void j6(km kmVar, wo woVar) {
        pn pnVarJ3 = kmVar.j3();
        nn nnVarAM = kmVar.aM();
        pnVarJ3.U2(woVar.ro());
        for (ap apVar : woVar.KD()) {
            nnVarAM.U2(apVar.DW());
            DW(kmVar, apVar.FH());
        }
    }

    private void tp(int i, long j) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        int i2 = (iNumberOfLeadingZeros + 7) >> 3;
        this.DW.writeByte(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            this.DW.writeByte((byte) j);
            j >>= 8;
            i2--;
        }
    }

    private void u7(int i, long j) {
        int iNumberOfLeadingZeros = ((65 - Long.numberOfLeadingZeros((j >> 63) ^ j)) + 7) >> 3;
        this.DW.writeByte(i | ((iNumberOfLeadingZeros - 1) << 5));
        while (iNumberOfLeadingZeros > 0) {
            this.DW.writeByte((byte) j);
            j >>= 8;
            iNumberOfLeadingZeros--;
        }
    }

    public void VH(bq bqVar) {
        int iHw = Hw(bqVar);
        if (iHw != 0 && iHw != 6 && iHw != 2) {
            if (iHw == 3) {
                tp(iHw, ((sq) bqVar).Mr());
                return;
            }
            if (iHw != 4) {
                if (iHw == 16) {
                    gn(iHw, ((mq) bqVar).Mr() << 32);
                    return;
                }
                if (iHw == 17) {
                    gn(iHw, ((jq) bqVar).Mr());
                    return;
                }
                switch (iHw) {
                    case 23:
                        tp(iHw, this.j6.aM().j3((yq) bqVar));
                        return;
                    case 24:
                        tp(iHw, this.j6.j3().j3((zq) bqVar));
                        return;
                    case 25:
                        tp(iHw, this.j6.u7().j3((lq) bqVar));
                        return;
                    case 26:
                        tp(iHw, this.j6.J8().j3((vq) bqVar));
                        return;
                    case 27:
                        tp(iHw, this.j6.u7().j3(((kq) bqVar).QX()));
                        return;
                    case 28:
                        this.DW.writeByte(iHw);
                        Zo((eq) bqVar, false);
                        return;
                    case 29:
                        this.DW.writeByte(iHw);
                        v5(((dq) bqVar).we(), false);
                        return;
                    case 30:
                        this.DW.writeByte(iHw);
                        return;
                    case 31:
                        this.DW.writeByte((((gq) bqVar).aM() << 5) | iHw);
                        return;
                    default:
                        throw new RuntimeException("Shouldn't happen");
                }
            }
        }
        u7(iHw, ((sq) bqVar).Mr());
    }

    public void Zo(eq eqVar, boolean z) {
        boolean z2 = z && this.DW.EQ();
        eq.a aVarWe = eqVar.we();
        int size = aVarWe.size();
        if (z2) {
            this.DW.j6("  size: " + xs.tp(size));
        }
        this.DW.gn(size);
        for (int i = 0; i < size; i++) {
            bq bqVar = aVarWe.get(i);
            if (z2) {
                this.DW.j6("  [" + Integer.toHexString(i) + "] " + FH(bqVar));
            }
            VH(bqVar);
        }
        if (z2) {
            this.DW.u7();
        }
    }

    public void v5(wo woVar, boolean z) {
        boolean z2 = z && this.DW.EQ();
        nn nnVarAM = this.j6.aM();
        pn pnVarJ3 = this.j6.j3();
        zq zqVarRo = woVar.ro();
        int iJ3 = pnVarJ3.j3(zqVarRo);
        if (z2) {
            this.DW.j6("  type_idx: " + xs.tp(iJ3) + " // " + zqVarRo.Zo());
        }
        this.DW.gn(pnVarJ3.j3(woVar.ro()));
        Collection<ap> collectionKD = woVar.KD();
        int size = collectionKD.size();
        if (z2) {
            this.DW.j6("  size: " + xs.tp(size));
        }
        this.DW.gn(size);
        int i = 0;
        for (ap apVar : collectionKD) {
            yq yqVarDW = apVar.DW();
            int iJ32 = nnVarAM.j3(yqVarDW);
            bq bqVarFH = apVar.FH();
            if (z2) {
                this.DW.Hw(0, "  elements[" + i + "]:");
                i++;
                this.DW.j6("    name_idx: " + xs.tp(iJ32) + " // " + yqVarDW.Zo());
            }
            this.DW.gn(iJ32);
            if (z2) {
                this.DW.j6("    value: " + FH(bqVarFH));
            }
            VH(bqVarFH);
        }
        if (z2) {
            this.DW.u7();
        }
    }
}
