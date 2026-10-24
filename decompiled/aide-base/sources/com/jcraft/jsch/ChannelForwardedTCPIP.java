package com.jcraft.jsch;

import com.jcraft.jsch.Channel;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.net.Socket;
import java.util.Vector;

/* loaded from: classes.dex */
public class ChannelForwardedTCPIP extends Channel {
    private static Vector Cz = new Vector();
    private Socket pO = null;
    private ForwardedTCPIPDaemon fN = null;
    private Config Gj = null;

    static abstract class Config {
        int DW;
        int FH;
        String Hw;
        Session j6;
        String v5;

        Config() {
        }
    }

    static class ConfigDaemon extends Config {
        Object[] Zo;

        ConfigDaemon() {
        }
    }

    static class ConfigLHost extends Config {
        SocketFactory VH;
        int Zo;

        ConfigLHost() {
        }
    }

    ChannelForwardedTCPIP() {
        vy(131072);
        BT(131072);
        gW(16384);
        this.w9 = new IO();
        this.n5 = true;
    }

    static String Sf(String str) {
        return str == null ? "localhost" : (str.length() == 0 || str.equals("*")) ? "" : str;
    }

    static void cb(Session session) {
        int[] iArr;
        int i;
        int i2;
        synchronized (Cz) {
            iArr = new int[Cz.size()];
            i2 = 0;
            for (int i3 = 0; i3 < Cz.size(); i3++) {
                Config config = (Config) Cz.elementAt(i3);
                if (config.j6 == session) {
                    iArr[i2] = config.DW;
                    i2++;
                }
            }
        }
        for (i = 0; i < i2; i++) {
            dx(session, iArr[i]);
        }
    }

    static void dx(Session session, int i) {
        sG(session, null, i);
    }

    private static Config ef(Session session, String str, int i) {
        synchronized (Cz) {
            for (int i2 = 0; i2 < Cz.size(); i2++) {
                Config config = (Config) Cz.elementAt(i2);
                if (config.j6 == session && ((config.DW == i || (config.DW == 0 && config.FH == i)) && (str == null || config.Hw.equals(str)))) {
                    return config;
                }
            }
            return null;
        }
    }

    static void sG(Session session, String str, int i) {
        synchronized (Cz) {
            Config configEf = ef(session, Sf(str), i);
            if (configEf == null) {
                configEf = ef(session, null, i);
            }
            if (configEf == null) {
                return;
            }
            Cz.removeElement(configEf);
            if (str == null) {
                str = configEf.Hw;
            }
            if (str == null) {
                str = "0.0.0.0";
            }
            Buffer buffer = new Buffer(100);
            Packet packet = new Packet(buffer);
            try {
                packet.FH();
                buffer.j3((byte) 80);
                buffer.er(Util.aM("cancel-tcpip-forward"));
                buffer.j3((byte) 0);
                buffer.er(Util.aM(str));
                buffer.a8(i);
                session.br(packet);
            } catch (Exception unused) {
            }
        }
    }

    static void sh(Session session, String str, int i, int i2, String str2, int i3, SocketFactory socketFactory) {
        String strSf = Sf(str);
        synchronized (Cz) {
            if (ef(session, strSf, i) != null) {
                throw new JSchException("PortForwardingR: remote port " + i + " is already registered.");
            }
            ConfigLHost configLHost = new ConfigLHost();
            configLHost.j6 = session;
            configLHost.DW = i;
            configLHost.FH = i2;
            configLHost.v5 = str2;
            configLHost.Zo = i3;
            configLHost.Hw = strSf;
            configLHost.VH = socketFactory;
            Cz.addElement(configLHost);
        }
    }

    @Override // com.jcraft.jsch.Channel
    void J8(Buffer buffer) {
        Session sessionMr;
        P8(buffer.u7());
        nw(buffer.aM());
        ei(buffer.u7());
        byte[] bArrQX = buffer.QX();
        int iU7 = buffer.u7();
        buffer.QX();
        buffer.u7();
        try {
            sessionMr = Mr();
        } catch (JSchException unused) {
            sessionMr = null;
        }
        Config configEf = ef(sessionMr, Util.DW(bArrQX), iU7);
        this.Gj = configEf;
        if (configEf == null) {
            this.Gj = ef(sessionMr, null, iU7);
        }
        if (this.Gj == null && JSch.tp().isEnabled(3)) {
            JSch.tp().j6(3, "ChannelForwardedTCPIP: " + Util.DW(bArrQX) + ":" + iU7 + " is not registered.");
        }
    }

    @Override // com.jcraft.jsch.Channel, java.lang.Runnable
    public void run() throws IOException {
        try {
            if (this.Gj instanceof ConfigDaemon) {
                ConfigDaemon configDaemon = (ConfigDaemon) this.Gj;
                this.fN = (ForwardedTCPIPDaemon) Class.forName(configDaemon.v5).newInstance();
                PipedOutputStream pipedOutputStream = new PipedOutputStream();
                this.w9.EQ(new Channel.PassiveInputStream(this, pipedOutputStream, 32768), false);
                this.fN.Zo(this, XL(), pipedOutputStream);
                this.fN.v5(configDaemon.Zo);
                new Thread(this.fN).start();
            } else {
                ConfigLHost configLHost = (ConfigLHost) this.Gj;
                Socket socketGn = configLHost.VH == null ? Util.gn(configLHost.v5, configLHost.Zo, 10000) : configLHost.VH.FH(configLHost.v5, configLHost.Zo);
                this.pO = socketGn;
                socketGn.setTcpNoDelay(true);
                this.w9.tp(this.pO.getInputStream());
                this.w9.we(this.pO.getOutputStream());
            }
            rN();
            this.hK = Thread.currentThread();
            Buffer buffer = new Buffer(this.AL);
            Packet packet = new Packet(buffer);
            try {
                Session sessionMr = Mr();
                while (true) {
                    if (this.hK == null || this.w9 == null || this.w9.j6 == null) {
                        break;
                    }
                    int i = this.w9.j6.read(buffer.DW, 14, (buffer.DW.length - 14) - 84);
                    if (i <= 0) {
                        u7();
                        break;
                    }
                    packet.FH();
                    buffer.j3((byte) 94);
                    buffer.a8(this.mb);
                    buffer.a8(i);
                    buffer.ei(i);
                    synchronized (this) {
                        if (this.Z1) {
                            break;
                        } else {
                            sessionMr.XX(packet, this, i);
                        }
                    }
                }
            } catch (Exception unused) {
            }
            VH();
        } catch (Exception unused2) {
            er(1);
            this.Z1 = true;
            VH();
        }
    }
}
