package abcd;

import abcd.ip;

/* loaded from: classes.dex */
public final class dp extends dt {
    private int fY;

    private static class a implements ip.b {
        private int j6 = 0;

        private void gn(qp qpVar) {
            int iAM = qpVar.aM();
            if (iAM > this.j6) {
                this.j6 = iAM;
            }
        }

        private void u7(ip ipVar) {
            qp qpVarJ0 = ipVar.J0();
            if (qpVarJ0 != null) {
                gn(qpVarJ0);
            }
            rp rpVarJ8 = ipVar.J8();
            int size = rpVarJ8.size();
            for (int i = 0; i < size; i++) {
                gn(rpVarJ8.sG(i));
            }
        }

        @Override // abcd.ip.b
        public void DW(np npVar) {
            u7(npVar);
        }

        @Override // abcd.ip.b
        public void FH(yp ypVar) {
            u7(ypVar);
        }

        @Override // abcd.ip.b
        public void Hw(zp zpVar) {
            u7(zpVar);
        }

        public int VH() {
            return this.j6;
        }

        @Override // abcd.ip.b
        public void Zo(hp hpVar) {
            u7(hpVar);
        }

        @Override // abcd.ip.b
        public void j6(op opVar) {
            u7(opVar);
        }

        @Override // abcd.ip.b
        public void v5(xp xpVar) {
            u7(xpVar);
        }
    }

    public dp(int i) {
        super(i);
        this.fY = -1;
    }

    public void I(ip.b bVar) {
        int size = size();
        for (int i = 0; i < size; i++) {
            ca(i).Hw().ef(bVar);
        }
    }

    public cp OW(cp cpVar) {
        int iZo = cpVar.Zo();
        at atVarGn = cpVar.gn();
        int size = atVarGn.size();
        if (size != 0) {
            return size != 1 ? iZo != -1 ? lp(iZo) : lp(atVarGn.ro(0)) : lp(atVarGn.ro(0));
        }
        return null;
    }

    public int Qq() {
        int size = size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            cp cpVar = (cp) vy(i);
            if (cpVar != null) {
                size2 += cpVar.Hw().size();
            }
        }
        return size2;
    }

    public int aj() {
        if (this.fY == -1) {
            a aVar = new a();
            I(aVar);
            this.fY = aVar.VH();
        }
        return this.fY;
    }

    public void br(int i, cp cpVar) {
        super.Mz(i, cpVar);
        this.fY = -1;
    }

    public cp ca(int i) {
        return (cp) BT(i);
    }

    public cp lp(int i) {
        int iSf = Sf(i);
        if (iSf >= 0) {
            return ca(iSf);
        }
        throw new IllegalArgumentException("no such label: " + xs.VH(i));
    }

    public dp sy() {
        return new dp(this);
    }

    public int x9() {
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            cp cpVar = (cp) vy(i2);
            if (cpVar != null) {
                jp jpVarHw = cpVar.Hw();
                int size2 = jpVarHw.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (jpVarHw.Sf(i3).EQ().Hw() != 54) {
                        i++;
                    }
                }
            }
        }
        return i;
    }

    private dp(dp dpVar) {
        super(dpVar);
        this.fY = dpVar.fY;
    }
}
