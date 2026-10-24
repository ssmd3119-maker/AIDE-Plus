package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class m00 extends r50<m00, a> implements b70 {
    private static volatile k70<m00> zzcas;
    private static final m00 zzfet;
    private int zzfek;

    public static final class a extends r50.a<m00, a> implements b70 {
        private a() {
            super(m00.zzfet);
        }

        /* synthetic */ a(n00 n00Var) {
            this();
        }
    }

    static {
        m00 m00Var = new m00();
        zzfet = m00Var;
        r50.aM(m00.class, m00Var);
    }

    private m00() {
    }

    public static m00 gW(i40 i40Var) {
        return (m00) r50.tp(zzfet, i40Var);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        n00 n00Var = null;
        switch (n00.j6[i - 1]) {
            case 1:
                return new m00();
            case 2:
                return new a(n00Var);
            case 3:
                return r50.Ws(zzfet, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u000b", new Object[]{"zzfek"});
            case 4:
                return zzfet;
            case 5:
                k70<m00> bVar = zzcas;
                if (bVar == null) {
                    synchronized (m00.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfet);
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
        return this.zzfek;
    }
}
