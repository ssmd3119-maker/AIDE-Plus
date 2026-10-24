package abcd;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class kw<TResult, TContinuationResult> implements ww<TResult> {
    private final aw<TResult, TContinuationResult> DW;
    private final zw<TContinuationResult> FH;
    private final Executor j6;

    public kw(Executor executor, aw<TResult, TContinuationResult> awVar, zw<TContinuationResult> zwVar) {
        this.j6 = executor;
        this.DW = awVar;
        this.FH = zwVar;
    }

    @Override // abcd.ww
    public final void DW(gw<TResult> gwVar) {
        this.j6.execute(new lw(this, gwVar));
    }
}
