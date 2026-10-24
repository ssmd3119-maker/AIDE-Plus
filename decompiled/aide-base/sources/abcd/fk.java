package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public abstract class fk {
    public static boolean j6 = true;

    public static void BT(ls lsVar, short s) {
        lsVar.writeShort(s);
    }

    public static String FH(zj zjVar) {
        int iEr = ((tk) zjVar).er();
        return iEr == ((char) iEr) ? xs.VH(iEr) : xs.tp(iEr);
    }

    public static boolean J0(rp rpVar) {
        int size = rpVar.size();
        if (size < 2) {
            return true;
        }
        int iMr = rpVar.sG(0).Mr();
        for (int i = 0; i < size; i++) {
            qp qpVarSG = rpVar.sG(i);
            if (qpVarSG.Mr() != iMr) {
                return false;
            }
            iMr += qpVarSG.J0();
        }
        return true;
    }

    public static void KD(ls lsVar, short s, short s2, short s3) {
        lsVar.writeShort(s);
        lsVar.writeShort(s2);
        lsVar.writeShort(s3);
    }

    public static String Mr(rp rpVar) {
        int size = rpVar.size();
        StringBuffer stringBuffer = new StringBuffer((size * 5) + 2);
        stringBuffer.append('{');
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(rpVar.sG(i).dx());
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public static void P8(ls lsVar, short s, int i, short s2) {
        ro(lsVar, s, (short) i, (short) (i >> 16), s2);
    }

    public static String QX(sq sqVar) {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append('#');
        if (sqVar instanceof pq) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append(sqVar.tp());
            stringBuffer.append(' ');
            stringBuffer.append(sqVar.Zo());
        }
        return stringBuffer.toString();
    }

    public static void SI(ls lsVar, short s, short s2) {
        lsVar.writeShort(s);
        lsVar.writeShort(s2);
    }

    public static String U2(rp rpVar) {
        int size = rpVar.size();
        StringBuilder sb = new StringBuilder(30);
        sb.append("{");
        if (size != 0) {
            if (size != 1) {
                qp qpVarSG = rpVar.sG(size - 1);
                if (qpVarSG.J0() == 2) {
                    qpVarSG = qpVarSG.vJ(1);
                }
                sb.append(rpVar.sG(0).dx());
                sb.append("..");
                sb.append(qpVarSG.dx());
            } else {
                sb.append(rpVar.sG(0).dx());
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static String Ws(sq sqVar, int i) {
        StringBuffer stringBuffer = new StringBuffer(20);
        stringBuffer.append("#");
        long jMr = sqVar instanceof rq ? ((rq) sqVar).Mr() : sqVar.aM();
        if (i == 4) {
            stringBuffer.append(xs.we((int) jMr));
        } else if (i == 8) {
            stringBuffer.append(xs.Zo((int) jMr));
        } else if (i == 16) {
            stringBuffer.append(xs.VH((int) jMr));
        } else if (i == 32) {
            stringBuffer.append(xs.tp((int) jMr));
        } else {
            if (i != 64) {
                throw new RuntimeException("shouldn't happen");
            }
            stringBuffer.append(xs.EQ(jMr));
        }
        return stringBuffer.toString();
    }

    public static int XL(int i, int i2) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("low out of range 0..15");
        }
        if ((i2 & 15) == i2) {
            return i | (i2 << 4);
        }
        throw new IllegalArgumentException("high out of range 0..15");
    }

    public static short Zo(int i, int i2, int i3, int i4) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("n0 out of range 0..15");
        }
        if ((i2 & 15) != i2) {
            throw new IllegalArgumentException("n1 out of range 0..15");
        }
        if ((i3 & 15) != i3) {
            throw new IllegalArgumentException("n2 out of range 0..15");
        }
        if ((i4 & 15) == i4) {
            return (short) (i | (i2 << 4) | (i3 << 8) | (i4 << 12));
        }
        throw new IllegalArgumentException("n3 out of range 0..15");
    }

    public static boolean a8(int i) {
        return ((byte) i) == i;
    }

    public static short aM(zj zjVar) {
        int iV5 = zjVar.tp().v5();
        if (iV5 < 255 || iV5 > 65535) {
            throw new IllegalArgumentException("extended opcode out of range 255..65535");
        }
        return (short) iV5;
    }

    public static void cn(ls lsVar, short s, short s2, short s3, short s4, short s5) {
        lsVar.writeShort(s);
        lsVar.writeShort(s2);
        lsVar.writeShort(s3);
        lsVar.writeShort(s4);
        lsVar.writeShort(s5);
    }

    public static void ei(ls lsVar, short s, int i, short s2, short s3) {
        cn(lsVar, s, (short) i, (short) (i >> 16), s2, s3);
    }

    public static boolean er(int i) {
        return i == (i & 255);
    }

    public static boolean gW(int i) {
        return i == (65535 & i);
    }

    public static String gn(zj zjVar) {
        xj xjVar = (xj) zjVar;
        if (!xjVar.yS()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        int iEr = xjVar.er();
        sb.append(xjVar.rN().tp());
        sb.append('@');
        if (iEr < 65536) {
            sb.append(xs.VH(iEr));
        } else {
            sb.append(xs.tp(iEr));
        }
        return sb.toString();
    }

    public static short j3(zj zjVar, int i) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("arg out of range 0..255");
        }
        int iV5 = zjVar.tp().v5();
        if ((iV5 & 255) == iV5) {
            return (short) (iV5 | (i << 8));
        }
        throw new IllegalArgumentException("opcode out of range 0..255");
    }

    public static String j6(zj zjVar) {
        int iYS = ((tk) zjVar).yS();
        return iYS == ((short) iYS) ? xs.FH(iYS) : xs.Hw(iYS);
    }

    public static boolean lg(int i) {
        return i >= -8 && i <= 7;
    }

    public static void nw(ls lsVar, short s, long j) {
        cn(lsVar, s, (short) j, (short) (j >> 16), (short) (j >> 32), (short) (j >> 48));
    }

    public static boolean rN(int i) {
        return ((short) i) == i;
    }

    public static void ro(ls lsVar, short s, short s2, short s3, short s4) {
        lsVar.writeShort(s);
        lsVar.writeShort(s2);
        lsVar.writeShort(s3);
        lsVar.writeShort(s4);
    }

    public static String u7(zj zjVar) {
        bq bqVarRN = ((xj) zjVar).rN();
        return bqVarRN instanceof yq ? ((yq) bqVarRN).yS() : bqVarRN.Zo();
    }

    public static short v5(int i, int i2) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("low out of range 0..255");
        }
        if ((i2 & 255) == i2) {
            return (short) (i | (i2 << 8));
        }
        throw new IllegalArgumentException("high out of range 0..255");
    }

    public static void vy(ls lsVar, short s, int i) {
        KD(lsVar, s, (short) i, (short) (i >> 16));
    }

    public static boolean yS(int i) {
        return i == (i & 15);
    }

    public boolean DW(tk tkVar) {
        return false;
    }

    public abstract String EQ(zj zjVar, boolean z);

    public abstract int Hw();

    public final String J8(zj zjVar, boolean z) {
        String strFH = zjVar.tp().FH();
        String strTp = tp(zjVar);
        String strEQ = EQ(zjVar, z);
        StringBuilder sb = new StringBuilder(100);
        sb.append(strFH);
        if (strTp.length() != 0) {
            sb.append(' ');
            sb.append(strTp);
        }
        if (strEQ.length() != 0) {
            sb.append(" // ");
            sb.append(strEQ);
        }
        return sb.toString();
    }

    public BitSet VH(zj zjVar) {
        return new BitSet();
    }

    public abstract void sh(ls lsVar, zj zjVar);

    public abstract String tp(zj zjVar);

    public abstract boolean we(zj zjVar);
}
