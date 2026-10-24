package abcd;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow;
import com.probelytics.api.UserActionWindow;
import com.probelytics.api.UserInputAction;
import com.probelytics.api.UserLaunchAction;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class sy {
    private static Field FH;
    private static Object Hw;
    private static Handler VH;
    private static Object Zo;
    private static Runnable gn;
    private static c tp;
    private static Activity u7;
    private static Field v5;
    private static List<Pair<View, UserActionWindow>> j6 = new ArrayList();
    private static List<WeakReference<PopupWindow>> DW = new ArrayList();

    static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                sy.er();
                sy.rN();
            } catch (Throwable th) {
                b00.VH("Runtime Error", th);
            }
            sy.VH.postDelayed(sy.gn, sy.j6.size() == 0 ? 1000L : 10L);
        }
    }

    static class b implements Application.ActivityLifecycleCallbacks {
        private long WB;
        private Class mb;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            try {
                if (!wy.VH(activity, activity.getIntent()) && sy.j3(activity.getIntent()) && (this.mb != activity.getClass() || this.WB < System.currentTimeMillis() - 1000)) {
                    py.yS(new UserLaunchAction(activity));
                }
                py.we(activity);
            } catch (Throwable th) {
                b00.VH("Runtime Error", th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            try {
                this.WB = System.currentTimeMillis();
                this.mb = activity.getClass();
                kz.DW(-1L);
            } catch (Throwable th) {
                b00.VH("Runtime Error", th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            try {
                if (activity == sy.u7) {
                    Activity unused = sy.u7 = null;
                }
                kz.DW(-1L);
            } catch (Throwable th) {
                b00.VH("Runtime Error", th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            try {
                sy.tp();
                oz.XL();
                uz.Hw();
                ty.aM();
                Activity unused = sy.u7 = activity;
            } catch (Throwable th) {
                b00.VH("Runtime Error", th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            try {
                py.J0(activity);
            } catch (Throwable th) {
                b00.VH("Runtime Error", th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            try {
                py.J8(activity);
            } catch (Throwable th) {
                b00.VH("Runtime Error", th);
            }
        }
    }

    private static class c extends InputConnectionWrapper {
        public c(InputConnection inputConnection, boolean z) {
            super(inputConnection, z);
        }

        private void j6() {
            UserActionWindow userActionWindowJ0 = sy.J0();
            if (userActionWindowJ0 != null) {
                bz.J8(new UserInputAction(userActionWindowJ0, false));
            }
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitText(CharSequence charSequence, int i) {
            j6();
            return super.commitText(charSequence, i);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean setComposingText(CharSequence charSequence, int i) {
            j6();
            return super.setComposingText(charSequence, i);
        }
    }

    private static Activity EQ(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return EQ(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static UserActionWindow J0() {
        if (u7 == null) {
            return null;
        }
        for (Pair<View, UserActionWindow> pair : j6) {
            if (((UserActionWindow) pair.second).getType() != 0 && ((UserActionWindow) pair.second).getActivity() == u7) {
                return (UserActionWindow) pair.second;
            }
        }
        for (Pair<View, UserActionWindow> pair2 : j6) {
            if (((UserActionWindow) pair2.second).getActivity() == u7) {
                return (UserActionWindow) pair2.second;
            }
        }
        return null;
    }

    private static PopupWindow J8(View view) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                Field declaredField = view.getClass().getDeclaredField("this$0");
                declaredField.setAccessible(true);
                return (PopupWindow) declaredField.get(view);
            }
            try {
                View childAt = ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0);
                Field declaredField2 = childAt.getClass().getDeclaredField("mHoverListener");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(childAt);
                Field declaredField3 = Class.forName("android.widget.ListPopupWindow").getDeclaredField("mPopup");
                declaredField3.setAccessible(true);
                return (PopupWindow) declaredField3.get(obj);
            } catch (Exception unused) {
                Iterator<WeakReference<PopupWindow>> it = DW.iterator();
                while (it.hasNext()) {
                    PopupWindow popupWindow = it.next().get();
                    if (popupWindow != null && popupWindow.getContentView() != null && Mr(view, popupWindow.getContentView())) {
                        return popupWindow;
                    }
                }
                return null;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    private static boolean Mr(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view2.getParent() instanceof View) {
            return Mr(view, (View) view2.getParent());
        }
        return false;
    }

    private static Window QX(View view) throws NoSuchFieldException {
        try {
            Field declaredField = Class.forName("com.android.internal.policy.DecorView").getDeclaredField("mWindow");
            declaredField.setAccessible(true);
            return (Window) declaredField.get(view);
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT >= 29) {
                return null;
            }
            try {
                Field declaredField2 = view.getClass().getDeclaredField("this$0");
                declaredField2.setAccessible(true);
                return (Window) declaredField2.get(view);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    private static boolean U2(View view) {
        if (!view.isShown()) {
            return false;
        }
        Activity activityEQ = EQ(view.getContext());
        return activityEQ == null || activityEQ.getWindow().getDecorView().isShown();
    }

    private static List<View> Ws() throws IllegalAccessException, IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        try {
            if (FH != null) {
                obj = FH.get(Hw);
            } else if (v5 != null) {
                obj = v5.get(Zo);
            }
            List<View> arrayList2 = new ArrayList();
            if (obj instanceof List) {
                arrayList2 = (List) obj;
            } else if (obj instanceof View[]) {
                arrayList2 = Arrays.asList((View[]) obj);
            }
            for (View view : arrayList2) {
                if (U2(view)) {
                    arrayList.add(view);
                }
            }
        } catch (IllegalAccessException unused) {
        }
        return arrayList;
    }

    public static void XL() {
        Application applicationDW = iy.DW();
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                Hw = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mViews");
                FH = declaredField;
                declaredField.setAccessible(true);
            } else if (Build.VERSION.SDK_INT >= 14 && Build.VERSION.SDK_INT < 17) {
                Class<?> cls2 = Class.forName("android.view.WindowManagerImpl");
                Zo = cls2.getMethod("getDefault", new Class[0]).invoke(null, new Object[0]);
                Field declaredField2 = cls2.getDeclaredField("mViews");
                v5 = declaredField2;
                declaredField2.setAccessible(true);
            }
        } catch (Throwable unused) {
        }
        VH = new Handler();
        a aVar = new a();
        gn = aVar;
        VH.post(aVar);
        applicationDW.registerActivityLifecycleCallbacks(new b());
    }

    private static void a8(UserActionWindow userActionWindow) {
        py.sG(userActionWindow);
    }

    private static boolean aM(View view) throws NoSuchFieldException {
        Window windowQX = QX(view);
        return windowQX != null && we(windowQX, null, view).getType() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void er() throws IllegalAccessException, IllegalArgumentException {
        List<View> listWs = Ws();
        List<Pair<View, UserActionWindow>> list = j6;
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            View view = (View) list.get(size).first;
            Iterator<View> it = listWs.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next() == view) {
                        break;
                    }
                } else {
                    a8((UserActionWindow) list.get(size).second);
                    z = true;
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (View view2 : listWs) {
            if (aM(view2)) {
                Iterator<Pair<View, UserActionWindow>> it2 = j6.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Pair<View, UserActionWindow> next = it2.next();
                        if (next.first == view2) {
                            arrayList.add(Pair.create(view2, next.second));
                            break;
                        }
                    } else {
                        arrayList.add(Pair.create(view2, lg(view2)));
                        z = true;
                        break;
                    }
                }
            }
        }
        for (View view3 : listWs) {
            if (!aM(view3)) {
                Iterator<Pair<View, UserActionWindow>> it3 = j6.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Pair<View, UserActionWindow> next2 = it3.next();
                        if (next2.first == view3) {
                            arrayList.add(Pair.create(view3, next2.second));
                            break;
                        }
                    } else {
                        arrayList.add(Pair.create(view3, lg(view3)));
                        z = true;
                        break;
                    }
                }
            }
        }
        if (z) {
            j6 = new ArrayList(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j3(Intent intent) {
        return intent != null && "android.intent.action.MAIN".equals(intent.getAction()) && intent.getCategories() != null && intent.getCategories().contains("android.intent.category.LAUNCHER");
    }

    private static UserActionWindow lg(View view) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Window windowQX = QX(view);
        if (windowQX != null) {
            UserActionWindow userActionWindowWe = we(windowQX, null, view);
            py.ef(userActionWindowWe);
            bz.er(windowQX, userActionWindowWe);
            return userActionWindowWe;
        }
        PopupWindow popupWindowJ8 = J8(view);
        if (popupWindowJ8 != null) {
            UserActionWindow userActionWindowWe2 = we(null, popupWindowJ8, view);
            py.ef(userActionWindowWe2);
            bz.yS(popupWindowJ8, userActionWindowWe2);
            return userActionWindowWe2;
        }
        UserActionWindow userActionWindowWe3 = we(null, null, view);
        py.ef(userActionWindowWe3);
        bz.rN(view, userActionWindowWe3);
        return userActionWindowWe3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void rN() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT < 29 || iy.DW().getApplicationInfo().targetSdkVersion < 29) {
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) iy.DW().getSystemService("input_method");
                Field declaredField = inputMethodManager.getClass().getDeclaredField("mServedInputConnectionWrapper");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(inputMethodManager);
                if (obj != null) {
                    Field declaredField2 = obj.getClass().getSuperclass().getDeclaredField("mInputConnection");
                    declaredField2.setAccessible(true);
                    if (declaredField2.getType() == WeakReference.class) {
                        WeakReference weakReference = (WeakReference) declaredField2.get(obj);
                        if (weakReference != null && weakReference.get() != null && !(weakReference.get() instanceof c)) {
                            tp = new c((InputConnection) weakReference.get(), true);
                            declaredField2.set(obj, new WeakReference(tp));
                        }
                    } else {
                        InputConnection inputConnection = (InputConnection) declaredField2.get(obj);
                        if (inputConnection != null && !(inputConnection instanceof c)) {
                            c cVar = new c(inputConnection, true);
                            tp = cVar;
                            declaredField2.set(obj, cVar);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tp() {
        VH.removeCallbacks(gn);
        VH.post(gn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.probelytics.api.UserActionWindow we(android.view.Window r4, android.widget.PopupWindow r5, android.view.View r6) {
        /*
            if (r4 == 0) goto L11
            android.content.Context r0 = r4.getContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            android.content.Context r0 = r4.getContext()
            android.app.Activity r0 = (android.app.Activity) r0
            goto L12
        L11:
            r0 = 0
        L12:
            android.content.Context r1 = r6.getContext()
            android.app.Activity r1 = EQ(r1)
            r2 = 2
            r3 = 3
            if (r0 == 0) goto L20
            r2 = 0
            goto L73
        L20:
            if (r4 != 0) goto L6b
            if (r5 != 0) goto L6b
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            boolean r4 = r4 instanceof android.view.WindowManager.LayoutParams
            if (r4 == 0) goto L40
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            android.view.WindowManager$LayoutParams r4 = (android.view.WindowManager.LayoutParams) r4
            java.lang.CharSequence r4 = r4.getTitle()
            java.lang.String r5 = "Toast"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L40
            r2 = 4
            goto L73
        L40:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            boolean r4 = r4 instanceof android.view.WindowManager.LayoutParams
            if (r4 == 0) goto L72
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            android.view.WindowManager$LayoutParams r4 = (android.view.WindowManager.LayoutParams) r4
            java.lang.CharSequence r4 = r4.getTitle()
            if (r4 == 0) goto L72
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            android.view.WindowManager$LayoutParams r4 = (android.view.WindowManager.LayoutParams) r4
            java.lang.CharSequence r4 = r4.getTitle()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "PopupWindow"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L72
            goto L73
        L6b:
            if (r4 == 0) goto L6f
            r2 = 1
            goto L73
        L6f:
            if (r5 == 0) goto L72
            goto L73
        L72:
            r2 = 3
        L73:
            com.probelytics.api.UserActionWindow r4 = new com.probelytics.api.UserActionWindow
            if (r1 == 0) goto L78
            r0 = r1
        L78:
            r4.<init>(r0, r2, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.sy.we(android.view.Window, android.widget.PopupWindow, android.view.View):com.probelytics.api.UserActionWindow");
    }
}
