package com.jcraft.jsch;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes.dex */
public class ProxySOCKS5 implements Proxy {
    private int DW;
    private InputStream FH;
    private OutputStream Hw;
    private String VH;
    private String Zo;
    private String j6;
    private Socket v5;

    private void v5(InputStream inputStream, byte[] bArr, int i) throws IOException, JSchException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 <= 0) {
                throw new JSchException("ProxySOCKS5: stream is closed");
            }
            i2 += i3;
        }
    }

    @Override // com.jcraft.jsch.Proxy
    public InputStream DW() {
        return this.FH;
    }

    @Override // com.jcraft.jsch.Proxy
    public Socket FH() {
        return this.v5;
    }

    @Override // com.jcraft.jsch.Proxy
    public void Hw(SocketFactory socketFactory, String str, int i, int i2) throws IOException, JSchException {
        boolean z;
        try {
            if (socketFactory == null) {
                Socket socketGn = Util.gn(this.j6, this.DW, i2);
                this.v5 = socketGn;
                this.FH = socketGn.getInputStream();
                this.Hw = this.v5.getOutputStream();
            } else {
                Socket socketFH = socketFactory.FH(this.j6, this.DW);
                this.v5 = socketFH;
                this.FH = socketFactory.j6(socketFH);
                this.Hw = socketFactory.DW(this.v5);
            }
            if (i2 > 0) {
                this.v5.setSoTimeout(i2);
            }
            this.v5.setTcpNoDelay(true);
            byte[] bArr = new byte[1024];
            bArr[0] = 5;
            bArr[1] = 2;
            bArr[2] = 0;
            bArr[3] = 2;
            this.Hw.write(bArr, 0, 4);
            v5(this.FH, bArr, 2);
            int i3 = bArr[1] & 255;
            if (i3 != 0) {
                if (i3 == 2 && this.Zo != null && this.VH != null) {
                    bArr[0] = 1;
                    bArr[1] = (byte) this.Zo.length();
                    System.arraycopy(Util.aM(this.Zo), 0, bArr, 2, this.Zo.length());
                    int length = this.Zo.length() + 2;
                    int i4 = length + 1;
                    bArr[length] = (byte) this.VH.length();
                    System.arraycopy(Util.aM(this.VH), 0, bArr, i4, this.VH.length());
                    this.Hw.write(bArr, 0, i4 + this.VH.length());
                    v5(this.FH, bArr, 2);
                    z = bArr[1] == 0;
                }
            }
            if (!z) {
                try {
                    this.v5.close();
                } catch (Exception unused) {
                }
                throw new JSchException("fail in SOCKS5 proxy");
            }
            bArr[0] = 5;
            bArr[1] = 1;
            bArr[2] = 0;
            byte[] bArrAM = Util.aM(str);
            int length2 = bArrAM.length;
            bArr[3] = 3;
            bArr[4] = (byte) length2;
            System.arraycopy(bArrAM, 0, bArr, 5, length2);
            int i5 = 5 + length2;
            int i6 = i5 + 1;
            bArr[i5] = (byte) (i >>> 8);
            bArr[i6] = (byte) (i & 255);
            this.Hw.write(bArr, 0, i6 + 1);
            v5(this.FH, bArr, 4);
            if (bArr[1] != 0) {
                try {
                    this.v5.close();
                } catch (Exception unused2) {
                }
                throw new JSchException("ProxySOCKS5: server returns " + ((int) bArr[1]));
            }
            int i7 = bArr[3] & 255;
            if (i7 == 1) {
                v5(this.FH, bArr, 6);
                return;
            }
            if (i7 == 3) {
                v5(this.FH, bArr, 1);
                v5(this.FH, bArr, (bArr[0] & 255) + 2);
            } else {
                if (i7 != 4) {
                    return;
                }
                v5(this.FH, bArr, 18);
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            try {
                if (this.v5 != null) {
                    this.v5.close();
                }
            } catch (Exception unused3) {
            }
            throw new JSchException("ProxySOCKS5: " + e2.toString(), e2);
        }
    }

    @Override // com.jcraft.jsch.Proxy
    public void close() throws IOException {
        try {
            if (this.FH != null) {
                this.FH.close();
            }
            if (this.Hw != null) {
                this.Hw.close();
            }
            if (this.v5 != null) {
                this.v5.close();
            }
        } catch (Exception unused) {
        }
        this.FH = null;
        this.Hw = null;
        this.v5 = null;
    }

    @Override // com.jcraft.jsch.Proxy
    public OutputStream j6() {
        return this.Hw;
    }
}
