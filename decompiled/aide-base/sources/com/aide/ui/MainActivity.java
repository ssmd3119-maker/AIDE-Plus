package com.aide.ui;

import abcd.b0;
import abcd.cy;
import abcd.dd;
import abcd.dy;
import abcd.eg;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.kd;
import abcd.l8;
import abcd.od;
import abcd.rf;
import abcd.xe;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import android.widget.AbsoluteLayout;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.aide.common.AndroidHelper;
import com.aide.common.AppLog;
import com.aide.common.KeyStrokeDetector;
import com.aide.common.MessageBox;
import com.aide.common.ProgressDialogHandler;
import com.aide.common.SocialDialog;
import com.aide.common.TrainerLogo;
import com.aide.common.ValueRunnable;
import com.aide.ui.AIDEEditorPager;
import com.aide.ui.activities.GotoBrowserActivity;
import com.aide.ui.activities.TrainerCourseActivity;
import com.aide.ui.browsers.BrowserPager;
import com.aide.ui.browsers.DebugBrowser;
import com.aide.ui.browsers.ErrorBrowser;
import com.aide.ui.browsers.FileBrowser;
import com.aide.ui.browsers.LogCatBrowser;
import com.aide.ui.build.BuildService;
import com.aide.ui.build.BuildServiceCollect;
import com.aide.ui.build.OutputConsoleActivity;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.marketing.WhatsNewDialog;
import com.aide.ui.preferences.PreferencesActivity;
import com.aide.ui.project.AndroidProjectSupport;
import com.aide.ui.services.ErrorService;
import com.aide.ui.services.OpenFileService;
import com.aide.ui.trainer.c;
import com.aide.ui.util.FileSpan;
import com.aide.ui.util.FileSystem;
import com.aide.ui.views.SplitView;
import com.aide.uidesigner.XmlLayoutDesignActivity;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;

@cy(clazz = -1981002490985874240L, container = -1981002490985874240L, user = true)
/* loaded from: classes.dex */
public class MainActivity extends ThemedActionbarActivity implements ErrorService.ErrorListener, AIDEEditorPager.e, SharedPreferences.OnSharedPreferenceChangeListener, ActivityCompat.OnRequestPermissionsResultCallback {

    @gy
    private static /* synthetic */ boolean oy;

    @fy
    private static /* synthetic */ boolean pN;

    @dy(field = 2751447776653409911L)
    private x AL;

    @dy(field = 2741398005695927445L)
    private long Cz;

    @dy(field = -160895710568827525L)
    private boolean Gj;

    @dy(field = -24093287768113320L)
    private boolean Jl;

    @dy(field = -5428018486828467240L)
    private int Q6;

    @dy(field = 1777483796613941391L)
    private boolean Z1;

    @dy(field = -5773232072185910451L)
    private com.aide.ui.m cT;

    @dy(field = 2331912789701032821L)
    private Handler e3;

    @dy(field = 4551747408280102400L)
    private int eU;

    @dy(field = -1517486017922407456L)
    private View fN;

    @dy(field = 5525666882071792624L)
    private KeyStrokeDetector fY;

    @dy(field = -4028805068787523200L)
    private boolean hK;

    @dy(field = -3389933866388038632L)
    private boolean iW;

    @dy(field = -5039588260095173469L)
    private long jw;

    @dy(field = -2416470414756268168L)
    private ProgressDialogHandler k2;

    @dy(field = -1418841464465589204L)
    private boolean kf;

    @dy(field = -5423726809338115104L)
    private boolean n5;

    @dy(field = -1921242140843505888L)
    private QuickKeysBar pO;

    @dy(field = -701471339121161953L)
    private Object q7;

    @dy(field = -4410496634739510828L)
    private ProgressDialogHandler qp;

    @dy(field = -6457906674347362432L)
    private w sE;

    @dy(field = -2952349939644196299L)
    private QuickActionMenu sg;

    @dy(field = -456438211922533116L)
    private com.aide.ui.l w9;

    @dy(field = -2530838304918387528L)
    private com.aide.ui.w zh;

    @cy(clazz = 1124975945550347815L, container = -1981002490985874240L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 13472922964555640L)
        a() {
        }

