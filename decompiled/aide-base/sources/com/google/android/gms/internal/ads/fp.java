package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import com.aide.uidesigner.ProxyTextView;

@jg
@TargetApi(ProxyTextView.INPUTTYPE_textUri)
/* loaded from: classes.dex */
public final class fp {
    private static fp DW;
    String j6;

    private fp() {
    }

    public static fp j6() {
        if (DW == null) {
            DW = new fp();
        }
        return DW;
    }
}
