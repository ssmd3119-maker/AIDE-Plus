package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@jg
/* loaded from: classes.dex */
public final class yp {
    public static Context DW(Context context) {
        return FH(context).DW();
    }

    private static DynamiteModule FH(Context context) throws aq {
        try {
            return DynamiteModule.v5(context, DynamiteModule.u7, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new aq(e);
        }
    }

    public static <T> T j6(Context context, String str, zp<IBinder, T> zpVar) throws aq {
        try {
            return zpVar.j6(FH(context).Hw(str));
        } catch (Exception e) {
            throw new aq(e);
        }
    }
}
