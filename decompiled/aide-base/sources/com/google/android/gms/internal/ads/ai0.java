package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class ai0 extends zh0 {
    public final List<ai0> fN;
    public final List<bi0> pO;
    public final long sg;

    public ai0(int i, long j) {
        super(i);
        this.sg = j;
        this.pO = new ArrayList();
        this.fN = new ArrayList();
    }

    public final void Hw(ai0 ai0Var) {
        this.fN.add(ai0Var);
    }

    public final ai0 VH(int i) {
        int size = this.fN.size();
        for (int i2 = 0; i2 < size; i2++) {
            ai0 ai0Var = this.fN.get(i2);
            if (ai0Var.j6 == i) {
                return ai0Var;
            }
        }
        return null;
    }

    public final bi0 Zo(int i) {
        int size = this.pO.size();
        for (int i2 = 0; i2 < size; i2++) {
            bi0 bi0Var = this.pO.get(i2);
            if (bi0Var.j6 == i) {
                return bi0Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final String toString() {
        String strFH = zh0.FH(this.j6);
        String string = Arrays.toString(this.pO.toArray());
        String string2 = Arrays.toString(this.fN.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(strFH).length() + 22 + String.valueOf(string).length() + String.valueOf(string2).length());
        sb.append(strFH);
        sb.append(" leaves: ");
        sb.append(string);
        sb.append(" containers: ");
        sb.append(string2);
        return sb.toString();
    }

    public final void v5(bi0 bi0Var) {
        this.pO.add(bi0Var);
    }
}
