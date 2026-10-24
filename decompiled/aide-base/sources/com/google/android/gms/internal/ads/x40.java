package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class x40 extends h40 {
    private static final Logger DW = Logger.getLogger(x40.class.getName());
    private static final boolean FH = q80.we();
    z40 j6;

    static class a extends x40 {
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

        @Override // com.google.android.gms.internal.ads.x40
        public void DW() {
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void Ev(int i, boolean z) throws c {
            q7(i, 0);
            ca(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void FH(byte[] bArr, int i, int i2) throws c {
            try {
                System.arraycopy(bArr, i, this.Hw, this.VH, i2);
                this.VH += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.VH), Integer.valueOf(this.Zo), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void OW(int i) throws c {
            if (x40.FH && QX() >= 10) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.Hw;
                    int i2 = this.VH;
                    this.VH = i2 + 1;
                    q80.u7(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.Hw;
                int i3 = this.VH;
                this.VH = i3 + 1;
                q80.u7(bArr2, i3, (byte) i);
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

        @Override // com.google.android.gms.internal.ads.x40
        public final void P8(int i, z60 z60Var) throws c {
            q7(1, 3);
            n5(2, i);
            gn(3, z60Var);
            q7(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final int QX() {
            return this.Zo - this.VH;
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void Qq(int i) throws c {
            if (i >= 0) {
                OW(i);
            } else {
                U2(i);
            }
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void U2(long j) throws c {
            if (x40.FH && QX() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.Hw;
                    int i = this.VH;
                    this.VH = i + 1;
                    q80.u7(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.Hw;
                int i2 = this.VH;
                this.VH = i2 + 1;
                q80.u7(bArr2, i2, (byte) j);
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

        @Override // com.google.android.gms.internal.ads.x40
        public final void VH(int i, i40 i40Var) throws c {
            q7(i, 2);
            j3(i40Var);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void XX(int i) throws c {
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

        @Override // com.google.android.gms.internal.ads.x40
        public final void Z1(int i, int i2) throws c {
            q7(i, 0);
            Qq(i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void ca(byte b) throws c {
            try {
                byte[] bArr = this.Hw;
                int i = this.VH;
                this.VH = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.VH), Integer.valueOf(this.Zo), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void ei(long j) throws c {
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

        @Override // com.google.android.gms.internal.ads.x40
        public final void gn(int i, z60 z60Var) throws c {
            q7(i, 2);
            x9(z60Var);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void hz(String str) throws c {
            int i = this.VH;
            try {
                int iXG = x40.XG(str.length() * 3);
                int iXG2 = x40.XG(str.length());
                if (iXG2 != iXG) {
                    OW(s80.j6(str));
                    this.VH = s80.DW(str, this.Hw, this.VH, QX());
                    return;
                }
                int i2 = i + iXG2;
                this.VH = i2;
                int iDW = s80.DW(str, this.Hw, i2, QX());
                this.VH = i;
                OW((iDW - i) - iXG2);
                this.VH = iDW;
            } catch (w80 e) {
                this.VH = i;
                tp(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new c(e2);
            }
        }

        public final int iW() {
            return this.VH - this.v5;
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void j3(i40 i40Var) throws c {
            OW(i40Var.size());
            i40Var.Hw(this);
        }

        @Override // com.google.android.gms.internal.ads.h40
        public final void j6(byte[] bArr, int i, int i2) throws c {
            FH(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void jw(byte[] bArr, int i, int i2) throws c {
            OW(i2);
            FH(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void kf(int i, int i2) throws c {
            q7(i, 5);
            XX(i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void ko(int i, long j) throws c {
            q7(i, 0);
            U2(j);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void lp(int i, String str) throws c {
            q7(i, 2);
            hz(str);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void mb(int i, long j) throws c {
            q7(i, 1);
            ei(j);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void n5(int i, int i2) throws c {
            q7(i, 0);
            OW(i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void q7(int i, int i2) throws c {
            OW((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        final void u7(int i, z60 z60Var, r70 r70Var) throws c {
            q7(i, 2);
            z30 z30Var = (z30) z60Var;
            int iDW = z30Var.DW();
            if (iDW == -1) {
                iDW = r70Var.FH(z30Var);
                z30Var.v5(iDW);
            }
            OW(iDW);
            r70Var.EQ(z60Var, this.j6);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void vy(int i, i40 i40Var) throws c {
            q7(1, 3);
            n5(2, i);
            VH(3, i40Var);
            q7(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void x9(z60 z60Var) throws c {
            OW(z60Var.u7());
            z60Var.VH(this);
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

        @Override // com.google.android.gms.internal.ads.x40.a, com.google.android.gms.internal.ads.x40
        public final void DW() {
            this.gn.position(this.u7 + iW());
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

    static final class d extends x40 {
        private final ByteBuffer Hw;
        private final ByteBuffer v5;

        d(ByteBuffer byteBuffer) {
            super();
            this.Hw = byteBuffer;
            this.v5 = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.position();
        }

        private final void eU(String str) throws c {
            try {
                s80.FH(str, this.v5);
            } catch (IndexOutOfBoundsException e) {
                throw new c(e);
            }
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void DW() {
            this.Hw.position(this.v5.position());
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void Ev(int i, boolean z) throws c {
            q7(i, 0);
            ca(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void FH(byte[] bArr, int i, int i2) throws c {
            try {
                this.v5.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new c(e);
            } catch (BufferOverflowException e2) {
                throw new c(e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void OW(int i) throws c {
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

        @Override // com.google.android.gms.internal.ads.x40
        public final void P8(int i, z60 z60Var) throws c {
            q7(1, 3);
            n5(2, i);
            gn(3, z60Var);
            q7(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final int QX() {
            return this.v5.remaining();
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void Qq(int i) throws c {
            if (i >= 0) {
                OW(i);
            } else {
                U2(i);
            }
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void U2(long j) throws c {
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

        @Override // com.google.android.gms.internal.ads.x40
        public final void VH(int i, i40 i40Var) throws c {
            q7(i, 2);
            j3(i40Var);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void XX(int i) throws c {
            try {
                this.v5.putInt(i);
            } catch (BufferOverflowException e) {
                throw new c(e);
            }
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void Z1(int i, int i2) throws c {
            q7(i, 0);
            Qq(i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void ca(byte b) throws c {
            try {
                this.v5.put(b);
            } catch (BufferOverflowException e) {
                throw new c(e);
            }
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void ei(long j) throws c {
            try {
                this.v5.putLong(j);
            } catch (BufferOverflowException e) {
                throw new c(e);
            }
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void gn(int i, z60 z60Var) throws c {
            q7(i, 2);
            x9(z60Var);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void hz(String str) throws c {
            int iPosition = this.v5.position();
            try {
                int iXG = x40.XG(str.length() * 3);
                int iXG2 = x40.XG(str.length());
                if (iXG2 != iXG) {
                    OW(s80.j6(str));
                    eU(str);
                    return;
                }
                int iPosition2 = this.v5.position() + iXG2;
                this.v5.position(iPosition2);
                eU(str);
                int iPosition3 = this.v5.position();
                this.v5.position(iPosition);
                OW(iPosition3 - iPosition2);
                this.v5.position(iPosition3);
            } catch (w80 e) {
                this.v5.position(iPosition);
                tp(str, e);
            } catch (IllegalArgumentException e2) {
                throw new c(e2);
            }
        }

        final void iW(z60 z60Var, r70 r70Var) throws c {
            z30 z30Var = (z30) z60Var;
            int iDW = z30Var.DW();
            if (iDW == -1) {
                iDW = r70Var.FH(z30Var);
                z30Var.v5(iDW);
            }
            OW(iDW);
            r70Var.EQ(z60Var, this.j6);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void j3(i40 i40Var) throws c {
            OW(i40Var.size());
            i40Var.Hw(this);
        }

        @Override // com.google.android.gms.internal.ads.h40
        public final void j6(byte[] bArr, int i, int i2) throws c {
            FH(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void jw(byte[] bArr, int i, int i2) throws c {
            OW(i2);
            FH(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void kf(int i, int i2) throws c {
            q7(i, 5);
            XX(i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void ko(int i, long j) throws c {
            q7(i, 0);
            U2(j);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void lp(int i, String str) throws c {
            q7(i, 2);
            hz(str);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void mb(int i, long j) throws c {
            q7(i, 1);
            ei(j);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void n5(int i, int i2) throws c {
            q7(i, 0);
            OW(i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void q7(int i, int i2) throws c {
            OW((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        final void u7(int i, z60 z60Var, r70 r70Var) throws c {
            q7(i, 2);
            iW(z60Var, r70Var);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void vy(int i, i40 i40Var) throws c {
            q7(1, 3);
            n5(2, i);
            VH(3, i40Var);
            q7(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void x9(z60 z60Var) throws c {
            OW(z60Var.u7());
            z60Var.VH(this);
        }
    }

    static final class e extends x40 {
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
            long jCn = q80.cn(byteBuffer);
            this.Zo = jCn;
            this.VH = jCn + byteBuffer.position();
            long jLimit = this.Zo + byteBuffer.limit();
            this.gn = jLimit;
            this.u7 = jLimit - 10;
            this.tp = this.VH;
        }

        private final void eU(long j) {
            this.v5.position((int) (j - this.Zo));
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void DW() {
            this.Hw.position((int) (this.tp - this.Zo));
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void Ev(int i, boolean z) throws c {
            q7(i, 0);
            ca(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void FH(byte[] bArr, int i, int i2) throws c {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = i2;
                long j2 = this.gn - j;
                long j3 = this.tp;
                if (j2 >= j3) {
                    q80.tp(bArr, i, j3, j);
                    this.tp += j;
                    return;
                }
            }
            if (bArr != null) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.tp), Long.valueOf(this.gn), Integer.valueOf(i2)));
            }
            throw new NullPointerException(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void OW(int i) throws c {
            if (this.tp <= this.u7) {
                while ((i & (-128)) != 0) {
                    long j = this.tp;
                    this.tp = j + 1;
                    q80.DW(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.tp;
                this.tp = 1 + j2;
                q80.DW(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.tp;
                if (j3 >= this.gn) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.tp), Long.valueOf(this.gn), 1));
                }
                if ((i & (-128)) == 0) {
                    this.tp = 1 + j3;
                    q80.DW(j3, (byte) i);
                    return;
                } else {
                    this.tp = j3 + 1;
                    q80.DW(j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void P8(int i, z60 z60Var) throws c {
            q7(1, 3);
            n5(2, i);
            gn(3, z60Var);
            q7(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final int QX() {
            return (int) (this.gn - this.tp);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void Qq(int i) throws c {
            if (i >= 0) {
                OW(i);
            } else {
                U2(i);
            }
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void U2(long j) throws c {
            if (this.tp <= this.u7) {
                while ((j & (-128)) != 0) {
                    long j2 = this.tp;
                    this.tp = j2 + 1;
                    q80.DW(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.tp;
                this.tp = 1 + j3;
                q80.DW(j3, (byte) j);
                return;
            }
            while (true) {
                long j4 = this.tp;
                if (j4 >= this.gn) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.tp), Long.valueOf(this.gn), 1));
                }
                if ((j & (-128)) == 0) {
                    this.tp = 1 + j4;
                    q80.DW(j4, (byte) j);
                    return;
                } else {
                    this.tp = j4 + 1;
                    q80.DW(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void VH(int i, i40 i40Var) throws c {
            q7(i, 2);
            j3(i40Var);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void XX(int i) {
            this.v5.putInt((int) (this.tp - this.Zo), i);
            this.tp += 4;
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void Z1(int i, int i2) throws c {
            q7(i, 0);
            Qq(i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void ca(byte b) throws c {
            long j = this.tp;
            if (j >= this.gn) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.tp), Long.valueOf(this.gn), 1));
            }
            this.tp = 1 + j;
            q80.DW(j, b);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void ei(long j) {
            this.v5.putLong((int) (this.tp - this.Zo), j);
            this.tp += 8;
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void gn(int i, z60 z60Var) throws c {
            q7(i, 2);
            x9(z60Var);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void hz(String str) throws c {
            long j = this.tp;
            try {
                int iXG = x40.XG(str.length() * 3);
                int iXG2 = x40.XG(str.length());
                if (iXG2 != iXG) {
                    int iJ6 = s80.j6(str);
                    OW(iJ6);
                    eU(this.tp);
                    s80.FH(str, this.v5);
                    this.tp += iJ6;
                    return;
                }
                int i = ((int) (this.tp - this.Zo)) + iXG2;
                this.v5.position(i);
                s80.FH(str, this.v5);
                int iPosition = this.v5.position() - i;
                OW(iPosition);
                this.tp += iPosition;
            } catch (w80 e) {
                this.tp = j;
                eU(j);
                tp(str, e);
            } catch (IllegalArgumentException e2) {
                throw new c(e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new c(e3);
            }
        }

        final void iW(z60 z60Var, r70 r70Var) throws c {
            z30 z30Var = (z30) z60Var;
            int iDW = z30Var.DW();
            if (iDW == -1) {
                iDW = r70Var.FH(z30Var);
                z30Var.v5(iDW);
            }
            OW(iDW);
            r70Var.EQ(z60Var, this.j6);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void j3(i40 i40Var) throws c {
            OW(i40Var.size());
            i40Var.Hw(this);
        }

        @Override // com.google.android.gms.internal.ads.h40
        public final void j6(byte[] bArr, int i, int i2) throws c {
            FH(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void jw(byte[] bArr, int i, int i2) throws c {
            OW(i2);
            FH(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void kf(int i, int i2) throws c {
            q7(i, 5);
            XX(i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void ko(int i, long j) throws c {
            q7(i, 0);
            U2(j);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void lp(int i, String str) throws c {
            q7(i, 2);
            hz(str);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void mb(int i, long j) throws c {
            q7(i, 1);
            ei(j);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void n5(int i, int i2) throws c {
            q7(i, 0);
            OW(i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void q7(int i, int i2) throws c {
            OW((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.ads.x40
        final void u7(int i, z60 z60Var, r70 r70Var) throws c {
            q7(i, 2);
            iW(z60Var, r70Var);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void vy(int i, i40 i40Var) throws c {
            q7(1, 3);
            n5(2, i);
            VH(3, i40Var);
            q7(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.x40
        public final void x9(z60 z60Var) throws c {
            OW(z60Var.u7());
            z60Var.VH(this);
        }
    }

    private x40() {
    }

    public static int AL(int i, long j) {
        return kQ(i) + 8;
    }

    public static int CU(int i) {
        return yO(i);
    }

    public static int EQ(int i, int i2) {
        return kQ(i) + XG(i2);
    }

    @Deprecated
    public static int Eq(int i) {
        return XG(i);
    }

    public static int FN(float f) {
        return 4;
    }

    public static int Hw(int i, f60 f60Var) {
        int iKQ = kQ(i);
        int iDW = f60Var.DW();
        return iKQ + XG(iDW) + iDW;
    }

    public static int I(int i, z60 z60Var) {
        return (kQ(1) << 1) + EQ(2, i) + vJ(3, z60Var);
    }

    public static int J0(int i, int i2) {
        return kQ(i) + 4;
    }

    public static int J8(int i, int i2) {
        return kQ(i) + 4;
    }

    public static int Jl(int i, int i2) {
        return kQ(i) + yO(i2);
    }

    public static int KD(long j) {
        return SI(dx(j));
    }

    public static int Mr(i40 i40Var) {
        int size = i40Var.size();
        return XG(size) + size;
    }

    public static int Mz(int i, i40 i40Var) {
        return (kQ(1) << 1) + EQ(2, i) + Sf(3, i40Var);
    }

    public static int SI(long j) {
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

    public static int Sf(int i, i40 i40Var) {
        int iKQ = kQ(i);
        int size = i40Var.size();
        return iKQ + XG(size) + size;
    }

    public static int Ws(int i, int i2) {
        return kQ(i) + yO(i2);
    }

    public static int XG(int i) {
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

    private static int Xa(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int aq(String str) {
        int length;
        try {
            length = s80.j6(str);
        } catch (w80 unused) {
            length = str.getBytes(t50.j6).length;
        }
        return XG(length) + length;
    }

    public static int cT(byte[] bArr) {
        int length = bArr.length;
        return XG(length) + length;
    }

    public static int cb(long j) {
        return 8;
    }

    public static int cn(long j) {
        return 8;
    }

    private static long dx(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int ef(int i, double d2) {
        return kQ(i) + 8;
    }

    static int er(int i, z60 z60Var, r70 r70Var) {
        return kQ(i) + yS(z60Var, r70Var);
    }

    public static int et(int i) {
        return 4;
    }

    public static int fY(int i, long j) {
        return kQ(i) + SI(j);
    }

    @Deprecated
    static int g3(int i, z60 z60Var, r70 r70Var) {
        int iKQ = kQ(i) << 1;
        z30 z30Var = (z30) z60Var;
        int iDW = z30Var.DW();
        if (iDW == -1) {
            iDW = r70Var.FH(z30Var);
            z30Var.v5(iDW);
        }
        return iKQ + iDW;
    }

    public static x40 hK(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int jJ(int i) {
        return XG(Xa(i));
    }

    public static int jO(int i, String str) {
        return kQ(i) + aq(str);
    }

    public static x40 k2(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return q80.J0() ? new e(byteBuffer) : new d(byteBuffer);
    }

    public static int kQ(int i) {
        return XG(i << 3);
    }

    public static int lg(int i, float f) {
        return kQ(i) + 4;
    }

    public static int nw(long j) {
        return SI(j);
    }

    @Deprecated
    public static int oY(z60 z60Var) {
        return z60Var.u7();
    }

    public static int qp(int i, long j) {
        return kQ(i) + SI(j);
    }

    public static int rN(int i, f60 f60Var) {
        return (kQ(1) << 1) + EQ(2, i) + Hw(3, f60Var);
    }

    public static int sG(double d2) {
        return 8;
    }

    public static int sh(boolean z) {
        return 1;
    }

    public static int sy(z60 z60Var) {
        int iU7 = z60Var.u7();
        return XG(iU7) + iU7;
    }

    public static int v5(f60 f60Var) {
        int iDW = f60Var.DW();
        return XG(iDW) + iDW;
    }

    public static int vJ(int i, z60 z60Var) {
        return kQ(i) + sy(z60Var);
    }

    public static int w9(int i, long j) {
        return kQ(i) + 8;
    }

    public static int wc(int i) {
        return 4;
    }

    public static int we(int i, int i2) {
        return kQ(i) + XG(Xa(i2));
    }

    public static int yO(int i) {
        if (i >= 0) {
            return XG(i);
        }
        return 10;
    }

    static int yS(z60 z60Var, r70 r70Var) {
        z30 z30Var = (z30) z60Var;
        int iDW = z30Var.DW();
        if (iDW == -1) {
            iDW = r70Var.FH(z30Var);
            z30Var.v5(iDW);
        }
        return XG(iDW) + iDW;
    }

    public static int ye(int i, boolean z) {
        return kQ(i) + 1;
    }

    public static int zh(int i, long j) {
        return kQ(i) + SI(dx(j));
    }

    public final void BT(int i, double d2) {
        mb(i, Double.doubleToRawLongBits(d2));
    }

    public abstract void DW();

    public abstract void Ev(int i, boolean z);

    public abstract void FH(byte[] bArr, int i, int i2);

    public abstract void OW(int i);

    public abstract void P8(int i, z60 z60Var);

    public final void Q6(int i, int i2) {
        n5(i, Xa(i2));
    }

    public abstract int QX();

    public abstract void Qq(int i);

    public abstract void U2(long j);

    public abstract void VH(int i, i40 i40Var);

    public final void WB(int i, long j) {
        ko(i, dx(j));
    }

    public final void XL() {
        if (QX() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void XX(int i);

    public abstract void Z1(int i, int i2);

    public final void Zo(int i, float f) {
        kf(i, Float.floatToRawIntBits(f));
    }

    public final void a8(long j) {
        U2(dx(j));
    }

    public final void aj(float f) {
        XX(Float.floatToRawIntBits(f));
    }

    public final void br(int i) {
        OW(Xa(i));
    }

    public abstract void ca(byte b2);

    public abstract void ei(long j);

    public final void gW(double d2) {
        ei(Double.doubleToRawLongBits(d2));
    }

    public abstract void gn(int i, z60 z60Var);

    public abstract void hz(String str);

    public abstract void j3(i40 i40Var);

    abstract void jw(byte[] bArr, int i, int i2);

    public abstract void kf(int i, int i2);

    public abstract void ko(int i, long j);

    public abstract void lp(int i, String str);

    public abstract void mb(int i, long j);

    public abstract void n5(int i, int i2);

    public abstract void q7(int i, int i2);

    public final void ro(boolean z) {
        ca(z ? (byte) 1 : (byte) 0);
    }

    final void tp(String str, w80 w80Var) throws c {
        DW.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) w80Var);
        byte[] bytes = str.getBytes(t50.j6);
        try {
            OW(bytes.length);
            j6(bytes, 0, bytes.length);
        } catch (c e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new c(e3);
        }
    }

    abstract void u7(int i, z60 z60Var, r70 r70Var);

    public abstract void vy(int i, i40 i40Var);

    public abstract void x9(z60 z60Var);
}
