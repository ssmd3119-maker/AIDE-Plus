package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Handler;

@TargetApi(23)
/* loaded from: classes.dex */
public final class tp0 implements MediaCodec.OnFrameRenderedListener {
    private final /* synthetic */ qp0 j6;

    private tp0(qp0 qp0Var, MediaCodec mediaCodec) {
        this.j6 = qp0Var;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        qp0 qp0Var = this.j6;
        if (this != qp0Var.qp) {
            return;
        }
        qp0Var.CU();
    }
}
