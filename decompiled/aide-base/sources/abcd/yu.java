package abcd;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.g;
import com.google.android.gms.common.internal.p;

/* loaded from: classes.dex */
public abstract class yu<T> {
    private T DW;
    private final String j6;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    public yu(String str) {
        this.j6 = str;
    }

    public final T DW(Context context) throws a {
        if (this.DW == null) {
            p.u7(context);
            Context contextFH = g.FH(context);
            if (contextFH == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.DW = j6((IBinder) contextFH.getClassLoader().loadClass(this.j6).newInstance());
            } catch (ClassNotFoundException e) {
                throw new a("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new a("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new a("Could not instantiate creator.", e3);
            }
        }
        return this.DW;
    }

    public abstract T j6(IBinder iBinder);
}
