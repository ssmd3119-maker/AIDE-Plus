package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.o;

/* loaded from: classes.dex */
public final class b {
    public final Uri j6;

    public b(Uri uri) {
        this.j6 = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return o.j6(((b) obj).j6, this.j6);
    }

    public final int hashCode() {
        return o.DW(this.j6);
    }
}
