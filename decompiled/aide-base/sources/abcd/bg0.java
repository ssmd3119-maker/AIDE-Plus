package abcd;

import java.io.File;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class bg0 extends ag0 {
    private static String Hw;

    class a implements PrivilegedAction<String> {
        @Override // java.security.PrivilegedAction
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public String run() {
            return System.getProperty("java.library.path");
        }
    }

    class b implements PrivilegedAction<String> {
        public b(bg0 bg0Var) {
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public String run() {
            return System.getenv("HOME");
        }
    }

    public static boolean XL() {
        String str = (String) AccessController.doPrivileged(new a());
        if (str == null) {
            return false;
        }
        File fileTp = wf0.tp(str, "cygpath.exe");
        if (fileTp != null) {
            Hw = fileTp.getPath();
        }
        return Hw != null;
    }

    @Override // abcd.wf0
    public File VH(File file, String str) {
        String strZo;
        String property = System.getProperty("jgit.usecygpath");
        return (property == null || !property.equals("true") || (strZo = wf0.Zo(file, new String[]{Hw, "--windows", "--absolute", str}, "UTF-8")) == null) ? super.VH(file, str) : new File(strZo);
    }

    @Override // abcd.ag0, abcd.wf0
    public File Ws() {
        String str = (String) AccessController.doPrivileged(new b(this));
        return (str == null || str.length() == 0) ? super.Ws() : VH(new File("."), str);
    }

    @Override // abcd.ag0, abcd.wf0
    public ProcessBuilder u7(String str, String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 4);
        arrayList.add("sh.exe");
        arrayList.add("-c");
        arrayList.add(String.valueOf(str) + " \"$@\"");
        arrayList.add(str);
        arrayList.addAll(Arrays.asList(strArr));
        ProcessBuilder processBuilder = new ProcessBuilder(new String[0]);
        processBuilder.command(arrayList);
        return processBuilder;
    }
}
