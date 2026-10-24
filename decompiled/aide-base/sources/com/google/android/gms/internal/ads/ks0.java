package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ks0 {
    private ByteArrayOutputStream j6 = new ByteArrayOutputStream(4096);
    private Base64OutputStream DW = new Base64OutputStream(this.j6, 10);

    public final void j6(byte[] bArr) {
        this.DW.write(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() throws IOException {
        try {
            this.DW.close();
        } catch (IOException e) {
            xp.Hw("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.j6.close();
            return this.j6.toString();
        } catch (IOException e2) {
            xp.Hw("HashManager: Unable to convert to Base64.", e2);
            return "";
        } finally {
            this.j6 = null;
            this.DW = null;
        }
    }
}
