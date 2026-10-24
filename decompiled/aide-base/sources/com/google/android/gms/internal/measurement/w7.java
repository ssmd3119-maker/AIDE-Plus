package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class w7 implements Cloneable {
    private u7<?, ?> WB;
    private List<b8> jw = new ArrayList();
    private Object mb;

    w7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VH, reason: merged with bridge method [inline-methods] */
    public final w7 clone() {
        w7 w7Var = new w7();
        try {
            w7Var.WB = this.WB;
            if (this.jw == null) {
                w7Var.jw = null;
            } else {
                w7Var.jw.addAll(this.jw);
            }
            if (this.mb != null) {
                if (this.mb instanceof z7) {
                    w7Var.mb = (z7) ((z7) this.mb).clone();
                } else if (this.mb instanceof byte[]) {
                    w7Var.mb = ((byte[]) this.mb).clone();
                } else {
                    int i = 0;
                    if (this.mb instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.mb;
                        byte[][] bArr2 = new byte[bArr.length][];
                        w7Var.mb = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.mb instanceof boolean[]) {
                        w7Var.mb = ((boolean[]) this.mb).clone();
                    } else if (this.mb instanceof int[]) {
                        w7Var.mb = ((int[]) this.mb).clone();
                    } else if (this.mb instanceof long[]) {
                        w7Var.mb = ((long[]) this.mb).clone();
                    } else if (this.mb instanceof float[]) {
                        w7Var.mb = ((float[]) this.mb).clone();
                    } else if (this.mb instanceof double[]) {
                        w7Var.mb = ((double[]) this.mb).clone();
                    } else if (this.mb instanceof z7[]) {
                        z7[] z7VarArr = (z7[]) this.mb;
                        z7[] z7VarArr2 = new z7[z7VarArr.length];
                        w7Var.mb = z7VarArr2;
                        while (i < z7VarArr.length) {
                            z7VarArr2[i] = (z7) z7VarArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return w7Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    private final byte[] j6() throws s7, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        byte[] bArr = new byte[Zo()];
        FH(r7.gW(bArr));
        return bArr;
    }

    final void FH(r7 r7Var) throws s7, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        Object obj = this.mb;
        if (obj == null) {
            for (b8 b8Var : this.jw) {
                r7Var.aM(b8Var.j6);
                r7Var.BT(b8Var.DW);
            }
            return;
        }
        u7<?, ?> u7Var = this.WB;
        if (!u7Var.DW) {
            u7Var.j6(obj, r7Var);
            throw null;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                u7Var.j6(obj2, r7Var);
                throw null;
            }
        }
    }

    final void Hw(b8 b8Var) throws y7 {
        List<b8> list = this.jw;
        if (list != null) {
            list.add(b8Var);
            return;
        }
        Object obj = this.mb;
        if (obj instanceof z7) {
            byte[] bArr = b8Var.DW;
            q7 q7VarEQ = q7.EQ(bArr, 0, bArr.length);
            int iQX = q7VarEQ.QX();
            if (iQX != bArr.length - r7.EQ(iQX)) {
                throw y7.j6();
            }
            z7 z7VarJ6 = ((z7) this.mb).j6(q7VarEQ);
            this.WB = this.WB;
            this.mb = z7VarJ6;
            this.jw = null;
            return;
        }
        if (obj instanceof z7[]) {
            this.WB.DW(Collections.singletonList(b8Var));
            throw null;
        }
        if (obj instanceof l5) {
            this.WB.DW(Collections.singletonList(b8Var));
            throw null;
        }
        if (obj instanceof l5[]) {
            this.WB.DW(Collections.singletonList(b8Var));
            throw null;
        }
        this.WB.DW(Collections.singletonList(b8Var));
        throw null;
    }

    final int Zo() throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        Object obj = this.mb;
        if (obj == null) {
            int iJ8 = 0;
            for (b8 b8Var : this.jw) {
                iJ8 += r7.J8(b8Var.j6) + 0 + b8Var.DW.length;
            }
            return iJ8;
        }
        u7<?, ?> u7Var = this.WB;
        if (!u7Var.DW) {
            u7Var.FH(obj);
            throw null;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                u7Var.FH(obj2);
                throw null;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        List<b8> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        if (this.mb == null || w7Var.mb == null) {
            List<b8> list2 = this.jw;
            if (list2 != null && (list = w7Var.jw) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(j6(), w7Var.j6());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        u7<?, ?> u7Var = this.WB;
        if (u7Var != w7Var.WB) {
            return false;
        }
        if (!u7Var.j6.isArray()) {
            return this.mb.equals(w7Var.mb);
        }
        Object obj2 = this.mb;
        return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) w7Var.mb) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) w7Var.mb) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) w7Var.mb) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) w7Var.mb) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) w7Var.mb) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) w7Var.mb) : Arrays.deepEquals((Object[]) obj2, (Object[]) w7Var.mb);
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(j6()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
