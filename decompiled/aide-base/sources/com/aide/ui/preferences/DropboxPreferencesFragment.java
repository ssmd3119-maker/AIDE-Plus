package com.aide.ui.preferences;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Bundle;
import android.preference.PreferenceFragment;

@cy(clazz = -6418246184154536012L, container = -6418246184154536012L, user = true)
/* loaded from: classes.dex */
public class DropboxPreferencesFragment extends PreferenceFragment {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(DropboxPreferencesFragment.class);
    }

    @ey(method = 954101925487344777L)
    public DropboxPreferencesFragment() {
        try {
            if (WB) {
                iy.gn(-1706966127440587684L, null);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, -1706966127440587684L, null);
            }
            throw th;
        }
    }

    @Override // android.preference.PreferenceFragment, android.app.Fragment
    @ey(method = -379275670037860976L)
    public void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (WB) {
                iy.tp(-232259163942833541L, this, bundle);
            }
            super.onCreate(bundle);
            addPreferencesFromResource(2131755014);
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, -232259163942833541L, this, bundle);
            }
            throw th;
        }
    }
}
