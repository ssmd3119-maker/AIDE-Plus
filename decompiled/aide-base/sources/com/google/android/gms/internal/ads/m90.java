package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m90 implements Cloneable {
    private k90<?, ?> WB;
    private List<s90> jw = new ArrayList();
    private Object mb;

    m90() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Zo, reason: merged with bridge method [inline-methods] */
    public final m90 clone() {
        m90 m90Var = new m90();
        try {
            m90Var.WB = this.WB;
            if (this.jw == null) {
                m90Var.jw = null;
            } else {
                m90Var.jw.addAll(this.jw);
            }
            if (this.mb != null) {
                if (this.mb instanceof p90) {
                    m90Var.mb = (p90) ((p90) this.mb).clone();
                } else if (this.mb instanceof byte[]) {
                    m90Var.mb = ((byte[]) this.mb).clone();
                } else {
                    int i = 0;
                    if (this.mb instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.mb;
                        byte[][] bArr2 = new byte[bArr.length][];
                        m90Var.mb = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.mb instanceof boolean[]) {
                        m90Var.mb = ((boolean[]) this.mb).clone();
                    } else if (this.mb instanceof int[]) {
                        m90Var.mb = ((int[]) this.mb).clone();
                    } else if (this.mb instanceof long[]) {
                        m90Var.mb = ((long[]) this.mb).clone();
                    } else if (this.mb instanceof float[]) {
                        m90Var.mb = ((float[]) this.mb).clone();
                    } else if (this.mb instanceof double[]) {
                        m90Var.mb = ((double[]) this.mb).clone();
                    } else if (this.mb instanceof p90[]) {
                        p90[] p90VarArr = (p90[]) this.mb;
                        p90[] p90VarArr2 = new p90[p90VarArr.length];
                        m90Var.mb = p90VarArr2;
                        while (i < p90VarArr.length) {
                            p90VarArr2[i] = (p90) p90VarArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return m90Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    private final byte[] j6() throws i90 {
        byte[] bArr = new byte[VH()];
        FH(h90.gW(bArr));
        return bArr;
    }

    final void FH(h90 h90Var) throws i90 {
        if (this.mb != null) {
            throw new NoSuchMethodError();
        }
        for (s90 s90Var : this.jw) {
            h90Var.aM(s90Var.j6);
            h90Var.P8(s90Var.DW);
        }
    }

    final void Hw(s90 s90Var) throws o90 {
        List<s90> list = this.jw;
        if (list != null) {
            list.add(s90Var);
            return;
        }
        Object obj = this.mb;
        if (!(obj instanceof p90)) {
            if (obj instanceof p90[]) {
                Collections.singletonList(s90Var);
                throw new NoSuchMethodError();
            }
            Collections.singletonList(s90Var);
            throw new NoSuchMethodError();
        }
        byte[] bArr = s90Var.DW;
        g90 g90VarLg = g90.lg(bArr, 0, bArr.length);
        int iTp = g90VarLg.tp();
        if (iTp != bArr.length - h90.J0(iTp)) {
            throw o90.j6();
        }
        p90 p90VarJ6 = ((p90) this.mb).j6(g90VarLg);
        this.WB = this.WB;
        this.mb = p90VarJ6;
        this.jw = null;
    }

    final int VH() {
        if (this.mb != null) {
            throw new NoSuchMethodError();
        }
        int iJ8 = 0;
        for (s90 s90Var : this.jw) {
            iJ8 += h90.J8(s90Var.j6) + 0 + s90Var.DW.length;
        }
        return iJ8;
    }

    public final boolean equals(Object obj) {
        List<s90> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m90)) {
            return false;
        }
        m90 m90Var = (m90) obj;
        if (this.mb == null || m90Var.mb == null) {
            List<s90> list2 = this.jw;
            if (list2 != null && (list = m90Var.jw) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(j6(), m90Var.j6());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        k90<?, ?> k90Var = this.WB;
        if (k90Var != m90Var.WB) {
            return false;
        }
        if (!k90Var.j6.isArray()) {
            return this.mb.equals(m90Var.mb);
        }
        Object obj2 = this.mb;
        return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) m90Var.mb) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) m90Var.mb) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) m90Var.mb) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) m90Var.mb) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) m90Var.mb) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) m90Var.mb) : Arrays.deepEquals((Object[]) obj2, (Object[]) m90Var.mb);
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(j6()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
