package org.codehaus.groovy.ast;

import groovyjarjarasm.asm.Opcodes;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.codehaus.groovy.GroovyBugError;
import org.codehaus.groovy.ast.stmt.Statement;
import org.codehaus.groovy.vmplugin.VMPluginFactory;

/* loaded from: classes.dex */
public class ClassNode extends AnnotatedNode implements Opcodes {
    public static final ClassNode[] pN = new ClassNode[0];
    private ClassNode[] AL;
    private boolean Cz;
    private boolean Gj;
    private ClassNode Jl;
    private CompileUnit Q6;
    private Map<String, FieldNode> Z1;
    private List<MethodNode> cT;
    protected Class e3;
    protected Object eU;
    private GenericsType[] fN;
    private MapOfLists hK;
    protected boolean iW;
    private String k2;
    private boolean kf;
    private ModuleNode n5;
    private ClassNode pO;
    private LinkedList<FieldNode> q7;
    private boolean sE;
    private ClassNode sg;
    private List<ConstructorNode> w9;
    private int zh;

    private static class MapOfLists {
        private Map<Object, List<MethodNode>> j6;

        private MapOfLists() {
            this.j6 = new HashMap();
        }

        public List<MethodNode> DW(Object obj) {
            List<MethodNode> listJ6 = j6(obj);
            return listJ6 == null ? Collections.emptyList() : listJ6;
        }

        public void FH(Object obj, MethodNode methodNode) {
            if (this.j6.containsKey(obj)) {
                j6(obj).add(methodNode);
                return;
            }
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(methodNode);
            this.j6.put(obj, arrayList);
        }

        public List<MethodNode> j6(Object obj) {
            return this.j6.get(obj);
        }
    }

    static {
        new ClassNode(Object.class);
        new ClassNode(Object.class);
    }

    private ClassNode(ClassNode classNode) {
        this(classNode.getName() + "[]", 1, ClassHelper.FH);
        this.sg = classNode.OW();
        this.iW = false;
    }

    private String er(GenericsType genericsType, boolean z) {
        String name = genericsType.getName();
        if (genericsType.Ws() == null) {
            if (genericsType.J8() == null) {
                return name;
            }
            ClassNode classNodeJ8 = genericsType.J8();
            if (classNodeJ8.equals(this)) {
                return name + " super " + classNodeJ8.getName();
            }
            return name + " super " + classNodeJ8;
        }
        String str = name + " extends ";
        int i = 0;
        while (i < genericsType.Ws().length) {
            ClassNode classNode = genericsType.Ws()[i];
            if (classNode.equals(this)) {
                str = str + classNode.getName();
            } else {
                str = str + classNode.wc(z);
            }
            i++;
            if (i < genericsType.Ws().length) {
                str = str + " & ";
            }
        }
        return str;
    }

    private void sy() {
        synchronized (this.eU) {
            if (this.pO != null) {
                throw new GroovyBugError("lazyClassInit called on a proxy ClassNode, that must not happen.A redirect() call is missing somewhere!");
            }
            if (this.sE) {
                return;
            }
            VMPluginFactory.DW().j6(this.Q6, this);
            this.sE = true;
        }
    }

    public boolean I() {
        return (ro() & 512) > 0;
    }

    public List<MethodNode> KD() {
        if (!OW().sE) {
            OW().sy();
        }
        return this.pO != null ? OW().KD() : this.cT;
    }

    public void Mr(FieldNode fieldNode) {
        ClassNode classNodeOW = OW();
        fieldNode.Ws(classNodeOW);
        fieldNode.aM(classNodeOW);
        if (classNodeOW.q7 == null) {
            classNodeOW.q7 = new LinkedList<>();
        }
        if (classNodeOW.Z1 == null) {
            classNodeOW.Z1 = new HashMap();
        }
        classNodeOW.q7.add(fieldNode);
        classNodeOW.Z1.put(fieldNode.getName(), fieldNode);
    }

