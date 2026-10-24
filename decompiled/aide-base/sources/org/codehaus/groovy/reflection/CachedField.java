package org.codehaus.groovy.reflection;

import groovy.lang.MetaProperty;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class CachedField extends MetaProperty {
    public CachedField(Field field) {
        super(field.getName(), field.getType());
    }
}
