package com.jcraft.jsch;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public interface ForwardedTCPIPDaemon extends Runnable {
    void Zo(ChannelForwardedTCPIP channelForwardedTCPIP, InputStream inputStream, OutputStream outputStream);

    void v5(Object[] objArr);
}
