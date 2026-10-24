package com.google.android.gms.common.images;

import abcd.iv;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class a {
    protected int j6;

    final void DW(Context context, iv ivVar, boolean z) {
        int i = this.j6;
        FH(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    protected abstract void FH(Drawable drawable, boolean z, boolean z2, boolean z3);

    final void j6(Context context, Bitmap bitmap, boolean z) {
        com.google.android.gms.common.internal.b.FH(bitmap);
        FH(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }
}
