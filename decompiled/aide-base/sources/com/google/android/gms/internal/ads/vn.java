package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

@jg
/* loaded from: classes.dex */
public final class vn {
    private boolean j6 = false;
    private float DW = 1.0f;

    private final synchronized boolean FH() {
        return this.DW >= 0.0f;
    }

    public static float Hw(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }

    public final synchronized void DW(float f) {
        this.DW = f;
    }

    public final synchronized boolean Zo() {
        return this.j6;
    }

    public final synchronized void j6(boolean z) {
        this.j6 = z;
    }

    public final synchronized float v5() {
        if (!FH()) {
            return 1.0f;
        }
        return this.DW;
    }
}
