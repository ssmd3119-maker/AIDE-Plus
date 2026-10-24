package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@jg
/* loaded from: classes.dex */
public final class i5 {
    private final List<i6> j6 = new ArrayList();

    i5() {
    }

    final void DW(j6 j6Var) {
        Handler handler = bn.gn;
        Iterator<i6> it = this.j6.iterator();
        while (it.hasNext()) {
            handler.post(new h6(this, it.next(), j6Var));
        }
        this.j6.clear();
    }
}
