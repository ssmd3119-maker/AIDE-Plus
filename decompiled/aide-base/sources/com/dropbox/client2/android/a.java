package com.dropbox.client2.android;

import abcd.du;
import abcd.eu;
import abcd.fu;
import abcd.gu;
import abcd.iy;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class a extends du {
    public a(fu fuVar, gu.a aVar) {
        super(fuVar, aVar);
    }

    private static /* synthetic */ void XL(Object obj, Intent intent) {
        ((Context) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    public void Mr(Context context) {
        fu fuVarJ0 = J0();
        if (AuthActivity.FH(context, fuVarJ0.WB, true)) {
            AuthActivity.u7(fuVarJ0.WB, fuVarJ0.mb);
            Intent intent = new Intent(context, (Class<?>) AuthActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            XL(context, intent);
        }
    }

    @Override // abcd.du
    public void QX() {
        super.QX();
        AuthActivity.w9 = null;
    }

    public boolean aM() {
        Intent intent = AuthActivity.w9;
        if (intent == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra("ACCESS_TOKEN");
        String stringExtra2 = intent.getStringExtra("ACCESS_SECRET");
        String stringExtra3 = intent.getStringExtra("UID");
        return (stringExtra == null || stringExtra.equals("") || stringExtra2 == null || stringExtra2.equals("") || stringExtra3 == null || stringExtra3.equals("")) ? false : true;
    }

    public String j3() {
        Intent intent = AuthActivity.w9;
        if (intent == null) {
            throw new IllegalStateException();
        }
        String stringExtra = intent.getStringExtra("ACCESS_TOKEN");
        if (stringExtra == null || stringExtra.length() == 0) {
            throw new IllegalArgumentException("Invalid result intent passed in. Missing access token.");
        }
        String stringExtra2 = intent.getStringExtra("ACCESS_SECRET");
        if (stringExtra2 == null || stringExtra2.length() == 0) {
            throw new IllegalArgumentException("Invalid result intent passed in. Missing access secret.");
        }
        String stringExtra3 = intent.getStringExtra("UID");
        if (stringExtra3 == null || stringExtra3.length() == 0) {
            throw new IllegalArgumentException("Invalid result intent passed in. Missing uid.");
        }
        if (stringExtra.equals("oauth2:")) {
            Ws(stringExtra2);
        } else {
            J8(new eu(stringExtra, stringExtra2));
        }
        return stringExtra3;
    }

    public a(fu fuVar, gu.a aVar, eu euVar) {
        super(fuVar, aVar, euVar);
    }
}
