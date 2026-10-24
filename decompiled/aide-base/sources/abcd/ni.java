package abcd;

import abcd.rh;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ni implements rh.c {
    private final cj DW;
    private final os j6;

    public ni(os osVar, cj cjVar) {
        if (osVar == null) {
            throw new NullPointerException("bytes == null");
        }
        if (cjVar == null) {
            throw new NullPointerException("observer == null");
        }
        this.j6 = osVar;
        this.DW = cjVar;
    }

    private void EQ(int i, int i2, int i3, long j) {
        String str;
        if (i3 != 1) {
            str = " #" + xs.EQ(j);
        } else {
            str = "";
        }
        this.DW.FH(this.j6, i2, i3, tp(i2) + str + " // " + Double.longBitsToDouble(j));
    }

    private void J0(int i, int i2, int i3, int i4) {
        String str;
        String str2 = i3 == 1 ? " // " : " ";
        int iWe = this.j6.we(i2);
        if (i3 == 1 || iWe == 16) {
            str = "#" + xs.DW(i4);
        } else if (iWe == 17) {
            str = "#" + xs.FH(i4);
        } else {
            str = "#" + xs.Hw(i4);
        }
        this.DW.FH(this.j6, i2, i3, tp(i2) + str2 + str);
    }

    private void J8(int i, int i2, int i3, long j) {
        String str = i3 == 1 ? " // " : " #";
        String strDW = i3 == 1 ? xs.DW((int) j) : xs.v5(j);
        this.DW.FH(this.j6, i2, i3, tp(i2) + str + strDW);
    }

    private String tp(int i) {
        int iWe = this.j6.we(i);
        String strDW = qh.DW(iWe);
        if (iWe == 196) {
            strDW = strDW + " " + qh.DW(this.j6.we(i + 1));
        }
        return xs.VH(i) + ": " + strDW;
    }

    private void we(int i, int i2, int i3, int i4) {
        String str;
        if (i3 != 1) {
            str = " #" + xs.tp(i4);
        } else {
            str = "";
        }
        this.DW.FH(this.j6, i2, i3, tp(i2) + str + " // " + Float.intBitsToFloat(i4));
    }

    @Override // abcd.rh.c
    public void DW(int i, int i2, int i3, bq bqVar, int i4) {
        String str;
        if (bqVar instanceof pq) {
            j6(i, i2, i3, null);
            return;
        }
        if (bqVar instanceof nq) {
            J0(i, i2, i3, i4);
            return;
        }
        if (bqVar instanceof tq) {
            J8(i, i2, i3, ((tq) bqVar).a8());
            return;
        }
        if (bqVar instanceof mq) {
            we(i, i2, i3, ((mq) bqVar).aM());
            return;
        }
        if (bqVar instanceof jq) {
            EQ(i, i2, i3, ((jq) bqVar).Mr());
            return;
        }
        if (i4 == 0) {
            str = "";
        } else if (i == 197) {
            str = ", " + xs.Zo(i4);
        } else {
            str = ", " + xs.VH(i4);
        }
        this.DW.FH(this.j6, i2, i3, tp(i2) + " " + bqVar + str);
    }

    @Override // abcd.rh.c
    public int FH() {
        return -1;
    }

    @Override // abcd.rh.c
    public void Hw(int i, int i2, int i3, int i4) {
        String strVH = i3 <= 3 ? xs.VH(i4) : xs.tp(i4);
        this.DW.FH(this.j6, i2, i3, tp(i2) + " " + strVH);
    }

    @Override // abcd.rh.c
    public void VH(int i, int i2, zq zqVar, ArrayList<bq> arrayList) {
        String str = i2 == 1 ? " // " : " ";
        String strZo = zqVar.J0().J0().Zo();
        this.DW.FH(this.j6, i, i2, tp(i) + str + strZo);
    }

    @Override // abcd.rh.c
    public void Zo(int i, int i2, int i3, hi hiVar, int i4) {
        int size = hiVar.size();
        StringBuffer stringBuffer = new StringBuffer((size * 20) + 100);
        stringBuffer.append(tp(i2));
        if (i4 != 0) {
            stringBuffer.append(" // padding: " + xs.tp(i4));
        }
        stringBuffer.append('\n');
        for (int i5 = 0; i5 < size; i5++) {
            stringBuffer.append("  ");
            stringBuffer.append(xs.Hw(hiVar.cn(i5)));
            stringBuffer.append(": ");
            stringBuffer.append(xs.VH(hiVar.KD(i5)));
            stringBuffer.append('\n');
        }
        stringBuffer.append("  default: ");
        stringBuffer.append(xs.VH(hiVar.vy()));
        this.DW.FH(this.j6, i2, i3, stringBuffer.toString());
    }

    @Override // abcd.rh.c
    public void gn(int i, int i2, int i3) {
        this.DW.FH(this.j6, i2, i3, tp(i2));
    }

    @Override // abcd.rh.c
    public void j6(int i, int i2, int i3, fr frVar) {
        this.DW.FH(this.j6, i2, i3, tp(i2));
    }

    @Override // abcd.rh.c
    public void u7(int i, int i2, int i3, int i4, fr frVar, int i5) {
        String string;
        String strZo = i3 <= 3 ? xs.Zo(i4) : xs.VH(i4);
        boolean z = i3 == 1;
        String string2 = "";
        if (i == 132) {
            StringBuilder sb = new StringBuilder();
            sb.append(", #");
            sb.append(i3 <= 3 ? xs.DW(i5) : xs.FH(i5));
            string = sb.toString();
        } else {
            string = "";
        }
        if (frVar.cn()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "," : " //");
            sb2.append(" category-2");
            string2 = sb2.toString();
        }
        cj cjVar = this.DW;
        os osVar = this.j6;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(tp(i2));
        sb3.append(z ? " // " : " ");
        sb3.append(strZo);
        sb3.append(string);
        sb3.append(string2);
        cjVar.FH(osVar, i2, i3, sb3.toString());
    }

    @Override // abcd.rh.c
    public void v5(int i) {
    }
}
