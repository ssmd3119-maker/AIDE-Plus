package abcd;

import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import com.probelytics.api.AppInfo;
import com.probelytics.api.InAppProduct;
import com.probelytics.api.Market;
import com.probelytics.api.MarketReferrer;
import com.probelytics.api.UserActionWindow;
import com.probelytics.api.UserInputAction;
import com.probelytics.api.UserLaunchAction;
import com.probelytics.api.UserNotification;
import com.probelytics.api.UserNotificationAction;
import com.probelytics.api.UserTouchAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class py {
    private static boolean DW;
    private static ThreadLocal<Boolean> j6 = new ThreadLocal<>();
    private static Object FH = new Object();
    private static c Hw = new c();

    static class a implements ny {
        final /* synthetic */ my j6;

        public a(my myVar) {
            this.j6 = myVar;
        }

        @Override // abcd.ny
        public jy j6(mz mzVar, Object[] objArr) {
            return this.j6.DW().j6(this.j6.FH(), objArr);
        }
    }

    private static class b {
        public static long DW;
        public static boolean FH;
        public static boolean Hw;
        public static boolean VH;
        public static boolean Zo;
        public static boolean gn;
        public static boolean j6;
        public static boolean u7;
        public static boolean v5;
        public static Map<Integer, Set<Class>> tp = new HashMap();
        public static Map<Integer, Set<Class>> EQ = new HashMap();
        public static Map<Integer, Set<Class>> we = new HashMap();
        public static Map<Integer, Set<Class>> J0 = new HashMap();
        public static Map<Integer, Set<Class>> J8 = new HashMap();
        public static Set<Long> Ws = new HashSet();
        public static Set<Long> QX = new HashSet();
    }

    public static class c {
        public List<my> j6 = new ArrayList();
        public List<my> DW = new ArrayList();
        public List<my> FH = new ArrayList();
        public List<my> Hw = new ArrayList();
        public List<my> v5 = new ArrayList();
        public ArrayList<my> Zo = new ArrayList<>();
        public ArrayList<my> VH = new ArrayList<>();
        public ArrayList<my> gn = new ArrayList<>();
        public List<my> u7 = new ArrayList();
        public List<my> tp = new ArrayList();
        public List<my> EQ = new ArrayList();
        public List<my> we = new ArrayList();
        public List<my> J0 = new ArrayList();
        public List<my> J8 = new ArrayList();
        public List<my> Ws = new ArrayList();
        public Map<Long, List<my>> QX = new HashMap();
        public Map<Long, List<my>> XL = new HashMap();
        public List<my> aM = new ArrayList();
        public List<my> j3 = new ArrayList();
        public List<my> Mr = new ArrayList();
        public List<my> U2 = new ArrayList();
        public List<my> a8 = new ArrayList();
        public List<my> lg = new ArrayList();
        public List<my> rN = new ArrayList();
        public Map<Integer, List<my>> er = new HashMap();
        public Map<Integer, List<my>> yS = new HashMap();
        public Map<Integer, List<my>> gW = new HashMap();
        public Map<Integer, List<my>> BT = new HashMap();
        public Map<Integer, List<my>> vy = new HashMap();
    }

    public static void BT(long j, Market market) {
        Iterator it = new ArrayList(Zo().FH).iterator();
        while (it.hasNext()) {
            my myVar = (my) it.next();
            if (tz.VH(myVar.Hw())) {
                u7(j, myVar, market);
            }
        }
    }

    public static void DW() {
        b.QX = new HashSet(b.Ws);
    }

    private static void EQ(String str, CharSequence charSequence) {
        b00.j6("Hook", str + " " + ((Object) charSequence));
    }

    public static long FH() {
        return System.currentTimeMillis();
    }

    private static void Hw(my myVar) {
        List<my> list;
        synchronized (FH) {
            c cVar = Hw;
            if (myVar.QX()) {
                long jVH = myVar.VH();
                long jZo = myVar.Zo();
                List<my> list2 = cVar.QX.get(Long.valueOf(jVH));
                if (list2 != null) {
                    list2.remove(myVar);
                    if (list2.isEmpty()) {
                        cVar.QX.remove(Long.valueOf(jVH));
                        ry.j6(jZo, jVH, false);
                    }
                }
            } else if (myVar.J8()) {
                cVar.EQ.remove(myVar);
            } else if (myVar.U2()) {
                cVar.Hw.remove(myVar);
            } else if (myVar.cn()) {
                cVar.v5.remove(myVar);
            } else if (myVar.SI()) {
                cVar.VH.remove(myVar);
            } else if (myVar.KD()) {
                cVar.gn.remove(myVar);
            } else if (myVar.nw()) {
                cVar.Zo.remove(myVar);
            } else if (myVar.aM()) {
                cVar.tp.remove(myVar);
            } else if (myVar.j3()) {
                cVar.u7.remove(myVar);
            } else if (myVar.ei()) {
                cVar.j6.remove(myVar);
            } else if (myVar.gW()) {
                cVar.DW.remove(myVar);
            } else if (myVar.yS()) {
                cVar.FH.remove(myVar);
            } else if (myVar.XL()) {
                long jU7 = myVar.u7();
                long jGn = myVar.gn();
                List<my> list3 = cVar.XL.get(Long.valueOf(jU7));
                if (list3 != null) {
                    list3.remove(myVar);
                    if (list3.isEmpty()) {
                        cVar.XL.remove(Long.valueOf(jU7));
                        ry.DW(jGn, jU7, false);
                    }
                }
            } else if (myVar.tp()) {
                cVar.Ws.remove(myVar);
            } else if (myVar.rN()) {
                cVar.aM.remove(myVar);
            } else if (myVar.EQ()) {
                cVar.we.remove(myVar);
            } else if (myVar.we()) {
                cVar.J0.remove(myVar);
            } else if (myVar.J0()) {
                cVar.J8.remove(myVar);
            } else if (myVar.P8()) {
                cVar.U2.remove(myVar);
            } else if (myVar.vy()) {
                cVar.a8.remove(myVar);
            } else if (myVar.sh()) {
                cVar.Mr.remove(myVar);
            } else if (myVar.cb()) {
                cVar.j3.remove(myVar);
            } else if (myVar.Mr()) {
                cVar.rN.remove(myVar);
            } else if (myVar.ro()) {
                cVar.lg.remove(myVar);
            } else if (myVar.Ws()) {
                List<my> list4 = cVar.er.get(Integer.valueOf(myVar.v5()));
                if (list4 != null) {
                    list4.remove(myVar);
                }
            } else if (myVar.er()) {
                List<my> list5 = cVar.yS.get(Integer.valueOf(myVar.v5()));
                if (list5 != null) {
                    list5.remove(myVar);
                }
            } else if (myVar.a8()) {
                List<my> list6 = cVar.gW.get(Integer.valueOf(myVar.v5()));
                if (list6 != null) {
                    list6.remove(myVar);
                }
            } else if (myVar.lg()) {
                List<my> list7 = cVar.BT.get(Integer.valueOf(myVar.v5()));
                if (list7 != null) {
                    list7.remove(myVar);
                }
            } else if (myVar.BT() && (list = cVar.vy.get(Integer.valueOf(myVar.v5()))) != null) {
                list.remove(myVar);
            }
        }
    }

    public static void J0(Activity activity) {
        EQ("onActivityStarted", by.j6().Zo(activity) + "");
        long jFH = FH();
        Iterator it = new ArrayList(Zo().J0).iterator();
        while (it.hasNext()) {
            u7(jFH, (my) it.next(), activity);
        }
    }

    public static void J8(Activity activity) {
        EQ("onActivityStopped", by.j6().Zo(activity) + "");
        long jFH = FH();
        Iterator it = new ArrayList(Zo().J8).iterator();
        while (it.hasNext()) {
            u7(jFH, (my) it.next(), activity);
        }
    }

    public static void KD(AppInfo appInfo) {
        EQ("onOtherAppImpression", appInfo.getApplicationId());
        long jFH = FH();
        Iterator it = new ArrayList(Zo().Zo).iterator();
        while (it.hasNext()) {
            u7(jFH, (my) it.next(), appInfo);
        }
    }

    public static void Mr(UserActionWindow userActionWindow) {
    }

    public static void P8(UserTouchAction userTouchAction, MenuItem menuItem) {
        EQ("onMenuItemSelected", userTouchAction.toString());
        if (b.j6) {
            if (!b.J8.containsKey(Integer.valueOf(menuItem.getItemId()))) {
                b.J8.put(Integer.valueOf(menuItem.getItemId()), new HashSet());
            }
            b.J8.get(Integer.valueOf(menuItem.getItemId())).add(userTouchAction.getActivityClass());
        }
        long jFH = FH();
        if (Zo().vy.containsKey(Integer.valueOf(menuItem.getItemId()))) {
            Iterator it = new ArrayList(Zo().vy.get(Integer.valueOf(menuItem.getItemId()))).iterator();
            while (it.hasNext()) {
                my myVar = (my) it.next();
                if (myVar.j6() != null && myVar.j6().isInstance(userTouchAction.getActivity())) {
                    u7(jFH, myVar, userTouchAction.getActivity(), menuItem);
                }
            }
        }
    }

    public static void QX(long j) {
        if (b.j6 || !DW) {
            b.Ws.add(Long.valueOf(j));
        }
    }

    public static void SI(boolean z) {
        long jFH = FH();
        Iterator it = new ArrayList(Zo().j6).iterator();
        while (it.hasNext()) {
            u7(jFH, (my) it.next(), Boolean.valueOf(z));
        }
    }

    public static void U2(InAppProduct inAppProduct) {
        EQ("onInAppProductImpression", inAppProduct.getProductId());
        if (b.j6) {
            b.v5 = true;
        }
        long jFH = FH();
        Iterator it = new ArrayList(Zo().tp).iterator();
        while (it.hasNext()) {
            u7(jFH, (my) it.next(), inAppProduct);
        }
    }

    public static long VH(my myVar, long j, long j2) {
        if (myVar.ei()) {
            return j;
        }
        if (myVar.gW()) {
            if (by.j6().FH()) {
                return j;
            }
            return 0L;
        }
        if (myVar.yS()) {
            if (by.j6().FH()) {
                return j;
            }
            return 0L;
        }
        if (myVar.cn()) {
            if (by.j6().FH()) {
                return j;
            }
            return 0L;
        }
        if (myVar.U2()) {
            if (by.j6().FH()) {
                return j;
            }
            return 0L;
        }
        if (myVar.nw()) {
            if (by.j6().FH()) {
                return j;
            }
            return 0L;
        }
        if (myVar.nw()) {
            if (by.j6().FH()) {
                return j;
            }
            return 0L;
        }
        if (myVar.QX()) {
            return (!b.j6 || b.QX.contains(Long.valueOf(myVar.Zo()))) ? j : j2;
        }
        if (myVar.J8()) {
            return j;
        }
        if (myVar.aM()) {
            return (!b.j6 || b.v5) ? j : j2;
        }
        if (myVar.j3()) {
            return (!b.j6 || b.Hw) ? j : j2;
        }
        if (myVar.XL()) {
            return (!b.j6 || b.QX.contains(Long.valueOf(myVar.gn()))) ? j : j2;
        }
        if (myVar.tp()) {
            return (!b.j6 || b.FH) ? j : j2;
        }
        if (myVar.we() || myVar.J0() || myVar.EQ() || myVar.rN() || myVar.cb()) {
            return j;
        }
        if (myVar.P8()) {
            return (!b.j6 || b.gn) ? j : j2;
        }
        if (myVar.vy()) {
            return (!b.j6 || b.u7) ? j : j2;
        }
        if (myVar.sh()) {
            return j;
        }
        if (myVar.ro()) {
            return (!b.j6 || b.VH) ? j : j2;
        }
        if (myVar.Mr()) {
            return (!b.j6 || b.Zo) ? j : j2;
        }
        if (myVar.Ws()) {
            if (b.j6) {
                if (myVar.v5() != -1) {
                    Set<Class> set = b.tp.get(Integer.valueOf(myVar.v5()));
                    if (set == null || (myVar.j6() != null && !set.contains(myVar.j6()))) {
                        return j2;
                    }
                } else if (b.tp.isEmpty()) {
                    return j2;
                }
            }
            return j;
        }
        if (myVar.er()) {
            if (b.j6) {
                if (myVar.v5() != -1) {
                    Set<Class> set2 = b.EQ.get(Integer.valueOf(myVar.v5()));
                    if (set2 == null || (myVar.j6() != null && !set2.contains(myVar.j6()))) {
                        return j2;
                    }
                } else if (b.EQ.isEmpty()) {
                    return j2;
                }
            }
            return j;
        }
        if (myVar.a8()) {
            if (b.j6) {
                if (myVar.v5() != -1) {
                    Set<Class> set3 = b.we.get(Integer.valueOf(myVar.v5()));
                    if (set3 == null || (myVar.j6() != null && !set3.contains(myVar.j6()))) {
                        return j2;
                    }
                } else if (b.we.isEmpty()) {
                    return j2;
                }
            }
            return j;
        }
        if (myVar.lg()) {
            if (b.j6) {
                if (myVar.v5() != -1) {
                    Set<Class> set4 = b.J0.get(Integer.valueOf(myVar.v5()));
                    if (set4 == null || (myVar.j6() != null && !set4.contains(myVar.j6()))) {
                        return j2;
                    }
                } else if (b.J0.isEmpty()) {
                    return j2;
                }
            }
            return j;
        }
        if (myVar.BT() && b.j6) {
            if (myVar.v5() != -1) {
                Set<Class> set5 = b.J8.get(Integer.valueOf(myVar.v5()));
                if (set5 == null || (myVar.j6() != null && !set5.contains(myVar.j6()))) {
                    return j2;
                }
            } else if (b.J8.isEmpty()) {
                return j2;
            }
        }
        return j;
    }

    public static void Ws() {
        EQ("onApplicationCreate", iy.DW().getPackageName());
        if (by.j6().FH()) {
            Iterator it = new ArrayList(Zo().Hw).iterator();
            while (it.hasNext()) {
                my myVar = (my) it.next();
                if (tz.Zo(myVar.Hw())) {
                    u7(by.j6().j6(), myVar, new Market(iy.DW().getPackageManager().getInstallerPackageName(iy.DW().getPackageName())));
                }
            }
            if (by.j6().aM()) {
                Iterator it2 = new ArrayList(Zo().v5).iterator();
                while (it2.hasNext()) {
                    my myVar2 = (my) it2.next();
                    if (tz.tp(myVar2.Hw())) {
                        u7(by.j6().lg(), myVar2, new Object[0]);
                    }
                }
            }
        }
        long jFH = FH();
        Iterator it3 = new ArrayList(Zo().EQ).iterator();
        while (it3.hasNext()) {
            u7(jFH, (my) it3.next(), iy.DW());
        }
    }

    public static void XL(UserTouchAction userTouchAction, View view) {
        EQ("onClick", userTouchAction.toString());
        if (b.j6) {
            if (!b.tp.containsKey(Integer.valueOf(view.getId()))) {
                b.tp.put(Integer.valueOf(view.getId()), new HashSet());
            }
            b.tp.get(Integer.valueOf(view.getId())).add(userTouchAction.getActivityClass());
        }
        long jFH = FH();
        if (Zo().er.containsKey(Integer.valueOf(view.getId()))) {
            Iterator it = new ArrayList(Zo().er.get(Integer.valueOf(view.getId()))).iterator();
            while (it.hasNext()) {
                my myVar = (my) it.next();
                if (myVar.j6() != null && myVar.j6() != null && myVar.j6().isInstance(userTouchAction.getActivity())) {
                    u7(jFH, myVar, userTouchAction.getActivity(), view);
                }
            }
        }
    }

    private static c Zo() {
        c cVar;
        synchronized (FH) {
            cVar = Hw;
        }
        return cVar;
    }

    public static void a8(long j, InAppProduct inAppProduct) {
        EQ("onInAppProductPurchase", inAppProduct.getProductId());
        if (b.j6 && b.DW < j) {
            b.Hw = true;
        }
        Iterator it = new ArrayList(Zo().u7).iterator();
        while (it.hasNext()) {
            my myVar = (my) it.next();
            if (tz.v5(myVar.Hw(), j, inAppProduct.getProductId())) {
                u7(j, myVar, inAppProduct);
            }
        }
    }

    public static void aM(long j, Object obj, Object... objArr) {
        if (tp()) {
            return;
        }
        EQ("onEnter", "" + j);
        long jFH = FH();
        List<my> list = Zo().QX.get(Long.valueOf(j));
        if (list != null) {
            Iterator it = new ArrayList(list).iterator();
            while (it.hasNext()) {
                my myVar = (my) it.next();
                Object[] objArr2 = new Object[objArr.length + 1];
                int i = 0;
                objArr2[0] = ry.gn(obj, myVar.Zo());
                while (i < objArr.length) {
                    int i2 = i + 1;
                    objArr2[i2] = objArr[i];
                    i = i2;
                }
                u7(jFH, myVar, objArr2);
            }
        }
    }

    public static void cb(UserTouchAction userTouchAction) {
        EQ("onTouch", userTouchAction + "");
        if (b.j6) {
            b.VH = true;
        }
        long jFH = FH();
        Iterator it = new ArrayList(Zo().lg).iterator();
        while (it.hasNext()) {
            u7(jFH, (my) it.next(), userTouchAction);
        }
    }

    public static void cn(AppInfo appInfo) {
        EQ("onOtherAppUninstalled", appInfo.getApplicationId());
        long jFH = FH();
        Iterator it = new ArrayList(Zo().gn).iterator();
        while (it.hasNext()) {
            u7(jFH, (my) it.next(), appInfo);
        }
    }

    public static void dx(Thread thread, Throwable th) {
        if (b.j6) {
            b.FH = true;
        }
        long jFH = FH();
        Iterator it = new ArrayList(Zo().Ws).iterator();
        while (it.hasNext()) {
            u7(jFH, (my) it.next(), thread, th);
        }
    }

    public static void ef(UserActionWindow userActionWindow) {
        if (userActionWindow.toString().endsWith(":editor_handle")) {
            return;
        }
        EQ("onWindowShown", userActionWindow + "");
        long jFH = FH();
        Iterator it = new ArrayList(Zo().j3).iterator();
        while (it.hasNext()) {
            u7(jFH, (my) it.next(), userActionWindow);
        }
    }

    public static void ei(UserNotification userNotification) {
        EQ("onNotification", userNotification + "");
        if (b.j6) {
            b.gn = true;
        }
        long jFH = FH();
        Iterator it = new ArrayList(Zo().U2).iterator();
        while (it.hasNext()) {
            u7(jFH, (my) it.next(), userNotification);
        }
    }

    public static void er(UserTouchAction userTouchAction, View view, Object obj, int i, View view2) {
        EQ("onItemLongPress", userTouchAction.toString());
        if (b.j6) {
            if (!b.J0.containsKey(Integer.valueOf(view.getId()))) {
                b.J0.put(Integer.valueOf(view.getId()), new HashSet());
            }
            b.J0.get(Integer.valueOf(view.getId())).add(userTouchAction.getActivityClass());
        }
        long jFH = FH();
        if (Zo().BT.containsKey(Integer.valueOf(view.getId()))) {
            Iterator it = new ArrayList(Zo().BT.get(Integer.valueOf(view.getId()))).iterator();
            while (it.hasNext()) {
                my myVar = (my) it.next();
                if (myVar.j6() != null && myVar.j6().isInstance(userTouchAction.getActivity())) {
                    u7(jFH, myVar, userTouchAction.getActivity(), view, obj, Integer.valueOf(i), view2);
                }
            }
        }
    }

    public static void gW(UserTouchAction userTouchAction, View view) {
        EQ("onLongPress", userTouchAction.toString());
        if (b.j6) {
            if (!b.EQ.containsKey(Integer.valueOf(view.getId()))) {
                b.EQ.put(Integer.valueOf(view.getId()), new HashSet());
            }
            b.EQ.get(Integer.valueOf(view.getId())).add(userTouchAction.getActivityClass());
        }
        long jFH = FH();
        if (Zo().yS.containsKey(Integer.valueOf(view.getId()))) {
            Iterator it = new ArrayList(Zo().yS.get(Integer.valueOf(view.getId()))).iterator();
            while (it.hasNext()) {
                my myVar = (my) it.next();
                if (myVar.j6() != null && myVar.j6().isInstance(userTouchAction.getActivity())) {
                    u7(jFH, myVar, userTouchAction.getActivity(), view);
                }
            }
        }
    }

    public static void gn(boolean z) {
        DW = true;
        b.j6 = z;
        b.DW = FH();
    }

    public static void j3(UserActionWindow userActionWindow) {
    }

    public static void j6(my myVar) {
        synchronized (FH) {
            c cVar = Hw;
            if (myVar.QX()) {
                long jVH = myVar.VH();
                long jZo = myVar.Zo();
                if (!cVar.QX.containsKey(Long.valueOf(jVH))) {
                    cVar.QX.put(Long.valueOf(jVH), new ArrayList());
                }
                cVar.QX.get(Long.valueOf(jVH)).add(myVar);
                ry.j6(jZo, jVH, true);
            } else if (myVar.J8()) {
                cVar.EQ.add(myVar);
            } else if (myVar.nw()) {
                cVar.Zo.add(myVar);
            } else if (myVar.SI()) {
                cVar.VH.add(myVar);
            } else if (myVar.KD()) {
                cVar.gn.add(myVar);
            } else if (myVar.U2()) {
                cVar.Hw.add(myVar);
            } else if (myVar.cn()) {
                cVar.v5.add(myVar);
            } else if (myVar.aM()) {
                cVar.tp.add(myVar);
            } else if (myVar.j3()) {
                cVar.u7.add(myVar);
            } else if (myVar.ei()) {
                cVar.j6.add(myVar);
            } else if (myVar.gW()) {
                cVar.DW.add(myVar);
            } else if (myVar.yS()) {
                cVar.FH.add(myVar);
            } else if (myVar.XL()) {
                long jU7 = myVar.u7();
                long jGn = myVar.gn();
                if (!cVar.XL.containsKey(Long.valueOf(jU7))) {
                    cVar.XL.put(Long.valueOf(jU7), new ArrayList());
                }
                cVar.XL.get(Long.valueOf(jU7)).add(myVar);
                ry.DW(jGn, jU7, true);
            } else if (myVar.tp()) {
                cVar.Ws.add(myVar);
            } else if (myVar.we()) {
                cVar.J0.add(myVar);
            } else if (myVar.J0()) {
                cVar.J8.add(myVar);
            } else if (myVar.EQ()) {
                cVar.we.add(myVar);
            } else if (myVar.rN()) {
                cVar.aM.add(myVar);
            } else if (myVar.P8()) {
                cVar.U2.add(myVar);
            } else if (myVar.vy()) {
                cVar.a8.add(myVar);
            } else if (myVar.cb()) {
                cVar.j3.add(myVar);
            } else if (myVar.sh()) {
                cVar.Mr.add(myVar);
            } else if (myVar.ro()) {
                cVar.lg.add(myVar);
            } else if (myVar.Mr()) {
                cVar.rN.add(myVar);
            } else if (myVar.Ws()) {
                if (!cVar.er.containsKey(Integer.valueOf(myVar.v5()))) {
                    cVar.er.put(Integer.valueOf(myVar.v5()), new ArrayList());
                }
                cVar.er.get(Integer.valueOf(myVar.v5())).add(myVar);
            } else if (myVar.er()) {
                if (!cVar.yS.containsKey(Integer.valueOf(myVar.v5()))) {
                    cVar.yS.put(Integer.valueOf(myVar.v5()), new ArrayList());
                }
                cVar.yS.get(Integer.valueOf(myVar.v5())).add(myVar);
            } else if (myVar.a8()) {
                if (!cVar.gW.containsKey(Integer.valueOf(myVar.v5()))) {
                    cVar.gW.put(Integer.valueOf(myVar.v5()), new ArrayList());
                }
                cVar.gW.get(Integer.valueOf(myVar.v5())).add(myVar);
            } else if (myVar.lg()) {
                if (!cVar.BT.containsKey(Integer.valueOf(myVar.v5()))) {
                    cVar.BT.put(Integer.valueOf(myVar.v5()), new ArrayList());
                }
                cVar.BT.get(Integer.valueOf(myVar.v5())).add(myVar);
            } else if (myVar.BT()) {
                if (!cVar.vy.containsKey(Integer.valueOf(myVar.v5()))) {
                    cVar.vy.put(Integer.valueOf(myVar.v5()), new ArrayList());
                }
                cVar.vy.get(Integer.valueOf(myVar.v5())).add(myVar);
            }
        }
    }

    public static void lg(UserInputAction userInputAction) {
        EQ("onInput", userInputAction + "");
        if (b.j6) {
            b.Zo = true;
        }
        long jFH = FH();
        Iterator it = new ArrayList(Zo().rN).iterator();
        while (it.hasNext()) {
            u7(jFH, (my) it.next(), userInputAction);
        }
    }

    public static void nw(UserNotificationAction userNotificationAction) {
        EQ("onNotificationAction", userNotificationAction + "");
        if (b.j6) {
            b.u7 = true;
        }
        long jFH = FH();
        Iterator it = new ArrayList(Zo().a8).iterator();
        while (it.hasNext()) {
            u7(jFH, (my) it.next(), userNotificationAction);
        }
    }

    public static void rN(UserTouchAction userTouchAction, View view, Object obj, int i, View view2) {
        EQ("onItemClick", userTouchAction.toString());
        if (b.j6) {
            if (!b.we.containsKey(Integer.valueOf(view.getId()))) {
                b.we.put(Integer.valueOf(view.getId()), new HashSet());
            }
            b.we.get(Integer.valueOf(view.getId())).add(userTouchAction.getActivityClass());
        }
        long jFH = FH();
        if (Zo().gW.containsKey(Integer.valueOf(view.getId()))) {
            Iterator it = new ArrayList(Zo().gW.get(Integer.valueOf(view.getId()))).iterator();
            while (it.hasNext()) {
                my myVar = (my) it.next();
                if (myVar.j6() != null && myVar.j6().isInstance(userTouchAction.getActivity())) {
                    u7(jFH, myVar, userTouchAction.getActivity(), view, obj, Integer.valueOf(i), view2);
                }
            }
        }
    }

    public static void ro(long j, AppInfo appInfo) {
        Iterator it = new ArrayList(Zo().VH).iterator();
        while (it.hasNext()) {
            my myVar = (my) it.next();
            if (tz.u7(myVar.Hw(), j, appInfo.getApplicationId())) {
                u7(j, myVar, appInfo);
            }
        }
    }

    public static void sG(UserActionWindow userActionWindow) {
        if (userActionWindow.toString().endsWith(":editor_handle")) {
            return;
        }
        EQ("onWindowHidden", userActionWindow + "");
        long jFH = FH();
        Iterator it = new ArrayList(Zo().Mr).iterator();
        while (it.hasNext()) {
            u7(jFH, (my) it.next(), userActionWindow);
        }
    }

    public static void sh(long j, Throwable th, Object obj, Object... objArr) {
        if (tp()) {
            return;
        }
        EQ("onThrow", "" + j);
        long jFH = FH();
        List<my> list = Zo().XL.get(Long.valueOf(j));
        if (list != null) {
            Iterator it = new ArrayList(list).iterator();
            while (it.hasNext()) {
                my myVar = (my) it.next();
                Object[] objArr2 = new Object[objArr.length + 2];
                objArr2[0] = ry.gn(obj, myVar.gn());
                objArr2[1] = th;
                for (int i = 0; i < objArr.length; i++) {
                    objArr2[i + 2] = objArr[i];
                }
                u7(jFH, myVar, objArr2);
            }
        }
    }

    private static boolean tp() {
        return j6.get() != null && j6.get().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void u7(long r3, abcd.my r5, java.lang.Object... r6) {
        /*
            abcd.ny r0 = r5.DW()
            if (r0 == 0) goto L3a
            r0 = 0
            java.lang.ThreadLocal<java.lang.Boolean> r1 = abcd.py.j6     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1c
            r1.set(r2)     // Catch: java.lang.Throwable -> L1c
            abcd.zy r1 = abcd.zy.lp()     // Catch: java.lang.Throwable -> L1c
            abcd.py$a r2 = new abcd.py$a     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L1c
            abcd.jy r0 = r1.er(r5, r6, r2)     // Catch: java.lang.Throwable -> L1c
            goto L24
        L1c:
            r6 = move-exception
            abcd.mz r1 = r5.FH()     // Catch: java.lang.Throwable -> L33
            abcd.oz.QX(r1, r3, r6)     // Catch: java.lang.Throwable -> L33
        L24:
            java.lang.ThreadLocal<java.lang.Boolean> r6 = abcd.py.j6
            r6.remove()
            if (r0 == 0) goto L3a
            abcd.mz r5 = r5.FH()
            abcd.kz.Hw(r5, r3, r0)
            goto L3a
        L33:
            r3 = move-exception
            java.lang.ThreadLocal<java.lang.Boolean> r4 = abcd.py.j6
            r4.remove()
            throw r3
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.py.u7(long, abcd.my, java.lang.Object[]):void");
    }

    public static void v5(List<? extends my> list) {
        Iterator<? extends my> it = list.iterator();
        while (it.hasNext()) {
            Hw(it.next());
        }
    }

    public static void vy(long j, MarketReferrer marketReferrer) {
        Iterator it = new ArrayList(Zo().DW).iterator();
        while (it.hasNext()) {
            my myVar = (my) it.next();
            if (tz.gn(myVar.Hw())) {
                u7(j, myVar, marketReferrer);
            }
        }
    }

    public static void we(Activity activity) {
        EQ("onActivityCreated", by.j6().Zo(activity) + "");
        long jFH = FH();
        Iterator it = new ArrayList(Zo().we).iterator();
        while (it.hasNext()) {
            u7(jFH, (my) it.next(), activity);
        }
    }

    public static void yS(UserLaunchAction userLaunchAction) {
        EQ("onLaunched", by.j6().Zo(userLaunchAction) + "");
        long jFH = FH();
        Iterator it = new ArrayList(Zo().aM).iterator();
        while (it.hasNext()) {
            u7(jFH, (my) it.next(), userLaunchAction);
        }
    }
}
