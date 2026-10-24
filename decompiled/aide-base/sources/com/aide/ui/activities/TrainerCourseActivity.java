package com.aide.ui.activities;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gd;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.legacy.app.ActionBarDrawerToggle;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.aide.common.AndroidHelper;
import com.aide.common.MessageBox;
import com.aide.common.SocialDialog;
import com.aide.common.TrainerLogo;
import com.aide.common.ValueRunnable;
import com.aide.ui.AppPreferences;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.s;
import com.aide.ui.services.TemplateService;
import com.aide.ui.trainer.c;
import com.aide.ui.u;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = 3404442532748635224L, container = 3404442532748635224L, user = true)
/* loaded from: classes.dex */
public class TrainerCourseActivity extends Activity {

    @dy(field = -342434749260031752L)
    private static boolean AL;

    @gy
    private static /* synthetic */ boolean hK;

    @fy
    private static /* synthetic */ boolean w9;

    @dy(field = -162975697256198575L)
    private ActionBarDrawerToggle WB;

    @dy(field = -1890079564693229445L)
    private c.j fY;

    @dy(field = 3689582778840932841L)
    private List<c.d> jw;

    @dy(field = -233446039527591477L)
    private boolean k2;

    @dy(field = -3781043401096247016L)
    private c.d mb;

    @dy(field = 2383756117261849296L)
    private boolean qp;

    @dy(field = -640657429163419853L)
    private int zh;

