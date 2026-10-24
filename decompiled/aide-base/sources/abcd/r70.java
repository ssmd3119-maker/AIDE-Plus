package abcd;

import java.io.File;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class r70 {
    private static final r70 FH = new r70();
    private final ConcurrentHashMap<b, Reference<p70>> j6 = new ConcurrentHashMap<>();
    private final c[] DW = new c[4];

    public static class a implements b {
        private final wf0 DW;
        private final File j6;

        public a(File file, wf0 wf0Var) {
            this.j6 = DW(file);
            this.DW = wf0Var;
        }

        private static File DW(File file) {
            try {
                return file.getCanonicalFile();
            } catch (IOException unused) {
                return file.getAbsoluteFile();
            }
        }

        public static a FH(File file, wf0 wf0Var) {
            return new a(file, wf0Var);
        }

        public static a VH(File file, wf0 wf0Var) {
            File fileU7 = u7(file, wf0Var);
            if (fileU7 != null) {
                file = fileU7;
            }
            return new a(file, wf0Var);
        }

        private static boolean Zo(File file) {
            String strGn = gn(file);
            if (strGn != null) {
                return strGn.startsWith("ref: refs/") || a70.Mz(strGn);
            }
            return false;
        }

        private static String gn(File file) {
            try {
                byte[] bArrHw = eg0.Hw(file, 4096);
                int length = bArrHw.length;
                if (length == 0) {
                    return null;
                }
                if (bArrHw[length - 1] == 10) {
                    length--;
                }
                return kg0.gn(bArrHw, 0, length);
            } catch (IOException unused) {
                return null;
            }
        }

        public static File u7(File file, wf0 wf0Var) {
            if (v5(file, wf0Var)) {
                return file;
            }
            if (v5(new File(file, ".git"), wf0Var)) {
                return new File(file, ".git");
            }
            String name = file.getName();
            File parentFile = file.getParentFile();
            if (!v5(new File(parentFile, String.valueOf(name) + ".git"), wf0Var)) {
                return null;
            }
            return new File(parentFile, String.valueOf(name) + ".git");
        }

        public static boolean v5(File file, wf0 wf0Var) {
            return wf0Var.VH(file, "objects").exists() && wf0Var.VH(file, "refs").exists() && Zo(new File(file, "HEAD"));
        }

        public final File Hw() {
            return this.j6;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.j6.equals(((a) obj).j6);
        }

        public int hashCode() {
            return this.j6.hashCode();
        }

        @Override // abcd.r70.b
        public p70 j6(boolean z) throws a50 {
            if (!z || v5(this.j6, this.DW)) {
                return new ka0(this.j6);
            }
            throw new a50(this.j6);
        }

        public String toString() {
            return this.j6.toString();
        }
    }

    public interface b {
        p70 j6(boolean z);
    }

    private static class c {
        private c() {
        }

        public /* synthetic */ c(c cVar) {
            this();
        }
    }

    private r70() {
        int i = 0;
        while (true) {
            c[] cVarArr = this.DW;
            if (i >= cVarArr.length) {
                return;
            }
            cVarArr[i] = new c(null);
            i++;
        }
    }

    public static p70 DW(b bVar) {
        return FH(bVar, true);
    }

    public static p70 FH(b bVar, boolean z) {
        return FH.Hw(bVar, z);
    }

    private p70 Hw(b bVar, boolean z) {
        Reference<p70> reference = this.j6.get(bVar);
        p70 p70Var = reference != null ? reference.get() : null;
        if (p70Var == null) {
            synchronized (j6(bVar)) {
                Reference<p70> reference2 = this.j6.get(bVar);
                p70 p70Var2 = reference2 != null ? reference2.get() : null;
                if (p70Var2 == null) {
                    p70 p70VarJ6 = bVar.j6(z);
                    this.j6.put(bVar, new SoftReference(p70VarJ6));
                    p70Var = p70VarJ6;
                } else {
                    p70Var = p70Var2;
                }
            }
        }
        p70Var.j3();
        return p70Var;
    }

    private c j6(b bVar) {
        return this.DW[(bVar.hashCode() >>> 1) % this.DW.length];
    }
}
