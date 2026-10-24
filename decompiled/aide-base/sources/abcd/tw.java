package abcd;

/* loaded from: classes.dex */
public final class tw implements Runnable {
    private final /* synthetic */ gw WB;
    private final /* synthetic */ sw mb;

    public tw(sw swVar, gw gwVar) {
        this.mb = swVar;
        this.WB = gwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.mb.DW) {
            if (this.mb.FH != null) {
                this.mb.FH.Hw(this.WB.VH());
            }
        }
    }
}
