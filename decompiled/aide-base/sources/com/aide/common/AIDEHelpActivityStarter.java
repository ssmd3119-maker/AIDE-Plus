package com.aide.common;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;

@cy(clazz = 25807906368923679L, container = 25807906368923679L, user = true)
/* loaded from: classes.dex */
public class AIDEHelpActivityStarter {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(AIDEHelpActivityStarter.class);
    }

    @ey(method = -1138262667049135968L)
    public AIDEHelpActivityStarter() {
        try {
            if (j6) {
                iy.gn(5259265791924431892L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 5259265791924431892L, null);
            }
            throw th;
        }
    }

    @ey(method = -5663612286177507103L)
    public static void DW(Activity activity, String str, String str2) {
        try {
            if (j6) {
                iy.we(-3438868607491549925L, null, activity, str, str2);
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(activity, "com.aide.ui.activities.HelpViewActivity"));
            intent.putExtra("EXTRA_URL", str);
            intent.putExtra("EXTRA_CAT", str2);
            intent.addFlags(268435456);
            intent.addFlags(4096);
            j6(activity, intent);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -3438868607491549925L, null, activity, str, str2);
            }
            throw th;
        }
    }

    private static /* synthetic */ void j6(Object obj, Intent intent) {
        ((Activity) obj).startActivity(intent);
        iy.BT(obj, intent);
    }
}
