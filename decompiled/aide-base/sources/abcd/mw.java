package abcd;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mw<TResult, TContinuationResult> implements bw, dw, ew<TContinuationResult>, ww<TResult> {
    private final aw<TResult, gw<TContinuationResult>> DW;
    private final zw<TContinuationResult> FH;
    private final Executor j6;

    public mw(Executor executor, aw<TResult, gw<TContinuationResult>> awVar, zw<TContinuationResult> zwVar) {
        this.j6 = executor;
        this.DW = awVar;
        this.FH = zwVar;
    }

    @Override // abcd.ww
    public final void DW(gw<TResult> gwVar) {
        this.j6.execute(new nw(this, gwVar));
    }

    @Override // abcd.bw
    public final void FH() {
        this.FH.XL();
    }

    @Override // abcd.dw
    public final void Hw(Exception exc) {
        this.FH.J0(exc);
    }

    @Override // abcd.ew
    public final void j6(TContinuationResult tcontinuationresult) {
        this.FH.J8(tcontinuationresult);
    }
}
