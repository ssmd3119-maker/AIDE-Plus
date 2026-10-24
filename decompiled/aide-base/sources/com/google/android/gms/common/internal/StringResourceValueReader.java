package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class StringResourceValueReader {
    private final String DW;
    private final Resources j6;

    public StringResourceValueReader(Context context) {
        p.u7(context);
        Resources resources = context.getResources();
        this.j6 = resources;
        this.DW = resources.getResourcePackageName(com.google.android.gms.common.i.common_google_play_services_unknown_issue);
    }

    @Nullable
    public String j6(String str) {
        int identifier = this.j6.getIdentifier(str, "string", this.DW);
        if (identifier == 0) {
            return null;
        }
        return this.j6.getString(identifier);
    }
}
