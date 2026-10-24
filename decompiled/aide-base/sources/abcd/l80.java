package abcd;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class l80 {
    private static final Map<Locale, Map<Class, n80>> j6 = new HashMap();

    public static synchronized <T extends n80> T j6(Locale locale, Class<T> cls) {
        T tNewInstance;
        try {
            Map<Class, n80> map = j6.get(locale);
            if (map == null) {
                map = new HashMap<>();
                j6.put(locale, map);
            }
            tNewInstance = (T) map.get(cls);
            if (tNewInstance == null) {
                tNewInstance = cls.newInstance();
                tNewInstance.j6(locale);
                map.put(cls, tNewInstance);
            }
        } catch (IllegalAccessException e) {
            throw new Error(e);
        } catch (InstantiationException e2) {
            throw new Error(e2);
        }
        return tNewInstance;
    }
}
