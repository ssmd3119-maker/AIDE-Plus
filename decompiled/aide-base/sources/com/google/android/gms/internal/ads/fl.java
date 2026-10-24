package com.google.android.gms.internal.ads;

import android.content.Context;

@jg
/* loaded from: classes.dex */
public final class fl implements kl {
    private ll j6;

    public fl(ll llVar) {
        this.j6 = llVar;
    }

    @Override // com.google.android.gms.internal.ads.kl
    public final jl j6(Context context, zzbbi zzbbiVar, zzasm zzasmVar) {
        if (zzasmVar.Za == null) {
            return null;
        }
        return new zk(context, zzbbiVar, zzasmVar.Za, zzasmVar.jw, this.j6);
    }
}
