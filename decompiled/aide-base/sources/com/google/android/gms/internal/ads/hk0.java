package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class hk0 {
    private final gh0 DW;
    private dh0 FH;
    private final dh0[] j6;

    public hk0(dh0[] dh0VarArr, gh0 gh0Var) {
        this.j6 = dh0VarArr;
        this.DW = gh0Var;
    }

    public final dh0 DW(fh0 fh0Var, Uri uri) throws bl0 {
        dh0 dh0Var = this.FH;
        if (dh0Var != null) {
            return dh0Var;
        }
        dh0[] dh0VarArr = this.j6;
        int length = dh0VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            dh0 dh0Var2 = dh0VarArr[i];
            try {
            } catch (EOFException unused) {
            } finally {
                fh0Var.Hw();
            }
            if (dh0Var2.VH(fh0Var)) {
                this.FH = dh0Var2;
                break;
            }
            i++;
        }
        dh0 dh0Var3 = this.FH;
        if (dh0Var3 != null) {
            dh0Var3.FH(this.DW);
            return this.FH;
        }
        String strZo = ip0.Zo(this.j6);
        StringBuilder sb = new StringBuilder(String.valueOf(strZo).length() + 58);
        sb.append("None of the available extractors (");
        sb.append(strZo);
        sb.append(") could read the stream.");
        throw new bl0(sb.toString(), uri);
    }

    public final void j6() {
        dh0 dh0Var = this.FH;
        if (dh0Var != null) {
            dh0Var.j6();
            this.FH = null;
        }
    }
}
