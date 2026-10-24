package com.jcraft.jsch;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Vector;

/* loaded from: classes.dex */
public class PortWatcher implements Runnable {
    private static InetAddress hK;
    private static Vector w9 = new Vector();
    int AL = 0;
    Session WB;
    String fY;
    int jw;
    Runnable k2;
    int mb;
    InetAddress qp;
    ServerSocket zh;

    static {
        hK = null;
        try {
            hK = InetAddress.getByName("0.0.0.0");
        } catch (UnknownHostException unused) {
        }
    }

    PortWatcher(Session session, String str, int i, String str2, int i2, ServerSocketFactory serverSocketFactory) throws JSchException, UnknownHostException {
        int localPort;
        this.WB = session;
        this.mb = i;
        this.fY = str2;
        this.jw = i2;
        try {
            InetAddress byName = InetAddress.getByName(str);
            this.qp = byName;
            ServerSocket serverSocket = serverSocketFactory == null ? new ServerSocket(i, 0, this.qp) : serverSocketFactory.j6(i, 0, byName);
            this.zh = serverSocket;
            if (i != 0 || (localPort = serverSocket.getLocalPort()) == -1) {
                return;
            }
            this.mb = localPort;
        } catch (Exception e) {
            throw new JSchException("PortForwardingL: local port " + str + ":" + i + " cannot be bound.", e);
        }
    }

    static void DW(Session session) {
        synchronized (w9) {
            PortWatcher[] portWatcherArr = new PortWatcher[w9.size()];
            int i = 0;
            for (int i2 = 0; i2 < w9.size(); i2++) {
                PortWatcher portWatcher = (PortWatcher) w9.elementAt(i2);
                if (portWatcher.WB == session) {
                    portWatcher.FH();
                    portWatcherArr[i] = portWatcher;
                    i++;
                }
            }
            for (int i3 = 0; i3 < i; i3++) {
                w9.removeElement(portWatcherArr[i3]);
            }
        }
    }

    static PortWatcher Hw(Session session, String str, int i) throws JSchException, UnknownHostException {
        try {
            InetAddress byName = InetAddress.getByName(str);
            synchronized (w9) {
                for (int i2 = 0; i2 < w9.size(); i2++) {
                    PortWatcher portWatcher = (PortWatcher) w9.elementAt(i2);
                    if (portWatcher.WB == session && portWatcher.mb == i && ((hK != null && portWatcher.qp.equals(hK)) || portWatcher.qp.equals(byName))) {
                        return portWatcher;
                    }
                }
                return null;
            }
        } catch (UnknownHostException e) {
            throw new JSchException("PortForwardingL: invalid address " + str + " specified.", e);
        }
    }

    private static String VH(String str) {
        return str != null ? (str.length() == 0 || str.equals("*")) ? "0.0.0.0" : str.equals("localhost") ? "127.0.0.1" : str : str;
    }

    static PortWatcher j6(Session session, String str, int i, String str2, int i2, ServerSocketFactory serverSocketFactory) {
        String strVH = VH(str);
        if (Hw(session, strVH, i) == null) {
            PortWatcher portWatcher = new PortWatcher(session, strVH, i, str2, i2, serverSocketFactory);
            w9.addElement(portWatcher);
            return portWatcher;
        }
        throw new JSchException("PortForwardingL: local port " + strVH + ":" + i + " is already registered.");
    }

    void FH() throws IOException {
        this.k2 = null;
        try {
            if (this.zh != null) {
                this.zh.close();
            }
            this.zh = null;
        } catch (Exception unused) {
        }
    }

    void gn(int i) {
        this.AL = i;
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        this.k2 = this;
        while (this.k2 != null) {
            try {
                Socket socketAccept = this.zh.accept();
                socketAccept.setTcpNoDelay(true);
                InputStream inputStream = socketAccept.getInputStream();
                OutputStream outputStream = socketAccept.getOutputStream();
                ChannelDirectTCPIP channelDirectTCPIP = new ChannelDirectTCPIP();
                channelDirectTCPIP.U2();
                channelDirectTCPIP.cb(inputStream);
                channelDirectTCPIP.ef(outputStream);
                this.WB.FH(channelDirectTCPIP);
                channelDirectTCPIP.sh(this.fY);
                channelDirectTCPIP.Sf(this.jw);
                channelDirectTCPIP.dx(socketAccept.getInetAddress().getHostAddress());
                channelDirectTCPIP.sG(socketAccept.getPort());
                channelDirectTCPIP.FH(this.AL);
            } catch (Exception unused) {
            }
        }
        FH();
    }
}
