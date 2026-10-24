package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new c();
    private final int WB;
    private final String jw;
    private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> mb;

    zak(int i, ArrayList<zal> arrayList, String str) {
        this.WB = i;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> map = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zalVar = arrayList.get(i2);
            String str2 = zalVar.mb;
            HashMap map2 = new HashMap();
            int size2 = zalVar.jw.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zamVar = zalVar.jw.get(i3);
                map2.put(zamVar.mb, zamVar.jw);
            }
            map.put(str2, map2);
        }
        this.mb = map;
        p.u7(str);
        this.jw = str;
        gn();
    }

    public final String EQ() {
        return this.jw;
    }

    public final Map<String, FastJsonResponse.Field<?, ?>> J8(String str) {
        return this.mb.get(str);
    }

    public final void gn() {
        Iterator<String> it = this.mb.keySet().iterator();
        while (it.hasNext()) {
            Map<String, FastJsonResponse.Field<?, ?>> map = this.mb.get(it.next());
            Iterator<String> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                map.get(it2.next()).J8(this);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.mb.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map<String, FastJsonResponse.Field<?, ?>> map = this.mb.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        ArrayList arrayList = new ArrayList();
        for (String str : this.mb.keySet()) {
            arrayList.add(new zal(str, this.mb.get(str)));
        }
        com.google.android.gms.common.internal.safeparcel.b.U2(parcel, 2, arrayList, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 3, this.jw, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
