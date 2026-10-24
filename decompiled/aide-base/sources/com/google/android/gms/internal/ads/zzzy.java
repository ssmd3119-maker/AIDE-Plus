package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

@jg
/* loaded from: classes.dex */
public final class zzzy {
    private final Context j6;

    public zzzy(Context context) {
        com.google.android.gms.common.internal.p.tp(context, "Context can not be null");
        this.j6 = context;
    }

    private final boolean j6(Intent intent) {
        com.google.android.gms.common.internal.p.tp(intent, "Intent can not be null");
        return !this.j6.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean DW() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return j6(intent);
    }

    public final boolean FH() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return j6(intent);
    }

    public final boolean Hw() {
        return ((Boolean) dp.j6(this.j6, new vy0())).booleanValue() && com.google.android.gms.common.wrappers.b.j6(this.j6).j6("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    public final boolean v5() {
        return j6(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
