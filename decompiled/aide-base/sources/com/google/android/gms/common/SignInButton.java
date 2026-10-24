package com.google.android.gms.common;

import abcd.tu;
import abcd.yu;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.SignInButtonImpl;

/* loaded from: classes.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {
    private int WB;
    private View.OnClickListener fY;
    private View jw;
    private int mb;

    public SignInButton(Context context) {
        this(context, null);
    }

    public final void j6(int i, int i2) throws Resources.NotFoundException {
        this.WB = i;
        this.mb = i2;
        Context context = getContext();
        View view = this.jw;
        if (view != null) {
            removeView(view);
        }
        try {
            this.jw = com.google.android.gms.common.internal.q.FH(context, this.WB, this.mb);
        } catch (yu.a unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i3 = this.WB;
            int i4 = this.mb;
            SignInButtonImpl signInButtonImpl = new SignInButtonImpl(context);
            signInButtonImpl.j6(context.getResources(), i3, i4);
            this.jw = signInButtonImpl;
        }
        addView(this.jw);
        this.jw.setEnabled(isEnabled());
        this.jw.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.fY;
        if (onClickListener == null || view != this.jw) {
            return;
        }
        onClickListener.onClick(this);
    }

    public final void setColorScheme(int i) throws Resources.NotFoundException {
        j6(this.WB, i);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.jw.setEnabled(z);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.fY = onClickListener;
        View view = this.jw;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public final void setScopes(Scope[] scopeArr) throws Resources.NotFoundException {
        j6(this.WB, this.mb);
    }

    public final void setSize(int i) throws Resources.NotFoundException {
        j6(i, this.mb);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.fY = null;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, tu.SignInButton, 0, 0);
        try {
            this.WB = typedArrayObtainStyledAttributes.getInt(tu.SignInButton_buttonSize, 0);
            this.mb = typedArrayObtainStyledAttributes.getInt(tu.SignInButton_colorScheme, 2);
            typedArrayObtainStyledAttributes.recycle();
            j6(this.WB, this.mb);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
