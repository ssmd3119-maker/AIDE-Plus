package abcd;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class cg0 {
    public static void DW(File file, int i) throws InterruptedException, IOException {
        File[] fileArrListFiles;
        if ((i & 4) == 0 || file.exists()) {
            if ((i & 1) != 0 && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    DW(file2, i);
                }
            }
            if (file.delete()) {
                return;
            }
            if ((i & 2) != 0 && file.exists()) {
                for (int i2 = 1; i2 < 10; i2++) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                    if (file.delete()) {
                        return;
                    }
                }
            }
            throw new IOException(MessageFormat.format(JGitText.DW().deleteFileFailed, file.getAbsolutePath()));
        }
    }

    public static void FH(File file) throws IOException {
        Hw(file, false);
    }

    public static void Hw(File file, boolean z) throws IOException {
        if (file.mkdir()) {
            return;
        }
        if (!z || !file.isDirectory()) {
            throw new IOException(MessageFormat.format(JGitText.DW().mkDirFailed, file.getAbsolutePath()));
        }
    }

    public static void Zo(File file, boolean z) throws IOException {
        if (file.mkdirs()) {
            return;
        }
        if (!z || !file.isDirectory()) {
            throw new IOException(MessageFormat.format(JGitText.DW().mkDirsFailed, file.getAbsolutePath()));
        }
    }

    public static void j6(File file) throws InterruptedException, IOException {
        DW(file, 0);
    }

    public static void v5(File file) throws IOException {
        Zo(file, false);
    }
}
