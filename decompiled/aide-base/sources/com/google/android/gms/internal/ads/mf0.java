package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface mf0 {
    public static final ByteBuffer j6 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void DW();

    int FH();

    ByteBuffer Hw();

    int VH();

    boolean Zo();

    void flush();

    void gn();

    boolean ro();

    void u7(ByteBuffer byteBuffer);

    boolean v5(int i, int i2, int i3);
}
