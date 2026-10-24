package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;

@jg
/* loaded from: classes.dex */
public final class gj extends ContextWrapper {
    public static Context FH(Context context) {
        if (context instanceof gj) {
            return ((gj) context).getBaseContext();
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final synchronized void DW(Activity activity) {
        throw new NoSuchMethodError();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        throw new NoSuchMethodError();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized ApplicationInfo getApplicationInfo() {
        throw new NoSuchMethodError();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized String getPackageName() {
        throw new NoSuchMethodError();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized String getPackageResourcePath() {
        throw new NoSuchMethodError();
    }

    public final synchronized void j6(String str) {
        throw new NoSuchMethodError();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized void startActivity(Intent intent) {
        throw new NoSuchMethodError();
    }
}
