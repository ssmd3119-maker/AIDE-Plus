package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class y7 extends IOException {
    public y7(String str) {
        super(str);
    }

    static y7 DW() {
        return new y7("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static y7 FH() {
        return new y7("CodedInputStream encountered a malformed varint.");
    }

    static y7 Hw() {
        return new y7("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static y7 j6() {
        return new y7("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public y7(String str, Exception exc) {
        super(str, exc);
    }
}
