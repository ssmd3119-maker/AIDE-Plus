package com.google.android.gms.common.util;

import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class f {
    @Deprecated
    public static <T> List<T> DW(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    public static <T> List<T> FH(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : DW(tArr[0]) : j6();
    }

    public static <K, V> Map<K, V> Hw(K k, V v, K k2, V v2, K k3, V v3) {
        Map mapU7 = u7(3, false);
        mapU7.put(k, v);
        mapU7.put(k2, v2);
        mapU7.put(k3, v3);
        return Collections.unmodifiableMap(mapU7);
    }

    @Deprecated
    public static <T> Set<T> VH(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            Set setGn = gn(2, false);
            setGn.add(t);
            setGn.add(t2);
            return Collections.unmodifiableSet(setGn);
        }
        if (length == 3) {
            return Zo(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setGn2 = gn(tArr.length, false);
            Collections.addAll(setGn2, tArr);
            return Collections.unmodifiableSet(setGn2);
        }
        T t3 = tArr[0];
        T t4 = tArr[1];
        T t5 = tArr[2];
        T t6 = tArr[3];
        Set setGn3 = gn(4, false);
        setGn3.add(t3);
        setGn3.add(t4);
        setGn3.add(t5);
        setGn3.add(t6);
        return Collections.unmodifiableSet(setGn3);
    }

    @Deprecated
    public static <T> Set<T> Zo(T t, T t2, T t3) {
        Set setGn = gn(3, false);
        setGn.add(t);
        setGn.add(t2);
        setGn.add(t3);
        return Collections.unmodifiableSet(setGn);
    }

    private static <T> Set<T> gn(int i, boolean z) {
        return i <= (z ? 128 : 256) ? new ArraySet(i) : new HashSet(i, z ? 0.75f : 1.0f);
    }

    @Deprecated
    public static <T> List<T> j6() {
        return Collections.emptyList();
    }

    private static <K, V> Map<K, V> u7(int i, boolean z) {
        return i <= 256 ? new ArrayMap(i) : new HashMap(i, 1.0f);
    }

    public static <K, V> Map<K, V> v5(K[] kArr, V[] vArr) {
        if (kArr.length != vArr.length) {
            int length = kArr.length;
            int length2 = vArr.length;
            StringBuilder sb = new StringBuilder(66);
            sb.append("Key and values array lengths not equal: ");
            sb.append(length);
            sb.append(" != ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int length3 = kArr.length;
        if (length3 == 0) {
            return Collections.emptyMap();
        }
        if (length3 == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapU7 = u7(kArr.length, false);
        for (int i = 0; i < kArr.length; i++) {
            mapU7.put(kArr[i], vArr[i]);
        }
        return Collections.unmodifiableMap(mapU7);
    }
}
