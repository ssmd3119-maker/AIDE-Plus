package com.android.installreferrer.api;

import android.os.Bundle;

/* loaded from: classes.dex */
public class c {
    private final Bundle j6;

    public c(Bundle bundle) {
        this.j6 = bundle;
    }

    public String DW() {
        return this.j6.getString("install_referrer");
    }

    public long FH() {
        return this.j6.getLong("referrer_click_timestamp_seconds");
    }

    public long j6() {
        return this.j6.getLong("install_begin_timestamp_seconds");
    }
}
