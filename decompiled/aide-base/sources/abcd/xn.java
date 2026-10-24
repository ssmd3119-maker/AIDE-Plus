package abcd;

import abcd.no;
import java.util.Arrays;

/* loaded from: classes.dex */
public class xn {
    private final int[] j6;

    public xn(int[] iArr) {
        this.j6 = iArr;
    }

    public void DW(no.b bVar) {
        bVar.writeInt(this.j6.length);
        int i = 0;
        while (true) {
            int[] iArr = this.j6;
            if (i >= iArr.length) {
                return;
            }
            bVar.writeInt(iArr[i]);
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && xn.class == obj.getClass() && Arrays.equals(this.j6, ((xn) obj).j6);
    }

    public int hashCode() {
        return 31 + Arrays.hashCode(this.j6);
    }

    public int[] j6() {
        return this.j6;
    }
}
