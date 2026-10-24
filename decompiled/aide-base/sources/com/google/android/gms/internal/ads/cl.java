package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class cl implements Runnable {
    private final /* synthetic */ Bitmap WB;
    private final /* synthetic */ zk mb;

    cl(zk zkVar, Bitmap bitmap) {
        this.mb = zkVar;
        this.WB = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.WB.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.mb.tp) {
            this.mb.j6.EQ = new da0();
            this.mb.j6.EQ.v5 = byteArrayOutputStream.toByteArray();
            this.mb.j6.EQ.Hw = "image/png";
            this.mb.j6.EQ.FH = 1;
        }
    }
}
