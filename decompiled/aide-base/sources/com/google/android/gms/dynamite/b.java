package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
public final class b implements DynamiteModule.b {
    b() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0114b j6(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0114b c0114b = new DynamiteModule.b.C0114b();
        int iDW = aVar.DW(context, str, true);
        c0114b.DW = iDW;
        if (iDW != 0) {
            c0114b.FH = 1;
        } else {
            int iJ6 = aVar.j6(context, str);
            c0114b.j6 = iJ6;
            if (iJ6 != 0) {
                c0114b.FH = -1;
            }
        }
        return c0114b;
    }
}
