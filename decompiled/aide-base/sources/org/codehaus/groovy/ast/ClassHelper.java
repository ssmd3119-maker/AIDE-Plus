package org.codehaus.groovy.ast;

import groovy.lang.Closure;
import groovy.lang.GString;
import groovy.lang.GroovyInterceptable;
import groovy.lang.GroovyObject;
import groovy.lang.GroovyObjectSupport;
import groovy.lang.MetaClass;
import groovy.lang.Range;
import groovy.lang.Reference;
import groovy.lang.Script;
import java.lang.ref.SoftReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.util.ManagedConcurrentMap;
import org.codehaus.groovy.util.ReferenceBundle;
import org.codehaus.groovy.vmplugin.VMPluginFactory;

/* loaded from: classes.dex */
public class ClassHelper {
    public static final ClassNode BT;
    public static final ClassNode DW;
    public static final ClassNode EQ;
    public static final ClassNode FH;
    public static final ClassNode Hw;
    public static final ClassNode J0;
    public static final ClassNode J8;
    public static final ClassNode KD;
    public static final ClassNode Mr;
    public static final ClassNode P8;
    public static final ClassNode QX;
    public static final ClassNode SI;
    public static final ClassNode Sf;
    public static final ClassNode U2;
    public static final ClassNode VH;
    public static final ClassNode Ws;
    public static final ClassNode XL;
    public static final ClassNode Zo;
    public static final ClassNode a8;
    public static final ClassNode aM;
    public static final ClassNode cb;
    public static final ClassNode cn;
    public static final ClassNode dx;
    public static final ClassNode ef;
    public static final ClassNode ei;
    public static final ClassNode er;
    private static ClassNode[] g3;
    public static final ClassNode gW;
    public static final ClassNode gn;
    public static final ClassNode j3;
    private static final Class[] j6 = {Object.class, Boolean.TYPE, Character.TYPE, Byte.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Double.TYPE, Float.TYPE, Void.TYPE, Closure.class, GString.class, List.class, Map.class, Range.class, Pattern.class, Script.class, String.class, Boolean.class, Character.class, Byte.class, Short.class, Integer.class, Long.class, Double.class, Float.class, BigDecimal.class, BigInteger.class, Number.class, Void.class, Reference.class, Class.class, MetaClass.class, Iterator.class, GeneratedClosure.class, GroovyObjectSupport.class};
    public static final ClassNode lg;
    public static final ClassNode nw;
    public static final ClassNode rN;
    public static final ClassNode ro;
    public static final ClassNode sG;
    public static final ClassNode sh;
    public static final ClassNode tp;
    public static final ClassNode u7;
    public static final ClassNode v5;
    public static final ClassNode vJ;
    public static final ClassNode vy;
    public static final ClassNode we;
    public static final ClassNode yS;

    static class ClassHelperCache {
        static ManagedConcurrentMap<Class, SoftReference<ClassNode>> j6 = new ManagedConcurrentMap<>(ReferenceBundle.Hw());

        ClassHelperCache() {
        }
    }

