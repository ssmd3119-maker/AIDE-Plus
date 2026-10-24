package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
public final class c implements DynamiteModule.b {
    c() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0114b j6(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0114b c0114b = new DynamiteModule.b.C0114b();
        int iJ6 = aVar.j6(context, str);
        c0114b.j6 = iJ6;
        if (iJ6 != 0) {
            c0114b.DW = aVar.DW(context, str, false);
        } else {
            c0114b.DW = aVar.DW(context, str, true);
        }
        if (c0114b.j6 == 0 && c0114b.DW == 0) {
            c0114b.FH = 0;
        } else if (c0114b.j6 >= c0114b.DW) {
            c0114b.FH = -1;
        } else {
            c0114b.FH = 1;
        }
        return c0114b;
    }
}
