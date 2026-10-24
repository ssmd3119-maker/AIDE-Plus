package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class d50 {
    private static volatile d50 DW;
    static final d50 FH;
    private final Map<a, r50.d<?, ?>> j6;

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
        FH = new d50(true);
    }

    d50() {
        this.j6 = new HashMap();
    }

    static d50 DW() {
        return p50.j6(d50.class);
    }

    private static Class<?> FH() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static d50 Hw() {
        return c50.DW();
    }

    public static d50 v5() {
        d50 d50VarFH = DW;
        if (d50VarFH == null) {
            synchronized (d50.class) {
                d50VarFH = DW;
                if (d50VarFH == null) {
                    d50VarFH = c50.FH();
                    DW = d50VarFH;
                }
            }
        }
        return d50VarFH;
    }

    public final <ContainingType extends z60> r50.d<ContainingType, ?> j6(ContainingType containingtype, int i) {
        return (r50.d) this.j6.get(new a(containingtype, i));
    }

    private d50(boolean z) {
        this.j6 = Collections.emptyMap();
    }
}