    @cy(clazz = -4321002814140541767L, container = 3404442532748635224L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 2721809433921006833L)
        final /* synthetic */ c.j WB;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 59962303907057272L)
        a(c.j jVar) {
            this.WB = jVar;
        }

        @Override // java.lang.Runnable
        @ey(method = 445765625938344096L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(-1493410230686143521L, this);
                }
                TrainerCourseActivity.this.BT(this.WB, false);
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, -1493410230686143521L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4321091114464710272L, container = 3404442532748635224L, user = true)
    class b implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -2480539972697584408L)
        final /* synthetic */ c.k WB;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 281140633808009487L)
        b(c.k kVar) {
            this.WB = kVar;
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 478666589145063840L)
        public void onClick(View view) {
            try {
                if (jw) {
                    iy.tp(-3355947188711922816L, this, view);
                }
                TrainerCourseActivity.this.vy(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, -3355947188711922816L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4321179414784815483L, container = 3404442532748635224L, user = true)
    class c implements View.OnFocusChangeListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 876707183266587183L)
        final /* synthetic */ View WB;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 43807605902611840L)
        c(View view) {
            this.WB = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        @ey(method = 5325654333745505067L)
        public void onFocusChange(View view, boolean z) {
            try {
                if (jw) {
                    iy.EQ(3612437317759635144L, this, view, new Boolean(z));
                }
                if (z) {
                    ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.05f, 1.0f, 1.05f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation.setDuration(400);
                    scaleAnimation.setFillAfter(true);
                    this.WB.startAnimation(scaleAnimation);
                    return;
                }
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.05f, 1.0f, 1.05f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation2.setDuration(400);
                scaleAnimation2.setFillAfter(true);
                this.WB.startAnimation(scaleAnimation2);
            } catch (Throwable th) {
                if (fY) {
                    iy.Mr(th, 3612437317759635144L, this, view, new Boolean(z));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4321267715100857400L, container = 3404442532748635224L, user = true)
    class d implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 5260424344892453920L)
        final /* synthetic */ TemplateService.TemplateGroup WB;

        @cy(clazz = 3187716484151995201L, container = 3404442532748635224L, user = true)
        class a implements ValueRunnable<String> {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 197542394408939653L)
            a() {
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = -4334388355038119576L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(String str) {
                try {
                    if (DW) {
                        iy.tp(-3061430304110630189L, this, str);
                    }
                    TrainerCourseActivity.this.P8();
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -3061430304110630189L, this, str);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(d.class);
        }

        @ey(method = 1133359710830228367L)
        d(TemplateService.TemplateGroup templateGroup) {
            this.WB = templateGroup;
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 59453392777144760L)
        public void onClick(View view) {
            try {
                if (jw) {
                    iy.tp(-1114318329197069712L, this, view);
                }
                MessageBox.gW(TrainerCourseActivity.this, new gd(ServiceContainer.getFileBrowserService().DW(), this.WB, new a()));
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, -1114318329197069712L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4321356015412836023L, container = 3404442532748635224L, user = true)
    class e implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(e.class);
        }

        @ey(method = 709528995131559840L)
        e() {
        }

        @Override // java.lang.Runnable
        @ey(method = 2507200151019574032L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(9408470803532415L, this);
                }
                ServiceContainer.getMainActivity().lg();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 9408470803532415L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4321444315720751352L, container = 3404442532748635224L, user = true)
    class f implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 2870305525610414840L)
        final /* synthetic */ c.j WB;

        static {
            iy.Zo(f.class);
        }

        @ey(method = -93542027405026395L)
        f(c.j jVar) {
            this.WB = jVar;
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 40878157719706056L)
        public void onClick(View view) {
            try {
                if (jw) {
                    iy.tp(-4014827491382523340L, this, view);
                }
                TrainerCourseActivity.this.gW(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, -4014827491382523340L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1331471971261592167L, container = 3404442532748635224L, user = true)
    class g implements View.OnFocusChangeListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 1255705463387077283L)
        final /* synthetic */ DrawerLayout WB;

        static {
            iy.Zo(g.class);
        }

        @ey(method = -6561046558880798952L)
        g(DrawerLayout drawerLayout) {
            this.WB = drawerLayout;
        }

        @Override // android.view.View.OnFocusChangeListener
        @ey(method = -4039329949657071501L)
        public void onFocusChange(View view, boolean z) {
            try {
                if (jw) {
                    iy.EQ(4802211412874791428L, this, view, new Boolean(z));
                }
                if (this.WB.isDrawerOpen(3)) {
                    return;
                }
                TrainerCourseActivity.this.aM();
            } catch (Throwable th) {
                if (fY) {
                    iy.Mr(th, 4802211412874791428L, this, view, new Boolean(z));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1331501972898162400L, container = 3404442532748635224L, user = true)
    class h implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 743185637425408452L)
        final /* synthetic */ DrawerLayout WB;

        static {
            iy.Zo(h.class);
        }

        @ey(method = -3965286543425221605L)
        h(DrawerLayout drawerLayout) {
            this.WB = drawerLayout;
        }

        @Override // java.lang.Runnable
        @ey(method = -1453208691491436792L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(-502325787831773624L, this);
                }
                this.WB.openDrawer(3);
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, -502325787831773624L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1331531974530669339L, container = 3404442532748635224L, user = true)
    class i implements ValueRunnable<c.d> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(i.class);
        }

        @ey(method = 6087178731178389L)
        i() {
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = 5187914430039866000L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(c.d dVar) {
            try {
                if (DW) {
                    iy.tp(222377505360980619L, this, dVar);
                }
                if (dVar.j3()) {
                    TrainerCourseActivity.this.yS(dVar);
                } else {
                    ServiceContainer.getLicenseService().dx(TrainerCourseActivity.this, dVar.v5(), "show_course");
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 222377505360980619L, this, dVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1331561976159112984L, container = 3404442532748635224L, user = true)
    class j implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(j.class);
        }

        @ey(method = -215218847664407069L)
        j() {
        }

        @Override // java.lang.Runnable
        @ey(method = -1078616096384629921L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(5047195808236668192L, this);
                }
                TrainerCourseActivity.this.qp = false;
                TrainerCourseActivity.this.a8();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 5047195808236668192L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1331591977783493335L, container = 3404442532748635224L, user = true)
    class k implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(k.class);
        }

        @ey(method = 137340784412794640L)
        k() {
        }

        @Override // java.lang.Runnable
        @ey(method = -959653421841220548L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(5050164174576201299L, this);
                }
                TrainerCourseActivity.this.k2 = false;
                TrainerCourseActivity.this.a8();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 5050164174576201299L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1331621979403810392L, container = 3404442532748635224L, user = true)
    class l implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @cy(clazz = 3985067617360554781L, container = 3404442532748635224L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 156230311891203144L)
            a() {
            }

            @Override // java.lang.Runnable
            @ey(method = 1138810239321250268L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(5056102359833742783L, this);
                    }
                    ServiceContainer.getProjectService().Ws();
                    TrainerCourseActivity.this.P8();
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 5056102359833742783L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(l.class);
        }

        @ey(method = 124072239952061037L)
        l() {
        }

        @Override // java.lang.Runnable
        @ey(method = -2112294353080999931L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(5053133025108559496L, this);
                }
                if (TrainerCourseActivity.this.Mr()) {
                    MessageBox.ei(TrainerCourseActivity.this, "Expert Mode", "AIDE will switch to expert mode, where you can create and modify your own apps.", new a());
                } else {
                    ServiceContainer.getProjectService().Ws();
                    TrainerCourseActivity.this.P8();
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 5053133025108559496L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1331651981020064155L, container = 3404442532748635224L, user = true)
    class m implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(m.class);
        }

        @ey(method = 6992333557580448L)
        m() {
        }

        @Override // java.lang.Runnable
        @ey(method = -1577182899727144164L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(5059072178751751160L, this);
                }
                FireBaseLogEvent.tp("Trainer Google Plus Community shown");
                SocialDialog.dx(TrainerCourseActivity.this);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 5059072178751751160L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1331681982632254624L, container = 3404442532748635224L, user = true)
    class n implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(n.class);
        }

        @ey(method = -7978427414549580L)
        n() {
        }

        @Override // java.lang.Runnable
        @ey(method = 1143742134925305904L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(5695045252140684375L, this);
                }
                TrainerCourseActivity.this.P8();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 5695045252140684375L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1331711984240381799L, container = 3404442532748635224L, user = true)
    class o implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 3210104009701191901L)
        final /* synthetic */ c.j WB;

        static {
            iy.Zo(o.class);
        }

        @ey(method = 927141349292732400L)
        o(c.j jVar) {
            this.WB = jVar;
        }

        @Override // java.lang.Runnable
        @ey(method = 1735666756607654604L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(-1496687473956356584L, this);
                }
                TrainerCourseActivity.this.BT(this.WB, true);
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, -1496687473956356584L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1029200971414582941L, container = 1029200971414582941L, user = true)
    private class p extends PagerAdapter {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = -2492786324867748291L)
        private int FH;

        @dy(field = -745629451830584672L)
        private List<View> Hw;

        @dy(field = -1455472596827317132L)
        @hy
        final /* synthetic */ TrainerCourseActivity Zo;

        @dy(field = -1410203192193105981L)
        private List<String> v5;

        @cy(clazz = -3334293089220908760L, container = 1029200971414582941L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -4834558963800686120L)
            final /* synthetic */ int WB;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 615109583718147856L)
            a(int i) {
                this.WB = i;
            }

            @Override // java.lang.Runnable
            @ey(method = 2191764808564869880L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(-2300238731202448833L, this);
                    }
                    ((View) p.this.Hw.get(this.WB)).requestFocus();
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -2300238731202448833L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(p.class);
        }

        @ey(method = -1559697999151168764L)
        public p(TrainerCourseActivity trainerCourseActivity, List<View> list, List<String> list2) {
            try {
                if (VH) {
                    iy.we(-1887110513833140835L, null, trainerCourseActivity, list, list2);
                }
                this.Zo = trainerCourseActivity;
                this.FH = -1;
                this.Hw = list;
                this.v5 = list2;
            } catch (Throwable th) {
                if (gn) {
                    iy.U2(th, -1887110513833140835L, null, trainerCourseActivity, list, list2);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 67182778454163813L)
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            try {
                if (VH) {
                    iy.we(-6556739124313317573L, this, viewGroup, new Integer(i), obj);
                }
                viewGroup.removeView((View) obj);
            } catch (Throwable th) {
                if (gn) {
                    iy.U2(th, -6556739124313317573L, this, viewGroup, new Integer(i), obj);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = -2509617637282846980L)
        public void finishUpdate(ViewGroup viewGroup) {
            try {
                if (VH) {
                    iy.tp(2545064216966649096L, this, viewGroup);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 2545064216966649096L, this, viewGroup);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 2606870616478401884L)
        public int getCount() {
            try {
                if (VH) {
                    iy.gn(622960791362162408L, this);
                }
                return this.Hw.size();
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 622960791362162408L, this);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 6312471531409736000L)
        public int getItemPosition(Object obj) {
            try {
                if (!VH) {
                    return -2;
                }
                iy.tp(2470376501352322108L, this, obj);
                return -2;
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 2470376501352322108L, this, obj);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = -1580021233491389679L)
        public CharSequence getPageTitle(int i) {
            try {
                if (VH) {
                    iy.u7(-2909114500953104037L, this, i);
                }
                String str = this.v5.get(i);
                if (i >= this.v5.size() - 1) {
                    return str;
                }
                return str + " ≫";
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -2909114500953104037L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 4311869841630747396L)
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            try {
                if (VH) {
                    iy.EQ(-5396516688708766152L, this, viewGroup, new Integer(i));
                }
                View view = this.Hw.get(i);
                viewGroup.addView(view, 0);
                return view;
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, -5396516688708766152L, this, viewGroup, new Integer(i));
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = -5495349713748634935L)
        public boolean isViewFromObject(View view, Object obj) {
            try {
                if (VH) {
                    iy.EQ(2360262691019808575L, this, view, obj);
                }
                return view.equals(obj);
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, 2360262691019808575L, this, view, obj);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = -844783105653872528L)
        public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
            try {
                if (VH) {
                    iy.EQ(-3768552481419452452L, this, parcelable, classLoader);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, -3768552481419452452L, this, parcelable, classLoader);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 2209701127051883727L)
        public Parcelable saveState() {
            try {
                if (!VH) {
                    return null;
                }
                iy.gn(-2965558156515453707L, this);
                return null;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -2965558156515453707L, this);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = -1100043443090525451L)
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            try {
                if (VH) {
                    iy.we(736632368675351191L, this, viewGroup, new Integer(i), obj);
                }
                super.setPrimaryItem(viewGroup, i, obj);
                if (this.FH != i) {
                    this.FH = i;
                    viewGroup.postDelayed(new a(i), 100L);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.U2(th, 736632368675351191L, this, viewGroup, new Integer(i), obj);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 55502750543852551L)
        public void startUpdate(ViewGroup viewGroup) {
            try {
                if (VH) {
                    iy.tp(-342487127963902863L, this, viewGroup);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -342487127963902863L, this, viewGroup);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(TrainerCourseActivity.class);
    }

    @ey(method = 2131258365731236053L)
    public TrainerCourseActivity() {
        try {
            if (w9) {
                iy.gn(-342302900921851459L, null);
            }
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -342302900921851459L, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1632501934255778720L)
    public void BT(c.j jVar, boolean z) {
        try {
            if (w9) {
                iy.EQ(-88312827226372375L, this, jVar, new Boolean(z));
            }
            finish();
            ServiceContainer.ro().FN(jVar, z);
        } catch (Throwable th) {
            if (hK) {
                iy.Mr(th, -88312827226372375L, this, jVar, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -4223882416285665360L)
    private void EQ(LinearLayout linearLayout, String str, int i2, int i3, boolean z) throws Throwable {
        LinearLayout linearLayout2;
        int i4;
        int i5;
        String str2;
        CharSequence charSequence;
        try {
            if (w9) {
                iy.J8(-1564127500740985179L, this, linearLayout, str, new Integer(i2), new Integer(i3), new Boolean(z));
            }
            linearLayout2 = new LinearLayout(this);
            i4 = -2;
            i5 = -1;
        } catch (Throwable th) {
            th = th;
        }
        try {
            linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.removeAllViews();
            int i6 = 0;
            while (i6 < this.zh) {
                LinearLayout linearLayout3 = new LinearLayout(this);
                linearLayout3.setOrientation(1);
                linearLayout3.setClipChildren(false);
                linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(i5, i4, 1.0f));
                int i7 = i6 + i2;
                while (i7 <= i3) {
                    c.j jVarVH = this.mb.VH(i7);
                    String strEQ = jVarVH.EQ();
                    if (ServiceContainer.ro().vJ(jVarVH)) {
                        strEQ = strEQ + "  " + ServiceContainer.ro().ro(jVarVH);
                    }
                    if (jVarVH.v5() <= 2) {
                        str2 = "x min";
                    } else {
                        str2 = jVarVH.v5() + " min";
                    }
                    if (ServiceContainer.ro().vJ(jVarVH)) {
                        charSequence = " ✔";
                    } else if (z || !jVarVH.J0()) {
                        charSequence = "➥ " + str2;
                    } else {
                        charSequence = "➥ " + str2 + " 🔒";
                    }
                    int i8 = i7;
                    LinearLayout linearLayout4 = linearLayout3;
                    linearLayout4.addView(XL(strEQ, Html.fromHtml(jVarVH.Hw()), charSequence, ServiceContainer.ro().I(jVarVH), new f(jVarVH)));
                    i7 = i8 + this.zh;
                    linearLayout3 = linearLayout4;
                }
                i6++;
                i4 = -2;
                i5 = -1;
            }
        } catch (Throwable th2) {
            th = th2;
            if (hK) {
                iy.lg(th, -1564127500740985179L, this, linearLayout, str, new Integer(i2), new Integer(i3), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 7808802028720587552L)
    private void J0(LinearLayout linearLayout, List<c.k> list, boolean z) throws Throwable {
        String str;
        try {
            if (w9) {
                iy.we(-5683176169943718949L, this, linearLayout, list, new Boolean(z));
            }
            LinearLayout linearLayout2 = new LinearLayout(this);
            int i2 = -2;
            int i3 = -1;
            try {
                linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
                int i4 = 0;
                while (i4 < this.zh) {
                    LinearLayout linearLayout3 = new LinearLayout(this);
                    linearLayout3.setOrientation(1);
                    linearLayout3.setClipChildren(false);
                    linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(i3, i2, 1.0f));
                    int i5 = i4;
                    while (i5 < list.size()) {
                        c.k kVar = list.get(i5);
                        boolean zZo = ServiceContainer.vy().Zo(kVar);
                        if (zZo) {
                            str = "➥";
                        } else {
                            str = "➥ " + getResources().getString(u.trainer_explore);
                        }
                        if (!z) {
                            str = str + " 🔒";
                        }
                        int i6 = i5;
                        linearLayout3.addView(XL(kVar.gn(), kVar.FH(), str, System.currentTimeMillis() - kVar.VH() < 5184000000L && !zZo, new b(kVar)));
                        i5 = i6 + this.zh;
                    }
                    i4++;
                    i2 = -2;
                    i3 = -1;
                }
            } catch (Throwable th) {
                th = th;
                if (hK) {
                    iy.U2(th, -5683176169943718949L, this, linearLayout, list, new Boolean(z));
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = -1838144688695223624L)
    private void J8(LinearLayout linearLayout, String str) {
        try {
            if (w9) {
                iy.EQ(-2663081943821659245L, this, linearLayout, str);
            }
            int i2 = (int) (getResources().getDisplayMetrics().density * 10.0f);
            int i3 = (int) (getResources().getDisplayMetrics().density * 5.0f);
            TextView textView = new TextView(this);
            textView.setGravity(17);
            textView.setTextSize(AndroidHelper.J8(this));
            textView.setText(str);
            textView.setTextColor(-7829368);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(i2, i3, i2, i3);
            linearLayout.addView(textView, layoutParams);
        } catch (Throwable th) {
            if (hK) {
                iy.Mr(th, -2663081943821659245L, this, linearLayout, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1778174206500561153L)
    public boolean Mr() {
        try {
            if (w9) {
                iy.gn(803200088688019544L, this);
            }
            if (!AndroidHelper.U2(this)) {
                if (!AndroidHelper.er()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 803200088688019544L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1524298078960679285L)
    public void P8() {
        try {
            if (w9) {
                iy.gn(-3056328295065585616L, this);
            }
            finish();
            new Handler().postDelayed(new e(), 200L);
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -3056328295065585616L, this);
            }
            throw th;
        }
    }

    @ey(method = 25788922400064512L)
    private void QX() {
        try {
            if (w9) {
                iy.gn(2079196751310358011L, this);
            }
            DrawerLayout drawerLayout = (DrawerLayout) findViewById(q.trainerDrawer);
            if (drawerLayout != null) {
                drawerLayout.closeDrawer(3);
            }
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 2079196751310358011L, this);
            }
            throw th;
        }
    }

    @ey(method = -7850669918661136896L)
    private void U2() {
        try {
            if (w9) {
                iy.gn(-4871249628133587237L, this);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.mb.u7() > 0) {
                LinearLayout linearLayoutWe = we(arrayList, arrayList2, u.trainer_section_learn);
                boolean zAM = ServiceContainer.getLicenseService().aM();
                for (int i2 = 0; i2 < this.mb.u7(); i2++) {
                    String strTp = this.mb.VH(i2).tp();
                    if (strTp.length() > 0) {
                        int i3 = i2 + 1;
                        while (i3 < this.mb.u7() && this.mb.VH(i3).tp().length() <= 0) {
                            i3++;
                        }
                        if (i2 != 0) {
                            tp(linearLayoutWe);
                        }
                        J8(linearLayoutWe, strTp);
                        if (i2 == 0) {
                            tp(linearLayoutWe);
                        }
                        EQ(linearLayoutWe, strTp, i2, i3 - 1, zAM);
                    }
                }
            }
            if (!ServiceContainer.g3()) {
                if (this.mb.Ws() > 0) {
                    List<c.k> listQX = this.mb.QX();
                    boolean zAM2 = ServiceContainer.getLicenseService().aM();
                    LinearLayout linearLayoutWe2 = we(arrayList, arrayList2, u.trainer_section_explore);
                    J8(linearLayoutWe2, this.mb.FH());
                    tp(linearLayoutWe2);
                    J0(linearLayoutWe2, listQX, zAM2);
                }
                List<TemplateService.TemplateGroup> listZo = ServiceContainer.getTemplateService().Zo(this.mb.v5());
                if (listZo.size() > 0) {
                    LinearLayout linearLayoutWe3 = we(arrayList, arrayList2, u.trainer_section_code);
                    J8(linearLayoutWe3, this.mb.j6());
                    tp(linearLayoutWe3);
                    Ws(linearLayoutWe3, listZo);
                }
            }
            ((ViewPager) findViewById(q.trainerViewPager)).setAdapter(new p(this, arrayList, arrayList2));
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -4871249628133587237L, this);
            }
            throw th;
        }
    }

    @ey(method = -3499475857357915667L)
    private void Ws(LinearLayout linearLayout, List<TemplateService.TemplateGroup> list) {
        try {
            if (w9) {
                iy.EQ(-4002429037227135576L, this, linearLayout, list);
            }
            LinearLayout linearLayout2 = new LinearLayout(this);
            int i2 = -2;
            linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
            int i3 = 0;
            while (i3 < this.zh) {
                LinearLayout linearLayout3 = new LinearLayout(this);
                linearLayout3.setOrientation(1);
                linearLayout3.setClipChildren(false);
                linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(-1, i2, 1.0f));
                int i4 = i3;
                while (i4 < list.size()) {
                    TemplateService.TemplateGroup templateGroup = list.get(i4);
                    Spanned spannedFromHtml = Html.fromHtml(this.mb.DW() + ".<br/><br/><b>" + templateGroup.Zo.j6 + "</b>");
                    int i5 = i4;
                    linearLayout3.addView(XL(getResources().getString(u.dialog_create_project_new, templateGroup.j6), spannedFromHtml, "➥ " + getResources().getString(u.trainer_code), false, new d(templateGroup)));
                    i4 = i5 + this.zh;
                }
                i3++;
                i2 = -2;
            }
        } catch (Throwable th) {
            if (hK) {
                iy.Mr(th, -4002429037227135576L, this, linearLayout, list);
            }
            throw th;
        }
    }

    @ey(method = 434779027514178165L)
    private View XL(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, View.OnClickListener onClickListener) {
        try {
            if (w9) {
                iy.J8(295747905130977320L, this, charSequence, charSequence2, charSequence3, new Boolean(z), onClickListener);
            }
            View viewInflate = LayoutInflater.from(this).inflate(r.trainer_lesson, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(q.trainerlistentryTitleView);
            TextView textView2 = (TextView) viewInflate.findViewById(q.trainerlistentryTextView);
            TextView textView3 = (TextView) viewInflate.findViewById(q.trainerlistentryRatingTextView);
            ImageView imageView = (ImageView) viewInflate.findViewById(q.trainerlistentryNewImage);
            textView.setTextSize(AndroidHelper.we(this));
            textView2.setTextSize(AndroidHelper.J8(this));
            textView3.setTextSize(AndroidHelper.tp(this));
            textView.setText(charSequence);
            textView2.setText(charSequence2);
            textView3.setText(charSequence3);
            imageView.setVisibility(z ? 0 : 8);
            viewInflate.findViewById(q.trainerlistentryBox).setOnClickListener(onClickListener);
            viewInflate.findViewById(q.trainerlistentryBox).setOnFocusChangeListener(new c(viewInflate));
            return viewInflate;
        } catch (Throwable th) {
            if (hK) {
                iy.lg(th, 295747905130977320L, this, charSequence, charSequence2, charSequence3, new Boolean(z), onClickListener);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1187629354013017104L)
    public void a8() {
        try {
            if (w9) {
                iy.gn(-225337383999413931L, this);
            }
            com.aide.ui.trainer.d.Hw((LinearLayout) findViewById(q.trainerLinearLayout2), this.jw, this.qp, this.k2, new i(), new j(), new k(), new l(), new m());
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -225337383999413931L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1986385679010592863L)
    public void aM() {
        try {
            if (w9) {
                iy.gn(286894120153518280L, this);
            }
            findViewById(q.trainerViewPager).requestFocus(2);
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 286894120153518280L, this);
            }
            throw th;
        }
    }

    @ey(method = -8825879856287840367L)
    public static void er(Activity activity, String str) {
        try {
            if (w9) {
                iy.EQ(-1498818464416789524L, null, activity, str);
            }
            Intent intent = new Intent(activity, (Class<?>) TrainerCourseActivity.class);
            intent.putExtra("EXTRA_COURSE", str);
            j6(activity, intent);
        } catch (Throwable th) {
            if (hK) {
                iy.Mr(th, -1498818464416789524L, null, activity, str);
            }
            throw th;
        }
    }

    @ey(method = -901392243437017969L)
    private int j3(Context context) {
        try {
            if (w9) {
                iy.tp(-3137790597289759980L, this, context);
            }
            return AndroidHelper.u7(context) >= 540.0f ? 2 : 1;
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, -3137790597289759980L, this, context);
            }
            throw th;
        }
    }

    private static /* synthetic */ void j6(Object obj, Intent intent) {
        ((Activity) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    @ey(method = -1408481179987079073L)
    private void lg() {
        try {
            if (w9) {
                iy.gn(804288801973357044L, this);
            }
            TrainerLogo.j6(getActionBar(), this.mb.Hw(), this.mb.XL());
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 804288801973357044L, this);
            }
            throw th;
        }
    }

    @ey(method = -6826268620870212897L)
    public static void rN(Activity activity) {
        try {
            if (w9) {
                iy.tp(-2023431351868590400L, null, activity);
            }
            er(activity, null);
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, -2023431351868590400L, null, activity);
            }
            throw th;
        }
    }

    @ey(method = 937737249902479665L)
    private void tp(LinearLayout linearLayout) {
        try {
            if (w9) {
                iy.tp(610143100795801440L, this, linearLayout);
            }
            int i2 = (int) (getResources().getDisplayMetrics().density * 10.0f);
            int i3 = (int) (getResources().getDisplayMetrics().density * 5.0f);
            int i4 = (int) (getResources().getDisplayMetrics().density * 60.0f);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R$drawable.down_arrow);
            imageView.setPadding(i2, i3, i2, i3);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i4);
            layoutParams.setMargins(i2, i3, i2, i3);
            linearLayout.addView(imageView, layoutParams);
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 610143100795801440L, this, linearLayout);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1492464226024227625L)
    public void vy(c.k kVar) {
        try {
            if (w9) {
                iy.tp(1546877756239297920L, this, kVar);
            }
            if (ServiceContainer.getLicenseService().aM()) {
                ServiceContainer.vy().VH(this, kVar, new n());
                return;
            }
            ServiceContainer.getLicenseService().sh(ServiceContainer.getMainActivity(), 1, u.shop_feature_samples_and_updates, "selectSample:" + kVar.gn(), false);
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 1546877756239297920L, this, kVar);
            }
            throw th;
        }
    }

    @ey(method = -1159399396062120240L)
    private LinearLayout we(List<View> list, List<String> list2, int i2) {
        try {
            if (w9) {
                iy.we(-1238714432380115763L, this, list, list2, new Integer(i2));
            }
            View viewInflate = LayoutInflater.from(this).inflate(r.trainer_course, (ViewGroup) null);
            list.add(viewInflate);
            list2.add(getResources().getString(i2));
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(q.trainerCourseLinearLayout1);
            linearLayout.removeAllViews();
            return linearLayout;
        } catch (Throwable th) {
            if (hK) {
                iy.U2(th, -1238714432380115763L, this, list, list2, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2501901660223228175L)
    protected void gW(c.j jVar) {
        try {
            if (w9) {
                iy.tp(1972773390598904080L, this, jVar);
            }
            if (!jVar.J0() || ServiceContainer.getLicenseService().aM()) {
                if (ServiceContainer.ro().g3(jVar)) {
                    MessageBox.yS(this, getResources().getString(u.trainer_restart_lesson), getResources().getString(u.trainer_restart_lesson_message_2), getResources().getString(u.trainer_restart), new o(jVar), getResources().getString(u.trainer_continue), new a(jVar), null);
                    return;
                } else {
                    BT(jVar, false);
                    return;
                }
            }
            this.fY = jVar;
            ServiceContainer.getLicenseService().sh(ServiceContainer.getMainActivity(), 1, u.shop_feature_lessons_and_updates, "selectLesson:" + jVar.Zo(), false);
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 1972773390598904080L, this, jVar);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -5535739836416426640L)
    protected void onActivityResult(int i2, int i3, Intent intent) {
        try {
            if (w9) {
                iy.we(91445914645159785L, this, new Integer(i2), new Integer(i3), intent);
            }
            iy.v5(this, i2, i3, intent);
            super.onActivityResult(i2, i3, intent);
            if (i2 == 1) {
                if (i3 == -1 && this.fY != null) {
                    gW(this.fY);
                }
                this.fY = null;
            }
        } catch (Throwable th) {
            if (hK) {
                iy.U2(th, 91445914645159785L, this, new Integer(i2), new Integer(i3), intent);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @ey(method = 134693899439516240L)
    public void onConfigurationChanged(Configuration configuration) {
        try {
            if (w9) {
                iy.tp(123685175761635773L, this, configuration);
            }
            super.onConfigurationChanged(configuration);
            if (this.WB != null) {
                this.WB.onConfigurationChanged(configuration);
            }
            int iJ3 = j3(this);
            if (this.zh != iJ3) {
                this.zh = iJ3;
                U2();
            }
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 123685175761635773L, this, configuration);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 212973423760032036L)
    public void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (w9) {
                iy.tp(-607178363520767913L, this, bundle);
            }
            super.onCreate(bundle);
            if (Mr()) {
                setContentView(r.trainer_tv);
            } else {
                setContentView(r.trainer);
            }
            this.qp = true;
            this.k2 = true;
            if (ServiceContainer.ro().aM() != null) {
                MessageBox.BT(this, "XML Error", ServiceContainer.ro().aM());
            }
            String stringExtra = getIntent().getStringExtra("EXTRA_COURSE");
            if (stringExtra == null && ServiceContainer.ro().j3() != null) {
                stringExtra = ServiceContainer.ro().j3().v5();
            }
            this.jw = ServiceContainer.ro().J8();
            c.d dVarXL = ServiceContainer.ro().XL(stringExtra);
            this.mb = dVarXL;
            if (dVarXL == null) {
                this.mb = ServiceContainer.ro().SI();
            }
            if (Mr()) {
                getActionBar().hide();
            } else {
                DrawerLayout drawerLayout = (DrawerLayout) findViewById(q.trainerDrawer);
                this.WB = new ActionBarDrawerToggle(this, drawerLayout, 2131165266, R.string.ok, R.string.ok);
                drawerLayout.setOnFocusChangeListener(new g(drawerLayout));
                drawerLayout.setDrawerListener(this.WB);
                View viewFindViewById = findViewById(q.trainerSideDrawer);
                if (AndroidHelper.VH(this) >= 500.0f) {
                    viewFindViewById.getLayoutParams().width = (int) (getResources().getDisplayMetrics().density * 300.0f);
                    viewFindViewById.requestLayout();
                }
                if ((!AL || !ServiceContainer.isTrainerMode()) && getIntent().getStringExtra("EXTRA_COURSE") == null) {
                    AL = true;
                    drawerLayout.postDelayed(new h(drawerLayout), 300L);
                }
                getActionBar().setDisplayHomeAsUpEnabled(true);
                getActionBar().setHomeButtonEnabled(true);
                AndroidHelper.gW(this);
            }
            this.zh = j3(this);
            a8();
            U2();
            lg();
            if (getIntent().getStringExtra("EXTRA_COURSE") == null || this.mb.u7() <= 0) {
                return;
            }
            ((ViewPager) findViewById(q.trainerViewPager)).setCurrentItem(1);
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, -607178363520767913L, this, bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 891868764557082443L)
    protected Dialog onCreateDialog(int i2, Bundle bundle) {
        try {
            if (w9) {
                iy.EQ(1808698521716287184L, this, new Integer(i2), bundle);
            }
            return MessageBox.Zo(this, i2);
        } catch (Throwable th) {
            if (hK) {
                iy.Mr(th, 1808698521716287184L, this, new Integer(i2), bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -1149002649831937840L)
    public boolean onCreateOptionsMenu(Menu menu) {
        try {
            if (w9) {
                iy.tp(3101828172763312187L, this, menu);
            }
            getMenuInflater().inflate(s.trainer_options_menu, menu);
            return true;
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 3101828172763312187L, this, menu);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    @ey(method = 738141379527276933L)
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        try {
            if (w9) {
                iy.EQ(-429622541645203536L, this, new Integer(i2), menuItem);
            }
            if (this.WB != null && this.WB.onOptionsItemSelected(menuItem)) {
                return true;
            }
            if (menuItem.getItemId() != 2131231117 && menuItem.getItemId() != 2131231118) {
                if (menuItem.getItemId() != 2131231119 && menuItem.getItemId() != 2131231120) {
                    return super.onMenuItemSelected(i2, menuItem);
                }
                AppPreferences.g3(AppPreferences.Ws() ? false : true);
                invalidateOptionsMenu();
                return true;
            }
            AppPreferences.vJ(AppPreferences.J8() ? false : true);
            invalidateOptionsMenu();
            return true;
        } catch (Throwable th) {
            if (hK) {
                iy.Mr(th, -429622541645203536L, this, new Integer(i2), menuItem);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 2502053865638603720L)
    protected void onPostCreate(Bundle bundle) {
        try {
            if (w9) {
                iy.tp(-1492829604616606179L, this, bundle);
            }
            super.onPostCreate(bundle);
            if (this.WB != null) {
                this.WB.syncState();
            }
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, -1492829604616606179L, this, bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -5239902246122698385L)
    public boolean onPrepareOptionsMenu(Menu menu) {
        try {
            if (w9) {
                iy.tp(-6554797172407388640L, this, menu);
            }
            super.onPrepareOptionsMenu(menu);
            menu.findItem(q.trainerMenuSoundOff).setVisible(!AppPreferences.J8());
            menu.findItem(q.trainerMenuSoundOn).setVisible(AppPreferences.J8());
            menu.findItem(q.trainerMenuVoiceOff).setVisible(AppPreferences.Ws() ? false : true);
            menu.findItem(q.trainerMenuVoiceOn).setVisible(AppPreferences.Ws());
            return true;
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, -6554797172407388640L, this, menu);
            }
            throw th;
        }
    }

    @ey(method = 1654634617322601332L)
    protected void yS(c.d dVar) {
        try {
            if (w9) {
                iy.tp(603323003716012111L, this, dVar);
            }
            if (!dVar.equals(this.mb)) {
                this.mb = dVar;
                U2();
                lg();
            }
            QX();
            aM();
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 603323003716012111L, this, dVar);
            }
            throw th;
        }
    }
}
