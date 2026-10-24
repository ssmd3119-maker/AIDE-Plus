package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class ga0 implements tq {
    private static sa0 AL = sa0.DW(ga0.class);
    private String WB;
    private ByteBuffer fY;
    private long qp;
    private ma0 zh;
    private long k2 = -1;
    private boolean jw = true;
    boolean mb = true;

    protected ga0(String str) {
        this.WB = str;
    }

    private final synchronized void Hw() {
        if (!this.jw) {
            try {
                sa0 sa0Var = AL;
                String strValueOf = String.valueOf(this.WB);
                sa0Var.j6(strValueOf.length() != 0 ? "mem mapping ".concat(strValueOf) : new String("mem mapping "));
                this.fY = this.zh.v5(this.qp, this.k2);
                this.jw = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tq
    public final void DW(ma0 ma0Var, ByteBuffer byteBuffer, long j, un unVar) {
        this.qp = ma0Var.position();
        byteBuffer.remaining();
        this.k2 = j;
        this.zh = ma0Var;
        ma0Var.VH(ma0Var.position() + j);
        this.jw = false;
        this.mb = false;
        v5();
    }

    @Override // com.google.android.gms.internal.ads.tq
    public final void FH(ur urVar) {
    }

    protected abstract void Zo(ByteBuffer byteBuffer);

    @Override // com.google.android.gms.internal.ads.tq
    public final String j6() {
        return this.WB;
    }

    public final synchronized void v5() {
        Hw();
        sa0 sa0Var = AL;
        String strValueOf = String.valueOf(this.WB);
        sa0Var.j6(strValueOf.length() != 0 ? "parsing details of ".concat(strValueOf) : new String("parsing details of "));
        if (this.fY != null) {
            ByteBuffer byteBuffer = this.fY;
            this.mb = true;
            byteBuffer.rewind();
            Zo(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.fY = null;
        }
    }
}
