package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
public final class m6<K, V> implements Comparable<m6>, Map.Entry<K, V> {

    /* JADX INFO: Incorrect field signature: TK; */
    private final Comparable WB;
    private final /* synthetic */ f6 jw;
    private V mb;

    m6(f6 f6Var, Map.Entry<K, V> entry) {
        this(f6Var, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean j6(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(m6 m6Var) {
        return ((Comparable) getKey()).compareTo((Comparable) m6Var.getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return j6(this.WB, entry.getKey()) && j6(this.mb, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.WB;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.mb;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.WB;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.mb;
        return iHashCode ^ (v != null ? v.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.jw.QX();
        V v2 = this.mb;
        this.mb = v;
        return v2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.WB);
        String strValueOf2 = String.valueOf(this.mb);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(strValueOf2).length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    m6(f6 f6Var, K k, V v) {
        this.jw = f6Var;
        this.WB = k;
        this.mb = v;
    }
}
