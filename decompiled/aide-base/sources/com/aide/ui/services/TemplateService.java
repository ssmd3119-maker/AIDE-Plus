package com.aide.ui.services;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.common.AppLog;
import com.aide.common.StreamUtilities;
import com.aide.ui.ServiceContainer;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.util.FileSystem;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@cy(clazz = -510280536001576560L, container = -510280536001576560L, user = true)
/* loaded from: classes.dex */
public class TemplateService {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -52437224023328959L, container = -52437224023328959L, user = true)
    public static class Template {

        @fy
        private static /* synthetic */ boolean EQ;

        @dy(field = -1174830456935628357L)
        public String DW;

        @dy(field = 3291178940750407716L)
        public String FH;

        @dy(field = -212507809718668740L)
        public String Hw;

        @dy(field = 1117503905179931820L)
        public String VH;

        @dy(field = -1899394781780655243L)
        public boolean Zo;

        @dy(field = 3300220102819749435L)
        public boolean gn;

        @dy(field = 3633551064464257280L)
        public String j6;

        @dy(field = -876360434547176796L)
        public String tp;

        @dy(field = -2799021359680517168L)
        public int u7;

        @dy(field = 3078332151133838845L)
        public boolean v5;

        static {
            iy.Zo(Template.class);
        }

        @ey(method = 686754695557092007L)
        public Template(ProjectSupport projectSupport, int i, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, boolean z3) {
            if (EQ) {
                iy.QX(530564291834568140L, null, new Object[]{projectSupport, new Integer(i), str, str2, str3, new Boolean(z), new Boolean(z2), str4, str5, str6, new Boolean(z3)});
            }
            this.Hw = str3;
            this.FH = str;
            this.j6 = str2;
            this.DW = str4;
            this.v5 = z;
            this.Zo = z2;
            this.VH = str5;
            this.gn = z3;
            this.u7 = i;
            this.tp = str6;
        }
    }

    @cy(clazz = -6653661092914885695L, container = -6653661092914885695L, user = true)
    public static class TemplateGroup {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = 692923157978710704L)
        public String DW;

        @dy(field = -3204904514242408568L)
        public String[] FH;

        @dy(field = -1172299038740459676L)
        public String Hw;

        @dy(field = 1826942971861326605L)
        public Template Zo;

        @dy(field = -27546415510208925L)
        public String j6;

        @dy(field = 1803402315638224928L)
        public int v5;

        static {
            iy.Zo(TemplateGroup.class);
        }

        @ey(method = 78753480580955016L)
        public TemplateGroup(String str, Template template, int i, String str2, String[] strArr, String str3) {
            try {
                if (VH) {
                    iy.QX(4102622381281402985L, null, new Object[]{str, template, new Integer(i), str2, strArr, str3});
                }
                this.j6 = str;
                this.v5 = i;
                this.DW = str2;
                this.FH = strArr;
                this.Zo = template;
                this.Hw = str3;
            } catch (Throwable th) {
                if (gn) {
                    iy.rN(th, 4102622381281402985L, null, new Object[]{str, template, new Integer(i), str2, strArr, str3});
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4040612867491146039L, container = -510280536001576560L, user = true)
    class a implements Comparator<TemplateGroup> {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -673084503075870300L)
        public a(TemplateService templateService) {
        }

        @Override // java.util.Comparator
        @ey(method = -92436774594053925L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(TemplateGroup templateGroup, TemplateGroup templateGroup2) {
            try {
                if (WB) {
                    iy.EQ(-2419461140002384611L, this, templateGroup, templateGroup2);
                }
                return templateGroup.Zo.u7 - templateGroup2.Zo.u7;
            } catch (Throwable th) {
                if (mb) {
                    iy.Mr(th, -2419461140002384611L, this, templateGroup, templateGroup2);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4040728634786110904L, container = -510280536001576560L, user = true)
    class b implements Comparator<TemplateGroup> {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -929513721259949155L)
        public b(TemplateService templateService) {
        }

        @Override // java.util.Comparator
        @ey(method = 778114950652043056L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(TemplateGroup templateGroup, TemplateGroup templateGroup2) {
            try {
                if (WB) {
                    iy.EQ(5108201626007046819L, this, templateGroup, templateGroup2);
                }
                return templateGroup.Zo.u7 - templateGroup2.Zo.u7;
            } catch (Throwable th) {
                if (mb) {
                    iy.Mr(th, 5108201626007046819L, this, templateGroup, templateGroup2);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(TemplateService.class);
    }

    @ey(method = 2461854716070055712L)
    public TemplateService() {
        try {
            if (j6) {
                iy.gn(-5827190512860628025L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -5827190512860628025L, null);
            }
            throw th;
        }
    }

    @ey(method = 1732506954455036683L)
    private Map<String, String> FH(InputStream inputStream, boolean z, String str, String str2, String str3, String str4, String str5, String[] strArr) {
        String str6 = str5;
        try {
            if (j6) {
                iy.QX(-578687135325702144L, this, new Object[]{inputStream, new Boolean(z), str, str2, str3, str4, str6, strArr});
            }
            HashMap map = new HashMap();
            ZipInputStream zipInputStream = new ZipInputStream(inputStream);
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    return map;
                }
                String strReplace = nextEntry.getName().replace("$package_name$", str3.replace('.', File.separatorChar)).replace("$project_name$", str2).replace("$flavor_name$", str6);
                String str7 = str + File.separator + strReplace;
                AppLog.DW("Extract " + strReplace + " to " + str7);
                try {
                    if (nextEntry.isDirectory()) {
                        new File(str7).mkdirs();
                    } else {
                        int length = strArr.length;
                        int i = 0;
                        while (i < length) {
                            String str8 = strArr[i];
                            StringBuilder sb = new StringBuilder();
                            int i2 = length;
                            sb.append("/");
                            sb.append(str8);
                            if (str7.endsWith(sb.toString())) {
                                map.put(str8, str7);
                            }
                            i++;
                            length = i2;
                        }
                        if (z || !new File(str7).isFile()) {
                            new File(str7).getParentFile().mkdirs();
                            String lowerCase = str7.toLowerCase(Locale.ENGLISH);
                            if (lowerCase.endsWith("build.gradle") || lowerCase.endsWith(".java") || lowerCase.endsWith(".xml") || lowerCase.endsWith(".c") || lowerCase.endsWith(".cpp") || lowerCase.endsWith(".cc") || lowerCase.endsWith(".h") || lowerCase.endsWith(".hpp") || lowerCase.endsWith(".html") || lowerCase.endsWith(".htm") || lowerCase.endsWith(".css") || lowerCase.endsWith(".js")) {
                                String strReplace2 = StreamUtilities.FH(new BufferedReader(new InputStreamReader(zipInputStream))).replace("\r\n", "\n").replace("$project_name$", str2).replace("$package_name$", str3).replace("$package_name_jni$", str4);
                                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(str7));
                                outputStreamWriter.write(strReplace2);
                                outputStreamWriter.close();
                            } else {
                                FileOutputStream fileOutputStream = new FileOutputStream(str7);
                                StreamUtilities.VH(zipInputStream, fileOutputStream, false);
                                fileOutputStream.close();
                            }
                        }
                    }
                } catch (IOException e) {
                    AppLog.v5(e);
                }
                str6 = str5;
            }
        } catch (Throwable th) {
            if (DW) {
                iy.rN(th, -578687135325702144L, this, new Object[]{inputStream, new Boolean(z), str, str2, str3, str4, str5, strArr});
            }
            throw th;
        }
    }

    @ey(method = -2582706854299532349L)
    public Map<String, String> DW(InputStream inputStream, String str, String str2, String str3, List<String> list) {
        try {
            if (j6) {
                iy.J8(-106947585237952096L, this, inputStream, str, str2, str3, list);
            }
            return FH(inputStream, false, str, str2, str3, str3, "", (String[]) list.toArray(new String[list.size()]));
        } catch (Throwable th) {
            if (DW) {
                iy.lg(th, -106947585237952096L, this, inputStream, str, str2, str3, list);
            }
            throw th;
        }
    }

    @ey(method = 2144074744565429480L)
    public String EQ(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(1108071910755106619L, this, str, str2);
            }
            if (u7(str, str2)) {
                return str2;
            }
            int i = 2;
            while (true) {
                if (u7(str, str2 + i)) {
                    return str2 + i;
                }
                i++;
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1108071910755106619L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -375352726969300155L)
    public String Hw(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(-629786007677663856L, this, str, str2);
            }
            if (str2.length() == 0) {
                return str;
            }
            return str + File.separator + str2;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -629786007677663856L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 519398138911936724L)
    public boolean VH(String str) {
        try {
            if (j6) {
                iy.tp(-1131038541868682601L, this, str);
            }
            if (str != null && !FileSystem.sh(str)) {
                if (!ServiceContainer.getProjectService().vJ(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1131038541868682601L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 371279270693407797L)
    public List<TemplateGroup> Zo(String str) {
        try {
            if (j6) {
                iy.tp(199091487846819368L, this, str);
            }
            ArrayList arrayList = new ArrayList();
            for (ProjectSupport projectSupport : ServiceContainer.getProjectSupports()) {
                TemplateGroup[] templateGroupArrVH = projectSupport.VH();
                if (templateGroupArrVH != null) {
                    for (TemplateGroup templateGroup : templateGroupArrVH) {
                        if (str.equals(templateGroup.Zo.tp)) {
                            arrayList.add(templateGroup);
                        }
                    }
                }
            }
            Collections.sort(arrayList, new a(this));
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 199091487846819368L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1288246403195033535L)
    public boolean gn(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(-1096803074613189888L, this, str, str2);
            }
            if (str2.startsWith(".") || !str2.contains(".")) {
                return false;
            }
            for (int i = 0; i < str2.length(); i++) {
                char cCharAt = str2.charAt(i);
                if (cCharAt == '.') {
                    if (i == str2.length() - 1 || str2.charAt(i + 1) == '.') {
                        return false;
                    }
                } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
            }
            return str2.length() > 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -1096803074613189888L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 2751452134035541849L)
    public List<String> j6(String str, String str2, String str3, String str4, TemplateGroup templateGroup) throws Throwable {
        try {
            if (j6) {
                iy.J8(1908222987627071904L, this, str, str2, str3, str4, templateGroup);
            }
            FireBaseLogEvent.EQ("Create project " + templateGroup.Zo.VH, Collections.singletonMap("template", templateGroup.j6));
        } catch (Throwable th) {
            th = th;
        }
        try {
            String strReplace = str3.replace('.', '_');
            ArrayList arrayList = new ArrayList();
            try {
                String strHw = Hw(str, str2);
                new File(strHw).mkdirs();
                InputStream inputStreamOpen = ServiceContainer.getContext().getAssets().open("templates/" + templateGroup.DW);
                Map<String, String> mapFH = FH(inputStreamOpen, true, strHw, str2, str3, strReplace, str4, templateGroup.FH);
                inputStreamOpen.close();
                for (String str5 : templateGroup.FH) {
                    if (mapFH.containsKey(str5)) {
                        arrayList.add(mapFH.get(str5));
                    }
                }
                ServiceContainer.EQ().ef(strHw);
            } catch (IOException e) {
                AppLog.v5(e);
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            if (DW) {
                iy.lg(th, 1908222987627071904L, this, str, str2, str3, str4, templateGroup);
            }
            throw th;
        }
    }

    @ey(method = 464445851371818299L)
    public String tp(String str) {
        try {
            if (j6) {
                iy.tp(-6454515677494735800L, this, str);
            }
            return "com.mycompany." + str.toLowerCase();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -6454515677494735800L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1830044744582450832L)
    public boolean u7(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(884602314080812035L, this, str, str2);
            }
            if (str2.length() == 0) {
                return false;
            }
            for (int i = 0; i < str2.length(); i++) {
                if (!Character.isJavaIdentifierPart(str2.charAt(i))) {
                    return false;
                }
            }
            return !new File(Hw(str, str2)).exists();
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 884602314080812035L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -1453045626969171493L)
    public List<List<TemplateGroup>> v5() {
        try {
            if (j6) {
                iy.gn(-1376822099607405640L, this);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList<TemplateGroup> arrayList2 = new ArrayList();
            for (ProjectSupport projectSupport : ServiceContainer.getProjectSupports()) {
                TemplateGroup[] templateGroupArrVH = projectSupport.VH();
                if (templateGroupArrVH != null) {
                    for (TemplateGroup templateGroup : templateGroupArrVH) {
                        arrayList2.add(templateGroup);
                    }
                }
            }
            Collections.sort(arrayList2, new b(this));
            for (TemplateGroup templateGroup2 : arrayList2) {
                if (templateGroup2.Zo.gn) {
                    arrayList.add(templateGroup2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            String str = "";
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TemplateGroup templateGroup3 = (TemplateGroup) it.next();
                if (!str.equals(templateGroup3.Zo.FH)) {
                    arrayList3.add(new ArrayList());
                    str = templateGroup3.Zo.FH;
                }
                ((List) arrayList3.get(arrayList3.size() - 1)).add(templateGroup3);
            }
            return arrayList3;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1376822099607405640L, this);
            }
            throw th;
        }
    }
}
