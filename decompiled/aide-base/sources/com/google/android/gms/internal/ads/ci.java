package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ci implements kr<t8> {
    private final /* synthetic */ bi j6;

    ci(bi biVar) {
        this.j6 = biVar;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final /* synthetic */ void j6(t8 t8Var) {
        try {
            t8Var.tp("AFMA_getAdapterLessMediationAd", this.j6.WB);
        } catch (Exception e) {
            xp.Hw("Error requesting an ad url", e);
            zh.Q6.DW(this.j6.mb);
        }
    }
}
