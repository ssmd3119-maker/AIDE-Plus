package org.codehaus.groovy.tools.gse;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class StringSetMap extends LinkedHashMap<String, Set<String>> {
    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public Set<String> get(Object obj) {
        String str = (String) obj;
        Set<String> set = (Set) super.get(str);
        if (set != null) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        put(str, linkedHashSet);
        return linkedHashSet;
    }
}
