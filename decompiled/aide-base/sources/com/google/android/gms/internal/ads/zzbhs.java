package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@jg
/* loaded from: classes.dex */
public final class zzbhs extends MutableContextWrapper {
    private Context DW;
    private Context FH;
    private Activity j6;

    public zzbhs(Context context) {
        super(context);
        setBaseContext(context);
    }

    private static /* synthetic */ void DW(Object obj, Intent intent) {
        ((Context) obj).startActivity(intent);
        abcd.iy.BT(obj, intent);
    }

    private static /* synthetic */ void j6(Object obj, Intent intent) {
        ((Activity) obj).startActivity(intent);
        abcd.iy.BT(obj, intent);
    }

    public final Activity FH() {
        return this.j6;
    }

    public final Context Hw() {
        return this.FH;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.FH.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        this.DW = context.getApplicationContext();
        this.j6 = context instanceof Activity ? (Activity) context : null;
        this.FH = context;
        super.setBaseContext(this.DW);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.j6;
        if (activity != null) {
            j6(activity, intent);
        } else {
            intent.setFlags(268435456);
            DW(this.DW, intent);
        }
    }
}
