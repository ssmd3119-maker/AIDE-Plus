package abcd;

import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class w60 extends j60 {
    private void dx(byte[] bArr, int i) {
        try {
            this.WB = kg0.lg(bArr, i);
            this.mb = kg0.lg(bArr, i + 8);
            this.jw = kg0.lg(bArr, i + 16);
            this.fY = kg0.lg(bArr, i + 24);
            this.qp = kg0.lg(bArr, i + 32);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new l40(bArr, i, 40);
        }
    }

    public void Sf(byte[] bArr, int i) {
        dx(bArr, i);
    }

    public void cb() {
        this.WB = 0;
        this.mb = 0;
        this.jw = 0;
        this.fY = 0;
        this.qp = 0;
    }

    @Override // abcd.j60
    public a70 cn() {
        return new a70(this);
    }

    public void ef(String str) {
        if (str.length() != 40) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().invalidId, str));
        }
        dx(r60.Hw(str), 0);
    }

    public void sG(byte[] bArr, int i) {
        this.WB = ig0.DW(bArr, i);
        this.mb = ig0.DW(bArr, i + 4);
        this.jw = ig0.DW(bArr, i + 8);
        this.fY = ig0.DW(bArr, i + 12);
        this.qp = ig0.DW(bArr, i + 16);
    }
}
