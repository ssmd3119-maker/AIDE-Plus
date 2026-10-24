package abcd;

import abcd.b30;
import abcd.r30;
import abcd.y20;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class s30 {
    private List<b30> DW;
    private List<b30> FH;
    private long[] Hw;
    private List<b30> VH;
    private boolean Zo;
    private y20.c j6;
    private int v5 = 60;

    public s30(y20.c cVar, List<b30> list, List<b30> list2) {
        this.j6 = cVar;
        this.DW = list;
        this.FH = list2;
    }

    private static List<b30> DW(List<b30> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (b30 b30Var : list) {
            if (b30Var != null) {
                arrayList.add(b30Var);
            }
        }
        return arrayList;
    }

    private static List<b30> FH(List<b30> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (b30 b30Var : list) {
            if (b30Var.v5 == b30.a.DELETE) {
                arrayList.add(b30Var);
            }
        }
        return arrayList;
    }

    private static boolean J0(t60 t60Var) {
        return (t60Var.Zo() & 61440) == 32768;
    }

    private static int QX(long j) {
        return (int) (j >>> 56);
    }

    public static long VH(int i, int i2, int i3) {
        return (gn(i2) << 28) | (i << 56) | gn(i3);
    }

    public static int Ws(String str, String str2) {
        int i;
        int i2;
        int iLastIndexOf = str.lastIndexOf("/") + 1;
        int iLastIndexOf2 = str2.lastIndexOf("/") + 1;
        int iMin = Math.min(iLastIndexOf, iLastIndexOf2);
        int iMax = Math.max(iLastIndexOf, iLastIndexOf2);
        int i3 = 0;
        if (iMax == 0) {
            i = 100;
            i2 = 100;
        } else {
            int i4 = 0;
            while (i4 < iMin && str.charAt(i4) == str2.charAt(i4)) {
                i4++;
            }
            int i5 = (i4 * 100) / iMax;
            if (i5 == 100) {
                i2 = i5;
                i = 100;
            } else {
                int i6 = 0;
                while (i6 < iMin && str.charAt((iLastIndexOf - 1) - i6) == str2.charAt((iLastIndexOf2 - 1) - i6)) {
                    i6++;
                }
                i = (i6 * 100) / iMax;
                i2 = i5;
            }
        }
        int iMin2 = Math.min(str.length() - iLastIndexOf, str2.length() - iLastIndexOf2);
        int iMax2 = Math.max(str.length() - iLastIndexOf, str2.length() - iLastIndexOf2);
        while (i3 < iMin2 && str.charAt((str.length() - 1) - i3) == str2.charAt((str2.length() - 1) - i3)) {
            i3++;
        }
        return (((i2 + i) * 25) + (((i3 * 100) / iMax2) * 50)) / 100;
    }

    public static int Zo(long j) {
        return v5(268435455 & ((int) j));
    }

    private long aM(b30.b bVar, b30 b30Var) {
        return this.j6.FH(bVar, b30Var);
    }

    private static long gn(int i) {
        return 268435455 - i;
    }

    public static int j3(long j) {
        return v5(268435455 & ((int) (j >>> 28)));
    }

    private int j6(j70 j70Var) throws IOException {
        this.Hw = new long[this.DW.size() * this.FH.size()];
        long[] jArr = new long[this.DW.size()];
        long[] jArr2 = new long[this.FH.size()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        BitSet bitSet = null;
        while (i2 < this.DW.size()) {
            b30 b30Var = this.DW.get(i2);
            if (J0(b30Var.FH)) {
                r30 r30VarWe = null;
                for (int i4 = 0; i4 < this.FH.size(); i4++) {
                    b30 b30Var2 = this.FH.get(i4);
                    if (!J0(b30Var2.Hw)) {
                        j70Var.v5(1);
                    } else if (!o30.a8(b30Var.FH, b30Var2.Hw)) {
                        j70Var.v5(1);
                    } else if (bitSet == null || !bitSet.get(i4)) {
                        long jAM = jArr[i2];
                        if (jAM == 0) {
                            jAM = aM(b30.b.OLD, b30Var) + 1;
                            jArr[i2] = jAM;
                        }
                        long j = jAM;
                        long jAM2 = jArr2[i4];
                        if (jAM2 == 0) {
                            jAM2 = aM(b30.b.NEW, b30Var2) + 1;
                            jArr2[i4] = jAM2;
                        }
                        long j2 = jAM2;
                        if ((Math.min(j, j2) * 100) / Math.max(j, j2) < this.v5) {
                            j70Var.v5(1);
                        } else {
                            if (r30VarWe == null) {
                                try {
                                    r30VarWe = we(b30.b.OLD, b30Var);
                                } catch (r30.a unused) {
                                    this.Zo = true;
                                }
                            }
                            try {
                                int iJ8 = ((r30VarWe.J8(we(b30.b.NEW, b30Var2), 10000) * 99) + ((Ws(b30Var.j6, b30Var2.DW) * 100) * 1)) / 10000;
                                if (iJ8 < this.v5) {
                                    j70Var.v5(1);
                                } else {
                                    this.Hw[i3] = VH(iJ8, i2, i4);
                                    j70Var.v5(1);
                                    i3++;
                                }
                            } catch (r30.a unused2) {
                                if (bitSet == null) {
                                    bitSet = new BitSet(this.FH.size());
                                }
                                bitSet.set(i4);
                                this.Zo = true;
                                j70Var.v5(1);
                            }
                        }
                    } else {
                        j70Var.v5(1);
                    }
                }
            } else {
                j70Var.v5(this.FH.size());
            }
            i2++;
            i = 0;
        }
        Arrays.sort(this.Hw, i, i3);
        return i3;
    }

    private static int v5(int i) {
        return 268435455 - i;
    }

    private r30 we(b30.b bVar, b30 b30Var) throws r30.a, IOException {
        r30 r30Var = new r30();
        r30Var.u7(this.j6.DW(bVar, b30Var));
        r30Var.XL();
        return r30Var;
    }

    public List<b30> EQ() {
        return this.VH;
    }

    public void Hw(j70 j70Var) {
        b30.a aVar;
        if (j70Var == null) {
            j70Var = x60.j6;
        }
        j70Var.j6(JGitText.DW().renamesFindingByContent, this.DW.size() * 2 * this.FH.size());
        int iJ6 = j6(j70Var);
        this.VH = new ArrayList(Math.min(iJ6, this.FH.size()));
        while (true) {
            iJ6--;
            if (iJ6 < 0) {
                this.DW = FH(this.DW);
                this.FH = DW(this.FH);
                j70Var.FH();
                return;
            }
            long j = this.Hw[iJ6];
            int iJ3 = j3(j);
            int iZo = Zo(j);
            b30 b30Var = this.DW.get(iJ3);
            b30 b30Var2 = this.FH.get(iZo);
            if (b30Var2 == null) {
                j70Var.v5(1);
            } else {
                if (b30Var.v5 == b30.a.DELETE) {
                    aVar = b30.a.RENAME;
                    b30Var.v5 = aVar;
                } else {
                    aVar = b30.a.COPY;
                }
                this.VH.add(b30.J8(aVar, b30Var, b30Var2, QX(j)));
                this.FH.set(iZo, null);
                j70Var.v5(1);
            }
        }
    }

    public boolean J8() {
        return this.Zo;
    }

    public void XL(int i) {
        this.v5 = i;
    }

    public List<b30> tp() {
        return this.DW;
    }

    public List<b30> u7() {
        return this.FH;
    }
}
