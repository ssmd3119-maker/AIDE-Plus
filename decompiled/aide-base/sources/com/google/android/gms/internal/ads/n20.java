package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class n20 extends o30 {
    n20(byte[] bArr, int i) {
        super(bArr, i);
    }

    private static void VH(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = o30.DW(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = o30.DW(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = o30.DW(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = o30.DW(iArr[i2] ^ iArr[i3], 7);
    }

    @Override // com.google.android.gms.internal.ads.o30
    final int Hw() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.o30
    final ByteBuffer v5(byte[] bArr, int i) {
        int[] iArr = new int[16];
        int[] iArr2 = o30.FH;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        int[] iArrZo = o30.Zo(ByteBuffer.wrap(this.j6.j6()));
        int i2 = 4;
        System.arraycopy(iArrZo, 0, iArr, 4, iArrZo.length);
        iArr[12] = i;
        int i3 = 13;
        System.arraycopy(o30.Zo(ByteBuffer.wrap(bArr)), 0, iArr, 13, 3);
        int[] iArr3 = (int[]) iArr.clone();
        int i4 = 0;
        while (i4 < 10) {
            VH(iArr3, 0, i2, 8, 12);
            VH(iArr3, 1, 5, 9, i3);
            VH(iArr3, 2, 6, 10, 14);
            VH(iArr3, 3, 7, 11, 15);
            VH(iArr3, 0, 5, 10, 15);
            VH(iArr3, 1, 6, 11, 12);
            VH(iArr3, 2, 7, 8, 13);
            VH(iArr3, 3, 4, 9, 14);
            i4++;
            i2 = 4;
            i3 = 13;
        }
        for (int i5 = 0; i5 < 16; i5++) {
            iArr[i5] = iArr[i5] + iArr3[i5];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArr, 0, 16);
        return byteBufferOrder;
    }
}
