package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class sa0 {
    public static sa0 DW(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new na0(cls.getSimpleName()) : new pa0(cls.getSimpleName());
    }

    public abstract void j6(String str);
}
