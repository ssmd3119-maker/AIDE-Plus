package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class n1 {
    private String DW;
    private final WeakReference<cv> j6;

    public n1(cv cvVar) {
        this.j6 = new WeakReference<>(cvVar);
    }

    public final void FH(nf nfVar) {
        nfVar.sh("/loadHtml", new o1(this, nfVar));
        nfVar.sh("/showOverlay", new q1(this, nfVar));
        nfVar.sh("/hideOverlay", new r1(this, nfVar));
        cv cvVar = this.j6.get();
        if (cvVar != null) {
            cvVar.sh("/sendMessageToSdk", new s1(this, nfVar));
        }
    }
}
