package abcd;

import abcd.eq;
import abcd.os;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ki {
    private final os DW;
    private final cj FH;
    private final os.a Hw;
    private final cq j6;
    private int v5;

    public ki(oi oiVar, int i, int i2, cj cjVar) {
        if (oiVar == null) {
            throw new NullPointerException("cf == null");
        }
        this.j6 = oiVar.v5();
        this.FH = cjVar;
        os osVarAM = oiVar.Hw().aM(i, i2 + i);
        this.DW = osVarAM;
        this.Hw = osVarAM.Ws();
        this.v5 = 0;
    }

    private wo DW(xo xoVar) throws IOException {
        we(4);
        int unsignedShort = this.Hw.readUnsignedShort();
        int unsignedShort2 = this.Hw.readUnsignedShort();
        zq zqVar = new zq(fr.a8(((yq) this.j6.get(unsignedShort)).J0()));
        if (this.FH != null) {
            EQ(2, "type: " + zqVar.Zo());
            EQ(2, "num_elements: " + unsignedShort2);
        }
        wo woVar = new wo(zqVar, xoVar);
        for (int i = 0; i < unsignedShort2; i++) {
            if (this.FH != null) {
                EQ(0, "elements[" + i + "]:");
                j6(1);
            }
            woVar.BT(VH());
            if (this.FH != null) {
                j6(-1);
            }
        }
        woVar.Mr();
        return woVar;
    }

    private void EQ(int i, String str) {
        this.FH.FH(this.DW, this.v5, i, str);
        this.v5 += i;
    }

    private yo Hw(xo xoVar) throws IOException {
        int unsignedShort = this.Hw.readUnsignedShort();
        if (this.FH != null) {
            EQ(2, "num_annotations: " + xs.VH(unsignedShort));
        }
        yo yoVar = new yo();
        for (int i = 0; i < unsignedShort; i++) {
            if (this.FH != null) {
                EQ(0, "annotations[" + i + "]:");
                j6(1);
            }
            yoVar.BT(DW(xoVar));
            cj cjVar = this.FH;
            if (cjVar != null) {
                cjVar.DW(-1);
            }
        }
        yoVar.Mr();
        return yoVar;
    }

    private ap VH() throws IOException {
        we(5);
        yq yqVar = (yq) this.j6.get(this.Hw.readUnsignedShort());
        if (this.FH != null) {
            EQ(2, "element_name: " + yqVar.Zo());
            EQ(0, "value: ");
            j6(1);
        }
        bq bqVarU7 = u7();
        if (this.FH != null) {
            j6(-1);
        }
        return new ap(yqVar, bqVarU7);
    }

    private bq Zo() {
        bq bqVar = this.j6.get(this.Hw.readUnsignedShort());
        if (this.FH != null) {
            EQ(2, "constant_value: " + (bqVar instanceof yq ? ((yq) bqVar).yS() : bqVar.Zo()));
        }
        return bqVar;
    }

    private void j6(int i) {
        this.FH.DW(i);
    }

    private bq u7() throws IOException {
        int unsignedByte = this.Hw.readUnsignedByte();
        if (this.FH != null) {
            EQ(1, "tag: " + new yq(Character.toString((char) unsignedByte)).yS());
        }
        if (unsignedByte == 64) {
            return new dq(DW(xo.EMBEDDED));
        }
        if (unsignedByte == 70) {
            return (mq) Zo();
        }
        if (unsignedByte == 83) {
            return xq.a8(((nq) Zo()).a8());
        }
        if (unsignedByte == 99) {
            fr frVarBT = fr.BT(((yq) this.j6.get(this.Hw.readUnsignedShort())).J0());
            if (this.FH != null) {
                EQ(2, "class_info: " + frVarBT.Zo());
            }
            return new zq(frVarBT);
        }
        if (unsignedByte == 101) {
            we(4);
            int unsignedShort = this.Hw.readUnsignedShort();
            int unsignedShort2 = this.Hw.readUnsignedShort();
            yq yqVar = (yq) this.j6.get(unsignedShort);
            yq yqVar2 = (yq) this.j6.get(unsignedShort2);
            if (this.FH != null) {
                EQ(2, "type_name: " + yqVar.Zo());
                EQ(2, "const_name: " + yqVar2.Zo());
            }
            return new kq(new wq(yqVar2, yqVar));
        }
        if (unsignedByte == 115) {
            return Zo();
        }
        if (unsignedByte == 73) {
            return (nq) Zo();
        }
        if (unsignedByte == 74) {
            return (tq) Zo();
        }
        if (unsignedByte == 90) {
            return gq.yS(((nq) Zo()).a8());
        }
        if (unsignedByte != 91) {
            switch (unsignedByte) {
                case 66:
                    return hq.yS(((nq) Zo()).a8());
                case 67:
                    nq nqVar = (nq) Zo();
                    nqVar.a8();
                    return iq.yS(nqVar.a8());
                case 68:
                    return (jq) Zo();
                default:
                    throw new bj("unknown annotation tag: " + xs.Zo(unsignedByte));
            }
        }
        we(2);
        int unsignedShort3 = this.Hw.readUnsignedShort();
        eq.a aVar = new eq.a(unsignedShort3);
        if (this.FH != null) {
            EQ(2, "num_values: " + unsignedShort3);
            j6(1);
        }
        for (int i = 0; i < unsignedShort3; i++) {
            if (this.FH != null) {
                j6(-1);
                EQ(0, "element_value[" + i + "]:");
                j6(1);
            }
            aVar.ef(i, u7());
        }
        if (this.FH != null) {
            j6(-1);
        }
        aVar.Mr();
        return new eq(aVar);
    }

    private zo v5(xo xoVar) throws IOException {
        int unsignedByte = this.Hw.readUnsignedByte();
        if (this.FH != null) {
            EQ(1, "num_parameters: " + xs.Zo(unsignedByte));
        }
        zo zoVar = new zo(unsignedByte);
        for (int i = 0; i < unsignedByte; i++) {
            if (this.FH != null) {
                EQ(0, "parameter_annotations[" + i + "]:");
                j6(1);
            }
            zoVar.Sf(i, Hw(xoVar));
            cj cjVar = this.FH;
            if (cjVar != null) {
                cjVar.DW(-1);
            }
        }
        zoVar.Mr();
        return zoVar;
    }

    private void we(int i) {
        if (this.Hw.available() < i) {
            throw new bj("truncated annotation attribute");
        }
    }

    public yo FH(xo xoVar) {
        try {
            yo yoVarHw = Hw(xoVar);
            if (this.Hw.available() == 0) {
                return yoVarHw;
            }
            throw new bj("extra data in attribute");
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    public zo gn(xo xoVar) {
        try {
            zo zoVarV5 = v5(xoVar);
            if (this.Hw.available() == 0) {
                return zoVarV5;
            }
            throw new bj("extra data in attribute");
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    public bq tp() {
        try {
            bq bqVarU7 = u7();
            if (this.Hw.available() == 0) {
                return bqVarU7;
            }
            throw new bj("extra data in attribute");
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }
}
