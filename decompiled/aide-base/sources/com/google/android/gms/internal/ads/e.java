package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public abstract class e<T> {
    private final String DW;
    private final T FH;
    private final int j6;

    private e(int i, String str, T t) {
        this.j6 = i;
        this.DW = str;
        this.FH = t;
        cw0.Hw().DW(this);
    }

    public static e<Float> FH(int i, String str, float f) {
        return new i(i, str, Float.valueOf(f));
    }

    public static e<Integer> Hw(int i, String str, int i2) {
        return new g(i, str, Integer.valueOf(i2));
    }

    public static e<String> VH(int i, String str, String str2) {
        return new j(i, str, str2);
    }

    public static e<Boolean> Zo(int i, String str, Boolean bool) {
        return new f(i, str, bool);
    }

    public static e<String> tp(int i, String str) {
        e<String> eVarVH = VH(i, str, null);
        cw0.Hw().FH(eVarVH);
        return eVarVH;
    }

    public static e<Long> v5(int i, String str, long j) {
        return new h(i, str, Long.valueOf(j));
    }

    public static e<String> we(int i, String str) {
        e<String> eVarVH = VH(i, str, null);
        cw0.Hw().Hw(eVarVH);
        return eVarVH;
    }

    public final int DW() {
        return this.j6;
    }

    protected abstract T EQ(JSONObject jSONObject);

    public final T J0() {
        return this.FH;
    }

    protected abstract T gn(SharedPreferences sharedPreferences);

    public final String j6() {
        return this.DW;
    }

    public abstract void u7(SharedPreferences.Editor editor, T t);

    /* synthetic */ e(int i, String str, Object obj, f fVar) {
        this(i, str, obj);
    }
}
