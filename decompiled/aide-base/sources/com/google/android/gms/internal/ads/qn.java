package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.view.View;
import com.aide.uidesigner.ProxyTextView;

@TargetApi(ProxyTextView.INPUTTYPE_numberPassword)
/* loaded from: classes.dex */
public class qn extends pn {
    @Override // com.google.android.gms.internal.ads.jn
    public boolean DW(View view) {
        return super.DW(view) || view.getWindowId() != null;
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final int lg() {
        return 14;
    }
}
