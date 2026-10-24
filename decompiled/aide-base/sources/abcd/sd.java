package abcd;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import com.aide.licensing.IAideLicenseResultListener;
import com.aide.licensing.IAideLicensingService;
import com.aide.licensing.c;
import com.aide.ui.ServiceContainer;

@cy(clazz = -6228992669085397497L, container = -6228992669085397497L, user = true)
/* loaded from: classes.dex */
public abstract class sd {

    @gy
    private static /* synthetic */ boolean tp;

    @fy
    private static /* synthetic */ boolean u7;

    @dy(field = 278290876105144799L)
    private ServiceConnection DW;

    @dy(field = 800758648115464284L)
    private boolean FH;

    @dy(field = -5317556928652143645L)
    private c Hw;

    @dy(field = 742411422137571605L)
    private int VH;

    @dy(field = -1195671941431952425L)
    private String Zo;

    @dy(field = -404762652007184016L)
    private String gn;

    @dy(field = 6274737380717667505L)
    private IAideLicensingService j6;

    @dy(field = 861711742328130144L)
    private String v5;

    @cy(clazz = -49858147330989840L, container = -6228992669085397497L, user = true)
    class a implements ServiceConnection {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -2676117238143326592L)
        public a() {
        }

        @Override // android.content.ServiceConnection
        @ey(method = -197403028489595000L)
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                if (mb) {
                    iy.EQ(-5478669003169519633L, this, componentName, iBinder);
                }
                sd.this.VH("Licensing service connected.");
                sd.this.j6 = IAideLicensingService.Sub.asInterface(iBinder);
                sd.this.FH = false;
                sd.this.J8();
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, -5478669003169519633L, this, componentName, iBinder);
                }
                throw th;
            }
        }

        @Override // android.content.ServiceConnection
        @ey(method = 4565599093160098000L)
        public void onServiceDisconnected(ComponentName componentName) {
            try {
                if (mb) {
                    iy.tp(-616793488481455233L, this, componentName);
                }
                j8.v5("Licensing service unexpectedly disconnected.");
                sd.this.FH = false;
                sd.this.j6 = null;
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -616793488481455233L, this, componentName);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -49864698265798201L, container = -6228992669085397497L, user = true)
    static /* synthetic */ class b {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 211710135943990332L)
        static final /* synthetic */ int[] j6;

        static {
            try {
                iy.Zo(b.class);
                if (DW) {
                    iy.gn(2886874101731328376L, null);
                }
                int[] iArr = new int[c.a.values().length];
                j6 = iArr;
                try {
                    iArr[c.a.LICENSED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    j6[c.a.IN_GRACE_PERIOD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    j6[c.a.OVER_GRACE_PERIOD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    j6[c.a.NOT_LICENSED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    j6[c.a.TEMPORARY_ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 2886874101731328376L, null);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 31530143936738400L, container = 31530143936738400L, user = true)
    private class c extends IAideLicenseResultListener.Sub {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = 2103573174531061585L)
        @hy
        final /* synthetic */ sd jw;

        @cy(clazz = -2788257145366999605L, container = 31530143936738400L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 6250357773479714531L)
            public a() {
            }

            @Override // java.lang.Runnable
            @ey(method = -813684774482221756L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-5944773848613687327L, this);
                    }
                    c.this.jw.Ws("KEY_PACKAGE_REPLIED_NOT_VALID");
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -5944773848613687327L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -2788343840011214540L, container = 31530143936738400L, user = true)
        class b implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = -2197511137578892247L)
            final /* synthetic */ String WB;

            @dy(field = -3468141019663688627L)
            final /* synthetic */ String mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 1177642158250509555L)
            public b(String str, String str2) {
                this.WB = str;
                this.mb = str2;
            }

            @Override // java.lang.Runnable
            @ey(method = -1562031772049535380L)
            public void run() {
                try {
                    if (fY) {
                        iy.gn(-3962200575229746960L, this);
                    }
                    c.this.jw.j3(this.WB, this.mb);
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, -3962200575229746960L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(c.class);
        }

        @ey(method = 76885377396235581L)
        private c(sd sdVar) {
            try {
                if (fY) {
                    iy.tp(-2260724432237922420L, null, sdVar);
                }
                this.jw = sdVar;
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, -2260724432237922420L, null, sdVar);
                }
                throw th;
            }
        }

        @Override // com.aide.licensing.IAideLicenseResultListener
        @ey(method = -79683348119109457L)
        public void Ir(String str, String str2) {
            try {
                if (fY) {
                    iy.EQ(-2708104841865264099L, this, str, str2);
                }
                this.jw.VH("licenseVerified: " + str);
                if (Binder.getCallingUid() == Process.myUid()) {
                    ServiceContainer.aj(new b(str, str2));
                    return;
                }
                this.jw.u7("UID mismatch - my uid: " + Process.myUid() + " calling uid: " + Binder.getCallingUid());
            } catch (Throwable th) {
                if (qp) {
                    iy.Mr(th, -2708104841865264099L, this, str, str2);
                }
                throw th;
            }
        }

        @Override // com.aide.licensing.IAideLicenseResultListener
        @ey(method = -2243428915497216240L)
        public void Sc() {
            try {
                if (fY) {
                    iy.gn(-4562683260330864240L, this);
                }
                this.jw.VH("licenseNotVerified");
                if (Binder.getCallingUid() == Process.myUid()) {
                    ServiceContainer.aj(new a());
                    return;
                }
                this.jw.u7("UID mismatch - my uid: " + Process.myUid() + " calling uid: " + Binder.getCallingUid());
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -4562683260330864240L, this);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 7100831413644844455L)
        public /* synthetic */ c(sd sdVar, a aVar) {
            this(sdVar);
            try {
                if (fY) {
                    iy.EQ(3045516327804306288L, null, sdVar, aVar);
                }
            } catch (Throwable th) {
                if (qp) {
                    iy.Mr(th, 3045516327804306288L, null, sdVar, aVar);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(sd.class);
    }

    @ey(method = 2802565038271964160L)
    public sd(String str, String str2, int i, String str3) {
        try {
            if (u7) {
                iy.J0(-3038348709593117004L, null, str, str2, new Integer(i), str3);
            }
            this.Hw = new c(this, null);
            this.v5 = str;
            this.Zo = str2;
            this.VH = i;
            this.gn = str3;
        } catch (Throwable th) {
            if (tp) {
                iy.a8(th, -3038348709593117004L, null, str, str2, new Integer(i), str3);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 4602333303917591165L)
    public void J8() {
        try {
            if (u7) {
                iy.gn(7356759073356652992L, this);
            }
            try {
                VH("Requesting license check");
                this.j6.oh(this.Hw);
            } catch (RemoteException e) {
                gn(e);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 7356759073356652992L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1370846427655774193L)
    public void VH(String str) {
        try {
            if (u7) {
                iy.tp(-5382733115908416264L, this, str);
            }
            j8.j6("(" + this.v5 + ") " + str);
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -5382733115908416264L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -2846317221657453600L)
    private void gn(Exception exc) {
        try {
            if (u7) {
                iy.tp(-6818064566062512009L, this, exc);
            }
            j8.FH("(" + this.v5 + ")", exc);
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -6818064566062512009L, this, exc);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -5998873921622435375L)
    public void j3(String str, String str2) {
        try {
            if (u7) {
                iy.EQ(-5057723731334384124L, this, str, str2);
            }
            c.a aVarV5 = com.aide.licensing.c.v5(ServiceContainer.getContext(), -1L, -1, -1, this.v5, str, str2, this.Zo);
            int i = b.j6[aVarV5.ordinal()];
            if (i == 1 || i == 2) {
                XL(com.aide.licensing.c.DW(str, str2, this.Zo).u7);
                return;
            }
            if (i == 3) {
                Ws("OVER_GRACE_PERIOD");
                return;
            }
            if (i == 4) {
                Ws("NOT_LICENSED");
            } else {
                if (i == 5) {
                    Ws("TEMPORARY_ERROR");
                    return;
                }
                throw new RuntimeException("Unknown LicenseVerificationResult " + aVarV5);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, -5057723731334384124L, this, str, str2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 6340873389908543052L)
    public void u7(String str) {
        try {
            if (u7) {
                iy.tp(2168766339546846501L, this, str);
            }
            j8.DW("(" + this.v5 + ") " + str);
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 2168766339546846501L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -2420763878479367811L)
    private void we() {
        try {
            if (u7) {
                iy.gn(7596241288596834744L, this);
            }
            if (this.j6 != null) {
                J8();
                return;
            }
            if (this.FH) {
                VH("Licensing service bind already pending");
                return;
            }
            this.DW = new a();
            VH("Binding to " + IAideLicensingService.class.getName());
            boolean zBindService = false;
            try {
                Intent intent = new Intent(this.gn);
                intent.setPackage(this.v5);
                zBindService = ServiceContainer.getContext().bindService(intent, this.DW, 1);
            } catch (Exception unused) {
            }
            if (zBindService) {
                this.FH = zBindService;
            } else {
                VH("Licensing service could not be bound");
            }
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 7596241288596834744L, this);
            }
            throw th;
        }
    }

    @ey(method = -943742871993464199L)
    public void EQ() {
        try {
            if (u7) {
                iy.gn(1939618777909265128L, this);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 1939618777909265128L, this);
            }
            throw th;
        }
    }

    @ey(method = -6154175389626212328L)
    public boolean J0() {
        try {
            if (u7) {
                iy.gn(6360085930485499135L, this);
            }
            return ServiceContainer.getContext().getPackageManager().checkSignatures(this.v5, "com.aide.ui") == 0;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 6360085930485499135L, this);
            }
            throw th;
        }
    }

    @ey(method = 2481782888412289872L)
    public abstract void QX();

    @ey(method = 5533657165943831231L)
    public abstract void Ws(String str);

    @ey(method = 2440755863382644337L)
    public abstract void XL(long j);

    @ey(method = -3381780552414550461L)
    public void aM() {
        try {
            if (u7) {
                iy.gn(-2677966163372558652L, this);
            }
            if (this.j6 != null) {
                VH("Unbinding license service");
                ServiceContainer.getContext().unbindService(this.DW);
                this.DW = null;
                this.FH = false;
            }
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -2677966163372558652L, this);
            }
            throw th;
        }
    }

    @ey(method = 24139777242466205L)
    public void tp() {
        try {
            if (u7) {
                iy.gn(-170208189781830628L, this);
            }
            if (ServiceContainer.P8.equals("com.aide.phonegap")) {
                return;
            }
            PackageManager packageManager = ServiceContainer.getContext().getPackageManager();
            boolean zJ0 = J0();
            boolean z = false;
            if (zJ0) {
                try {
                    if (packageManager.getPackageInfo(this.v5, 0).versionCode >= this.VH) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            if (zJ0 && z) {
                we();
            } else {
                if (!zJ0 || z) {
                    return;
                }
                QX();
            }
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -170208189781830628L, this);
            }
            throw th;
        }
    }
}
