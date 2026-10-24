package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;

@jg
/* loaded from: classes.dex */
public final class sc extends gd {
    private final Map<String, String> FH;
    private final Context Hw;
    private long VH;
    private long Zo;
    private String gn;
    private String u7;
    private String v5;

    public sc(cv cvVar, Map<String, String> map) {
        super(cvVar, "createCalendarEvent");
        this.FH = map;
        this.Hw = cvVar.dx();
        this.v5 = tp("description");
        this.gn = tp("summary");
        this.Zo = EQ("start_ticks");
        this.VH = EQ("end_ticks");
        this.u7 = tp("location");
    }

    private final long EQ(String str) {
        String str2 = this.FH.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String tp(String str) {
        return TextUtils.isEmpty(this.FH.get(str)) ? "" : this.FH.get(str);
    }

    @TargetApi(14)
    final Intent VH() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.v5);
        data.putExtra("eventLocation", this.u7);
        data.putExtra("description", this.gn);
        long j = this.Zo;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.VH;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void gn() throws JSONException {
        if (this.Hw == null) {
            Hw("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.w0.v5();
        if (!bn.P8(this.Hw).v5()) {
            Hw("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.w0.v5();
        AlertDialog.Builder builderVy = bn.vy(this.Hw);
        Resources resourcesDW = com.google.android.gms.ads.internal.w0.u7().DW();
        builderVy.setTitle(resourcesDW != null ? resourcesDW.getString(abcd.mu.s5) : "Create calendar event");
        builderVy.setMessage(resourcesDW != null ? resourcesDW.getString(abcd.mu.s6) : "Allow Ad to create a calendar event?");
        builderVy.setPositiveButton(resourcesDW != null ? resourcesDW.getString(abcd.mu.s3) : "Accept", new tc(this));
        builderVy.setNegativeButton(resourcesDW != null ? resourcesDW.getString(abcd.mu.s4) : "Decline", new uc(this));
        builderVy.create().show();
    }
}
