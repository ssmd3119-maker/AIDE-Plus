package abcd;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.s;

/* loaded from: classes.dex */
public final class dx {
    private final String DW;
    private final String FH;
    private final String Hw;
    private final String VH;
    private final String Zo;
    private final String j6;
    private final String v5;

    private dx(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        p.J0(!s.j6(str), "ApplicationId must be set.");
        this.DW = str;
        this.j6 = str2;
        this.FH = str3;
        this.Hw = str4;
        this.v5 = str5;
        this.Zo = str6;
        this.VH = str7;
    }

    public static dx j6(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String strJ6 = stringResourceValueReader.j6("google_app_id");
        if (TextUtils.isEmpty(strJ6)) {
            return null;
        }
        return new dx(strJ6, stringResourceValueReader.j6("google_api_key"), stringResourceValueReader.j6("firebase_database_url"), stringResourceValueReader.j6("ga_trackingId"), stringResourceValueReader.j6("gcm_defaultSenderId"), stringResourceValueReader.j6("google_storage_bucket"), stringResourceValueReader.j6("project_id"));
    }

    public final String DW() {
        return this.DW;
    }

    public final String FH() {
        return this.v5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dx)) {
            return false;
        }
        dx dxVar = (dx) obj;
        return o.j6(this.DW, dxVar.DW) && o.j6(this.j6, dxVar.j6) && o.j6(this.FH, dxVar.FH) && o.j6(this.Hw, dxVar.Hw) && o.j6(this.v5, dxVar.v5) && o.j6(this.Zo, dxVar.Zo) && o.j6(this.VH, dxVar.VH);
    }

    public final int hashCode() {
        return o.DW(this.DW, this.j6, this.FH, this.Hw, this.v5, this.Zo, this.VH);
    }

    public final String toString() {
        o.a aVarFH = o.FH(this);
        aVarFH.j6("applicationId", this.DW);
        aVarFH.j6("apiKey", this.j6);
        aVarFH.j6("databaseUrl", this.FH);
        aVarFH.j6("gcmSenderId", this.v5);
        aVarFH.j6("storageBucket", this.Zo);
        aVarFH.j6("projectId", this.VH);
        return aVarFH.toString();
    }
}
