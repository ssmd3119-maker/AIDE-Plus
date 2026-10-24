package abcd;

/* loaded from: classes.dex */
public class xm0 {
    pk0 j6;

    static {
        an0 an0Var = an0.j6;
    }

    public xm0(um0 um0Var, pk0 pk0Var) throws tm0 {
        this.j6 = pk0Var;
        DW();
    }

    private rk0 DW() throws tm0 {
        try {
            return rk0.u7(this.j6.VH());
        } catch (ClassCastException e) {
            throw new tm0("Malformed content.", e);
        } catch (IllegalArgumentException e2) {
            throw new tm0("Malformed content.", e2);
        }
    }

    public pk0 j6() {
        return this.j6;
    }
}
