package abcd;

import abcd.b30;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class o80 extends b30 {
    final byte[] EQ;
    int J0;
    a J8;
    private List<p80> Ws;
    final int we;
    private static final byte[] QX = r60.Hw("old mode ");
    private static final byte[] XL = r60.Hw("new mode ");
    static final byte[] aM = r60.Hw("deleted file mode ");
    static final byte[] j3 = r60.Hw("new file mode ");
    private static final byte[] Mr = r60.Hw("copy from ");
    private static final byte[] U2 = r60.Hw("copy to ");
    private static final byte[] a8 = r60.Hw("rename old ");
    private static final byte[] lg = r60.Hw("rename new ");
    private static final byte[] rN = r60.Hw("rename from ");
    private static final byte[] er = r60.Hw("rename to ");
    private static final byte[] yS = r60.Hw("similarity index ");
    private static final byte[] gW = r60.Hw("dissimilarity index ");
    static final byte[] BT = r60.Hw("index ");
    static final byte[] vy = r60.Hw("--- ");
    static final byte[] P8 = r60.Hw("+++ ");

    public enum a {
        UNIFIED,
        BINARY,
        GIT_BINARY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public o80(byte[] bArr, e30 e30Var, a aVar) {
        this(bArr, 0);
        this.J0 = bArr.length;
        BT(gW(q80.j6.length, bArr.length), bArr.length);
        this.J8 = aVar;
        XL(new p80(this, e30Var));
    }

    private String P8(String str, int i, int i2) {
        String strZo;
        if (i == i2) {
            return str;
        }
        byte[] bArr = this.EQ;
        if (bArr[i] == 34) {
            strZo = jg0.j6.j6(bArr, i, i2 - 1);
        } else {
            int i3 = i2;
            while (i < i3 && this.EQ[i3 - 1] != 9) {
                i3--;
            }
            if (i != i3) {
                i2 = i3;
            }
            strZo = kg0.Zo(r60.Zo, this.EQ, i, i2 - 1);
        }
        return strZo.equals("/dev/null") ? "/dev/null" : strZo;
    }

    private boolean aM(int i, int i2, int i3, int i4) {
        if (i2 - i != i4 - i3) {
            return false;
        }
        while (i < i2) {
            byte[] bArr = this.EQ;
            int i5 = i + 1;
            int i6 = i3 + 1;
            if (bArr[i] != bArr[i3]) {
                return false;
            }
            i = i5;
            i3 = i6;
        }
        return true;
    }

    private static String er(String str) {
        int iIndexOf = str.indexOf(47);
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    public static int rN(byte[] bArr, int i, int i2) {
        int i3 = i;
        while (i3 < i2 && bArr[i3] == 64) {
            i3++;
        }
        if (i3 - i >= 2 && i3 != i2) {
            int i4 = i3 + 1;
            if (bArr[i3] == 32 && i4 != i2) {
                int i5 = i4 + 1;
                if (bArr[i4] == 45) {
                    return (i5 - 3) - i;
                }
            }
        }
        return 0;
    }

    public int BT(int i, int i2) {
        while (i < i2) {
            int iAM = kg0.aM(this.EQ, i);
            if (rN(this.EQ, i, iAM) >= 1) {
                break;
            }
            if (kg0.QX(this.EQ, i, vy) < 0) {
                if (kg0.QX(this.EQ, i, P8) < 0) {
                    if (kg0.QX(this.EQ, i, QX) < 0) {
                        if (kg0.QX(this.EQ, i, XL) < 0) {
                            if (kg0.QX(this.EQ, i, aM) < 0) {
                                if (kg0.QX(this.EQ, i, j3) < 0) {
                                    if (kg0.QX(this.EQ, i, Mr) < 0) {
                                        if (kg0.QX(this.EQ, i, U2) < 0) {
                                            if (kg0.QX(this.EQ, i, a8) < 0) {
                                                if (kg0.QX(this.EQ, i, lg) < 0) {
                                                    if (kg0.QX(this.EQ, i, rN) < 0) {
                                                        if (kg0.QX(this.EQ, i, er) < 0) {
                                                            if (kg0.QX(this.EQ, i, yS) < 0) {
                                                                if (kg0.QX(this.EQ, i, gW) < 0) {
                                                                    if (kg0.QX(this.EQ, i, BT) < 0) {
                                                                        break;
                                                                    }
                                                                    vy(i + BT.length, iAM);
                                                                } else {
                                                                    this.Zo = kg0.Mr(this.EQ, i + gW.length, null);
                                                                }
                                                            } else {
                                                                this.Zo = kg0.Mr(this.EQ, i + yS.length, null);
                                                            }
                                                        } else {
                                                            this.DW = P8(this.DW, i + er.length, iAM);
                                                            this.v5 = b30.a.RENAME;
                                                        }
                                                    } else {
                                                        this.j6 = P8(this.j6, i + rN.length, iAM);
                                                        this.v5 = b30.a.RENAME;
                                                    }
                                                } else {
                                                    this.DW = P8(this.DW, i + lg.length, iAM);
                                                    this.v5 = b30.a.RENAME;
                                                }
                                            } else {
                                                this.j6 = P8(this.j6, i + a8.length, iAM);
                                                this.v5 = b30.a.RENAME;
                                            }
                                        } else {
                                            this.DW = P8(this.DW, i + U2.length, iAM);
                                            this.v5 = b30.a.COPY;
                                        }
                                    } else {
                                        this.j6 = P8(this.j6, i + Mr.length, iAM);
                                        this.v5 = b30.a.COPY;
                                    }
                                } else {
                                    ei(i, iAM);
                                }
                            } else {
                                this.FH = yS(i + aM.length, iAM);
                                this.Hw = t60.u7;
                                this.v5 = b30.a.DELETE;
                            }
                        } else {
                            this.Hw = yS(i + XL.length, iAM);
                        }
                    } else {
                        this.FH = yS(i + QX.length, iAM);
                    }
                } else {
                    nw(i, iAM);
                }
            } else {
                SI(i, iAM);
            }
            i = iAM;
        }
        return i;
    }

    public e30 KD() {
        e30 e30Var = new e30();
        Iterator<p80> it = this.Ws.iterator();
        while (it.hasNext()) {
            e30Var.addAll(it.next().Zo());
        }
        return e30Var;
    }

    public int Mr() {
        return this.J0;
    }

    public void SI(int i, int i2) {
        String strEr = er(P8(this.j6, i + vy.length, i2));
        this.j6 = strEr;
        if (strEr == "/dev/null") {
            this.v5 = b30.a.ADD;
        }
    }

    public List<? extends p80> U2() {
        List<p80> list = this.Ws;
        return list == null ? Collections.emptyList() : list;
    }

    public void XL(p80 p80Var) {
        if (p80Var.j6() != this) {
            throw new IllegalArgumentException(JGitText.DW().hunkBelongsToAnotherFile);
        }
        if (this.Ws == null) {
            this.Ws = new ArrayList();
        }
        this.Ws.add(p80Var);
    }

    public a a8() {
        return this.J8;
    }

    public void ei(int i, int i2) {
        this.FH = t60.u7;
        this.Hw = yS(i + j3.length, i2);
        this.v5 = b30.a.ADD;
    }

    public int gW(int i, int i2) {
        int iJ3;
        int iAM = kg0.aM(this.EQ, i);
        if (iAM >= i2) {
            return -1;
        }
        int iJ32 = kg0.j3(this.EQ, i, '/');
        if (iJ32 >= iAM) {
            return iAM;
        }
        int iJ33 = i;
        while (iJ33 < iAM) {
            iJ33 = kg0.j3(this.EQ, iJ33, ' ');
            if (iJ33 >= iAM || (iJ3 = kg0.j3(this.EQ, iJ33, '/')) >= iAM) {
                return iAM;
            }
            int i3 = iJ33 - 1;
            if (aM(iJ32, i3, iJ3, iAM - 1)) {
                byte[] bArr = this.EQ;
                if (bArr[i] != 34) {
                    this.j6 = kg0.Zo(r60.Zo, bArr, iJ32, i3);
                } else {
                    if (bArr[iJ33 - 2] != 34) {
                        return iAM;
                    }
                    String strJ6 = jg0.j6.j6(bArr, i, i3);
                    this.j6 = strJ6;
                    this.j6 = er(strJ6);
                }
                this.DW = this.j6;
                return iAM;
            }
        }
        return iAM;
    }

    public byte[] j3() {
        return this.EQ;
    }

    public int lg() {
        return this.we;
    }

    public void nw(int i, int i2) {
        String strEr = er(P8(this.DW, i + P8.length, i2));
        this.DW = strEr;
        if (strEr == "/dev/null") {
            this.v5 = b30.a.DELETE;
        }
    }

    public void vy(int i, int i2) {
        int iJ3 = kg0.j3(this.EQ, i, '.');
        int iJ32 = kg0.j3(this.EQ, iJ3, ' ');
        this.VH = h60.Hw(this.EQ, i, iJ3 - 1);
        this.gn = h60.Hw(this.EQ, iJ3 + 1, iJ32 - 1);
        if (iJ32 < i2) {
            t60 t60VarYS = yS(iJ32, i2);
            this.FH = t60VarYS;
            this.Hw = t60VarYS;
        }
    }

    public t60 yS(int i, int i2) {
        int i3 = 0;
        while (i < i2 - 1) {
            i3 = (i3 << 3) + (this.EQ[i] - 48);
            i++;
        }
        return t60.v5(i3);
    }

    public o80(byte[] bArr, int i) {
        this.EQ = bArr;
        this.we = i;
        this.v5 = b30.a.MODIFY;
        this.J8 = a.UNIFIED;
    }
}
