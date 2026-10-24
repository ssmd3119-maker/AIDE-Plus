package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class hg0 {
    public static int j6(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        return ((((byteBuffer.get(iPosition + 5) & 252) >> 2) | ((byteBuffer.get(iPosition + 4) & 1) << 6)) + 1) << 5;
    }
}
