package groovyjarjarantlr;

/* loaded from: classes.dex */
public abstract class InputBuffer {
    protected int j6 = 0;
    protected int DW = 0;
    protected int FH = 0;
    protected CharQueue Hw = new CharQueue(1);

    public void DW() {
        this.FH++;
    }

    public abstract void FH(int i);

    public int Hw() {
        Zo();
        this.j6++;
        return this.DW;
    }

    protected void Zo() {
        while (this.FH > 0) {
            if (this.j6 > 0) {
                this.DW++;
            } else {
                this.Hw.v5();
            }
            this.FH--;
        }
    }

    public char j6(int i) {
        FH(i);
        return this.Hw.DW((this.DW + i) - 1);
    }

    public void v5(int i) {
        Zo();
        this.DW = i;
        this.j6--;
    }
}
