package com.aide.ui.services;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import com.aide.common.AppLog;
import com.aide.common.StreamUtilities;
import com.aide.ui.ServiceContainer;
import com.aide.ui.util.FileSystem;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.GregorianCalendar;

@cy(clazz = 3187495192348695441L, container = 3187495192348695441L, user = true)
/* loaded from: classes.dex */
public class AssetInstallationService {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = 1855102414333295304L)
    private String DW;

    @dy(field = 1020749033423625415L)
    private String FH;

    @dy(field = -815005410090972600L)
    private String Hw;

    @dy(field = 974109999383686235L)
    private String j6;

    @dy(field = -193640164679603467L)
    private String v5;

    static {
        iy.Zo(AssetInstallationService.class);
    }

    @ey(method = 3203397947685800241L)
    public AssetInstallationService() {
        try {
            if (Zo) {
                iy.gn(-16084265863057608L, null);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -16084265863057608L, null);
            }
            throw th;
        }
    }

    @ey(method = 331500233502388863L)
    public static String DW(String str, boolean z) {
        try {
            if (Zo) {
                iy.EQ(-2445174870133684389L, null, str, new Boolean(z));
            }
            return FH(str, z, false);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -2445174870133684389L, null, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -5543268731201376808L)
    public static String FH(String str, boolean z, boolean z2) {
        try {
            if (Zo) {
                iy.we(2040488576520822600L, null, str, new Boolean(z), new Boolean(z2));
            }
            j6(str, z, z2);
            return VH(str, z);
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, 2040488576520822600L, null, str, new Boolean(z), new Boolean(z2));
            }
            throw th;
        }
    }

    @ey(method = 43735096393400121L)
    private static InputStream J0(String str) {
        try {
            if (Zo) {
                iy.tp(59573089797764301L, null, str);
            }
            if (ServiceContainer.Sf() && Build.VERSION.SDK_INT >= 20) {
                return J8(str, str + ".jet", "x86-pie" + File.separator + str, "x86" + File.separator + str + ".jet");
            }
            if (ServiceContainer.Sf()) {
                return J8(str, str + ".jet", "x86" + File.separator + str, "x86" + File.separator + str + ".jet");
            }
            if (Build.VERSION.SDK_INT >= 20) {
                return J8(str, str + ".jet", "armeabi-pie" + File.separator + str, "armeabi" + File.separator + str + ".jet");
            }
            return J8(str, str + ".jet", "armeabi" + File.separator + str, "armeabi" + File.separator + str + ".jet");
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 59573089797764301L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -1134003218275363L)
    private static InputStream J8(String... strArr) {
        try {
            if (Zo) {
                iy.tp(-5702342367414613095L, null, strArr);
            }
            AssetManager assets = ServiceContainer.getContext().getAssets();
            for (String str : strArr) {
                InputStream inputStreamQX = QX(assets, str);
                if (inputStreamQX != null) {
                    return inputStreamQX;
                }
            }
            throw new FileNotFoundException("Asset " + strArr[0] + " not found.");
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -5702342367414613095L, null, strArr);
            }
            throw th;
        }
    }

    @ey(method = -7186510412248031105L)
    private static InputStream QX(AssetManager assetManager, String str) {
        try {
            if (Zo) {
                iy.EQ(-2204789826678913565L, null, assetManager, str);
            }
            try {
                return assetManager.open(str);
            } catch (FileNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -2204789826678913565L, null, assetManager, str);
            }
            throw th;
        }
    }

    @ey(method = -141602226324038075L)
    private static String VH(String str, boolean z) {
        try {
            if (Zo) {
                iy.EQ(-7453862113528381383L, null, str, new Boolean(z));
            }
            String str2 = FileSystem.yS() + "/.aide";
            if (!new File(str2).exists()) {
                new File(str2).mkdirs();
            }
            return str2 + File.separator + str;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -7453862113528381383L, null, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -3173812892728982728L)
    private static boolean Ws(String str, boolean z) {
        try {
            if (Zo) {
                iy.EQ(3962312358656357160L, null, str, new Boolean(z));
            }
            String strVH = VH(str, z);
            SharedPreferences sharedPreferences = ServiceContainer.getContext().getSharedPreferences("AssetInstallationService", 0);
            long j = sharedPreferences.getLong("ApkVersion", 0L);
            long jZo = Zo();
            long j2 = sharedPreferences.getInt("AndroidVersion", 0);
            if (!FileSystem.DW(j, jZo) || j2 != Build.VERSION.SDK_INT) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.clear();
                editorEdit.putLong("ApkVersion", jZo);
                editorEdit.putInt("AndroidVersion", Build.VERSION.SDK_INT);
                editorEdit.commit();
            }
            if (sharedPreferences.getBoolean(str, false) && new File(strVH).exists()) {
                return false;
            }
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            editorEdit2.putBoolean(str, true);
            editorEdit2.commit();
            try {
                if (new File(strVH).exists()) {
                    if (StreamUtilities.j6(J0(str), new FileInputStream(strVH))) {
                        return false;
                    }
                }
                return true;
            } catch (IOException unused) {
                return true;
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 3962312358656357160L, null, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 298004678665160952L)
    private static long Zo() {
        try {
            if (Zo) {
                iy.gn(394327935069455208L, null);
            }
            try {
                return new File(ServiceContainer.getContext().getPackageManager().getPackageInfo(ServiceContainer.getContext().getPackageName(), 0).applicationInfo.sourceDir).lastModified();
            } catch (PackageManager.NameNotFoundException unused) {
                return -1L;
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 394327935069455208L, null);
            }
            throw th;
        }
    }

    @ey(method = -1425568767723384273L)
    private static boolean j6(String str, boolean z, boolean z2) {
        try {
            if (Zo) {
                iy.we(123092377109109419L, null, str, new Boolean(z), new Boolean(z2));
            }
            if (Ws(str, z)) {
                try {
                    String strVH = VH(str, z);
                    InputStream inputStreamJ0 = J0(str);
                    if (z2) {
                        FileSystem.u7(inputStreamJ0, strVH, false);
                    } else {
                        new File(strVH).getParentFile().mkdirs();
                        StreamUtilities.Zo(inputStreamJ0, new FileOutputStream(strVH));
                    }
                    AppLog.DW("Extracted asset " + str);
                    return true;
                } catch (IOException e) {
                    AppLog.v5(e);
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, 123092377109109419L, null, str, new Boolean(z), new Boolean(z2));
            }
            throw th;
        }
    }

    @ey(method = -3711789379691304448L)
    public String EQ() {
        try {
            if (Zo) {
                iy.gn(-1871442318697594880L, this);
            }
            String strVH = VH("weardebug.keystore", true);
            if (!new File(strVH).exists()) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.add(1, 100);
                ServiceContainer.j3().Hw(strVH, "xxxxxx", "weardebug", "xxxxxx", new GregorianCalendar().getTime(), gregorianCalendar.getTime(), BigInteger.ONE, "Wear Debug", "", "", "", "", "");
            }
            return strVH;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -1871442318697594880L, this);
            }
            throw th;
        }
    }

    @ey(method = -7359206029253165544L)
    public String Hw() {
        try {
            if (Zo) {
                iy.gn(-3757542155167996896L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -3757542155167996896L, this);
            }
            throw th;
        }
    }

    @ey(method = 380133922599977211L)
    public String getAnnotationsJarPath() {
        try {
            if (Zo) {
                iy.gn(900682841801437503L, this);
            }
            return this.FH;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 900682841801437503L, this);
            }
            throw th;
        }
    }

    @ey(method = 5870138251101009991L)
    public String getJavaScriptAPIJsPath() {
        try {
            if (Zo) {
                iy.gn(6927199340312364795L, this);
            }
            return this.j6;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 6927199340312364795L, this);
            }
            throw th;
        }
    }

    @ey(method = -909859927891154784L)
    public String gn() {
        try {
            if (Zo) {
                iy.gn(-456233844932405280L, this);
            }
            return this.Hw;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -456233844932405280L, this);
            }
            throw th;
        }
    }

    @ey(method = 2469309324440374300L)
    public String tp() {
        try {
            if (Zo) {
                iy.gn(3643351339857463764L, this);
            }
            if (this.v5 == null) {
                this.v5 = DW("merger.zip", true);
            }
            return this.v5;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 3643351339857463764L, this);
            }
            throw th;
        }
    }

    @ey(method = -1145562353152381531L)
    public void we() {
        try {
            if (Zo) {
                iy.gn(1973830764010004625L, this);
            }
            this.j6 = DW("JavaScriptAPI.js", true);
            this.DW = DW("android.jar", true);
            this.FH = DW("annotations.jar", true);
            this.Hw = DW("framework.aidl", true);
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 1973830764010004625L, this);
            }
            throw th;
        }
    }
}
