package com.google.android.gms.common.internal;

import abcd.xu;
import abcd.yu;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;

/* loaded from: classes.dex */
public final class q extends yu<n> {
    private static final q FH = new q();

    private q() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View FH(Context context, int i, int i2) {
        return FH.v5(context, i, i2);
    }

    private final View v5(Context context, int i, int i2) throws yu.a {
        try {
            SignInButtonConfig signInButtonConfig = new SignInButtonConfig(i, i2, null);
            return (View) xu.g3(DW(context).BP(xu.sy(context), signInButtonConfig));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new yu.a(sb.toString(), e);
        }
    }

    @Override // abcd.yu
    /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
    public final n j6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new x(iBinder);
    }
}
