package com.aide.ui.preferences;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;
import com.aide.codemodel.language.java.JavaFormatOption;
import com.aide.codemodel.language.js.JavaScriptFormatterOption;
import com.aide.ui.ServiceContainer;

@cy(clazz = -4279537788465023376L, container = -4279537788465023376L, user = true)
/* loaded from: classes.dex */
public class a {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(a.class);
    }

    @ey(method = 1508267563685258012L)
    public a() {
        try {
            if (j6) {
                iy.gn(-512342087741497743L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -512342087741497743L, null);
            }
            throw th;
        }
    }

    @ey(method = 6897487578611425035L)
    public static void DW(Context context, PreferenceScreen preferenceScreen) {
        try {
            PreferenceCategory preferenceCategory = null;
            if (j6) {
                iy.EQ(-6390746408990753400L, null, context, preferenceScreen);
            }
            for (JavaFormatOption javaFormatOption : JavaFormatOption.values()) {
                if (preferenceCategory == null || !preferenceCategory.getTitle().equals(javaFormatOption.DW())) {
                    preferenceCategory = new PreferenceCategory(context);
                    preferenceCategory.setTitle(javaFormatOption.DW());
                    preferenceScreen.addPreference(preferenceCategory);
                }
                PremiumCheckBoxPreference premiumCheckBoxPreference = new PremiumCheckBoxPreference(context);
                premiumCheckBoxPreference.setKey(javaFormatOption.FH());
                premiumCheckBoxPreference.setTitle(javaFormatOption.getName());
                if (javaFormatOption.v5(false).length() > 0) {
                    premiumCheckBoxPreference.setSummary(("\"" + javaFormatOption.v5(false).replace("\n", "\\n") + "\"") + " versus " + ("\"" + javaFormatOption.v5(true).replace("\n", "\\n") + "\""));
                }
                preferenceCategory.addPreference(premiumCheckBoxPreference);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -6390746408990753400L, null, context, preferenceScreen);
            }
            throw th;
        }
    }

    @ey(method = 3705761166443667656L)
    public static void FH(Context context, PreferenceScreen preferenceScreen) {
        try {
            PreferenceCategory preferenceCategory = null;
            if (j6) {
                iy.EQ(-6107569869657035195L, null, context, preferenceScreen);
            }
            for (JavaScriptFormatterOption javaScriptFormatterOption : JavaScriptFormatterOption.values()) {
                if (preferenceCategory == null || !preferenceCategory.getTitle().equals(javaScriptFormatterOption.DW())) {
                    preferenceCategory = new PreferenceCategory(context);
                    preferenceCategory.setTitle(javaScriptFormatterOption.DW());
                    preferenceScreen.addPreference(preferenceCategory);
                }
                PremiumCheckBoxPreference premiumCheckBoxPreference = new PremiumCheckBoxPreference(context);
                premiumCheckBoxPreference.setKey(javaScriptFormatterOption.FH());
                premiumCheckBoxPreference.setTitle(javaScriptFormatterOption.getName());
                if (javaScriptFormatterOption.v5(false).length() > 0) {
                    premiumCheckBoxPreference.setSummary(("\"" + javaScriptFormatterOption.v5(false).replace("\n", "\\n") + "\"") + " versus " + ("\"" + javaScriptFormatterOption.v5(true).replace("\n", "\\n") + "\""));
                }
                preferenceCategory.addPreference(premiumCheckBoxPreference);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -6107569869657035195L, null, context, preferenceScreen);
            }
            throw th;
        }
    }

    @ey(method = 2409988959012460792L)
    public static void j6(Context context, PreferenceScreen preferenceScreen) {
        try {
            if (j6) {
                iy.EQ(1653182198676246961L, null, context, preferenceScreen);
            }
            if (ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.phonegap") || ServiceContainer.P8.equals("com.aide.web")) {
                FH(context, preferenceScreen);
            }
            if (ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.ui")) {
                DW(context, preferenceScreen);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1653182198676246961L, null, context, preferenceScreen);
            }
            throw th;
        }
    }
}
