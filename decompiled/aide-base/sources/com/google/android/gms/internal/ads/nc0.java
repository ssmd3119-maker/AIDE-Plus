package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class nc0 {
    private static final String j3 = "nc0";
    private ExecutorService DW;
    private DexClassLoader FH;
    private xb0 Hw;
    private Map<Pair<String, String>, vd0> Ws;
    protected Context j6;
    private boolean u7;
    private byte[] v5;
    private pb0 we;
    private volatile AdvertisingIdClient Zo = null;
    private volatile boolean VH = false;
    private Future gn = null;
    private volatile sz tp = null;
    private Future EQ = null;
    private boolean J0 = false;
    private boolean J8 = false;
    private boolean QX = false;
    private boolean XL = true;
    private boolean aM = false;

    final class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                nc0.this.XL = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                nc0.this.XL = false;
            }
        }

        /* synthetic */ a(nc0 nc0Var, oc0 oc0Var) {
            this();
        }
    }

    private nc0(Context context) {
        Context applicationContext = context.getApplicationContext();
        boolean z = applicationContext != null;
        this.u7 = z;
        this.j6 = z ? applicationContext : context;
        this.Ws = new HashMap();
    }

    private static void BT(String str) {
        er(new File(str));
    }

    public static nc0 Hw(Context context, String str, String str2, boolean z) throws Throwable {
        oc0 oc0Var;
        nc0 nc0Var = new nc0(context);
        try {
            nc0Var.DW = Executors.newCachedThreadPool(new oc0());
            nc0Var.VH = z;
            if (z) {
                nc0Var.gn = nc0Var.DW.submit(new pc0(nc0Var));
            }
            nc0Var.DW.execute(new rc0(nc0Var));
            try {
                com.google.android.gms.common.c cVarVH = com.google.android.gms.common.c.VH();
                nc0Var.J0 = cVarVH.DW(nc0Var.j6) > 0;
                nc0Var.J8 = cVarVH.gn(nc0Var.j6) == 0;
            } catch (Throwable unused) {
            }
            nc0Var.Zo(0, true);
            if (uc0.j6() && ((Boolean) cw0.v5().FH(p.Bx)).booleanValue()) {
                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            oc0Var = null;
            xb0 xb0Var = new xb0(null);
            nc0Var.Hw = xb0Var;
            try {
                nc0Var.v5 = xb0Var.Hw(str);
            } catch (yb0 e) {
                throw new kc0(e);
            }
        } catch (kc0 unused2) {
        }
        try {
            try {
                try {
                    File cacheDir = nc0Var.j6.getCacheDir();
                    if (cacheDir == null && (cacheDir = nc0Var.j6.getDir("dex", 0)) == null) {
                        throw new kc0();
                    }
                    File file = new File(String.format("%s/%s.jar", cacheDir, "1529567361524"));
                    if (!file.exists()) {
                        byte[] bArrDW = nc0Var.Hw.DW(nc0Var.v5, str2);
                        file.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        fileOutputStream.write(bArrDW, 0, bArrDW.length);
                        fileOutputStream.close();
                    }
                    nc0Var.gW(cacheDir, "1529567361524");
                    try {
                        nc0Var.FH = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, nc0Var.j6.getClassLoader());
                        er(file);
                        nc0Var.gn(cacheDir, "1529567361524");
                        BT(String.format("%s/%s.dex", cacheDir, "1529567361524"));
                        if (!nc0Var.aM) {
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("android.intent.action.USER_PRESENT");
                            intentFilter.addAction("android.intent.action.SCREEN_OFF");
                            nc0Var.j6.registerReceiver(new a(nc0Var, oc0Var), intentFilter);
                            nc0Var.aM = true;
                        }
                        nc0Var.we = new pb0(nc0Var);
                        nc0Var.QX = true;
                        return nc0Var;
                    } catch (Throwable th) {
                        er(file);
                        nc0Var.gn(cacheDir, "1529567361524");
                        BT(String.format("%s/%s.dex", cacheDir, "1529567361524"));
                        throw th;
                    }
                } catch (IOException e2) {
                    throw new kc0(e2);
                }
            } catch (yb0 e3) {
                throw new kc0(e3);
            }
        } catch (FileNotFoundException e4) {
            throw new kc0(e4);
        } catch (NullPointerException e5) {
            throw new kc0(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U2() {
        try {
            if (this.Zo == null && this.u7) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.j6);
                advertisingIdClient.Zo();
                this.Zo = advertisingIdClient;
            }
        } catch (com.google.android.gms.common.d | com.google.android.gms.common.e | IOException unused) {
            this.Zo = null;
        }
    }

    private final sz a8() {
        try {
            return wx.j6(this.j6, this.j6.getPackageName(), Integer.toString(this.j6.getPackageManager().getPackageInfo(this.j6.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void er(File file) {
        if (file.exists()) {
            file.delete();
        } else {
            Log.d(j3, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
        }
    }

    private final boolean gW(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (file3.exists()) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            long length = file2.length();
            if (length <= 0) {
                er(file2);
                return false;
            }
            byte[] bArr = new byte[(int) length];
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        Log.d(j3, "Cannot read the cache data.");
                        er(file2);
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                        return false;
                    }
                    n30 n30Var = new n30();
                    p90.DW(n30Var, bArr);
                    n30 n30Var2 = n30Var;
                    if (str.equals(new String(n30Var2.v5)) && Arrays.equals(n30Var2.Hw, la0.v5(n30Var2.FH)) && Arrays.equals(n30Var2.Zo, Build.VERSION.SDK.getBytes())) {
                        byte[] bArrDW = this.Hw.DW(this.v5, new String(n30Var2.FH));
                        file3.createNewFile();
                        fileOutputStream = new FileOutputStream(file3);
                        try {
                            fileOutputStream.write(bArrDW, 0, bArrDW.length);
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused2) {
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                            return true;
                        } catch (yb0 | IOException | NoSuchAlgorithmException unused4) {
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused5) {
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused6) {
                                }
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused7) {
                                }
                            }
                            if (fileOutputStream == null) {
                                throw th;
                            }
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (IOException unused8) {
                                throw th;
                            }
                        }
                    }
                    er(file2);
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused9) {
                    }
                    return false;
                } catch (yb0 | IOException | NoSuchAlgorithmException unused10) {
                    fileOutputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (yb0 | IOException | NoSuchAlgorithmException unused11) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private final void gn(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                        er(file3);
                        return;
                    }
                    n30 n30Var = new n30();
                    n30Var.Zo = Build.VERSION.SDK.getBytes();
                    n30Var.v5 = str.getBytes();
                    byte[] bytes = this.Hw.FH(this.v5, bArr).getBytes();
                    n30Var.FH = bytes;
                    n30Var.Hw = la0.v5(bytes);
                    file2.createNewFile();
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] bArrVH = p90.VH(n30Var);
                        fileOutputStream.write(bArrVH, 0, bArrVH.length);
                        fileOutputStream.close();
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused2) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                        er(file3);
                    } catch (yb0 | IOException | NoSuchAlgorithmException unused4) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused6) {
                            }
                        }
                        er(file3);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused8) {
                            }
                        }
                        er(file3);
                        throw th;
                    }
                } catch (yb0 | IOException | NoSuchAlgorithmException unused9) {
                    fileOutputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (yb0 | IOException | NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean u7(int i, sz szVar) {
        Long l;
        String str;
        if (i >= 4) {
            return false;
        }
        if (szVar == null) {
            return true;
        }
        if (((Boolean) cw0.v5().FH(p.MP)).booleanValue() && ((str = szVar.er) == null || str.equals("0000000000000000000000000000000000000000000000000000000000000000"))) {
            return true;
        }
        if (!((Boolean) cw0.v5().FH(p.Of)).booleanValue()) {
            return false;
        }
        n40 n40Var = szVar.WB;
        return n40Var == null || (l = n40Var.FH) == null || l.longValue() == -2;
    }

    public final boolean DW() {
        return this.QX;
    }

    public final boolean EQ(String str, String str2, Class<?>... clsArr) {
        if (this.Ws.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.Ws.put(new Pair<>(str, str2), new vd0(this, str, str2, clsArr));
        return true;
    }

    public final DexClassLoader J0() {
        return this.FH;
    }

    public final xb0 J8() {
        return this.Hw;
    }

    public final Future Mr() {
        return this.EQ;
    }

    public final boolean QX() {
        return this.J0;
    }

    public final byte[] Ws() {
        return this.v5;
    }

    public final pb0 XL() {
        return this.we;
    }

    final void Zo(int i, boolean z) {
        if (this.J8) {
            Future<?> futureSubmit = this.DW.submit(new qc0(this, i, z));
            if (i == 0) {
                this.EQ = futureSubmit;
            }
        }
    }

    public final boolean aM() {
        return this.XL;
    }

    public final sz j3() {
        return this.tp;
    }

    public final Context j6() {
        return this.j6;
    }

    public final AdvertisingIdClient lg() throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.VH) {
            return null;
        }
        if (this.Zo != null) {
            return this.Zo;
        }
        Future future = this.gn;
        if (future != null) {
            try {
                future.get(2000L, TimeUnit.MILLISECONDS);
                this.gn = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.gn.cancel(true);
            }
        }
        return this.Zo;
    }

    final sz rN(int i, boolean z) throws InterruptedException {
        if (i > 0 && z) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        return a8();
    }

    public final Method v5(String str, String str2) {
        vd0 vd0Var = this.Ws.get(new Pair(str, str2));
        if (vd0Var == null) {
            return null;
        }
        return vd0Var.FH();
    }

    public final int vy() {
        if (this.we != null) {
            return pb0.Hw();
        }
        return Integer.MIN_VALUE;
    }

    public final ExecutorService we() {
        return this.DW;
    }
}
