package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzki;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ih0 {
    private static final Pattern FH = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int j6 = -1;
    public int DW = -1;

    private final boolean DW(String str, String str2) throws NumberFormatException {
        if (!"iTunSMPB".equals(str)) {
            return false;
        }
        Matcher matcher = FH.matcher(str2);
        if (matcher.find()) {
            try {
                int i = Integer.parseInt(matcher.group(1), 16);
                int i2 = Integer.parseInt(matcher.group(2), 16);
                if (i > 0 || i2 > 0) {
                    this.j6 = i;
                    this.DW = i2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public final boolean FH() {
        return (this.j6 == -1 || this.DW == -1) ? false : true;
    }

    public final boolean j6(zzki zzkiVar) {
        for (int i = 0; i < zzkiVar.j6(); i++) {
            zzki.zza zzaVarDW = zzkiVar.DW(i);
            if (zzaVarDW instanceof zzkm) {
                zzkm zzkmVar = (zzkm) zzaVarDW;
                if (DW(zzkmVar.jw, zzkmVar.fY)) {
                    return true;
                }
            }
        }
        return false;
    }
}
