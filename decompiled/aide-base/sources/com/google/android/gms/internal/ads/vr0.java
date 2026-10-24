package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class vr0 {
    private int DW;
    private final Object j6 = new Object();
    private List<ur0> FH = new LinkedList();

    public final boolean DW(ur0 ur0Var) {
        synchronized (this.j6) {
            Iterator<ur0> it = this.FH.iterator();
            while (it.hasNext()) {
                ur0 next = it.next();
                if (com.google.android.gms.ads.internal.w0.u7().a8().er()) {
                    if (!com.google.android.gms.ads.internal.w0.u7().a8().QX() && ur0Var != next && next.tp().equals(ur0Var.tp())) {
                        it.remove();
                        return true;
                    }
                } else if (ur0Var != next && next.gn().equals(ur0Var.gn())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void FH(ur0 ur0Var) {
        synchronized (this.j6) {
            if (this.FH.size() >= 10) {
                int size = this.FH.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                xp.VH(sb.toString());
                this.FH.remove(0);
            }
            int i = this.DW;
            this.DW = i + 1;
            ur0Var.v5(i);
            this.FH.add(ur0Var);
        }
    }

    public final ur0 Hw() {
        synchronized (this.j6) {
            ur0 ur0Var = null;
            if (this.FH.size() == 0) {
                xp.VH("Queue empty");
                return null;
            }
            int i = 0;
            if (this.FH.size() < 2) {
                ur0 ur0Var2 = this.FH.get(0);
                ur0Var2.EQ();
                return ur0Var2;
            }
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            for (ur0 ur0Var3 : this.FH) {
                int iJ6 = ur0Var3.j6();
                if (iJ6 > i2) {
                    i = i3;
                    ur0Var = ur0Var3;
                    i2 = iJ6;
                }
                i3++;
            }
            this.FH.remove(i);
            return ur0Var;
        }
    }

    public final boolean j6(ur0 ur0Var) {
        synchronized (this.j6) {
            return this.FH.contains(ur0Var);
        }
    }
}
