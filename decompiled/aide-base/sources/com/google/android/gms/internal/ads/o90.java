package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class o90 extends IOException {
    public o90(String str) {
        super(str);
    }

    static o90 DW() {
        return new o90("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static o90 FH() {
        return new o90("CodedInputStream encountered a malformed varint.");
    }

    static o90 j6() {
        return new o90("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public o90(String str, Exception exc) {
        super(str, exc);
    }
}
