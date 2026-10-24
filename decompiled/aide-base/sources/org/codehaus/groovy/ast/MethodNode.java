package org.codehaus.groovy.ast;

import groovyjarjarasm.asm.Opcodes;
import org.codehaus.groovy.ast.stmt.Statement;

/* loaded from: classes.dex */
public class MethodNode extends AnnotatedNode implements Opcodes {
    private ClassNode AL;
    String Z1;
    private boolean cT;
    private Statement hK;
    private final String k2;
    private final ClassNode[] q7;
    private Parameter[] w9;
    private int zh;

    public MethodNode(String str, int i, ClassNode classNode, Parameter[] parameterArr, ClassNode[] classNodeArr, Statement statement) {
        this.k2 = str;
        this.zh = i;
        this.hK = statement;
        ro(classNode);
        cb(new VariableScope());
        KD(parameterArr);
        this.q7 = classNodeArr;
        if (str != null) {
            str.equals("<clinit>");
        }
    }

    private static String aM(ClassNode classNode) {
        if (!classNode.g3()) {
            return classNode.getName();
        }
        int i = 0;
        while (classNode.g3()) {
            i++;
            classNode = classNode.vy();
        }
        StringBuilder sb = new StringBuilder(classNode.getName().length() + (i * 2));
        sb.append(classNode.getName());
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("[]");
        }
        return sb.toString();
    }

    private void vy() {
        this.Z1 = null;
    }

    public void KD(Parameter[] parameterArr) {
        vy();
        VariableScope variableScope = new VariableScope();
        this.w9 = parameterArr;
        if (parameterArr != null && parameterArr.length > 0) {
            for (Parameter parameter : parameterArr) {
                parameter.aM();
                parameter.j3(P8());
                variableScope.j6(parameter);
            }
        }
        cb(variableScope);
    }

    public ClassNode[] Mr() {
        return this.q7;
    }

    public boolean P8() {
        return (this.zh & 8) != 0;
    }

    public void SI(GenericsType[] genericsTypeArr) {
        vy();
    }

    public int a8() {
        return this.zh;
    }

    public void cb(VariableScope variableScope) {
        variableScope.DW(P8());
    }

    public void ei(boolean z) {
    }

    public ClassNode er() {
        return this.AL;
    }

    public String gW() {
        if (this.Z1 == null) {
            StringBuilder sb = new StringBuilder(this.k2.length() + (this.w9.length * 10));
            sb.append(this.AL.getName());
            sb.append(' ');
            sb.append(this.k2);
            sb.append('(');
            for (int i = 0; i < this.w9.length; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(aM(this.w9[i].j6()));
            }
            sb.append(')');
            this.Z1 = sb.toString();
        }
        return this.Z1;
    }

    public String getName() {
        return this.k2;
    }

    public Statement j3() {
        return this.hK;
    }

    public Parameter[] lg() {
        return this.w9;
    }

    public void nw(Statement statement) {
        this.hK = statement;
    }

    public void ro(ClassNode classNode) {
        vy();
        this.cT |= ClassHelper.DW == classNode;
        this.AL = classNode;
        if (classNode == null) {
            this.AL = ClassHelper.FH;
        }
    }

    public String toString() {
        return "MethodNode@" + hashCode() + "[" + gW() + "]";
    }
}
