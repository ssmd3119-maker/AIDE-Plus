package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public class b extends Exception {
    protected final Status WB;

    public b(Status status) {
        int iGn = status.gn();
        String strEQ = status.EQ() != null ? status.EQ() : "";
        StringBuilder sb = new StringBuilder(String.valueOf(strEQ).length() + 13);
        sb.append(iGn);
        sb.append(": ");
        sb.append(strEQ);
        super(sb.toString());
        this.WB = status;
    }
}
