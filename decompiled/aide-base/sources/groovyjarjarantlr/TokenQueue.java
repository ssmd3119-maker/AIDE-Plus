package groovyjarjarantlr;

/* loaded from: classes.dex */
public class TokenQueue {
    private int DW;
    private int FH;
    protected int Hw;
    private Token[] j6;

    public TokenQueue(int i) {
        if (i < 0) {
            Hw(16);
            return;
        }
        if (i >= 1073741823) {
            Hw(Integer.MAX_VALUE);
            return;
        }
        int i2 = 2;
        while (i2 < i) {
            i2 *= 2;
        }
        Hw(i2);
    }

    private final void FH() {
        Token[] tokenArr = new Token[this.j6.length * 2];
        for (int i = 0; i < this.j6.length; i++) {
            tokenArr[i] = DW(i);
        }
        this.j6 = tokenArr;
        this.DW = tokenArr.length - 1;
        this.FH = 0;
    }

    private final void Hw(int i) {
        this.j6 = new Token[i];
        this.DW = i - 1;
        this.FH = 0;
        this.Hw = 0;
    }

    public final Token DW(int i) {
        return this.j6[this.DW & (this.FH + i)];
    }

    public final void j6(Token token) {
        if (this.Hw == this.j6.length) {
            FH();
        }
        Token[] tokenArr = this.j6;
        int i = this.FH;
        int i2 = this.Hw;
        tokenArr[(i + i2) & this.DW] = token;
        this.Hw = i2 + 1;
    }

    public final void v5() {
        this.FH = (this.FH + 1) & this.DW;
        this.Hw--;
    }
}
