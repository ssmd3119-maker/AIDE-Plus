package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public class k4 extends IOException {
    public k4(String str) {
        super(str);
    }

    static k4 DW() {
        return new k4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static k4 FH() {
        return new k4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static k4 Hw() {
        return new k4("CodedInputStream encountered a malformed varint.");
    }

    static k4 VH() {
        return new k4("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static l4 Zo() {
        return new l4("Protocol message tag had invalid wire type.");
    }

    static k4 gn() {
        return new k4("Failed to parse the message.");
    }

    static k4 u7() {
        return new k4("Protocol message had invalid UTF-8.");
    }

    static k4 v5() {
        return new k4("Protocol message end-group tag did not match expected tag.");
    }

    public final k4 j6(l5 l5Var) {
        return this;
    }
}
