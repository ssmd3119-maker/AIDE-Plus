package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class d0 {
    private final List<a0> DW = new LinkedList();
    private final Map<String, String> FH = new LinkedHashMap();
    private final Object Hw = new Object();
    private d0 Zo;
    private boolean j6;
    private String v5;

    public d0(boolean z, String str, String str2) {
        this.j6 = z;
        this.FH.put("action", str);
        this.FH.put("ad_format", str2);
    }

    public final boolean DW(a0 a0Var, String... strArr) {
        if (!this.j6 || a0Var == null) {
            return false;
        }
        return j6(a0Var, com.google.android.gms.ads.internal.w0.we().DW(), strArr);
    }

    public final a0 FH(long j) {
        if (this.j6) {
            return new a0(j, null, null);
        }
        return null;
    }

    public final void Hw(String str) {
        if (this.j6) {
            synchronized (this.Hw) {
                this.v5 = str;
            }
        }
    }

    public final a0 VH() {
        return FH(com.google.android.gms.ads.internal.w0.we().DW());
    }

    public final void Zo(String str, String str2) {
        s sVarJ0;
        if (!this.j6 || TextUtils.isEmpty(str2) || (sVarJ0 = com.google.android.gms.ads.internal.w0.u7().J0()) == null) {
            return;
        }
        synchronized (this.Hw) {
            w wVarV5 = sVarJ0.v5(str);
            Map<String, String> map = this.FH;
            map.put(str, wVarV5.j6(map.get(str), str2));
        }
    }

    public final String gn() {
        String string;
        StringBuilder sb = new StringBuilder();
        synchronized (this.Hw) {
            for (a0 a0Var : this.DW) {
                long jJ6 = a0Var.j6();
                String strDW = a0Var.DW();
                a0 a0VarFH = a0Var.FH();
                if (a0VarFH != null && jJ6 > 0) {
                    long jJ62 = jJ6 - a0VarFH.j6();
                    sb.append(strDW);
                    sb.append('.');
                    sb.append(jJ62);
                    sb.append(',');
                }
            }
            this.DW.clear();
            if (!TextUtils.isEmpty(this.v5)) {
                sb.append(this.v5);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            string = sb.toString();
        }
        return string;
    }

    public final boolean j6(a0 a0Var, long j, String... strArr) {
        synchronized (this.Hw) {
            for (String str : strArr) {
                this.DW.add(new a0(j, str, a0Var));
            }
        }
        return true;
    }

    public final a0 tp() {
        synchronized (this.Hw) {
        }
        return null;
    }

    final Map<String, String> u7() {
        synchronized (this.Hw) {
            s sVarJ0 = com.google.android.gms.ads.internal.w0.u7().J0();
            if (sVarJ0 != null && this.Zo != null) {
                return sVarJ0.j6(this.FH, this.Zo.u7());
            }
            return this.FH;
        }
    }

    public final void v5(d0 d0Var) {
        synchronized (this.Hw) {
            this.Zo = d0Var;
        }
    }
}
