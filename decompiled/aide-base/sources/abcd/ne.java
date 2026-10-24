package abcd;

import com.aide.ui.util.FileSystem;

@cy(clazz = 1337701946479526635L, container = 1337701946479526635L, user = true)
/* loaded from: classes.dex */
public class ne {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ne.class);
    }

    @ey(method = 2152101804760468759L)
    public ne() {
        try {
            if (j6) {
                iy.gn(3395792030015222540L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3395792030015222540L, null);
            }
            throw th;
        }
    }

    @ey(method = 6829803446617169119L)
    private static boolean DW(String str) {
        try {
            if (j6) {
                iy.tp(-893919017838884040L, null, str);
            }
            if ("www".equals(FileSystem.getName(str))) {
                if ("assets".equals(FileSystem.getName(FileSystem.getParent(str)))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -893919017838884040L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 6853681783156293560L)
    private static boolean FH(String str) {
        try {
            if (j6) {
                iy.tp(-5396024280364239711L, null, str);
            }
            if (FileSystem.exists(str + "/www")) {
                if (FileSystem.exists(str + "/.cordova")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -5396024280364239711L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 5922068630664778300L)
    private static boolean Hw(String str) {
        try {
            if (j6) {
                iy.tp(-1668961171743419983L, null, str);
            }
            if ("www".equals(FileSystem.getName(str))) {
                if (FH(FileSystem.getParent(str))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1668961171743419983L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -4494912294477590192L)
    public static boolean Zo(String str) {
        try {
            if (j6) {
                iy.tp(5938096640218703043L, null, str);
            }
            if (j6(str) != null && !Hw(str)) {
                if (!DW(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 5938096640218703043L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -1525386218461600880L)
    public static String j6(String str) {
        try {
            if (j6) {
                iy.tp(-4522687914940484133L, null, str);
            }
            if (FileSystem.exists(str + "/index.html")) {
                return str + "/index.html";
            }
            if (!FileSystem.exists(str + "/index.htm")) {
                return null;
            }
            return str + "/index.htm";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4522687914940484133L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 175039530459704304L)
    public static boolean v5(String str) {
        try {
            if (j6) {
                iy.tp(1378245637672252941L, null, str);
            }
            if (!str.toLowerCase().endsWith(".html")) {
                if (!str.toLowerCase().endsWith(".htm")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1378245637672252941L, null, str);
            }
            throw th;
        }
    }
}
