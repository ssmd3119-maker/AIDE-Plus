package abcd;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface wu extends IInterface {

    public static abstract class a extends lv implements wu {

        /* renamed from: abcd.wu$a$a, reason: collision with other inner class name */
        public static class C0016a extends kv implements wu {
            public C0016a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static wu dx(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof wu ? (wu) iInterfaceQueryLocalInterface : new C0016a(iBinder);
        }
    }
}
