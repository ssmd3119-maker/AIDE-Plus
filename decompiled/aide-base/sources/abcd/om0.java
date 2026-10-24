package abcd;

/* loaded from: classes.dex */
public class om0 {
    private ul0 j6;

    public om0(byte[] bArr) {
        this(j6(bArr));
    }

    private static ul0 j6(byte[] bArr) throws nm0 {
        try {
            return ul0.VH(ai0.tp(bArr));
        } catch (ClassCastException e) {
            throw new nm0("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new nm0("malformed data: " + e2.getMessage(), e2);
        }
    }

    public ul0 DW() {
        return this.j6;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof om0) {
            return this.j6.equals(((om0) obj).j6);
        }
        return false;
    }

    public int hashCode() {
        return this.j6.hashCode();
    }

    public om0(ul0 ul0Var) {
        this.j6 = ul0Var;
        ul0Var.tp().VH();
    }
}
