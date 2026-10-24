package com.aide.ui.util;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.common.AppLog;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@cy(clazz = 5980416271982035L, container = 5980416271982035L, user = true)
/* loaded from: classes.dex */
public class ClassPath extends Configuration<ClassPath> {

    @fy
    private static /* synthetic */ boolean VH;

    @gy
    private static /* synthetic */ boolean gn;

    @dy(field = -57304249986737115L)
    public List<Entry> Zo;

    static {
        iy.Zo(ClassPath.class);
    }

    @ey(method = 1216958469098708784L)
    public ClassPath() {
        try {
            if (VH) {
                iy.gn(5288841975675453711L, null);
            }
            this.Zo = new ArrayList();
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, 5288841975675453711L, null);
            }
            throw th;
        }
    }

    @ey(method = 26628243131756863L)
    public static void Hw(String str, List<Entry> list) {
        try {
            if (VH) {
                iy.EQ(-1004877786870276783L, null, str, list);
            }
            try {
                Document documentNewDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
                Element elementCreateElement = documentNewDocument.createElement("classpath");
                documentNewDocument.appendChild(elementCreateElement);
                for (Entry entry : list) {
                    Element elementCreateElement2 = documentNewDocument.createElement("classpathentry");
                    if (entry.exported) {
                        elementCreateElement2.setAttribute("exported", "true");
                    }
                    elementCreateElement2.setAttribute("kind", entry.kind);
                    elementCreateElement2.setAttribute("path", entry.path);
                    elementCreateElement.appendChild(elementCreateElement2);
                }
                Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
                transformerNewTransformer.setOutputProperty("indent", "yes");
                transformerNewTransformer.transform(new DOMSource(documentNewDocument), new StreamResult(new FileOutputStream(str)));
            } catch (Exception e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, -1004877786870276783L, null, str, list);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.util.Configuration
    @ey(method = 575037052324698987L)
    /* renamed from: FH, reason: merged with bridge method [inline-methods] */
    public ClassPath makeConfiguration(String str) {
        try {
            if (VH) {
                iy.tp(-2077286795582915475L, this, str);
            }
            return new ClassPath(str);
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -2077286795582915475L, this, str);
            }
            throw th;
        }
    }

    @cy(clazz = -1065310913627962872L, container = -1065310913627962872L, user = true)
    public static class Entry {

        @fy
        private static /* synthetic */ boolean VH;

        @dy(field = -3688252433392154815L)
        public static Entry Zo;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = 3961653888932220640L)
        public static Entry v5;

        @dy(field = 1338479539455470681L)
        public boolean exported;

        @dy(field = 1490845166183913024L)
        public String kind;

        @dy(field = 619411144876630419L)
        public String name;

        @dy(field = 1497440244621947109L)
        public String path;

        static {
            try {
                iy.Zo(Entry.class);
                if (VH) {
                    iy.gn(-2176665228994266777L, null);
                }
                v5 = new Entry("con", "com.android.ide.eclipse.adt.ANDROID_FRAMEWORK", false);
                Zo = new Entry("con", "com.android.ide.eclipse.adt.LIBRARIES", false);
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -2176665228994266777L, null);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 2602967011412950392L)
        public Entry(String str, String str2, boolean z) {
            this(str, str2, z, false, false);
            try {
                if (VH) {
                    iy.we(-6247223109929446039L, null, str, str2, new Boolean(z));
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.U2(th, -6247223109929446039L, null, str, str2, new Boolean(z));
                }
                throw th;
            }
        }

        @ey(method = -2849717327544302600L)
        public String VH(String str) {
            try {
                if (VH) {
                    iy.tp(-2493407835925867112L, this, str);
                }
                return FileSystem.Qq(str, this.path);
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -2493407835925867112L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -489259790580508269L)
        public boolean isConKind() {
            try {
                if (VH) {
                    iy.gn(-1596350155689589989L, this);
                }
                if ("con".equals(this.kind)) {
                    if ("com.android.ide.eclipse.adt.ANDROID_FRAMEWORK".equals(this.path)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -1596350155689589989L, this);
                }
                throw th;
            }
        }

        @ey(method = 2041337186896157920L)
        public boolean isLibKind() {
            try {
                if (VH) {
                    iy.gn(1639909837772239520L, this);
                }
                return this.kind.equals("lib");
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 1639909837772239520L, this);
                }
                throw th;
            }
        }

        @ey(method = -1459928472274617864L)
        public boolean isOutputIKind() {
            try {
                if (VH) {
                    iy.gn(-1491417707468027112L, this);
                }
                return this.kind.equals("output");
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -1491417707468027112L, this);
                }
                throw th;
            }
        }

        @ey(method = 2045422626872899085L)
        public boolean isSrcKind() {
            try {
                if (VH) {
                    iy.gn(1643440063969047445L, this);
                }
                if (this.kind.equals("src")) {
                    if (!v5()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 1643440063969047445L, this);
                }
                throw th;
            }
        }

        @ey(method = 1113746021406760976L)
        public String j6() {
            try {
                if (VH) {
                    iy.gn(-5199314337533258320L, this);
                }
                return this.name;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -5199314337533258320L, this);
                }
                throw th;
            }
        }

        @ey(method = -4994615151947928789L)
        public boolean v5() {
            try {
                if (VH) {
                    iy.gn(3912261602629235139L, this);
                }
                if (this.kind.equals("src") && this.path.startsWith("/")) {
                    if (this.path.indexOf(47, 1) == -1) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 3912261602629235139L, this);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -677463068144315523L)
        public Entry(String str, String str2, boolean z, boolean z2) {
            this(str, str2, z, z2, false);
            try {
                if (VH) {
                    iy.J0(6648045613493501984L, null, str, str2, new Boolean(z), new Boolean(z2));
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.a8(th, 6648045613493501984L, null, str, str2, new Boolean(z), new Boolean(z2));
                }
                throw th;
            }
        }

        @ey(method = -402169595580965680L)
        public Entry(String str, String str2, boolean z, boolean z2, boolean z3) {
            try {
                if (VH) {
                    iy.J8(-1034563970835769881L, null, str, str2, new Boolean(z), new Boolean(z2), new Boolean(z3));
                }
                this.kind = str;
                this.path = str2;
                this.exported = z;
                if (z3) {
                    this.name = FileSystem.getName(str2) + "[" + str2 + "]";
                    return;
                }
                this.name = FileSystem.getName(str2);
            } catch (Throwable th) {
                if (gn) {
                    iy.lg(th, -1034563970835769881L, null, str, str2, new Boolean(z), new Boolean(z2), new Boolean(z3));
                }
                throw th;
            }
        }
    }

    @ey(method = 397412807389742520L)
    private ClassPath(String str) {
        try {
            if (VH) {
                iy.tp(-248598786622177603L, null, str);
            }
            this.Zo = new ArrayList();
            try {
                this.Zo = new ArrayList();
                DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
                documentBuilderFactoryNewInstance.setNamespaceAware(true);
                NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().compile("//classpathentry").evaluate(documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new File(str).toURI().toString()), XPathConstants.NODESET);
                for (int i = 0; i < nodeList.getLength(); i++) {
                    Node nodeItem = nodeList.item(i);
                    Node namedItem = nodeItem.getAttributes().getNamedItem("kind");
                    Node namedItem2 = nodeItem.getAttributes().getNamedItem("path");
                    Node namedItem3 = nodeItem.getAttributes().getNamedItem("exported");
                    if (namedItem != null && namedItem2 != null) {
                        this.Zo.add(new Entry(namedItem.getNodeValue(), namedItem2.getNodeValue(), namedItem3 != null && "true".equals(namedItem3.getNodeValue())));
                    }
                }
            } catch (Exception e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -248598786622177603L, null, str);
            }
            throw th;
        }
    }
}
