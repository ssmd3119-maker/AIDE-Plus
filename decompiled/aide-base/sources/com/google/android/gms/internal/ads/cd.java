package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class cd {
    private final boolean DW;
    private final boolean FH;
    private final boolean Hw;
    private final boolean j6;
    private final boolean v5;

    private cd(ed edVar) {
        this.j6 = edVar.j6;
        this.DW = edVar.DW;
        this.FH = edVar.FH;
        this.Hw = edVar.Hw;
        this.v5 = edVar.v5;
    }

    public final JSONObject j6() {
        try {
            return new JSONObject().put("sms", this.j6).put("tel", this.DW).put("calendar", this.FH).put("storePicture", this.Hw).put("inlineVideo", this.v5);
        } catch (JSONException e) {
            xp.Hw("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
