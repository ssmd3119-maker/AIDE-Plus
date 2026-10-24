package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class ng0 implements mf0 {
    private long EQ;
    private mg0 Hw;
    private ByteBuffer VH;
    private ShortBuffer gn;
    private long tp;
    private ByteBuffer u7;
    private boolean we;
    private float v5 = 1.0f;
    private float Zo = 1.0f;
    private int DW = -1;
    private int FH = -1;

    public ng0() {
        ByteBuffer byteBuffer = mf0.j6;
        this.VH = byteBuffer;
        this.gn = byteBuffer.asShortBuffer();
        this.u7 = mf0.j6;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final void DW() {
        this.Hw = null;
        ByteBuffer byteBuffer = mf0.j6;
        this.VH = byteBuffer;
        this.gn = byteBuffer.asShortBuffer();
        this.u7 = mf0.j6;
        this.DW = -1;
        this.FH = -1;
        this.tp = 0L;
        this.EQ = 0L;
        this.we = false;
    }

    public final long EQ() {
        return this.tp;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final int FH() {
        return this.DW;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final ByteBuffer Hw() {
        ByteBuffer byteBuffer = this.u7;
        this.u7 = mf0.j6;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final int VH() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final boolean Zo() {
        return Math.abs(this.v5 - 1.0f) >= 0.01f || Math.abs(this.Zo - 1.0f) >= 0.01f;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final void flush() {
        mg0 mg0Var = new mg0(this.FH, this.DW);
        this.Hw = mg0Var;
        mg0Var.j6(this.v5);
        this.Hw.FH(this.Zo);
        this.u7 = mf0.j6;
        this.tp = 0L;
        this.EQ = 0L;
        this.we = false;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final void gn() {
        this.Hw.u7();
        this.we = true;
    }

    public final float j6(float f) {
        float fDW = ip0.DW(f, 0.1f, 8.0f);
        this.v5 = fDW;
        return fDW;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final boolean ro() {
        if (!this.we) {
            return false;
        }
        mg0 mg0Var = this.Hw;
        return mg0Var == null || mg0Var.tp() == 0;
    }

    public final float tp(float f) {
        this.Zo = ip0.DW(f, 0.1f, 8.0f);
        return f;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final void u7(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.tp += iRemaining;
            this.Hw.v5(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int iTp = (this.Hw.tp() * this.DW) << 1;
        if (iTp > 0) {
            if (this.VH.capacity() < iTp) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iTp).order(ByteOrder.nativeOrder());
                this.VH = byteBufferOrder;
                this.gn = byteBufferOrder.asShortBuffer();
            } else {
                this.VH.clear();
                this.gn.clear();
            }
            this.Hw.VH(this.gn);
            this.EQ += iTp;
            this.VH.limit(iTp);
            this.u7 = this.VH;
        }
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final boolean v5(int i, int i2, int i3) throws nf0 {
        if (i3 != 2) {
            throw new nf0(i, i2, i3);
        }
        if (this.FH == i && this.DW == i2) {
            return false;
        }
        this.FH = i;
        this.DW = i2;
        return true;
    }

    public final long we() {
        return this.EQ;
    }
}
