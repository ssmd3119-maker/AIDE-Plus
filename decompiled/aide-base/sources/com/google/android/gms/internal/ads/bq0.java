package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.e4;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class bq0<T> implements Comparable<bq0<T>> {
    private tu0 AL;
    private final e4.a WB;
    private ds0 Z1;
    private c0 cT;
    private final int fY;
    private boolean hK;
    private final String jw;
    private jx0 k2;
    private final int mb;
    private ab0 q7;
    private final Object qp;
    private boolean w9;
    private Integer zh;

    public bq0(int i, String str, jx0 jx0Var) {
        Uri uri;
        String host;
        this.WB = e4.a.FH ? new e4.a() : null;
        this.qp = new Object();
        this.w9 = true;
        int iHashCode = 0;
        this.hK = false;
        this.q7 = null;
        this.mb = i;
        this.jw = str;
        this.k2 = jx0Var;
        this.cT = new eg0();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.fY = iHashCode;
    }

    public final ab0 BT() {
        return this.q7;
    }

    public final int DW() {
        return this.mb;
    }

    public final String FH() {
        return this.jw;
    }

    final void J0(ds0 ds0Var) {
        synchronized (this.qp) {
            this.Z1 = ds0Var;
        }
    }

    public final boolean KD() {
        return this.w9;
    }

    public final void Mr(String str) {
        if (e4.a.FH) {
            this.WB.j6(str, Thread.currentThread().getId());
        }
    }

    final void QX(iw0<?> iw0Var) {
        ds0 ds0Var;
        synchronized (this.qp) {
            ds0Var = this.Z1;
        }
        if (ds0Var != null) {
            ds0Var.DW(this, iw0Var);
        }
    }

    final void U2(String str) {
        tu0 tu0Var = this.AL;
        if (tu0Var != null) {
            tu0Var.FH(this);
        }
        if (e4.a.FH) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new cr0(this, str, id));
            } else {
                this.WB.j6(str, id);
                this.WB.DW(toString());
            }
        }
    }

    protected abstract void XL(T t);

    /* JADX WARN: Multi-variable type inference failed */
    public final bq0<?> Zo(int i) {
        this.zh = Integer.valueOf(i);
        return this;
    }

    public final void aM(e3 e3Var) {
        jx0 jx0Var;
        synchronized (this.qp) {
            jx0Var = this.k2;
        }
        if (jx0Var != null) {
            jx0Var.j6(e3Var);
        }
    }

    public final boolean cb() {
        boolean z;
        synchronized (this.qp) {
            z = this.hK;
        }
        return z;
    }

    public final c0 cn() {
        return this.cT;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        ct0 ct0Var = ct0.NORMAL;
        return this.zh.intValue() - ((bq0) obj).zh.intValue();
    }

    final void dx() {
        ds0 ds0Var;
        synchronized (this.qp) {
            ds0Var = this.Z1;
        }
        if (ds0Var != null) {
            ds0Var.j6(this);
        }
    }

    public Map<String, String> j6() {
        return Collections.emptyMap();
    }

    public final int rN() {
        return this.fY;
    }

    public final int ro() {
        return this.cT.J8();
    }

    public final void sh() {
        synchronized (this.qp) {
            this.hK = true;
        }
    }

    public String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.fY));
        String strConcat = strValueOf.length() != 0 ? "0x".concat(strValueOf) : new String("0x");
        v5();
        String str = this.jw;
        String strValueOf2 = String.valueOf(ct0.NORMAL);
        String strValueOf3 = String.valueOf(this.zh);
        StringBuilder sb = new StringBuilder("[ ] ".length() + 3 + String.valueOf(str).length() + String.valueOf(strConcat).length() + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(strConcat);
        sb.append(" ");
        sb.append(strValueOf2);
        sb.append(" ");
        sb.append(strValueOf3);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bq0<?> tp(tu0 tu0Var) {
        this.AL = tu0Var;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bq0<?> u7(ab0 ab0Var) {
        this.q7 = ab0Var;
        return this;
    }

    public final boolean v5() {
        synchronized (this.qp) {
        }
        return false;
    }

    public byte[] vy() {
        return null;
    }

    protected abstract iw0<T> we(co0 co0Var);

    public final String yS() {
        String str = this.jw;
        int i = this.mb;
        if (i == 0 || i == -1) {
            return str;
        }
        String string = Integer.toString(i);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
        sb.append(string);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }
}
