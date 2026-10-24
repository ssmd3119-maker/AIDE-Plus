package abcd;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@cy(clazz = -4676194136961233940L, container = -4676194136961233940L, user = true)
/* loaded from: classes.dex */
public class s8 {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = -5583085517110231568L)
    private String DW;

    @dy(field = -292713482430978744L)
    private String FH;

    @dy(field = 3003502387776948915L)
    private String j6;

    static {
        iy.Zo(s8.class);
    }

    @ey(method = -2227487444039221000L)
    public s8() {
        try {
            if (Hw) {
                iy.gn(-741736953874149152L, null);
            }
            this.j6 = "\t";
            this.DW = "\n";
            this.FH = "UTF8";
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -741736953874149152L, null);
            }
            throw th;
        }
    }

    @ey(method = -63776833118427017L)
    private void Hw(Node node, Writer writer, int i, String str) {
        try {
            if (Hw) {
                iy.J0(553719182786207264L, this, node, writer, new Integer(i), str);
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
            if (v5) {
                iy.a8(th, 553719182786207264L, this, node, writer, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = -13854452591126141L)
    private void j6(Writer writer, String str) {
        try {
            if (Hw) {
                iy.EQ(4104005874890906376L, this, writer, str);
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
            if (v5) {
                iy.Mr(th, 4104005874890906376L, this, writer, str);
            }
            throw th;
        }
    }

    @ey(method = 1211161374117613600L)
    public void DW(Document document, OutputStream outputStream) {
        try {
            if (Hw) {
                iy.EQ(249077740171505885L, this, document, outputStream);
            }
            FH(document, new OutputStreamWriter(outputStream, this.FH));
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 249077740171505885L, this, document, outputStream);
            }
            throw th;
        }
    }

    @ey(method = -2631564856207851855L)
    public void FH(Document document, Writer writer) {
        try {
            if (Hw) {
                iy.EQ(1362609029906784912L, this, document, writer);
            }
            document.normalize();
            Hw(document, writer, 0, "");
            writer.flush();
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 1362609029906784912L, this, document, writer);
            }
            throw th;
        }
    }
}