    static {
        ClassNode classNodeV5 = v5(Object.class);
        DW = classNodeV5;
        FH = classNodeV5;
        Hw = v5(Void.TYPE);
        v5 = v5(Closure.class);
        Zo = v5(GString.class);
        VH = Zo(List.class);
        gn = Zo(Map.class);
        u7 = v5(Range.class);
        tp = v5(Pattern.class);
        EQ = v5(String.class);
        we = v5(Script.class);
        J0 = Zo(Reference.class);
        J8 = v5(Boolean.TYPE);
        Ws = v5(Character.TYPE);
        QX = v5(Byte.TYPE);
        XL = v5(Integer.TYPE);
        aM = v5(Long.TYPE);
        j3 = v5(Short.TYPE);
        Mr = v5(Double.TYPE);
        U2 = v5(Float.TYPE);
        a8 = v5(Byte.class);
        lg = v5(Short.class);
        rN = v5(Integer.class);
        er = v5(Long.class);
        yS = v5(Character.class);
        gW = v5(Float.class);
        BT = v5(Double.class);
        vy = v5(Boolean.class);
        P8 = v5(BigInteger.class);
        ei = v5(BigDecimal.class);
        nw = v5(Number.class);
        SI = v5(Void.class);
        KD = v5(MetaClass.class);
        ro = v5(Iterator.class);
        cn = Zo(Class.class);
        Zo(Comparable.class);
        sh = Zo(GeneratedClosure.class);
        cb = Zo(GroovyObjectSupport.class);
        dx = Zo(GroovyObject.class);
        sG = Zo(GroovyInterceptable.class);
        ef = new ClassNode("java.lang.Enum", 0, FH);
        Sf = new ClassNode("java.lang.annotation.Annotation", 0, FH);
        vJ = new ClassNode("java.lang.annotation.ElementType", 0, ef);
        ClassNode classNode = ef;
        classNode.iW = false;
        ClassNode classNode2 = Sf;
        classNode2.iW = false;
        g3 = new ClassNode[]{FH, J8, Ws, QX, j3, XL, aM, Mr, U2, Hw, v5, Zo, VH, gn, u7, tp, we, EQ, vy, yS, a8, lg, rN, er, BT, gW, ei, P8, nw, SI, J0, cn, KD, ro, sh, cb, dx, sG, classNode, classNode2};
    }

    public static boolean DW(ClassNode classNode) {
        return classNode == J8 || classNode == Ws || classNode == QX || classNode == j3 || classNode == XL || classNode == aM || classNode == U2 || classNode == Mr || classNode == Hw;
    }

    public static ClassNode FH(Class cls) {
        return Hw(cls, true);
    }

    public static ClassNode Hw(Class cls, boolean z) {
        int i = 0;
        while (true) {
            Class[] clsArr = j6;
            if (i >= clsArr.length) {
                return cls.isArray() ? Hw(cls.getComponentType(), z).aj() : VH(cls, z);
            }
            if (cls == clsArr[i]) {
                return g3[i];
            }
            i++;
        }
    }

    public static ClassNode VH(Class cls, boolean z) {
        if (cls.isArray()) {
            return VH(cls.getComponentType(), z).aj();
        }
        ClassNode classNodeV5 = v5(cls);
        if (z) {
            return classNodeV5;
        }
        ClassNode classNodeGn = gn(cls.getName());
        classNodeGn.yO(classNodeV5);
        return classNodeGn;
    }

    public static ClassNode Zo(Class cls) {
        return VH(cls, true);
    }

    public static ClassNode gn(String str) {
        ClassNode classNode = new ClassNode(str, 1, FH);
        classNode.iW = false;
        return classNode;
    }

    public static ClassNode j6(ClassNode classNode) {
        ClassNode classNodeOW = classNode.OW();
        return !DW(classNodeOW) ? classNodeOW : classNodeOW == J8 ? vy : classNodeOW == QX ? a8 : classNodeOW == Ws ? yS : classNodeOW == j3 ? lg : classNodeOW == XL ? rN : classNodeOW == aM ? er : classNodeOW == U2 ? gW : classNodeOW == Mr ? BT : classNodeOW == Hw ? SI : classNodeOW;
    }

    public static ClassNode v5(Class cls) {
        ClassNode classNode;
        SoftReference<ClassNode> softReferenceHw = ClassHelperCache.j6.Hw(cls);
        if (softReferenceHw != null && (classNode = softReferenceHw.get()) != null) {
            return classNode;
        }
        ClassNode classNode2 = new ClassNode(cls);
        ClassHelperCache.j6.Zo(cls, new SoftReference<>(classNode2));
        VMPluginFactory.DW().DW(classNode2);
        return classNode2;
    }
}
