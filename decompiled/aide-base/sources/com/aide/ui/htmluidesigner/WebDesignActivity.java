package com.aide.ui.htmluidesigner;

import abcd.b0;
import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.SoundPool;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.Html;
import android.text.format.Formatter;
import android.util.Log;
import android.view.View;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.aide.common.AndroidHelper;
import com.aide.common.MessageBox;
import com.aide.common.TextToSpeechHelper;
import com.aide.common.ValueRunnable;
import com.aide.ui.AppPreferences;
import com.aide.ui.ServiceContainer;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.m;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.t;
import com.aide.ui.trainer.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@cy(clazz = -3499094272017024501L, container = -3499094272017024501L, user = true)
/* loaded from: classes.dex */
public class WebDesignActivity extends Activity {

    @gy
    private static /* synthetic */ boolean AL;

    @dy(field = 6577032889972560872L)
    private static boolean k2;

    @fy
    private static /* synthetic */ boolean zh;

    @dy(field = 4966628203112386280L)
    private m WB;

    @dy(field = 309005370924587264L)
    private int fY;

    @dy(field = -2718664421428973211L)
    private SoundPool jw;

    @dy(field = -1684814670795789999L)
    private WebView mb;

    @dy(field = -1313135296908675915L)
    private TextToSpeechHelper qp;

    @cy(clazz = -4405686351372270912L, container = -3499094272017024501L, user = true)
    static /* synthetic */ class a {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -1378535620126565712L)
        static final /* synthetic */ int[] j6;

        static {
            try {
                iy.Zo(a.class);
                if (DW) {
                    iy.gn(3349045995288234592L, null);
                }
                int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
                j6 = iArr;
                try {
                    iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    j6[ConsoleMessage.MessageLevel.TIP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    j6[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    j6[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    j6[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 3349045995288234592L, null);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3746258064732471756L, container = -3499094272017024501L, user = true)
    class b implements b0 {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 87310832137400000L)
        b() {
        }

        @Override // abcd.b0
        @ey(method = 6670883022252783863L)
        public boolean j6() {
            try {
                if (DW) {
                    iy.gn(183966795182022160L, this);
                }
                return AppPreferences.ef(WebDesignActivity.this);
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 183966795182022160L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3746342602727933733L, container = -3499094272017024501L, user = true)
    class c implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -118689845383047765L)
        c() {
        }

        @Override // android.view.View.OnClickListener
        @ey(method = -12839078862336773L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(821727819552973251L, this, view);
                }
                WebDesignActivity.this.VH();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, 821727819552973251L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3746427140719332416L, container = -3499094272017024501L, user = true)
    class d implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -44695803528100096L)
        d() {
        }

        @Override // java.lang.Runnable
        @ey(method = -2044489348268516001L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(2449826315172788244L, this);
                }
                Intent intent = new Intent();
                intent.putExtra("EXTRA_TRAINER_ACTION", true);
                WebDesignActivity.this.setResult(-1, intent);
                WebDesignActivity.this.finish();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 2449826315172788244L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3746511678706667805L, container = -3499094272017024501L, user = true)
    class e implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 2877232752298497329L)
        final /* synthetic */ Runnable WB;

        static {
            iy.Zo(e.class);
        }

        @ey(method = -149623581867697200L)
        e(Runnable runnable) {
            this.WB = runnable;
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 448738181764005987L)
        public void onClick(View view) {
            try {
                if (jw) {
                    iy.tp(-1659046243243505772L, this, view);
                }
                this.WB.run();
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, -1659046243243505772L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3746596216689939900L, container = -3499094272017024501L, user = true)
    class f extends TranslateAnimation {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 3695449023926833784L)
        final /* synthetic */ View WB;

        static {
            iy.Zo(f.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 725415448211198113L)
        f(float f, float f2, float f3, float f4, View view) {
            super(f, f2, f3, f4);
            this.WB = view;
        }

        @Override // android.view.animation.TranslateAnimation, android.view.animation.Animation
        @ey(method = -1849022437808867244L)
        protected void applyTransformation(float f, Transformation transformation) {
            try {
                if (jw) {
                    iy.EQ(782248899753013056L, this, new Float(f), transformation);
                }
                super.applyTransformation(f, transformation);
                this.WB.invalidate();
            } catch (Throwable th) {
                if (fY) {
                    iy.Mr(th, 782248899753013056L, this, new Float(f), transformation);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3746680754669148701L, container = -3499094272017024501L, user = true)
    static class g implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = -579646801284004524L)
        final /* synthetic */ Context WB;

        static {
            iy.Zo(g.class);
        }

        @ey(method = -27286333531482080L)
        g(Context context) {
            this.WB = context;
        }

        @Override // java.lang.Runnable
        @ey(method = -93043306573545592L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-2487501988396112309L, this);
                }
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -v threadtime").getInputStream()), 20);
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            return;
                        }
                        if (line.contains("console.log")) {
                            Intent intent = new Intent();
                            intent.setPackage("com.aide.ui");
                            intent.setAction("com.aide.runtime.VIEW_LOGCAT_ENTRY");
                            intent.putExtra("lines", new String[]{line});
                            this.WB.sendBroadcast(intent);
                        }
                    }
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -2487501988396112309L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3746765292644294208L, container = -3499094272017024501L, user = true)
    class h extends WebView {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(h.class);
        }

