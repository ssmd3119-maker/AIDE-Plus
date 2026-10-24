package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* loaded from: classes.dex */
public class yf0 {
    private boolean DW;
    private int FH;
    private long Hw;
    private long VH;
    private long Zo;
    private long gn;
    protected AudioTrack j6;
    private long u7;
    private long v5;

    private yf0() {
    }

    public void DW(AudioTrack audioTrack, boolean z) {
        this.j6 = audioTrack;
        this.DW = z;
        this.VH = -9223372036854775807L;
        this.Hw = 0L;
        this.v5 = 0L;
        this.Zo = 0L;
        if (audioTrack != null) {
            this.FH = audioTrack.getSampleRate();
        }
    }

    public final long FH() {
        if (this.VH != -9223372036854775807L) {
            return Math.min(this.u7, this.gn + ((((SystemClock.elapsedRealtime() * 1000) - this.VH) * this.FH) / 1000000));
        }
        int playState = this.j6.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & this.j6.getPlaybackHeadPosition();
        if (this.DW) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.Zo = this.Hw;
            }
            playbackHeadPosition += this.Zo;
        }
        if (this.Hw > playbackHeadPosition) {
            this.v5++;
        }
        this.Hw = playbackHeadPosition;
        return playbackHeadPosition + (this.v5 << 32);
    }

    public final long Hw() {
        return (FH() * 1000000) / this.FH;
    }

    public long VH() {
        throw new UnsupportedOperationException();
    }

    public long Zo() {
        throw new UnsupportedOperationException();
    }

    public final void gn(long j) {
        this.gn = FH();
        this.VH = SystemClock.elapsedRealtime() * 1000;
        this.u7 = j;
        this.j6.stop();
    }

    public final void j6() {
        if (this.VH != -9223372036854775807L) {
            return;
        }
        this.j6.pause();
    }

    public boolean v5() {
        return false;
    }

    /* synthetic */ yf0(xf0 xf0Var) {
        this();
    }
}
