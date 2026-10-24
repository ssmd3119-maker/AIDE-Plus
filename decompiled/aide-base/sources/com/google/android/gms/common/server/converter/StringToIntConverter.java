package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.a<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new b();
    private final int WB;
    private final SparseArray<String> jw;
    private final HashMap<String, Integer> mb;

    StringToIntConverter(int i, ArrayList<zaa> arrayList) {
        this.WB = i;
        this.mb = new HashMap<>();
        this.jw = new SparseArray<>();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zaa zaaVar = arrayList.get(i2);
            i2++;
            zaa zaaVar2 = zaaVar;
            gn(zaaVar2.mb, zaaVar2.jw);
        }
    }

    public final StringToIntConverter gn(String str, int i) {
        this.mb.put(str, Integer.valueOf(i));
        this.jw.put(i, str);
        return this;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.a
    public final /* synthetic */ String j6(Integer num) {
        String str = this.jw.get(num.intValue());
        return (str == null && this.mb.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        ArrayList arrayList = new ArrayList();
        for (String str : this.mb.keySet()) {
            arrayList.add(new zaa(str, this.mb.get(str).intValue()));
        }
        com.google.android.gms.common.internal.safeparcel.b.U2(parcel, 2, arrayList, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public static final class zaa extends AbstractSafeParcelable {
        public static final Parcelable.Creator<zaa> CREATOR = new c();
        private final int WB;
        final int jw;
        final String mb;

        zaa(int i, String str, int i2) {
            this.WB = i;
            this.mb = str;
            this.jw = i2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
            com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
            com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 2, this.mb, false);
            com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 3, this.jw);
            com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
        }

        zaa(String str, int i) {
            this.WB = 1;
            this.mb = str;
            this.jw = i;
        }
    }

    public StringToIntConverter() {
        this.WB = 1;
        this.mb = new HashMap<>();
        this.jw = new SparseArray<>();
    }
}
