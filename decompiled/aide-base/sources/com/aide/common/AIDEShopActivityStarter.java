package com.aide.common;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;

@cy(clazz = -1052730398773059792L, container = -1052730398773059792L, user = true)
/* loaded from: classes.dex */
public class AIDEShopActivityStarter {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(AIDEShopActivityStarter.class);
    }

    @ey(method = -3095109581355918491L)
    public AIDEShopActivityStarter() {
        try {
            if (j6) {
                iy.gn(-2962499628609957195L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2962499628609957195L, null);
            }
            throw th;
        }
    }

    @ey(method = 2089951284885838576L)
    public static void DW(Activity activity, int i, String str, boolean z, boolean z2) {
        try {
            if (j6) {
                iy.J8(-1613045651623607565L, null, activity, new Integer(i), str, new Boolean(z), new Boolean(z2));
            }
            Intent intent = new Intent();
            intent.putExtra("EXTRA_LINKID", str);
            intent.putExtra("EXTRA_HILIGHT_ADS", z);
            intent.putExtra("EXTRA_IS_OPTIONAL_OFFER", z2);
            intent.setComponent(new ComponentName(activity, "com.aide.ui.activities.ShopExpertPopupActivity"));
            if (i == 0) {
                j6(activity, intent);
            } else {
                activity.startActivityForResult(intent, i);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.lg(th, -1613045651623607565L, null, activity, new Integer(i), str, new Boolean(z), new Boolean(z2));
            }
            throw th;
        }
    }

    @ey(method = -7182040922775562347L)
    public static void FH(Activity activity, int i, String str, String str2, boolean z) {
        try {
            if (j6) {
                iy.J8(-4398990657079797208L, null, activity, new Integer(i), str, str2, new Boolean(z));
            }
            Intent intent = new Intent();
            intent.putExtra("EXTRA_LINKID", str2);
            intent.putExtra("EXTRA_IS_OPTIONAL_OFFER", z);
            intent.setComponent(new ComponentName(activity, "com.aide.ui.activities.ShopLearningPopupActivity"));
            intent.putExtra("EXTRA_FEATURE", str);
            intent.putExtra("EXTRA_SHOW_PRIME_MONTHLY", true);
            intent.putExtra("EXTRA_SHOW_PRIME_YEARLY", true);
            if (i == 0) {
                j6(activity, intent);
            } else {
                activity.startActivityForResult(intent, i);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.lg(th, -4398990657079797208L, null, activity, new Integer(i), str, str2, new Boolean(z));
            }
            throw th;
        }
    }

    private static /* synthetic */ void j6(Object obj, Intent intent) {
        ((Activity) obj).startActivity(intent);
        iy.BT(obj, intent);
    }
}
