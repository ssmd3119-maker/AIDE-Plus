package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@jg
/* loaded from: classes.dex */
public final class s6 {
    final String DW;
    final int FH;
    final zzwb j6;

    s6(o6 o6Var) {
        this(o6Var.u7(), o6Var.j6(), o6Var.DW());
    }

    static s6 j6(String str) {
        String[] strArrSplit = str.split("\u0000");
        if (strArrSplit.length != 3) {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                String str2 = new String(Base64.decode(strArrSplit[0], 0), "UTF-8");
                int i = Integer.parseInt(strArrSplit[1]);
                byte[] bArrDecode = Base64.decode(strArrSplit[2], 0);
                parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
                parcelObtain.setDataPosition(0);
                return new s6(zzwb.CREATOR.createFromParcel(parcelObtain), str2, i);
            } finally {
                parcelObtain.recycle();
            }
        } catch (a.C0113a | IllegalArgumentException | IllegalStateException e) {
            com.google.android.gms.ads.internal.w0.u7().v5(e, "QueueSeed.decode");
            throw new IOException("Malformed QueueSeed encoding.", e);
        }
    }

    final String DW() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                String strEncodeToString = Base64.encodeToString(this.DW.getBytes("UTF-8"), 0);
                String string = Integer.toString(this.FH);
                this.j6.writeToParcel(parcelObtain, 0);
                String strEncodeToString2 = Base64.encodeToString(parcelObtain.marshall(), 0);
                StringBuilder sb = new StringBuilder(String.valueOf(strEncodeToString).length() + 2 + String.valueOf(string).length() + String.valueOf(strEncodeToString2).length());
                sb.append(strEncodeToString);
                sb.append("\u0000");
                sb.append(string);
                sb.append("\u0000");
                sb.append(strEncodeToString2);
                return sb.toString();
            } catch (UnsupportedEncodingException unused) {
                xp.j6("QueueSeed encode failed because UTF-8 is not available.");
                parcelObtain.recycle();
                return "";
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    private s6(zzwb zzwbVar, String str, int i) {
        this.j6 = zzwbVar;
        this.DW = str;
        this.FH = i;
    }
}
