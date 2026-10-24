package com.jcraft.jsch;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes.dex */
public interface SocketFactory {
    OutputStream DW(Socket socket);

    Socket FH(String str, int i);

    InputStream j6(Socket socket);
}
