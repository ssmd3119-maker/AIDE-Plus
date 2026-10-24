package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class ad0 extends xd0 {
    public ad0(nc0 nc0Var, String str, String str2, sz szVar, int i, int i2) {
        super(nc0Var, str, str2, szVar, i, 49);
    }

    @Override // com.google.android.gms.internal.ads.xd0
    protected final void j6() throws InvocationTargetException {
        this.Hw.g3 = 2;
        try {
            int i = 1;
            boolean zBooleanValue = ((Boolean) this.v5.invoke(null, this.j6.j6())).booleanValue();
            sz szVar = this.Hw;
            if (!zBooleanValue) {
                i = 0;
            }
            szVar.g3 = Integer.valueOf(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
