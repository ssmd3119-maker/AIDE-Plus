package com.aide.licensing;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.j8;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

@cy(clazz = 2241005384696799177L, container = 2241005384696799177L, user = true)
/* loaded from: classes.dex */
public class LicenseUpdateBootReceiver extends BroadcastReceiver {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(LicenseUpdateBootReceiver.class);
    }

    @ey(method = 863303912451594648L)
    public LicenseUpdateBootReceiver() {
        try {
            if (j6) {
                iy.gn(-277367152744084903L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -277367152744084903L, null);
            }
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    @ey(method = 2746504164480841251L)
    public void onReceive(Context context, Intent intent) {
        try {
            if (j6) {
                iy.EQ(104360854923926505L, this, context, intent);
            }
            j8.j6("Boot broadcast received.");
            LicenseUpdateAlarmReceiver.FH(context);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 104360854923926505L, this, context, intent);
            }
            throw th;
        }
    }
}
