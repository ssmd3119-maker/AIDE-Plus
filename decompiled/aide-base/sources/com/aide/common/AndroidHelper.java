package com.aide.common;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.aide.ui.p;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;

@cy(clazz = -5719469610590790156L, container = -5719469610590790156L, user = true)
/* loaded from: classes.dex */
public class AndroidHelper {

    @dy(field = 4843290959917204869L)
    private static Locale DW;

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 4544239001975544531L)
    private static Boolean j6;

    @cy(clazz = 1263414528814843547L, container = -5719469610590790156L, user = true)
    static class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = -2892431543767251216L)
        final /* synthetic */ Activity WB;

        @cy(clazz = 7835098199013958752L, container = -5719469610590790156L, user = true)
        /* renamed from: com.aide.common.AndroidHelper$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0043a implements View.OnClickListener {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = 4546046124605522480L)
            final /* synthetic */ Spinner WB;

            @dy(field = -1061061625455120904L)
            final /* synthetic */ ActionBar mb;

            @cy(clazz = -5264982118530527229L, container = -5719469610590790156L, user = true)
            /* renamed from: com.aide.common.AndroidHelper$a$a$a, reason: collision with other inner class name */
            class C0044a implements PopupMenu.OnMenuItemClickListener {

                @fy
                private static /* synthetic */ boolean DW;

                @gy
                private static /* synthetic */ boolean FH;

                static {
                    iy.Zo(C0044a.class);
                }

                @ey(method = -851473350414588765L)
                C0044a() {
                }

                @Override // android.widget.PopupMenu.OnMenuItemClickListener
                @ey(method = -2609122254969051881L)
                public boolean onMenuItemClick(MenuItem menuItem) {
                    try {
                        if (DW) {
                            iy.tp(2277578942065586692L, this, menuItem);
                        }
                        ViewOnClickListenerC0043a.this.mb.selectTab(ViewOnClickListenerC0043a.this.mb.getTabAt(menuItem.getItemId()));
                        return true;
                    } catch (Throwable th) {
                        if (FH) {
                            iy.j3(th, 2277578942065586692L, this, menuItem);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(ViewOnClickListenerC0043a.class);
            }

            @ey(method = -804223777755308321L)
            ViewOnClickListenerC0043a(Spinner spinner, ActionBar actionBar) {
                this.WB = spinner;
                this.mb = actionBar;
            }

            @Override // android.view.View.OnClickListener
            @ey(method = -607949149793948703L)
            public void onClick(View view) {
                try {
                    if (fY) {
                        iy.tp(-3758391342628997560L, this, view);
                    }
                    PopupMenu popupMenu = new PopupMenu(a.this.WB, this.WB);
                    Menu menu = popupMenu.getMenu();
                    for (int i = 0; i < this.mb.getTabCount(); i++) {
                        menu.add(0, i, 0, this.mb.getTabAt(i).getText());
                    }
                    popupMenu.setOnMenuItemClickListener(new C0044a());
                    popupMenu.show();
                } catch (Throwable th) {
                    if (qp) {
                        iy.j3(th, -3758391342628997560L, this, view);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = -27687161818437184L)
        a(Activity activity) {
            this.WB = activity;
        }

        @Override // java.lang.Runnable
        @ey(method = 614300866646933280L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(4164112967154155045L, this);
                }
                try {
                    ActionBar actionBar = this.WB.getActionBar();
                    Spinner spinner = (Spinner) AndroidHelper.Hw(this.WB.findViewById(this.WB.getResources().getIdentifier("action_bar_container", "id", "android")), Spinner.class);
                    if (spinner != null) {
                        ViewOnClickListenerC0043a viewOnClickListenerC0043a = new ViewOnClickListenerC0043a(spinner, actionBar);
                        Method declaredMethod = View.class.getDeclaredMethod("getListenerInfo", new Class[0]);
                        declaredMethod.setAccessible(true);
                        Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener").set(declaredMethod.invoke(spinner, new Object[0]), viewOnClickListenerC0043a);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                if (jw) {
                    iy.aM(th2, 4164112967154155045L, this);
                }
                throw th2;
            }
        }
    }

    static {
        iy.Zo(AndroidHelper.class);
    }

    @ey(method = 203834737702183089L)
    public AndroidHelper() {
        try {
            if (FH) {
                iy.gn(1123404112429320200L, null);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1123404112429320200L, null);
            }
            throw th;
        }
    }

    @ey(method = 1289630222530029541L)
    public static int BT(Context context, int i) {
        try {
            if (FH) {
                iy.EQ(621390210197194053L, null, context, new Integer(i));
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
            int color = typedArrayObtainStyledAttributes.getColor(0, -1);
            typedArrayObtainStyledAttributes.recycle();
            return color;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 621390210197194053L, null, context, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1393375037976456000L)
    public static int DW(Context context, int i) {
        try {
            if (FH) {
                iy.EQ(-1243226287542072044L, null, context, new Integer(i));
            }
            return VH(context) >= 400.0f ? (int) (i * 1.3f) : i;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -1243226287542072044L, null, context, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -696880240938724500L)
    public static int EQ(Context context) {
        try {
            if (FH) {
                iy.tp(-756466250292846912L, null, context);
            }
            if (VH(context) > 720.0f) {
                return 21;
            }
            return VH(context) >= 400.0f ? 18 : 14;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -756466250292846912L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 4005107482307887200L)
    public static void FH(TextView textView) {
        try {
            if (FH) {
                iy.tp(-3170672808846646372L, null, textView);
            }
            textView.setTextSize(DW(textView.getContext(), (int) textView.getTextSize()) / textView.getContext().getResources().getDisplayMetrics().scaledDensity);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -3170672808846646372L, null, textView);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @ey(method = -2412139209681051315L)
    public static <T extends View> T Hw(View view, Class<T> cls) {
        try {
            if (FH) {
                iy.EQ(-753914654287951527L, null, view, cls);
            }
            if (view == 0) {
                return null;
            }
            if (view.getClass() == cls) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    T t = (T) Hw(viewGroup.getChildAt(i), cls);
                    if (t != null) {
                        return t;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -753914654287951527L, null, view, cls);
            }
            throw th;
        }
    }

    @ey(method = -1969541856252161328L)
    public static float J0(Context context) {
        try {
            if (FH) {
                iy.tp(781510863908749200L, null, context);
            }
            if (VH(context) > 720.0f) {
                return 35.0f;
            }
            return VH(context) >= 400.0f ? 30.0f : 25.0f;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 781510863908749200L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -2051276441931312264L)
    public static float J8(Context context) {
        try {
            if (FH) {
                iy.tp(879740075994925176L, null, context);
            }
            if (VH(context) > 720.0f) {
                return 20.0f;
            }
            return VH(context) >= 400.0f ? 18.0f : 15.0f;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 879740075994925176L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 4524649387577827288L)
    public static void KD(View view) {
        try {
            if (FH) {
                iy.tp(-2576100528666937080L, null, view);
            }
            ro(view, false);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -2576100528666937080L, null, view);
            }
            throw th;
        }
    }

    @ey(method = -2606726766413675937L)
    private static boolean Mr(MotionEvent motionEvent) {
        try {
            if (FH) {
                iy.tp(1194221725721743915L, null, motionEvent);
            }
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 3 || motionEvent.getAction() == 2) {
                if (motionEvent.getButtonState() == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 1194221725721743915L, null, motionEvent);
            }
            throw th;
        }
    }

    @ey(method = 1246886017645795695L)
    public static Drawable P8(Context context, int i, int i2) {
        try {
            if (FH) {
                iy.we(-7110126465582252149L, null, context, new Integer(i), new Integer(i2));
            }
            Drawable drawable = ContextCompat.getDrawable(context, vy(context, i));
            drawable.setColorFilter(BT(context, i2), PorterDuff.Mode.SRC_IN);
            return drawable;
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -7110126465582252149L, null, context, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2236302477433114125L)
    public static void QX(Context context, Rect rect) {
        try {
            if (FH) {
                iy.EQ(5332574427369261111L, null, context, rect);
            }
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 5332574427369261111L, null, context, rect);
            }
            throw th;
        }
    }

    @ey(method = -93338683778641760L)
    @TargetApi(21)
    public static void SI(Activity activity) {
        try {
            if (FH) {
                iy.tp(948696159716436028L, null, activity);
            }
            if (U2(activity)) {
                float f = activity.getResources().getDisplayMetrics().density;
                activity.getActionBar().setElevation(3.0f * f);
                View viewFindViewById = activity.getWindow().getDecorView().findViewById(activity.getResources().getIdentifier("action_bar_container", "id", "android"));
                if (viewFindViewById != null) {
                    int i = (int) (48.0f * f);
                    viewFindViewById.setPadding(i, (int) (f * 27.0f), i, 0);
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 948696159716436028L, null, activity);
            }
            throw th;
        }
    }

    @ey(method = 1520350126613210395L)
    public static boolean U2(Context context) {
        try {
            if (FH) {
                iy.tp(-2081768783119786509L, null, context);
            }
            if (j6 == null) {
                j6 = Boolean.FALSE;
                if (Build.VERSION.SDK_INT >= 21) {
                    j6 = Boolean.valueOf(((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4);
                }
            }
            return j6.booleanValue();
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -2081768783119786509L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -5164636666522469472L)
    public static float VH(Context context) {
        try {
            if (FH) {
                iy.tp(4003758142168701840L, null, context);
            }
            return Math.min(Zo(context), u7(context));
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 4003758142168701840L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 2711191098765964448L)
    public static float Ws(Context context) {
        try {
            if (FH) {
                iy.tp(-4172557700451251640L, null, context);
            }
            Activity activity = (Activity) context;
            float f = activity.getResources().getDisplayMetrics().density;
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(new Rect());
            return (r5.bottom - r5.top) / f;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -4172557700451251640L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 7871277062064767845L)
    public static boolean XL(Context context) {
        try {
            if (FH) {
                iy.tp(-5853450705758181103L, null, context);
            }
            if (context.getResources().getConfiguration().keyboard == 2) {
                if (context.getResources().getConfiguration().hardKeyboardHidden != 2) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -5853450705758181103L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -3555217765363826856L)
    public static float Zo(Context context) {
        try {
            if (FH) {
                iy.tp(4933710697175507848L, null, context);
            }
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            return windowManager.getDefaultDisplay().getHeight() / context.getResources().getDisplayMetrics().density;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 4933710697175507848L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -306594787103041437L)
    public static boolean a8(Context context) {
        try {
            if (FH) {
                iy.tp(-3092613739657721945L, null, context);
            }
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.pc")) {
                if (!context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -3092613739657721945L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -3395749029274959255L)
    public static boolean aM(Context context) {
        try {
            if (FH) {
                iy.tp(-4802308845907983971L, null, context);
            }
            if (context.getResources().getConfiguration().keyboard != 1) {
                return context.getResources().getConfiguration().hardKeyboardHidden == 2;
            }
            return true;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -4802308845907983971L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 2445964507627469296L)
    public static void cn(Activity activity, String str) {
        Locale locale;
        try {
            if (FH) {
                iy.EQ(-4320628111573899060L, null, activity, str);
            }
            if (str == null || "default".equals(str)) {
                locale = DW;
                DW = null;
            } else {
                locale = new Locale(str);
                DW = Locale.getDefault();
            }
            if (locale != null) {
                Locale.setDefault(locale);
                Configuration configuration = new Configuration();
                configuration.locale = locale;
                activity.getBaseContext().getResources().updateConfiguration(configuration, activity.getBaseContext().getResources().getDisplayMetrics());
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -4320628111573899060L, null, activity, str);
            }
            throw th;
        }
    }

    @ey(method = 3820045903121536128L)
    public static void ei(Activity activity, boolean z) {
        try {
            if (FH) {
                iy.EQ(-5698127656685140416L, null, activity, new Boolean(z));
            }
            try {
                Method declaredMethod = activity.getActionBar().getClass().getDeclaredMethod("setHasEmbeddedTabs", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(activity.getActionBar(), Boolean.valueOf(z));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -5698127656685140416L, null, activity, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -849268733151211191L)
    public static boolean er() {
        try {
            if (!FH) {
                return false;
            }
            iy.gn(3340886991838745825L, null);
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 3340886991838745825L, null);
            }
            throw th;
        }
    }

    @ey(method = 289328247754813083L)
    public static void gW(Activity activity) {
        try {
            if (FH) {
                iy.tp(-175477646570065261L, null, activity);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                View viewFindViewById = activity.findViewById(activity.getResources().getIdentifier("action_bar", "id", "android"));
                if (viewFindViewById instanceof ViewGroup) {
                    ((ViewGroup) viewFindViewById).setTouchscreenBlocksFocus(false);
                }
                View viewFindViewById2 = activity.findViewById(activity.getResources().getIdentifier("action_bar_container", "id", "android"));
                if (viewFindViewById2 instanceof ViewGroup) {
                    ((ViewGroup) viewFindViewById2).setTouchscreenBlocksFocus(false);
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -175477646570065261L, null, activity);
            }
            throw th;
        }
    }

    @ey(method = -3096742267337177613L)
    public static int gn(Context context) {
        try {
            if (FH) {
                iy.tp(-4498292904257305317L, null, context);
            }
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            return Math.min(windowManager.getDefaultDisplay().getHeight(), windowManager.getDefaultDisplay().getWidth());
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -4498292904257305317L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -829801001321182683L)
    public static boolean j3(Context context) {
        try {
            if (FH) {
                iy.tp(3217005404104941453L, null, context);
            }
            if (!er()) {
                if (!U2(context)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 3217005404104941453L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -377731384890079836L)
    public static boolean lg(Context context) {
        try {
            if (FH) {
                iy.tp(-2163333111741559520L, null, context);
            }
            if (Build.VERSION.SDK_INT < 20) {
                return false;
            }
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(p.theme_name, typedValue, true)) {
                return "Material".equals(typedValue.string);
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -2163333111741559520L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 6104909005613481833L)
    public static void nw(Activity activity) {
        try {
            if (FH) {
                iy.tp(-5968739812695808131L, null, activity);
            }
            new Handler().postDelayed(new a(activity), 200L);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -5968739812695808131L, null, activity);
            }
            throw th;
        }
    }

    @ey(method = 6008994139416616960L)
    public static boolean rN(MotionEvent motionEvent) {
        try {
            if (FH) {
                iy.tp(6543668983874266464L, null, motionEvent);
            }
            if (Mr(motionEvent)) {
                return false;
            }
            if (motionEvent.getToolType(0) == 3) {
                return true;
            }
            int source = motionEvent.getSource();
            return source == 8194 || source == 1048584;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 6543668983874266464L, null, motionEvent);
            }
            throw th;
        }
    }

    @ey(method = 1970135227462910517L)
    @TargetApi(21)
    public static void ro(View view, boolean z) {
        try {
            if (FH) {
                iy.EQ(830483819560853601L, null, view, new Boolean(z));
            }
            if (U2(view.getContext())) {
                Activity activity = (Activity) view.getContext();
                float f = activity.getResources().getDisplayMetrics().density;
                activity.getActionBar().setElevation(3.0f * f);
                int i = (int) (48.0f * f);
                view.setPadding(i, 0, i, z ? (int) (f * 27.0f) : 0);
                View viewFindViewById = activity.getWindow().getDecorView().findViewById(activity.getResources().getIdentifier("action_bar_container", "id", "android"));
                if (viewFindViewById != null) {
                    viewFindViewById.setPadding(i, (int) (f * 27.0f), i, 0);
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 830483819560853601L, null, view, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -3361498059734501055L)
    public static float tp(Context context) {
        try {
            if (FH) {
                iy.tp(811111452886127169L, null, context);
            }
            if (VH(context) > 720.0f) {
                return 25.0f;
            }
            return VH(context) >= 400.0f ? 22.0f : 20.0f;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 811111452886127169L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -4817733358635862935L)
    public static float u7(Context context) {
        try {
            if (FH) {
                iy.tp(-3184543668233818835L, null, context);
            }
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            return windowManager.getDefaultDisplay().getWidth() / context.getResources().getDisplayMetrics().density;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -3184543668233818835L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -2473033755754884540L)
    public static void v5(Activity activity) {
        try {
            if (FH) {
                iy.tp(750338857930420512L, null, activity);
            }
            if (VH(activity) >= 540.0f) {
                try {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(activity);
                    Field declaredField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                        declaredField.setBoolean(viewConfiguration, false);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 750338857930420512L, null, activity);
            }
            throw th;
        }
    }

    @ey(method = 3110859528423524480L)
    public static int vy(Context context, int i) {
        try {
            if (FH) {
                iy.EQ(-1437560050403393320L, null, context, new Integer(i));
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            return resourceId;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -1437560050403393320L, null, context, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2337476989654505968L)
    public static float we(Context context) {
        try {
            if (FH) {
                iy.tp(-450878124985839000L, null, context);
            }
            if (VH(context) > 720.0f) {
                return 25.0f;
            }
            return VH(context) >= 400.0f ? 22.0f : 20.0f;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -450878124985839000L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -6183199603125725400L)
    public static boolean yS(MotionEvent motionEvent) {
        try {
            if (FH) {
                iy.tp(-4371106096306733584L, null, motionEvent);
            }
            if (rN(motionEvent)) {
                if (motionEvent.getButtonState() == 2) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -4371106096306733584L, null, motionEvent);
            }
            throw th;
        }
    }
}
