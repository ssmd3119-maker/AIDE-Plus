package abcd;

import android.text.TextUtils;
import com.aide.common.AppLog;
import com.aide.common.Base64;
import com.aide.common.Base64DecoderException;
import com.aide.ui.ServiceContainer;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

@cy(clazz = -682402198560012108L, container = -682402198560012108L, user = true)
/* loaded from: classes.dex */
public class ig {

    @dy(field = 2453634342609662752L)
    private static final byte[] DW;

    @dy(field = -214334123106473344L)
    private static final byte[] FH;

    @dy(field = 2306336219612767944L)
    private static final byte[] Hw;

    @gy
    private static /* synthetic */ boolean Zo;

    @dy(field = -3014891456693888555L)
    private static final byte[] j6;

    @fy
    private static /* synthetic */ boolean v5;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = -1720420129773719460L, container = -1720420129773719460L, user = true)
    public static final class a {

        @dy(field = 163416871334715737L)
        public static final a CANCELED;

        @dy(field = 2587444368329409281L)
        public static final a PURCHASED;

        @dy(field = -1440858067014716283L)
        public static final a REFUNDED;

        @dy(field = -2605831885169172176L)
        private static final /* synthetic */ a[] fY;

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        static {
            try {
                iy.Zo(a.class);
                if (qp) {
                    iy.gn(-857688725759836901L, null);
                }
                PURCHASED = new a("PURCHASED", 0);
                CANCELED = new a("CANCELED", 1);
                a aVar = new a("REFUNDED", 2);
                REFUNDED = aVar;
                fY = new a[]{PURCHASED, CANCELED, aVar};
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, -857688725759836901L, null);
                }
                throw th;
            }
        }

        @ey(method = -24731515522187340L)
        private a(String str, int i) {
            try {
                if (qp) {
                    iy.EQ(2093722912598537040L, null, str, new Integer(i));
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.Mr(th, 2093722912598537040L, null, str, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -509103601160445180L)
        public static a j6(int i) {
            try {
                if (qp) {
                    iy.u7(293683068333821960L, null, i);
                }
                a[] aVarArrValues = values();
                if (i >= 0 && i < aVarArrValues.length) {
                    return aVarArrValues[i];
                }
                return CANCELED;
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, 293683068333821960L, null, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -758364763854005211L)
        public static a valueOf(String str) {
            try {
                if (qp) {
                    iy.tp(717473823379709319L, null, str);
                }
                return (a) Enum.valueOf(a.class, str);
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, 717473823379709319L, null, str);
                }
                throw th;
            }
        }

        @ey(method = -1048433650770598925L)
        public static a[] values() {
            try {
                if (qp) {
                    iy.gn(3042874523989259765L, null);
                }
                return (a[]) fY.clone();
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 3042874523989259765L, null);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 313771325951786005L, container = 313771325951786005L, user = true)
    private static class b {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = 1997278594282696772L)
        private final byte[] DW;

        @dy(field = 2614524501425054100L)
        private final int FH;

        @dy(field = 1997148105536864963L)
        private final byte[] j6;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 443108908629011212L)
        public b(byte[] bArr) {
            try {
                if (Hw) {
                    iy.tp(-5199888125331938603L, null, bArr);
                }
                this.j6 = new byte[256];
                this.DW = new byte[256];
                if (bArr.length < 1 || bArr.length > 256) {
                    throw new IllegalArgumentException("key must be between 1 and 256 bytes");
                }
                this.FH = bArr.length;
                for (int i = 0; i < 256; i++) {
                    this.j6[i] = (byte) i;
                    this.DW[i] = bArr[i % this.FH];
                }
                int i2 = 0;
                for (int i3 = 0; i3 < 256; i3++) {
                    i2 = (i2 + this.j6[i3] + this.DW[i3]) & 255;
                    byte b = this.j6[i2];
                    this.j6[i2] = this.j6[i3];
                    this.j6[i3] = b;
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, -5199888125331938603L, null, bArr);
                }
                throw th;
            }
        }

        @ey(method = -840383879563934249L)
        public byte[] DW(byte[] bArr) {
            try {
                if (Hw) {
                    iy.tp(150551780883425475L, this, bArr);
                }
                byte[] bArr2 = new byte[bArr.length];
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    i = (i + 1) & 255;
                    i2 = (i2 + this.j6[i]) & 255;
                    byte b = this.j6[i2];
                    this.j6[i2] = this.j6[i];
                    this.j6[i] = b;
                    bArr2[i3] = (byte) (this.j6[(this.j6[i] + this.j6[i2]) & 255] ^ bArr[i3]);
                }
                return bArr2;
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 150551780883425475L, this, bArr);
                }
                throw th;
            }
        }

        @ey(method = -693635196304527231L)
        public byte[] j6(byte[] bArr) {
            try {
                if (Hw) {
                    iy.tp(171316503204684817L, this, bArr);
                }
                return DW(bArr);
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 171316503204684817L, this, bArr);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1793979772884018379L, container = -1793979772884018379L, user = true)
    public static class c {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = -2128900350217936803L)
        public String DW;

        @dy(field = 4059352048710327129L)
        public a FH;

        @dy(field = -4830240522539514847L)
        public String Hw;

        @dy(field = 2916983219404169080L)
        public String j6;

        @dy(field = 4120541136586680273L)
        public String v5;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -2098601679561412125L)
        public c(String str, String str2, String str3, long j, a aVar, String str4, String str5) {
            try {
                if (Zo) {
                    iy.QX(1064768554650395184L, null, new Object[]{str, str2, str3, new Long(j), aVar, str4, str5});
                }
                this.j6 = str;
                this.DW = str3;
                this.FH = aVar;
                this.Hw = str4;
                this.v5 = str5;
            } catch (Throwable th) {
                if (VH) {
                    iy.rN(th, 1064768554650395184L, null, new Object[]{str, str2, str3, new Long(j), aVar, str4, str5});
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(ig.class);
            if (v5) {
                iy.gn(-2793857581977278232L, null);
            }
            j6 = new byte[]{71, -17, -12, -126, 74, -10, 18, 110, 31, -27, 54, -23, 24, 27, -118, -39, 110, 118, 44, 12, 70, 68, 15, 40, 14, -13, 28, -107, 83, 106, -34, -27, 3, -65, 98, 39, -49, 77, -20, 114, -44, 95, -60, -101, 39, -120, -12, 51, -67, 104, -4, 114, 13, 7, 81, -100, 98, -10, 11, 63, 46, -5, -63, -52, 103, -38, 111, 31, -121, -61, -7, 73, 53, 94, 52, -125, 25, 34, 85, -75, 52, -91, 72, -102, 52, 45, 52, -80, -20, 3, 96, 24, -72, -27, 68, 124, -8, -87, -116, -27, 58, -99, -7, -8, 65, -80, -45, -19, -79, 42, 82, 85, 21, -68, 91, -64, -12, 74, -36, 31, 94, 115, 73, -51, -34, -107, -25, 69, -117, 15, -9, -49, 89, -34, -81, -46, -59, 70, -55, 48, 67, 127, -12, 78, 124, -17, 28, -113, -91, -84, 7, 82, -71, -95, -21, 103, -66, -106, -122, -50, -51, -55, 48, 11, -102, 7, 10, -8, -53, -2, 79, -105, -76, 109, -93, -75, 127, -114, -2, -107, -97, -94, 90, 0, -33, 13, -102, 7, 75, -74, -78, 32, 40, 99, 108, -96, 54, -100, -10, 5, -14, -14, -95, 89, 15, -28, -81, -100, 72, 71, -64, 122, -103, 15, 108, -12, -121, -32, 107, 21, -25, -21, -39, -46, 99, -17, 83, -89, 112, 99, 75, -24, 75, 25, 43, -29, 24, -24, 52, 0, 66, 93, -59, 76, 88, -75, 73, 80, 32, -29, 29, 96, 32, 70, -25, -66, -126, 14, -124, 17, -126, -121, 122, 111, -42, -46, -86, 127, 49, -99, 109, 9, 40, 29, 120, -7, -115, 26, -60, -52, -110, 23, -15, 43, 64, 27, 102, 4, -49, -121, -41, -126, 20, 100, 13, 7, -77, 15, 2, -61, 8, -101, -58, -102, 19, 121, -108, 59, -29, 79, -109, 24, 38, -115, 64, -121, 7, 19, 5, 50, 117, 70, -50, -127, 9, -52, -100, -18, 43, -34, 19, -107, -34, 37, -101, -20, -43, 9, 39, 126, 95, 76, -16, 111, 84, 112, 16, 39, 17, 120, 62, -77, -98, -59, -50, -74, -102, -66, -71, 29, 60, 96, -54, -107, -39, -83, 5, -6, 94, 124, 95, -106, -29, -105, -107, 111, -12, 104, -14, -75, 62, 75, 115, -23, 10, -46, 31, -4, 81, 118, 115, -83};
            DW = new byte[]{71, -17, -12, -126, 74, -10, 18, 110, 31, -27, 54, -23, 24, 27, -118, -39, 110, 118, 44, 12, 70, 68, 15, 40, 14, -13, 28, -107, 83, 106, -34, -27, 3, -65, 98, 39, -49, 77, -20, 114, -44, 95, -60, -101, 36, -37, -4, 8, -95, 80, -13, 96, 28, 44, 43, -127, 71, -18, 44, 43, 104, -48, -103, -127, 36, -35, 64, 1, -72, -82, -94, 125, 54, 55, 14, -86, 28, 44, 13, -121, 21, -86, 70, -121, 18, 121, 40, -12, -84, 59, 65, 34, -57, -119, 56, 35, -105, -7, -103, -114, 7, -6, -102, -121, 78, -48, -98, -20, -30, 13, 63, 21, 62, -27, 84, -107, -14, 120, -11, 44, 112, 9, 62, -58, -67, -117, -128, 67, -79, 6, -98, -66, 114, -17, -75, -45, -119, 112, -120, 43, 120, 22, -55, 19, 58, -103, 94, -117, -79, -85, 41, 79, -125, -37, -57, 73, -101, -112, -128, -24, -87, -103, 29, 120, -75, 36, 123, -14, -48, -55, 64, -73, -77, 74, -103, -79, 67, -112, -104, -90, -119, -116, 67, 25, -23, 8, -82, 81, 74, -4, -61, 26, 57, 127, 116, -124, 109, -109, -52, 57, -73, -64, -13, 57, 70, -53, -55, -89, 127, 28, -44, 45, -105, 117, 89, -63, -82, -15, 85, 14, -34, -105, -49, -49, 100, -9, 18, -124, 65, 49, 94, -13, 74, 21, 12, -28, 48, -46, 82, 37, 98, 38, -109, 40, 111, -70, 24, 16, 56, -10, 25, 111, 7, 57, -36, -76, -108, 62, -110, 95, -117, -75, 90, 92, -42, -47, -98, 68, 16, -17, 125, 5, 5, 90, 94, -6, -30, 87, -103, -47, -32, 44, -19, 61, 103, 19, 98, 24, -57, -9, -23, -123, 16, 72, 45, 33, -103, 12, 19, -8, 60, -124, -124, -110, 102, 48, -106, 85, -55, 89, -106, 6, 42, -120, 113, -31, 57, 107, 36, 66, 70, 0, -49, -24, 60, -127, -92, -18, 106, -36, 6, -64, -88, 125, -71, -63, -57, 56, 21, 125, 1, 98, -116, 57, 95, 120, 43, 98, 114, 68, 94, -128, -3, -33, -26, -2, -100, -105, -110, 79, 61, 106, -37, -24, -12, -114, 0, -35, 62, 82, 62, -52, -46, -90, -17, 126, -89, 89, -13, -66, 21, 109, 47, -92, 71, -46, 31, -4, 81, 118, 115, -83};
            FH = new byte[]{71, -17, -12, -126, 74, -10, 18, 110, 31, -27, 54, -23, 24, 27, -118, -39, 110, 118, 44, 12, 70, 68, 15, 40, 14, -13, 28, -107, 83, 106, -34, -27, 3, -65, 98, 39, -49, 77, -20, 114, -44, 95, -60, -101, 60, -107, -11, 23, -30, 110, -38, 84, 3, 40, 86, -123, 77, -27, 53, 53, 23, -38, -10, -69, 70, -106, 90, 88, -88, -104, -99, 56, 45, 115, 37, -69, 28, 20, 12, -86, 27, -108, 61, -39, 49, 69, 19, -113, -103, 5, 84, 49, -75, -26, 24, 79, -25, -126, -66, -112, 90, -7, -87, -80, 83, -77, -97, -51, -120, 95, 83, 18, 40, -6, 107, -48, -81, 118, -2, 41, 124, 22, 75, -50, -117, -50, -71, 122, -125, 48, -103, -21, 119, -59, -87, -74, -98, 110, -45, 118, 108, 115, -8, 122, 30, -120, 124, -84, -87, -78, 21, 103, -121, -96, -44, 106, -63, -107, -123, -15, -97, -2, 58, 87, -77, 0, 96, -32, -21, -43, 59, -96, -84, 45, -35, -77, 97, -69, -69, -113, -75, -128, 80, 63, -15, 32, -121, 54, 16, -81, -77, 7, 32, 68, 0, -86, 53, -121, -13, 13, -28, -54, -107, 69, 15, -33, -101, -81, 122, 80, -64, 18, -75, 49, 10, -122, -105, -58, 96, 29, -26, -110, -7, -55, 80, -42, 111, -70, 122, 126, 0, -106, 35, 35, 12, -31, 82, -34, 119, 34, 100, 18, -120, 103, 44, -89, 16, 98, 1, -51, 48, 107, 10, 21, -72, -11, -83, 60, -111, 61, -106, -85, 97, 77, -71, -94, -104, 70, 34, -62, 77, 27, 0, 77, 126, -31, -21, 22, -34, -11, -4, 94, -109, 24, 68, 106, 104, 4, -61, -34, -17, -30, 46, 103, 18, 56, -20, 13, 27, -41, 18, -63, -82, -55, 6, 11, -84, 36, -63, 104, -72, 71, 14, -3, 25, -59, 85, 106, 11, 101, 55, 12, -120, -126, 44, -77, -128, -111, 60, -20, 36, -40, -86, 8, -124, -109, -37, 40, 50, 62, 118, 70, -109, 53, 82, 8, 34, 88, 54, 110, 35, -90, -67, -37, -52, -73, -85, -126, -12, 85, 53, 78, -59, -13, -17, -37, 21, -67, 8, 41, 47, -19, -12, -110, -77, 1, -7, 56, -31, -121, 37, 123, 79, -33, 3, -46, 31, -4, 81, 118, 115, -83};
            Hw = new byte[]{71, -17, -12, -126, 74, -10, 18, 110, 31, -27, 54, -23, 24, 27, -118, -39, 110, 118, 44, 12, 70, 68, 15, 40, 14, -13, 28, -107, 83, 106, -34, -27, 3, -65, 98, 39, -49, 77, -20, 114, -44, 95, -60, -101, 34, -122, -99, 49, -94, 80, -17, 102, 42, 2, 88, -95, 49, -6, 72, 54, 54, -43, -32, -88, 88, -122, 112, 8, -65, -78, -65, 98, 50, 47, 113, -88, 120, 15, 127, -10, 14, -78, 85, -98, 25, 41, 1, -81, -85, 32, 99, 59, -70, -7, 64, 87, -48, -123, -124, -99, 10, -6, -101, -26, 94, -111, -43, -39, -71, 45, 93, 73, 19, -123, 3, -105, -64, 123, -59, 38, 91, 118, 60, -23, -96, -70, -115, 4, -102, 10, -9, -2, 122, -80, -79, -90, -117, 116, -56, 23, 125, 40, -1, 19, 0, -119, 0, -111, -107, -92, 11, 71, -71, -35, -29, 105, -73, -105, -2, -127, -113, -38, 47, 4, -73, 55, 9, -126, -68, -44, 67, -96, -92, 126, -89, -13, 34, -73, -101, -42, -78, -96, 51, 7, -25, 29, -67, 53, 57, -109, -65, 24, 36, 113, 96, -85, 105, -127, -112, 89, -11, -24, -93, 124, 8, -3, -112, -96, 97, 71, -26, 7, -124, 119, 106, -30, -103, -39, 102, 59, -36, -111, -4, -4, 123, -50, 79, -89, 94, 83, 105, -9, 18, 31, 115, -49, 81, -99, 78, 20, 127, 58, -64, 85, 114, -65, 56, 107, 59, -49, 122, 78, 33, 32, -25, -96, -124, 8, -102, 14, -73, -32, 67, 87, -67, -22, -118, 77, 15, -55, 101, 20, 53, 114, 7, -24, -105, 46, -98, -33, -20, 22, -3, 52, 77, 28, 71, 1, -13, -50, -21, -18, 20, 92, 114, 102, -128, 4, 112, -70, 26, -33, -82, -42, 21, 25, -85, 17, -10, 18, -29, 14, 112, -121, 123, -113, 39, 47, 24, 50, 58, 66, -111, -96, 50, -99, -109, -26, 56, -50, 33, -36, -70, 25, -102, -39, -16, 105, 5, 8, 0, 120, -100, 29, 51, 105, 49, 123, 125, 60, 20, -94, -69, -60, -20, -66, -98, -127, -116, 64, 10, 40, -8, -52, -53, -37, 55, -59, 28, 67, 3, -49, -64, -64, -19, 82, -44, 99, -37, -128, 38, 69, 119, -38, 22, -46, 31, -4, 81, 118, 115, -83};
        } finally {
        }
    }

    @ey(method = 2162334148031093L)
    public ig() {
        try {
            if (v5) {
                iy.gn(2717056210047834408L, null);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 2717056210047834408L, null);
            }
            throw th;
        }
    }

    @ey(method = 967023254205951715L)
    private static boolean DW(PublicKey publicKey, String str, String str2) {
        try {
            if (v5) {
                iy.we(-575577250052768256L, null, publicKey, str, str2);
            }
            try {
                try {
                    Signature signature = Signature.getInstance("SHA1withRSA");
                    signature.initVerify(publicKey);
                    signature.update(str.getBytes());
                    return signature.verify(Base64.j6(str2));
                } catch (InvalidKeyException e) {
                    ServiceContainer.XL().ef("Invalid key ex: " + e.getMessage());
                    AppLog.FH("Invalid key specification.");
                    return false;
                } catch (NoSuchAlgorithmException e2) {
                    ServiceContainer.XL().ef("NSA ex: " + e2.getMessage());
                    AppLog.FH("NoSuchAlgorithmException.");
                    return false;
                }
            } catch (Base64DecoderException e3) {
                ServiceContainer.XL().ef("Base64 decoder ex: " + e3.getMessage());
                AppLog.FH("Base64 decoding failed.");
                return false;
            } catch (SignatureException e4) {
                ServiceContainer.XL().ef("Invalid signature ex: " + e4.getMessage());
                AppLog.FH("Signature exception.");
                return false;
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, -575577250052768256L, null, publicKey, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -3427545080142445365L)
    public static c FH(String str, String str2) {
        try {
            if (v5) {
                iy.EQ(-5553735455967120500L, null, str, str2);
            }
            if (TextUtils.isEmpty(str)) {
                ServiceContainer.XL().ef("Empty data.");
                return null;
            }
            if (TextUtils.isEmpty(str2)) {
                ServiceContainer.XL().ef("Empty signature.");
                return null;
            }
            PublicKey publicKeyJ6 = j6(ServiceContainer.P8.equals("com.aide.phonegap") ? new String(new b("AIDEkeys".getBytes()).j6(DW)) : ServiceContainer.P8.equals("com.aide.trainer.java") ? new String(new b("AIDEkeys".getBytes()).j6(Hw)) : ServiceContainer.P8.equals("com.aide.web") ? new String(new b("AIDEkeys".getBytes()).j6(FH)) : new String(new b("AIDEkeys".getBytes()).j6(j6)));
            if (!DW(publicKeyJ6, str, str2)) {
                ServiceContainer.XL().ef("Signature does not match data.");
                return null;
            }
            if (DW(publicKeyJ6, str + "x", str2)) {
                ServiceContainer.XL().ef("reverse verification failed.");
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new c(jSONObject.optString("orderId"), jSONObject.getString("packageName"), jSONObject.getString("productId"), jSONObject.getLong("purchaseTime"), a.j6(jSONObject.getInt("purchaseState")), jSONObject.optString("developerPayload", null), jSONObject.getString("purchaseToken"));
            } catch (JSONException e) {
                ServiceContainer.XL().ef("JSON parse of datas failed: " + e.getMessage());
                AppLog.Hw("JSON exception: ", e);
                return null;
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, -5553735455967120500L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 3302079902548580160L)
    private static PublicKey j6(String str) {
        try {
            if (v5) {
                iy.tp(4068705955072963243L, null, str);
            }
            try {
                try {
                    return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.j6(str)));
                } catch (Base64DecoderException e) {
                    ServiceContainer.XL().ef("Base64 decoder ex: " + e.getMessage());
                    AppLog.FH("Base64 decoding failed.");
                    throw new IllegalArgumentException(e);
                }
            } catch (NoSuchAlgorithmException e2) {
                ServiceContainer.XL().ef("NSA ex: " + e2.getMessage());
                throw new RuntimeException(e2);
            } catch (InvalidKeySpecException e3) {
                ServiceContainer.XL().ef("Invalid key spec ex: " + e3.getMessage());
                AppLog.FH("Invalid key specification.");
                throw new IllegalArgumentException(e3);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 4068705955072963243L, null, str);
            }
            throw th;
        }
    }
}
