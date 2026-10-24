package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

/* loaded from: classes.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new c();
    private final int WB;
    private final int fY;
    private final int jw;
    private final Uri mb;

    WebImage(int i, Uri uri, int i2, int i3) {
        this.WB = i;
        this.mb = uri;
        this.jw = i2;
        this.fY = i3;
    }

    public final Uri EQ() {
        return this.mb;
    }

    public final int J8() {
        return this.jw;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (o.j6(this.mb, webImage.mb) && this.jw == webImage.jw && this.fY == webImage.fY) {
                return true;
            }
        }
        return false;
    }

    public final int gn() {
        return this.fY;
    }

    public final int hashCode() {
        return o.DW(this.mb, Integer.valueOf(this.jw), Integer.valueOf(this.fY));
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.jw), Integer.valueOf(this.fY), this.mb.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 2, EQ(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 3, J8());
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 4, gn());
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
