package abcd;

/* loaded from: classes.dex */
public abstract class xr {
    public abstract qp DW(qp qpVar);

    public final rp FH(rp rpVar) {
        int size = rpVar.size();
        rp rpVar2 = new rp(size);
        for (int i = 0; i < size; i++) {
            rpVar2.Mz(i, DW(rpVar.sG(i)));
        }
        rpVar2.Mr();
        return rpVar2.equals(rpVar) ? rpVar : rpVar2;
    }

    public abstract int j6();
}
