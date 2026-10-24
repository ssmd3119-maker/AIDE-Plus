package com.aide.codemodel.api.abstraction;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.io.InputStream;

@cy(clazz = 356450621187126592L, container = 356450621187126592L, user = true)
/* loaded from: classes.dex */
public abstract class DebuggerResourceProvider {

    @dy(field = -1553044775777438591L)
    private static DebuggerResourceProvider DW;

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -236272350937648905L)
    private static Object j6;

    static {
        try {
            iy.Zo(DebuggerResourceProvider.class);
            if (FH) {
                iy.gn(-2722941559058630525L, null);
            }
            j6 = new Object();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -2722941559058630525L, null);
            }
            throw th;
        }
    }

    @ey(method = 840486094343830971L)
    public DebuggerResourceProvider() {
        try {
            if (FH) {
                iy.gn(1637704114296172384L, null);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1637704114296172384L, null);
            }
            throw th;
        }
    }

    @ey(method = -3052809921313984416L)
    public static DebuggerResourceProvider getDefProvider() {
        DebuggerResourceProvider debuggerResourceProvider;
        try {
            if (FH) {
                iy.gn(2513231065445158872L, null);
            }
            synchronized (j6) {
                debuggerResourceProvider = DW;
            }
            return debuggerResourceProvider;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 2513231065445158872L, null);
            }
            throw th;
        }
    }

    @ey(method = 619626894495455435L)
    public static void setDefProvider(DebuggerResourceProvider debuggerResourceProvider) {
        try {
            if (FH) {
                iy.tp(-807780477067940745L, null, debuggerResourceProvider);
            }
            synchronized (j6) {
                DW = debuggerResourceProvider;
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -807780477067940745L, null, debuggerResourceProvider);
            }
            throw th;
        }
    }

    @ey(method = 3794181607787654655L)
    public abstract String getHostPackageName();

    @ey(method = 1586222221414330965L)
    public abstract InputStream getResourceInputStream(String str);
}
