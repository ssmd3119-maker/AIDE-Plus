package com.aide.appwizard;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@cy(clazz = 3132958223131404353L, container = 3132958223131404353L, user = true)
/* loaded from: classes.dex */
public class c {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -3223402235617873536L)
    private String DW;

    @dy(field = -517662823479348361L)
    private String j6;

    static {
        iy.Zo(c.class);
    }

    @ey(method = 1037039607188500212L)
    public c() {
        try {
            if (FH) {
                iy.gn(684569386058815335L, null);
            }
            this.j6 = "\t";
            this.DW = "\n";
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 684569386058815335L, null);
            }
            throw th;
        }
    }

    @ey(method = -1800640810440494555L)
    private void Hw(Node node, Writer writer, int i, String str) {
        try {
            if (FH) {
                iy.J0(1881309931079372915L, this, node, writer, new Integer(i), str);
            }
            short nodeType = node.getNodeType();
            if (nodeType != 1) {
                if (nodeType != 9) {
                    return;
                }
                writer.write("<?xml version=\"");
                writer.write(((Document) node).getXmlVersion());
                writer.write("\" encoding=\"utf-8\"");
                writer.write("?>");
                writer.write(this.DW);
                NodeList childNodes = node.getChildNodes();
                if (childNodes != null) {
                    for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
                        Hw(childNodes.item(i2), writer, 0, "");
                    }
                    return;
                }
                return;
            }
            String nodeName = node.getNodeName();
            writer.write(str + "<" + nodeName);
            String str2 = this.DW + str + this.j6;
            NamedNodeMap attributes = node.getAttributes();
            for (int i3 = 0; i3 < attributes.getLength(); i3++) {
                Attr attr = (Attr) attributes.item(i3);
                if (!"xmlns:android".equals(attr.getName())) {
                    writer.write(str2);
                    writer.write(attr.getNodeName());
                    writer.write("=\"");
                    j6(writer, attr.getNodeValue());
                    writer.write("\"");
                }
            }
            NodeList childNodes2 = node.getChildNodes();
            if (childNodes2 == null || childNodes2.getLength() <= 0) {
                writer.write("/>");
            } else {
                writer.write(">");
                writer.write(this.DW);
                writer.write(this.DW);
                for (int i4 = 0; i4 < childNodes2.getLength(); i4++) {
                    if (childNodes2.item(i4).getNodeType() == 1) {
                        Hw(childNodes2.item(i4), writer, i + 1, str + this.j6);
                    }
                }
                writer.write(str);
                writer.write("</" + nodeName + ">");
            }
            writer.write(this.DW);
            writer.write(this.DW);
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 1881309931079372915L, this, node, writer, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = -5103385399890867351L)
    private void j6(Writer writer, String str) {
        try {
            if (FH) {
                iy.EQ(4329959026196767271L, this, writer, str);
            }
            if (str == null) {
                return;
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '\r') {
                    writer.write("&#xD;");
                } else if (cCharAt == '&') {
                    writer.write("&amp;");
                } else if (cCharAt == '<') {
                    writer.write("&lt;");
                } else if (cCharAt != '>') {
                    writer.write(cCharAt);
                } else {
                    writer.write("&gt;");
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 4329959026196767271L, this, writer, str);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    @ey(method = -774025004137735287L)
    public String DW(Document document) {
        try {
            if (FH) {
                iy.tp(-704590524003572941L, this, document);
            }
            StringWriter stringWriter = new StringWriter();
            try {
                FH(document, stringWriter);
                document = stringWriter.toString();
                return document;
            } catch (IOException unused) {
                return "";
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -704590524003572941L, this, document);
            }
            throw th;
        }
    }

    @ey(method = -129749281374467353L)
    public void FH(Document document, Writer writer) {
        try {
            if (FH) {
                iy.EQ(488329981621894629L, this, document, writer);
            }
            document.normalize();
            Hw(document, writer, 0, "");
            writer.flush();
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 488329981621894629L, this, document, writer);
            }
            throw th;
        }
    }
}
