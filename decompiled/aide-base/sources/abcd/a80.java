package abcd;

import abcd.z70;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a80 {
    public void j6(OutputStream outputStream, c80<m30> c80Var, List<String> list, String str) throws IOException {
        boolean z = c80Var.VH().size() == 3;
        Iterator<z70> it = c80Var.iterator();
        String str2 = null;
        while (it.hasNext()) {
            z70 next = it.next();
            m30 m30Var = (m30) c80Var.VH().get(next.Hw());
            if (str2 != null && next.DW() != z70.a.NEXT_CONFLICTING_RANGE) {
                outputStream.write((">>>>>>> " + str2 + "\n").getBytes(str));
                str2 = null;
            }
            if (next.DW() == z70.a.FIRST_CONFLICTING_RANGE) {
                outputStream.write(("<<<<<<< " + list.get(next.Hw()) + "\n").getBytes(str));
                str2 = list.get(next.Hw());
            } else if (next.DW() == z70.a.NEXT_CONFLICTING_RANGE) {
                str2 = list.get(next.Hw());
                outputStream.write((z ? "=======\n" : "======= " + str2 + "\n").getBytes(str));
            }
            for (int iJ6 = next.j6(); iJ6 < next.FH(); iJ6++) {
                m30Var.gn(outputStream, iJ6);
                outputStream.write(10);
            }
        }
        if (str2 != null) {
            outputStream.write((">>>>>>> " + str2 + "\n").getBytes(str));
        }
    }
}
