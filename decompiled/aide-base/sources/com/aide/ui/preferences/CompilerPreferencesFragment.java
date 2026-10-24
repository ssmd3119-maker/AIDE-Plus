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

@cy(clazz = -428726247933224307L, container = -428726247933224307L, user = true)
/* loaded from: classes.dex */
public class CompilerPreferencesFragment extends PreferenceFragment {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    @cy(clazz = 1948674964407329400L, container = -428726247933224307L, user = true)
    class a implements Preference.OnPreferenceClickListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 207240047804362197L)
        a() {
        }

        @Override // android.preference.Preference.OnPreferenceClickListener
        @ey(method = -5457426926717136700L)
        public boolean onPreferenceClick(Preference preference) {
            try {
                if (DW) {
                    iy.tp(619451628614520645L, this, preference);
                }
                ServiceContainer.j3().u7(CompilerPreferencesFragment.this.getActivity());
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 619451628614520645L, this, preference);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1948815317632948041L, container = -428726247933224307L, user = true)
    class b implements Preference.OnPreferenceClickListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 341210631419188515L)
        b() {
        }

        @Override // android.preference.Preference.OnPreferenceClickListener
        @ey(method = -1093435592300743992L)
        public boolean onPreferenceClick(Preference preference) {
            try {
                if (DW) {
                    iy.tp(389735033394155904L, this, preference);
                }
                ServiceContainer.getDownloadService().x9(CompilerPreferencesFragment.this.getActivity());
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 389735033394155904L, this, preference);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1948955670862629976L, container = -428726247933224307L, user = true)
    class c implements Preference.OnPreferenceClickListener {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -318424758867631395L)
        c(CompilerPreferencesFragment compilerPreferencesFragment) {
        }

        @Override // android.preference.Preference.OnPreferenceClickListener
        @ey(method = -2817226545656366976L)
        public boolean onPreferenceClick(Preference preference) {
            try {
                if (j6) {
                    iy.tp(159816435729805689L, this, preference);
                }
                ServiceContainer.getMavenService().refresh();
                return true;
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, 159816435729805689L, this, preference);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(CompilerPreferencesFragment.class);
    }

    @ey(method = 2506126121150935824L)
    public CompilerPreferencesFragment() {
        try {
            if (WB) {
                iy.gn(1573508743506696469L, null);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, 1573508743506696469L, null);
            }
            throw th;
        }
    }

    @Override // android.preference.PreferenceFragment, android.app.Fragment
    @ey(method = -414412754358237873L)
    public void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (WB) {
                iy.tp(-220152252785948465L, this, bundle);
            }
            super.onCreate(bundle);
            addPreferencesFromResource(2131755013);
            findPreference("generate_keystore").setOnPreferenceClickListener(new a());
            findPreference("install_uninstall_ndksupport").setOnPreferenceClickListener(new b());
            findPreference("refresh_maven_repository").setOnPreferenceClickListener(new c(this));
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, -220152252785948465L, this, bundle);
            }
            throw th;
        }
    }
}
