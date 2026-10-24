package abcd;

import com.aide.ui.ServiceContainer;
import com.aide.ui.build.BuildService;

@cy(clazz = -295993899378265192L, container = -295993899378265192L, user = true)
/* loaded from: classes.dex */
public class dd extends hd implements BuildService.BuildListener {

    @gy
    private static /* synthetic */ boolean hK;

    @fy
    private static /* synthetic */ boolean w9;

    static {
        iy.Zo(dd.class);
    }

    @ey(method = -1927477181289637536L)
    public dd() {
        try {
            if (w9) {
                iy.gn(-431573082928276944L, null);
            }
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -431573082928276944L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.build.BuildService.BuildListener
    @ey(method = -2135079760205934412L)
    public void FH() {
        try {
            if (w9) {
                iy.gn(5474750847225240069L, this);
            }
            I();
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 5474750847225240069L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = -2862569806781094000L)
    public void Mz() {
        try {
            if (w9) {
                iy.gn(-548567412186924865L, this);
            }
            ServiceContainer.Zo().we(this);
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -548567412186924865L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = 4427821658992576992L)
    public String Sf() {
        try {
            if (w9) {
                iy.gn(-4555465946569076151L, this);
            }
            return ServiceContainer.Zo().v5();
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -4555465946569076151L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = 4696510695816963376L)
    public boolean ca() {
        try {
            if (w9) {
                iy.gn(-4338306100281331737L, this);
            }
            return ServiceContainer.Zo().tp();
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -4338306100281331737L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = -1909868121280817600L)
    public void cn() {
        try {
            if (w9) {
                iy.gn(-2925116500108655697L, this);
            }
            throw new IllegalStateException("BuilProgressDialog can not be cancelled");
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -2925116500108655697L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = 2958390179921682336L)
    public int dx() {
        try {
            if (w9) {
                iy.gn(6314251888296425965L, this);
            }
            return ServiceContainer.Zo().Zo();
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 6314251888296425965L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = -1511463154289281125L)
    public int ef() {
        try {
            if (w9) {
                iy.gn(-1400305262498618116L, this);
            }
            return ServiceContainer.Zo().VH();
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -1400305262498618116L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = 1169752242068566851L)
    public void g3() {
        try {
            if (w9) {
                iy.gn(2494849424798465928L, this);
            }
            ServiceContainer.Zo().FH(this);
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 2494849424798465928L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = -1389984479294268744L)
    public boolean ro() {
        try {
            if (!w9) {
                return false;
            }
            iy.gn(338790832828063297L, this);
            return false;
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 338790832828063297L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = 2398877279187739775L)
    public String vJ() {
        try {
            if (w9) {
                iy.gn(-4091025957011116028L, this);
            }
            return "Building " + ServiceContainer.Zo().Hw() + "...";
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -4091025957011116028L, this);
            }
            throw th;
        }
    }
}
