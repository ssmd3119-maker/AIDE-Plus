package com.aide.appwizard.runtime;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import android.R;
import android.app.ActionBar;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.legacy.app.ActionBarDrawerToggle;
import androidx.viewpager.widget.PagerTitleStrip;
import androidx.viewpager.widget.ViewPager;
import com.aide.appwizard.runtime.a;
import com.probelytics.api.UserTouchAction;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

@cy(clazz = 4889396902212038425L, container = 4889396902212038425L, user = true)
/* loaded from: classes.dex */
public class AppWizardActivity extends FragmentActivity {

    @fy
    private static /* synthetic */ boolean sE;

    @gy
    private static /* synthetic */ boolean sg;

    @dy(field = 4440613061035158561L)
    private int Jl;

    @dy(field = 1605170051601202373L)
    private ViewPager Q6;

    @dy(field = 4835849651240155008L)
    private int e3;

    @dy(field = 2041331091804216544L)
    private int eU;

    @dy(field = -2142756852662875449L)
    private int iW;

    @dy(field = -3194336168128748356L)
    private ActionBarDrawerToggle kf;

    @dy(field = 2121405043696021132L)
    private com.aide.appwizard.runtime.a n5;

    @cy(clazz = 1275361779258238672L, container = 4889396902212038425L, user = true)
    class a extends Fragment {

        @gy
        private static /* synthetic */ boolean AR;

        @fy
        private static /* synthetic */ boolean b1;

        @dy(field = -1578375172638642249L)
        final /* synthetic */ a.d Of;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -652330520479543451L)
        a(a.d dVar) {
            this.Of = dVar;
        }

        @Override // androidx.fragment.app.Fragment
        @ey(method = 439866003850080525L)
        public View lp(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                if (b1) {
                    iy.we(655660715125653801L, this, layoutInflater, viewGroup, bundle);
                }
                return this.Of.Hw() != null ? layoutInflater.inflate(AppWizardActivity.this.rN("layout", this.Of.Hw()), viewGroup, false) : new LinearLayout(AppWizardActivity.this);
            } catch (Throwable th) {
                if (AR) {
                    iy.U2(th, 655660715125653801L, this, layoutInflater, viewGroup, bundle);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1275389846248850589L, container = 4889396902212038425L, user = true)
    class b implements View.OnSystemUiVisibilityChangeListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 42713869291194699L)
        b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        @ey(method = -2853826181146614912L)
        public void onSystemUiVisibilityChange(int i) {
            try {
                if (DW) {
                    iy.u7(733485695407567424L, this, i);
                }
                AppWizardActivity.this.getWindow().getDecorView().setSystemUiVisibility(4);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 733485695407567424L, this, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1275417913243525800L, container = 4889396902212038425L, user = true)
    class c implements ActionBar.OnNavigationListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 479856430554582528L)
        c() {
        }

        @Override // android.app.ActionBar.OnNavigationListener
        @ey(method = -6649071836929069699L)
        public boolean onNavigationItemSelected(int i, long j) {
            try {
                if (DW) {
                    iy.EQ(2053156166405204547L, this, new Integer(i), new Long(j));
                }
                Fragment fragmentMr = AppWizardActivity.this.Mr(AppWizardActivity.this.U2().Hw().get(i));
                FragmentTransaction fragmentTransactionBeginTransaction = AppWizardActivity.this.getSupportFragmentManager().beginTransaction();
                fragmentTransactionBeginTransaction.add(AppWizardActivity.this.Jl, fragmentMr);
                fragmentTransactionBeginTransaction.commit();
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 2053156166405204547L, this, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1275445980242264305L, container = 4889396902212038425L, user = true)
    class d implements ActionBar.OnNavigationListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(d.class);
        }

        @ey(method = 672427037641189397L)
        d() {
        }

        @Override // android.app.ActionBar.OnNavigationListener
        @ey(method = -67388737222027908L)
        public boolean onNavigationItemSelected(int i, long j) {
            try {
                if (DW) {
                    iy.EQ(287189374424810816L, this, new Integer(i), new Long(j));
                }
                Fragment fragmentMr = AppWizardActivity.this.Mr(AppWizardActivity.this.U2().Hw().get(i));
                FragmentTransaction fragmentTransactionBeginTransaction = AppWizardActivity.this.getSupportFragmentManager().beginTransaction();
                fragmentTransactionBeginTransaction.add(AppWizardActivity.this.e3, fragmentMr);
                fragmentTransactionBeginTransaction.commit();
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 287189374424810816L, this, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1275474047245066104L, container = 4889396902212038425L, user = true)
    class e extends ViewPager.SimpleOnPageChangeListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(e.class);
        }

