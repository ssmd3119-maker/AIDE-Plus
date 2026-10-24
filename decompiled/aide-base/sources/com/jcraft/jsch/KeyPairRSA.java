package com.jcraft.jsch;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class KeyPairRSA extends KeyPair {
    private static final byte[] j3;
    private byte[] EQ;
    private byte[] J0;
    private byte[] J8;
    private byte[] QX;
    private byte[] Ws;
    private byte[] XL;
    private byte[] aM;
    private byte[] we;

    static {
        Util.aM("-----BEGIN RSA PRIVATE KEY-----");
        Util.aM("-----END RSA PRIVATE KEY-----");
        j3 = Util.aM("ssh-rsa");
    }

    public KeyPairRSA(JSch jSch) {
        this(jSch, null, null, null);
    }

    private byte[] er() {
        if (this.aM == null) {
            this.aM = new BigInteger(this.Ws).modInverse(new BigInteger(this.J8)).toByteArray();
        }
        return this.aM;
    }

    private byte[] gW() {
        if (this.XL == null) {
            this.XL = new BigInteger(this.J0).mod(new BigInteger(this.Ws).subtract(BigInteger.ONE)).toByteArray();
        }
        return this.XL;
    }

    static KeyPair rN(JSch jSch, Buffer buffer) throws JSchException {
        byte[][] bArrVH = buffer.VH(8, "invalid key format");
        KeyPairRSA keyPairRSA = new KeyPairRSA(jSch, bArrVH[1], bArrVH[2], bArrVH[3]);
        keyPairRSA.aM = bArrVH[4];
        keyPairRSA.J8 = bArrVH[5];
        keyPairRSA.Ws = bArrVH[6];
        keyPairRSA.DW = new String(bArrVH[7]);
        keyPairRSA.j6 = 0;
        return keyPairRSA;
    }

    private byte[] yS() {
        if (this.QX == null) {
            this.QX = new BigInteger(this.J0).mod(new BigInteger(this.J8).subtract(BigInteger.ONE)).toByteArray();
        }
        return this.QX;
    }

    @Override // com.jcraft.jsch.KeyPair
    byte[] EQ() {
        return j3;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] J0(byte[] bArr) {
        try {
            SignatureRSA signatureRSA = (SignatureRSA) Class.forName(JSch.v5("signature.rsa")).newInstance();
            signatureRSA.DW();
            signatureRSA.v5(this.J0, this.EQ);
            signatureRSA.VH(bArr);
            return Buffer.DW(new byte[][]{j3, signatureRSA.gn()}).DW;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] VH() throws JSchException {
        if (J8()) {
            throw new JSchException("key is encrypted.");
        }
        Buffer buffer = new Buffer();
        buffer.er(j3);
        buffer.er(this.EQ);
        buffer.er(this.we);
        buffer.er(this.J0);
        buffer.er(er());
        buffer.er(this.J8);
        buffer.er(this.Ws);
        buffer.er(Util.aM(this.DW));
        int iTp = buffer.tp();
        byte[] bArr = new byte[iTp];
        buffer.Zo(bArr, 0, iTp);
        return bArr;
    }

    @Override // com.jcraft.jsch.KeyPair
    public void Zo() {
        super.Zo();
        Util.Zo(this.J0);
    }

    @Override // com.jcraft.jsch.KeyPair
    boolean aM(byte[] bArr) {
        int i;
        try {
            if (this.j6 == 2) {
                Buffer buffer = new Buffer(bArr);
                buffer.ei(bArr.length);
                try {
                    byte[][] bArrVH = buffer.VH(4, "");
                    this.J0 = bArrVH[0];
                    this.J8 = bArrVH[1];
                    this.Ws = bArrVH[2];
                    this.aM = bArrVH[3];
                    yS();
                    gW();
                    return true;
                } catch (JSchException unused) {
                    return false;
                }
            }
            if (this.j6 == 1) {
                if (bArr[0] == 48) {
                    return false;
                }
                Buffer buffer2 = new Buffer(bArr);
                this.we = buffer2.J0();
                this.J0 = buffer2.J0();
                this.EQ = buffer2.J0();
                buffer2.J0();
                this.J8 = buffer2.J0();
                this.Ws = buffer2.J0();
                if (this.EQ != null) {
                    new BigInteger(this.EQ).bitLength();
                }
                yS();
                gW();
                er();
                return true;
            }
            int i2 = bArr[1] & 255;
            if ((i2 & 128) != 0) {
                int i3 = i2 & 127;
                i = 2;
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0) {
                        break;
                    }
                    int i5 = i + 1;
                    byte b = bArr[i];
                    i = i5;
                    i3 = i4;
                }
            } else {
                i = 2;
            }
            if (bArr[i] != 2) {
                return false;
            }
            int i6 = i + 1;
            int i7 = i6 + 1;
            int i8 = bArr[i6] & 255;
            if ((i8 & 128) != 0) {
                int i9 = i8 & 127;
                int i10 = 0;
                while (true) {
                    int i11 = i9 - 1;
                    if (i9 <= 0) {
                        break;
                    }
                    int i12 = i10 << 8;
                    int i13 = i7 + 1;
                    int i14 = (bArr[i7] & 255) + i12;
                    i9 = i11;
                    i10 = i14;
                    i7 = i13;
                }
                i8 = i10;
            }
            int i15 = i7 + i8 + 1;
            int i16 = i15 + 1;
            int i17 = bArr[i15] & 255;
            if ((i17 & 128) != 0) {
                int i18 = i17 & 127;
                int i19 = i16;
                int i20 = 0;
                while (true) {
                    int i21 = i18 - 1;
                    if (i18 <= 0) {
                        break;
                    }
                    int i22 = (i20 << 8) + (bArr[i19] & 255);
                    i19++;
                    i20 = i22;
                    i18 = i21;
                }
                i17 = i20;
                i16 = i19;
            }
            byte[] bArr2 = new byte[i17];
            this.EQ = bArr2;
            System.arraycopy(bArr, i16, bArr2, 0, i17);
            int i23 = i16 + i17 + 1;
            int i24 = i23 + 1;
            int i25 = bArr[i23] & 255;
            if ((i25 & 128) != 0) {
                int i26 = i25 & 127;
                int i27 = 0;
                while (true) {
                    int i28 = i26 - 1;
                    if (i26 <= 0) {
                        break;
                    }
                    int i29 = i27 << 8;
                    int i30 = i24 + 1;
                    int i31 = (bArr[i24] & 255) + i29;
                    i26 = i28;
                    i27 = i31;
                    i24 = i30;
                }
                i25 = i27;
            }
            byte[] bArr3 = new byte[i25];
            this.we = bArr3;
            System.arraycopy(bArr, i24, bArr3, 0, i25);
            int i32 = i24 + i25 + 1;
            int i33 = i32 + 1;
            int i34 = bArr[i32] & 255;
            if ((i34 & 128) != 0) {
                int i35 = i34 & 127;
                int i36 = i33;
                int i37 = 0;
                while (true) {
                    int i38 = i35 - 1;
                    if (i35 <= 0) {
                        break;
                    }
                    int i39 = (i37 << 8) + (bArr[i36] & 255);
                    i36++;
                    i37 = i39;
                    i35 = i38;
                }
                i34 = i37;
                i33 = i36;
            }
            byte[] bArr4 = new byte[i34];
            this.J0 = bArr4;
            System.arraycopy(bArr, i33, bArr4, 0, i34);
            int i40 = i33 + i34 + 1;
            int i41 = i40 + 1;
            int i42 = bArr[i40] & 255;
            if ((i42 & 128) != 0) {
                int i43 = i42 & 127;
                int i44 = 0;
                while (true) {
                    int i45 = i43 - 1;
                    if (i43 <= 0) {
                        break;
                    }
                    int i46 = i44 << 8;
                    int i47 = i41 + 1;
                    int i48 = (bArr[i41] & 255) + i46;
                    i43 = i45;
                    i44 = i48;
                    i41 = i47;
                }
                i42 = i44;
            }
            byte[] bArr5 = new byte[i42];
            this.J8 = bArr5;
            System.arraycopy(bArr, i41, bArr5, 0, i42);
            int i49 = i41 + i42 + 1;
            int i50 = i49 + 1;
            int i51 = bArr[i49] & 255;
            if ((i51 & 128) != 0) {
                int i52 = i51 & 127;
                int i53 = i50;
                int i54 = 0;
                while (true) {
                    int i55 = i52 - 1;
                    if (i52 <= 0) {
                        break;
                    }
                    int i56 = (i54 << 8) + (bArr[i53] & 255);
                    i53++;
                    i54 = i56;
                    i52 = i55;
                }
                i51 = i54;
                i50 = i53;
            }
            byte[] bArr6 = new byte[i51];
            this.Ws = bArr6;
            System.arraycopy(bArr, i50, bArr6, 0, i51);
            int i57 = i50 + i51 + 1;
            int i58 = i57 + 1;
            int i59 = bArr[i57] & 255;
            if ((i59 & 128) != 0) {
                int i60 = i59 & 127;
                int i61 = 0;
                while (true) {
                    int i62 = i60 - 1;
                    if (i60 <= 0) {
                        break;
                    }
                    int i63 = i61 << 8;
                    int i64 = i58 + 1;
                    int i65 = (bArr[i58] & 255) + i63;
                    i60 = i62;
                    i61 = i65;
                    i58 = i64;
                }
                i59 = i61;
            }
            byte[] bArr7 = new byte[i59];
            this.QX = bArr7;
            System.arraycopy(bArr, i58, bArr7, 0, i59);
            int i66 = i58 + i59 + 1;
            int i67 = i66 + 1;
            int i68 = bArr[i66] & 255;
            if ((i68 & 128) != 0) {
                int i69 = i68 & 127;
                int i70 = i67;
                int i71 = 0;
                while (true) {
                    int i72 = i69 - 1;
                    if (i69 <= 0) {
                        break;
                    }
                    int i73 = (i71 << 8) + (bArr[i70] & 255);
                    i70++;
                    i71 = i73;
                    i69 = i72;
                }
                i68 = i71;
                i67 = i70;
            }
            byte[] bArr8 = new byte[i68];
            this.XL = bArr8;
            System.arraycopy(bArr, i67, bArr8, 0, i68);
            int i74 = i67 + i68 + 1;
            int i75 = i74 + 1;
            int i76 = bArr[i74] & 255;
            if ((i76 & 128) != 0) {
                int i77 = i76 & 127;
                int i78 = 0;
                while (true) {
                    int i79 = i77 - 1;
                    if (i77 <= 0) {
                        break;
                    }
                    int i80 = i78 << 8;
                    int i81 = i75 + 1;
                    int i82 = (bArr[i75] & 255) + i80;
                    i77 = i79;
                    i78 = i82;
                    i75 = i81;
                }
                i76 = i78;
            }
            byte[] bArr9 = new byte[i76];
            this.aM = bArr9;
            System.arraycopy(bArr, i75, bArr9, 0, i76);
            if (this.EQ != null) {
                new BigInteger(this.EQ).bitLength();
            }
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] we() {
        byte[] bArrWe = super.we();
        if (bArrWe != null) {
            return bArrWe;
        }
        byte[] bArr = this.we;
        if (bArr == null) {
            return null;
        }
        return Buffer.DW(new byte[][]{j3, bArr, this.EQ}).DW;
    }

    public KeyPairRSA(JSch jSch, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(jSch);
        this.EQ = bArr;
        this.we = bArr2;
        this.J0 = bArr3;
        if (bArr != null) {
            new BigInteger(bArr).bitLength();
        }
    }
}
