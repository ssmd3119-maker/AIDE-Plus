package abcd;

import java.io.File;

/* loaded from: classes.dex */
public class ma0 {
    public static final ma0 Hw = new ma0(-1, -1);
    public static final ma0 v5 = new a(0, 0);
    private volatile long DW;
    private boolean FH;
    private final long j6;

    class a extends ma0 {
        public a(long j, long j2) {
            super(j, j2, null);
        }

        @Override // abcd.ma0
        public boolean FH(File file) {
            return file.exists();
        }
    }

    private ma0(long j, long j2) {
        this.DW = j;
        this.j6 = j2;
        this.FH = v5(j);
    }

    private boolean DW(long j) {
        if (this.j6 != j) {
            return true;
        }
        if (this.FH || v5(this.DW)) {
            return false;
        }
        this.DW = System.currentTimeMillis();
        return !v5(this.DW);
    }

    public static ma0 Zo(File file) {
        return new ma0(System.currentTimeMillis(), file.lastModified());
    }

    private boolean v5(long j) {
        return j - this.j6 > 2500;
    }

    public boolean FH(File file) {
        return DW(file.lastModified());
    }

    public long Hw() {
        return this.j6;
    }

    public void VH(ma0 ma0Var) {
        long j = ma0Var.DW;
        if (v5(j)) {
            this.FH = true;
        }
        this.DW = j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ma0) {
            return j6((ma0) obj);
        }
        return false;
    }

    public int hashCode() {
        return (int) this.j6;
    }

    public boolean j6(ma0 ma0Var) {
        return this.j6 == ma0Var.j6;
    }

    public /* synthetic */ ma0(long j, long j2, ma0 ma0Var) {
        this(j, j2);
    }
}
