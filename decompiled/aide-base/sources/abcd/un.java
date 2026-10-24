package abcd;

import abcd.no;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class un implements Comparable<un> {
    private final co WB;
    private final int[] fY;
    private final int jw;
    private final byte mb;
    private final dodo[] qp;

    public un(co coVar, byte b, int i, int[] iArr, dodo[] dodoVarArr) {
        this.WB = coVar;
        this.mb = b;
        this.jw = i;
        this.fY = iArr;
        this.qp = dodoVarArr;
    }

    public int[] DW() {
        return this.fY;
    }

    public int FH() {
        return this.jw;
    }

    public byte Zo() {
        return this.mb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || un.class != obj.getClass()) {
            return false;
        }
        un unVar = (un) obj;
        return Arrays.equals(this.fY, unVar.fY) && this.jw == unVar.jw && Arrays.equals(this.qp, unVar.qp) && this.mb == unVar.mb;
    }

    public int hashCode() {
        return ((((((Arrays.hashCode(this.fY) + 31) * 31) + this.jw) * 31) + Arrays.hashCode(this.qp)) * 31) + this.mb;
    }

    @Override // java.lang.Comparable
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public int compareTo(un unVar) {
        int i = this.jw;
        int i2 = unVar.jw;
        if (i != i2) {
            return mt.j6(i, i2);
        }
        int iMin = Math.min(this.fY.length, unVar.fY.length);
        for (int i3 = 0; i3 < iMin; i3++) {
            int[] iArr = this.fY;
            int i4 = iArr[i3];
            int[] iArr2 = unVar.fY;
            if (i4 != iArr2[i3]) {
                return mt.j6(iArr[i3], iArr2[i3]);
            }
            int iCompareTo = this.qp[i3].compareTo(unVar.qp[i3]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return this.fY.length - unVar.fY.length;
    }

    public String toString() {
        if (this.WB == null) {
            return ((int) this.mb) + " " + this.jw;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((int) this.mb);
        sb.append(" ");
        sb.append(this.WB.j3().get(this.jw));
        sb.append("[");
        for (int i = 0; i < this.fY.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.WB.aM().get(this.fY[i]));
            sb.append("=");
            sb.append(this.qp[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    public void u7(no.b bVar) {
        bVar.writeByte(this.mb);
        bVar.ro(this.jw);
        bVar.ro(this.fY.length);
        int i = 0;
        while (true) {
            int[] iArr = this.fY;
            if (i >= iArr.length) {
                return;
            }
            bVar.ro(iArr[i]);
            this.qp[i].FH(bVar);
            i++;
        }
    }

    public dodo[] v5() {
        return this.qp;
    }
}
