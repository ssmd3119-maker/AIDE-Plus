package abcd;

import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class n40 extends RuntimeException {
    private a70 WB;

    public static class a extends n40 {
        @Override // abcd.n40, java.lang.Throwable
        public String getMessage() {
            return MessageFormat.format(JGitText.DW().largeObjectExceedsByteArray, DW());
        }
    }

    public static class b extends n40 {
        private final long jw;
        private final long mb;

        public b(long j, long j2) {
            this.mb = j;
            this.jw = j2;
        }

        @Override // abcd.n40, java.lang.Throwable
        public String getMessage() {
            return MessageFormat.format(JGitText.DW().largeObjectExceedsLimit, DW(), Long.valueOf(this.mb), Long.valueOf(this.jw));
        }
    }

    public static class c extends n40 {
        public c(OutOfMemoryError outOfMemoryError) {
            initCause(outOfMemoryError);
        }

        @Override // abcd.n40, java.lang.Throwable
        public String getMessage() {
            return MessageFormat.format(JGitText.DW().largeObjectOutOfMemory, DW());
        }
    }

    public n40() {
    }

    public String DW() {
        return j6() != null ? j6().BT() : JGitText.DW().unknownObject;
    }

    public void FH(j60 j60Var) {
        if (this.WB == null) {
            this.WB = j60Var.Zo();
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return MessageFormat.format(JGitText.DW().largeObjectException, DW());
    }

    public a70 j6() {
        return this.WB;
    }

    public n40(j60 j60Var) {
        FH(j60Var);
    }
}
