package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class xf0 extends Thread {
    private final /* synthetic */ AudioTrack WB;
    private final /* synthetic */ wf0 mb;

    xf0(wf0 wf0Var, AudioTrack audioTrack) {
        this.mb = wf0Var;
        this.WB = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.WB.flush();
            this.WB.release();
        } finally {
            this.mb.Zo.open();
        }
    }
}
