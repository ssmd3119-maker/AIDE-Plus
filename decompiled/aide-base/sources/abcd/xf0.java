package abcd;

import java.io.File;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class xf0 extends wf0 {

    class a implements PrivilegedAction<String> {
        @Override // java.security.PrivilegedAction
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public String run() {
            return System.getProperty("os.name");
        }
    }

    private static boolean QX() {
        return "Mac OS X".equals((String) AccessController.doPrivileged(new a()));
    }

    @Override // abcd.wf0
    public File Hw() {
        String strZo;
        File parentFile;
        File fileTp = wf0.tp(og0.FH().VH("PATH"), "git");
        if (fileTp != null) {
            return fileTp.getParentFile().getParentFile();
        }
        if (!QX() || (strZo = wf0.Zo(J8(), new String[]{"bash", "--login", "-c", "which git"}, Charset.defaultCharset().name())) == null || strZo.length() == 0 || (parentFile = new File(strZo).getParentFile()) == null) {
            return null;
        }
        return parentFile.getParentFile();
    }

    @Override // abcd.wf0
    public ProcessBuilder u7(String str, String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 4);
        arrayList.add("sh");
        arrayList.add("-c");
        arrayList.add(String.valueOf(str) + " \"$@\"");
        arrayList.add(str);
        arrayList.addAll(Arrays.asList(strArr));
        ProcessBuilder processBuilder = new ProcessBuilder(new String[0]);
        processBuilder.command(arrayList);
        return processBuilder;
    }
}
