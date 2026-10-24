package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

@jg
/* loaded from: classes.dex */
public final class mp {
    public static final Handler j6 = new Handler(Looper.getMainLooper());
    private static final String DW = AdView.class.getName();
    private static final String FH = InterstitialAd.class.getName();
    private static final String Hw = PublisherAdView.class.getName();
    private static final String v5 = PublisherInterstitialAd.class.getName();
    private static final String Zo = SearchAdView.class.getName();
    private static final String VH = com.google.android.gms.ads.b.class.getName();

    public static int DW(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    public static boolean EQ() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static String FH(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String className;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                className = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (DW.equalsIgnoreCase(className2) || FH.equalsIgnoreCase(className2) || Hw.equalsIgnoreCase(className2) || v5.equalsIgnoreCase(className2) || Zo.equalsIgnoreCase(className2) || VH.equalsIgnoreCase(className2))) {
                break;
            }
            i2 = i;
        }
        className = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            int i3 = 2;
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        break;
                    }
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                    i3 = i4;
                }
                str = sb.toString();
            }
            if (className != null && !className.contains(str)) {
                return className;
            }
        }
        return null;
    }

    public static int J0(Context context, int i) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return J8(displayMetrics, i);
    }

    public static int J8(DisplayMetrics displayMetrics, int i) {
        return Math.round(i / displayMetrics.density);
    }

    public static int Mr(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static String QX(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return null;
        }
        return Settings.Secure.getString(contentResolver, "android_id");
    }

    public static Throwable U2(Throwable th) {
        if (((Boolean) cw0.v5().FH(p.v5)).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (rN(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                        arrayList.add(stackTraceElement);
                    } else {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
            }
            if (z) {
                th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    private final void VH(ViewGroup viewGroup, zzwf zzwfVar, String str, int i, int i2) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setBackgroundColor(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i);
        int iJ6 = j6(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(zzwfVar.k2 - iJ6, zzwfVar.jw - iJ6, 17));
        viewGroup.addView(frameLayout, zzwfVar.k2, zzwfVar.jw);
    }

    public static String Ws(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || tp()) {
            string = "emulator";
        }
        return lg(string);
    }

    public static boolean XL(Context context) {
        int iU7 = com.google.android.gms.common.c.VH().u7(context, 12451000);
        return iU7 == 0 || iU7 == 2;
    }

    public static boolean a8(Context context, int i) {
        return com.google.android.gms.common.c.VH().u7(context, i) == 0;
    }

    public static boolean aM(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600;
    }

    @TargetApi(ProxyTextView.INPUTTYPE_textUri)
    public static boolean j3(Context context) {
        int iIntValue;
        int iIntValue2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (com.google.android.gms.common.util.o.Hw()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            iIntValue = displayMetrics.heightPixels;
            iIntValue2 = displayMetrics.widthPixels;
        } else {
            try {
                iIntValue = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                iIntValue2 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.heightPixels == iIntValue && displayMetrics.widthPixels == iIntValue2;
    }

    public static int j6(Context context, int i) {
        return DW(context.getResources().getDisplayMetrics(), i);
    }

    public static String lg(String str) throws NoSuchAlgorithmException {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public static boolean rN(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) cw0.v5().FH(p.Zo))) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(jg.class);
        } catch (Exception e) {
            String strValueOf = String.valueOf(str);
            xp.FH(strValueOf.length() != 0 ? "Fail to check class type for class ".concat(strValueOf) : new String("Fail to check class type for class "), e);
            return false;
        }
    }

    public static boolean tp() {
        return Build.DEVICE.startsWith("generic");
    }

    public static void u7(boolean z, HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    public static void v5(Context context, String str, String str2, Bundle bundle, boolean z, pp ppVar) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString("os", Build.VERSION.RELEASE);
            bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
            bundle.putString("appid", applicationContext.getPackageName());
            if (str == null) {
                int iDW = com.google.android.gms.common.c.VH().DW(context);
                StringBuilder sb = new StringBuilder(20);
                sb.append(iDW);
                sb.append(".14300000");
                str = sb.toString();
            }
            bundle.putString("js", str);
        }
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        ppVar.j6(builderAppendQueryParameter.toString());
    }

    public static String we() throws NoSuchAlgorithmException {
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return string;
    }

    public final void Hw(Context context, String str, String str2, Bundle bundle, boolean z) {
        v5(context, str, str2, bundle, true, new np(this));
    }

    public final void Zo(ViewGroup viewGroup, zzwf zzwfVar, String str) {
        VH(viewGroup, zzwfVar, str, -16777216, -1);
    }

    public final void gn(ViewGroup viewGroup, zzwf zzwfVar, String str, String str2) {
        xp.u7(str2);
        VH(viewGroup, zzwfVar, str, -65536, -16777216);
    }
}
