package groovyjarjarantlr;

import groovyjarjarantlr.collections.AST;

/* loaded from: classes.dex */
public class ASTPair {
    public AST DW;
    public AST j6;

    public final void j6() {
        if (this.DW != null) {
            while (this.DW.getNextSibling() != null) {
                this.DW = this.DW.getNextSibling();
            }
        }
    }

    public String toString() {
        AST ast = this.j6;
        String text = ast == null ? "null" : ast.getText();
        AST ast2 = this.DW;
        String text2 = ast2 != null ? ast2.getText() : "null";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append(text);
        stringBuffer.append(",");
        stringBuffer.append(text2);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
