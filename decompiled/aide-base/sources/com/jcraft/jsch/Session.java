package com.jcraft.jsch;

import com.aide.uidesigner.ProxyTextView;
import com.jcraft.jsch.ConfigRepository;
import com.jcraft.jsch.IdentityRepository;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes.dex */
public class Session implements Runnable {
    static Random GK;
    private static final byte[] dW = Util.aM("keepalive@jcraft.com");
    private UserInfo AE;
    private byte[] AL;
    private MAC Jl;
    String MP;
    String Of;
    int PT;
    private Cipher Q6;
    JSch TI;
    private byte[] WB;
    String b1;
    private byte[] cT;
    private byte[] e3;
    private byte[] eU;
    private Socket fN;
    private byte[] fY;
    private byte[] hK;
    private MAC iW;
    private byte[] jw;
    private byte[] k2;
    private Cipher kf;
    private IO pO;
    private byte[] qp;
    private Compression sE;
    private Compression sg;
    private byte[] w9;
    Runnable xg;
    private byte[] zh;
    private byte[] mb = Util.aM("SSH-2.0-JSCH-0.1.51");
    private int q7 = 0;
    private int Z1 = 0;
    String[] n5 = null;
    private int Gj = 0;
    private volatile boolean Cz = false;
    private boolean pN = false;
    private Thread oy = null;
    private Object aX = new Object();
    boolean e9 = false;
    boolean QO = false;
    InputStream sM = null;
    OutputStream a5 = null;
    SocketFactory gG = null;
    private Hashtable Nh = null;
    private Proxy BR = null;
    private String Za = null;
    private int An = 1;
    private IdentityRepository Pa = null;
    private HostKeyRepository ce = null;
    protected boolean Jm = false;
    private long Bx = 0;
    int oa = 6;
    int qP = 0;
    byte[] AR = null;
    private boolean ct = false;
    int[] Fd = new int[1];
    int[] Lz = new int[1];
    private int sT = 8;
    private int E4 = 8;
    private GlobalRequestReply hp = new GlobalRequestReply(this, null);
    private HostKey PH = null;
    Buffer ys = new Buffer();
    Packet IS = new Packet(this.ys);

    static {
        Util.aM("no-more-sessions@openssh.com");
    }

    Session(JSch jSch, String str, String str2, int i) throws SocketException, JSchException {
        this.MP = "127.0.0.1";
        this.Of = "127.0.0.1";
        this.PT = 22;
        this.b1 = null;
        this.TI = jSch;
        this.b1 = str;
        this.MP = str2;
        this.Of = str2;
        this.PT = i;
        Hw();
        if (this.b1 == null) {
            try {
                this.b1 = (String) System.getProperties().get("user.name");
            } catch (SecurityException unused) {
            }
        }
        if (this.b1 == null) {
            throw new JSchException("username is not given.");
        }
    }

    private void BT(String str) throws JSchException {
        if (str.equals("none")) {
            this.sg = null;
            return;
        }
        String strAM = aM(str);
        if (strAM != null) {
            if (str.equals("zlib") || (this.pN && str.equals("zlib@openssh.com"))) {
                try {
                    Compression compression = (Compression) Class.forName(strAM).newInstance();
                    this.sg = compression;
                    compression.DW(0, 0);
                } catch (Exception e) {
                    throw new JSchException(e.toString(), e);
                }
            }
        }
    }

