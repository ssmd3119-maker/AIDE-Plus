package com.jcraft.jsch;

/* loaded from: classes.dex */
public abstract class KeyExchange {
    protected Session j6 = null;
    protected HASH DW = null;
    protected byte[] FH = null;
    protected byte[] Hw = null;
    protected byte[] v5 = null;

    protected static String[] gn(byte[] bArr, byte[] bArr2) {
        String[] strArr = new String[10];
        Buffer buffer = new Buffer(bArr);
        buffer.vy(17);
        Buffer buffer2 = new Buffer(bArr2);
        buffer2.vy(17);
        if (JSch.tp().isEnabled(1)) {
            for (int i = 0; i < 10; i++) {
                JSch.tp().j6(1, "kex: server: " + Util.DW(buffer.QX()));
            }
            for (int i2 = 0; i2 < 10; i2++) {
                JSch.tp().j6(1, "kex: client: " + Util.DW(buffer2.QX()));
            }
            buffer.vy(17);
            buffer2.vy(17);
        }
        for (int i3 = 0; i3 < 10; i3++) {
            byte[] bArrQX = buffer.QX();
            byte[] bArrQX2 = buffer2.QX();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= bArrQX2.length) {
                    break;
                }
                while (i4 < bArrQX2.length && bArrQX2[i4] != 44) {
                    i4++;
                }
                if (i5 == i4) {
                    return null;
                }
                String strFH = Util.FH(bArrQX2, i5, i4 - i5);
                int i6 = 0;
                int i7 = 0;
                while (i6 < bArrQX.length) {
                    while (i6 < bArrQX.length && bArrQX[i6] != 44) {
                        i6++;
                    }
                    if (i7 == i6) {
                        return null;
                    }
                    if (strFH.equals(Util.FH(bArrQX, i7, i6 - i7))) {
                        strArr[i3] = strFH;
                        break;
                    }
                    i7 = i6 + 1;
                    i6 = i7;
                }
                i5 = i4 + 1;
                i4 = i5;
            }
            if (i4 == 0) {
                strArr[i3] = "";
            } else if (strArr[i3] == null) {
                return null;
            }
        }
        if (JSch.tp().isEnabled(1)) {
            JSch.tp().j6(1, "kex: server->client " + strArr[3] + " " + strArr[5] + " " + strArr[7]);
            JSch.tp().j6(1, "kex: client->server " + strArr[2] + " " + strArr[4] + " " + strArr[6]);
        }
        return strArr;
    }

    byte[] DW() {
        return this.Hw;
    }

    protected byte[] EQ(byte[] bArr) {
        if (bArr.length <= 1 || bArr[0] != 0 || (bArr[1] & 128) != 0) {
            return bArr;
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        return EQ(bArr2);
    }

    HASH FH() {
        return this.DW;
    }

    byte[] Hw() {
        return this.v5;
    }

    public abstract int VH();

    public abstract String Zo();

    public String j6() {
        HASH hash;
        try {
            hash = (HASH) Class.forName(this.j6.aM("md5")).newInstance();
        } catch (Exception e) {
            System.err.println("getFingerPrint: " + e);
            hash = null;
        }
        return Util.we(hash, Hw());
    }

    public abstract boolean tp(Buffer buffer);

    public abstract void u7(Session session, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    byte[] v5() {
        return this.FH;
    }
}
