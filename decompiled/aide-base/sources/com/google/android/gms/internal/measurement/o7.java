package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public enum o7 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(u2.mb),
    ENUM(null),
    MESSAGE(null);

    private final Object WB;

    o7(Object obj) {
        this.WB = obj;
    }
}
