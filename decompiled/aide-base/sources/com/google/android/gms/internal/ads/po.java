package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class po implements jx0 {
    private final /* synthetic */ so DW;
    private final /* synthetic */ String j6;

    po(zzazs zzazsVar, String str, so soVar) {
        this.j6 = str;
        this.DW = soVar;
    }

    @Override // com.google.android.gms.internal.ads.jx0
    public final void j6(e3 e3Var) {
        String str = this.j6;
        String string = e3Var.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(string);
        xp.u7(sb.toString());
        this.DW.j6(null);
    }
}
