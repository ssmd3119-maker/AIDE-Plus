package abcd;

import abcd.ig;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.Toast;
import com.aide.common.AppLog;
import com.aide.ui.MainActivity;
import com.aide.ui.ServiceContainer;
import com.aide.ui.activities.HelpViewActivity;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.android.vending.billing.IInAppBillingService;
import com.google.android.gms.measurement.AppMeasurement;
import com.probelytics.api.UserTouchAction;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

@cy(clazz = -7932626172141952505L, container = -7932626172141952505L, user = true)
/* loaded from: classes.dex */
public class xe {

    @dy(field = -219288143769215997L)
    private static final Set<String> Mr;

    @dy(field = 1398711420088080456L)
    private static final Set<String> U2;

    @dy(field = -1956523788432693120L)
    private static final Set<String> a8;

    @dy(field = 7319600369439503808L)
    private static boolean er;

    @gy
    private static /* synthetic */ boolean gW;

    @dy(field = -573518002112528616L)
    private static final Set<String> j3;

    @dy(field = 333005874783706872L)
    private static final Set<String> lg;

    @dy(field = 1379565889394664395L)
    private static final Set<String> rN;

    @fy
    private static /* synthetic */ boolean yS;

    @dy(field = 4707463263519026175L)
    private IInAppBillingService DW;

    @dy(field = -4890236431641710835L)
    private ArrayDeque<String> EQ;

    @dy(field = 2941277280598522840L)
    private ServiceConnection FH;

    @dy(field = -122835417178139529L)
    private Handler Hw;

    @dy(field = -1924974203657963797L)
    private boolean J0;

    @dy(field = -5718199454831016519L)
    private boolean J8;

    @dy(field = 159127624137784848L)
    private boolean QX;

    @dy(field = 2196186373083998295L)
    private AtomicReference<String> VH;

    @dy(field = -3127562212887967740L)
    private boolean Ws;

    @dy(field = -709233577923371375L)
    private String XL;

    @dy(field = -3382650265579493657L)
    private Object Zo;

    @dy(field = -127158951951550245L)
    private Map<String, q> aM;

    @dy(field = 2439479086328009775L)
    private boolean gn;

    @dy(field = -365679830025550953L)
    private boolean j6;

    @dy(field = 3568041396660001428L)
    private AtomicLong tp;

    @dy(field = -2882739132973267848L)
    private r u7;

    @dy(field = 1568013144148117472L)
    private ThreadPoolExecutor v5;

    @dy(field = 3209220816608005120L)
    private Object we;

    @cy(clazz = 1079272863796041144L, container = -7932626172141952505L, user = true)
    static /* synthetic */ class a {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -110236644399978741L)
        static final /* synthetic */ int[] j6;

        static {
            try {
                iy.Zo(a.class);
                if (DW) {
                    iy.gn(-1900238279499660432L, null);
                }
                int[] iArr = new int[p.values().length];
                j6 = iArr;
                try {
                    iArr[p.RESULT_OK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    j6[p.RESULT_USER_CANCELED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    j6[p.RESULT_BILLING_UNAVAILABLE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    j6[p.RESULT_SERVICE_UNAVAILABLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    j6[p.RESULT_DEVELOPER_ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    j6[p.RESULT_ERROR.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    j6[p.RESULT_ITEM_ALREADY_OWNED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    j6[p.RESULT_ITEM_NOT_OWNED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    j6[p.RESULT_ITEM_UNAVAILABLE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -1900238279499660432L, null);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 403830119156661292L, container = -7932626172141952505L, user = true)
    class b implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = -1613652188552895744L)
        final /* synthetic */ Set WB;

        @dy(field = 2830979335196450192L)
        final /* synthetic */ k mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -16627402664605248L)
        public b(Set set, k kVar) {
            this.WB = set;
            this.mb = kVar;
        }

        @Override // java.lang.Runnable
        @ey(method = -805343711958410448L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(2354084318773793760L, this);
                }
                try {
                    try {
                        try {
                            xe.this.Mr();
                            this.mb.DW(xe.this.vy(this.WB));
                        } catch (l e) {
                            xe.this.vJ(e);
                            this.mb.j6(e.getMessage());
                        } catch (RemoteException e2) {
                            xe.this.vJ(e2);
                            this.mb.j6("Error communicating with Play Store service.");
                        }
                    } catch (InterruptedException e3) {
                        xe.this.vJ(e3);
                        this.mb.j6("Internal error in in-app billing (interrupted).");
                    } catch (JSONException e4) {
                        xe.this.vJ(e4);
                        this.mb.j6("Internal error in in-app billing (JSON parse).");
                    }
                } catch (m e5) {
                    xe.this.vJ(e5);
                    this.mb.j6("Internal error in in-app billing (cancelled).");
                } catch (Throwable th) {
                    xe.this.vJ(th);
                }
            } catch (Throwable th2) {
                if (qp) {
                    iy.aM(th2, 2354084318773793760L, this);
                }
                throw th2;
            }
        }
    }

    @cy(clazz = 403887471509241375L, container = -7932626172141952505L, user = true)
    class c implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 4058475863110062385L)
        public c() {
        }

        @Override // java.lang.Runnable
        @ey(method = 765457800042358696L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-1041765191697227592L, this);
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    xe.this.Mr();
                                    IInAppBillingService iInAppBillingServiceRN = xe.this.rN();
                                    xe.this.ef("Requesting in-app purchases");
                                    xe.this.ei(iInAppBillingServiceRN.nf(3, ServiceContainer.P8, "inapp", null));
                                    IInAppBillingService iInAppBillingServiceRN2 = xe.this.rN();
                                    xe.this.ef("Requesting subscription purchases");
                                    xe.this.ei(iInAppBillingServiceRN2.nf(3, ServiceContainer.P8, "subs", null));
                                    synchronized (xe.this.Zo) {
                                        xe.this.gn = false;
                                    }
                                } catch (InterruptedException e) {
                                    xe.this.vJ(e);
                                    synchronized (xe.this.Zo) {
                                        xe.this.gn = false;
                                    }
                                }
                            } catch (Throwable th) {
                                xe.this.vJ(th);
                                synchronized (xe.this.Zo) {
                                    xe.this.gn = false;
                                }
                            }
                        } catch (l e2) {
                            xe.this.vJ(e2);
                            synchronized (xe.this.Zo) {
                                xe.this.gn = false;
                            }
                        }
                    } catch (m e3) {
                        xe.this.vJ(e3);
                        synchronized (xe.this.Zo) {
                            xe.this.gn = false;
                        }
                    } catch (RemoteException e4) {
                        xe.this.vJ(e4);
                        synchronized (xe.this.Zo) {
                            xe.this.gn = false;
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (xe.this.Zo) {
                        xe.this.gn = false;
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                if (jw) {
                    iy.aM(th3, -1041765191697227592L, this);
                }
                throw th3;
            }
        }
    }

