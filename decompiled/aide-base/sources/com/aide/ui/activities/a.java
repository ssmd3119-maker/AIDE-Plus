package com.aide.ui.activities;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.ui.AppPreferences;
import com.aide.ui.ServiceContainer;
import com.aide.ui.util.FileSystem;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
@cy(clazz = 4957755133070502035L, container = 4957755133070502035L, user = true)
/* loaded from: classes.dex */
public final class a {

    @dy(field = 2955326543401376335L)
    public static final a ANDROID_API;

    @dy(field = 190350846862461976L)
    public static final a JAVA_API;

    @dy(field = 3282973674659788800L)
    public static final a JQUERY_API;

    @dy(field = -821910318904804052L)
    public static final a PHONEGAP_API;

    @fy
    private static /* synthetic */ boolean Z1;

    @gy
    private static /* synthetic */ boolean n5;

    @dy(field = 259506063971677985L)
    private static final /* synthetic */ a[] q7;

    @dy(field = 2066811868670856432L)
    private String WB;

    @dy(field = 1185622761244556440L)
    private String fY;

    @dy(field = -1504894421784963952L)
    private String jw;

    @dy(field = -594411990396910140L)
    private boolean k2;

    @dy(field = 2368709602149612240L)
    private String mb;

    @dy(field = 2650462359652727940L)
    private String qp;

    @dy(field = 3469237289413573315L)
    private boolean zh;

    static {
        try {
            iy.Zo(a.class);
            if (Z1) {
                iy.gn(1025066644760247175L, null);
            }
            ANDROID_API = new a("ANDROID_API", 0, "Android API", false, "https://developer.android.com/reference/", "packages.html", "https://dl-ssl.google.com/android/repository/docs-24_r01.zip", "docs/reference/", true);
            JAVA_API = new a("JAVA_API", 1, "Java API", false, "https://docs.oracle.com/javase/7/docs/api/", "overview-summary.html", null, null, true);
            PHONEGAP_API = new a("PHONEGAP_API", 2, "PhoneGap API", true, "http://docs.phonegap.com/en/3.0.0/index.html", "", "https://github.com/phonegap/phonegap/archive/2.9.0.zip", "phonegap-2.9.0/doc/index.html", true);
            a aVar = new a("JQUERY_API", 3, "jQuery API", true, "http://jqapi.com/", "", "http://jqapi.com/jqapi.zip", "index.html", true);
            JQUERY_API = aVar;
            q7 = new a[]{ANDROID_API, JAVA_API, PHONEGAP_API, aVar};
        } catch (Throwable th) {
            if (n5) {
                iy.aM(th, 1025066644760247175L, null);
            }
            throw th;
        }
    }

    @ey(method = -1315654832781168169L)
    private a(String str, int i, String str2, boolean z, String str3, String str4, String str5, String str6, boolean z2) {
        try {
            if (Z1) {
                iy.QX(4602696922595929248L, null, new Object[]{str, new Integer(i), str2, new Boolean(z), str3, str4, str5, str6, new Boolean(z2)});
            }
            this.WB = str2;
            this.mb = str3;
            this.k2 = z;
            this.jw = str6;
            this.fY = str4;
            this.qp = str5;
            this.zh = z2;
        } catch (Throwable th) {
            if (n5) {
                iy.rN(th, 4602696922595929248L, null, new Object[]{str, new Integer(i), str2, new Boolean(z), str3, str4, str5, str6, new Boolean(z2)});
            }
            throw th;
        }
    }

    @ey(method = 1520484933277107112L)
    public static a[] QX() {
        try {
            if (Z1) {
                iy.gn(-578010442454620851L, null);
            }
            return ServiceContainer.ca() ? values() : ServiceContainer.P8.equals("com.aide.ui") ? new a[]{ANDROID_API, JAVA_API} : new a[]{PHONEGAP_API, JQUERY_API, ANDROID_API};
        } catch (Throwable th) {
            if (n5) {
                iy.aM(th, -578010442454620851L, null);
            }
            throw th;
        }
    }

    @ey(method = -4130147526717278808L)
    public static a Zo() {
        try {
            if (Z1) {
                iy.gn(2413233626286995895L, null);
            }
            return ANDROID_API;
        } catch (Throwable th) {
            if (n5) {
                iy.aM(th, 2413233626286995895L, null);
            }
            throw th;
        }
    }

