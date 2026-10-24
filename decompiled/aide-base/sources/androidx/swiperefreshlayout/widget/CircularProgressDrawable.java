package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.Preconditions;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;

/* loaded from: classes.dex */
public class CircularProgressDrawable extends Drawable implements Animatable {
    private final c WB;
    private Animator fY;
    private Resources jw;
    private boolean k2;
    private float mb;
    private float qp;
    private static final Interpolator zh = new LinearInterpolator();
    private static final Interpolator AL = new FastOutSlowInInterpolator();
    private static final int[] w9 = {-16777216};

    class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ c j6;

        a(c cVar) {
            this.j6 = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CircularProgressDrawable.this.Mr(fFloatValue, this.j6);
            CircularProgressDrawable.this.gn(fFloatValue, this.j6, false);
            CircularProgressDrawable.this.invalidateSelf();
        }
    }

    class b implements Animator.AnimatorListener {
        final /* synthetic */ c j6;

        b(c cVar) {
            this.j6 = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            CircularProgressDrawable.this.gn(1.0f, this.j6, true);
            this.j6.gW();
            this.j6.we();
            if (!CircularProgressDrawable.this.k2) {
                CircularProgressDrawable.this.qp += 1.0f;
                return;
            }
            CircularProgressDrawable.this.k2 = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.j6.rN(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            CircularProgressDrawable.this.qp = 0.0f;
        }
    }

    private static class c {
        float EQ;
        float J0;
        boolean J8;
        int U2;
        Path Ws;
        float XL;
        int aM;
        int j3;
        int tp;
        int[] u7;
        float we;
        final RectF j6 = new RectF();
        final Paint DW = new Paint();
        final Paint FH = new Paint();
        final Paint Hw = new Paint();
        float v5 = 0.0f;
        float Zo = 0.0f;
        float VH = 0.0f;
        float gn = 5.0f;
        float QX = 1.0f;
        int Mr = 255;

        c() {
            this.DW.setStrokeCap(Paint.Cap.SQUARE);
            this.DW.setAntiAlias(true);
            this.DW.setStyle(Paint.Style.STROKE);
            this.FH.setStyle(Paint.Style.FILL);
            this.FH.setAntiAlias(true);
            this.Hw.setColor(0);
        }

        void DW(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.J8) {
                Path path = this.Ws;
                if (path == null) {
                    Path path2 = new Path();
                    this.Ws = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (this.aM * this.QX) / 2.0f;
                this.Ws.moveTo(0.0f, 0.0f);
                this.Ws.lineTo(this.aM * this.QX, 0.0f);
                Path path3 = this.Ws;
                float f4 = this.aM;
                float f5 = this.QX;
                path3.lineTo((f4 * f5) / 2.0f, this.j3 * f5);
                this.Ws.offset((fMin + rectF.centerX()) - f3, rectF.centerY() + (this.gn / 2.0f));
                this.Ws.close();
                this.FH.setColor(this.U2);
                this.FH.setAlpha(this.Mr);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.Ws, this.FH);
                canvas.restore();
            }
        }

        float EQ() {
            return this.EQ;
        }

        int FH() {
            return this.Mr;
        }

        float Hw() {
            return this.Zo;
        }

        void J0() {
            this.EQ = 0.0f;
            this.we = 0.0f;
            this.J0 = 0.0f;
            er(0.0f);
            a8(0.0f);
            lg(0.0f);
        }

        void J8(int i) {
            this.Mr = i;
        }

        void Mr(int i) {
            this.tp = i;
            this.U2 = this.u7[i];
        }

        void QX(float f) {
            if (f != this.QX) {
                this.QX = f;
            }
        }

        void U2(int[] iArr) {
            this.u7 = iArr;
            Mr(0);
        }

        float VH() {
            return this.v5;
        }

        void Ws(float f, float f2) {
            this.aM = (int) f;
            this.j3 = (int) f2;
        }

        void XL(float f) {
            this.XL = f;
        }

        int Zo() {
            return (this.tp + 1) % this.u7.length;
        }

        void a8(float f) {
            this.Zo = f;
        }

        void aM(int i) {
            this.U2 = i;
        }

        void er(float f) {
            this.v5 = f;
        }

        void gW() {
            this.EQ = this.v5;
            this.we = this.Zo;
            this.J0 = this.VH;
        }

        int gn() {
            return this.u7[this.tp];
        }

        void j3(ColorFilter colorFilter) {
            this.DW.setColorFilter(colorFilter);
        }

        void j6(Canvas canvas, Rect rect) {
            RectF rectF = this.j6;
            float f = this.XL;
            float fMin = (this.gn / 2.0f) + f;
            if (f <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.aM * this.QX) / 2.0f, this.gn / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f2 = this.v5;
            float f3 = this.VH;
            float f4 = (f2 + f3) * 360.0f;
            float f5 = ((this.Zo + f3) * 360.0f) - f4;
            this.DW.setColor(this.U2);
            this.DW.setAlpha(this.Mr);
            float f6 = this.gn / 2.0f;
            rectF.inset(f6, f6);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.Hw);
            float f7 = -f6;
            rectF.inset(f7, f7);
            canvas.drawArc(rectF, f4, f5, false, this.DW);
            DW(canvas, f4, f5, rectF);
        }

        void lg(float f) {
            this.VH = f;
        }

        void rN(boolean z) {
            if (this.J8 != z) {
                this.J8 = z;
            }
        }

        float tp() {
            return this.J0;
        }

        float u7() {
            return this.we;
        }

        int v5() {
            return this.u7[Zo()];
        }

        void we() {
            Mr(Zo());
        }

        void yS(float f) {
            this.gn = f;
            this.DW.setStrokeWidth(f);
        }
    }

    public CircularProgressDrawable(Context context) {
        Preconditions.j6(context);
        this.jw = context.getResources();
        c cVar = new c();
        this.WB = cVar;
        cVar.U2(w9);
        XL(2.5f);
        j3();
    }

    private void J8(float f) {
        this.mb = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mr(float f, c cVar) {
        if (f > 0.75f) {
            cVar.aM(u7((f - 0.75f) / 0.25f, cVar.gn(), cVar.v5()));
        } else {
            cVar.aM(cVar.gn());
        }
    }

    private void VH(float f, c cVar) {
        Mr(f, cVar);
        float fFloor = (float) (Math.floor(cVar.tp() / 0.8f) + 1.0d);
        cVar.er(cVar.EQ() + (((cVar.u7() - 0.01f) - cVar.EQ()) * f));
        cVar.a8(cVar.u7());
        cVar.lg(cVar.tp() + ((fFloor - cVar.tp()) * f));
    }

    private void Ws(float f, float f2, float f3, float f4) {
        c cVar = this.WB;
        float f5 = this.jw.getDisplayMetrics().density;
        cVar.yS(f2 * f5);
        cVar.XL(f * f5);
        cVar.Mr(0);
        cVar.Ws(f3 * f5, f4 * f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gn(float f, c cVar, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.k2) {
            VH(f, cVar);
            return;
        }
        if (f != 1.0f || z) {
            float fTp = cVar.tp();
            if (f < 0.5f) {
                interpolation = cVar.EQ();
                interpolation2 = (AL.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fEQ = cVar.EQ() + 0.79f;
                interpolation = fEQ - (((1.0f - AL.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fEQ;
            }
            float f2 = fTp + (0.20999998f * f);
            float f3 = (f + this.qp) * 216.0f;
            cVar.er(interpolation);
            cVar.a8(interpolation2);
            cVar.lg(f2);
            J8(f3);
        }
    }

    private void j3() {
        c cVar = this.WB;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(zh);
        valueAnimatorOfFloat.addListener(new b(cVar));
        this.fY = valueAnimatorOfFloat;
    }

    private int u7(float f, int i, int i2) {
        return ((((i >> 24) & 255) + ((int) ((((i2 >> 24) & 255) - r0) * f))) << 24) | ((((i >> 16) & 255) + ((int) ((((i2 >> 16) & 255) - r1) * f))) << 16) | ((((i >> 8) & 255) + ((int) ((((i2 >> 8) & 255) - r2) * f))) << 8) | ((i & 255) + ((int) (f * ((i2 & 255) - r8))));
    }

    public void EQ(float f) {
        this.WB.QX(f);
        invalidateSelf();
    }

    public void J0(float f) {
        this.WB.lg(f);
        invalidateSelf();
    }

    public void QX(float f, float f2) {
        this.WB.er(f);
        this.WB.a8(f2);
        invalidateSelf();
    }

    public void XL(float f) {
        this.WB.yS(f);
        invalidateSelf();
    }

    public void aM(int i) {
        if (i == 0) {
            Ws(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            Ws(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.mb, bounds.exactCenterX(), bounds.exactCenterY());
        this.WB.j6(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.WB.FH();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.fY.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.WB.J8(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.WB.j3(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.fY.cancel();
        this.WB.gW();
        if (this.WB.Hw() != this.WB.VH()) {
            this.k2 = true;
            this.fY.setDuration(666L);
            this.fY.start();
        } else {
            this.WB.Mr(0);
            this.WB.J0();
            this.fY.setDuration(1332L);
            this.fY.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.fY.cancel();
        J8(0.0f);
        this.WB.rN(false);
        this.WB.Mr(0);
        this.WB.J0();
        invalidateSelf();
    }

    public void tp(boolean z) {
        this.WB.rN(z);
        invalidateSelf();
    }

    public void we(int... iArr) {
        this.WB.U2(iArr);
        this.WB.Mr(0);
        invalidateSelf();
    }
}
