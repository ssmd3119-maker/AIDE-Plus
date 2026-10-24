package abcd;

import abcd.k70;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class o70 {
    private final Collection<k70> j6;

    public o70(Collection<k70> collection) {
        this.j6 = l70.Hw(collection);
    }

    public void DW() throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[40];
        for (k70 k70Var : this.j6) {
            if (!"HEAD".equals(k70Var.getName())) {
                k70Var.DW().QX(cArr, stringWriter);
                stringWriter.write(9);
                stringWriter.write(k70Var.getName());
                stringWriter.write(10);
                if (k70Var.FH() != null) {
                    k70Var.FH().QX(cArr, stringWriter);
                    stringWriter.write(9);
                    stringWriter.write(k70Var.getName());
                    stringWriter.write("^{}\n");
                }
            }
        }
        j6("info/refs", r60.DW(stringWriter.toString()));
    }

    public void FH() throws IOException {
        boolean z;
        Iterator<k70> it = this.j6.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            k70 next = it.next();
            if (next.j6().DW() && next.Hw()) {
                z = true;
                break;
            }
        }
        StringWriter stringWriter = new StringWriter();
        if (z) {
            stringWriter.write("# pack-refs with:");
            if (z) {
                stringWriter.write(" peeled");
            }
            stringWriter.write(10);
        }
        char[] cArr = new char[40];
        for (k70 k70Var : this.j6) {
            if (k70Var.j6() == k70.a.PACKED) {
                k70Var.DW().QX(cArr, stringWriter);
                stringWriter.write(32);
                stringWriter.write(k70Var.getName());
                stringWriter.write(10);
                if (k70Var.FH() != null) {
                    stringWriter.write(94);
                    k70Var.FH().QX(cArr, stringWriter);
                    stringWriter.write(10);
                }
            }
        }
        j6("packed-refs", r60.DW(stringWriter.toString()));
    }

    public abstract void j6(String str, byte[] bArr);

    public o70(lg0<k70> lg0Var) {
        this.j6 = lg0Var.v5();
    }
}
