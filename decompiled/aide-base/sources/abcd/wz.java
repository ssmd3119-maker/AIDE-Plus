package abcd;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class wz {
    private final File DW;
    private final Object FH = new Object();
    private final File j6;

    public wz(File file) {
        this.DW = file;
        this.j6 = new File(file.getParentFile(), file.getName() + ".lock");
    }

    private static String Hw(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[16000];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
            String string = byteArrayOutputStream.toString();
            if ("__null__".equals(string)) {
                string = null;
            }
            return string;
        } finally {
            fileInputStream.close();
        }
    }

    private static void Zo(File file, String str) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(str != null ? str.getBytes() : "__null__".getBytes());
            fileOutputStream.getFD().sync();
        } finally {
            fileOutputStream.close();
        }
    }

    public String DW() {
        try {
            synchronized (this.FH) {
                vz vzVar = new vz(this.j6, true);
                try {
                    vzVar.j6();
                    if (!this.DW.exists()) {
                        return null;
                    }
                    return Hw(this.DW);
                } finally {
                    vzVar.DW();
                }
            }
        } catch (IOException e) {
            b00.VH("FileBasedInterProcessShare", e);
            return null;
        }
    }

    public void FH(String str) {
        try {
            synchronized (this.FH) {
                vz vzVar = new vz(this.j6, false);
                try {
                    vzVar.j6();
                    if (!this.DW.exists()) {
                        Zo(this.DW, str);
                    }
                } finally {
                    vzVar.DW();
                }
            }
        } catch (IOException e) {
            b00.VH("FileBasedInterProcessShare", e);
        }
    }

    public boolean j6() {
        boolean zExists;
        try {
            synchronized (this.FH) {
                vz vzVar = new vz(this.j6, true);
                try {
                    vzVar.j6();
                    zExists = this.DW.exists();
                } finally {
                    vzVar.DW();
                }
            }
            return zExists;
        } catch (IOException e) {
            b00.VH("FileBasedInterProcessShare", e);
            return true;
        }
    }

    public void v5(String str) {
        try {
            synchronized (this.FH) {
                vz vzVar = new vz(this.j6, false);
                try {
                    vzVar.j6();
                    Zo(this.DW, str);
                } finally {
                    vzVar.DW();
                }
            }
        } catch (IOException e) {
            b00.VH("FileBasedInterProcessShare", e);
        }
    }
}
