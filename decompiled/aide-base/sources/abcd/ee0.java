package abcd;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class ee0 extends o60 {
    private boolean VH = true;
    private final OutputStream Zo;

    public ee0(OutputStream outputStream) {
        this.Zo = outputStream;
    }

    private void EQ(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(": ");
        sb.append(i);
    }

    private void J0(StringBuilder sb) throws IOException {
        if (this.VH) {
            try {
                this.Zo.write(r60.DW(sb.toString()));
                this.Zo.flush();
            } catch (IOException unused) {
                this.VH = false;
            }
        }
    }

    private void we(StringBuilder sb, String str, int i, int i2, int i3) {
        sb.append(str);
        sb.append(": ");
        if (i3 < 100) {
            sb.append(' ');
        }
        if (i3 < 10) {
            sb.append(' ');
        }
        sb.append(i3);
        sb.append("% (");
        sb.append(i);
        sb.append("/");
        sb.append(i2);
        sb.append(")");
    }

    @Override // abcd.o60
    public void VH(String str, int i, int i2, int i3) throws IOException {
        StringBuilder sb = new StringBuilder();
        we(sb, str, i, i2, i3);
        sb.append("\n");
        J0(sb);
    }

    @Override // abcd.o60
    public void Zo(String str, int i) throws IOException {
        StringBuilder sb = new StringBuilder();
        EQ(sb, str, i);
        sb.append(", done\n");
        J0(sb);
    }

    @Override // abcd.o60
    public void gn(String str, int i) throws IOException {
        StringBuilder sb = new StringBuilder();
        EQ(sb, str, i);
        sb.append("   \r");
        J0(sb);
    }

    @Override // abcd.o60
    public void u7(String str, int i, int i2, int i3) throws IOException {
        StringBuilder sb = new StringBuilder();
        we(sb, str, i, i2, i3);
        sb.append("   \r");
        J0(sb);
    }
}
