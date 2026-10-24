package abcd;

import java.util.Arrays;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class uc0 {
    private final String j6;

    public static class a extends uc0 {
        private char[] DW;

        public a(String str, boolean z) {
            super(str, z);
        }

        public void DW() {
            char[] cArr = this.DW;
            if (cArr != null) {
                Arrays.fill(cArr, (char) 0);
                this.DW = null;
            }
        }

        public char[] FH() {
            return this.DW;
        }

        public void Hw(char[] cArr) {
            DW();
            if (cArr != null) {
                char[] cArr2 = new char[cArr.length];
                this.DW = cArr2;
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
            }
        }
    }

    public static class b extends uc0 {
        public b(String str) {
            super(str, false);
        }
    }

    public static class c extends a {
        public c() {
            super(JGitText.DW().credentialPassword, true);
        }

        public c(String str) {
            super(str, true);
        }
    }

    public static class d extends uc0 {
        private String DW;

        public d(String str, boolean z) {
            super(str, z);
        }

        public String DW() {
            return this.DW;
        }

        public void FH(String str) {
            this.DW = str;
        }
    }

    public static class e extends d {
        public e() {
            super(JGitText.DW().credentialUsername, false);
        }
    }

    public static class f extends uc0 {
        private boolean DW;

        public f(String str) {
            super(str, false);
        }

        public boolean DW() {
            return this.DW;
        }

        public void FH(boolean z) {
            this.DW = z;
        }
    }

    public uc0(String str, boolean z) {
        this.j6 = str;
    }

    public String j6() {
        return this.j6;
    }
}