    public boolean Mz() {
        return this.Cz;
    }

    public ClassNode OW() {
        ClassNode classNode = this.pO;
        return classNode == null ? this : classNode.OW();
    }

    public MethodNode P8(String str, Parameter[] parameterArr) {
        for (MethodNode methodNode : ei(str)) {
            if (lp(methodNode.lg(), parameterArr)) {
                return methodNode;
            }
        }
        return null;
    }

    public boolean Qq() {
        return this.Gj;
    }

    public ClassNode[] SI() {
        if (!OW().sE) {
            OW().sy();
        }
        return this.pO != null ? OW().SI() : this.AL;
    }

    public Class Sf() {
        Class cls = OW().e3;
        if (cls != null) {
            return cls;
        }
        ClassNode classNode = OW().sg;
        if (classNode != null && classNode.ca()) {
            yO(classNode.aj());
            return OW().e3;
        }
        throw new GroovyBugError("ClassNode#getTypeClass for " + getName() + " is called before the type class is set ");
    }

    public void XG(ClassNode classNode) {
        this.Jl = classNode;
    }

    public void XX(GenericsType[] genericsTypeArr) {
        this.Gj = this.Gj || genericsTypeArr != null;
        this.fN = genericsTypeArr;
    }

    public MethodNode a8(String str, int i, ClassNode classNode, Parameter[] parameterArr, ClassNode[] classNodeArr, Statement statement) {
        MethodNode methodNodeP8 = P8(str, parameterArr);
        if (methodNodeP8 != null) {
            return methodNodeP8;
        }
        MethodNode methodNode = new MethodNode(str, i, classNode, parameterArr, classNodeArr, statement);
        lg(methodNode);
        return methodNode;
    }

    public ConstructorNode aM(int i, Parameter[] parameterArr, ClassNode[] classNodeArr, Statement statement) {
        ConstructorNode constructorNode = new ConstructorNode(i, parameterArr, classNodeArr, statement);
        j3(constructorNode);
        return constructorNode;
    }

    public ClassNode aj() {
        if (this.pO == null) {
            Class cls = this.e3;
            return cls != null ? new ClassNode(Array.newInstance((Class<?>) cls, 0).getClass(), this) : new ClassNode(this);
        }
        ClassNode classNodeAj = OW().aj();
        classNodeAj.sg = this;
        return classNodeAj;
    }

    public void br(boolean z) {
        this.Gj = this.Gj || z;
        this.Cz = z;
    }

    public boolean ca() {
        ClassNode classNode;
        return OW().e3 != null || ((classNode = this.sg) != null && classNode.ca());
    }

    public ModuleNode cb() {
        return OW().n5;
    }

    public PackageNode dx() {
        if (cb() == null) {
            return null;
        }
        return cb().J8();
    }

    public String ef() {
        return getName();
    }

    public List<MethodNode> ei(String str) {
        if (!OW().sE) {
            OW().sy();
        }
        return this.pO != null ? OW().ei(str) : this.hK.DW(str);
    }

    public boolean equals(Object obj) {
        if (this.pO != null) {
            return OW().equals(obj);
        }
        if (obj instanceof ClassNode) {
            return ((ClassNode) obj).ef().equals(ef());
        }
        return false;
    }

    public boolean g3() {
        return this.sg != null;
    }

    public CompileUnit gW() {
        ModuleNode moduleNode;
        if (this.pO != null) {
            return OW().gW();
        }
        if (this.Q6 == null && (moduleNode = this.n5) != null) {
            this.Q6 = moduleNode.Ws();
        }
        return this.Q6;
    }

    public String getName() {
        return OW().k2;
    }

    public int hashCode() {
        return this.pO != null ? OW().hashCode() : getName().hashCode();
    }

    public void j3(ConstructorNode constructorNode) {
        constructorNode.Ws(this);
        ClassNode classNodeOW = OW();
        if (classNodeOW.w9 == null) {
            classNodeOW.w9 = new ArrayList();
        }
        classNodeOW.w9.add(constructorNode);
    }

