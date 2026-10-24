package abcd;

import com.google.android.gms.measurement.AppMeasurement;
import com.probelytics.api.UserTouchAction;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zq extends br {
    private final fr WB;
    private yq mb;
    private static final HashMap<fr, zq> jw = new HashMap<>(100);
    public static final zq fY = aM(fr.sg);
    public static final zq qp = aM(fr.Cz);
    public static final zq k2 = aM(fr.pN);
    public static final zq zh = aM(fr.oy);
    public static final zq AL = aM(fr.aX);
    public static final zq w9 = aM(fr.e9);
    public static final zq hK = aM(fr.sM);
    public static final zq cT = aM(fr.QO);
    public static final zq q7 = aM(fr.a5);
    public static final zq Z1 = aM(fr.ys);
    public static final zq n5 = aM(fr.IS);
    public static final zq Q6 = aM(fr.gG);
    public static final zq kf = aM(fr.Nh);
    public static final zq Jl = aM(fr.BR);
    public static final zq iW = aM(fr.AE);
    public static final zq eU = aM(fr.An);
    public static final zq e3 = aM(fr.Za);
    public static final zq sE = aM(fr.ce);

    public zq(fr frVar) {
        if (frVar == null) {
            throw new NullPointerException("type == null");
        }
        if (frVar == fr.iW) {
            throw new UnsupportedOperationException("KNOWN_NULL is not representable");
        }
        this.WB = frVar;
        this.mb = null;
    }

    public static zq aM(fr frVar) {
        zq zqVar;
        synchronized (jw) {
            zqVar = jw.get(frVar);
            if (zqVar == null) {
                zqVar = new zq(frVar);
                jw.put(frVar, zqVar);
            }
        }
        return zqVar;
    }

    public static zq we(fr frVar) {
        switch (frVar.u7()) {
            case 0:
                return Z1;
            case 1:
                return qp;
            case 2:
                return k2;
            case 3:
                return zh;
            case 4:
                return AL;
            case 5:
                return w9;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return cT;
            case UserTouchAction.CLICK_KIND /* 7 */:
                return hK;
            case 8:
                return q7;
            default:
                throw new IllegalArgumentException("not primitive: " + frVar);
        }
    }

    @Override // abcd.bq
    public int FH(bq bqVar) {
        return this.WB.QX().compareTo(((zq) bqVar).WB.QX());
    }

    public fr J0() {
        return this.WB;
    }

    public yq QX() {
        if (this.mb == null) {
            this.mb = new yq(this.WB.QX());
        }
        return this.mb;
    }

    @Override // abcd.kt
    public String Zo() {
        return this.WB.Zo();
    }

    public boolean equals(Object obj) {
        return (obj instanceof zq) && this.WB == ((zq) obj).WB;
    }

    public int hashCode() {
        return this.WB.hashCode();
    }

    @Override // abcd.gr
    public fr j6() {
        return fr.e3;
    }

    public String toString() {
        return "type{" + Zo() + '}';
    }

    @Override // abcd.bq
    public String tp() {
        return AppMeasurement.Param.TYPE;
    }

    @Override // abcd.bq
    public boolean v5() {
        return false;
    }
}
