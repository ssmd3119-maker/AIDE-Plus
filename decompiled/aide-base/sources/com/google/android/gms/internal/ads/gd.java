package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public class gd {
    private final String DW;
    private final cv j6;

    public gd(cv cvVar) {
        this(cvVar, "");
    }

    public final void DW(int i, int i2, int i3, int i4) throws JSONException {
        try {
            this.j6.j6("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            xp.Hw("Error occured while dispatching size change.", e);
        }
    }

    public final void FH(int i, int i2, int i3, int i4) throws JSONException {
        try {
            this.j6.j6("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            xp.Hw("Error occured while dispatching default position.", e);
        }
    }

    public final void Hw(String str) throws JSONException {
        try {
            this.j6.j6("onError", new JSONObject().put("message", str).put("action", this.DW));
        } catch (JSONException e) {
            xp.Hw("Error occurred while dispatching error event.", e);
        }
    }

    public final void Zo(String str) throws JSONException {
        try {
            this.j6.j6("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            xp.Hw("Error occured while dispatching state change.", e);
        }
    }

    public final void j6(int i, int i2, int i3, int i4, float f, int i5) throws JSONException {
        try {
            this.j6.j6("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            xp.Hw("Error occured while obtaining screen information.", e);
        }
    }

    public final void v5(String str) throws JSONException {
        try {
            this.j6.j6("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            xp.Hw("Error occured while dispatching ready Event.", e);
        }
    }

    public gd(cv cvVar, String str) {
        this.j6 = cvVar;
        this.DW = str;
    }
}
