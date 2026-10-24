package com.aide.ui;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.SharedPreferences;
import com.aide.common.AndroidHelper;
import java.util.GregorianCalendar;

@cy(clazz = 1544747855624417808L, container = 1544747855624417808L, user = true)
/* loaded from: classes.dex */
public class n {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = -2229511087616035200L)
    private static final GregorianCalendar j6;

    static {
        try {
            iy.Zo(n.class);
            if (DW) {
                iy.gn(3519045295986092976L, null);
            }
            j6 = new GregorianCalendar(2014, 11, 31);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 3519045295986092976L, null);
            }
            throw th;
        }
    }

    @ey(method = 289677063031266792L)
    public n() {
        try {
            if (DW) {
                iy.gn(1135054216367844048L, null);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 1135054216367844048L, null);
            }
            throw th;
        }
    }

    @ey(method = -2374828305473056095L)
    public static GregorianCalendar DW() {
        try {
            if (DW) {
                iy.gn(-1402700000807205867L, null);
            }
            long jV5 = v5("PrimeYearlyPromoAIDE3");
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(jV5 + 172800000);
            gregorianCalendar.set(11, 0);
            gregorianCalendar.set(12, 0);
            gregorianCalendar.set(13, 0);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -1402700000807205867L, null);
            }
            throw th;
        }
    }

    @ey(method = 327239781966313667L)
    public static boolean EQ() {
        try {
            if (DW) {
                iy.gn(2070024968310927651L, null);
            }
            if ((ServiceContainer.P8.equals("com.aide.ui") || ServiceContainer.P8.equals("com.aide.web")) && !AndroidHelper.er()) {
                return Zo(DW());
            }
            return false;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 2070024968310927651L, null);
            }
            throw th;
        }
    }

    @ey(method = -1063381659971796904L)
    public static GregorianCalendar FH() {
        try {
            if (DW) {
                iy.gn(7074549384881408200L, null);
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(ServiceContainer.getMainActivity().ef() + 3600000);
            return gregorianCalendar;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 7074549384881408200L, null);
            }
            throw th;
        }
    }

    @ey(method = 898742947953973305L)
    public static GregorianCalendar Hw() {
        try {
            if (DW) {
                iy.gn(-29768830912166151L, null);
            }
            return j6;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -29768830912166151L, null);
            }
            throw th;
        }
    }

    @ey(method = 2926460525992076092L)
    private static boolean VH(GregorianCalendar gregorianCalendar) {
        try {
            if (DW) {
                iy.tp(-2300524218951980528L, null, gregorianCalendar);
            }
            GregorianCalendar gregorianCalendar2 = (GregorianCalendar) gregorianCalendar.clone();
            gregorianCalendar2.add(5, 1);
            return new GregorianCalendar().before(gregorianCalendar2);
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -2300524218951980528L, null, gregorianCalendar);
            }
            throw th;
        }
    }

    @ey(method = 1837439613423921496L)
    private static boolean Zo(GregorianCalendar gregorianCalendar) {
        try {
            if (DW) {
                iy.tp(-3089256433869593240L, null, gregorianCalendar);
            }
            GregorianCalendar gregorianCalendar2 = (GregorianCalendar) gregorianCalendar.clone();
            gregorianCalendar2.add(5, 1);
            return new GregorianCalendar().before(gregorianCalendar2);
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -3089256433869593240L, null, gregorianCalendar);
            }
            throw th;
        }
    }

    @ey(method = -1124742526850043952L)
    public static boolean gn() {
        try {
            if (DW) {
                iy.gn(-414800339531208208L, null);
            }
            return VH(j6());
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -414800339531208208L, null);
            }
            throw th;
        }
    }

    @ey(method = 1842201291028817452L)
    public static GregorianCalendar j6() {
        try {
            if (DW) {
                iy.gn(-5864803066035654528L, null);
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            long jTp = ServiceContainer.getLicenseService().tp();
            if (jTp == -1) {
                jTp = System.currentTimeMillis();
            }
            gregorianCalendar.setTimeInMillis(jTp);
            gregorianCalendar.add(5, 1);
            return gregorianCalendar;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -5864803066035654528L, null);
            }
            throw th;
        }
    }

    @ey(method = 4681062239569090580L)
    public static boolean tp() {
        try {
            if (!DW) {
                return false;
            }
            iy.gn(-6842438264392053360L, null);
            return false;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -6842438264392053360L, null);
            }
            throw th;
        }
    }

    @ey(method = 2657549861321711405L)
    public static boolean u7() {
        try {
            if (DW) {
                iy.gn(-704588948871542487L, null);
            }
            if (!ServiceContainer.P8.equals("com.aide.ui")) {
                return false;
            }
            if (!ServiceContainer.getLicenseService().QX() && !ServiceContainer.getLicenseService().U2()) {
                if (!ServiceContainer.getLicenseService().J0()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -704588948871542487L, null);
            }
            throw th;
        }
    }

    @ey(method = 5505632028329858400L)
    private static long v5(String str) {
        try {
            if (DW) {
                iy.tp(3790871017563029816L, null, str);
            }
            SharedPreferences sharedPreferences = ServiceContainer.getContext().getSharedPreferences("StartTimes", 0);
            long j = sharedPreferences.getLong(str, 0L);
            if (j != 0) {
                return j;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            sharedPreferences.edit().putLong(str, jCurrentTimeMillis).commit();
            return jCurrentTimeMillis;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 3790871017563029816L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -2042596010547972809L)
    public static boolean we() {
        try {
            if (DW) {
                iy.gn(1555899865405663203L, null);
            }
            if (!ServiceContainer.P8.equals("com.aide.ui") || AndroidHelper.er()) {
                return false;
            }
            return Zo(Hw());
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 1555899865405663203L, null);
            }
            throw th;
        }
    }
}
