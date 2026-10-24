package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class v30 extends WeakReference<Throwable> {
    private final int j6;

    public v30(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, null);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.j6 = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == v30.class) {
            if (this == obj) {
                return true;
            }
            v30 v30Var = (v30) obj;
            if (this.j6 == v30Var.j6 && get() == v30Var.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.j6;
    }
}
