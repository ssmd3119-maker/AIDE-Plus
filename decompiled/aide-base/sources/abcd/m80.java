package abcd;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class m80 {
    private static final InheritableThreadLocal<m80> FH;
    private final ConcurrentHashMap<Class, n80> DW;
    private final Locale j6;

    class a extends InheritableThreadLocal<m80> {
        @Override // java.lang.ThreadLocal
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public m80 initialValue() {
            return new m80(Locale.getDefault(), null);
        }
    }

    static {
        new Locale("", "", "");
        FH = new a();
    }

    private m80(Locale locale) {
        this.DW = new ConcurrentHashMap<>();
        this.j6 = locale;
    }

    public static <T extends n80> T DW(Class<T> cls) {
        return (T) FH.get().j6(cls);
    }

    private <T extends n80> T j6(Class<T> cls) {
        T t = (T) this.DW.get(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) l80.j6(this.j6, cls);
        T t3 = (T) this.DW.putIfAbsent(cls, t2);
        return t3 != null ? t3 : t2;
    }

    public /* synthetic */ m80(Locale locale, m80 m80Var) {
        this(locale);
    }
}
