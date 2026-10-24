package abcd;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class gw<TResult> {
    public gw<TResult> DW(Executor executor, cw<TResult> cwVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract boolean EQ();

    public abstract gw<TResult> FH(Executor executor, dw dwVar);

    public abstract gw<TResult> Hw(Executor executor, ew<? super TResult> ewVar);

    public abstract Exception VH();

    public <TContinuationResult> gw<TContinuationResult> Zo(Executor executor, aw<TResult, gw<TContinuationResult>> awVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract TResult gn();

    public gw<TResult> j6(Executor executor, bw bwVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public abstract boolean tp();

    public abstract <X extends Throwable> TResult u7(Class<X> cls);

    public <TContinuationResult> gw<TContinuationResult> v5(Executor executor, aw<TResult, TContinuationResult> awVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public abstract boolean we();
}
