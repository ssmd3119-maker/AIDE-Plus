package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class hi0 extends ai0 implements mh0, dk0 {
    int WB;
    mh0 fY;
    boolean jw;
    boolean mb = false;

    public hi0(boolean z, int i, mh0 mh0Var) {
        this.jw = true;
        this.fY = null;
        if (mh0Var instanceof lh0) {
            this.jw = true;
        } else {
            this.jw = z;
        }
        this.WB = i;
        if (this.jw) {
            this.fY = mh0Var;
        } else {
            boolean z2 = mh0Var.DW() instanceof di0;
            this.fY = mh0Var;
        }
    }

    public static hi0 J8(Object obj) {
        if (obj == null || (obj instanceof hi0)) {
            return (hi0) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        try {
            return J8(ai0.tp((byte[]) obj));
        } catch (IOException e) {
            throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e.getMessage());
        }
    }

    @Override // abcd.dk0
    public ai0 Hw() {
        DW();
        return this;
    }

    @Override // abcd.ai0
    public ai0 J0() {
        return new bk0(this.jw, this.WB, this.fY);
    }

    public int QX() {
        return this.WB;
    }

    @Override // abcd.ai0
    public boolean VH(ai0 ai0Var) {
        if (!(ai0Var instanceof hi0)) {
            return false;
        }
        hi0 hi0Var = (hi0) ai0Var;
        if (this.WB != hi0Var.WB || this.mb != hi0Var.mb || this.jw != hi0Var.jw) {
            return false;
        }
        mh0 mh0Var = this.fY;
        return mh0Var == null ? hi0Var.fY == null : mh0Var.DW().equals(hi0Var.fY.DW());
    }

    public ai0 Ws() {
        mh0 mh0Var = this.fY;
        if (mh0Var != null) {
            return mh0Var.DW();
        }
        return null;
    }

    public boolean XL() {
        return this.mb;
    }

    public boolean aM() {
        return this.jw;
    }

    @Override // abcd.uh0
    public int hashCode() {
        int i = this.WB;
        mh0 mh0Var = this.fY;
        return mh0Var != null ? i ^ mh0Var.hashCode() : i;
    }

    public String toString() {
        return "[" + this.WB + "]" + this.fY;
    }

    @Override // abcd.ai0
    public ai0 we() {
        return new tj0(this.jw, this.WB, this.fY);
    }
}
