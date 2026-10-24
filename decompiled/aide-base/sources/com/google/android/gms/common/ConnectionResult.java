package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    private final int WB;
    private final String fY;
    private final PendingIntent jw;
    private final int mb;
    public static final ConnectionResult qp = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new l();

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.WB = i;
        this.mb = i2;
        this.jw = pendingIntent;
        this.fY = str;
    }

    static String aM(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return "RESOLUTION_REQUIRED";
            case UserTouchAction.CLICK_KIND /* 7 */:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                        return "SIGN_IN_FAILED";
                    case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case ProxyTextView.INPUTTYPE_date /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final String EQ() {
        return this.fY;
    }

    public final PendingIntent J8() {
        return this.jw;
    }

    public final boolean QX() {
        return this.mb == 0;
    }

    public final boolean Ws() {
        return (this.mb == 0 || this.jw == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.mb == connectionResult.mb && com.google.android.gms.common.internal.o.j6(this.jw, connectionResult.jw) && com.google.android.gms.common.internal.o.j6(this.fY, connectionResult.fY);
    }

    public final int gn() {
        return this.mb;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.o.DW(Integer.valueOf(this.mb), this.jw, this.fY);
    }

    public final String toString() {
        o.a aVarFH = com.google.android.gms.common.internal.o.FH(this);
        aVarFH.j6("statusCode", aM(this.mb));
        aVarFH.j6("resolution", this.jw);
        aVarFH.j6("message", this.fY);
        return aVarFH.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 2, gn());
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 3, J8(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 4, EQ(), false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
