package abcd;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class tm extends rn {
    private final List<sm> Zo;

    public tm(km kmVar) {
        super(null, kmVar, 4);
        sm smVar = new sm();
        smVar.J0(0);
        this.Zo = Collections.singletonList(smVar);
    }

    @Override // abcd.jn
    public Collection<? extends wm> VH() {
        return this.Zo;
    }

    @Override // abcd.rn
    public void XL() {
    }
}
