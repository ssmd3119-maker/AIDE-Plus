package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class xb0 {
    private static final Object DW = new Object();
    private static final Object FH = new Object();
    private static Cipher j6;

    public xb0(SecureRandom secureRandom) {
    }

    private static Cipher j6() {
        Cipher cipher;
        synchronized (FH) {
            if (j6 == null) {
                j6 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = j6;
        }
        return cipher;
    }

    public final byte[] DW(byte[] bArr, String str) throws yb0 {
        byte[] bArrDoFinal;
        if (bArr.length != 16) {
            throw new yb0(this);
        }
        try {
            byte[] bArrDW = p80.DW(str, false);
            if (bArrDW.length <= 16) {
                throw new yb0(this);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrDW.length);
            byteBufferAllocate.put(bArrDW);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[bArrDW.length - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (DW) {
                j6().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = j6().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e) {
            throw new yb0(this, e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new yb0(this, e2);
        } catch (InvalidKeyException e3) {
            throw new yb0(this, e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new yb0(this, e4);
        } catch (BadPaddingException e5) {
            throw new yb0(this, e5);
        } catch (IllegalBlockSizeException e6) {
            throw new yb0(this, e6);
        } catch (NoSuchPaddingException e7) {
            throw new yb0(this, e7);
        }
    }

    public final String FH(byte[] bArr, byte[] bArr2) throws yb0 {
        byte[] bArrDoFinal;
        byte[] iv;
        if (bArr.length != 16) {
            throw new yb0(this);
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (DW) {
                j6().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = j6().doFinal(bArr2);
                iv = j6().getIV();
            }
            int length = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length];
            byteBufferAllocate.get(bArr3);
            return p80.j6(bArr3, false);
        } catch (InvalidKeyException e) {
            throw new yb0(this, e);
        } catch (NoSuchAlgorithmException e2) {
            throw new yb0(this, e2);
        } catch (BadPaddingException e3) {
            throw new yb0(this, e3);
        } catch (IllegalBlockSizeException e4) {
            throw new yb0(this, e4);
        } catch (NoSuchPaddingException e5) {
            throw new yb0(this, e5);
        }
    }

    public final byte[] Hw(String str) throws yb0 {
        try {
            byte[] bArrDW = p80.DW(str, false);
            if (bArrDW.length != 32) {
                throw new yb0(this);
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(bArrDW, 4, 16).get(bArr);
            for (int i = 0; i < 16; i++) {
                bArr[i] = (byte) (bArr[i] ^ 68);
            }
            return bArr;
        } catch (IllegalArgumentException e) {
            throw new yb0(this, e);
        }
    }
}
