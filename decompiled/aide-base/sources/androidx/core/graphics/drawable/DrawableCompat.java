package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class DrawableCompat {
    static final e j6;

    static class a extends e {
        private static boolean DW;
        private static Method j6;

        @Override // androidx.core.graphics.drawable.DrawableCompat.e
        public boolean DW(Drawable drawable, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!DW) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    j6 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompatApi17", "Failed to retrieve setLayoutDirection(int) method", e);
                }
                DW = true;
            }
            Method method = j6;
            if (method != null) {
                try {
                    method.invoke(drawable, Integer.valueOf(i));
                    return true;
                } catch (Exception e2) {
                    Log.i("DrawableCompatApi17", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    j6 = null;
                }
            }
            return false;
        }
    }

    static class b extends a {
        @Override // androidx.core.graphics.drawable.DrawableCompat.e
        public boolean j6(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @Override // androidx.core.graphics.drawable.DrawableCompat.e
        public Drawable v5(Drawable drawable) {
            return !(drawable instanceof TintAwareDrawable) ? new DrawableWrapperApi19(drawable) : drawable;
        }
    }

    static class c extends b {
        @Override // androidx.core.graphics.drawable.DrawableCompat.e
        public void FH(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @Override // androidx.core.graphics.drawable.DrawableCompat.e
        public void Hw(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }

        @Override // androidx.core.graphics.drawable.DrawableCompat.b, androidx.core.graphics.drawable.DrawableCompat.e
        public Drawable v5(Drawable drawable) {
            return !(drawable instanceof TintAwareDrawable) ? new DrawableWrapperApi21(drawable) : drawable;
        }
    }

    static class d extends c {
        @Override // androidx.core.graphics.drawable.DrawableCompat.a, androidx.core.graphics.drawable.DrawableCompat.e
        public boolean DW(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }

        @Override // androidx.core.graphics.drawable.DrawableCompat.c, androidx.core.graphics.drawable.DrawableCompat.b, androidx.core.graphics.drawable.DrawableCompat.e
        public Drawable v5(Drawable drawable) {
            return drawable;
        }
    }

    static class e {
        public boolean DW(Drawable drawable, int i) {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void FH(Drawable drawable, ColorStateList colorStateList) {
            if (drawable instanceof TintAwareDrawable) {
                ((TintAwareDrawable) drawable).setTintList(colorStateList);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void Hw(Drawable drawable, PorterDuff.Mode mode) {
            if (drawable instanceof TintAwareDrawable) {
                ((TintAwareDrawable) drawable).setTintMode(mode);
            }
        }

        public boolean j6(Drawable drawable) {
            return false;
        }

        public Drawable v5(Drawable drawable) {
            return !(drawable instanceof TintAwareDrawable) ? new DrawableWrapperApi14(drawable) : drawable;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            j6 = new d();
            return;
        }
        if (i >= 21) {
            j6 = new c();
            return;
        }
        if (i >= 19) {
            j6 = new b();
        } else if (i >= 17) {
            j6 = new a();
        } else {
            j6 = new e();
        }
    }

    public static boolean DW(Drawable drawable, int i) {
        return j6.DW(drawable, i);
    }

    public static boolean j6(Drawable drawable) {
        return j6.j6(drawable);
    }

    public static void setTintList(Drawable drawable, ColorStateList colorStateList) {
        j6.FH(drawable, colorStateList);
    }

    public static void setTintList(Drawable drawable, PorterDuff.Mode mode) {
        j6.Hw(drawable, mode);
    }

    public static Drawable wrap(Drawable drawable) {
        return j6.v5(drawable);
    }
}
