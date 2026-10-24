package abcd;

/* loaded from: classes.dex */
public final class dj extends ws implements ui {
    public dj(int i) {
        super(i);
    }

    @Override // abcd.ui
    public int DW() {
        int size = size();
        int iDW = 2;
        for (int i = 0; i < size; i++) {
            iDW += sG(i).DW();
        }
        return iDW;
    }

    @Override // abcd.ui
    public ti J0(String str) {
        int size = size();
        for (int i = 0; i < size; i++) {
            ti tiVarSG = sG(i);
            if (tiVarSG.getName().equals(str)) {
                return tiVarSG;
            }
        }
        return null;
    }

    public void ef(int i, ti tiVar) {
        KD(i, tiVar);
    }

    public ti sG(int i) {
        return (ti) BT(i);
    }

    @Override // abcd.ui
    public ti we(ti tiVar) {
        ti tiVarSG;
        int size = size();
        int i = 0;
        while (i < size) {
            if (sG(i) == tiVar) {
                String name = tiVar.getName();
                do {
                    i++;
                    if (i >= size) {
                        return null;
                    }
                    tiVarSG = sG(i);
                } while (!tiVarSG.getName().equals(name));
                return tiVarSG;
            }
            i++;
        }
        return null;
    }
}
