package com.aide.ui.htmluidesigner;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.ne;
import abcd.o8;
import com.aide.ui.ServiceContainer;
import com.aide.ui.build.IBuildService;

@cy(clazz = -488378637390711375L, container = -488378637390711375L, user = true)
/* loaded from: classes.dex */
public class HtmlCodeBuildService implements IBuildService, o8 {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(HtmlCodeBuildService.class);
    }

    @ey(method = 2306663955614432343L)
    public HtmlCodeBuildService() {
        try {
            if (j6) {
                iy.gn(4969087057633360960L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4969087057633360960L, null);
            }
            throw th;
        }
    }

    @ey(method = 3208914707397335709L)
    private void tp() {
        try {
            if (j6) {
                iy.gn(3734983575565377385L, this);
            }
            ServiceContainer.getOpenFileService().KD(false, false);
            WebDesignActivity.QX(ServiceContainer.getMainActivity(), ServiceContainer.getProjectService().getCurrentAppHome(), ne.j6(ServiceContainer.getProjectService().getCurrentAppHome()), 15);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3734983575565377385L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.build.IBuildService
    @ey(method = -1607726975621799537L)
    public void DW() {
        try {
            if (j6) {
                iy.gn(-2334514715757816865L, this);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2334514715757816865L, this);
            }
            throw th;
        }
    }

    @ey(method = -17850095411833145L)
    public void EQ() {
        try {
            if (j6) {
                iy.gn(-4254335609582193465L, this);
            }
            if (ServiceContainer.DW().VH() || ServiceContainer.DW().v5()) {
                return;
            }
            tp();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4254335609582193465L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.build.IBuildService
    @ey(method = 5685479659796196644L)
    public void FH(boolean z) {
        try {
            if (j6) {
                iy.Ws(3015653271529793760L, this, z);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3015653271529793760L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.build.IBuildService
    @ey(method = -5108559548024990100L)
    public void Hw(String str) {
        try {
            if (j6) {
                iy.tp(-941673722196579680L, this, str);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -941673722196579680L, this, str);
            }
            throw th;
        }
    }

    @Override // abcd.o8
    @ey(method = -1577258913512265945L)
    public o8.a VH() {
        try {
            if (j6) {
                iy.gn(-1694925828928946045L, this);
            }
            return o8.a.WEBSITE;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1694925828928946045L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.build.IBuildService
    @ey(method = -2176571274251632704L)
    public void Zo() {
        try {
            if (j6) {
                iy.gn(3407550674259204532L, this);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3407550674259204532L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.build.IBuildService
    @ey(method = -2798590721090223384L)
    public void gn() {
        try {
            if (j6) {
                iy.gn(2805790605073839000L, this);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2805790605073839000L, this);
            }
            throw th;
        }
    }

    @Override // abcd.o8
    @ey(method = -4330973547321935395L)
    public int j6() {
        try {
            if (!j6) {
                return 19;
            }
            iy.gn(2502640722707029641L, this);
            return 19;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2502640722707029641L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.build.IBuildService
    @ey(method = -5921513248616741316L)
    public void startCompile() {
        try {
            if (j6) {
                iy.gn(-6072918261898224864L, this);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -6072918261898224864L, this);
            }
            throw th;
        }
    }

    @ey(method = -2971868808648849663L)
    public void u7() {
        try {
            if (j6) {
                iy.gn(-2566430043814472751L, this);
            }
            EQ();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2566430043814472751L, this);
            }
            throw th;
        }
    }
}
