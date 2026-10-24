package androidx.core.app;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public class q {
    private static final int[] j6 = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    static class a implements Runnable {
        final /* synthetic */ ArrayList WB;

        a(ArrayList arrayList) {
            this.WB = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.P8(this.WB, 4);
        }
    }

    static class b implements Runnable {
        final /* synthetic */ Object WB;
        final /* synthetic */ ArrayList fY;
        final /* synthetic */ Fragment jw;
        final /* synthetic */ ArrayList k2;
        final /* synthetic */ View mb;
        final /* synthetic */ ArrayList qp;
        final /* synthetic */ Object zh;

        b(Object obj, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.WB = obj;
            this.mb = view;
            this.jw = fragment;
            this.fY = arrayList;
            this.qp = arrayList2;
            this.k2 = arrayList3;
            this.zh = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.WB;
            if (obj != null) {
                r.XL(obj, this.mb);
                this.qp.addAll(q.J8(this.WB, this.jw, this.fY, this.mb));
            }
            if (this.k2 != null) {
                if (this.zh != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.mb);
                    r.aM(this.zh, this.k2, arrayList);
                }
                this.k2.clear();
                this.k2.add(this.mb);
            }
        }
    }

    static class c implements Runnable {
        final /* synthetic */ Fragment WB;
        final /* synthetic */ ArrayMap fY;
        final /* synthetic */ boolean jw;
        final /* synthetic */ Rect k2;
        final /* synthetic */ Fragment mb;
        final /* synthetic */ View qp;

        c(Fragment fragment, Fragment fragment2, boolean z, ArrayMap arrayMap, View view, Rect rect) {
            this.WB = fragment;
            this.mb = fragment2;
            this.jw = z;
            this.fY = arrayMap;
            this.qp = view;
            this.k2 = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.EQ(this.WB, this.mb, this.jw, this.fY, false);
            View view = this.qp;
            if (view != null) {
                r.EQ(view, this.k2);
            }
        }
    }

    static class d implements Runnable {
        final /* synthetic */ boolean AL;
        final /* synthetic */ ArrayMap WB;
        final /* synthetic */ Rect cT;
        final /* synthetic */ ArrayList fY;
        final /* synthetic */ Object hK;
        final /* synthetic */ e jw;
        final /* synthetic */ Fragment k2;
        final /* synthetic */ Object mb;
        final /* synthetic */ View qp;
        final /* synthetic */ ArrayList w9;
        final /* synthetic */ Fragment zh;

        d(ArrayMap arrayMap, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.WB = arrayMap;
            this.mb = obj;
            this.jw = eVar;
            this.fY = arrayList;
            this.qp = view;
            this.k2 = fragment;
            this.zh = fragment2;
            this.AL = z;
            this.w9 = arrayList2;
            this.hK = obj2;
            this.cT = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayMap arrayMapWe = q.we(this.WB, this.mb, this.jw);
            if (arrayMapWe != null) {
                this.fY.addAll(arrayMapWe.values());
                this.fY.add(this.qp);
            }
            q.EQ(this.k2, this.zh, this.AL, arrayMapWe, false);
            Object obj = this.mb;
            if (obj != null) {
                r.gW(obj, this.w9, this.fY);
                View viewLg = q.lg(arrayMapWe, this.jw, this.hK, this.AL);
                if (viewLg != null) {
                    r.EQ(viewLg, this.cT);
                }
            }
        }
    }

    static class e {
        public boolean DW;
        public androidx.core.app.d FH;
        public Fragment Hw;
        public androidx.core.app.d Zo;
        public Fragment j6;
        public boolean v5;

        e() {
        }
    }

    private static void BT(ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        e0.j6(viewGroup, new b(obj, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void EQ(Fragment fragment, Fragment fragment2, boolean z, ArrayMap<String, View> arrayMap, boolean z2) {
        j0 j0VarWs = z ? fragment2.Ws() : fragment.Ws();
        if (j0VarWs != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayMap == null ? 0 : arrayMap.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(arrayMap.keyAt(i));
                arrayList.add(arrayMap.valueAt(i));
            }
            if (z2) {
                j0VarWs.FH(arrayList2, arrayList, null);
            } else {
                j0VarWs.DW(arrayList2, arrayList, null);
            }
        }
    }

    private static ArrayMap<String, View> J0(ArrayMap<String, String> arrayMap, Object obj, e eVar) {
        j0 j0VarXL;
        ArrayList<String> arrayList;
        if (arrayMap.isEmpty() || obj == null) {
            arrayMap.clear();
            return null;
        }
        Fragment fragment = eVar.Hw;
        ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
        r.tp(arrayMap2, fragment.vy());
        androidx.core.app.d dVar = eVar.Zo;
        if (eVar.v5) {
            j0VarXL = fragment.Ws();
            arrayList = dVar.aM;
        } else {
            j0VarXL = fragment.XL();
            arrayList = dVar.XL;
        }
        arrayMap2.J8(arrayList);
        if (j0VarXL != null) {
            j0VarXL.j6(arrayList, arrayMap2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = arrayMap2.get(str);
                if (view == null) {
                    arrayMap.remove(str);
                } else if (!str.equals(ViewCompat.VH(view))) {
                    arrayMap.put(ViewCompat.VH(view), arrayMap.remove(str));
                }
            }
        } else {
            arrayMap.J8(arrayMap2.keySet());
        }
        return arrayMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<View> J8(Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View viewVy = fragment.vy();
        if (viewVy != null) {
            r.Zo(arrayList2, viewVy);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        r.FH(obj, arrayList2);
        return arrayList2;
    }

    private static String Mr(ArrayMap<String, String> arrayMap, String str) {
        int size = arrayMap.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(arrayMap.valueAt(i))) {
                return arrayMap.keyAt(i);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P8(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    private static Object QX(ViewGroup viewGroup, View view, ArrayMap<String, String> arrayMap, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        View view2;
        Rect rect;
        Fragment fragment = eVar.j6;
        Fragment fragment2 = eVar.Hw;
        if (fragment != null) {
            fragment.vy().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.DW;
        Object objRN = arrayMap.isEmpty() ? null : rN(fragment, fragment2, z);
        ArrayMap<String, View> arrayMapJ0 = J0(arrayMap, objRN, eVar);
        ArrayMap<String, View> arrayMapWe = we(arrayMap, objRN, eVar);
        if (arrayMap.isEmpty()) {
            if (arrayMapJ0 != null) {
                arrayMapJ0.clear();
            }
            if (arrayMapWe != null) {
                arrayMapWe.clear();
            }
            objRN = null;
        } else {
            Zo(arrayList, arrayMapJ0, arrayMap.keySet());
            Zo(arrayList2, arrayMapWe, arrayMap.values());
        }
        if (obj == null && obj2 == null && objRN == null) {
            return null;
        }
        EQ(fragment, fragment2, z, arrayMapJ0, true);
        if (objRN != null) {
            arrayList2.add(view);
            r.yS(objRN, view, arrayList);
            vy(objRN, obj2, arrayMapJ0, eVar.v5, eVar.Zo);
            Rect rect2 = new Rect();
            View viewLg = lg(arrayMapWe, eVar, obj, z);
            if (viewLg != null) {
                r.a8(obj, rect2);
            }
            rect = rect2;
            view2 = viewLg;
        } else {
            view2 = null;
            rect = null;
        }
        e0.j6(viewGroup, new c(fragment, fragment2, z, arrayMapWe, view2, rect));
        return objRN;
    }

    private static Object U2(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return r.VH(z ? fragment.lg() : fragment.J8());
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void VH(androidx.core.app.d r16, androidx.core.app.d.a r17, android.util.SparseArray<androidx.core.app.q.e> r18, boolean r19, boolean r20) throws java.lang.NoSuchFieldException, android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.q.VH(androidx.core.app.d, androidx.core.app.d$a, android.util.SparseArray, boolean, boolean):void");
    }

    private static Object Ws(ViewGroup viewGroup, View view, ArrayMap<String, String> arrayMap, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object objRN;
        ArrayMap<String, String> arrayMap2;
        Object obj3;
        Fragment fragment = eVar.j6;
        Fragment fragment2 = eVar.Hw;
        Rect rect = null;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.DW;
        if (arrayMap.isEmpty()) {
            arrayMap2 = arrayMap;
            objRN = null;
        } else {
            objRN = rN(fragment, fragment2, z);
            arrayMap2 = arrayMap;
        }
        ArrayMap<String, View> arrayMapJ0 = J0(arrayMap2, objRN, eVar);
        if (arrayMap.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(arrayMapJ0.values());
            obj3 = objRN;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        EQ(fragment, fragment2, z, arrayMapJ0, true);
        if (obj3 != null) {
            rect = new Rect();
            r.yS(obj3, view, arrayList);
            vy(obj3, obj2, arrayMapJ0, eVar.v5, eVar.Zo);
            if (obj != null) {
                r.a8(obj, rect);
            }
        }
        e0.j6(viewGroup, new d(arrayMap, obj3, eVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    private static void XL(m mVar, int i, e eVar, View view, ArrayMap<String, String> arrayMap) {
        Object obj;
        ViewGroup viewGroup = mVar.n5.FH() ? (ViewGroup) mVar.n5.DW(i) : null;
        if (viewGroup == null) {
            return;
        }
        Fragment fragment = eVar.j6;
        Fragment fragment2 = eVar.Hw;
        boolean z = eVar.DW;
        boolean z2 = eVar.v5;
        Object objU2 = U2(fragment, z);
        Object objA8 = a8(fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object objWs = Ws(viewGroup, view, arrayMap, eVar, arrayList, arrayList2, objU2, objA8);
        if (objU2 == null && objWs == null) {
            obj = objA8;
            if (obj == null) {
                return;
            }
        } else {
            obj = objA8;
        }
        ArrayList<View> arrayListJ8 = J8(obj, fragment2, arrayList, view);
        Object obj2 = (arrayListJ8 == null || arrayListJ8.isEmpty()) ? null : obj;
        r.DW(objU2, view);
        Object objEr = er(objU2, obj2, objWs, fragment, eVar.DW);
        if (objEr != null) {
            ArrayList arrayList3 = new ArrayList();
            r.U2(objEr, objU2, arrayList3, obj2, arrayListJ8, objWs, arrayList2);
            BT(viewGroup, fragment, view, arrayList2, objU2, arrayList3, obj2, arrayListJ8);
            r.rN(viewGroup, arrayList2, arrayMap);
            r.Hw(viewGroup, objEr);
            r.Mr(viewGroup, arrayList2, arrayMap);
        }
    }

    private static void Zo(ArrayList<View> arrayList, ArrayMap<String, View> arrayMap, Collection<String> collection) {
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            View viewValueAt = arrayMap.valueAt(size);
            if (collection.contains(ViewCompat.VH(viewValueAt))) {
                arrayList.add(viewValueAt);
            }
        }
    }

    private static Object a8(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return r.VH(z ? fragment.er() : fragment.QX());
    }

    private static void aM(m mVar, int i, e eVar, View view, ArrayMap<String, String> arrayMap) {
        Object obj;
        ViewGroup viewGroup = mVar.n5.FH() ? (ViewGroup) mVar.n5.DW(i) : null;
        if (viewGroup == null) {
            return;
        }
        Fragment fragment = eVar.j6;
        Fragment fragment2 = eVar.Hw;
        boolean z = eVar.DW;
        boolean z2 = eVar.v5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object objU2 = U2(fragment, z);
        Object objA8 = a8(fragment2, z2);
        Object objQX = QX(viewGroup, view, arrayMap, eVar, arrayList2, arrayList, objU2, objA8);
        if (objU2 == null && objQX == null) {
            obj = objA8;
            if (obj == null) {
                return;
            }
        } else {
            obj = objA8;
        }
        ArrayList<View> arrayListJ8 = J8(obj, fragment2, arrayList2, view);
        ArrayList<View> arrayListJ82 = J8(objU2, fragment, arrayList, view);
        P8(arrayListJ82, 4);
        Object objEr = er(objU2, obj, objQX, fragment, z);
        if (objEr != null) {
            yS(obj, fragment2, arrayListJ8);
            ArrayList<String> arrayListQX = r.QX(arrayList);
            r.U2(objEr, objU2, arrayListJ82, obj, arrayListJ8, objQX, arrayList);
            r.Hw(viewGroup, objEr);
            r.er(viewGroup, arrayList2, arrayList, arrayListQX, arrayMap);
            P8(arrayListJ82, 0);
            r.gW(objQX, arrayList2, arrayList);
        }
    }

    static void ei(m mVar, ArrayList<androidx.core.app.d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (mVar.q7 >= 1 && Build.VERSION.SDK_INT >= 21) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                androidx.core.app.d dVar = arrayList.get(i3);
                if (arrayList2.get(i3).booleanValue()) {
                    tp(dVar, sparseArray, z);
                } else {
                    gn(dVar, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(mVar.Z1.u7());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int iKeyAt = sparseArray.keyAt(i4);
                    ArrayMap<String, String> arrayMapU7 = u7(iKeyAt, arrayList, arrayList2, i, i2);
                    e eVar = (e) sparseArray.valueAt(i4);
                    if (z) {
                        aM(mVar, iKeyAt, eVar, view, arrayMapU7);
                    } else {
                        XL(mVar, iKeyAt, eVar, view, arrayMapU7);
                    }
                }
            }
        }
    }

    private static Object er(Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.u7() : fragment.getSupportFragmentManager() ? r.Ws(obj2, obj, obj3) : r.J8(obj2, obj, obj3);
    }

    private static void gW(ArrayMap<String, String> arrayMap, ArrayMap<String, View> arrayMap2) {
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            if (!arrayMap2.containsKey(arrayMap.valueAt(size))) {
                arrayMap.tp(size);
            }
        }
    }

    public static void gn(androidx.core.app.d dVar, SparseArray<e> sparseArray, boolean z) throws NoSuchFieldException, Resources.NotFoundException {
        int size = dVar.DW.size();
        for (int i = 0; i < size; i++) {
            VH(dVar, dVar.DW.get(i), sparseArray, false, z);
        }
    }

    private static e j3(e eVar, SparseArray<e> sparseArray, int i) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(i, eVar2);
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static View lg(ArrayMap<String, View> arrayMap, e eVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        androidx.core.app.d dVar = eVar.FH;
        if (obj == null || arrayMap == null || (arrayList = dVar.XL) == null || arrayList.isEmpty()) {
            return null;
        }
        return arrayMap.get(z ? dVar.XL.get(0) : dVar.aM.get(0));
    }

    private static Object rN(Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return r.BT(r.VH(z ? fragment2.gW() : fragment.yS()));
    }

    public static void tp(androidx.core.app.d dVar, SparseArray<e> sparseArray, boolean z) throws NoSuchFieldException, Resources.NotFoundException {
        if (dVar.j6.n5.FH()) {
            for (int size = dVar.DW.size() - 1; size >= 0; size--) {
                VH(dVar, dVar.DW.get(size), sparseArray, true, z);
            }
        }
    }

    private static ArrayMap<String, String> u7(int i, ArrayList<androidx.core.app.d> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            androidx.core.app.d dVar = arrayList.get(i4);
            if (dVar.lg(i)) {
                boolean zBooleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = dVar.XL;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = dVar.XL;
                        arrayList4 = dVar.aM;
                    } else {
                        ArrayList<String> arrayList6 = dVar.XL;
                        arrayList3 = dVar.aM;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String strRemove = arrayMap.remove(str2);
                        if (strRemove != null) {
                            arrayMap.put(str, strRemove);
                        } else {
                            arrayMap.put(str, str2);
                        }
                    }
                }
            }
        }
        return arrayMap;
    }

    private static void vy(Object obj, Object obj2, ArrayMap<String, View> arrayMap, boolean z, androidx.core.app.d dVar) {
        ArrayList<String> arrayList = dVar.XL;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = arrayMap.get(z ? dVar.aM.get(0) : dVar.XL.get(0));
        r.lg(obj, view);
        if (obj2 != null) {
            r.lg(obj2, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayMap<String, View> we(ArrayMap<String, String> arrayMap, Object obj, e eVar) {
        j0 j0VarWs;
        ArrayList<String> arrayList;
        String strMr;
        Fragment fragment = eVar.j6;
        View viewVy = fragment.vy();
        if (arrayMap.isEmpty() || obj == null || viewVy == null) {
            arrayMap.clear();
            return null;
        }
        ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
        r.tp(arrayMap2, viewVy);
        androidx.core.app.d dVar = eVar.FH;
        if (eVar.DW) {
            j0VarWs = fragment.XL();
            arrayList = dVar.XL;
        } else {
            j0VarWs = fragment.Ws();
            arrayList = dVar.aM;
        }
        if (arrayList != null) {
            arrayMap2.J8(arrayList);
        }
        if (j0VarWs != null) {
            j0VarWs.j6(arrayList, arrayMap2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = arrayMap2.get(str);
                if (view == null) {
                    String strMr2 = Mr(arrayMap, str);
                    if (strMr2 != null) {
                        arrayMap.remove(strMr2);
                    }
                } else if (!str.equals(ViewCompat.VH(view)) && (strMr = Mr(arrayMap, str)) != null) {
                    arrayMap.put(strMr, ViewCompat.VH(view));
                }
            }
        } else {
            gW(arrayMap, arrayMap2);
        }
        return arrayMap2;
    }

    private static void yS(Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.hK && fragment.Gj && fragment.Pa) {
            fragment.e9(true);
            r.j3(obj, fragment.vy(), arrayList);
            e0.j6(fragment.sM, new a(arrayList));
        }
    }
}
