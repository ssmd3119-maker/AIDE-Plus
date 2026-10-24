package abcd;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes.dex */
public class zc0 {
    boolean DW;
    String FH;
    ue0 Hw;
    a70 j6;

    public void j6(Writer writer) throws IOException {
        String strSubstring;
        String str;
        if (this.FH.startsWith("refs/heads/")) {
            strSubstring = this.FH.substring(11);
            str = "branch";
        } else if (this.FH.startsWith("refs/tags/")) {
            strSubstring = this.FH.substring(10);
            str = "tag";
        } else if (this.FH.startsWith("refs/remotes/")) {
            strSubstring = this.FH.substring(13);
            str = "remote branch";
        } else {
            strSubstring = this.FH;
            str = "";
        }
        writer.write(this.j6.BT());
        writer.write(9);
        if (this.DW) {
            writer.write("not-for-merge");
        }
        writer.write(9);
        writer.write(str);
        writer.write(" '");
        writer.write(strSubstring);
        writer.write("' of ");
        writer.write(this.Hw.toString());
        writer.write("\n");
    }
}
