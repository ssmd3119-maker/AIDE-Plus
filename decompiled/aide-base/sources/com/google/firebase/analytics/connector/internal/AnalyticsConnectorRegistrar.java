package com.google.firebase.analytics.connector.internal;

import abcd.cx;
import abcd.ex;
import abcd.lx;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.a;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import java.util.Collections;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements d {
    @Override // com.google.firebase.components.d
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<com.google.firebase.components.a<?>> getComponents() {
        a.b bVarJ6 = com.google.firebase.components.a.j6(ex.class);
        bVarJ6.j6(e.j6(cx.class));
        bVarJ6.j6(e.j6(Context.class));
        bVarJ6.j6(e.j6(lx.class));
        bVarJ6.v5(a.j6);
        bVarJ6.Hw();
        return Collections.singletonList(bVarJ6.FH());
    }
}
