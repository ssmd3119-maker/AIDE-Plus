package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.aide.uidesigner.ProxyTextView;

@TargetApi(ProxyTextView.INPUTTYPE_textUri)
/* loaded from: classes.dex */
public class pn extends rn {
    @Override // com.google.android.gms.internal.ads.jn
    public final Drawable Hw(Context context, Bitmap bitmap, boolean z, float f) {
        if (!z || f <= 0.0f || f > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
            RenderScript renderScriptCreate = RenderScript.create(context);
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final void Ws(Context context) {
        fp fpVarJ6 = fp.j6();
        sm.we("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(fpVarJ6.j6)) {
            Context contextFH = com.google.android.gms.common.g.FH(context);
            if (com.google.android.gms.common.util.d.j6() || contextFH == null) {
                SharedPreferences.Editor editorPutString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (contextFH == null) {
                    editorPutString.apply();
                } else {
                    com.google.android.gms.common.util.r.j6(context, editorPutString, "admob_user_agent");
                }
            }
            fpVarJ6.j6 = defaultUserAgent;
        }
        sm.we("User agent is updated.");
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final String j6(Context context) {
        fp fpVarJ6 = fp.j6();
        if (TextUtils.isEmpty(fpVarJ6.j6)) {
            fpVarJ6.j6 = com.google.android.gms.common.util.d.j6() ? (String) dp.j6(context, new gp(fpVarJ6, context)) : (String) dp.j6(context, new hp(fpVarJ6, com.google.android.gms.common.g.FH(context), context));
        }
        return fpVarJ6.j6;
    }

    @Override // com.google.android.gms.internal.ads.rn, com.google.android.gms.internal.ads.mn, com.google.android.gms.internal.ads.jn
    public final boolean tp(Context context, WebSettings webSettings) {
        super.tp(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }
}
