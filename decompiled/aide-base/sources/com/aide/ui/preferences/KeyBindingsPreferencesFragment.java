package com.aide.ui.preferences;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.aide.common.MessageBox;
import com.aide.ui.ServiceContainer;
import com.aide.ui.s;

@cy(clazz = 341889297030401769L, container = 341889297030401769L, user = true)
/* loaded from: classes.dex */
public class KeyBindingsPreferencesFragment extends Fragment {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    @cy(clazz = 159513137324753568L, container = 341889297030401769L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 280805053584495993L)
        a() {
        }

        @Override // java.lang.Runnable
        @ey(method = -1328183033938220000L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-851003983592724299L, this);
                }
                ServiceContainer.Mr().Hw();
                View view = KeyBindingsPreferencesFragment.this.getView();
                if (view instanceof KeyBindingsView) {
                    ((KeyBindingsView) view).DW();
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -851003983592724299L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(KeyBindingsPreferencesFragment.class);
    }

    @ey(method = -1350227049776961577L)
    public KeyBindingsPreferencesFragment() {
        try {
            if (WB) {
                iy.gn(-1284392346574156664L, null);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, -1284392346574156664L, null);
            }
            throw th;
        }
    }

    @Override // android.app.Fragment
    @ey(method = -830513176905978000L)
    public void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (WB) {
                iy.tp(70204760242238336L, this, bundle);
            }
            super.onCreate(bundle);
            setHasOptionsMenu(true);
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, 70204760242238336L, this, bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Fragment
    @ey(method = -1519040003579431781L)
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        try {
            if (WB) {
                iy.EQ(3180673585439285775L, this, menu, menuInflater);
            }
            menuInflater.inflate(s.keybindings_options_menu, menu);
        } catch (Throwable th) {
            if (mb) {
                iy.Mr(th, 3180673585439285775L, this, menu, menuInflater);
            }
            throw th;
        }
    }

    @Override // android.app.Fragment
    @ey(method = -16224507773041464L)
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            if (WB) {
                iy.we(-1070520077919918032L, this, layoutInflater, viewGroup, bundle);
            }
            return new KeyBindingsView(viewGroup.getContext());
        } catch (Throwable th) {
            if (mb) {
                iy.U2(th, -1070520077919918032L, this, layoutInflater, viewGroup, bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Fragment
    @ey(method = -152610699944873819L)
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            if (WB) {
                iy.tp(-1690813508373502719L, this, menuItem);
            }
            if (menuItem.getItemId() != 2131230939) {
                return super.onOptionsItemSelected(menuItem);
            }
            MessageBox.rN(getActivity(), "Reset Keybindings", "Really restore default keybindings? All changes will be lost.", new a(), null);
            return true;
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, -1690813508373502719L, this, menuItem);
            }
            throw th;
        }
    }
}
