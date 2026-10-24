package com.aide.ui.services;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.common.AppLog;
import com.aide.ui.AppPreferences;
import com.aide.ui.ServiceContainer;
import com.aide.ui.util.BuildGradle;
import com.aide.ui.util.FileSystem;
import com.aide.ui.util.MavenDependencyVersion;
import com.aide.ui.util.MavenMetadataXml;
import com.aide.ui.util.PomXml;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@cy(clazz = 81765335761816225L, container = 81765335761816225L, user = true)
/* loaded from: classes.dex */
public class MavenService {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -6792627744927873257L)
    private Map<String, BuildGradle.MavenDependency> dependencyMap;

    @dy(field = 2110153148064145584L)
    private Map<BuildGradle.MavenDependency, String> dependencyPathMap;

    @cy(clazz = -1020255049470345640L, container = 81765335761816225L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 4658198147752472505L)
        public a() {
        }

        @Override // java.lang.Runnable
        @ey(method = 2387352738165188657L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(5353851906303505080L, this);
                }
                try {
                    MavenService.this.dependencyPathMap.clear();
                    FileSystem.VH(MavenService.getDefaulRepositoriePath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 5353851906303505080L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1020359639988754299L, container = 81765335761816225L, user = true)
    class b implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -7165573953554533993L)
        public b(MavenService mavenService) {
        }

        @Override // java.lang.Runnable
        @ey(method = -1226564424398539105L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(5358102645708178863L, this);
                }
                ServiceContainer.getProjectService().reloadingProject();
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 5358102645708178863L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(MavenService.class);
    }

    @ey(method = 1417648752797390365L)
    public MavenService() {
        try {
            if (FH) {
                iy.gn(1919573803489456881L, null);
            }
            this.dependencyPathMap = new HashMap();
            this.dependencyMap = new HashMap();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1919573803489456881L, null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0149  */
    @abcd.ey(method = 402604094452195044L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String EQ(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.services.MavenService.EQ(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    @ey(method = 700805023949883311L)
    private BuildGradle.MavenDependency Hw(BuildGradle.MavenDependency mavenDependency) {
        try {
            if (FH) {
                iy.tp(1451429039697178800L, this, mavenDependency);
            }
            if (!this.dependencyMap.containsKey(mavenDependency.getGroupIdArtifactId())) {
                this.dependencyMap.put(mavenDependency.getGroupIdArtifactId(), mavenDependency);
            }
            return this.dependencyMap.get(mavenDependency.getGroupIdArtifactId());
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 1451429039697178800L, this, mavenDependency);
            }
            throw th;
        }
    }

    @ey(method = 2737373558550281183L)
    private boolean P8(String str, String str2) {
        try {
            if (FH) {
                iy.EQ(2540303925487190016L, this, str, str2);
            }
            if (!new File(str2).isDirectory()) {
                return false;
            }
            File[] fileArrListFiles = new File(str2).listFiles();
            if (fileArrListFiles == null) {
                return true;
            }
            long jLastModified = new File(str).lastModified();
            for (File file : fileArrListFiles) {
                if (file.isFile() && file.lastModified() < jLastModified) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 2540303925487190016L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -7703984022876050688L)
    private void QX(Map<String, String> map, String str, List<String> list, int i) {
        String strWe;
        try {
            if (FH) {
                iy.J0(4845131358560103537L, this, map, str, list, new Integer(i));
            }
            if (list.contains(str)) {
                return;
            }
            list.add(str);
            if (i > 0) {
                for (BuildGradle.MavenDependency mavenDependency : new PomXml().getConfiguration(gW(str)).Zo) {
                    if (!vy(mavenDependency) && (strWe = we(map, Hw(mavenDependency))) != null) {
                        QX(map, strWe, list, i - 1);
                    }
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 4845131358560103537L, this, map, str, list, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1368414381318599700L)
    private void VH(String str, String str2) {
        try {
            if (FH) {
                iy.EQ(59007320860540679L, this, str, str2);
            }
            if (P8(str, str2)) {
                return;
            }
            try {
                FileSystem.u7(new FileInputStream(str), str2, true);
                AppLog.DW("Extracted AAR " + str);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 59007320860540679L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 898800227208765531L)
    private List<String> Ws(Map<String, String> map, String str) {
        try {
            if (FH) {
                iy.EQ(551519948238882096L, this, map, str);
            }
            ArrayList arrayList = new ArrayList();
            if (str != null) {
                QX(map, str, arrayList, 3);
            }
            return arrayList;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 551519948238882096L, this, map, str);
            }
            throw th;
        }
    }

    @ey(method = 3778288329564524128L)
    private void Zo(BuildGradle.MavenDependency mavenDependency, int i) {
        try {
            if (FH) {
                iy.EQ(-1149247877005140615L, this, mavenDependency, new Integer(i));
            }
            String strWe = we(null, mavenDependency);
            if (strWe != null) {
                String strA8 = a8(strWe);
                if (!this.dependencyMap.containsKey(mavenDependency.getGroupIdArtifactId()) || MavenDependencyVersion.compareTo(strA8, this.dependencyMap.get(mavenDependency.getGroupIdArtifactId()).version) > 0) {
                    this.dependencyMap.put(mavenDependency.getGroupIdArtifactId(), new BuildGradle.MavenDependency(mavenDependency, strA8));
                }
                if (i > 0) {
                    for (BuildGradle.MavenDependency mavenDependency2 : new PomXml().getConfiguration(gW(strWe)).Zo) {
                        if (!vy(mavenDependency2)) {
                            Zo(mavenDependency2, i - 1);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -1149247877005140615L, this, mavenDependency, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1295558288185466300L)
    private static String a8(String str) {
        try {
            if (FH) {
                iy.tp(388993344652078035L, null, str);
            }
            return str.split("/")[r3.length - 2];
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 388993344652078035L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -2870112100034842880L)
    private String gW(String str) {
        try {
            if (FH) {
                iy.tp(2283614841323055303L, this, str);
            }
            if (str.endsWith(".exploded.aar")) {
                return str.substring(0, str.length() - 13) + ".pom";
            }
            return str.substring(0, str.length() - 4) + ".pom";
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 2283614841323055303L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2641483144727496520L)
    public static String getArtifactPath(BuildGradle.RemoteRepository remoteRepository, BuildGradle.MavenDependency mavenDependency, String str, String str2) {
        try {
            if (FH) {
                iy.J0(-338639984554943227L, null, remoteRepository, mavenDependency, str, str2);
            }
            return getDefaulRepositoriePath() + (("/" + mavenDependency.groupId.replace('.', '/') + "/" + mavenDependency.artifactId) + "/" + str + "/" + mavenDependency.artifactId + "-" + str) + str2;
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -338639984554943227L, null, remoteRepository, mavenDependency, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -1136275972824272175L)
    public static String getArtifactUrl(BuildGradle.RemoteRepository remoteRepository, BuildGradle.MavenDependency mavenDependency, String str, String str2) {
        try {
            if (FH) {
                iy.J0(6764316044284396800L, null, remoteRepository, mavenDependency, str, str2);
            }
            return remoteRepository.repositorieURL + (("/" + mavenDependency.groupId.replace('.', '/') + "/" + mavenDependency.artifactId) + "/" + str + "/" + mavenDependency.artifactId + "-" + str) + str2;
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 6764316044284396800L, null, remoteRepository, mavenDependency, str, str2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 39456194121478700L)
    public static String getDefaulRepositoriePath() {
        try {
            if (FH) {
                iy.gn(-232672621527975863L, null);
            }
            return FileSystem.yS() + "/.aide/maven";
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -232672621527975863L, null);
            }
            throw th;
        }
    }

    @ey(method = 7575944047079467941L)
    private String getMavenDependencyPath(BuildGradle.MavenDependency mavenDependency) {
        try {
            if (FH) {
                iy.tp(-267474788919651628L, this, mavenDependency);
            }
            Iterator<String> it = getRepositoriePaths().iterator();
            while (it.hasNext()) {
                String strEQ = EQ(it.next(), mavenDependency.groupId, mavenDependency.artifactId, mavenDependency.version);
                if (strEQ != null) {
                    return strEQ;
                }
            }
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -267474788919651628L, this, mavenDependency);
            }
            throw th;
        }
    }

    @ey(method = 655452044093559713L)
    public static String getMetadataPath(BuildGradle.RemoteRepository remoteRepository, BuildGradle.MavenDependency mavenDependency) {
        try {
            if (FH) {
                iy.EQ(1367533582825884320L, null, remoteRepository, mavenDependency);
            }
            return getDefaulRepositoriePath() + ("/" + mavenDependency.groupId.replace('.', '/') + "/" + mavenDependency.artifactId) + "/maven-metadata.xml";
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 1367533582825884320L, null, remoteRepository, mavenDependency);
            }
            throw th;
        }
    }

    @ey(method = 4982979270185954544L)
    public static String getMetadataUrl(BuildGradle.RemoteRepository remoteRepository, BuildGradle.MavenDependency mavenDependency) {
        try {
            if (FH) {
                iy.EQ(2572044967098615393L, null, remoteRepository, mavenDependency);
            }
            return remoteRepository.repositorieURL + ("/" + mavenDependency.groupId.replace('.', '/') + "/" + mavenDependency.artifactId) + "/maven-metadata.xml";
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 2572044967098615393L, null, remoteRepository, mavenDependency);
            }
            throw th;
        }
    }

    @ey(method = -974701426244437332L)
    private List<String> getRepositoriePaths() {
        try {
            if (FH) {
                iy.gn(-3389736200021075805L, this);
            }
            ArrayList arrayList = new ArrayList();
            for (String str : AppPreferences.br().split(";")) {
                if (!str.trim().isEmpty()) {
                    arrayList.add(str.trim());
                }
            }
            arrayList.add(getDefaulRepositoriePath());
            return arrayList;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -3389736200021075805L, this);
            }
            throw th;
        }
    }

    @ey(method = 605728114992526400L)
    private String gn(String str, String str2) {
        String version;
        try {
            if (FH) {
                iy.EQ(73255881322655027L, this, str, str2);
            }
            String str3 = str + "/maven-metadata.xml";
            if (FileSystem.isFileAndNotZip(str3) && (version = new MavenMetadataXml().getConfiguration(str3).getVersion(str2)) != null) {
                return version;
            }
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = FileSystem.we(str).iterator();
                while (it.hasNext()) {
                    arrayList.add(FileSystem.getName(it.next()));
                }
                return MavenMetadataXml.getVersion(arrayList, str2);
            } catch (IOException unused) {
                return null;
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 73255881322655027L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 2563023333843019125L)
    private String j3(String str, String str2, String str3, String str4) {
        try {
            if (FH) {
                iy.J0(-491971663660499440L, this, str, str2, str3, str4);
            }
            String str5 = str + "/" + str3 + ".aar";
            if (new File(str5).exists()) {
                return str5;
            }
            File[] fileArrListFiles = new File(str).listFiles();
            if (fileArrListFiles == null) {
                return null;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().startsWith(str3 + "-") && file.getName().endsWith(".aar") && MavenMetadataXml.matchVersion(file.getName().substring(str3.length() + 1, file.getName().length() - 4), str4)) {
                    return file.getPath();
                }
            }
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -491971663660499440L, this, str, str2, str3, str4);
            }
            throw th;
        }
    }

    @ey(method = -826308770993964637L)
    private boolean vy(BuildGradle.MavenDependency mavenDependency) {
        try {
            if (FH) {
                iy.tp(-2038947085002048L, this, mavenDependency);
            }
            return mavenDependency.artifactId.contains("android-all");
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -2038947085002048L, this, mavenDependency);
            }
            throw th;
        }
    }

    @ey(method = -14170022524454400L)
    private String we(Map<String, String> map, BuildGradle.MavenDependency mavenDependency) {
        try {
            if (FH) {
                iy.EQ(169085231225213385L, this, map, mavenDependency);
            }
            if (map != null) {
                for (String str : map.keySet()) {
                    String strJ3 = j3(str, mavenDependency.groupId, mavenDependency.artifactId, mavenDependency.version);
                    if (strJ3 != null) {
                        String str2 = map.get(str) + "/" + new File(strJ3).getName().substring(0, r0.length() - 4) + ".exploded.aar";
                        VH(strJ3, str2);
                        return str2;
                    }
                }
            }
            if (this.dependencyPathMap.containsKey(mavenDependency)) {
                String str3 = this.dependencyPathMap.get(mavenDependency);
                if (str3.length() == 0) {
                    return null;
                }
                return str3;
            }
            String mavenDependencyPath = getMavenDependencyPath(mavenDependency);
            if (mavenDependencyPath == null) {
                this.dependencyPathMap.put(mavenDependency, "");
            } else {
                this.dependencyPathMap.put(mavenDependency, mavenDependencyPath);
            }
            return mavenDependencyPath;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 169085231225213385L, this, map, mavenDependency);
            }
            throw th;
        }
    }

    @ey(method = 1451914021381852535L)
    private void yS(Map<String, String> map, BuildGradle.MavenDependency mavenDependency, List<BuildGradle.MavenDependency> list, int i) {
        try {
            if (FH) {
                iy.J0(-1846086220073315520L, this, map, mavenDependency, list, new Integer(i));
            }
            String strWe = we(map, Hw(mavenDependency));
            if (strWe == null) {
                list.add(mavenDependency);
                return;
            }
            if (i > 0) {
                for (BuildGradle.MavenDependency mavenDependency2 : new PomXml().getConfiguration(gW(strWe)).Zo) {
                    if (!vy(mavenDependency2)) {
                        yS(map, mavenDependency2, list, i - 1);
                    }
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -1846086220073315520L, this, map, mavenDependency, list, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 663356187124221064L)
    public List<String> J0(String str) {
        try {
            if (FH) {
                iy.tp(2134096384285423581L, this, str);
            }
            return Ws(null, str);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 2134096384285423581L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1982492142313882647L)
    public boolean existsLocalMavenCache(Map<String, String> map, BuildGradle.MavenDependency mavenDependency) {
        try {
            if (FH) {
                iy.EQ(-229095204801035904L, this, map, mavenDependency);
            }
            return we(map, Hw(mavenDependency)) != null;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -229095204801035904L, this, map, mavenDependency);
            }
            throw th;
        }
    }

    @ey(method = 1505824660383473920L)
    public List<BuildGradle.MavenDependency> getNotExistsLocalCache(Map<String, String> map, BuildGradle.MavenDependency mavenDependency) {
        try {
            if (FH) {
                iy.EQ(2385012762192692205L, this, map, mavenDependency);
            }
            ArrayList arrayList = new ArrayList();
            yS(map, mavenDependency, arrayList, 3);
            return arrayList;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 2385012762192692205L, this, map, mavenDependency);
            }
            throw th;
        }
    }

    @ey(method = 280290045404364925L)
    public void refresh() {
        try {
            if (FH) {
                iy.gn(-3109471472272327344L, this);
            }
            ServiceContainer.sy(ServiceContainer.gn(), "Refreshing...", new a(), new b(this));
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -3109471472272327344L, this);
            }
            throw th;
        }
    }

    @ey(method = -5227714371465910125L)
    public void resetDepMap() {
        try {
            if (FH) {
                iy.gn(-2648004054380559600L, this);
            }
            this.dependencyMap.clear();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -2648004054380559600L, this);
            }
            throw th;
        }
    }

    @ey(method = -3890525777402785428L)
    public void resetDepPathMap() {
        try {
            if (FH) {
                iy.gn(1725747935280993635L, this);
            }
            this.dependencyPathMap.clear();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1725747935280993635L, this);
            }
            throw th;
        }
    }

    @ey(method = -399869691578655480L)
    public List<String> resolveFullDependencyTree(Map<String, String> map, BuildGradle.MavenDependency mavenDependency) {
        try {
            if (FH) {
                iy.EQ(-194168109258797835L, this, map, mavenDependency);
            }
            return Ws(map, we(map, Hw(mavenDependency)));
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -194168109258797835L, this, map, mavenDependency);
            }
            throw th;
        }
    }

    @ey(method = 258767694222254967L)
    public void resolvingMavenDependency(BuildGradle.MavenDependency mavenDependency) {
        try {
            if (FH) {
                iy.tp(-2211329915009514828L, this, mavenDependency);
            }
            Zo(mavenDependency, 3);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -2211329915009514828L, this, mavenDependency);
            }
            throw th;
        }
    }

    @ey(method = 2547981229752373332L)
    public String u7(BuildGradle.MavenDependency mavenDependency) {
        try {
            if (FH) {
                iy.tp(103543202825634429L, this, mavenDependency);
            }
            return we(null, mavenDependency);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 103543202825634429L, this, mavenDependency);
            }
            throw th;
        }
    }
}
