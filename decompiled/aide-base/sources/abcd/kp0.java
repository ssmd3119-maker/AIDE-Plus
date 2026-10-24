package abcd;

import javax.crypto.spec.DHParameterSpec;

/* loaded from: classes.dex */
public class kp0 implements dp0 {
    private volatile DHParameterSpec DW;
    private ThreadLocal j6;

    static {
        new ep0(jp0.mb, "threadLocalEcImplicitlyCa");
        new ep0(jp0.mb, "ecImplicitlyCa");
        new ep0(jp0.mb, "threadLocalDhDefaultParams");
        new ep0(jp0.mb, "DhDefaultParams");
    }

    public kp0() {
        new ThreadLocal();
        this.j6 = new ThreadLocal();
    }

    @Override // abcd.dp0
    public DHParameterSpec j6() {
        DHParameterSpec dHParameterSpec = (DHParameterSpec) this.j6.get();
        return dHParameterSpec != null ? dHParameterSpec : this.DW;
    }
}
