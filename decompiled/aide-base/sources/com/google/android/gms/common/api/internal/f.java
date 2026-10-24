package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
public final class f<L> {
    private final String DW;
    private final L j6;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.j6 == fVar.j6 && this.DW.equals(fVar.DW);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.j6) * 31) + this.DW.hashCode();
    }
}
