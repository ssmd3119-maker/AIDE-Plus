package abcd;

import abcd.xa0;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Iterator;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class fb0 {
    private final int[] DW;
    private final long[] FH;
    private final int[] Hw;
    private final xa0 j6;
    private final int[] v5;

    public fb0(xa0 xa0Var) {
        int i;
        this.j6 = xa0Var;
        long jHw = xa0Var.Hw();
        long jGn = this.j6.gn();
        long j = jHw - jGn;
        if (j > 2147483647L || jGn > 2147483647L || jHw > 4294967295L) {
            throw new IllegalArgumentException(JGitText.DW().hugeIndexesAreNotSupportedByJgitYet);
        }
        int[] iArr = new int[(int) j];
        this.DW = iArr;
        long[] jArr = new long[(int) jGn];
        this.FH = jArr;
        this.Hw = new int[iArr.length];
        this.v5 = new int[jArr.length];
        Iterator<xa0.b> it = this.j6.iterator();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            long jJ6 = it.next().j6();
            if (jJ6 < 2147483647L) {
                this.DW[i4] = (int) jJ6;
                i4++;
            } else {
                this.FH[i3] = jJ6;
                i3++;
            }
        }
        Arrays.sort(this.DW);
        Arrays.sort(this.FH);
        Iterator<xa0.b> it2 = this.j6.iterator();
        while (it2.hasNext()) {
            long jJ62 = it2.next().j6();
            if (jJ62 < 2147483647L) {
                i = i2 + 1;
                this.Hw[Arrays.binarySearch(this.DW, (int) jJ62)] = i2;
            } else {
                i = i2 + 1;
                this.v5[Arrays.binarySearch(this.FH, jJ62)] = i2;
            }
            i2 = i;
        }
    }

    public a70 DW(long j) {
        if (j <= 2147483647L) {
            int iBinarySearch = Arrays.binarySearch(this.DW, (int) j);
            if (iBinarySearch < 0) {
                return null;
            }
            return this.j6.v5(this.Hw[iBinarySearch]);
        }
        int iBinarySearch2 = Arrays.binarySearch(this.FH, j);
        if (iBinarySearch2 < 0) {
            return null;
        }
        return this.j6.v5(this.v5[iBinarySearch2]);
    }

    public long j6(long j, long j2) throws i40 {
        if (j > 2147483647L) {
            int iBinarySearch = Arrays.binarySearch(this.FH, j);
            if (iBinarySearch < 0) {
                throw new i40(MessageFormat.format(JGitText.DW().cantFindObjectInReversePackIndexForTheSpecifiedOffset, Long.valueOf(j)));
            }
            int i = iBinarySearch + 1;
            long[] jArr = this.FH;
            return i == jArr.length ? j2 : jArr[i];
        }
        int iBinarySearch2 = Arrays.binarySearch(this.DW, (int) j);
        if (iBinarySearch2 < 0) {
            throw new i40(MessageFormat.format(JGitText.DW().cantFindObjectInReversePackIndexForTheSpecifiedOffset, Long.valueOf(j)));
        }
        if (iBinarySearch2 + 1 != this.DW.length) {
            return r6[r2];
        }
        long[] jArr2 = this.FH;
        return jArr2.length > 0 ? jArr2[0] : j2;
    }
}
