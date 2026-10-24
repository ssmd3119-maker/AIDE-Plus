package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Map;
import org.json.JSONException;

@jg
/* loaded from: classes.dex */
public final class zc extends gd {
    private final Map<String, String> FH;
    private final Context Hw;

    public zc(cv cvVar, Map<String, String> map) {
        super(cvVar, "storePicture");
        this.FH = map;
        this.Hw = cvVar.dx();
    }

    public final void VH() throws JSONException {
        if (this.Hw == null) {
            Hw("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.w0.v5();
        if (!bn.P8(this.Hw).Hw()) {
            Hw("Feature is not supported by the device.");
            return;
        }
        String str = this.FH.get("iurl");
        if (TextUtils.isEmpty(str)) {
            Hw("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            String strValueOf = String.valueOf(str);
            Hw(strValueOf.length() != 0 ? "Invalid image url: ".concat(strValueOf) : new String("Invalid image url: "));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.w0.v5();
        if (!bn.aj(lastPathSegment)) {
            String strValueOf2 = String.valueOf(lastPathSegment);
            Hw(strValueOf2.length() != 0 ? "Image type not recognized: ".concat(strValueOf2) : new String("Image type not recognized: "));
            return;
        }
        Resources resourcesDW = com.google.android.gms.ads.internal.w0.u7().DW();
        com.google.android.gms.ads.internal.w0.v5();
        AlertDialog.Builder builderVy = bn.vy(this.Hw);
        builderVy.setTitle(resourcesDW != null ? resourcesDW.getString(abcd.mu.s1) : "Save image");
        builderVy.setMessage(resourcesDW != null ? resourcesDW.getString(abcd.mu.s2) : "Allow Ad to store image in Picture gallery?");
        builderVy.setPositiveButton(resourcesDW != null ? resourcesDW.getString(abcd.mu.s3) : "Accept", new ad(this, str, lastPathSegment));
        builderVy.setNegativeButton(resourcesDW != null ? resourcesDW.getString(abcd.mu.s4) : "Decline", new bd(this));
        builderVy.create().show();
    }
}
