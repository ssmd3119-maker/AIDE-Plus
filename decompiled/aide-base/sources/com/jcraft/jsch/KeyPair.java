package com.jcraft.jsch;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes.dex */
public abstract class KeyPair {
    JSch FH;
    private Cipher Hw;
    private byte[] Zo;
    private HASH v5;
    int j6 = 0;
    protected String DW = "no comment";
    protected boolean VH = false;
    protected byte[] gn = null;
    private byte[] u7 = null;
    private byte[] tp = null;

    class ASN1 {
        int DW;
        byte[] j6;

        ASN1(KeyPair keyPair, byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        private int FH(int[] iArr) {
            int i = iArr[0];
            int i2 = i + 1;
            int i3 = this.j6[i] & 255;
            if ((i3 & 128) != 0) {
                int i4 = i3 & 127;
                int i5 = 0;
                while (true) {
                    int i6 = i4 - 1;
                    if (i4 <= 0) {
                        break;
                    }
                    i5 = (this.j6[i2] & 255) + (i5 << 8);
                    i4 = i6;
                    i2++;
                }
                i3 = i5;
            }
            iArr[0] = i2;
            return i3;
        }

        ASN1[] DW() {
            byte[] bArr = this.j6;
            int i = this.DW;
            byte b = bArr[i];
            int[] iArr = {i + 1};
            int iFH = FH(iArr);
            if (b == 5) {
                return new ASN1[0];
            }
            int i2 = iArr[0];
            Vector vector = new Vector();
            while (iFH > 0) {
                int i3 = i2 + 1;
                iArr[0] = i3;
                int iFH2 = FH(iArr);
                int i4 = iArr[0];
                int i5 = i4 - i3;
                vector.addElement(KeyPair.this.new ASN1(this.j6, i3 - 1, i5 + 1 + iFH2));
                i2 = i4 + iFH2;
                iFH = ((iFH - 1) - i5) - iFH2;
            }
            ASN1[] asn1Arr = new ASN1[vector.size()];
            for (int i6 = 0; i6 < vector.size(); i6++) {
                asn1Arr[i6] = (ASN1) vector.elementAt(i6);
            }
            return asn1Arr;
        }

        byte[] j6() {
            int[] iArr = {this.DW + 1};
            int iFH = FH(iArr);
            byte[] bArr = new byte[iFH];
            System.arraycopy(this.j6, iArr[0], bArr, 0, iFH);
            return bArr;
        }

        ASN1(byte[] bArr, int i, int i2) throws ASN1Exception {
            this.j6 = bArr;
            this.DW = i;
            if (i + i2 > bArr.length) {
                throw KeyPair.this.new ASN1Exception();
            }
        }
    }

    class ASN1Exception extends Exception {
        ASN1Exception() {
        }
    }

    static {
        Util.aM("\n");
        Util.aM("Proc-Type: 4,ENCRYPTED");
        Util.aM("DEK-Info: DES-EDE3-CBC,");
        Util.aM(" ");
    }

    public KeyPair(JSch jSch) {
        this.FH = null;
        this.FH = jSch;
    }

