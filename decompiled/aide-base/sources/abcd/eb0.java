package abcd;

import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class eb0 {
    private final wf0 DW;
    private final File j6;

    public eb0(File file, wf0 wf0Var) {
        this.j6 = new File(file.getParentFile(), String.valueOf(file.getName().substring(0, r6.length() - 5)) + ".keep");
        this.DW = wf0Var;
    }

    public void DW() throws InterruptedException, IOException {
        cg0.j6(this.j6);
    }

    public boolean j6(String str) throws IOException {
        if (str == null) {
            return false;
        }
        if (!str.endsWith("\n")) {
            str = String.valueOf(str) + "\n";
        }
        sa0 sa0Var = new sa0(this.j6, this.DW);
        if (!sa0Var.u7()) {
            return false;
        }
        sa0Var.j3(r60.DW(str));
        return sa0Var.Hw();
    }
}
