package abcd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@cy(clazz = 5954351271705613112L, container = 5954351271705613112L, user = true)
/* loaded from: classes.dex */
public class xd {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(xd.class);
    }

    @ey(method = -611643171542039040L)
    public xd() {
        try {
            if (j6) {
                iy.gn(-1661105084502740968L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1661105084502740968L, null);
            }
            throw th;
        }
    }

    @ey(method = 1059576926652699336L)
    private static void DW(String str, Map<String, List<String>> map, Map<String, List<String>> map2) {
        try {
            if (j6) {
                iy.we(-1739145866213029132L, null, str, map, map2);
            }
            if (map2.containsKey(str)) {
                return;
            }
            List<String> arrayList = map.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            map2.put(str, arrayList);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                DW(it.next(), map, map2);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -1739145866213029132L, null, str, map, map2);
            }
            throw th;
        }
    }

    @ey(method = -2103587129290902369L)
    public static List<String> FH(String str, Map<String, List<String>> map) {
        try {
            if (j6) {
                iy.EQ(-1931341203769167955L, null, str, map);
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            Hw(str, map, hashSet, arrayList);
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -1931341203769167955L, null, str, map);
            }
            throw th;
        }
    }

    @ey(method = -2290371236549358953L)
    private static void Hw(String str, Map<String, List<String>> map, Set<String> set, List<String> list) {
        try {
            if (j6) {
                iy.J0(-4855936115600225771L, null, str, map, set, list);
            }
            if (set.contains(str)) {
                return;
            }
            set.add(str);
            if (!list.contains(str)) {
                list.add(str);
            }
            Iterator<String> it = map.get(str).iterator();
            while (it.hasNext()) {
                Hw(it.next(), map, set, list);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.a8(th, -4855936115600225771L, null, str, map, set, list);
            }
            throw th;
        }
    }

    @ey(method = -4658547317791375411L)
    public static Map<String, List<String>> j6(String str, Map<String, List<String>> map) {
        try {
            if (j6) {
                iy.EQ(-3252213030375534953L, null, str, map);
            }
            HashMap map2 = new HashMap();
            DW(str, map, map2);
            return map2;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -3252213030375534953L, null, str, map);
            }
            throw th;
        }
    }
}
