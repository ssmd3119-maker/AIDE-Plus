package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class y50 extends IOException {
    public y50(String str) {
        super(str);
    }

    static y50 DW() {
        return new y50("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static y50 FH() {
        return new y50("CodedInputStream encountered a malformed varint.");
    }

    static y50 Hw() {
        return new y50("Protocol message contained an invalid tag (zero).");
    }

    static y50 VH() {
        return new y50("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static z50 Zo() {
        return new z50("Protocol message tag had invalid wire type.");
    }

    static y50 gn() {
        return new y50("Failed to parse the message.");
    }

    static y50 j6() {
        return new y50("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static y50 u7() {
        return new y50("Protocol message had invalid UTF-8.");
    }

    static y50 v5() {
        return new y50("Protocol message end-group tag did not match expected tag.");
    }

    public final y50 tp(z60 z60Var) {
        return this;
    }
}
