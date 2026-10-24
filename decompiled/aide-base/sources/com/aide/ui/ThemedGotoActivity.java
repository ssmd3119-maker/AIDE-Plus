package com.aide.ui;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.os.Bundle;

@cy(clazz = 4247642077307360501L, container = 4247642077307360501L, user = true)
/* loaded from: classes.dex */
public class ThemedGotoActivity extends Activity {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(ThemedGotoActivity.class);
    }

    @ey(method = 2405225569470944003L)
    public ThemedGotoActivity() {
        try {
            if (WB) {
                iy.gn(3340893428054152485L, null);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, 3340893428054152485L, null);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 411990763470359000L)
    protected void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (WB) {
                iy.tp(-354388216425018699L, this, bundle);
            }
            super.onCreate(bundle);
            if (AppPreferences.BT()) {
                setTheme(v.ActivityGotoThemeLight);
            } else {
                setTheme(v.ActivityGotoThemeDark);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, -354388216425018699L, this, bundle);
            }
            throw th;
        }
    }
}
