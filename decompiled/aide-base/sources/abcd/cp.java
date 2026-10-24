package abcd;

/* loaded from: classes.dex */
public final class cp implements ct {
    private final jp DW;
    private final at FH;
    private final int Hw;
    private final int j6;

    public interface a {
        void j6(cp cpVar);
    }

    public cp(int i, jp jpVar, at atVar, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        try {
            jpVar.yS();
            int size = jpVar.size();
            if (size == 0) {
                throw new IllegalArgumentException("insns.size() == 0");
            }
            for (int i3 = size - 2; i3 >= 0; i3--) {
                if (jpVar.Sf(i3).EQ().DW() != 1) {
                    throw new IllegalArgumentException("insns[" + i3 + "] is a branch or can throw");
                }
            }
            if (jpVar.Sf(size - 1).EQ().DW() == 1) {
                throw new IllegalArgumentException("insns does not end with a branch or throwing instruction");
            }
            try {
                atVar.yS();
                if (i2 < -1) {
                    throw new IllegalArgumentException("primarySuccessor < -1");
                }
                if (i2 < 0 || atVar.KD(i2)) {
                    this.j6 = i;
                    this.DW = jpVar;
                    this.FH = atVar;
                    this.Hw = i2;
                    return;
                }
                throw new IllegalArgumentException("primarySuccessor " + i2 + " not in successors " + atVar);
            } catch (NullPointerException unused) {
                throw new NullPointerException("successors == null");
            }
        } catch (NullPointerException unused2) {
            throw new NullPointerException("insns == null");
        }
    }

    public boolean DW() {
        return this.DW.vJ().FH();
    }

    public ip FH() {
        return this.DW.Sf(0);
    }

    public jp Hw() {
        return this.DW;
    }

    public int VH() {
        if (this.FH.size() != 2) {
            throw new UnsupportedOperationException("block doesn't have exactly two successors");
        }
        int iRo = this.FH.ro(0);
        return iRo == this.Hw ? this.FH.ro(1) : iRo;
    }

    public int Zo() {
        return this.Hw;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public at gn() {
        return this.FH;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // abcd.ct
    public int j6() {
        return this.j6;
    }

    public String toString() {
        return '{' + xs.VH(this.j6) + '}';
    }

    public boolean u7() {
        return this.DW.vJ().VH().size() != 0;
    }

    public ip v5() {
        return this.DW.vJ();
    }
}
