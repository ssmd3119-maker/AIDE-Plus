package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ha0 extends ja0 implements tq {
    private String AL;
    private boolean w9;

    public ha0(String str) {
        this.AL = str;
    }

    @Override // com.google.android.gms.internal.ads.tq
    public final void DW(ma0 ma0Var, ByteBuffer byteBuffer, long j, un unVar) {
        ma0Var.position();
        byteBuffer.remaining();
        this.w9 = byteBuffer.remaining() == 16;
        Hw(ma0Var, j, unVar);
    }

    @Override // com.google.android.gms.internal.ads.tq
    public final void FH(ur urVar) {
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void Hw(ma0 ma0Var, long j, un unVar) {
        this.mb = ma0Var;
        this.fY = ma0Var.position();
        if (!this.w9) {
            int i = ((8 + j) > 4294967296L ? 1 : ((8 + j) == 4294967296L ? 0 : -1));
        }
        ma0Var.VH(ma0Var.position() + j);
        this.qp = ma0Var.position();
        this.WB = unVar;
    }

    @Override // com.google.android.gms.internal.ads.tq
    public final String j6() {
        return this.AL;
    }
}
