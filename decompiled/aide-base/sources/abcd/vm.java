package abcd;

/* loaded from: classes.dex */
public abstract class vm extends wm {
    private int WB = -1;

    public final void J0(int i) {
        if (this.WB != -1) {
            throw new RuntimeException("index already set");
        }
        this.WB = i;
    }

    public final boolean tp() {
        return this.WB >= 0;
    }

    public final int u7() {
        int i = this.WB;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("index not yet set");
    }

    public final String we() {
        return '[' + Integer.toHexString(this.WB) + ']';
    }
}
