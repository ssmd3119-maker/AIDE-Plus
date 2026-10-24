package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;
import java.util.List;

/* loaded from: classes.dex */
public final class u10 extends r50<u10, a> implements b70 {
    private static volatile k70<u10> zzcas;
    private static final u10 zzfhk;
    private int zzccg;
    private int zzfhi;
    private x50<b> zzfhj = r50.a8();

    public static final class a extends r50.a<u10, a> implements b70 {
        private a() {
            super(u10.zzfhk);
        }

        /* synthetic */ a(v10 v10Var) {
            this();
        }
    }

    public static final class b extends r50<b, a> implements b70 {
        private static volatile k70<b> zzcas;
        private static final b zzfho;
        private int zzfhb;
        private m10 zzfhl;
        private int zzfhm;
        private int zzfhn;

        public static final class a extends r50.a<b, a> implements b70 {
            private a() {
                super(b.zzfho);
            }

            /* synthetic */ a(v10 v10Var) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzfho = bVar;
            r50.aM(b.class, bVar);
        }

        private b() {
        }

        public final int BT() {
            return this.zzfhn;
        }

        @Override // com.google.android.gms.internal.ads.r50
        protected final Object J8(int i, Object obj, Object obj2) {
            v10 v10Var = null;
            switch (v10.j6[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(v10Var);
                case 3:
                    return r50.Ws(zzfho, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzfhl", "zzfhm", "zzfhn", "zzfhb"});
                case 4:
                    return zzfho;
                case 5:
                    k70<b> bVar = zzcas;
                    if (bVar == null) {
                        synchronized (b.class) {
                            bVar = zzcas;
                            if (bVar == null) {
                                bVar = new r50.b<>(zzfho);
                                zzcas = bVar;
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

        public final g20 P8() {
            g20 g20VarJ6 = g20.j6(this.zzfhb);
            return g20VarJ6 == null ? g20.UNRECOGNIZED : g20VarJ6;
        }

        public final boolean er() {
            return this.zzfhl != null;
        }

        public final o10 gW() {
            o10 o10VarJ6 = o10.j6(this.zzfhm);
            return o10VarJ6 == null ? o10.UNRECOGNIZED : o10VarJ6;
        }

        public final m10 yS() {
            m10 m10Var = this.zzfhl;
            return m10Var == null ? m10.cn() : m10Var;
        }
    }

    static {
        u10 u10Var = new u10();
        zzfhk = u10Var;
        r50.aM(u10.class, u10Var);
    }

    private u10() {
    }

    public static u10 P8(byte[] bArr) {
        return (u10) r50.lg(zzfhk, bArr);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        v10 v10Var = null;
        switch (v10.j6[i - 1]) {
            case 1:
                return new u10();
            case 2:
                return new a(v10Var);
            case 3:
                return r50.Ws(zzfhk, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzccg", "zzfhi", "zzfhj", b.class});
            case 4:
                return zzfhk;
            case 5:
                k70<u10> bVar = zzcas;
                if (bVar == null) {
                    synchronized (u10.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfhk);
                            zzcas = bVar;
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

    public final int er() {
        return this.zzfhi;
    }

    public final int gW() {
        return this.zzfhj.size();
    }

    public final List<b> yS() {
        return this.zzfhj;
    }
}
