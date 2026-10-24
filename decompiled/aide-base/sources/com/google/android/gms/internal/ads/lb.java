package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@jg
/* loaded from: classes.dex */
public final class lb extends ab {
    private final com.google.android.gms.ads.mediation.h WB;

    public lb(com.google.android.gms.ads.mediation.h hVar) {
        this.WB = hVar;
    }

    @Override // com.google.android.gms.internal.ads.za
    public final List DW() {
        List<a.b> listMr = this.WB.Mr();
        if (listMr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (a.b bVar : listMr) {
            arrayList.add(new u0(bVar.j6(), bVar.FH(), bVar.DW()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.za
    public final String FH() {
        return this.WB.j3();
    }

    @Override // com.google.android.gms.internal.ads.za
    public final a2 Hw() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.za
    public final void I(abcd.wu wuVar, abcd.wu wuVar2, abcd.wu wuVar3) {
        this.WB.we((View) abcd.xu.g3(wuVar), (HashMap) abcd.xu.g3(wuVar2), (HashMap) abcd.xu.g3(wuVar3));
    }

    @Override // com.google.android.gms.internal.ads.za
    public final boolean Qq() {
        return this.WB.FH();
    }

    @Override // com.google.android.gms.internal.ads.za
    public final void Sf(abcd.wu wuVar) {
        this.WB.Zo((View) abcd.xu.g3(wuVar));
    }

    @Override // com.google.android.gms.internal.ads.za
    public final f2 TI() {
        a.b bVarU2 = this.WB.U2();
        if (bVarU2 != null) {
            return new u0(bVarU2.j6(), bVarU2.FH(), bVarU2.DW());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.za
    public final void VH() {
        this.WB.gn();
    }

    @Override // com.google.android.gms.internal.ads.za
    public final String Zo() {
        return this.WB.aM();
    }

    @Override // com.google.android.gms.internal.ads.za
    public final abcd.wu cb() {
        View viewJ6 = this.WB.j6();
        if (viewJ6 == null) {
            return null;
        }
        return abcd.xu.sy(viewJ6);
    }

    @Override // com.google.android.gms.internal.ads.za
    public final boolean cn() {
        return this.WB.Hw();
    }

    @Override // com.google.android.gms.internal.ads.za
    public final String er() {
        return this.WB.QX();
    }

    @Override // com.google.android.gms.internal.ads.za
    public final yx0 getVideoController() {
        if (this.WB.v5() != null) {
            return this.WB.v5().FH();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.za
    public final String gn() {
        return this.WB.XL();
    }

    @Override // com.google.android.gms.internal.ads.za
    public final void qP(abcd.wu wuVar) {
        this.WB.EQ((View) abcd.xu.g3(wuVar));
    }

    @Override // com.google.android.gms.internal.ads.za
    public final abcd.wu ro() {
        View viewWs = this.WB.Ws();
        if (viewWs == null) {
            return null;
        }
        return abcd.xu.sy(viewWs);
    }

    @Override // com.google.android.gms.internal.ads.za
    public final Bundle tp() {
        return this.WB.DW();
    }

    @Override // com.google.android.gms.internal.ads.za
    public final abcd.wu v5() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.za
    public final void x9(abcd.wu wuVar) {
        this.WB.J0((View) abcd.xu.g3(wuVar));
    }
}
