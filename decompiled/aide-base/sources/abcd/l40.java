package abcd;

import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class l40 extends IllegalArgumentException {
    public l40(byte[] bArr, int i, int i2) {
        super(MessageFormat.format(JGitText.DW().invalidId, j6(bArr, i, i2)));
    }

    private static String j6(byte[] bArr, int i, int i2) {
        try {
            return ": " + new String(bArr, i, i2, "US-ASCII");
        } catch (UnsupportedEncodingException | StringIndexOutOfBoundsException unused) {
            return "";
        }
    }
}
