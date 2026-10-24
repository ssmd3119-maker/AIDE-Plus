package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pd0 extends xd0 {
    private final StackTraceElement[] gn;

    public pd0(nc0 nc0Var, String str, String str2, sz szVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(nc0Var, str, str2, szVar, i, 45);
        this.gn = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.xd0
    protected final void j6() {
        StackTraceElement[] stackTraceElementArr = this.gn;
        if (stackTraceElementArr != null) {
            lc0 lc0Var = new lc0((String) this.v5.invoke(null, stackTraceElementArr));
            synchronized (this.Hw) {
                this.Hw.sG = lc0Var.DW;
                if (lc0Var.FH.booleanValue()) {
                    this.Hw.sy = Integer.valueOf(lc0Var.Hw.booleanValue() ? 0 : 1);
                } else {
                    this.Hw.sy = 2;
                }
            }
        }
    }
}
