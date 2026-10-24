package abcd;

/* loaded from: classes.dex */
public class dt extends ws {
    private final at jw;

    public dt(int i) {
        super(i);
        this.jw = new at(i);
    }

    private void g3(int i) {
        this.jw.g3(i, -1);
    }

    private void sG(int i, int i2) {
        int size = this.jw.size();
        for (int i3 = 0; i3 <= i - size; i3++) {
            this.jw.BT(-1);
        }
        this.jw.g3(i, i2);
    }

    private void vJ() {
        int size = size();
        for (int i = 0; i < size; i++) {
            ct ctVar = (ct) BT(i);
            if (ctVar != null) {
                this.jw.g3(ctVar.j6(), i);
            }
        }
    }

    public void Mz(int i, ct ctVar) {
        ct ctVar2 = (ct) vy(i);
        KD(i, ctVar);
        if (ctVar2 != null) {
            g3(ctVar2.j6());
        }
        if (ctVar != null) {
            sG(ctVar.j6(), i);
        }
    }

    public final int Sf(int i) {
        if (i >= this.jw.size()) {
            return -1;
        }
        return this.jw.ro(i);
    }

    public final int ef() {
        int size = this.jw.size() - 1;
        while (size >= 0 && this.jw.ro(size) < 0) {
            size--;
        }
        int i = size + 1;
        this.jw.Mz(i);
        return i;
    }

    @Override // abcd.ws
    public void ro() {
        super.ro();
        vJ();
    }

    public dt(dt dtVar) {
        super(dtVar.size());
        this.jw = dtVar.jw.ef();
        int size = dtVar.size();
        for (int i = 0; i < size; i++) {
            Object objBT = dtVar.BT(i);
            if (objBT != null) {
                KD(i, objBT);
            }
        }
    }
}
