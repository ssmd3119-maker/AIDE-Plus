package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class c9 {
    private static final Comparator<byte[]> v5 = new da();
    private final List<byte[]> j6 = new ArrayList();
    private final List<byte[]> DW = new ArrayList(64);
    private int FH = 0;
    private final int Hw = 4096;

    public c9(int i) {
    }

    private final synchronized void FH() {
        while (this.FH > this.Hw) {
            byte[] bArrRemove = this.j6.remove(0);
            this.DW.remove(bArrRemove);
            this.FH -= bArrRemove.length;
        }
    }

    public final synchronized byte[] DW(int i) {
        for (int i2 = 0; i2 < this.DW.size(); i2++) {
            byte[] bArr = this.DW.get(i2);
            if (bArr.length >= i) {
                this.FH -= bArr.length;
                this.DW.remove(i2);
                this.j6.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public final synchronized void j6(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.Hw) {
                this.j6.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.DW, bArr, v5);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.DW.add(iBinarySearch, bArr);
                this.FH += bArr.length;
                FH();
            }
        }
    }
}
