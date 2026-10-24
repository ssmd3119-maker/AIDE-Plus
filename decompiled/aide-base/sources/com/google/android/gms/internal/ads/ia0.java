package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class ia0 extends ga0 implements tq {
    private int w9;

    protected ia0(String str) {
        super(str);
    }

    public final int VH() {
        if (!this.mb) {
            v5();
        }
        return this.w9;
    }

    protected final long gn(ByteBuffer byteBuffer) {
        this.w9 = tp.j6(byteBuffer.get());
        tp.FH(byteBuffer);
        tp.j6(byteBuffer.get());
        return 4L;
    }
}
