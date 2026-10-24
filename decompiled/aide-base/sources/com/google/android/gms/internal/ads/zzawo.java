package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class zzawo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzawo> CREATOR = new hl();
    public final List<String> AL;
    public final String WB;
    public final boolean fY;
    public final boolean jw;
    public final boolean k2;
    public final String mb;
    public final List<String> qp;
    public final boolean zh;

    public zzawo(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.WB = str;
        this.mb = str2;
        this.jw = z;
        this.fY = z2;
        this.qp = list;
        this.k2 = z3;
        this.zh = z4;
        this.AL = list2 == null ? new ArrayList<>() : list2;
    }

    public static zzawo gn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new zzawo(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), xo.j6(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), xo.j6(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 2, this.WB, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 3, this.mb, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 4, this.jw);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 5, this.fY);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 6, this.qp, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 7, this.k2);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 8, this.zh);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 9, this.AL, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
