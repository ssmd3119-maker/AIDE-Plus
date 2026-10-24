package abcd;

import android.content.Context;
import android.content.SharedPreferences;
import com.aide.ui.firebase.FireBaseLogEvent;
import java.util.Map;
import java.util.Random;

@cy(clazz = -631724314935631775L, container = -631724314935631775L, user = true)
/* loaded from: classes.dex */
public class c0 {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(c0.class);
    }

    @ey(method = -2157814432845029545L)
    public c0() {
        try {
            if (j6) {
                iy.gn(400620540988354127L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 400620540988354127L, null);
            }
            throw th;
        }
    }

    @ey(method = 6157569440757240L)
    private static double[] DW(int i) {
        try {
            if (j6) {
                iy.u7(3457582000720596921L, null, i);
            }
            double[] dArr = new double[i];
            for (int i2 = 0; i2 < i; i2++) {
                double d = i;
                Double.isNaN(d);
                dArr[i2] = 1.0d / d;
            }
            return dArr;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3457582000720596921L, null, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -4515226447643989528L)
    private static void EQ(Context context, String str) {
        try {
            if (j6) {
                iy.EQ(742861982389369581L, null, context, str);
            }
            for (Map.Entry<String, ?> entry : v5(context).getAll().entrySet()) {
                tp(context, str, entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 742861982389369581L, null, context, str);
            }
            throw th;
        }
    }

    @ey(method = 3310114134219083920L)
    private static String FH(int i) {
        try {
            if (j6) {
                iy.u7(-2482867755154384323L, null, i);
            }
            return Character.toString((char) (i + 65));
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2482867755154384323L, null, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 216919943116405264L)
    private static int Hw(double... dArr) {
        try {
            if (j6) {
                iy.tp(-1465681611648003165L, null, dArr);
            }
            double dNextDouble = new Random().nextDouble();
            int i = 0;
            double d = 0.0d;
            while (i < dArr.length) {
                d += dArr[i];
                if (d >= dNextDouble) {
                    break;
                }
                i++;
            }
            return i == dArr.length ? dArr.length - 1 : i;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1465681611648003165L, null, dArr);
            }
            throw th;
        }
    }

    @ey(method = 55515493548371232L)
    public static void J0(Context context, String str, int i) {
        try {
            if (j6) {
                iy.we(-3343354739488848623L, null, context, str, new Integer(i));
            }
            SharedPreferences sharedPreferencesV5 = v5(context);
            if (sharedPreferencesV5.contains(str)) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesV5.edit();
            editorEdit.putInt(str, i);
            editorEdit.commit();
            we(str, i);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -3343354739488848623L, null, context, str, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2564314706471698956L)
    public static boolean J8(Context context, String str) {
        try {
            if (j6) {
                iy.EQ(-1449882754732320003L, null, context, str);
            }
            return QX(context, str, DW(2)) != 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -1449882754732320003L, null, context, str);
            }
            throw th;
        }
    }

    @ey(method = -2592903614224386168L)
    public static int QX(Context context, String str, double... dArr) {
        try {
            if (j6) {
                iy.we(-520151565633891585L, null, context, str, dArr);
            }
            SharedPreferences sharedPreferencesV5 = v5(context);
            if (!sharedPreferencesV5.contains(str)) {
                int iHw = Hw(dArr);
                SharedPreferences.Editor editorEdit = sharedPreferencesV5.edit();
                editorEdit.putInt(str, iHw);
                editorEdit.commit();
                we(str, iHw);
            }
            return sharedPreferencesV5.getInt(str, 0);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -520151565633891585L, null, context, str, dArr);
            }
            throw th;
        }
    }

    @ey(method = -1349836698195374361L)
    public static void VH(Context context, String str, boolean z) {
        try {
            if (j6) {
                iy.we(623120749578508000L, null, context, str, new Boolean(z));
            }
            if (aM(context, str, z)) {
                u7(context, str);
                EQ(context, str);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 623120749578508000L, null, context, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 2072752139547930147L)
    public static boolean Ws(Context context, String str, double... dArr) {
        try {
            if (j6) {
                iy.we(6275929751280083520L, null, context, str, dArr);
            }
            return QX(context, str, dArr) != 0;
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 6275929751280083520L, null, context, str, dArr);
            }
            throw th;
        }
    }

    @ey(method = 112551046055288393L)
    private static boolean XL(Context context, String str) {
        try {
            if (j6) {
                iy.EQ(-2885168362231867160L, null, context, str);
            }
            SharedPreferences sharedPreferencesJ6 = j6(context);
            if (sharedPreferencesJ6.getBoolean(str, false)) {
                return false;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesJ6.edit();
            editorEdit.putBoolean(str, true);
            editorEdit.commit();
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -2885168362231867160L, null, context, str);
            }
            throw th;
        }
    }

    @ey(method = -2574610755318712692L)
    public static void Zo(Context context, String str) {
        try {
            if (j6) {
                iy.EQ(-5047671496272181111L, null, context, str);
            }
            if (XL(context, str)) {
                u7(context, str);
                EQ(context, str);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -5047671496272181111L, null, context, str);
            }
            throw th;
        }
    }

    @ey(method = 2014466822845368320L)
    private static boolean aM(Context context, String str, boolean z) {
        try {
            if (j6) {
                iy.we(4389278610342810305L, null, context, str, new Boolean(z));
            }
            SharedPreferences sharedPreferencesJ6 = j6(context);
            boolean z2 = z && sharedPreferencesJ6.contains(str) && !sharedPreferencesJ6.getBoolean(str, false);
            if (!sharedPreferencesJ6.getBoolean(str, false)) {
                SharedPreferences.Editor editorEdit = sharedPreferencesJ6.edit();
                editorEdit.putBoolean(str, z);
                editorEdit.commit();
            }
            return z2;
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 4389278610342810305L, null, context, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -7021083331033308801L)
    public static void gn(Context context, String str, long j) {
        try {
            if (j6) {
                iy.we(2006714162712158244L, null, context, str, new Long(j));
            }
            if (!XL(context, str) || j <= 0) {
                return;
            }
            long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 3600000;
            String str2 = str + "_" + (jCurrentTimeMillis / 24) + "days";
            u7(context, str2);
            EQ(context, str2);
            String str3 = str + "_" + jCurrentTimeMillis + "hours";
            u7(context, str3);
            EQ(context, str3);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 2006714162712158244L, null, context, str, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = -1399776985629449889L)
    private static SharedPreferences j6(Context context) {
        try {
            if (j6) {
                iy.tp(1916053960646527940L, null, context);
            }
            return context.getSharedPreferences("Conversions", 0);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1916053960646527940L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 2278900053720331740L)
    private static void tp(Context context, String str, String str2, int i) {
        try {
            if (j6) {
                iy.J0(5251387218189944427L, null, context, str, str2, new Integer(i));
            }
            FireBaseLogEvent.tp("Group_" + str2 + "_" + str + "_" + FH(i));
        } catch (Throwable th) {
            if (DW) {
                iy.a8(th, 5251387218189944427L, null, context, str, str2, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2412988057358639712L)
    private static void u7(Context context, String str) {
        try {
            if (j6) {
                iy.EQ(815116290126791247L, null, context, str);
            }
            FireBaseLogEvent.tp("Conversion_" + str);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 815116290126791247L, null, context, str);
            }
            throw th;
        }
    }

    @ey(method = -1403905902894147609L)
    private static SharedPreferences v5(Context context) {
        try {
            if (j6) {
                iy.tp(1853143184556849504L, null, context);
            }
            return context.getSharedPreferences("SplitTests", 0);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1853143184556849504L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -5025945382804827359L)
    private static void we(String str, int i) {
        try {
            if (j6) {
                iy.EQ(4470573123673594140L, null, str, new Integer(i));
            }
            FireBaseLogEvent.tp("Group_" + str + "_" + FH(i));
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 4470573123673594140L, null, str, new Integer(i));
            }
            throw th;
        }
    }
}
