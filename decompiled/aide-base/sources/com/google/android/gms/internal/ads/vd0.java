package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class vd0 {
    private final String DW;
    private final String FH;
    private volatile Method Hw = null;
    private CountDownLatch Zo = new CountDownLatch(1);
    private final nc0 j6;
    private final Class<?>[] v5;

    public vd0(nc0 nc0Var, String str, String str2, Class<?>... clsArr) {
        this.j6 = nc0Var;
        this.DW = str;
        this.FH = str2;
        this.v5 = clsArr;
        nc0Var.we().submit(new wd0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DW() {
        try {
            Class clsLoadClass = this.j6.J0().loadClass(Hw(this.j6.Ws(), this.DW));
            if (clsLoadClass == null) {
                return;
            }
            this.Hw = clsLoadClass.getMethod(Hw(this.j6.Ws(), this.FH), this.v5);
            if (this.Hw == null) {
            }
        } catch (yb0 unused) {
        } catch (UnsupportedEncodingException unused2) {
        } catch (ClassNotFoundException unused3) {
        } catch (NoSuchMethodException unused4) {
        } catch (NullPointerException unused5) {
        } finally {
            this.Zo.countDown();
        }
    }

    private final String Hw(byte[] bArr, String str) {
        return new String(this.j6.J8().DW(bArr, str), "UTF-8");
    }

    public final Method FH() {
        if (this.Hw != null) {
            return this.Hw;
        }
        try {
            if (this.Zo.await(2L, TimeUnit.SECONDS)) {
                return this.Hw;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
