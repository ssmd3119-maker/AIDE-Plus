package abcd;

/* loaded from: classes.dex */
public class gt {
    private boolean WB;

    public gt() {
        this.WB = true;
    }

    public final boolean FH() {
        return this.WB;
    }

    public void Mr() {
        this.WB = false;
    }

    public final void a8() {
        if (!this.WB) {
            throw new ht("immutable instance");
        }
    }

    public final boolean aM() {
        return !this.WB;
    }

    public final void yS() {
        if (this.WB) {
            throw new ht("mutable instance");
        }
    }

    public gt(boolean z) {
        this.WB = z;
    }
}