        @Override // java.lang.Runnable
        @ey(method = 1414170144093506537L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-3515079643839719481L, this);
                }
                MainActivity.this.finish();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -3515079643839719481L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1125005697125481756L, container = -1981002490985874240L, user = true)
    class b implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -67268427629373084L)
        b() {
        }

        @Override // java.lang.Runnable
        @ey(method = 967390025714169135L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-3512474041389977232L, this);
                }
                y.J8(MainActivity.this);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -3512474041389977232L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1125035448704678991L, container = -1981002490985874240L, user = true)
    class c extends Thread {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 26427111612099797L)
        c(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        @ey(method = -53614773684621888L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-5008123740787498896L, this);
                }
                com.aide.ui.build.android.m.DW();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -5008123740787498896L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1125065200287939520L, container = -1981002490985874240L, user = true)
    class d implements ActionBar.TabListener {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = -1644236733845061015L)
        final /* synthetic */ String DW;

        @dy(field = -1180576061713039495L)
        final /* synthetic */ ActionBar.Tab j6;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -1833076905153638187L)
        d(ActionBar.Tab tab, String str) {
            this.j6 = tab;
            this.DW = str;
        }

        @Override // android.app.ActionBar.TabListener
        @ey(method = -100894341999570717L)
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
            try {
                if (Hw) {
                    iy.EQ(3854551495627058525L, this, tab, fragmentTransaction);
                }
                if (this.j6 != tab || ServiceContainer.isTrainerMode()) {
                    return;
                }
                MainActivity.this.oy();
            } catch (Throwable th) {
                if (v5) {
                    iy.Mr(th, 3854551495627058525L, this, tab, fragmentTransaction);
                }
                throw th;
            }
        }

        @Override // android.app.ActionBar.TabListener
        @ey(method = -4996079561462238228L)
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
            try {
                if (Hw) {
                    iy.EQ(2608240878253338000L, this, tab, fragmentTransaction);
                }
                if (this.j6 != tab || this.DW.equals(ServiceContainer.getOpenFileService().u7())) {
                    return;
                }
                ServiceContainer.getOpenFileService().sh(this.DW);
            } catch (Throwable th) {
                if (v5) {
                    iy.Mr(th, 2608240878253338000L, this, tab, fragmentTransaction);
                }
                throw th;
            }
        }

        @Override // android.app.ActionBar.TabListener
        @ey(method = 61146475171813665L)
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
            try {
                if (Hw) {
                    iy.EQ(2566423206188143211L, this, tab, fragmentTransaction);
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.Mr(th, 2566423206188143211L, this, tab, fragmentTransaction);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1125094951875263343L, container = -1981002490985874240L, user = true)
    class e implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(e.class);
        }

        @ey(method = -13108191142142232L)
        e() {
        }

        @Override // java.lang.Runnable
        @ey(method = -378831650203281531L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-5264680179443016357L, this);
                }
                ServiceContainer.getOpenFileService().KD(false, false);
                MainActivity.this.finish();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -5264680179443016357L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1125124703466650460L, container = -1981002490985874240L, user = true)
    class f implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(f.class);
        }

        @ey(method = -46859287020397725L)
        f() {
        }

        @Override // java.lang.Runnable
        @ey(method = -1136356357866515280L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-5262406050678607480L, this);
                }
                MainActivity.this.finish();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -5262406050678607480L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1125154455062100871L, container = -1981002490985874240L, user = true)
    class g implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(g.class);
        }

        @ey(method = 11253222901545100L)
        g() {
        }

        @Override // java.lang.Runnable
        @ey(method = 931680962472516779L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-5696536576560607125L, this);
                }
                ServiceContainer.DW().u7(true);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -5696536576560607125L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1125184206661614576L, container = -1981002490985874240L, user = true)
    class h implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(h.class);
        }

        @ey(method = -34133700802957305L)
        h() {
        }

        @Override // java.lang.Runnable
        @ey(method = -2362065445994081112L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(987071677952004403L, this);
                }
                ServiceContainer.DW().u7(true);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 987071677952004403L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1125213958265191575L, container = -1981002490985874240L, user = true)
    class i implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(i.class);
        }

        @ey(method = 1061890450934217L)
        i() {
        }

        @Override // java.lang.Runnable
        @ey(method = -1498340970189068240L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(7739551410126769605L, this);
                }
                MainActivity.this.SI().lp(BrowserPager.dW, false);
                MainActivity.this.sE(BrowserPager.dW);
                MainActivity.this.br().openSplit(false);
                MainActivity.this.sh().XG();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 7739551410126769605L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1125243709872831868L, container = -1981002490985874240L, user = true)
    class j implements ValueRunnable<Integer> {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -3050864516637702912L)
        final /* synthetic */ List j6;

        static {
            iy.Zo(j.class);
        }

        @ey(method = -8587337966111178732L)
        j(List list) {
            this.j6 = list;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -568616565127611648L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(Integer num) {
            try {
                if (FH) {
                    iy.tp(7897866087348640L, this, num);
                }
                ServiceContainer.getOpenFileService().sh(((AIDEEditor) this.j6.get(num.intValue())).getFilePath());
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 7897866087348640L, this, num);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4140211032937982397L, container = -1981002490985874240L, user = true)
    class k extends ProgressDialogHandler {

        @gy
        private static /* synthetic */ boolean EQ;

        @fy
        private static /* synthetic */ boolean tp;

        static {
            iy.Zo(k.class);
        }

        @ey(method = 2488842688291405056L)
        k(Activity activity, String str) {
            super(activity, str);
        }

        @Override // com.aide.common.ProgressDialogHandler
        @ey(method = -2650682003249108304L)
        protected void FH() {
            try {
                if (tp) {
                    iy.gn(7540525053099076115L, this);
                }
                ServiceContainer.getEngineService().br();
                ServiceContainer.getEngineService().OW();
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, 7540525053099076115L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1125037681969245384L, container = -1981002490985874240L, user = true)
    class l implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(l.class);
        }

        @ey(method = -7669352197113013440L)
        l() {
        }

        @Override // java.lang.Runnable
        @ey(method = 2206159624724091501L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(1829138574710412175L, this);
                }
                MainActivity.this.XL();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 1829138574710412175L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1125067433611423645L, container = -1981002490985874240L, user = true)
    class m implements ValueRunnable<List<Integer>> {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -1254760240757544024L)
        final /* synthetic */ List j6;

        static {
            iy.Zo(m.class);
        }

        @ey(method = -4058472425891063616L)
        m(List list) {
            this.j6 = list;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -6803819868485895801L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(List<Integer> list) {
            try {
                if (FH) {
                    iy.tp(4968767328808638908L, this, list);
                }
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    ServiceContainer.getOpenFileService().Hw(((AIDEEditor) this.j6.get(it.next().intValue())).getFilePath());
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 4968767328808638908L, this, list);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1125097185257665200L, container = -1981002490985874240L, user = true)
    class n implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(n.class);
        }

        @ey(method = 43673362370756625L)
        n() {
        }

        @Override // java.lang.Runnable
        @ey(method = -198076513852910436L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(1003364842806188736L, this);
                }
                synchronized (MainActivity.this.q7) {
                    try {
                        MainActivity.this.q7.wait(5000L);
                    } catch (InterruptedException unused) {
                    }
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 1003364842806188736L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4140328043547898460L, container = -1981002490985874240L, user = true)
    static class o implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 1932371538975598380L)
        final /* synthetic */ Context WB;

        static {
            iy.Zo(o.class);
        }

        @ey(method = 139961473128786816L)
        o(Context context) {
            this.WB = context;
        }

        @Override // java.lang.Runnable
        @ey(method = -130126593677055240L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(2404538013683652160L, this);
                }
                if (ServiceContainer.getMainActivity().jJ()) {
                    return;
                }
                MainActivity.fN(this.WB);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 2404538013683652160L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4140445054153751229L, container = -1981002490985874240L, user = true)
    class p implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(p.class);
        }

        @ey(method = -2974909596734200884L)
        p() {
        }

        @Override // java.lang.Runnable
        @ey(method = 1586297225125269003L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(5431817953160370585L, this);
                }
                SocialDialog.dx(MainActivity.this);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 5431817953160370585L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4140562064755540704L, container = -1981002490985874240L, user = true)
    class q implements b0 {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(q.class);
        }

        @ey(method = 4888503776266399728L)
        q() {
        }

        @Override // abcd.b0
        @ey(method = -1308362125227515053L)
        public boolean j6() {
            try {
                if (DW) {
                    iy.gn(-2474685620305422576L, this);
                }
                return AppPreferences.sG();
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -2474685620305422576L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4140679075353266885L, container = -1981002490985874240L, user = true)
    class r implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(r.class);
        }

        @ey(method = 4762705559222516760L)
        r() {
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 330628053220612200L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(3727653853579504100L, this, view);
                }
                MainActivity.this.Nh();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, 3727653853579504100L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4140796085946929772L, container = -1981002490985874240L, user = true)
    class s implements SplitView.OnSplitChangeListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(s.class);
        }

        @ey(method = 636926862480486487L)
        s() {
        }

        @Override // com.aide.ui.views.SplitView.OnSplitChangeListener
        @ey(method = -1328655800693428407L)
        public void j6(boolean z) {
            try {
                if (DW) {
                    iy.Ws(1492566943558090099L, this, z);
                }
                MainActivity.this.q7();
                if (z) {
                    MainActivity.this.SI().Qq();
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 1492566943558090099L, this, new Boolean(z));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4140913096536529365L, container = -1981002490985874240L, user = true)
    class t implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(t.class);
        }

        @ey(method = 2452393639788033557L)
        t() {
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 314318858505901431L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(-8179110552710913615L, this, view);
                }
                if (ServiceContainer.isTrainerMode()) {
                    return;
                }
                MainActivity.this.k2();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -8179110552710913615L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4141030107122065664L, container = -1981002490985874240L, user = true)
    class u implements BuildService.BuildListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(u.class);
        }

        @ey(method = -4942576478098560359L)
        u() {
        }

        @Override // com.aide.ui.build.BuildService.BuildListener
        @ey(method = 1153913243083318275L)
        public void FH() {
            try {
                if (mb) {
                    iy.gn(3424166095657589471L, this);
                }
                if (ServiceContainer.Zo().tp()) {
                    return;
                }
                MainActivity.this.qp.DW();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 3424166095657589471L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4141147117703538669L, container = -1981002490985874240L, user = true)
    class v implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(v.class);
        }

        @ey(method = -938586441692959367L)
        v() {
        }

        @Override // java.lang.Runnable
        @ey(method = -2146360306160939300L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-3517684762096636640L, this);
                }
                MainActivity.this.finish();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -3517684762096636640L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 692617118190403027L, container = 692617118190403027L, user = true)
    private static class w implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(w.class);
        }

        @ey(method = 2908430893311994911L)
        private w() {
            try {
                if (WB) {
                    iy.gn(4616828002671483648L, null);
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 4616828002671483648L, null);
                }
                throw th;
            }
        }

        @Override // java.lang.Runnable
        @ey(method = 2214448177020104144L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(-853655818818699468L, this);
                }
                ServiceContainer.getOpenFileService().KD(true, false);
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -853655818818699468L, this);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -164152578601402260L)
        /* synthetic */ w(k kVar) {
            this();
            try {
                if (WB) {
                    iy.tp(998549494031073237L, null, kVar);
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, 998549494031073237L, null, kVar);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(MainActivity.class);
    }

    @ey(method = -533492043018266176L)
    public MainActivity() {
        k kVar = null;
        try {
            if (pN) {
                iy.gn(1862986254162943800L, null);
            }
            this.qp = new ProgressDialogHandler(this, "Starting...");
            this.k2 = new k(this, "Analyzing...");
            this.zh = new com.aide.ui.w(this);
            this.q7 = new Object();
            this.Q6 = -1;
            this.sE = new w(kVar);
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 1862986254162943800L, null);
            }
            throw th;
        }
    }

    @ey(method = 5400775798527799863L)
    private void Jl() {
        try {
            if (pN) {
                iy.gn(-5458099954109297019L, this);
            }
            if (this.cT != null) {
                this.cT.FH(!ServiceContainer.isTrainerMode() && (br().splitHorizontalByDefault() || !br().isSplit()) && !sh().aq() && AndroidHelper.j3(ServiceContainer.getContext()));
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -5458099954109297019L, this);
            }
            throw th;
        }
    }

    @ey(method = -643555619009590921L)
    private void Mr() {
        try {
            if (pN) {
                iy.gn(-3741253065710655311L, this);
            }
            if (com.aide.ui.build.android.m.j6()) {
                c cVar = new c("Old NDK Version Deleter");
                cVar.setDaemon(true);
                cVar.setPriority(1);
                cVar.start();
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -3741253065710655311L, this);
            }
            throw th;
        }
    }

    @ey(method = 1129457808585802045L)
    public static PendingIntent Mz(Context context) {
        try {
            if (pN) {
                iy.tp(974880939811614451L, null, context);
            }
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra("EXTRA_UPGRADE_NOTIFICATION_CLICKED", true);
            intent.addFlags(67108864);
            return iy.j6(context, new Random().nextInt(), intent, 134217728);
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, 974880939811614451L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -825626326321202880L)
    public static PendingIntent OW(Context context) {
        try {
            if (pN) {
                iy.tp(21218161849494140L, null, context);
            }
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra("EXTRA_SHOWN_FROM_UPDATE_TRAINER_NOTIFICATION", true);
            intent.addFlags(67108864);
            return iy.j6(context, 0, intent, 134217728);
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, 21218161849494140L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -6623719825166839549L)
    private void Q6() {
        try {
            if (pN) {
                iy.gn(2606524693143674721L, this);
            }
            AIDEErrorsView aIDEErrorsViewDx = dx();
            if (aIDEErrorsViewDx != null) {
                aIDEErrorsViewDx.DW();
                findViewById(com.aide.ui.q.mainActionBarNoTabs).invalidate();
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 2606524693143674721L, this);
            }
            throw th;
        }
    }

    @ey(method = 2072393406294242400L)
    private void U2() {
        try {
            if (pN) {
                iy.gn(296148932937265100L, this);
            }
            try {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
                int i2 = defaultSharedPreferences.getInt("first_seen_version", -1);
                this.Q6 = i2;
                if (i2 == -1) {
                    if (x9(false) == null) {
                        this.Q6 = KD();
                        this.kf = true;
                    } else {
                        this.Q6 = 103;
                    }
                    SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
                    editorEdit.putInt("first_seen_version", KD());
                    editorEdit.commit();
                }
                long j2 = defaultSharedPreferences.getLong("first_run_time", -1L);
                this.Cz = j2;
                if (j2 == -1) {
                    this.Cz = System.currentTimeMillis();
                    SharedPreferences.Editor editorEdit2 = defaultSharedPreferences.edit();
                    editorEdit2.putLong("first_run_time", this.Cz);
                    editorEdit2.commit();
                }
            } catch (Throwable th) {
                AppLog.v5(th);
            }
        } catch (Throwable th2) {
            if (oy) {
                iy.aM(th2, 296148932937265100L, this);
            }
            throw th2;
        }
    }

    private static /* synthetic */ void VH(Object obj, Intent intent) {
        ((Context) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    @ey(method = -468358651451099637L)
    private void WB() {
        try {
            if (pN) {
                iy.gn(-262702091021583375L, this);
            }
            int i2 = getSharedPreferences("BrowserLayout", 0).getInt("CurrentBrowser", -1);
            if (i2 >= 0) {
                ye(i2, false);
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -262702091021583375L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1781109794146259061L)
    public void XL() {
        try {
            if (pN) {
                iy.gn(-415912483087167231L, this);
            }
            List<AIDEEditor> fileEditors = sh().getFileEditors();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<AIDEEditor> it = fileEditors.iterator();
            while (it.hasNext()) {
                String filePath = it.next().getFilePath();
                String name = FileSystem.getName(filePath);
                boolean zSG = ServiceContainer.getOpenFileService().getOpenFileModel(filePath).sG();
                if (zSG) {
                    name = name + " *";
                }
                arrayList.add(name);
                arrayList2.add(Boolean.valueOf(!zSG));
            }
            MessageBox.we(ServiceContainer.getMainActivity(), "Close Files", arrayList, arrayList2, new m(fileEditors));
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -415912483087167231L, this);
            }
            throw th;
        }
    }

    private static /* synthetic */ void Zo(Object obj, Intent intent) {
        ((Activity) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    @ey(method = 2851406836585602880L)
    public static PendingIntent aj(Context context) {
        try {
            if (pN) {
                iy.tp(-1695465838020102464L, null, context);
            }
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra("EXTRA_SHOWN_FROM_PROMO_NOTIFICATION", true);
            intent.addFlags(67108864);
            return iy.j6(context, 0, intent, 134217728);
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -1695465838020102464L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 4195372412398278960L)
    private AIDEErrorsView dx() {
        try {
            if (pN) {
                iy.gn(3680057943276054720L, this);
            }
            AIDEErrorsView aIDEErrorsView = (AIDEErrorsView) findViewById(com.aide.ui.q.mainMenuErrorsView);
            if (aIDEErrorsView != null) {
                return aIDEErrorsView;
            }
            View viewFindViewById = findViewById(com.aide.ui.q.errorsViewContainer);
            if (viewFindViewById == null) {
                return null;
            }
            ViewParent parent = viewFindViewById.getParent();
            if (parent instanceof AIDEErrorsView) {
                return (AIDEErrorsView) parent;
            }
            return null;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 3680057943276054720L, this);
            }
            throw th;
        }
    }

    @ey(method = 87142483565127935L)
    private Spinner ei() {
        Object obj;
        try {
            if (pN) {
                iy.gn(-8806447149667024795L, this);
            }
            try {
                View viewFindViewById = findViewById(getResources().getIdentifier("action_bar", "id", "android"));
                Field declaredField = viewFindViewById.getClass().getDeclaredField("mTabScrollView");
                declaredField.setAccessible(true);
                obj = declaredField.get(viewFindViewById);
            } catch (Exception unused) {
            }
            if (obj == null) {
                return null;
            }
            Field declaredField2 = obj.getClass().getDeclaredField("mTabSpinner");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                return (Spinner) obj2;
            }
            return null;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -8806447149667024795L, this);
            }
            throw th;
        }
    }

    @ey(method = 7116449741906005044L)
    private void er(boolean z) {
        try {
            if (pN) {
                iy.Ws(6332544365223687936L, this, z);
            }
            this.hK = z;
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, 6332544365223687936L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1145631514171071136L)
    public static void fN(Context context) {
        try {
            if (pN) {
                iy.tp(-601374317056579584L, null, context);
            }
            if (ServiceContainer.vJ()) {
                Intent intent = new Intent(context, (Class<?>) MainActivity.class);
                intent.addFlags(335544320);
                intent.putExtra("EXTRA_NAVIGATE_BREAKPOINT", true);
                VH(context, intent);
                return;
            }
            if (!ServiceContainer.getMainActivity().jJ()) {
                Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
                intent2.addFlags(805306368);
                intent2.putExtra("EXTRA_NAVIGATE_BREAKPOINT", true);
                VH(context, intent2);
                return;
            }
            ServiceContainer.getMainActivity().q7();
            ServiceContainer.getMainActivity().aq(ServiceContainer.getDebugger().EQ());
            ServiceContainer.getMainActivity().cn().Hw();
            ServiceContainer.getMainActivity().sh().invalidate();
            new Handler().postDelayed(new o(context), 500L);
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -601374317056579584L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -388360664383583459L)
    private void gW() {
        try {
            if (pN) {
                iy.gn(-184990920120068237L, this);
            }
            String path = new File(ServiceContainer.getFileBrowserService().DW(), ".nomedia").getPath();
            if (!FileSystem.exists(ServiceContainer.getFileBrowserService().DW()) || FileSystem.exists(path)) {
                return;
            }
            try {
                FileSystem.Hw(path);
            } catch (IOException e2) {
                AppLog.v5(e2);
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -184990920120068237L, this);
            }
            throw th;
        }
    }

    private static /* synthetic */ void gn(Object obj, Intent intent) {
        ((MainActivity) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    @ey(method = 5222014626317530080L)
    private void iW() {
        try {
            if (pN) {
                iy.gn(1346052546691101592L, this);
            }
            this.pO.gn(sh().getQuickKeys());
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 1346052546691101592L, this);
            }
            throw th;
        }
    }

    @ey(method = 668007846353920293L)
    public static void jO(Activity activity, IntentSender intentSender) {
        try {
            if (pN) {
                iy.EQ(673074874303608735L, null, activity, intentSender);
            }
            Intent intent = new Intent(activity, (Class<?>) MainActivity.class);
            intent.putExtra("EXTRA_NAVIGATE_PLAY_STORE_INTENT_SENDER", intentSender);
            intent.addFlags(67108864);
            Zo(activity, intent);
        } catch (Throwable th) {
            if (oy) {
                iy.Mr(th, 673074874303608735L, null, activity, intentSender);
            }
            throw th;
        }
    }

    @ey(method = 5485803063725359144L)
    private void jw() {
        try {
            if (pN) {
                iy.gn(446754249381122676L, this);
            }
            aq(ServiceContainer.getDebugger().EQ());
            ServiceContainer.getMainActivity().cn().Hw();
            new Handler().postDelayed(new i(), 500L);
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 446754249381122676L, this);
            }
            throw th;
        }
    }

    @ey(method = -38307111559217912L)
    public static PendingIntent lp(Context context) {
        try {
            if (pN) {
                iy.tp(-3262885851434411424L, null, context);
            }
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra("EXTRA_SHOWN_FROM_TRAINER_NOTIFICATION", true);
            intent.addFlags(67108864);
            return iy.j6(context, 0, intent, 134217728);
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -3262885851434411424L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 929809671584905559L)
    private void n5() {
        try {
            if (pN) {
                iy.gn(146135617972284693L, this);
            }
            ((AIDEAnalysisProgressBar) findViewById(com.aide.ui.q.mainErrorProgress)).DW();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 146135617972284693L, this);
            }
            throw th;
        }
    }

    @ey(method = -5205825228410089540L)
    private static int nw(Context context) {
        try {
            if (pN) {
                iy.tp(-4735851434324891168L, null, context);
            }
            try {
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).icon;
            } catch (PackageManager.NameNotFoundException unused) {
                return 2131165304;
            }
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -4735851434324891168L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 1522997978144505204L)
    private boolean pN() {
        try {
            if (pN) {
                iy.gn(-3800762838021417736L, this);
            }
            if (!ServiceContainer.isTrainerMode() || !ServiceContainer.ro().Mz()) {
                if (!AppPreferences.Qq()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -3800762838021417736L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -5652906667346312447L)
    public void sE(int i2) {
        try {
            if (pN) {
                iy.u7(-5158485028209632233L, this, i2);
            }
            SharedPreferences.Editor editorEdit = getSharedPreferences("BrowserLayout", 0).edit();
            editorEdit.putInt("CurrentBrowser", i2);
            editorEdit.commit();
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -5158485028209632233L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 4618268948420999344L)
    private void setHasEmbeddedTabs() {
        try {
            if (pN) {
                iy.gn(828424544401354880L, this);
            }
            if (ServiceContainer.isTrainerMode() && AndroidHelper.u7(this) <= 610.0f) {
                AndroidHelper.ei(this, false);
            } else if (AndroidHelper.lg(this)) {
                AndroidHelper.ei(this, true);
            }
            AndroidHelper.nw(this);
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 828424544401354880L, this);
            }
            throw th;
        }
    }

    @ey(method = -3748351665489930741L)
    private void sg(Menu menu) {
        String strJ6;
        try {
            if (pN) {
                iy.tp(79397945041277357L, this, menu);
            }
            for (int i2 = 0; i2 < menu.size(); i2++) {
                MenuItem item = menu.getItem(i2);
                MenuItemCommand menuItemCommandU7 = AppCommands.u7(item.getItemId());
                if (menuItemCommandU7 != null) {
                    item.setEnabled(menuItemCommandU7.isEnabled());
                    if (menuItemCommandU7 instanceof MenuCommand) {
                        item.setVisible(((MenuCommand) menuItemCommandU7).isVisible(false));
                    }
                    if ((menuItemCommandU7 instanceof eg) && (strJ6 = ((eg) menuItemCommandU7).j6()) != null) {
                        item.setTitle(strJ6);
                    }
                }
                rf rfVarDW = AppCommands.DW(item.getItemId());
                if (rfVarDW != null) {
                    item.setVisible(rfVarDW.isVisible());
                    item.setEnabled(rfVarDW.isEnabled());
                }
                if (item.hasSubMenu()) {
                    sg(item.getSubMenu());
                }
            }
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, 79397945041277357L, this, menu);
            }
            throw th;
        }
    }

    @ey(method = -1839098118655897317L)
    public static PendingIntent sy(Context context) {
        try {
            if (pN) {
                iy.tp(-3150994128857052075L, null, context);
            }
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra("EXTRA_SHOWN_FROM_NOTIFICATION", true);
            intent.addFlags(67108864);
            return iy.j6(context, 0, intent, 134217728);
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -3150994128857052075L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -2740295888457384756L)
    private void ye(int i2, boolean z) {
        try {
            if (pN) {
                iy.EQ(2337071661471164256L, this, new Integer(i2), new Boolean(z));
            }
            SI().lp(i2, z && br().isSplit());
            sE(i2);
            br().openSplit(z);
            br().getBottomView().requestFocus();
            ServiceContainer.DW().u7(false);
        } catch (Throwable th) {
            if (oy) {
                iy.Mr(th, 2337071661471164256L, this, new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1614586592597334208L)
    public void AL() {
        try {
            if (pN) {
                iy.gn(-3437313114291932040L, this);
            }
            sh().Eq();
            ye(BrowserPager.Yi, true);
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -3437313114291932040L, this);
            }
            throw th;
        }
    }

    @ey(method = 2527647767218926207L)
    public void BT() {
        try {
            if (pN) {
                iy.gn(-829636997340082635L, this);
            }
            if (ServiceContainer.getOpenFileService().U2()) {
                MessageBox.a8(this, com.aide.ui.u.dialog_save_files_title, com.aide.ui.u.dialog_save_files_message, new e(), new f());
            } else {
                finish();
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -829636997340082635L, this);
            }
            throw th;
        }
    }

    @ey(method = -173415274940004387L)
    public boolean CU() {
        try {
            if (pN) {
                iy.gn(3178293517439283535L, this);
            }
            if (this.AL == null || !this.AL.j6()) {
                if (this.w9 != null) {
                    if (this.w9.DW()) {
                    }
                }
                return false;
            }
            return true;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 3178293517439283535L, this);
            }
            throw th;
        }
    }

    @ey(method = 5256669370778131065L)
    public void Cz() {
        try {
            if (pN) {
                iy.gn(795839740302793375L, this);
            }
            MessageBox.gW(this, new kd());
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 795839740302793375L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ErrorService.ErrorListener
    @ey(method = -4166804333880091584L)
    public void DW() {
        try {
            if (pN) {
                iy.gn(2901957902805747744L, this);
            }
            n5();
            Q6();
            cb().Zo();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 2901957902805747744L, this);
            }
            throw th;
        }
    }

    @ey(method = 2261087208833993280L)
    public boolean Eq() {
        try {
            if (pN) {
                iy.gn(-1120675079468553040L, this);
            }
            FileSpan fileSpanJ6 = ServiceContainer.getNavigateService().j6();
            if (fileSpanJ6 == null) {
                return false;
            }
            ServiceContainer.getNavigateService().u7(false);
            aq(fileSpanJ6);
            return true;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -1120675079468553040L, this);
            }
            throw th;
        }
    }

    @ey(method = 3049112412977375937L)
    public void Ev(int i2) {
        try {
            if (pN) {
                iy.u7(4359355798432761819L, this, i2);
            }
            aM();
            iW();
            ActionBar actionBar = getActionBar();
            if (i2 < 0 || i2 >= actionBar.getTabCount() || i2 == actionBar.getSelectedNavigationIndex()) {
                return;
            }
            actionBar.selectTab(actionBar.getTabAt(i2));
            Spinner spinnerEi = ei();
            if (spinnerEi != null) {
                spinnerEi.setSelection(i2);
            }
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, 4359355798432761819L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.AIDEEditorPager.e
    @ey(method = 1431738739993958200L)
    public void FH(boolean z) {
        try {
            if (pN) {
                iy.Ws(-248649215782877440L, this, z);
            }
            ServiceContainer.DW().u7(!z);
            q7();
            if (z) {
                if ((AndroidHelper.Zo(this) > 800.0f || br().isHorizontal()) && AndroidHelper.Zo(this) >= 540.0f) {
                    return;
                }
                Ws(false);
            }
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -248649215782877440L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1293159028690967407L)
    public void FN(FileSpan fileSpan, boolean z) {
        try {
            if (pN) {
                iy.EQ(-2122220350538215515L, this, fileSpan, new Boolean(z));
            }
            if (fileSpan == null || !FileSystem.KD(fileSpan.j6)) {
                return;
            }
            if (fileSpan.j6.equals(ServiceContainer.getOpenFileService().u7())) {
                sh().w9(fileSpan.DW, fileSpan.FH, fileSpan.Hw, fileSpan.v5);
                if (z) {
                    sh().jJ();
                }
                ServiceContainer.getNavigateService().u7(true);
                return;
            }
            boolean zZo = ServiceContainer.getNavigateService().Zo();
            ServiceContainer.getNavigateService().u7(false);
            try {
                try {
                    ServiceContainer.getOpenFileService().lg(fileSpan.j6, true);
                    if (zZo) {
                        ServiceContainer.getNavigateService().u7(true);
                    }
                    sh().w9(fileSpan.DW, fileSpan.FH, fileSpan.Hw, fileSpan.v5);
                    sh().XG();
                    ServiceContainer.getNavigateService().u7(true);
                } finally {
                    if (zZo) {
                        ServiceContainer.getNavigateService().u7(true);
                    }
                }
            } catch (IOException unused) {
                Toast.makeText(ServiceContainer.getContext(), fileSpan.j6 + " could not be loaded!", 1).show();
            }
        } catch (Throwable th) {
            if (oy) {
                iy.Mr(th, -2122220350538215515L, this, fileSpan, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 536871195522740572L)
    public void Gj() {
        try {
            if (pN) {
                iy.gn(127263584091848544L, this);
            }
            if (ServiceContainer.isTrainerMode()) {
                this.qp.Hw();
            } else {
                MessageBox.gW(this, new dd());
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 127263584091848544L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ErrorService.ErrorListener
    @ey(method = 425053745510216832L)
    public void Hw(String str) {
        try {
            if (pN) {
                iy.tp(670508215522849832L, this, str);
            }
            n5();
            Q6();
            cb().VH();
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, 670508215522849832L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1690485426709292880L)
    public View I() {
        try {
            if (pN) {
                iy.gn(-2186266043102703648L, this);
            }
            return this.fN;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -2186266043102703648L, this);
            }
            throw th;
        }
    }

    @ey(method = 80713584802471709L)
    public void IS(int i2) {
        try {
            if (pN) {
                iy.u7(-244071912378856221L, this, i2);
            }
            PreferencesActivity.DW(this, i2);
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -244071912378856221L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 168113429615687040L)
    public void J0(String str) {
        try {
            if (pN) {
                iy.tp(-24047024107869400L, this, str);
            }
            ActionBar actionBar = getActionBar();
            ActionBar.Tab text = actionBar.newTab().setText(FileSystem.getName(str));
            text.setTabListener(new d(text, str));
            actionBar.addTab(text, false);
            setHasEmbeddedTabs();
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -24047024107869400L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 3956269726508128105L)
    public void J8(int i2) {
        try {
            if (pN) {
                iy.u7(-4476192035481663921L, this, i2);
            }
            sE(i2);
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -4476192035481663921L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -5154655945375752L)
    public int KD() {
        try {
            if (pN) {
                iy.gn(-5504721002235403264L, this);
            }
            try {
                return getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e2) {
                AppLog.v5(e2);
                return 0;
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -5504721002235403264L, this);
            }
            throw th;
        }
    }

    @ey(method = -861653455151588724L)
    public void Nh() {
        try {
            if (pN) {
                iy.gn(2394188097792941024L, this);
            }
            br().toggleSplit(new h());
            if (br().isSplit()) {
                sh().Eq();
            }
            if (br().isSplit()) {
                ServiceContainer.DW().u7(false);
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 2394188097792941024L, this);
            }
            throw th;
        }
    }

    @ey(method = -3854456860377082184L)
    public float P8() {
        AIDEErrorsView aIDEErrorsViewDx;
        try {
            if (pN) {
                iy.gn(5707940471395355724L, this);
            }
            return (AndroidHelper.lg(this) || (aIDEErrorsViewDx = dx()) == null) ? (AndroidHelper.u7(this) - 300.0f) * getResources().getDisplayMetrics().density : ((View) aIDEErrorsViewDx.getParent()).getLeft() - (getResources().getDisplayMetrics().density * 10.0f);
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 5707940471395355724L, this);
            }
            throw th;
        }
    }

    @ey(method = 2238923799560618775L)
    public void QO(View view, Rect rect) {
        try {
            if (pN) {
                iy.EQ(856364838449574741L, this, view, rect);
            }
            this.fN = view;
            AbsoluteLayout absoluteLayout = (AbsoluteLayout) findViewById(com.aide.ui.q.mainPopupAnchorContainer);
            int[] iArr = new int[2];
            absoluteLayout.getLocationOnScreen(iArr);
            absoluteLayout.removeAllViews();
            absoluteLayout.addView(view, new AbsoluteLayout.LayoutParams(rect.width(), rect.height(), rect.left - iArr[0], rect.top - iArr[1]));
        } catch (Throwable th) {
            if (oy) {
                iy.Mr(th, 856364838449574741L, this, view, rect);
            }
            throw th;
        }
    }

    @ey(method = -4077606789164112765L)
    public void QX() {
        try {
            if (pN) {
                iy.gn(4870230431338593605L, this);
            }
            if (SI().getCurrentBrowser() == BrowserPager.dW) {
                br().closeSplit(true);
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 4870230431338593605L, this);
            }
            throw th;
        }
    }

    @ey(method = 3742426199051412992L)
    public int Qq() {
        try {
            if (pN) {
                iy.gn(2872822006242391584L, this);
            }
            return this.pO.v5();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 2872822006242391584L, this);
            }
            throw th;
        }
    }

    @ey(method = 4308880806514464345L)
    public BrowserPager SI() {
        try {
            if (pN) {
                iy.gn(-2110395425720344785L, this);
            }
            return (BrowserPager) findViewById(com.aide.ui.q.mainBrowserPager);
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -2110395425720344785L, this);
            }
            throw th;
        }
    }

    @ey(method = -5631946310507733531L)
    public int Sf() {
        try {
            if (pN) {
                iy.gn(-310444923270529329L, this);
            }
            return this.Q6;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -310444923270529329L, this);
            }
            throw th;
        }
    }

    @ey(method = -4257206791728058893L)
    public void Ws(boolean z) {
        try {
            if (pN) {
                iy.Ws(418985282738410101L, this, z);
            }
            sE(-1);
            if (br().isSplit()) {
                br().closeSplit(z, new g());
                sh().jJ();
            }
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, 418985282738410101L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1808841516417658416L)
    public boolean XG() {
        try {
            if (pN) {
                iy.gn(952866375292078128L, this);
            }
            return this.Jl;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 952866375292078128L, this);
            }
            throw th;
        }
    }

    @ey(method = -886978356124276392L)
    public boolean Xa() {
        try {
            if (pN) {
                iy.gn(-55427944570507392L, this);
            }
            if (ServiceContainer.getProjectService().isOpenProject() && ServiceContainer.getProjectService().x9()) {
                String projectPackageName = AndroidProjectSupport.getProjectPackageName(ServiceContainer.getProjectService().getCurrentAppHome(), null);
                SharedPreferences sharedPreferences = getSharedPreferences("ValuableApps", 0);
                String string = sharedPreferences.getString("ValuableApps", "");
                if (!new HashSet(Arrays.asList(string.split("\n"))).contains(projectPackageName)) {
                    StringBuilder sb = new StringBuilder(string);
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(projectPackageName);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString("ValuableApps", sb.toString());
                    editorEdit.commit();
                    MessageBox.KD(this, "Do you want to get more exposure for your app?", "If you have built something great using AIDE please write about it in our community.", true, "Open Google+", new p(), "Not now", null);
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -55427944570507392L, this);
            }
            throw th;
        }
    }

    @ey(method = 174190838347037589L)
    public void Z1() {
        try {
            if (pN) {
                iy.gn(-1041220060617287769L, this);
            }
            kf();
            ServiceContainer.getProjectService().wc();
            ServiceContainer.getFileBrowserService().v5();
            ServiceContainer.getEngineService().yO();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -1041220060617287769L, this);
            }
            throw th;
        }
    }

    @ey(method = -1870598533286717559L)
    public void a5(String str, String str2) {
        try {
            if (pN) {
                iy.EQ(-1869584045490835605L, this, str, str2);
            }
            sh().Eq();
            ServiceContainer.sy(ServiceContainer.getMainActivity(), "Starting App...", new n(), null);
            ServiceContainer.J8().VH(str, str2);
        } catch (Throwable th) {
            if (oy) {
                iy.Mr(th, -1869584045490835605L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -1277956128002237852L)
    public void a8() {
        try {
            if (pN) {
                iy.gn(4869024319910634120L, this);
            }
            if (et()) {
                er(false);
                sh().setIdentifierClickingEnabled(et());
                q7();
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 4869024319910634120L, this);
            }
            throw th;
        }
    }

    @ey(method = -1144195913759191700L)
    public void aM() {
        try {
            if (pN) {
                iy.gn(164116468977829200L, this);
            }
            this.fN = null;
            ((AbsoluteLayout) findViewById(com.aide.ui.q.mainPopupAnchorContainer)).removeAllViews();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 164116468977829200L, this);
            }
            throw th;
        }
    }

    @ey(method = 636993727094380617L)
    public void aX() {
        try {
            if (pN) {
                iy.gn(1534907939351302707L, this);
            }
            MessageBox.gW(this, new od());
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 1534907939351302707L, this);
            }
            throw th;
        }
    }

    @ey(method = 3316564013991393888L)
    public void aq(FileSpan fileSpan) {
        try {
            if (pN) {
                iy.tp(-2219380232062322656L, this, fileSpan);
            }
            FN(fileSpan, true);
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -2219380232062322656L, this, fileSpan);
            }
            throw th;
        }
    }

    @ey(method = 1713028793827462527L)
    public SplitView br() {
        try {
            if (pN) {
                iy.gn(-1621792865911933143L, this);
            }
            return (SplitView) findViewById(com.aide.ui.q.mainSplitView);
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -1621792865911933143L, this);
            }
            throw th;
        }
    }

    @ey(method = 4580996289900470040L)
    public void cT() {
        try {
            if (pN) {
                iy.gn(-731216557391273100L, this);
            }
            if (yO()) {
                this.AL.FH();
            } else {
                this.zh.tp();
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -731216557391273100L, this);
            }
            throw th;
        }
    }

    @ey(method = 1060610416385625648L)
    public View ca(Rect rect) {
        try {
            if (pN) {
                iy.tp(2669436673594362012L, this, rect);
            }
            this.fN = null;
            AbsoluteLayout absoluteLayout = (AbsoluteLayout) findViewById(com.aide.ui.q.mainPopupAnchorContainer);
            int[] iArr = new int[2];
            absoluteLayout.getLocationOnScreen(iArr);
            absoluteLayout.removeAllViews();
            LinearLayout linearLayout = new LinearLayout(this);
            absoluteLayout.addView(linearLayout, new AbsoluteLayout.LayoutParams(rect.width(), rect.height(), rect.left - iArr[0], rect.top - iArr[1]));
            return linearLayout;
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, 2669436673594362012L, this, rect);
            }
            throw th;
        }
    }

    @ey(method = 187963770548593004L)
    public ErrorBrowser cb() {
        try {
            if (pN) {
                iy.gn(-2651347714551245888L, this);
            }
            return SI().getErrorBrowser();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -2651347714551245888L, this);
            }
            throw th;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @ey(method = -3222906711035573528L)
    public boolean checkSelfPermission(String str) {
        try {
            if (pN) {
                iy.tp(-3265892562384883008L, this, str);
            }
            return ContextCompat.checkSelfPermission(this, str) == 0;
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -3265892562384883008L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 107920335614086395L)
    public DebugBrowser cn() {
        try {
            if (pN) {
                iy.gn(-8839343908876878267L, this);
            }
            return SI().getDebugBrowser();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -8839343908876878267L, this);
            }
            throw th;
        }
    }

    @ey(method = 5136168968853996431L)
    public void e3() {
        try {
            if (pN) {
                iy.gn(4166684071294474509L, this);
            }
            TrainerLogo.j6(getActionBar(), ServiceContainer.ro().j3().Hw(), ServiceContainer.ro().j3().XL());
            if (ServiceContainer.ro().Mz()) {
                getActionBar().setNavigationMode(2);
            } else {
                getActionBar().setNavigationMode(0);
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 4166684071294474509L, this);
            }
            throw th;
        }
    }

    @ey(method = 5868220867822764036L)
    public void e9() {
        try {
            if (pN) {
                iy.gn(458435081385180912L, this);
            }
            List<AIDEEditor> fileEditors = sh().getFileEditors();
            ArrayList arrayList = new ArrayList();
            Iterator<AIDEEditor> it = fileEditors.iterator();
            while (it.hasNext()) {
                String filePath = it.next().getFilePath();
                String name = FileSystem.getName(filePath);
                if (ServiceContainer.getOpenFileService().getOpenFileModel(filePath).sG()) {
                    name = name + " *";
                }
                arrayList.add(name);
            }
            MessageBox.tp(ServiceContainer.getMainActivity(), "Open Files", arrayList, "Close Files...", new j(fileEditors), new l());
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 458435081385180912L, this);
            }
            throw th;
        }
    }

    @ey(method = -4045889801609699409L)
    public void eU() {
        try {
            if (pN) {
                iy.gn(5641362570595563665L, this);
            }
            if (pN()) {
                ActionBar actionBar = getActionBar();
                List<AIDEEditor> fileEditors = sh().getFileEditors();
                for (int i2 = 0; i2 < fileEditors.size(); i2++) {
                    OpenFileService.OpenFileModel model = fileEditors.get(i2).getModel();
                    String name = FileSystem.getName(model.g3());
                    if (!ServiceContainer.isTrainerMode() && model.sG()) {
                        name = name + " *";
                    }
                    actionBar.getTabAt(i2).setText(name);
                }
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 5641362570595563665L, this);
            }
            throw th;
        }
    }

    @ey(method = -3279466126648208616L)
    public long ef() {
        try {
            if (pN) {
                iy.gn(-5836594448787952192L, this);
            }
            return this.Cz;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -5836594448787952192L, this);
            }
            throw th;
        }
    }

    @ey(method = 4952409423818170665L)
    public boolean et() {
        try {
            if (pN) {
                iy.gn(1139706700103645883L, this);
            }
            return this.hK;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 1139706700103645883L, this);
            }
            throw th;
        }
    }

    @ey(method = 5773070562468981760L)
    public void fY() {
        try {
            if (pN) {
                iy.gn(1853675071837964472L, this);
            }
            sh().Eq();
            ye(BrowserPager.PH, true);
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 1853675071837964472L, this);
            }
            throw th;
        }
    }

    @ey(method = -3699906161107155300L)
    public LogCatBrowser g3() {
        try {
            if (pN) {
                iy.gn(5847049254379024888L, this);
            }
            return SI().getLogCatBrowser();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 5847049254379024888L, this);
            }
            throw th;
        }
    }

    @ey(method = 4371597391026330976L)
    public void gG() {
        try {
            if (pN) {
                iy.gn(-21240579621837024L, this);
            }
            if (br().isSplit() && SI().getCurrentBrowser() == BrowserPager.PH) {
                Ws(true);
            } else {
                fY();
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -21240579621837024L, this);
            }
            throw th;
        }
    }

    @ey(method = 1228740896719686840L)
    public void hK() {
        try {
            if (pN) {
                iy.gn(-3824069780868288768L, this);
            }
            sh().Eq();
            ye(BrowserPager.GK, true);
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -3824069780868288768L, this);
            }
            throw th;
        }
    }

    @ey(method = 1714858505076119792L)
    public void hz() {
        try {
            if (pN) {
                iy.gn(-1255114442734115520L, this);
            }
            FileSpan fileSpanV5 = ServiceContainer.getNavigateService().v5();
            if (fileSpanV5 != null) {
                ServiceContainer.getNavigateService().u7(false);
                aq(fileSpanV5);
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -1255114442734115520L, this);
            }
            throw th;
        }
    }

    @ey(method = -896756075746257199L)
    public void j3() {
        try {
            if (pN) {
                iy.gn(4124303545781217455L, this);
            }
            this.k2.DW();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 4124303545781217455L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.AIDEEditorPager.e
    @ey(method = -1446840527417052880L)
    public void j6(boolean z) {
        try {
            if (pN) {
                iy.Ws(247323989795607472L, this, z);
            }
            boolean z2 = true;
            this.pO.Zo(z && this.iW);
            l8 l8VarDW = ServiceContainer.DW();
            if (z) {
                z2 = false;
            }
            l8VarDW.u7(z2);
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, 247323989795607472L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -308548054788683108L)
    public boolean jJ() {
        try {
            if (pN) {
                iy.gn(-5264329552466364432L, this);
            }
            return this.iW;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -5264329552466364432L, this);
            }
            throw th;
        }
    }

    @ey(method = -777738801963744972L)
    public void k2() {
        try {
            if (pN) {
                iy.gn(-3530972291531279576L, this);
            }
            sh().Eq();
            ye(BrowserPager.hp, true);
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -3530972291531279576L, this);
            }
            throw th;
        }
    }

    @ey(method = 1243531660458937725L)
    public void kf() {
        try {
            if (pN) {
                iy.gn(2056561034270641815L, this);
            }
            if (ServiceContainer.gn() == this) {
                ServiceContainer.getOpenFileService().ei(true);
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 2056561034270641815L, this);
            }
            throw th;
        }
    }

    @ey(method = -143441272376996720L)
    public void ko(int i2) {
        try {
            if (pN) {
                iy.u7(-3167491990485763872L, this, i2);
            }
            iW();
            ActionBar actionBar = getActionBar();
            if (i2 < 0 || i2 >= actionBar.getTabCount()) {
                return;
            }
            actionBar.removeTab(actionBar.getTabAt(i2));
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -3167491990485763872L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -860478870966917240L)
    public void lg() {
        try {
            if (pN) {
                iy.gn(-4240185531810096000L, this);
            }
            if (ServiceContainer.isTrainerMode()) {
                if (ServiceContainer.getMainActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    yS(false, null, null);
                } else {
                    ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 22);
                }
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -4240185531810096000L, this);
            }
            throw th;
        }
    }

    @ey(method = 1941001329152812423L)
    public void mb() {
        try {
            if (pN) {
                iy.gn(-1658458610812094139L, this);
            }
            sh().Eq();
            ye(BrowserPager.dW, true);
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -1658458610812094139L, this);
            }
            throw th;
        }
    }

    @ey(method = -409526552644690065L)
    public void oY(boolean z) {
        try {
            if (pN) {
                iy.Ws(-422299368225473575L, this, z);
            }
            if (Build.VERSION.SDK_INT >= 20) {
                setHasEmbeddedTabs();
            }
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -422299368225473575L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 5332169289415303559L)
    protected void onActivityResult(int i2, int i3, Intent intent) {
        try {
            if (pN) {
                iy.we(1053229833396463725L, this, new Integer(i2), new Integer(i3), intent);
            }
            iy.v5(this, i2, i3, intent);
            if (i2 == 12) {
                if (i3 == -1) {
                    GotoBrowserActivity.tp(intent);
                    return;
                }
                return;
            }
            if (i2 == 1194684) {
                ServiceContainer.XL().g3(intent);
                return;
            }
            if (i2 == 15) {
                if (i3 == -1) {
                    OutputConsoleActivity.J8(intent);
                    return;
                }
                return;
            }
            if (i2 == 13) {
                if (i3 == -1) {
                    if (XmlLayoutDesignActivity.ro(intent)) {
                        ServiceContainer.ro().we();
                        return;
                    } else {
                        if (XmlLayoutDesignActivity.cn(intent)) {
                            ServiceContainer.ro().br();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (i2 == 14) {
                if (i3 == -1) {
                    ServiceContainer.ro().we();
                    return;
                }
                return;
            }
            if (i2 == 16) {
                y.J0(this);
                return;
            }
            if (i2 == 17) {
                Gj();
                ServiceContainer.DW().DW();
                BuildServiceCollect.androidProjectBuildService.Mz();
            } else if (i2 == 18) {
                Gj();
                ServiceContainer.DW().DW();
                BuildServiceCollect.javaProjectBuildService.j3();
            } else if (i2 == 19) {
                ServiceContainer.DW().DW();
                BuildServiceCollect.htmlCodeBuildService.u7();
            } else if (i2 == 20) {
                ServiceContainer.DW().DW();
                BuildServiceCollect.javaScriptBuildService.u7();
            }
        } catch (Throwable th) {
            if (oy) {
                iy.U2(th, 1053229833396463725L, this, new Integer(i2), new Integer(i3), intent);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -5086545433944799024L)
    public void onBackPressed() {
        try {
            if (pN) {
                iy.gn(-4801810360674032064L, this);
            }
            if (this.zh.VH()) {
                this.zh.Zo();
                return;
            }
            if (br().isSplit()) {
                Ws(true);
                return;
            }
            if (ServiceContainer.isTrainerMode() || !Eq()) {
                if (AndroidHelper.U2(this)) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.jw < 2000) {
                        TrainerCourseActivity.rN(this);
                        return;
                    } else {
                        this.jw = jCurrentTimeMillis;
                        Toast.makeText(ServiceContainer.getContext(), com.aide.ui.u.view_toast_press_back, 0).show();
                        return;
                    }
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 - this.jw < 2000) {
                    BT();
                } else {
                    this.jw = jCurrentTimeMillis2;
                    Toast.makeText(ServiceContainer.getContext(), com.aide.ui.u.view_toast_press_back, 0).show();
                }
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -4801810360674032064L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @ey(method = -618379868178788125L)
    public void onConfigurationChanged(Configuration configuration) {
        try {
            if (pN) {
                iy.tp(751155446617055545L, this, configuration);
            }
            super.onConfigurationChanged(configuration);
            vJ().onConfigChange(this);
            setHasEmbeddedTabs();
            q7();
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, 751155446617055545L, this, configuration);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.ThemedActionbarActivity, android.app.Activity
    @ey(method = 1359416596524663357L)
    public void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (pN) {
                iy.tp(314409527206848855L, this, bundle);
            }
            AppLog.Zo(this, "onCreate");
            if (AndroidHelper.er()) {
                tv.ouya.console.api.e.v5().Zo(this, "9b57b7e2-2fa3-44db-9131-04b76a1f491c");
            }
            ServiceContainer.sh(this);
            AndroidHelper.v5(this);
            boolean z = true;
            this.Gj = true;
            this.e3 = new Handler();
            this.n5 = AppPreferences.yS(this);
            AndroidHelper.cn(this, ServiceContainer.U2());
            if (!FireBaseLogEvent.gn()) {
                FireBaseLogEvent.Zo(this, new q());
            }
            super.onCreate(bundle);
            if (!ServiceContainer.isTrainerMode() && !pN()) {
                getWindow().requestFeature(9);
            }
            String path = null;
            if (getIntent() != null && getIntent().getData() != null) {
                path = getIntent().getData().getPath();
            }
            ServiceContainer.cb(this, path);
            this.sg = new QuickActionMenu(this, com.aide.ui.s.filetab_menu);
            this.fY = new KeyStrokeDetector(this);
            AppPreferences.cb(this, this);
            this.eU = AppPreferences.Hw();
            setContentView(com.aide.ui.r.main);
            AndroidHelper.gW(this);
            if (!ServiceContainer.isTrainerMode()) {
                AndroidHelper.KD(findViewById(com.aide.ui.q.mainFrame));
            }
            this.pO = new QuickKeysBar(this);
            iW();
            com.aide.ui.m mVar = new com.aide.ui.m(this, com.aide.ui.q.mainMasterButton);
            this.cT = mVar;
            mVar.FH(ServiceContainer.isTrainerMode());
            this.cT.DW(new r());
            br().setSwipeEnabled(!ServiceContainer.isTrainerMode() && AppPreferences.we());
            br().setOnSplitChangeListener(new s());
            findViewById(com.aide.ui.q.mainNoOpenFilesView).setOnClickListener(new t());
            if (ServiceContainer.isTrainerMode()) {
                getActionBar().setDisplayHomeAsUpEnabled(true);
                getActionBar().setDisplayShowHomeEnabled(true);
            } else if (pN()) {
                getActionBar().setDisplayShowTitleEnabled(false);
                getActionBar().setNavigationMode(2);
                if (!AndroidHelper.lg(this) && ServiceContainer.ro().dx()) {
                    getActionBar().setDisplayHomeAsUpEnabled(true);
                }
                getActionBar().setDisplayShowHomeEnabled(true);
            } else {
                getActionBar().setDisplayOptions(16);
                getActionBar().setDisplayShowCustomEnabled(true);
                getActionBar().setBackgroundDrawable(getResources().getDrawable(R$drawable.actionbar_bg));
                findViewById(com.aide.ui.q.mainActionBarNoTabs).setBackgroundDrawable(new ActionBarNoTabs(this));
                findViewById(com.aide.ui.q.mainSearchBarNoTabs).setBackgroundDrawable(new SearchBarNoTabs(this));
            }
            if (ServiceContainer.isTrainerMode()) {
                ServiceContainer.Zo().FH(new u());
            }
            if (ServiceContainer.isTrainerMode() && AndroidHelper.U2(this)) {
                getActionBar().hide();
            }
            ServiceContainer.getOpenFileService().yS(path);
            if (!ServiceContainer.P8.equals("com.aide.web")) {
                g3().Ws();
                cn().Hw();
            }
            ServiceContainer.getNavigateService().VH(sh().getCurrentFileSpan());
            ServiceContainer.J0().u7(this);
            sh().setSoftKeyboardListener(this);
            setHasEmbeddedTabs();
            q7();
            U2();
            if (this.kf) {
                FireBaseLogEvent.tp("First run after inital install");
            }
            if (getIntent() != null && getIntent().getBooleanExtra("EXTRA_SHOWN_FROM_TRAINER_NOTIFICATION", false)) {
                FireBaseLogEvent.tp("Shown from trainer notification");
            }
            if (getIntent() != null && getIntent().getBooleanExtra("EXTRA_SHOWN_FROM_PROMO_NOTIFICATION", false)) {
                FireBaseLogEvent.tp("Shown from promo notification");
            }
            if (!ServiceContainer.I() && !ServiceContainer.isTrainerMode() && ServiceContainer.getProjectService().isOpenProject()) {
                ServiceContainer.j6(false);
            }
            if (!com.aide.ui.n.EQ() || ServiceContainer.getLicenseService().QX() || ServiceContainer.getLicenseService().Ws() || ServiceContainer.getLicenseService().g3() || ((!ServiceContainer.isTrainerMode() && ServiceContainer.I()) || !new GregorianCalendar().before(com.aide.ui.n.FH()))) {
                PromoNotificationAlarmReceiver.DW(ServiceContainer.getContext());
            } else {
                PromoNotificationAlarmReceiver.FH(ServiceContainer.getContext(), com.aide.ui.n.FH().getTimeInMillis(), nw(this), "20% off special offer", "Special offer", "Save 20% on an annual subscription");
            }
            if (AndroidHelper.er() && !tv.ouya.console.api.e.v5().gn()) {
                MessageBox.SI(this, "AIDE for OUYA", "This version of AIDE is only intended to run on the OUYA. Contact info@appfour.com for details.", false, new v(), new a());
                return;
            }
            if (ServiceContainer.isTrainerMode()) {
                ServiceContainer.ro().aq();
                if (getIntent() == null || !getIntent().getBooleanExtra("EXTRA_SHOWN_FROM_UPDATE_TRAINER_NOTIFICATION", false)) {
                    y.XL(this);
                    return;
                } else {
                    TrainerCourseActivity.rN(this);
                    return;
                }
            }
            WB();
            if (getLastNonConfigurationInstance() == null) {
                z = false;
            }
            if (z) {
                y.u7(this);
                return;
            }
            if (ServiceContainer.getOpenFileService().j3()) {
                ServiceContainer.EQ().g3(ServiceContainer.getOpenFileService().u7());
            }
            if (ServiceContainer.getProjectService().isOpenProject()) {
                ServiceContainer.EQ().ca(ServiceContainer.getProjectService().P8());
            }
            gW();
            Mr();
            if (getIntent() != null && getIntent().getExtras() != null && getIntent().getExtras().getBoolean("EXTRA_NAVIGATE_BREAKPOINT")) {
                jw();
                return;
            }
            if (getIntent() != null && getIntent().getBooleanExtra("EXTRA_SHOWN_FROM_UPDATE_TRAINER_NOTIFICATION", false)) {
                TrainerCourseActivity.rN(this);
                return;
            }
            if (ServiceContainer.P8.equals("com.aide.ui") && getIntent() != null && getIntent().getBooleanExtra("EXTRA_SHOWN_FROM_PROMO_NOTIFICATION", false) && !ServiceContainer.isTrainerMode()) {
                y.XL(this);
                return;
            }
            if (getIntent() != null && getIntent().getBooleanExtra("EXTRA_SHOWN_FROM_GCM_NOTIFICATION", false) && getIntent().hasExtra("EXTRA_GCM_NOTIFICATION_IAP_PRODUCT_ID")) {
                FireBaseLogEvent.tp("Shown from GCM notification");
                y.EQ(this, getIntent().getStringExtra("EXTRA_GCM_NOTIFICATION_IAP_PRODUCT_ID"));
            } else if (getIntent() == null || !getIntent().getBooleanExtra("EXTRA_UPGRADE_NOTIFICATION_CLICKED", false)) {
                y.J8(this);
            } else {
                FireBaseLogEvent.tp("Shown from upgrade notification");
                WhatsNewDialog.Hw(this, new b());
            }
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, 314409527206848855L, this, bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 4206480390949783692L)
    protected Dialog onCreateDialog(int i2, Bundle bundle) {
        try {
            if (pN) {
                iy.EQ(2672693154919424L, this, new Integer(i2), bundle);
            }
            return MessageBox.Zo(this, i2);
        } catch (Throwable th) {
            if (oy) {
                iy.Mr(th, 2672693154919424L, this, new Integer(i2), bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 2927465979171971955L)
    protected void onDestroy() {
        try {
            if (pN) {
                iy.gn(3949802739780352785L, this);
            }
            AppLog.Zo(this, "onDestroy - finishing: " + isFinishing());
            super.onDestroy();
            this.e3.removeCallbacks(this.sE);
            ServiceContainer.J0().Mz(this);
            sh().Ev();
            AppPreferences.aj(this, this);
            ServiceContainer.OW();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 3949802739780352785L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    @ey(method = -1503984805783283436L)
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        try {
            if (pN) {
                iy.EQ(-1438748231619128768L, this, new Integer(i2), keyEvent);
            }
            this.fY.onKeyDown(i2, keyEvent);
            return super.onKeyDown(i2, keyEvent);
        } catch (Throwable th) {
            if (oy) {
                iy.Mr(th, -1438748231619128768L, this, new Integer(i2), keyEvent);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    @ey(method = 696287287914078245L)
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        try {
            if (pN) {
                iy.EQ(5885194405817996415L, this, new Integer(i2), keyEvent);
            }
            if (i2 == 82) {
                sh().Xa();
            }
            this.fY.onKeyUp(i2, keyEvent);
            return super.onKeyUp(i2, keyEvent);
        } catch (Throwable th) {
            if (oy) {
                iy.Mr(th, 5885194405817996415L, this, new Integer(i2), keyEvent);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -538529501677411407L)
    protected void onNewIntent(Intent intent) {
        try {
            if (pN) {
                iy.tp(225586581383515263L, this, intent);
            }
            iy.XL(this, intent);
            AppLog.Zo(this, "onNewIntent");
            super.onNewIntent(intent);
            if (intent != null && intent.getBooleanExtra("EXTRA_SHOWN_FROM_UPDATE_TRAINER_NOTIFICATION", false)) {
                TrainerCourseActivity.rN(this);
                return;
            }
            if (intent != null && intent.getBooleanExtra("EXTRA_SHOWN_FROM_TRAINER_NOTIFICATION", false)) {
                FireBaseLogEvent.tp("Shown from trainer notification");
                return;
            }
            if (intent != null && intent.getBooleanExtra("EXTRA_SHOWN_FROM_PROMO_NOTIFICATION", false)) {
                FireBaseLogEvent.tp("Shown from promo notification");
                y.XL(this);
                return;
            }
            if (intent != null && intent.getBooleanExtra("EXTRA_SHOWN_FROM_GCM_NOTIFICATION", false)) {
                FireBaseLogEvent.tp("Shown from gcm notification");
                y.EQ(this, intent.getStringExtra("EXTRA_GCM_NOTIFICATION_IAP_PRODUCT_ID"));
                return;
            }
            if (intent != null && intent.getBooleanExtra("EXTRA_UPGRADE_NOTIFICATION_CLICKED", false)) {
                FireBaseLogEvent.tp("Shown from upgrade notification");
                WhatsNewDialog.Hw(this, null);
                return;
            }
            if (intent != null && intent.getExtras() != null && intent.getExtras().getParcelable("EXTRA_NAVIGATE_PLAY_STORE_INTENT_SENDER") != null) {
                xe.aj(this, (IntentSender) intent.getExtras().getParcelable("EXTRA_NAVIGATE_PLAY_STORE_INTENT_SENDER"));
                return;
            }
            if (intent != null && intent.getExtras() != null && intent.getExtras().getBoolean("EXTRA_SHOWN_FROM_NOTIFICATION", false)) {
                if (ServiceContainer.J0().gW() > 0) {
                    fY();
                }
                if (ServiceContainer.Zo().tp() && !ServiceContainer.Zo().EQ()) {
                    Gj();
                    return;
                } else if (ServiceContainer.QX().Sf()) {
                    aX();
                    return;
                } else {
                    if (ServiceContainer.EQ().sh()) {
                        Cz();
                        return;
                    }
                    return;
                }
            }
            if (intent != null && intent.getData() != null) {
                qp(intent.getData().getPath());
                return;
            }
            if (intent != null && intent.getExtras() != null && intent.getExtras().getString("NavigateFile") != null) {
                int i2 = intent.getExtras().getInt("NavigateLine");
                int i3 = intent.getExtras().getInt("NavigateColumn");
                aq(new FileSpan(intent.getExtras().getString("NavigateFile"), i2, i3, i2, i3));
            } else {
                if (intent == null || intent.getExtras() == null || !intent.getExtras().getBoolean("EXTRA_NAVIGATE_BREAKPOINT")) {
                    return;
                }
                jw();
            }
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, 225586581383515263L, this, intent);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -402197250440462512L)
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            if (pN) {
                iy.tp(-319783279204524512L, this, menuItem);
            }
            if (menuItem.getItemId() == 16908332) {
                if (ServiceContainer.ro().dx()) {
                    TrainerCourseActivity.rN(this);
                }
                return true;
            }
            MenuItemCommand menuItemCommandU7 = AppCommands.u7(menuItem.getItemId());
            if (menuItemCommandU7 != null && menuItemCommandU7.isEnabled()) {
                FireBaseLogEvent.tp("Main Menu: " + ((Object) menuItem.getTitle()));
                menuItemCommandU7.run();
                return true;
            }
            rf rfVarDW = AppCommands.DW(menuItem.getItemId());
            if (rfVarDW == null || !rfVarDW.isVisible()) {
                return super.onOptionsItemSelected(menuItem);
            }
            FireBaseLogEvent.tp("Action bar command: " + rfVarDW.j6());
            rfVarDW.run();
            return true;
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -319783279204524512L, this, menuItem);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 1164809188361120515L)
    protected void onPause() {
        try {
            if (pN) {
                iy.gn(-2040779579176276727L, this);
            }
            AppLog.Zo(this, "onPause");
            if (this.eU > 0) {
                ServiceContainer.getOpenFileService().KD(true, false);
            }
            if (ServiceContainer.isTrainerMode()) {
                ServiceContainer.nw().J0();
            }
            this.iW = false;
            super.onPause();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -2040779579176276727L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 28954835454917220L)
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        try {
            if (pN) {
                iy.tp(2657562289712766744L, this, menu);
            }
            boolean zOnPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            menu.clear();
            MenuInflater menuInflater = getMenuInflater();
            if (ServiceContainer.isTrainerMode()) {
                menuInflater.inflate(com.aide.ui.s.main_trainer_options_menu, menu);
            } else {
                menuInflater.inflate(com.aide.ui.s.main_options_menu, menu);
                this.AL = new x(menu);
                this.w9 = new com.aide.ui.l(menu);
            }
            if (!ServiceContainer.vJ()) {
                sg(menu);
                if (AndroidHelper.lg(this) && (menuItemFindItem = menu.findItem(com.aide.ui.q.mainMenuErrorsView)) != null) {
                    menuItemFindItem.setVisible(AndroidHelper.u7(this) > 360.0f);
                }
                if (this.AL != null) {
                    this.AL.DW();
                    this.w9.FH();
                }
            }
            return zOnPrepareOptionsMenu;
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, 2657562289712766744L, this, menu);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    @ey(method = 924591368896498325L)
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        try {
            if (pN) {
                iy.we(-3966704046711372357L, this, new Integer(i2), strArr, iArr);
            }
            if (i2 == 21) {
                sG().QX();
                y.Zo(this);
            } else if (i2 == 22 && ServiceContainer.getMainActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE")) {
                lg();
            }
        } catch (Throwable th) {
            if (oy) {
                iy.U2(th, -3966704046711372357L, this, new Integer(i2), strArr, iArr);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 1589435792754287060L)
    protected void onResume() {
        try {
            if (pN) {
                iy.gn(753469417182291264L, this);
            }
            super.onResume();
            this.iW = true;
            synchronized (this.q7) {
                this.q7.notifyAll();
            }
            if (this.Z1) {
                ServiceContainer.getOpenFileService().KD(false, false);
                recreate();
            } else {
                ServiceContainer.EQ().sG();
                kf();
                ServiceContainer.getProjectService().OW();
            }
            q7();
            if (ServiceContainer.isTrainerMode() || !ServiceContainer.getProjectService().isOpenProject()) {
                return;
            }
            ServiceContainer.getProjectService().sG();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 753469417182291264L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -4602735385103312512L)
    public Object onRetainNonConfigurationInstance() {
        try {
            if (!pN) {
                return "dummy";
            }
            iy.gn(-3622157941822878072L, this);
            return "dummy";
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -3622157941822878072L, this);
            }
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    @ey(method = 156238381621191133L)
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (pN) {
                iy.EQ(-7506405815406105425L, this, sharedPreferences, str);
            }
            if (str.equals("send_analytics_data")) {
                FireBaseLogEvent.VH();
            } else {
                FireBaseLogEvent.EQ("Setting changed", Collections.singletonMap("key", str));
            }
            this.eU = AppPreferences.Hw();
            if ("user_androidjar".equals(str) || "user_m2repositories".equals(str)) {
                ServiceContainer.getProjectService().wc();
            }
            ServiceContainer.getEngineService().EQ();
            if (!ServiceContainer.P8.equals("com.aide.web")) {
                g3().gn();
            }
            br().setSwipeEnabled(!ServiceContainer.isTrainerMode() && AppPreferences.we());
            if ("light_theme".equals(str) || "app_language".equals(str) || "editor_tabs".equals(str) || "send_analytics_data".equals(str)) {
                this.Z1 = true;
            }
            sh().OW();
            if ("editor_font_size".equals(str)) {
                sh().br();
            }
        } catch (Throwable th) {
            if (oy) {
                iy.Mr(th, -7506405815406105425L, this, sharedPreferences, str);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 1348853130487538031L)
    protected void onStart() {
        try {
            if (pN) {
                iy.gn(-1881977601561701371L, this);
            }
            super.onStart();
            HashMap map = new HashMap();
            map.put("isPremiumKeyInstalled", Boolean.toString(ServiceContainer.getLicenseService().QX()));
            map.put("isPremium", Boolean.toString(ServiceContainer.getLicenseService().Ws()));
            map.put("isPremiumHacked", Boolean.toString(!ServiceContainer.getLicenseService().QX() && ServiceContainer.getLicenseService().Ws()));
            map.put("isUiBuilderKeyInstalled", Boolean.toString(ServiceContainer.getLicenseService().U2()));
            map.put("isUiBuilderLicensed", Boolean.toString(ServiceContainer.getLicenseService().Mr()));
            FireBaseLogEvent.aM(this, "Main", map);
            if (ServiceContainer.I()) {
                FireBaseLogEvent.Ws(ServiceContainer.isTrainerMode() ? "Trainer view" : "Expert view");
            }
            String property = System.getProperty("os.arch");
            if (property == null) {
                property = "unknown";
            }
            if (!property.toLowerCase(Locale.US).contains("86") && ServiceContainer.Sf()) {
                property = "x86";
            }
            FireBaseLogEvent.J8(property);
            FireBaseLogEvent.tp("CPU arch: " + property);
            if (AndroidHelper.U2(this)) {
                FireBaseLogEvent.tp("Android TV detected");
            }
            if (AndroidHelper.a8(this)) {
                FireBaseLogEvent.tp("Chromebook detected");
            }
            this.Jl = true;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -1881977601561701371L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 3453069564827329331L)
    protected void onStop() {
        try {
            if (pN) {
                iy.gn(-459983436186748651L, this);
            }
            if (AndroidHelper.a8(this)) {
                sh().Eq();
            }
            super.onStop();
            FireBaseLogEvent.DW(this, "Main");
            this.Jl = false;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -459983436186748651L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -3397509703467686384L)
    public void onUserLeaveHint() {
        try {
            if (pN) {
                iy.gn(-5938232248402315792L, this);
            }
            sh().Eq();
            super.onUserLeaveHint();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -5938232248402315792L, this);
            }
            throw th;
        }
    }

    @ey(method = -5731494422353145551L)
    public void oy() {
        try {
            if (pN) {
                iy.gn(3908393739259605299L, this);
            }
            this.sg.QX(findViewById(com.aide.ui.q.mainActionBarPopupAnchor), true);
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 3908393739259605299L, this);
            }
            throw th;
        }
    }

    @ey(method = 888861408458293684L)
    public void pO() {
        try {
            if (pN) {
                iy.gn(-2011662560872431072L, this);
            }
            this.e3.removeCallbacks(this.sE);
            if (this.eU > 0) {
                this.e3.postDelayed(this.sE, this.eU * 1000);
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -2011662560872431072L, this);
            }
            throw th;
        }
    }

    @ey(method = 5821068472897759200L)
    public void q7() {
        try {
            if (pN) {
                iy.gn(1910358352576023020L, this);
            }
            if (!CU() && this.Gj) {
                invalidateOptionsMenu();
            }
            Jl();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 1910358352576023020L, this);
            }
            throw th;
        }
    }

    @ey(method = 446945136028814924L)
    public void qp(String str) {
        try {
            if (pN) {
                iy.tp(-718234073828397360L, this, str);
            }
            String strXL = FileSystem.XL(str);
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(strXL);
            if (!strXL.equals("java") && !strXL.equals("xml") && !strXL.equals("svg") && mimeTypeFromExtension != null && !mimeTypeFromExtension.startsWith("text")) {
                if (Build.VERSION.SDK_INT < 24) {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setDataAndType(Uri.fromFile(new File(str)), mimeTypeFromExtension);
                    try {
                        gn(this, intent);
                        return;
                    } catch (ActivityNotFoundException unused) {
                        Toast.makeText(ServiceContainer.getContext(), "No handler found for type " + mimeTypeFromExtension, 0).show();
                        return;
                    }
                }
                return;
            }
            if (FileSystem.ei(str)) {
                return;
            }
            aq(new FileSpan(str, 1, 1, 1, 1));
            ServiceContainer.getProjectService().VH(str);
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -718234073828397360L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2867172992517528249L)
    public void rN() {
        try {
            if (pN) {
                iy.gn(-1368323110185616221L, this);
            }
            if (et()) {
                return;
            }
            er(true);
            sh().Eq();
            sh().setIdentifierClickingEnabled(et());
            q7();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -1368323110185616221L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -1018176079930549375L)
    public void recreate() {
        try {
            if (pN) {
                iy.gn(-1585257735456068565L, this);
            }
            MessageBox.v5();
            super.recreate();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -1585257735456068565L, this);
            }
            throw th;
        }
    }

    @ey(method = -5831691114933472L)
    public String ro() {
        try {
            if (pN) {
                iy.gn(-5467304328194480508L, this);
            }
            try {
                return getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e2) {
                AppLog.v5(e2);
                return "";
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -5467304328194480508L, this);
            }
            throw th;
        }
    }

    @ey(method = 296771741751835376L)
    public FileBrowser sG() {
        try {
            if (pN) {
                iy.gn(-4870143834767310144L, this);
            }
            return SI().getFileBrowser();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -4870143834767310144L, this);
            }
            throw th;
        }
    }

    @ey(method = -51225142978773045L)
    public void sM(String str, String str2, Runnable runnable) {
        try {
            if (pN) {
                iy.we(7380313323226041093L, this, str, str2, runnable);
            }
            if (AndroidHelper.U2(this) || getSharedPreferences("Rate", 0).getBoolean("Rated", false)) {
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                SharedPreferences.Editor editorEdit = getSharedPreferences("Rate", 0).edit();
                editorEdit.putBoolean("Rated", true);
                editorEdit.commit();
                SocialDialog.ef(this, str, str2, ServiceContainer.P8, "rate", runnable);
            }
        } catch (Throwable th) {
            if (oy) {
                iy.U2(th, 7380313323226041093L, this, str, str2, runnable);
            }
            throw th;
        }
    }

    @ey(method = 2181626940806831323L)
    public AIDEEditorPager sh() {
        try {
            if (pN) {
                iy.gn(3271738070418931673L, this);
            }
            return (AIDEEditorPager) findViewById(com.aide.ui.q.mainCodePageView);
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 3271738070418931673L, this);
            }
            throw th;
        }
    }

    @ey(method = -1689026093220063735L)
    public KeyStrokeDetector vJ() {
        try {
            if (pN) {
                iy.gn(-2192134646014037325L, this);
            }
            return this.fY;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -2192134646014037325L, this);
            }
            throw th;
        }
    }

    @ey(method = 5948912609657356597L)
    public void w9() {
        try {
            if (pN) {
                iy.gn(1441588797375595607L, this);
            }
            this.k2.v5();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 1441588797375595607L, this);
            }
            throw th;
        }
    }

    @ey(method = -64653552894642205L)
    public boolean wc() {
        try {
            if (pN) {
                iy.gn(-1220790746628136355L, this);
            }
            return this.kf;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -1220790746628136355L, this);
            }
            throw th;
        }
    }

    @ey(method = 2324478472611950277L)
    public String x9(boolean z) {
        try {
            if (pN) {
                iy.Ws(186428721334784775L, this, z);
            }
            try {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
                String string = defaultSharedPreferences.getString("last_seen_version", "");
                String strRo = ro();
                if (z && ("".equals(string) || !strRo.equals(string))) {
                    SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
                    editorEdit.putString("last_seen_version", strRo);
                    editorEdit.commit();
                }
                if (strRo != null && !"".equals(strRo)) {
                    if ("".equals(string)) {
                        if (this.n5) {
                            return null;
                        }
                        return "";
                    }
                    if (!strRo.equals(string)) {
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                AppLog.v5(th);
                return null;
            }
        } catch (Throwable th2) {
            if (oy) {
                iy.j3(th2, 186428721334784775L, this, new Boolean(z));
            }
            throw th2;
        }
    }

    @ey(method = 4497454484693527260L)
    public boolean yO() {
        try {
            if (pN) {
                iy.gn(1333389984534186272L, this);
            }
            return pN();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 1333389984534186272L, this);
            }
            throw th;
        }
    }

    @ey(method = -939761940394342836L)
    public void yS(boolean z, String str, c.j jVar) {
        try {
            if (pN) {
                iy.we(-2109178769528479480L, this, new Boolean(z), str, jVar);
            }
            this.Gj = false;
            if (z) {
                Ws(false);
            } else {
                String strU7 = ServiceContainer.getOpenFileService().u7();
                if (strU7 != null) {
                    ServiceContainer.getFileBrowserService().Hw(FileSystem.getParent(strU7));
                } else {
                    ServiceContainer.getFileBrowserService().Hw(ServiceContainer.getFileBrowserService().DW());
                }
            }
            ServiceContainer.getOpenFileService().KD(false, false);
            if (str != null) {
                ServiceContainer.ro().kQ(str);
            } else if (jVar != null) {
                ServiceContainer.ro().yO(jVar);
            }
            ServiceContainer.j6(z);
            recreate();
        } catch (Throwable th) {
            if (oy) {
                iy.U2(th, -2109178769528479480L, this, new Boolean(z), str, jVar);
            }
            throw th;
        }
    }

    @ey(method = 50098099660693584L)
    public void ys() {
        try {
            if (pN) {
                iy.gn(1199052696493333136L, this);
            }
            IS(-1);
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 1199052696493333136L, this);
            }
            throw th;
        }
    }

    @ey(method = 953275270071155624L)
    public void zh() {
        try {
            if (pN) {
                iy.gn(-1941114046885396320L, this);
            }
            if (yO()) {
                this.w9.Hw();
            } else {
                this.zh.u7();
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -1941114046885396320L, this);
            }
            throw th;
        }
    }
}
