package com.aide.ui;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.os.Bundle;

@cy(clazz = -4456629414723018663L, container = -4456629414723018663L, user = true)
/* loaded from: classes.dex */
public class ThemedActionbarActivity extends Activity {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(ThemedActionbarActivity.class);
    }

    @ey(method = -623532872456356825L)
    public ThemedActionbarActivity() {
        try {
            if (WB) {
                iy.gn(-120788558597239029L, null);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, -120788558597239029L, null);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -522820737250018032L)
    protected void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (WB) {
                iy.tp(-416932958122956149L, this, bundle);
            }
            super.onCreate(bundle);
            if (AppPreferences.BT()) {
                setTheme(v.ActivityActionbarThemeLight);
            } else {
                setTheme(v.ActivityActionbarThemeDark);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, -416932958122956149L, this, bundle);
            }
            throw th;
        }
    }
}
