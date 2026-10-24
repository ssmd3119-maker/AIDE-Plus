package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.measurement.e4.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class e4<MessageType extends e4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends m2<MessageType, BuilderType> {
    private static Map<Object, e4<?, ?>> zzbyf = new ConcurrentHashMap();
    protected v6 zzbyd = v6.u7();
    private int zzbye = -1;

    public static abstract class a<MessageType extends e4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends n2<MessageType, BuilderType> {
        private final MessageType WB;
        private boolean jw = false;
        protected MessageType mb;

        protected a(MessageType messagetype) {
            this.WB = messagetype;
            this.mb = (MessageType) messagetype.we(e.Hw, null, null);
        }

        private static void EQ(MessageType messagetype, MessageType messagetype2) {
            y5.FH().j6(messagetype).j6(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.measurement.m5
        /* renamed from: J0, reason: merged with bridge method [inline-methods] */
        public MessageType a8() {
            if (this.jw) {
                return this.mb;
            }
            MessageType messagetype = this.mb;
            y5.FH().j6(messagetype).FH(messagetype);
            this.jw = true;
            return this.mb;
        }

        @Override // com.google.android.gms.internal.measurement.m5
        /* renamed from: J8, reason: merged with bridge method [inline-methods] */
        public final MessageType DW() {
            MessageType messagetype = (MessageType) a8();
            byte bByteValue = ((Byte) messagetype.we(e.j6, null, null)).byteValue();
            boolean zGn = true;
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zGn = false;
                } else {
                    zGn = y5.FH().j6(messagetype).gn(messagetype);
                    messagetype.we(e.DW, zGn ? messagetype : null, null);
                }
            }
            if (zGn) {
                return messagetype;
            }
            throw new t6(messagetype);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Object clone() {
            a aVar = (a) this.WB.we(e.v5, null, null);
            aVar.tp((e4) a8());
            return aVar;
        }

        @Override // com.google.android.gms.internal.measurement.n5
        public final /* synthetic */ l5 gn() {
            return this.WB;
        }

        @Override // com.google.android.gms.internal.measurement.n5
        public final boolean isInitialized() {
            return e4.QX(this.mb, false);
        }

        public final BuilderType tp(MessageType messagetype) {
            we();
            EQ(this.mb, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.measurement.n2
        protected final /* synthetic */ n2 u7(m2 m2Var) {
            tp((e4) m2Var);
            return this;
        }

        protected final void we() {
            if (this.jw) {
                MessageType messagetype = (MessageType) this.mb.we(e.Hw, null, null);
                EQ(messagetype, this.mb);
                this.mb = messagetype;
                this.jw = false;
            }
        }
    }

    public static class b<T extends e4<T, ?>> extends o2<T> {
        private final T j6;

        public b(T t) {
            this.j6 = t;
        }

        @Override // com.google.android.gms.internal.measurement.w5
        public final /* synthetic */ Object j6(f3 f3Var, r3 r3Var) {
            return e4.EQ(this.j6, f3Var, r3Var);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends e4<MessageType, BuilderType> implements n5 {
        protected v3<Object> zzbyj = v3.aM();
    }

    public static class d<ContainingType extends l5, Type> extends o3<ContainingType, Type> {
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

    static <T extends e4<T, ?>> T EQ(T t, f3 f3Var, r3 r3Var) throws k4 {
        T t2 = (T) t.we(e.Hw, null, null);
        try {
            y5.FH().j6(t2).u7(t2, i3.SI(f3Var), r3Var);
            y5.FH().j6(t2).FH(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof k4) {
                throw ((k4) e2.getCause());
            }
            k4 k4Var = new k4(e2.getMessage());
            k4Var.j6(t2);
            throw k4Var;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof k4) {
                throw ((k4) e3.getCause());
            }
            throw e3;
        }
    }

    protected static Object J0(l5 l5Var, String str, Object[] objArr) {
        return new a6(l5Var, str, objArr);
    }

    static Object J8(Method method, Object obj, Object... objArr) {
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

    protected static <E> j4<E> Mr() {
        return z5.DW();
    }

    protected static final <T extends e4<T, ?>> boolean QX(T t, boolean z) {
        byte bByteValue = ((Byte) t.we(e.j6, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        return y5.FH().j6(t).gn(t);
    }

    protected static <T extends e4<?, ?>> void Ws(Class<T> cls, T t) {
        zzbyf.put(cls, t);
    }

    static <T extends e4<?, ?>> T XL(Class<T> cls) throws ClassNotFoundException {
        e4<?, ?> e4Var = zzbyf.get(cls);
        if (e4Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                e4Var = zzbyf.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (e4Var == null) {
            e4Var = (T) ((e4) a7.a8(cls)).we(e.Zo, null, null);
            if (e4Var == null) {
                throw new IllegalStateException();
            }
            zzbyf.put(cls, e4Var);
        }
        return (T) e4Var;
    }

    @Override // com.google.android.gms.internal.measurement.l5
    public final void FH(k3 k3Var) {
        y5.FH().DW(getClass()).DW(this, m3.Sf(k3Var));
    }

    @Override // com.google.android.gms.internal.measurement.l5
    public final /* synthetic */ m5 VH() {
        return (a) we(e.v5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.l5
    public final int Zo() {
        if (this.zzbye == -1) {
            this.zzbye = y5.FH().j6(this).Zo(this);
        }
        return this.zzbye;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((e4) we(e.Zo, null, null)).getClass().isInstance(obj)) {
            return y5.FH().j6(this).Hw(this, (e4) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final /* synthetic */ l5 gn() {
        return (e4) we(e.Zo, null, null);
    }

    public int hashCode() {
        int i = this.zzbti;
        if (i != 0) {
            return i;
        }
        int iVH = y5.FH().j6(this).VH(this);
        this.zzbti = iVH;
        return iVH;
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean isInitialized() {
        byte bByteValue = ((Byte) we(e.j6, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zGn = y5.FH().j6(this).gn(this);
        we(e.DW, zGn ? this : null, null);
        return zGn;
    }

    public final BuilderType j3() {
        BuilderType buildertype = (BuilderType) we(e.v5, null, null);
        buildertype.tp(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.measurement.l5
    public final /* synthetic */ m5 j6() {
        a aVar = (a) we(e.v5, null, null);
        aVar.tp(this);
        return aVar;
    }

    public String toString() {
        return o5.j6(this, super.toString());
    }

    @Override // com.google.android.gms.internal.measurement.m2
    final int tp() {
        return this.zzbye;
    }

    @Override // com.google.android.gms.internal.measurement.m2
    final void u7(int i) {
        this.zzbye = i;
    }

    protected abstract Object we(int i, Object obj, Object obj2);
}
