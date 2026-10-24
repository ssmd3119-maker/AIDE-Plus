package com.jcraft.jsch;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public class ProxySOCKS4 implements Proxy {
    private int DW;
    private InputStream FH;
    private OutputStream Hw;
    private String Zo;
    private String j6;
    private Socket v5;

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
            int length = 4;
            bArr[0] = 4;
            bArr[1] = 1;
            bArr[2] = (byte) (i >>> 8);
            bArr[3] = (byte) (i & 255);
            try {
                byte[] address = InetAddress.getByName(str).getAddress();
                int i3 = 0;
                while (i3 < address.length) {
                    int i4 = length + 1;
                    bArr[length] = address[i3];
                    i3++;
                    length = i4;
                }
                if (this.Zo != null) {
                    System.arraycopy(Util.aM(this.Zo), 0, bArr, length, this.Zo.length());
                    length += this.Zo.length();
                }
                bArr[length] = 0;
                this.Hw.write(bArr, 0, length + 1);
                int i5 = 0;
                while (i5 < 8) {
                    int i6 = this.FH.read(bArr, i5, 8 - i5);
                    if (i6 <= 0) {
                        throw new JSchException("ProxySOCKS4: stream is closed");
                    }
                    i5 += i6;
                }
                if (bArr[0] != 0) {
                    throw new JSchException("ProxySOCKS4: server returns VN " + ((int) bArr[0]));
                }
                if (bArr[1] == 90) {
                    return;
                }
                try {
                    this.v5.close();
                } catch (Exception unused) {
                }
                throw new JSchException("ProxySOCKS4: server returns CD " + ((int) bArr[1]));
            } catch (UnknownHostException e) {
                throw new JSchException("ProxySOCKS4: " + e.toString(), e);
            }
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            try {
                if (this.v5 != null) {
                    this.v5.close();
                }
            } catch (Exception unused2) {
            }
            throw new JSchException("ProxySOCKS4: " + e3.toString());
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
