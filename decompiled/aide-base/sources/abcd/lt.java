package abcd;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes.dex */
public final class lt {
    private final int DW;
    private final StringBuffer FH;
    private final StringBuffer Hw;
    private final ys Zo;
    private final Writer j6;
    private final ys v5;

    public lt(Writer writer, int i, int i2, String str) {
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        if (i < 1) {
            throw new IllegalArgumentException("leftWidth < 1");
        }
        if (i2 < 1) {
            throw new IllegalArgumentException("rightWidth < 1");
        }
        if (str == null) {
            throw new NullPointerException("spacer == null");
        }
        StringWriter stringWriter = new StringWriter(1000);
        StringWriter stringWriter2 = new StringWriter(1000);
        this.j6 = writer;
        this.DW = i;
        this.FH = stringWriter.getBuffer();
        this.Hw = stringWriter2.getBuffer();
        this.v5 = new ys(stringWriter, i);
        this.Zo = new ys(stringWriter2, i2, str);
    }

    private void FH() throws IOException {
        j6(this.FH, this.v5);
        while (this.FH.length() != 0) {
            this.Zo.write(10);
            VH();
        }
    }

    private void Hw() throws IOException {
        j6(this.Hw, this.Zo);
        while (this.Hw.length() != 0) {
            this.v5.write(10);
            VH();
        }
    }

    private void VH() throws IOException {
        int iIndexOf;
        while (true) {
            int iIndexOf2 = this.FH.indexOf("\n");
            if (iIndexOf2 < 0 || (iIndexOf = this.Hw.indexOf("\n")) < 0) {
                return;
            }
            if (iIndexOf2 != 0) {
                this.j6.write(this.FH.substring(0, iIndexOf2));
            }
            if (iIndexOf != 0) {
                u7(this.j6, this.DW - iIndexOf2);
                this.j6.write(this.Hw.substring(0, iIndexOf));
            }
            this.j6.write(10);
            this.FH.delete(0, iIndexOf2 + 1);
            this.Hw.delete(0, iIndexOf + 1);
        }
    }

    public static String gn(String str, int i, String str2, String str3, int i2) throws IOException {
        StringWriter stringWriter = new StringWriter((str.length() + str3.length()) * 3);
        lt ltVar = new lt(stringWriter, i, i2, str2);
        try {
            ltVar.v5().write(str);
            ltVar.Zo().write(str3);
            ltVar.DW();
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    private static void j6(StringBuffer stringBuffer, Writer writer) throws IOException {
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == '\n') {
            return;
        }
        writer.write(10);
    }

    private static void u7(Writer writer, int i) throws IOException {
        while (i > 0) {
            writer.write(32);
            i--;
        }
    }

    public void DW() {
        try {
            j6(this.FH, this.v5);
            j6(this.Hw, this.Zo);
            VH();
            FH();
            Hw();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Writer Zo() {
        return this.Zo;
    }

    public Writer v5() {
        return this.v5;
    }
}
