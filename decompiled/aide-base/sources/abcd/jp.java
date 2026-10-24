package abcd;

import abcd.ip;

/* loaded from: classes.dex */
public final class jp extends ws {
    public jp(int i) {
        super(i);
    }

    public ip Sf(int i) {
        return (ip) BT(i);
    }

    public void ef(ip.b bVar) {
        int size = size();
        for (int i = 0; i < size; i++) {
            Sf(i).DW(bVar);
        }
    }

    public void g3(int i, ip ipVar) {
        KD(i, ipVar);
    }

    public boolean sG(jp jpVar) {
        int size;
        if (jpVar == null || (size = size()) != jpVar.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!Sf(i).Hw(jpVar.Sf(i))) {
                return false;
            }
        }
        return true;
    }

    public ip vJ() {
        return Sf(size() - 1);
    }
}
