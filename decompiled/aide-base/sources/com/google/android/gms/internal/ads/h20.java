package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;
import java.util.List;

/* loaded from: classes.dex */
public final class h20 extends r50<h20, a> implements b70 {
    private static volatile k70<h20> zzcas;
    private static final h20 zzfik;
    private int zzccg;
    private String zzfii = "";
    private x50<s10> zzfij = r50.a8();

    public static final class a extends r50.a<h20, a> implements b70 {
        private a() {
            super(h20.zzfik);
        }

        public final a XL(s10 s10Var) {
            J0();
            ((h20) this.mb).er(s10Var);
            return this;
        }

        public final a j3(String str) {
            J0();
            ((h20) this.mb).nw(str);
            return this;
        }

        /* synthetic */ a(i20 i20Var) {
            this();
        }
    }

    static {
        h20 h20Var = new h20();
        zzfik = h20Var;
        r50.aM(h20.class, h20Var);
    }

    private h20() {
    }

    public static a P8() {
        return (a) ((r50.a) zzfik.J8(r50.e.v5, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void er(s10 s10Var) {
        if (s10Var == null) {
            throw null;
        }
        if (!this.zzfij.XL()) {
            x50<s10> x50Var = this.zzfij;
            int size = x50Var.size();
            this.zzfij = x50Var.yS(size == 0 ? 10 : size << 1);
        }
        this.zzfij.add(s10Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nw(String str) {
        if (str == null) {
            throw null;
        }
        this.zzfii = str;
    }

    public final List<s10> BT() {
        return this.zzfij;
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        i20 i20Var = null;
        switch (i20.j6[i - 1]) {
            case 1:
                return new h20();
            case 2:
                return new a(i20Var);
            case 3:
                return r50.Ws(zzfik, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzccg", "zzfii", "zzfij", s10.class});
            case 4:
                return zzfik;
            case 5:
                k70<h20> bVar = zzcas;
                if (bVar == null) {
                    synchronized (h20.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfik);
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
