package abcd;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.util.Base64;
import com.aide.common.AppLog;
import com.aide.ui.ServiceContainer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

@cy(clazz = -608272379628558035L, container = -608272379628558035L, user = true)
/* loaded from: classes.dex */
public class lf {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(lf.class);
    }

    @ey(method = 204613492150113648L)
    public lf() {
        try {
            if (j6) {
                iy.gn(-2562916957823444272L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2562916957823444272L, null);
            }
            throw th;
        }
    }

    @ey(method = 712731232416532032L)
    private boolean DW(dh0 dh0Var) {
        try {
            if (j6) {
                iy.tp(1072743139756043613L, this, dh0Var);
            }
            if (!Boolean.TRUE.equals(dh0Var.get("granted"))) {
                return false;
            }
            String str = (String) dh0Var.get("data");
            String str2 = (String) dh0Var.get("signature");
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4PX6yTLxZ2OSmBKIgeEZNnP6UFqdAqVmlHGJeJFSNPa1cQv6fjTBA0CB9V95Fz6rv16XDEvWk0ewcsWLWuf6y1+ajsWP9K7G5bCHJ0YwVaoqeXJz6149wDiQBzLtzVh5FdPZdCP5CXnRon2yOMYxTqaKmtz/Ou3FdYGqAmz4UXc5CVOV7C5KPbSAcWURKlbaCRi/X0htUHSHdwBuJ8QW2PExtG+0Ev65S39SXdYfz9QtZZt7BaL1aeTmDBi5FO27tFH6rFA/dnTV1e5A4aemhz4hHNn9BgOiws1NW5Zmy6pHi+2P9H7pCQte805/mOdidnm84uFS5sMSviDD55LwyQIDAQAB", 0)));
            Signature signature = Signature.getInstance("SHA1withRSA");
            signature.initVerify(publicKeyGeneratePublic);
            signature.update(str.getBytes());
            if (!signature.verify(Base64.decode(str2, 0))) {
                return false;
            }
            dh0 dh0Var2 = (dh0) new gh0().VH(str);
            if (!ServiceContainer.P8.equals(dh0Var2.get("packageName")) || !"Intel".equals(dh0Var2.get("sponsoringProgram"))) {
                return false;
            }
            String str3 = (String) dh0Var2.get("googleAccountAddress");
            Account[] accountsByType = AccountManager.get(ServiceContainer.getContext()).getAccountsByType("com.google");
            if (accountsByType != null) {
                for (Account account : accountsByType) {
                    if (str3.equals(account.name)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1072743139756043613L, this, dh0Var);
            }
            throw th;
        }
    }

    @ey(method = -1223127015671490736L)
    public void FH() {
        try {
            if (j6) {
                iy.gn(2342771761349631807L, this);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2342771761349631807L, this);
            }
            throw th;
        }
    }

    @ey(method = 56906318342913900L)
    @SuppressLint({"NewApi"})
    public void j6() {
        try {
            if (j6) {
                iy.gn(-1452435521398897467L, this);
            }
            try {
                FileInputStream fileInputStreamOpenFileInput = ServiceContainer.getContext().openFileInput("sponsorship.json");
                try {
                    if (DW((dh0) new gh0().v5(new InputStreamReader(fileInputStreamOpenFileInput)))) {
                        ServiceContainer.getLicenseService().P8(Long.MAX_VALUE);
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
            } catch (FileNotFoundException unused) {
            } catch (Exception e) {
                AppLog.v5(e);
            }
        } catch (Throwable th4) {
            if (DW) {
                iy.aM(th4, -1452435521398897467L, this);
            }
            throw th4;
        }
    }
}
