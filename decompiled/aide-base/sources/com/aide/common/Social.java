package com.aide.common;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Handler;
import android.text.ClipboardManager;
import android.widget.Toast;
import com.aide.ui.firebase.FireBaseLogEvent;
import java.util.Iterator;
import java.util.List;

@cy(clazz = 2278315543554812120L, container = 2278315543554812120L, user = true)
/* loaded from: classes.dex */
public class Social {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = 3881293302026470225L, container = 2278315543554812120L, user = true)
    static class a implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -1702477997621399537L)
        final /* synthetic */ Context WB;

        @dy(field = -252084881593483505L)
        final /* synthetic */ String mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 382760313565462015L)
        a(Context context, String str) {
            this.WB = context;
            this.mb = str;
        }

        @Override // java.lang.Runnable
        @ey(method = 291534569916151815L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(-1503200473810598400L, this);
                }
                Toast toastMakeText = Toast.makeText(this.WB, "Long press to paste: \"" + this.mb + "\"", 1);
                toastMakeText.setGravity(49, 0, 20);
                toastMakeText.show();
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, -1503200473810598400L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(Social.class);
    }

    @ey(method = 2186420747064025335L)
    public Social() {
        try {
            if (j6) {
                iy.gn(-1657984845315659039L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1657984845315659039L, null);
            }
            throw th;
        }
    }

    @ey(method = -2399186639716216616L)
    public static void DW(Context context) {
        try {
            if (j6) {
                iy.tp(-67386990150457725L, null, context);
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://discourse.android-ide.com"));
            intent.setFlags(1074266112);
            EQ(context, intent);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -67386990150457725L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -4689788718082417315L)
    private static void EQ(Context context, Intent intent) {
        try {
            if (j6) {
                iy.EQ(-4100065459496554356L, null, context, intent);
            }
            try {
                j6(context, intent);
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -4100065459496554356L, null, context, intent);
            }
            throw th;
        }
    }

    @ey(method = 494292477745396477L)
    public static void FH(Context context, String str) {
        try {
            if (j6) {
                iy.EQ(-5737581203096132064L, null, context, str);
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("fb://profile/" + str));
            if (!Zo(context, "com.facebook.katana", intent)) {
                intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/" + str));
            }
            intent.setFlags(1074266112);
            EQ(context, intent);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -5737581203096132064L, null, context, str);
            }
            throw th;
        }
    }

    @ey(method = 95373946246358640L)
    public static void Hw(Context context, String str) {
        try {
            if (j6) {
                iy.EQ(3888963232645036665L, null, context, str);
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://groups.google.com/group/" + str));
            intent.setFlags(1074266112);
            EQ(context, intent);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 3888963232645036665L, null, context, str);
            }
            throw th;
        }
    }

    @ey(method = -3895357638236624484L)
    public static void VH(Context context, String str, String str2, String str3) {
        try {
            if (j6) {
                iy.J0(1248134482885076335L, null, context, str, str2, str3);
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("message/rfc822");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
            intent.putExtra("android.intent.extra.SUBJECT", "AIDE Feedback");
            intent.putExtra("android.intent.extra.TEXT", str3);
            EQ(context, intent);
        } catch (Throwable th) {
            if (DW) {
                iy.a8(th, 1248134482885076335L, null, context, str, str2, str3);
            }
            throw th;
        }
    }

    @ey(method = -1100004955179470971L)
    private static boolean Zo(Context context, String str, Intent intent) {
        try {
            if (j6) {
                iy.we(1665769314048397688L, null, context, str, intent);
            }
            try {
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
                if (listQueryIntentActivities != null && listQueryIntentActivities.size() > 1) {
                    Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                    while (it.hasNext()) {
                        if (str.equals(it.next().activityInfo.applicationInfo.packageName)) {
                            intent.setPackage(str);
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 1665769314048397688L, null, context, str, intent);
            }
            throw th;
        }
    }

    @ey(method = -3051971877877264L)
    public static void gn(Context context, String str, String str2) {
        try {
            if (j6) {
                iy.we(935101392804694423L, null, context, str, str2);
            }
            FireBaseLogEvent.tp("Shared via gplus");
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str + "\n\n" + str2);
            EQ(context, new Intent("android.intent.action.VIEW", Uri.parse("https://discourse.android-ide.com")));
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 935101392804694423L, null, context, str, str2);
            }
            throw th;
        }
    }

    private static /* synthetic */ void j6(Object obj, Intent intent) {
        ((Context) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    @ey(method = -6536326166206489764L)
    public static void tp(Context context, String str, String str2) {
        try {
            if (j6) {
                iy.we(-4181107681177613451L, null, context, str, str2);
            }
            FireBaseLogEvent.tp("Shared via twitter");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("http://www.twitter.com/intent/tweet?url=" + str2 + "&text=" + str));
            Zo(context, "com.twitter.android", intent);
            EQ(context, intent);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -4181107681177613451L, null, context, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -3445631965516619445L)
    public static void u7(Context context, String str, String str2) {
        try {
            if (j6) {
                iy.we(-4609465207998660384L, null, context, str, str2);
            }
            FireBaseLogEvent.tp("Shared via facebook");
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", str);
            intent.putExtra("android.intent.extra.TEXT", str2);
            if (Zo(context, "com.facebook.katana", intent)) {
                ((ClipboardManager) context.getSystemService("clipboard")).setText(str);
                new Handler().postDelayed(new a(context, str), 1000L);
            } else {
                intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/sharer/sharer.php?u=" + str2));
            }
            EQ(context, intent);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -4609465207998660384L, null, context, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 1638789502818196449L)
    public static void v5(Context context, String str, String str2) {
        try {
            if (j6) {
                iy.we(-8197465575402489600L, null, context, str, str2);
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(FireBaseLogEvent.v5(str, str, str2)));
            intent.setFlags(1074266112);
            EQ(context, intent);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -8197465575402489600L, null, context, str, str2);
            }
            throw th;
        }
    }
}
