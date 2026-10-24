package com.jcraft.jsch;

/* loaded from: classes.dex */
public class HostKey {
    protected String DW;
    protected int FH;
    protected byte[] Hw;
    protected String j6;
    protected String v5;
    private static final byte[] Zo = Util.aM("ssh-dss");
    private static final byte[] VH = Util.aM("ssh-rsa");

    public HostKey(String str, byte[] bArr) {
        this(str, 0, bArr);
    }

    private boolean Zo(String str) {
        String str2 = this.DW;
        int length = str2.length();
        int length2 = str.length();
        int i = 0;
        while (i < length) {
            int iIndexOf = str2.indexOf(44, i);
            if (iIndexOf == -1) {
                if (length2 != length - i) {
                    return false;
                }
                return str2.regionMatches(true, i, str, 0, length2);
            }
            if (length2 == iIndexOf - i && str2.regionMatches(true, i, str, 0, length2)) {
                return true;
            }
            i = iIndexOf + 1;
        }
        return false;
    }

    public String DW() {
        return this.DW;
    }

    public String FH() {
        byte[] bArr = this.Hw;
        return Util.DW(Util.Mr(bArr, 0, bArr.length));
    }

    public String Hw() {
        return this.j6;
    }

    boolean VH(String str) {
        return Zo(str);
    }

    public String j6() {
        return this.v5;
    }

    public String v5() {
        int i = this.FH;
        return i == 1 ? Util.DW(Zo) : i == 2 ? Util.DW(VH) : "UNKNOWN";
    }

    public HostKey(String str, int i, byte[] bArr) {
        this(str, i, bArr, null);
    }

    public HostKey(String str, int i, byte[] bArr, String str2) {
        this("", str, i, bArr, str2);
    }

    public HostKey(String str, String str2, int i, byte[] bArr, String str3) throws JSchException {
        this.j6 = str;
        this.DW = str2;
        if (i == 0) {
            if (bArr[8] == 100) {
                this.FH = 1;
            } else {
                if (bArr[8] != 114) {
                    throw new JSchException("invalid key type");
                }
                this.FH = 2;
            }
        } else {
            this.FH = i;
        }
        this.Hw = bArr;
        this.v5 = str3;
    }
}
