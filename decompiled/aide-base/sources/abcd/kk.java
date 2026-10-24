package abcd;

/* loaded from: classes.dex */
public final class kk extends uk {
    public kk(wp wpVar) {
        super(wpVar, rp.jw);
    }

    @Override // abcd.zj
    public int DW() {
        return Zo() & 1;
    }

    @Override // abcd.zj
    public String XL(boolean z) {
        if (DW() == 0) {
            return null;
        }
        return "nop // spacer";
    }

    @Override // abcd.zj
    public zj a8(rp rpVar) {
        return new kk(EQ());
    }

    @Override // abcd.zj
    public String j6() {
        return null;
    }

    @Override // abcd.zj
    public void lg(ls lsVar) {
        if (DW() != 0) {
            lsVar.writeShort(fk.v5(0, 0));
        }
    }
}
