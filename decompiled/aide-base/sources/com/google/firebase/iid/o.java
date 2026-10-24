package com.google.firebase.iid;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class o extends m<Bundle> {
    o(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // com.google.firebase.iid.m
    final boolean FH() {
        return false;
    }

    @Override // com.google.firebase.iid.m
    final void Hw(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        j6(bundle2);
    }
}
