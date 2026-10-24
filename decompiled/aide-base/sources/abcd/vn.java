package abcd;

import abcd.no;

/* loaded from: classes.dex */
public class vn {
    private final int[] DW;
    private final int[] FH;
    private final int[] Hw;
    private final int[] VH;
    private final int[] Zo;
    private final int j6;
    private final int[] v5;

    public vn(int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6) {
        this.j6 = i;
        this.DW = iArr;
        this.FH = iArr2;
        this.Hw = iArr3;
        this.v5 = iArr4;
        this.Zo = iArr5;
        this.VH = iArr6;
    }

    public int[] DW() {
        return this.FH;
    }

    public int[] FH() {
        return this.DW;
    }

    public int[] Hw() {
        return this.v5;
    }

    public int[] VH() {
        return this.Zo;
    }

    public int[] Zo() {
        return this.VH;
    }

    public void gn(no.b bVar) {
        bVar.writeInt(this.j6);
        bVar.writeInt(this.DW.length);
        bVar.writeInt(this.Hw.length);
        bVar.writeInt(this.Zo.length);
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.DW;
            if (i2 >= iArr.length) {
                break;
            }
            bVar.writeInt(iArr[i2]);
            bVar.writeInt(this.FH[i2]);
            i2++;
        }
        int i3 = 0;
        while (true) {
            int[] iArr2 = this.Hw;
            if (i3 >= iArr2.length) {
                break;
            }
            bVar.writeInt(iArr2[i3]);
            bVar.writeInt(this.v5[i3]);
            i3++;
        }
        while (true) {
            int[] iArr3 = this.Zo;
            if (i >= iArr3.length) {
                return;
            }
            bVar.writeInt(iArr3[i]);
            bVar.writeInt(this.VH[i]);
            i++;
        }
    }

    public int j6() {
        return this.j6;
    }

    public int[] v5() {
        return this.Hw;
    }
}
