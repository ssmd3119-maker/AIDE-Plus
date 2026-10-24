package abcd;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuView;
import com.probelytics.api.UserActionWidget;
import com.probelytics.api.UserActionWindow;
import com.probelytics.api.UserInputAction;
import com.probelytics.api.UserTouchAction;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class bz {
    public static int DW;
    private static boolean FH;
    public static boolean j6;

    private static class a {
        private final int DW;
        private final int FH;
        private final Handler Hw = new Handler();
        private float VH;
        private float Zo;
        private boolean gn;
        private final UserActionWindow j6;
        private final Runnable v5;

        /* renamed from: abcd.bz$a$a, reason: collision with other inner class name */
        class RunnableC0001a implements Runnable {
            final /* synthetic */ UserActionWindow WB;

            public RunnableC0001a(UserActionWindow userActionWindow) {
                this.WB = userActionWindow;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.gn) {
                    a.this.gn = false;
                    if (a.VH(this.WB.getWindowView())) {
                        e.J0(this.WB, a.this.Zo, a.this.VH);
                    } else {
                        e.we(this.WB, a.this.Zo, a.this.VH);
                    }
                }
            }
        }

        public a(UserActionWindow userActionWindow) {
            this.j6 = userActionWindow;
            this.v5 = new RunnableC0001a(userActionWindow);
            int i = (int) (userActionWindow.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.DW = i * i;
            this.FH = ViewConfiguration.getLongPressTimeout();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean VH(View view) {
            if (!view.isShown()) {
                return false;
            }
            Activity activityZo = Zo(view.getContext());
            return activityZo == null || activityZo.getWindow().getDecorView().isShown();
        }

        private static Activity Zo(Context context) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (context instanceof ContextWrapper) {
                return Zo(((ContextWrapper) context).getBaseContext());
            }
            return null;
        }

        public void gn(MotionEvent motionEvent) {
            u7(motionEvent);
        }

        public void u7(MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                this.Zo = motionEvent.getX();
                this.VH = motionEvent.getY();
                this.gn = true;
                this.Hw.postDelayed(this.v5, this.FH);
                return;
            }
            if (motionEvent.getActionMasked() != 1) {
                if (motionEvent.getActionMasked() == 3) {
                    this.Hw.removeCallbacks(this.v5);
                    return;
                } else {
                    if (motionEvent.getActionMasked() != 2 || ((motionEvent.getX() - this.Zo) * (motionEvent.getX() - this.Zo)) + ((motionEvent.getY() - this.VH) * (motionEvent.getY() - this.VH)) < this.DW) {
                        return;
                    }
                    this.Hw.removeCallbacks(this.v5);
                    return;
                }
            }
            this.Hw.removeCallbacks(this.v5);
            if (this.gn) {
                this.gn = false;
                float x = (motionEvent.getX() - this.Zo) * (motionEvent.getX() - this.Zo);
                float y = motionEvent.getY() - this.VH;
                float y2 = motionEvent.getY();
                float f = this.VH;
                if (x + (y * (y2 - f)) >= this.DW) {
                    e.J8(this.j6, this.Zo, f, motionEvent.getX(), motionEvent.getY());
                } else {
                    e.we(this.j6, this.Zo, f);
                }
            }
        }
    }

    private static class b implements View.OnTouchListener {
        private final a WB;

        public b(PopupWindow popupWindow, UserActionWindow userActionWindow) {
            this.WB = new a(userActionWindow);
        }

        public static View.OnTouchListener j6(PopupWindow popupWindow) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mTouchInterceptor");
                declaredField.setAccessible(true);
                return (View.OnTouchListener) declaredField.get(popupWindow);
            } catch (Throwable th) {
                b00.VH("Runtime Error", th);
                return null;
            }
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            try {
                this.WB.u7(motionEvent);
                return false;
            } catch (Throwable th) {
                b00.VH("Runtime Error", th);
                return false;
            }
        }
    }

    private static class c extends FrameLayout {
        private a WB;

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            a aVar = this.WB;
            if (aVar != null) {
                aVar.u7(motionEvent);
            }
            return getChildAt(0).dispatchTouchEvent(motionEvent);
        }

        public void j6(UserActionWindow userActionWindow) {
            this.WB = new a(userActionWindow);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            ((ViewGroup) getChildAt(0)).onInterceptTouchEvent(motionEvent);
            return true;
        }
    }

    private static class d implements Window.Callback {
        private final a WB;
        private final UserActionWindow jw;
        private final Window.Callback mb;

        class a implements ViewTreeObserver.OnGlobalLayoutListener {
            public a() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() throws NoSuchMethodException, SecurityException {
                d.this.DW();
            }
        }

        public d(Window window, UserActionWindow userActionWindow) throws NoSuchMethodException, SecurityException {
            this.mb = window.getCallback();
            this.WB = new a(userActionWindow);
            this.jw = userActionWindow;
            if (userActionWindow.getType() == 0) {
                window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new a());
                DW();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void DW() throws NoSuchMethodException, SecurityException {
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) this.jw.getWindowView().getContext().getSystemService("input_method");
                Method declaredMethod = inputMethodManager.getClass().getDeclaredMethod("getInputMethodWindowVisibleHeight", new Class[0]);
                declaredMethod.setAccessible(true);
                Integer num = (Integer) declaredMethod.invoke(inputMethodManager, new Object[0]);
                bz.DW = num.intValue();
                boolean z = num.intValue() > 0;
                if (bz.j6 != z) {
                    bz.j6 = z;
                    if (z) {
                        bz.Ws(this.jw);
                    } else {
                        bz.J0(this.jw);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.view.Window.Callback
        public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            try {
                this.WB.gn(motionEvent);
            } catch (Throwable th) {
                b00.VH("Runtime Error", th);
            }
            return this.mb.dispatchGenericMotionEvent(motionEvent);
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            UserActionWindow userActionWindowJ0;
            if (keyEvent.getAction() == 1 && this.jw.getActivity() != null && (userActionWindowJ0 = sy.J0()) != null) {
                bz.aM(new UserInputAction(userActionWindowJ0, keyEvent.getKeyCode() == 4));
            }
            return this.mb.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return this.mb.dispatchKeyShortcutEvent(keyEvent);
        }

        @Override // android.view.Window.Callback
        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            return this.mb.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }

        @Override // android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            try {
                this.WB.u7(motionEvent);
            } catch (Throwable th) {
                b00.VH("Runtime Error", th);
            }
            return this.mb.dispatchTouchEvent(motionEvent);
        }

        @Override // android.view.Window.Callback
        public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            return this.mb.dispatchTrackballEvent(motionEvent);
        }

        @Override // android.view.Window.Callback
        public void onActionModeFinished(ActionMode actionMode) {
            this.mb.onActionModeFinished(actionMode);
        }

        @Override // android.view.Window.Callback
        public void onActionModeStarted(ActionMode actionMode) {
            this.mb.onActionModeStarted(actionMode);
        }

        @Override // android.view.Window.Callback
        public void onAttachedToWindow() {
            this.mb.onAttachedToWindow();
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            this.mb.onContentChanged();
        }

        @Override // android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            return this.mb.onCreatePanelMenu(i, menu);
        }

        @Override // android.view.Window.Callback
        public View onCreatePanelView(int i) {
            return this.mb.onCreatePanelView(i);
        }

        @Override // android.view.Window.Callback
        public void onDetachedFromWindow() {
            this.mb.onDetachedFromWindow();
        }

        @Override // android.view.Window.Callback
        public boolean onMenuItemSelected(int i, MenuItem menuItem) {
            return this.mb.onMenuItemSelected(i, menuItem);
        }

        @Override // android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            return this.mb.onMenuOpened(i, menu);
        }

        @Override // android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            this.mb.onPanelClosed(i, menu);
        }

        @Override // android.view.Window.Callback
        public void onPointerCaptureChanged(boolean z) {
            this.mb.onPointerCaptureChanged(z);
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            return this.mb.onPreparePanel(i, view, menu);
        }

        @Override // android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            this.mb.onProvideKeyboardShortcuts(list, menu, i);
        }

        @Override // android.view.Window.Callback
        public boolean onSearchRequested(SearchEvent searchEvent) {
            return this.mb.onSearchRequested(searchEvent);
        }

        @Override // android.view.Window.Callback
        public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
            this.mb.onWindowAttributesChanged(layoutParams);
        }

        @Override // android.view.Window.Callback
        public void onWindowFocusChanged(boolean z) {
            this.mb.onWindowFocusChanged(z);
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return this.mb.onWindowStartingActionMode(callback);
        }

        @Override // android.view.Window.Callback
        public boolean onSearchRequested() {
            return this.mb.onSearchRequested();
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return this.mb.onWindowStartingActionMode(callback, i);
        }
    }

    private static class e {
        private static View DW(View view, float f, float f2) {
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getX() <= f && childAt.getX() + childAt.getWidth() >= f && childAt.getY() <= f2 && childAt.getY() + childAt.getHeight() >= f2) {
                    return childAt;
                }
            }
            return null;
        }

        private static boolean EQ(View view, View view2) {
            return (Build.VERSION.SDK_INT >= 21 && view.getElevation() > view2.getElevation()) || view.getWidth() * view.getHeight() < view2.getWidth() * view2.getHeight();
        }

        private static View FH(View view, float f, float f2) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                View view2 = null;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    View viewFH = FH(childAt, (f - childAt.getX()) + childAt.getScrollX(), (f2 - childAt.getY()) + childAt.getScrollY());
                    if (viewFH != null && (view2 == null || EQ(viewFH, view2))) {
                        view2 = viewFH;
                    }
                }
                if (view2 != null) {
                    return view2;
                }
            }
            if (!view.isClickable() || f < 0.0f || f2 < 0.0f || f > view.getWidth() || f2 > view.getHeight() || !view.isShown()) {
                return null;
            }
            return view;
        }

        private static Pair<Integer, View> Hw(View view, float f, float f2, View view2) {
            if (!(view2 instanceof ListView)) {
                return null;
            }
            float fU7 = f - u7(view, view2);
            float fTp = f2 - tp(view, view2);
            int iPointToPosition = ((ListView) view2).pointToPosition((int) fU7, (int) fTp);
            if (iPointToPosition == -1) {
                return null;
            }
            return new Pair<>(Integer.valueOf(iPointToPosition), DW(view2, fU7, fTp));
        }

        public static void J0(UserActionWindow userActionWindow, float f, float f2) {
            View viewV5 = v5(userActionWindow.getWindowView(), f, f2);
            if (viewV5 == null) {
                int i = (int) f;
                int i2 = (int) f2;
                bz.Mr(new UserTouchAction(userActionWindow, null, 2, i, i2, i, i2));
                return;
            }
            Pair<Integer, View> pairHw = Hw(userActionWindow.getWindowView(), f, f2, viewV5);
            if (pairHw != null) {
                int i3 = (int) f;
                int i4 = (int) f2;
                bz.XL(new UserTouchAction(userActionWindow, new UserActionWidget(viewV5, ((Integer) pairHw.first).intValue(), (View) pairHw.second), 3, i3, i4, i3, i4), viewV5, j6(viewV5), ((Integer) pairHw.first).intValue(), (View) pairHw.second);
                return;
            }
            Pair<? extends View, Integer> pairGn = gn(viewV5);
            if (pairGn == null) {
                int i5 = (int) f;
                int i6 = (int) f2;
                bz.j3(new UserTouchAction(userActionWindow, new UserActionWidget(viewV5, 0, null), 4, i5, i6, i5, i6), viewV5);
            } else {
                int i7 = (int) f;
                int i8 = (int) f2;
                UserTouchAction userTouchAction = new UserTouchAction(userActionWindow, new UserActionWidget(viewV5, ((Integer) pairGn.second).intValue(), (View) pairGn.first), 3, i7, i8, i7, i8);
                Object obj = pairGn.first;
                bz.XL(userTouchAction, (View) obj, j6((View) obj), ((Integer) pairGn.second).intValue(), viewV5);
            }
        }

        public static void J8(UserActionWindow userActionWindow, float f, float f2, float f3, float f4) {
            bz.a8(new UserTouchAction(userActionWindow, null, 1, (int) f, (int) f2, (int) f3, (int) f4));
        }

        private static <V extends View> Pair<V, View> VH(View view, Class<V> cls) {
            Object parent = view.getParent();
            if (cls.isInstance(parent)) {
                return new Pair<>((View) parent, view);
            }
            if (parent instanceof View) {
                return VH((View) parent, cls);
            }
            return null;
        }

        private static MenuItem Zo(View view) {
            try {
                if (view instanceof MenuView.ItemView) {
                    return ((MenuView.ItemView) view).getItemData();
                }
            } catch (Throwable unused) {
            }
            try {
                if (view instanceof MenuView.ItemView) {
                    return ((MenuView.ItemView) view).getItemData();
                }
            } catch (Throwable unused2) {
            }
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuView$ItemView");
                if (cls.isInstance(view)) {
                    return (MenuItem) cls.getDeclaredMethod("getItemData", new Class[0]).invoke(view, new Object[0]);
                }
                return null;
            } catch (Throwable unused3) {
                return null;
            }
        }

        private static Pair<? extends View, Integer> gn(View view) {
            try {
                Pair pairVH = VH(view, RecyclerView.class);
                if (pairVH != null) {
                    return new Pair<>(pairVH.first, Integer.valueOf(((RecyclerView) pairVH.first).getChildAdapterPosition((View) pairVH.second)));
                }
            } catch (Throwable unused) {
            }
            try {
                Pair pairVH2 = VH(view, androidx.recyclerview.widget.RecyclerView.class);
                if (pairVH2 == null) {
                    return null;
                }
                return new Pair<>(pairVH2.first, Integer.valueOf(((androidx.recyclerview.widget.RecyclerView) pairVH2.first).getChildAdapterPosition((View) pairVH2.second)));
            } catch (Throwable unused2) {
                return null;
            }
        }

        private static Object j6(View view) {
            if (view instanceof AdapterView) {
                return ((AdapterView) view).getAdapter();
            }
            try {
                if (view instanceof RecyclerView) {
                    return ((RecyclerView) view).getAdapter();
                }
            } catch (Throwable unused) {
            }
            try {
                if (view instanceof androidx.recyclerview.widget.RecyclerView) {
                    return ((androidx.recyclerview.widget.RecyclerView) view).getAdapter();
                }
                return null;
            } catch (Throwable unused2) {
                return null;
            }
        }

        private static float tp(View view, View view2) {
            if (view2 == view) {
                return 0.0f;
            }
            return view2.getY() + tp(view, (View) view2.getParent());
        }

        private static float u7(View view, View view2) {
            if (view2 == view) {
                return 0.0f;
            }
            return view2.getX() + u7(view, (View) view2.getParent());
        }

        private static View v5(View view, float f, float f2) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                View view2 = null;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    View viewFH = FH(childAt, (f - childAt.getX()) + childAt.getScrollX(), (f2 - childAt.getY()) + childAt.getScrollY());
                    if (viewFH != null && (view2 == null || EQ(viewFH, view2))) {
                        view2 = viewFH;
                    }
                }
                if (view2 != null) {
                    return view2;
                }
            }
            if (!view.isLongClickable() || f < 0.0f || f2 < 0.0f || f > view.getWidth() || f2 > view.getHeight() || !view.isShown()) {
                return null;
            }
            return view;
        }

        public static void we(UserActionWindow userActionWindow, float f, float f2) {
            View viewFH = FH(userActionWindow.getWindowView(), f, f2);
            if (viewFH == null) {
                int i = (int) f;
                int i2 = (int) f2;
                bz.lg(new UserTouchAction(userActionWindow, null, 0, i, i2, i, i2));
                return;
            }
            MenuItem menuItemZo = Zo(viewFH);
            if (menuItemZo != null) {
                int i3 = (int) f;
                int i4 = (int) f2;
                bz.U2(new UserTouchAction(userActionWindow, new UserActionWidget(viewFH, 0, null), 5, i3, i4, i3, i4), menuItemZo);
                return;
            }
            Pair<Integer, View> pairHw = Hw(userActionWindow.getWindowView(), f, f2, viewFH);
            if (pairHw != null) {
                MenuItem menuItemZo2 = Zo((View) pairHw.second);
                if (menuItemZo2 != null) {
                    int i5 = (int) f;
                    int i6 = (int) f2;
                    bz.U2(new UserTouchAction(userActionWindow, new UserActionWidget(viewFH, ((Integer) pairHw.first).intValue(), (View) pairHw.second), 5, i5, i6, i5, i6), menuItemZo2);
                    return;
                } else {
                    int i7 = (int) f;
                    int i8 = (int) f2;
                    bz.QX(new UserTouchAction(userActionWindow, new UserActionWidget(viewFH, ((Integer) pairHw.first).intValue(), (View) pairHw.second), 6, i7, i8, i7, i8), viewFH, j6(viewFH), ((Integer) pairHw.first).intValue(), (View) pairHw.second);
                    return;
                }
            }
            Pair<? extends View, Integer> pairGn = gn(viewFH);
            if (pairGn == null) {
                int i9 = (int) f;
                int i10 = (int) f2;
                bz.we(new UserTouchAction(userActionWindow, new UserActionWidget(viewFH, 0, null), 7, i9, i10, i9, i10), viewFH);
            } else {
                int i11 = (int) f;
                int i12 = (int) f2;
                UserTouchAction userTouchAction = new UserTouchAction(userActionWindow, new UserActionWidget(viewFH, ((Integer) pairGn.second).intValue(), (View) pairGn.first), 6, i11, i12, i11, i12);
                Object obj = pairGn.first;
                bz.QX(userTouchAction, (View) obj, j6((View) obj), ((Integer) pairGn.second).intValue(), viewFH);
            }
        }
    }

    static {
        new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J0(UserActionWindow userActionWindow) {
        py.j3(userActionWindow);
    }

    public static void J8(UserInputAction userInputAction) {
        aM(userInputAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Mr(UserTouchAction userTouchAction) {
        py.cb(userTouchAction);
        FH = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void QX(UserTouchAction userTouchAction, View view, Object obj, int i, View view2) {
        py.cb(userTouchAction);
        py.rN(userTouchAction, view, obj, i, view2);
        FH = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void U2(UserTouchAction userTouchAction, MenuItem menuItem) {
        py.cb(userTouchAction);
        py.P8(userTouchAction, menuItem);
        FH = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Ws(UserActionWindow userActionWindow) {
        py.Mr(userActionWindow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void XL(UserTouchAction userTouchAction, View view, Object obj, int i, View view2) {
        py.cb(userTouchAction);
        py.er(userTouchAction, view, obj, i, view2);
        FH = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a8(UserTouchAction userTouchAction) {
        py.cb(userTouchAction);
        FH = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void aM(UserInputAction userInputAction) {
        if (userInputAction.isBackKey()) {
            py.lg(userInputAction);
            FH = false;
        } else {
            if (FH) {
                return;
            }
            py.lg(userInputAction);
            FH = true;
        }
    }

    public static void er(Window window, UserActionWindow userActionWindow) {
        if (window.getCallback() instanceof d) {
            ((d) window.getCallback()).DW();
        } else {
            window.setCallback(new d(window, userActionWindow));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j3(UserTouchAction userTouchAction, View view) {
        py.cb(userTouchAction);
        py.gW(userTouchAction, view);
        FH = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lg(UserTouchAction userTouchAction) {
        py.cb(userTouchAction);
        FH = false;
    }

    public static void rN(View view, UserActionWindow userActionWindow) {
        if (view instanceof c) {
            ((c) view).j6(userActionWindow);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void we(UserTouchAction userTouchAction, View view) {
        py.cb(userTouchAction);
        py.XL(userTouchAction, view);
        FH = false;
    }

    public static void yS(PopupWindow popupWindow, UserActionWindow userActionWindow) {
        if (b.j6(popupWindow) instanceof b) {
            return;
        }
        popupWindow.setTouchInterceptor(new b(popupWindow, userActionWindow));
    }
}
