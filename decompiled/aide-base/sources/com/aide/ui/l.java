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

@cy(clazz = -2552856979238506569L, container = -2552856979238506569L, user = true)
/* loaded from: classes.dex */
public class l {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = -98067160868254839L)
    private MenuItem j6;

    @cy(clazz = -8314795987287325476L, container = -2552856979238506569L, user = true)
    class a implements SearchView.OnQueryTextListener {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -4219182905004041208L)
        final /* synthetic */ SearchView j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 2347463063924601304L)
        a(SearchView searchView) {
            this.j6 = searchView;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        @ey(method = -2628002805399947473L)
        public boolean onQueryTextChange(String str) {
            try {
                if (FH) {
                    iy.tp(-1172310305986782500L, this, str);
                }
                if (!this.j6.isIconified()) {
                    try {
                        int i = Integer.parseInt(str.trim());
                        ServiceContainer.getMainActivity().sh().w9(i, 1, i, 1);
                    } catch (NumberFormatException unused) {
                    }
                }
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -1172310305986782500L, this, str);
                }
                throw th;
            }
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        @ey(method = -8132365225094606839L)
        public boolean onQueryTextSubmit(String str) {
            try {
                if (FH) {
                    iy.tp(-5404184979562830528L, this, str);
                }
                if (this.j6.isIconified()) {
                    return true;
                }
                l.this.j6.collapseActionView();
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -5404184979562830528L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -8314927549158861393L, container = -2552856979238506569L, user = true)
    class b implements SearchView.OnCloseListener {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -71938216885218391L)
        b(l lVar) {
        }

        @Override // android.widget.SearchView.OnCloseListener
        @ey(method = 640040257731764411L)
        public boolean onClose() {
            try {
                if (j6) {
                    iy.gn(2257067646943970241L, this);
                }
                ServiceContainer.getMainActivity().sh().jJ();
                return true;
            } catch (Throwable th) {
                if (DW) {
                    iy.aM(th, 2257067646943970241L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(l.class);
    }

    @ey(method = 8712363453245967983L)
    public l(Menu menu) {
        try {
            if (DW) {
                iy.tp(4942089627502592161L, null, menu);
            }
            MenuItem menuItemFindItem = menu.findItem(q.mainMenuGotoLineWidget);
            this.j6 = menuItemFindItem;
            SearchView searchView = (SearchView) menuItemFindItem.getActionView();
            searchView.setInputType(2);
            searchView.setOnQueryTextListener(new a(searchView));
            searchView.setOnCloseListener(new b(this));
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 4942089627502592161L, null, menu);
            }
            throw th;
        }
    }

    @ey(method = 7060688308841842976L)
    public boolean DW() {
        try {
            if (DW) {
                iy.gn(-268861000091245385L, this);
            }
            if (this.j6 != null) {
                if (!((SearchView) this.j6.getActionView()).isIconified()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -268861000091245385L, this);
            }
            throw th;
        }
    }

    @ey(method = -5532410223724622795L)
    public void FH() {
        try {
            if (DW) {
                iy.gn(-7248981557144436340L, this);
            }
            this.j6.setVisible(ServiceContainer.getMainActivity().yO());
            this.j6.setEnabled(ServiceContainer.getOpenFileService().j3());
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -7248981557144436340L, this);
            }
            throw th;
        }
    }

    @ey(method = 2442570660711847864L)
    public void Hw() {
        try {
            if (DW) {
                iy.gn(1850122963406570671L, this);
            }
            this.j6.expandActionView();
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 1850122963406570671L, this);
            }
            throw th;
        }
    }
}
