package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class tk extends bq0<String> {
    private iy0<String> Q6;
    private final Object n5;

    public tk(int i, String str, iy0<String> iy0Var, jx0 jx0Var) {
        super(i, str, jx0Var);
        this.n5 = new Object();
        this.Q6 = iy0Var;
    }

    protected void sG(String str) {
        iy0<String> iy0Var;
        synchronized (this.n5) {
            iy0Var = this.Q6;
        }
        if (iy0Var != null) {
            iy0Var.j6(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.bq0
    protected final iw0<String> we(co0 co0Var) {
        String str;
        try {
            byte[] bArr = co0Var.DW;
            String str2 = "ISO-8859-1";
            String str3 = co0Var.FH.get("Content-Type");
            if (str3 != null) {
                String[] strArrSplit = str3.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str2 = strArrSplit2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(co0Var.DW);
        }
        return iw0.j6(str, wd.j6(co0Var));
    }
}