    @ey(method = 5186763103697944832L)
    public static long tp() {
        try {
            if (!Z1) {
                return 800000000L;
            }
            iy.gn(1750892423285166777L, null);
            return 800000000L;
        } catch (Throwable th) {
            if (n5) {
                iy.aM(th, 1750892423285166777L, null);
            }
            throw th;
        }
    }

    @ey(method = -2843307491566540032L)
    public static a v5() {
        try {
            if (Z1) {
                iy.gn(-2549603512689972375L, null);
            }
            return ANDROID_API;
        } catch (Throwable th) {
            if (n5) {
                iy.aM(th, -2549603512689972375L, null);
            }
            throw th;
        }
    }

    @ey(method = -614951013482165808L)
    public static a valueOf(String str) {
        try {
            if (Z1) {
                iy.tp(84989465784567519L, null, str);
            }
            return (a) Enum.valueOf(a.class, str);
        } catch (Throwable th) {
            if (n5) {
                iy.j3(th, 84989465784567519L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 1284434344558977408L)
    public static a[] values() {
        try {
            if (Z1) {
                iy.gn(828025346451330365L, null);
            }
            return (a[]) q7.clone();
        } catch (Throwable th) {
            if (n5) {
                iy.aM(th, 828025346451330365L, null);
            }
            throw th;
        }
    }

    @ey(method = -6370134232766506083L)
    public String DW() {
        try {
            if (Z1) {
                iy.gn(2374621545547319708L, this);
            }
            try {
                if (this.qp != null) {
                    return new File(new URL(this.qp).getFile()).getName();
                }
                return null;
            } catch (MalformedURLException unused) {
                return null;
            }
        } catch (Throwable th) {
            if (n5) {
                iy.aM(th, 2374621545547319708L, this);
            }
            throw th;
        }
    }

    @ey(method = 3368433658972263753L)
    public String FH() {
        try {
            if (Z1) {
                iy.gn(290075973713301600L, this);
            }
            return this.qp;
        } catch (Throwable th) {
            if (n5) {
                iy.aM(th, 290075973713301600L, this);
            }
            throw th;
        }
    }

    @ey(method = -89745778056924333L)
    public String J0(String str) {
        try {
            if (Z1) {
                iy.tp(-32504461788032256L, this, str);
            }
            if (str == null) {
                str = "";
            }
            if (DW() != null && AppPreferences.KD() != null) {
                String str2 = AppPreferences.KD() + "/" + DW();
                if (FileSystem.exists(str2)) {
                    return "file://" + str2 + "/" + this.jw + str;
                }
            }
            return this.mb + str;
        } catch (Throwable th) {
            if (n5) {
                iy.j3(th, -32504461788032256L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1807157604546785960L)
    public int XL() {
        try {
            if (Z1) {
                iy.gn(-3192045185440473173L, this);
            }
            a[] aVarArrQX = QX();
            for (int i = 0; i < aVarArrQX.length; i++) {
                if (aVarArrQX[i].equals(this)) {
                    return i;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (n5) {
                iy.aM(th, -3192045185440473173L, this);
            }
            throw th;
        }
    }

    @ey(method = -5494347951152426125L)
    public boolean aM() {
        try {
            if (Z1) {
                iy.gn(3082812490214623296L, this);
            }
            return this.k2;
        } catch (Throwable th) {
            if (n5) {
                iy.aM(th, 3082812490214623296L, this);
            }
            throw th;
        }
    }

    @ey(method = -6499416196100516700L)
    public boolean j6() {
        try {
            if (Z1) {
                iy.gn(-5418394848116073981L, this);
            }
            return this.zh;
        } catch (Throwable th) {
            if (n5) {
                iy.aM(th, -5418394848116073981L, this);
            }
            throw th;
        }
    }

    @ey(method = 1564861498770486705L)
    public String u7() {
        try {
            if (Z1) {
                iy.gn(777703478926687812L, this);
            }
            return this.WB;
        } catch (Throwable th) {
            if (n5) {
                iy.aM(th, 777703478926687812L, this);
            }
            throw th;
        }
    }

    @ey(method = 839253814073349865L)
    public String we() {
        try {
            if (Z1) {
                iy.gn(403201429711111408L, this);
            }
            return J0(this.fY);
        } catch (Throwable th) {
            if (n5) {
                iy.aM(th, 403201429711111408L, this);
            }
            throw th;
        }
    }
}
