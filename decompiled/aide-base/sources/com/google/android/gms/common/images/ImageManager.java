package com.google.android.gms.common.images;

import abcd.iv;
import abcd.m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class ImageManager {
    private final Handler DW;
    private final ExecutorService FH;
    private final a Hw;
    private final Map<Uri, ImageReceiver> VH;
    private final Map<com.google.android.gms.common.images.a, ImageReceiver> Zo;
    private final Map<Uri, Long> gn;
    private final Context j6;
    private final iv v5;
    private static final Object u7 = new Object();
    private static HashSet<Uri> tp = new HashSet<>();

    @KeepName
    private final class ImageReceiver extends ResultReceiver {
        private final Uri WB;
        private final /* synthetic */ ImageManager jw;
        private final ArrayList<com.google.android.gms.common.images.a> mb;

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            this.jw.FH.execute(this.jw.new b(this.WB, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    private static final class a extends m<com.google.android.gms.common.images.b, Bitmap> {
    }

    private final class b implements Runnable {
        private final Uri WB;
        private final ParcelFileDescriptor mb;

        public b(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.WB = uri;
            this.mb = parcelFileDescriptor;
        }

        @Override // java.lang.Runnable
        public final void run() throws InterruptedException, IOException {
            boolean z;
            Bitmap bitmap;
            com.google.android.gms.common.internal.b.DW("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            ParcelFileDescriptor parcelFileDescriptor = this.mb;
            boolean z2 = false;
            Bitmap bitmapDecodeFileDescriptor = null;
            if (parcelFileDescriptor != null) {
                try {
                    bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
                } catch (OutOfMemoryError e) {
                    String strValueOf = String.valueOf(this.WB);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 34);
                    sb.append("OOM while loading bitmap for uri: ");
                    sb.append(strValueOf);
                    Log.e("ImageManager", sb.toString(), e);
                    z2 = true;
                }
                try {
                    this.mb.close();
                } catch (IOException e2) {
                    Log.e("ImageManager", "closed failed", e2);
                }
                z = z2;
                bitmap = bitmapDecodeFileDescriptor;
            } else {
                bitmap = null;
                z = false;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ImageManager.this.DW.post(ImageManager.this.new c(this.WB, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                String strValueOf2 = String.valueOf(this.WB);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 32);
                sb2.append("Latch interrupted while posting ");
                sb2.append(strValueOf2);
                Log.w("ImageManager", sb2.toString());
            }
        }
    }

    private final class c implements Runnable {
        private final Uri WB;
        private boolean fY;
        private final CountDownLatch jw;
        private final Bitmap mb;

        public c(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.WB = uri;
            this.mb = bitmap;
            this.fY = z;
            this.jw = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.google.android.gms.common.internal.b.j6("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.mb != null;
            if (ImageManager.this.Hw != null) {
                if (this.fY) {
                    ImageManager.this.Hw.j6();
                    throw null;
                }
                if (z) {
                    ImageManager.this.Hw.DW(new com.google.android.gms.common.images.b(this.WB), this.mb);
                    throw null;
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.VH.remove(this.WB);
            if (imageReceiver != null) {
                ArrayList arrayList = imageReceiver.mb;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    com.google.android.gms.common.images.a aVar = (com.google.android.gms.common.images.a) arrayList.get(i);
                    if (z) {
                        aVar.j6(ImageManager.this.j6, this.mb, false);
                    } else {
                        ImageManager.this.gn.put(this.WB, Long.valueOf(SystemClock.elapsedRealtime()));
                        aVar.DW(ImageManager.this.j6, ImageManager.this.v5, false);
                    }
                    ImageManager.this.Zo.remove(aVar);
                }
            }
            this.jw.countDown();
            synchronized (ImageManager.u7) {
                ImageManager.tp.remove(this.WB);
            }
        }
    }
}
