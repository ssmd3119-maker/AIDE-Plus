package com.aide.licensing;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.h8;
import abcd.i8;
import abcd.iy;
import abcd.j8;
import android.content.Context;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

@cy(clazz = -6066383843371559253L, container = -6066383843371559253L, user = true)
/* loaded from: classes.dex */
public class c {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = 899977642632869724L, container = 899977642632869724L, user = true)
    public static final class a {

        @gy
        private static /* synthetic */ boolean AL;

        @dy(field = -938649653255357883L)
        public static final a IN_GRACE_PERIOD;

        @dy(field = 164739938516249400L)
        public static final a LICENSED;

        @dy(field = 3879650606529676640L)
        public static final a NOT_LICENSED;

        @dy(field = -1203542815339195936L)
        public static final a OVER_GRACE_PERIOD;

        @dy(field = 430980263413359855L)
        public static final a TEMPORARY_ERROR;

        @dy(field = 2961964777107440355L)
        private static final /* synthetic */ a[] k2;

        @fy
        private static /* synthetic */ boolean zh;

        static {
            try {
                iy.Zo(a.class);
                if (zh) {
                    iy.gn(-2626801934887243480L, null);
                }
                LICENSED = new a("LICENSED", 0);
                IN_GRACE_PERIOD = new a("IN_GRACE_PERIOD", 1);
                OVER_GRACE_PERIOD = new a("OVER_GRACE_PERIOD", 2);
                NOT_LICENSED = new a("NOT_LICENSED", 3);
                a aVar = new a("TEMPORARY_ERROR", 4);
                TEMPORARY_ERROR = aVar;
                k2 = new a[]{LICENSED, IN_GRACE_PERIOD, OVER_GRACE_PERIOD, NOT_LICENSED, aVar};
            } catch (Throwable th) {
                if (AL) {
                    iy.aM(th, -2626801934887243480L, null);
                }
                throw th;
            }
        }

        @ey(method = 6401055357900540927L)
        private a(String str, int i) {
            try {
                if (zh) {
                    iy.EQ(-4317081476200636528L, null, str, new Integer(i));
                }
            } catch (Throwable th) {
                if (AL) {
                    iy.Mr(th, -4317081476200636528L, null, str, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 19378901434673928L)
        public static a valueOf(String str) {
            try {
                if (zh) {
                    iy.tp(125799777649072352L, null, str);
                }
                return (a) Enum.valueOf(a.class, str);
            } catch (Throwable th) {
                if (AL) {
                    iy.j3(th, 125799777649072352L, null, str);
                }
                throw th;
            }
        }

        @ey(method = 1863628346046000776L)
        public static a[] values() {
            try {
                if (zh) {
                    iy.gn(-195909874157097036L, null);
                }
                return (a[]) k2.clone();
            } catch (Throwable th) {
                if (AL) {
                    iy.aM(th, -195909874157097036L, null);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(c.class);
    }

    @ey(method = 1741850725973384243L)
    public c() {
        try {
            if (j6) {
                iy.gn(-533362221557740695L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -533362221557740695L, null);
            }
            throw th;
        }
    }

    @ey(method = -973856389640311936L)
    public static b DW(String str, String str2, String str3) {
        try {
            if (j6) {
                iy.we(1396274453997934965L, null, str, str2, str3);
            }
            try {
                b bVarJ6 = b.j6(str);
                if (!FH(bVarJ6.j6) || Zo(str, str2, str3)) {
                    return bVarJ6;
                }
                return null;
            } catch (IllegalArgumentException e) {
                j8.FH("Could not parse response.", e);
                return null;
            }
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 1396274453997934965L, null, str, str2, str3);
            }
            throw th;
        }
    }

    @ey(method = 2176835483520760545L)
    public static boolean FH(int i) {
        try {
            if (j6) {
                iy.u7(863957139261675360L, null, i);
            }
            return i == 0 || i == 1 || i == 2;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 863957139261675360L, null, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3819257232503314984L)
    public static boolean Hw(Context context, long j, int i, int i2, String str, boolean z, b bVar) {
        try {
            if (j6) {
                iy.QX(2181975808575105735L, null, new Object[]{context, new Long(j), new Integer(i), new Integer(i2), str, new Boolean(z), bVar});
            }
            if (i != -1 && bVar.j6 != i) {
                j8.DW("Response codes don't match.");
                return false;
            }
            if (j != -1 && bVar.DW != j) {
                j8.DW("Nonce doesn't match.");
                return false;
            }
            if (z && !e.u7(context, bVar.DW)) {
                j8.DW("Nonce does not match device.");
                return false;
            }
            if (!bVar.FH.equals(str)) {
                j8.DW("Package name doesn't match.");
                return false;
            }
            try {
                int i3 = Integer.parseInt(bVar.Hw);
                if (i2 == -1 || i3 == i2) {
                    return true;
                }
                j8.DW("Unexpected version code");
                return false;
            } catch (NumberFormatException unused) {
                j8.DW("Non-int version code");
                return false;
            }
        } catch (Throwable th) {
            if (DW) {
                iy.rN(th, 2181975808575105735L, null, new Object[]{context, new Long(j), new Integer(i), new Integer(i2), str, new Boolean(z), bVar});
            }
            throw th;
        }
    }

    @ey(method = 464731290045622424L)
    private static boolean Zo(String str, String str2, String str3) {
        try {
            if (j6) {
                iy.we(3708688220276710041L, null, str, str2, str3);
            }
            PublicKey publicKeyJ6 = j6(str3);
            try {
                try {
                    try {
                        try {
                            Signature signature = Signature.getInstance("SHA1withRSA");
                            signature.initVerify(publicKeyJ6);
                            signature.update(str.getBytes());
                            if (signature.verify(h8.j6(str2))) {
                                return true;
                            }
                            j8.DW("Signature verification failed.");
                            return false;
                        } catch (i8 unused) {
                            j8.DW("Could not Base64-decode signature.");
                            return false;
                        }
                    } catch (SignatureException e) {
                        throw new RuntimeException(e);
                    }
                } catch (InvalidKeyException unused2) {
                    j8.DW("Invalid public key.");
                    return false;
                }
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 3708688220276710041L, null, str, str2, str3);
            }
            throw th;
        }
    }

    @ey(method = 1851630928507332608L)
    private static PublicKey j6(String str) {
        try {
            if (j6) {
                iy.tp(-6989586078351073305L, null, str);
            }
            try {
                try {
                    try {
                        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(h8.j6(str)));
                    } catch (InvalidKeySpecException e) {
                        j8.DW("Invalid key specification.");
                        throw new IllegalArgumentException(e);
                    }
                } catch (NoSuchAlgorithmException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (i8 e3) {
                j8.DW("Could not decode from Base64.");
                throw new IllegalArgumentException(e3);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -6989586078351073305L, null, str);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016c  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @abcd.ey(method = -2390241588480890109L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.aide.licensing.c.a v5(android.content.Context r21, long r22, int r24, int r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.licensing.c.v5(android.content.Context, long, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.aide.licensing.c$a");
    }
}
