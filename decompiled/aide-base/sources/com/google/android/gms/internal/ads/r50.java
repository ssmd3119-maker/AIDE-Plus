package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.google.android.gms.internal.ads.r50.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class r50<MessageType extends r50<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends z30<MessageType, BuilderType> {
    private static Map<Object, r50<?, ?>> zzfpw = new ConcurrentHashMap();
    protected k80 zzfpu = k80.Zo();
    private int zzfpv = -1;

    public static abstract class a<MessageType extends r50<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a40<MessageType, BuilderType> {
        private final MessageType WB;
        private boolean jw = false;
        protected MessageType mb;

        protected a(MessageType messagetype) {
            this.WB = messagetype;
            this.mb = (MessageType) messagetype.J8(e.Hw, null, null);
        }

        private static void we(MessageType messagetype, MessageType messagetype2) {
            m70.DW().j6(messagetype).j6(messagetype, messagetype2);
        }

        public final BuilderType EQ(MessageType messagetype) {
            J0();
            we(this.mb, messagetype);
            return this;
        }

        protected final void J0() {
            if (this.jw) {
                MessageType messagetype = (MessageType) this.mb.J8(e.Hw, null, null);
                we(messagetype, this.mb);
                this.mb = messagetype;
                this.jw = false;
            }
        }

        @Override // com.google.android.gms.internal.ads.a70
        /* renamed from: J8, reason: merged with bridge method [inline-methods] */
        public MessageType KD() {
            if (this.jw) {
                return this.mb;
            }
            MessageType messagetype = this.mb;
            m70.DW().j6(messagetype).u7(messagetype);
            this.jw = true;
            return this.mb;
        }

        @Override // com.google.android.gms.internal.ads.a70
        /* renamed from: Ws, reason: merged with bridge method [inline-methods] */
        public final MessageType Mr() {
            MessageType messagetype = (MessageType) KD();
            byte bByteValue = ((Byte) messagetype.J8(e.j6, null, null)).byteValue();
            boolean zZo = true;
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zZo = false;
                } else {
                    zZo = m70.DW().j6(messagetype).Zo(messagetype);
                    messagetype.J8(e.DW, zZo ? messagetype : null, null);
                }
            }
            if (zZo) {
                return messagetype;
            }
            throw new i80(messagetype);
        }

        @Override // com.google.android.gms.internal.ads.b70
        public final /* synthetic */ z60 Zo() {
            return this.WB;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Object clone() {
            a aVar = (a) this.WB.J8(e.v5, null, null);
            aVar.EQ((r50) KD());
            return aVar;
        }

        @Override // com.google.android.gms.internal.ads.b70
        public final boolean isInitialized() {
            return r50.j3(this.mb, false);
        }

        @Override // com.google.android.gms.internal.ads.a40
        protected final /* synthetic */ a40 tp(z30 z30Var) {
            EQ((r50) z30Var);
            return this;
        }
    }

    public static class b<T extends r50<T, ?>> extends b40<T> {
        private final T j6;

        public b(T t) {
            this.j6 = t;
        }

        @Override // com.google.android.gms.internal.ads.k70
        public final /* synthetic */ Object j6(s40 s40Var, d50 d50Var) {
            return r50.we(this.j6, s40Var, d50Var);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends r50<MessageType, BuilderType> implements b70 {
        protected h50<Object> zzfqa = h50.J0();
    }

    public static class d<ContainingType extends z60, Type> extends b50<ContainingType, Type> {
    }

    public enum e {
        public static final int DW = 2;
        public static final int EQ = 1;
        public static final int FH = 3;
        public static final int Hw = 4;
        public static final int VH = 7;
        public static final int Zo = 6;
        private static final /* synthetic */ int[] gn = {1, 2, 3, 4, 5, 6, 7};
        public static final int j6 = 1;
        public static final int tp = 2;
        public static final int u7 = 1;
        public static final int v5 = 5;
        public static final int we = 2;

        public static int[] j6() {
            return (int[]) gn.clone();
        }
    }

    private static <T extends r50<T, ?>> T EQ(T t, i40 i40Var, d50 d50Var) throws y50 {
        try {
            s40 s40VarEQ = i40Var.EQ();
            T t2 = (T) we(t, s40VarEQ, d50Var);
            try {
                s40VarEQ.rN(0);
                return t2;
            } catch (y50 e2) {
                e2.tp(t2);
                throw e2;
            }
        } catch (y50 e3) {
            throw e3;
        }
    }

    private static <T extends r50<T, ?>> T J0(T t, byte[] bArr) throws y50 {
        T t2 = (T) t.J8(e.Hw, null, null);
        try {
            m70.DW().j6(t2).gn(t2, bArr, 0, bArr.length, new f40());
            m70.DW().j6(t2).u7(t2);
            if (t2.zzfkx == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof y50) {
                throw ((y50) e2.getCause());
            }
            y50 y50Var = new y50(e2.getMessage());
            y50Var.tp(t2);
            throw y50Var;
        } catch (IndexOutOfBoundsException unused) {
            y50 y50VarJ6 = y50.j6();
            y50VarJ6.tp(t2);
            throw y50VarJ6;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.s50, com.google.android.gms.internal.ads.w50] */
    protected static w50 U2() {
        return s50.v5();
    }

    protected static Object Ws(z60 z60Var, String str, Object[] objArr) {
        return new p70(z60Var, str, objArr);
    }

    static Object XL(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static <E> x50<E> a8() {
        return n70.DW();
    }

    protected static <T extends r50<?, ?>> void aM(Class<T> cls, T t) {
        zzfpw.put(cls, t);
    }

    protected static final <T extends r50<T, ?>> boolean j3(T t, boolean z) {
        byte bByteValue = ((Byte) t.J8(e.j6, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        return m70.DW().j6(t).Zo(t);
    }

    protected static <T extends r50<T, ?>> T lg(T t, byte[] bArr) throws y50 {
        T t2 = (T) J0(t, bArr);
        if (t2 != null) {
            byte bByteValue = ((Byte) t2.J8(e.j6, null, null)).byteValue();
            boolean zZo = true;
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zZo = false;
                } else {
                    zZo = m70.DW().j6(t2).Zo(t2);
                    t2.J8(e.DW, zZo ? t2 : null, null);
                }
            }
            if (!zZo) {
                y50 y50VarJ6 = new i80(t2).j6();
                y50VarJ6.tp(t2);
                throw y50VarJ6;
            }
        }
        return t2;
    }

    static <T extends r50<?, ?>> T rN(Class<T> cls) throws ClassNotFoundException {
        T t = (T) zzfpw.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzfpw.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t != null) {
            return t;
        }
        String strValueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(strValueOf.length() != 0 ? "Unable to get default instance for: ".concat(strValueOf) : new String("Unable to get default instance for: "));
    }

    protected static <T extends r50<T, ?>> T tp(T t, i40 i40Var) throws y50 {
        boolean zZo;
        T t2 = (T) EQ(t, i40Var, d50.Hw());
        boolean zZo2 = false;
        if (t2 != null) {
            byte bByteValue = ((Byte) t2.J8(e.j6, null, null)).byteValue();
            if (bByteValue == 1) {
                zZo = true;
            } else if (bByteValue == 0) {
                zZo = false;
            } else {
                zZo = m70.DW().j6(t2).Zo(t2);
                t2.J8(e.DW, zZo ? t2 : null, null);
            }
            if (!zZo) {
                y50 y50VarJ6 = new i80(t2).j6();
                y50VarJ6.tp(t2);
                throw y50VarJ6;
            }
        }
        if (t2 != null) {
            byte bByteValue2 = ((Byte) t2.J8(e.j6, null, null)).byteValue();
            if (bByteValue2 == 1) {
                zZo2 = true;
            } else if (bByteValue2 != 0) {
                zZo2 = m70.DW().j6(t2).Zo(t2);
                t2.J8(e.DW, zZo2 ? t2 : null, null);
            }
            if (!zZo2) {
                y50 y50VarJ62 = new i80(t2).j6();
                y50VarJ62.tp(t2);
                throw y50VarJ62;
            }
        }
        return t2;
    }

    static <T extends r50<T, ?>> T we(T t, s40 s40Var, d50 d50Var) throws y50 {
        T t2 = (T) t.J8(e.Hw, null, null);
        try {
            m70.DW().j6(t2).tp(t2, v40.gn(s40Var), d50Var);
            m70.DW().j6(t2).u7(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof y50) {
                throw ((y50) e2.getCause());
            }
            y50 y50Var = new y50(e2.getMessage());
            y50Var.tp(t2);
            throw y50Var;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof y50) {
                throw ((y50) e3.getCause());
            }
            throw e3;
        }
    }

    @Override // com.google.android.gms.internal.ads.z30
    final int DW() {
        return this.zzfpv;
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final /* synthetic */ a70 FH() {
        return (a) J8(e.v5, null, null);
    }

    protected abstract Object J8(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.z60
    public final void VH(x40 x40Var) {
        m70.DW().FH(getClass()).EQ(this, z40.v5(x40Var));
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final /* synthetic */ z60 Zo() {
        return (r50) J8(e.Zo, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((r50) J8(e.Zo, null, null)).getClass().isInstance(obj)) {
            return m70.DW().j6(this).Hw(this, (r50) obj);
        }
        return false;
    }

    public int hashCode() {
        int i = this.zzfkx;
        if (i != 0) {
            return i;
        }
        int iVH = m70.DW().j6(this).VH(this);
        this.zzfkx = iVH;
        return iVH;
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final boolean isInitialized() {
        byte bByteValue = ((Byte) J8(e.j6, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZo = m70.DW().j6(this).Zo(this);
        J8(e.DW, zZo ? this : null, null);
        return zZo;
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final /* synthetic */ a70 j6() {
        a aVar = (a) J8(e.v5, null, null);
        aVar.EQ(this);
        return aVar;
    }

    public String toString() {
        return c70.j6(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final int u7() {
        if (this.zzfpv == -1) {
            this.zzfpv = m70.DW().j6(this).FH(this);
        }
        return this.zzfpv;
    }

    @Override // com.google.android.gms.internal.ads.z30
    final void v5(int i) {
        this.zzfpv = i;
    }
}
