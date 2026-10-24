package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new b();
    private final List<String> AL;
    private long Q6 = -1;
    private final int WB;
    private final float Z1;
    private int cT;
    private final String fY;
    private final long hK;
    private int jw;
    private final String k2;
    private final long mb;
    private final long n5;
    private final String q7;
    private final String qp;
    private final String w9;
    private final int zh;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5) {
        this.WB = i;
        this.mb = j;
        this.jw = i2;
        this.fY = str;
        this.qp = str3;
        this.k2 = str5;
        this.zh = i3;
        this.AL = list;
        this.w9 = str2;
        this.hK = j2;
        this.cT = i4;
        this.q7 = str4;
        this.Z1 = f;
        this.n5 = j3;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long EQ() {
        return this.mb;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long J8() {
        return this.Q6;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String Ws() {
        String str = this.fY;
        int i = this.zh;
        List<String> list = this.AL;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        int i2 = this.cT;
        String str2 = this.qp;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.q7;
        if (str3 == null) {
            str3 = "";
        }
        float f = this.Z1;
        String str4 = this.k2;
        String str5 = str4 != null ? str4 : "";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + String.valueOf(strJoin).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str5).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(strJoin);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str5);
        return sb.toString();
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int gn() {
        return this.jw;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.J0(parcel, 2, EQ());
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 4, this.fY, false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 5, this.zh);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 6, this.AL, false);
        com.google.android.gms.common.internal.safeparcel.b.J0(parcel, 8, this.hK);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 10, this.qp, false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 11, gn());
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 12, this.w9, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 13, this.q7, false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 14, this.cT);
        com.google.android.gms.common.internal.safeparcel.b.VH(parcel, 15, this.Z1);
        com.google.android.gms.common.internal.safeparcel.b.J0(parcel, 16, this.n5);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 17, this.k2, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
