package abcd;

/* loaded from: classes.dex */
public class j90 extends o90 {
    public j90(j60 j60Var) {
        super(j60Var);
    }

    @Override // abcd.o90
    public void OW(t90 t90Var) throws q40 {
        if (!t90Var.mb.EQ(this)) {
            throw new q40(this, aj());
        }
        this.cT |= 1;
    }

    @Override // abcd.o90
    public final int aj() {
        return 3;
    }
}
