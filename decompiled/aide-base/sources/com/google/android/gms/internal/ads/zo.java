package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@jg
/* loaded from: classes.dex */
public final class zo {
    private Map<Integer, Bitmap> j6 = new ConcurrentHashMap();
    private AtomicInteger DW = new AtomicInteger(0);

    public final int DW(Bitmap bitmap) {
        if (bitmap == null) {
            xp.VH("Bitmap is null. Skipping putting into the Memory Map.");
            return -1;
        }
        int andIncrement = this.DW.getAndIncrement();
        this.j6.put(Integer.valueOf(andIncrement), bitmap);
        return andIncrement;
    }

    public final void FH(Integer num) {
        this.j6.remove(num);
    }

    public final Bitmap j6(Integer num) {
        return this.j6.get(num);
    }
}
