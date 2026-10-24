package com.jcraft.jsch;

/* loaded from: classes.dex */
public class JSchPartialAuthException extends JSchException {
    String mb;

    public JSchPartialAuthException() {
    }

    public String j6() {
        return this.mb;
    }

    public JSchPartialAuthException(String str) {
        super(str);
        this.mb = str;
    }
}
