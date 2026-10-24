package com.aide.common;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;

@cy(clazz = -1634593899566973744L, container = -1634593899566973744L, user = true)
/* loaded from: classes.dex */
public class AIDEActivityStarter {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(AIDEActivityStarter.class);
    }

    @ey(method = -397053567254987551L)
    public AIDEActivityStarter() {
        try {
            if (j6) {
                iy.gn(-1639981664315042440L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1639981664315042440L, null);
            }
            throw th;
        }
    }

    @ey(method = -225471005994609408L)
    public static void DW(Activity activity, String str, int i, int i2) {
        try {
            if (j6) {
                iy.J0(-1738949567178440340L, null, activity, str, new Integer(i), new Integer(i2));
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(activity, "com.aide.ui.MainActivity"));
            intent.putExtra("NavigateFile", str);
            intent.putExtra("NavigateLine", i);
            intent.putExtra("NavigateColumn", i2);
            intent.addFlags(67108864);
            j6(activity, intent);
        } catch (Throwable th) {
            if (DW) {
                iy.a8(th, -1738949567178440340L, null, activity, str, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    private static /* synthetic */ void j6(Object obj, Intent intent) {
        ((Activity) obj).startActivity(intent);
        iy.BT(obj, intent);
    }
}
