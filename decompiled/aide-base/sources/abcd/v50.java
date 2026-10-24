package abcd;

import abcd.w50;

/* loaded from: classes.dex */
public abstract class v50<T extends w50> {
    private p70 j6;

    public abstract Class<T> DW();

    public void FH(p70 p70Var) {
        if (this.j6 == null) {
            this.j6 = p70Var;
        }
    }

    public abstract void j6(T t);

    public String toString() {
        String simpleName = getClass().getSimpleName();
        if (this.j6 == null) {
            return simpleName;
        }
        return String.valueOf(simpleName) + "[" + this.j6 + "]";
    }
}
