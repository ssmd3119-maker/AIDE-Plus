package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class xd0 implements Callable {
    private final String DW;
    private final String FH;
    protected final sz Hw;
    private final int VH;
    private final int Zo;
    protected final nc0 j6;
    protected Method v5;

    public xd0(nc0 nc0Var, String str, String str2, sz szVar, int i, int i2) {
        getClass().getSimpleName();
        this.j6 = nc0Var;
        this.DW = str;
        this.FH = str2;
        this.Hw = szVar;
        this.Zo = i;
        this.VH = i2;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: DW, reason: merged with bridge method [inline-methods] */
    public Void call() {
        long jNanoTime;
        Method methodV5;
        try {
            jNanoTime = System.nanoTime();
            methodV5 = this.j6.v5(this.DW, this.FH);
            this.v5 = methodV5;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (methodV5 == null) {
            return null;
        }
        j6();
        pb0 pb0VarXL = this.j6.XL();
        if (pb0VarXL != null && this.Zo != Integer.MIN_VALUE) {
            pb0VarXL.DW(this.VH, this.Zo, (System.nanoTime() - jNanoTime) / 1000);
        }
        return null;
    }

    protected abstract void j6();
}
