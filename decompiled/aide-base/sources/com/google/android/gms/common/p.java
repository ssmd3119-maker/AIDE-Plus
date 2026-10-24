package com.google.android.gms.common;

import abcd.wu;
import abcd.xu;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.common.internal.j0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class p extends j0 {
    private int WB;

    protected p(byte[] bArr) {
        com.google.android.gms.common.internal.p.j6(bArr.length == 25);
        this.WB = Arrays.hashCode(bArr);
    }

    protected static byte[] sy(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.android.gms.common.internal.i0
    public final int J8() {
        return hashCode();
    }

    @Override // com.google.android.gms.common.internal.i0
    public final wu Ob() {
        return xu.sy(g3());
    }

    public boolean equals(Object obj) {
        wu wuVarOb;
        if (obj != null && (obj instanceof i0)) {
            try {
                i0 i0Var = (i0) obj;
                if (i0Var.J8() == hashCode() && (wuVarOb = i0Var.Ob()) != null) {
                    return Arrays.equals(g3(), (byte[]) xu.g3(wuVarOb));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    abstract byte[] g3();

    public int hashCode() {
        return this.WB;
    }
}
