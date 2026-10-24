package com.google.android.gms.internal.measurement;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class k3 extends t2 {
    private static final Logger DW = Logger.getLogger(k3.class.getName());
    private static final boolean FH = a7.sG();
    m3 j6;

    static class a extends k3 {
        private final byte[] Hw;
        private int VH;
        private final int Zo;
        private final int v5;

        a(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.Hw = bArr;
            this.v5 = i;
            this.VH = i;
            this.Zo = i3;
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public void DW() {
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void EQ(int i, u2 u2Var) throws c {
            wc(i, 2);
            J8(u2Var);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void FH(byte[] bArr, int i, int i2) throws c {
            try {
                System.arraycopy(bArr, i, this.Hw, this.VH, i2);
                this.VH += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.VH), Integer.valueOf(this.Zo), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.k3
        final void J0(int i, l5 l5Var, c6 c6Var) throws c {
            wc(i, 2);
            m2 m2Var = (m2) l5Var;
            int iTp = m2Var.tp();
            if (iTp == -1) {
                iTp = c6Var.Zo(m2Var);
                m2Var.u7(iTp);
            }
            dx(iTp);
            c6Var.DW(l5Var, this.j6);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void J8(u2 u2Var) throws c {
            dx(u2Var.size());
            u2Var.Hw(this);
        }

        public final int Jl() {
            return this.VH - this.v5;
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void KD(int i, l5 l5Var) throws c {
            wc(1, 3);
            jO(2, i);
            we(3, l5Var);
            wc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final int Q6() {
            return this.Zo - this.VH;
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void QX(long j) throws c {
            if (k3.FH && Q6() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.Hw;
                    int i = this.VH;
                    this.VH = i + 1;
                    a7.u7(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.Hw;
                int i2 = this.VH;
                this.VH = i2 + 1;
                a7.u7(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.Hw;
                    int i3 = this.VH;
                    this.VH = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.VH), Integer.valueOf(this.Zo), 1), e);
                }
            }
            byte[] bArr4 = this.Hw;
            int i4 = this.VH;
            this.VH = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void SI(int i, u2 u2Var) throws c {
            wc(1, 3);
            jO(2, i);
            EQ(3, u2Var);
            wc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void Sf(int i) throws c {
            try {
                byte[] bArr = this.Hw;
                int i2 = this.VH;
                int i3 = i2 + 1;
                this.VH = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.Hw;
                int i4 = i3 + 1;
                this.VH = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.Hw;
                int i5 = i4 + 1;
                this.VH = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.Hw;
                this.VH = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.VH), Integer.valueOf(this.Zo), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void WB(int i, int i2) throws c {
            wc(i, 5);
            Sf(i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void aM(long j) throws c {
            try {
                byte[] bArr = this.Hw;
                int i = this.VH;
                int i2 = i + 1;
                this.VH = i2;
                bArr[i] = (byte) j;
                byte[] bArr2 = this.Hw;
                int i3 = i2 + 1;
                this.VH = i3;
                bArr2[i2] = (byte) (j >> 8);
                byte[] bArr3 = this.Hw;
                int i4 = i3 + 1;
                this.VH = i4;
                bArr3[i3] = (byte) (j >> 16);
                byte[] bArr4 = this.Hw;
                int i5 = i4 + 1;
                this.VH = i5;
                bArr4[i4] = (byte) (j >> 24);
                byte[] bArr5 = this.Hw;
                int i6 = i5 + 1;
                this.VH = i6;
                bArr5[i5] = (byte) (j >> 32);
                byte[] bArr6 = this.Hw;
                int i7 = i6 + 1;
                this.VH = i7;
                bArr6[i6] = (byte) (j >> 40);
                byte[] bArr7 = this.Hw;
                int i8 = i7 + 1;
                this.VH = i8;
                bArr7[i7] = (byte) (j >> 48);
                byte[] bArr8 = this.Hw;
                this.VH = i8 + 1;
                bArr8[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.VH), Integer.valueOf(this.Zo), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void aq(int i, int i2) throws c {
            wc(i, 0);
            lg(i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void cn(int i, boolean z) throws c {
            wc(i, 0);
            jJ(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void dx(int i) throws c {
            if (k3.FH && Q6() >= 10) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.Hw;
                    int i2 = this.VH;
                    this.VH = i2 + 1;
                    a7.u7(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.Hw;
                int i3 = this.VH;
                this.VH = i3 + 1;
                a7.u7(bArr2, i3, (byte) i);
                return;
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.Hw;
                    int i4 = this.VH;
                    this.VH = i4 + 1;
                    bArr3[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.VH), Integer.valueOf(this.Zo), 1), e);
                }
            }
            byte[] bArr4 = this.Hw;
            int i5 = this.VH;
            this.VH = i5 + 1;
            bArr4[i5] = (byte) i;
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void et(int i, long j) throws c {
            wc(i, 1);
            aM(j);
        }

        @Override // com.google.android.gms.internal.measurement.t2
        public final void j6(byte[] bArr, int i, int i2) throws c {
            FH(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void jJ(byte b) throws c {
            try {
                byte[] bArr = this.Hw;
                int i = this.VH;
                this.VH = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.VH), Integer.valueOf(this.Zo), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void jO(int i, int i2) throws c {
            wc(i, 0);
            dx(i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void lg(int i) throws c {
            if (i >= 0) {
                dx(i);
            } else {
                QX(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void mb(String str) throws c {
            int i = this.VH;
            try {
                int iMz = k3.Mz(str.length() * 3);
                int iMz2 = k3.Mz(str.length());
                if (iMz2 != iMz) {
                    dx(c7.j6(str));
                    this.VH = c7.DW(str, this.Hw, this.VH, Q6());
                    return;
                }
                int i2 = i + iMz2;
                this.VH = i2;
                int iDW = c7.DW(str, this.Hw, i2, Q6());
                this.VH = i;
                dx((iDW - i) - iMz2);
                this.VH = iDW;
            } catch (g7 e) {
                this.VH = i;
                Ws(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new c(e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void oY(byte[] bArr, int i, int i2) throws c {
            dx(i2);
            FH(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void ro(int i, String str) throws c {
            wc(i, 2);
            mb(str);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void sh(l5 l5Var) throws c {
            dx(l5Var.Zo());
            l5Var.FH(this);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void tp(int i, long j) throws c {
            wc(i, 0);
            QX(j);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void wc(int i, int i2) throws c {
            dx((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void we(int i, l5 l5Var) throws c {
            wc(i, 2);
            sh(l5Var);
        }
    }

    static final class b extends a {
        private final ByteBuffer gn;
        private int u7;

        b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.gn = byteBuffer;
            this.u7 = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.measurement.k3.a, com.google.android.gms.internal.measurement.k3
        public final void DW() {
            this.gn.position(this.u7 + Jl());
        }
    }

    public static class c extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        c(String str) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "));
        }

        c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        c(String str, Throwable th) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
        }
    }

    static final class d extends k3 {
        private final ByteBuffer Hw;
        private final ByteBuffer v5;

        d(ByteBuffer byteBuffer) {
            super();
            this.Hw = byteBuffer;
            this.v5 = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.position();
        }

        private final void iW(String str) throws c {
            try {
                c7.FH(str, this.v5);
            } catch (IndexOutOfBoundsException e) {
                throw new c(e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void DW() {
            this.Hw.position(this.v5.position());
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void EQ(int i, u2 u2Var) throws c {
            wc(i, 2);
            J8(u2Var);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void FH(byte[] bArr, int i, int i2) throws c {
            try {
                this.v5.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new c(e);
            } catch (BufferOverflowException e2) {
                throw new c(e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.k3
        final void J0(int i, l5 l5Var, c6 c6Var) throws c {
            wc(i, 2);
            Jl(l5Var, c6Var);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void J8(u2 u2Var) throws c {
            dx(u2Var.size());
            u2Var.Hw(this);
        }

        final void Jl(l5 l5Var, c6 c6Var) throws c {
            m2 m2Var = (m2) l5Var;
            int iTp = m2Var.tp();
            if (iTp == -1) {
                iTp = c6Var.Zo(m2Var);
                m2Var.u7(iTp);
            }
            dx(iTp);
            c6Var.DW(l5Var, this.j6);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void KD(int i, l5 l5Var) throws c {
            wc(1, 3);
            jO(2, i);
            we(3, l5Var);
            wc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final int Q6() {
            return this.v5.remaining();
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void QX(long j) throws c {
            while (((-128) & j) != 0) {
                try {
                    this.v5.put((byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new c(e);
                }
            }
            this.v5.put((byte) j);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void SI(int i, u2 u2Var) throws c {
            wc(1, 3);
            jO(2, i);
            EQ(3, u2Var);
            wc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void Sf(int i) throws c {
            try {
                this.v5.putInt(i);
            } catch (BufferOverflowException e) {
                throw new c(e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void WB(int i, int i2) throws c {
            wc(i, 5);
            Sf(i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void aM(long j) throws c {
            try {
                this.v5.putLong(j);
            } catch (BufferOverflowException e) {
                throw new c(e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void aq(int i, int i2) throws c {
            wc(i, 0);
            lg(i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void cn(int i, boolean z) throws c {
            wc(i, 0);
            jJ(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void dx(int i) throws c {
            while ((i & (-128)) != 0) {
                try {
                    this.v5.put((byte) ((i & 127) | 128));
                    i >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new c(e);
                }
            }
            this.v5.put((byte) i);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void et(int i, long j) throws c {
            wc(i, 1);
            aM(j);
        }

        @Override // com.google.android.gms.internal.measurement.t2
        public final void j6(byte[] bArr, int i, int i2) throws c {
            FH(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void jJ(byte b) throws c {
            try {
                this.v5.put(b);
            } catch (BufferOverflowException e) {
                throw new c(e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void jO(int i, int i2) throws c {
            wc(i, 0);
            dx(i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void lg(int i) throws c {
            if (i >= 0) {
                dx(i);
            } else {
                QX(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void mb(String str) throws c {
            int iPosition = this.v5.position();
            try {
                int iMz = k3.Mz(str.length() * 3);
                int iMz2 = k3.Mz(str.length());
                if (iMz2 != iMz) {
                    dx(c7.j6(str));
                    iW(str);
                    return;
                }
                int iPosition2 = this.v5.position() + iMz2;
                this.v5.position(iPosition2);
                iW(str);
                int iPosition3 = this.v5.position();
                this.v5.position(iPosition);
                dx(iPosition3 - iPosition2);
                this.v5.position(iPosition3);
            } catch (g7 e) {
                this.v5.position(iPosition);
                Ws(str, e);
            } catch (IllegalArgumentException e2) {
                throw new c(e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void oY(byte[] bArr, int i, int i2) throws c {
            dx(i2);
            FH(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void ro(int i, String str) throws c {
            wc(i, 2);
            mb(str);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void sh(l5 l5Var) throws c {
            dx(l5Var.Zo());
            l5Var.FH(this);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void tp(int i, long j) throws c {
            wc(i, 0);
            QX(j);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void wc(int i, int i2) throws c {
            dx((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void we(int i, l5 l5Var) throws c {
            wc(i, 2);
            sh(l5Var);
        }
    }

    static final class e extends k3 {
        private final ByteBuffer Hw;
        private final long VH;
        private final long Zo;
        private final long gn;
        private long tp;
        private final long u7;
        private final ByteBuffer v5;

        e(ByteBuffer byteBuffer) {
            super();
            this.Hw = byteBuffer;
            this.v5 = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jEQ = a7.EQ(byteBuffer);
            this.Zo = jEQ;
            this.VH = jEQ + byteBuffer.position();
            long jLimit = this.Zo + byteBuffer.limit();
            this.gn = jLimit;
            this.u7 = jLimit - 10;
            this.tp = this.VH;
        }

        private final void iW(long j) {
            this.v5.position((int) (j - this.Zo));
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void DW() {
            this.Hw.position((int) (this.tp - this.Zo));
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void EQ(int i, u2 u2Var) throws c {
            wc(i, 2);
            J8(u2Var);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void FH(byte[] bArr, int i, int i2) throws c {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = i2;
                long j2 = this.gn - j;
                long j3 = this.tp;
                if (j2 >= j3) {
                    a7.tp(bArr, i, j3, j);
                    this.tp += j;
                    return;
                }
            }
            if (bArr != null) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.tp), Long.valueOf(this.gn), Integer.valueOf(i2)));
            }
            throw new NullPointerException(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        final void J0(int i, l5 l5Var, c6 c6Var) throws c {
            wc(i, 2);
            Jl(l5Var, c6Var);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void J8(u2 u2Var) throws c {
            dx(u2Var.size());
            u2Var.Hw(this);
        }

        final void Jl(l5 l5Var, c6 c6Var) throws c {
            m2 m2Var = (m2) l5Var;
            int iTp = m2Var.tp();
            if (iTp == -1) {
                iTp = c6Var.Zo(m2Var);
                m2Var.u7(iTp);
            }
            dx(iTp);
            c6Var.DW(l5Var, this.j6);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void KD(int i, l5 l5Var) throws c {
            wc(1, 3);
            jO(2, i);
            we(3, l5Var);
            wc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final int Q6() {
            return (int) (this.gn - this.tp);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void QX(long j) throws c {
            if (this.tp <= this.u7) {
                while ((j & (-128)) != 0) {
                    long j2 = this.tp;
                    this.tp = j2 + 1;
                    a7.DW(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.tp;
                this.tp = 1 + j3;
                a7.DW(j3, (byte) j);
                return;
            }
            while (true) {
                long j4 = this.tp;
                if (j4 >= this.gn) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.tp), Long.valueOf(this.gn), 1));
                }
                if ((j & (-128)) == 0) {
                    this.tp = 1 + j4;
                    a7.DW(j4, (byte) j);
                    return;
                } else {
                    this.tp = j4 + 1;
                    a7.DW(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void SI(int i, u2 u2Var) throws c {
            wc(1, 3);
            jO(2, i);
            EQ(3, u2Var);
            wc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void Sf(int i) {
            this.v5.putInt((int) (this.tp - this.Zo), i);
            this.tp += 4;
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void WB(int i, int i2) throws c {
            wc(i, 5);
            Sf(i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void aM(long j) {
            this.v5.putLong((int) (this.tp - this.Zo), j);
            this.tp += 8;
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void aq(int i, int i2) throws c {
            wc(i, 0);
            lg(i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void cn(int i, boolean z) throws c {
            wc(i, 0);
            jJ(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void dx(int i) throws c {
            if (this.tp <= this.u7) {
                while ((i & (-128)) != 0) {
                    long j = this.tp;
                    this.tp = j + 1;
                    a7.DW(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.tp;
                this.tp = 1 + j2;
                a7.DW(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.tp;
                if (j3 >= this.gn) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.tp), Long.valueOf(this.gn), 1));
                }
                if ((i & (-128)) == 0) {
                    this.tp = 1 + j3;
                    a7.DW(j3, (byte) i);
                    return;
                } else {
                    this.tp = j3 + 1;
                    a7.DW(j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void et(int i, long j) throws c {
            wc(i, 1);
            aM(j);
        }

        @Override // com.google.android.gms.internal.measurement.t2
        public final void j6(byte[] bArr, int i, int i2) throws c {
            FH(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void jJ(byte b) throws c {
            long j = this.tp;
            if (j >= this.gn) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.tp), Long.valueOf(this.gn), 1));
            }
            this.tp = 1 + j;
            a7.DW(j, b);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void jO(int i, int i2) throws c {
            wc(i, 0);
            dx(i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void lg(int i) throws c {
            if (i >= 0) {
                dx(i);
            } else {
                QX(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void mb(String str) throws c {
            long j = this.tp;
            try {
                int iMz = k3.Mz(str.length() * 3);
                int iMz2 = k3.Mz(str.length());
                if (iMz2 != iMz) {
                    int iJ6 = c7.j6(str);
                    dx(iJ6);
                    iW(this.tp);
                    c7.FH(str, this.v5);
                    this.tp += iJ6;
                    return;
                }
                int i = ((int) (this.tp - this.Zo)) + iMz2;
                this.v5.position(i);
                c7.FH(str, this.v5);
                int iPosition = this.v5.position() - i;
                dx(iPosition);
                this.tp += iPosition;
            } catch (g7 e) {
                this.tp = j;
                iW(j);
                Ws(str, e);
            } catch (IllegalArgumentException e2) {
                throw new c(e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new c(e3);
            }
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void oY(byte[] bArr, int i, int i2) throws c {
            dx(i2);
            FH(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void ro(int i, String str) throws c {
            wc(i, 2);
            mb(str);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void sh(l5 l5Var) throws c {
            dx(l5Var.Zo());
            l5Var.FH(this);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void tp(int i, long j) throws c {
            wc(i, 0);
            QX(j);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void wc(int i, int i2) throws c {
            dx((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.k3
        public final void we(int i, l5 l5Var) throws c {
            wc(i, 2);
            sh(l5Var);
        }
    }

    private k3() {
    }

    public static k3 AL(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    static int BT(int i, l5 l5Var, c6 c6Var) {
        return vJ(i) + P8(l5Var, c6Var);
    }

    public static int CU(int i, long j) {
        return vJ(i) + Mr(j);
    }

    public static int Eq(int i, l5 l5Var) {
        return (vJ(1) << 1) + k2(2, i) + br(3, l5Var);
    }

    public static int FN(int i, long j) {
        return vJ(i) + Mr(j);
    }

    public static int Hw(int i, s4 s4Var) {
        int iVJ = vJ(i);
        int iHw = s4Var.Hw();
        return iVJ + Mz(iHw) + iHw;
    }

    public static int I(int i) {
        return Mz(sy(i));
    }

    public static int Mr(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int Mz(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int OW(int i, u2 u2Var) {
        int iVJ = vJ(i);
        int size = u2Var.size();
        return iVJ + Mz(size) + size;
    }

    static int P8(l5 l5Var, c6 c6Var) {
        m2 m2Var = (m2) l5Var;
        int iTp = m2Var.tp();
        if (iTp == -1) {
            iTp = c6Var.Zo(m2Var);
            m2Var.u7(iTp);
        }
        return Mz(iTp) + iTp;
    }

    public static int Qq(int i) {
        return g3(i);
    }

    public static int U2(long j) {
        return Mr(sG(j));
    }

    public static int XG(l5 l5Var) {
        int iZo = l5Var.Zo();
        return Mz(iZo) + iZo;
    }

    @Deprecated
    static int XX(int i, l5 l5Var, c6 c6Var) {
        int iVJ = vJ(i) << 1;
        m2 m2Var = (m2) l5Var;
        int iTp = m2Var.tp();
        if (iTp == -1) {
            iTp = c6Var.Zo(m2Var);
            m2Var.u7(iTp);
        }
        return iVJ + iTp;
    }

    public static int Xa(int i, u2 u2Var) {
        return (vJ(1) << 1) + k2(2, i) + OW(3, u2Var);
    }

    public static k3 Zo(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return a7.ef() ? new e(byteBuffer) : new d(byteBuffer);
    }

    public static int a8(long j) {
        return 8;
    }

    @Deprecated
    public static int aj(int i) {
        return Mz(i);
    }

    public static int br(int i, l5 l5Var) {
        return vJ(i) + XG(l5Var);
    }

    public static int cT(int i, int i2) {
        return vJ(i) + 4;
    }

    public static int ca(int i) {
        return 4;
    }

    public static int cb(long j) {
        return 8;
    }

    public static int er(int i, double d2) {
        return vJ(i) + 8;
    }

    public static int fY(int i, int i2) {
        return vJ(i) + g3(i2);
    }

    public static int g3(int i) {
        if (i >= 0) {
            return Mz(i);
        }
        return 10;
    }

    public static int gW(int i, s4 s4Var) {
        return (vJ(1) << 1) + k2(2, i) + Hw(3, s4Var);
    }

    public static int hK(byte[] bArr) {
        int length = bArr.length;
        return Mz(length) + length;
    }

    @Deprecated
    public static int hz(l5 l5Var) {
        return l5Var.Zo();
    }

    public static int j3(long j) {
        return Mr(j);
    }

    public static int jw(String str) {
        int length;
        try {
            length = c7.j6(str);
        } catch (g7 unused) {
            length = str.getBytes(g4.j6).length;
        }
        return Mz(length) + length;
    }

    public static int k2(int i, int i2) {
        return vJ(i) + Mz(i2);
    }

    public static int kQ(int i, String str) {
        return vJ(i) + jw(str);
    }

    public static int ko(int i, long j) {
        return vJ(i) + Mr(sG(j));
    }

    public static int lp(double d2) {
        return 8;
    }

    public static int n5(boolean z) {
        return 1;
    }

    public static int q7(int i, int i2) {
        return vJ(i) + g3(i2);
    }

    public static int qp(int i, long j) {
        return vJ(i) + 8;
    }

    public static int rN(float f) {
        return 4;
    }

    private static long sG(long j) {
        return (j >> 63) ^ (j << 1);
    }

    private static int sy(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int v5(s4 s4Var) {
        int iHw = s4Var.Hw();
        return Mz(iHw) + iHw;
    }

    public static int vJ(int i) {
        return Mz(i << 3);
    }

    public static int vy(u2 u2Var) {
        int size = u2Var.size();
        return Mz(size) + size;
    }

    public static int w9(int i, int i2) {
        return vJ(i) + 4;
    }

    public static int x9(int i) {
        return 4;
    }

    public static int yO(int i, boolean z) {
        return vJ(i) + 1;
    }

    public static int yS(int i, float f) {
        return vJ(i) + 4;
    }

    public static int ye(int i, long j) {
        return vJ(i) + 8;
    }

    public static int zh(int i, int i2) {
        return vJ(i) + Mz(sy(i2));
    }

    public abstract void DW();

    public abstract void EQ(int i, u2 u2Var);

    public final void Ev(int i, int i2) {
        jO(i, sy(i2));
    }

    public abstract void FH(byte[] bArr, int i, int i2);

    abstract void J0(int i, l5 l5Var, c6 c6Var);

    public abstract void J8(u2 u2Var);

    public abstract void KD(int i, l5 l5Var);

    public abstract int Q6();

    public abstract void QX(long j);

    public abstract void SI(int i, u2 u2Var);

    public abstract void Sf(int i);

    public final void VH(float f) {
        Sf(Float.floatToRawIntBits(f));
    }

    public abstract void WB(int i, int i2);

    final void Ws(String str, g7 g7Var) throws c {
        DW.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) g7Var);
        byte[] bytes = str.getBytes(g4.j6);
        try {
            dx(bytes.length);
            j6(bytes, 0, bytes.length);
        } catch (c e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new c(e3);
        }
    }

    public final void XL(long j) {
        QX(sG(j));
    }

    public final void Z1(boolean z) {
        jJ(z ? (byte) 1 : (byte) 0);
    }

    public abstract void aM(long j);

    public abstract void aq(int i, int i2);

    public abstract void cn(int i, boolean z);

    public abstract void dx(int i);

    public final void ef(int i) {
        dx(sy(i));
    }

    public final void ei(double d2) {
        aM(Double.doubleToRawLongBits(d2));
    }

    public abstract void et(int i, long j);

    public final void gn(int i, double d2) {
        et(i, Double.doubleToRawLongBits(d2));
    }

    public abstract void jJ(byte b2);

    public abstract void jO(int i, int i2);

    public abstract void lg(int i);

    public abstract void mb(String str);

    public final void nw(int i, long j) {
        tp(i, sG(j));
    }

    abstract void oY(byte[] bArr, int i, int i2);

    public abstract void ro(int i, String str);

    public abstract void sh(l5 l5Var);

    public abstract void tp(int i, long j);

    public final void u7(int i, float f) {
        WB(i, Float.floatToRawIntBits(f));
    }

    public abstract void wc(int i, int i2);

    public abstract void we(int i, l5 l5Var);
}
