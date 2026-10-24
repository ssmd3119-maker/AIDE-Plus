package com.aide.ui.preferences;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import com.aide.ui.ServiceContainer;

@cy(clazz = 3965846732176511403L, container = 3965846732176511403L, user = true)
/* loaded from: classes.dex */
public class EditorPreferencesFragment extends PreferenceFragment {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    @cy(clazz = 295909702281894656L, container = 3965846732176511403L, user = true)
    class a implements Preference.OnPreferenceClickListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 4232004665768325L)
        a() {
        }

        @Override // android.preference.Preference.OnPreferenceClickListener
        @ey(method = 2299810909030169535L)
        public boolean onPreferenceClick(Preference preference) {
            try {
                if (DW) {
                    iy.tp(854338464725193640L, this, preference);
                }
                ServiceContainer.getDownloadService().downloadDocs(EditorPreferencesFragment.this.getActivity());
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 854338464725193640L, this, preference);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(EditorPreferencesFragment.class);
    }

    @ey(method = 595532744819613500L)
    public EditorPreferencesFragment() {
        try {
            if (WB) {
                iy.gn(903393555316363800L, null);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, 903393555316363800L, null);
            }
            throw th;
        }
    }

    @Override // android.preference.PreferenceFragment, android.app.Fragment
    @ey(method = 1687151674749346251L)
    public void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (WB) {
                iy.tp(-323504268133136928L, this, bundle);
            }
            super.onCreate(bundle);
            addPreferencesFromResource(2131755015);
            findPreference("download_doc").setOnPreferenceClickListener(new a());
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, -323504268133136928L, this, bundle);
            }
            throw th;
        }
    }
}
