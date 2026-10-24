package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@jg
/* loaded from: classes.dex */
public final class eu implements Iterable<cu> {
    private final List<cu> WB = new ArrayList();

    static cu VH(ss ssVar) {
        Iterator<cu> it = com.google.android.gms.ads.internal.w0.vy().iterator();
        while (it.hasNext()) {
            cu next = it.next();
            if (next.fY == ssVar) {
                return next;
            }
        }
        return null;
    }

    public static boolean v5(ss ssVar) {
        cu cuVarVH = VH(ssVar);
        if (cuVarVH == null) {
            return false;
        }
        cuVarVH.qp.gn();
        return true;
    }

    public final int DW() {
        return this.WB.size();
    }

    public final void Hw(cu cuVar) {
        this.WB.remove(cuVar);
    }

    @Override // java.lang.Iterable
    public final Iterator<cu> iterator() {
        return this.WB.iterator();
    }

    public final void j6(cu cuVar) {
        this.WB.add(cuVar);
    }
}
