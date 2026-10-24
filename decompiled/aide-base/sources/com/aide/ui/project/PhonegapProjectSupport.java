package com.aide.ui.project;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.le;
import com.aide.common.ValueRunnable;
import com.aide.engine.EngineSolution;
import com.aide.ui.ServiceContainer;
import com.aide.ui.htmluidesigner.PhonegapDesignActivity;
import com.aide.ui.services.ProjectSupport;
import com.aide.ui.services.TemplateService;
import com.aide.ui.trainer.c;
import com.aide.ui.u;
import com.aide.ui.util.FileSystem;
import com.aide.uidesigner.XmlLayoutDesignActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@cy(clazz = 6278583807911632520L, container = 6278583807911632520L, user = true)
/* loaded from: classes.dex */
public class PhonegapProjectSupport implements ProjectSupport {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(PhonegapProjectSupport.class);
    }

    @ey(method = 2869207375422900456L)
    public PhonegapProjectSupport() {
        try {
            if (j6) {
                iy.gn(137902972726981100L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 137902972726981100L, null);
            }
            throw th;
        }
    }

    @ey(method = 5746424337665410175L)
    private static boolean cb(String str) {
        try {
            if (j6) {
                iy.tp(5209632990406912896L, null, str);
            }
            if (FileSystem.exists(str + "/www")) {
                if (FileSystem.exists(str + "/.cordova")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 5209632990406912896L, null, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -6483942047554340583L)
    public boolean FH(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(3629048862892493320L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3629048862892493320L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 8025259568098753125L)
    public boolean Hw() {
        try {
            if (!j6) {
                return false;
            }
            iy.gn(-5831643404155416048L, this);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -5831643404155416048L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 82330571292707745L)
    public void J0(String str) {
        try {
            if (j6) {
                iy.tp(-7164807204466483360L, this, str);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -7164807204466483360L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 4726281455382869317L)
    public boolean J8() {
        try {
            if (!j6) {
                return false;
            }
            iy.gn(2676228434037406056L, this);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2676228434037406056L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 717626896386429828L)
    public void Mr() {
        try {
            if (j6) {
                iy.gn(479283654876108021L, this);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 479283654876108021L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -806496992635213811L)
    public void P8(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(2066109773119899200L, this, str, str2);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 2066109773119899200L, this, str, str2);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -2970658478372736245L)
    public void SI(String str, ValueRunnable<String> valueRunnable) {
        try {
            if (j6) {
                iy.EQ(635289971738385120L, this, str, valueRunnable);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 635289971738385120L, this, str, valueRunnable);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 1745381468492530923L)
    public void U2(String str, Map<String, List<String>> map, List<String> list) {
        try {
            if (j6) {
                iy.we(3791414898153510336L, this, str, map, list);
            }
            map.put(str, new ArrayList());
            list.add(str);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 3791414898153510336L, this, str, map, list);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -2890806862016693403L)
    public TemplateService.TemplateGroup[] VH() {
        try {
            if (!j6) {
                return null;
            }
            iy.gn(2615765033205145600L, this);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2615765033205145600L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 1137179672483714420L)
    public List<c.C0094c> XL() {
        try {
            if (!j6) {
                return null;
            }
            iy.gn(2505224707110381525L, this);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2505224707110381525L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 264327542650606212L)
    public boolean Zo(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(-6815324642545824489L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -6815324642545824489L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 794026897136131045L)
    public boolean a8(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(1339498028451651824L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1339498028451651824L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -4924081475112992847L)
    public boolean aM(String str) {
        try {
            if (j6) {
                iy.tp(1274153650165219980L, this, str);
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
                iy.j3(th, 1274153650165219980L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 543372054263067960L)
    public void buildProject(boolean z) {
        try {
            if (j6) {
                iy.Ws(-1953553705877620345L, this, z);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1953553705877620345L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 4021160530797369280L)
    public void cn(List<String> list, boolean z) {
        try {
            if (j6) {
                iy.EQ(5759658763136226813L, this, list, new Boolean(z));
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 5759658763136226813L, this, list, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -309897697795418880L)
    public void ei(String str) {
        try {
            if (j6) {
                iy.tp(576661785080655855L, this, str);
            }
            if ((ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.phonegap")) && str.toLowerCase().endsWith(".html")) {
                PhonegapDesignActivity.FH(ServiceContainer.getMainActivity(), FileSystem.Ws(str, "www"), str);
            } else if ((ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.ui")) && str.toLowerCase().endsWith(".xml")) {
                XmlLayoutDesignActivity.sG(ServiceContainer.getMainActivity(), ServiceContainer.U2(), str, !ServiceContainer.getLicenseService().Mr(), false);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 576661785080655855L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -499750110183404227L)
    public boolean gW() {
        try {
            if (!j6) {
                return false;
            }
            iy.gn(-328581186207334704L, this);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -328581186207334704L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -4381308723679174248L)
    public int getOpenProjectNameStringId(String str) {
        try {
            if (!j6) {
                return u.command_files_open_phonegap_project;
            }
            iy.tp(1618826157516539859L, this, str);
            return u.command_files_open_phonegap_project;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1618826157516539859L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -1303297684208990771L)
    public List<String> getProductFlavors(String str) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(936309991619585892L, this, str);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 936309991619585892L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 353385517224299296L)
    public String getProjectAttributeHtmlString() {
        try {
            if (j6) {
                iy.gn(-288030851533373039L, this);
            }
            return "<b>Phonegap 3 Project Home:</b><br/><br/>" + ServiceContainer.getProjectService().getCurrentAppHome();
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -288030851533373039L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 741814093528643200L)
    public void gn() {
        try {
            if (j6) {
                iy.gn(497096024930466327L, this);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 497096024930466327L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 701634751895392272L)
    public boolean isPremium() {
        try {
            if (!j6) {
                return false;
            }
            iy.gn(488608058230507347L, this);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 488608058230507347L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 7588920143991948960L)
    public boolean isSupport(String str) {
        try {
            if (j6) {
                iy.tp(-4125156091452051591L, this, str);
            }
            return cb(str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4125156091452051591L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -2847318484825476200L)
    public boolean j3(String str) {
        try {
            if (j6) {
                iy.tp(-1087136101276985441L, this, str);
            }
            if (!ServiceContainer.ca()) {
                if (!ServiceContainer.P8.equals("com.aide.phonegap")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1087136101276985441L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 16608773822938409L)
    public void j6() {
        try {
            if (j6) {
                iy.gn(-1913695732293162400L, this);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1913695732293162400L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 502068419942073999L)
    public boolean lg() {
        try {
            if (!j6) {
                return false;
            }
            iy.gn(2460258591798150096L, this);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2460258591798150096L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -6832956092067211832L)
    public EngineSolution makeEngineSolution() {
        try {
            if (j6) {
                iy.gn(-2650949043609565179L, this);
            }
            return le.j6(ServiceContainer.getProjectService().getCurrentAppHome(), ServiceContainer.getAssetInstallationService().getJavaScriptAPIJsPath());
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2650949043609565179L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 2913453269580366425L)
    public void nw(String str) {
        try {
            if (j6) {
                iy.tp(-659511791645162624L, this, str);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -659511791645162624L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 748918054801953792L)
    public int rN(String str) {
        try {
            if (!j6) {
                return -1;
            }
            iy.tp(2219087622165063915L, this, str);
            return -1;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2219087622165063915L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 2629377269161193579L)
    public List<String> ro(String str) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(1108994348180996688L, this, str);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1108994348180996688L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 6819104061624084L)
    public String sh(String str) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(396130903327706157L, this, str);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 396130903327706157L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 1933393471173820152L)
    public String tp(String str) {
        try {
            if (j6) {
                iy.tp(-2082901003700079883L, this, str);
            }
            if (j3(str)) {
                return null;
            }
            return "com.aide.phonegap";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2082901003700079883L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -3587456949710673200L)
    public boolean u7(String str) {
        try {
            if (j6) {
                iy.tp(5465574077662338165L, this, str);
            }
            return ((ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.phonegap")) && str.toLowerCase().endsWith(".html")) ? FileSystem.Ws(str, "www") != null : (ServiceContainer.ca() || ServiceContainer.P8.equals("com.aide.ui")) && str.toLowerCase().endsWith(".xml") && FileSystem.getName(FileSystem.getParent(str)).startsWith("layout") && FileSystem.Ws(str, "res") != null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 5465574077662338165L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 5554234981817868040L)
    public String v5(String str) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(1227659381303459181L, this, str);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1227659381303459181L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -2579915410700970096L)
    public boolean vy(String str) {
        try {
            if (!j6) {
                return false;
            }
            iy.tp(-1525037520331382369L, this, str);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1525037520331382369L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = 3412635430817670495L)
    public int we(String str) {
        try {
            if (!j6) {
                return 0;
            }
            iy.tp(-450712604494893352L, this, str);
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -450712604494893352L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ProjectSupport
    @ey(method = -8872294300601122448L)
    public String yS() {
        try {
            if (!j6) {
                return null;
            }
            iy.gn(-603249438593227141L, this);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -603249438593227141L, this);
            }
            throw th;
        }
    }
}
