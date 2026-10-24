package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class c8 {
    public static final int[] j6 = new int[0];
    public static final long[] DW = new long[0];
    public static final String[] FH = new String[0];
    public static final byte[] Hw = new byte[0];

    public static final int j6(q7 q7Var, int i) throws y7 {
        int iJ6 = q7Var.j6();
        q7Var.Zo(i);
        int i2 = 1;
        while (q7Var.J8() == i) {
            q7Var.Zo(i);
            i2++;
        }
        q7Var.J0(iJ6, i);
        return i2;
    }
}
