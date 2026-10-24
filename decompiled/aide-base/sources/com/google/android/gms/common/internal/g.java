package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import java.util.Iterator;
import java.util.Set;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* loaded from: classes.dex */
public abstract class g<T extends IInterface> extends c<T> implements a.f {
    private final Account DW;
    private final Set<Scope> j6;

    /* JADX WARN: Illegal instructions before constructor call */
    protected g(Context context, Looper looper, int i, d dVar, com.google.android.gms.common.api.f fVar, com.google.android.gms.common.api.g gVar) {
        h hVarJ6 = h.j6(context);
        com.google.android.gms.common.b bVarWs = com.google.android.gms.common.b.Ws();
        p.u7(fVar);
        p.u7(gVar);
        this(context, looper, hVarJ6, bVarWs, i, dVar, fVar, gVar);
    }

    private final Set<Scope> VH(Set<Scope> set) {
        Hw(set);
        Iterator<Scope> it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    private static c.b Zo(com.google.android.gms.common.api.g gVar) {
        if (gVar == null) {
            return null;
        }
        return new w(gVar);
    }

    private static c.a v5(com.google.android.gms.common.api.f fVar) {
        if (fVar == null) {
            return null;
        }
        return new v(fVar);
    }

    protected Set<Scope> Hw(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.internal.c
    public final Account getAccount() {
        return this.DW;
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    @Override // com.google.android.gms.common.internal.c
    protected final Set<Scope> getScopes() {
        return this.j6;
    }

    protected g(Context context, Looper looper, h hVar, com.google.android.gms.common.b bVar, int i, d dVar, com.google.android.gms.common.api.f fVar, com.google.android.gms.common.api.g gVar) {
        super(context, looper, hVar, bVar, i, v5(fVar), Zo(gVar), dVar.v5());
        this.DW = dVar.j6();
        Set<Scope> setFH = dVar.FH();
        VH(setFH);
        this.j6 = setFH;
    }
}
