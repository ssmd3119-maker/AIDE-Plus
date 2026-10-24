package com.aide.ui;

import abcd.c0;
import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fd;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import com.aide.common.AndroidHelper;
import com.aide.common.MessageBox;
import com.aide.common.ValueRunnable;
import com.aide.ui.activities.TrainerCourseActivity;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.marketing.WhatsNewDialog;
import com.aide.ui.trainer.c;

@cy(clazz = -1144715414290518888L, container = -1144715414290518888L, user = true)
/* loaded from: classes.dex */
public class y {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -5081862705202739575L, container = -1144715414290518888L, user = true)
    static class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 4710002140516970680L)
        final /* synthetic */ Activity WB;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 43853251495866876L)
        a(Activity activity) {
            this.WB = activity;
        }

        @Override // java.lang.Runnable
        @ey(method = -1619673078899615364L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(2860847286781901524L, this);
                }
                y.Ws(this.WB);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 2860847286781901524L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5081985222014453248L, container = -1144715414290518888L, user = true)
    static class b implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 2518855487413507333L)
        final /* synthetic */ Activity WB;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -527849958289797225L)
        b(Activity activity) {
            this.WB = activity;
        }

        @Override // java.lang.Runnable
        @ey(method = -2208955764394305675L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-1409025843373689684L, this);
                }
                ServiceContainer.getLicenseService().rN(this.WB, "key_outdated");
                y.QX(this.WB);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -1409025843373689684L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5082107738822103627L, container = -1144715414290518888L, user = true)
    static class c implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = -576617913974460360L)
        final /* synthetic */ Activity WB;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -379271747192765776L)
        c(Activity activity) {
            this.WB = activity;
        }

        @Override // java.lang.Runnable
        @ey(method = 2099303638624943040L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-1408271334705941227L, this);
                }
                y.QX(this.WB);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -1408271334705941227L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5082230255625690712L, container = -1144715414290518888L, user = true)
    static class d implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 1037829313288741872L)
        final /* synthetic */ Activity WB;

        static {
            iy.Zo(d.class);
        }

        @ey(method = 530347894930076380L)
        d(Activity activity) {
            this.WB = activity;
        }

        @Override // java.lang.Runnable
        @ey(method = 173725443698859276L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(2774329670663748381L, this);
                }
                y.we(this.WB);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 2774329670663748381L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5082352772425214503L, container = -1144715414290518888L, user = true)
    static class e extends MessageBox {

        @fy
        private static /* synthetic */ boolean AL;

        @gy
        private static /* synthetic */ boolean w9;

        @dy(field = 3164909993861141616L)
        private AlertDialog k2;

        @dy(field = -988021708659045048L)
        private boolean zh = true;

        @cy(clazz = 5656184466746339040L, container = -1144715414290518888L, user = true)
        class a implements DialogInterface.OnShowListener {

            @fy
            private static /* synthetic */ boolean FH;

            @gy
            private static /* synthetic */ boolean Hw;

            @dy(field = 1778428900506968125L)
            final /* synthetic */ Activity j6;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 196512937081233480L)
            a(Activity activity) {
                this.j6 = activity;
            }

            @Override // android.content.DialogInterface.OnShowListener
            @ey(method = 655390568105464912L)
            public void onShow(DialogInterface dialogInterface) {
                try {
                    if (FH) {
                        iy.tp(878948551058042520L, this, dialogInterface);
                    }
                    View viewFindViewById = e.this.k2.findViewById(this.j6.getResources().getIdentifier("android:id/title_template", null, null));
                    if (viewFindViewById != null) {
                        viewFindViewById.setBackgroundColor(-1);
                    }
                    View viewFindViewById2 = e.this.k2.findViewById(this.j6.getResources().getIdentifier("android:id/alertTitle", null, null));
                    if (viewFindViewById2 instanceof TextView) {
                        ((TextView) viewFindViewById2).setTextColor(-4473925);
                    }
                } catch (Throwable th) {
                    if (Hw) {
                        iy.j3(th, 878948551058042520L, this, dialogInterface);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 5656304800949113773L, container = -1144715414290518888L, user = true)
        class b implements ValueRunnable<c.d> {

            @fy
            private static /* synthetic */ boolean FH;

            @gy
            private static /* synthetic */ boolean Hw;

            @dy(field = 4536498408706263681L)
            final /* synthetic */ Activity j6;

            static {
                iy.Zo(b.class);
            }

            @ey(method = -95597122798228992L)
            b(Activity activity) {
                this.j6 = activity;
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = 5799233504447208300L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(c.d dVar) {
                try {
                    if (FH) {
                        iy.tp(-98015904604746192L, this, dVar);
                    }
                    e.this.k2.dismiss();
                    c0.J0(this.j6, "StartupChoice", dVar.EQ() + 1);
                    if (dVar.u7() > 0) {
                        ServiceContainer.getMainActivity().yS(true, dVar.v5(), null);
                    } else {
                        TrainerCourseActivity.er(this.j6, dVar.v5());
                    }
                } catch (Throwable th) {
                    if (Hw) {
                        iy.j3(th, -98015904604746192L, this, dVar);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 5656425135155951800L, container = -1144715414290518888L, user = true)
        class c implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = -3134511347791993080L)
            final /* synthetic */ Activity WB;

            @dy(field = -1090422353248031281L)
            final /* synthetic */ LinearLayout mb;

            static {
                iy.Zo(c.class);
            }

            @ey(method = 3670421927436998811L)
            c(Activity activity, LinearLayout linearLayout) {
                this.WB = activity;
                this.mb = linearLayout;
            }

            @Override // java.lang.Runnable
            @ey(method = 1364481211284778080L)
            public void run() {
                try {
                    if (fY) {
                        iy.gn(-24162740371744296L, this);
                    }
                    e.this.zh = false;
                    e.this.cb(this.WB, this.mb);
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, -24162740371744296L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 5656545469366853121L, container = -1144715414290518888L, user = true)
        class d implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -2997551493302213796L)
            final /* synthetic */ Activity WB;

            static {
                iy.Zo(d.class);
            }

            @ey(method = -318133621016498067L)
            d(Activity activity) {
                this.WB = activity;
            }

            @Override // java.lang.Runnable
            @ey(method = 227635138048118268L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(-24100997248513113L, this);
                    }
                    if (!ServiceContainer.getMainActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE")) {
                        ActivityCompat.requestPermissions(this.WB, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 21);
                    } else {
                        e.this.k2.dismiss();
                        y.VH(this.WB);
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -24100997248513113L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(e.class);
        }

        @ey(method = -1380742883941164217L)
        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = -2767068283982644797L)
        public void cb(Activity activity, LinearLayout linearLayout) {
            try {
                if (AL) {
                    iy.EQ(-530578913367934144L, this, activity, linearLayout);
                }
                com.aide.ui.trainer.d.Hw(linearLayout, ServiceContainer.ro().J8(), this.zh, false, new b(activity), new c(activity, linearLayout), null, new d(activity), null);
            } catch (Throwable th) {
                if (w9) {
                    iy.Mr(th, -530578913367934144L, this, activity, linearLayout);
                }
                throw th;
            }
        }

        @Override // com.aide.common.MessageBox
        @ey(method = -982706334512133296L)
        protected Dialog Hw(Activity activity) {
            try {
                if (AL) {
                    iy.tp(-1588154207801548053L, this, activity);
                }
                View viewInflate = LayoutInflater.from(activity).inflate(r.trainer_dialog, (ViewGroup) null);
                cb(activity, (LinearLayout) viewInflate.findViewById(q.trainerDialogLayout));
                AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle(u.trainer_option_question).setView(viewInflate).setCancelable(false).create();
                this.k2 = alertDialogCreate;
                alertDialogCreate.setOnShowListener(new a(activity));
                return this.k2;
            } catch (Throwable th) {
                if (w9) {
                    iy.j3(th, -1588154207801548053L, this, activity);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5082475289220675000L, container = -1144715414290518888L, user = true)
    static class f implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 618514969544676160L)
        final /* synthetic */ Activity WB;

        static {
            iy.Zo(f.class);
        }

        @ey(method = -78362729069393988L)
        f(Activity activity) {
            this.WB = activity;
        }

        @Override // java.lang.Runnable
        @ey(method = 1812312639792166540L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(4559767180499142384L, this);
                }
                y.gn(this.WB);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 4559767180499142384L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(y.class);
    }

    @ey(method = 3153163125532670495L)
    public y() {
        try {
            if (j6) {
                iy.gn(1482749831977205364L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1482749831977205364L, null);
            }
            throw th;
        }
    }

    @ey(method = 3994451042597396136L)
    public static void EQ(Activity activity, String str) {
        try {
            if (j6) {
                iy.EQ(2362239171260490405L, null, activity, str);
            }
            if (ServiceContainer.getLicenseService().aM() || ServiceContainer.getLicenseService().g3()) {
                return;
            }
            ServiceContainer.getLicenseService().er(ServiceContainer.getMainActivity(), str, "GCM notification");
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 2362239171260490405L, null, activity, str);
            }
            throw th;
        }
    }

    @ey(method = -1580715879912991080L)
    public static void J0(Activity activity) {
        try {
            if (j6) {
                iy.tp(878968495976102913L, null, activity);
            }
            com.aide.ui.trainer.a.j6(activity, new d(activity));
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 878968495976102913L, null, activity);
            }
            throw th;
        }
    }

    @ey(method = -3165991918852173373L)
    public static void J8(Activity activity) {
        try {
            if (j6) {
                iy.tp(-1457393973102630760L, null, activity);
            }
            if (ServiceContainer.getMainActivity().x9(true) == null || !WhatsNewDialog.v5(activity, new a(activity))) {
                Ws(activity);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1457393973102630760L, null, activity);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 1506043946961732801L)
    public static void QX(Activity activity) {
        try {
            if (j6) {
                iy.tp(682065691433002440L, null, activity);
            }
            if (ServiceContainer.getProjectService().isOpenProject() || ServiceContainer.getOpenFileService().aM()) {
                if (ServiceContainer.getProjectService().sG()) {
                    return;
                }
                if (ServiceContainer.isTrainerMode()) {
                    XL(activity);
                    return;
                } else {
                    tp(activity, false, "startup");
                    return;
                }
            }
            if (!ServiceContainer.ro().dx()) {
                we(activity);
            } else if (AndroidHelper.U2(activity)) {
                TrainerCourseActivity.rN(activity);
            } else {
                aM(activity);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 682065691433002440L, null, activity);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 3110699075153837541L)
    public static void VH(Activity activity) {
        try {
            if (j6) {
                iy.tp(1660894689499613552L, null, activity);
            }
            c0.J0(activity, "StartupChoice", 0);
            if (WhatsNewDialog.v5(activity, new f(activity))) {
                return;
            }
            gn(activity);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1660894689499613552L, null, activity);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -331028535391449736L)
    public static void Ws(Activity activity) {
        try {
            if (j6) {
                iy.tp(-477602573749051583L, null, activity);
            }
            if (ServiceContainer.getLicenseService().XL()) {
                MessageBox.KD(activity, "AIDE Premium key outdated", "Your AIDE Premium Key is outdated. Premium features have been disabled. Please upgrade it to the latest version.", true, "Update", new b(activity), "Not now", new c(activity));
            } else {
                QX(activity);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -477602573749051583L, null, activity);
            }
            throw th;
        }
    }

    @ey(method = 3797751793361570187L)
    public static void XL(Activity activity) {
        try {
            if (j6) {
                iy.tp(3517155420807783924L, null, activity);
            }
            if (ServiceContainer.getLicenseService().g3()) {
                return;
            }
            ServiceContainer.getLicenseService().sh(activity, 0, 0, "after_mayShowPrimeSalesDialog", true);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3517155420807783924L, null, activity);
            }
            throw th;
        }
    }

    @ey(method = 4087070178214388019L)
    public static void Zo(Activity activity) {
        try {
            if (j6) {
                iy.tp(-1616258555646770544L, null, activity);
            }
            if (ServiceContainer.getMainActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE")) {
                MessageBox.v5();
                VH(activity);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1616258555646770544L, null, activity);
            }
            throw th;
        }
    }

    @ey(method = 3728145132928381968L)
    private static void aM(Activity activity) {
        try {
            if (j6) {
                iy.tp(5667562849192644575L, null, activity);
            }
            FireBaseLogEvent.tp("App init: Showing select mode dialog");
            MessageBox.gW(activity, new e());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 5667562849192644575L, null, activity);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -441840940526065333L)
    public static void gn(Activity activity) {
        try {
            if (j6) {
                iy.tp(-5386944340494766112L, null, activity);
            }
            ServiceContainer.j6(false);
            tp(activity, true, "after_selecting_expert_2");
            PromoNotificationAlarmReceiver.DW(ServiceContainer.getContext());
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -5386944340494766112L, null, activity);
            }
            throw th;
        }
    }

    @ey(method = -1432127727850295205L)
    private static void tp(Activity activity, boolean z, String str) {
        try {
            if (j6) {
                iy.we(6916106961233076992L, null, activity, new Boolean(z), str);
            }
            if (!ServiceContainer.getLicenseService().Mz()) {
                ServiceContainer.getLicenseService().ro(activity, z ? 16 : 0, str, false, true);
            } else if (z) {
                J0(activity);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 6916106961233076992L, null, activity, new Boolean(z), str);
            }
            throw th;
        }
    }

    @ey(method = -7054986503279615873L)
    public static void u7(Activity activity) {
        try {
            if (j6) {
                iy.tp(3981514805856230336L, null, activity);
            }
            ServiceContainer.getProjectService().sG();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3981514805856230336L, null, activity);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -655851018418882240L)
    public static void we(Activity activity) {
        try {
            if (j6) {
                iy.tp(564768202841774255L, null, activity);
            }
            FireBaseLogEvent.tp("App init: Showing create project dialog");
            MessageBox.gW(activity, new fd(ServiceContainer.getFileBrowserService().DW(), ServiceContainer.getMainActivity().wc()));
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 564768202841774255L, null, activity);
            }
            throw th;
        }
    }
}
