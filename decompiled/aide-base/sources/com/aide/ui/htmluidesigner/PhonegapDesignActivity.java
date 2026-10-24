package com.aide.ui.htmluidesigner;

import abcd.b0;
import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.aide.ui.AppPreferences;
import com.aide.ui.firebase.FireBaseLogEvent;

@cy(clazz = -3819489023773623435L, container = -3819489023773623435L, user = true)
/* loaded from: classes.dex */
public class PhonegapDesignActivity extends Activity {

    @gy
    private static /* synthetic */ boolean jw;

    @fy
    private static /* synthetic */ boolean mb;

    @dy(field = -2118546787433442948L)
    private WebView WB;

    @cy(clazz = 435155823991944384L, container = -3819489023773623435L, user = true)
    class a implements b0 {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -320810206413229127L)
        a() {
        }

        @Override // abcd.b0
        @ey(method = -461269356162505048L)
        public boolean j6() {
            try {
                if (DW) {
                    iy.gn(1844470723134245824L, this);
                }
                return AppPreferences.ef(PhonegapDesignActivity.this);
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 1844470723134245824L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(PhonegapDesignActivity.class);
    }

    @ey(method = 3307445713559926636L)
    public PhonegapDesignActivity() {
        try {
            if (mb) {
                iy.gn(2036479928903706065L, null);
            }
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, 2036479928903706065L, null);
            }
            throw th;
        }
    }

    @ey(method = -2740073540735548779L)
    private void DW() {
        try {
            if (mb) {
                iy.gn(3085680960900936455L, this);
            }
            if ((getIntent().getFlags() & 1048576) == 0) {
                this.WB.clearCache(true);
                String string = getIntent().getExtras().getString("EXTRA_URL");
                if (string != null) {
                    this.WB.loadUrl(string);
                }
            }
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, 3085680960900936455L, this);
            }
            throw th;
        }
    }

    @ey(method = 1554325895900103000L)
    public static void FH(Activity activity, String str, String str2) {
        try {
            if (mb) {
                iy.we(163252865464706220L, null, activity, str, str2);
            }
            Intent intent = new Intent(activity, (Class<?>) PhonegapDesignActivity.class);
            intent.putExtra("EXTRA_URL", "file://" + str2);
            intent.setFlags(268435456);
            j6(activity, intent);
        } catch (Throwable th) {
            if (jw) {
                iy.U2(th, 163252865464706220L, null, activity, str, str2);
            }
            throw th;
        }
    }

    private static /* synthetic */ void j6(Object obj, Intent intent) {
        ((Activity) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    @Override // android.app.Activity
    @ey(method = 787859878540190691L)
    protected void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (mb) {
                iy.tp(524450409897726181L, this, bundle);
            }
            super.onCreate(bundle);
            if (!FireBaseLogEvent.gn()) {
                FireBaseLogEvent.Zo(this, new a());
            }
            WebView webView = new WebView(this);
            this.WB = webView;
            webView.setInitialScale(100);
            this.WB.setVerticalScrollBarEnabled(false);
            this.WB.getSettings().setJavaScriptEnabled(true);
            this.WB.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
            this.WB.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            setContentView(this.WB);
            DW();
        } catch (Throwable th) {
            if (jw) {
                iy.j3(th, 524450409897726181L, this, bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -2570021575421567885L)
    public void onNewIntent(Intent intent) {
        try {
            if (mb) {
                iy.tp(-2679739936008478299L, this, intent);
            }
            iy.XL(this, intent);
            super.onNewIntent(intent);
            setIntent(intent);
            DW();
        } catch (Throwable th) {
            if (jw) {
                iy.j3(th, -2679739936008478299L, this, intent);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 2730646647400399913L)
    protected void onStart() {
        try {
            if (mb) {
                iy.gn(-2524838546532506373L, this);
            }
            super.onStart();
            FireBaseLogEvent.XL(this, "PhoneGap Designer");
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, -2524838546532506373L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 307659191933929745L)
    protected void onStop() {
        try {
            if (mb) {
                iy.gn(-482060580728971405L, this);
            }
            super.onStop();
            FireBaseLogEvent.DW(this, "PhoneGap Designer");
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, -482060580728971405L, this);
            }
            throw th;
        }
    }
}
