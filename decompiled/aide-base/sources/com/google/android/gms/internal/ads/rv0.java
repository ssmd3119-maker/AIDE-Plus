package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@jg
/* loaded from: classes.dex */
public final class rv0 {
    public static final rv0 j6 = new rv0();

    protected rv0() {
    }

    public static zzwb j6(Context context, fy0 fy0Var) {
        Context context2;
        List listUnmodifiableList;
        String strFH;
        Date dateJ6 = fy0Var.j6();
        long time = dateJ6 != null ? dateJ6.getTime() : -1L;
        String strDW = fy0Var.DW();
        int iHw = fy0Var.Hw();
        Set<String> setV5 = fy0Var.v5();
        if (setV5.isEmpty()) {
            context2 = context;
            listUnmodifiableList = null;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(setV5));
            context2 = context;
        }
        boolean zEQ = fy0Var.EQ(context2);
        int iQX = fy0Var.QX();
        Location locationZo = fy0Var.Zo();
        Bundle bundleGn = fy0Var.gn(AdMobAdapter.class);
        boolean zVH = fy0Var.VH();
        String strU7 = fy0Var.u7();
        com.google.android.gms.ads.search.a aVarJ0 = fy0Var.J0();
        if (aVarJ0 != null) {
            new zzzs(aVarJ0);
            throw null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            cw0.j6();
            strFH = mp.FH(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strFH = null;
        }
        return new zzwb(8, time, bundleGn, iHw, listUnmodifiableList, zEQ, iQX, zVH, strU7, null, locationZo, strDW, fy0Var.Ws(), fy0Var.FH(), Collections.unmodifiableList(new ArrayList(fy0Var.XL())), fy0Var.we(), strFH, fy0Var.tp(), null, fy0Var.aM(), fy0Var.j3());
    }
}
