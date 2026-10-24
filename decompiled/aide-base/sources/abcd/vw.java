package abcd;

/* loaded from: classes.dex */
public final class vw implements Runnable {
    private final /* synthetic */ gw WB;
    private final /* synthetic */ uw mb;

    public vw(uw uwVar, gw gwVar) {
        this.mb = uwVar;
        this.WB = gwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.mb.DW) {
            if (this.mb.FH != null) {
                this.mb.FH.j6(this.WB.gn());
            }
        }
    }
}
