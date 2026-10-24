package com.jcraft.jsch;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class IO {
    OutputStream DW;
    OutputStream FH;
    InputStream j6;
    private boolean Hw = false;
    private boolean v5 = false;
    private boolean Zo = false;

    int DW() {
        return this.j6.read();
    }

    void EQ(InputStream inputStream, boolean z) {
        this.Hw = z;
        tp(inputStream);
    }

    void FH(byte[] bArr, int i, int i2) throws IOException {
        do {
            int i3 = this.j6.read(bArr, i, i2);
            if (i3 < 0) {
                throw new IOException("End of IO Stream Read");
            }
            i += i3;
            i2 -= i3;
        } while (i2 > 0);
    }

    void Hw() throws IOException {
        try {
            if (this.DW != null && !this.v5) {
                this.DW.close();
            }
            this.DW = null;
        } catch (Exception unused) {
        }
    }

    void J0(OutputStream outputStream, boolean z) {
        this.v5 = z;
        we(outputStream);
    }

    void VH(byte[] bArr, int i, int i2) throws IOException {
        this.FH.write(bArr, i, i2);
        this.FH.flush();
    }

    void Zo(byte[] bArr, int i, int i2) throws IOException {
        this.DW.write(bArr, i, i2);
        this.DW.flush();
    }

    void gn(OutputStream outputStream) {
        this.FH = outputStream;
    }

    public void j6() throws IOException {
        try {
            if (this.j6 != null && !this.Hw) {
                this.j6.close();
            }
            this.j6 = null;
        } catch (Exception unused) {
        }
        Hw();
        try {
            if (this.FH != null && !this.Zo) {
                this.FH.close();
            }
            this.FH = null;
        } catch (Exception unused2) {
        }
    }

    void tp(InputStream inputStream) {
        this.j6 = inputStream;
    }

    void u7(OutputStream outputStream, boolean z) {
        this.Zo = z;
        gn(outputStream);
    }

    public void v5(Packet packet) throws IOException {
        OutputStream outputStream = this.DW;
        Buffer buffer = packet.j6;
        outputStream.write(buffer.DW, 0, buffer.FH);
        this.DW.flush();
    }

    void we(OutputStream outputStream) {
        this.DW = outputStream;
    }
}
