package androidx.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* loaded from: classes.dex */
public class d {
    private static final Interpolator lg = new a();
    private int DW;
    private int EQ;
    private float[] Hw;
    private float J0;
    private float J8;
    private boolean Mr;
    private int QX;
    private final ViewGroup U2;
    private float[] VH;
    private int Ws;
    private OverScroller XL;
    private float[] Zo;
    private final c aM;
    private int[] gn;
    private View j3;
    private int j6;
    private int[] tp;
    private int[] u7;
    private float[] v5;
    private VelocityTracker we;
    private int FH = -1;
    private final Runnable a8 = new b();

    static class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.sh(0);
        }
    }

    public static abstract class c {
        public abstract int DW(View view, int i, int i2);

        public abstract void EQ(View view, int i, int i2, int i3, int i4);

        public int FH(int i) {
            return i;
        }

        public abstract int Hw(View view);

        public abstract boolean J0(View view, int i);

        public boolean VH(int i) {
            return false;
        }

        public abstract void Zo(int i, int i2);

        public void gn(int i, int i2) {
        }

        public abstract int j6(View view, int i, int i2);

        public abstract void tp(int i);

        public abstract void u7(View view, int i);

        public int v5(View view) {
            return 0;
        }

        public abstract void we(View view, float f, float f2);
    }

    private d(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.U2 = viewGroup;
        this.aM = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.Ws = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.DW = viewConfiguration.getScaledTouchSlop();
        this.J0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.J8 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.XL = new OverScroller(context, lg);
    }

    private void EQ(int i) {
        if (this.Hw == null || !vy(i)) {
            return;
        }
        this.Hw[i] = 0.0f;
        this.v5[i] = 0.0f;
        this.Zo[i] = 0.0f;
        this.VH[i] = 0.0f;
        this.gn[i] = 0;
        this.u7[i] = 0;
        this.tp[i] = 0;
        this.EQ = ((1 << i) ^ (-1)) & this.EQ;
    }

    private boolean Hw(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.gn[i] & i2) != i2 || (this.QX & i2) == 0 || (this.tp[i] & i2) == i2 || (this.u7[i] & i2) == i2) {
            return false;
        }
        int i3 = this.DW;
        if (fAbs <= i3 && fAbs2 <= i3) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.aM.VH(i2)) {
            return (this.u7[i] & i2) == 0 && fAbs > ((float) this.DW);
        }
        int[] iArr = this.tp;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    private int J0(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int iU7 = u7(i3, (int) this.J8, (int) this.J0);
        int iU72 = u7(i4, (int) this.J8, (int) this.J0);
        int iAbs = Math.abs(i);
        int iAbs2 = Math.abs(i2);
        int iAbs3 = Math.abs(iU7);
        int iAbs4 = Math.abs(iU72);
        int i5 = iAbs3 + iAbs4;
        int i6 = iAbs + iAbs2;
        if (iU7 != 0) {
            f = iAbs3;
            f2 = i5;
        } else {
            f = iAbs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (iU72 != 0) {
            f3 = iAbs4;
            f4 = i5;
        } else {
            f3 = iAbs2;
            f4 = i6;
        }
        return (int) ((we(i, iU7, this.aM.Hw(view)) * f5) + (we(i2, iU72, this.aM.v5(view)) * (f3 / f4)));
    }

    private void KD(float f, float f2, int i) {
        int i2 = Hw(f, f2, i, 1) ? 1 : 0;
        if (Hw(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (Hw(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (Hw(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.u7;
            iArr[i] = iArr[i] | i2;
            this.aM.Zo(i2, i);
        }
    }

    private void Mr(int i) {
        float[] fArr = this.Hw;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.Hw;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.v5;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.Zo;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.VH;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.gn;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.u7;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.tp;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.Hw = fArr2;
            this.v5 = fArr3;
            this.Zo = fArr4;
            this.VH = fArr5;
            this.gn = iArr;
            this.u7 = iArr2;
            this.tp = iArr3;
        }
    }

    private boolean P8(int i) {
        if (vy(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public static d QX(ViewGroup viewGroup, c cVar) {
        return new d(viewGroup.getContext(), viewGroup, cVar);
    }

    private void SI() {
        this.we.computeCurrentVelocity(1000, this.J0);
        XL(gn(this.we.getXVelocity(this.FH), this.J8, this.J0), gn(this.we.getYVelocity(this.FH), this.J8, this.J0));
    }

    private boolean VH(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.aM.Hw(view) > 0;
        boolean z2 = this.aM.v5(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.DW) : z2 && Math.abs(f2) > ((float) this.DW);
        }
        float f3 = (f * f) + (f2 * f2);
        int i = this.DW;
        return f3 > ((float) (i * i));
    }

    public static d Ws(ViewGroup viewGroup, float f, c cVar) {
        d dVarQX = QX(viewGroup, cVar);
        dVarQX.DW = (int) (dVarQX.DW * (1.0f / f));
        return dVarQX;
    }

    private void XL(float f, float f2) {
        this.Mr = true;
        this.aM.we(this.j3, f, f2);
        this.Mr = false;
        if (this.j6 == 1) {
            sh(0);
        }
    }

    private boolean a8(int i, int i2, int i3, int i4) {
        int left = this.j3.getLeft();
        int top = this.j3.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.XL.abortAnimation();
            sh(0);
            return false;
        }
        this.XL.startScroll(left, top, i5, i6, J0(this.j3, i5, i6, i3, i4));
        sh(2);
        return true;
    }

    private float aM(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private void cn(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (P8(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.Zo[pointerId] = x;
                this.VH[pointerId] = y;
            }
        }
    }

    private int er(int i, int i2) {
        int i3 = i < this.U2.getLeft() + this.Ws ? 1 : 0;
        if (i2 < this.U2.getTop() + this.Ws) {
            i3 |= 4;
        }
        if (i > this.U2.getRight() - this.Ws) {
            i3 |= 2;
        }
        return i2 > this.U2.getBottom() - this.Ws ? i3 | 8 : i3;
    }

    private float gn(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return 0.0f;
        }
        return fAbs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    private void j3(int i, int i2, int i3, int i4) {
        int left = this.j3.getLeft();
        int top = this.j3.getTop();
        if (i3 != 0) {
            i = this.aM.j6(this.j3, i, i3);
            ViewCompat.EQ(this.j3, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.aM.DW(this.j3, i2, i4);
            ViewCompat.we(this.j3, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.aM.EQ(this.j3, i5, i6, i5 - left, i6 - top);
    }

    private void ro(float f, float f2, int i) {
        Mr(i);
        float[] fArr = this.Hw;
        this.Zo[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.v5;
        this.VH[i] = f2;
        fArr2[i] = f2;
        this.gn[i] = er((int) f, (int) f2);
        this.EQ |= 1 << i;
    }

    private void tp() {
        float[] fArr = this.Hw;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.v5, 0.0f);
        Arrays.fill(this.Zo, 0.0f);
        Arrays.fill(this.VH, 0.0f);
        Arrays.fill(this.gn, 0);
        Arrays.fill(this.u7, 0);
        Arrays.fill(this.tp, 0);
        this.EQ = 0;
    }

    private int u7(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        return iAbs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    private int we(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.U2.getWidth();
        float f = width / 2;
        float fAM = f + (aM(Math.min(1.0f, Math.abs(i) / width)) * f);
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fAM / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public boolean BT(int i, int i2) {
        return ei(this.j3, i, i2);
    }

    public void DW() {
        this.FH = -1;
        tp();
        VelocityTracker velocityTracker = this.we;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.we = null;
        }
    }

    public void FH(View view, int i) {
        if (view.getParent() == this.U2) {
            this.j3 = view;
            this.FH = i;
            this.aM.u7(view, i);
            sh(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.U2 + ")");
    }

    public boolean J8(boolean z) {
        if (this.j6 == 2) {
            boolean zComputeScrollOffset = this.XL.computeScrollOffset();
            int currX = this.XL.getCurrX();
            int currY = this.XL.getCurrY();
            int left = currX - this.j3.getLeft();
            int top = currY - this.j3.getTop();
            if (left != 0) {
                ViewCompat.EQ(this.j3, left);
            }
            if (top != 0) {
                ViewCompat.we(this.j3, top);
            }
            if (left != 0 || top != 0) {
                this.aM.EQ(this.j3, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.XL.getFinalX() && currY == this.XL.getFinalY()) {
                this.XL.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z) {
                    this.U2.post(this.a8);
                } else {
                    sh(0);
                }
            }
        }
        return this.j6 == 2;
    }

    public boolean Sf(View view, int i, int i2) {
        this.j3 = view;
        this.FH = -1;
        boolean zA8 = a8(i, i2, 0, 0);
        if (!zA8 && this.j6 == 0 && this.j3 != null) {
            this.j3 = null;
        }
        return zA8;
    }

    public View U2(int i, int i2) {
        for (int childCount = this.U2.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.U2;
            this.aM.FH(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean Zo(int i, int i2) {
        if (!vy(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.Zo[i2] - this.Hw[i2];
        float f2 = this.VH[i2] - this.v5[i2];
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.DW) : z2 && Math.abs(f2) > ((float) this.DW);
        }
        float f3 = (f * f) + (f2 * f2);
        int i3 = this.DW;
        return f3 > ((float) (i3 * i3));
    }

    public void cb(int i) {
        this.QX = i;
    }

    public void dx(float f) {
        this.J8 = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean ef(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.d.ef(android.view.MotionEvent):boolean");
    }

    public boolean ei(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public int gW() {
        return this.j6;
    }

    public void j6() {
        DW();
        if (this.j6 == 2) {
            int currX = this.XL.getCurrX();
            int currY = this.XL.getCurrY();
            this.XL.abortAnimation();
            int currX2 = this.XL.getCurrX();
            int currY2 = this.XL.getCurrY();
            this.aM.EQ(this.j3, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        sh(0);
    }

    public View lg() {
        return this.j3;
    }

    public void nw(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            DW();
        }
        if (this.we == null) {
            this.we = VelocityTracker.obtain();
        }
        this.we.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewU2 = U2((int) x, (int) y);
            ro(x, y, pointerId);
            vJ(viewU2, pointerId);
            int i3 = this.gn[pointerId];
            int i4 = this.QX;
            if ((i3 & i4) != 0) {
                this.aM.gn(i3 & i4, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.j6 == 1) {
                SI();
            }
            DW();
            return;
        }
        if (actionMasked == 2) {
            if (this.j6 == 1) {
                if (P8(this.FH)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.FH);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.Zo;
                    int i5 = this.FH;
                    int i6 = (int) (x2 - fArr[i5]);
                    int i7 = (int) (y2 - this.VH[i5]);
                    j3(this.j3.getLeft() + i6, this.j3.getTop() + i7, i6, i7);
                    cn(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i2 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i2);
                if (P8(pointerId2)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.Hw[pointerId2];
                    float f2 = y3 - this.v5[pointerId2];
                    KD(f, f2, pointerId2);
                    if (this.j6 != 1) {
                        View viewU22 = U2((int) x3, (int) y3);
                        if (VH(viewU22, f, f2) && vJ(viewU22, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            cn(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.j6 == 1) {
                XL(0.0f, 0.0f);
            }
            DW();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            ro(x4, y4, pointerId3);
            if (this.j6 != 0) {
                if (BT((int) x4, (int) y4)) {
                    vJ(this.j3, pointerId3);
                    return;
                }
                return;
            } else {
                vJ(U2((int) x4, (int) y4), pointerId3);
                int i8 = this.gn[pointerId3];
                int i9 = this.QX;
                if ((i8 & i9) != 0) {
                    this.aM.gn(i8 & i9, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.j6 == 1 && pointerId4 == this.FH) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.FH) {
                    View viewU23 = U2((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                    View view = this.j3;
                    if (viewU23 == view && vJ(view, pointerId5)) {
                        i = this.FH;
                        break;
                    }
                }
                i2++;
            }
            if (i == -1) {
                SI();
            }
        }
        EQ(pointerId4);
    }

    public int rN() {
        return this.Ws;
    }

    public boolean sG(int i, int i2) {
        if (this.Mr) {
            return a8(i, i2, (int) this.we.getXVelocity(this.FH), (int) this.we.getYVelocity(this.FH));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    void sh(int i) {
        this.U2.removeCallbacks(this.a8);
        if (this.j6 != i) {
            this.j6 = i;
            this.aM.tp(i);
            if (this.j6 == 0) {
                this.j3 = null;
            }
        }
    }

    public boolean v5(int i) {
        int length = this.Hw.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (Zo(i, i2)) {
                return true;
            }
        }
        return false;
    }

    boolean vJ(View view, int i) {
        if (view == this.j3 && this.FH == i) {
            return true;
        }
        if (view == null || !this.aM.J0(view, i)) {
            return false;
        }
        this.FH = i;
        FH(view, i);
        return true;
    }

    public boolean vy(int i) {
        return ((1 << i) & this.EQ) != 0;
    }

    public int yS() {
        return this.DW;
    }
}
