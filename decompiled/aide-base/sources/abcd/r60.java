package abcd;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public final class r60 {
    public static final a70 VH;
    public static final Charset Zo;
    private static final byte[] j6 = Hw("commit");
    private static final byte[] DW = Hw("blob");
    private static final byte[] FH = Hw("tree");
    private static final byte[] Hw = Hw("tag");
    public static final byte[] v5 = {80, 65, 67, 75};

    static {
        if (20 != Zo().getDigestLength()) {
            throw new LinkageError(JGitText.DW().incorrectOBJECT_ID_LENGTH);
        }
        Zo = Charset.forName("UTF-8");
        VH = a70.vJ("e69de29bb2d1d6434b8b29ae775ad8c2e48c5391");
    }

    public static byte[] DW(String str) {
        ByteBuffer byteBufferEncode = Zo.encode(str);
        int iLimit = byteBufferEncode.limit();
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == iLimit) {
                return bArrArray;
            }
        }
        byte[] bArr = new byte[iLimit];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    public static byte[] FH(long j) {
        return Hw(Long.toString(j));
    }

    public static byte[] Hw(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = length - 1; i >= 0; i--) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 127) {
                throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().notASCIIString, str));
            }
            bArr[i] = (byte) cCharAt;
        }
        return bArr;
    }

    public static String VH(int i) {
        if (i == 1) {
            return "commit";
        }
        if (i == 2) {
            return "tree";
        }
        if (i == 3) {
            return "blob";
        }
        if (i == 4) {
            return "tag";
        }
        throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().badObjectType, Integer.valueOf(i)));
    }

    public static MessageDigest Zo() {
        try {
            return MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(MessageFormat.format(JGitText.DW().requiredHashFunctionNotAvailable, "SHA-1"), e);
        }
    }

    public static int j6(j60 j60Var, byte[] bArr, byte b, hg0 hg0Var) throws i40 {
        try {
            int i = hg0Var.j6;
            byte b2 = bArr[i];
            if (b2 == 98) {
                if (bArr[i + 1] != 108 || bArr[i + 2] != 111 || bArr[i + 3] != 98 || bArr[i + 4] != b) {
                    throw new i40(j60Var, JGitText.DW().corruptObjectInvalidType);
                }
                hg0Var.j6 = i + 5;
                return 3;
            }
            if (b2 == 99) {
                if (bArr[i + 1] != 111 || bArr[i + 2] != 109 || bArr[i + 3] != 109 || bArr[i + 4] != 105 || bArr[i + 5] != 116 || bArr[i + 6] != b) {
                    throw new i40(j60Var, JGitText.DW().corruptObjectInvalidType);
                }
                hg0Var.j6 = i + 7;
                return 1;
            }
            if (b2 != 116) {
                throw new i40(j60Var, JGitText.DW().corruptObjectInvalidType);
            }
            byte b3 = bArr[i + 1];
            if (b3 == 97) {
                if (bArr[i + 2] != 103 || bArr[i + 3] != b) {
                    throw new i40(j60Var, JGitText.DW().corruptObjectInvalidType);
                }
                hg0Var.j6 = i + 4;
                return 4;
            }
            if (b3 != 114) {
                throw new i40(j60Var, JGitText.DW().corruptObjectInvalidType);
            }
            if (bArr[i + 2] != 101 || bArr[i + 3] != 101 || bArr[i + 4] != b) {
                throw new i40(j60Var, JGitText.DW().corruptObjectInvalidType);
            }
            hg0Var.j6 = i + 5;
            return 2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new i40(j60Var, JGitText.DW().corruptObjectInvalidType);
        }
    }

    public static byte[] v5(int i) {
        if (i == 1) {
            return j6;
        }
        if (i == 2) {
            return FH;
        }
        if (i == 3) {
            return DW;
        }
        if (i == 4) {
            return Hw;
        }
        throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().badObjectType, Integer.valueOf(i)));
    }
}
