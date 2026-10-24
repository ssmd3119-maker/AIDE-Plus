package com.jcraft.jsch;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes.dex */
public interface Proxy {
    InputStream DW();

    Socket FH();

    void Hw(SocketFactory socketFactory, String str, int i, int i2);

    void close();

    OutputStream j6();
}
