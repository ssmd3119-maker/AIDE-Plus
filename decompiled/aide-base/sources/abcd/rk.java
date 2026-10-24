package abcd;

import abcd.vj;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class rk implements tj {
    private final int[] DW;
    private final sj FH;
    private final up j6;

    public rk(up upVar, int[] iArr, sj sjVar) {
        if (upVar == null) {
            throw new NullPointerException("method == null");
        }
        if (iArr == null) {
            throw new NullPointerException("order == null");
        }
        if (sjVar == null) {
            throw new NullPointerException("addresses == null");
        }
        this.j6 = upVar;
        this.DW = iArr;
        this.FH = sjVar;
    }

    public static vj FH(up upVar, int[] iArr, sj sjVar) {
        int length = iArr.length;
        dp dpVarDW = upVar.DW();
        ArrayList arrayList = new ArrayList(length);
        uj ujVar = uj.jw;
        cp cpVar = null;
        cp cpVar2 = null;
        for (int i : iArr) {
            cp cpVarLp = dpVarDW.lp(i);
            if (cpVarLp.DW()) {
                uj ujVarHw = Hw(cpVarLp, sjVar);
                if (ujVar.size() == 0) {
                    cpVar = cpVarLp;
                    cpVar2 = cpVar;
                    ujVar = ujVarHw;
                } else if (ujVar.equals(ujVarHw) && Zo(cpVar, cpVarLp, sjVar)) {
                    cpVar2 = cpVarLp;
                } else {
                    if (ujVar.size() != 0) {
                        arrayList.add(v5(cpVar, cpVar2, ujVar, sjVar));
                    }
                    cpVar = cpVarLp;
                    cpVar2 = cpVar;
                    ujVar = ujVarHw;
                }
            }
        }
        if (ujVar.size() != 0) {
            arrayList.add(v5(cpVar, cpVar2, ujVar, sjVar));
        }
        int size = arrayList.size();
        if (size == 0) {
            return vj.jw;
        }
        vj vjVar = new vj(size);
        for (int i2 = 0; i2 < size; i2++) {
            vjVar.Sf(i2, (vj.a) arrayList.get(i2));
        }
        vjVar.Mr();
        return vjVar;
    }

    private static uj Hw(cp cpVar, sj sjVar) {
        at atVarGn = cpVar.gn();
        int size = atVarGn.size();
        int iZo = cpVar.Zo();
        hr hrVarVH = cpVar.v5().VH();
        int size2 = hrVarVH.size();
        if (size2 == 0) {
            return uj.jw;
        }
        if ((iZo == -1 && size != size2) || (iZo != -1 && (size != size2 + 1 || iZo != atVarGn.ro(size2)))) {
            throw new RuntimeException("shouldn't happen: weird successors list");
        }
        int i = 0;
        while (true) {
            if (i >= size2) {
                break;
            }
            if (hrVarVH.v5(i).equals(fr.sg)) {
                size2 = i + 1;
                break;
            }
            i++;
        }
        uj ujVar = new uj(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ujVar.vJ(i2, new zq(hrVarVH.v5(i2)), sjVar.FH(atVarGn.ro(i2)).Zo());
        }
        ujVar.Mr();
        return ujVar;
    }

    private static boolean Zo(cp cpVar, cp cpVar2, sj sjVar) {
        if (cpVar == null) {
            throw new NullPointerException("start == null");
        }
        if (cpVar2 != null) {
            return sjVar.j6(cpVar2).Zo() - sjVar.DW(cpVar).Zo() <= 65535;
        }
        throw new NullPointerException("end == null");
    }

    private static vj.a v5(cp cpVar, cp cpVar2, uj ujVar, sj sjVar) {
        return new vj.a(sjVar.DW(cpVar).Zo(), sjVar.j6(cpVar2).Zo(), ujVar);
    }

    @Override // abcd.tj
    public vj BT() {
        return FH(this.j6, this.DW, this.FH);
    }

    @Override // abcd.tj
    public HashSet<fr> DW() {
        HashSet<fr> hashSet = new HashSet<>(20);
        dp dpVarDW = this.j6.DW();
        int size = dpVarDW.size();
        for (int i = 0; i < size; i++) {
            hr hrVarVH = dpVarDW.ca(i).v5().VH();
            int size2 = hrVarVH.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hashSet.add(hrVarVH.v5(i2));
            }
        }
        return hashSet;
    }

    @Override // abcd.tj
    public boolean j6() {
        dp dpVarDW = this.j6.DW();
        int size = dpVarDW.size();
        for (int i = 0; i < size; i++) {
            if (dpVarDW.ca(i).v5().VH().size() != 0) {
                return true;
            }
        }
        return false;
    }
}
