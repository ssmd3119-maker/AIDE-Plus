package com.aide.ui.preferences;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Bundle;
import android.preference.PreferenceFragment;

@cy(clazz = 631692062087055200L, container = 631692062087055200L, user = true)
/* loaded from: classes.dex */
public class CodestylePreferencesFragment extends PreferenceFragment {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(CodestylePreferencesFragment.class);
    }

    @ey(method = -2119772858750031912L)
    public CodestylePreferencesFragment() {
        try {
            if (WB) {
                iy.gn(-1405633209821580960L, null);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, -1405633209821580960L, null);
            }
            throw th;
        }
    }

    @Override // android.preference.PreferenceFragment, android.app.Fragment
    @ey(method = 1318332402541472413L)
    public void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (WB) {
                iy.tp(-44788906499922977L, this, bundle);
            }
            super.onCreate(bundle);
            addPreferencesFromResource(2131755012);
            a.j6(getActivity(), getPreferenceScreen());
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, -44788906499922977L, this, bundle);
            }
            throw th;
        }
    }
}
