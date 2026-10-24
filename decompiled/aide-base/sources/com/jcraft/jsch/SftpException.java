package com.jcraft.jsch;

/* loaded from: classes.dex */
public class SftpException extends Exception {
    public int WB;
    private Throwable mb;

    public SftpException(int i, String str) {
        super(str);
        this.mb = null;
        this.WB = i;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.mb;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return String.valueOf(this.WB) + ": " + getMessage();
    }

    public SftpException(int i, String str, Throwable th) {
        super(str);
        this.mb = null;
        this.WB = i;
        this.mb = th;
    }
}
