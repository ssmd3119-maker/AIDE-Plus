package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class a7 {
    private static final boolean EQ;
    private static final boolean VH;
    private static final d Zo;
    private static final boolean gn;
    private static final long tp;
    private static final long u7;
    private static final Logger j6 = Logger.getLogger(a7.class.getName());
    private static final Unsafe DW = Sf();
    private static final Class<?> FH = r2.FH();
    private static final boolean Hw = BT(Long.TYPE);
    private static final boolean v5 = BT(Integer.TYPE);

    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void DW(Object obj, long j, double d) {
            Hw(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final boolean EQ(Object obj, long j) {
            return a7.EQ ? a7.SI(obj, j) : a7.KD(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void FH(Object obj, long j, float f) {
            VH(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final double J0(Object obj, long j) {
            return Double.longBitsToDouble(tp(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final byte J8(Object obj, long j) {
            return a7.EQ ? a7.ei(obj, j) : a7.nw(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void Zo(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & (-1)), bArr, (int) j, (int) j3);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void gn(Object obj, long j, byte b) {
            if (a7.EQ) {
                a7.FH(obj, j, b);
            } else {
                a7.J0(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void j6(long j, byte b) {
            Memory.pokeByte((int) (j & (-1)), b);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void v5(Object obj, long j, boolean z) {
            if (a7.EQ) {
                a7.Ws(obj, j, z);
            } else {
                a7.XL(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final float we(Object obj, long j) {
            return Float.intBitsToFloat(u7(obj, j));
        }
    }

    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void DW(Object obj, long j, double d) {
            Hw(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final boolean EQ(Object obj, long j) {
            return a7.EQ ? a7.SI(obj, j) : a7.KD(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void FH(Object obj, long j, float f) {
            VH(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final double J0(Object obj, long j) {
            return Double.longBitsToDouble(tp(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final byte J8(Object obj, long j) {
            return a7.EQ ? a7.ei(obj, j) : a7.nw(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void Zo(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void gn(Object obj, long j, byte b) {
            if (a7.EQ) {
                a7.FH(obj, j, b);
            } else {
                a7.J0(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void j6(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void v5(Object obj, long j, boolean z) {
            if (a7.EQ) {
                a7.Ws(obj, j, z);
            } else {
                a7.XL(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final float we(Object obj, long j) {
            return Float.intBitsToFloat(u7(obj, j));
        }
    }

    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void DW(Object obj, long j, double d) {
            this.j6.putDouble(obj, j, d);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final boolean EQ(Object obj, long j) {
            return this.j6.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void FH(Object obj, long j, float f) {
            this.j6.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final double J0(Object obj, long j) {
            return this.j6.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final byte J8(Object obj, long j) {
            return this.j6.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void Zo(byte[] bArr, long j, long j2, long j3) {
            this.j6.copyMemory(bArr, a7.u7 + j, (Object) null, j2, j3);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void gn(Object obj, long j, byte b) {
            this.j6.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void j6(long j, byte b) {
            this.j6.putByte(j, b);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final void v5(Object obj, long j, boolean z) {
            this.j6.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.measurement.a7.d
        public final float we(Object obj, long j) {
            return this.j6.getFloat(obj, j);
        }
    }

    static abstract class d {
        Unsafe j6;

        d(Unsafe unsafe) {
            this.j6 = unsafe;
        }

        public abstract void DW(Object obj, long j, double d);

        public abstract boolean EQ(Object obj, long j);

        public abstract void FH(Object obj, long j, float f);

        public final void Hw(Object obj, long j, long j2) {
            this.j6.putLong(obj, j, j2);
        }

        public abstract double J0(Object obj, long j);

        public abstract byte J8(Object obj, long j);

        public final void VH(Object obj, long j, int i) {
            this.j6.putInt(obj, j, i);
        }

        public abstract void Zo(byte[] bArr, long j, long j2, long j3);

        public abstract void gn(Object obj, long j, byte b);

        public abstract void j6(long j, byte b);

        public final long tp(Object obj, long j) {
            return this.j6.getLong(obj, j);
        }

        public final int u7(Object obj, long j) {
            return this.j6.getInt(obj, j);
        }

        public abstract void v5(Object obj, long j, boolean z);

        public abstract float we(Object obj, long j);
    }

    static {
        d dVar;
        d cVar = null;
        if (DW != null) {
            if (!r2.DW()) {
                cVar = new c(DW);
            } else if (Hw) {
                cVar = new b(DW);
            } else if (v5) {
                cVar = new a(DW);
            }
        }
        Zo = cVar;
        VH = g3();
        gn = vJ();
        u7 = lg(byte[].class);
        lg(boolean[].class);
        er(boolean[].class);
        lg(int[].class);
        er(int[].class);
        lg(long[].class);
        er(long[].class);
        lg(float[].class);
        er(float[].class);
        lg(double[].class);
        er(double[].class);
        lg(Object[].class);
        er(Object[].class);
        Field fieldMz = Mz();
        tp = (fieldMz == null || (dVar = Zo) == null) ? -1L : dVar.j6.objectFieldOffset(fieldMz);
        EQ = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private a7() {
    }

    private static boolean BT(Class<?> cls) {
        if (!r2.DW()) {
            return false;
        }
        try {
            Class<?> cls2 = FH;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static void DW(long j, byte b2) {
        Zo.j6(j, b2);
    }

    static long EQ(ByteBuffer byteBuffer) {
        return Zo.tp(byteBuffer, tp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void FH(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        J8(obj, j2, ((255 & b2) << i) | (U2(obj, j2) & ((255 << i) ^ (-1))));
    }

    static void Hw(Object obj, long j, double d2) {
        Zo.DW(obj, j, d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J0(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        J8(obj, j2, ((255 & b2) << i) | (U2(obj, j2) & ((255 << i) ^ (-1))));
    }

    static void J8(Object obj, long j, int i) {
        Zo.VH(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean KD(Object obj, long j) {
        return nw(obj, j) != 0;
    }

    private static Field Mz() {
        Field fieldWe;
        if (r2.DW() && (fieldWe = we(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldWe;
        }
        Field fieldWe2 = we(Buffer.class, "address");
        if (fieldWe2 == null || fieldWe2.getType() != Long.TYPE) {
            return null;
        }
        return fieldWe2;
    }

    static Object P8(Object obj, long j) {
        return Zo.j6.getObject(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean SI(Object obj, long j) {
        return ei(obj, j) != 0;
    }

    static Unsafe Sf() {
        try {
            return (Unsafe) AccessController.doPrivileged(new b7());
        } catch (Throwable unused) {
            return null;
        }
    }

    static int U2(Object obj, long j) {
        return Zo.u7(obj, j);
    }

    static void VH(Object obj, long j, Object obj2) {
        Zo.j6.putObject(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Ws(Object obj, long j, boolean z) {
        FH(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void XL(Object obj, long j, boolean z) {
        J0(obj, j, z ? (byte) 1 : (byte) 0);
    }

    static void Zo(Object obj, long j, long j2) {
        Zo.Hw(obj, j, j2);
    }

    static <T> T a8(Class<T> cls) {
        try {
            return (T) DW.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    static boolean ef() {
        return VH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte ei(Object obj, long j) {
        return (byte) (U2(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3)));
    }

    private static int er(Class<?> cls) {
        if (gn) {
            return Zo.j6.arrayIndexScale(cls);
        }
        return -1;
    }

    private static boolean g3() {
        Unsafe unsafe = DW;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (Mz() == null) {
                return false;
            }
            if (r2.DW()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = j6;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    static float gW(Object obj, long j) {
        return Zo.we(obj, j);
    }

    static void gn(Object obj, long j, boolean z) {
        Zo.v5(obj, j, z);
    }

    static byte j6(byte[] bArr, long j) {
        return Zo.J8(bArr, u7 + j);
    }

    private static int lg(Class<?> cls) {
        if (gn) {
            return Zo.j6.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte nw(Object obj, long j) {
        return (byte) (U2(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    static long rN(Object obj, long j) {
        return Zo.tp(obj, j);
    }

    static boolean sG() {
        return gn;
    }

    static void tp(byte[] bArr, long j, long j2, long j3) {
        Zo.Zo(bArr, j, j2, j3);
    }

    static void u7(byte[] bArr, long j, byte b2) {
        Zo.gn(bArr, u7 + j, b2);
    }

    static void v5(Object obj, long j, float f) {
        Zo.FH(obj, j, f);
    }

    private static boolean vJ() {
        Unsafe unsafe = DW;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (r2.DW()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = j6;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    static double vy(Object obj, long j) {
        return Zo.J0(obj, j);
    }

    private static Field we(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean yS(Object obj, long j) {
        return Zo.EQ(obj, j);
    }
}
