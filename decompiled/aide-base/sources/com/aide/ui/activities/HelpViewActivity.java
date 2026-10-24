package com.aide.ui.activities;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.R;
import android.app.ActionBar;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import com.aide.common.AndroidHelper;
import com.aide.common.AppLog;
import com.aide.common.MessageBox;
import com.aide.ui.ServiceContainer;
import com.aide.ui.ThemedActionbarActivity;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.s;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

@cy(clazz = 1721226910917733920L, container = 1721226910917733920L, user = true)
/* loaded from: classes.dex */
public class HelpViewActivity extends ThemedActionbarActivity {

    @gy
    private static /* synthetic */ boolean k2;

    @fy
    private static /* synthetic */ boolean qp;

    @dy(field = 595896484329092100L)
    private int fY;

    @dy(field = 2698718083271816821L)
    private WebView jw;

    @cy(clazz = 2633498567436976501L, container = 1721226910917733920L, user = true)
    class a implements ActionBar.OnNavigationListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -15098918912236515L)
        a() {
        }

        @Override // android.app.ActionBar.OnNavigationListener
        @ey(method = 5524384594919569775L)
        public boolean onNavigationItemSelected(int i, long j) {
            try {
                if (DW) {
                    iy.EQ(-526981627819788264L, this, new Integer(i), new Long(j));
                }
                if (i == HelpViewActivity.this.fY) {
                    return true;
                }
                HelpViewActivity.this.fY = i;
                com.aide.ui.activities.a aVar = com.aide.ui.activities.a.QX()[i];
                HelpViewActivity.this.jw.getSettings().setJavaScriptEnabled(aVar.aM());
                HelpViewActivity.this.jw.loadUrl(aVar.we());
                HelpViewActivity.this.jw.clearHistory();
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -526981627819788264L, this, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2633621312026298256L, container = 1721226910917733920L, user = true)
    class b extends WebViewClient {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 2680131499878197312L)
        private Map<String, ZipFile> j6 = new HashMap();

        static {
            iy.Zo(b.class);
        }

        @ey(method = -38699490612093472L)
        b() {
        }

        @Override // android.webkit.WebViewClient
        @ey(method = 1605468893116744920L)
        public void onPageFinished(WebView webView, String str) {
            try {
                if (FH) {
                    iy.EQ(2542227171076479600L, this, webView, str);
                }
                HelpViewActivity.this.setProgressBarIndeterminateVisibility(false);
                super.onPageFinished(webView, str);
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, 2542227171076479600L, this, webView, str);
                }
                throw th;
            }
        }

        @Override // android.webkit.WebViewClient
        @ey(method = -1108096552979537905L)
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            try {
                if (FH) {
                    iy.we(2965531130095893129L, this, webView, str, bitmap);
                }
                HelpViewActivity.this.setProgressBarIndeterminateVisibility(true);
                super.onPageStarted(webView, str, bitmap);
            } catch (Throwable th) {
                if (Hw) {
                    iy.U2(th, 2965531130095893129L, this, webView, str, bitmap);
                }
                throw th;
            }
        }

        @Override // android.webkit.WebViewClient
        @ey(method = 2062492683820917712L)
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            int iIndexOf;
            try {
                if (FH) {
                    iy.EQ(3187824047861788856L, this, webView, str);
                }
                try {
                    String lowerCase = str.toLowerCase(Locale.US);
                    if (lowerCase.startsWith("file:") && (iIndexOf = lowerCase.indexOf(".zip/")) != -1) {
                        String strSubstring = str.substring(5, iIndexOf + 4);
                        if (!this.j6.containsKey(strSubstring)) {
                            AppLog.DW("Loading zip file:" + strSubstring);
                            this.j6.put(strSubstring, new ZipFile(strSubstring));
                        }
                        ZipFile zipFile = this.j6.get(strSubstring);
                        if (zipFile != null) {
                            int i = iIndexOf + 5;
                            int iMax = Math.max(str.indexOf(35), str.indexOf("?"));
                            ZipEntry entry = zipFile.getEntry(iMax < 0 ? str.substring(i) : str.substring(i, iMax));
                            if (entry != null) {
                                return new WebResourceResponse(null, null, zipFile.getInputStream(entry));
                            }
                        }
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (IOException e) {
                    AppLog.v5(e);
                    return super.shouldInterceptRequest(webView, str);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, 3187824047861788856L, this, webView, str);
                }
                throw th;
            }
        }

        @Override // android.webkit.WebViewClient
        @ey(method = 49162854828881136L)
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            try {
                if (FH) {
                    iy.EQ(463494916433972288L, this, webView, str);
                }
                webView.loadUrl(str);
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, 463494916433972288L, this, webView, str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(HelpViewActivity.class);
    }

    @ey(method = -1684562446320491681L)
    public HelpViewActivity() {
        try {
            if (qp) {
                iy.gn(-2309172973102533321L, null);
            }
            this.fY = -1;
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, -2309172973102533321L, null);
            }
            throw th;
        }
    }

    @ey(method = -4124444813984143425L)
    private void gn() {
        com.aide.ui.activities.a aVarValueOf;
        try {
            if (qp) {
                iy.gn(-433104281240322048L, this);
            }
            if ((getIntent().getFlags() & 1048576) != 0) {
                return;
            }
            String string = getIntent().getExtras().getString("EXTRA_URL");
            try {
                aVarValueOf = com.aide.ui.activities.a.valueOf(getIntent().getExtras().getString("EXTRA_CAT"));
            } catch (Exception unused) {
                aVarValueOf = com.aide.ui.activities.a.ANDROID_API;
            }
            this.fY = aVarValueOf.XL();
            getActionBar().setSelectedNavigationItem(aVarValueOf.XL());
            this.jw.getSettings().setJavaScriptEnabled(aVarValueOf.aM());
            if (string != null) {
                this.jw.loadUrl(aVarValueOf.J0(string));
            } else {
                this.jw.loadUrl(aVarValueOf.we());
            }
            this.jw.clearHistory();
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, -433104281240322048L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 5707193758910450548L)
    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            if (qp) {
                iy.we(783336897775448625L, this, new Integer(i), new Integer(i2), intent);
            }
            iy.v5(this, i, i2, intent);
            if (i == 1194684) {
                ServiceContainer.XL().g3(intent);
            }
        } catch (Throwable th) {
            if (k2) {
                iy.U2(th, 783336897775448625L, this, new Integer(i), new Integer(i2), intent);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -4423467538325422925L)
    public void onBackPressed() {
        try {
            if (qp) {
                iy.gn(4563051634718463648L, this);
            }
            WebView webView = (WebView) findViewById(q.helpViewWebView);
            if (webView.canGoBack()) {
                webView.goBack();
            } else {
                super.onBackPressed();
            }
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, 4563051634718463648L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.ThemedActionbarActivity, android.app.Activity
    @ey(method = -1243962678627493464L)
    protected void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (qp) {
                iy.tp(-535683229713776625L, this, bundle);
            }
            super.onCreate(bundle);
            requestWindowFeature(5);
            getActionBar().setDisplayShowTitleEnabled(false);
            getActionBar().setNavigationMode(1);
            int length = com.aide.ui.activities.a.QX().length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = com.aide.ui.activities.a.QX()[i].u7();
            }
            getActionBar().setListNavigationCallbacks(new ArrayAdapter(this, R.layout.simple_spinner_dropdown_item, strArr), new a());
            getActionBar().setSelectedNavigationItem(0);
            setTitle("");
            setContentView(r.helpview);
            AndroidHelper.KD(findViewById(q.helpViewFrame));
            setProgressBarIndeterminate(true);
            setProgressBarIndeterminateVisibility(true);
            WebView webView = (WebView) findViewById(q.helpViewWebView);
            this.jw = webView;
            webView.getSettings().setUseWideViewPort(true);
            this.jw.getSettings().setSupportZoom(true);
            this.jw.getSettings().setBuiltInZoomControls(true);
            this.jw.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
            this.jw.setWebViewClient(new b());
            gn();
        } catch (Throwable th) {
            if (k2) {
                iy.j3(th, -535683229713776625L, this, bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 4246883783481954905L)
    protected Dialog onCreateDialog(int i, Bundle bundle) {
        try {
            if (qp) {
                iy.EQ(-2231715049981274736L, this, new Integer(i), bundle);
            }
            return MessageBox.Zo(this, i);
        } catch (Throwable th) {
            if (k2) {
                iy.Mr(th, -2231715049981274736L, this, new Integer(i), bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -4657864625886084984L)
    public boolean onCreateOptionsMenu(Menu menu) {
        try {
            if (qp) {
                iy.tp(6088996351426187619L, this, menu);
            }
            getMenuInflater().inflate(s.help_options_menu, menu);
            return true;
        } catch (Throwable th) {
            if (k2) {
                iy.j3(th, 6088996351426187619L, this, menu);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 654702117366638432L)
    public void onNewIntent(Intent intent) {
        try {
            if (qp) {
                iy.tp(-1676282784356261933L, this, intent);
            }
            iy.XL(this, intent);
            super.onNewIntent(intent);
            setIntent(intent);
            gn();
        } catch (Throwable th) {
            if (k2) {
                iy.j3(th, -1676282784356261933L, this, intent);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -711161859986812251L)
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            if (qp) {
                iy.tp(-8994775112172784L, this, menuItem);
            }
            if (menuItem.getItemId() != 2131230927) {
                return true;
            }
            ServiceContainer.getDownloadService().downloadDocs(this);
            return true;
        } catch (Throwable th) {
            if (k2) {
                iy.j3(th, -8994775112172784L, this, menuItem);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -170068004399276148L)
    protected void onPause() {
        try {
            if (qp) {
                iy.gn(1160595785115516885L, this);
            }
            super.onPause();
            ServiceContainer.Qq(this);
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, 1160595785115516885L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -2112349889550443787L)
    protected void onResume() {
        try {
            if (qp) {
                iy.gn(705312058813936840L, this);
            }
            super.onResume();
            ServiceContainer.x9(this);
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, 705312058813936840L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 10523381429495844L)
    protected void onStart() {
        try {
            if (qp) {
                iy.gn(1315287640735756793L, this);
            }
            super.onStart();
            FireBaseLogEvent.XL(this, "Help");
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, 1315287640735756793L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 2258766971992624912L)
    protected void onStop() {
        try {
            if (qp) {
                iy.gn(-2227506494451904515L, this);
            }
            super.onStop();
            FireBaseLogEvent.DW(this, "Help");
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, -2227506494451904515L, this);
            }
            throw th;
        }
    }
}
