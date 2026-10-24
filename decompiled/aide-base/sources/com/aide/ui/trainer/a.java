package com.aide.ui.trainer;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;

@cy(clazz = 167497278690984073L, container = 167497278690984073L, user = true)
/* loaded from: classes.dex */
public class a {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(a.class);
    }

    @ey(method = -2460454474644502785L)
    public a() {
        try {
            if (j6) {
                iy.gn(73141753243537695L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 73141753243537695L, null);
            }
            throw th;
        }
    }

    @ey(method = -2881496348634630672L)
    public static void j6(Activity activity, Runnable runnable) {
        try {
            if (j6) {
                iy.EQ(-6477100018112226784L, null, activity, runnable);
            }
            runnable.run();
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -6477100018112226784L, null, activity, runnable);
            }
            throw th;
        }
    }
}
