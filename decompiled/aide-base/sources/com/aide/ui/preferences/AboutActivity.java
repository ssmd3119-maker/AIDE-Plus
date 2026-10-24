package com.aide.ui.preferences;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.q;
import com.aide.ui.r;

@cy(clazz = -276713602380952000L, container = -276713602380952000L, user = true)
/* loaded from: classes.dex */
public class AboutActivity extends Activity {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    @cy(clazz = -1135282720185906047L, container = -276713602380952000L, user = true)
    class a extends WebViewClient {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 3505130696738963081L)
        a() {
        }

        @Override // android.webkit.WebViewClient
        @ey(method = -1575582404901419537L)
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            try {
                if (DW) {
                    iy.EQ(-102920910807992940L, this, webView, str);
                }
                if (str.startsWith("about:fire-away")) {
                    throw new b(AboutActivity.this, "test");
                }
                return super.shouldOverrideUrlLoading(webView, str);
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -102920910807992940L, this, webView, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 5575741101544787088L, container = 5575741101544787088L, user = true)
    private class b extends RuntimeException {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = -2540788360373042163L)
        @hy
        final /* synthetic */ AboutActivity WB;

        static {
            iy.Zo(b.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -5955057125685462665L)
        public b(AboutActivity aboutActivity, String str) {
            super(str);
            try {
                if (mb) {
                    iy.EQ(2850133146999382920L, null, aboutActivity, str);
                }
                this.WB = aboutActivity;
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, 2850133146999382920L, null, aboutActivity, str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(AboutActivity.class);
    }

    @ey(method = 1824422056185638700L)
    public AboutActivity() {
        try {
            if (WB) {
                iy.gn(-2050741202738764032L, null);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, -2050741202738764032L, null);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 42771676995091539L)
    protected void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (WB) {
                iy.tp(-196565785100227957L, this, bundle);
            }
            super.onCreate(bundle);
            setContentView(r.about);
            WebView webView = (WebView) findViewById(q.aboutWebView);
            webView.loadUrl("file:///android_asset/license.html");
            webView.setWebViewClient(new a());
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, -196565785100227957L, this, bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -3048323203018338671L)
    protected void onStart() {
        try {
            if (WB) {
                iy.gn(-961780475002909575L, this);
            }
            super.onStart();
            FireBaseLogEvent.XL(this, "About");
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, -961780475002909575L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -647763648644063023L)
    protected void onStop() {
        try {
            if (WB) {
                iy.gn(1659134853741421225L, this);
            }
            super.onStop();
            FireBaseLogEvent.DW(this, "About");
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, 1659134853741421225L, this);
            }
            throw th;
        }
    }
}
