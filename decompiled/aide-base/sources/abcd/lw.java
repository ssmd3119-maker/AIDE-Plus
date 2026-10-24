package abcd;

/* loaded from: classes.dex */
public final class lw implements Runnable {
    private final /* synthetic */ gw WB;
    private final /* synthetic */ kw mb;

    public lw(kw kwVar, gw gwVar) {
        this.mb = kwVar;
        this.WB = gwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.WB.tp()) {
            this.mb.FH.XL();
            return;
        }
        try {
            this.mb.FH.J8(this.mb.DW.j6(this.WB));
        } catch (fw e) {
            if (e.getCause() instanceof Exception) {
                this.mb.FH.J0((Exception) e.getCause());
            } else {
                this.mb.FH.J0(e);
            }
        } catch (Exception e2) {
            this.mb.FH.J0(e2);
        }
    }
}
