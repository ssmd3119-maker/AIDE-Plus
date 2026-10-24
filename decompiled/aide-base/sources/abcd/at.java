package abcd;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class at extends gt {
    public static final at qp;
    private boolean fY;
    private int jw;
    private int[] mb;

    static {
        at atVar = new at(0);
        qp = atVar;
        atVar.Mr();
    }

    public at() {
        this(4);
    }

    private void cn() {
        int i = this.jw;
        int[] iArr = this.mb;
        if (i == iArr.length) {
            int[] iArr2 = new int[((i * 3) / 2) + 10];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.mb = iArr2;
        }
    }

    public static at dx(int i) {
        at atVar = new at(1);
        atVar.BT(i);
        atVar.Mr();
        return atVar;
    }

    public static at sG(int i, int i2) {
        at atVar = new at(2);
        atVar.BT(i);
        atVar.BT(i2);
        atVar.Mr();
        return atVar;
    }

    public void BT(int i) {
        a8();
        cn();
        int[] iArr = this.mb;
        int i2 = this.jw;
        int i3 = i2 + 1;
        this.jw = i3;
        iArr[i2] = i;
        if (this.fY) {
            if (i3 > 1) {
                this.fY = i >= iArr[i3 + (-2)];
            }
        }
    }

    public void I() {
        a8();
        if (this.fY) {
            return;
        }
        Arrays.sort(this.mb, 0, this.jw);
        this.fY = true;
    }

    public boolean KD(int i) {
        return sh(i) >= 0;
    }

    public void Mz(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newSize < 0");
        }
        if (i > this.jw) {
            throw new IllegalArgumentException("newSize > size");
        }
        a8();
        this.jw = i;
    }

    public int Sf() {
        a8();
        this.jw--;
        return ro(this.jw - 1);
    }

    public int ca() {
        return ro(this.jw - 1);
    }

    public void cb(int i, int i2) {
        if (i > this.jw) {
            throw new IndexOutOfBoundsException("n > size()");
        }
        cn();
        int[] iArr = this.mb;
        int i3 = i + 1;
        System.arraycopy(iArr, i, iArr, i3, this.jw - i);
        int[] iArr2 = this.mb;
        iArr2[i] = i2;
        boolean z = true;
        this.jw++;
        if (!this.fY || ((i != 0 && i2 <= iArr2[i - 1]) || (i != this.jw - 1 && i2 >= this.mb[i3]))) {
            z = false;
        }
        this.fY = z;
    }

    public at ef() {
        int i = this.jw;
        at atVar = new at(i);
        for (int i2 = 0; i2 < i; i2++) {
            atVar.BT(this.mb[i2]);
        }
        return atVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof at)) {
            return false;
        }
        at atVar = (at) obj;
        if (this.fY != atVar.fY || this.jw != atVar.jw) {
            return false;
        }
        for (int i = 0; i < this.jw; i++) {
            if (this.mb[i] != atVar.mb[i]) {
                return false;
            }
        }
        return true;
    }

    public void g3(int i, int i2) {
        a8();
        if (i >= this.jw) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            this.mb[i] = i2;
            this.fY = false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IllegalArgumentException("n < 0");
            }
        }
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.jw; i2++) {
            i = (i * 31) + this.mb[i2];
        }
        return i;
    }

    public int ro(int i) {
        if (i >= this.jw) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            return this.mb[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IndexOutOfBoundsException("n < 0");
        }
    }

    public int sh(int i) {
        int iVy = vy(i);
        if (iVy >= 0) {
            return iVy;
        }
        return -1;
    }

    public int size() {
        return this.jw;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer((this.jw * 5) + 10);
        stringBuffer.append('{');
        for (int i = 0; i < this.jw; i++) {
            if (i != 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(this.mb[i]);
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public void vJ(int i) {
        if (i >= this.jw) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        int[] iArr = this.mb;
        System.arraycopy(iArr, i + 1, iArr, i, (r0 - i) - 1);
        this.jw--;
    }

    public int vy(int i) {
        int i2 = this.jw;
        if (!this.fY) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.mb[i3] == i) {
                    return i3;
                }
            }
            return -i2;
        }
        int i4 = -1;
        int i5 = i2;
        while (i5 > i4 + 1) {
            int i6 = ((i5 - i4) >> 1) + i4;
            if (i <= this.mb[i6]) {
                i5 = i6;
            } else {
                i4 = i6;
            }
        }
        return i5 != i2 ? i == this.mb[i5] ? i5 : (-i5) - 1 : (-i2) - 1;
    }

    public at(int i) {
        super(true);
        try {
            this.mb = new int[i];
            this.jw = 0;
            this.fY = true;
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }
}
