package com.google.android.gms.common.api.internal;

import abcd.hw;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.b;

/* loaded from: classes.dex */
public final class d0 extends c0<Boolean> {
    private final f<?> DW;

    public d0(f<?> fVar, hw<Boolean> hwVar) {
        super(4, hwVar);
        this.DW = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final /* bridge */ /* synthetic */ void Hw(i iVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final Feature[] VH(b.a<?> aVar) {
        u uVar = aVar.U2().get(this.DW);
        if (uVar == null) {
            return null;
        }
        return uVar.j6.DW();
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final boolean gn(b.a<?> aVar) {
        u uVar = aVar.U2().get(this.DW);
        if (uVar == null) {
            return false;
        }
        uVar.j6.Hw();
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.c0
    public final void u7(b.a<?> aVar) {
        u uVarRemove = aVar.U2().remove(this.DW);
        if (uVarRemove == null) {
            this.j6.v5(Boolean.FALSE);
        } else {
            uVarRemove.DW.j6(aVar.we(), this.j6);
            uVarRemove.j6.j6();
        }
    }
}
