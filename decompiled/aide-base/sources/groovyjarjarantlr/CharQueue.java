package groovyjarjarantlr;

/* loaded from: classes.dex */
public class CharQueue {
    private int DW;
    private int FH;
    protected int Hw;
    protected char[] j6;

    public CharQueue(int i) {
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
        char[] cArr = new char[this.j6.length * 2];
        for (int i = 0; i < this.j6.length; i++) {
            cArr[i] = DW(i);
        }
        this.j6 = cArr;
        this.DW = cArr.length - 1;
        this.FH = 0;
    }

    public final char DW(int i) {
        return this.j6[this.DW & (this.FH + i)];
    }

    public void Hw(int i) {
        this.j6 = new char[i];
        this.DW = i - 1;
        this.FH = 0;
        this.Hw = 0;
    }

    public final void j6(char c) {
        if (this.Hw == this.j6.length) {
            FH();
        }
        char[] cArr = this.j6;
        int i = this.FH;
        int i2 = this.Hw;
        cArr[(i + i2) & this.DW] = c;
        this.Hw = i2 + 1;
    }

    public final void v5() {
        this.FH = (this.FH + 1) & this.DW;
        this.Hw--;
    }
}
