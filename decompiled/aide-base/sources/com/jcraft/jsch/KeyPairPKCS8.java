package com.jcraft.jsch;

import com.jcraft.jsch.KeyPair;
import java.math.BigInteger;
import java.util.Vector;

/* loaded from: classes.dex */
public class KeyPairPKCS8 extends KeyPair {
    private KeyPair EQ;
    private static final byte[] we = {42, -122, 72, -122, -9, 13, 1, 1, 1};
    private static final byte[] J0 = {42, -122, 72, -50, 56, 4, 1};
    private static final byte[] J8 = {42, -122, 72, -122, -9, 13, 1, 5, 13};
    private static final byte[] Ws = {96, -122, 72, 1, 101, 3, 4, 1, 2};
    private static final byte[] QX = {96, -122, 72, 1, 101, 3, 4, 1, 22};
    private static final byte[] XL = {96, -122, 72, 1, 101, 3, 4, 1, 42};
    private static final byte[] aM = {42, -122, 72, -122, -9, 13, 1, 5, 3};

    static {
        Util.aM("-----BEGIN DSA PRIVATE KEY-----");
        Util.aM("-----END DSA PRIVATE KEY-----");
    }

    public KeyPairPKCS8(JSch jSch) {
        super(jSch);
        this.EQ = null;
    }

    @Override // com.jcraft.jsch.KeyPair
    byte[] EQ() {
        return this.EQ.EQ();
    }

    @Override // com.jcraft.jsch.KeyPair
    public boolean Hw(byte[] bArr) throws NumberFormatException {
        if (!J8()) {
            return true;
        }
        if (bArr == null) {
            return !J8();
        }
        try {
            KeyPair.ASN1[] asn1ArrDW = new KeyPair.ASN1(this, this.gn).DW();
            byte[] bArrJ6 = asn1ArrDW[1].j6();
            KeyPair.ASN1[] asn1ArrDW2 = asn1ArrDW[0].DW();
            byte[] bArrJ62 = asn1ArrDW2[0].j6();
            KeyPair.ASN1 asn1 = asn1ArrDW2[1];
            if (Util.j6(bArrJ62, J8)) {
                KeyPair.ASN1[] asn1ArrDW3 = asn1.DW();
                KeyPair.ASN1 asn12 = asn1ArrDW3[0];
                KeyPair.ASN1 asn13 = asn1ArrDW3[1];
                KeyPair.ASN1[] asn1ArrDW4 = asn12.DW();
                asn1ArrDW4[0].j6();
                KeyPair.ASN1[] asn1ArrDW5 = asn1ArrDW4[1].DW();
                byte[] bArrJ63 = asn1ArrDW5[0].j6();
                int i = Integer.parseInt(new BigInteger(asn1ArrDW5[1].j6()).toString());
                KeyPair.ASN1[] asn1ArrDW6 = asn13.DW();
                byte[] bArrJ64 = asn1ArrDW6[0].j6();
                byte[] bArrJ65 = asn1ArrDW6[1].j6();
                Cipher cipherRN = rN(bArrJ64);
                if (cipherRN == null) {
                    return false;
                }
                byte[] bArrJ66 = null;
                try {
                    bArrJ66 = ((PBKDF) Class.forName(JSch.v5("pbkdf")).newInstance()).j6(bArr, bArrJ63, i, cipherRN.FH());
                } catch (Exception unused) {
                }
                if (bArrJ66 == null) {
                    return false;
                }
                cipherRN.v5(1, bArrJ66, bArrJ65);
                Util.Zo(bArrJ66);
                byte[] bArr2 = new byte[bArrJ6.length];
                cipherRN.VH(bArrJ6, 0, bArrJ6.length, bArr2, 0);
                if (aM(bArr2)) {
                    this.VH = false;
                    return true;
                }
            } else if (Util.j6(bArrJ62, aM)) {
            }
        } catch (KeyPair.ASN1Exception | Exception unused2) {
        }
        return false;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] J0(byte[] bArr) {
        return this.EQ.J0(bArr);
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] VH() {
        return this.EQ.VH();
    }

    @Override // com.jcraft.jsch.KeyPair
    boolean aM(byte[] bArr) {
        try {
            Vector vector = new Vector();
            KeyPair.ASN1[] asn1ArrDW = new KeyPair.ASN1(this, bArr).DW();
            KeyPair.ASN1 asn1 = asn1ArrDW[1];
            KeyPair.ASN1 asn12 = asn1ArrDW[2];
            KeyPair.ASN1[] asn1ArrDW2 = asn1.DW();
            byte[] bArrJ6 = asn1ArrDW2[0].j6();
            KeyPair.ASN1[] asn1ArrDW3 = asn1ArrDW2[1].DW();
            if (asn1ArrDW3.length > 0) {
                for (KeyPair.ASN1 asn13 : asn1ArrDW3) {
                    vector.addElement(asn13.j6());
                }
            }
            byte[] bArrJ62 = asn12.j6();
            if (Util.j6(bArrJ6, we)) {
                KeyPairRSA keyPairRSA = new KeyPairRSA(this.FH);
                keyPairRSA.DW(this);
                if (keyPairRSA.aM(bArrJ62)) {
                    this.EQ = keyPairRSA;
                }
            } else if (Util.j6(bArrJ6, J0)) {
                KeyPair.ASN1 asn14 = new KeyPair.ASN1(this, bArrJ62);
                if (vector.size() == 0) {
                    KeyPair.ASN1[] asn1ArrDW4 = asn14.DW();
                    byte[] bArrJ63 = asn1ArrDW4[1].j6();
                    for (KeyPair.ASN1 asn15 : asn1ArrDW4[0].DW()) {
                        vector.addElement(asn15.j6());
                    }
                    vector.addElement(bArrJ63);
                } else {
                    vector.addElement(asn14.j6());
                }
                byte[] bArr2 = (byte[]) vector.elementAt(0);
                byte[] bArr3 = (byte[]) vector.elementAt(1);
                byte[] bArr4 = (byte[]) vector.elementAt(2);
                byte[] bArr5 = (byte[]) vector.elementAt(3);
                byte[] bArrEr = new KeyPairDSA(this.FH, bArr2, bArr3, bArr4, new BigInteger(bArr4).modPow(new BigInteger(bArr5), new BigInteger(bArr2)).toByteArray(), bArr5).er();
                KeyPairDSA keyPairDSA = new KeyPairDSA(this.FH);
                keyPairDSA.DW(this);
                if (keyPairDSA.aM(bArrEr)) {
                    this.EQ = keyPairDSA;
                }
            }
        } catch (KeyPair.ASN1Exception | Exception unused) {
        }
        return this.EQ != null;
    }

    Cipher rN(byte[] bArr) {
        String str;
        String str2;
        try {
            str = Util.j6(bArr, Ws) ? "aes128-cbc" : Util.j6(bArr, QX) ? "aes192-cbc" : Util.j6(bArr, XL) ? "aes256-cbc" : null;
        } catch (Exception unused) {
            str = null;
        }
        try {
            return (Cipher) Class.forName(JSch.v5(str)).newInstance();
        } catch (Exception unused2) {
            if (!JSch.tp().isEnabled(4)) {
                return null;
            }
            if (str == null) {
                str2 = "unknown oid: " + Util.U2(bArr);
            } else {
                str2 = "function " + str + " is not supported";
            }
            JSch.tp().j6(4, "PKCS8: " + str2);
            return null;
        }
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] we() {
        return this.EQ.we();
    }
}
