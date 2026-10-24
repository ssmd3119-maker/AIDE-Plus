package com.jcraft.jsch;

/* loaded from: classes.dex */
public class JSchException extends Exception {
    private Throwable WB;

    public JSchException() {
        this.WB = null;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.WB;
    }

    public JSchException(String str) {
        super(str);
        this.WB = null;
    }

    public JSchException(String str, Throwable th) {
        super(str);
        this.WB = null;
        this.WB = th;
    }
}