    @cy(clazz = 403944823865884752L, container = -7932626172141952505L, user = true)
    class d implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = 4664561740716895200L)
        final /* synthetic */ String WB;

        @dy(field = 4790202862816090225L)
        final /* synthetic */ boolean mb;

        @cy(clazz = -1181053003575811185L, container = -7932626172141952505L, user = true)
        class a implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = -811092857867657400L)
            final /* synthetic */ Map WB;

            @dy(field = 4287215470161113200L)
            final /* synthetic */ PendingIntent mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 3600848684063070531L)
            public a(Map map, PendingIntent pendingIntent) {
                this.WB = map;
                this.mb = pendingIntent;
            }

            @Override // java.lang.Runnable
            @ey(method = -566482280180389300L)
            public void run() {
                try {
                    if (fY) {
                        iy.gn(-5989138330781357897L, this);
                    }
                    xe.this.aM.putAll(this.WB);
                    xe.this.lp(this.mb);
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, -5989138330781357897L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(d.class);
        }

        @ey(method = 811516877379069009L)
        public d(String str, boolean z) {
            this.WB = str;
            this.mb = z;
        }

        private static /* synthetic */ Bundle j6(IInAppBillingService iInAppBillingService, int i, String str, String str2, String str3, String str4) {
            Bundle bundleGQ = iInAppBillingService.gQ(i, str, str2, str3, str4);
            iy.er(bundleGQ, iInAppBillingService, i, str, str2, str3, str4);
            return bundleGQ;
        }

        @Override // java.lang.Runnable
        @ey(method = -340244735510001735L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(-5991605754091598208L, this);
                }
                try {
                    try {
                        try {
                            try {
                                xe.this.Mr();
                                Map mapVy = xe.this.vy(Collections.singleton(this.WB));
                                xe.this.VH.set(Long.toString(new SecureRandom().nextLong()));
                                Bundle bundleJ6 = j6(xe.this.rN(), 3, ServiceContainer.P8, this.WB, this.mb ? "subs" : "inapp", (String) xe.this.VH.get());
                                p pVarDW = p.DW(bundleJ6.getInt("RESPONSE_CODE"));
                                xe.this.ef("resp code for intent getting: " + pVarDW);
                                if (pVarDW == p.RESULT_OK) {
                                    xe.this.Hw.post(new a(mapVy, (PendingIntent) bundleJ6.getParcelable("BUY_INTENT")));
                                } else if (pVarDW == p.RESULT_ITEM_ALREADY_OWNED) {
                                    xe.this.j3();
                                } else {
                                    xe.U2(pVarDW);
                                }
                            } catch (JSONException e) {
                                xe.this.vJ(e);
                            }
                        } catch (RemoteException e2) {
                            xe.this.Qq();
                            xe.this.vJ(e2);
                        }
                    } catch (m unused) {
                    } catch (Throwable th) {
                        xe.this.vJ(th);
                    }
                } catch (l e3) {
                    xe.this.vJ(e3);
                    xe.this.x9(e3.getMessage());
                } catch (InterruptedException e4) {
                    xe.this.vJ(e4);
                }
            } catch (Throwable th2) {
                if (qp) {
                    iy.aM(th2, -5991605754091598208L, this);
                }
                throw th2;
            }
        }
    }

    @cy(clazz = 404002176226591423L, container = -7932626172141952505L, user = true)
    class e implements ServiceConnection {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(e.class);
        }

        @ey(method = 7007106577544064672L)
        public e() {
        }

        @Override // android.content.ServiceConnection
        @ey(method = 380206884670360605L)
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                if (mb) {
                    iy.EQ(26237578953835304L, this, componentName, iBinder);
                }
                xe.this.ef("service connected.");
                synchronized (xe.this.Zo) {
                    xe.this.DW = IInAppBillingService.Sub.asInterface(iBinder);
                    xe.this.Ws = true;
                    xe.this.Zo.notifyAll();
                }
                xe.this.j3();
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, 26237578953835304L, this, componentName, iBinder);
                }
                throw th;
            }
        }

        @Override // android.content.ServiceConnection
        @ey(method = -20389536286894953L)
        public void onServiceDisconnected(ComponentName componentName) {
            try {
                if (mb) {
                    iy.tp(63626672643443136L, this, componentName);
                }
                xe.this.ef("service disconnected.");
                xe.this.j6 = false;
                synchronized (xe.this.Zo) {
                    xe.this.DW = null;
                    xe.this.Ws = false;
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, 63626672643443136L, this, componentName);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 404059528591361388L, container = -7932626172141952505L, user = true)
    class f implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(f.class);
        }

        @ey(method = 1956621733417174995L)
        public f(xe xeVar) {
        }

        @Override // java.lang.Runnable
        @ey(method = -574303875477856620L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(-2775574666819184912L, this);
                }
                ServiceContainer.getLicenseService().P8(System.currentTimeMillis() + 86400000);
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -2775574666819184912L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 404116880960194647L, container = -7932626172141952505L, user = true)
    class g implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(g.class);
        }

        @ey(method = 8550398069584432344L)
        public g(xe xeVar) {
        }

        @Override // java.lang.Runnable
        @ey(method = -2154991313584843113L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(-2773255655435172201L, this);
                }
                ServiceContainer.getLicenseService().SI(System.currentTimeMillis() + 86400000);
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -2773255655435172201L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 404174233333091200L, container = -7932626172141952505L, user = true)
    class h implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(h.class);
        }

        @ey(method = 8925431231045180152L)
        public h(xe xeVar) {
        }

        @Override // java.lang.Runnable
        @ey(method = 957312954497405483L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(-2770936159858334400L, this);
                }
                ServiceContainer.getLicenseService().yS(System.currentTimeMillis() + 86400000);
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -2770936159858334400L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 404231585710051047L, container = -7932626172141952505L, user = true)
    class i implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(i.class);
        }

        @ey(method = -2386379670720623096L)
        public i(xe xeVar) {
        }

        @Override // java.lang.Runnable
        @ey(method = 1464700791971449067L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(-2768616180088671509L, this);
                }
                ServiceContainer.getLicenseService().gW(System.currentTimeMillis() + 86400000);
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -2768616180088671509L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 404288938091074188L, container = -7932626172141952505L, user = true)
    class j implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 2766451636201850400L)
        final /* synthetic */ String WB;

        static {
            iy.Zo(j.class);
        }

        @ey(method = 6000857156287885941L)
        public j(xe xeVar, String str) {
            this.WB = str;
        }

        @Override // java.lang.Runnable
        @ey(method = -1759701065067519552L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-2188075967487269088L, this);
                }
                Toast.makeText(ServiceContainer.gn(), this.WB, 1).show();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -2188075967487269088L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 5763619210328963841L, container = 5763619210328963841L, user = true)
    public interface k {
        @ey(method = 828763193018253196L)
        void DW(Map<String, q> map);

        @ey(method = -1524682718296097352L)
        void j6(String str);
    }

    @cy(clazz = -6858916962800735745L, container = -6858916962800735745L, user = true)
    private static class l extends Exception {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(l.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 82605656187222807L)
        public l(String str) {
            super(str);
            try {
                if (WB) {
                    iy.tp(346194982795444740L, null, str);
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, 346194982795444740L, null, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 375898335389636617L, container = 375898335389636617L, user = true)
    private static class m extends Exception {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(m.class);
        }

        @ey(method = 2683326243221435492L)
        private m() {
            try {
                if (WB) {
                    iy.gn(4410545752390589136L, null);
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 4410545752390589136L, null);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -4771271776543052872L)
        public /* synthetic */ m(b bVar) {
            this();
            try {
                if (WB) {
                    iy.tp(-2164048610627713680L, null, bVar);
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, -2164048610627713680L, null, bVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5584478144104267040L, container = -5584478144104267040L, user = true)
    public static class n {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -3511745457547958237L)
        public final ig.c DW;

        @dy(field = 146394116793095159L)
        public final o j6;

        static {
            iy.Zo(n.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -7031528985364919475L)
        public /* synthetic */ n(o oVar, b bVar) {
            this(oVar);
            try {
                if (FH) {
                    iy.EQ(-277541779185925968L, null, oVar, bVar);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, -277541779185925968L, null, oVar, bVar);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 286209316081801167L)
        public /* synthetic */ n(o oVar, ig.c cVar, b bVar) {
            this(oVar, cVar);
            try {
                if (FH) {
                    iy.we(1025400339931288392L, null, oVar, cVar, bVar);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.U2(th, 1025400339931288392L, null, oVar, cVar, bVar);
                }
                throw th;
            }
        }

        @ey(method = 3944662538272523L)
        private n(o oVar, ig.c cVar) {
            try {
                if (FH) {
                    iy.EQ(886217102348911232L, null, oVar, cVar);
                }
                this.j6 = oVar;
                this.DW = cVar;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, 886217102348911232L, null, oVar, cVar);
                }
                throw th;
            }
        }

        @ey(method = -114088478631797223L)
        private n(o oVar) {
            try {
                if (FH) {
                    iy.tp(-4120297874145286708L, null, oVar);
                }
                this.j6 = oVar;
                this.DW = null;
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -4120297874145286708L, null, oVar);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = 2469440668690799235L, container = 2469440668690799235L, user = true)
    public static final class o {

        @dy(field = 509009073658519005L)
        public static final o ERROR;

        @dy(field = -2804399176416496048L)
        public static final o OK_ALREADY_OWNED;

        @dy(field = -2463569647812587125L)
        public static final o OK_PURCHASED;

        @dy(field = 2442223465237761933L)
        private static final /* synthetic */ o[] fY;

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        static {
            try {
                iy.Zo(o.class);
                if (qp) {
                    iy.gn(-1745558622612575775L, null);
                }
                OK_PURCHASED = new o("OK_PURCHASED", 0);
                OK_ALREADY_OWNED = new o("OK_ALREADY_OWNED", 1);
                o oVar = new o("ERROR", 2);
                ERROR = oVar;
                fY = new o[]{OK_PURCHASED, OK_ALREADY_OWNED, oVar};
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, -1745558622612575775L, null);
                }
                throw th;
            }
        }

        @ey(method = -69005541664206147L)
        private o(String str, int i) {
            try {
                if (qp) {
                    iy.EQ(6056666115469538740L, null, str, new Integer(i));
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.Mr(th, 6056666115469538740L, null, str, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 352054994100404980L)
        public static o valueOf(String str) {
            try {
                if (qp) {
                    iy.tp(457742079195748089L, null, str);
                }
                return (o) Enum.valueOf(o.class, str);
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, 457742079195748089L, null, str);
                }
                throw th;
            }
        }

        @ey(method = 2965947847668573648L)
        public static o[] values() {
            try {
                if (qp) {
                    iy.gn(-261586366017298561L, null);
                }
                return (o[]) fY.clone();
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, -261586366017298561L, null);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = 298441395614679999L, container = 298441395614679999L, user = true)
    private static final class p {

        @dy(field = -741035675831341725L)
        public static final p RESULT_BILLING_UNAVAILABLE;

        @dy(field = 515037436736129536L)
        public static final p RESULT_DEVELOPER_ERROR;

        @dy(field = 1899334658774539513L)
        public static final p RESULT_ERROR;

        @dy(field = 25844473801617625L)
        public static final p RESULT_ITEM_ALREADY_OWNED;

        @dy(field = -17285084094294120L)
        public static final p RESULT_ITEM_NOT_OWNED;

        @dy(field = -5923321305208493615L)
        public static final p RESULT_ITEM_UNAVAILABLE;

        @dy(field = 884293245121672065L)
        public static final p RESULT_OK;

        @dy(field = -231256466307754191L)
        public static final p RESULT_SERVICE_UNAVAILABLE;

        @dy(field = -1674375240888995500L)
        public static final p RESULT_USER_CANCELED;

        @fy
        private static /* synthetic */ boolean cT;

        @dy(field = 405739643932019101L)
        private static final /* synthetic */ p[] hK;

        @gy
        private static /* synthetic */ boolean q7;

        static {
            try {
                iy.Zo(p.class);
                if (cT) {
                    iy.gn(-1273439752120642145L, null);
                }
                RESULT_OK = new p("RESULT_OK", 0);
                RESULT_USER_CANCELED = new p("RESULT_USER_CANCELED", 1);
                RESULT_SERVICE_UNAVAILABLE = new p("RESULT_SERVICE_UNAVAILABLE", 2);
                RESULT_BILLING_UNAVAILABLE = new p("RESULT_BILLING_UNAVAILABLE", 3);
                RESULT_ITEM_UNAVAILABLE = new p("RESULT_ITEM_UNAVAILABLE", 4);
                RESULT_DEVELOPER_ERROR = new p("RESULT_DEVELOPER_ERROR", 5);
                RESULT_ERROR = new p("RESULT_ERROR", 6);
                RESULT_ITEM_ALREADY_OWNED = new p("RESULT_ITEM_ALREADY_OWNED", 7);
                p pVar = new p("RESULT_ITEM_NOT_OWNED", 8);
                RESULT_ITEM_NOT_OWNED = pVar;
                hK = new p[]{RESULT_OK, RESULT_USER_CANCELED, RESULT_SERVICE_UNAVAILABLE, RESULT_BILLING_UNAVAILABLE, RESULT_ITEM_UNAVAILABLE, RESULT_DEVELOPER_ERROR, RESULT_ERROR, RESULT_ITEM_ALREADY_OWNED, pVar};
            } catch (Throwable th) {
                if (q7) {
                    iy.aM(th, -1273439752120642145L, null);
                }
                throw th;
            }
        }

        @ey(method = 14029206044761557L)
        private p(String str, int i) {
            try {
                if (cT) {
                    iy.EQ(-1707675159040514272L, null, str, new Integer(i));
                }
            } catch (Throwable th) {
                if (q7) {
                    iy.Mr(th, -1707675159040514272L, null, str, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = 595250654110089791L)
        public static p DW(int i) {
            try {
                if (cT) {
                    iy.u7(54896135108296568L, null, i);
                }
                p[] pVarArrValues = values();
                if (i >= 0 && i < pVarArrValues.length) {
                    return pVarArrValues[i];
                }
                return RESULT_ERROR;
            } catch (Throwable th) {
                if (q7) {
                    iy.j3(th, 54896135108296568L, null, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 428029034601481680L)
        public static p valueOf(String str) {
            try {
                if (cT) {
                    iy.tp(91884319256661555L, null, str);
                }
                return (p) Enum.valueOf(p.class, str);
            } catch (Throwable th) {
                if (q7) {
                    iy.j3(th, 91884319256661555L, null, str);
                }
                throw th;
            }
        }

        @ey(method = 3281214880558566972L)
        public static p[] values() {
            try {
                if (cT) {
                    iy.gn(-174592898175450447L, null);
                }
                return (p[]) hK.clone();
            } catch (Throwable th) {
                if (q7) {
                    iy.aM(th, -174592898175450447L, null);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 7269087622921102620L, container = 7269087622921102620L, user = true)
    public static class q {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = -1249917411815345328L)
        public final String DW;

        @dy(field = -1405572550198721793L)
        public final String FH;

        @dy(field = -227175112703722185L)
        public final long Hw;

        @dy(field = -1553443278840086544L)
        public final String j6;

        @dy(field = -4074433075256957952L)
        public final String v5;

        static {
            iy.Zo(q.class);
        }

        @ey(method = -7337268418213628664L)
        public q(String str, String str2, String str3, String str4, String str5, long j, String str6) {
            try {
                if (Zo) {
                    iy.QX(-273131833035894552L, null, new Object[]{str, str2, str3, str4, str5, new Long(j), str6});
                }
                this.j6 = str;
                this.DW = str3;
                this.FH = str5;
                this.Hw = j;
                this.v5 = str6;
            } catch (Throwable th) {
                if (VH) {
                    iy.rN(th, -273131833035894552L, null, new Object[]{str, str2, str3, str4, str5, new Long(j), str6});
                }
                throw th;
            }
        }
    }

    @cy(clazz = 5034156381188612424L, container = 5034156381188612424L, user = true)
    private static class r {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = 2069852172680079795L)
        private boolean DW;

        @dy(field = -2206196960481434271L)
        private Thread FH;

        @dy(field = -3225352025974921392L)
        private JSONObject Hw;

        @dy(field = -1520651689717902840L)
        private Object j6;

        @dy(field = 2051460269975244660L)
        private boolean v5;

        @cy(clazz = 6639050920770608457L, container = 5034156381188612424L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -350737834945554784L)
            public a() {
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
            
                if (abcd.xe.r.Zo(r3, r4) == false) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
            
                r2 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
            
                com.aide.common.AppLog.v5(r2);
             */
            @Override // java.lang.Runnable
            @abcd.ey(method = 1859870921687461045L)
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    r6 = this;
                    r0 = 1653122031737615703(0x16f111bab017b557, double:3.5679390361912204E-198)
                    boolean r2 = abcd.xe.r.a.mb     // Catch: java.lang.Throwable -> L60
                    if (r2 == 0) goto Lc
                    abcd.iy.gn(r0, r6)     // Catch: java.lang.Throwable -> L60
                Lc:
                    abcd.xe$r r2 = abcd.xe.r.this     // Catch: java.lang.Throwable -> L60
                    java.lang.Object r2 = abcd.xe.r.j6(r2)     // Catch: java.lang.Throwable -> L60
                    monitor-enter(r2)     // Catch: java.lang.Throwable -> L60
                    abcd.xe$r r3 = abcd.xe.r.this     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
                    java.lang.Object r3 = abcd.xe.r.j6(r3)     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
                    r4 = 600000(0x927c0, double:2.964394E-318)
                    r3.wait(r4)     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
                    goto L22
                L20:
                    r3 = move-exception
                    goto L5e
                L22:
                    abcd.xe$r r3 = abcd.xe.r.this     // Catch: java.lang.Throwable -> L20
                    boolean r3 = abcd.xe.r.DW(r3)     // Catch: java.lang.Throwable -> L20
                    if (r3 == 0) goto L2c
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                    return
                L2c:
                    abcd.xe$r r3 = abcd.xe.r.this     // Catch: java.lang.Throwable -> L20
                    org.json.JSONObject r3 = abcd.xe.r.FH(r3)     // Catch: java.lang.Throwable -> L20
                    if (r3 != 0) goto L36
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                    goto Lc
                L36:
                    org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L20 org.json.JSONException -> L58
                    abcd.xe$r r4 = abcd.xe.r.this     // Catch: java.lang.Throwable -> L20 org.json.JSONException -> L58
                    org.json.JSONObject r4 = abcd.xe.r.FH(r4)     // Catch: java.lang.Throwable -> L20 org.json.JSONException -> L58
                    java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L20 org.json.JSONException -> L58
                    r3.<init>(r4)     // Catch: java.lang.Throwable -> L20 org.json.JSONException -> L58
                    abcd.xe$r r4 = abcd.xe.r.this     // Catch: java.lang.Throwable -> L20
                    boolean r4 = abcd.xe.r.Hw(r4)     // Catch: java.lang.Throwable -> L20
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                    boolean r2 = abcd.xe.r.v5(r3, r4)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L60
                    if (r2 == 0) goto Lc
                    return
                L53:
                    r2 = move-exception
                    com.aide.common.AppLog.v5(r2)     // Catch: java.lang.Throwable -> L60
                    goto Lc
                L58:
                    r3 = move-exception
                    com.aide.common.AppLog.v5(r3)     // Catch: java.lang.Throwable -> L20
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                    goto Lc
                L5e:
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                    throw r3     // Catch: java.lang.Throwable -> L60
                L60:
                    r2 = move-exception
                    boolean r3 = abcd.xe.r.a.jw
                    if (r3 == 0) goto L68
                    abcd.iy.aM(r2, r0, r6)
                L68:
                    goto L6a
                L69:
                    throw r2
                L6a:
                    goto L69
                */
                throw new UnsupportedOperationException("Method not decompiled: abcd.xe.r.a.run():void");
            }
        }

        static {
            iy.Zo(r.class);
        }

        @ey(method = -2182883149963296936L)
        public r() {
            try {
                if (Zo) {
                    iy.gn(1488797385737426403L, null);
                }
                this.j6 = new Object();
                this.DW = false;
                this.v5 = false;
                Thread thread = new Thread(new a(), "Subscription WS Client");
                this.FH = thread;
                thread.setDaemon(true);
                this.FH.setPriority(1);
                this.FH.start();
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, 1488797385737426403L, null);
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = 1232729199412688328L)
        public static boolean Zo(JSONObject jSONObject, boolean z) {
            try {
                if (!Zo) {
                    return true;
                }
                iy.EQ(185939410339211112L, null, jSONObject, new Boolean(z));
                return true;
            } catch (Throwable th) {
                if (VH) {
                    iy.Mr(th, 185939410339211112L, null, jSONObject, new Boolean(z));
                }
                throw th;
            }
        }

        @ey(method = 3016034385998600295L)
        public void VH(JSONObject jSONObject, boolean z) {
            try {
                if (Zo) {
                    iy.EQ(-4961232440165614977L, this, jSONObject, new Boolean(z));
                }
                synchronized (this.j6) {
                    if (!this.v5 && z) {
                        this.v5 = true;
                    }
                    this.Hw = jSONObject;
                    this.j6.notify();
                }
            } catch (Throwable th) {
                if (VH) {
                    iy.Mr(th, -4961232440165614977L, this, jSONObject, new Boolean(z));
                }
                throw th;
            }
        }

        @ey(method = -3460722965052287616L)
        public void gn() {
            try {
                if (Zo) {
                    iy.gn(2478585014470240508L, this);
                }
                synchronized (this.j6) {
                    this.DW = true;
                    this.j6.notify();
                }
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, 2478585014470240508L, this);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(xe.class);
            if (yS) {
                iy.gn(-1900238279499660432L, null);
            }
            j3 = new HashSet(Arrays.asList("aide_prime_monthly_0500", "aide_prime_monthly_0500_7days_trial", "aide_prime_monthly_1000"));
            Mr = new HashSet(Arrays.asList("aide_prime_yearly_3000", "aide_prime_yearly_3000_7days_trial", "aide_prime_yearly_2400", "aide_prime_yearly_6000"));
            U2 = new HashSet(Arrays.asList("aide_premium_key_1000"));
            a8 = new HashSet(Arrays.asList("app_ui_builder_0300"));
            lg = new HashSet(Arrays.asList("aide_debugger_0500"));
            rN = new HashSet(Arrays.asList("aide_developer_key_1500", "aide_developer_key_1000", "aide_developer_key_upgrade_1000"));
            er = true;
        } catch (Throwable th) {
            if (gW) {
                iy.aM(th, -1900238279499660432L, null);
            }
            throw th;
        }
    }

    @ey(method = 3283279744143683200L)
    public xe() {
        try {
            if (yS) {
                iy.gn(-939545652495707325L, null);
            }
            this.Zo = new Object();
            this.VH = new AtomicReference<>("");
            this.tp = new AtomicLong(-1L);
            this.EQ = new ArrayDeque<>(2001);
            this.we = new Object();
            this.aM = new HashMap();
            this.u7 = new r();
            this.Hw = new Handler();
            this.v5 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        } catch (Throwable th) {
            if (gW) {
                iy.aM(th, -939545652495707325L, null);
            }
            throw th;
        }
    }

    private static /* synthetic */ void DW(Object obj, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        ((Activity) obj).startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
        iy.ei(obj, intentSender, i2, intent, i3, i4, i5);
    }

    @ey(method = -1331533822847607959L)
    private ig.c I(String str, String str2, boolean z) {
        ig.c cVarFH;
        try {
            if (yS) {
                iy.we(3121324042935997629L, this, str, str2, new Boolean(z));
            }
            ef("Processing data: " + str);
            ef("...with signature: " + str2);
            if (ServiceContainer.vJ() || (cVarFH = ig.FH(str, str2)) == null || cVarFH.v5.matches("[0-9]*")) {
                return null;
            }
            ef("Purchase verified");
            if (z && !this.VH.get().equals(cVarFH.Hw)) {
                ef("Invalid payload");
                return null;
            }
            if (cVarFH.FH != ig.a.PURCHASED && cVarFH.FH != ig.a.REFUNDED) {
                return null;
            }
            if (dx(cVarFH.DW)) {
                ef("Prime monthly subscription found - setting prime subscribed");
                ServiceContainer.getLicenseService().ei(System.currentTimeMillis() + 86400000, false);
                this.u7.VH(P8(str), z);
            } else if (sG(cVarFH.DW)) {
                ef("Prime yearly subscription found - setting prime subscribed");
                ServiceContainer.getLicenseService().ei(System.currentTimeMillis() + 86400000, true);
                this.u7.VH(P8(str), z);
            } else if (cb(cVarFH.DW)) {
                ef("Premium key found - setting premium");
                ServiceContainer.aj(new f(this));
            } else if (ro(cVarFH.DW)) {
                ef("UI Designer found - setting designer");
                ServiceContainer.aj(new g(this));
            } else if (KD(cVarFH.DW)) {
                ef("Debugger found - setting debugger");
                ServiceContainer.aj(new h(this));
            } else {
                if (!cn(cVarFH.DW)) {
                    ef("Unknown product id");
                    return null;
                }
                ef("Developer found - setting developer");
                ServiceContainer.aj(new i(this));
            }
            return cVarFH;
        } catch (Throwable th) {
            if (gW) {
                iy.U2(th, 3121324042935997629L, this, str, str2, new Boolean(z));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -4717539359822056075L)
    public void Mr() {
        try {
            if (yS) {
                iy.gn(7161492047715693681L, this);
            }
            if (!this.J0) {
                throw new l("Google Play store is not installed. Please install it and restart the app.");
            }
            if (!this.J8) {
                throw new l("Google Play store IAB service is not available. Please install the latest version of the Google Play Store and restart your device.");
            }
            if (!this.QX) {
                throw new l("Google Play store IAB service bind requested failed. Please install the latest version of the Google Play Store and restart your device.");
            }
            U2(p.DW(rN().Oi(3, ServiceContainer.P8, "inapp")));
            U2(p.DW(rN().Oi(3, ServiceContainer.P8, "subs")));
        } catch (Throwable th) {
            if (gW) {
                iy.aM(th, 7161492047715693681L, this);
            }
            throw th;
        }
    }

    @ey(method = 1943269918864750264L)
    private n Mz(Intent intent) {
        try {
            if (yS) {
                iy.tp(-2057388455472428760L, this, intent);
            }
            b bVar = null;
            if (intent == null) {
                ef("Null data in activity result");
                return new n(o.ERROR, bVar);
            }
            p pVarDW = p.DW(intent.getIntExtra("RESPONSE_CODE", 0));
            ef("Received activity result - response code: " + intent.getIntExtra("RESPONSE_CODE", 0));
            if (pVarDW == p.RESULT_OK || pVarDW == p.RESULT_ITEM_ALREADY_OWNED) {
                ig.c cVarI = I(intent.getStringExtra("INAPP_PURCHASE_DATA"), intent.getStringExtra("INAPP_DATA_SIGNATURE"), true);
                if (cVarI == null) {
                    ef("Null purchase in activity result");
                    return new n(o.ERROR, bVar);
                }
                if (pVarDW == p.RESULT_OK) {
                    return new n(o.OK_PURCHASED, cVarI, bVar);
                }
                if (pVarDW == p.RESULT_ITEM_ALREADY_OWNED) {
                    ef("Item already owned");
                    j3();
                    return new n(o.OK_ALREADY_OWNED, cVarI, bVar);
                }
            } else {
                try {
                    U2(pVarDW);
                } catch (l e2) {
                    vJ(e2);
                } catch (m e3) {
                    vJ(e3);
                }
            }
            return new n(o.ERROR, bVar);
        } catch (Throwable th) {
            if (gW) {
                iy.j3(th, -2057388455472428760L, this, intent);
            }
            throw th;
        }
    }

    @ey(method = 1619497431335604480L)
    private JSONObject P8(String str) {
        try {
            if (yS) {
                iy.tp(-873458653276003520L, this, str);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.put("deviceId", this.tp.get());
                Context context = ServiceContainer.getContext();
                try {
                    jSONObject.put("aideVersion", context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
                } catch (PackageManager.NameNotFoundException e2) {
                    e2.printStackTrace();
                }
                return jSONObject;
            } catch (JSONException e3) {
                vJ(e3);
                return null;
            }
        } catch (Throwable th) {
            if (gW) {
                iy.j3(th, -873458653276003520L, this, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -4348373031351593076L)
    public void Qq() {
        try {
            if (yS) {
                iy.gn(-3308535551814239180L, this);
            }
            x9("Error communicating with Play Store service.");
        } catch (Throwable th) {
            if (gW) {
                iy.aM(th, -3308535551814239180L, this);
            }
            throw th;
        }
    }

    @ey(method = -4798241344833293952L)
    private void Sf(n nVar, Map<String, q> map) {
        try {
            if (yS) {
                iy.EQ(5436092730823736576L, this, nVar, map);
            }
            if (map == null) {
                return;
            }
            String str = "GooglePlay:" + nVar.DW.j6;
            String str2 = nVar.DW.DW;
            q qVar = map.get(str2);
            String str3 = qVar.DW;
            boolean zEquals = "subs".equals(qVar.j6);
            String str4 = zEquals ? "Subscription" : "In-app purchase";
            double d2 = qVar.Hw;
            Double.isNaN(d2);
            double d3 = (d2 / 1000000.0d) * 0.7d;
            if (zEquals) {
                d3 *= 2.0d;
            }
            FireBaseLogEvent.u7(ServiceContainer.getContext(), str, "Google Play", str2, str3, str4, d3, qVar.v5);
        } catch (Throwable th) {
            if (gW) {
                iy.Mr(th, 5436092730823736576L, this, nVar, map);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1737468667261654965L)
    public static void U2(p pVar) {
        b bVar = null;
        try {
            if (yS) {
                iy.tp(6033406895230395735L, null, pVar);
            }
            switch (a.j6[pVar.ordinal()]) {
                case 1:
                    return;
                case 2:
                    throw new m(bVar);
                case 3:
                    throw new l("In-app billing not supported. Upgrade to a newer version of the Play Store.");
                case 4:
                    throw new l("In-app billing not available. Check your network connection!");
                case 5:
                    throw new l("Internal error in in-app billing (DEVELOPER_ERROR).");
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    throw new l("Error in in-app billing. Check your network connection!");
                case UserTouchAction.CLICK_KIND /* 7 */:
                    throw new l("Error in in-app billing (ITEM_ALREADY_OWNED).");
                case 8:
                    throw new l("Error in in-app billing (ITEM_NOT_OWNED).");
                case 9:
                    throw new l("Error in in-app billing (ITEM_UNAVAILABLE).");
                default:
                    throw new l("Internal error in in-app billing (unexpected response code).");
            }
        } catch (Throwable th) {
            if (gW) {
                iy.j3(th, 6033406895230395735L, null, pVar);
            }
            throw th;
        }
    }

    @ey(method = 6075892139574896723L)
    private void a8() {
        try {
            if (yS) {
                iy.gn(5252942092036428967L, this);
            }
            try {
                synchronized (this.Zo) {
                    boolean zSh = sh();
                    this.J0 = zSh;
                    if (!zSh) {
                        this.Ws = true;
                        this.Zo.notify();
                        ef("Google Play Store not installed.");
                        return;
                    }
                    this.FH = new e();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    synchronized (this.Zo) {
                        boolean z = !ServiceContainer.getContext().getPackageManager().queryIntentServices(intent, 0).isEmpty();
                        this.J8 = z;
                        if (!z) {
                            ef("Google Play Store IAB Service not found.");
                            this.Ws = true;
                            this.Zo.notifyAll();
                            return;
                        }
                        boolean zBindService = ServiceContainer.getMainActivity().bindService(intent, this.FH, 1);
                        synchronized (this.Zo) {
                            this.QX = zBindService;
                            if (!zBindService) {
                                ef("Google Play Store IAB Service bind request failed.");
                                this.Ws = true;
                                this.Zo.notifyAll();
                            } else {
                                ef("Google Play Store IAB bind requested.");
                                if (zBindService) {
                                    this.j6 = true;
                                }
                            }
                        }
                    }
                }
            } catch (SecurityException e2) {
                vJ(e2);
                synchronized (this.Zo) {
                    this.QX = false;
                    this.Ws = true;
                    this.Zo.notifyAll();
                }
            }
        } catch (Throwable th) {
            if (gW) {
                iy.aM(th, 5252942092036428967L, this);
            }
            throw th;
        }
    }

    @ey(method = -457916162944781349L)
    public static void aj(Activity activity, IntentSender intentSender) {
        try {
            if (yS) {
                iy.EQ(-204935957820400921L, null, activity, intentSender);
            }
            try {
                Intent intent = new Intent();
                Integer num = 0;
                int iIntValue = num.intValue();
                Integer num2 = 0;
                Integer num3 = 0;
                DW(activity, intentSender, 1194684, intent, iIntValue, num2.intValue(), num3.intValue());
            } catch (IntentSender.SendIntentException e2) {
                AppLog.v5(e2);
            }
        } catch (Throwable th) {
            if (gW) {
                iy.Mr(th, -204935957820400921L, null, activity, intentSender);
            }
            throw th;
        }
    }

    @ey(method = -2469744030748210331L)
    private void ca(Bundle bundle, Map<String, q> map) {
        try {
            if (yS) {
                iy.EQ(1143867415630128921L, this, bundle, map);
            }
            U2(p.DW(bundle.getInt("RESPONSE_CODE")));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("DETAILS_LIST");
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    AppLog.DW("SKU: " + next);
                    JSONObject jSONObject = new JSONObject(next);
                    String string = jSONObject.getString(AppMeasurement.Param.TYPE);
                    String string2 = jSONObject.getString("productId");
                    map.put(string2, new q(string, string2, jSONObject.getString("title"), jSONObject.getString("description"), jSONObject.getString("price"), jSONObject.getLong("price_amount_micros"), jSONObject.getString("price_currency_code")));
                }
            }
        } catch (Throwable th) {
            if (gW) {
                iy.Mr(th, 1143867415630128921L, this, bundle, map);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 635032294007951855L)
    public boolean ei(Bundle bundle) {
        try {
            if (yS) {
                iy.tp(463683680732136051L, this, bundle);
            }
            p pVarDW = p.DW(bundle.getInt("RESPONSE_CODE"));
            if (pVarDW != p.RESULT_OK) {
                ef("Response code for checking purchases: " + pVarDW);
                return false;
            }
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            ef("Response code for checking purchases: " + pVarDW + " - number of datas: " + stringArrayList.size());
            for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                I(stringArrayList.get(i2), stringArrayList2.get(i2), false);
            }
            return true;
        } catch (Throwable th) {
            if (gW) {
                iy.j3(th, 463683680732136051L, this, bundle);
            }
            throw th;
        }
    }

    private static /* synthetic */ Bundle j6(IInAppBillingService iInAppBillingService, int i2, String str, String str2, Bundle bundle) {
        Bundle bundleHy = iInAppBillingService.Hy(i2, str, str2, bundle);
        iy.yS(bundleHy, iInAppBillingService, i2, str, str2, bundle);
        return bundleHy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2457672110793249057L)
    public void lp(PendingIntent pendingIntent) {
        try {
            if (yS) {
                iy.tp(-2094093934171665653L, this, pendingIntent);
            }
            if (!(ServiceContainer.gn() instanceof HelpViewActivity)) {
                aj(ServiceContainer.gn(), pendingIntent.getIntentSender());
            } else {
                MainActivity.jO(ServiceContainer.gn(), pendingIntent.getIntentSender());
                ServiceContainer.gn().finish();
            }
        } catch (Throwable th) {
            if (gW) {
                iy.j3(th, -2094093934171665653L, this, pendingIntent);
            }
            throw th;
        }
    }

    @ey(method = 1610974502807090064L)
    private boolean nw() {
        try {
            if (yS) {
                iy.gn(-572431175934957360L, this);
            }
            return ServiceContainer.getMainActivity().checkCallingOrSelfPermission("com.android.vending.BILLING") == 0;
        } catch (Throwable th) {
            if (gW) {
                iy.aM(th, -572431175934957360L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -71526160713186004L)
    public IInAppBillingService rN() {
        IInAppBillingService iInAppBillingService;
        try {
            if (yS) {
                iy.gn(-4060222715975336508L, this);
            }
            synchronized (this.Zo) {
                if (!this.Ws) {
                    ef("Waiting for bound service");
                    this.Zo.wait();
                }
                iInAppBillingService = this.DW;
            }
            return iInAppBillingService;
        } catch (Throwable th) {
            if (gW) {
                iy.aM(th, -4060222715975336508L, this);
            }
            throw th;
        }
    }

    @ey(method = -986709367390305936L)
    private boolean sh() {
        try {
            if (yS) {
                iy.gn(110353781850626600L, this);
            }
            try {
                ServiceContainer.getContext().getPackageManager().getPackageInfo("com.android.vending", 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            if (gW) {
                iy.aM(th, 110353781850626600L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 632404738834480893L)
    public Map<String, q> vy(Set<String> set) {
        try {
            if (yS) {
                iy.tp(-54762605166196103L, this, set);
            }
            ArrayList<String> arrayList = new ArrayList<>(set);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            HashMap map = new HashMap();
            ca(j6(this.DW, 3, ServiceContainer.P8, "subs", bundle), map);
            ca(j6(this.DW, 3, ServiceContainer.P8, "inapp", bundle), map);
            if (map.size() == set.size()) {
                return map;
            }
            String str = "Internal error in in-app billing (SKU details not found - expected: " + set.size() + " actual: " + map.size() + ").";
            AppLog.FH(str);
            ef(str);
            throw new l("Internal error in in-app billing (SKU details not found).");
        } catch (Throwable th) {
            if (gW) {
                iy.j3(th, -54762605166196103L, this, set);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -4233526238053393163L)
    public void x9(String str) {
        try {
            if (yS) {
                iy.tp(-3304110982835764119L, this, str);
            }
            this.Hw.post(new j(this, str));
        } catch (Throwable th) {
            if (gW) {
                iy.j3(th, -3304110982835764119L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -2426941654448925152L)
    public void BT(Set<String> set, k kVar) {
        try {
            if (yS) {
                iy.EQ(535904650146848832L, this, set, kVar);
            }
            if (!er) {
                throw new IllegalStateException("getSkuDetailsFuture() future called without IN_APP_PURCHASE_ENABLED");
            }
            if (nw()) {
                this.v5.execute(new b(set, kVar));
            } else {
                kVar.j6("AIDE does not have in-app billing permission. Please enable it.");
            }
        } catch (Throwable th) {
            if (gW) {
                iy.Mr(th, 535904650146848832L, this, set, kVar);
            }
            throw th;
        }
    }

    @ey(method = -4277676331912146471L)
    public boolean KD(String str) {
        try {
            if (yS) {
                iy.tp(-7520948114353577667L, this, str);
            }
            return lg.contains(str);
        } catch (Throwable th) {
            if (gW) {
                iy.j3(th, -7520948114353577667L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -428321563321498483L)
    public void OW(String str, boolean z, String str2) {
        try {
            if (yS) {
                iy.we(-5864071886077811223L, this, str, new Boolean(z), str2);
            }
            this.XL = str2;
            this.v5.execute(new d(str, z));
        } catch (Throwable th) {
            if (gW) {
                iy.U2(th, -5864071886077811223L, this, str, new Boolean(z), str2);
            }
            throw th;
        }
    }

    @ey(method = 2359353707429815008L)
    public void SI() {
        try {
            if (yS) {
                iy.gn(-2491809622108353000L, this);
            }
            if (er && nw() && !ServiceContainer.ca()) {
                if (ServiceContainer.P8.equals("com.aide.ui") || ServiceContainer.P8.equals("com.aide.trainer.java") || ServiceContainer.P8.equals("com.aide.web")) {
                    try {
                        this.tp.set(com.aide.licensing.e.Hw(ServiceContainer.getMainActivity()));
                    } catch (Throwable th) {
                        vJ(th);
                    }
                    a8();
                }
            }
        } catch (Throwable th2) {
            if (gW) {
                iy.aM(th2, -2491809622108353000L, this);
            }
            throw th2;
        }
    }

    @ey(method = 5074270341558696091L)
    public boolean cb(String str) {
        try {
            if (yS) {
                iy.tp(-3642948639157560593L, this, str);
            }
            return U2.contains(str);
        } catch (Throwable th) {
            if (gW) {
                iy.j3(th, -3642948639157560593L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 533631201515351560L)
    public boolean cn(String str) {
        try {
            if (yS) {
                iy.tp(21322073244806048L, this, str);
            }
            return rN.contains(str);
        } catch (Throwable th) {
            if (gW) {
                iy.j3(th, 21322073244806048L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -630846455256499041L)
    public boolean dx(String str) {
        try {
            if (yS) {
                iy.tp(-3938840390312092837L, this, str);
            }
            return j3.contains(str);
        } catch (Throwable th) {
            if (gW) {
                iy.j3(th, -3938840390312092837L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -6804247546722157452L)
    public void ef(String str) {
        try {
            if (yS) {
                iy.tp(-4457759795981063524L, this, str);
            }
            synchronized (this.we) {
                if (this.EQ.isEmpty() || !str.equals(this.EQ.getLast())) {
                    this.EQ.addLast(str);
                    while (this.EQ.size() > 2000) {
                        this.EQ.removeFirst();
                    }
                }
            }
        } catch (Throwable th) {
            if (gW) {
                iy.j3(th, -4457759795981063524L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 432191981076215695L)
    public String er() {
        try {
            if (yS) {
                iy.gn(-6662526828824256837L, this);
            }
            return com.aide.ui.n.tp() ? "aide_prime_monthly_0500_7days_trial" : "aide_prime_monthly_0500";
        } catch (Throwable th) {
            if (gW) {
                iy.aM(th, -6662526828824256837L, this);
            }
            throw th;
        }
    }

    @ey(method = 785577677148538461L)
    public void g3(Intent intent) {
        try {
            if (yS) {
                iy.tp(101435210940625521L, this, intent);
            }
            Context context = ServiceContainer.getContext();
            n nVarMz = Mz(intent);
            if (nVarMz.j6 == o.OK_PURCHASED) {
                if (!sG(nVarMz.DW.DW) && !dx(nVarMz.DW.DW)) {
                    if (cb(nVarMz.DW.DW)) {
                        if (this.XL != null) {
                            FireBaseLogEvent.tp("PremiumInAppConvertedWithLinkID:" + this.XL);
                        }
                        if (ServiceContainer.getMainActivity().Sf() >= 2530) {
                            c0.gn(context, "PremiumInAppAfterShop", ServiceContainer.getLicenseService().tp());
                            c0.gn(context, "PremiumInAppAfterInstall", ServiceContainer.getMainActivity().ef());
                        }
                        c0.Zo(context, "PremiumInApp");
                        Sf(nVarMz, this.aM);
                        return;
                    }
                    if (ro(nVarMz.DW.DW)) {
                        if (this.XL != null) {
                            FireBaseLogEvent.tp("DesignerInAppConvertedWithLinkID:" + this.XL);
                        }
                        if (ServiceContainer.getMainActivity().Sf() >= 2530) {
                            c0.gn(context, "DesignerInAppAfterShop", ServiceContainer.getLicenseService().tp());
                            c0.gn(context, "DesignerInAppAfterInstall", ServiceContainer.getMainActivity().ef());
                        }
                        c0.Zo(context, "DesignerInApp");
                        Sf(nVarMz, this.aM);
                        return;
                    }
                    if (cn(nVarMz.DW.DW)) {
                        if (this.XL != null) {
                            FireBaseLogEvent.tp("DeveloperKeyInAppConvertedWithLinkID:" + this.XL);
                        }
                        if (ServiceContainer.getMainActivity().Sf() >= 2530) {
                            c0.gn(context, "DeveloperKeyInAppAfterShop", ServiceContainer.getLicenseService().tp());
                            c0.gn(context, "DeveloperKeyInAppAfterInstall", ServiceContainer.getMainActivity().ef());
                        }
                        c0.Zo(context, "DeveloperKeyInApp");
                        Sf(nVarMz, this.aM);
                        return;
                    }
                    return;
                }
                if (this.XL != null) {
                    FireBaseLogEvent.tp("PrimeConvertedWithLinkID:" + this.XL);
                    if (ServiceContainer.getLicenseService().aM()) {
                        FireBaseLogEvent.tp((ServiceContainer.getLicenseService().j3() ? "PrimeYearlyConvertedWithLinkID:" : "PrimeMonthlyConvertedWithLinkID:") + this.XL);
                    }
                }
                if (ServiceContainer.getMainActivity().Sf() >= 2530) {
                    c0.gn(context, "PrimeAfterShop", ServiceContainer.getLicenseService().tp());
                    c0.gn(context, "PrimeAfterInstall", ServiceContainer.getMainActivity().ef());
                }
                c0.Zo(context, "Prime");
                if (ServiceContainer.getLicenseService().aM()) {
                    c0.Zo(context, ServiceContainer.getLicenseService().j3() ? "PrimeYearly" : "PrimeMonthly");
                    Sf(nVarMz, this.aM);
                }
            }
        } catch (Throwable th) {
            if (gW) {
                iy.j3(th, 101435210940625521L, this, intent);
            }
            throw th;
        }
    }

    @ey(method = -6087364366649204436L)
    public String gW() {
        try {
            if (yS) {
                iy.gn(-4946746216313508684L, this);
            }
            return !com.aide.ui.n.we() ? com.aide.ui.n.EQ() ? "aide_prime_yearly_2400" : "aide_prime_yearly_3000" : "aide_prime_yearly_2400";
        } catch (Throwable th) {
            if (gW) {
                iy.aM(th, -4946746216313508684L, this);
            }
            throw th;
        }
    }

    @ey(method = -1945281507861181983L)
    public void j3() {
        try {
            if (yS) {
                iy.gn(-701440036018393875L, this);
            }
            if (er && nw()) {
                synchronized (this.Zo) {
                    if (this.gn) {
                        return;
                    }
                    this.gn = true;
                    this.v5.execute(new c());
                }
            }
        } catch (Throwable th) {
            if (gW) {
                iy.aM(th, -701440036018393875L, this);
            }
            throw th;
        }
    }

    @ey(method = 8187971074074118368L)
    public String lg() {
        try {
            if (yS) {
                iy.gn(2421193366939769400L, this);
            }
            return com.aide.ui.n.u7() ? "aide_developer_key_upgrade_1000" : com.aide.ui.n.gn() ? "aide_developer_key_1000" : "aide_developer_key_1500";
        } catch (Throwable th) {
            if (gW) {
                iy.aM(th, 2421193366939769400L, this);
            }
            throw th;
        }
    }

    @ey(method = 1943298664463500275L)
    public boolean ro(String str) {
        try {
            if (yS) {
                iy.tp(-1687459728136104081L, this, str);
            }
            return a8.contains(str);
        } catch (Throwable th) {
            if (gW) {
                iy.j3(th, -1687459728136104081L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1666301905836355644L)
    public boolean sG(String str) {
        try {
            if (yS) {
                iy.tp(1617649483708404300L, this, str);
            }
            return Mr.contains(str);
        } catch (Throwable th) {
            if (gW) {
                iy.j3(th, 1617649483708404300L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2858454603357680160L)
    public void sy() {
        try {
            if (yS) {
                iy.gn(42542637077771376L, this);
            }
            this.u7.gn();
            if (this.FH != null) {
                if (this.j6) {
                    try {
                        ServiceContainer.getMainActivity().unbindService(this.FH);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                synchronized (this.Zo) {
                    this.DW = null;
                }
                this.j6 = false;
                this.FH = null;
            }
        } catch (Throwable th) {
            if (gW) {
                iy.aM(th, 42542637077771376L, this);
            }
            throw th;
        }
    }

    @ey(method = 242782116147144680L)
    public void vJ(Throwable th) {
        try {
            if (yS) {
                iy.tp(459104997430136192L, this, th);
            }
            AppLog.v5(th);
            synchronized (this.we) {
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                String string = stringWriter.toString();
                if (this.EQ.isEmpty() || !string.equals(this.EQ.getLast())) {
                    this.EQ.addLast(string);
                    while (this.EQ.size() > 2000) {
                        this.EQ.removeFirst();
                    }
                }
            }
        } catch (Throwable th2) {
            if (gW) {
                iy.j3(th2, 459104997430136192L, this, th);
            }
            throw th2;
        }
    }

    @ey(method = -994791985428531664L)
    public String yS() {
        try {
            if (yS) {
                iy.gn(-538385980333141280L, this);
            }
            return !com.aide.ui.n.we() ? com.aide.ui.n.EQ() ? "aide_prime_yearly_2400_monthly_reference" : "aide_prime_yearly_3000_monthly_reference" : "aide_prime_yearly_2400_monthly_reference";
        } catch (Throwable th) {
            if (gW) {
                iy.aM(th, -538385980333141280L, this);
            }
            throw th;
        }
    }
}