    private void DW(Packet packet) {
        synchronized (this.aX) {
            QX(packet);
            if (this.pO != null) {
                this.pO.v5(packet);
                this.Z1++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void EQ(java.lang.String r11, int r12, com.jcraft.jsch.KeyExchange r13) throws com.jcraft.jsch.JSchException {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.Session.EQ(java.lang.String, int, com.jcraft.jsch.KeyExchange):void");
    }

    private void Hw() throws SocketException, JSchException {
        ConfigRepository configRepositoryZo = this.TI.Zo();
        if (configRepositoryZo == null) {
            return;
        }
        ConfigRepository.Config configJ6 = configRepositoryZo.j6(this.Of);
        String strHw = configJ6.Hw();
        if (strHw != null) {
            this.b1 = strHw;
        }
        String strV5 = configJ6.v5();
        if (strV5 != null) {
            this.MP = strV5;
        }
        int iDW = configJ6.DW();
        if (iDW != -1) {
            this.PT = iDW;
        }
        tp(configJ6, "kex");
        tp(configJ6, "server_host_key");
        tp(configJ6, "cipher.c2s");
        tp(configJ6, "cipher.s2c");
        tp(configJ6, "mac.c2s");
        tp(configJ6, "mac.s2c");
        tp(configJ6, "compression.c2s");
        tp(configJ6, "compression.s2c");
        tp(configJ6, "compression_level");
        tp(configJ6, "StrictHostKeyChecking");
        tp(configJ6, "HashKnownHosts");
        tp(configJ6, "PreferredAuthentications");
        tp(configJ6, "MaxAuthTries");
        tp(configJ6, "ClearAllForwardings");
        String strJ6 = configJ6.j6("HostKeyAlias");
        if (strJ6 != null) {
            sG(strJ6);
        }
        String strJ62 = configJ6.j6("UserKnownHostsFile");
        if (strJ62 != null) {
            KnownHosts knownHosts = new KnownHosts(this.TI);
            knownHosts.J8(strJ62);
            ef(knownHosts);
        }
        String[] strArrFH = configJ6.FH("IdentityFile");
        if (strArrFH != null) {
            String[] strArrFH2 = configRepositoryZo.j6("").FH("IdentityFile");
            if (strArrFH2 != null) {
                for (String str : strArrFH2) {
                    this.TI.DW(str);
                }
            } else {
                strArrFH2 = new String[0];
            }
            if (strArrFH.length - strArrFH2.length > 0) {
                IdentityRepository.Wrapper wrapper = new IdentityRepository.Wrapper(this.TI.u7(), true);
                for (String str2 : strArrFH) {
                    int i = 0;
                    while (true) {
                        if (i >= strArrFH2.length) {
                            break;
                        }
                        if (str2.equals(strArrFH2[i])) {
                            str2 = null;
                            break;
                        }
                        i++;
                    }
                    if (str2 != null) {
                        wrapper.v5(IdentityFile.VH(str2, null, this.TI));
                    }
                }
                Sf(wrapper);
            }
        }
        String strJ63 = configJ6.j6("ServerAliveInterval");
        if (strJ63 != null) {
            try {
                Qq(Integer.parseInt(strJ63));
            } catch (NumberFormatException unused) {
            }
        }
        String strJ64 = configJ6.j6("ConnectTimeout");
        if (strJ64 != null) {
            try {
                sy(Integer.parseInt(strJ64));
            } catch (NumberFormatException unused2) {
            }
        }
        String strJ65 = configJ6.j6("MaxAuthTries");
        if (strJ65 != null) {
            dx("MaxAuthTries", strJ65);
        }
        String strJ66 = configJ6.j6("ClearAllForwardings");
        if (strJ66 != null) {
            dx("ClearAllForwardings", strJ66);
        }
    }

    private String[] J0(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (JSch.tp().isEnabled(1)) {
            JSch.tp().j6(1, "CheckKexes: " + str);
        }
        Vector vector = new Vector();
        String[] strArrXL = Util.XL(str, ",");
        for (int i = 0; i < strArrXL.length; i++) {
            if (!we(this, aM(strArrXL[i]))) {
                vector.addElement(strArrXL[i]);
            }
        }
        if (vector.size() == 0) {
            return null;
        }
        int size = vector.size();
        String[] strArr = new String[size];
        System.arraycopy(vector.toArray(), 0, strArr, 0, vector.size());
        if (JSch.tp().isEnabled(1)) {
            for (int i2 = 0; i2 < size; i2++) {
                JSch.tp().j6(1, String.valueOf(strArr[i2]) + " is not available.");
            }
        }
        return strArr;
    }

    private void KD(Buffer buffer, KeyExchange keyExchange) throws Exception {
        OW(keyExchange);
        this.ct = false;
    }

    private void OW(KeyExchange keyExchange) throws Exception {
        byte[] bArrV5 = keyExchange.v5();
        byte[] bArrDW = keyExchange.DW();
        HASH hashFH = keyExchange.FH();
        if (this.qp == null) {
            byte[] bArr = new byte[bArrDW.length];
            this.qp = bArr;
            System.arraycopy(bArrDW, 0, bArr, 0, bArrDW.length);
        }
        this.ys.gW();
        this.ys.rN(bArrV5);
        this.ys.Mr(bArrDW);
        this.ys.j3((byte) 65);
        this.ys.Mr(this.qp);
        Buffer buffer = this.ys;
        hashFH.j6(buffer.DW, 0, buffer.FH);
        this.k2 = hashFH.Hw();
        Buffer buffer2 = this.ys;
        int i = buffer2.FH;
        int length = (i - this.qp.length) - 1;
        byte[] bArr2 = buffer2.DW;
        bArr2[length] = (byte) (bArr2[length] + 1);
        hashFH.j6(bArr2, 0, i);
        this.zh = hashFH.Hw();
        Buffer buffer3 = this.ys;
        byte[] bArr3 = buffer3.DW;
        bArr3[length] = (byte) (bArr3[length] + 1);
        hashFH.j6(bArr3, 0, buffer3.FH);
        this.AL = hashFH.Hw();
        Buffer buffer4 = this.ys;
        byte[] bArr4 = buffer4.DW;
        bArr4[length] = (byte) (bArr4[length] + 1);
        hashFH.j6(bArr4, 0, buffer4.FH);
        this.w9 = hashFH.Hw();
        Buffer buffer5 = this.ys;
        byte[] bArr5 = buffer5.DW;
        bArr5[length] = (byte) (bArr5[length] + 1);
        hashFH.j6(bArr5, 0, buffer5.FH);
        this.hK = hashFH.Hw();
        Buffer buffer6 = this.ys;
        byte[] bArr6 = buffer6.DW;
        bArr6[length] = (byte) (bArr6[length] + 1);
        hashFH.j6(bArr6, 0, buffer6.FH);
        this.cT = hashFH.Hw();
        try {
            this.Q6 = (Cipher) Class.forName(aM(this.n5[3])).newInstance();
            while (this.Q6.FH() > this.w9.length) {
                this.ys.gW();
                this.ys.rN(bArrV5);
                this.ys.Mr(bArrDW);
                this.ys.Mr(this.w9);
                hashFH.j6(this.ys.DW, 0, this.ys.FH);
                byte[] bArrHw = hashFH.Hw();
                byte[] bArr7 = new byte[this.w9.length + bArrHw.length];
                System.arraycopy(this.w9, 0, bArr7, 0, this.w9.length);
                System.arraycopy(bArrHw, 0, bArr7, this.w9.length, bArrHw.length);
                this.w9 = bArr7;
            }
            this.Q6.v5(1, this.w9, this.zh);
            this.sT = this.Q6.Zo();
            MAC mac = (MAC) Class.forName(aM(this.n5[5])).newInstance();
            this.Jl = mac;
            byte[] bArrXL = XL(this.ys, bArrV5, bArrDW, this.cT, hashFH, mac.FH());
            this.cT = bArrXL;
            this.Jl.Zo(bArrXL);
            this.eU = new byte[this.Jl.FH()];
            this.e3 = new byte[this.Jl.FH()];
            this.kf = (Cipher) Class.forName(aM(this.n5[2])).newInstance();
            while (this.kf.FH() > this.AL.length) {
                this.ys.gW();
                this.ys.rN(bArrV5);
                this.ys.Mr(bArrDW);
                this.ys.Mr(this.AL);
                hashFH.j6(this.ys.DW, 0, this.ys.FH);
                byte[] bArrHw2 = hashFH.Hw();
                byte[] bArr8 = new byte[this.AL.length + bArrHw2.length];
                System.arraycopy(this.AL, 0, bArr8, 0, this.AL.length);
                System.arraycopy(bArrHw2, 0, bArr8, this.AL.length, bArrHw2.length);
                this.AL = bArr8;
            }
            this.kf.v5(0, this.AL, this.k2);
            this.E4 = this.kf.Zo();
            MAC mac2 = (MAC) Class.forName(aM(this.n5[4])).newInstance();
            this.iW = mac2;
            byte[] bArrXL2 = XL(this.ys, bArrV5, bArrDW, this.hK, hashFH, mac2.FH());
            this.hK = bArrXL2;
            this.iW.Zo(bArrXL2);
            gW(this.n5[6]);
            BT(this.n5[7]);
        } catch (Exception e) {
            if (!(e instanceof JSchException)) {
                throw new JSchException(e.toString(), e);
            }
            throw e;
        }
    }

    private KeyExchange SI(Buffer buffer) throws JSchException {
        int iU7 = buffer.u7();
        if (iU7 != buffer.tp()) {
            buffer.FH();
            this.fY = new byte[buffer.FH - 5];
        } else {
            this.fY = new byte[(iU7 - 1) - buffer.FH()];
        }
        byte[] bArr = buffer.DW;
        int i = buffer.Hw;
        byte[] bArr2 = this.fY;
        System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
        if (!this.ct) {
            sh();
        }
        String[] strArrGn = KeyExchange.gn(this.fY, this.jw);
        this.n5 = strArrGn;
        if (strArrGn == null) {
            throw new JSchException("Algorithm negotiation fail");
        }
        if (!this.pN && (strArrGn[2].equals("none") || this.n5[3].equals("none"))) {
            throw new JSchException("NONE Cipher should not be chosen before authentification is successed.");
        }
        try {
            KeyExchange keyExchange = (KeyExchange) Class.forName(aM(this.n5[0])).newInstance();
            keyExchange.u7(this, this.WB, this.mb, this.fY, this.jw);
            return keyExchange;
        } catch (Exception e) {
            throw new JSchException(e.toString(), e);
        }
    }

    private void VH(ChannelSession channelSession) {
        ConfigRepository configRepositoryZo = this.TI.Zo();
        if (configRepositoryZo == null) {
            return;
        }
        ConfigRepository.Config configJ6 = configRepositoryZo.j6(this.Of);
        String strJ6 = configJ6.j6("ForwardAgent");
        if (strJ6 != null) {
            channelSession.cb(strJ6.equals("yes"));
        }
        String strJ62 = configJ6.j6("RequestTTY");
        if (strJ62 != null) {
            channelSession.dx(strJ62.equals("yes"));
        }
    }

    private byte[] XL(Buffer buffer, byte[] bArr, byte[] bArr2, byte[] bArr3, HASH hash, int i) {
        int iFH = hash.FH();
        while (bArr3.length < i) {
            buffer.gW();
            buffer.rN(bArr);
            buffer.Mr(bArr2);
            buffer.Mr(bArr3);
            hash.j6(buffer.DW, 0, buffer.FH);
            byte[] bArr4 = new byte[bArr3.length + iFH];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            System.arraycopy(hash.Hw(), 0, bArr4, bArr3.length, iFH);
            Util.Zo(bArr3);
            bArr3 = bArr4;
        }
        return bArr3;
    }

    private void cb() {
        this.IS.FH();
        this.ys.j3((byte) 21);
        br(this.IS);
        if (JSch.tp().isEnabled(1)) {
            JSch.tp().j6(1, "SSH_MSG_NEWKEYS sent");
        }
    }

    private Forwarding ei(String str) throws JSchException {
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length > 1) {
            Vector vector = new Vector();
            for (int i = 0; i < strArrSplit.length; i++) {
                if (strArrSplit[i].length() != 0) {
                    vector.addElement(strArrSplit[i].trim());
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            int i2 = 0;
            while (i2 < vector.size()) {
                stringBuffer.append((String) vector.elementAt(i2));
                i2++;
                if (i2 < vector.size()) {
                    stringBuffer.append(":");
                }
            }
            str = stringBuffer.toString();
        }
        Forwarding forwarding = new Forwarding(this, null);
        try {
            if (str.lastIndexOf(":") == -1) {
                throw new JSchException("parseForwarding: " + str);
            }
            forwarding.Hw = Integer.parseInt(str.substring(str.lastIndexOf(":") + 1));
            String strSubstring = str.substring(0, str.lastIndexOf(":"));
            if (strSubstring.lastIndexOf(":") == -1) {
                throw new JSchException("parseForwarding: " + str);
            }
            forwarding.FH = strSubstring.substring(strSubstring.lastIndexOf(":") + 1);
            String strSubstring2 = strSubstring.substring(0, strSubstring.lastIndexOf(":"));
            String str2 = "127.0.0.1";
            if (strSubstring2.lastIndexOf(":") != -1) {
                forwarding.DW = Integer.parseInt(strSubstring2.substring(strSubstring2.lastIndexOf(":") + 1));
                String strSubstring3 = strSubstring2.substring(0, strSubstring2.lastIndexOf(":"));
                if (strSubstring3.length() == 0 || strSubstring3.equals("*")) {
                    strSubstring3 = "0.0.0.0";
                }
                if (!strSubstring3.equals("localhost")) {
                    str2 = strSubstring3;
                }
                forwarding.j6 = str2;
            } else {
                forwarding.DW = Integer.parseInt(strSubstring2);
                forwarding.j6 = "127.0.0.1";
            }
            return forwarding;
        } catch (NumberFormatException e) {
            throw new JSchException("parseForwarding: " + e.toString());
        }
    }

    private void gW(String str) throws NumberFormatException, JSchException {
        if (str.equals("none")) {
            this.sE = null;
            return;
        }
        String strAM = aM(str);
        if (strAM != null) {
            if (str.equals("zlib") || (this.pN && str.equals("zlib@openssh.com"))) {
                try {
                    try {
                        this.sE = (Compression) Class.forName(strAM).newInstance();
                        int i = 6;
                        try {
                            i = Integer.parseInt(aM("compression_level"));
                        } catch (Exception unused) {
                        }
                        this.sE.DW(1, i);
                    } catch (NoClassDefFoundError e) {
                        throw new JSchException(e.toString(), e);
                    }
                } catch (Exception e2) {
                    throw new JSchException(e2.toString(), e2);
                }
            }
        }
    }

    static boolean gn(String str) {
        try {
            Cipher cipher = (Cipher) Class.forName(str).newInstance();
            cipher.v5(0, new byte[cipher.FH()], new byte[cipher.Zo()]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private int j6(String str, int i) {
        int iJ6;
        synchronized (this.hp) {
            Buffer buffer = new Buffer(100);
            Packet packet = new Packet(buffer);
            String strSf = ChannelForwardedTCPIP.Sf(str);
            this.hp.Zo(Thread.currentThread());
            this.hp.Hw(i);
            try {
                packet.FH();
                buffer.j3((byte) 80);
                buffer.er(Util.aM("tcpip-forward"));
                buffer.j3((byte) 1);
                buffer.er(Util.aM(strSf));
                buffer.a8(i);
                br(packet);
                int i2 = 0;
                int iDW = this.hp.DW();
                while (i2 < 10 && iDW == -1) {
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception unused) {
                    }
                    i2++;
                    iDW = this.hp.DW();
                }
                this.hp.Zo(null);
                if (iDW != 1) {
                    throw new JSchException("remote port forwarding failed for listen port " + i);
                }
                iJ6 = this.hp.j6();
            } catch (Exception e) {
                this.hp.Zo(null);
                throw new JSchException(e.toString(), e);
            }
        }
        return iJ6;
    }

    private void lp(Buffer buffer, Cipher cipher, MAC mac, int i, int i2) throws IOException, JSchException {
        if (!cipher.Hw()) {
            throw new JSchException("Packet corrupt");
        }
        if (i == 262144 || mac == null) {
            mac = null;
        }
        int i3 = i2 - buffer.FH;
        while (i3 > 0) {
            buffer.gW();
            byte[] bArr = buffer.DW;
            int length = i3 > bArr.length ? bArr.length : i3;
            this.pO.FH(buffer.DW, 0, length);
            if (mac != null) {
                mac.j6(buffer.DW, 0, length);
            }
            i3 -= length;
        }
        if (mac != null) {
            mac.Hw(buffer.DW, 0);
        }
        throw new JSchException("Packet corrupt");
    }

    private void ro() throws JSchException {
        ConfigRepository configRepositoryZo;
        if (aM("ClearAllForwardings").equals("yes") || (configRepositoryZo = this.TI.Zo()) == null) {
            return;
        }
        ConfigRepository.Config configJ6 = configRepositoryZo.j6(this.Of);
        String[] strArrFH = configJ6.FH("LocalForward");
        if (strArrFH != null) {
            for (String str : strArrFH) {
                g3(str);
            }
        }
        String[] strArrFH2 = configJ6.FH("RemoteForward");
        if (strArrFH2 != null) {
            for (String str2 : strArrFH2) {
                x9(str2);
            }
        }
    }

    private void sh() throws JSchException {
        if (this.ct) {
            return;
        }
        String strAM = aM("cipher.c2s");
        String strAM2 = aM("cipher.s2c");
        String[] strArrU7 = u7(aM("CheckCiphers"));
        if (strArrU7 != null && strArrU7.length > 0) {
            strAM = Util.u7(strAM, strArrU7);
            strAM2 = Util.u7(strAM2, strArrU7);
            if (strAM == null || strAM2 == null) {
                throw new JSchException("There are not any available ciphers.");
            }
        }
        String strAM3 = aM("kex");
        String[] strArrJ0 = J0(aM("CheckKexes"));
        if (strArrJ0 != null && strArrJ0.length > 0 && (strAM3 = Util.u7(strAM3, strArrJ0)) == null) {
            throw new JSchException("There are not any available kexes.");
        }
        this.ct = true;
        this.Bx = System.currentTimeMillis();
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.FH();
        buffer.j3((byte) 20);
        synchronized (GK) {
            GK.j6(buffer.DW, buffer.FH, 16);
            buffer.ei(16);
        }
        buffer.er(Util.aM(strAM3));
        buffer.er(Util.aM(aM("server_host_key")));
        buffer.er(Util.aM(strAM));
        buffer.er(Util.aM(strAM2));
        buffer.er(Util.aM(aM("mac.c2s")));
        buffer.er(Util.aM(aM("mac.s2c")));
        buffer.er(Util.aM(aM("compression.c2s")));
        buffer.er(Util.aM(aM("compression.s2c")));
        buffer.er(Util.aM(aM("lang.c2s")));
        buffer.er(Util.aM(aM("lang.s2c")));
        buffer.j3((byte) 0);
        buffer.a8(0);
        buffer.vy(5);
        byte[] bArr = new byte[buffer.tp()];
        this.jw = bArr;
        buffer.v5(bArr);
        br(packet);
        if (JSch.tp().isEnabled(1)) {
            JSch.tp().j6(1, "SSH_MSG_KEXINIT sent");
        }
    }

    private void tp(ConfigRepository.Config config, String str) {
        String strJ6 = config.j6(str);
        if (strJ6 != null) {
            dx(str, strJ6);
        }
    }

    private String[] u7(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (JSch.tp().isEnabled(1)) {
            JSch.tp().j6(1, "CheckCiphers: " + str);
        }
        String strAM = aM("cipher.c2s");
        String strAM2 = aM("cipher.s2c");
        Vector vector = new Vector();
        for (String str2 : Util.XL(str, ",")) {
            if ((strAM2.indexOf(str2) != -1 || strAM.indexOf(str2) != -1) && !gn(aM(str2))) {
                vector.addElement(str2);
            }
        }
        if (vector.size() == 0) {
            return null;
        }
        int size = vector.size();
        String[] strArr = new String[size];
        System.arraycopy(vector.toArray(), 0, strArr, 0, vector.size());
        if (JSch.tp().isEnabled(1)) {
            for (int i = 0; i < size; i++) {
                JSch.tp().j6(1, String.valueOf(strArr[i]) + " is not available.");
            }
        }
        return strArr;
    }

    static boolean we(Session session, String str) {
        try {
            ((KeyExchange) Class.forName(str).newInstance()).u7(session, null, null, null, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    void FH(Channel channel) {
        channel.SI(this);
    }

    public int I(String str, int i, String str2, int i2, ServerSocketFactory serverSocketFactory) {
        return ca(str, i, str2, i2, serverSocketFactory, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x04eb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04ec, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x04ee, code lost:
    
        r16.ct = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04f0, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x04f1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04f2, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x055f, code lost:
    
        r16.ct = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0563, code lost:
    
        if (r16.Cz != false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0565, code lost:
    
        r3 = r2.toString();
        r16.IS.FH();
        r16.ys.j6(((r3.length() + 13) + 2) + 84);
        r16.ys.j3((byte) 1);
        r16.ys.a8(3);
        r16.ys.er(com.jcraft.jsch.Util.aM(r3));
        r16.ys.er(com.jcraft.jsch.Util.aM("en"));
        br(r16.IS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x05a1, code lost:
    
        Ws();
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x05a5, code lost:
    
        r16.Cz = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x05a9, code lost:
    
        if ((r2 instanceof java.lang.RuntimeException) == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x05ad, code lost:
    
        if ((r2 instanceof com.jcraft.jsch.JSchException) != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x05b1, code lost:
    
        throw ((com.jcraft.jsch.JSchException) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x05b9, code lost:
    
        throw new com.jcraft.jsch.JSchException("Session.connect", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x05bc, code lost:
    
        throw ((java.lang.RuntimeException) r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J8(int r17) throws com.jcraft.jsch.JSchException {
        /*
            Method dump skipped, instructions count: 1487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.Session.J8(int):void");
    }

    public HostKeyRepository Mr() {
        HostKeyRepository hostKeyRepository = this.ce;
        return hostKeyRepository == null ? this.TI.VH() : hostKeyRepository;
    }

    public int Mz(String str, int i, String str2, int i2) {
        return I(str, i, str2, i2, null);
    }

    public Channel P8(String str) throws JSchException {
        if (!this.Cz) {
            throw new JSchException("session is down");
        }
        try {
            Channel channelJ0 = Channel.J0(str);
            FH(channelJ0);
            channelJ0.U2();
            if (channelJ0 instanceof ChannelSession) {
                VH((ChannelSession) channelJ0);
            }
            return channelJ0;
        } catch (Exception unused) {
            return null;
        }
    }

    public void QX(Packet packet) {
        Compression compression = this.sE;
        if (compression != null) {
            int[] iArr = this.Lz;
            Buffer buffer = packet.j6;
            iArr[0] = buffer.FH;
            buffer.DW = compression.j6(buffer.DW, 5, iArr);
            packet.j6.FH = this.Lz[0];
        }
        if (this.kf != null) {
            packet.DW(this.E4);
            byte b = packet.j6.DW[4];
            synchronized (GK) {
                GK.j6(packet.j6.DW, packet.j6.FH - b, b);
            }
        } else {
            packet.DW(8);
        }
        MAC mac = this.iW;
        if (mac != null) {
            mac.v5(this.Z1);
            MAC mac2 = this.iW;
            Buffer buffer2 = packet.j6;
            mac2.j6(buffer2.DW, 0, buffer2.FH);
            MAC mac3 = this.iW;
            Buffer buffer3 = packet.j6;
            mac3.Hw(buffer3.DW, buffer3.FH);
        }
        Cipher cipher = this.kf;
        if (cipher != null) {
            Buffer buffer4 = packet.j6;
            byte[] bArr = buffer4.DW;
            cipher.VH(bArr, 0, buffer4.FH, bArr, 0);
        }
        MAC mac4 = this.iW;
        if (mac4 != null) {
            packet.j6.ei(mac4.FH());
        }
    }

    public void Qq(int i) throws SocketException, JSchException {
        sy(i);
    }

    public void Sf(IdentityRepository identityRepository) {
        this.Pa = identityRepository;
    }

    IdentityRepository U2() {
        IdentityRepository identityRepository = this.Pa;
        return identityRepository == null ? this.TI.u7() : identityRepository;
    }

    public void Ws() throws IOException {
        if (this.Cz) {
            if (JSch.tp().isEnabled(1)) {
                JSch.tp().j6(1, "Disconnecting from " + this.MP + " port " + this.PT);
            }
            Channel.gn(this);
            this.Cz = false;
            PortWatcher.DW(this);
            ChannelForwardedTCPIP.cb(this);
            ChannelX11.sG(this);
            synchronized (this.aX) {
                if (this.oy != null) {
                    Thread.yield();
                    this.oy.interrupt();
                    this.oy = null;
                }
            }
            this.xg = null;
            try {
                if (this.pO != null) {
                    if (this.pO.j6 != null) {
                        this.pO.j6.close();
                    }
                    if (this.pO.DW != null) {
                        this.pO.DW.close();
                    }
                    if (this.pO.FH != null) {
                        this.pO.FH.close();
                    }
                }
                if (this.BR != null) {
                    synchronized (this.BR) {
                        this.BR.close();
                    }
                    this.BR = null;
                } else if (this.fN != null) {
                    this.fN.close();
                }
            } catch (Exception unused) {
            }
            this.pO = null;
            this.fN = null;
            this.TI.we(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c6, code lost:
    
        r14.zh -= r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e0, code lost:
    
        throw new java.io.IOException("channel is broken");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void XX(com.jcraft.jsch.Packet r13, com.jcraft.jsch.Channel r14, int r15) throws java.lang.InterruptedException, java.io.IOException, com.jcraft.jsch.JSchException {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.Session.XX(com.jcraft.jsch.Packet, com.jcraft.jsch.Channel, int):void");
    }

    public int a8() {
        return this.PT;
    }

    public String aM(String str) {
        Hashtable hashtable = this.Nh;
        if (hashtable != null) {
            Object obj = hashtable.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        String strV5 = JSch.v5(str);
        if (strV5 instanceof String) {
            return strV5;
        }
        return null;
    }

    public void aj(UserInfo userInfo) {
        this.AE = userInfo;
    }

    public void br(Packet packet) {
        long jRN = rN();
        while (this.ct) {
            if (jRN > 0 && System.currentTimeMillis() - this.Bx > jRN) {
                throw new JSchException("timeout in wating for rekeying process.");
            }
            byte bGn = packet.j6.gn();
            if (bGn == 20 || bGn == 21 || bGn == 30 || bGn == 31 || bGn == 31 || bGn == 32 || bGn == 33 || bGn == 34 || bGn == 1) {
                break;
            } else {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException unused) {
                }
            }
        }
        DW(packet);
    }

    public int ca(String str, int i, String str2, int i2, ServerSocketFactory serverSocketFactory, int i3) {
        PortWatcher portWatcherJ6 = PortWatcher.j6(this, str, i, str2, i2, serverSocketFactory);
        portWatcherJ6.gn(i3);
        Thread thread = new Thread(portWatcherJ6);
        thread.setName("PortWatcher Thread for " + str2);
        boolean z = this.Jm;
        if (z) {
            thread.setDaemon(z);
        }
        thread.start();
        return portWatcherJ6.mb;
    }

    public void cn() {
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.FH();
        buffer.j3((byte) 80);
        buffer.er(dW);
        buffer.j3((byte) 1);
        br(packet);
    }

    public void dx(String str, String str2) {
        synchronized (this.aX) {
            if (this.Nh == null) {
                this.Nh = new Hashtable();
            }
            this.Nh.put(str, str2);
        }
    }

    public void ef(HostKeyRepository hostKeyRepository) {
        this.ce = hostKeyRepository;
    }

    public UserInfo er() {
        return this.AE;
    }

    public int g3(String str) throws JSchException {
        Forwarding forwardingEi = ei(str);
        return Mz(forwardingEi.j6, forwardingEi.DW, forwardingEi.FH, forwardingEi.Hw);
    }

    public String j3() {
        return this.MP;
    }

    byte[] lg() {
        return this.qp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f8, code lost:
    
        lp(r20, r19.Q6, r19.Jl, r8, 262144);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0207, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.jcraft.jsch.Buffer nw(com.jcraft.jsch.Buffer r20) throws java.io.IOException, java.lang.NumberFormatException, com.jcraft.jsch.JSchException {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.Session.nw(com.jcraft.jsch.Buffer):com.jcraft.jsch.Buffer");
    }

    public int rN() {
        return this.Gj;
    }

    @Override // java.lang.Runnable
    public void run() throws IOException, JSchException {
        this.xg = this;
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        while (true) {
            KeyExchange keyExchangeSI = null;
            while (true) {
                int i = 0;
                while (this.Cz && this.xg != null) {
                    try {
                        try {
                            nw(buffer);
                            int iGn = buffer.gn() & 255;
                            if (keyExchangeSI != null && keyExchangeSI.VH() == iGn) {
                                this.Bx = System.currentTimeMillis();
                                boolean zTp = keyExchangeSI.tp(buffer);
                                if (!zTp) {
                                    throw new JSchException("verify: " + zTp);
                                }
                            } else if (iGn == 20) {
                                keyExchangeSI = SI(buffer);
                            } else if (iGn != 21) {
                                switch (iGn) {
                                    case 80:
                                        buffer.u7();
                                        buffer.Ws();
                                        buffer.QX();
                                        if (!(buffer.FH() != 0)) {
                                            break;
                                        } else {
                                            packet.FH();
                                            buffer.j3((byte) 82);
                                            br(packet);
                                            break;
                                        }
                                    case ProxyTextView.INPUTTYPE_textLongMessage /* 81 */:
                                    case 82:
                                        Thread threadFH = this.hp.FH();
                                        if (threadFH == null) {
                                            break;
                                        } else {
                                            this.hp.v5(iGn == 81 ? 1 : 0);
                                            if (iGn == 81 && this.hp.j6() == 0) {
                                                buffer.u7();
                                                buffer.Ws();
                                                this.hp.Hw(buffer.u7());
                                            }
                                            threadFH.interrupt();
                                            break;
                                        }
                                    default:
                                        switch (iGn) {
                                            case 90:
                                                buffer.u7();
                                                buffer.Ws();
                                                String strDW = Util.DW(buffer.QX());
                                                if (!"forwarded-tcpip".equals(strDW) && ((!"x11".equals(strDW) || !this.e9) && (!"auth-agent@openssh.com".equals(strDW) || !this.QO))) {
                                                    packet.FH();
                                                    buffer.j3((byte) 92);
                                                    buffer.a8(buffer.u7());
                                                    buffer.a8(1);
                                                    buffer.er(Util.FH);
                                                    buffer.er(Util.FH);
                                                    br(packet);
                                                    break;
                                                } else {
                                                    Channel channelJ0 = Channel.J0(strDW);
                                                    FH(channelJ0);
                                                    channelJ0.J8(buffer);
                                                    channelJ0.U2();
                                                    Thread thread = new Thread(channelJ0);
                                                    thread.setName("Channel " + strDW + " " + this.MP);
                                                    if (this.Jm) {
                                                        thread.setDaemon(this.Jm);
                                                    }
                                                    thread.start();
                                                    break;
                                                }
                                            case 91:
                                                buffer.u7();
                                                buffer.Ws();
                                                Channel channelWe = Channel.we(buffer.u7(), this);
                                                int iU7 = buffer.u7();
                                                long jAM = buffer.aM();
                                                int iU72 = buffer.u7();
                                                if (channelWe == null) {
                                                    break;
                                                } else {
                                                    channelWe.nw(jAM);
                                                    channelWe.ei(iU72);
                                                    channelWe.Q6 = true;
                                                    channelWe.P8(iU7);
                                                    break;
                                                }
                                            case 92:
                                                buffer.u7();
                                                buffer.Ws();
                                                Channel channelWe2 = Channel.we(buffer.u7(), this);
                                                if (channelWe2 == null) {
                                                    break;
                                                } else {
                                                    channelWe2.yS(buffer.u7());
                                                    channelWe2.Z1 = true;
                                                    channelWe2.q7 = true;
                                                    channelWe2.P8(0);
                                                    break;
                                                }
                                            case 93:
                                                buffer.u7();
                                                buffer.Ws();
                                                Channel channelWe3 = Channel.we(buffer.u7(), this);
                                                if (channelWe3 != null) {
                                                    channelWe3.j6(buffer.aM());
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case 94:
                                                buffer.u7();
                                                buffer.FH();
                                                buffer.FH();
                                                Channel channelWe4 = Channel.we(buffer.u7(), this);
                                                byte[] bArrXL = buffer.XL(iArr, iArr2);
                                                if (channelWe4 != null && iArr2[0] != 0) {
                                                    try {
                                                        try {
                                                            channelWe4.ro(bArrXL, iArr[0], iArr2[0]);
                                                            channelWe4.BT(channelWe4.qp - iArr2[0]);
                                                            if (channelWe4.qp < channelWe4.fY / 2) {
                                                                packet.FH();
                                                                buffer.j3((byte) 93);
                                                                buffer.a8(channelWe4.j3());
                                                                buffer.a8(channelWe4.fY - channelWe4.qp);
                                                                synchronized (channelWe4) {
                                                                    if (!channelWe4.Z1) {
                                                                        br(packet);
                                                                    }
                                                                }
                                                                channelWe4.BT(channelWe4.fY);
                                                                break;
                                                            } else {
                                                                continue;
                                                            }
                                                        } catch (Exception unused) {
                                                            channelWe4.VH();
                                                            break;
                                                        }
                                                    } catch (Exception unused2) {
                                                        continue;
                                                    }
                                                }
                                                break;
                                            case 95:
                                                buffer.u7();
                                                buffer.Ws();
                                                Channel channelWe5 = Channel.we(buffer.u7(), this);
                                                buffer.u7();
                                                byte[] bArrXL2 = buffer.XL(iArr, iArr2);
                                                if (channelWe5 != null && iArr2[0] != 0) {
                                                    channelWe5.cn(bArrXL2, iArr[0], iArr2[0]);
                                                    channelWe5.BT(channelWe5.qp - iArr2[0]);
                                                    if (channelWe5.qp < channelWe5.fY / 2) {
                                                        packet.FH();
                                                        buffer.j3((byte) 93);
                                                        buffer.a8(channelWe5.j3());
                                                        buffer.a8(channelWe5.fY - channelWe5.qp);
                                                        synchronized (channelWe5) {
                                                            if (!channelWe5.Z1) {
                                                                br(packet);
                                                            }
                                                        }
                                                        channelWe5.BT(channelWe5.fY);
                                                        break;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                break;
                                            case 96:
                                                buffer.u7();
                                                buffer.Ws();
                                                Channel channelWe6 = Channel.we(buffer.u7(), this);
                                                if (channelWe6 == null) {
                                                    break;
                                                } else {
                                                    channelWe6.tp();
                                                    break;
                                                }
                                            case ProxyTextView.INPUTTYPE_textPersonName /* 97 */:
                                                buffer.u7();
                                                buffer.Ws();
                                                Channel channelWe7 = Channel.we(buffer.u7(), this);
                                                if (channelWe7 == null) {
                                                    break;
                                                } else {
                                                    channelWe7.VH();
                                                    break;
                                                }
                                            case 98:
                                                buffer.u7();
                                                buffer.Ws();
                                                int iU73 = buffer.u7();
                                                byte[] bArrQX = buffer.QX();
                                                boolean z = buffer.FH() != 0;
                                                Channel channelWe8 = Channel.we(iU73, this);
                                                if (channelWe8 == null) {
                                                    break;
                                                } else {
                                                    byte b = 100;
                                                    if (Util.DW(bArrQX).equals("exit-status")) {
                                                        channelWe8.yS(buffer.u7());
                                                        b = 99;
                                                    }
                                                    if (!z) {
                                                        break;
                                                    } else {
                                                        packet.FH();
                                                        buffer.j3(b);
                                                        buffer.a8(channelWe8.j3());
                                                        br(packet);
                                                        break;
                                                    }
                                                }
                                            case 99:
                                                buffer.u7();
                                                buffer.Ws();
                                                Channel channelWe9 = Channel.we(buffer.u7(), this);
                                                if (channelWe9 != null) {
                                                    channelWe9.Jl = 1;
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case 100:
                                                buffer.u7();
                                                buffer.Ws();
                                                Channel channelWe10 = Channel.we(buffer.u7(), this);
                                                if (channelWe10 != null) {
                                                    channelWe10.Jl = 0;
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            default:
                                                throw new IOException("Unknown SSH message type " + iGn);
                                        }
                                }
                            }
                        } catch (InterruptedIOException e) {
                            if (!this.ct && i < this.An) {
                                cn();
                            } else if (!this.ct || i >= this.An) {
                                throw e;
                            }
                            i++;
                        }
                    } catch (Exception e2) {
                        this.ct = false;
                        if (JSch.tp().isEnabled(1)) {
                            JSch.tp().j6(1, "Caught an exception, leaving main loop due to " + e2.getMessage());
                        }
                    }
                }
                try {
                    Ws();
                } catch (NullPointerException | Exception unused3) {
                }
                this.Cz = false;
                return;
            }
            cb();
            KD(buffer, keyExchangeSI);
        }
        throw e;
    }

    public void sG(String str) {
        this.Za = str;
    }

    public void sy(int i) throws SocketException, JSchException {
        Socket socket = this.fN;
        if (socket == null) {
            if (i < 0) {
                throw new JSchException("invalid timeout value");
            }
            this.Gj = i;
        } else {
            try {
                socket.setSoTimeout(i);
                this.Gj = i;
            } catch (Exception e) {
                throw new JSchException(e.toString(), e);
            }
        }
    }

    public void vJ(String str) {
        if (str != null) {
            this.AR = Util.aM(str);
        }
    }

    public boolean vy() {
        return this.Cz;
    }

    public int x9(String str) throws JSchException {
        Forwarding forwardingEi = ei(str);
        int iJ6 = j6(forwardingEi.j6, forwardingEi.DW);
        ChannelForwardedTCPIP.sh(this, forwardingEi.j6, forwardingEi.DW, iJ6, forwardingEi.FH, forwardingEi.Hw, null);
        return iJ6;
    }

    public String yS() {
        return this.b1;
    }

    private class GlobalRequestReply {
        private int DW;
        private int FH;
        private Thread j6;

        private GlobalRequestReply(Session session) {
            this.j6 = null;
            this.DW = -1;
            this.FH = 0;
        }

        int DW() {
            return this.DW;
        }

        Thread FH() {
            return this.j6;
        }

        void Hw(int i) {
            this.FH = i;
        }

        void Zo(Thread thread) {
            this.j6 = thread;
            this.DW = -1;
        }

        int j6() {
            return this.FH;
        }

        void v5(int i) {
            this.DW = i;
        }

        /* synthetic */ GlobalRequestReply(Session session, GlobalRequestReply globalRequestReply) {
            this(session);
        }
    }

    private class Forwarding {
        int DW;
        String FH;
        int Hw;
        String j6;

        private Forwarding(Session session) {
            this.j6 = null;
            this.DW = -1;
            this.FH = null;
            this.Hw = -1;
        }

        /* synthetic */ Forwarding(Session session, Forwarding forwarding) {
            this(session);
        }
    }
}
