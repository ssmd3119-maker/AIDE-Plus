package androidx.core.view;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class c {
    private static boolean DW;
    static final b FH;
    private static Field j6;

    static class a extends b {
        a() {
        }

        @Override // androidx.core.view.c.b
        public void j6(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
        }
    }

    static class b {
        b() {
        }

        public void j6(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            layoutInflater.setFactory2(factory2);
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                c.j6(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                c.j6(layoutInflater, factory2);
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            FH = new a();
        } else {
            FH = new b();
        }
    }

    public static void DW(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        FH.j6(layoutInflater, factory2);
    }

    static void j6(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (!DW) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                j6 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            DW = true;
        }
        Field field = j6;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }
}
