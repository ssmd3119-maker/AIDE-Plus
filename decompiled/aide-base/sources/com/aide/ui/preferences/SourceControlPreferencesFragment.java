package com.aide.ui.preferences;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Bundle;
import android.preference.PreferenceFragment;

@cy(clazz = 603884684380552704L, container = 603884684380552704L, user = true)
/* loaded from: classes.dex */
public class SourceControlPreferencesFragment extends PreferenceFragment {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(SourceControlPreferencesFragment.class);
    }

    @ey(method = -2016149702743741381L)
    public SourceControlPreferencesFragment() {
        try {
            if (WB) {
                iy.gn(1136088310899510247L, null);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, 1136088310899510247L, null);
            }
            throw th;
        }
    }

    @Override // android.preference.PreferenceFragment, android.app.Fragment
    @ey(method = -195769011502148312L)
    public void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (WB) {
                iy.tp(-43311346465784320L, this, bundle);
            }
            super.onCreate(bundle);
            addPreferencesFromResource(2131755017);
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, -43311346465784320L, this, bundle);
            }
            throw th;
        }
    }
}
