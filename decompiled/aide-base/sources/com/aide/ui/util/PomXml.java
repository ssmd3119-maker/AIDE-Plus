package com.aide.ui.util;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.ui.util.BuildGradle;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@cy(clazz = -6630460382604010147L, container = -6630460382604010147L, user = true)
/* loaded from: classes.dex */
public class PomXml extends Configuration<PomXml> {

    @fy
    private static /* synthetic */ boolean VH;

    @gy
    private static /* synthetic */ boolean gn;

    @dy(field = 3750393011559180063L)
    public List<BuildGradle.MavenDependency> Zo;

    static {
        iy.Zo(PomXml.class);
    }

    @ey(method = 242712261078043043L)
    public PomXml() {
        try {
            if (VH) {
                iy.gn(2953518849715377032L, null);
            }
            this.Zo = new ArrayList();
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, 2953518849715377032L, null);
            }
            throw th;
        }
    }

    @ey(method = 2223456332975435205L)
    private String FH(Element element, String str) {
        try {
            if (VH) {
                iy.EQ(-3124335826768441140L, this, element, str);
            }
            Node nodeItem = element.getElementsByTagName(str).item(0);
            return nodeItem == null ? "" : nodeItem.getTextContent();
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, -3124335826768441140L, this, element, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.util.Configuration
    @ey(method = 20272089001895376L)
    /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
    public PomXml makeConfiguration(String str) {
        try {
            if (VH) {
                iy.tp(-6406485391767865503L, this, str);
            }
            return new PomXml(str);
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -6406485391767865503L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 314159931413403505L)
    private PomXml(String str) {
        try {
            if (VH) {
                iy.tp(-107719386562926000L, null, str);
            }
            this.Zo = new ArrayList();
            try {
                FileInputStream fileInputStream = new FileInputStream(str);
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fileInputStream);
                fileInputStream.close();
                NodeList elementsByTagName = document.getElementsByTagName("dependency");
                for (int i = 0; i < elementsByTagName.getLength(); i++) {
                    try {
                        Element element = (Element) elementsByTagName.item(i);
                        String strFH = FH(element, "groupId");
                        String strFH2 = FH(element, "artifactId");
                        String strFH3 = FH(element, "version");
                        String strFH4 = FH(element, "scope");
                        if (strFH.length() > 0 && strFH2.length() > 0 && !strFH.contains("$") && !strFH2.contains("$") && !"test".equals(strFH4) && !"provided".equals(strFH4) && !"system".equals(strFH4)) {
                            strFH3 = (strFH3.length() == 0 || strFH3.contains("$")) ? "+" : strFH3;
                            BuildGradle.MavenDependency mavenDependency = new BuildGradle.MavenDependency(1);
                            this.Zo.add(mavenDependency);
                            mavenDependency.groupId = strFH;
                            mavenDependency.artifactId = strFH2;
                            mavenDependency.version = strFH3;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -107719386562926000L, null, str);
            }
            throw th;
        }
    }
}
