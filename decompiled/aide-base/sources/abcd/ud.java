package abcd;

import com.aide.ui.ServiceContainer;

@cy(clazz = 4774780077973484400L, container = 4774780077973484400L, user = true)
/* loaded from: classes.dex */
public class ud extends sd {

    @fy
    private static /* synthetic */ boolean EQ;

    @gy
    private static /* synthetic */ boolean we;

    static {
        iy.Zo(ud.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 264122695813176336L)
    public ud() {
        super("com.aide.designer", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAscoEgrFdBkxPcWpFbDQhJaTdZ92LV4sGN7NdUmkp1OIL9m9vO8cYFRU2ZCpHEQ+gilfA2T37855hqegNJfv3Uv/Rh9gZYy+cEGyqEnZyjZ0eYXEMcRmuvLNCrkFpg8xlzRpAvwMB7Tseez5GSYuwefuSle5OBLYrKYxZ14qIiHBwYrS338+v0jIav07YAlwxqkLIEWikNN0lI7ZuJlhcgIiwCJCDT9WtHaU8GgOGYh4cTLnuNAo5FOsSNnEmSmdc4jRyWCPSSETMs+fbEy3BsDKpaO4I2b/VO0/GVmyI9jkYJgkmx/33gYKSTRw9BZR3yy7Vtnq64/afnSoMYqzkDQIDAQAB", 100, "com.aide.licensing.UiBuilderKeyLicensingService");
        try {
            if (EQ) {
                iy.gn(2942344179180455048L, null);
            }
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 2942344179180455048L, null);
            }
            throw th;
        }
    }

    @Override // abcd.sd
    @ey(method = -1492335204511160295L)
    public void QX() {
        try {
            if (EQ) {
                iy.gn(-1596396759744046143L, this);
            }
            ServiceContainer.getLicenseService().KD();
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -1596396759744046143L, this);
            }
            throw th;
        }
    }

    @Override // abcd.sd
    @ey(method = -4259886391810253780L)
    public void Ws(String str) {
        try {
            if (EQ) {
                iy.tp(3397541739789242220L, this, str);
            }
            ServiceContainer.getLicenseService().nw();
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 3397541739789242220L, this, str);
            }
            throw th;
        }
    }

    @Override // abcd.sd
    @ey(method = 2400944904492811704L)
    public void XL(long j) {
        try {
            if (EQ) {
                iy.tp(-3117655817524663376L, this, new Long(j));
            }
            ServiceContainer.getLicenseService().SI(j);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -3117655817524663376L, this, new Long(j));
            }
            throw th;
        }
    }
}
