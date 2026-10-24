package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import androidx.core.graphics.drawable.DrawableWrapperApi14;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class DrawableWrapperApi21 extends DrawableWrapperApi19 {
    private static Method AL;

    private static class a extends DrawableWrapperApi14.a {
        public a(DrawableWrapperApi14.a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // androidx.core.graphics.drawable.DrawableWrapperApi14.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new DrawableWrapperApi21(this, resources);
        }
    }

    public DrawableWrapperApi21(Drawable drawable) {
        super(drawable);
        VH();
    }

    private void VH() {
        if (AL == null) {
            try {
                AL = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("DrawableWrapperApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // androidx.core.graphics.drawable.DrawableWrapperApi19, androidx.core.graphics.drawable.DrawableWrapperApi14
    public DrawableWrapperApi14.a DW() {
        return new a(this.fY, null);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.k2.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.k2.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.k2;
        if (drawable != null && (method = AL) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("DrawableWrapperApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.DrawableWrapperApi14
    public boolean j6() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.k2;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.k2.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.k2.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.core.graphics.drawable.DrawableWrapperApi14, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.DrawableWrapperApi14, android.graphics.drawable.Drawable
    public void setTint(int i) {
        if (j6()) {
            super.setTint(i);
        } else {
            this.k2.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.DrawableWrapperApi14, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        if (j6()) {
            super.setTintList(colorStateList);
        } else {
            this.k2.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.DrawableWrapperApi14, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (j6()) {
            super.setTintMode(mode);
        } else {
            this.k2.setTintMode(mode);
        }
    }

    public DrawableWrapperApi21(DrawableWrapperApi14.a aVar, Resources resources) {
        super(aVar, resources);
        VH();
    }
}
