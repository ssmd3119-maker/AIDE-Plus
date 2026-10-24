package abcd;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class ag0 extends wf0 {

    class a implements PrivilegedAction<String> {
        @Override // java.security.PrivilegedAction
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public String run() {
            return System.getProperty("os.name");
        }
    }

    public static boolean QX() {
        String str = (String) AccessController.doPrivileged(new a());
        return (str == null || ng0.gn(str).indexOf("windows") == -1) ? false : true;
    }

    @Override // abcd.wf0
    public boolean EQ(File file, boolean z) {
        return false;
    }

    @Override // abcd.wf0
    public File Hw() throws InterruptedException, IOException {
        File fileVH;
        File fileTp = wf0.tp(og0.FH().VH("PATH"), "git.exe", "git.cmd");
        if (fileTp != null) {
            return fileTp.getParentFile().getParentFile();
        }
        String strZo = wf0.Zo(J8(), new String[]{"bash", "--login", "-c", "which git"}, Charset.defaultCharset().name());
        if (strZo == null || (fileVH = VH(null, strZo)) == null) {
            return null;
        }
        return fileVH.getParentFile().getParentFile();
    }

    @Override // abcd.wf0
    public boolean J0() {
        return false;
    }

    @Override // abcd.wf0
    public File Ws() {
        String strVH = og0.FH().VH("HOME");
        if (strVH != null) {
            return VH(null, strVH);
        }
        String strVH2 = og0.FH().VH("HOMEDRIVE");
        if (strVH2 != null) {
            return new File(strVH2, og0.FH().VH("HOMEPATH"));
        }
        String strVH3 = og0.FH().VH("HOMESHARE");
        return strVH3 != null ? new File(strVH3) : super.Ws();
    }

    @Override // abcd.wf0
    public boolean gn() {
        return true;
    }

    @Override // abcd.wf0
    public boolean j6(File file) {
        return false;
    }

    @Override // abcd.wf0
    public ProcessBuilder u7(String str, String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 3);
        arrayList.add("cmd.exe");
        arrayList.add("/c");
        arrayList.add(str);
        arrayList.addAll(Arrays.asList(strArr));
        ProcessBuilder processBuilder = new ProcessBuilder(new String[0]);
        processBuilder.command(arrayList);
        return processBuilder;
    }
}
