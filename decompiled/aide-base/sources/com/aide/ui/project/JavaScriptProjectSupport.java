package com.aide.ui.project;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.he;
import abcd.iy;
import com.aide.common.ValueRunnable;
import com.aide.engine.EngineSolution;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.build.BuildServiceCollect;
import com.aide.ui.services.ProjectSupport;
import com.aide.ui.services.TemplateService;
import com.aide.ui.trainer.c;
import com.aide.ui.u;
import com.aide.ui.util.FileSystem;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@cy(clazz = 447389864026004736L, container = 447389864026004736L, user = true)
/* loaded from: classes.dex */
public class JavaScriptProjectSupport implements ProjectSupport {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(JavaScriptProjectSupport.class);
    }

    @ey(method = -2228413015023320664L)
    public JavaScriptProjectSupport() {
        try {
            if (j6) {
                iy.gn(102236237106424800L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 102236237106424800L, null);
            }
            throw th;
        }
    }

    @ey(method = 159714731373283467L)
    private int cb() {
        try {
            if (!j6) {
                return 2;
            }
            iy.gn(4650996406010701608L, this);
            return 2;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4650996406010701608L, this);
            }
            throw th;
        }
    }

    @ey(method = 1076468840638896332L)
    private boolean dx() {
        try {
            if (j6) {
                iy.gn(1440411746439981287L, this);
            }
            return FileSystem.J8(ServiceContainer.getProjectService().getCurrentAppHome(), cb(), ".js") >= cb();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1440411746439981287L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -4075222289988989095L)
    public boolean FH(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(-2792985056228039120L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2792985056228039120L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -510300669831045891L)
    public boolean Hw() {
        try {
            if (!j6) {
                return false;
            }
            iy.gn(-8027913873345801120L, this);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -8027913873345801120L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 514106574698286385L)
    public void J0(String str) {
        try {
            if (j6) {
                iy.tp(-3151292856727001600L, this, str);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3151292856727001600L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1455250783718275L)
    public boolean J8() {
        try {
            if (!j6) {
                return false;
            }
            iy.gn(4955134989302557248L, this);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4955134989302557248L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 847986451347220640L)
    public void Mr() {
        try {
            if (j6) {
                iy.gn(-123437089689393717L, this);
            }
            ServiceContainer.getLicenseService().ro(ServiceContainer.gn(), u.shop_feature_premium_projects, "large_project", false, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -123437089689393717L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -366158326439509131L)
    public void P8(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(511551681669460800L, this, str, str2);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 511551681669460800L, this, str, str2);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 5588861159619615635L)
    public void SI(String str, ValueRunnable<String> valueRunnable) {
        try {
            if (j6) {
                iy.EQ(-2398368620131717120L, this, str, valueRunnable);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -2398368620131717120L, this, str, valueRunnable);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -724945173600331985L)
    public void U2(String str, Map<String, List<String>> map, List<String> list) {
        try {
            if (j6) {
                iy.we(2844732754420658640L, this, str, map, list);
            }
            map.put(str, new ArrayList());
            list.add(str);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 2844732754420658640L, this, str, map, list);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 5413634853316511841L)
    public TemplateService.TemplateGroup[] VH() {
        try {
            if (j6) {
                iy.gn(-859070136591736160L, this);
            }
            return new TemplateService.TemplateGroup[]{new TemplateService.TemplateGroup("JavaScript Application", new TemplateService.Template(this, 7, "JavaScript Application", "JavaScript", "MyJavaScriptApplication", false, false, "com.aide.web", "JAVASCRIPT", "course_javascript", ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.web")), R$drawable.ic_launcher_javascript, "HelloJavaScript.zip", new String[]{"main.js"}, null)};
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -859070136591736160L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 3860866869014932800L)
    public List<c.C0094c> XL() {
        try {
            if (j6) {
                iy.gn(2055056887092488435L, this);
            }
            return Arrays.asList(new c.C0094c("course_javascript", 10, new String[]{"com.aide.web"}));
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2055056887092488435L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 1737464523244455552L)
    public boolean Zo(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(3338412337902631153L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3338412337902631153L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -3259882012212362127L)
    public boolean a8(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(995236688695290696L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 995236688695290696L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 16871980891036869L)
    public boolean aM(String str) {
        try {
            if (j6) {
                iy.tp(-354421836445301160L, this, str);
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
                iy.j3(th, -354421836445301160L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -6870266386466553624L)
    public void buildProject(boolean z) {
        try {
            if (j6) {
                iy.Ws(1716901561335734085L, this, z);
            }
            if (!ServiceContainer.getOpenFileService().cb(false, false)) {
                ServiceContainer.getLicenseService().ro(ServiceContainer.gn(), u.shop_feature_premium_projects, "large_project", false, false);
            } else {
                ServiceContainer.DW().gn(BuildServiceCollect.javaScriptBuildService);
                BuildServiceCollect.javaScriptBuildService.EQ();
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1716901561335734085L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -725931031142674344L)
    public void cn(List<String> list, boolean z) {
        try {
            if (j6) {
                iy.EQ(6393340265449575695L, this, list, new Boolean(z));
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 6393340265449575695L, this, list, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 2703040510552038720L)
    public void ei(String str) {
        try {
            if (j6) {
                iy.tp(2035379728654285013L, this, str);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2035379728654285013L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1346489047144804295L)
    public boolean gW() {
        try {
            if (!j6) {
                return false;
            }
            iy.gn(5723739993225000L, this);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 5723739993225000L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 521142034308096744L)
    public int getOpenProjectNameStringId(String str) {
        try {
            if (!j6) {
                return u.command_files_open_javascript_project;
            }
            iy.tp(-5373536548366419L, this, str);
            return u.command_files_open_javascript_project;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -5373536548366419L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 3070809776866613177L)
    public List<String> getProductFlavors(String str) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(-1574111991865477096L, this, str);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1574111991865477096L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 2352193250028299300L)
    public String getProjectAttributeHtmlString() {
        try {
            if (j6) {
                iy.gn(-1043814829329501509L, this);
            }
            return "<b>JavaScript Project Home:</b><br/><br/>" + ServiceContainer.getProjectService().getCurrentAppHome() + "<br/><br/>";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1043814829329501509L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 885631523481653544L)
    public void gn() {
        try {
            if (j6) {
                iy.gn(-121630271982405639L, this);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -121630271982405639L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 752765183072616000L)
    public boolean isPremium() {
        try {
            if (j6) {
                iy.gn(-188691367923908571L, this);
            }
            if (ServiceContainer.ca() || ServiceContainer.getLicenseService().aM()) {
                return false;
            }
            return dx();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -188691367923908571L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 346968668132789400L)
    public boolean isSupport(String str) {
        try {
            if (j6) {
                iy.tp(3017832787520201847L, this, str);
            }
            return new File(str, "main.js").exists();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3017832787520201847L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 5972323480849019440L)
    public boolean j3(String str) {
        try {
            if (j6) {
                iy.tp(4706621684993925225L, this, str);
            }
            if (!ServiceContainer.ca()) {
                if (!ServiceContainer.P8.equals("com.aide.web")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 4706621684993925225L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -80665685549776311L)
    public void j6() {
        try {
            if (j6) {
                iy.gn(567441621601638400L, this);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 567441621601638400L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -8111122857235078305L)
    public boolean lg() {
        try {
            if (!j6) {
                return true;
            }
            iy.gn(-3912474831746738688L, this);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3912474831746738688L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -144056798185442232L)
    public EngineSolution makeEngineSolution() {
        try {
            if (j6) {
                iy.gn(-4907974458667869525L, this);
            }
            return he.j6(ServiceContainer.getProjectService().getCurrentAppHome(), ServiceContainer.getAssetInstallationService().getJavaScriptAPIJsPath());
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4907974458667869525L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -2533513851316835395L)
    public void nw(String str) {
        try {
            if (j6) {
                iy.tp(-2080342531239390176L, this, str);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2080342531239390176L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 3428042664766980216L)
    public int rN(String str) {
        try {
            if (!j6) {
                return -1;
            }
            iy.tp(309804925743637545L, this, str);
            return -1;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 309804925743637545L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -2660550467996743297L)
    public List<String> ro(String str) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(2507088970707769560L, this, str);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2507088970707769560L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -879025808188674720L)
    public String sh(String str) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(-5950254268864298173L, this, str);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -5950254268864298173L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -3263875703826238440L)
    public String tp(String str) {
        try {
            if (j6) {
                iy.tp(-80348689042000533L, this, str);
            }
            if (j3(str)) {
                return null;
            }
            return "com.aide.web";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -80348689042000533L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 1332325879344211152L)
    public boolean u7(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(3507937950256133955L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3507937950256133955L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -6911663160548021384L)
    public String v5(String str) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(-4931446982173886797L, this, str);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4931446982173886797L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -116680091283080856L)
    public boolean vy(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(93599764102424593L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 93599764102424593L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 1438765468167544335L)
    public int we(String str) {
        try {
            if (!j6) {
                return 0;
            }
            iy.tp(2193065581458700208L, this, str);
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2193065581458700208L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -347452706649966456L)
    public String yS() {
        try {
            if (!j6) {
                return null;
            }
            iy.gn(-7429273739684799895L, this);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -7429273739684799895L, this);
            }
            throw th;
        }
    }
}
