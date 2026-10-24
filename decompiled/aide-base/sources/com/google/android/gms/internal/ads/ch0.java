package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class ch0 implements mh0 {
    @Override // com.google.android.gms.internal.ads.mh0
    public final int DW(fh0 fh0Var, int i, boolean z) throws EOFException {
        int iDW = fh0Var.DW(i);
        if (iDW != -1) {
            return iDW;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.mh0
    public final void FH(long j, int i, int i2, int i3, nh0 nh0Var) {
    }

    @Override // com.google.android.gms.internal.ads.mh0
    public final void Hw(ap0 ap0Var, int i) {
        ap0Var.J0(i);
    }

    @Override // com.google.android.gms.internal.ads.mh0
    public final void j6(zzfs zzfsVar) {
    }
}
