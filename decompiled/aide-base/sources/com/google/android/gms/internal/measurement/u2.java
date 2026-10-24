package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class u2 implements Serializable, Iterable<Byte> {
    private static final z2 jw;
    public static final u2 mb = new d3(g4.DW);
    private int WB = 0;

    static {
        v2 v2Var = null;
        jw = r2.DW() ? new e3(v2Var) : new x2(v2Var);
    }

    u2() {
    }

    static int EQ(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static u2 QX(String str) {
        return new d3(str.getBytes(g4.j6));
    }

    public static u2 Ws(byte[] bArr, int i, int i2) {
        EQ(i, i + i2, bArr.length);
        return new d3(jw.j6(bArr, i, i2));
    }

    static u2 aM(byte[] bArr) {
        return new d3(bArr);
    }

    static b3 gn(int i) {
        return new b3(i, null);
    }

    protected abstract String DW(Charset charset);

    abstract void Hw(t2 t2Var);

    public abstract u2 J8(int i, int i2);

    public abstract boolean Mr();

    abstract byte VH(int i);

    protected final int a8() {
        return this.WB;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iJ6 = this.WB;
        if (iJ6 == 0) {
            int size = size();
            iJ6 = j6(size, 0, size);
            if (iJ6 == 0) {
                iJ6 = 1;
            }
            this.WB = iJ6;
        }
        return iJ6;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new v2(this);
    }

    public final String j3() {
        return size() == 0 ? "" : DW(g4.j6);
    }

    protected abstract int j6(int i, int i2, int i3);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract byte v5(int i);
}
