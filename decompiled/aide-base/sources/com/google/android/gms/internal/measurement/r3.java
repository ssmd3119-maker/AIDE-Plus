package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.e4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class r3 {
    private static volatile r3 DW;
    static final r3 FH;
    private final Map<a, e4.d<?, ?>> j6;

    static final class a {
        private final int DW;
        private final Object j6;

        a(Object obj, int i) {
            this.j6 = obj;
            this.DW = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.j6 == aVar.j6 && this.DW == aVar.DW;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.j6) * 65535) + this.DW;
        }
    }

    static {
        FH();
        FH = new r3(true);
    }

    r3() {
        this.j6 = new HashMap();
    }

    static r3 DW() {
        return c4.j6(r3.class);
    }

    private static Class<?> FH() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static r3 Hw() {
        return q3.FH();
    }

    public static r3 v5() {
        r3 r3VarHw = DW;
        if (r3VarHw == null) {
            synchronized (r3.class) {
                r3VarHw = DW;
                if (r3VarHw == null) {
                    r3VarHw = q3.Hw();
                    DW = r3VarHw;
                }
            }
        }
        return r3VarHw;
    }

    public final <ContainingType extends l5> e4.d<ContainingType, ?> j6(ContainingType containingtype, int i) {
        return (e4.d) this.j6.get(new a(containingtype, i));
    }

    private r3(boolean z) {
        this.j6 = Collections.emptyMap();
    }
}
