package abcd;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.c;

/* loaded from: classes.dex */
public final class ng {
    static {
        Runtime.getRuntime().availableProcessors();
    }

    public static String DW(Bundle bundle, String str) {
        if (bundle == null) {
            Zo(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            v5(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        Zo(str, "Unexpected type for debug message: " + obj.getClass().getName());
        return "";
    }

    public static int FH(Bundle bundle, String str) {
        if (bundle == null) {
            Zo(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            v5(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        Zo(str, "Unexpected type for bundle response code: " + obj.getClass().getName());
        return 6;
    }

    public static int Hw(Intent intent, String str) {
        return j6(intent, str).FH();
    }

    public static void Zo(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static c j6(Intent intent, String str) {
        if (intent != null) {
            c.b bVarHw = c.Hw();
            bVarHw.FH(FH(intent.getExtras(), str));
            bVarHw.DW(DW(intent.getExtras(), str));
            return bVarHw.j6();
        }
        Zo("BillingHelper", "Got null intent!");
        c.b bVarHw2 = c.Hw();
        bVarHw2.FH(6);
        bVarHw2.DW("An internal error occurred.");
        return bVarHw2.j6();
    }

    public static void v5(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }
}
