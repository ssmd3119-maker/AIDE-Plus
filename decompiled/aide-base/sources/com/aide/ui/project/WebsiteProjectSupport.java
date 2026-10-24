package com.aide.ui.project;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.ne;
import abcd.oe;
import com.aide.common.ValueRunnable;
import com.aide.engine.EngineSolution;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.build.BuildServiceCollect;
import com.aide.ui.htmluidesigner.WebDesignActivity;
import com.aide.ui.services.ProjectSupport;
import com.aide.ui.services.TemplateService;
import com.aide.ui.trainer.c;
import com.aide.ui.u;
import com.aide.ui.util.FileSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@cy(clazz = -3520519734571998864L, container = -3520519734571998864L, user = true)
/* loaded from: classes.dex */
public class WebsiteProjectSupport implements ProjectSupport {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(WebsiteProjectSupport.class);
    }

    @ey(method = 1263853729974435544L)
    public WebsiteProjectSupport() {
        try {
            if (j6) {
                iy.gn(1250947836871120740L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1250947836871120740L, null);
            }
            throw th;
        }
    }

    @ey(method = 292643648758380127L)
    private int cb() {
        try {
            if (!j6) {
                return 3;
            }
            iy.gn(222715339402693248L, this);
            return 3;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 222715339402693248L, this);
            }
            throw th;
        }
    }

    @ey(method = 3213981206308213236L)
    private boolean dx() {
        try {
            if (j6) {
                iy.gn(-29792151565264345L, this);
            }
            return FileSystem.J8(ServiceContainer.getProjectService().getCurrentAppHome(), cb(), ".html", ".htm", ".css", ".js") >= cb();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -29792151565264345L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 3501038762488165773L)
    public boolean FH(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(251717765803315200L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 251717765803315200L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 135824047774438881L)
    public boolean Hw() {
        try {
            if (!j6) {
                return false;
            }
            iy.gn(-5584245973780392416L, this);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -5584245973780392416L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 42612449649574581L)
    public void J0(String str) {
        try {
            if (j6) {
                iy.tp(-386879010789391600L, this, str);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -386879010789391600L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -7770854080588559727L)
    public boolean J8() {
        try {
            if (!j6) {
                return false;
            }
            iy.gn(-4387455864445007648L, this);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4387455864445007648L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1160496007321376640L)
    public void Mr() {
        try {
            if (j6) {
                iy.gn(771706875537429051L, this);
            }
            ServiceContainer.getLicenseService().ro(ServiceContainer.gn(), u.shop_feature_premium_projects, "large_project", false, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 771706875537429051L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1242619075230020103L)
    public void P8(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(206312876054440480L, this, str, str2);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 206312876054440480L, this, str, str2);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -4065916565820079665L)
    public void SI(String str, ValueRunnable<String> valueRunnable) {
        try {
            if (j6) {
                iy.EQ(489143545035999168L, this, str, valueRunnable);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 489143545035999168L, this, str, valueRunnable);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1575506479975814925L)
    public void U2(String str, Map<String, List<String>> map, List<String> list) {
        try {
            if (j6) {
                iy.we(4673752937818284344L, this, str, map, list);
            }
            map.put(str, new ArrayList());
            list.add(str);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 4673752937818284344L, this, str, map, list);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1796707003799046339L)
    public TemplateService.TemplateGroup[] VH() {
        try {
            if (j6) {
                iy.gn(-920486448243438216L, this);
            }
            TemplateService.Template template = new TemplateService.Template(this, 6, "Website", "Html/Css/JavaScript", "MyWebsite", false, false, "com.aide.web", "WEBSITE", "course_web", ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.web"));
            return new TemplateService.TemplateGroup[]{new TemplateService.TemplateGroup("Website", template, R$drawable.ic_launcher_web, "Website.zip", new String[]{"index.html", "styles.css"}, null), new TemplateService.TemplateGroup("Bootstrap Website", template, R$drawable.ic_launcher_web, "WebsiteBootstrap.zip", new String[]{"index.html", "styles.css"}, null)};
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -920486448243438216L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -3515680005415477680L)
    public List<c.C0094c> XL() {
        try {
            if (j6) {
                iy.gn(-4195405679027850973L, this);
            }
            return Arrays.asList(new c.C0094c("course_web", 20, new String[]{"com.aide.web"}));
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4195405679027850973L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -370862414168584192L)
    public boolean Zo(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(2612608778017605393L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2612608778017605393L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1282141483110018531L)
    public boolean a8(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(730984378143139296L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 730984378143139296L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -5171402307727376919L)
    public boolean aM(String str) {
        try {
            if (j6) {
                iy.tp(-4305316627950856272L, this, str);
            }
            Iterator<String> it = ServiceContainer.getProjectService().getLibraryMapping().keySet().iterator();
            while (it.hasNext()) {
                if (FileSystem.nw(it.next(), str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4305316627950856272L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1445655973498977832L)
    public void buildProject(boolean z) {
        try {
            if (j6) {
                iy.Ws(-4335577749690766291L, this, z);
            }
            if (!ServiceContainer.getOpenFileService().cb(false, false)) {
                ServiceContainer.getLicenseService().ro(ServiceContainer.gn(), u.shop_feature_premium_projects, "large_project", false, false);
            } else {
                ServiceContainer.DW().gn(BuildServiceCollect.htmlCodeBuildService);
                BuildServiceCollect.htmlCodeBuildService.EQ();
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4335577749690766291L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 97992698363147016L)
    public void cn(List<String> list, boolean z) {
        try {
            if (j6) {
                iy.EQ(3711825791466853591L, this, list, new Boolean(z));
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 3711825791466853591L, this, list, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1284946372736921440L)
    public void ei(String str) {
        try {
            if (j6) {
                iy.tp(-1933723365591943875L, this, str);
            }
            if ((ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.web")) && ne.v5(str)) {
                if (ServiceContainer.getOpenFileService().cb(false, false)) {
                    WebDesignActivity.QX(ServiceContainer.getMainActivity(), ServiceContainer.getProjectService().getCurrentAppHome(), str, 0);
                } else {
                    ServiceContainer.getLicenseService().ro(ServiceContainer.gn(), u.shop_feature_premium_projects, "large_project", false, false);
                }
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1933723365591943875L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -507067494783596955L)
    public boolean gW() {
        try {
            if (!j6) {
                return false;
            }
            iy.gn(-489166033542780704L, this);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -489166033542780704L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -4594420902342139392L)
    public int getOpenProjectNameStringId(String str) {
        try {
            if (!j6) {
                return u.command_files_open_website_project;
            }
            iy.tp(-3775094380259362875L, this, str);
            return u.command_files_open_website_project;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3775094380259362875L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 621648383354896909L)
    public List<String> getProductFlavors(String str) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(-2272268367815859360L, this, str);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2272268367815859360L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 1750933562336494524L)
    public String getProjectAttributeHtmlString() {
        try {
            if (j6) {
                iy.gn(-684651542975602005L, this);
            }
            return "<b>Website Home:</b><br/><br/>" + ServiceContainer.getProjectService().getCurrentAppHome();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -684651542975602005L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1140352670648605392L)
    public void gn() {
        try {
            if (j6) {
                iy.gn(796785873483815297L, this);
            }
            ServiceContainer.getMainActivity().sM(ServiceContainer.KD(u.dialog_community_rate_title, new Object[0]), ServiceContainer.KD(u.dialog_community_rate_website_message, new Object[0]), null);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 796785873483815297L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 1128019219086722600L)
    public boolean isPremium() {
        try {
            if (j6) {
                iy.gn(755331919395162717L, this);
            }
            if (ServiceContainer.ca() || ServiceContainer.getLicenseService().aM() || ServiceContainer.getLicenseService().Ws()) {
                return false;
            }
            return dx();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 755331919395162717L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 1044146153748753232L)
    public boolean isSupport(String str) {
        try {
            if (j6) {
                iy.tp(7477838952240194351L, this, str);
            }
            return ne.Zo(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 7477838952240194351L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -6433336068798782680L)
    public boolean j3(String str) {
        try {
            if (j6) {
                iy.tp(-2866360270093501007L, this, str);
            }
            if (!ServiceContainer.ca()) {
                if (!ServiceContainer.P8.equals("com.aide.web")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2866360270093501007L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 5224189979420867917L)
    public void j6() {
        try {
            if (j6) {
                iy.gn(8252061977026270704L, this);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 8252061977026270704L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 7745486978572621883L)
    public boolean lg() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(7069331448460352880L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 7069331448460352880L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 25699278099967792L)
    public EngineSolution makeEngineSolution() {
        try {
            if (j6) {
                iy.gn(-2271171037873208589L, this);
            }
            return oe.j6(ServiceContainer.getProjectService().getCurrentAppHome(), ServiceContainer.getAssetInstallationService().getJavaScriptAPIJsPath());
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2271171037873208589L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 3373042337018628825L)
    public void nw(String str) {
        try {
            if (j6) {
                iy.tp(3605540030673761832L, this, str);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3605540030673761832L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -2250344328325255512L)
    public int rN(String str) {
        try {
            if (!j6) {
                return -1;
            }
            iy.tp(-2788868882737559167L, this, str);
            return -1;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2788868882737559167L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 1209880491686672019L)
    public List<String> ro(String str) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(-448991948920224640L, this, str);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -448991948920224640L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 416533451605974080L)
    public String sh(String str) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(-6597779996533165L, this, str);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -6597779996533165L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1291028273817671200L)
    public String tp(String str) {
        try {
            if (j6) {
                iy.tp(-829835010550861L, this, str);
            }
            if (j3(str)) {
                return null;
            }
            return "com.aide.web";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -829835010550861L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -237603423083136344L)
    public boolean u7(String str) {
        try {
            if (j6) {
                iy.tp(-686843874331430613L, this, str);
            }
            if ((ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.web")) && ne.v5(str) && FileSystem.nw(ServiceContainer.getProjectService().getCurrentAppHome(), str)) {
                return !str.equals(ne.j6(ServiceContainer.getProjectService().getCurrentAppHome()));
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -686843874331430613L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 779505700525087648L)
    public String v5(String str) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(-2287187110544519781L, this, str);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2287187110544519781L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -3737263872682373040L)
    public boolean vy(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(3772907241883307385L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3772907241883307385L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 2738051667101052379L)
    public int we(String str) {
        try {
            if (!j6) {
                return 0;
            }
            iy.tp(-89763310959173120L, this, str);
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -89763310959173120L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 69395952085057752L)
    public String yS() {
        try {
            if (!j6) {
                return null;
            }
            iy.gn(1985034423437912385L, this);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1985034423437912385L, this);
            }
            throw th;
        }
    }
}
