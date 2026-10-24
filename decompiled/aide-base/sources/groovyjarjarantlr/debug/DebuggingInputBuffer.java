package groovyjarjarantlr.debug;

import groovyjarjarantlr.CharStreamException;
import groovyjarjarantlr.InputBuffer;

/* loaded from: classes.dex */
public class DebuggingInputBuffer extends InputBuffer {
    private boolean VH;
    private InputBufferEventSupport Zo;
    private InputBuffer v5;

    @Override // groovyjarjarantlr.InputBuffer
    public void DW() {
        char cJ6;
        try {
            cJ6 = this.v5.j6(1);
        } catch (CharStreamException unused) {
            cJ6 = ' ';
        }
        this.v5.DW();
        if (this.VH) {
            this.Zo.j6(cJ6);
        }
    }

    @Override // groovyjarjarantlr.InputBuffer
    public void FH(int i) {
        this.v5.FH(i);
    }

    @Override // groovyjarjarantlr.InputBuffer
    public int Hw() {
        int iHw = this.v5.Hw();
        this.Zo.v5(iHw);
        return iHw;
    }

    @Override // groovyjarjarantlr.InputBuffer
    public char j6(int i) {
        char cJ6 = this.v5.j6(i);
        if (this.VH) {
            this.Zo.Hw(cJ6, i);
        }
        return cJ6;
    }

    @Override // groovyjarjarantlr.InputBuffer
    public void v5(int i) {
        this.v5.v5(i);
        this.Zo.Zo(i);
    }
}
