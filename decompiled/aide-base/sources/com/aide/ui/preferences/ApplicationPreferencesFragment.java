package com.aide.ui.preferences;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Bundle;
import android.preference.PreferenceFragment;

@cy(clazz = 230817748208512656L, container = 230817748208512656L, user = true)
/* loaded from: classes.dex */
public class ApplicationPreferencesFragment extends PreferenceFragment {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(ApplicationPreferencesFragment.class);
    }

    @ey(method = -2639383180291473728L)
    public ApplicationPreferencesFragment() {
        try {
            if (WB) {
                iy.gn(1444530355192513143L, null);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, 1444530355192513143L, null);
            }
            throw th;
        }
    }

    @Override // android.preference.PreferenceFragment, android.app.Fragment
    @ey(method = 1231167057235433661L)
    public void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (WB) {
                iy.tp(-383039771141114748L, this, bundle);
            }
            super.onCreate(bundle);
            addPreferencesFromResource(2131755011);
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, -383039771141114748L, this, bundle);
            }
            throw th;
        }
    }
}
