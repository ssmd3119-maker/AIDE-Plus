package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@jg
@TargetApi(14)
/* loaded from: classes.dex */
public final class ws implements AudioManager.OnAudioFocusChangeListener {
    private final xs DW;
    private boolean FH;
    private boolean Hw;
    private float Zo = 1.0f;
    private final AudioManager j6;
    private boolean v5;

    public ws(Context context, xs xsVar) {
        this.j6 = (AudioManager) context.getSystemService("audio");
        this.DW = xsVar;
    }

    private final void Zo() {
        boolean z;
        boolean z2;
        boolean z3 = this.Hw && !this.v5 && this.Zo > 0.0f;
        if (z3 && !(z2 = this.FH)) {
            AudioManager audioManager = this.j6;
            if (audioManager != null && !z2) {
                this.FH = audioManager.requestAudioFocus(this, 3, 2) == 1;
            }
            this.DW.j6();
            return;
        }
        if (z3 || !(z = this.FH)) {
            return;
        }
        AudioManager audioManager2 = this.j6;
        if (audioManager2 != null && z) {
            this.FH = audioManager2.abandonAudioFocus(this) == 0;
        }
        this.DW.j6();
    }

    public final void DW(boolean z) {
        this.v5 = z;
        Zo();
    }

    public final void FH(float f) {
        this.Zo = f;
        Zo();
    }

    public final void Hw() {
        this.Hw = true;
        Zo();
    }

    public final float j6() {
        float f = this.v5 ? 0.0f : this.Zo;
        if (this.FH) {
            return f;
        }
        return 0.0f;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.FH = i > 0;
        this.DW.j6();
    }

    public final void v5() {
        this.Hw = false;
        Zo();
    }
}
