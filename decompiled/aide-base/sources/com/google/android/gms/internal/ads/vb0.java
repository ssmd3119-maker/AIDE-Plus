package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class vb0 {
    private static final String[] Hw = {"/aclk", "/pcs/click"};
    private rb0 FH;
    private String j6 = "ad.doubleclick.net";
    private String[] DW = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    public vb0(rb0 rb0Var) {
        this.FH = rb0Var;
    }

    private final Uri FH(Uri uri, Context context, String str, boolean z, View view, Activity activity) throws wb0 {
        try {
            boolean zV5 = v5(uri);
            if (zV5) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new wb0("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new wb0("Query parameter already exists: ms");
            }
            String strGn = z ? this.FH.gn(context, str, view, activity) : this.FH.DW(context);
            if (!zV5) {
                String string = uri.toString();
                int iIndexOf = string.indexOf("&adurl");
                if (iIndexOf == -1) {
                    iIndexOf = string.indexOf("?adurl");
                }
                if (iIndexOf == -1) {
                    return uri.buildUpon().appendQueryParameter("ms", strGn).build();
                }
                int i = iIndexOf + 1;
                return Uri.parse(string.substring(0, i) + "ms=" + strGn + "&" + string.substring(i));
            }
            String string2 = uri.toString();
            int iIndexOf2 = string2.indexOf(";adurl");
            if (iIndexOf2 != -1) {
                int i2 = iIndexOf2 + 1;
                return Uri.parse(string2.substring(0, i2) + "dc_ms=" + strGn + ";" + string2.substring(i2));
            }
            String encodedPath = uri.getEncodedPath();
            int iIndexOf3 = string2.indexOf(encodedPath);
            return Uri.parse(string2.substring(0, encodedPath.length() + iIndexOf3) + ";dc_ms=" + strGn + ";" + string2.substring(iIndexOf3 + encodedPath.length()));
        } catch (UnsupportedOperationException unused) {
            throw new wb0("Provided Uri is not in a valid state");
        }
    }

    private final boolean v5(Uri uri) {
        if (uri == null) {
            throw null;
        }
        try {
            return uri.getHost().equals(this.j6);
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public final Uri DW(Uri uri, Context context, View view, Activity activity) throws wb0 {
        try {
            return FH(uri, context, uri.getQueryParameter("ai"), true, view, activity);
        } catch (UnsupportedOperationException unused) {
            throw new wb0("Provided Uri is not in a valid state");
        }
    }

    public final void Hw(MotionEvent motionEvent) {
        this.FH.VH(motionEvent);
    }

    public final boolean VH(Uri uri) {
        if (uri == null) {
            throw null;
        }
        try {
            String host = uri.getHost();
            for (String str : this.DW) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final rb0 Zo() {
        return this.FH;
    }

    public final boolean gn(Uri uri) {
        if (VH(uri)) {
            for (String str : Hw) {
                if (uri.getPath().endsWith(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Uri j6(Uri uri, Context context) {
        return FH(uri, context, null, false, null, null);
    }
}