    private static byte[] Mr(Buffer buffer, int i) {
        byte[] bArr;
        byte[] bArr2 = buffer.DW;
        int i2 = buffer.FH;
        byte[] bArr3 = null;
        while (true) {
            int i3 = i - 1;
            if (i <= 0) {
                break;
            }
            int i4 = i2;
            while (true) {
                if (bArr2.length <= i4) {
                    break;
                }
                int i5 = i4 + 1;
                if (bArr2[i4] == 13) {
                    if (bArr3 == null) {
                        int i6 = (i5 - i2) - 1;
                        bArr = new byte[i6];
                        System.arraycopy(bArr2, i2, bArr, 0, i6);
                    } else {
                        bArr = new byte[((bArr3.length + i5) - i2) - 1];
                        System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
                        System.arraycopy(bArr2, i2, bArr, bArr3.length, (i5 - i2) - 1);
                        for (int i7 = 0; i7 < bArr3.length; i7++) {
                            bArr3[i7] = 0;
                        }
                    }
                    i4 = i5;
                    bArr3 = bArr;
                } else {
                    i4 = i5;
                }
            }
            if (bArr2[i4] == 10) {
                i4++;
            }
            i2 = i4;
            i = i3;
        }
        if (bArr3 != null) {
            buffer.FH = i2;
        }
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01a6, code lost:
    
        throw new com.jcraft.jsch.JSchException("invalid privatekey: " + r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0503, code lost:
    
        r6 = false;
        r16 = r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0620  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.jcraft.jsch.KeyPair QX(com.jcraft.jsch.JSch r24, byte[] r25, byte[] r26) throws com.jcraft.jsch.JSchException {
        /*
            Method dump skipped, instructions count: 1728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.KeyPair.QX(com.jcraft.jsch.JSch, byte[], byte[]):com.jcraft.jsch.KeyPair");
    }

    public static KeyPair Ws(JSch jSch, String str, String str2) throws JSchException {
        String str3;
        byte[] bArrEQ;
        try {
            byte[] bArrEQ2 = Util.EQ(str);
            if (str2 == null) {
                str3 = String.valueOf(str) + ".pub";
            } else {
                str3 = str2;
            }
            try {
                bArrEQ = Util.EQ(str3);
            } catch (IOException e) {
                if (str2 != null) {
                    throw new JSchException(e.toString(), e);
                }
                bArrEQ = null;
            }
            try {
                return QX(jSch, bArrEQ2, bArrEQ);
            } finally {
                Util.Zo(bArrEQ2);
            }
        } catch (IOException e2) {
            throw new JSchException(e2.toString(), e2);
        }
    }

    static KeyPair XL(JSch jSch, byte[] bArr) throws JSchException {
        KeyPair keyPairDSA;
        Buffer buffer = new Buffer(bArr);
        Hashtable hashtable = new Hashtable();
        while (j3(buffer, hashtable)) {
        }
        String str = (String) hashtable.get("PuTTY-User-Key-File-2");
        if (str == null) {
            return null;
        }
        byte[] bArrMr = Mr(buffer, Integer.parseInt((String) hashtable.get("Public-Lines")));
        while (j3(buffer, hashtable)) {
        }
        byte[] bArrMr2 = Mr(buffer, Integer.parseInt((String) hashtable.get("Private-Lines")));
        while (j3(buffer, hashtable)) {
        }
        byte[] bArrTp = Util.tp(bArrMr2, 0, bArrMr2.length);
        byte[] bArrTp2 = Util.tp(bArrMr, 0, bArrMr.length);
        if (str.equals("ssh-rsa")) {
            Buffer buffer2 = new Buffer(bArrTp2);
            buffer2.ei(bArrTp2.length);
            buffer2.v5(new byte[buffer2.u7()]);
            byte[] bArr2 = new byte[buffer2.u7()];
            buffer2.v5(bArr2);
            byte[] bArr3 = new byte[buffer2.u7()];
            buffer2.v5(bArr3);
            keyPairDSA = new KeyPairRSA(jSch, bArr3, bArr2, null);
        } else {
            if (!str.equals("ssh-dss")) {
                return null;
            }
            Buffer buffer3 = new Buffer(bArrTp2);
            buffer3.ei(bArrTp2.length);
            buffer3.v5(new byte[buffer3.u7()]);
            byte[] bArr4 = new byte[buffer3.u7()];
            buffer3.v5(bArr4);
            byte[] bArr5 = new byte[buffer3.u7()];
            buffer3.v5(bArr5);
            byte[] bArr6 = new byte[buffer3.u7()];
            buffer3.v5(bArr6);
            byte[] bArr7 = new byte[buffer3.u7()];
            buffer3.v5(bArr7);
            keyPairDSA = new KeyPairDSA(jSch, bArr4, bArr5, bArr6, bArr7, null);
        }
        keyPairDSA.VH = !hashtable.get("Encryption").equals("none");
        keyPairDSA.j6 = 2;
        keyPairDSA.DW = (String) hashtable.get("Comment");
        if (!keyPairDSA.VH) {
            keyPairDSA.gn = bArrTp;
            keyPairDSA.aM(bArrTp);
        } else {
            if (!Session.gn(JSch.v5("aes256-cbc"))) {
                throw new JSchException("The cipher 'aes256-cbc' is required, but it is not available.");
            }
            try {
                Cipher cipher = (Cipher) Class.forName(JSch.v5("aes256-cbc")).newInstance();
                keyPairDSA.Hw = cipher;
                keyPairDSA.u7 = new byte[cipher.Zo()];
                keyPairDSA.gn = bArrTp;
            } catch (Exception unused) {
                throw new JSchException("The cipher 'aes256-cbc' is required, but it is not available.");
            }
        }
        return keyPairDSA;
    }

    private Cipher gn() {
        try {
            this.Hw = (Cipher) Class.forName(JSch.v5("3des-cbc")).newInstance();
        } catch (Exception unused) {
        }
        return this.Hw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        r3 = r1;
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean j3(com.jcraft.jsch.Buffer r9, java.util.Hashtable r10) {
        /*
            byte[] r0 = r9.DW
            int r1 = r9.FH
            r2 = r1
        L5:
            int r3 = r0.length
            r4 = 13
            r5 = 0
            r6 = 1
            if (r2 < r3) goto Ld
            goto L11
        Ld:
            r3 = r0[r2]
            if (r3 != r4) goto L14
        L11:
            r3 = r1
            r7 = r5
            goto L30
        L14:
            r3 = r0[r2]
            r7 = 58
            if (r3 != r7) goto L61
            java.lang.String r3 = new java.lang.String
            int r7 = r2 - r1
            r3.<init>(r0, r1, r7)
            int r2 = r2 + r6
            int r1 = r0.length
            if (r2 >= r1) goto L2d
            r1 = r0[r2]
            r7 = 32
            if (r1 != r7) goto L2d
            int r2 = r2 + 1
        L2d:
            r1 = r2
            r7 = r3
            r3 = r1
        L30:
            r8 = 0
            if (r7 != 0) goto L34
            return r8
        L34:
            r1 = r3
        L35:
            int r2 = r0.length
            if (r1 < r2) goto L39
            goto L51
        L39:
            r2 = r0[r1]
            if (r2 != r4) goto L5e
            java.lang.String r5 = new java.lang.String
            int r2 = r1 - r3
            r5.<init>(r0, r3, r2)
            int r1 = r1 + r6
            int r2 = r0.length
            if (r1 >= r2) goto L50
            r0 = r0[r1]
            r2 = 10
            if (r0 != r2) goto L50
            int r1 = r1 + 1
        L50:
            r3 = r1
        L51:
            if (r5 == 0) goto L58
            r10.put(r7, r5)
            r9.FH = r3
        L58:
            if (r7 == 0) goto L5d
            if (r5 == 0) goto L5d
            return r6
        L5d:
            return r8
        L5e:
            int r1 = r1 + 1
            goto L35
        L61:
            int r2 = r2 + 1
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.KeyPair.j3(com.jcraft.jsch.Buffer, java.util.Hashtable):boolean");
    }

    private static byte j6(byte b) {
        return (byte) ((48 > b || b > 57) ? (b - 97) + 10 : b - 48);
    }

    private HASH u7() {
        try {
            HASH hash = (HASH) Class.forName(JSch.v5("md5")).newInstance();
            this.v5 = hash;
            hash.DW();
        } catch (Exception unused) {
        }
        return this.v5;
    }

    private byte[] v5(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            byte[] bArrTp = tp(bArr2, bArr3);
            this.Hw.v5(1, bArrTp, bArr3);
            Util.Zo(bArrTp);
            byte[] bArr4 = new byte[bArr.length];
            this.Hw.VH(bArr, 0, bArr.length, bArr4, 0);
            return bArr4;
        } catch (Exception unused) {
            return null;
        }
    }

    void DW(KeyPair keyPair) {
        this.tp = keyPair.tp;
        this.j6 = keyPair.j6;
        this.DW = keyPair.DW;
        this.Hw = keyPair.Hw;
    }

    abstract byte[] EQ();

    int FH(int i) {
        int i2 = 1;
        if (i <= 127) {
            return 1;
        }
        while (i > 0) {
            i >>>= 8;
            i2++;
        }
        return i2;
    }

    public boolean Hw(byte[] bArr) {
        boolean z = this.VH;
        if (!z) {
            return true;
        }
        if (bArr == null) {
            return !z;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        byte[] bArrV5 = v5(this.gn, bArr2, this.u7);
        Util.Zo(bArr2);
        if (aM(bArrV5)) {
            this.VH = false;
        }
        return !this.VH;
    }

    public abstract byte[] J0(byte[] bArr);

    public boolean J8() {
        return this.VH;
    }

    int U2(byte[] bArr, int i, byte[] bArr2) {
        bArr[i] = 2;
        int iA8 = a8(bArr, i + 1, bArr2.length);
        System.arraycopy(bArr2, 0, bArr, iA8, bArr2.length);
        return iA8 + bArr2.length;
    }

    public abstract byte[] VH();

    public void Zo() {
        Util.Zo(this.Zo);
    }

    int a8(byte[] bArr, int i, int i2) {
        int iFH = FH(i2) - 1;
        if (iFH == 0) {
            int i3 = i + 1;
            bArr[i] = (byte) i2;
            return i3;
        }
        bArr[i] = (byte) (iFH | 128);
        int i4 = i + 1 + iFH;
        while (iFH > 0) {
            bArr[(r1 + iFH) - 1] = (byte) (i2 & 255);
            i2 >>>= 8;
            iFH--;
        }
        return i4;
    }

    abstract boolean aM(byte[] bArr);

    public void finalize() {
        Zo();
    }

    int lg(byte[] bArr, int i, int i2) {
        bArr[i] = 48;
        return a8(bArr, i + 1, i2);
    }

    synchronized byte[] tp(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        if (this.Hw == null) {
            this.Hw = gn();
        }
        if (this.v5 == null) {
            this.v5 = u7();
        }
        int iFH = this.Hw.FH();
        bArr3 = new byte[iFH];
        int iFH2 = this.v5.FH();
        int i = ((iFH / iFH2) * iFH2) + (iFH % iFH2 == 0 ? 0 : iFH2);
        byte[] bArr4 = new byte[i];
        byte[] bArrHw = null;
        try {
            if (this.j6 == 0) {
                int length = 0;
                while (length + iFH2 <= i) {
                    if (bArrHw != null) {
                        this.v5.j6(bArrHw, 0, bArrHw.length);
                    }
                    this.v5.j6(bArr, 0, bArr.length);
                    HASH hash = this.v5;
                    int length2 = 8;
                    if (bArr2.length <= 8) {
                        length2 = bArr2.length;
                    }
                    hash.j6(bArr2, 0, length2);
                    bArrHw = this.v5.Hw();
                    System.arraycopy(bArrHw, 0, bArr4, length, bArrHw.length);
                    length += bArrHw.length;
                }
                System.arraycopy(bArr4, 0, bArr3, 0, iFH);
            } else if (this.j6 == 1) {
                int length3 = 0;
                while (length3 + iFH2 <= i) {
                    if (bArrHw != null) {
                        this.v5.j6(bArrHw, 0, bArrHw.length);
                    }
                    this.v5.j6(bArr, 0, bArr.length);
                    bArrHw = this.v5.Hw();
                    System.arraycopy(bArrHw, 0, bArr4, length3, bArrHw.length);
                    length3 += bArrHw.length;
                }
                System.arraycopy(bArr4, 0, bArr3, 0, iFH);
            } else if (this.j6 == 2) {
                HASH hash2 = (HASH) Class.forName(JSch.v5("sha-1")).newInstance();
                byte[] bArr5 = new byte[4];
                bArr3 = new byte[40];
                for (int i2 = 0; i2 < 2; i2++) {
                    hash2.DW();
                    bArr5[3] = (byte) i2;
                    hash2.j6(bArr5, 0, 4);
                    hash2.j6(bArr, 0, bArr.length);
                    System.arraycopy(hash2.Hw(), 0, bArr3, i2 * 20, 20);
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return bArr3;
    }

    public byte[] we() {
        return this.tp;
    }
}
