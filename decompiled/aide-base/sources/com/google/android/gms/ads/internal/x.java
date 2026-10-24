package com.google.android.gms.ads.internal;

import abcd.xu;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.wa;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.za;
import java.util.Map;

/* loaded from: classes.dex */
public final class x implements com.google.android.gms.ads.internal.gmsg.b0<cv> {
    private final /* synthetic */ c DW;
    private final /* synthetic */ za FH;
    private final /* synthetic */ wa j6;

    x(wa waVar, c cVar, za zaVar) {
        this.j6 = waVar;
        this.DW = cVar;
        this.FH = zaVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(cv cvVar, Map map) {
        cv cvVar2 = cvVar;
        View view = cvVar2.getView();
        if (view != null) {
            try {
                if (this.j6 != null) {
                    if (this.j6.Qq()) {
                        s.u7(cvVar2);
                        return;
                    } else {
                        this.j6.Sf(xu.sy(view));
                        this.DW.j6.EQ();
                        return;
                    }
                }
                if (this.FH != null) {
                    if (this.FH.Qq()) {
                        s.u7(cvVar2);
                    } else {
                        this.FH.Sf(xu.sy(view));
                        this.DW.j6.EQ();
                    }
                }
            } catch (RemoteException e) {
                xp.v5("Unable to call handleClick on mapper", e);
            }
        }
    }
}
