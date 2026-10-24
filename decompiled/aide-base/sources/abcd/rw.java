package abcd;

/* loaded from: classes.dex */
public final class rw implements Runnable {
    private final /* synthetic */ gw WB;
    private final /* synthetic */ qw mb;

    public rw(qw qwVar, gw gwVar) {
        this.mb = qwVar;
        this.WB = gwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.mb.DW) {
            if (this.mb.FH != null) {
                this.mb.FH.DW(this.WB);
            }
        }
    }
}
