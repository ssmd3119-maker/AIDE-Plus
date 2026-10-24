package abcd;

import android.app.Activity;
import android.app.Dialog;
import com.aide.ui.ServiceContainer;
import com.aide.ui.services.DownloadService;

@cy(clazz = -1127165261660494512L, container = -1127165261660494512L, user = true)
/* loaded from: classes.dex */
public class jd extends hd implements DownloadService.t {

    @gy
    private static /* synthetic */ boolean hK;

    @fy
    private static /* synthetic */ boolean w9;

    static {
        iy.Zo(jd.class);
    }

    @ey(method = 1934263656180407640L)
    public jd() {
        try {
            if (w9) {
                iy.gn(-8103232920740687229L, null);
            }
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -8103232920740687229L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.DownloadService.t
    @ey(method = 4771100992519935853L)
    public void DW() {
        try {
            if (w9) {
                iy.gn(2001080235955720643L, this);
            }
            sh();
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 2001080235955720643L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd, com.aide.common.MessageBox
    @ey(method = 1799796125404491063L)
    public Dialog Hw(Activity activity) {
        try {
            if (w9) {
                iy.tp(-2814951328722170855L, this, activity);
            }
            Dialog dialogHw = super.Hw(activity);
            dialogHw.getWindow().clearFlags(2);
            return dialogHw;
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, -2814951328722170855L, this, activity);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = -4741698925559688384L)
    public void Mz() {
        try {
            if (w9) {
                iy.gn(1934489247727088360L, this);
            }
            ServiceContainer.getDownloadService().sh(this);
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 1934489247727088360L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = -4550356540743605384L)
    public String Sf() {
        try {
            if (w9) {
                iy.gn(4292453787938706340L, this);
            }
            return ServiceContainer.getDownloadService().ei();
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 4292453787938706340L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = -4297392400491988708L)
    public boolean ca() {
        try {
            if (w9) {
                iy.gn(4557985712436470400L, this);
            }
            return ServiceContainer.getDownloadService().SI();
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 4557985712436470400L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = 1988250047462202056L)
    public void cn() {
        try {
            if (w9) {
                iy.gn(-2957392785689360500L, this);
            }
            ServiceContainer.getDownloadService().U2();
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -2957392785689360500L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = -3216032730242753664L)
    public int dx() {
        try {
            if (w9) {
                iy.gn(2750049240126575376L, this);
            }
            return ServiceContainer.getDownloadService().vy();
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 2750049240126575376L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = -3959405038217216931L)
    public int ef() {
        try {
            if (w9) {
                iy.gn(-120415912630297185L, this);
            }
            return ServiceContainer.getDownloadService().P8();
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -120415912630297185L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = 3475995638527955145L)
    public void g3() {
        try {
            if (w9) {
                iy.gn(1070973949102827763L, this);
            }
            ServiceContainer.getDownloadService().Mr(this);
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 1070973949102827763L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.DownloadService.t
    @ey(method = 2174304732912759519L)
    public void j6() {
        try {
            if (w9) {
                iy.gn(-2981776898143523583L, this);
            }
            I();
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -2981776898143523583L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = -3305596857522779964L)
    public boolean ro() {
        try {
            if (!w9) {
                return true;
            }
            iy.gn(-4175811380493024712L, this);
            return true;
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -4175811380493024712L, this);
            }
            throw th;
        }
    }

    @Override // abcd.hd
    @ey(method = -2553019722456949911L)
    public String vJ() {
        try {
            if (w9) {
                iy.gn(-4543566927044512693L, this);
            }
            return ServiceContainer.getDownloadService().getTaskTitle();
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -4543566927044512693L, this);
            }
            throw th;
        }
    }
}
