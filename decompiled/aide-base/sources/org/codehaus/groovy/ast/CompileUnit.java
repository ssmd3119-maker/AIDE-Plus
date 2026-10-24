package org.codehaus.groovy.ast;

import groovy.lang.GroovyClassLoader;
import java.security.CodeSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.codehaus.groovy.control.SourceUnit;
import org.codehaus.groovy.control.messages.SyntaxErrorMessage;
import org.codehaus.groovy.syntax.SyntaxException;

/* loaded from: classes.dex */
public class CompileUnit {
    private Map<String, ClassNode> DW;
    private Map<String, ClassNode> j6;

    public CompileUnit(GroovyClassLoader groovyClassLoader, CodeSource codeSource, CompilerConfiguration compilerConfiguration) {
        new ArrayList();
        this.j6 = new HashMap();
        this.DW = new HashMap();
        new HashMap();
        new HashMap();
    }

    public ClassNode DW(String str) {
        ClassNode classNode = this.j6.get(str);
        return classNode != null ? classNode : this.DW.get(str);
    }

    public void j6(ClassNode classNode) {
        String str;
        ClassNode classNodeOW = classNode.OW();
        String name = classNodeOW.getName();
        ClassNode classNode2 = this.j6.get(name);
        if (classNode2 != null && classNode2 != classNodeOW) {
            SourceUnit sourceUnitEQ = classNodeOW.cb().EQ();
            SourceUnit sourceUnitEQ2 = classNode2.cb().EQ();
            String str2 = "Invalid duplicate class definition of class " + classNodeOW.getName() + " : ";
            if (sourceUnitEQ == sourceUnitEQ2) {
                str = str2 + "The source " + sourceUnitEQ.Zo() + " contains at least two definitions of the class " + classNodeOW.getName() + ".\n";
                if (classNodeOW.x9() || classNode2.x9()) {
                    str = str + "One of the classes is an explicit generated class using the class statement, the other is a class generated from the script body based on the file name. Solutions are to change the file name or to change the class name.\n";
                }
            } else {
                str = str2 + "The sources " + sourceUnitEQ.Zo() + " and " + sourceUnitEQ2.Zo() + " each contain a class with the name " + classNodeOW.getName() + ".\n";
            }
            sourceUnitEQ.Hw().j6(new SyntaxErrorMessage(new SyntaxException(str, classNodeOW.gn(), classNodeOW.Hw(), classNodeOW.VH(), classNodeOW.v5()), sourceUnitEQ));
        }
        this.j6.put(name, classNodeOW);
        if (this.DW.containsKey(name)) {
            this.DW.get(name).yO(classNodeOW);
            this.DW.remove(name);
        }
    }
}
