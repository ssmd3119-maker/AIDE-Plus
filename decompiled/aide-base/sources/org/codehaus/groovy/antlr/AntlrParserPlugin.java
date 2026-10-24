package org.codehaus.groovy.antlr;

import com.thoughtworks.xstream.XStream;
import groovyjarjarantlr.collections.AST;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import org.codehaus.groovy.antlr.parser.GroovyTokenTypes;
import org.codehaus.groovy.antlr.treewalker.CompositeVisitor;
import org.codehaus.groovy.antlr.treewalker.MindMapPrinter;
import org.codehaus.groovy.antlr.treewalker.NodeAsHTMLPrinter;
import org.codehaus.groovy.antlr.treewalker.PreOrderTraversal;
import org.codehaus.groovy.antlr.treewalker.SourceCodeTraversal;
import org.codehaus.groovy.antlr.treewalker.SourcePrinter;
import org.codehaus.groovy.ast.expr.Expression;
import org.codehaus.groovy.control.ParserPlugin;
import org.codehaus.groovy.control.SourceUnit;
import org.codehaus.groovy.syntax.ASTHelper;

/* loaded from: classes.dex */
public class AntlrParserPlugin extends ASTHelper implements ParserPlugin, GroovyTokenTypes {
    private String[] DW;
    protected AST j6;

    /* renamed from: org.codehaus.groovy.antlr.AntlrParserPlugin$1, reason: invalid class name */
    public class AnonymousClass1 implements PrivilegedAction {
        final /* synthetic */ SourceBuffer DW;
        final /* synthetic */ AntlrParserPlugin FH;
        final /* synthetic */ SourceUnit j6;

        @Override // java.security.PrivilegedAction
        public Object run() {
            this.FH.DW(this.j6, this.DW);
            return null;
        }
    }

    private static class AnonymousInnerClassCarrier extends Expression {
        private AnonymousInnerClassCarrier() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void DW(SourceUnit sourceUnit, SourceBuffer sourceBuffer) {
        String property = System.getProperty("ANTLR.AST".toLowerCase());
        if ("xml".equals(property)) {
            FH(sourceUnit.Zo(), this.j6);
        }
        if ("groovy".equals(property)) {
            try {
                new SourceCodeTraversal(new SourcePrinter(new PrintStream(new FileOutputStream(sourceUnit.Zo() + ".pretty.groovy")), this.DW)).j6(this.j6);
            } catch (FileNotFoundException unused) {
                System.out.println("Cannot create " + sourceUnit.Zo() + ".pretty.groovy");
            }
        }
        if ("mindmap".equals(property)) {
            try {
                new PreOrderTraversal(new MindMapPrinter(new PrintStream(new FileOutputStream(sourceUnit.Zo() + ".mm")), this.DW)).j6(this.j6);
            } catch (FileNotFoundException unused2) {
                System.out.println("Cannot create " + sourceUnit.Zo() + ".mm");
            }
        }
        if ("extendedMindmap".equals(property)) {
            try {
                new PreOrderTraversal(new MindMapPrinter(new PrintStream(new FileOutputStream(sourceUnit.Zo() + ".mm")), this.DW, sourceBuffer)).j6(this.j6);
            } catch (FileNotFoundException unused3) {
                System.out.println("Cannot create " + sourceUnit.Zo() + ".mm");
            }
        }
        if ("html".equals(property)) {
            try {
                PrintStream printStream = new PrintStream(new FileOutputStream(sourceUnit.Zo() + ".html"));
                ArrayList arrayList = new ArrayList();
                arrayList.add(new NodeAsHTMLPrinter(printStream, this.DW));
                arrayList.add(new SourcePrinter(printStream, this.DW));
                new SourceCodeTraversal(new CompositeVisitor(arrayList)).j6(this.j6);
            } catch (FileNotFoundException unused4) {
                System.out.println("Cannot create " + sourceUnit.Zo() + ".html");
            }
        }
    }

    private void FH(String str, AST ast) {
        try {
            new XStream().toXML(ast, new FileWriter(str + ".antlr.xml"));
            System.out.println("Written AST to " + str + ".antlr.xml");
        } catch (Exception e) {
            System.out.println("Couldn't write to " + str + ".antlr.xml");
            e.printStackTrace();
        }
    }
}
