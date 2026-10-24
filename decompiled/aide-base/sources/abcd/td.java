package abcd;

import com.aide.licensing.IAideLicensingService;
import com.aide.ui.ServiceContainer;
import com.aide.ui.firebase.FireBaseLogEvent;
import java.util.Date;
import java.util.HashMap;

@cy(clazz = 2949817276234842248L, container = 2949817276234842248L, user = true)
/* loaded from: classes.dex */
public class td extends sd {

    @fy
    private static /* synthetic */ boolean EQ;

    @gy
    private static /* synthetic */ boolean we;

    static {
        iy.Zo(td.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -413644360712001195L)
    public td() {
        super("com.aide.premium.key", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkjXTkIvABlLJgyvluBm4h4Ytw87BbBrSRXohMVMvk0Eq2pYJKT1jYfC1W65/YY5GcFYwMiaemVlpH40h/h+rkm+GYYq04awtN8zv35+HymbrW6ztGgNv7gF7ksAOOb8swqQwlx6uzfZWzbny7r9kkKURlXWmpkcKpWUjfoQ1MIRFxuXoJ2owTjvdkezI2hjCxC+NJ57QCG8tBoWJo5jscDRylHuaXBGVX7fJx7NsWzlk9xTXUFE7F8J5OaPRpgCNwo+xC0pXSoA/yCv1dOy4v2tPr9L9rfB95nrTwRs1ob44LOY3UqYgVMC1wpy+nxU6UGch8g8/DfHXfaefBcsbfwIDAQAB", 1802210011, IAideLicensingService.class.getName());
        try {
            if (EQ) {
                iy.gn(864827869669294400L, null);
            }
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 864827869669294400L, null);
            }
            throw th;
        }
    }

    @Override // abcd.sd
    @ey(method = -2122759843208508852L)
    public void QX() {
        try {
            if (EQ) {
                iy.gn(5702397533661882755L, this);
            }
            ServiceContainer.getLicenseService().vy();
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 5702397533661882755L, this);
            }
            throw th;
        }
    }

    @Override // abcd.sd
    @ey(method = 5018553345795056531L)
    public void Ws(String str) {
        try {
            if (EQ) {
                iy.tp(4323740333478847184L, this, str);
            }
            j8.j6("Setting premium key not valid - " + str);
            ServiceContainer.getLicenseService().BT();
            HashMap map = new HashMap();
            map.put("reason", str);
            FireBaseLogEvent.EQ("Premium key not valid", map);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 4323740333478847184L, this, str);
            }
            throw th;
        }
    }

    @Override // abcd.sd
    @ey(method = 2860716508514835561L)
    public void XL(long j) {
        try {
            if (EQ) {
                iy.tp(1746568777782687324L, this, new Long(j));
            }
            j8.j6("Setting premium key valid until " + new Date(j).toString());
            ServiceContainer.getLicenseService().P8(j);
            HashMap map = new HashMap();
            map.put("validDays", Long.toString((j - System.currentTimeMillis()) / 86400000));
            FireBaseLogEvent.EQ("Premium key valid", map);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 1746568777782687324L, this, new Long(j));
            }
            throw th;
        }
    }
}
