package com.aide.engine.service;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;

@cy(clazz = 4807752471412478360L, container = 4807752471412478360L, user = true)
/* loaded from: classes.dex */
public class Native {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = 2802454280519386504L)
    public static Native j6;

    static {
        try {
            iy.Zo(Native.class);
            if (DW) {
                iy.gn(-758835236964895372L, null);
            }
            j6 = new Native();
            System.loadLibrary("AIDE");
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -758835236964895372L, null);
            }
            throw th;
        }
    }

    @ey(method = 1477554669525315120L)
    private Native() {
        try {
            if (DW) {
                iy.gn(571358925392402555L, null);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 571358925392402555L, null);
            }
            throw th;
        }
    }

    public native int a(int i, int i2);

    public native boolean b(int i, int i2);

    public native int c(int i);

    public native int d(int i);

    public native void init(Context context);

    public native boolean isX86();
}
