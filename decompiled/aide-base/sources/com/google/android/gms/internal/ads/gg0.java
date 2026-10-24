package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class gg0 implements mf0 {
    private int DW;
    private int FH;
    private int[] Hw;
    private ByteBuffer VH;
    private int[] Zo;
    private ByteBuffer gn;
    private boolean u7;
    private boolean v5;

    public gg0() {
        ByteBuffer byteBuffer = mf0.j6;
        this.VH = byteBuffer;
        this.gn = byteBuffer;
        this.DW = -1;
        this.FH = -1;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final void DW() {
        flush();
        this.VH = mf0.j6;
        this.DW = -1;
        this.FH = -1;
        this.Zo = null;
        this.v5 = false;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final int FH() {
        int[] iArr = this.Zo;
        return iArr == null ? this.DW : iArr.length;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final ByteBuffer Hw() {
        ByteBuffer byteBuffer = this.gn;
        this.gn = mf0.j6;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final int VH() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final boolean Zo() {
        return this.v5;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final void flush() {
        this.gn = mf0.j6;
        this.u7 = false;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final void gn() {
        this.u7 = true;
    }

    public final void j6(int[] iArr) {
        this.Hw = iArr;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final boolean ro() {
        return this.u7 && this.gn == mf0.j6;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final void u7(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int length = (((iLimit - iPosition) / (this.DW * 2)) * this.Zo.length) << 1;
        if (this.VH.capacity() < length) {
            this.VH = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.VH.clear();
        }
        while (iPosition < iLimit) {
            for (int i : this.Zo) {
                this.VH.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.DW << 1;
        }
        byteBuffer.position(iLimit);
        this.VH.flip();
        this.gn = this.VH;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final boolean v5(int i, int i2, int i3) throws nf0 {
        boolean z = !Arrays.equals(this.Hw, this.Zo);
        int[] iArr = this.Hw;
        this.Zo = iArr;
        if (iArr == null) {
            this.v5 = false;
            return z;
        }
        if (i3 != 2) {
            throw new nf0(i, i2, i3);
        }
        if (!z && this.FH == i && this.DW == i2) {
            return false;
        }
        this.FH = i;
        this.DW = i2;
        this.v5 = i2 != this.Zo.length;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.Zo;
            if (i4 >= iArr2.length) {
                return true;
            }
            int i5 = iArr2[i4];
            if (i5 >= i2) {
                throw new nf0(i, i2, i3);
            }
            this.v5 = (i5 != i4) | this.v5;
            i4++;
        }
    }
}
