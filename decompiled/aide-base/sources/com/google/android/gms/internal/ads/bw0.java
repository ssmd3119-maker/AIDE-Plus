package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import javax.annotation.Nonnull;

/* loaded from: classes.dex */
public abstract class bw0<T> {
    private static final fx0 j6 = v5();

    bw0() {
    }

    private final T VH() {
        try {
            return Hw();
        } catch (RemoteException e) {
            xp.v5("Cannot invoke remote loader.", e);
            return null;
        }
    }

    private final T Zo() {
        fx0 fx0Var = j6;
        if (fx0Var == null) {
            xp.u7("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return j6(fx0Var);
        } catch (RemoteException e) {
            xp.v5("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private static fx0 v5() throws IllegalAccessException, InstantiationException {
        try {
            Object objNewInstance = uv0.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (objNewInstance instanceof IBinder) {
                return gx0.asInterface((IBinder) objNewInstance);
            }
            xp.u7("ClientApi class is not an instance of IBinder.");
            return null;
        } catch (Exception unused) {
            xp.u7("Failed to instantiate ClientApi class.");
            return null;
        }
    }

    public final T DW(Context context, boolean z) {
        T tZo;
        if (!z) {
            cw0.j6();
            if (!mp.a8(context, 12451000)) {
                xp.VH("Google Play Services is not available.");
                z = true;
            }
        }
        if (DynamiteModule.j6(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.FH(context, ModuleDescriptor.MODULE_ID)) {
            z = true;
        }
        p.j6(context);
        if (((Boolean) cw0.v5().FH(p.HE)).booleanValue()) {
            z = false;
        }
        if (z) {
            tZo = Zo();
            if (tZo == null) {
                tZo = VH();
            }
        } else {
            T tVH = VH();
            int i = tVH == null ? 1 : 0;
            if (i != 0) {
                if (cw0.gn().nextInt(((Integer) cw0.v5().FH(p.K3)).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", i);
                    cw0.j6().Hw(context, cw0.VH().WB, "gmob-apps", bundle, true);
                }
            }
            tZo = tVH == null ? Zo() : tVH;
        }
        return tZo == null ? FH() : tZo;
    }

    @Nonnull
    protected abstract T FH();

    protected abstract T Hw();

    protected abstract T j6(fx0 fx0Var);
}
