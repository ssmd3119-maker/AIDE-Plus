package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.sm;
import com.google.android.gms.internal.ads.xp;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class e implements b0<Object> {
    private final Object j6 = new Object();

    @GuardedBy("mLock")
    private final Map<String, f> DW = new HashMap();

    public final void j6(String str, f fVar) {
        synchronized (this.j6) {
            this.DW.put(str, fVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final void zza(Object obj, Map<String, String> map) {
        String strConcat;
        String str = map.get("id");
        String str2 = map.get("fail");
        String str3 = map.get("fail_reason");
        String str4 = map.get("fail_stack");
        String str5 = map.get("result");
        if (TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            strConcat = "";
        } else {
            String strValueOf = String.valueOf(str4);
            strConcat = strValueOf.length() != 0 ? "\n".concat(strValueOf) : new String("\n");
        }
        synchronized (this.j6) {
            f fVarRemove = this.DW.remove(str);
            if (fVarRemove == null) {
                String strValueOf2 = String.valueOf(str);
                xp.u7(strValueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(strValueOf2) : new String("Received result for unexpected method invocation: "));
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                String strValueOf3 = String.valueOf(str3);
                String strValueOf4 = String.valueOf(strConcat);
                fVarRemove.j6(strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3));
            } else {
                if (str5 == null) {
                    fVarRemove.DW(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (sm.J0()) {
                        String strValueOf5 = String.valueOf(jSONObject.toString(2));
                        sm.we(strValueOf5.length() != 0 ? "Result GMSG: ".concat(strValueOf5) : new String("Result GMSG: "));
                    }
                    fVarRemove.DW(jSONObject);
                } catch (JSONException e) {
                    fVarRemove.j6(e.getMessage());
                }
            }
        }
    }
}
