package com.aide.ui;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

@cy(clazz = -2569420533032304756L, container = -2569420533032304756L, user = true)
/* loaded from: classes.dex */
public class PackageUpgradedBroadcastReceiver extends BroadcastReceiver {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = 492666457109862000L)
    private static UserPresent j6;

    static {
        iy.Zo(PackageUpgradedBroadcastReceiver.class);
    }

    @ey(method = 3061146682245158379L)
    public PackageUpgradedBroadcastReceiver() {
        try {
            if (DW) {
                iy.gn(-4292635513943861888L, null);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -4292635513943861888L, null);
            }
            throw th;
        }
    }

    @ey(method = 3226306656438379087L)
    public static void j6(UserPresent userPresent) {
        try {
            if (DW) {
                iy.tp(3240913113762591704L, null, userPresent);
            }
            j6 = userPresent;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 3240913113762591704L, null, userPresent);
            }
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    @ey(method = -2179343566466562880L)
    public void onReceive(Context context, Intent intent) {
        try {
            if (DW) {
                iy.EQ(-581107202848467105L, this, context, intent);
            }
            if (j6 != null) {
                UserPresentBroadcastReceiver.DW(context, j6);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, -581107202848467105L, this, context, intent);
            }
            throw th;
        }
    }
}
