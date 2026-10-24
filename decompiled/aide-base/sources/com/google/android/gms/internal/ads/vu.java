package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class vu extends ga0 {
    public vu(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final void Zo(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
