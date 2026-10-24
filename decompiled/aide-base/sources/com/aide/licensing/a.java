package com.aide.licensing;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import abcd.j8;
import abcd.k8;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import com.aide.licensing.c;
import com.android.vending.licensing.ILicenseResultListener;
import com.android.vending.licensing.ILicensingService;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;

@cy(clazz = 2773153765153353776L, container = 2773153765153353776L, user = true)
/* loaded from: classes.dex */
public class a {

    @gy
    private static /* synthetic */ boolean EQ;

    @fy
    private static /* synthetic */ boolean tp;

    @dy(field = 496542026622531780L)
    private ServiceConnection DW;

    @dy(field = 345655218644649489L)
    private boolean FH;

    @dy(field = -1505747536030087413L)
    private long Hw;

    @dy(field = -5648668544183493780L)
    private boolean VH;

    @dy(field = 1828798445655587952L)
    private Context Zo;

    @dy(field = 2762961747722253723L)
    private Handler gn;

    @dy(field = -2512952542514638600L)
    private ILicensingService j6;

    @dy(field = -2058651584078755015L)
    private IAideLicenseResultListener u7;

    @dy(field = 4206743962334186687L)
    private long v5;

    @cy(clazz = 4870152255606488055L, container = 2773153765153353776L, user = true)
    /* renamed from: com.aide.licensing.a$a, reason: collision with other inner class name */
    class ServiceConnectionC0049a implements ServiceConnection {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(ServiceConnectionC0049a.class);
        }

        @ey(method = -172335604725293215L)
        ServiceConnectionC0049a() {
        }

