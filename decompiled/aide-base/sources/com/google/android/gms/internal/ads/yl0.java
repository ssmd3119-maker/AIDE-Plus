package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class yl0 implements po0<Long> {
    private yl0() {
    }

    private static Long DW(Uri uri, InputStream inputStream) throws IOException {
        String line = new BufferedReader(new InputStreamReader(inputStream)).readLine();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return Long.valueOf(simpleDateFormat.parse(line).getTime());
        } catch (ParseException e) {
            throw new af0(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.po0
    public final /* synthetic */ Long j6(Uri uri, InputStream inputStream) {
        return DW(uri, inputStream);
    }

    /* synthetic */ yl0(vl0 vl0Var) {
        this();
    }
}
