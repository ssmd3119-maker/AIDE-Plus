package com.google.android.gms.internal.ads;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class bn {
    public static final Handler gn = new um(Looper.getMainLooper());

    @GuardedBy("mLock")
    private String FH;

    @GuardedBy("this")
    private Pattern VH;

    @GuardedBy("this")
    private Pattern Zo;
    private final Object j6 = new Object();
    private boolean DW = true;
    private boolean Hw = false;
    private boolean v5 = false;

    protected static String BT(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return ye();
        }
    }

    public static Bundle DW(as0 as0Var) {
        String strMr;
        String strTp;
        String strU7;
        if (as0Var == null) {
            return null;
        }
        if (com.google.android.gms.ads.internal.w0.u7().a8().er() && com.google.android.gms.ads.internal.w0.u7().a8().QX()) {
            return null;
        }
        if (as0Var.EQ()) {
            as0Var.j6();
        }
        ur0 ur0VarU7 = as0Var.u7();
        if (ur0VarU7 != null) {
            strMr = ur0VarU7.gn();
            strU7 = ur0VarU7.u7();
            strTp = ur0VarU7.tp();
            if (strMr != null) {
                com.google.android.gms.ads.internal.w0.u7().a8().J8(strMr);
            }
            if (strTp != null) {
                com.google.android.gms.ads.internal.w0.u7().a8().j3(strTp);
            }
        } else {
            strMr = com.google.android.gms.ads.internal.w0.u7().a8().Mr();
            strTp = com.google.android.gms.ads.internal.w0.u7().a8().tp();
            strU7 = null;
        }
        Bundle bundle = new Bundle(1);
        if (strTp != null && !com.google.android.gms.ads.internal.w0.u7().a8().QX()) {
            bundle.putString("v_fp_vertical", strTp);
        }
        if (strMr != null && !com.google.android.gms.ads.internal.w0.u7().a8().er()) {
            bundle.putString("fingerprint", strMr);
            if (!strMr.equals(strU7)) {
                bundle.putString("v_fp", strU7);
            }
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    public static void EQ(Context context, Intent intent) {
        try {
            j6(context, intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            j6(context, intent);
        }
    }

    public static int Ev(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    public static DisplayMetrics FH(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static Bitmap FN(View view) {
        if (view == null) {
            return null;
        }
        Bitmap bitmapOY = oY(view);
        return bitmapOY == null ? jO(view) : bitmapOY;
    }

    public static PopupWindow Hw(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    public static WebResourceResponse I(HttpURLConnection httpURLConnection) {
        com.google.android.gms.ads.internal.w0.v5();
        String contentType = httpURLConnection.getContentType();
        String strTrim = "";
        String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
        com.google.android.gms.ads.internal.w0.v5();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] strArrSplit = contentType2.split(";");
            if (strArrSplit.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= strArrSplit.length) {
                        break;
                    }
                    if (strArrSplit[i].trim().startsWith("charset")) {
                        String[] strArrSplit2 = strArrSplit[i].trim().split("=");
                        if (strArrSplit2.length > 1) {
                            strTrim = strArrSplit2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str = strTrim;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap map = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && entry.getValue().size() > 0) {
                map.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return com.google.android.gms.ads.internal.w0.VH().v5(strTrim2, str, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), map, httpURLConnection.getInputStream());
    }

    private static boolean KD(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return false;
        }
        return powerManager.isScreenOn();
    }

    private final void Mr(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, OW((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, CU((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, u7((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, u7(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    public static void Mz(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Ws(context, str, arrayList);
    }

    private final JSONObject OW(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Mr(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public static zzzy P8(Context context) {
        return new zzzy(context);
    }

    public static String Qq(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    public static boolean SI(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return true;
                    }
                    return !KD(context);
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean Sf(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(24)
    public static boolean U2(Activity activity, Configuration configuration) {
        if (((Boolean) cw0.v5().FH(p.x6)).booleanValue()) {
            return !activity.isInMultiWindowMode();
        }
        cw0.j6();
        int iJ6 = mp.j6(activity, configuration.screenHeightDp);
        int iJ62 = mp.j6(activity, configuration.screenWidthDp);
        DisplayMetrics displayMetricsFH = FH((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = displayMetricsFH.heightPixels;
        int i2 = displayMetricsFH.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        double d = activity.getResources().getDisplayMetrics().density;
        Double.isNaN(d);
        int iRound = ((int) Math.round(d + 0.5d)) * ((Integer) cw0.v5().FH(p.DY)).intValue();
        return br(i, iJ6 + dimensionPixelSize, iRound) && br(i2, iJ62, iRound);
    }

    public static String WB() {
        return UUID.randomUUID().toString();
    }

    public static void Ws(Context context, String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            new ap(context, str, it.next()).VH();
        }
    }

    public static Map<String, String> XG(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : com.google.android.gms.ads.internal.w0.VH().XL(uri)) {
            map.put(str, uri.getQueryParameter(str));
        }
        return map;
    }

    public static void XL(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        boolean zBooleanValue = false;
        try {
            zBooleanValue = ((Boolean) cw0.v5().FH(p.Hw)).booleanValue();
        } catch (IllegalStateException unused) {
        }
        if (zBooleanValue) {
            com.google.android.gms.common.util.g.j6(context, th);
        }
    }

    public static boolean Xa(Context context, String str) {
        Context contextFH = gj.FH(context);
        return com.google.android.gms.common.wrappers.b.j6(contextFH).DW(str, contextFH.getPackageName()) == 0;
    }

    public static String Zo(Context context, View view, zzwf zzwfVar) throws JSONException {
        if (!((Boolean) cw0.v5().FH(p.lp)).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", zzwfVar.qp);
            jSONObject2.put("height", zzwfVar.mb);
            jSONObject.put("size", jSONObject2);
            jSONObject.put("activity", ei(context));
            if (!zzwfVar.fY) {
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    Object parent = view.getParent();
                    if (parent != null) {
                        int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(AppMeasurement.Param.TYPE, parent.getClass().getName());
                        jSONObject3.put("index_of_child", iIndexOfChild);
                        jSONArray.put(jSONObject3);
                    }
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("parents", jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            xp.v5("Fail to get view hierarchy json", e);
            return null;
        }
    }

    public static boolean aj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public static Bitmap aq(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return bitmapCreateBitmap;
    }

    private static boolean br(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    public static void ca(Context context, String str, String str2) throws IOException {
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str, 0);
            fileOutputStreamOpenFileOutput.write(str2.getBytes("UTF-8"));
            fileOutputStreamOpenFileOutput.close();
        } catch (Exception e) {
            xp.Hw("Error writing to file in internal storage.", e);
        }
    }

    @TargetApi(16)
    public static boolean cb(Context context) {
        KeyguardManager keyguardManagerSh;
        return context != null && com.google.android.gms.common.util.o.FH() && (keyguardManagerSh = sh(context)) != null && keyguardManagerSh.isKeyguardLocked();
    }

    public static int cn(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    public static boolean dx(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            xp.Hw("Error loading class.", th);
            com.google.android.gms.ads.internal.w0.u7().v5(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    private static String ei(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                return runningTaskInfo.topActivity.getClassName();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static boolean er(Context context) {
        ActivityInfo activityInfo;
        boolean z;
        Context contextFH = gj.FH(context);
        Intent intent = new Intent();
        intent.setClassName(contextFH, "com.google.android.gms.ads.AdActivity");
        try {
            ResolveInfo resolveInfoResolveActivity = contextFH.getPackageManager().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) {
                xp.u7("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
                return false;
            }
            if ((activityInfo.configChanges & 16) == 0) {
                xp.u7(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "keyboard"));
                z = false;
            } else {
                z = true;
            }
            if ((resolveInfoResolveActivity.activityInfo.configChanges & 32) == 0) {
                xp.u7(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "keyboardHidden"));
                z = false;
            }
            if ((resolveInfoResolveActivity.activityInfo.configChanges & 128) == 0) {
                xp.u7(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "orientation"));
                z = false;
            }
            if ((resolveInfoResolveActivity.activityInfo.configChanges & 256) == 0) {
                xp.u7(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "screenLayout"));
                z = false;
            }
            if ((resolveInfoResolveActivity.activityInfo.configChanges & 512) == 0) {
                xp.u7(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "uiMode"));
                z = false;
            }
            if ((resolveInfoResolveActivity.activityInfo.configChanges & 1024) == 0) {
                xp.u7(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "screenSize"));
                z = false;
            }
            if ((resolveInfoResolveActivity.activityInfo.configChanges & 2048) != 0) {
                return z;
            }
            xp.u7(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "smallestScreenSize"));
            return false;
        } catch (Exception e) {
            xp.v5("Could not verify that com.google.android.gms.ads.AdActivity is declared in AndroidManifest.xml", e);
            com.google.android.gms.ads.internal.w0.u7().v5(e, "AdUtil.hasAdActivity");
            return false;
        }
    }

    public static Bundle fY() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) cw0.v5().FH(p.vy)).booleanValue()) {
                Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            Runtime runtime = Runtime.getRuntime();
            bundle.putLong("runtime_free_memory", runtime.freeMemory());
            bundle.putLong("runtime_max_memory", runtime.maxMemory());
            bundle.putLong("runtime_total_memory", runtime.totalMemory());
            bundle.putInt("web_view_count", com.google.android.gms.ads.internal.w0.u7().U2());
        } catch (Exception e) {
            xp.v5("Unable to gather memory stats", e);
        }
        return bundle;
    }

    public static String gn(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int i = inputStreamReader.read(cArr);
            if (i == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i);
        }
    }

    public static String hz(Context context, String str) {
        try {
            return new String(com.google.android.gms.common.util.k.FH(context.openFileInput(str), true), "UTF-8");
        } catch (IOException unused) {
            xp.VH("Error reading from internal storage.");
            return "";
        }
    }

    private final void j3(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(OW((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(CU((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(u7((Collection) obj));
            return;
        }
        if (!(obj instanceof Object[])) {
            jSONArray.put(obj);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (Object obj2 : (Object[]) obj) {
            j3(jSONArray2, obj2);
        }
        jSONArray.put(jSONArray2);
    }

    private static /* synthetic */ void j6(Object obj, Intent intent) {
        ((Context) obj).startActivity(intent);
        abcd.iy.BT(obj, intent);
    }

    public static int[] jJ(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? jw() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    private static Bitmap jO(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0 && height != 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                view.layout(0, 0, width, height);
                view.draw(canvas);
                return bitmapCreateBitmap;
            }
            xp.u7("Width or height of view is zero");
            return null;
        } catch (RuntimeException e) {
            xp.Hw("Fail to capture the webview", e);
            return null;
        }
    }

    private static int[] jw() {
        return new int[]{0, 0};
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean ko(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L12
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L12
            android.app.Activity r2 = (android.app.Activity) r2
            goto L13
        L12:
            r2 = r0
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bn.ko(android.view.View):boolean");
    }

    public static WebResourceResponse lp(Context context, String str, String str2) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", com.google.android.gms.ads.internal.w0.v5().Eq(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = new zzazs(context).Hw(str2, map).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            xp.v5("Could not fetch MRAID JS.", e);
            return null;
        }
    }

    public static String mb() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r3.importance != 100) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (KD(r6) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean nw(android.content.Context r6) {
        /*
            r0 = 0
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r6.getSystemService(r1)     // Catch: java.lang.Throwable -> L49
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r6.getSystemService(r2)     // Catch: java.lang.Throwable -> L49
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L49
            if (r2 != 0) goto L16
            goto L49
        L16:
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L1d
            return r0
        L1d:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L49
        L21:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L49
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L49
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch: java.lang.Throwable -> L49
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L49
            int r5 = r3.pid     // Catch: java.lang.Throwable -> L49
            if (r4 != r5) goto L21
            int r1 = r3.importance     // Catch: java.lang.Throwable -> L49
            r3 = 100
            if (r1 != r3) goto L49
            boolean r1 = r2.inKeyguardRestrictedInputMode()     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L49
            boolean r6 = KD(r6)     // Catch: java.lang.Throwable -> L49
            if (r6 == 0) goto L49
            r6 = 1
            return r6
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bn.nw(android.content.Context):boolean");
    }

    private static Bitmap oY(View view) {
        try {
            boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
            view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
        } catch (RuntimeException e) {
            xp.Hw("Fail to capture the web view", e);
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap ro(Context context) {
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
            Window window = ((Activity) context).getWindow();
            if (window != null) {
                return oY(window.getDecorView().getRootView());
            }
            return null;
        } catch (RuntimeException e) {
            xp.Hw("Fail to capture screen shot", e);
            return null;
        }
    }

    private static KeyguardManager sh(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    public static int sy(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 22);
            sb.append("Could not parse value:");
            sb.append(strValueOf);
            xp.u7(sb.toString());
            return 0;
        }
    }

    private final JSONArray u7(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            j3(jSONArray, it.next());
        }
        return jSONArray;
    }

    @TargetApi(ProxyTextView.INPUTTYPE_numberPassword)
    public static void vJ(Context context, Intent intent) {
        if (intent != null && com.google.android.gms.common.util.o.v5()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static AlertDialog.Builder vy(Context context) {
        return new AlertDialog.Builder(context);
    }

    @TargetApi(ProxyTextView.INPUTTYPE_numberPassword)
    public static void we(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            vJ(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            j6(context, intent);
            String string = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 26);
            sb.append("Opening ");
            sb.append(string);
            sb.append(" in a new browser.");
            xp.VH(sb.toString());
        } catch (ActivityNotFoundException e) {
            xp.Hw("No browser is found.", e);
        }
    }

    public static void x9(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zm.DW(runnable);
        }
    }

    public static boolean yO(String str) {
        if (!qp.j6()) {
            return false;
        }
        if (!((Boolean) cw0.v5().FH(p.ya)).booleanValue()) {
            return false;
        }
        String str2 = (String) cw0.v5().FH(p.uD);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) cw0.v5().FH(p.ir);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static String ye() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public final JSONObject CU(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                Mr(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String strValueOf = String.valueOf(e.getMessage());
            throw new JSONException(strValueOf.length() != 0 ? "Could not convert map to JSON: ".concat(strValueOf) : new String("Could not convert map to JSON: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4 A[Catch: Exception -> 0x00b3, all -> 0x00cd, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b3, blocks: (B:30:0x009a, B:32:0x00a4), top: B:49:0x009a, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Eq(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.j6
            monitor-enter(r0)
            java.lang.String r1 = r4.FH     // Catch: java.lang.Throwable -> Lcd
            if (r1 == 0) goto Lb
            java.lang.String r5 = r4.FH     // Catch: java.lang.Throwable -> Lcd
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcd
            return r5
        Lb:
            if (r6 != 0) goto L13
            java.lang.String r5 = ye()     // Catch: java.lang.Throwable -> Lcd
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcd
            return r5
        L13:
            com.google.android.gms.internal.ads.jn r1 = com.google.android.gms.ads.internal.w0.VH()     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> Lcd
            java.lang.String r1 = r1.j6(r5)     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> Lcd
            r4.FH = r1     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> Lcd
        L1d:
            java.lang.String r1 = r4.FH     // Catch: java.lang.Throwable -> Lcd
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lcd
            if (r1 == 0) goto L6b
            com.google.android.gms.internal.ads.cw0.j6()     // Catch: java.lang.Throwable -> Lcd
            boolean r1 = com.google.android.gms.internal.ads.mp.EQ()     // Catch: java.lang.Throwable -> Lcd
            if (r1 != 0) goto L65
            r1 = 0
            r4.FH = r1     // Catch: java.lang.Throwable -> Lcd
            android.os.Handler r1 = com.google.android.gms.internal.ads.bn.gn     // Catch: java.lang.Throwable -> Lcd
            com.google.android.gms.internal.ads.fn r2 = new com.google.android.gms.internal.ads.fn     // Catch: java.lang.Throwable -> Lcd
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lcd
            r1.post(r2)     // Catch: java.lang.Throwable -> Lcd
        L3b:
            java.lang.String r1 = r4.FH     // Catch: java.lang.Throwable -> Lcd
            if (r1 != 0) goto L6b
            java.lang.Object r1 = r4.j6     // Catch: java.lang.InterruptedException -> L45 java.lang.Throwable -> Lcd
            r1.wait()     // Catch: java.lang.InterruptedException -> L45 java.lang.Throwable -> Lcd
            goto L3b
        L45:
            java.lang.String r1 = ye()     // Catch: java.lang.Throwable -> Lcd
            r4.FH = r1     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r2 = "Interrupted, use default user agent: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lcd
            int r3 = r1.length()     // Catch: java.lang.Throwable -> Lcd
            if (r3 == 0) goto L5c
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> Lcd
            goto L61
        L5c:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Lcd
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lcd
        L61:
            com.google.android.gms.internal.ads.xp.u7(r1)     // Catch: java.lang.Throwable -> Lcd
            goto L3b
        L65:
            java.lang.String r1 = BT(r5)     // Catch: java.lang.Throwable -> Lcd
            r4.FH = r1     // Catch: java.lang.Throwable -> Lcd
        L6b:
            java.lang.String r1 = r4.FH     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lcd
            int r2 = r2.length()     // Catch: java.lang.Throwable -> Lcd
            int r2 = r2 + 10
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Lcd
            int r3 = r3.length()     // Catch: java.lang.Throwable -> Lcd
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcd
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lcd
            r3.append(r1)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch: java.lang.Throwable -> Lcd
            r3.append(r6)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> Lcd
            r4.FH = r6     // Catch: java.lang.Throwable -> Lcd
            com.google.android.gms.common.wrappers.PackageManagerWrapper r5 = com.google.android.gms.common.wrappers.b.j6(r5)     // Catch: java.lang.Exception -> Lb3 java.lang.Throwable -> Lcd
            boolean r5 = r5.VH()     // Catch: java.lang.Exception -> Lb3 java.lang.Throwable -> Lcd
            if (r5 == 0) goto Lbd
            java.lang.String r5 = r4.FH     // Catch: java.lang.Exception -> Lb3 java.lang.Throwable -> Lcd
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> Lb3 java.lang.Throwable -> Lcd
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Exception -> Lb3 java.lang.Throwable -> Lcd
            r4.FH = r5     // Catch: java.lang.Exception -> Lb3 java.lang.Throwable -> Lcd
            goto Lbd
        Lb3:
            r5 = move-exception
            com.google.android.gms.internal.ads.dm r6 = com.google.android.gms.ads.internal.w0.u7()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.v5(r5, r1)     // Catch: java.lang.Throwable -> Lcd
        Lbd:
            java.lang.String r5 = r4.FH     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Throwable -> Lcd
            r4.FH = r5     // Catch: java.lang.Throwable -> Lcd
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcd
            return r5
        Lcd:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcd
            goto Ld1
        Ld0:
            throw r5
        Ld1:
            goto Ld0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bn.Eq(android.content.Context, java.lang.String):java.lang.String");
    }

    public final void J0(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(Eq(context, str));
    }

    public final void J8(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            com.google.android.gms.ads.internal.w0.v5();
            bundle.putString("device", mb());
            bundle.putString("eids", TextUtils.join(",", p.FH()));
        }
        cw0.j6();
        mp.v5(context, str, str2, bundle, z, new gn(this, context, str));
    }

    public final void QX(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", Eq(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[Catch: all -> 0x0043, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x000d, B:11:0x0037, B:12:0x0041, B:10:0x0025), top: B:18:0x0009, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean XX(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            monitor-enter(r3)     // Catch: java.util.regex.PatternSyntaxException -> L46
            java.util.regex.Pattern r0 = r3.Zo     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L25
            com.google.android.gms.internal.ads.e<java.lang.String> r0 = com.google.android.gms.internal.ads.p.br     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.internal.ads.m r2 = com.google.android.gms.internal.ads.cw0.v5()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r2.FH(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L43
            java.util.regex.Pattern r2 = r3.Zo     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r2.pattern()     // Catch: java.lang.Throwable -> L43
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L37
        L25:
            com.google.android.gms.internal.ads.e<java.lang.String> r0 = com.google.android.gms.internal.ads.p.br     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.internal.ads.m r2 = com.google.android.gms.internal.ads.cw0.v5()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r2.FH(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L43
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.Throwable -> L43
            r3.Zo = r0     // Catch: java.lang.Throwable -> L43
        L37:
            java.util.regex.Pattern r0 = r3.Zo     // Catch: java.lang.Throwable -> L43
            java.util.regex.Matcher r4 = r0.matcher(r4)     // Catch: java.lang.Throwable -> L43
            boolean r4 = r4.matches()     // Catch: java.lang.Throwable -> L43
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            return r4
        L43:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            throw r4     // Catch: java.util.regex.PatternSyntaxException -> L46
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bn.XX(java.lang.String):boolean");
    }

    public final boolean a8(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return lg(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, sh(context));
    }

    public final void aM(Context context, List<String> list) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (TextUtils.isEmpty(ua0.j6(activity))) {
                return;
            }
            if (list == null) {
                sm.we("Cannot ping urls: empty list.");
            } else {
                if (!n0.VH(context)) {
                    sm.we("Cannot ping url because custom tabs is not supported");
                    return;
                }
                n0 n0Var = new n0();
                n0Var.Hw(new en(this, list, n0Var, context));
                n0Var.Zo(activity);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final Bundle ef(final Context context) {
        if (!((Boolean) cw0.v5().FH(p.ee)).booleanValue()) {
            return null;
        }
        try {
            return (Bundle) zm.j6(new Callable(this, context) { // from class: com.google.android.gms.internal.ads.dn
                private final Context j6;

                {
                    this.j6 = context;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = this.j6;
                    if (!((Boolean) cw0.v5().FH(p.ee)).booleanValue()) {
                        return null;
                    }
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
                    Bundle bundle = new Bundle();
                    if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                        bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
                    }
                    String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
                    for (int i = 0; i < 4; i++) {
                        String str = strArr[i];
                        if (defaultSharedPreferences.contains(str)) {
                            bundle.putString(str, defaultSharedPreferences.getString(str, null));
                        }
                    }
                    return bundle;
                }
            }).get();
        } catch (InterruptedException unused) {
            Thread.interrupted();
            return null;
        } catch (ExecutionException unused2) {
            return null;
        }
    }

    public final int[] et(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArrJw = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? jw() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        cw0.j6();
        cw0.j6();
        return new int[]{mp.J0(activity, iArrJw[0]), mp.J0(activity, iArrJw[1])};
    }

    public final void g3(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) cw0.v5().FH(p.e9)).booleanValue()) {
            J8(context, str, str2, bundle, z);
        }
    }

    public final boolean gW(Context context) {
        if (this.v5) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new hn(this, null), intentFilter);
        this.v5 = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[Catch: all -> 0x0043, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x000d, B:11:0x0037, B:12:0x0041, B:10:0x0025), top: B:18:0x0009, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean kQ(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            monitor-enter(r3)     // Catch: java.util.regex.PatternSyntaxException -> L46
            java.util.regex.Pattern r0 = r3.VH     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L25
            com.google.android.gms.internal.ads.e<java.lang.String> r0 = com.google.android.gms.internal.ads.p.XX     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.internal.ads.m r2 = com.google.android.gms.internal.ads.cw0.v5()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r2.FH(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L43
            java.util.regex.Pattern r2 = r3.VH     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r2.pattern()     // Catch: java.lang.Throwable -> L43
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L37
        L25:
            com.google.android.gms.internal.ads.e<java.lang.String> r0 = com.google.android.gms.internal.ads.p.XX     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.internal.ads.m r2 = com.google.android.gms.internal.ads.cw0.v5()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r2.FH(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L43
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.Throwable -> L43
            r3.VH = r0     // Catch: java.lang.Throwable -> L43
        L37:
            java.util.regex.Pattern r0 = r3.VH     // Catch: java.lang.Throwable -> L43
            java.util.regex.Matcher r4 = r0.matcher(r4)     // Catch: java.lang.Throwable -> L43
            boolean r4 = r4.matches()     // Catch: java.lang.Throwable -> L43
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            return r4
        L43:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            throw r4     // Catch: java.util.regex.PatternSyntaxException -> L46
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bn.kQ(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean lg(android.view.View r4, android.os.PowerManager r5, android.app.KeyguardManager r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.bn r0 = com.google.android.gms.ads.internal.w0.v5()
            boolean r0 = r0.DW
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1d
            if (r6 != 0) goto Le
            r6 = 0
            goto L12
        Le:
            boolean r6 = r6.inKeyguardRestrictedInputMode()
        L12:
            if (r6 == 0) goto L1d
            boolean r6 = ko(r4)
            if (r6 == 0) goto L1b
            goto L1d
        L1b:
            r6 = 0
            goto L1e
        L1d:
            r6 = 1
        L1e:
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L63
            boolean r0 = r4.isShown()
            if (r0 == 0) goto L63
            if (r5 == 0) goto L35
            boolean r5 = r5.isScreenOn()
            if (r5 == 0) goto L33
            goto L35
        L33:
            r5 = 0
            goto L36
        L35:
            r5 = 1
        L36:
            if (r5 == 0) goto L63
            if (r6 == 0) goto L63
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.p.pN
            com.google.android.gms.internal.ads.m r6 = com.google.android.gms.internal.ads.cw0.v5()
            java.lang.Object r5 = r6.FH(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L62
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r4.getLocalVisibleRect(r5)
            if (r5 != 0) goto L62
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r4 = r4.getGlobalVisibleRect(r5)
            if (r4 == 0) goto L63
        L62:
            return r1
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bn.lg(android.view.View, android.os.PowerManager, android.app.KeyguardManager):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final String sG(final Context context) {
        if (!((Boolean) cw0.v5().FH(p.DP)).booleanValue()) {
            return "";
        }
        try {
            return (String) zm.j6(new Callable(this, context) { // from class: com.google.android.gms.internal.ads.cn
                private final Context j6;

                {
                    this.j6 = context;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return !((Boolean) cw0.v5().FH(p.DP)).booleanValue() ? "" : this.j6.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
                }
            }).get();
        } catch (InterruptedException unused) {
            Thread.interrupted();
            return "";
        } catch (ExecutionException unused2) {
            return "";
        }
    }

    public final JSONObject tp(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return OW(bundle);
            } catch (JSONException e) {
                xp.Hw("Error converting Bundle to JSON", e);
            }
        }
        return null;
    }

    public final int[] wc(Activity activity) {
        int[] iArrJJ = jJ(activity);
        cw0.j6();
        cw0.j6();
        return new int[]{mp.J0(activity, iArrJJ[0]), mp.J0(activity, iArrJJ[1])};
    }

    public final boolean yS(Context context) {
        if (this.Hw) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new in(this, null), intentFilter);
        this.Hw = true;
        return true;
    }
}