        @ey(method = -5970152169956410839L)
        h(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        @ey(method = -657611775461375628L)
        protected void onScrollChanged(int i, int i2, int i3, int i4) {
            try {
                if (mb) {
                    iy.J0(4155292460117247545L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                super.onScrollChanged(i, i2, i3, i4);
                if (i2 == 0 && i4 > 0) {
                    WebDesignActivity.this.WB.FH(true);
                } else if (i2 > 0) {
                    WebDesignActivity.this.WB.FH(false);
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.a8(th, 4155292460117247545L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3746849830615376421L, container = -3499094272017024501L, user = true)
    class i extends WebViewClient {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(i.class);
        }

        @ey(method = -51910153149111831L)
        i() {
        }

        private static /* synthetic */ void j6(Object obj, Intent intent) {
            ((WebDesignActivity) obj).startActivity(intent);
            iy.BT(obj, intent);
        }

        @Override // android.webkit.WebViewClient
        @ey(method = 5471001393546355796L)
        public void onPageFinished(WebView webView, String str) {
            try {
                if (DW) {
                    iy.EQ(4183806540953912584L, this, webView, str);
                }
                super.onPageFinished(webView, str);
                if (WebDesignActivity.this.J8()) {
                    WebDesignActivity.this.XL();
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 4183806540953912584L, this, webView, str);
                }
                throw th;
            }
        }

        @Override // android.webkit.WebViewClient
        @ey(method = -4915973142547744908L)
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            try {
                if (DW) {
                    iy.EQ(3822537109747323856L, this, webView, str);
                }
                if (str.startsWith(WebDesignActivity.we())) {
                    return false;
                }
                j6(WebDesignActivity.this, new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 3822537109747323856L, this, webView, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3746934368582395340L, container = -3499094272017024501L, user = true)
    class j extends WebChromeClient {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @cy(clazz = 1074880532275067307L, container = -3499094272017024501L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            @dy(field = -3259164193629838117L)
            final /* synthetic */ JsResult WB;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 521213295421993808L)
            a(j jVar, JsResult jsResult) {
                this.WB = jsResult;
            }

            @Override // java.lang.Runnable
            @ey(method = 645707047415835597L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-5156911790469373092L, this);
                    }
                    this.WB.confirm();
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -5156911790469373092L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1074900724632924000L, container = -3499094272017024501L, user = true)
        class b implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            @dy(field = 4568491986921324000L)
            final /* synthetic */ JsResult WB;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 163409247384660499L)
            b(j jVar, JsResult jsResult) {
                this.WB = jsResult;
            }

            @Override // java.lang.Runnable
            @ey(method = 789952750991647500L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-5153387546541458483L, this);
                    }
                    this.WB.confirm();
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -5153387546541458483L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1074920916994843987L, container = -3499094272017024501L, user = true)
        class c implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            @dy(field = 347041627501699776L)
            final /* synthetic */ JsResult WB;

            static {
                iy.Zo(c.class);
            }

            @ey(method = -47946761005178435L)
            c(j jVar, JsResult jsResult) {
                this.WB = jsResult;
            }

            @Override // java.lang.Runnable
            @ey(method = -2697388097892029232L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-5149862818420718784L, this);
                    }
                    this.WB.cancel();
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -5149862818420718784L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1074941109360827268L, container = -3499094272017024501L, user = true)
        class d implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            @dy(field = -3239460162366258520L)
            final /* synthetic */ JsResult WB;

