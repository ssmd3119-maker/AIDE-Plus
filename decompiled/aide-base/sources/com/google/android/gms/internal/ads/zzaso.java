package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaso extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaso> CREATOR = new mh();
    public final boolean WB;
    public final List<String> mb;

    public zzaso() {
        this(false, Collections.emptyList());
    }

    public static zzaso gn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new zzaso();
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reporting_urls");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                } catch (JSONException e) {
                    xp.v5("Error grabbing url from json.", e);
                }
            }
        }
        return new zzaso(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 2, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.j3(parcel, 3, this.mb, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public zzaso(boolean z, List<String> list) {
        this.WB = z;
        this.mb = list;
    }
}
