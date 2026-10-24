package com.jcraft.jsch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.Vector;

/* loaded from: classes.dex */
public class Util {
    private static final byte[] j6 = aM("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=");
    private static String[] DW = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
    static final byte[] FH = aM("");

    Util() {
    }

    static String DW(byte[] bArr) {
        return Hw(bArr, 0, bArr.length, "UTF-8");
    }

    static byte[] EQ(String str) throws IOException {
        String strVH = VH(str);
        File file = new File(strVH);
        FileInputStream fileInputStream = new FileInputStream(strVH);
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            int i = 0;
            while (true) {
                int i2 = fileInputStream.read(bArr, i, length - i);
                if (i2 <= 0) {
                    fileInputStream.close();
                    return bArr;
                }
                i += i2;
            }
        } finally {
            fileInputStream.close();
        }
    }

    static String FH(byte[] bArr, int i, int i2) {
        return Hw(bArr, i, i2, "UTF-8");
    }

    static String Hw(byte[] bArr, int i, int i2, String str) {
        try {
            return new String(bArr, i, i2, str);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr, i, i2);
        }
    }

    private static boolean J0(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iQX;
        int length = bArr.length;
        if (length == 0) {
            return false;
        }
        int length2 = bArr2.length;
        while (i < length && i2 < length2) {
            if (bArr[i] == 92) {
                int i3 = i + 1;
                if (i3 == length || bArr[i3] != bArr2[i2]) {
                    return false;
                }
                i = i3 + QX(bArr[i3]);
                iQX = QX(bArr2[i2]);
            } else {
                if (bArr[i] == 42) {
                    int i4 = i;
                    while (i4 < length && bArr[i4] == 42) {
                        i4++;
                    }
                    if (length == i4) {
                        return true;
                    }
                    byte b = bArr[i4];
                    if (b == 63) {
                        while (i2 < length2) {
                            if (J0(bArr, i4, bArr2, i2)) {
                                return true;
                            }
                            i2 += QX(bArr2[i2]);
                        }
                        return false;
                    }
                    if (b != 92) {
                        while (i2 < length2) {
                            if (b == bArr2[i2] && J0(bArr, i4, bArr2, i2)) {
                                return true;
                            }
                            i2 += QX(bArr2[i2]);
                        }
                        return false;
                    }
                    int i5 = i4 + 1;
                    if (i5 == length) {
                        return false;
                    }
                    byte b2 = bArr[i5];
                    while (i2 < length2) {
                        if (b2 == bArr2[i2] && J0(bArr, QX(b2) + i5, bArr2, QX(bArr2[i2]) + i2)) {
                            return true;
                        }
                        i2 += QX(bArr2[i2]);
                    }
                    return false;
                }
                if (bArr[i] == 63) {
                    i++;
                    iQX = QX(bArr2[i2]);
                } else {
                    if (bArr[i] != bArr2[i2]) {
                        return false;
                    }
                    i += QX(bArr[i]);
                    i2 += QX(bArr2[i2]);
                    if (i2 < length2) {
                        continue;
                    } else {
                        if (i >= length) {
                            return true;
                        }
                        if (bArr[i] == 42) {
                            break;
                        }
                    }
                }
            }
            i2 += iQX;
        }
        if (i == length && i2 == length2) {
            return true;
        }
        if (i2 < length2 || bArr[i] != 42) {
            return false;
        }
        while (i < length) {
            int i6 = i + 1;
            if (bArr[i] != 42) {
                return false;
            }
            i = i6;
        }
        return true;
    }

    static boolean J8(byte[] bArr, byte[] bArr2) {
        return Ws(bArr, 0, bArr2, 0);
    }

    static byte[] Mr(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 * 2];
        int i3 = ((i2 / 3) * 3) + i;
        int i4 = i;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = (bArr[i4] >>> 2) & 63;
            int i7 = i5 + 1;
            byte[] bArr3 = j6;
            bArr2[i5] = bArr3[i6];
            int i8 = i4 + 1;
            int i9 = i7 + 1;
            bArr2[i7] = bArr3[((bArr[i4] & 3) << 4) | ((bArr[i8] >>> 4) & 15)];
            int i10 = i4 + 2;
            int i11 = ((bArr[i8] & 15) << 2) | ((bArr[i10] >>> 6) & 3);
            int i12 = i9 + 1;
            bArr2[i9] = bArr3[i11];
            bArr2[i12] = bArr3[bArr[i10] & 63];
            i4 += 3;
            i5 = i12 + 1;
        }
        int i13 = (i + i2) - i3;
        if (i13 == 1) {
            int i14 = (bArr[i4] >>> 2) & 63;
            int i15 = i5 + 1;
            byte[] bArr4 = j6;
            bArr2[i5] = bArr4[i14];
            int i16 = i15 + 1;
            bArr2[i15] = bArr4[((bArr[i4] & 3) << 4) & 63];
            int i17 = i16 + 1;
            bArr2[i16] = 61;
            i5 = i17 + 1;
            bArr2[i17] = 61;
        } else if (i13 == 2) {
            int i18 = (bArr[i4] >>> 2) & 63;
            int i19 = i5 + 1;
            byte[] bArr5 = j6;
            bArr2[i5] = bArr5[i18];
            int i20 = (bArr[i4] & 3) << 4;
            int i21 = i4 + 1;
            int i22 = i19 + 1;
            bArr2[i19] = bArr5[i20 | ((bArr[i21] >>> 4) & 15)];
            int i23 = i22 + 1;
            bArr2[i22] = bArr5[((bArr[i21] & 15) << 2) & 63];
            i5 = i23 + 1;
            bArr2[i23] = 61;
        }
        byte[] bArr6 = new byte[i5];
        System.arraycopy(bArr2, 0, bArr6, 0, i5);
        return bArr6;
    }

    private static int QX(byte b) {
        if (((byte) (b & 128)) == 0) {
            return 1;
        }
        if (((byte) (b & 224)) == -64) {
            return 2;
        }
        return ((byte) (b & 240)) == -32 ? 3 : 1;
    }

    static String U2(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < bArr.length) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            StringBuilder sb = new StringBuilder("0x");
            sb.append(hexString.length() == 1 ? "0" : "");
            sb.append(hexString);
            stringBuffer.append(sb.toString());
            i++;
            if (i < bArr.length) {
                stringBuffer.append(":");
            }
        }
        return stringBuffer.toString();
    }

    static String VH(String str) {
        try {
            return str.startsWith("~") ? str.replace("~", System.getProperty("user.home")) : str;
        } catch (SecurityException unused) {
            return str;
        }
    }

    private static boolean Ws(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr2.length <= 0 || bArr2[0] != 46) {
            return J0(bArr, i, bArr2, i2);
        }
        if (bArr.length <= 0 || bArr[0] != 46) {
            return false;
        }
        if (bArr.length == 2 && bArr[1] == 42) {
            return true;
        }
        return J0(bArr, i + 1, bArr2, i2 + 1);
    }

    static String[] XL(String str, String str2) {
        if (str == null) {
            return null;
        }
        byte[] bArrAM = aM(str);
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            int iIndexOf = str.indexOf(str2, i);
            if (iIndexOf < 0) {
                break;
            }
            vector.addElement(FH(bArrAM, i, iIndexOf - i));
            i = iIndexOf + 1;
        }
        vector.addElement(FH(bArrAM, i, bArrAM.length - i));
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = (String) vector.elementAt(i2);
        }
        return strArr;
    }

    static void Zo(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    static String a8(String str) {
        byte[] bArrAM = aM(str);
        byte[] bArrLg = lg(bArrAM);
        return bArrAM.length == bArrLg.length ? str : DW(bArrLg);
    }

    static byte[] aM(String str) {
        return j3(str, "UTF-8");
    }

    static Socket gn(final String str, final int i, int i2) throws InterruptedException, JSchException {
        String str2;
        if (i2 == 0) {
            try {
                return new Socket(str, i);
            } catch (Exception e) {
                throw new JSchException(e.toString(), e);
            }
        }
        final Socket[] socketArr = new Socket[1];
        final Exception[] excArr = new Exception[1];
        Thread thread = new Thread(new Runnable() { // from class: com.jcraft.jsch.Util.1
            @Override // java.lang.Runnable
            public void run() throws IOException {
                Socket[] socketArr2 = socketArr;
                socketArr2[0] = null;
                try {
                    socketArr2[0] = new Socket(str, i);
                } catch (Exception e2) {
                    excArr[0] = e2;
                    Socket[] socketArr3 = socketArr;
                    if (socketArr3[0] != null && socketArr3[0].isConnected()) {
                        try {
                            socketArr[0].close();
                        } catch (Exception unused) {
                        }
                    }
                    socketArr[0] = null;
                }
            }
        });
        thread.setName("Opening Socket " + str);
        thread.start();
        try {
            thread.join(i2);
            str2 = "timeout: ";
        } catch (InterruptedException unused) {
            str2 = "";
        }
        if (socketArr[0] != null && socketArr[0].isConnected()) {
            return socketArr[0];
        }
        String string = str2 + "socket is not established";
        if (excArr[0] != null) {
            string = excArr[0].toString();
        }
        thread.interrupt();
        throw new JSchException(string, excArr[0]);
    }

    static byte[] j3(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    static boolean j6(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    static byte[] lg(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            if (bArr[i] == 92) {
                int i2 = i + 1;
                if (i2 == length) {
                    break;
                }
                System.arraycopy(bArr, i2, bArr, i, bArr.length - i2);
                length--;
                i = i2;
            } else {
                i++;
            }
        }
        if (length == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static byte rN(byte b) {
        if (b == 61) {
            return (byte) 0;
        }
        int i = 0;
        while (true) {
            byte[] bArr = j6;
            if (i >= bArr.length) {
                return (byte) 0;
            }
            if (b == bArr[i]) {
                return (byte) i;
            }
            i++;
        }
    }

    static byte[] tp(byte[] bArr, int i, int i2) throws JSchException {
        try {
            byte[] bArr2 = new byte[i2];
            int i3 = i;
            int i4 = 0;
            while (true) {
                if (i3 >= i + i2) {
                    break;
                }
                int i5 = i3 + 1;
                bArr2[i4] = (byte) ((rN(bArr[i3]) << 2) | ((rN(bArr[i5]) & 48) >>> 4));
                int i6 = i3 + 2;
                if (bArr[i6] == 61) {
                    i4++;
                    break;
                }
                bArr2[i4 + 1] = (byte) (((rN(bArr[i5]) & 15) << 4) | ((rN(bArr[i6]) & 60) >>> 2));
                int i7 = i3 + 3;
                if (bArr[i7] == 61) {
                    i4 += 2;
                    break;
                }
                bArr2[i4 + 2] = (byte) (((rN(bArr[i6]) & 3) << 6) | (rN(bArr[i7]) & 63));
                i4 += 3;
                i3 += 4;
            }
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr2, 0, bArr3, 0, i4);
            return bArr3;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new JSchException("fromBase64: invalid base64 data", e);
        }
    }

    static String u7(String str, String[] strArr) {
        String[] strArrXL = XL(str, ",");
        String str2 = null;
        for (int i = 0; i < strArrXL.length; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    str2 = str2 == null ? strArrXL[i] : String.valueOf(str2) + "," + strArrXL[i];
                } else {
                    if (strArrXL[i].equals(strArr[i2])) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return str2;
    }

    static String v5(byte[] bArr, String str) {
        return Hw(bArr, 0, bArr.length, str);
    }

    static String we(HASH hash, byte[] bArr) {
        try {
            hash.DW();
            int i = 0;
            hash.j6(bArr, 0, bArr.length);
            byte[] bArrHw = hash.Hw();
            StringBuffer stringBuffer = new StringBuffer();
            while (i < bArrHw.length) {
                int i2 = bArrHw[i] & 255;
                stringBuffer.append(DW[(i2 >>> 4) & 15]);
                stringBuffer.append(DW[i2 & 15]);
                i++;
                if (i < bArrHw.length) {
                    stringBuffer.append(":");
                }
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return "???";
        }
    }
}
