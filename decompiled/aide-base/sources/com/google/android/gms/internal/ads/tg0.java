package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class tg0 extends og0 {
    public final pg0 DW = new pg0();
    public ByteBuffer FH;
    public long Hw;

    public tg0(int i) {
    }

    private final ByteBuffer tp(int i) {
        ByteBuffer byteBuffer = this.FH;
        int iCapacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(iCapacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    public final boolean gn() {
        return VH(1073741824);
    }

    @Override // com.google.android.gms.internal.ads.og0
    public final void j6() {
        super.j6();
        ByteBuffer byteBuffer = this.FH;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void u7(int i) {
        ByteBuffer byteBuffer = this.FH;
        if (byteBuffer == null) {
            tp(i);
            throw null;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = this.FH.position() + i;
        if (iCapacity >= iPosition) {
            return;
        }
        tp(iPosition);
        throw null;
    }
}
