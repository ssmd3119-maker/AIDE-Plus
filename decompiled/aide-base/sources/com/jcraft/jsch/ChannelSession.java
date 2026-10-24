package com.jcraft.jsch;

import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class ChannelSession extends Channel {
    private static byte[] a5 = Util.aM("session");
    protected boolean pO = false;
    protected boolean fN = false;
    protected Hashtable Gj = null;
    protected boolean Cz = false;
    protected String pN = "vt100";
    protected int oy = 80;
    protected int aX = 24;
    protected int e9 = 640;
    protected int QO = 480;
    protected byte[] sM = null;

    ChannelSession() {
        this.jw = a5;
        this.w9 = new IO();
    }

    private byte[] sG(Object obj) {
        return obj instanceof String ? Util.aM((String) obj) : (byte[]) obj;
    }

    public void cb(boolean z) {
        this.pO = z;
    }

    public void dx(boolean z) {
        this.Cz = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        u7();
     */
    @Override // com.jcraft.jsch.Channel, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() throws java.io.IOException {
        /*
            r6 = this;
            com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer
            int r1 = r6.AL
            r0.<init>(r1)
            com.jcraft.jsch.Packet r1 = new com.jcraft.jsch.Packet
            r1.<init>(r0)
        Lc:
            boolean r2 = r6.a8()     // Catch: java.lang.Exception -> L5d
            if (r2 == 0) goto L5e
            java.lang.Thread r2 = r6.hK     // Catch: java.lang.Exception -> L5d
            if (r2 == 0) goto L5e
            com.jcraft.jsch.IO r2 = r6.w9     // Catch: java.lang.Exception -> L5d
            if (r2 == 0) goto L5e
            com.jcraft.jsch.IO r2 = r6.w9     // Catch: java.lang.Exception -> L5d
            java.io.InputStream r2 = r2.j6     // Catch: java.lang.Exception -> L5d
            if (r2 != 0) goto L21
            goto L5e
        L21:
            com.jcraft.jsch.IO r2 = r6.w9     // Catch: java.lang.Exception -> L5d
            java.io.InputStream r2 = r2.j6     // Catch: java.lang.Exception -> L5d
            byte[] r3 = r0.DW     // Catch: java.lang.Exception -> L5d
            byte[] r4 = r0.DW     // Catch: java.lang.Exception -> L5d
            int r4 = r4.length     // Catch: java.lang.Exception -> L5d
            r5 = 14
            int r4 = r4 - r5
            int r4 = r4 + (-84)
            int r2 = r2.read(r3, r5, r4)     // Catch: java.lang.Exception -> L5d
            if (r2 != 0) goto L36
            goto Lc
        L36:
            r3 = -1
            if (r2 != r3) goto L3d
            r6.u7()     // Catch: java.lang.Exception -> L5d
            goto L5e
        L3d:
            boolean r3 = r6.Z1     // Catch: java.lang.Exception -> L5d
            if (r3 == 0) goto L42
            goto L5e
        L42:
            r1.FH()     // Catch: java.lang.Exception -> L5d
            r3 = 94
            r0.j3(r3)     // Catch: java.lang.Exception -> L5d
            int r3 = r6.mb     // Catch: java.lang.Exception -> L5d
            r0.a8(r3)     // Catch: java.lang.Exception -> L5d
            r0.a8(r2)     // Catch: java.lang.Exception -> L5d
            r0.ei(r2)     // Catch: java.lang.Exception -> L5d
            com.jcraft.jsch.Session r3 = r6.Mr()     // Catch: java.lang.Exception -> L5d
            r3.XX(r1, r6, r2)     // Catch: java.lang.Exception -> L5d
            goto Lc
        L5d:
        L5e:
            java.lang.Thread r0 = r6.hK
            if (r0 == 0) goto L6b
            monitor-enter(r0)
            r0.notifyAll()     // Catch: java.lang.Throwable -> L68
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            goto L6b
        L68:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            throw r1
        L6b:
            r0 = 0
            r6.hK = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.ChannelSession.run():void");
    }

    protected void sh() throws JSchException {
        Session sessionMr = Mr();
        if (this.pO) {
            new RequestAgentForwarding().j6(sessionMr, this);
        }
        if (this.fN) {
            new RequestX11().j6(sessionMr, this);
        }
        if (this.Cz) {
            RequestPtyReq requestPtyReq = new RequestPtyReq();
            requestPtyReq.Zo(this.pN);
            requestPtyReq.v5(this.oy, this.aX, this.e9, this.QO);
            byte[] bArr = this.sM;
            if (bArr != null) {
                requestPtyReq.VH(bArr);
            }
            requestPtyReq.j6(sessionMr, this);
        }
        Hashtable hashtable = this.Gj;
        if (hashtable != null) {
            Enumeration enumerationKeys = hashtable.keys();
            while (enumerationKeys.hasMoreElements()) {
                Object objNextElement = enumerationKeys.nextElement();
                Object obj = this.Gj.get(objNextElement);
                RequestEnv requestEnv = new RequestEnv();
                requestEnv.v5(sG(objNextElement), sG(obj));
                requestEnv.j6(sessionMr, this);
            }
        }
    }
}
