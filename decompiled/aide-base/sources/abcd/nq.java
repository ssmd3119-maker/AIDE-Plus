package abcd;

/* loaded from: classes.dex */
public final class nq extends qq {
    private static final nq[] mb = new nq[511];
    public static final nq jw = yS(-1);
    public static final nq fY = yS(0);
    public static final nq qp = yS(1);
    public static final nq k2 = yS(2);
    public static final nq zh = yS(3);
    public static final nq AL = yS(4);
    public static final nq w9 = yS(5);

    private nq(int i) {
        super(i);
    }

    public static nq yS(int i) {
        nq[] nqVarArr = mb;
        int length = (Integer.MAX_VALUE & i) % nqVarArr.length;
        nq nqVar = nqVarArr[length];
        if (nqVar != null && nqVar.a8() == i) {
            return nqVar;
        }
        nq nqVar2 = new nq(i);
        mb[length] = nqVar2;
        return nqVar2;
    }

    @Override // abcd.kt
    public String Zo() {
        return Integer.toString(aM());
    }

    public int a8() {
        return aM();
    }

    @Override // abcd.gr
    public fr j6() {
        return fr.n5;
    }

    public String toString() {
        int iAM = aM();
        return "int{0x" + xs.tp(iAM) + " / " + iAM + '}';
    }

    @Override // abcd.bq
    public String tp() {
        return "int";
    }
}
