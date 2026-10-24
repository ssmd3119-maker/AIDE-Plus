package abcd;

/* loaded from: classes.dex */
public final class sm extends vm {
    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_HEADER_ITEM;
    }

    @Override // abcd.wm
    public void Zo(km kmVar, ls lsVar) {
        int iZo = kmVar.J0().Zo();
        jn jnVarEQ = kmVar.EQ();
        jn jnVarWe = kmVar.we();
        int iZo2 = jnVarEQ.Zo();
        int iZo3 = (jnVarWe.Zo() + jnVarWe.J8()) - iZo2;
        String strDW = kmVar.gn().DW();
        if (lsVar.EQ()) {
            lsVar.Hw(8, "magic: " + new yq(strDW).yS());
            lsVar.Hw(4, "checksum");
            lsVar.Hw(20, "signature");
            lsVar.Hw(4, "file_size:       " + xs.tp(kmVar.tp()));
            lsVar.Hw(4, "header_size:     " + xs.tp(112));
            lsVar.Hw(4, "endian_tag:      " + xs.tp(305419896));
            lsVar.Hw(4, "link_size:       0");
            lsVar.Hw(4, "link_off:        0");
            lsVar.Hw(4, "map_off:         " + xs.tp(iZo));
        }
        for (int i = 0; i < 8; i++) {
            lsVar.writeByte(strDW.charAt(i));
        }
        lsVar.v5(24);
        lsVar.writeInt(kmVar.tp());
        lsVar.writeInt(112);
        lsVar.writeInt(305419896);
        lsVar.v5(8);
        lsVar.writeInt(iZo);
        kmVar.aM().a8(lsVar);
        kmVar.j3().lg(lsVar);
        kmVar.Ws().Mr(lsVar);
        kmVar.u7().U2(lsVar);
        kmVar.J8().U2(lsVar);
        kmVar.VH().Mr(lsVar);
        if (lsVar.EQ()) {
            lsVar.Hw(4, "data_size:       " + xs.tp(iZo3));
            lsVar.Hw(4, "data_off:        " + xs.tp(iZo2));
        }
        lsVar.writeInt(iZo3);
        lsVar.writeInt(iZo2);
    }

    @Override // abcd.wm
    public void j6(km kmVar) {
    }

    @Override // abcd.wm
    public int v5() {
        return 112;
    }
}
