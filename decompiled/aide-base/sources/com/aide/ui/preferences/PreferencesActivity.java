package com.aide.ui.preferences;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import com.aide.common.AndroidHelper;
import com.aide.common.MessageBox;
import com.aide.ui.AppPreferences;
import com.aide.ui.ServiceContainer;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.v;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = 1209871647889365089L, container = 1209871647889365089L, user = true)
/* loaded from: classes.dex */
public class PreferencesActivity extends PreferenceActivity {

    @gy
    private static /* synthetic */ boolean jw;

    @fy
    private static /* synthetic */ boolean mb;

    @dy(field = 2138833426920132512L)
    private List<PreferenceActivity.Header> WB;

    static {
        iy.Zo(PreferencesActivity.class);
    }

    @ey(method = 2558077683209956277L)
    public PreferencesActivity() {
        try {
            if (mb) {
                iy.gn(3939120737506006824L, null);
            }
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, 3939120737506006824L, null);
            }
            throw th;
        }
    }

    @ey(method = -5223682518157907712L)
    public static void DW(Activity activity, int i) {
        try {
            if (mb) {
                iy.EQ(-4607393330273046544L, null, activity, new Integer(i));
            }
            Intent intent = new Intent(activity, (Class<?>) PreferencesActivity.class);
            intent.putExtra("SHOW_PAGE", i);
            j6(activity, intent);
        } catch (Throwable th) {
            if (jw) {
                iy.Mr(th, -4607393330273046544L, null, activity, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -5900985019944986263L)
    private boolean FH(CharSequence charSequence) {
        try {
            if (mb) {
                iy.tp(-4095138341009834079L, this, charSequence);
            }
            if (ServiceContainer.P8.equals("com.aide.web")) {
                return !charSequence.equals("Build & Run");
            }
            return true;
        } catch (Throwable th) {
            if (jw) {
                iy.j3(th, -4095138341009834079L, this, charSequence);
            }
            throw th;
        }
    }

    private static /* synthetic */ void j6(Object obj, Intent intent) {
        ((Activity) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    @Override // android.preference.PreferenceActivity
    @ey(method = -2992513780551721695L)
    protected boolean isValidFragment(String str) {
        try {
            if (!mb) {
                return true;
            }
            iy.tp(-1564595677210407175L, this, str);
            return true;
        } catch (Throwable th) {
            if (jw) {
                iy.j3(th, -1564595677210407175L, this, str);
            }
            throw th;
        }
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    @ey(method = 5600211164312134280L)
    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            if (mb) {
                iy.we(3237834088739566608L, this, new Integer(i), new Integer(i2), intent);
            }
            iy.v5(this, i, i2, intent);
            if (i == 1194684) {
                ServiceContainer.XL().g3(intent);
            }
        } catch (Throwable th) {
            if (jw) {
                iy.U2(th, 3237834088739566608L, this, new Integer(i), new Integer(i2), intent);
            }
            throw th;
        }
    }

    @Override // android.preference.PreferenceActivity
    @ey(method = -1303527729548435704L)
    public void onBuildHeaders(List<PreferenceActivity.Header> list) {
        try {
            if (mb) {
                iy.tp(935316151144422272L, this, list);
            }
            ArrayList arrayList = new ArrayList();
            loadHeadersFromResource(2131755016, arrayList);
            for (PreferenceActivity.Header header : arrayList) {
                if (FH(header.title)) {
                    list.add(header);
                }
            }
            PreferenceActivity.Header header2 = new PreferenceActivity.Header();
            header2.title = "Legal";
            header2.summary = "Show legal information.";
            header2.intent = new Intent(this, (Class<?>) AboutActivity.class);
            list.add(header2);
            this.WB = list;
        } catch (Throwable th) {
            if (jw) {
                iy.j3(th, 935316151144422272L, this, list);
            }
            throw th;
        }
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    @ey(method = 670402067313823104L)
    protected void onCreate(Bundle bundle) {
        int intExtra;
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (mb) {
                iy.tp(-200987216110364256L, this, bundle);
            }
            if (AppPreferences.BT()) {
                setTheme(v.ActivityPreferencesThemeLight);
            } else {
                setTheme(v.ActivityPreferencesThemeDark);
            }
            super.onCreate(bundle);
            if (getIntent() != null && (intExtra = getIntent().getIntExtra("SHOW_PAGE", -1)) >= 0 && this.WB != null) {
                onHeaderClick(this.WB.get(intExtra), intExtra);
            }
            AndroidHelper.SI(this);
        } catch (Throwable th) {
            if (jw) {
                iy.j3(th, -200987216110364256L, this, bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -2421240168201701265L)
    protected Dialog onCreateDialog(int i, Bundle bundle) {
        try {
            if (mb) {
                iy.EQ(-3916883046373539609L, this, new Integer(i), bundle);
            }
            return MessageBox.Zo(this, i);
        } catch (Throwable th) {
            if (jw) {
                iy.Mr(th, -3916883046373539609L, this, new Integer(i), bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 3580085294236449320L)
    protected void onStart() {
        try {
            if (mb) {
                iy.gn(-1373588513164686000L, this);
            }
            super.onStart();
            ServiceContainer.x9(this);
            FireBaseLogEvent.XL(this, "Preferences");
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, -1373588513164686000L, this);
            }
            throw th;
        }
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    @ey(method = -326931537872030220L)
    protected void onStop() {
        try {
            if (mb) {
                iy.gn(-1387940012362320732L, this);
            }
            super.onStop();
            ServiceContainer.Qq(this);
            FireBaseLogEvent.DW(this, "Preferences");
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, -1387940012362320732L, this);
            }
            throw th;
        }
    }
}
