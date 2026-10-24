package com.aide.common;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.io.InputStream;
import java.util.Stack;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

@cy(clazz = -3648150566812432569L, container = -3648150566812432569L, user = true)
/* loaded from: classes.dex */
public class PositionalXMLReader {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -721187905215067152L, container = -3648150566812432569L, user = true)
    static class a extends DefaultHandler {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = 2565390315938413041L)
        final /* synthetic */ Document DW;

        @dy(field = -3822530679864769689L)
        final /* synthetic */ Stack FH;

        @dy(field = -1810062762988665720L)
        final /* synthetic */ StringBuilder Hw;

        @dy(field = 1083821891400801060L)
        private Locator j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 411343173597268605L)
        a(Document document, Stack stack, StringBuilder sb) {
            this.DW = document;
            this.FH = stack;
            this.Hw = sb;
        }

        @ey(method = -336377366257808425L)
        private void j6() {
            try {
                if (v5) {
                    iy.gn(-310322638441469720L, this);
                }
                if (this.Hw.length() > 0) {
                    ((Element) this.FH.peek()).appendChild(this.DW.createTextNode(this.Hw.toString()));
                    this.Hw.delete(0, this.Hw.length());
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -310322638441469720L, this);
                }
                throw th;
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        @ey(method = -1691300000669250817L)
        public void characters(char[] cArr, int i, int i2) {
            try {
                if (v5) {
                    iy.we(-3354427488514114800L, this, cArr, new Integer(i), new Integer(i2));
                }
                this.Hw.append(cArr, i, i2);
            } catch (Throwable th) {
                if (Zo) {
                    iy.U2(th, -3354427488514114800L, this, cArr, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        @ey(method = 3428007830828331444L)
        public void endElement(String str, String str2, String str3) {
            try {
                if (v5) {
                    iy.we(328282518374786231L, this, str, str2, str3);
                }
                j6();
                Element element = (Element) this.FH.pop();
                if (this.FH.isEmpty()) {
                    this.DW.appendChild(element);
                } else {
                    ((Element) this.FH.peek()).appendChild(element);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.U2(th, 328282518374786231L, this, str, str2, str3);
                }
                throw th;
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        @ey(method = 977126083058243104L)
        public void setDocumentLocator(Locator locator) {
            try {
                if (v5) {
                    iy.tp(-4054330668650940327L, this, locator);
                }
                this.j6 = locator;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -4054330668650940327L, this, locator);
                }
                throw th;
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        @ey(method = -293546554364828544L)
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            try {
                if (v5) {
                    iy.J0(2256026356225305339L, this, str, str2, str3, attributes);
                }
                j6();
                Element elementCreateElement = this.DW.createElement(str3);
                for (int i = 0; i < attributes.getLength(); i++) {
                    elementCreateElement.setAttribute(attributes.getQName(i), attributes.getValue(i));
                }
                elementCreateElement.setUserData("line", String.valueOf(this.j6.getLineNumber()), null);
                elementCreateElement.setUserData("column", String.valueOf(this.j6.getColumnNumber() + 1), null);
                this.FH.push(elementCreateElement);
            } catch (Throwable th) {
                if (Zo) {
                    iy.a8(th, 2256026356225305339L, this, str, str2, str3, attributes);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(PositionalXMLReader.class);
    }

    @ey(method = -87248457268140384L)
    public PositionalXMLReader() {
        try {
            if (j6) {
                iy.gn(-1892778899644250163L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1892778899644250163L, null);
            }
            throw th;
        }
    }

    @ey(method = -25322555023341576L)
    public static Document j6(InputStream inputStream) {
        try {
            if (j6) {
                iy.tp(4809939954446494251L, null, inputStream);
            }
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                xMLReader.setFeature("http://xml.org/sax/features/namespaces", false);
                xMLReader.setFeature("http://xml.org/sax/features/namespace-prefixes", false);
                Document documentNewDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
                xMLReader.setContentHandler(new a(documentNewDocument, new Stack(), new StringBuilder()));
                xMLReader.parse(new InputSource(inputStream));
                return documentNewDocument;
            } catch (ParserConfigurationException e) {
                throw new RuntimeException("Can't create SAX parser / DOM builder.", e);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 4809939954446494251L, null, inputStream);
            }
            throw th;
        }
    }
}
