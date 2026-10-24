package com.jcraft.jsch;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes.dex */
public class ProxyHTTP implements Proxy {
    private int DW;
    private InputStream FH;
    private OutputStream Hw;
    private String VH;
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
    public void Hw(SocketFactory socketFactory, String str, int i, int i2) throws IOException, NumberFormatException, JSchException {
        int i3;
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
            this.Hw.write(Util.aM("CONNECT " + str + ":" + i + " HTTP/1.0\r\n"));
            if (this.Zo != null && this.VH != null) {
                byte[] bArrAM = Util.aM(String.valueOf(this.Zo) + ":" + this.VH);
                byte[] bArrMr = Util.Mr(bArrAM, 0, bArrAM.length);
                this.Hw.write(Util.aM("Proxy-Authorization: Basic "));
                this.Hw.write(bArrMr);
                this.Hw.write(Util.aM("\r\n"));
            }
            this.Hw.write(Util.aM("\r\n"));
            this.Hw.flush();
            StringBuffer stringBuffer = new StringBuffer();
            int iIndexOf = 0;
            while (iIndexOf >= 0) {
                iIndexOf = this.FH.read();
                if (iIndexOf == 13) {
                    iIndexOf = this.FH.read();
                    if (iIndexOf == 10) {
                        break;
                    }
                } else {
                    stringBuffer.append((char) iIndexOf);
                }
            }
            if (iIndexOf < 0) {
                throw new IOException();
            }
            String string = stringBuffer.toString();
            String strSubstring = "Unknow reason";
            int i4 = -1;
            try {
                iIndexOf = string.indexOf(32);
                int i5 = iIndexOf + 1;
                int iIndexOf2 = string.indexOf(32, i5);
                i4 = Integer.parseInt(string.substring(i5, iIndexOf2));
                strSubstring = string.substring(iIndexOf2 + 1);
            } catch (Exception unused) {
            }
            if (i4 != 200) {
                throw new IOException("proxy error: " + strSubstring);
            }
            do {
                i3 = 0;
                while (iIndexOf >= 0) {
                    iIndexOf = this.FH.read();
                    if (iIndexOf == 13) {
                        iIndexOf = this.FH.read();
                        if (iIndexOf == 10) {
                            break;
                        }
                    } else {
                        i3++;
                    }
                }
                if (iIndexOf < 0) {
                    throw new IOException();
                }
            } while (i3 != 0);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            try {
                if (this.v5 != null) {
                    this.v5.close();
                }
            } catch (Exception unused2) {
            }
            throw new JSchException("ProxyHTTP: " + e2.toString(), e2);
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
