package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class wz extends r50<wz, a> implements b70 {
    private static volatile k70<wz> zzcas;
    private static final wz zzfeg;
    private a00 zzfee;
    private i10 zzfef;

    public static final class a extends r50.a<wz, a> implements b70 {
        private a() {
            super(wz.zzfeg);
        }

        /* synthetic */ a(xz xzVar) {
            this();
        }
    }

    static {
        wz wzVar = new wz();
        zzfeg = wzVar;
        r50.aM(wz.class, wzVar);
    }

    private wz() {
    }

    public static wz BT(i40 i40Var) {
        return (wz) r50.tp(zzfeg, i40Var);
    }

    @Override // com.google.android.gms.internal.ads.r50
    protected final Object J8(int i, Object obj, Object obj2) {
        xz xzVar = null;
        switch (xz.j6[i - 1]) {
            case 1:
                return new wz();
            case 2:
                return new a(xzVar);
            case 3:
                return r50.Ws(zzfeg, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzfee", "zzfef"});
            case 4:
                return zzfeg;
            case 5:
                k70<wz> bVar = zzcas;
                if (bVar == null) {
                    synchronized (wz.class) {
                        bVar = zzcas;
                        if (bVar == null) {
                            bVar = new r50.b<>(zzfeg);
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

    public final a00 er() {
        a00 a00Var = this.zzfee;
        return a00Var == null ? a00.gW() : a00Var;
    }

    public final i10 yS() {
        i10 i10Var = this.zzfef;
        return i10Var == null ? i10.BT() : i10Var;
    }
}
