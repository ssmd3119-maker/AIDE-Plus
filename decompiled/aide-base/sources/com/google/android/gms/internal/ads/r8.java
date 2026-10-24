package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class r8 implements kr<j7> {
    final /* synthetic */ o8 j6;

    r8(o8 o8Var) {
        this.j6 = o8Var;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final /* synthetic */ void j6(j7 j7Var) {
        final j7 j7Var2 = j7Var;
        ar.j6.execute(new Runnable(this, j7Var2) { // from class: com.google.android.gms.internal.ads.s8
            private final r8 WB;
            private final j7 mb;

            {
                this.WB = this;
                this.mb = j7Var2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                r8 r8Var = this.WB;
                j7 j7Var3 = this.mb;
                r8Var.j6.Zo.j6(j7Var3);
                j7Var3.destroy();
            }
        });
    }
}
