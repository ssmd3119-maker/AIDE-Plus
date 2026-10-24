package com.google.android.gms.internal.ads;

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
public final class q80 {
    private static final boolean EQ;
    private static final boolean VH;
    private static final d Zo;
    private static final boolean gn;
    private static final long tp;
    private static final long u7;
    private static final Logger j6 = Logger.getLogger(q80.class.getName());
    private static final Unsafe DW = J8();
    private static final Class<?> FH = d40.DW();
    private static final boolean Hw = P8(Long.TYPE);
    private static final boolean v5 = P8(Integer.TYPE);

    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void DW(Object obj, long j, double d) {
            Hw(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final boolean EQ(Object obj, long j) {
            return q80.EQ ? q80.sG(obj, j) : q80.ef(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void FH(Object obj, long j, float f) {
            VH(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final double J0(Object obj, long j) {
            return Double.longBitsToDouble(tp(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final byte J8(Object obj, long j) {
            return q80.EQ ? q80.cb(obj, j) : q80.dx(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void Zo(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & (-1)), bArr, (int) j, (int) j3);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void gn(Object obj, long j, byte b) {
            if (q80.EQ) {
                q80.FH(obj, j, b);
            } else {
                q80.Mr(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void j6(long j, byte b) {
            Memory.pokeByte((int) (j & (-1)), b);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void v5(Object obj, long j, boolean z) {
            if (q80.EQ) {
                q80.a8(obj, j, z);
            } else {
                q80.rN(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final float we(Object obj, long j) {
            return Float.intBitsToFloat(u7(obj, j));
        }
    }

    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void DW(Object obj, long j, double d) {
            Hw(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final boolean EQ(Object obj, long j) {
            return q80.EQ ? q80.sG(obj, j) : q80.ef(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void FH(Object obj, long j, float f) {
            VH(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final double J0(Object obj, long j) {
            return Double.longBitsToDouble(tp(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final byte J8(Object obj, long j) {
            return q80.EQ ? q80.cb(obj, j) : q80.dx(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void Zo(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void gn(Object obj, long j, byte b) {
            if (q80.EQ) {
                q80.FH(obj, j, b);
            } else {
                q80.Mr(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void j6(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void v5(Object obj, long j, boolean z) {
            if (q80.EQ) {
                q80.a8(obj, j, z);
            } else {
                q80.rN(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final float we(Object obj, long j) {
            return Float.intBitsToFloat(u7(obj, j));
        }
    }

    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void DW(Object obj, long j, double d) {
            this.j6.putDouble(obj, j, d);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final boolean EQ(Object obj, long j) {
            return this.j6.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void FH(Object obj, long j, float f) {
            this.j6.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final double J0(Object obj, long j) {
            return this.j6.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final byte J8(Object obj, long j) {
            return this.j6.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void Zo(byte[] bArr, long j, long j2, long j3) {
            this.j6.copyMemory(bArr, q80.u7 + j, (Object) null, j2, j3);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void gn(Object obj, long j, byte b) {
            this.j6.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void j6(long j, byte b) {
            this.j6.putByte(j, b);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
        public final void v5(Object obj, long j, boolean z) {
            this.j6.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.ads.q80.d
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
            if (!d40.j6()) {
                cVar = new c(DW);
            } else if (Hw) {
                cVar = new b(DW);
            } else if (v5) {
                cVar = new a(DW);
            }
        }
        Zo = cVar;
        VH = QX();
        gn = Ws();
        u7 = BT(byte[].class);
        BT(boolean[].class);
        vy(boolean[].class);
        BT(int[].class);
        vy(int[].class);
        BT(long[].class);
        vy(long[].class);
        BT(float[].class);
        vy(float[].class);
        BT(double[].class);
        vy(double[].class);
        BT(Object[].class);
        vy(Object[].class);
        Field fieldXL = XL();
        tp = (fieldXL == null || (dVar = Zo) == null) ? -1L : dVar.j6.objectFieldOffset(fieldXL);
        EQ = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private q80() {
    }

    private static int BT(Class<?> cls) {
        if (gn) {
            return Zo.j6.arrayBaseOffset(cls);
        }
        return -1;
    }

    static void DW(long j, byte b2) {
        Zo.j6(j, b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void FH(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        U2(obj, j2, ((255 & b2) << i) | (ei(obj, j2) & ((255 << i) ^ (-1))));
    }

    static void Hw(Object obj, long j, double d2) {
        Zo.DW(obj, j, d2);
    }

    static boolean J0() {
        return VH;
    }

    static Unsafe J8() {
        try {
            return (Unsafe) AccessController.doPrivileged(new r80());
        } catch (Throwable unused) {
            return null;
        }
    }

    static float KD(Object obj, long j) {
        return Zo.we(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Mr(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        U2(obj, j2, ((255 & b2) << i) | (ei(obj, j2) & ((255 << i) ^ (-1))));
    }

    private static boolean P8(Class<?> cls) {
        if (!d40.j6()) {
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

    private static boolean QX() {
        Unsafe unsafe = DW;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (XL() == null) {
                return false;
            }
            if (d40.j6()) {
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

    static boolean SI(Object obj, long j) {
        return Zo.EQ(obj, j);
    }

    static void U2(Object obj, long j, int i) {
        Zo.VH(obj, j, i);
    }

    static void VH(Object obj, long j, Object obj2) {
        Zo.j6.putObject(obj, j, obj2);
    }

    private static boolean Ws() {
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
            if (d40.j6()) {
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

    private static Field XL() {
        Field fieldJ3;
        if (d40.j6() && (fieldJ3 = j3(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldJ3;
        }
        Field fieldJ32 = j3(Buffer.class, "address");
        if (fieldJ32 == null || fieldJ32.getType() != Long.TYPE) {
            return null;
        }
        return fieldJ32;
    }

    static void Zo(Object obj, long j, long j2) {
        Zo.Hw(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a8(Object obj, long j, boolean z) {
        FH(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte cb(Object obj, long j) {
        return (byte) (ei(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3)));
    }

    static long cn(ByteBuffer byteBuffer) {
        return Zo.tp(byteBuffer, tp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte dx(Object obj, long j) {
        return (byte) (ei(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean ef(Object obj, long j) {
        return dx(obj, j) != 0;
    }

    static int ei(Object obj, long j) {
        return Zo.u7(obj, j);
    }

    static void gn(Object obj, long j, boolean z) {
        Zo.v5(obj, j, z);
    }

    private static Field j3(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    static byte j6(byte[] bArr, long j) {
        return Zo.J8(bArr, u7 + j);
    }

    static long nw(Object obj, long j) {
        return Zo.tp(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void rN(Object obj, long j, boolean z) {
        Mr(obj, j, z ? (byte) 1 : (byte) 0);
    }

    static double ro(Object obj, long j) {
        return Zo.J0(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean sG(Object obj, long j) {
        return cb(obj, j) != 0;
    }

    static Object sh(Object obj, long j) {
        return Zo.j6.getObject(obj, j);
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

    private static int vy(Class<?> cls) {
        if (gn) {
            return Zo.j6.arrayIndexScale(cls);
        }
        return -1;
    }

    static boolean we() {
        return gn;
    }
}
