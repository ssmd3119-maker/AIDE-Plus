package com.aide.ui.util;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

@cy(clazz = 489031357727148317L, container = 489031357727148317L, user = true)
/* loaded from: classes.dex */
public class MavenMetadataXml extends Configuration<MavenMetadataXml> {

    @fy
    private static /* synthetic */ boolean VH;

    @gy
    private static /* synthetic */ boolean gn;

    @dy(field = 349296322229968113L)
    public List<String> Zo;

    @cy(clazz = 101096709074197056L, container = 489031357727148317L, user = true)
    static class a implements Comparator<String> {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -1197629474941929663L)
        public a() {
        }

        @Override // java.util.Comparator
        @ey(method = 41629455449787292L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            try {
                if (WB) {
                    iy.EQ(-2373862820587215395L, this, str, str2);
                }
                return MavenDependencyVersion.compareTo(str, str2);
            } catch (Throwable th) {
                if (mb) {
                    iy.Mr(th, -2373862820587215395L, this, str, str2);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(MavenMetadataXml.class);
    }

    @ey(method = 2775702357310571759L)
    public MavenMetadataXml() {
        try {
            if (VH) {
                iy.gn(-464797732478146200L, null);
            }
            this.Zo = new ArrayList();
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, -464797732478146200L, null);
            }
            throw th;
        }
    }

    @ey(method = 2996952217286190801L)
    public static String getVersion(ArrayList<String> arrayList, String str) {
        try {
            if (VH) {
                iy.EQ(759678053507465216L, null, arrayList, str);
            }
            Collections.sort(arrayList, new a());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (matchVersion(arrayList.get(size), str)) {
                    return arrayList.get(size);
                }
            }
            return null;
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, 759678053507465216L, null, arrayList, str);
            }
            throw th;
        }
    }

    @ey(method = -706584782654568480L)
    public static boolean matchVersion(String str, String str2) {
        try {
            if (VH) {
                iy.EQ(-277436131022243353L, null, str, str2);
            }
            if (str2 == null || str2.equals(str)) {
                return true;
            }
            if (str2.contains("+")) {
                return str.startsWith(str2.substring(0, str2.indexOf(43)));
            }
            return false;
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, -277436131022243353L, null, str, str2);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.util.Configuration
    @ey(method = -478014834558299088L)
    /* renamed from: Zo, reason: merged with bridge method [inline-methods] */
    public MavenMetadataXml makeConfiguration(String str) {
        try {
            if (VH) {
                iy.tp(-4761912503646473679L, this, str);
            }
            return new MavenMetadataXml(str);
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -4761912503646473679L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 69789630498985085L)
    public String getVersion(String str) {
        try {
            if (VH) {
                iy.tp(-7741182119685418320L, this, str);
            }
            if (!str.contains(",")) {
                if (str.startsWith("[") && str.endsWith("]")) {
                    str = str.substring(1, str.length() - 1);
                }
                for (int size = this.Zo.size() - 1; size >= 0; size--) {
                    if (matchVersion(this.Zo.get(size), str)) {
                        return this.Zo.get(size);
                    }
                }
                return null;
            }
            String strSubstring = str.substring(1, str.indexOf(44));
            String strSubstring2 = str.substring(str.indexOf(44) + 1, str.length() - 1);
            int i = 0;
            boolean z = str.charAt(0) == '[';
            boolean z2 = str.charAt(str.length() - 1) == ']';
            int size2 = this.Zo.size() - 1;
            if (strSubstring2.length() > 0) {
                while (true) {
                    if (size2 < 0) {
                        break;
                    }
                    if (!matchVersion(this.Zo.get(size2), strSubstring2)) {
                        size2--;
                    } else if (!z2) {
                        size2--;
                    }
                }
            }
            if (strSubstring.length() > 0) {
                while (true) {
                    if (i >= this.Zo.size()) {
                        break;
                    }
                    if (!matchVersion(this.Zo.get(i), strSubstring)) {
                        i++;
                    } else if (!z) {
                        i++;
                    }
                }
            }
            if (size2 >= i && i < this.Zo.size()) {
                return this.Zo.get(size2);
            }
            if (i < this.Zo.size()) {
                return this.Zo.get(i);
            }
            return null;
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -7741182119685418320L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -151583346288489735L)
    private MavenMetadataXml(String str) {
        try {
            if (VH) {
                iy.tp(-3409270691436529372L, null, str);
            }
            this.Zo = new ArrayList();
            try {
                FileInputStream fileInputStream = new FileInputStream(str);
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fileInputStream);
                fileInputStream.close();
                NodeList elementsByTagName = document.getElementsByTagName("versions");
                Element element = (Element) elementsByTagName.item(0);
                if (element != null) {
                    NodeList elementsByTagName2 = element.getElementsByTagName("version");
                    for (int i = 0; i < elementsByTagName2.getLength(); i++) {
                        this.Zo.add(((Element) elementsByTagName2.item(i)).getTextContent());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -3409270691436529372L, null, str);
            }
            throw th;
        }
    }
}