        @ey(method = 402264518180373449L)
        e() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        @ey(method = 4228472273399135L)
        public void FH(int i) {
            try {
                if (DW) {
                    iy.u7(458501099237860000L, this, i);
                }
                AppWizardActivity.this.getActionBar().setSelectedNavigationItem(i);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 458501099237860000L, this, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1275502114251931197L, container = 4889396902212038425L, user = true)
    class f implements ActionBar.TabListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(f.class);
        }

        @ey(method = -359874865334254829L)
        f() {
        }

        @Override // android.app.ActionBar.TabListener
        @ey(method = 295589066475956928L)
        public void onTabReselected(ActionBar.Tab tab, android.app.FragmentTransaction fragmentTransaction) {
            try {
                if (DW) {
                    iy.EQ(463889657836474695L, this, tab, fragmentTransaction);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 463889657836474695L, this, tab, fragmentTransaction);
                }
                throw th;
            }
        }

        @Override // android.app.ActionBar.TabListener
        @ey(method = 1435137692331835025L)
        public void onTabSelected(ActionBar.Tab tab, android.app.FragmentTransaction fragmentTransaction) {
            try {
                if (DW) {
                    iy.EQ(828021646655041648L, this, tab, fragmentTransaction);
                }
                if (AppWizardActivity.this.Q6 != null) {
                    AppWizardActivity.this.Q6.setCurrentItem(tab.getPosition());
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 828021646655041648L, this, tab, fragmentTransaction);
                }
                throw th;
            }
        }

        @Override // android.app.ActionBar.TabListener
        @ey(method = -442026450550391252L)
        public void onTabUnselected(ActionBar.Tab tab, android.app.FragmentTransaction fragmentTransaction) {
            try {
                if (DW) {
                    iy.EQ(194163761243824725L, this, tab, fragmentTransaction);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 194163761243824725L, this, tab, fragmentTransaction);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1275530181262859584L, container = 4889396902212038425L, user = true)
    static /* synthetic */ class g {

        @dy(field = -359163294434971871L)
        static final /* synthetic */ int[] DW;

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 38253417575262292L)
        static final /* synthetic */ int[] j6;

        static {
            try {
                iy.Zo(g.class);
                if (FH) {
                    iy.gn(196368680917583771L, null);
                }
                int[] iArr = new int[a.e.values().length];
                DW = iArr;
                try {
                    iArr[a.e.Tabs.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    DW[a.e.TabsDrawer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    DW[a.e.Spinner.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    DW[a.e.SpinnerDrawer.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    DW[a.e.Slider.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    DW[a.e.SliderDrawer.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    DW[a.e.Single.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    DW[a.e.Drawer.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                int[] iArr2 = new int[a.f.values().length];
                j6 = iArr2;
                try {
                    iArr2[a.f.HoloDark.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    j6[a.f.HoloLight.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    j6[a.f.HoloLightHoloActionBar.ordinal()] = 3;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    j6[a.f.HoloLightDarkActionBar.ordinal()] = 4;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    j6[a.f.DeviceDefault.ordinal()] = 5;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    j6[a.f.DeviceDefaultLight.ordinal()] = 6;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    j6[a.f.DeviceDefaultLightDarkActionBar.ordinal()] = 7;
                } catch (NoSuchFieldError unused15) {
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 196368680917583771L, null);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2243073932312828817L, container = -2243073932312828817L, user = true)
    private class h extends FragmentStatePagerAdapter {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        @dy(field = 2566050882519428656L)
        @hy
        final /* synthetic */ AppWizardActivity gn;

        static {
            iy.Zo(h.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 44400021518034733L)
        public h(AppWizardActivity appWizardActivity, FragmentManager fragmentManager) {
            super(fragmentManager);
            try {
                if (u7) {
                    iy.EQ(-2714844480168061760L, null, appWizardActivity, fragmentManager);
                }
                this.gn = appWizardActivity;
            } catch (Throwable th) {
                if (tp) {
                    iy.Mr(th, -2714844480168061760L, null, appWizardActivity, fragmentManager);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 2464209949339270260L)
        public int getCount() {
            try {
                if (u7) {
                    iy.gn(-398534843712094271L, this);
                }
                return this.gn.U2().VH().FH() ? this.gn.U2().Hw().size() - 1 : this.gn.U2().Hw().size();
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -398534843712094271L, this);
                }
                throw th;
            }
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        @ey(method = -1100054622525150321L)
        public Fragment getItem(int i) {
            try {
                if (u7) {
                    iy.u7(-40336300518430488L, this, i);
                }
                return this.gn.Mr(this.gn.U2().Hw().get(i));
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, -40336300518430488L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 2207935775976430581L)
        public CharSequence getPageTitle(int i) {
            try {
                if (u7) {
                    iy.u7(-3314340961772855280L, this, i);
                }
                return this.gn.U2().Hw().get(i).v5();
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, -3314340961772855280L, this, new Integer(i));
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(AppWizardActivity.class);
    }

    @ey(method = -124412996008028912L)
    public AppWizardActivity() {
        try {
            if (sE) {
                iy.gn(-2678318645468510820L, null);
            }
        } catch (Throwable th) {
            if (sg) {
                iy.aM(th, -2678318645468510820L, null);
            }
            throw th;
        }
    }

    @ey(method = 135217460552704416L)
    private void BT(ViewGroup viewGroup) {
        try {
            if (sE) {
                iy.tp(-7199730336797981575L, this, viewGroup);
            }
            ViewPager viewPager = new ViewPager(this);
            this.Q6 = viewPager;
            viewPager.setId(this.iW);
            viewGroup.addView(this.Q6);
            PagerTitleStrip pagerTitleStrip = new PagerTitleStrip(this);
            pagerTitleStrip.setPadding(0, (int) (getResources().getDisplayMetrics().density * 4.0f), 0, (int) (getResources().getDisplayMetrics().density * 4.0f));
            ViewPager.LayoutParams layoutParams = new ViewPager.LayoutParams();
            ((ViewGroup.LayoutParams) layoutParams).height = -2;
            ((ViewGroup.LayoutParams) layoutParams).width = -1;
            layoutParams.gravity = 48;
            this.Q6.addView(pagerTitleStrip, layoutParams);
            pagerTitleStrip.setTextColor(-1);
            pagerTitleStrip.setBackgroundColor(-13388315);
            this.Q6.setAdapter(new h(this, getSupportFragmentManager()));
        } catch (Throwable th) {
            if (sg) {
                iy.j3(th, -7199730336797981575L, this, viewGroup);
            }
            throw th;
        }
    }

    @ey(method = 3916506246259301795L)
    private Drawable a8(int i) {
        try {
            if (sE) {
                iy.u7(3123731290581633536L, this, i);
            }
            TypedValue typedValue = new TypedValue();
            getTheme().resolveAttribute(i, typedValue, true);
            return (typedValue.type < 28 || typedValue.type > 31) ? getResources().getDrawable(typedValue.resourceId) : new ColorDrawable(typedValue.data);
        } catch (Throwable th) {
            if (sg) {
                iy.j3(th, 3123731290581633536L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3436022485134047196L)
    private int er() {
        try {
            if (sE) {
                iy.gn(1584847606066486241L, this);
            }
            int i = g.j6[U2().v5().ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 6 ? i != 7 ? R.style.Theme.DeviceDefault : R.style.Theme.DeviceDefault.Light.DarkActionBar : R.style.Theme.DeviceDefault.Light : R.style.Theme.Holo.Light.DarkActionBar : rN("style", "Theme_Holo_Light_Holo_ActionBar") : R.style.Theme.Holo.Light : R.style.Theme.Holo;
        } catch (Throwable th) {
            if (sg) {
                iy.aM(th, 1584847606066486241L, this);
            }
            throw th;
        }
    }

    @ey(method = 382958970435673868L)
    private ViewGroup gW(ViewGroup viewGroup) {
        try {
            if (sE) {
                iy.tp(-3486509791395187989L, this, viewGroup);
            }
            getActionBar().setDisplayHomeAsUpEnabled(true);
            getActionBar().setHomeButtonEnabled(true);
            DrawerLayout drawerLayout = new DrawerLayout(this);
            viewGroup.addView(drawerLayout, new ViewGroup.LayoutParams(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setId(this.e3);
            drawerLayout.addView(frameLayout, new DrawerLayout.LayoutParams(-1, -1));
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setId(this.eU);
            DrawerLayout.LayoutParams layoutParams = new DrawerLayout.LayoutParams((int) (getResources().getDisplayMetrics().density * 240.0f), -1);
            layoutParams.gravity = 8388611;
            linearLayout.setDividerDrawable(new ColorDrawable(0));
            linearLayout.setBackgroundDrawable(a8(R.attr.windowBackground));
            drawerLayout.addView(linearLayout, layoutParams);
            ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, rN("drawable", "ic_drawer"), R.string.ok, R.string.ok);
            this.kf = actionBarDrawerToggle;
            drawerLayout.setDrawerListener(actionBarDrawerToggle);
            drawerLayout.openDrawer(3);
            List<a.d> listHw = U2().Hw();
            if (listHw.size() > 0) {
                FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransactionBeginTransaction.add(this.eU, Mr(listHw.get(listHw.size() - 1)));
                fragmentTransactionBeginTransaction.commit();
            }
            return drawerLayout;
        } catch (Throwable th) {
            if (sg) {
                iy.j3(th, -3486509791395187989L, this, viewGroup);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 1827825947259090291L)
    public int rN(String str, String str2) {
        try {
            if (sE) {
                iy.EQ(420339270553659600L, this, str, str2);
            }
            try {
                return ((Integer) Class.forName(getPackageName() + ".R$" + str).getField(str2).get(null)).intValue();
            } catch (Exception unused) {
                return 0;
            }
        } catch (Throwable th) {
            if (sg) {
                iy.Mr(th, 420339270553659600L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 750002358391124184L)
    private void vy(ViewGroup viewGroup) {
        try {
            if (sE) {
                iy.tp(-5920069004729770929L, this, viewGroup);
            }
            ViewPager viewPager = new ViewPager(this);
            this.Q6 = viewPager;
            viewPager.setId(this.iW);
            viewGroup.addView(this.Q6);
            this.Q6.setAdapter(new h(this, getSupportFragmentManager()));
            this.Q6.setOnPageChangeListener(new e());
            getActionBar().removeAllTabs();
            int size = U2().VH().FH() ? U2().Hw().size() - 1 : U2().Hw().size();
            for (int i = 0; i < size; i++) {
                getActionBar().addTab(getActionBar().newTab().setText(U2().Hw().get(i).v5()).setTabListener(new f()));
            }
        } catch (Throwable th) {
            if (sg) {
                iy.j3(th, -5920069004729770929L, this, viewGroup);
            }
            throw th;
        }
    }

    @ey(method = 119869449320762656L)
    protected Fragment Mr(a.d dVar) {
        try {
            if (sE) {
                iy.tp(68235050826564721L, this, dVar);
            }
            return new a(dVar);
        } catch (Throwable th) {
            if (sg) {
                iy.j3(th, 68235050826564721L, this, dVar);
            }
            throw th;
        }
    }

    @ey(method = 551749953960359007L)
    protected Document P8() {
        try {
            if (sE) {
                iy.gn(-2326812830081695072L, this);
            }
            try {
                InputStream inputStreamOpen = getAssets().open("app.xml");
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStreamOpen);
                inputStreamOpen.close();
                return document;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            if (sg) {
                iy.aM(th, -2326812830081695072L, this);
            }
            throw th;
        }
    }

    @ey(method = 402114435081335504L)
    public a.c U2() {
        try {
            if (sE) {
                iy.gn(-3921777451163500401L, this);
            }
            return lg().VH();
        } catch (Throwable th) {
            if (sg) {
                iy.aM(th, -3921777451163500401L, this);
            }
            throw th;
        }
    }

    @ey(method = 4801377627048886424L)
    public void ei() {
        try {
            if (sE) {
                iy.gn(-62837885833334721L, this);
            }
            this.kf = null;
            this.Q6 = null;
            this.iW = 1001;
            this.eU = 1002;
            this.e3 = 1003;
            int iYS = yS();
            this.Jl = iYS;
            ViewGroup viewGroup = (ViewGroup) findViewById(iYS);
            getActionBar().setDisplayShowTitleEnabled(U2().j3());
            setTitle(U2().Zo());
            if (U2().Ws()) {
                getActionBar().show();
            } else {
                getActionBar().hide();
            }
            if (U2().XL()) {
                viewGroup.setSystemUiVisibility(4);
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b());
            } else {
                viewGroup.setSystemUiVisibility(0);
            }
            switch (g.DW[U2().VH().ordinal()]) {
                case 1:
                    getActionBar().setNavigationMode(2);
                    getActionBar().setDisplayHomeAsUpEnabled(false);
                    getActionBar().setHomeButtonEnabled(false);
                    vy(viewGroup);
                    return;
                case 2:
                    getActionBar().setNavigationMode(2);
                    vy(gW(viewGroup));
                    return;
                case 3:
                    getActionBar().setNavigationMode(1);
                    getActionBar().setDisplayHomeAsUpEnabled(false);
                    getActionBar().setHomeButtonEnabled(false);
                    getActionBar().removeAllTabs();
                    ArrayList arrayList = new ArrayList();
                    Iterator<a.d> it = U2().Hw().iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().v5());
                    }
                    getActionBar().setListNavigationCallbacks(new ArrayAdapter(getActionBar().getThemedContext(), R.layout.simple_list_item_1, R.id.text1, arrayList), new c());
                    return;
                case 4:
                    getActionBar().setNavigationMode(1);
                    gW(viewGroup);
                    getActionBar().removeAllTabs();
                    ArrayList arrayList2 = new ArrayList();
                    int size = U2().Hw().size() - 1;
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(U2().Hw().get(i).v5());
                    }
                    getActionBar().setListNavigationCallbacks(new ArrayAdapter(getActionBar().getThemedContext(), R.layout.simple_list_item_1, R.id.text1, arrayList2), new d());
                    return;
                case 5:
                    getActionBar().setNavigationMode(0);
                    getActionBar().setDisplayHomeAsUpEnabled(false);
                    getActionBar().setHomeButtonEnabled(false);
                    BT(viewGroup);
                    return;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    getActionBar().setNavigationMode(0);
                    BT(gW(viewGroup));
                    return;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    getActionBar().setNavigationMode(0);
                    getActionBar().setDisplayHomeAsUpEnabled(false);
                    getActionBar().setHomeButtonEnabled(false);
                    if (U2().Hw().size() > 0) {
                        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransactionBeginTransaction.add(this.Jl, Mr(U2().Hw().get(0)));
                        fragmentTransactionBeginTransaction.commit();
                        return;
                    }
                    return;
                case 8:
                    getActionBar().setNavigationMode(0);
                    gW(viewGroup);
                    if (U2().Hw().size() > 0) {
                        FragmentTransaction fragmentTransactionBeginTransaction2 = getSupportFragmentManager().beginTransaction();
                        fragmentTransactionBeginTransaction2.add(this.e3, Mr(U2().Hw().get(0)));
                        fragmentTransactionBeginTransaction2.commit();
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            if (sg) {
                iy.aM(th, -62837885833334721L, this);
            }
            throw th;
        }
    }

    @ey(method = -1159233396729838335L)
    public com.aide.appwizard.runtime.a lg() {
        try {
            if (sE) {
                iy.gn(-2424561696355265220L, this);
            }
            return this.n5;
        } catch (Throwable th) {
            if (sg) {
                iy.aM(th, -2424561696355265220L, this);
            }
            throw th;
        }
    }

    @ey(method = -510094280826418400L)
    protected void nw(Document document, int i) {
        try {
            if (sE) {
                iy.EQ(-19515046685372375L, this, document, new Integer(i));
            }
        } catch (Throwable th) {
            if (sg) {
                iy.Mr(th, -19515046685372375L, this, document, new Integer(i));
            }
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    @ey(method = 687407584777078563L)
    public void onConfigurationChanged(Configuration configuration) {
        try {
            if (sE) {
                iy.tp(401967580491910236L, this, configuration);
            }
            super.onConfigurationChanged(configuration);
            if (this.kf != null) {
                this.kf.onConfigurationChanged(configuration);
            }
        } catch (Throwable th) {
            if (sg) {
                iy.j3(th, 401967580491910236L, this, configuration);
            }
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @ey(method = 510272475998754393L)
    protected void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (sE) {
                iy.tp(604454705597673144L, this, bundle);
            }
            this.n5 = new com.aide.appwizard.runtime.a(this);
            setTheme(er());
            super.onCreate(bundle);
            getWindow().setSoftInputMode(2);
            ei();
        } catch (Throwable th) {
            if (sg) {
                iy.j3(th, 604454705597673144L, this, bundle);
            }
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    @ey(method = -773977220341942192L)
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        try {
            if (sE) {
                iy.EQ(195488587954688263L, this, new Integer(i), menuItem);
            }
            if (this.kf == null || !this.kf.onOptionsItemSelected(menuItem)) {
                return super.onMenuItemSelected(i, menuItem);
            }
            return true;
        } catch (Throwable th) {
            if (sg) {
                iy.Mr(th, 195488587954688263L, this, new Integer(i), menuItem);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -2286225256301685413L)
    protected void onPostCreate(Bundle bundle) {
        try {
            if (sE) {
                iy.tp(-1600831397720718308L, this, bundle);
            }
            super.onPostCreate(bundle);
            if (this.kf != null) {
                this.kf.syncState();
            }
        } catch (Throwable th) {
            if (sg) {
                iy.j3(th, -1600831397720718308L, this, bundle);
            }
            throw th;
        }
    }

    @ey(method = 457496376154196775L)
    protected int yS() {
        try {
            if (sE) {
                iy.gn(-1052025443468376552L, this);
            }
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setId(1000);
            setContentView(linearLayout);
            return linearLayout.getId();
        } catch (Throwable th) {
            if (sg) {
                iy.aM(th, -1052025443468376552L, this);
            }
            throw th;
        }
    }
}
