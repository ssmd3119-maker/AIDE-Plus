package abcd;

import android.os.Bundle;
import tv.ouya.console.api.g;
import tv.ouya.console.internal.IStringListener;

/* loaded from: classes.dex */
public class uq0 extends IStringListener.Sub {
    private tq0<String> WB;

    public uq0(g<String> gVar) {
        this.WB = new tq0<>(gVar);
    }

    @Override // tv.ouya.console.internal.IStringListener
    public void gG(int i, String str, Bundle bundle) {
        this.WB.FH(i, str, bundle);
    }

    @Override // tv.ouya.console.internal.IStringListener
    public void nw() {
        this.WB.DW();
    }

    @Override // tv.ouya.console.internal.IStringListener
    public void w3(String str) {
        this.WB.Hw(str);
    }
}
