package abcd;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class an extends rn {
    public an(String str, km kmVar) {
        super(str, kmVar, 4);
    }

    @Override // abcd.rn
    public void XL() {
        Iterator<? extends wm> it = VH().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((zm) it.next()).J0(i);
            i++;
        }
    }
}
