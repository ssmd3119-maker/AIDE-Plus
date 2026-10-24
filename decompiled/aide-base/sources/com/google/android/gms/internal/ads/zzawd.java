package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONArray;
import org.json.JSONException;

@jg
/* loaded from: classes.dex */
public final class zzawd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzawd> CREATOR = new xk();
    public final String WB;
    public final int mb;

    public zzawd(abcd.ou ouVar) {
        this(ouVar.j6(), ouVar.zh());
    }

    public static zzawd EQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return gn(new JSONArray(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static zzawd gn(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzawd(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzawd)) {
            zzawd zzawdVar = (zzawd) obj;
            if (com.google.android.gms.common.internal.o.j6(this.WB, zzawdVar.WB) && com.google.android.gms.common.internal.o.j6(Integer.valueOf(this.mb), Integer.valueOf(zzawdVar.mb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.o.DW(this.WB, Integer.valueOf(this.mb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 2, this.WB, false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 3, this.mb);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public zzawd(String str, int i) {
        this.WB = str;
        this.mb = i;
    }
}
