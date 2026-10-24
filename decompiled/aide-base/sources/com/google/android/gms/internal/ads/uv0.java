package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

@jg
/* loaded from: classes.dex */
public class uv0 {
    private final lv0 DW;
    private final f4 FH;
    private final kd Hw;
    private final mv0 j6;

    public uv0(mv0 mv0Var, lv0 lv0Var, ky0 ky0Var, f4 f4Var, ak akVar, yk ykVar, kd kdVar, g4 g4Var) {
        this.j6 = mv0Var;
        this.DW = lv0Var;
        this.FH = f4Var;
        this.Hw = kdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void FH(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        cw0.j6().Hw(context, cw0.VH().WB, "gmob-apps", bundle, true);
    }

    public final ld Hw(Activity activity) {
        wv0 wv0Var = new wv0(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            xp.j6("useClientJar flag not found in activity intent extras.");
        }
        return wv0Var.DW(activity, booleanExtra);
    }

    public final pw0 Zo(Context context, String str, ka kaVar) {
        return new zv0(this, context, str, kaVar).DW(context, false);
    }

    public final j2 j6(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return new aw0(this, frameLayout, frameLayout2, context).DW(context, false);
    }
}
