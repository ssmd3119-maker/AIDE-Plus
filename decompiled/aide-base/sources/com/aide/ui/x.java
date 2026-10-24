package com.aide.ui;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;
import com.aide.ui.util.FileSpan;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = -2457896707468642000L, container = -2457896707468642000L, user = true)
/* loaded from: classes.dex */
public class x {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = 3843169510281612992L)
    private MenuItem j6;

    @cy(clazz = -1557016911672075447L, container = -2457896707468642000L, user = true)
    class a implements SearchView.OnQueryTextListener {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 4975743712095100936L)
        final /* synthetic */ SearchView DW;

        @dy(field = 4344435872088060309L)
        private long j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -174358676661214228L)
        a(x xVar, SearchView searchView) {
            this.DW = searchView;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        @ey(method = -4974225543681770093L)
        public boolean onQueryTextChange(String str) {
            try {
                if (FH) {
                    iy.tp(1369338158356534524L, this, str);
                }
                if (!this.DW.isIconified() && str.trim().length() != 0) {
                    ServiceContainer.getMainActivity().sh().AL(1, 1, str);
                }
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 1369338158356534524L, this, str);
                }
                throw th;
            }
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        @ey(method = 6110785202714316137L)
        public boolean onQueryTextSubmit(String str) {
            try {
                if (FH) {
                    iy.tp(-1807722930725076600L, this, str);
                }
                if (!this.DW.isIconified()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.j6 > 100) {
                        this.j6 = jCurrentTimeMillis;
                        FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
                        if (!ServiceContainer.getMainActivity().sh().AL(currentFileSpan.DW, currentFileSpan.FH + 1, str.trim())) {
                            Toast.makeText(ServiceContainer.getMainActivity(), u.view_toast_passed_end_of_file, 0).show();
                            ServiceContainer.getMainActivity().sh().AL(1, 1, str.trim());
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -1807722930725076600L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1557044487976845192L, container = -2457896707468642000L, user = true)
    class b implements SearchView.OnCloseListener {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -48151724188212029L)
        b(x xVar) {
        }

        @Override // android.widget.SearchView.OnCloseListener
        @ey(method = -2077279931718808395L)
        public boolean onClose() {
            try {
                if (j6) {
                    iy.gn(1039466191986746289L, this);
                }
                ServiceContainer.getMainActivity().sh().jJ();
                return true;
            } catch (Throwable th) {
                if (DW) {
                    iy.aM(th, 1039466191986746289L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(x.class);
    }

    @ey(method = 871952274148799688L)
    public x(Menu menu) {
        try {
            if (DW) {
                iy.tp(-6208726110527232775L, null, menu);
            }
            MenuItem menuItemFindItem = menu.findItem(q.mainMenuSearchWidget);
            this.j6 = menuItemFindItem;
            SearchView searchView = (SearchView) menuItemFindItem.getActionView();
            searchView.setInputType(ProxyTextView.INPUTTYPE_textVisiblePassword);
            searchView.setOnQueryTextListener(new a(this, searchView));
            searchView.setOnCloseListener(new b(this));
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -6208726110527232775L, null, menu);
            }
            throw th;
        }
    }

    @ey(method = 3542318907589174304L)
    public void DW() {
        try {
            if (DW) {
                iy.gn(2982973350378772827L, this);
            }
            this.j6.setVisible(ServiceContainer.getMainActivity().yO());
            this.j6.setEnabled(ServiceContainer.getOpenFileService().j3());
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 2982973350378772827L, this);
            }
            throw th;
        }
    }

    @ey(method = 219949707685777419L)
    public void FH() {
        try {
            if (DW) {
                iy.gn(1750979347091503620L, this);
            }
            this.j6.expandActionView();
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 1750979347091503620L, this);
            }
            throw th;
        }
    }

    @ey(method = 2509352375486445123L)
    public boolean j6() {
        try {
            if (DW) {
                iy.gn(2271308810153908320L, this);
            }
            if (this.j6 != null) {
                if (!((SearchView) this.j6.getActionView()).isIconified()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 2271308810153908320L, this);
            }
            throw th;
        }
    }
}
