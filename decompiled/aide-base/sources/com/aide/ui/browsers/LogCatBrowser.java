package com.aide.ui.browsers;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.aide.common.MessageBox;
import com.aide.common.ValueRunnable;
import com.aide.ui.LogCatConsole;
import com.aide.ui.ServiceContainer;
import com.aide.ui.project.AndroidProjectSupport;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.services.LogcatService;

@cy(clazz = 7477716827155690953L, container = 7477716827155690953L, user = true)
/* loaded from: classes.dex */
public class LogCatBrowser extends LinearLayout implements LogcatService.LogcatListener, com.aide.ui.browsers.a {

    @gy
    private static /* synthetic */ boolean fY;

    @fy
    private static /* synthetic */ boolean jw;

    @dy(field = 2213379967895764992L)
    private boolean WB;

    @dy(field = 818110698334428443L)
    private boolean mb;

    @cy(clazz = -153627786828878808L, container = 7477716827155690953L, user = true)
    class a implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 2686986254598538928L)
        final /* synthetic */ ImageView WB;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 395710455355549976L)
        a(ImageView imageView) {
            this.WB = imageView;
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 412114772980334500L)
        public void onClick(View view) {
            try {
                if (jw) {
                    iy.tp(3171283024174060605L, this, view);
                }
                LogCatBrowser.this.getConsole().ye(this.WB, false);
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, 3171283024174060605L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -153710958860074547L, container = 7477716827155690953L, user = true)
    class b implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -116852146288126392L)
        b() {
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -226374247970761303L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (DW) {
                    iy.tp(-137603247206014620L, this, str);
                }
                LogCatBrowser.this.Mr(2, str);
                LogCatBrowser.this.getConsole().oY(str);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -137603247206014620L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -153794130887206992L, container = 7477716827155690953L, user = true)
    class c implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -370408332297940839L)
        c() {
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = 5903198995169523032L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (DW) {
                    iy.tp(-5773722507881654125L, this, str);
                }
                LogCatBrowser.this.Mr(1, str);
                LogCatBrowser.this.getConsole().ko(str);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -5773722507881654125L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -153877302910276143L, container = 7477716827155690953L, user = true)
    class d implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -20639818822962153L)
        d() {
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -3381115934500031820L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (DW) {
                    iy.tp(595725316876507713L, this, str);
                }
                LogCatBrowser.this.Mr(0, str);
                LogCatBrowser.this.getConsole().jO(str);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 595725316876507713L, this, str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(LogCatBrowser.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 340326867897008000L)
    public LogCatBrowser(Context context) {
        super(context);
        try {
            if (jw) {
                iy.tp(3391270462590117360L, null, context);
            }
            J8();
        } catch (Throwable th) {
            if (fY) {
                iy.j3(th, 3391270462590117360L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -154818912667366899L)
    private void J8() {
        try {
            if (jw) {
                iy.gn(-234241693491009035L, this);
            }
            setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            View viewInflate = LayoutInflater.from(getContext()).inflate(r.logcatbrowser, (ViewGroup) null);
            removeAllViews();
            addView(viewInflate);
            ImageView imageView = (ImageView) viewInflate.findViewById(q.logcatHeaderMenuButton);
            imageView.setOnClickListener(new a(imageView));
            SharedPreferences sharedPreferences = getContext().getSharedPreferences("Logcat", 0);
            int i = sharedPreferences.getInt("FilterType", -1);
            String string = sharedPreferences.getString("FilterValue", "");
            this.mb = i >= 0;
            if (i == 0) {
                getConsole().jO(string);
            } else if (i == 1) {
                getConsole().ko(string);
            } else if (i == 2) {
                getConsole().oY(string);
            } else if (i == 3) {
                getConsole().FN(string);
            }
            ServiceContainer.lg().aM(this);
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -234241693491009035L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1044960461859182555L)
    public void Mr(int i, String str) {
        try {
            if (jw) {
                iy.EQ(1816673659634517117L, this, new Integer(i), str);
            }
            SharedPreferences.Editor editorEdit = getContext().getSharedPreferences("Logcat", 0).edit();
            editorEdit.putInt("FilterType", i);
            editorEdit.putString("FilterValue", str);
            editorEdit.commit();
            this.mb = i >= 0;
        } catch (Throwable th) {
            if (fY) {
                iy.Mr(th, 1816673659634517117L, this, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = 364511122984474760L)
    private void U2() {
        try {
            if (jw) {
                iy.gn(-3598202661913812744L, this);
            }
            ServiceContainer.lg().gn(isShown() && !this.WB);
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -3598202661913812744L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 882312505897087104L)
    public LogCatConsole getConsole() {
        try {
            if (jw) {
                iy.gn(-1552867225769129280L, this);
            }
            return (LogCatConsole) findViewById(q.logcatConsole);
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -1552867225769129280L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.browsers.a
    @ey(method = 1112033654621593713L)
    public void DW() {
        try {
            if (jw) {
                iy.gn(-2534558566514297031L, this);
            }
            getConsole().gW();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -2534558566514297031L, this);
            }
            throw th;
        }
    }

    @ey(method = -2527078742703146520L)
    public void EQ() {
        try {
            if (jw) {
                iy.gn(-3641153637260431752L, this);
            }
            MessageBox.VH(ServiceContainer.getMainActivity(), "Priority", getConsole().getAllPriortities(), new d());
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -3641153637260431752L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.browsers.a
    @ey(method = 3049936414248735089L)
    public void FH() {
        try {
            if (jw) {
                iy.gn(-2240505120460587047L, this);
            }
            U2();
            ServiceContainer.lg().Mr();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -2240505120460587047L, this);
            }
            throw th;
        }
    }

    @ey(method = 4246548946701607620L)
    public void J0() {
        try {
            if (jw) {
                iy.gn(-3258842333447503116L, this);
            }
            MessageBox.VH(ServiceContainer.getMainActivity(), "Tag", getConsole().getAllTags(), new c());
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -3258842333447503116L, this);
            }
            throw th;
        }
    }

    @ey(method = -1744784372956744576L)
    public boolean QX() {
        try {
            if (jw) {
                iy.gn(-3874567268021625792L, this);
            }
            return this.mb;
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -3874567268021625792L, this);
            }
            throw th;
        }
    }

    @ey(method = -1621415586408853272L)
    public void VH() {
        try {
            if (jw) {
                iy.gn(385753486758046632L, this);
            }
            Mr(-1, "");
            getConsole().hz();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 385753486758046632L, this);
            }
            throw th;
        }
    }

    @ey(method = 382305012951961373L)
    public void Ws() {
        try {
            if (jw) {
                iy.gn(-2005681202283578379L, this);
            }
            getConsole().Ev();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -2005681202283578379L, this);
            }
            throw th;
        }
    }

    @ey(method = 2377984418875603295L)
    public boolean XL() {
        try {
            if (jw) {
                iy.gn(-3205440259059028185L, this);
            }
            return this.WB;
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -3205440259059028185L, this);
            }
            throw th;
        }
    }

    @ey(method = -228461589162173529L)
    public void Zo() {
        try {
            if (jw) {
                iy.gn(3706890429276918991L, this);
            }
            getConsole().Eq();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 3706890429276918991L, this);
            }
            throw th;
        }
    }

    @ey(method = 1524495452378622989L)
    public void aM() {
        try {
            if (jw) {
                iy.gn(-2186967230605215707L, this);
            }
            this.WB = true;
            U2();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -2186967230605215707L, this);
            }
            throw th;
        }
    }

    @ey(method = 1897166901448677705L)
    public void gn() {
        try {
            if (jw) {
                iy.gn(-131349981993044319L, this);
            }
            getConsole().aq();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -131349981993044319L, this);
            }
            throw th;
        }
    }

    @ey(method = -1590113433712439416L)
    public void j3() {
        try {
            if (jw) {
                iy.gn(836057295500169096L, this);
            }
            this.WB = false;
            U2();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 836057295500169096L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.LogcatService.LogcatListener
    @ey(method = 1602208028153535760L)
    public void j6(LogcatService.b bVar) {
        try {
            if (jw) {
                iy.tp(-4444229387523971408L, this, bVar);
            }
            getConsole().Xa(bVar);
        } catch (Throwable th) {
            if (fY) {
                iy.j3(th, -4444229387523971408L, this, bVar);
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = 238041878469925768L)
    protected void onVisibilityChanged(View view, int i) {
        try {
            if (jw) {
                iy.EQ(-286682196272051320L, this, view, new Integer(i));
            }
            super.onVisibilityChanged(view, i);
            U2();
        } catch (Throwable th) {
            if (fY) {
                iy.Mr(th, -286682196272051320L, this, view, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4243112327804280421L)
    public void tp() {
        try {
            if (jw) {
                iy.gn(-3258117951479065443L, this);
            }
            String currentAppHome = ServiceContainer.getProjectService().getCurrentAppHome();
            if (AndroidProjectSupport.iW(currentAppHome)) {
                String projectPackageName = AndroidProjectSupport.getProjectPackageName(currentAppHome, ServiceContainer.getProjectService().getBuildVariant());
                Mr(3, projectPackageName);
                getConsole().FN(projectPackageName);
            }
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -3258117951479065443L, this);
            }
            throw th;
        }
    }

    @ey(method = -162421642667544016L)
    public void u7() {
        try {
            if (jw) {
                iy.gn(-240674225994284784L, this);
            }
            getConsole().a8();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -240674225994284784L, this);
            }
            throw th;
        }
    }

    @ey(method = 3328125019043283081L)
    public void we() {
        try {
            if (jw) {
                iy.gn(2216493261410518929L, this);
            }
            MessageBox.VH(ServiceContainer.getMainActivity(), "Process", getConsole().getAllProcesses(), new b());
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 2216493261410518929L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -8894555743536720705L)
    public LogCatBrowser(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (jw) {
                iy.EQ(4840727608924488435L, null, context, attributeSet);
            }
            J8();
        } catch (Throwable th) {
            if (fY) {
                iy.Mr(th, 4840727608924488435L, null, context, attributeSet);
            }
            throw th;
        }
    }
}
