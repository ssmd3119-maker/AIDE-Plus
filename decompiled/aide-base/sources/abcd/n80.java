package abcd;

import java.lang.reflect.Field;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* loaded from: classes.dex */
public abstract class n80 {
    private Locale effectiveLocale;
    private ResourceBundle resourceBundle;

    public void j6(Locale locale) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        Class<?> cls = getClass();
        try {
            ResourceBundle bundle = ResourceBundle.getBundle(cls.getName(), locale);
            this.resourceBundle = bundle;
            this.effectiveLocale = bundle.getLocale();
            for (Field field : cls.getFields()) {
                if (field.getType().equals(String.class)) {
                    try {
                        field.set(this, this.resourceBundle.getString(field.getName()));
                    } catch (IllegalAccessException e) {
                        throw new Error(e);
                    } catch (IllegalArgumentException e2) {
                        throw new Error(e2);
                    } catch (MissingResourceException e3) {
                        throw new i50(cls, locale, field.getName(), e3);
                    }
                }
            }
        } catch (MissingResourceException e4) {
            throw new h50(cls, locale, e4);
        }
    }
}