    public void jJ(boolean z) {
        this.Gj = z;
    }

    public void kQ(ClassNode[] classNodeArr) {
        if (this.pO != null) {
            OW().kQ(classNodeArr);
        } else {
            this.AL = classNodeArr;
        }
    }

    public void lg(MethodNode methodNode) {
        methodNode.Ws(this);
        OW().cT.add(methodNode);
        OW().hK.FH(methodNode.getName(), methodNode);
    }

    protected boolean lp(Parameter[] parameterArr, Parameter[] parameterArr2) {
        if (parameterArr.length != parameterArr2.length) {
            return false;
        }
        for (int i = 0; i < parameterArr.length; i++) {
            if (!parameterArr[i].j6().equals(parameterArr2[i].j6())) {
                return false;
            }
        }
        return true;
    }

    public GenericsType[] nw() {
        return this.fN;
    }

    public int ro() {
        return OW().zh;
    }

    public ClassNode sG() {
        if (ClassHelper.DW(this)) {
            return this;
        }
        ClassNode classNode = new ClassNode(this.k2, this.zh, this.Jl, null, null);
        classNode.iW = false;
        classNode.yO(OW());
        if (g3()) {
            classNode.sg = OW().vy();
        }
        return classNode;
    }

    public String toString() {
        return wc(true);
    }

    public String vJ() {
        return this.k2;
    }

    public ClassNode vy() {
        return this.sg;
    }

    public String wc(boolean z) {
        if (g3()) {
            return this.sg.wc(z) + "[]";
        }
        String name = getName();
        if (this.Cz) {
            name = vJ();
        }
        if (!this.Cz && this.fN != null) {
            String str = name + " <";
            for (int i = 0; i < this.fN.length; i++) {
                if (i != 0) {
                    str = str + ", ";
                }
                str = str + er(this.fN[i], z);
            }
            name = str + ">";
        }
        if (this.pO == null || !z) {
            return name;
        }
        return name + " -> " + OW().toString();
    }

    public boolean x9() {
        return OW().kf;
    }

    public void yO(ClassNode classNode) {
        if (!this.iW) {
            if (classNode != null) {
                classNode = classNode.OW();
            }
            if (classNode == this) {
                return;
            }
            this.pO = classNode;
            return;
        }
        throw new GroovyBugError("tried to set a redirect for a primary ClassNode (" + getName() + "->" + classNode.getName() + ").");
    }

    private ClassNode(Class cls, ClassNode classNode) {
        this(cls);
        this.sg = classNode;
        this.iW = false;
    }

    public ClassNode(Class cls) {
        this(cls.getName(), cls.getModifiers(), null, null, MixinNode.oy);
        this.e3 = cls;
        this.sE = false;
        CompileUnit compileUnitGW = gW();
        if (compileUnitGW != null) {
            compileUnitGW.j6(this);
        }
        this.iW = false;
    }

    public ClassNode(String str, int i, ClassNode classNode) {
        this(str, i, classNode, pN, MixinNode.oy);
    }

    public ClassNode(String str, int i, ClassNode classNode, ClassNode[] classNodeArr, MixinNode[] mixinNodeArr) {
        this.kf = false;
        this.eU = new Object();
        this.sE = true;
        this.sg = null;
        this.pO = null;
        this.fN = null;
        this.Gj = false;
        this.k2 = str;
        this.zh = i;
        this.Jl = classNode;
        this.AL = classNodeArr;
        this.iW = true;
        if (classNode != null) {
            this.Gj = classNode.Qq();
        }
        if (!this.Gj && classNodeArr != null) {
            for (ClassNode classNode2 : classNodeArr) {
                boolean z = this.Gj || classNode2.Qq();
                this.Gj = z;
                if (z) {
                    break;
                }
            }
        }
        this.hK = new MapOfLists();
        this.cT = new ArrayList();
    }
}
