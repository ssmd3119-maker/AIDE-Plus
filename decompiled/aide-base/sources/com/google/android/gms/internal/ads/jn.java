package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;

@jg
@TargetApi(8)
/* loaded from: classes.dex */
public class jn {
    private jn() {
    }

    public static boolean J0() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public static boolean aM(cv cvVar) {
        if (cvVar == null) {
            return false;
        }
        cvVar.onPause();
        return true;
    }

    public static boolean j3(cv cvVar) {
        if (cvVar == null) {
            return false;
        }
        cvVar.onResume();
        return true;
    }

    public boolean DW(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public boolean EQ(Window window) {
        throw null;
    }

    public void FH(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    public Drawable Hw(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public int J8() {
        throw null;
    }

    public boolean Mr(View view) {
        throw null;
    }

    public CookieManager QX(Context context) {
        if (J0()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            xp.Hw("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.w0.u7().v5(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public int U2() {
        throw null;
    }

    public String VH(SslError sslError) {
        throw null;
    }

    public void Ws(Context context) {
    }

    public Set<String> XL(Uri uri) {
        throw null;
    }

    public dv Zo(cv cvVar, pt0 pt0Var, boolean z) {
        throw null;
    }

    public int a8() {
        throw null;
    }

    public void gn(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    public String j6(Context context) {
        return "";
    }

    public int lg() {
        return 5;
    }

    public ViewGroup.LayoutParams rN() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public boolean tp(Context context, WebSettings webSettings) {
        return false;
    }

    public boolean u7(DownloadManager.Request request) {
        throw null;
    }

    public WebResourceResponse v5(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public boolean we(View view) {
        throw null;
    }
}
