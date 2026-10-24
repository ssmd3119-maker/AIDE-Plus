package com.google.android.gms.common.internal;

import abcd.su;
import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class e {

    @GuardedBy("sCache")
    private static final SimpleArrayMap<String, String> j6 = new SimpleArrayMap<>();

    public static String DW(Context context) {
        return context.getResources().getString(su.common_google_play_services_notification_channel_name);
    }

    public static String FH(Context context, int i) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(su.common_google_play_services_enable_button) : resources.getString(su.common_google_play_services_update_button) : resources.getString(su.common_google_play_services_install_button);
    }

    public static String Hw(Context context, int i) {
        Resources resources = context.getResources();
        String strJ6 = j6(context);
        if (i == 1) {
            return resources.getString(su.common_google_play_services_install_text, strJ6);
        }
        if (i == 2) {
            return com.google.android.gms.common.util.i.v5(context) ? resources.getString(su.common_google_play_services_wear_update_text) : resources.getString(su.common_google_play_services_update_text, strJ6);
        }
        if (i == 3) {
            return resources.getString(su.common_google_play_services_enable_text, strJ6);
        }
        if (i == 5) {
            return u7(context, "common_google_play_services_invalid_account_text", strJ6);
        }
        if (i == 7) {
            return u7(context, "common_google_play_services_network_error_text", strJ6);
        }
        if (i == 9) {
            return resources.getString(su.common_google_play_services_unsupported_text, strJ6);
        }
        if (i == 20) {
            return u7(context, "common_google_play_services_restricted_profile_text", strJ6);
        }
        switch (i) {
            case 16:
                return u7(context, "common_google_play_services_api_unavailable_text", strJ6);
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                return u7(context, "common_google_play_services_sign_in_failed_text", strJ6);
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                return resources.getString(su.common_google_play_services_updating_text, strJ6);
            default:
                return resources.getString(com.google.android.gms.common.i.common_google_play_services_unknown_issue, strJ6);
        }
    }

    public static String VH(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(su.common_google_play_services_install_title);
            case 2:
                return resources.getString(su.common_google_play_services_update_title);
            case 3:
                return resources.getString(su.common_google_play_services_enable_title);
            case 4:
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return gn(context, "common_google_play_services_invalid_account_title");
            case UserTouchAction.CLICK_KIND /* 7 */:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return gn(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return gn(context, "common_google_play_services_sign_in_failed_title");
            case ProxyTextView.INPUTTYPE_date /* 20 */:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return gn(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String Zo(Context context, int i) {
        String strGn = i == 6 ? gn(context, "common_google_play_services_resolution_required_title") : VH(context, i);
        return strGn == null ? context.getResources().getString(su.common_google_play_services_notification_ticker) : strGn;
    }

    private static String gn(Context context, String str) {
        synchronized (j6) {
            String str2 = j6.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources resourcesHw = com.google.android.gms.common.f.Hw(context);
            if (resourcesHw == null) {
                return null;
            }
            int identifier = resourcesHw.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String strValueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", strValueOf.length() != 0 ? "Missing resource: ".concat(strValueOf) : new String("Missing resource: "));
                return null;
            }
            String string = resourcesHw.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                j6.put(str, string);
                return string;
            }
            String strValueOf2 = String.valueOf(str);
            Log.w("GoogleApiAvailability", strValueOf2.length() != 0 ? "Got empty resource: ".concat(strValueOf2) : new String("Got empty resource: "));
            return null;
        }
    }

    public static String j6(Context context) {
        String packageName = context.getPackageName();
        try {
            return com.google.android.gms.common.wrappers.b.j6(context).Hw(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    private static String u7(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strGn = gn(context, str);
        if (strGn == null) {
            strGn = resources.getString(com.google.android.gms.common.i.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strGn, str2);
    }

    public static String v5(Context context, int i) {
        return i == 6 ? u7(context, "common_google_play_services_resolution_required_text", j6(context)) : Hw(context, i);
    }
}
