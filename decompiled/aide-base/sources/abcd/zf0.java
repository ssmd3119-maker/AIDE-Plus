package abcd;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class zf0 extends xf0 {
    private static final Method Hw = aM(File.class, "canExecute", new Class[0]);
    private static final Method v5 = aM(File.class, "setExecutable", Boolean.TYPE);

    public static boolean XL() {
        return (Hw == null || v5 == null) ? false : true;
    }

    private static Method aM(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException | SecurityException unused) {
            return null;
        }
    }

    @Override // abcd.wf0
    public boolean EQ(File file, boolean z) {
        try {
            return ((Boolean) v5.invoke(file, Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException e) {
            throw new Error(e);
        } catch (IllegalArgumentException e2) {
            throw new Error(e2);
        } catch (InvocationTargetException e3) {
            throw new Error(e3);
        }
    }

    @Override // abcd.wf0
    public boolean J0() {
        return true;
    }

    @Override // abcd.wf0
    public boolean gn() {
        return false;
    }

    @Override // abcd.wf0
    public boolean j6(File file) {
        try {
            return ((Boolean) Hw.invoke(file, null)).booleanValue();
        } catch (IllegalAccessException e) {
            throw new Error(e);
        } catch (IllegalArgumentException e2) {
            throw new Error(e2);
        } catch (InvocationTargetException e3) {
            throw new Error(e3);
        }
    }
}
