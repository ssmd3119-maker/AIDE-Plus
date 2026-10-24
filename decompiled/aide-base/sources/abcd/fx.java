package abcd;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzan;
import com.google.android.gms.measurement.internal.zzbw;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class fx implements ex {
    private static volatile ex DW;
    private final AppMeasurement j6;

    private fx(AppMeasurement appMeasurement) {
        p.u7(appMeasurement);
        this.j6 = appMeasurement;
        new ConcurrentHashMap();
    }

    public static final /* synthetic */ void DW(ix ixVar) {
        boolean z = ((bx) ixVar.j6()).j6;
        synchronized (fx.class) {
            ((fx) DW).j6.zzd(z);
        }
    }

    public static ex j6(cx cxVar, Context context, lx lxVar) {
        p.u7(cxVar);
        p.u7(context);
        p.u7(lxVar);
        p.u7(context.getApplicationContext());
        if (DW == null) {
            synchronized (fx.class) {
                if (DW == null) {
                    Bundle bundle = new Bundle(1);
                    if (cxVar.tp()) {
                        lxVar.DW(bx.class, gx.j6, hx.j6);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cxVar.u7());
                    }
                    DW = new fx(zzbw.zza(context, zzan.zzc(bundle)).zzkm());
                }
            }
        }
        return DW;
    }
}
