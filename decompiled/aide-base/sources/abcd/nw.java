package abcd;

/* loaded from: classes.dex */
public final class nw implements Runnable {
    private final /* synthetic */ gw WB;
    private final /* synthetic */ mw mb;

    public nw(mw mwVar, gw gwVar) {
        this.mb = mwVar;
        this.WB = gwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            gw gwVar = (gw) this.mb.DW.j6(this.WB);
            if (gwVar == null) {
                this.mb.Hw(new NullPointerException("Continuation returned null"));
                return;
            }
            gwVar.Hw(iw.j6, this.mb);
            gwVar.FH(iw.j6, this.mb);
            gwVar.j6(iw.j6, this.mb);
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
