package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@jg
/* loaded from: classes.dex */
public class zzwf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzwf> CREATOR = new sv0();
    public final boolean AL;
    public final String WB;
    public final boolean fY;
    public boolean hK;
    public final int jw;
    public final int k2;
    public final int mb;
    public final int qp;
    public final boolean w9;
    public final zzwf[] zh;

    public zzwf() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public static int EQ(DisplayMetrics displayMetrics) {
        return (int) (J8(displayMetrics) * displayMetrics.density);
    }

    private static int J8(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    public static zzwf QX() {
        return new zzwf("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public static zzwf Ws(Context context) {
        return new zzwf("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    }

    public static int gn(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public final com.google.android.gms.ads.d aM() {
        return com.google.android.gms.ads.k.j6(this.qp, this.mb, this.WB);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 2, this.WB, false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 3, this.mb);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 4, this.jw);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 5, this.fY);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 6, this.qp);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 7, this.k2);
        com.google.android.gms.common.internal.safeparcel.b.Mr(parcel, 8, this.zh, i, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 9, this.AL);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 10, this.w9);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 11, this.hK);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public zzwf(Context context, com.google.android.gms.ads.d dVar) {
        this(context, new com.google.android.gms.ads.d[]{dVar});
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzwf(android.content.Context r13, com.google.android.gms.ads.d[] r14) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwf.<init>(android.content.Context, com.google.android.gms.ads.d[]):void");
    }

    public zzwf(zzwf zzwfVar, zzwf[] zzwfVarArr) {
        this(zzwfVar.WB, zzwfVar.mb, zzwfVar.jw, zzwfVar.fY, zzwfVar.qp, zzwfVar.k2, zzwfVarArr, zzwfVar.AL, zzwfVar.w9, zzwfVar.hK);
    }

    zzwf(String str, int i, int i2, boolean z, int i3, int i4, zzwf[] zzwfVarArr, boolean z2, boolean z3, boolean z4) {
        this.WB = str;
        this.mb = i;
        this.jw = i2;
        this.fY = z;
        this.qp = i3;
        this.k2 = i4;
        this.zh = zzwfVarArr;
        this.AL = z2;
        this.w9 = z3;
        this.hK = z4;
    }
}
