package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* loaded from: classes.dex */
public abstract class h {
    private static final Object WB = new Object();
    private static h mb;

    protected static final class a {
        private final String DW;
        private final ComponentName FH;
        private final int Hw;
        private final String j6;

        public a(String str, String str2, int i) {
            p.v5(str);
            this.j6 = str;
            p.v5(str2);
            this.DW = str2;
            this.FH = null;
            this.Hw = i;
        }

        public final String DW() {
            return this.DW;
        }

        public final Intent FH(Context context) {
            return this.j6 != null ? new Intent(this.j6).setPackage(this.DW) : new Intent().setComponent(this.FH);
        }

        public final int Hw() {
            return this.Hw;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return o.j6(this.j6, aVar.j6) && o.j6(this.DW, aVar.DW) && o.j6(this.FH, aVar.FH) && this.Hw == aVar.Hw;
        }

        public final int hashCode() {
            return o.DW(this.j6, this.DW, this.FH, Integer.valueOf(this.Hw));
        }

        public final ComponentName j6() {
            return this.FH;
        }

        public final String toString() {
            String str = this.j6;
            return str == null ? this.FH.flattenToString() : str;
        }
    }

    public static h j6(Context context) {
        synchronized (WB) {
            if (mb == null) {
                mb = new e0(context.getApplicationContext());
            }
        }
        return mb;
    }

    public final void DW(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        Hw(new a(str, str2, i), serviceConnection, str3);
    }

    protected abstract boolean FH(a aVar, ServiceConnection serviceConnection, String str);

    protected abstract void Hw(a aVar, ServiceConnection serviceConnection, String str);
}
