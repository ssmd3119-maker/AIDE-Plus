package abcd;

/* loaded from: classes.dex */
public final class qg extends gh {
    private final br DW;

    public qg(br brVar) {
        super("ConstantValue");
        if ((brVar instanceof yq) || (brVar instanceof nq) || (brVar instanceof tq) || (brVar instanceof mq) || (brVar instanceof jq)) {
            this.DW = brVar;
        } else {
            if (brVar != null) {
                throw new IllegalArgumentException("bad type for constantValue");
            }
            throw new NullPointerException("constantValue == null");
        }
    }

    @Override // abcd.ti
    public int DW() {
        return 8;
    }

    public br j6() {
        return this.DW;
    }
}
