package groovyjarjarantlr;

/* loaded from: classes.dex */
public class TokenBuffer {
    protected TokenStream j6;
    int DW = 0;
    int FH = 0;
    int Hw = 0;
    TokenQueue v5 = new TokenQueue(1);

    public TokenBuffer(TokenStream tokenStream) {
        this.j6 = tokenStream;
    }

    private final void Hw(int i) {
        VH();
        while (true) {
            TokenQueue tokenQueue = this.v5;
            if (tokenQueue.Hw >= this.FH + i) {
                return;
            } else {
                tokenQueue.j6(this.j6.j6());
            }
        }
    }

    private final void VH() {
        while (this.Hw > 0) {
            if (this.DW > 0) {
                this.FH++;
            } else {
                this.v5.v5();
            }
            this.Hw--;
        }
    }

    public final Token DW(int i) {
        Hw(i);
        return this.v5.DW((this.FH + i) - 1);
    }

    public final void FH() {
        this.Hw++;
    }

    public final void Zo(int i) {
        VH();
        this.FH = i;
        this.DW--;
    }

    public final int j6(int i) {
        Hw(i);
        return this.v5.DW((this.FH + i) - 1).Hw();
    }

    public final int v5() {
        VH();
        this.DW++;
        return this.FH;
    }
}
