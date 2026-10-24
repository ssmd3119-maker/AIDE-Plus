package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class a extends ImageView {
    private Animation.AnimationListener WB;
    int mb;

    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private class C0031a extends OvalShape {
        private RadialGradient WB;
        private Paint mb = new Paint();

        C0031a(int i) {
            a.this.mb = i;
            j6((int) rect().width());
        }

        private void j6(int i) {
            float f = i / 2;
            RadialGradient radialGradient = new RadialGradient(f, f, a.this.mb, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.WB = radialGradient;
            this.mb.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = a.this.getWidth() / 2;
            float height = a.this.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.mb);
            canvas.drawCircle(width, height, r0 - a.this.mb, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f, float f2) {
            super.onResize(f, f2);
            j6((int) f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, int i) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.mb = (int) (3.5f * f);
        if (j6()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ViewCompat.Mr(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0031a(this.mb));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.mb, i3, i2, 503316480);
            int i4 = this.mb;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        ViewCompat.aM(this, shapeDrawable);
    }

    private boolean j6() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void DW(Animation.AnimationListener animationListener) {
        this.WB = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.WB;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.WB;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (j6()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.mb * 2), getMeasuredHeight() + (this.mb * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
