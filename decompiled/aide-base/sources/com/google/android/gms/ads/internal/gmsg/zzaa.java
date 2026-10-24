package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import com.google.android.gms.ads.internal.w0;
import com.google.android.gms.internal.ads.jg;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@jg
/* loaded from: classes.dex */
public final class zzaa implements b0<Object> {
    private final Context j6;

    public zzaa(Context context) {
        this.j6 = context;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final void zza(Object obj, Map<String, String> map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (w0.ei().U2(this.j6)) {
            w0.ei().DW(this.j6, map.get("eventName"), map.get("eventId"));
        }
    }
}
