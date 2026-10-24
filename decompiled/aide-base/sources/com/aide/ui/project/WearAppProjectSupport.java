package com.aide.ui.project;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.s8;
import abcd.x8;
import com.aide.common.AppLog;
import com.aide.common.NonOverwritingFileOutputStream;
import com.aide.ui.util.BuildGradle;
import com.aide.ui.util.Configuration;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.OutputStreamWriter;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@cy(clazz = -2815793386376988455L, container = -2815793386376988455L, user = true)
/* loaded from: classes.dex */
public class WearAppProjectSupport extends Configuration<WearAppProjectSupport> {

    @fy
    private static /* synthetic */ boolean VH;

    @gy
    private static /* synthetic */ boolean gn;

    @dy(field = -2126800007415439875L)
    private Document Zo;

    static {
        iy.Zo(WearAppProjectSupport.class);
    }

    @ey(method = -385020068839983183L)
    private WearAppProjectSupport(String str) {
        try {
            if (VH) {
                iy.tp(5521701210344206440L, null, str);
            }
            FileInputStream fileInputStream = new FileInputStream(str);
            this.Zo = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fileInputStream);
            fileInputStream.close();
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, 5521701210344206440L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -4663087545807526779L)
    private static String EQ(Document document) {
        try {
            if (VH) {
                iy.tp(503750616989038236L, null, document);
            }
            return tp(document, "//manifest", "android:versionCode");
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, 503750616989038236L, null, document);
            }
            throw th;
        }
    }

    @ey(method = -1871071930795361304L)
    private static Element FH(Document document, String str) {
        try {
            if (VH) {
                iy.EQ(6284882517312905037L, null, document, str);
            }
            return Hw(document, str, false);
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, 6284882517312905037L, null, document, str);
            }
            throw th;
        }
    }

    @ey(method = 61102968115873593L)
    private static Element Hw(Document document, String str, boolean z) {
        try {
            if (VH) {
                iy.we(879104431048732992L, null, document, str, new Boolean(z));
            }
            String[] strArrSplit = str.split("/");
            Node nodeInsertBefore = document;
            for (int i = 0; i < strArrSplit.length; i++) {
                NodeList childNodes = nodeInsertBefore.getChildNodes();
                Element element = null;
                int i2 = 0;
                while (true) {
                    if (i2 < childNodes.getLength()) {
                        Node nodeItem = childNodes.item(i2);
                        if (nodeItem instanceof Element) {
                            if (element == null) {
                                element = (Element) nodeItem;
                            }
                            if ((!z || i < strArrSplit.length - 1) && strArrSplit[i].equals(((Element) nodeItem).getNodeName())) {
                                nodeInsertBefore = nodeItem;
                                break;
                            }
                        }
                        i2++;
                    } else {
                        nodeInsertBefore = element != null ? nodeInsertBefore.insertBefore(document.createElement(strArrSplit[i]), element) : nodeInsertBefore.appendChild(document.createElement(strArrSplit[i]));
                    }
                }
            }
            return (Element) nodeInsertBefore;
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, 879104431048732992L, null, document, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 82464851072977065L)
    public static boolean J0(String str, String str2, BuildGradle buildGradle, String str3, String str4) {
        try {
            if (VH) {
                iy.J8(-2561426981364255180L, null, str, str2, buildGradle, str3, str4);
            }
            try {
                Document document = new WearAppProjectSupport(str).Zo;
                if (buildGradle != null) {
                    QX(document, buildGradle, str4);
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new s8().DW(document, byteArrayOutputStream);
                String strReplace = byteArrayOutputStream.toString().replace("${applicationId}", str3).replace("${packageName}", str3);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new NonOverwritingFileOutputStream(str2));
                outputStreamWriter.write(strReplace);
                outputStreamWriter.close();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        } catch (Throwable th) {
            if (gn) {
                iy.lg(th, -2561426981364255180L, null, str, str2, buildGradle, str3, str4);
            }
            throw th;
        }
    }

    @ey(method = -524565690821432919L)
    private static void QX(Document document, BuildGradle buildGradle, String str) {
        try {
            if (VH) {
                iy.we(-2608839633582255424L, null, document, buildGradle, str);
            }
            if (buildGradle == null) {
                return;
            }
            Element elementFH = FH(document, "manifest");
            Ws(elementFH, "package", buildGradle.getFlavorApplicationId(str));
            Ws(elementFH, "android:versionCode", buildGradle.getVersionCode(str));
            Ws(elementFH, "android:versionName", buildGradle.getVersionName(str));
            if (buildGradle.wearAppProject != null) {
                Element elementHw = Hw(document, "manifest/application/meta-data", true);
                elementHw.setAttribute("android:name", "com.google.android.wearable.beta.app");
                elementHw.setAttribute("android:resource", "@xml/wearable_app_desc");
            }
            Element elementFH2 = FH(document, "manifest/uses-sdk");
            if (buildGradle.getMinSdkVersion(str) != null) {
                Ws(elementFH2, "android:minSdkVersion", buildGradle.getMinSdkVersion(str));
            } else if (!elementFH2.hasAttribute("android:minSdkVersion")) {
                Ws(elementFH2, "android:minSdkVersion", "1");
            }
            if (buildGradle.getTargetSdkVersion(str) != null) {
                Ws(elementFH2, "android:targetSdkVersion", buildGradle.getTargetSdkVersion(str));
            } else {
                if (elementFH2.hasAttribute("android:targetSdkVersion")) {
                    return;
                }
                Ws(elementFH2, "android:targetSdkVersion", "1");
            }
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -2608839633582255424L, null, document, buildGradle, str);
            }
            throw th;
        }
    }

    @ey(method = -807878901677309700L)
    private static int VH(Document document) {
        try {
            if (VH) {
                iy.tp(4154319099555820453L, null, document);
            }
            String strTp = tp(document, "//manifest//uses-sdk", "android:minSdkVersion");
            if (strTp != null) {
                return Integer.parseInt(strTp);
            }
            return 1;
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, 4154319099555820453L, null, document);
            }
            throw th;
        }
    }

    @ey(method = -202273822028747700L)
    private static void Ws(Element element, String str, String str2) {
        try {
            if (VH) {
                iy.we(538063144561914125L, null, element, str, str2);
            }
            if (str2 != null) {
                element.setAttribute(str, str2);
            }
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, 538063144561914125L, null, element, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -211164051204086840L)
    public static int Zo(String str, BuildGradle buildGradle, String str2) {
        try {
            if (VH) {
                iy.we(564819199620203955L, null, str, buildGradle, str2);
            }
            try {
                Document document = new WearAppProjectSupport(str).Zo;
                QX(document, buildGradle, str2);
                return VH(document);
            } catch (Exception e) {
                AppLog.v5(e);
                return 1;
            }
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, 564819199620203955L, null, str, buildGradle, str2);
            }
            throw th;
        }
    }

    @ey(method = 4233969448306600260L)
    public static String gn(String str, BuildGradle buildGradle, String str2) {
        try {
            if (VH) {
                iy.we(194082609827507961L, null, str, buildGradle, str2);
            }
            try {
                Document document = new WearAppProjectSupport(str).Zo;
                QX(document, buildGradle, str2);
                return u7(document);
            } catch (Exception e) {
                AppLog.v5(e);
                return "";
            }
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, 194082609827507961L, null, str, buildGradle, str2);
            }
            throw th;
        }
    }

    @ey(method = 2944261911400176249L)
    private static String tp(Document document, String str, String str2) {
        try {
            if (VH) {
                iy.we(1009877255924415764L, null, document, str, str2);
            }
            NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().compile(str).evaluate(document, XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node namedItem = nodeList.item(i).getAttributes().getNamedItem(str2);
                if (namedItem != null) {
                    return namedItem.getNodeValue();
                }
            }
            return null;
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, 1009877255924415764L, null, document, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -1702368748016177800L)
    private static String u7(Document document) {
        try {
            if (VH) {
                iy.tp(931555295004661227L, null, document);
            }
            return tp(document, "//manifest", "package");
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, 931555295004661227L, null, document);
            }
            throw th;
        }
    }

    @ey(method = 15804460443080295L)
    public static boolean v5(String str, String str2, BuildGradle buildGradle, String str3) {
        try {
            if (VH) {
                iy.J0(730816239211625952L, null, str, str2, buildGradle, str3);
            }
            try {
                Document document = new WearAppProjectSupport(str).Zo;
                QX(document, buildGradle, str3);
                return x8.j6(str2, u7(document), EQ(document), we(document));
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        } catch (Throwable th) {
            if (gn) {
                iy.a8(th, 730816239211625952L, null, str, str2, buildGradle, str3);
            }
            throw th;
        }
    }

    @ey(method = 410725858287807357L)
    private static String we(Document document) {
        try {
            if (VH) {
                iy.tp(-4403766830729620544L, null, document);
            }
            return tp(document, "//manifest", "android:versionName");
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -4403766830729620544L, null, document);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.util.Configuration
    @ey(method = -174505432177597608L)
    /* renamed from: J8, reason: merged with bridge method [inline-methods] */
    public WearAppProjectSupport makeConfiguration(String str) {
        try {
            if (VH) {
                iy.tp(-27495034731372117L, this, str);
            }
            return new WearAppProjectSupport(str);
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -27495034731372117L, this, str);
            }
            throw th;
        }
    }
}
