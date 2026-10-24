package com.google.android.gms.ads.internal;

import abcd.wu;
import abcd.xu;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.gx0;
import com.google.android.gms.internal.ads.hj;
import com.google.android.gms.internal.ads.j2;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.ld;
import com.google.android.gms.internal.ads.mx0;
import com.google.android.gms.internal.ads.o2;
import com.google.android.gms.internal.ads.pw0;
import com.google.android.gms.internal.ads.qj;
import com.google.android.gms.internal.ads.uw0;
import com.google.android.gms.internal.ads.vd;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwf;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@Keep
@DynamiteApi
@ParametersAreNonnullByDefault
@jg
/* loaded from: classes.dex */
public class ClientApi extends gx0 {
    @Override // com.google.android.gms.internal.ads.fx0
    public pw0 createAdLoaderBuilder(wu wuVar, String str, ka kaVar, int i) {
        Context context = (Context) xu.g3(wuVar);
        w0.v5();
        return new l(context, str, kaVar, new zzbbi(14300000, i, true, bn.dx(context)), s1.j6(context));
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public ld createAdOverlay(wu wuVar) {
        Activity activity = (Activity) xu.g3(wuVar);
        AdOverlayInfoParcel adOverlayInfoParcelEQ = AdOverlayInfoParcel.EQ(activity.getIntent());
        if (adOverlayInfoParcelEQ == null) {
            return new com.google.android.gms.ads.internal.overlay.q(activity);
        }
        int i = adOverlayInfoParcelEQ.cT;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new com.google.android.gms.ads.internal.overlay.q(activity) : new com.google.android.gms.ads.internal.overlay.r(activity, adOverlayInfoParcelEQ) : new com.google.android.gms.ads.internal.overlay.x(activity) : new com.google.android.gms.ads.internal.overlay.w(activity) : new com.google.android.gms.ads.internal.overlay.p(activity);
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public uw0 createBannerAdManager(wu wuVar, zzwf zzwfVar, String str, ka kaVar, int i) {
        Context context = (Context) xu.g3(wuVar);
        w0.v5();
        return new u1(context, zzwfVar, str, kaVar, new zzbbi(14300000, i, true, bn.dx(context)), s1.j6(context));
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public vd createInAppPurchaseManager(wu wuVar) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    @Override // com.google.android.gms.internal.ads.fx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.uw0 createInterstitialAdManager(abcd.wu r8, com.google.android.gms.internal.ads.zzwf r9, java.lang.String r10, com.google.android.gms.internal.ads.ka r11, int r12) {
        /*
            r7 = this;
            java.lang.Object r8 = abcd.xu.g3(r8)
            r1 = r8
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.p.j6(r1)
            com.google.android.gms.internal.ads.zzbbi r5 = new com.google.android.gms.internal.ads.zzbbi
            com.google.android.gms.ads.internal.w0.v5()
            boolean r8 = com.google.android.gms.internal.ads.bn.dx(r1)
            r0 = 14300000(0xda3360, float:2.0038568E-38)
            r2 = 1
            r5.<init>(r0, r12, r2, r8)
            java.lang.String r8 = r9.WB
            java.lang.String r12 = "reward_mb"
            boolean r8 = r12.equals(r8)
            if (r8 != 0) goto L36
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r12 = com.google.android.gms.internal.ads.p.zh
            com.google.android.gms.internal.ads.m r0 = com.google.android.gms.internal.ads.cw0.v5()
            java.lang.Object r12 = r0.FH(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L4c
        L36:
            if (r8 == 0) goto L4b
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r8 = com.google.android.gms.internal.ads.p.AL
            com.google.android.gms.internal.ads.m r12 = com.google.android.gms.internal.ads.cw0.v5()
            java.lang.Object r8 = r12.FH(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L4b
            goto L4c
        L4b:
            r2 = 0
        L4c:
            if (r2 == 0) goto L5d
            com.google.android.gms.internal.ads.r6 r8 = new com.google.android.gms.internal.ads.r6
            com.google.android.gms.ads.internal.s1 r9 = com.google.android.gms.ads.internal.s1.j6(r1)
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r5
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r8
        L5d:
            com.google.android.gms.ads.internal.m r8 = new com.google.android.gms.ads.internal.m
            com.google.android.gms.ads.internal.s1 r6 = com.google.android.gms.ads.internal.s1.j6(r1)
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ClientApi.createInterstitialAdManager(abcd.wu, com.google.android.gms.internal.ads.zzwf, java.lang.String, com.google.android.gms.internal.ads.ka, int):com.google.android.gms.internal.ads.uw0");
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public j2 createNativeAdViewDelegate(wu wuVar, wu wuVar2) {
        return new com.google.android.gms.internal.ads.u1((FrameLayout) xu.g3(wuVar), (FrameLayout) xu.g3(wuVar2));
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public o2 createNativeAdViewHolderDelegate(wu wuVar, wu wuVar2, wu wuVar3) {
        return new com.google.android.gms.internal.ads.w1((View) xu.g3(wuVar), (HashMap) xu.g3(wuVar2), (HashMap) xu.g3(wuVar3));
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public qj createRewardedVideoAd(wu wuVar, ka kaVar, int i) {
        Context context = (Context) xu.g3(wuVar);
        w0.v5();
        return new hj(context, s1.j6(context), kaVar, new zzbbi(14300000, i, true, bn.dx(context)));
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public qj createRewardedVideoAdSku(wu wuVar, int i) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public uw0 createSearchAdManager(wu wuVar, zzwf zzwfVar, String str, int i) {
        Context context = (Context) xu.g3(wuVar);
        w0.v5();
        return new q0(context, zzwfVar, str, new zzbbi(14300000, i, true, bn.dx(context)));
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public mx0 getMobileAdsSettingsManager(wu wuVar) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public mx0 getMobileAdsSettingsManagerWithClientJarVersion(wu wuVar, int i) {
        Context context = (Context) xu.g3(wuVar);
        w0.v5();
        return y.Mt(context, new zzbbi(14300000, i, true, bn.dx(context)));
    }
}
