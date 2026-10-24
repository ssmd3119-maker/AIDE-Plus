package com.aide.ui.trainer;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.provider.Settings;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.aide.common.AndroidHelper;
import com.aide.ui.AppPreferences;
import com.aide.ui.ServiceContainer;
import com.aide.ui.activities.AndroidTrainerActivity;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.t;
import com.aide.ui.u;
import java.util.HashSet;
import java.util.Set;

@cy(clazz = 221157201561947787L, container = 221157201561947787L, user = true)
/* loaded from: classes.dex */
public class b {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = 4503584321728343015L)
    private Set<Long> DW;

    @dy(field = -2645097344141993192L)
    private Toast FH;

    @dy(field = 2853263377798123500L)
    private boolean j6;

    @cy(clazz = -394478940297065920L, container = 221157201561947787L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 4302443133932698755L)
        final /* synthetic */ Context WB;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 4286147287222354600L)
        a(Context context) {
            this.WB = context;
        }

        @Override // java.lang.Runnable
        @ey(method = -1517561572773370031L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(747930846576700325L, this);
                }
                if (b.this.EQ(this.WB)) {
                    MediaPlayer.create(this.WB, t.success_task).start();
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, 747930846576700325L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -394521467029321005L, container = 221157201561947787L, user = true)
    /* renamed from: com.aide.ui.trainer.b$b, reason: collision with other inner class name */
    class CountDownTimerC0093b extends CountDownTimer {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(CountDownTimerC0093b.class);
        }

        @ey(method = -1280173461157135831L)
        CountDownTimerC0093b(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        @ey(method = 1577978769006587560L)
        public void onFinish() {
            try {
                if (DW) {
                    iy.gn(775587791141888543L, this);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 775587791141888543L, this);
                }
                throw th;
            }
        }

        @Override // android.os.CountDownTimer
        @ey(method = 37205383691188471L)
        public void onTick(long j) {
            try {
                if (DW) {
                    iy.tp(6665312108696838696L, this, new Long(j));
                }
                if (b.this.FH == null) {
                    cancel();
                } else {
                    b.this.FH.show();
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 6665312108696838696L, this, new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -394563993757512796L, container = 221157201561947787L, user = true)
    class c implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -264129282782428000L)
        c(b bVar) {
        }

        @Override // java.lang.Runnable
        @ey(method = -97846478758017316L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(298036594445280980L, this);
                }
                if (ServiceContainer.ro().Sf()) {
                    ServiceContainer.ro().lp();
                } else {
                    ServiceContainer.ro().oY();
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 298036594445280980L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(b.class);
    }

    @ey(method = -2645918024891705168L)
    public b() {
        try {
            if (Hw) {
                iy.gn(-297574364462958549L, null);
            }
            this.j6 = true;
            this.DW = new HashSet();
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -297574364462958549L, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 3654868819262592153L)
    public boolean EQ(Context context) {
        try {
            if (Hw) {
                iy.tp(2282516770321706292L, this, context);
            }
            return context.getSharedPreferences("RunAppController", 0).getBoolean("SOUND_ENABLED", false);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 2282516770321706292L, this, context);
            }
            throw th;
        }
    }

    @ey(method = -868530212890861839L)
    private void Mr(Context context) {
        try {
            if (Hw) {
                iy.tp(-3370410740114890440L, this, context);
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("RunAppController", 0).edit();
            editorEdit.putBoolean("HAS_RUN_SETTING", true);
            editorEdit.commit();
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -3370410740114890440L, this, context);
            }
            throw th;
        }
    }

    @ey(method = -4585183239225438080L)
    private void U2(Context context, String str, String str2, String str3, int i) {
        try {
            if (Hw) {
                iy.J8(-1280659570339275091L, this, context, str, str2, str3, new Integer(i));
            }
            View viewInflate = LayoutInflater.from(context).inflate(r.trainer_toast, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(q.trainerToastTitle);
            TextView textView2 = (TextView) viewInflate.findViewById(q.trainerToastText);
            TextView textView3 = (TextView) viewInflate.findViewById(q.trainerToastButton);
            textView.setText(str);
            textView2.setText(Html.fromHtml(str2));
            if (str3 != null) {
                textView3.setText(str3);
            } else {
                textView3.setVisibility(8);
            }
            textView.setTextSize(AndroidHelper.J0(context));
            textView2.setTextSize(AndroidHelper.J8(context));
            textView3.setTextSize(AndroidHelper.tp(context));
            if (this.FH != null) {
                this.FH.cancel();
            }
            this.FH = new Toast(context);
            if ("P".equals(Build.VERSION.CODENAME)) {
                this.FH.setDuration(1);
            } else {
                this.FH.setDuration(0);
                if (i > 2) {
                    new CountDownTimerC0093b(i * 1000, 1000L).start();
                }
            }
            this.FH.setGravity(49, this.FH.getXOffset(), this.FH.getYOffset());
            this.FH.setView(viewInflate);
            this.FH.show();
        } catch (Throwable th) {
            if (v5) {
                iy.lg(th, -1280659570339275091L, this, context, str, str2, str3, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2584547906189071680L)
    private int VH(Context context) {
        try {
            if (Hw) {
                iy.tp(4053417970824357001L, this, context);
            }
            return context.getSharedPreferences("RunAppController", 0).getInt("TOAST_DURATION_SETTING", 0);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 4053417970824357001L, this, context);
            }
            throw th;
        }
    }

    @ey(method = -4494442696519281413L)
    private void XL(Context context, boolean z) {
        try {
            if (Hw) {
                iy.EQ(-1181747296391785084L, this, context, new Boolean(z));
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("RunAppController", 0).edit();
            editorEdit.putBoolean("WAS_RUN_SETTING", z);
            editorEdit.commit();
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, -1181747296391785084L, this, context, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -3566859795971533516L)
    private String Zo(Context context) {
        try {
            if (Hw) {
                iy.tp(-3225740262230010471L, this, context);
            }
            return context.getSharedPreferences("RunAppController", 0).getString("TOAST_BUTTON_SETTING", "");
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -3225740262230010471L, this, context);
            }
            throw th;
        }
    }

    @ey(method = 892486056931509375L)
    private void aM(Context context, boolean z) {
        try {
            if (Hw) {
                iy.EQ(420420788734058880L, this, context, new Boolean(z));
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("RunAppController", 0).edit();
            editorEdit.putBoolean("WAS_STARTED_SETTING", z);
            editorEdit.commit();
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 420420788734058880L, this, context, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -140775756344569689L)
    private String gn(Context context) {
        try {
            if (Hw) {
                iy.tp(1954103076871647512L, this, context);
            }
            return context.getSharedPreferences("RunAppController", 0).getString("TOAST_MESSAGE_SETTING", "");
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 1954103076871647512L, this, context);
            }
            throw th;
        }
    }

    @ey(method = -13235061828226875L)
    private void j3(Context context, boolean z, String str, String str2, String str3, int i, boolean z2) {
        try {
            if (Hw) {
                iy.QX(530569127130955440L, this, new Object[]{context, new Boolean(z), str, str2, str3, new Integer(i), new Boolean(z2)});
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("RunAppController", 0).edit();
            editorEdit.putBoolean("WAS_STARTED_SETTING", true);
            editorEdit.putBoolean("IS_PLAYGROUND_SETTING", z);
            editorEdit.putString("TOAST_TITLE_SETTING", str);
            editorEdit.putString("TOAST_MESSAGE_SETTING", str2);
            editorEdit.putString("TOAST_BUTTON_SETTING", str3);
            editorEdit.putInt("TOAST_DURATION_SETTING", i);
            editorEdit.putBoolean("SOUND_ENABLED", z2);
            editorEdit.commit();
        } catch (Throwable th) {
            if (v5) {
                iy.rN(th, 530569127130955440L, this, new Object[]{context, new Boolean(z), str, str2, str3, new Integer(i), new Boolean(z2)});
            }
            throw th;
        }
    }

    private static /* synthetic */ void j6(Object obj, Intent intent) {
        ((Context) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    @ey(method = -4478451687526743223L)
    private boolean tp(Context context) {
        try {
            if (Hw) {
                iy.tp(2827354588986762816L, this, context);
            }
            return context.getSharedPreferences("RunAppController", 0).getBoolean("HAS_RUN_SETTING", false);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 2827354588986762816L, this, context);
            }
            throw th;
        }
    }

    @ey(method = -4400174861997036720L)
    private String u7(Context context) {
        try {
            if (Hw) {
                iy.tp(220874735420168871L, this, context);
            }
            return context.getSharedPreferences("RunAppController", 0).getString("TOAST_TITLE_SETTING", "");
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 220874735420168871L, this, context);
            }
            throw th;
        }
    }

    @ey(method = -1692170679693206528L)
    public boolean Hw(Context context) {
        try {
            if (Hw) {
                iy.tp(-375650919703520625L, this, context);
            }
            return context.getSharedPreferences("RunAppController", 0).getBoolean("WAS_RUN_SETTING", false);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -375650919703520625L, this, context);
            }
            throw th;
        }
    }

    @ey(method = 7660057452579296895L)
    public void J0() {
        try {
            if (Hw) {
                iy.gn(4422172288166470288L, this);
            }
            this.j6 = false;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 4422172288166470288L, this);
            }
            throw th;
        }
    }

    @ey(method = 5592743345549225788L)
    public void J8() {
        try {
            if (Hw) {
                iy.gn(2395072917251341135L, this);
            }
            this.j6 = true;
            if (Hw(ServiceContainer.getContext())) {
                XL(ServiceContainer.getContext(), false);
                if (this.FH != null) {
                    this.FH.cancel();
                    this.FH = null;
                }
                new Handler().postDelayed(new c(this), 500L);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 2395072917251341135L, this);
            }
            throw th;
        }
    }

    @ey(method = 2866048510808546440L)
    public void QX(String str, String str2, String str3) {
        try {
            if (Hw) {
                iy.we(267554450065614045L, this, str, str2, str3);
            }
            if (str3.length() > 0) {
                AndroidTrainerActivity.v5(ServiceContainer.getMainActivity(), str3, ServiceContainer.ro().yS(), ServiceContainer.ro().Mr().J8(), ServiceContainer.ro().BT(), ServiceContainer.ro().Mr().J0(), ServiceContainer.ro().Sf());
            } else {
                j3(ServiceContainer.getContext(), ServiceContainer.ro().Sf(), ServiceContainer.ro().yS(), ServiceContainer.ro().Mr().J8(), ServiceContainer.ro().QX(), ServiceContainer.ro().Mr().J0(), AppPreferences.J8());
                ServiceContainer.J8().VH(str, str2);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, 267554450065614045L, this, str, str2, str3);
            }
            throw th;
        }
    }

    @ey(method = 969359898840965580L)
    public boolean Ws() {
        try {
            if (Hw) {
                iy.gn(-529265911346797729L, this);
            }
            try {
                Context context = ServiceContainer.getContext();
                boolean z = Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps") == 1;
                if (!z) {
                    FireBaseLogEvent.tp("Exercise app was not run unknown sources: " + ServiceContainer.ro().gW());
                    String string = context.getResources().getString(u.trainer_on_enable_unknown_sources);
                    U2(context, "⚠", string, null, 5);
                    j6(context, new Intent("android.settings.SECURITY_SETTINGS"));
                    ServiceContainer.ro().Qq(string);
                } else if (!tp(context)) {
                    String string2 = context.getResources().getString(u.trainer_on_first_install);
                    U2(context, "⚠", string2, null, 5);
                    ServiceContainer.ro().Qq(string2);
                }
                return z;
            } catch (Settings.SettingNotFoundException unused) {
                return true;
            }
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -529265911346797729L, this);
            }
            throw th;
        }
    }

    @ey(method = 4133453455200502300L)
    public boolean v5(Context context) {
        try {
            if (Hw) {
                iy.tp(-199396731430747321L, this, context);
            }
            return context.getSharedPreferences("RunAppController", 0).getBoolean("WAS_STARTED_SETTING", false);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -199396731430747321L, this, context);
            }
            throw th;
        }
    }

    @ey(method = -59708994187921533L)
    public void we(Context context, long j) {
        try {
            if (Hw) {
                iy.EQ(878924841870323508L, this, context, new Long(j));
            }
            if (v5(context)) {
                aM(context, false);
                Mr(context);
                if (this.DW.contains(Long.valueOf(j))) {
                    return;
                }
                this.DW.add(Long.valueOf(j));
                if (ServiceContainer.vJ()) {
                    XL(context, true);
                    new Handler().postDelayed(new a(context), 2000L);
                    return;
                }
                FireBaseLogEvent.tp("Exercise app was run: " + ServiceContainer.ro().gW());
                if (this.j6) {
                    ServiceContainer.ro().oY();
                    return;
                }
                XL(context, true);
                ServiceContainer.ro().sy();
                if (ServiceContainer.ro().Sf()) {
                    return;
                }
                U2(context, u7(context), gn(context), Zo(context), VH(context));
            }
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 878924841870323508L, this, context, new Long(j));
            }
            throw th;
        }
    }
}
