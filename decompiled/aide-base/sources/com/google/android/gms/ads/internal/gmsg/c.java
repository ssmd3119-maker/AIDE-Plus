package com.google.android.gms.ads.internal.gmsg;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.t1;
import com.google.android.gms.ads.internal.w0;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.ew;
import com.google.android.gms.internal.ads.hw;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.jw;
import com.google.android.gms.internal.ads.rl;
import com.google.android.gms.internal.ads.vb0;
import com.google.android.gms.internal.ads.wb0;
import com.google.android.gms.internal.ads.wc;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.zv;
import java.net.URISyntaxException;
import java.util.Map;

@jg
/* loaded from: classes.dex */
public final class c<T extends zv & aw & ew & hw & jw> implements b0<T> {
    private final wc DW;
    private final t1 j6;

    public c(t1 t1Var, wc wcVar) {
        this.j6 = t1Var;
        this.DW = wcVar;
    }

    private static boolean DW(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int FH(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return w0.VH().a8();
        }
        if ("l".equalsIgnoreCase(str)) {
            return w0.VH().U2();
        }
        if ("c".equalsIgnoreCase(str)) {
            return w0.VH().lg();
        }
        return -1;
    }

    private final void Hw(boolean z) {
        wc wcVar = this.DW;
        if (wcVar != null) {
            wcVar.J0(z);
        }
    }

    static String j6(Context context, vb0 vb0Var, String str, View view, Activity activity) {
        if (vb0Var == null) {
            return str;
        }
        try {
            Uri uriDW = Uri.parse(str);
            if (vb0Var.gn(uriDW)) {
                uriDW = vb0Var.DW(uriDW, context, view, activity);
            }
            return uriDW.toString();
        } catch (wb0 unused) {
            return str;
        } catch (Exception e) {
            w0.u7().v5(e, "OpenGmsgHandler.maybeAddClickSignalsToUrl");
            return str;
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(Object obj, Map map) throws URISyntaxException {
        zv zvVar = (zv) obj;
        String strHw = rl.Hw((String) map.get("u"), zvVar.getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            xp.u7("Action missing from an open GMSG.");
            return;
        }
        t1 t1Var = this.j6;
        if (t1Var != null && !t1Var.Hw()) {
            this.j6.DW(strHw);
            return;
        }
        if ("expand".equalsIgnoreCase(str)) {
            if (((aw) zvVar).BR()) {
                xp.u7("Cannot expand WebView that is already expanded.");
                return;
            } else {
                Hw(false);
                ((ew) zvVar).Hw(DW(map), FH(map));
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str)) {
            Hw(false);
            if (strHw != null) {
                ((ew) zvVar).J0(DW(map), FH(map), strHw);
                return;
            } else {
                ((ew) zvVar).XL(DW(map), FH(map), (String) map.get("html"), (String) map.get("baseurl"));
                return;
            }
        }
        if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            Hw(true);
            zvVar.getContext();
            if (TextUtils.isEmpty(strHw)) {
                xp.u7("Destination url cannot be empty.");
                return;
            }
            try {
                ((ew) zvVar).gn(new zzc(new d(zvVar.getContext(), ((hw) zvVar).pO(), ((jw) zvVar).getView()).v5(map)));
                return;
            } catch (ActivityNotFoundException e) {
                xp.u7(e.getMessage());
                return;
            }
        }
        Hw(true);
        String str2 = (String) map.get("intent_url");
        Intent uri = null;
        if (!TextUtils.isEmpty(str2)) {
            try {
                uri = Intent.parseUri(str2, 0);
            } catch (URISyntaxException e2) {
                String strValueOf = String.valueOf(str2);
                xp.Hw(strValueOf.length() != 0 ? "Error parsing the url: ".concat(strValueOf) : new String("Error parsing the url: "), e2);
            }
        }
        if (uri != null && uri.getData() != null) {
            Uri data = uri.getData();
            String string = data.toString();
            if (!TextUtils.isEmpty(string)) {
                try {
                    string = j6(zvVar.getContext(), ((hw) zvVar).pO(), string, ((jw) zvVar).getView(), zvVar.dx());
                } catch (Exception e3) {
                    xp.Hw("Error occurred while adding signals.", e3);
                    w0.u7().v5(e3, "OpenGmsgHandler.onGmsg");
                }
                try {
                    data = Uri.parse(string);
                } catch (Exception e4) {
                    String strValueOf2 = String.valueOf(string);
                    xp.Hw(strValueOf2.length() != 0 ? "Error parsing the uri: ".concat(strValueOf2) : new String("Error parsing the uri: "), e4);
                    w0.u7().v5(e4, "OpenGmsgHandler.onGmsg");
                }
            }
            uri.setData(data);
        }
        if (uri != null) {
            ((ew) zvVar).gn(new zzc(uri));
            return;
        }
        if (!TextUtils.isEmpty(strHw)) {
            strHw = j6(zvVar.getContext(), ((hw) zvVar).pO(), strHw, ((jw) zvVar).getView(), zvVar.dx());
        }
        ((ew) zvVar).gn(new zzc((String) map.get("i"), strHw, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
    }
}
