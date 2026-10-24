package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class w10 extends r50<w10, a> implements b70 {
    private static volatile k70<w10> zzcas;
    private static final w10 zzfhq;
    private int zzccg;
    private int zzfhi;
    private x50<b> zzfhp = r50.a8();

    public static final class a extends r50.a<w10, a> implements b70 {
        private a() {
            super(w10.zzfhq);
        }

        public final a XL(b bVar) {
            J0();
            ((w10) this.mb).er(bVar);
            return this;
        }

        public final a j3(int i) {
            J0();
            ((w10) this.mb).ei(i);
            return this;
        }

        /* synthetic */ a(x10 x10Var) {
            this();
        }
    }

    public static final class b extends r50<b, a> implements b70 {
        private static volatile k70<b> zzcas;
        private static final b zzfhr;
        private String zzfgk = "";
        private int zzfhb;
        private int zzfhm;
        private int zzfhn;

        public static final class a extends r50.a<b, a> implements b70 {
            private a() {
                super(b.zzfhr);
            }

            public final a U2(int i) {
                J0();
                ((b) this.mb).ro(i);
                return this;
            }

            public final a XL(o10 o10Var) {
                J0();
                ((b) this.mb).er(o10Var);
                return this;
            }

            public final a j3(g20 g20Var) {
                J0();
                ((b) this.mb).ei(g20Var);
                return this;
            }

            public final a lg(String str) {
                J0();
                ((b) this.mb).cn(str);
                return this;
            }

            /* synthetic */ a(x10 x10Var) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzfhr = bVar;
            r50.aM(b.class, bVar);
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cn(String str) {
            if (str == null) {
                throw null;
            }
            this.zzfgk = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void ei(g20 g20Var) {
            if (g20Var == null) {
                throw null;
            }
            this.zzfhb = g20Var.Hw();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void er(o10 o10Var) {
            if (o10Var == null) {
                throw null;
            }
            this.zzfhm = o10Var.Hw();
        }

        public static a nw() {
            return (a) ((r50.a) zzfhr.J8(r50.e.v5, null, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void ro(int i) {
            this.zzfhn = i;
        }

        @Override // com.google.android.gms.internal.ads.r50
        protected final Object J8(int i, Object obj, Object obj2) {
            x10 x10Var = null;
            switch (x10.j6[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(x10Var);
                case 3:
                    return r50.Ws(zzfhr, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzfgk", "zzfhm", "zzfhn", "zzfhb"});
                case 4:
                    return zzfhr;
                case 5:
                    k70<b> bVar = zzcas;
                    if (bVar == null) {
                        synchronized (b.class) {
                            bVar = zzcas;
                            if (bVar == null) {
                                bVar = new r50.b<>(zzfhr);
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
    }

    static {
        w10 w10Var = new w10();
        zzfhq = w10Var;
        r50.aM(w10.class, w10Var);
    }

    private w10() {
    }

    public static a BT() {
        return (a) ((r50.a) zzfhq.J8(r50.e.v5, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ei(int i) {
        this.zzfhi = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void er(b bVar) {
        if (bVar == null) {
            throw null;
        }
        if (!this.zzfhp.XL()) {
            x50<b> x50Var = this.zzfhp;
            int size = x50Var.size();
            this.zzfhp = x50Var.yS(size == 0 ? 10 : size << 1);
        }
        this.zzfhp.add(bVar);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        x10 x10Var = null;
        switch (x10.j6[i - 1]) {
            case 1:
                return new w10();
            case 2:
                return new a(x10Var);
            case 3:
                return r50.Ws(zzfhq, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzccg", "zzfhi", "zzfhp", b.class});
            case 4:
                return zzfhq;
            case 5:
                k70<w10> bVar = zzcas;
                if (bVar == null) {
                    synchronized (w10.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfhq);
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
}
