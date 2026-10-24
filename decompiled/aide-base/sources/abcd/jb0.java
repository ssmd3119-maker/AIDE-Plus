package abcd;

import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public class jb0 {
    private File j6;

    public jb0(p70 p70Var, String str) {
        this.j6 = new File(p70Var.u7(), "logs/" + str);
    }

    public ib0 j6(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        try {
            byte[] bArrFH = eg0.FH(this.j6);
            int iP8 = kg0.P8(bArrFH, bArrFH.length);
            int i2 = 0;
            while (iP8 >= 0) {
                iP8 = kg0.P8(bArrFH, iP8);
                if (i == i2) {
                    return new ib0(bArrFH, iP8 >= 0 ? iP8 + 2 : 0);
                }
                i2++;
            }
            return null;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}