        @Override // android.content.ServiceConnection
        @ey(method = -1265895324247227440L)
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                if (mb) {
                    iy.EQ(-441918266366148105L, this, componentName, iBinder);
                }
                j8.j6("Licensing service connected.");
                a.this.j6 = ILicensingService.Sub.asInterface(iBinder);
                a.this.FH = false;
                a.this.J8();
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, -441918266366148105L, this, componentName, iBinder);
                }
                throw th;
            }
        }

        @Override // android.content.ServiceConnection
        @ey(method = -709114751916616728L)
        public void onServiceDisconnected(ComponentName componentName) {
            try {
                if (mb) {
                    iy.tp(507656950902017423L, this, componentName);
                }
                j8.v5("Licensing service unexpectedly disconnected.");
                a.this.FH = false;
                a.this.j6 = null;
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, 507656950902017423L, this, componentName);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 4870235081156359340L, container = 2773153765153353776L, user = true)
    static /* synthetic */ class b {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -8278203013139024511L)
        static final /* synthetic */ int[] j6;

        static {
            try {
                iy.Zo(b.class);
                if (DW) {
                    iy.gn(2380510656535591656L, null);
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
                    iy.aM(th, 2380510656535591656L, null);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -90332927685326755L, container = -90332927685326755L, user = true)
    private class c extends ILicenseResultListener.Sub {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = 599384694177334752L)
        @hy
        final /* synthetic */ a fY;

        @dy(field = -439940160593241037L)
        private long jw;

        @cy(clazz = 684254400747100216L, container = -90332927685326755L, user = true)
        /* renamed from: com.aide.licensing.a$c$a, reason: collision with other inner class name */
        class RunnableC0050a implements Runnable {

            @gy
            private static /* synthetic */ boolean k2;

            @fy
            private static /* synthetic */ boolean qp;

            @dy(field = 1184499568766927840L)
            final /* synthetic */ int WB;

            @dy(field = 719406473889767760L)
            final /* synthetic */ String jw;

            @dy(field = -1650081151788705140L)
            final /* synthetic */ String mb;

            static {
                iy.Zo(RunnableC0050a.class);
            }

            @ey(method = -4149446484631543296L)
            RunnableC0050a(int i, String str, String str2) {
                this.WB = i;
                this.mb = str;
                this.jw = str2;
            }

            @Override // java.lang.Runnable
            @ey(method = -944092842990203347L)
            public void run() {
                try {
                    if (qp) {
                        iy.gn(4328069808734210520L, this);
                    }
                    c.this.fY.v5 = 0L;
                    c.this.fY.Mr(c.this.jw, this.WB, this.mb, this.jw);
                } catch (Throwable th) {
                    if (k2) {
                        iy.aM(th, 4328069808734210520L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(c.class);
        }

        @ey(method = 217334903144526112L)
        public c(a aVar, long j) {
            try {
                if (qp) {
                    iy.EQ(4601674493633101729L, null, aVar, new Long(j));
                }
                this.fY = aVar;
                this.jw = j;
            } catch (Throwable th) {
                if (k2) {
                    iy.Mr(th, 4601674493633101729L, null, aVar, new Long(j));
                }
                throw th;
            }
        }

        @Override // com.android.vending.licensing.ILicenseResultListener
        @ey(method = 1240417823567612072L)
        public void Bn(int i, String str, String str2) {
            try {
                if (qp) {
                    iy.we(-177146904446841200L, this, new Integer(i), str, str2);
                }
                this.fY.gn.post(new RunnableC0050a(i, str, str2));
            } catch (Throwable th) {
                if (k2) {
                    iy.U2(th, -177146904446841200L, this, new Integer(i), str, str2);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(a.class);
    }

    @ey(method = -1529756011201766400L)
    public a() {
        try {
            if (tp) {
                iy.gn(1688200213923072072L, null);
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 1688200213923072072L, null);
            }
            throw th;
        }
    }

    @ey(method = 41736832369318944L)
    private String[] J0() {
        try {
            if (tp) {
                iy.gn(5306356262044124480L, this);
            }
            File fileU7 = u7();
            if (!fileU7.isFile()) {
                return null;
            }
            try {
                FileReader fileReader = new FileReader(fileU7);
                StringWriter stringWriter = new StringWriter();
                k8.j6(fileReader, stringWriter);
                return stringWriter.toString().split("\u0000");
            } catch (IOException e) {
                j8.Hw(e);
                return null;
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 5306356262044124480L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -7862113735668787868L)
    public void J8() {
        try {
            if (tp) {
                iy.gn(-3785385826124745108L, this);
            }
            if (System.currentTimeMillis() < this.v5 + 60000) {
                j8.j6("License check responsed pending - throttled");
                return;
            }
            try {
                j8.j6("Requesting license check");
                long jFH = e.FH(this.Zo);
                this.j6.Bu(jFH, tp(), new c(this, jFH));
                this.v5 = System.currentTimeMillis();
            } catch (RemoteException e) {
                j8.Hw(e);
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -3785385826124745108L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 715154442785351339L)
    public void Mr(long j, int i, String str, String str2) {
        try {
            if (tp) {
                iy.J0(440777614008551735L, this, new Long(j), new Integer(i), str, str2);
            }
            aM(j, i, str, str2, false);
        } catch (Throwable th) {
            if (EQ) {
                iy.a8(th, 440777614008551735L, this, new Long(j), new Integer(i), str, str2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @abcd.ey(method = 532025155659076464L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void U2(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            boolean r0 = com.aide.licensing.a.tp     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto Lc
            r0 = 3833499257148565160(0x353353437d1066a8, double:2.0176500906329357E-52)
            abcd.iy.EQ(r0, r8, r9, r10)     // Catch: java.lang.Throwable -> L4c
        Lc:
            r0 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L30
            java.io.File r2 = r8.u7()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L30
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L30
            r1.write(r9)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L40
            r0 = 0
            r1.write(r0)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L40
            r1.write(r10)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L40
            r1.close()     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L4c
            goto L3f
        L24:
            r0 = move-exception
        L25:
            abcd.j8.Hw(r0)     // Catch: java.lang.Throwable -> L4c
            goto L3f
        L29:
            r0 = move-exception
            goto L34
        L2b:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L41
        L30:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L34:
            abcd.j8.Hw(r0)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L3f
            r1.close()     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L4c
            goto L3f
        L3d:
            r0 = move-exception
            goto L25
        L3f:
            return
        L40:
            r0 = move-exception
        L41:
            if (r1 == 0) goto L4b
            r1.close()     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L4c
            goto L4b
        L47:
            r1 = move-exception
            abcd.j8.Hw(r1)     // Catch: java.lang.Throwable -> L4c
        L4b:
            throw r0     // Catch: java.lang.Throwable -> L4c
        L4c:
            r0 = move-exception
            boolean r1 = com.aide.licensing.a.EQ
            if (r1 == 0) goto L5d
            r2 = 3833499257148565160(0x353353437d1066a8, double:2.0176500906329357E-52)
            r1 = r0
            r4 = r8
            r5 = r9
            r6 = r10
            abcd.iy.Mr(r1, r2, r4, r5, r6)
        L5d:
            goto L5f
        L5e:
            throw r0
        L5f:
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.licensing.a.U2(java.lang.String, java.lang.String):void");
    }

    @ey(method = -693377464180282975L)
    private void XL() {
        try {
            if (tp) {
                iy.gn(-638749578083613499L, this);
            }
            j8.j6("Stopping LicenseUpdateService");
            this.Zo.stopService(new Intent(this.Zo, (Class<?>) LicenseUpdateService.class));
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -638749578083613499L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ey(method = 2213268228625464729L)
    private c.a aM(long j, int i, String str, String str2, boolean z) throws Throwable {
        Object[] objArr;
        int i2;
        Context context;
        String strTp;
        String strGn;
        int i3 = i;
        try {
            if (tp) {
                iy.J8(181994932081715397L, this, new Long(j), new Integer(i3), str, str2, new Boolean(z));
            }
            int i4 = -1;
            try {
                try {
                    try {
                        PackageInfo packageInfo = this.Zo.getPackageManager().getPackageInfo(this.Zo.getPackageName(), 0);
                        if (!z) {
                            i4 = packageInfo.versionCode;
                        }
                        i2 = i4;
                    } catch (PackageManager.NameNotFoundException e) {
                        j8.Hw(e);
                        i2 = -1;
                    }
                    context = this.Zo;
                    strTp = tp();
                    strGn = gn();
                    objArr = z ? 1 : 0;
                } catch (Throwable th) {
                    th = th;
                    objArr = z ? 1 : 0;
                    if (objArr == false && this.VH) {
                        XL();
                    }
                    throw th;
                }
                try {
                    c.a aVarV5 = com.aide.licensing.c.v5(context, j, i, i2, strTp, str, str2, strGn);
                    int i5 = b.j6[aVarV5.ordinal()];
                    boolean z2 = true;
                    if (i5 == 1 || i5 == 2 || i5 == 3) {
                        LicenseUpdateAlarmReceiver.j6(this.Zo);
                        this.Hw = com.aide.licensing.c.DW(str, str2, gn()).gn;
                        if (objArr == false && aVarV5 == c.a.LICENSED) {
                            U2(str, str2);
                        }
                        if (aVarV5 != c.a.LICENSED && aVarV5 != c.a.IN_GRACE_PERIOD) {
                            z2 = false;
                        }
                        if (!this.VH && this.u7 != null) {
                            try {
                                if (z2) {
                                    this.u7.Ir(str, str2);
                                } else {
                                    this.u7.Sc();
                                }
                            } catch (RemoteException e2) {
                                j8.Hw(e2);
                            }
                        }
                        LicenseUpdateAlarmReceiver.j6(this.Zo);
                    } else if (i5 == 4) {
                        if (!this.VH && this.u7 != null) {
                            try {
                                this.u7.Sc();
                            } catch (RemoteException e3) {
                                j8.Hw(e3);
                            }
                        }
                        this.Hw = System.currentTimeMillis() + 3600000;
                    } else if (i5 != 5) {
                        if (!this.VH && this.u7 != null) {
                            try {
                                this.u7.Sc();
                            } catch (RemoteException e4) {
                                j8.Hw(e4);
                            }
                        }
                        this.Hw = System.currentTimeMillis() + 3600000;
                        throw new RuntimeException("Unknown LicenseVerificationResult " + aVarV5);
                    }
                    if (objArr == false && this.VH) {
                        XL();
                    }
                    return aVarV5;
                } catch (Throwable th2) {
                    th = th2;
                    if (objArr == false) {
                        XL();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (EQ) {
                    iy.lg(th, 181994932081715397L, this, new Long(j), new Integer(i), str, str2, new Boolean((boolean) i3));
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            i3 = z ? 1 : 0;
        }
    }

    @ey(method = 4356939747947333044L)
    private String gn() {
        try {
            if (tp) {
                iy.gn(-7163474981163740260L, this);
            }
            return tp().equals("com.aide.premium.key") ? "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkjXTkIvABlLJgyvluBm4h4Ytw87BbBrSRXohMVMvk0Eq2pYJKT1jYfC1W65/YY5GcFYwMiaemVlpH40h/h+rkm+GYYq04awtN8zv35+HymbrW6ztGgNv7gF7ksAOOb8swqQwlx6uzfZWzbny7r9kkKURlXWmpkcKpWUjfoQ1MIRFxuXoJ2owTjvdkezI2hjCxC+NJ57QCG8tBoWJo5jscDRylHuaXBGVX7fJx7NsWzlk9xTXUFE7F8J5OaPRpgCNwo+xC0pXSoA/yCv1dOy4v2tPr9L9rfB95nrTwRs1ob44LOY3UqYgVMC1wpy+nxU6UGch8g8/DfHXfaefBcsbfwIDAQAB" : tp().equals("com.aide.java.premium.key") ? "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAn+LHwdRGxOPUMAOl1xlpO/jK/2cqCBxkbIlP0fjvubrkNhj+TdoFzXAPEVJQDmBhRdgfOW7T1JyNDKjQYHqvsqxecl5DSxy+e2c3do2+OmtXDgsCZnwsPoQKZlXqYmr2m7oohe+ogGQ6dvK5ToyLEHtJu6zBs4HNrHEDJAZz4+eG8UydfPJut0VaBxFhLTwdInzILO27JcabVjNWSbMj/3ClErZjcaM9wBhPaftBFpyQWBiIVL5dULHspqlXsiVljpIvz1UTwkHwE+hqJPhPGLBIe6xqNPyv16IOssFskia97yekprSeoMaP0xzc/c7KT2sqsVuCUJsm41yDbqvIDwIDAQAB" : tp().equals("com.aide.designer") ? "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAscoEgrFdBkxPcWpFbDQhJaTdZ92LV4sGN7NdUmkp1OIL9m9vO8cYFRU2ZCpHEQ+gilfA2T37855hqegNJfv3Uv/Rh9gZYy+cEGyqEnZyjZ0eYXEMcRmuvLNCrkFpg8xlzRpAvwMB7Tseez5GSYuwefuSle5OBLYrKYxZ14qIiHBwYrS338+v0jIav07YAlwxqkLIEWikNN0lI7ZuJlhcgIiwCJCDT9WtHaU8GgOGYh4cTLnuNAo5FOsSNnEmSmdc4jRyWCPSSETMs+fbEy3BsDKpaO4I2b/VO0/GVmyI9jkYJgkmx/33gYKSTRw9BZR3yy7Vtnq64/afnSoMYqzkDQIDAQAB" : "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAh9PowqySSG6WBaQx3i5y+3vjHUlva+HzWV7ZlYCkMdY5rHxp48M566VZjQVPV9xF0a47f0n0kdECfNGcLvLtQdB6rhk1xW6ouQG+uCiLmjLomLVZbaHPS7kDDP0ETU7SpVksPfPFlHCNLgZ/68HQzWMv7WmQ5Y1+9x3QQ4EfC3gsQdftsNyjSr7GZ7oR3dMDPyMkjNa5tHi4ZzSEHJQyutD7ezURXAsmyEvFUphp871vKCHNrNA+NHt2KMptZdRuCpip6yr6yyD1uFGWZ7XDEtu9Gtt93dWlC6PyecA21LHbGGbv6M9T5WkyqYRyorDKxdfOXIYuuW2I5PdmiE//+wIDAQAB";
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -7163474981163740260L, this);
            }
            throw th;
        }
    }

    @ey(method = 1260346338860274744L)
    private c.a j3() {
        try {
            if (tp) {
                iy.gn(1917750026386113920L, this);
            }
            String[] strArrJ0 = J0();
            if (strArrJ0 != null && strArrJ0.length == 2) {
                return aM(-1L, -1, strArrJ0[0], strArrJ0[1], true);
            }
            return c.a.NOT_LICENSED;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 1917750026386113920L, this);
            }
            throw th;
        }
    }

    @ey(method = -2934235875277803685L)
    private String tp() {
        try {
            if (tp) {
                iy.gn(-1806130113672571385L, this);
            }
            return this.Zo.getApplicationContext().getPackageName();
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -1806130113672571385L, this);
            }
            throw th;
        }
    }

    @ey(method = -5158803844777835567L)
    private File u7() {
        try {
            if (tp) {
                iy.gn(-3850333796794209811L, this);
            }
            return new File(this.Zo.getFilesDir(), "license.txt");
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -3850333796794209811L, this);
            }
            throw th;
        }
    }

    @ey(method = -5675907746816462440L)
    public void EQ(Context context, boolean z) {
        try {
            if (tp) {
                iy.EQ(2471490827726034832L, this, context, new Boolean(z));
            }
            this.Zo = context;
            this.gn = new Handler();
            this.VH = z;
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, 2471490827726034832L, this, context, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -585410363919906864L)
    public void QX() {
        try {
            if (tp) {
                iy.gn(-2810366303274470976L, this);
            }
            if (this.j6 != null) {
                j8.j6("License service shutdown");
                this.Zo.unbindService(this.DW);
                this.DW = null;
                this.u7 = null;
                this.FH = false;
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -2810366303274470976L, this);
            }
            throw th;
        }
    }

    @ey(method = 3503918978576293941L)
    public boolean VH() {
        try {
            if (tp) {
                iy.gn(-6796593317997719007L, this);
            }
            return u7().isFile();
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -6796593317997719007L, this);
            }
            throw th;
        }
    }

    @ey(method = 1066088650107584261L)
    public void Ws() {
        try {
            if (tp) {
                iy.gn(272400898447333665L, this);
            }
            c.a aVarJ3 = j3();
            boolean z = true;
            if ((aVarJ3 == c.a.IN_GRACE_PERIOD || aVarJ3 == c.a.OVER_GRACE_PERIOD) && we(null)) {
                z = false;
            }
            if (z) {
                XL();
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 272400898447333665L, this);
            }
            throw th;
        }
    }

    @ey(method = -253470542319824165L)
    public boolean we(IAideLicenseResultListener iAideLicenseResultListener) {
        try {
            if (tp) {
                iy.tp(2858423354287112887L, this, iAideLicenseResultListener);
            }
            this.u7 = iAideLicenseResultListener;
            if (System.currentTimeMillis() < this.Hw) {
                return false;
            }
            c.a aVarJ3 = j3();
            int i = b.j6[aVarJ3.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2 && i != 3 && i != 4) {
                throw new RuntimeException("Unknown LicenseVerificationResult " + aVarJ3);
            }
            if (this.j6 != null) {
                J8();
            } else if (this.FH) {
                j8.j6("Licensing service bind already pending");
            } else {
                this.DW = new ServiceConnectionC0049a();
                Intent intent = new Intent("com.android.vending.licensing.ILicensingService");
                intent.setPackage("com.android.vending");
                boolean zBindService = this.Zo.bindService(intent, this.DW, 1);
                if (!zBindService) {
                    j8.j6("Licensing service could not be bound");
                    return false;
                }
                this.FH = zBindService;
            }
            return true;
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 2858423354287112887L, this, iAideLicenseResultListener);
            }
            throw th;
        }
    }
}
