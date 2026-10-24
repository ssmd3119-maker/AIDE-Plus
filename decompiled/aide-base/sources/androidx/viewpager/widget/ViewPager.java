package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.i;
import androidx.core.view.n;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private boolean AE;
    private Parcelable AL;
    private ArrayList<View> AR;
    private EdgeEffect An;
    private int BR;
    private List<OnPageChangeListener> Bx;
    private int Cz;
    private boolean Gj;
    private int IS;
    private float Jl;
    private int Jm;
    private List<OnAdapterChangeListener> MP;
    private int Nh;
    private j Of;
    private int PT;
    private boolean Pa;
    private int Q6;
    private float QO;
    private final Runnable TI;
    private int WB;
    private int Z1;
    private EdgeEffect Za;
    private int a5;
    private float aX;
    private int b1;
    private boolean cT;
    private boolean ce;
    private int ct;
    private boolean e3;
    private float e9;
    private int eU;
    private boolean fN;
    private final Rect fY;
    private int gG;
    private Scroller hK;
    private float iW;
    private final f jw;
    int k2;
    private int kf;
    private final ArrayList<f> mb;
    private Drawable n5;
    private OnPageChangeListener oa;
    private int oy;
    private int pN;
    private int pO;
    private k q7;
    private OnPageChangeListener qP;
    PagerAdapter qp;
    private boolean sE;
    private float sM;
    private boolean sg;
    private ClassLoader w9;
    private VelocityTracker ys;
    private int zh;
    static final int[] Fd = {R.attr.layout_gravity};
    private static final Comparator<f> Lz = new a();
    private static final Interpolator sT = new b();
    private static final m E4 = new m();

    public interface OnAdapterChangeListener {
        void Hw(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    public interface OnPageChangeListener {
        void DW(int i);

        void FH(int i);

        void onPageScrolled(int i, float f, int i2);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        Parcelable fY;
        int jw;
        ClassLoader qp;

        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: FH, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: j6, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.jw + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.jw);
            parcel.writeParcelable(this.fY, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? SavedState.class.getClassLoader() : classLoader;
            this.jw = parcel.readInt();
            this.fY = parcel.readParcelable(classLoader);
            this.qp = classLoader;
        }
    }

    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void DW(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    static class a implements Comparator<f> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.DW - fVar2.DW;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            ViewPager.this.setScrollState(0);
            ViewPager.this.SI();
        }
    }

    class d implements i {
        private final Rect j6 = new Rect();

        d() {
        }

        @Override // androidx.core.view.i
        public n j6(View view, n nVar) {
            n nVarJ0 = ViewCompat.J0(view, nVar);
            if (nVarJ0.v5()) {
                return nVarJ0;
            }
            Rect rect = this.j6;
            rect.left = nVarJ0.DW();
            rect.top = nVarJ0.Hw();
            rect.right = nVarJ0.FH();
            rect.bottom = nVarJ0.j6();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                n nVarJ6 = ViewCompat.j6(ViewPager.this.getChildAt(i), nVarJ0);
                rect.left = Math.min(nVarJ6.DW(), rect.left);
                rect.top = Math.min(nVarJ6.Hw(), rect.top);
                rect.right = Math.min(nVarJ6.FH(), rect.right);
                rect.bottom = Math.min(nVarJ6.j6(), rect.bottom);
            }
            return nVarJ0.Zo(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {
        int DW;
        boolean FH;
        float Hw;
        Object j6;
        float v5;

        f() {
        }
    }

    class g extends AccessibilityDelegateCompat {
        g() {
        }

        private boolean EQ() {
            PagerAdapter pagerAdapter = ViewPager.this.qp;
            return pagerAdapter != null && pagerAdapter.getCount() > 1;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Hw(View view, AccessibilityEvent accessibilityEvent) {
            PagerAdapter pagerAdapter;
            super.Hw(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(EQ());
            if (accessibilityEvent.getEventType() != 4096 || (pagerAdapter = ViewPager.this.qp) == null) {
                return;
            }
            accessibilityEvent.setItemCount(pagerAdapter.getCount());
            accessibilityEvent.setFromIndex(ViewPager.this.k2);
            accessibilityEvent.setToIndex(ViewPager.this.k2);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean gn(View view, int i, Bundle bundle) throws Resources.NotFoundException {
            if (super.gn(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.k2 + 1);
                return true;
            }
            if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.k2 - 1);
            return true;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void v5(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.v5(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.ei(ViewPager.class.getName());
            accessibilityNodeInfoCompat.ef(EQ());
            if (ViewPager.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.j6(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.j6(8192);
            }
        }
    }

    public interface j {
        void j6(View view, float f);
    }

    private class k extends DataSetObserver {
        k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Resources.NotFoundException {
            ViewPager.this.tp();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() throws Resources.NotFoundException {
            ViewPager.this.tp();
        }
    }

    static class m implements Comparator<View> {
        m() {
        }

        @Override // java.util.Comparator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.j6;
            return z != layoutParams2.j6 ? z ? 1 : -1 : layoutParams.v5 - layoutParams2.v5;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.mb = new ArrayList<>();
        this.jw = new f();
        this.fY = new Rect();
        this.zh = -1;
        this.AL = null;
        this.w9 = null;
        this.Jl = -3.4028235E38f;
        this.iW = Float.MAX_VALUE;
        this.pO = 1;
        this.a5 = -1;
        this.Pa = true;
        this.TI = new c();
        this.ct = 0;
        rN();
    }

    private void BT(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.a5) {
            int i = actionIndex == 0 ? 1 : 0;
            this.aX = motionEvent.getX(i);
            this.a5 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.ys;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private int EQ(int i, float f2, int i2, int i3) {
        if (Math.abs(i3) <= this.Nh || Math.abs(i2) <= this.IS) {
            i += (int) (f2 + (i >= this.k2 ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mb.size() <= 0) {
            return i;
        }
        return Math.max(this.mb.get(0).DW, Math.min(i, this.mb.get(r4.size() - 1).DW));
    }

    private void I() {
        if (this.b1 != 0) {
            ArrayList<View> arrayList = this.AR;
            if (arrayList == null) {
                this.AR = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.AR.add(getChildAt(i));
            }
            Collections.sort(this.AR, E4);
        }
    }

    private void J0(int i) {
        OnPageChangeListener onPageChangeListener = this.oa;
        if (onPageChangeListener != null) {
            onPageChangeListener.FH(i);
        }
        List<OnPageChangeListener> list = this.Bx;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener2 = this.Bx.get(i2);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.FH(i);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.qP;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.FH(i);
        }
    }

    private void J8(int i) {
        OnPageChangeListener onPageChangeListener = this.oa;
        if (onPageChangeListener != null) {
            onPageChangeListener.DW(i);
        }
        List<OnPageChangeListener> list = this.Bx;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener2 = this.Bx.get(i2);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.DW(i);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.qP;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.DW(i);
        }
    }

    private void QX(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.PT : 0, null);
        }
    }

    private void VH(f fVar, int i, f fVar2) {
        int i2;
        int i3;
        f fVar3;
        f fVar4;
        int count = this.qp.getCount();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.Z1 / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i4 = fVar2.DW;
            int i5 = fVar.DW;
            if (i4 < i5) {
                int i6 = 0;
                float pageWidth = fVar2.v5 + fVar2.Hw + f2;
                while (true) {
                    i4++;
                    if (i4 > fVar.DW || i6 >= this.mb.size()) {
                        break;
                    }
                    f fVar5 = this.mb.get(i6);
                    while (true) {
                        fVar4 = fVar5;
                        if (i4 <= fVar4.DW || i6 >= this.mb.size() - 1) {
                            break;
                        }
                        i6++;
                        fVar5 = this.mb.get(i6);
                    }
                    while (i4 < fVar4.DW) {
                        pageWidth += this.qp.getPageWidth(i4) + f2;
                        i4++;
                    }
                    fVar4.v5 = pageWidth;
                    pageWidth += fVar4.Hw + f2;
                }
            } else if (i4 > i5) {
                int size = this.mb.size() - 1;
                float pageWidth2 = fVar2.v5;
                while (true) {
                    i4--;
                    if (i4 < fVar.DW || size < 0) {
                        break;
                    }
                    f fVar6 = this.mb.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i4 >= fVar3.DW || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.mb.get(size);
                    }
                    while (i4 > fVar3.DW) {
                        pageWidth2 -= this.qp.getPageWidth(i4) + f2;
                        i4--;
                    }
                    pageWidth2 -= fVar3.Hw + f2;
                    fVar3.v5 = pageWidth2;
                }
            }
        }
        int size2 = this.mb.size();
        float pageWidth3 = fVar.v5;
        int i7 = fVar.DW;
        int i8 = i7 - 1;
        this.Jl = i7 == 0 ? pageWidth3 : -3.4028235E38f;
        int i9 = count - 1;
        this.iW = fVar.DW == i9 ? (fVar.v5 + fVar.Hw) - 1.0f : Float.MAX_VALUE;
        int i10 = i - 1;
        while (i10 >= 0) {
            f fVar7 = this.mb.get(i10);
            while (true) {
                i3 = fVar7.DW;
                if (i8 <= i3) {
                    break;
                }
                pageWidth3 -= this.qp.getPageWidth(i8) + f2;
                i8--;
            }
            pageWidth3 -= fVar7.Hw + f2;
            fVar7.v5 = pageWidth3;
            if (i3 == 0) {
                this.Jl = pageWidth3;
            }
            i10--;
            i8--;
        }
        float pageWidth4 = fVar.v5 + fVar.Hw + f2;
        int i11 = fVar.DW + 1;
        int i12 = i + 1;
        while (i12 < size2) {
            f fVar8 = this.mb.get(i12);
            while (true) {
                i2 = fVar8.DW;
                if (i11 >= i2) {
                    break;
                }
                pageWidth4 += this.qp.getPageWidth(i11) + f2;
                i11++;
            }
            if (i2 == i9) {
                this.iW = (fVar8.Hw + pageWidth4) - 1.0f;
            }
            fVar8.v5 = pageWidth4;
            pageWidth4 += fVar8.Hw + f2;
            i12++;
            i11++;
        }
    }

    private void XL() {
        this.fN = false;
        this.Gj = false;
        VelocityTracker velocityTracker = this.ys;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ys = null;
        }
    }

    private f a8() {
        int i;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.Z1 / clientWidth : 0.0f;
        f fVar = null;
        float f4 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.mb.size()) {
            f fVar2 = this.mb.get(i3);
            if (!z && fVar2.DW != (i = i2 + 1)) {
                fVar2 = this.jw;
                fVar2.v5 = f2 + f4 + f3;
                fVar2.DW = i;
                fVar2.Hw = this.qp.getPageWidth(i);
                i3--;
            }
            f2 = fVar2.v5;
            float f5 = fVar2.Hw + f2 + f3;
            if (!z && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i3 == this.mb.size() - 1) {
                return fVar2;
            }
            i2 = fVar2.DW;
            f4 = fVar2.Hw;
            i3++;
            fVar = fVar2;
            z = false;
        }
        return fVar;
    }

    private void cb(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private void cn() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).j6) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private boolean dx() {
        this.a5 = -1;
        XL();
        this.Za.onRelease();
        this.An.onRelease();
        return this.Za.isFinished() || this.An.isFinished();
    }

    private boolean ei(int i) {
        if (this.mb.size() == 0) {
            if (this.Pa) {
                return false;
            }
            this.ce = false;
            gW(0, 0.0f, 0);
            if (this.ce) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarA8 = a8();
        int clientWidth = getClientWidth();
        int i2 = this.Z1;
        int i3 = clientWidth + i2;
        float f2 = clientWidth;
        int i4 = fVarA8.DW;
        float f3 = ((i / f2) - fVarA8.v5) / (fVarA8.Hw + (i2 / f2));
        this.ce = false;
        gW(i4, f3, (int) (i3 * f3));
        if (this.ce) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private static boolean er(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private Rect j3(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private boolean nw(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.aX - f2;
        this.aX = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.Jl * clientWidth;
        float f5 = this.iW * clientWidth;
        boolean z3 = false;
        f fVar = this.mb.get(0);
        ArrayList<f> arrayList = this.mb;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.DW != 0) {
            f4 = fVar.v5 * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.DW != this.qp.getCount() - 1) {
            f5 = fVar2.v5 * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.Za.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.An.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i = (int) scrollX;
        this.aX += scrollX - i;
        scrollTo(i, getScrollY());
        ei(i);
        return z3;
    }

    private void ro(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.mb.isEmpty()) {
            if (!this.hK.isFinished()) {
                this.hK.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        f fVarLg = lg(this.k2);
        int iMin = (int) ((fVarLg != null ? Math.min(fVarLg.v5, this.iW) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            u7(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private void sG(int i, boolean z, int i2, boolean z2) throws Resources.NotFoundException {
        f fVarLg = lg(i);
        int clientWidth = fVarLg != null ? (int) (getClientWidth() * Math.max(this.Jl, Math.min(fVarLg.v5, this.iW))) : 0;
        if (z) {
            Mz(clientWidth, 0, i2);
            if (z2) {
                J0(i);
                return;
            }
            return;
        }
        if (z2) {
            J0(i);
        }
        u7(false);
        scrollTo(clientWidth, 0);
        ei(clientWidth);
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.sE != z) {
            this.sE = z;
        }
    }

    private void u7(boolean z) {
        boolean z2 = this.ct == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.hK.isFinished()) {
                this.hK.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.hK.getCurrX();
                int currY = this.hK.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        ei(currX);
                    }
                }
            }
        }
        this.sg = false;
        for (int i = 0; i < this.mb.size(); i++) {
            f fVar = this.mb.get(i);
            if (fVar.FH) {
                fVar.FH = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                ViewCompat.QX(this, this.TI);
            } else {
                this.TI.run();
            }
        }
    }

    private void we(int i, float f2, int i2) {
        OnPageChangeListener onPageChangeListener = this.oa;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i, f2, i2);
        }
        List<OnPageChangeListener> list = this.Bx;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener2 = this.Bx.get(i3);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrolled(i, f2, i2);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.qP;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrolled(i, f2, i2);
        }
    }

    private boolean yS(float f2, float f3) {
        return (f2 < ((float) this.pN) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.pN)) && f3 < 0.0f);
    }

    f Hw(int i, int i2) {
        f fVar = new f();
        fVar.DW = i;
        fVar.j6 = this.qp.instantiateItem((ViewGroup) this, i);
        fVar.Hw = this.qp.getPageWidth(i);
        if (i2 < 0 || i2 >= this.mb.size()) {
            this.mb.add(fVar);
        } else {
            this.mb.add(i2, fVar);
        }
        return fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f7 A[PHI: r7 r10 r15
      0x00f7: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void KD(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.KD(int):void");
    }

    f Mr(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return U2(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    void Mz(int i, int i2, int i3) throws Resources.NotFoundException {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.hK;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.cT ? this.hK.getCurrX() : this.hK.getStartX();
            this.hK.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            u7(false);
            SI();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i7;
        float fWs = f3 + (Ws(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f2)) * f3);
        int iAbs = Math.abs(i3);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fWs / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i5) / ((f2 * this.qp.getPageWidth(this.k2)) + this.Z1)) + 1.0f) * 100.0f), 600);
        this.cT = false;
        this.hK.startScroll(i4, scrollY, i5, i6, iMin);
        ViewCompat.J8(this);
    }

    boolean P8() throws Resources.NotFoundException {
        PagerAdapter pagerAdapter = this.qp;
        if (pagerAdapter == null || this.k2 >= pagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.k2 + 1, true);
        return true;
    }

    void SI() throws Resources.NotFoundException {
        KD(this.k2);
    }

    void Sf(int i, boolean z, boolean z2) throws Resources.NotFoundException {
        vJ(i, z, z2, 0);
    }

    f U2(View view) {
        for (int i = 0; i < this.mb.size(); i++) {
            f fVar = this.mb.get(i);
            if (this.qp.isViewFromObject(view, fVar.j6)) {
                return fVar;
            }
        }
        return null;
    }

    float Ws(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        f fVarU2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (fVarU2 = U2(childAt)) != null && fVarU2.DW == this.k2) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    public void addOnAdapterChangeListener(OnAdapterChangeListener onAdapterChangeListener) {
        if (this.MP == null) {
            this.MP = new ArrayList();
        }
        this.MP.add(onAdapterChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f fVarU2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (fVarU2 = U2(childAt)) != null && fVarU2.DW == this.k2) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean zEr = layoutParams2.j6 | er(view);
        layoutParams2.j6 = zEr;
        if (!this.e3) {
            super.addView(view, i, layoutParams);
        } else {
            if (layoutParams2 != null && zEr) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.Hw = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    public boolean arrowScroll(int i) throws Resources.NotFoundException {
        boolean z;
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        boolean zVy = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z = false;
                    break;
                }
                if (parent == this) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (i == 17) {
                zRequestFocus = (viewFindFocus == null || j3(this.fY, viewFindNextFocus).left < j3(this.fY, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : vy();
            } else if (i == 66) {
                zRequestFocus = (viewFindFocus == null || j3(this.fY, viewFindNextFocus).left > j3(this.fY, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : P8();
            }
            zVy = zRequestFocus;
        } else if (i == 17 || i == 1) {
            zVy = vy();
        } else if (i == 66 || i == 2) {
            zVy = P8();
        }
        if (zVy) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zVy;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.qp == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.Jl)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.iW));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.cT = true;
        if (this.hK.isFinished() || !this.hK.computeScrollOffset()) {
            u7(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.hK.getCurrX();
        int currY = this.hK.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!ei(currX)) {
                this.hK.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.J8(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarU2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (fVarU2 = U2(childAt)) != null && fVarU2.DW == this.k2 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.qp) != null && pagerAdapter.getCount() > 1)) {
            if (!this.Za.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.Jl * width);
                this.Za.setSize(height, width);
                zDraw = false | this.Za.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.An.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.iW + 1.0f)) * width2);
                this.An.setSize(height2, width2);
                zDraw |= this.An.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.Za.finish();
            this.An.finish();
        }
        if (zDraw) {
            ViewCompat.J8(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.n5;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? vy() : arrowScroll(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? P8() : arrowScroll(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return arrowScroll(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return arrowScroll(1);
                }
            }
        }
        return false;
    }

    OnPageChangeListener g3(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.qP;
        this.qP = onPageChangeListener;
        return onPageChangeListener2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void gW(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.Jm
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.j6
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.gravity
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.we(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$j r13 = r12.Of
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.j6
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$j r3 = r12.Of
            r3.j6(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.ce = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.gW(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public PagerAdapter getAdapter() {
        return this.qp;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.b1 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.AR.get(i2).getLayoutParams()).Zo;
    }

    public int getCurrentItem() {
        return this.k2;
    }

    public int getOffscreenPageLimit() {
        return this.pO;
    }

    public int getPageMargin() {
        return this.Z1;
    }

    protected boolean gn(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && gn(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    f lg(int i) {
        for (int i2 = 0; i2 < this.mb.size(); i2++) {
            f fVar = this.mb.get(i2);
            if (fVar.DW == i) {
                return fVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Pa = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.TI);
        Scroller scroller = this.hK;
        if (scroller != null && !scroller.isFinished()) {
            this.hK.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.Z1 <= 0 || this.n5 == null || this.mb.size() <= 0 || this.qp == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.Z1 / width;
        int i = 0;
        f fVar = this.mb.get(0);
        float f5 = fVar.v5;
        int size = this.mb.size();
        int i2 = fVar.DW;
        int i3 = this.mb.get(size - 1).DW;
        while (i2 < i3) {
            while (i2 > fVar.DW && i < size) {
                i++;
                fVar = this.mb.get(i);
            }
            if (i2 == fVar.DW) {
                float f6 = fVar.v5;
                float f7 = fVar.Hw;
                f2 = (f6 + f7) * width;
                f5 = f6 + f7 + f4;
            } else {
                float pageWidth = this.qp.getPageWidth(i2);
                f2 = (f5 + pageWidth) * width;
                f5 += pageWidth + f4;
            }
            if (this.Z1 + f2 > scrollX) {
                f3 = f4;
                this.n5.setBounds(Math.round(f2), this.Q6, Math.round(this.Z1 + f2), this.kf);
                this.n5.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + r2) {
                return;
            }
            i2++;
            f4 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            dx();
            return false;
        }
        if (action != 0) {
            if (this.fN) {
                return true;
            }
            if (this.Gj) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.QO = x;
            this.aX = x;
            float y = motionEvent.getY();
            this.sM = y;
            this.e9 = y;
            this.a5 = motionEvent.getPointerId(0);
            this.Gj = false;
            this.cT = true;
            this.hK.computeScrollOffset();
            if (this.ct != 2 || Math.abs(this.hK.getFinalX() - this.hK.getCurrX()) <= this.BR) {
                u7(false);
                this.fN = false;
            } else {
                this.hK.abortAnimation();
                this.sg = false;
                SI();
                this.fN = true;
                cb(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.a5;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f2 = x2 - this.aX;
                float fAbs = Math.abs(f2);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.sM);
                if (f2 != 0.0f && !yS(this.aX, f2) && gn(this, false, (int) f2, (int) x2, (int) y2)) {
                    this.aX = x2;
                    this.e9 = y2;
                    this.Gj = true;
                    return false;
                }
                if (fAbs > this.oy && fAbs * 0.5f > fAbs2) {
                    this.fN = true;
                    cb(true);
                    setScrollState(1);
                    this.aX = f2 > 0.0f ? this.QO + this.oy : this.QO - this.oy;
                    this.e9 = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > this.oy) {
                    this.Gj = true;
                }
                if (this.fN && nw(x2)) {
                    ViewCompat.J8(this);
                }
            }
        } else if (action == 6) {
            BT(motionEvent);
        }
        if (this.ys == null) {
            this.ys = VelocityTracker.obtain();
        }
        this.ys.addMovement(motionEvent);
        return this.fN;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        f fVarU2;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarU2 = U2(childAt)) != null && fVarU2.DW == this.k2 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.j6());
        PagerAdapter pagerAdapter = this.qp;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.fY, savedState.qp);
            Sf(savedState.jw, false, true);
        } else {
            this.zh = savedState.jw;
            this.AL = savedState.fY;
            this.w9 = savedState.qp;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.jw = this.k2;
        PagerAdapter pagerAdapter = this.qp;
        if (pagerAdapter != null) {
            savedState.fY = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.Z1;
            ro(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void rN() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.hK = new Scroller(context, sT);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.oy = viewConfiguration.getScaledPagingTouchSlop();
        this.IS = (int) (400.0f * f2);
        this.gG = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Za = new EdgeEffect(context);
        this.An = new EdgeEffect(context);
        this.Nh = (int) (25.0f * f2);
        this.BR = (int) (2.0f * f2);
        this.Cz = (int) (f2 * 16.0f);
        ViewCompat.XL(this, new g());
        if (ViewCompat.Hw(this) == 0) {
            ViewCompat.U2(this, 1);
        }
        ViewCompat.lg(this, new d());
    }

    public void removeOnAdapterChangeListener(OnAdapterChangeListener onAdapterChangeListener) {
        List<OnAdapterChangeListener> list = this.MP;
        if (list != null) {
            list.remove(onAdapterChangeListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.e3) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) throws Resources.NotFoundException {
        PagerAdapter pagerAdapter2 = this.qp;
        if (pagerAdapter2 != null) {
            pagerAdapter2.setViewPagerObserver(null);
            this.qp.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mb.size(); i++) {
                f fVar = this.mb.get(i);
                this.qp.destroyItem((ViewGroup) this, fVar.DW, fVar.j6);
            }
            this.qp.finishUpdate((ViewGroup) this);
            this.mb.clear();
            cn();
            this.k2 = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.qp;
        this.qp = pagerAdapter;
        this.WB = 0;
        if (pagerAdapter != null) {
            if (this.q7 == null) {
                this.q7 = new k();
            }
            this.qp.setViewPagerObserver(this.q7);
            this.sg = false;
            boolean z = this.Pa;
            this.Pa = true;
            this.WB = this.qp.getCount();
            if (this.zh >= 0) {
                this.qp.restoreState(this.AL, this.w9);
                Sf(this.zh, false, true);
                this.zh = -1;
                this.AL = null;
                this.w9 = null;
            } else if (z) {
                requestLayout();
            } else {
                SI();
            }
        }
        List<OnAdapterChangeListener> list = this.MP;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.MP.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.MP.get(i2).Hw(this, pagerAdapter3, pagerAdapter);
        }
    }

    public void setCurrentItem(int i) throws Resources.NotFoundException {
        this.sg = false;
        Sf(i, !this.Pa, false);
    }

    public void setCurrentItem(int i, boolean z) throws Resources.NotFoundException {
        this.sg = false;
        Sf(i, z, false);
    }

    public void setOffscreenPageLimit(int i) throws Resources.NotFoundException {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.pO) {
            this.pO = i;
            SI();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.oa = onPageChangeListener;
    }

    public void setPageMargin(int i) {
        int i2 = this.Z1;
        this.Z1 = i;
        int width = getWidth();
        ro(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.n5 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i) {
        if (this.ct == i) {
            return;
        }
        this.ct = i;
        if (this.Of != null) {
            QX(i != 0);
        }
        J8(i);
    }

    void tp() throws Resources.NotFoundException {
        int count = this.qp.getCount();
        this.WB = count;
        boolean z = this.mb.size() < (this.pO * 2) + 1 && this.mb.size() < count;
        int iMax = this.k2;
        int i = 0;
        boolean z2 = false;
        while (i < this.mb.size()) {
            f fVar = this.mb.get(i);
            int itemPosition = this.qp.getItemPosition(fVar.j6);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mb.remove(i);
                    i--;
                    if (!z2) {
                        this.qp.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.qp.destroyItem((ViewGroup) this, fVar.DW, fVar.j6);
                    int i2 = this.k2;
                    if (i2 == fVar.DW) {
                        iMax = Math.max(0, Math.min(i2, count - 1));
                    }
                } else {
                    int i3 = fVar.DW;
                    if (i3 != itemPosition) {
                        if (i3 == this.k2) {
                            iMax = itemPosition;
                        }
                        fVar.DW = itemPosition;
                    }
                }
                z = true;
            }
            i++;
        }
        if (z2) {
            this.qp.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mb, Lz);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
                if (!layoutParams.j6) {
                    layoutParams.FH = 0.0f;
                }
            }
            Sf(iMax, false, true);
            requestLayout();
        }
    }

    void vJ(int i, boolean z, boolean z2, int i2) throws Resources.NotFoundException {
        PagerAdapter pagerAdapter = this.qp;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.k2 == i && this.mb.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.qp.getCount()) {
            i = this.qp.getCount() - 1;
        }
        int i3 = this.pO;
        int i4 = this.k2;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.mb.size(); i5++) {
                this.mb.get(i5).FH = true;
            }
        }
        boolean z3 = this.k2 != i;
        if (!this.Pa) {
            KD(i);
            sG(i, z, i2, z3);
        } else {
            this.k2 = i;
            if (z3) {
                J0(i);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.n5;
    }

    boolean vy() throws Resources.NotFoundException {
        int i = this.k2;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        float FH;
        boolean Hw;
        int Zo;
        public int gravity;
        public boolean j6;
        int v5;

        public LayoutParams() {
            super(-1, -1);
            this.FH = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.FH = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.Fd);
            this.gravity = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mb = new ArrayList<>();
        this.jw = new f();
        this.fY = new Rect();
        this.zh = -1;
        this.AL = null;
        this.w9 = null;
        this.Jl = -3.4028235E38f;
        this.iW = Float.MAX_VALUE;
        this.pO = 1;
        this.a5 = -1;
        this.Pa = true;
        this.TI = new c();
        this.ct = 0;
        rN();
    }
}
