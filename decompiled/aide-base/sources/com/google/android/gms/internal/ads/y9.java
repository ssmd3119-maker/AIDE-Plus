package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class y9 implements Runnable {
    private final /* synthetic */ w9 WB;
    private final /* synthetic */ x9 mb;

    y9(x9 x9Var, w9 w9Var) {
        this.mb = x9Var;
        this.WB = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.mb.u7) {
            if (this.mb.aM != -2) {
                return;
            }
            this.mb.XL = this.mb.U2();
            if (this.mb.XL == null) {
                this.mb.DW(4);
                return;
            }
            if (!this.mb.a8() || this.mb.J8(1)) {
                this.WB.CO(this.mb);
                this.mb.VH(this.WB);
                return;
            }
            String str = this.mb.j6;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
            sb.append("Ignoring adapter ");
            sb.append(str);
            sb.append(" as delayed impression is not supported");
            xp.u7(sb.toString());
            this.mb.DW(2);
        }
    }
}
