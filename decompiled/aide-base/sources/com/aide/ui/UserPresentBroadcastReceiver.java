package com.aide.ui;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cy(clazz = 1770983406591680232L, container = 1770983406591680232L, user = true)
/* loaded from: classes.dex */
public class UserPresentBroadcastReceiver extends BroadcastReceiver {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = 17552612737408700L)
    private static List<UserPresent> j6;

    static {
        try {
            iy.Zo(UserPresentBroadcastReceiver.class);
            if (DW) {
                iy.gn(5857911290733309L, null);
            }
            j6 = new ArrayList();
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 5857911290733309L, null);
            }
            throw th;
        }
    }

    @ey(method = -139207326005273913L)
    public UserPresentBroadcastReceiver() {
        try {
            if (DW) {
                iy.gn(-563835753548286363L, null);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -563835753548286363L, null);
            }
            throw th;
        }
    }

    @ey(method = 1276573167914108232L)
    public static void DW(Context context, UserPresent userPresent) {
        try {
            if (DW) {
                iy.EQ(556530166429518396L, null, context, userPresent);
            }
            if (j6(context)) {
                userPresent.j6(context);
            } else {
                j6.add(userPresent);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, 556530166429518396L, null, context, userPresent);
            }
            throw th;
        }
    }

    @ey(method = -2543163155347239376L)
    private static boolean j6(Context context) {
        try {
            if (DW) {
                iy.tp(543601946910737892L, null, context);
            }
            return Build.VERSION.SDK_INT >= 20 ? ((PowerManager) context.getSystemService("power")).isInteractive() : ((PowerManager) context.getSystemService("power")).isScreenOn();
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 543601946910737892L, null, context);
            }
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    @ey(method = -477434099165274240L)
    public void onReceive(Context context, Intent intent) {
        try {
            if (DW) {
                iy.EQ(858345034516721504L, this, context, intent);
            }
            if (intent.getAction().equals("android.intent.action.USER_PRESENT")) {
                Iterator<UserPresent> it = j6.iterator();
                while (it.hasNext()) {
                    it.next().j6(context);
                }
                j6.clear();
            }
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, 858345034516721504L, this, context, intent);
            }
            throw th;
        }
    }
}
