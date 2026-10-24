package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@jg
/* loaded from: classes.dex */
public final class tb extends db {
    private final com.google.android.gms.ads.mediation.l WB;

    public tb(com.google.android.gms.ads.mediation.l lVar) {
        this.WB = lVar;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final List DW() {
        List<a.b> listGn = this.WB.gn();
        ArrayList arrayList = new ArrayList();
        if (listGn != null) {
            for (a.b bVar : listGn) {
                arrayList.add(new u0(bVar.j6(), bVar.FH(), bVar.DW()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String FH() {
        return this.WB.Zo();
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final a2 Hw() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void I(abcd.wu wuVar, abcd.wu wuVar2, abcd.wu wuVar3) {
        this.WB.vy((View) abcd.xu.g3(wuVar), (HashMap) abcd.xu.g3(wuVar2), (HashMap) abcd.xu.g3(wuVar3));
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final boolean Qq() {
        return this.WB.u7();
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void Sf(abcd.wu wuVar) {
        this.WB.Ws((View) abcd.xu.g3(wuVar));
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void VH() {
        this.WB.XL();
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String Zo() {
        return this.WB.Hw();
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final double a8() {
        if (this.WB.we() != null) {
            return this.WB.we().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String aM() {
        return this.WB.EQ();
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final abcd.wu cb() {
        View viewJ6 = this.WB.j6();
        if (viewJ6 == null) {
            return null;
        }
        return abcd.xu.sy(viewJ6);
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final boolean cn() {
        return this.WB.tp();
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String er() {
        return this.WB.DW();
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final yx0 getVideoController() {
        if (this.WB.J8() != null) {
            return this.WB.J8().FH();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String gn() {
        return this.WB.FH();
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final f2 j3() {
        a.b bVarVH = this.WB.VH();
        if (bVarVH != null) {
            return new u0(bVarVH.j6(), bVarVH.FH(), bVarVH.DW());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final abcd.wu ro() {
        View viewNw = this.WB.nw();
        if (viewNw == null) {
            return null;
        }
        return abcd.xu.sy(viewNw);
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final Bundle tp() {
        return this.WB.v5();
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final abcd.wu v5() {
        Object objSI = this.WB.SI();
        if (objSI == null) {
            return null;
        }
        return abcd.xu.sy(objSI);
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void x9(abcd.wu wuVar) {
        this.WB.P8((View) abcd.xu.g3(wuVar));
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String yS() {
        return this.WB.J0();
    }
}
