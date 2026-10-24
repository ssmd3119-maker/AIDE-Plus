package abcd;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* loaded from: classes.dex */
public class cb0 extends ab0 {
    public cb0(OutputStream outputStream) {
        super(outputStream);
    }

    private void EQ() throws IOException {
        Iterator<? extends ld0> it = this.FH.iterator();
        while (it.hasNext()) {
            long jQq = it.next().Qq();
            if (2147483647L < jQq) {
                ig0.gn(this.DW, 0, jQq);
                this.j6.write(this.DW, 0, 8);
            }
        }
    }

    private void gn() throws IOException {
        Iterator<? extends ld0> it = this.FH.iterator();
        while (it.hasNext()) {
            ig0.VH(this.DW, 0, it.next().x9());
            this.j6.write(this.DW, 0, 4);
        }
    }

    private void tp() throws IOException {
        Iterator<? extends ld0> it = this.FH.iterator();
        int i = 0;
        while (it.hasNext()) {
            long jQq = it.next().Qq();
            if (jQq <= 2147483647L) {
                ig0.VH(this.DW, 0, (int) jQq);
            } else {
                ig0.VH(this.DW, 0, i | Integer.MIN_VALUE);
                i++;
            }
            this.j6.write(this.DW, 0, 4);
        }
    }

    private void u7() throws IOException {
        Iterator<? extends ld0> it = this.FH.iterator();
        while (it.hasNext()) {
            it.next().u7(this.j6);
        }
    }

    @Override // abcd.ab0
    public void Zo() throws IOException {
        VH(2);
        v5();
        u7();
        gn();
        tp();
        EQ();
        Hw();
    }
}
