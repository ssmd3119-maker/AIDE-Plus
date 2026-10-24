package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class i40 implements Serializable, Iterable<Byte> {
    private static final m40 jw;
    public static final i40 mb = new q40(t50.DW);
    private int WB = 0;

    static {
        j40 j40Var = null;
        jw = d40.j6() ? new r40(j40Var) : new k40(j40Var);
    }

    i40() {
    }

    static int Mr(int i, int i2, int i3) {
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

    static o40 QX(int i) {
        return new o40(i, null);
    }

    public static i40 a8(byte[] bArr, int i, int i2) {
        Mr(i, i + i2, bArr.length);
        return new q40(jw.j6(bArr, i, i2));
    }

    static i40 er(byte[] bArr) {
        return new q40(bArr);
    }

    public static i40 j3(String str) {
        return new q40(str.getBytes(t50.j6));
    }

    public static i40 lg(byte[] bArr) {
        return a8(bArr, 0, bArr.length);
    }

    protected abstract String DW(Charset charset);

    public abstract s40 EQ();

    abstract void Hw(h40 h40Var);

    protected final int J8() {
        return this.WB;
    }

    public final String VH() {
        return size() == 0 ? "" : DW(t50.j6);
    }

    public abstract byte Ws(int i);

    protected abstract int aM(int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    public abstract i40 gW(int i, int i2);

    public abstract boolean gn();

    public final int hashCode() {
        int iAM = this.WB;
        if (iAM == 0) {
            int size = size();
            iAM = aM(size, 0, size);
            if (iAM == 0) {
                iAM = 1;
            }
            this.WB = iAM;
        }
        return iAM;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new j40(this);
    }

    public final byte[] j6() {
        int size = size();
        if (size == 0) {
            return t50.DW;
        }
        byte[] bArr = new byte[size];
        v5(bArr, 0, 0, size);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    protected abstract void v5(byte[] bArr, int i, int i2, int i3);
}
