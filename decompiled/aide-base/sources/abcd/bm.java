package abcd;

import abcd.eq;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bm {
    private static final zq j6 = zq.aM(fr.a8("Ldalvik/annotation/AnnotationDefault;"));
    private static final zq DW = zq.aM(fr.a8("Ldalvik/annotation/EnclosingClass;"));
    private static final zq FH = zq.aM(fr.a8("Ldalvik/annotation/EnclosingMethod;"));
    private static final zq Hw = zq.aM(fr.a8("Ldalvik/annotation/InnerClass;"));
    private static final zq v5 = zq.aM(fr.a8("Ldalvik/annotation/MemberClasses;"));
    private static final zq Zo = zq.aM(fr.a8("Ldalvik/annotation/Signature;"));
    private static final zq VH = zq.aM(fr.a8("Ldalvik/annotation/Throws;"));
    private static final yq gn = new yq("accessFlags");
    private static final yq u7 = new yq(AppMeasurementSdk.ConditionalUserProperty.NAME);
    private static final yq tp = new yq(AppMeasurementSdk.ConditionalUserProperty.VALUE);

    private static eq DW(hr hrVar) {
        int size = hrVar.size();
        eq.a aVar = new eq.a(size);
        for (int i = 0; i < size; i++) {
            aVar.ef(i, zq.aM(hrVar.v5(i)));
        }
        aVar.Mr();
        return new eq(aVar);
    }

    public static wo FH(zq zqVar) {
        wo woVar = new wo(DW, xo.SYSTEM);
        woVar.sh(new ap(tp, zqVar));
        woVar.Mr();
        return woVar;
    }

    public static wo Hw(vq vqVar) {
        wo woVar = new wo(FH, xo.SYSTEM);
        woVar.sh(new ap(tp, vqVar));
        woVar.Mr();
        return woVar;
    }

    public static wo VH(yq yqVar) {
        wo woVar = new wo(Zo, xo.SYSTEM);
        String strJ0 = yqVar.J0();
        int length = strJ0.length();
        ArrayList arrayList = new ArrayList(20);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (strJ0.charAt(i) == 'L') {
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    char cCharAt = strJ0.charAt(i2);
                    if (cCharAt == ';') {
                        i2++;
                        break;
                    }
                    if (cCharAt == '<') {
                        break;
                    }
                    i2++;
                }
            } else {
                while (i2 < length && strJ0.charAt(i2) != 'L') {
                    i2++;
                }
            }
            arrayList.add(strJ0.substring(i, i2));
            i = i2;
        }
        int size = arrayList.size();
        eq.a aVar = new eq.a(size);
        for (int i3 = 0; i3 < size; i3++) {
            aVar.ef(i3, new yq((String) arrayList.get(i3)));
        }
        aVar.Mr();
        woVar.sh(new ap(tp, new eq(aVar)));
        woVar.Mr();
        return woVar;
    }

    public static wo Zo(hr hrVar) {
        eq eqVarDW = DW(hrVar);
        wo woVar = new wo(v5, xo.SYSTEM);
        woVar.sh(new ap(tp, eqVarDW));
        woVar.Mr();
        return woVar;
    }

    public static wo gn(hr hrVar) {
        eq eqVarDW = DW(hrVar);
        wo woVar = new wo(VH, xo.SYSTEM);
        woVar.sh(new ap(tp, eqVarDW));
        woVar.Mr();
        return woVar;
    }

    public static wo j6(wo woVar) {
        wo woVar2 = new wo(j6, xo.SYSTEM);
        woVar2.sh(new ap(tp, new dq(woVar)));
        woVar2.Mr();
        return woVar2;
    }

    public static wo v5(yq yqVar, int i) {
        wo woVar = new wo(Hw, xo.SYSTEM);
        bq bqVar = yqVar;
        if (yqVar == null) {
            bqVar = pq.WB;
        }
        woVar.sh(new ap(u7, bqVar));
        woVar.sh(new ap(gn, nq.yS(i)));
        woVar.Mr();
        return woVar;
    }
}
