package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@jg
/* loaded from: classes.dex */
public final class mm implements zr0 {
    private final vm DW;
    private final im Hw;
    private final Object j6 = new Object();
    private final HashSet<am> v5 = new HashSet<>();
    private final HashSet<lm> Zo = new HashSet<>();
    private final km FH = new km();

    public mm(String str, vm vmVar) {
        this.Hw = new im(str, vmVar);
        this.DW = vmVar;
    }

    public final Bundle DW(Context context, jm jmVar) {
        HashSet<am> hashSet = new HashSet<>();
        synchronized (this.j6) {
            hashSet.addAll(this.v5);
            this.v5.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.Hw.FH(context, this.FH.DW()));
        Bundle bundle2 = new Bundle();
        Iterator<lm> it = this.Zo.iterator();
        while (it.hasNext()) {
            lm next = it.next();
            bundle2.putBundle(next.FH(), next.j6());
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<am> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().j6());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        jmVar.s0(hashSet);
        return bundle;
    }

    public final am FH(com.google.android.gms.common.util.e eVar, String str) {
        return new am(eVar, this, this.FH.j6(), str);
    }

    public final void Hw(lm lmVar) {
        synchronized (this.j6) {
            this.Zo.add(lmVar);
        }
    }

    public final void VH(HashSet<am> hashSet) {
        synchronized (this.j6) {
            this.v5.addAll(hashSet);
        }
    }

    public final void Zo(zzwb zzwbVar, long j) {
        synchronized (this.j6) {
            this.Hw.DW(zzwbVar, j);
        }
    }

    public final void gn() {
        synchronized (this.j6) {
            this.Hw.Hw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zr0
    public final void j6(boolean z) {
        long jJ6 = com.google.android.gms.ads.internal.w0.we().j6();
        if (!z) {
            this.DW.DW(jJ6);
            this.DW.Ws(this.Hw.Hw);
            return;
        }
        if (jJ6 - this.DW.yS() > ((Long) cw0.v5().FH(p.ye)).longValue()) {
            this.Hw.Hw = -1;
        } else {
            this.Hw.Hw = this.DW.a8();
        }
    }

    public final void u7() {
        synchronized (this.j6) {
            this.Hw.v5();
        }
    }

    public final void v5(am amVar) {
        synchronized (this.j6) {
            this.v5.add(amVar);
        }
    }
}
