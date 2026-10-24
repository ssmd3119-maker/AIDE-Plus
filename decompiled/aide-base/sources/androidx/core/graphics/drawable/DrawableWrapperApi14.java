package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class DrawableWrapperApi14 extends Drawable implements Drawable.Callback, TintAwareDrawable {
    static final PorterDuff.Mode zh = PorterDuff.Mode.SRC_IN;
    private int WB;
    a fY;
    private boolean jw;
    Drawable k2;
    private PorterDuff.Mode mb;
    private boolean qp;

    protected static abstract class a extends Drawable.ConstantState {
        Drawable.ConstantState DW;
        ColorStateList FH;
        PorterDuff.Mode Hw;
        int j6;

        public a(a aVar, Resources resources) {
            this.FH = null;
            this.Hw = DrawableWrapperApi14.zh;
            if (aVar != null) {
                this.j6 = aVar.j6;
                this.DW = aVar.DW;
                this.FH = aVar.FH;
                this.Hw = aVar.Hw;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i = this.j6;
            Drawable.ConstantState constantState = this.DW;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        public boolean j6() {
            return this.DW != null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public abstract Drawable newDrawable(Resources resources);
    }

    private static class b extends a {
        public b(a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // androidx.core.graphics.drawable.DrawableWrapperApi14.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new DrawableWrapperApi14(this, resources);
        }
    }

    public DrawableWrapperApi14(a aVar, Resources resources) {
        this.fY = aVar;
        v5(resources);
    }

    private boolean Zo(int[] iArr) {
        if (!j6()) {
            return false;
        }
        a aVar = this.fY;
        ColorStateList colorStateList = aVar.FH;
        PorterDuff.Mode mode = aVar.Hw;
        if (colorStateList == null || mode == null) {
            this.jw = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.jw || colorForState != this.WB || mode != this.mb) {
                setColorFilter(colorForState, mode);
                this.WB = colorForState;
                this.mb = mode;
                this.jw = true;
                return true;
            }
        }
        return false;
    }

    private void v5(Resources resources) {
        Drawable.ConstantState constantState;
        a aVar = this.fY;
        if (aVar == null || (constantState = aVar.DW) == null) {
            return;
        }
        Hw(FH(constantState, resources));
    }

    public a DW() {
        return new b(this.fY, null);
    }

    public Drawable FH(Drawable.ConstantState constantState, Resources resources) {
        return constantState.newDrawable(resources);
    }

    public final void Hw(Drawable drawable) {
        Drawable drawable2 = this.k2;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.k2 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            a aVar = this.fY;
            if (aVar != null) {
                aVar.DW = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.k2.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        a aVar = this.fY;
        return changingConfigurations | (aVar != null ? aVar.getChangingConfigurations() : 0) | this.k2.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        a aVar = this.fY;
        if (aVar == null || !aVar.j6()) {
            return null;
        }
        this.fY.j6 = getChangingConfigurations();
        return this.fY;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.k2.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.k2.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.k2.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.k2.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.k2.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.k2.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.k2.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.k2.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.k2.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        a aVar;
        ColorStateList colorStateList = (!j6() || (aVar = this.fY) == null) ? null : aVar.FH;
        return (colorStateList != null && colorStateList.isStateful()) || this.k2.isStateful();
    }

    public boolean j6() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.k2.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.qp && super.mutate() == this) {
            this.fY = DW();
            Drawable drawable = this.k2;
            if (drawable != null) {
                drawable.mutate();
            }
            a aVar = this.fY;
            if (aVar != null) {
                Drawable drawable2 = this.k2;
                aVar.DW = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.qp = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.k2;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.k2.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.k2.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.k2.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.k2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.k2.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.k2.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return Zo(iArr) || this.k2.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        this.fY.FH = colorStateList;
        Zo(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.fY.Hw = mode;
        Zo(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.k2.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public DrawableWrapperApi14(Drawable drawable) {
        this.fY = DW();
        Hw(drawable);
    }
}