            static {
                iy.Zo(d.class);
            }

            @ey(method = 441387150599154869L)
            d(j jVar, JsResult jsResult) {
                this.WB = jsResult;
            }

            @Override // java.lang.Runnable
            @ey(method = 2315834711352482040L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-5146337606107153995L, this);
                    }
                    this.WB.cancel();
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -5146337606107153995L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1074961301730873843L, container = -3499094272017024501L, user = true)
        class e implements ValueRunnable<String> {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            @dy(field = 847830868755169093L)
            final /* synthetic */ JsPromptResult j6;

            static {
                iy.Zo(e.class);
            }

            @ey(method = 514265436132483336L)
            e(j jVar, JsPromptResult jsPromptResult) {
                this.j6 = jsPromptResult;
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = 5776161945947983257L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(String str) {
                try {
                    if (DW) {
                        iy.tp(5000570505618138840L, this, str);
                    }
                    this.j6.confirm(str);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 5000570505618138840L, this, str);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1074981494104983712L, container = -3499094272017024501L, user = true)
        class f implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            @dy(field = 1780758640264836519L)
            final /* synthetic */ JsPromptResult WB;

            static {
                iy.Zo(f.class);
            }

            @ey(method = 222897944168633260L)
            f(j jVar, JsPromptResult jsPromptResult) {
                this.WB = jsPromptResult;
            }

            @Override // java.lang.Runnable
            @ey(method = -406622161014985551L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-5142811909600764116L, this);
                    }
                    this.WB.cancel();
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -5142811909600764116L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(j.class);
        }

        @ey(method = 74530296558141644L)
        j() {
        }

        @Override // android.webkit.WebChromeClient
        @ey(method = -2014706269434322863L)
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            try {
                if (DW) {
                    iy.tp(-64329166240410464L, this, consoleMessage);
                }
                int i = a.j6[consoleMessage.messageLevel().ordinal()];
                if (i == 3) {
                    Log.d("console.log", consoleMessage.message());
                    return true;
                }
                if (i == 4) {
                    Log.e("console.log", consoleMessage.message());
                    return true;
                }
                if (i != 5) {
                    Log.i("console.log", consoleMessage.message());
                    return true;
                }
                Log.w("console.log", consoleMessage.message());
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -64329166240410464L, this, consoleMessage);
                }
                throw th;
            }
        }

        @Override // android.webkit.WebChromeClient
        @ey(method = -2925631351221743685L)
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            try {
                if (DW) {
                    iy.J0(6028504839843014140L, this, webView, str, str2, jsResult);
                }
                MessageBox.ei(WebDesignActivity.this, null, str2, new a(this, jsResult));
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, 6028504839843014140L, this, webView, str, str2, jsResult);
                }
                throw th;
            }
        }

        @Override // android.webkit.WebChromeClient
        @ey(method = -5335534847409547795L)
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            try {
                if (DW) {
                    iy.J0(1846931186399642184L, this, webView, str, str2, jsResult);
                }
                MessageBox.yS(WebDesignActivity.this, null, str2, "Ok", new b(this, jsResult), "Cancel", new c(this, jsResult), new d(this, jsResult));
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, 1846931186399642184L, this, webView, str, str2, jsResult);
                }
                throw th;
            }
        }

        @Override // android.webkit.WebChromeClient
        @ey(method = -6101972117426808133L)
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            try {
                if (DW) {
                    iy.J8(-6408234271488165328L, this, webView, str, str2, str3, jsPromptResult);
                }
                MessageBox.j3(WebDesignActivity.this, null, str2, str3, new e(this, jsPromptResult), new f(this, jsPromptResult));
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.lg(th, -6408234271488165328L, this, webView, str, str2, str3, jsPromptResult);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 38387212539063993L, container = 38387212539063993L, user = true)
    private static class k extends MessageBox {

        @fy
        private static /* synthetic */ boolean AL;

        @gy
        private static /* synthetic */ boolean w9;

        @dy(field = -2376394068490292307L)
        private String k2;

        @dy(field = -2382867821182742457L)
        private String zh;

        @cy(clazz = 1714142117894140152L, container = 38387212539063993L, user = true)
        class a implements View.OnClickListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -2721328845159873509L)
            final /* synthetic */ Activity WB;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 5367652963010725717L)
            a(Activity activity) {
                this.WB = activity;
            }

            private static /* synthetic */ void j6(Object obj, Intent intent) {
                ((Activity) obj).startActivity(intent);
                iy.BT(obj, intent);
            }

            @Override // android.view.View.OnClickListener
            @ey(method = 2709414434374600596L)
            public void onClick(View view) {
                try {
                    if (jw) {
                        iy.tp(2157579063481270471L, this, view);
                    }
                    j6(this.WB, new Intent("android.intent.action.VIEW", Uri.parse(k.this.k2)));
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 2157579063481270471L, this, view);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1714274317547483789L, container = 38387212539063993L, user = true)
        class b implements DialogInterface.OnClickListener {

            @fy
            private static /* synthetic */ boolean WB;

            @gy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = -8058774375981162028L)
            b(k kVar) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = -5478199116684848488L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (WB) {
                        iy.EQ(1217312236897806285L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                } catch (Throwable th) {
                    if (mb) {
                        iy.Mr(th, 1217312236897806285L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1714406517204890720L, container = 38387212539063993L, user = true)
        class c implements DialogInterface.OnCancelListener {

            @fy
            private static /* synthetic */ boolean WB;

            @gy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(c.class);
            }

            @ey(method = 3281584085411329440L)
            c(k kVar) {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            @ey(method = -625235851683802953L)
            public void onCancel(DialogInterface dialogInterface) {
                try {
                    if (WB) {
                        iy.tp(719685214074649264L, this, dialogInterface);
                    }
                    dialogInterface.dismiss();
                } catch (Throwable th) {
                    if (mb) {
                        iy.j3(th, 719685214074649264L, this, dialogInterface);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(k.class);
        }

        @ey(method = -149569162899669693L)
        public k(String str, String str2) {
            try {
                if (AL) {
                    iy.EQ(-2901061174046266013L, null, str, str2);
                }
                this.k2 = str2;
                this.zh = str;
            } catch (Throwable th) {
                if (w9) {
                    iy.Mr(th, -2901061174046266013L, null, str, str2);
                }
                throw th;
            }
        }

        @Override // com.aide.common.MessageBox
        @ey(method = -2070628545634662144L)
        protected Dialog Hw(Activity activity) {
            try {
                if (AL) {
                    iy.tp(-1199774234025757488L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                TextView textView = new TextView(activity);
                textView.setText(Html.fromHtml(this.zh + "<br/><br/><a href='" + this.k2 + "'>" + this.k2 + "</a><br/>"));
                textView.setOnClickListener(new a(activity));
                textView.setTextIsSelectable(true);
                int i = (int) (activity.getResources().getDisplayMetrics().density * 10.0f);
                textView.setPadding(i, i, i, i);
                textView.setTextSize(16.0f);
                builder.setTitle("Cast website").setView(textView).setCancelable(true);
                builder.setPositiveButton("Ok", new b(this));
                builder.setOnCancelListener(new c(this));
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setCanceledOnTouchOutside(true);
                return alertDialogCreate;
            } catch (Throwable th) {
                if (w9) {
                    iy.j3(th, -1199774234025757488L, this, activity);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(WebDesignActivity.class);
    }

    @ey(method = -944882126654414949L)
    public WebDesignActivity() {
        try {
            if (zh) {
                iy.gn(-5953242354169964285L, null);
            }
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, -5953242354169964285L, null);
            }
            throw th;
        }
    }

    @ey(method = -2558788555575818880L)
    private static String EQ(String str) {
        try {
            if (zh) {
                iy.tp(-7427145648992777001L, null, str);
            }
            return "http://" + str + ":8099";
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, -7427145648992777001L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -3131291178940568589L)
    private static String J0(String str, String str2) {
        try {
            if (zh) {
                iy.EQ(1872629192254666108L, null, str, str2);
            }
            String strWe = we();
            if (str2 != null) {
                if (str2.startsWith(str + "/")) {
                    String strSubstring = str2.substring(str.length(), str2.length());
                    if (strSubstring.equals("/index.html")) {
                        return strWe;
                    }
                    return strWe + strSubstring;
                }
            }
            return strWe;
        } catch (Throwable th) {
            if (AL) {
                iy.Mr(th, 1872629192254666108L, null, str, str2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -131022295859982840L)
    public boolean J8() {
        try {
            if (zh) {
                iy.gn(1603331555027750733L, this);
            }
            return getIntent().getBooleanExtra("EXTRA_TRAINER", false);
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, 1603331555027750733L, this);
            }
            throw th;
        }
    }

    @ey(method = -6075846064532336216L)
    public static void QX(Activity activity, String str, String str2, int i2) {
        try {
            if (zh) {
                iy.J0(2918971442360294453L, null, activity, str, str2, new Integer(i2));
            }
            Intent intent = new Intent(activity, (Class<?>) WebDesignActivity.class);
            intent.putExtra("EXTRA_FILE", str2);
            intent.putExtra("EXTRA_ROOTDIR", str);
            if (i2 == 0 || !ServiceContainer.isTrainerMode()) {
                intent.addFlags(268435456);
                intent.addFlags(4096);
                intent.addFlags(134217728);
                j6(activity, intent);
                return;
            }
            c.b bVarJ3 = ServiceContainer.ro().j3();
            c.e eVarMr = ServiceContainer.ro().Mr();
            intent.putExtra("EXTRA_TRAINER", true);
            intent.putExtra("EXTRA_SOUND", AppPreferences.J8());
            intent.putExtra("EXTRA_SPEAK", AppPreferences.Ws());
            intent.putExtra("EXTRA_HEADER", bVarJ3.XL());
            intent.putExtra("EXTRA_TRAINER_LOCALE", eVarMr.VH());
            intent.putExtra("EXTRA_TRAINER_OUTPUT", eVarMr.Zo());
            intent.putExtra("EXTRA_TRAINER_FAIL", eVarMr.tp());
            intent.putExtra("EXTRA_TRAINER_FAIL_BUTTON", ServiceContainer.ro().lg());
            intent.putExtra("EXTRA_TRAINER_SUCCESS", eVarMr.J8());
            intent.putExtra("EXTRA_TRAINER_FAIL_TITLE", ServiceContainer.ro().rN());
            intent.putExtra("EXTRA_TRAINER_SUCCESS_TITLE", ServiceContainer.ro().yS());
            intent.putExtra("EXTRA_TRAINER_SUCCESS_BUTTON", ServiceContainer.ro().BT());
            activity.startActivityForResult(intent, i2);
        } catch (Throwable th) {
            if (AL) {
                iy.a8(th, 2918971442360294453L, null, activity, str, str2, new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 2879326529423927345L)
    public void VH() {
        try {
            if (zh) {
                iy.gn(1556292254019140232L, this);
            }
            try {
                String strWe = we();
                String url = this.mb.getUrl();
                if (!url.startsWith(strWe)) {
                    MessageBox.gW(this, new k("Click the url to open the website in a browser:", url));
                    return;
                }
                WifiInfo connectionInfo = ((WifiManager) getSystemService("wifi")).getConnectionInfo();
                if (connectionInfo == null || connectionInfo.getIpAddress() == 0) {
                    MessageBox.gW(this, new k("Click the url to open the website in a browser. Connect to WiFi to view it on other devices & computers!", url));
                    return;
                }
                String ssid = connectionInfo.getSSID();
                MessageBox.gW(this, new k("On other devices & computers connected to WiFi " + ssid + " open this url in a browser:", EQ(Formatter.formatIpAddress(connectionInfo.getIpAddress())) + url.substring(strWe.length(), url.length())));
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, 1556292254019140232L, this);
            }
            throw th;
        }
    }

    @ey(method = 66725981216540235L)
    private void Ws() {
        try {
            if (zh) {
                iy.gn(-1618281148865463480L, this);
            }
            if ((getIntent().getFlags() & 1048576) == 0) {
                String string = getIntent().getExtras().getString("EXTRA_FILE");
                String string2 = getIntent().getExtras().getString("EXTRA_ROOTDIR");
                com.aide.ui.htmluidesigner.a.gn(string2);
                String strJ0 = J0(string2, string);
                this.mb.clearCache(true);
                this.mb.loadUrl(strJ0);
            }
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, -1618281148865463480L, this);
            }
            throw th;
        }
    }

    @ey(method = 3451948554442587264L)
    private static void Zo(Context context) {
        try {
            if (zh) {
                iy.tp(-4442935562221138605L, null, context);
            }
            if (k2) {
                return;
            }
            k2 = true;
            new Thread(new g(context)).start();
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, -4442935562221138605L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 1313535455702950312L)
    private void aM(String str, String str2, String str3, Runnable runnable) {
        try {
            if (zh) {
                iy.J0(639433531962649685L, this, str, str2, str3, runnable);
            }
            View viewFindViewById = findViewById(q.webpreviewHeaderLearnTask);
            viewFindViewById.setVisibility(4);
            TextView textView = (TextView) viewFindViewById.findViewById(q.webpreviewHeaderLearnMessage);
            TextView textView2 = (TextView) viewFindViewById.findViewById(q.webpreviewHeaderLearnTitle);
            TextView textView3 = (TextView) viewFindViewById.findViewById(q.webpreviewHeaderButton);
            if (str2.length() == 0) {
                textView.setVisibility(8);
            } else {
                textView.setText(Html.fromHtml(str2));
            }
            textView2.setText(str);
            textView3.setText(str3);
            textView2.setTextSize(AndroidHelper.J0(this));
            textView.setTextSize(AndroidHelper.J8(this));
            textView3.setTextSize(AndroidHelper.tp(this));
            viewFindViewById.findViewById(q.webpreviewHeaderLearnTaskInner).setOnClickListener(new e(runnable));
            textView.getLayoutParams().width = AndroidHelper.gn(this);
            textView.requestLayout();
            viewFindViewById.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        } catch (Throwable th) {
            if (AL) {
                iy.a8(th, 639433531962649685L, this, str, str2, str3, runnable);
            }
            throw th;
        }
    }

    @ey(method = -1458319245334160300L)
    private WebView gn() {
        try {
            if (zh) {
                iy.gn(2053900376652388495L, this);
            }
            h hVar = new h(this);
            this.mb = hVar;
            hVar.setInitialScale(100);
            this.mb.setVerticalScrollBarEnabled(false);
            this.mb.getSettings().setJavaScriptEnabled(true);
            this.mb.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            this.mb.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            if (J8()) {
                this.mb.getSettings().setDefaultFontSize(50);
            }
            this.mb.setBackgroundColor(-1);
            this.mb.setWebViewClient(new i());
            this.mb.setWebChromeClient(new j());
            Ws();
            return this.mb;
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, 2053900376652388495L, this);
            }
            throw th;
        }
    }

    private static /* synthetic */ void j6(Object obj, Intent intent) {
        ((Activity) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    @ey(method = 870793874919017181L)
    private boolean tp() {
        try {
            if (zh) {
                iy.gn(-1975681526819419692L, this);
            }
            return getIntent().getBooleanExtra("EXTRA_SPEAK", false);
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, -1975681526819419692L, this);
            }
            throw th;
        }
    }

    @ey(method = 582755054678652556L)
    private boolean u7() {
        try {
            if (zh) {
                iy.gn(-2263785667772760911L, this);
            }
            return getIntent().getBooleanExtra("EXTRA_SOUND", true);
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, -2263785667772760911L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 5726675564485915300L)
    public static String we() {
        try {
            if (!zh) {
                return "http://localhost:8099";
            }
            iy.gn(-2407819341255377881L, null);
            return "http://localhost:8099";
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, -2407819341255377881L, null);
            }
            throw th;
        }
    }

    @ey(method = 3747395533637398641L)
    protected void XL() {
        try {
            if (zh) {
                iy.gn(1814892078833058000L, this);
            }
            if (u7()) {
                this.jw.play(this.fY, 1.0f, 1.0f, 0, 0, 1.0f);
            }
            if (tp()) {
                this.qp.Hw(getIntent().getStringExtra("EXTRA_TRAINER_LOCALE"), getIntent().getStringExtra("EXTRA_TRAINER_SUCCESS"));
            }
            View viewFindViewById = findViewById(q.webpreviewHeaderLearnTask);
            viewFindViewById.setVisibility(0);
            f fVar = new f(0.0f, 0.0f, -(getResources().getDisplayMetrics().density * 150.0f), 0.0f, viewFindViewById);
            fVar.setDuration(500L);
            viewFindViewById.startAnimation(fVar);
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, 1814892078833058000L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -238370663926711912L)
    protected void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (zh) {
                iy.tp(-76625178632247691L, this, bundle);
            }
            super.onCreate(bundle);
            if (!FireBaseLogEvent.gn()) {
                FireBaseLogEvent.Zo(this, new b());
            }
            setContentView(r.webpreview);
            m mVar = new m(this, q.webpreviewMasterButton);
            this.WB = mVar;
            mVar.FH(true);
            this.WB.DW(new c());
            if (J8()) {
                aM(getIntent().getStringExtra("EXTRA_TRAINER_SUCCESS_TITLE"), getIntent().getStringExtra("EXTRA_TRAINER_SUCCESS"), getIntent().getStringExtra("EXTRA_TRAINER_SUCCESS_BUTTON"), new d());
                SoundPool soundPool = new SoundPool(1, 3, 0);
                this.jw = soundPool;
                this.fY = soundPool.load(this, t.success_task, 1);
                this.jw.load(this, t.fail, 1);
                this.qp = new TextToSpeechHelper(this);
            }
            gn();
            ((LinearLayout) findViewById(q.webpreviewContainer)).addView(this.mb);
            Zo(getApplicationContext());
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, -76625178632247691L, this, bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 1634571109133628921L)
    protected Dialog onCreateDialog(int i2, Bundle bundle) {
        try {
            if (zh) {
                iy.EQ(1763781467364598428L, this, new Integer(i2), bundle);
            }
            return MessageBox.Zo(this, i2);
        } catch (Throwable th) {
            if (AL) {
                iy.Mr(th, 1763781467364598428L, this, new Integer(i2), bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 1333210020815262268L)
    public void onNewIntent(Intent intent) {
        try {
            if (zh) {
                iy.tp(-2017283692228724775L, this, intent);
            }
            iy.XL(this, intent);
            super.onNewIntent(intent);
            setIntent(intent);
            Ws();
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, -2017283692228724775L, this, intent);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -1143911317196569920L)
    protected void onStart() {
        try {
            if (zh) {
                iy.gn(-260415272884044105L, this);
            }
            super.onStart();
            FireBaseLogEvent.XL(this, "Web Designer");
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, -260415272884044105L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 2604483284993757264L)
    protected void onStop() {
        try {
            if (zh) {
                iy.gn(798557868445315083L, this);
            }
            super.onStop();
            FireBaseLogEvent.DW(this, "Web Designer");
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, 798557868445315083L, this);
            }
            throw th;
        }
    }
}
