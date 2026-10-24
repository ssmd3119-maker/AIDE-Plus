package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.e4;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class r0 extends e4<r0, a> implements n5 {
    private static final r0 zzauz;
    private static volatile w5<r0> zznw;
    private int zzaux = 1;
    private j4<q0> zzauy = e4.Mr();
    private int zznr;

    public static final class a extends e4.a<r0, a> implements n5 {
        private a() {
            super(r0.zzauz);
        }

        public final a Ws(q0 q0Var) {
            we();
            ((r0) this.mb).lg(q0Var);
            return this;
        }

        /* synthetic */ a(s0 s0Var) {
            this();
        }
    }

    public enum b implements h4 {
        RADS(1),
        PROVISIONING(2);

        private final int WB;

        b(int i) {
            this.WB = i;
        }

        public static b DW(int i) {
            if (i == 1) {
                return RADS;
            }
            if (i != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static i4 j6() {
            return t0.j6;
        }

        @Override // com.google.android.gms.internal.measurement.h4
        public final int J8() {
            return this.WB;
        }
    }

    static {
        r0 r0Var = new r0();
        zzauz = r0Var;
        e4.Ws(r0.class, r0Var);
    }

    private r0() {
    }

    public static w5<r0> U2() {
        return (w5) zzauz.we(e4.e.VH, null, null);
    }

    public static a er() {
        return (a) ((e4.a) zzauz.we(e4.e.v5, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lg(q0 q0Var) {
        if (q0Var == null) {
            throw null;
        }
        if (!this.zzauy.sh()) {
            j4<q0> j4Var = this.zzauy;
            int size = j4Var.size();
            this.zzauy = j4Var.tp(size == 0 ? 10 : size << 1);
        }
        this.zzauy.add(q0Var);
    }

    @Override // com.google.android.gms.internal.measurement.e4
    protected final Object we(int i, Object obj, Object obj2) {
        s0 s0Var = null;
        switch (s0.j6[i - 1]) {
            case 1:
                return new r0();
            case 2:
                return new a(s0Var);
            case 3:
                return e4.J0(zzauz, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"zznr", "zzaux", b.j6(), "zzauy", q0.class});
            case 4:
                return zzauz;
            case 5:
                w5<r0> bVar = zznw;
                if (bVar == null) {
                    synchronized (r0.class) {
                        bVar = zznw;
                        if (bVar == null) {
                            bVar = new e4.b<>(zzauz);
                            zznw = bVar;
                        }
                    }
                }
                return bVar;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return (byte) 1;
            case UserTouchAction.CLICK_KIND /* 7 */:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
