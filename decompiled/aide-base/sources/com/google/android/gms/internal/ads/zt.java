package com.google.android.gms.internal.ads;

@jg
/* loaded from: classes.dex */
public final class zt extends sl {
    static final zt FH = new zt();

    zt() {
    }

    @Override // com.google.android.gms.internal.ads.sl
    public final tq DW(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new ts() : "mvhd".equals(str) ? new ut() : new vu(str);
    }
}
