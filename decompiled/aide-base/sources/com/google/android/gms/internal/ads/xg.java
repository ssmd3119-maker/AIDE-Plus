package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@jg
/* loaded from: classes.dex */
public final class xg {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j6(Context context, boolean z) {
        if (!z) {
            return true;
        }
        int iFH = DynamiteModule.FH(context, ModuleDescriptor.MODULE_ID);
        return iFH != 0 && iFH <= DynamiteModule.j6(context, ModuleDescriptor.MODULE_ID);
    }
}
