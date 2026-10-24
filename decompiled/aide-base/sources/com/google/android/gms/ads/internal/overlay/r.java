package com.google.android.gms.ads.internal.overlay;

import abcd.iy;
import abcd.wu;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.w0;
import com.google.android.gms.internal.ads.hv0;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.md;

@jg
/* loaded from: classes.dex */
public final class r extends md {
    private AdOverlayInfoParcel WB;
    private Activity mb;
    private boolean jw = false;
    private boolean fY = false;

    public r(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.WB = adOverlayInfoParcel;
        this.mb = activity;
    }

    private final synchronized void k6() {
        if (!this.fY) {
            if (this.WB.jw != null) {
                this.WB.jw.Do();
            }
            this.fY = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void Ae() {
        if (this.mb.isFinishing()) {
            k6();
        }
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void Dv() {
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void Hn(wu wuVar) {
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void PU(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.jw);
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void b1() {
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void cc(int i, int i2, Intent intent) {
        iy.v5(this, i, i2, intent);
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void fp() {
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void hw(Bundle bundle) {
        m mVar;
        boolean z = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        AdOverlayInfoParcel adOverlayInfoParcel = this.WB;
        if (adOverlayInfoParcel == null) {
            this.mb.finish();
            return;
        }
        if (z) {
            this.mb.finish();
            return;
        }
        if (bundle == null) {
            hv0 hv0Var = adOverlayInfoParcel.mb;
            if (hv0Var != null) {
                hv0Var.EQ();
            }
            if (this.mb.getIntent() != null && this.mb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (mVar = this.WB.jw) != null) {
                mVar.lb();
            }
        }
        w0.DW();
        Activity activity = this.mb;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.WB;
        if (a.DW(activity, adOverlayInfoParcel2.WB, adOverlayInfoParcel2.w9)) {
            return;
        }
        this.mb.finish();
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void onDestroy() {
        if (this.mb.isFinishing()) {
            k6();
        }
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void onPause() {
        m mVar = this.WB.jw;
        if (mVar != null) {
            mVar.onPause();
        }
        if (this.mb.isFinishing()) {
            k6();
        }
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void onResume() {
        if (this.jw) {
            this.mb.finish();
            return;
        }
        this.jw = true;
        m mVar = this.WB.jw;
        if (mVar != null) {
            mVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void op() {
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final boolean qG() {
        return false;
    }
}
