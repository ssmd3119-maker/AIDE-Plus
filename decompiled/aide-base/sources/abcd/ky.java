package abcd;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class ky {
    public int DW;
    public ly[] EQ;
    public int FH;
    public boolean Hw;
    public int VH;
    public boolean Zo;
    public int gn;
    public int j6;
    public int tp;
    public int u7;
    public boolean v5;

    public ky(int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, int i5, int i6, int i7, ly... lyVarArr) {
        this.j6 = i;
        this.DW = i2;
        this.FH = i3;
        this.Hw = z;
        this.v5 = z2;
        this.Zo = z3;
        this.VH = i4;
        this.gn = i5;
        this.u7 = i6;
        this.tp = i7;
        ArrayList arrayList = new ArrayList();
        for (ly lyVar : lyVarArr) {
            if (lyVar != null && lyVar.FH > 0 && lyVar.Hw > 0) {
                arrayList.add(lyVar);
            }
        }
        this.EQ = (ly[]) arrayList.toArray(new ly[arrayList.size()]);
    }
}
