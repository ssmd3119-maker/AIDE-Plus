package org.codehaus.groovy.ast;

import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class GenericsType extends ASTNode {
    private String AL;
    private boolean hK;
    private final ClassNode k2;
    private final ClassNode[] qp;
    private boolean w9;
    private ClassNode zh;

    private class GenericsTypeMatcher {
    }

    public GenericsType(ClassNode classNode, ClassNode[] classNodeArr, ClassNode classNode2) {
        this.zh = classNode;
        this.AL = classNode.Mz() ? classNode.vJ() : classNode.getName();
        this.qp = classNodeArr;
        this.k2 = classNode2;
        this.w9 = classNode.Mz();
    }

    private String EQ(ClassNode classNode, Set<String> set) {
        StringBuilder sb = new StringBuilder();
        if (classNode.g3()) {
            sb.append(classNode.vy().getName());
            sb.append("[]");
        } else if (classNode.OW() instanceof InnerClassNode) {
            InnerClassNode innerClassNode = (InnerClassNode) classNode.OW();
            String name = innerClassNode.et().getName();
            if (Modifier.isStatic(innerClassNode.ro()) || innerClassNode.I()) {
                sb.append(innerClassNode.et().getName());
            } else {
                sb.append(EQ(innerClassNode.et(), new HashSet()));
            }
            sb.append(".");
            sb.append(classNode.getName().substring(name.length() + 1));
        } else {
            sb.append(classNode.getName());
        }
        GenericsType[] genericsTypeArrNw = classNode.nw();
        if (genericsTypeArrNw == null || genericsTypeArrNw.length == 0) {
            return sb.toString();
        }
        if (genericsTypeArrNw.length == 1 && genericsTypeArrNw[0].QX() && classNode.getName().equals("java.lang.Object")) {
            return genericsTypeArrNw[0].getName();
        }
        sb.append("<");
        for (int i = 0; i < genericsTypeArrNw.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            GenericsType genericsType = genericsTypeArrNw[i];
            if (genericsType.QX() && set.contains(genericsType.getName())) {
                sb.append(genericsType.getName());
            } else {
                sb.append(genericsType.a8(set));
            }
        }
        sb.append(">");
        return sb.toString();
    }

    private String a8(Set<String> set) {
        String strEQ;
        if (this.w9) {
            set.add(this.AL);
        }
        if (this.hK) {
            strEQ = "?";
        } else {
            ClassNode classNode = this.zh;
            strEQ = (classNode == null || this.w9) ? this.AL : EQ(classNode, set);
        }
        ClassNode[] classNodeArr = this.qp;
        if (classNodeArr == null) {
            if (this.k2 == null) {
                return strEQ;
            }
            return strEQ + " super " + EQ(this.k2, set);
        }
        int i = 0;
        if (this.w9 && classNodeArr.length == 1 && !classNodeArr[0].Mz() && this.qp[0].getName().equals("java.lang.Object")) {
            return strEQ;
        }
        String str = strEQ + " extends ";
        while (i < this.qp.length) {
            str = str + EQ(this.qp[i], set);
            i++;
            if (i < this.qp.length) {
                str = str + " & ";
            }
        }
        return str;
    }

    public ClassNode J8() {
        return this.k2;
    }

    public void Mr(boolean z) {
        this.hK = z;
    }

    public boolean QX() {
        return this.w9;
    }

    public ClassNode[] Ws() {
        return this.qp;
    }

    public void aM(String str) {
        this.AL = str;
    }

    public String getName() {
        return this.AL;
    }

    public void j3(boolean z) {
        this.w9 = z;
        this.zh.br(z);
    }

    public String toString() {
        return a8(new HashSet());
    }

    public GenericsType(ClassNode classNode) {
        this(classNode, null, null);
    }
}
