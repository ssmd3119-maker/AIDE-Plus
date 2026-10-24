package abcd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes.dex */
public class p60 {
    private i70 FH;
    private i70 Hw;
    private a70 j6;
    private String v5;
    private static final a70[] VH = new a70[0];
    private static final byte[] gn = r60.Hw("tree");
    private static final byte[] u7 = r60.Hw("parent");
    private static final byte[] tp = r60.Hw("author");
    private static final byte[] EQ = r60.Hw("committer");
    private static final byte[] we = r60.Hw("encoding");
    private a70[] DW = VH;
    private Charset Zo = r60.Zo;

    public i70 DW() {
        return this.FH;
    }

    public void EQ(List<? extends j60> list) {
        this.DW = new a70[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.DW[i] = list.get(i).Zo();
        }
    }

    public i70 FH() {
        return this.Hw;
    }

    public Charset Hw() {
        return this.Zo;
    }

    public a70 VH() {
        return this.j6;
    }

    public a70[] Zo() {
        return this.DW;
    }

    public void gn(i70 i70Var) {
        this.FH = i70Var;
    }

    public byte[] j6() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, Hw());
        try {
            byteArrayOutputStream.write(gn);
            byteArrayOutputStream.write(32);
            VH().we(byteArrayOutputStream);
            byteArrayOutputStream.write(10);
            for (a70 a70Var : Zo()) {
                byteArrayOutputStream.write(u7);
                byteArrayOutputStream.write(32);
                a70Var.we(byteArrayOutputStream);
                byteArrayOutputStream.write(10);
            }
            byteArrayOutputStream.write(tp);
            byteArrayOutputStream.write(32);
            outputStreamWriter.write(DW().v5());
            outputStreamWriter.flush();
            byteArrayOutputStream.write(10);
            byteArrayOutputStream.write(EQ);
            byteArrayOutputStream.write(32);
            outputStreamWriter.write(FH().v5());
            outputStreamWriter.flush();
            byteArrayOutputStream.write(10);
            if (Hw() != r60.Zo) {
                byteArrayOutputStream.write(we);
                byteArrayOutputStream.write(32);
                byteArrayOutputStream.write(r60.Hw(Hw().name()));
                byteArrayOutputStream.write(10);
            }
            byteArrayOutputStream.write(10);
            if (v5() != null) {
                outputStreamWriter.write(v5());
                outputStreamWriter.flush();
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Commit");
        sb.append("={\n");
        sb.append("tree ");
        a70 a70Var = this.j6;
        sb.append(a70Var != null ? a70Var.BT() : "NOT_SET");
        sb.append("\n");
        for (a70 a70Var2 : this.DW) {
            sb.append("parent ");
            sb.append(a70Var2.BT());
            sb.append("\n");
        }
        sb.append("author ");
        i70 i70Var = this.FH;
        sb.append(i70Var != null ? i70Var.toString() : "NOT_SET");
        sb.append("\n");
        sb.append("committer ");
        i70 i70Var2 = this.Hw;
        sb.append(i70Var2 != null ? i70Var2.toString() : "NOT_SET");
        sb.append("\n");
        Charset charset = this.Zo;
        if (charset != null && charset != r60.Zo) {
            sb.append("encoding ");
            sb.append(this.Zo.name());
            sb.append("\n");
        }
        sb.append("\n");
        String str = this.v5;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public void tp(String str) {
        this.v5 = str;
    }

    public void u7(i70 i70Var) {
        this.Hw = i70Var;
    }

    public String v5() {
        return this.v5;
    }

    public void we(j60 j60Var) {
        this.j6 = j60Var.Zo();
    }
}
