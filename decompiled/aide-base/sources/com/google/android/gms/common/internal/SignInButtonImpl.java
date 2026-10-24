package com.google.android.gms.common.internal;

import abcd.qu;
import abcd.ru;
import abcd.su;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.core.graphics.drawable.DrawableCompat;

/* loaded from: classes.dex */
public final class SignInButtonImpl extends Button {
    public SignInButtonImpl(Context context) {
        this(context, null);
    }

    private static int DW(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown color scheme: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void j6(Resources resources, int i, int i2) throws Resources.NotFoundException {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = ru.common_google_signin_btn_icon_dark;
        int i5 = ru.common_google_signin_btn_icon_light;
        int iDW = DW(i2, i4, i5, i5);
        int i6 = ru.common_google_signin_btn_text_dark;
        int i7 = ru.common_google_signin_btn_text_light;
        int iDW2 = DW(i2, i6, i7, i7);
        if (i == 0 || i == 1) {
            iDW = iDW2;
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown button size: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        Drawable drawableWrap = DrawableCompat.wrap(resources.getDrawable(iDW));
        DrawableCompat.setTintList(drawableWrap, resources.getColorStateList(qu.common_google_signin_btn_tint));
        DrawableCompat.setTintList(drawableWrap, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawableWrap);
        int i8 = qu.common_google_signin_btn_text_dark;
        int i9 = qu.common_google_signin_btn_text_light;
        ColorStateList colorStateList = resources.getColorStateList(DW(i2, i8, i9, i9));
        p.u7(colorStateList);
        setTextColor(colorStateList);
        if (i == 0) {
            setText(resources.getString(su.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(su.common_signin_button_text_long));
        } else {
            if (i != 2) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown button size: ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (com.google.android.gms.common.util.i.Hw(getContext())) {
            setGravity(19);
        }
    }

    public SignInButtonImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
    }
}
