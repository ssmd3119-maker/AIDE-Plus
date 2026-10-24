package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableWrapperApi14;

/* loaded from: classes.dex */
public class DrawableWrapperApi19 extends DrawableWrapperApi14 {

    private static class a extends DrawableWrapperApi14.a {
        public a(DrawableWrapperApi14.a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // androidx.core.graphics.drawable.DrawableWrapperApi14.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new DrawableWrapperApi19(this, resources);
        }
    }

    public DrawableWrapperApi19(Drawable drawable) {
        super(drawable);
    }

    @Override // androidx.core.graphics.drawable.DrawableWrapperApi14
    public DrawableWrapperApi14.a DW() {
        return new a(this.fY, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.k2.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.k2.setAutoMirrored(z);
    }

    public DrawableWrapperApi19(DrawableWrapperApi14.a aVar, Resources resources) {
        super(aVar, resources);
    }
}
