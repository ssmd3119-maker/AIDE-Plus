package abcd;

/* loaded from: classes.dex */
public final class pw implements Runnable {
    private final /* synthetic */ ow WB;

    public pw(ow owVar) {
        this.WB = owVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.WB.DW) {
            if (this.WB.FH != null) {
                this.WB.FH.FH();
            }
        }
    }
}
