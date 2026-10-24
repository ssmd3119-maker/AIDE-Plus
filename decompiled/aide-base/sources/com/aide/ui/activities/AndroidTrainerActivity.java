package com.aide.ui.activities;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.aide.common.AndroidHelper;
import com.aide.common.UndoManager;
import com.aide.ui.ServiceContainer;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.uidesigner.f;
import com.aide.uidesigner.l;
import java.io.File;

@cy(clazz = 309968735317025088L, container = 309968735317025088L, user = true)
/* loaded from: classes.dex */
public class AndroidTrainerActivity extends Activity {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    @cy(clazz = -727436341154326069L, container = 309968735317025088L, user = true)
    class a implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -97507657779913272L)
        a() {
        }

        @Override // android.view.View.OnClickListener
        @ey(method = -166671683056844745L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(5006728700189011224L, this, view);
                }
                AndroidTrainerActivity.this.Zo();
                AndroidTrainerActivity.this.finish();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, 5006728700189011224L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -727451224722158860L, container = 309968735317025088L, user = true)
    class b implements View.OnFocusChangeListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -3250925508274064333L)
        final /* synthetic */ TextView WB;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -1797391497983307401L)
        b(TextView textView) {
            this.WB = textView;
        }

        @Override // android.view.View.OnFocusChangeListener
        @ey(method = -4087506665742722751L)
        public void onFocusChange(View view, boolean z) {
            try {
                if (jw) {
                    iy.EQ(-788521386633383471L, this, view, new Boolean(z));
                }
                if (z) {
                    ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, 1, 0.0f, 1, 0.5f);
                    scaleAnimation.setDuration(400);
                    scaleAnimation.setFillAfter(true);
                    this.WB.startAnimation(scaleAnimation);
                    return;
                }
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.0f, 1, 0.5f);
                scaleAnimation2.setDuration(400);
                scaleAnimation2.setFillAfter(true);
                this.WB.startAnimation(scaleAnimation2);
            } catch (Throwable th) {
                if (fY) {
                    iy.Mr(th, -788521386633383471L, this, view, new Boolean(z));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -727466108285928357L, container = 309968735317025088L, user = true)
    class c implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -3423466023394926249L)
        final /* synthetic */ View WB;

        @cy(clazz = -2462980138410051264L, container = 309968735317025088L, user = true)
        class a implements Animation.AnimationListener {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 190353379005909215L)
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            @ey(method = -19499406964874811L)
            public void onAnimationEnd(Animation animation) {
                try {
                    if (DW) {
                        iy.tp(275641263555757617L, this, animation);
                    }
                    if (AndroidTrainerActivity.this.getWindow().getCurrentFocus() == null) {
                        c.this.WB.findViewById(q.trainerToast).requestFocus();
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 275641263555757617L, this, animation);
                    }
                    throw th;
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            @ey(method = -2981726216772377735L)
            public void onAnimationRepeat(Animation animation) {
                try {
                    if (DW) {
                        iy.tp(-5250004009860509243L, this, animation);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -5250004009860509243L, this, animation);
                    }
                    throw th;
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            @ey(method = 1738586229885423564L)
            public void onAnimationStart(Animation animation) {
                try {
                    if (DW) {
                        iy.tp(-4150823927895613016L, this, animation);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -4150823927895613016L, this, animation);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -2463022478269158845L, container = 309968735317025088L, user = true)
        class b implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            @cy(clazz = 26755660456090148L, container = 309968735317025088L, user = true)
            class a implements Animation.AnimationListener {

                @fy
                private static /* synthetic */ boolean DW;

                @gy
                private static /* synthetic */ boolean FH;

                static {
                    iy.Zo(a.class);
                }

                @ey(method = 262223637198581596L)
                a() {
                }

                @Override // android.view.animation.Animation.AnimationListener
                @ey(method = -3054019432318858416L)
                public void onAnimationEnd(Animation animation) {
                    try {
                        if (DW) {
                            iy.tp(136243751795101608L, this, animation);
                        }
                        c.this.WB.setVisibility(8);
                    } catch (Throwable th) {
                        if (FH) {
                            iy.j3(th, 136243751795101608L, this, animation);
                        }
                        throw th;
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                @ey(method = -7387041530071179680L)
                public void onAnimationRepeat(Animation animation) {
                    try {
                        if (DW) {
                            iy.tp(-5474985320365713888L, this, animation);
                        }
                    } catch (Throwable th) {
                        if (FH) {
                            iy.j3(th, -5474985320365713888L, this, animation);
                        }
                        throw th;
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                @ey(method = 6587300782586216809L)
                public void onAnimationStart(Animation animation) {
                    try {
                        if (DW) {
                            iy.tp(-4350575209200944031L, this, animation);
                        }
                    } catch (Throwable th) {
                        if (FH) {
                            iy.j3(th, -4350575209200944031L, this, animation);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(b.class);
            }

            @ey(method = 145546620589981644L)
            b() {
            }

            @Override // java.lang.Runnable
            @ey(method = -1992263547788468235L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(5326613179874860365L, this);
                    }
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setAnimationListener(new a());
                    alphaAnimation.setDuration(500L);
                    c.this.WB.startAnimation(alphaAnimation);
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 5326613179874860365L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(c.class);
        }

        @ey(method = 8379665713265887884L)
        c(View view) {
            this.WB = view;
        }

        @Override // java.lang.Runnable
        @ey(method = -800958751669565573L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(5323450954276543200L, this);
                }
                if (ServiceContainer.vJ()) {
                    return;
                }
                ServiceContainer.ro().sy();
                if (AndroidTrainerActivity.this.getIntent().getBooleanExtra("EXTRA_PLAYGROUND", false)) {
                    return;
                }
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(500L);
                this.WB.startAnimation(alphaAnimation);
                this.WB.setVisibility(0);
                alphaAnimation.setAnimationListener(new a());
                new Handler().postDelayed(new b(), AndroidTrainerActivity.this.getIntent().getIntExtra("EXTRA_DURATION", 10) * 1000);
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, 5323450954276543200L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -727480991845634560L, container = 309968735317025088L, user = true)
    class d extends l {

        @gy
        private static /* synthetic */ boolean e3;

        @fy
        private static /* synthetic */ boolean eU;

        static {
            iy.Zo(d.class);
        }

        @ey(method = 5892994726949434648L)
        d(ViewGroup viewGroup, String str, String str2, UndoManager undoManager) {
            super(viewGroup, str, str2, undoManager);
        }

        @Override // com.aide.uidesigner.l
        @ey(method = -2742342096258631645L)
        protected void XG(boolean z) {
            try {
                if (eU) {
                    iy.Ws(-189683237946105328L, this, z);
                }
            } catch (Throwable th) {
                if (e3) {
                    iy.j3(th, -189683237946105328L, this, new Boolean(z));
                }
                throw th;
            }
        }

        @Override // com.aide.uidesigner.l
        @ey(method = 3179487899226257705L)
        protected void XX() {
            try {
                if (eU) {
                    iy.gn(-150320911531786164L, this);
                }
            } catch (Throwable th) {
                if (e3) {
                    iy.aM(th, -150320911531786164L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.uidesigner.l
        @ey(method = 161246291523674484L)
        protected void br() {
            try {
                if (eU) {
                    iy.gn(4451895623835991575L, this);
                }
            } catch (Throwable th) {
                if (e3) {
                    iy.aM(th, 4451895623835991575L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.uidesigner.l
        @ey(method = -2137914042414422307L)
        protected void kQ(f fVar) {
            try {
                if (eU) {
                    iy.tp(198317938547120760L, this, fVar);
                }
            } catch (Throwable th) {
                if (e3) {
                    iy.j3(th, 198317938547120760L, this, fVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -727495875401277469L, container = 309968735317025088L, user = true)
    class e implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(e.class);
        }

        @ey(method = -26317220917018312L)
        e() {
        }

        @Override // java.lang.Runnable
        @ey(method = -1542686583920045580L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(6743785867419113056L, this);
                }
                ServiceContainer.ro().oY();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 6743785867419113056L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(AndroidTrainerActivity.class);
    }

    @ey(method = -64000664670684111L)
    public AndroidTrainerActivity() {
        try {
            if (WB) {
                iy.gn(-940411505960907633L, null);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, -940411505960907633L, null);
            }
            throw th;
        }
    }

    @ey(method = 1435873900858969708L)
    private void FH(ViewGroup viewGroup) {
        try {
            if (WB) {
                iy.tp(483680181943988477L, this, viewGroup);
            }
            View viewInflate = LayoutInflater.from(this).inflate(r.trainer_toast, (ViewGroup) null);
            viewInflate.setVisibility(8);
            TextView textView = (TextView) viewInflate.findViewById(q.trainerToastTitle);
            TextView textView2 = (TextView) viewInflate.findViewById(q.trainerToastText);
            TextView textView3 = (TextView) viewInflate.findViewById(q.trainerToastButton);
            textView.setText(getIntent().getStringExtra("EXTRA_TITLE"));
            textView2.setText(Html.fromHtml(getIntent().getStringExtra("EXTRA_TEXT")));
            textView3.setText(getIntent().getStringExtra("EXTRA_BUTTON"));
            textView.setTextSize(AndroidHelper.J0(this));
            textView2.setTextSize(AndroidHelper.J8(this));
            textView3.setTextSize(AndroidHelper.tp(this));
            viewInflate.findViewById(q.trainerToast).setOnClickListener(new a());
            viewInflate.findViewById(q.trainerToast).setOnFocusChangeListener(new b(textView3));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = (int) (getResources().getDisplayMetrics().density * 20.0f);
            layoutParams.bottomMargin = (int) (getResources().getDisplayMetrics().density * 20.0f);
            layoutParams.leftMargin = (int) (getResources().getDisplayMetrics().density * 20.0f);
            layoutParams.rightMargin = (int) (getResources().getDisplayMetrics().density * 20.0f);
            viewGroup.addView(viewInflate, layoutParams);
            new Handler().postDelayed(new c(viewInflate), 2000L);
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, 483680181943988477L, this, viewGroup);
            }
            throw th;
        }
    }

    @ey(method = -1099128719266785416L)
    private void Hw(ViewGroup viewGroup, String str, String str2) {
        try {
            if (WB) {
                iy.we(-2208595084934995061L, this, viewGroup, str, str2);
            }
            d dVar = new d(viewGroup, str, str2, new UndoManager());
            dVar.OW();
            dVar.FN(false);
        } catch (Throwable th) {
            if (mb) {
                iy.U2(th, -2208595084934995061L, this, viewGroup, str, str2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 6675776932769082696L)
    public void Zo() {
        try {
            if (WB) {
                iy.gn(-708310633090152661L, this);
            }
            if (ServiceContainer.vJ() || getIntent().getBooleanExtra("EXTRA_PLAYGROUND", false)) {
                return;
            }
            new Handler().postDelayed(new e(), 500L);
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, -708310633090152661L, this);
            }
            throw th;
        }
    }

    private static /* synthetic */ void j6(Object obj, Intent intent) {
        ((Activity) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    @ey(method = 67859400079262259L)
    public static void v5(Activity activity, String str, String str2, String str3, String str4, int i, boolean z) {
        try {
            if (WB) {
                iy.QX(120160151750775380L, null, new Object[]{activity, str, str2, str3, str4, new Integer(i), new Boolean(z)});
            }
            Intent intent = new Intent(activity, (Class<?>) AndroidTrainerActivity.class);
            intent.putExtra("EXTRA_FILE", str);
            intent.putExtra("EXTRA_TITLE", str2);
            intent.putExtra("EXTRA_TEXT", str3);
            intent.putExtra("EXTRA_BUTTON", str4);
            intent.putExtra("EXTRA_DURATION", i);
            intent.putExtra("EXTRA_PLAYGROUND", z);
            intent.setFlags(268435456);
            j6(activity, intent);
        } catch (Throwable th) {
            if (mb) {
                iy.rN(th, 120160151750775380L, null, new Object[]{activity, str, str2, str3, str4, new Integer(i), new Boolean(z)});
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 941737791141746809L)
    public void onBackPressed() {
        try {
            if (WB) {
                iy.gn(-1364438981659359404L, this);
            }
            super.onBackPressed();
            Zo();
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, -1364438981659359404L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -517173054876414020L)
    protected void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (WB) {
                iy.tp(-157609153277030587L, this, bundle);
            }
            super.onCreate(bundle);
            setContentView(r.trainer_app_android);
            AndroidHelper.ro(findViewById(q.trainerAppActivityLayout), true);
            FrameLayout frameLayout = (FrameLayout) findViewById(q.trainerAppActivityLayout);
            String stringExtra = getIntent().getStringExtra("EXTRA_FILE");
            Hw(frameLayout, stringExtra, new File(stringExtra).getParentFile().getParentFile().getPath());
            FH(frameLayout);
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, -157609153277030587L, this, bundle);
            }
            throw th;
        }
    }
}
