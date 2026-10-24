package androidx.core.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import androidx.collection.ArraySet;
import androidx.core.util.DebugUtils;
import androidx.core.util.LogWriter;
import androidx.core.util.Pair;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.BackStackState;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import androidx.fragment.app.FragmentTransaction;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class m extends FragmentManager implements LayoutInflater.Factory2 {
    static Field QO;
    static boolean e9;
    ArrayList<androidx.core.app.d> AL;
    boolean Jl;
    Fragment Q6;
    ArrayList<j> WB;
    androidx.core.app.k Z1;
    String e3;
    boolean eU;
    ArrayList<Fragment> fN;
    ArrayList<FragmentManager.b> hK;
    boolean iW;
    ArrayList<androidx.core.app.d> k2;
    Fragment kf;
    boolean mb;
    androidx.core.app.i n5;
    n oy;
    ArrayList<l> pN;
    ArrayList<Boolean> pO;
    SparseArray<Fragment> qp;
    boolean sE;
    ArrayList<androidx.core.app.d> sg;
    ArrayList<Integer> w9;
    ArrayList<Fragment> zh;
    static final Interpolator sM = new DecelerateInterpolator(2.5f);
    static final Interpolator a5 = new DecelerateInterpolator(1.5f);
    int jw = 0;
    final ArrayList<Fragment> fY = new ArrayList<>();
    private final CopyOnWriteArrayList<Pair<FragmentManager.a, Boolean>> cT = new CopyOnWriteArrayList<>();
    int q7 = 0;
    Bundle Gj = null;
    SparseArray<Parcelable> Cz = null;
    Runnable aX = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws NoSuchFieldException, Resources.NotFoundException {
            m.this.hz();
        }
    }

    class b extends f {
        final /* synthetic */ Fragment DW;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Animation.AnimationListener animationListener, Fragment fragment) {
            super(animationListener, null);
            this.DW = fragment;
        }

        @Override // androidx.core.app.m.f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) throws NoSuchFieldException, Resources.NotFoundException {
            super.onAnimationEnd(animation);
            if (this.DW.tp() != null) {
                this.DW.pN(null);
                m mVar = m.this;
                Fragment fragment = this.DW;
                mVar.e3(fragment, fragment.BT(), 0, 0, false);
            }
        }
    }

    class c extends AnimatorListenerAdapter {
        final /* synthetic */ View DW;
        final /* synthetic */ Fragment FH;
        final /* synthetic */ ViewGroup j6;

        c(ViewGroup viewGroup, View view, Fragment fragment) {
            this.j6 = viewGroup;
            this.DW = view;
            this.FH = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws NoSuchFieldException, Resources.NotFoundException {
            ViewGroup viewGroup = this.j6;
            if (viewGroup != null) {
                viewGroup.endViewTransition(this.DW);
            }
            if (this.FH.EQ() != null) {
                this.FH.oy(null);
                m mVar = m.this;
                Fragment fragment = this.FH;
                mVar.e3(fragment, fragment.BT(), 0, 0, false);
            }
        }
    }

    class d extends AnimatorListenerAdapter {
        final /* synthetic */ View DW;
        final /* synthetic */ Fragment FH;
        final /* synthetic */ ViewGroup j6;

        d(m mVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.j6 = viewGroup;
            this.DW = view;
            this.FH = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.j6.endViewTransition(this.DW);
            animator.removeListener(this);
            View view = this.FH.a5;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    private static class e extends f {
        View DW;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.DW.setLayerType(0, null);
            }
        }

        e(View view, Animation.AnimationListener animationListener) {
            super(animationListener, null);
            this.DW = view;
        }

        @Override // androidx.core.app.m.f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (ViewCompat.isAttachedToWindow(this.DW) || Build.VERSION.SDK_INT >= 24) {
                this.DW.post(new a());
            } else {
                this.DW.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    private static class f implements Animation.AnimationListener {
        private final Animation.AnimationListener j6;

        /* synthetic */ f(Animation.AnimationListener animationListener, a aVar) {
            this(animationListener);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.j6;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.j6;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.j6;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }

        private f(Animation.AnimationListener animationListener) {
            this.j6 = animationListener;
        }
    }

    private static class g {
        public final Animator DW;
        public final Animation j6;

        /* synthetic */ g(Animator animator, a aVar) {
            this(animator);
        }

        /* synthetic */ g(Animation animation, a aVar) {
            this(animation);
        }

        private g(Animation animation) {
            this.j6 = animation;
            this.DW = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        private g(Animator animator) {
            this.j6 = null;
            this.DW = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    private static class h extends AnimatorListenerAdapter {
        View j6;

        h(View view) {
            this.j6 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.j6.setLayerType(0, null);
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.j6.setLayerType(2, null);
        }
    }

    static class i {
        public static final int[] j6 = {R.attr.name, R.attr.id, R.attr.tag};
    }

    interface j {
        boolean j6(ArrayList<androidx.core.app.d> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class k implements j {
        final int DW;
        final int FH;
        final String j6;

        k(String str, int i, int i2) {
            this.j6 = str;
            this.DW = i;
            this.FH = i2;
        }

        @Override // androidx.core.app.m.j
        public boolean j6(ArrayList<androidx.core.app.d> arrayList, ArrayList<Boolean> arrayList2) {
            FragmentManager fragmentManagerMb;
            Fragment fragment = m.this.kf;
            if (fragment == null || this.DW >= 0 || this.j6 != null || (fragmentManagerMb = fragment.mb()) == null || !fragmentManagerMb.u7()) {
                return m.this.fN(arrayList, arrayList2, this.j6, this.DW, this.FH);
            }
            return false;
        }
    }

    static class l implements Fragment.e {
        private final androidx.core.app.d DW;
        private int FH;
        private final boolean j6;

        l(androidx.core.app.d dVar, boolean z) {
            this.j6 = z;
            this.DW = dVar;
        }

        @Override // androidx.fragment.app.Fragment.e
        public void DW() {
            int i = this.FH - 1;
            this.FH = i;
            if (i != 0) {
                return;
            }
            this.DW.j6.gG();
        }

        public boolean VH() {
            return this.FH == 0;
        }

        public void Zo() {
            boolean z = this.FH > 0;
            m mVar = this.DW.j6;
            int size = mVar.fY.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = mVar.fY.get(i);
                fragment.gG(null);
                if (z && fragment.cb()) {
                    fragment.AE();
                }
            }
            androidx.core.app.d dVar = this.DW;
            dVar.j6.rN(dVar, this.j6, !z, true);
        }

        @Override // androidx.fragment.app.Fragment.e
        public void j6() {
            this.FH++;
        }

        public void v5() {
            androidx.core.app.d dVar = this.DW;
            dVar.j6.rN(dVar, this.j6, false, false);
        }
    }

    static {
        new AccelerateInterpolator(2.5f);
        new AccelerateInterpolator(1.5f);
    }

    static boolean An(View view, g gVar) {
        return view != null && gVar != null && Build.VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && ViewCompat.gn(view) && kf(gVar);
    }

    private static void BR(View view, g gVar) throws NoSuchFieldException {
        if (view == null || gVar == null || !An(view, gVar)) {
            return;
        }
        Animator animator = gVar.DW;
        if (animator != null) {
            animator.addListener(new h(view));
            return;
        }
        Animation.AnimationListener animationListenerFY = fY(gVar.j6);
        view.setLayerType(2, null);
        gVar.j6.setAnimationListener(new e(view, animationListenerFY));
    }

    public static int Bx(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? 1 : 2;
        }
        if (i2 == 4099) {
            return z ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    private static void FN(ArrayList<androidx.core.app.d> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.core.app.d dVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                dVar.J0(-1);
                dVar.Mr(i2 == i3 + (-1));
            } else {
                dVar.J0(1);
                dVar.j3();
            }
            i2++;
        }
    }

    private int Gj(ArrayList<androidx.core.app.d> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, ArraySet<Fragment> arraySet) throws NoSuchFieldException, Resources.NotFoundException {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            androidx.core.app.d dVar = arrayList.get(i5);
            boolean zBooleanValue = arrayList2.get(i5).booleanValue();
            if (dVar.yS() && !dVar.rN(arrayList, i5 + 1, i3)) {
                if (this.pN == null) {
                    this.pN = new ArrayList<>();
                }
                l lVar = new l(dVar, zBooleanValue);
                this.pN.add(lVar);
                dVar.vy(lVar);
                if (zBooleanValue) {
                    dVar.j3();
                } else {
                    dVar.Mr(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, dVar);
                }
                J8(arraySet);
            }
        }
        return i4;
    }

    private void J8(ArraySet<Fragment> arraySet) throws NoSuchFieldException, Resources.NotFoundException {
        int i2 = this.q7;
        if (i2 < 1) {
            return;
        }
        int iMin = Math.min(i2, 4);
        int size = this.fY.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.fY.get(i3);
            if (fragment.WB < iMin) {
                e3(fragment, iMin, fragment.Mr(), fragment.U2(), false);
                if (fragment.a5 != null && !fragment.Gj && fragment.An) {
                    arraySet.add(fragment);
                }
            }
        }
    }

    private void Jm(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
        androidx.core.app.k kVar = this.Z1;
        if (kVar != null) {
            try {
                kVar.QX("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            DW("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    static boolean Q6(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) animator).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                if (Q6(childAnimations.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int QO(int i2) {
        if (i2 == 4097) {
            return ProxyTextView.INPUTTYPE_numberDecimal;
        }
        if (i2 == 4099) {
            return 4099;
        }
        if (i2 != 8194) {
            return 0;
        }
        return ProxyTextView.INPUTTYPE_textCapCharacters;
    }

    private void U2() {
        SparseArray<Fragment> sparseArray = this.qp;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.qp.valueAt(size) == null) {
                    SparseArray<Fragment> sparseArray2 = this.qp;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    private void WB() {
        if (this.pN != null) {
            while (!this.pN.isEmpty()) {
                this.pN.remove(0).Zo();
            }
        }
    }

    private void XG(int i2) throws NoSuchFieldException, Resources.NotFoundException {
        try {
            this.mb = true;
            iW(i2, false);
            this.mb = false;
            hz();
        } catch (Throwable th) {
            this.mb = false;
            throw th;
        }
    }

    private void Xa(boolean z) {
        if (this.mb) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (Looper.myLooper() != this.Z1.EQ().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            a8();
        }
        if (this.sg == null) {
            this.sg = new ArrayList<>();
            this.pO = new ArrayList<>();
        }
        this.mb = true;
        try {
            oY(null, null);
        } finally {
            this.mb = false;
        }
    }

    static g Z1(Context context, float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(sM);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(a5);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet, (a) null);
    }

    private static void Za(n nVar) {
        if (nVar == null) {
            return;
        }
        List<Fragment> listDW = nVar.DW();
        if (listDW != null) {
            Iterator<Fragment> it = listDW.iterator();
            while (it.hasNext()) {
                it.next().oy = true;
            }
        }
        List<n> listJ6 = nVar.j6();
        if (listJ6 != null) {
            Iterator<n> it2 = listJ6.iterator();
            while (it2.hasNext()) {
                Za(it2.next());
            }
        }
    }

    private void a8() {
        if (this.iW) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.e3 == null) {
            return;
        }
        throw new IllegalStateException("Can not perform this action inside of " + this.e3);
    }

    private void aM(Fragment fragment, g gVar, int i2) throws NoSuchFieldException {
        View view = fragment.a5;
        fragment.Nh(i2);
        Animation animation = gVar.j6;
        if (animation != null) {
            fragment.pN(fragment.a5);
            animation.setAnimationListener(new b(fY(animation), fragment));
            BR(view, gVar);
            fragment.a5.startAnimation(animation);
            return;
        }
        Animator animator = gVar.DW;
        fragment.oy(animator);
        ViewGroup viewGroup = fragment.sM;
        if (viewGroup != null) {
            viewGroup.startViewTransition(view);
        }
        animator.addListener(new c(viewGroup, view, fragment));
        animator.setTarget(fragment.a5);
        BR(fragment.a5, gVar);
        animator.start();
    }

    static g cT(Context context, float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(a5);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation, (a) null);
    }

    private void et() throws NoSuchFieldException, Resources.NotFoundException {
        SparseArray<Fragment> sparseArray = this.qp;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragmentValueAt = this.qp.valueAt(i2);
            if (fragmentValueAt != null) {
                if (fragmentValueAt.tp() != null) {
                    int iBT = fragmentValueAt.BT();
                    View viewTp = fragmentValueAt.tp();
                    fragmentValueAt.pN(null);
                    Animation animation = viewTp.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        viewTp.clearAnimation();
                    }
                    e3(fragmentValueAt, iBT, 0, 0, false);
                } else if (fragmentValueAt.EQ() != null) {
                    fragmentValueAt.EQ().end();
                }
            }
        }
    }

    private static Animation.AnimationListener fY(Animation animation) throws NoSuchFieldException {
        try {
            if (QO == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                QO = declaredField;
                declaredField.setAccessible(true);
            }
            return (Animation.AnimationListener) QO.get(animation);
        } catch (IllegalAccessException e2) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", e2);
            return null;
        } catch (NoSuchFieldException e3) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e3);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gG() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = (this.pN == null || this.pN.isEmpty()) ? false : true;
            if (this.WB != null && this.WB.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.Z1.EQ().removeCallbacks(this.aX);
                this.Z1.EQ().post(this.aX);
            }
        }
    }

    private void jO(ArrayList<androidx.core.app.d> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) throws NoSuchFieldException, Resources.NotFoundException {
        int i4;
        int i5;
        int i6 = i2;
        boolean z = arrayList.get(i6).j3;
        ArrayList<Fragment> arrayList3 = this.fN;
        if (arrayList3 == null) {
            this.fN = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.fN.addAll(this.fY);
        Fragment fragmentK2 = k2();
        boolean z2 = false;
        for (int i7 = i6; i7 < i3; i7++) {
            androidx.core.app.d dVar = arrayList.get(i7);
            fragmentK2 = !arrayList2.get(i7).booleanValue() ? dVar.U2(this.fN, fragmentK2) : dVar.P8(this.fN, fragmentK2);
            z2 = z2 || dVar.u7;
        }
        this.fN.clear();
        if (!z) {
            q.ei(this, arrayList, arrayList2, i2, i3, false);
        }
        FN(arrayList, arrayList2, i2, i3);
        if (z) {
            ArraySet<Fragment> arraySet = new ArraySet<>();
            J8(arraySet);
            int iGj = Gj(arrayList, arrayList2, i2, i3, arraySet);
            n5(arraySet);
            i4 = iGj;
        } else {
            i4 = i3;
        }
        if (i4 != i6 && z) {
            q.ei(this, arrayList, arrayList2, i2, i4, true);
            iW(this.q7, true);
        }
        while (i6 < i3) {
            androidx.core.app.d dVar2 = arrayList.get(i6);
            if (arrayList2.get(i6).booleanValue() && (i5 = dVar2.we) >= 0) {
                mb(i5);
                dVar2.we = -1;
            }
            dVar2.BT();
            i6++;
        }
        if (z2) {
            oy();
        }
    }

    private boolean jw(ArrayList<androidx.core.app.d> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.WB != null && this.WB.size() != 0) {
                int size = this.WB.size();
                boolean zJ6 = false;
                for (int i2 = 0; i2 < size; i2++) {
                    zJ6 |= this.WB.get(i2).j6(arrayList, arrayList2);
                }
                this.WB.clear();
                this.Z1.EQ().removeCallbacks(this.aX);
                return zJ6;
            }
            return false;
        }
    }

    static boolean kf(g gVar) {
        Animation animation = gVar.j6;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return Q6(gVar.DW);
        }
        List<Animation> animations = ((AnimationSet) animation).getAnimations();
        for (int i2 = 0; i2 < animations.size(); i2++) {
            if (animations.get(i2) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    private void lg() {
        this.mb = false;
        this.pO.clear();
        this.sg.clear();
    }

    private void n5(ArraySet<Fragment> arraySet) {
        int size = arraySet.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragmentJ8 = arraySet.J8(i2);
            if (!fragmentJ8.hK) {
                View viewVy = fragmentJ8.vy();
                fragmentJ8.ce = viewVy.getAlpha();
                viewVy.setAlpha(0.0f);
            }
        }
    }

    private void oY(ArrayList<androidx.core.app.d> arrayList, ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<l> arrayList3 = this.pN;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            l lVar = this.pN.get(i2);
            if (arrayList != null && !lVar.j6 && (iIndexOf2 = arrayList.indexOf(lVar.DW)) != -1 && arrayList2.get(iIndexOf2).booleanValue()) {
                lVar.v5();
            } else if (lVar.VH() || (arrayList != null && lVar.DW.rN(arrayList, 0, arrayList.size()))) {
                this.pN.remove(i2);
                i2--;
                size--;
                if (arrayList == null || lVar.j6 || (iIndexOf = arrayList.indexOf(lVar.DW)) == -1 || !arrayList2.get(iIndexOf).booleanValue()) {
                    lVar.Zo();
                } else {
                    lVar.v5();
                }
            }
            i2++;
        }
    }

    private void pN(ArrayList<androidx.core.app.d> arrayList, ArrayList<Boolean> arrayList2) throws NoSuchFieldException, Resources.NotFoundException {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        oY(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).j3) {
                if (i3 != i2) {
                    jO(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).j3) {
                        i3++;
                    }
                }
                jO(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            jO(arrayList, arrayList2, i3, size);
        }
    }

    private boolean pO(String str, int i2, int i3) throws NoSuchFieldException, Resources.NotFoundException {
        FragmentManager fragmentManagerMb;
        hz();
        Xa(true);
        Fragment fragment = this.kf;
        if (fragment != null && i2 < 0 && str == null && (fragmentManagerMb = fragment.mb()) != null && fragmentManagerMb.u7()) {
            return true;
        }
        boolean zFN = fN(this.sg, this.pO, str, i2, i3);
        if (zFN) {
            this.mb = true;
            try {
                pN(this.sg, this.pO);
            } finally {
                lg();
            }
        }
        wc();
        U2();
        return zFN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rN(androidx.core.app.d dVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            dVar.Mr(z3);
        } else {
            dVar.j3();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(dVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            q.ei(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            iW(this.q7, true);
        }
        SparseArray<Fragment> sparseArray = this.qp;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragmentValueAt = this.qp.valueAt(i2);
                if (fragmentValueAt != null && fragmentValueAt.a5 != null && fragmentValueAt.An && dVar.lg(fragmentValueAt.mContainerId)) {
                    float f2 = fragmentValueAt.ce;
                    if (f2 > 0.0f) {
                        fragmentValueAt.a5.setAlpha(f2);
                    }
                    if (z3) {
                        fragmentValueAt.ce = 0.0f;
                    } else {
                        fragmentValueAt.ce = -1.0f;
                        fragmentValueAt.An = false;
                    }
                }
            }
        }
    }

    private Fragment ye(Fragment fragment) {
        ViewGroup viewGroup = fragment.sM;
        View view = fragment.a5;
        if (viewGroup != null && view != null) {
            for (int iIndexOf = this.fY.indexOf(fragment) - 1; iIndexOf >= 0; iIndexOf--) {
                Fragment fragment2 = this.fY.get(iIndexOf);
                if (fragment2.sM == viewGroup && fragment2.a5 != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public void AE(Fragment fragment) {
        if (fragment == null || (this.qp.get(fragment.fY) == fragment && (fragment.iW == null || fragment.aM() == this))) {
            this.kf = fragment;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean AL(int i2) {
        return this.q7 >= i2;
    }

    public void BT(Configuration configuration) {
        for (int i2 = 0; i2 < this.fY.size(); i2++) {
            Fragment fragment = this.fY.get(i2);
            if (fragment != null) {
                fragment.fY(configuration);
            }
        }
    }

    public void CU(j jVar, boolean z) {
        if (!z) {
            a8();
        }
        synchronized (this) {
            if (!this.eU && this.Z1 != null) {
                if (this.WB == null) {
                    this.WB = new ArrayList<>();
                }
                this.WB.add(jVar);
                gG();
                return;
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public void Cz(Fragment fragment) {
        if (e9) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.kf);
        }
        boolean z = !fragment.sh();
        if (!fragment.Cz || z) {
            synchronized (this.fY) {
                this.fY.remove(fragment);
            }
            if (fragment.aX && fragment.e9) {
                this.Jl = true;
            }
            fragment.hK = false;
            fragment.cT = true;
        }
    }

    @Override // androidx.fragment.app.FragmentManager
    public void DW(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        SparseArray<Fragment> sparseArray = this.qp;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i2 = 0; i2 < size5; i2++) {
                Fragment fragmentValueAt = this.qp.valueAt(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragmentValueAt);
                if (fragmentValueAt != null) {
                    fragmentValueAt.dump(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.fY.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size6; i3++) {
                Fragment fragment = this.fY.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.zh;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size4; i4++) {
                Fragment fragment2 = this.zh.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<androidx.core.app.d> arrayList2 = this.k2;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                androidx.core.app.d dVar = this.k2.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(dVar.toString());
                dVar.XL(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.AL != null && (size2 = this.AL.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i6 = 0; i6 < size2; i6++) {
                    Object obj = (androidx.core.app.d) this.AL.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            if (this.w9 != null && this.w9.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.w9.toArray()));
            }
        }
        ArrayList<j> arrayList3 = this.WB;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = (j) this.WB.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.Z1);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.n5);
        if (this.Q6 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.Q6);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.q7);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.iW);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.eU);
        if (this.Jl) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.Jl);
        }
        if (this.e3 != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.e3);
        }
    }

    @Override // androidx.fragment.app.FragmentManager
    public Fragment.SavedState EQ(Fragment fragment) {
        Bundle bundleA5;
        if (fragment.fY >= 0) {
            if (fragment.WB <= 0 || (bundleA5 = a5(fragment)) == null) {
                return null;
            }
            return new Fragment.SavedState(bundleA5);
        }
        Jm(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    void Eq(Fragment fragment) {
        if (!fragment.q7 || fragment.Q6) {
            return;
        }
        View viewAL = fragment.AL(fragment.q7(fragment.mb), null, fragment.mb);
        fragment.a5 = viewAL;
        if (viewAL == null) {
            fragment.ys = null;
            return;
        }
        fragment.ys = viewAL;
        viewAL.setSaveFromParentEnabled(false);
        if (fragment.Gj) {
            fragment.a5.setVisibility(8);
        }
        fragment.ye(fragment.a5, fragment.mb);
        x9(fragment, fragment.a5, fragment.mb, false);
    }

    public Fragment Ev(String str) {
        Fragment fragmentZo;
        SparseArray<Fragment> sparseArray = this.qp;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            Fragment fragmentValueAt = this.qp.valueAt(size);
            if (fragmentValueAt != null && (fragmentZo = fragmentValueAt.Zo(str)) != null) {
                return fragmentZo;
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentManager
    public boolean FH() throws NoSuchFieldException, Resources.NotFoundException {
        boolean zHz = hz();
        WB();
        return zHz;
    }

    @Override // androidx.fragment.app.FragmentManager
    public Fragment Hw(String str) {
        if (str != null) {
            for (int size = this.fY.size() - 1; size >= 0; size--) {
                Fragment fragment = this.fY.get(size);
                if (fragment != null && str.equals(fragment.fN)) {
                    return fragment;
                }
            }
        }
        SparseArray<Fragment> sparseArray = this.qp;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            Fragment fragmentValueAt = this.qp.valueAt(size2);
            if (fragmentValueAt != null && str.equals(fragmentValueAt.fN)) {
                return fragmentValueAt;
            }
        }
        return null;
    }

    void I(Fragment fragment, boolean z) {
        Fragment fragment2 = this.Q6;
        if (fragment2 != null) {
            FragmentManager fragmentManagerAM = fragment2.aM();
            if (fragmentManagerAM instanceof m) {
                ((m) fragmentManagerAM).I(fragment, true);
            }
        }
        Iterator<Pair<FragmentManager.a, Boolean>> it = this.cT.iterator();
        while (it.hasNext()) {
            Pair<FragmentManager.a, Boolean> next = it.next();
            if (!z || next.DW.booleanValue()) {
                next.j6.EQ(this, fragment);
            }
        }
    }

    void IS() {
        ArrayList arrayList;
        ArrayList arrayList2;
        n nVar;
        if (this.qp != null) {
            arrayList = null;
            arrayList2 = null;
            for (int i2 = 0; i2 < this.qp.size(); i2++) {
                Fragment fragmentValueAt = this.qp.valueAt(i2);
                if (fragmentValueAt != null) {
                    if (fragmentValueAt.pN) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(fragmentValueAt);
                        Fragment fragment = fragmentValueAt.zh;
                        fragmentValueAt.AL = fragment != null ? fragment.fY : -1;
                        if (e9) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + fragmentValueAt);
                        }
                    }
                    m mVar = fragmentValueAt.eU;
                    if (mVar != null) {
                        mVar.IS();
                        nVar = fragmentValueAt.eU.oy;
                    } else {
                        nVar = fragmentValueAt.e3;
                    }
                    if (arrayList2 == null && nVar != null) {
                        arrayList2 = new ArrayList(this.qp.size());
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(nVar);
                    }
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        if (arrayList == null && arrayList2 == null) {
            this.oy = null;
        } else {
            this.oy = new n(arrayList, arrayList2);
        }
    }

    void Jl(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        int iMin = this.q7;
        if (fragment.cT) {
            iMin = fragment.sh() ? Math.min(iMin, 1) : Math.min(iMin, 0);
        }
        e3(fragment, iMin, fragment.U2(), fragment.a8(), false);
        if (fragment.a5 != null) {
            Fragment fragmentYe = ye(fragment);
            if (fragmentYe != null) {
                View view = fragmentYe.a5;
                ViewGroup viewGroup = fragment.sM;
                int iIndexOfChild = viewGroup.indexOfChild(view);
                int iIndexOfChild2 = viewGroup.indexOfChild(fragment.a5);
                if (iIndexOfChild2 < iIndexOfChild) {
                    viewGroup.removeViewAt(iIndexOfChild2);
                    viewGroup.addView(fragment.a5, iIndexOfChild);
                }
            }
            if (fragment.An && fragment.sM != null) {
                float f2 = fragment.ce;
                if (f2 > 0.0f) {
                    fragment.a5.setAlpha(f2);
                }
                fragment.ce = 0.0f;
                fragment.An = false;
                g gVarW9 = w9(fragment, fragment.U2(), true, fragment.a8());
                if (gVarW9 != null) {
                    BR(fragment.a5, gVarW9);
                    Animation animation = gVarW9.j6;
                    if (animation != null) {
                        fragment.a5.startAnimation(animation);
                    } else {
                        gVarW9.DW.setTarget(fragment.a5);
                        gVarW9.DW.start();
                    }
                }
            }
        }
        if (fragment.Pa) {
            er(fragment);
        }
    }

    public void KD() {
        for (int i2 = 0; i2 < this.fY.size(); i2++) {
            Fragment fragment = this.fY.get(i2);
            if (fragment != null) {
                fragment.Z1();
            }
        }
    }

    public void Mr(Fragment fragment) {
        if (e9) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.Cz) {
            fragment.Cz = false;
            if (fragment.hK) {
                return;
            }
            if (this.fY.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            if (e9) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            synchronized (this.fY) {
                this.fY.add(fragment);
            }
            fragment.hK = true;
            if (fragment.aX && fragment.e9) {
                this.Jl = true;
            }
        }
    }

    void Mz(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.Q6;
        if (fragment2 != null) {
            FragmentManager fragmentManagerAM = fragment2.aM();
            if (fragmentManagerAM instanceof m) {
                ((m) fragmentManagerAM).Mz(fragment, bundle, true);
            }
        }
        Iterator<Pair<FragmentManager.a, Boolean>> it = this.cT.iterator();
        while (it.hasNext()) {
            Pair<FragmentManager.a, Boolean> next = it.next();
            if (!z || next.DW.booleanValue()) {
                next.j6.tp(this, fragment, bundle);
            }
        }
    }

    public void Nh(int i2, androidx.core.app.d dVar) {
        synchronized (this) {
            if (this.AL == null) {
                this.AL = new ArrayList<>();
            }
            int size = this.AL.size();
            if (i2 < size) {
                if (e9) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + dVar);
                }
                this.AL.set(i2, dVar);
            } else {
                while (size < i2) {
                    this.AL.add(null);
                    if (this.w9 == null) {
                        this.w9 = new ArrayList<>();
                    }
                    if (e9) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.w9.add(Integer.valueOf(size));
                    size++;
                }
                if (e9) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + dVar);
                }
                this.AL.add(dVar);
            }
        }
    }

    public void OW(boolean z) {
        int size = this.fY.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.fY.get(size);
            if (fragment != null) {
                fragment.iW(z);
            }
        }
    }

    public void P8() throws NoSuchFieldException, Resources.NotFoundException {
        this.iW = false;
        XG(1);
    }

    public void Pa(Fragment fragment) {
        if (e9) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.Gj) {
            fragment.Gj = false;
            fragment.Pa = !fragment.Pa;
        }
    }

    public void QX(Fragment fragment, boolean z) {
        if (e9) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        hK(fragment);
        if (fragment.Cz) {
            return;
        }
        if (this.fY.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.fY) {
            this.fY.add(fragment);
        }
        fragment.hK = true;
        fragment.cT = false;
        if (fragment.a5 == null) {
            fragment.Pa = false;
        }
        if (fragment.aX && fragment.e9) {
            this.Jl = true;
        }
        if (z) {
            eU(fragment);
        }
    }

    void Qq(Fragment fragment, boolean z) {
        Fragment fragment2 = this.Q6;
        if (fragment2 != null) {
            FragmentManager fragmentManagerAM = fragment2.aM();
            if (fragmentManagerAM instanceof m) {
                ((m) fragmentManagerAM).Qq(fragment, true);
            }
        }
        Iterator<Pair<FragmentManager.a, Boolean>> it = this.cT.iterator();
        while (it.hasNext()) {
            Pair<FragmentManager.a, Boolean> next = it.next();
            if (!z || next.DW.booleanValue()) {
                next.j6.J8(this, fragment);
            }
        }
    }

    public void SI() throws NoSuchFieldException, Resources.NotFoundException {
        XG(1);
    }

    void Sf(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.Q6;
        if (fragment2 != null) {
            FragmentManager fragmentManagerAM = fragment2.aM();
            if (fragmentManagerAM instanceof m) {
                ((m) fragmentManagerAM).Sf(fragment, context, true);
            }
        }
        Iterator<Pair<FragmentManager.a, Boolean>> it = this.cT.iterator();
        while (it.hasNext()) {
            Pair<FragmentManager.a, Boolean> next = it.next();
            if (!z || next.DW.booleanValue()) {
                next.j6.VH(this, fragment, context);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager
    public boolean VH() {
        return this.iW;
    }

    void Ws(androidx.core.app.d dVar) {
        if (this.k2 == null) {
            this.k2 = new ArrayList<>();
        }
        this.k2.add(dVar);
    }

    public int XL(androidx.core.app.d dVar) {
        synchronized (this) {
            if (this.w9 != null && this.w9.size() > 0) {
                int iIntValue = this.w9.remove(this.w9.size() - 1).intValue();
                if (e9) {
                    Log.v("FragmentManager", "Adding back stack index " + iIntValue + " with " + dVar);
                }
                this.AL.set(iIntValue, dVar);
                return iIntValue;
            }
            if (this.AL == null) {
                this.AL = new ArrayList<>();
            }
            int size = this.AL.size();
            if (e9) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + dVar);
            }
            this.AL.add(dVar);
            return size;
        }
    }

    public void XX() throws NoSuchFieldException, Resources.NotFoundException {
        XG(2);
    }

    Bundle a5(Fragment fragment) {
        if (this.Gj == null) {
            this.Gj = new Bundle();
        }
        fragment.sg(this.Gj);
        Mz(fragment, this.Gj, false);
        Bundle bundle = null;
        if (!this.Gj.isEmpty()) {
            Bundle bundle2 = this.Gj;
            this.Gj = null;
            bundle = bundle2;
        }
        if (fragment.a5 != null) {
            ys(fragment);
        }
        if (fragment.jw != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.jw);
        }
        if (!fragment.gG) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.gG);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void aX(Parcelable parcelable, n nVar) {
        List<n> listJ6;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.WB == null) {
            return;
        }
        if (nVar != null) {
            List<Fragment> listDW = nVar.DW();
            listJ6 = nVar.j6();
            int size = listDW != null ? listDW.size() : 0;
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = listDW.get(i2);
                if (e9) {
                    Log.v("FragmentManager", "restoreAllState: re-attaching retained " + fragment);
                }
                int i3 = 0;
                while (true) {
                    FragmentState[] fragmentStateArr = fragmentManagerState.WB;
                    if (i3 >= fragmentStateArr.length || fragmentStateArr[i3].mb == fragment.fY) {
                        break;
                    } else {
                        i3++;
                    }
                }
                FragmentState[] fragmentStateArr2 = fragmentManagerState.WB;
                if (i3 == fragmentStateArr2.length) {
                    Jm(new IllegalStateException("Could not find active fragment with index " + fragment.fY));
                    throw null;
                }
                FragmentState fragmentState = fragmentStateArr2[i3];
                fragmentState.q7 = fragment;
                fragment.jw = null;
                fragment.kf = 0;
                fragment.Z1 = false;
                fragment.hK = false;
                fragment.zh = null;
                Bundle bundle = fragmentState.cT;
                if (bundle != null) {
                    bundle.setClassLoader(this.Z1.u7().getClassLoader());
                    fragment.jw = fragmentState.cT.getSparseParcelableArray("android:view_state");
                    fragment.mb = fragmentState.cT;
                }
            }
        } else {
            listJ6 = null;
        }
        this.qp = new SparseArray<>(fragmentManagerState.WB.length);
        int i4 = 0;
        while (true) {
            FragmentState[] fragmentStateArr3 = fragmentManagerState.WB;
            if (i4 >= fragmentStateArr3.length) {
                break;
            }
            FragmentState fragmentState2 = fragmentStateArr3[i4];
            if (fragmentState2 != null) {
                Fragment fragmentJ6 = fragmentState2.j6(this.Z1, this.n5, this.Q6, (listJ6 == null || i4 >= listJ6.size()) ? null : listJ6.get(i4));
                if (e9) {
                    Log.v("FragmentManager", "restoreAllState: active #" + i4 + ": " + fragmentJ6);
                }
                this.qp.put(fragmentJ6.fY, fragmentJ6);
                fragmentState2.q7 = null;
            }
            i4++;
        }
        if (nVar != null) {
            List<Fragment> listDW2 = nVar.DW();
            int size2 = listDW2 != null ? listDW2.size() : 0;
            for (int i5 = 0; i5 < size2; i5++) {
                Fragment fragment2 = listDW2.get(i5);
                int i6 = fragment2.AL;
                if (i6 >= 0) {
                    Fragment fragment3 = this.qp.get(i6);
                    fragment2.zh = fragment3;
                    if (fragment3 == null) {
                        Log.w("FragmentManager", "Re-attaching retained fragment " + fragment2 + " target no longer exists: " + fragment2.AL);
                    }
                }
            }
        }
        this.fY.clear();
        if (fragmentManagerState.mb != null) {
            int i7 = 0;
            while (true) {
                int[] iArr = fragmentManagerState.mb;
                if (i7 >= iArr.length) {
                    break;
                }
                Fragment fragment4 = this.qp.get(iArr[i7]);
                if (fragment4 == null) {
                    Jm(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.mb[i7]));
                    throw null;
                }
                fragment4.hK = true;
                if (e9) {
                    Log.v("FragmentManager", "restoreAllState: added #" + i7 + ": " + fragment4);
                }
                if (this.fY.contains(fragment4)) {
                    throw new IllegalStateException("Already added!");
                }
                synchronized (this.fY) {
                    this.fY.add(fragment4);
                }
                i7++;
            }
        }
        if (fragmentManagerState.jw != null) {
            this.k2 = new ArrayList<>(fragmentManagerState.jw.length);
            int i8 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.jw;
                if (i8 >= backStackStateArr.length) {
                    break;
                }
                androidx.core.app.d dVarJ6 = backStackStateArr[i8].j6(this);
                if (e9) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i8 + " (index " + dVarJ6.we + "): " + dVarJ6);
                    PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
                    dVarJ6.aM("  ", printWriter, false);
                    printWriter.close();
                }
                this.k2.add(dVarJ6);
                int i9 = dVarJ6.we;
                if (i9 >= 0) {
                    Nh(i9, dVarJ6);
                }
                i8++;
            }
        } else {
            this.k2 = null;
        }
        int i10 = fragmentManagerState.fY;
        if (i10 >= 0) {
            this.kf = this.qp.get(i10);
        }
        this.jw = fragmentManagerState.qp;
    }

    public void aj(Menu menu) {
        for (int i2 = 0; i2 < this.fY.size(); i2++) {
            Fragment fragment = this.fY.get(i2);
            if (fragment != null) {
                fragment.kf(menu);
            }
        }
    }

    public void aq(j jVar, boolean z) {
        if (z && (this.Z1 == null || this.eU)) {
            return;
        }
        Xa(z);
        if (jVar.j6(this.sg, this.pO)) {
            this.mb = true;
            try {
                pN(this.sg, this.pO);
            } finally {
                lg();
            }
        }
        wc();
        U2();
    }

    @Override // androidx.fragment.app.FragmentManager
    public FragmentTransaction beginTransaction() {
        return new androidx.core.app.d(this);
    }

    public boolean br(Menu menu) {
        boolean z = false;
        for (int i2 = 0; i2 < this.fY.size(); i2++) {
            Fragment fragment = this.fY.get(i2);
            if (fragment != null && fragment.eU(menu)) {
                z = true;
            }
        }
        return z;
    }

    void ca(Fragment fragment, boolean z) {
        Fragment fragment2 = this.Q6;
        if (fragment2 != null) {
            FragmentManager fragmentManagerAM = fragment2.aM();
            if (fragmentManagerAM instanceof m) {
                ((m) fragmentManagerAM).ca(fragment, true);
            }
        }
        Iterator<Pair<FragmentManager.a, Boolean>> it = this.cT.iterator();
        while (it.hasNext()) {
            Pair<FragmentManager.a, Boolean> next = it.next();
            if (!z || next.DW.booleanValue()) {
                next.j6.we(this, fragment);
            }
        }
    }

    void cb(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.Q6;
        if (fragment2 != null) {
            FragmentManager fragmentManagerAM = fragment2.aM();
            if (fragmentManagerAM instanceof m) {
                ((m) fragmentManagerAM).cb(fragment, bundle, true);
            }
        }
        Iterator<Pair<FragmentManager.a, Boolean>> it = this.cT.iterator();
        while (it.hasNext()) {
            Pair<FragmentManager.a, Boolean> next = it.next();
            if (!z || next.DW.booleanValue()) {
                next.j6.FH(this, fragment, bundle);
            }
        }
    }

    void ce() throws NoSuchFieldException, Resources.NotFoundException {
        if (this.qp == null) {
            return;
        }
        for (int i2 = 0; i2 < this.qp.size(); i2++) {
            Fragment fragmentValueAt = this.qp.valueAt(i2);
            if (fragmentValueAt != null) {
                sg(fragmentValueAt);
            }
        }
    }

    void cn(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.Q6;
        if (fragment2 != null) {
            FragmentManager fragmentManagerAM = fragment2.aM();
            if (fragmentManagerAM instanceof m) {
                ((m) fragmentManagerAM).cn(fragment, bundle, true);
            }
        }
        Iterator<Pair<FragmentManager.a, Boolean>> it = this.cT.iterator();
        while (it.hasNext()) {
            Pair<FragmentManager.a, Boolean> next = it.next();
            if (!z || next.DW.booleanValue()) {
                next.j6.j6(this, fragment, bundle);
            }
        }
    }

    void dx(Fragment fragment, boolean z) {
        Fragment fragment2 = this.Q6;
        if (fragment2 != null) {
            FragmentManager fragmentManagerAM = fragment2.aM();
            if (fragmentManagerAM instanceof m) {
                ((m) fragmentManagerAM).dx(fragment, true);
            }
        }
        Iterator<Pair<FragmentManager.a, Boolean>> it = this.cT.iterator();
        while (it.hasNext()) {
            Pair<FragmentManager.a, Boolean> next = it.next();
            if (!z || next.DW.booleanValue()) {
                next.j6.Hw(this, fragment);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void e3(androidx.fragment.app.Fragment r18, int r19, int r20, int r21, boolean r22) throws java.lang.NoSuchFieldException, android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1131
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.m.e3(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    n e9() {
        Za(this.oy);
        return this.oy;
    }

    void eU(Fragment fragment) throws NoSuchFieldException, Resources.NotFoundException {
        e3(fragment, this.q7, 0, 0, false);
    }

    void ef(Fragment fragment, boolean z) {
        Fragment fragment2 = this.Q6;
        if (fragment2 != null) {
            FragmentManager fragmentManagerAM = fragment2.aM();
            if (fragmentManagerAM instanceof m) {
                ((m) fragmentManagerAM).ef(fragment, true);
            }
        }
        Iterator<Pair<FragmentManager.a, Boolean>> it = this.cT.iterator();
        while (it.hasNext()) {
            Pair<FragmentManager.a, Boolean> next = it.next();
            if (!z || next.DW.booleanValue()) {
                next.j6.Zo(this, fragment);
            }
        }
    }

    public boolean ei(Menu menu, MenuInflater menuInflater) {
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.fY.size(); i2++) {
            Fragment fragment = this.fY.get(i2);
            if (fragment != null && fragment.zh(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.zh != null) {
            for (int i3 = 0; i3 < this.zh.size(); i3++) {
                Fragment fragment2 = this.zh.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.br();
                }
            }
        }
        this.zh = arrayList;
        return z;
    }

    void er(Fragment fragment) throws NoSuchFieldException, Resources.NotFoundException {
        Animator animator;
        if (fragment.a5 != null) {
            g gVarW9 = w9(fragment, fragment.U2(), !fragment.Gj, fragment.a8());
            if (gVarW9 == null || (animator = gVarW9.DW) == null) {
                if (gVarW9 != null) {
                    BR(fragment.a5, gVarW9);
                    fragment.a5.startAnimation(gVarW9.j6);
                    gVarW9.j6.start();
                }
                fragment.a5.setVisibility((!fragment.Gj || fragment.cn()) ? 0 : 8);
                if (fragment.cn()) {
                    fragment.e9(false);
                }
            } else {
                animator.setTarget(fragment.a5);
                if (!fragment.Gj) {
                    fragment.a5.setVisibility(0);
                } else if (fragment.cn()) {
                    fragment.e9(false);
                } else {
                    ViewGroup viewGroup = fragment.sM;
                    View view = fragment.a5;
                    viewGroup.startViewTransition(view);
                    gVarW9.DW.addListener(new d(this, viewGroup, view, fragment));
                }
                BR(fragment.a5, gVarW9);
                gVarW9.DW.start();
            }
        }
        if (fragment.hK && fragment.aX && fragment.e9) {
            this.Jl = true;
        }
        fragment.Pa = false;
        fragment.XG(fragment.Gj);
    }

    boolean fN(ArrayList<androidx.core.app.d> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<androidx.core.app.d> arrayList3 = this.k2;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.k2.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = this.k2.size() - 1;
                while (size2 >= 0) {
                    androidx.core.app.d dVar = this.k2.get(size2);
                    if ((str != null && str.equals(dVar.a8())) || (i2 >= 0 && i2 == dVar.we)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.core.app.d dVar2 = this.k2.get(size2);
                        if (str == null || !str.equals(dVar2.a8())) {
                            if (i2 < 0 || i2 != dVar2.we) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.k2.size() - 1) {
                return false;
            }
            for (int size3 = this.k2.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.k2.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    void g3(Fragment fragment, boolean z) {
        Fragment fragment2 = this.Q6;
        if (fragment2 != null) {
            FragmentManager fragmentManagerAM = fragment2.aM();
            if (fragmentManagerAM instanceof m) {
                ((m) fragmentManagerAM).g3(fragment, true);
            }
        }
        Iterator<Pair<FragmentManager.a, Boolean>> it = this.cT.iterator();
        while (it.hasNext()) {
            Pair<FragmentManager.a, Boolean> next = it.next();
            if (!z || next.DW.booleanValue()) {
                next.j6.u7(this, fragment);
            }
        }
    }

    public void gW() throws NoSuchFieldException, Resources.NotFoundException {
        this.iW = false;
        XG(2);
    }

    @Override // androidx.fragment.app.FragmentManager
    public List<Fragment> getFragments() {
        List<Fragment> list;
        if (this.fY.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.fY) {
            list = (List) this.fY.clone();
        }
        return list;
    }

    @Override // androidx.fragment.app.FragmentManager
    public void gn(int i2, int i3) {
        if (i2 >= 0) {
            CU(new k(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    void hK(Fragment fragment) {
        if (fragment.fY >= 0) {
            return;
        }
        int i2 = this.jw;
        this.jw = i2 + 1;
        fragment.QO(i2, this.Q6);
        if (this.qp == null) {
            this.qp = new SparseArray<>();
        }
        this.qp.put(fragment.fY, fragment);
        if (e9) {
            Log.v("FragmentManager", "Allocated fragment index " + fragment);
        }
    }

    public boolean hz() throws NoSuchFieldException, Resources.NotFoundException {
        Xa(true);
        boolean z = false;
        while (jw(this.sg, this.pO)) {
            this.mb = true;
            try {
                pN(this.sg, this.pO);
                lg();
                z = true;
            } catch (Throwable th) {
                lg();
                throw th;
            }
        }
        wc();
        U2();
        return z;
    }

    void iW(int i2, boolean z) {
        androidx.core.app.k kVar;
        if (this.Z1 == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.q7) {
            this.q7 = i2;
            if (this.qp != null) {
                int size = this.fY.size();
                boolean zU7 = false;
                for (int i3 = 0; i3 < size; i3++) {
                    Fragment fragment = this.fY.get(i3);
                    Jl(fragment);
                    u uVar = fragment.Nh;
                    if (uVar != null) {
                        zU7 |= uVar.u7();
                    }
                }
                int size2 = this.qp.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Fragment fragmentValueAt = this.qp.valueAt(i4);
                    if (fragmentValueAt != null && ((fragmentValueAt.cT || fragmentValueAt.Cz) && !fragmentValueAt.An)) {
                        Jl(fragmentValueAt);
                        u uVar2 = fragmentValueAt.Nh;
                        if (uVar2 != null) {
                            zU7 |= uVar2.u7();
                        }
                    }
                }
                if (!zU7) {
                    ce();
                }
                if (this.Jl && (kVar = this.Z1) != null && this.q7 == 5) {
                    kVar.U2();
                    this.Jl = false;
                }
            }
        }
    }

    public void j3(androidx.core.app.k kVar, androidx.core.app.i iVar, Fragment fragment) {
        if (this.Z1 != null) {
            throw new IllegalStateException("Already attached");
        }
        this.Z1 = kVar;
        this.n5 = iVar;
        this.Q6 = fragment;
    }

    public void jJ() throws NoSuchFieldException, Resources.NotFoundException {
        this.iW = true;
        XG(3);
    }

    public Fragment k2() {
        return this.kf;
    }

    public void kQ() throws NoSuchFieldException, Resources.NotFoundException {
        this.iW = false;
        XG(5);
    }

    public Fragment ko(int i2) {
        for (int size = this.fY.size() - 1; size >= 0; size--) {
            Fragment fragment = this.fY.get(size);
            if (fragment != null && fragment.mFragmentId == i2) {
                return fragment;
            }
        }
        SparseArray<Fragment> sparseArray = this.qp;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            Fragment fragmentValueAt = this.qp.valueAt(size2);
            if (fragmentValueAt != null && fragmentValueAt.mFragmentId == i2) {
                return fragmentValueAt;
            }
        }
        return null;
    }

    public void lp() throws NoSuchFieldException, Resources.NotFoundException {
        XG(4);
    }

    public void mb(int i2) {
        synchronized (this) {
            this.AL.set(i2, null);
            if (this.w9 == null) {
                this.w9 = new ArrayList<>();
            }
            if (e9) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.w9.add(Integer.valueOf(i2));
        }
    }

    public void nw() throws NoSuchFieldException, Resources.NotFoundException {
        this.eU = true;
        hz();
        XG(0);
        this.Z1 = null;
        this.n5 = null;
        this.Q6 = null;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) throws NoSuchFieldException, Resources.NotFoundException {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j6);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (!Fragment.sG(this.Z1.u7(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        Fragment fragmentKo = resourceId != -1 ? ko(resourceId) : null;
        if (fragmentKo == null && string != null) {
            fragmentKo = Hw(string);
        }
        if (fragmentKo == null && id != -1) {
            fragmentKo = ko(id);
        }
        if (e9) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + fragmentKo);
        }
        if (fragmentKo == null) {
            fragmentKo = this.n5.j6(context, str2, null);
            fragmentKo.q7 = true;
            fragmentKo.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentKo.mContainerId = id;
            fragmentKo.fN = string;
            fragmentKo.Z1 = true;
            fragmentKo.Jl = this;
            androidx.core.app.k kVar = this.Z1;
            fragmentKo.iW = kVar;
            fragmentKo.wc(kVar.u7(), attributeSet, fragmentKo.mb);
            QX(fragmentKo, true);
        } else {
            if (fragmentKo.Z1) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            fragmentKo.Z1 = true;
            androidx.core.app.k kVar2 = this.Z1;
            fragmentKo.iW = kVar2;
            if (!fragmentKo.oy) {
                fragmentKo.wc(kVar2.u7(), attributeSet, fragmentKo.mb);
            }
        }
        Fragment fragment = fragmentKo;
        if (this.q7 >= 1 || !fragment.q7) {
            eU(fragment);
        } else {
            e3(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.a5;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.a5.getTag() == null) {
                fragment.a5.setTag(string);
            }
            return fragment.a5;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    void oy() {
        if (this.hK != null) {
            for (int i2 = 0; i2 < this.hK.size(); i2++) {
                this.hK.get(i2).j6();
            }
        }
    }

    void q7(Fragment fragment) {
        if (fragment.fY < 0) {
            return;
        }
        if (e9) {
            Log.v("FragmentManager", "Freeing fragment index " + fragment);
        }
        this.qp.put(fragment.fY, null);
        this.Z1.J8(fragment.qp);
        fragment.P8();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater.Factory2 qp() {
        return this;
    }

    public void ro(boolean z) {
        int size = this.fY.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.fY.get(size);
            if (fragment != null) {
                fragment.n5(z);
            }
        }
    }

    public void sE() {
        this.oy = null;
        this.iW = false;
        int size = this.fY.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.fY.get(i2);
            if (fragment != null) {
                fragment.ef();
            }
        }
    }

    void sG(Fragment fragment, boolean z) {
        Fragment fragment2 = this.Q6;
        if (fragment2 != null) {
            FragmentManager fragmentManagerAM = fragment2.aM();
            if (fragmentManagerAM instanceof m) {
                ((m) fragmentManagerAM).sG(fragment, true);
            }
        }
        Iterator<Pair<FragmentManager.a, Boolean>> it = this.cT.iterator();
        while (it.hasNext()) {
            Pair<FragmentManager.a, Boolean> next = it.next();
            if (!z || next.DW.booleanValue()) {
                next.j6.v5(this, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Parcelable sM() throws NoSuchFieldException, Resources.NotFoundException {
        int[] iArr;
        int size;
        WB();
        et();
        hz();
        this.iW = true;
        BackStackState[] backStackStateArr = null;
        this.oy = null;
        SparseArray<Fragment> sparseArray = this.qp;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size2 = this.qp.size();
        FragmentState[] fragmentStateArr = new FragmentState[size2];
        boolean z = false;
        for (int i2 = 0; i2 < size2; i2++) {
            Fragment fragmentValueAt = this.qp.valueAt(i2);
            if (fragmentValueAt != null) {
                if (fragmentValueAt.fY < 0) {
                    Jm(new IllegalStateException("Failure saving state: active " + fragmentValueAt + " has cleared index: " + fragmentValueAt.fY));
                    throw null;
                }
                FragmentState fragmentState = new FragmentState(fragmentValueAt);
                fragmentStateArr[i2] = fragmentState;
                if (fragmentValueAt.WB <= 0 || fragmentState.cT != null) {
                    fragmentState.cT = fragmentValueAt.mb;
                } else {
                    Bundle bundleA5 = a5(fragmentValueAt);
                    fragmentState.cT = bundleA5;
                    Fragment fragment = fragmentValueAt.zh;
                    if (fragment != null) {
                        if (fragment.fY < 0) {
                            Jm(new IllegalStateException("Failure saving state: " + fragmentValueAt + " has target not in fragment manager: " + fragmentValueAt.zh));
                            throw null;
                        }
                        if (bundleA5 == null) {
                            fragmentState.cT = new Bundle();
                        }
                        tp(fragmentState.cT, "android:target_state", fragmentValueAt.zh);
                        int i3 = fragmentValueAt.w9;
                        if (i3 != 0) {
                            fragmentState.cT.putInt("android:target_req_state", i3);
                        }
                    }
                }
                if (e9) {
                    Log.v("FragmentManager", "Saved state of " + fragmentValueAt + ": " + fragmentState.cT);
                }
                z = true;
            }
        }
        if (!z) {
            if (e9) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size3 = this.fY.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i4 = 0; i4 < size3; i4++) {
                iArr[i4] = this.fY.get(i4).fY;
                if (iArr[i4] < 0) {
                    Jm(new IllegalStateException("Failure saving state: active " + this.fY.get(i4) + " has cleared index: " + iArr[i4]));
                    throw null;
                }
                if (e9) {
                    Log.v("FragmentManager", "saveAllState: adding fragment #" + i4 + ": " + this.fY.get(i4));
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<androidx.core.app.d> arrayList = this.k2;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i5 = 0; i5 < size; i5++) {
                backStackStateArr[i5] = new BackStackState(this.k2.get(i5));
                if (e9) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i5 + ": " + this.k2.get(i5));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.WB = fragmentStateArr;
        fragmentManagerState.mb = iArr;
        fragmentManagerState.jw = backStackStateArr;
        Fragment fragment2 = this.kf;
        if (fragment2 != null) {
            fragmentManagerState.fY = fragment2.fY;
        }
        fragmentManagerState.qp = this.jw;
        IS();
        return fragmentManagerState;
    }

    public void sg(Fragment fragment) throws NoSuchFieldException, Resources.NotFoundException {
        if (fragment.IS) {
            if (this.mb) {
                this.sE = true;
            } else {
                fragment.IS = false;
                e3(fragment, this.q7, 0, 0, false);
            }
        }
    }

    void sh(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.Q6;
        if (fragment2 != null) {
            FragmentManager fragmentManagerAM = fragment2.aM();
            if (fragmentManagerAM instanceof m) {
                ((m) fragmentManagerAM).sh(fragment, context, true);
            }
        }
        Iterator<Pair<FragmentManager.a, Boolean>> it = this.cT.iterator();
        while (it.hasNext()) {
            Pair<FragmentManager.a, Boolean> next = it.next();
            if (!z || next.DW.booleanValue()) {
                next.j6.DW(this, fragment, context);
            }
        }
    }

    public boolean sy(MenuItem menuItem) {
        for (int i2 = 0; i2 < this.fY.size(); i2++) {
            Fragment fragment = this.fY.get(i2);
            if (fragment != null && fragment.Q6(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.Q6;
        if (fragment != null) {
            DebugUtils.j6(fragment, sb);
        } else {
            DebugUtils.j6(this.Z1, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.FragmentManager
    public void tp(Bundle bundle, String str, Fragment fragment) {
        int i2 = fragment.fY;
        if (i2 >= 0) {
            bundle.putInt(str, i2);
            return;
        }
        Jm(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    @Override // androidx.fragment.app.FragmentManager
    public boolean u7() {
        a8();
        return pO(null, -1, 0);
    }

    @Override // androidx.fragment.app.FragmentManager
    public Fragment v5(Bundle bundle, String str) {
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            return null;
        }
        Fragment fragment = this.qp.get(i2);
        if (fragment != null) {
            return fragment;
        }
        Jm(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i2));
        throw null;
    }

    void vJ(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.Q6;
        if (fragment2 != null) {
            FragmentManager fragmentManagerAM = fragment2.aM();
            if (fragmentManagerAM instanceof m) {
                ((m) fragmentManagerAM).vJ(fragment, bundle, true);
            }
        }
        Iterator<Pair<FragmentManager.a, Boolean>> it = this.cT.iterator();
        while (it.hasNext()) {
            Pair<FragmentManager.a, Boolean> next = it.next();
            if (!z || next.DW.booleanValue()) {
                next.j6.gn(this, fragment, bundle);
            }
        }
    }

    public boolean vy(MenuItem menuItem) {
        for (int i2 = 0; i2 < this.fY.size(); i2++) {
            Fragment fragment = this.fY.get(i2);
            if (fragment != null && fragment.qp(menuItem)) {
                return true;
            }
        }
        return false;
    }

    g w9(Fragment fragment, int i2, boolean z, int i3) throws Resources.NotFoundException {
        int iBx;
        int iMr = fragment.Mr();
        Animation animationQq = fragment.Qq(i2, z, iMr);
        a aVar = null;
        if (animationQq != null) {
            return new g(animationQq, aVar);
        }
        Animator animatorSy = fragment.sy(i2, z, iMr);
        if (animatorSy != null) {
            return new g(animatorSy, aVar);
        }
        if (iMr != 0) {
            boolean zEquals = "anim".equals(this.Z1.u7().getResources().getResourceTypeName(iMr));
            boolean z2 = false;
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.Z1.u7(), iMr);
                    if (animationLoadAnimation != null) {
                        return new g(animationLoadAnimation, aVar);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.Z1.u7(), iMr);
                    if (animatorLoadAnimator != null) {
                        return new g(animatorLoadAnimator, aVar);
                    }
                } catch (RuntimeException e3) {
                    if (zEquals) {
                        throw e3;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(this.Z1.u7(), iMr);
                    if (animationLoadAnimation2 != null) {
                        return new g(animationLoadAnimation2, aVar);
                    }
                }
            }
        }
        if (i2 == 0 || (iBx = Bx(i2, z)) < 0) {
            return null;
        }
        switch (iBx) {
            case 1:
                return Z1(this.Z1.u7(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return Z1(this.Z1.u7(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return Z1(this.Z1.u7(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return Z1(this.Z1.u7(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return cT(this.Z1.u7(), 0.0f, 1.0f);
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return cT(this.Z1.u7(), 1.0f, 0.0f);
            default:
                if (i3 == 0 && this.Z1.j3()) {
                    i3 = this.Z1.aM();
                }
                if (i3 == 0) {
                }
                return null;
        }
    }

    void wc() throws NoSuchFieldException, Resources.NotFoundException {
        u uVar;
        if (this.sE) {
            boolean zU7 = false;
            for (int i2 = 0; i2 < this.qp.size(); i2++) {
                Fragment fragmentValueAt = this.qp.valueAt(i2);
                if (fragmentValueAt != null && (uVar = fragmentValueAt.Nh) != null) {
                    zU7 |= uVar.u7();
                }
            }
            if (zU7) {
                return;
            }
            this.sE = false;
            ce();
        }
    }

    void x9(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.Q6;
        if (fragment2 != null) {
            FragmentManager fragmentManagerAM = fragment2.aM();
            if (fragmentManagerAM instanceof m) {
                ((m) fragmentManagerAM).x9(fragment, view, bundle, true);
            }
        }
        Iterator<Pair<FragmentManager.a, Boolean>> it = this.cT.iterator();
        while (it.hasNext()) {
            Pair<FragmentManager.a, Boolean> next = it.next();
            if (!z || next.DW.booleanValue()) {
                next.j6.J0(this, fragment, view, bundle);
            }
        }
    }

    public void yO() throws NoSuchFieldException, Resources.NotFoundException {
        this.iW = false;
        XG(4);
    }

    public void yS(Fragment fragment) {
        if (e9) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.Cz) {
            return;
        }
        fragment.Cz = true;
        if (fragment.hK) {
            if (e9) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            synchronized (this.fY) {
                this.fY.remove(fragment);
            }
            if (fragment.aX && fragment.e9) {
                this.Jl = true;
            }
            fragment.hK = false;
        }
    }

    void ys(Fragment fragment) {
        if (fragment.ys == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.Cz;
        if (sparseArray == null) {
            this.Cz = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.ys.saveHierarchyState(this.Cz);
        if (this.Cz.size() > 0) {
            fragment.jw = this.Cz;
            this.Cz = null;
        }
    }

    public void zh(Fragment fragment) {
        if (e9) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.Gj) {
            return;
        }
        fragment.Gj = true;
        fragment.Pa = true ^ fragment.Pa;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
