package abcd;

import abcd.wu;
import android.os.IBinder;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class xu<T> extends wu.a {
    private final T WB;

    private xu(T t) {
        this.WB = t;
    }

    public static <T> T g3(wu wuVar) {
        if (wuVar instanceof xu) {
            return ((xu) wuVar).WB;
        }
        IBinder iBinderAsBinder = wuVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    public static <T> wu sy(T t) {
        return new xu(t);
    }
}
