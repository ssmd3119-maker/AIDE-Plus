package com.aide.ui.debugger;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

@cy(clazz = -2166214085823675229L, container = -2166214085823675229L, user = true)
/* loaded from: classes.dex */
public class a {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(a.class);
    }

    @ey(method = -4514423466604416L)
    public a() {
        try {
            if (j6) {
                iy.gn(-21893438031947136L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -21893438031947136L, null);
            }
            throw th;
        }
    }

    @ey(method = 7075872633897210099L)
    public static void DW(Context context, String str) {
        try {
            if (j6) {
                iy.EQ(-7019756002085584037L, null, context, str);
            }
            Intent intent = new Intent();
            intent.setPackage(str);
            intent.setAction("com.adrt.DISCONNECT");
            context.sendBroadcast(intent);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -7019756002085584037L, null, context, str);
            }
            throw th;
        }
    }

    @ey(method = -2057081755515093168L)
    public static void FH(Context context, String str, String str2) {
        try {
            if (j6) {
                iy.we(-212459585372817552L, null, context, str, str2);
            }
            Intent intent = new Intent();
            intent.setPackage(str);
            intent.setAction("com.adrt.GET_FIELDS");
            intent.putExtra("path", str2);
            context.sendBroadcast(intent);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -212459585372817552L, null, context, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -291191076373341489L)
    public static void Hw(Context context, String str) {
        try {
            if (j6) {
                iy.EQ(659328601534059303L, null, context, str);
            }
            Intent intent = new Intent();
            intent.setPackage(str);
            intent.setAction("com.adrt.KILL");
            context.sendBroadcast(intent);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 659328601534059303L, null, context, str);
            }
            throw th;
        }
    }

    @ey(method = 1932464750687165808L)
    public static void VH(Context context, String str) {
        try {
            if (j6) {
                iy.EQ(-2583986050371316912L, null, context, str);
            }
            Intent intent = new Intent();
            intent.setPackage(str);
            intent.setAction("com.adrt.STEP_IN");
            context.sendBroadcast(intent);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -2583986050371316912L, null, context, str);
            }
            throw th;
        }
    }

    @ey(method = -764495984021184800L)
    public static void Zo(Context context, String str, ArrayList<String> arrayList) {
        try {
            if (j6) {
                iy.we(3544907813734325328L, null, context, str, arrayList);
            }
            Intent intent = new Intent();
            intent.setPackage(str);
            intent.setAction("com.adrt.RESUME");
            intent.putExtra("breakpoints", arrayList);
            context.sendBroadcast(intent);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 3544907813734325328L, null, context, str, arrayList);
            }
            throw th;
        }
    }

    @ey(method = 1909322691834736685L)
    public static void gn(Context context, String str) {
        try {
            if (j6) {
                iy.EQ(1967225791859342293L, null, context, str);
            }
            Intent intent = new Intent();
            intent.setPackage(str);
            intent.setAction("com.adrt.STEP_OUT");
            context.sendBroadcast(intent);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1967225791859342293L, null, context, str);
            }
            throw th;
        }
    }

    @ey(method = 2061390106898045347L)
    public static void j6(Context context, String str, ArrayList<String> arrayList) {
        try {
            if (j6) {
                iy.we(-980888569243410389L, null, context, str, arrayList);
            }
            Intent intent = new Intent();
            intent.setPackage(str);
            intent.setAction("com.adrt.SET_BREAKPOINTS");
            intent.putStringArrayListExtra("breakpoints", arrayList);
            context.sendBroadcast(intent);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -980888569243410389L, null, context, str, arrayList);
            }
            throw th;
        }
    }

    @ey(method = 2420121633716321085L)
    public static void u7(Context context, String str) {
        try {
            if (j6) {
                iy.EQ(1015145722550728725L, null, context, str);
            }
            Intent intent = new Intent();
            intent.setPackage(str);
            intent.setAction("com.adrt.STEP_OVER");
            context.sendBroadcast(intent);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1015145722550728725L, null, context, str);
            }
            throw th;
        }
    }

    @ey(method = -2350128270631520460L)
    public static void v5(Context context, String str) {
        try {
            if (j6) {
                iy.EQ(414597785526560900L, null, context, str);
            }
            Zo(context, str, null);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 414597785526560900L, null, context, str);
            }
            throw th;
        }
    }
}
