package androidx.core.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class r {

    static class a extends Transition.EpicenterCallback {
        final /* synthetic */ Rect j6;

        a(Rect rect) {
            this.j6 = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.j6;
        }
    }

    static class b implements Transition.TransitionListener {
        final /* synthetic */ ArrayList DW;
        final /* synthetic */ View j6;

        b(View view, ArrayList arrayList) {
            this.j6 = view;
            this.DW = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.j6.setVisibility(8);
            int size = this.DW.size();
            for (int i = 0; i < size; i++) {
                ((View) this.DW.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    static class c implements Runnable {
        final /* synthetic */ int WB;
        final /* synthetic */ ArrayList fY;
        final /* synthetic */ ArrayList jw;
        final /* synthetic */ ArrayList mb;
        final /* synthetic */ ArrayList qp;

        c(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.WB = i;
            this.mb = arrayList;
            this.jw = arrayList2;
            this.fY = arrayList3;
            this.qp = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.WB; i++) {
                ((View) this.mb.get(i)).setTransitionName((String) this.jw.get(i));
                ((View) this.fY.get(i)).setTransitionName((String) this.qp.get(i));
            }
        }
    }

    static class d implements Runnable {
        final /* synthetic */ ArrayList WB;
        final /* synthetic */ Map mb;

        d(ArrayList arrayList, Map map) {
            this.WB = arrayList;
            this.mb = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.WB.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.WB.get(i);
                String transitionName = view.getTransitionName();
                if (transitionName != null) {
                    view.setTransitionName(r.u7(this.mb, transitionName));
                }
            }
        }
    }

    static class e implements Transition.TransitionListener {
        final /* synthetic */ ArrayList DW;
        final /* synthetic */ Object FH;
        final /* synthetic */ ArrayList Hw;
        final /* synthetic */ ArrayList Zo;
        final /* synthetic */ Object j6;
        final /* synthetic */ Object v5;

        e(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.j6 = obj;
            this.DW = arrayList;
            this.FH = obj2;
            this.Hw = arrayList2;
            this.v5 = obj3;
            this.Zo = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.j6;
            if (obj != null) {
                r.aM(obj, this.DW, null);
            }
            Object obj2 = this.FH;
            if (obj2 != null) {
                r.aM(obj2, this.Hw, null);
            }
            Object obj3 = this.v5;
            if (obj3 != null) {
                r.aM(obj3, this.Zo, null);
            }
        }
    }

    static class f extends Transition.EpicenterCallback {
        final /* synthetic */ Rect j6;

        f(Rect rect) {
            this.j6 = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.j6;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.j6;
        }
    }

    static class g implements Runnable {
        final /* synthetic */ ArrayList WB;
        final /* synthetic */ Map mb;

        g(ArrayList arrayList, Map map) {
            this.WB = arrayList;
            this.mb = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.WB.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.WB.get(i);
                view.setTransitionName((String) this.mb.get(view.getTransitionName()));
            }
        }
    }

    public static Object BT(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public static void DW(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    public static void EQ(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    public static void FH(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                FH(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (we(transition) || !J0(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget(arrayList.get(i));
            i++;
        }
    }

    public static void Hw(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    private static boolean J0(List list) {
        return list == null || list.isEmpty();
    }

    public static Object J8(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    public static void Mr(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        e0.j6(viewGroup, new g(arrayList, map));
    }

    public static ArrayList<String> QX(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(view.getTransitionName());
            view.setTransitionName(null);
        }
        return arrayList2;
    }

    public static void U2(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new e(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public static Object VH(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public static Object Ws(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    public static void XL(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    public static void Zo(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup()) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Zo(arrayList, viewGroup.getChildAt(i));
            }
        }
    }

    public static void a8(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new f(rect));
        }
    }

    public static void aM(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                aM(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (we(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    public static void er(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String transitionName = view2.getTransitionName();
            arrayList4.add(transitionName);
            if (transitionName != null) {
                view2.setTransitionName(null);
                String str = map.get(transitionName);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i2))) {
                        arrayList2.get(i2).setTransitionName(transitionName);
                        break;
                    }
                    i2++;
                }
            }
        }
        e0.j6(view, new c(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public static void gW(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            aM(transitionSet, arrayList, arrayList2);
        }
    }

    private static boolean gn(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static void j3(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    public static void lg(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            EQ(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    public static void rN(View view, ArrayList<View> arrayList, Map<String, String> map) {
        e0.j6(view, new d(arrayList, map));
    }

    public static void tp(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    tp(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String u7(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    private static void v5(List<View> list, View view) {
        int size = list.size();
        if (gn(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!gn(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean we(Transition transition) {
        return (J0(transition.getTargetIds()) && J0(transition.getTargetNames()) && J0(transition.getTargetTypes())) ? false : true;
    }

    public static void yS(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v5(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        FH(transitionSet, arrayList);
    }
}
