package com.aide.uidesigner;

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

@cy(clazz = -103502061530551584L, container = -103502061530551584L, user = true)
/* loaded from: classes.dex */
public class e {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -3121330221638074919L)
    private String DW;

    @dy(field = -131709279727562584L)
    private String j6;

    static {
        iy.Zo(e.class);
    }

    @ey(method = 1431709596455053033L)
    public e() {
        try {
            if (FH) {
                iy.gn(-2807138158019341080L, null);
            }
            this.j6 = "\t";
            this.DW = "\n";
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -2807138158019341080L, null);
            }
            throw th;
        }
    }

    @ey(method = 6236262340326424680L)
    private void Hw(Node node, Writer writer, int i, String str) {
        try {
            if (FH) {
                iy.J0(-5670610947520645440L, this, node, writer, new Integer(i), str);
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
            if (i == 0) {
                writer.write(str2);
                writer.write("xmlns:android=\"http://schemas.android.com/apk/res/android\"");
            }
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
                iy.a8(th, -5670610947520645440L, this, node, writer, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = 5590811234900238256L)
    private void j6(Writer writer, String str) {
        try {
            if (FH) {
                iy.EQ(-2377119988337534208L, this, writer, str);
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
                iy.Mr(th, -2377119988337534208L, this, writer, str);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    @ey(method = 1088636616911050916L)
    public String DW(Document document) {
        try {
            if (FH) {
                iy.tp(840818330498157888L, this, document);
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
                iy.j3(th, 840818330498157888L, this, document);
            }
            throw th;
        }
    }

    @ey(method = -654525893001350720L)
    public void FH(Document document, Writer writer) {
        try {
            if (FH) {
                iy.EQ(-978879165632510772L, this, document, writer);
            }
            document.normalize();
            Hw(document, writer, 0, "");
            writer.flush();
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -978879165632510772L, this, document, writer);
            }
            throw th;
        }
    }
}
