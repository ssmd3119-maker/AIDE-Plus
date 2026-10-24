package com.aide.ui.tools;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = 3508908880632874191L, container = 3508908880632874191L, user = true)
/* loaded from: classes.dex */
public abstract class ThreadFactory {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 1035069477755027961L)
    private static Object j6;

    @dy(field = 3743171931245145259L)
    private static ThreadFactory threadFactory;

    static {
        try {
            iy.Zo(ThreadFactory.class);
            if (FH) {
                iy.gn(1759397294414490576L, null);
            }
            j6 = new Object();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1759397294414490576L, null);
            }
            throw th;
        }
    }

    @ey(method = 2055780913070439L)
    public ThreadFactory() {
        try {
            if (FH) {
                iy.gn(4744417128173355776L, null);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 4744417128173355776L, null);
            }
            throw th;
        }
    }

    @ey(method = 3490156276044098416L)
    public static ThreadFactory getSingleton() {
        ThreadFactory threadFactory2;
        try {
            if (FH) {
                iy.gn(-3631764667306789755L, null);
            }
            synchronized (j6) {
                threadFactory2 = threadFactory;
            }
            return threadFactory2;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -3631764667306789755L, null);
            }
            throw th;
        }
    }

    @ey(method = -2084682374606754855L)
    public abstract Thread makeThread(ThreadGroup threadGroup, Runnable runnable, String str, long j);
}
