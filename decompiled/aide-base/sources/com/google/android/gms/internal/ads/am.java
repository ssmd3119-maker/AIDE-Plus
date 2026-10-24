package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class am {
    private final mm DW;
    private final String Zo;
    private final com.google.android.gms.common.util.e j6;
    private final String v5;
    private final Object Hw = new Object();

    @GuardedBy("mLock")
    private long VH = -1;

    @GuardedBy("mLock")
    private long gn = -1;

    @GuardedBy("mLock")
    private boolean u7 = false;

    @GuardedBy("mLock")
    private long tp = -1;

    @GuardedBy("mLock")
    private long EQ = 0;

    @GuardedBy("mLock")
    private long we = -1;

    @GuardedBy("mLock")
    private long J0 = -1;

    @GuardedBy("mLock")
    private final LinkedList<bm> FH = new LinkedList<>();

    am(com.google.android.gms.common.util.e eVar, mm mmVar, String str, String str2) {
        this.j6 = eVar;
        this.DW = mmVar;
        this.v5 = str;
        this.Zo = str2;
    }

    public final String EQ() {
        return this.v5;
    }

    public final void FH(boolean z) {
        synchronized (this.Hw) {
            if (this.J0 != -1) {
                long jDW = this.j6.DW();
                this.tp = jDW;
                if (!z) {
                    this.gn = jDW;
                    this.DW.v5(this);
                }
            }
        }
    }

    public final void Hw(boolean z) {
        synchronized (this.Hw) {
            if (this.J0 != -1) {
                this.u7 = z;
                this.DW.v5(this);
            }
        }
    }

    public final void VH(zzwb zzwbVar) {
        synchronized (this.Hw) {
            long jDW = this.j6.DW();
            this.we = jDW;
            this.DW.Zo(zzwbVar, jDW);
        }
    }

    public final void Zo(long j) {
        synchronized (this.Hw) {
            if (this.J0 != -1) {
                this.VH = j;
                this.DW.v5(this);
            }
        }
    }

    public final void gn() {
        synchronized (this.Hw) {
            if (this.J0 != -1 && this.gn == -1) {
                this.gn = this.j6.DW();
                this.DW.v5(this);
            }
            this.DW.gn();
        }
    }

    public final Bundle j6() {
        Bundle bundle;
        synchronized (this.Hw) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.v5);
            bundle.putString("slotid", this.Zo);
            bundle.putBoolean("ismediation", this.u7);
            bundle.putLong("treq", this.we);
            bundle.putLong("tresponse", this.J0);
            bundle.putLong("timp", this.gn);
            bundle.putLong("tload", this.tp);
            bundle.putLong("pcc", this.EQ);
            bundle.putLong("tfetch", this.VH);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<bm> it = this.FH.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().j6());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final void tp() {
        synchronized (this.Hw) {
            if (this.J0 != -1 && !this.FH.isEmpty()) {
                bm last = this.FH.getLast();
                if (last.DW() == -1) {
                    last.FH();
                    this.DW.v5(this);
                }
            }
        }
    }

    public final void u7() {
        synchronized (this.Hw) {
            if (this.J0 != -1) {
                bm bmVar = new bm(this);
                bmVar.Hw();
                this.FH.add(bmVar);
                this.EQ++;
                this.DW.u7();
                this.DW.v5(this);
            }
        }
    }

    public final void v5(long j) {
        synchronized (this.Hw) {
            this.J0 = j;
            if (j != -1) {
                this.DW.v5(this);
            }
        }
    }
}
