package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

@jg
/* loaded from: classes.dex */
public final class io {
    private final double[] DW;
    private final double[] FH;
    private final int[] Hw;
    private final String[] j6;
    private int v5;

    private io(lo loVar) {
        int size = loVar.DW.size();
        this.j6 = (String[]) loVar.j6.toArray(new String[size]);
        this.DW = FH(loVar.DW);
        this.FH = FH(loVar.FH);
        this.Hw = new int[size];
        this.v5 = 0;
    }

    private static double[] FH(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    public final List<ko> DW() {
        ArrayList arrayList = new ArrayList(this.j6.length);
        int i = 0;
        while (true) {
            String[] strArr = this.j6;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d = this.FH[i];
            double d2 = this.DW[i];
            int[] iArr = this.Hw;
            double d3 = iArr[i];
            double d4 = this.v5;
            Double.isNaN(d3);
            Double.isNaN(d4);
            arrayList.add(new ko(str, d, d2, d3 / d4, iArr[i]));
            i++;
        }
    }

    public final void j6(double d) {
        this.v5++;
        int i = 0;
        while (true) {
            double[] dArr = this.FH;
            if (i >= dArr.length) {
                return;
            }
            if (dArr[i] <= d && d < this.DW[i]) {
                int[] iArr = this.Hw;
                iArr[i] = iArr[i] + 1;
            }
            if (d < this.FH[i]) {
                return;
            } else {
                i++;
            }
        }
    }
}
