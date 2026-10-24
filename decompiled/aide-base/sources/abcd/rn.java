package abcd;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class rn extends jn {
    public rn(String str, km kmVar, int i) {
        super(str, kmVar, i);
    }

    @Override // abcd.jn
    public final int DW(wm wmVar) {
        vm vmVar = (vm) wmVar;
        return FH(vmVar.u7() * vmVar.v5());
    }

    @Override // abcd.jn
    public final int J8() {
        Collection<? extends wm> collectionVH = VH();
        int size = collectionVH.size();
        if (size == 0) {
            return 0;
        }
        return size * collectionVH.iterator().next().v5();
    }

    @Override // abcd.jn
    public final void QX(ls lsVar) {
        km kmVarV5 = v5();
        int iHw = Hw();
        Iterator<? extends wm> it = VH().iterator();
        while (it.hasNext()) {
            it.next().Zo(kmVarV5, lsVar);
            lsVar.we(iHw);
        }
    }

    public abstract void XL();

    @Override // abcd.jn
    public final void u7() {
        km kmVarV5 = v5();
        XL();
        Iterator<? extends wm> it = VH().iterator();
        while (it.hasNext()) {
            it.next().j6(kmVarV5);
        }
    }
}
