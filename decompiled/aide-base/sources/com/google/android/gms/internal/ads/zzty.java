package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

@jg
/* loaded from: classes.dex */
public final class zzty extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzty> CREATOR = new bt0();
    public long AL;
    public final String WB;
    private final String fY;
    private final String jw;
    private final Bundle k2;
    private final long mb;
    private final String qp;
    public final boolean zh;

    zzty(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.WB = str;
        this.mb = j;
        this.jw = str2 == null ? "" : str2;
        this.fY = str3 == null ? "" : str3;
        this.qp = str4 == null ? "" : str4;
        this.k2 = bundle == null ? new Bundle() : bundle;
        this.zh = z;
        this.AL = j2;
    }

    public static zzty EQ(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                xp.u7(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : com.google.android.gms.ads.internal.w0.VH().XL(uri)) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzty(queryParameter, j, host, str, str2, bundle, zEquals, 0L);
        } catch (NullPointerException | NumberFormatException e) {
            xp.v5("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    public static zzty gn(String str) {
        return EQ(Uri.parse(str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 2, this.WB, false);
        com.google.android.gms.common.internal.safeparcel.b.J0(parcel, 3, this.mb);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 4, this.jw, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 5, this.fY, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 6, this.qp, false);
        com.google.android.gms.common.internal.safeparcel.b.Hw(parcel, 7, this.k2, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 8, this.zh);
        com.google.android.gms.common.internal.safeparcel.b.J0(parcel, 9, this.AL);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
