package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean FH(String str) {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        Iterator<FastJsonResponse.Field<?, ?>> it = j6().values().iterator();
        if (!it.hasNext()) {
            return true;
        }
        DW(it.next());
        throw null;
    }

    public int hashCode() {
        Iterator<FastJsonResponse.Field<?, ?>> it = j6().values().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        DW(it.next());
        throw null;
    }
}
