package abcd;

import abcd.o8;
import android.app.Activity;
import android.view.ViewGroup;
import com.aide.ui.ServiceContainer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

@cy(clazz = -247736501308931760L, container = -247736501308931760L, user = true)
/* loaded from: classes.dex */
public class l8 {

    @gy
    private static /* synthetic */ boolean Zo;

    @fy
    private static /* synthetic */ boolean v5;

    @dy(field = -3335754296123486716L)
    private List<m8> DW;

    @dy(field = 1138581265565629565L)
    private Activity FH;

    @dy(field = 1074577682238540480L)
    private boolean Hw;

    @dy(field = 5406303307594165501L)
    private HashMap<o8.a, n8> j6;

    static {
        iy.Zo(l8.class);
    }

    @ey(method = 1499367050054970267L)
    public l8() {
        try {
            if (v5) {
                iy.gn(-2852438529799277667L, null);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -2852438529799277667L, null);
            }
            throw th;
        }
    }

    @ey(method = 442166183589557685L)
    private boolean Zo() {
        try {
            if (v5) {
                iy.gn(-2480722325314651371L, this);
            }
            return Locale.getDefault().getCountry().equals(Locale.CHINA.getCountry());
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -2480722325314651371L, this);
            }
            throw th;
        }
    }

    @ey(method = 5571241563203867039L)
    public void DW() {
        try {
            if (v5) {
                iy.gn(1523340435843317375L, this);
            }
            this.Hw = false;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 1523340435843317375L, this);
            }
            throw th;
        }
    }

    @ey(method = 2476861263412039083L)
    public void FH() {
        try {
            if (v5) {
                iy.gn(-408576968990226165L, this);
            }
            this.j6 = new HashMap<>();
            this.DW = new ArrayList();
            this.FH = ServiceContainer.gn();
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -408576968990226165L, this);
            }
            throw th;
        }
    }

    @ey(method = 1008511601279507844L)
    public boolean Hw() {
        try {
            if (v5) {
                iy.gn(4491715233774417220L, this);
            }
            if (!ServiceContainer.getLicenseService().we() || Zo()) {
                if (!ServiceContainer.isTrainerMode()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 4491715233774417220L, this);
            }
            throw th;
        }
    }

    @ey(method = -1495268069528275L)
    public boolean VH() {
        try {
            if (v5) {
                iy.gn(-8241612656170389875L, this);
            }
            if (!Hw()) {
                return false;
            }
            Iterator<o8.a> it = this.j6.keySet().iterator();
            while (it.hasNext()) {
                if (this.j6.get(it.next()).j6()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -8241612656170389875L, this);
            }
            throw th;
        }
    }

    @ey(method = -249293309691408208L)
    public void gn(o8 o8Var) {
        try {
            if (v5) {
                iy.tp(4338409492300391472L, this, o8Var);
            }
            if (Hw()) {
                this.Hw = true;
                ServiceContainer.getLicenseService().ro(this.FH, o8Var.j6(), "run_command_" + o8Var.VH().toString(), false, true);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 4338409492300391472L, this, o8Var);
            }
            throw th;
        }
    }

    @ey(method = -4636137776520687675L)
    public void j6(ViewGroup viewGroup) {
        try {
            if (v5) {
                iy.tp(2713474256940568485L, this, viewGroup);
            }
            if (!Hw()) {
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 2713474256940568485L, this, viewGroup);
            }
            throw th;
        }
    }

    @ey(method = 523237007426866161L)
    public void u7(boolean z) {
        try {
            if (v5) {
                iy.Ws(-6172260880917814319L, this, z);
            }
            if (Hw()) {
                for (m8 m8Var : this.DW) {
                    if (z) {
                        m8Var.DW(true);
                        m8Var.FH();
                    } else {
                        m8Var.j6();
                    }
                }
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -6172260880917814319L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -3637578441527930405L)
    public boolean v5() {
        try {
            if (v5) {
                iy.gn(5692903736235876795L, this);
            }
            return this.Hw;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 5692903736235876795L, this);
            }
            throw th;
        }
    }
}
