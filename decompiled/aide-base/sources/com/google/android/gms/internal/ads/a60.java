package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum a60 {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(i40.class, i40.class, i40.mb),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);

    private final Class<?> WB;
    private final Object mb;

    a60(Class cls, Class cls2, Object obj) {
        this.WB = cls2;
        this.mb = obj;
    }

    public final Class<?> j6() {
        return this.WB;
    }
}
