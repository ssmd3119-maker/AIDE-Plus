package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.e4;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class q0 extends e4<q0, a> implements n5 {
    private static final q0 zzauw;
    private static volatile w5<q0> zznw;
    private String zzauu = "";
    private long zzauv;
    private int zznr;

    public static final class a extends e4.a<q0, a> implements n5 {
        private a() {
            super(q0.zzauw);
        }

        public final a Ws(long j) {
            we();
            ((q0) this.mb).er(j);
            return this;
        }

        public final a XL(String str) {
            we();
            ((q0) this.mb).U2(str);
            return this;
        }

        /* synthetic */ a(s0 s0Var) {
            this();
        }
    }

    static {
        q0 q0Var = new q0();
        zzauw = q0Var;
        e4.Ws(q0.class, q0Var);
    }

    private q0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U2(String str) {
        if (str == null) {
            throw null;
        }
        this.zznr |= 1;
        this.zzauu = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void er(long j) {
        this.zznr |= 2;
        this.zzauv = j;
    }

    public static a yS() {
        return (a) ((e4.a) zzauw.we(e4.e.v5, null, null));
    }

    @Override // com.google.android.gms.internal.measurement.e4
    protected final Object we(int i, Object obj, Object obj2) {
        s0 s0Var = null;
        switch (s0.j6[i - 1]) {
            case 1:
                return new q0();
            case 2:
                return new a(s0Var);
            case 3:
                return e4.J0(zzauw, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", new Object[]{"zznr", "zzauu", "zzauv"});
            case 4:
                return zzauw;
            case 5:
                w5<q0> bVar = zznw;
                if (bVar == null) {
                    synchronized (q0.class) {
                        bVar = zznw;
                        if (bVar == null) {
                            bVar = new e4.b<>(zzauw);
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
