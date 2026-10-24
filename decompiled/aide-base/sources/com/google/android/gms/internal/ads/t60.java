package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class t60<K, V> extends LinkedHashMap<K, V> {
    private static final t60 mb;
    private boolean WB;

    static {
        t60 t60Var = new t60();
        mb = t60Var;
        t60Var.WB = false;
    }

    private t60() {
        this.WB = true;
    }

    public static <K, V> t60<K, V> Zo() {
        return mb;
    }

    private final void gn() {
        if (!this.WB) {
            throw new UnsupportedOperationException();
        }
    }

    private static int u7(Object obj) {
        if (obj instanceof byte[]) {
            return t50.DW((byte[]) obj);
        }
        if (obj instanceof u50) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public final void FH(t60<K, V> t60Var) {
        gn();
        if (t60Var.isEmpty()) {
            return;
        }
        putAll(t60Var);
    }

    public final void Hw() {
        this.WB = false;
    }

    public final t60<K, V> VH() {
        return isEmpty() ? new t60<>() : new t60<>(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        gn();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L59
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L16
        L14:
            r7 = 0
            goto L5a
        L16:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L35
            goto L14
        L35:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L52
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L52
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L56
        L52:
            boolean r3 = r4.equals(r3)
        L56:
            if (r3 != 0) goto L1e
            goto L14
        L59:
            r7 = 1
        L5a:
            if (r7 == 0) goto L5d
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t60.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iU7 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iU7 += u7(entry.getValue()) ^ u7(entry.getKey());
        }
        return iU7;
    }

    public final boolean j6() {
        return this.WB;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        gn();
        t50.j6(k);
        t50.j6(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        gn();
        for (K k : map.keySet()) {
            t50.j6(k);
            t50.j6(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        gn();
        return (V) super.remove(obj);
    }

    private t60(Map<K, V> map) {
        super(map);
        this.WB = true;
    }
}
