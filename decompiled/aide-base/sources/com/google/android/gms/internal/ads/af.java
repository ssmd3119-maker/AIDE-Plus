package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class af implements ro<u0> {
    private final /* synthetic */ double DW;
    private final /* synthetic */ boolean FH;
    private final /* synthetic */ String Hw;
    private final /* synthetic */ boolean j6;
    private final /* synthetic */ te v5;

    af(te teVar, boolean z, double d, boolean z2, String str) {
        this.v5 = teVar;
        this.j6 = z;
        this.DW = d;
        this.FH = z2;
        this.Hw = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.ro
    @TargetApi(19)
    /* renamed from: FH, reason: merged with bridge method [inline-methods] */
    public final u0 DW(InputStream inputStream) {
        Bitmap bitmapDecodeStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (this.DW * 160.0d);
        if (!this.FH) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
        } catch (Exception e) {
            xp.Hw("Error grabbing image.", e);
            bitmapDecodeStream = null;
        }
        if (bitmapDecodeStream == null) {
            this.v5.aM(2, this.j6);
            return null;
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        if (com.google.android.gms.common.util.o.Zo() && sm.J0()) {
            int width = bitmapDecodeStream.getWidth();
            int height = bitmapDecodeStream.getHeight();
            int allocationByteCount = bitmapDecodeStream.getAllocationByteCount();
            long j = jUptimeMillis2 - jUptimeMillis;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            sm.we(sb.toString());
        }
        return new u0(new BitmapDrawable(Resources.getSystem(), bitmapDecodeStream), Uri.parse(this.Hw), this.DW);
    }

    @Override // com.google.android.gms.internal.ads.ro
    public final /* synthetic */ u0 j6() {
        this.v5.aM(2, this.j6);
        return null;
    }
}
