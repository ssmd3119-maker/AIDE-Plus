package org.codehaus.groovy.ast.tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import org.codehaus.groovy.ast.ClassHelper;
import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.ast.GenericsType;
import org.codehaus.groovy.ast.MethodNode;

/* loaded from: classes.dex */
public class WideningCategories {

    public static class LowestUpperBoundClassNode extends ClassNode {
        private static final Comparator<ClassNode> a5 = new Comparator<ClassNode>() { // from class: org.codehaus.groovy.ast.tools.WideningCategories.LowestUpperBoundClassNode.1
            @Override // java.util.Comparator
            /* renamed from: j6, reason: merged with bridge method [inline-methods] */
            public int compare(ClassNode classNode, ClassNode classNode2) {
                return (classNode instanceof LowestUpperBoundClassNode ? ((LowestUpperBoundClassNode) classNode).aX : classNode.getName()).compareTo(classNode2 instanceof LowestUpperBoundClassNode ? ((LowestUpperBoundClassNode) classNode2).aX : classNode2.getName());
            }
        };
        private final ClassNode QO;
        private final String aX;
        private final String e9;
        private final ClassNode oy;
        private final ClassNode[] sM;

        public LowestUpperBoundClassNode(String str, ClassNode classNode, ClassNode... classNodeArr) {
            super(str, 17, classNode, classNodeArr, null);
            this.QO = classNode;
            this.sM = classNodeArr;
            Arrays.sort(classNodeArr, a5);
            this.oy = (!classNode.equals(ClassHelper.FH) || classNodeArr.length <= 0) ? classNode : classNodeArr[0];
            this.aX = str;
            boolean zQq = classNode.Qq();
            LinkedList<GenericsType[]> linkedList = new LinkedList();
            linkedList.add(classNode.nw());
            int length = classNodeArr.length;
            int i = 0;
            while (i < length) {
                ClassNode classNode2 = classNodeArr[i];
                boolean zQq2 = zQq | classNode2.Qq();
                linkedList.add(classNode2.nw());
                for (MethodNode methodNode : classNode2.KD()) {
                    a8(methodNode.getName(), methodNode.a8(), methodNode.er(), methodNode.lg(), methodNode.Mr(), methodNode.j3()).Ws(classNode2);
                }
                i++;
                zQq = zQq2;
            }
            jJ(zQq);
            if (zQq) {
                ArrayList arrayList = new ArrayList();
                for (GenericsType[] genericsTypeArr : linkedList) {
                    if (genericsTypeArr != null) {
                        Collections.addAll(arrayList, genericsTypeArr);
                    }
                }
                XX((GenericsType[]) arrayList.toArray(new GenericsType[arrayList.size()]));
            }
            StringBuilder sb = new StringBuilder();
            if (!classNode.equals(ClassHelper.FH)) {
                sb.append(classNode.getName());
            }
            for (ClassNode classNode3 : classNodeArr) {
                if (sb.length() > 0) {
                    sb.append(" or ");
                }
                sb.append(classNode3.getName());
            }
            this.e9 = sb.toString();
        }

        @Override // org.codehaus.groovy.ast.ClassNode
        public Class Sf() {
            return this.oy.Sf();
        }

        @Override // org.codehaus.groovy.ast.ClassNode
        public String ef() {
            return this.e9;
        }

        @Override // org.codehaus.groovy.ast.ClassNode
        public String getName() {
            return this.oy.getName();
        }

        @Override // org.codehaus.groovy.ast.ClassNode
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.aX;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // org.codehaus.groovy.ast.ClassNode
        public ClassNode sG() {
            ClassNode[] classNodeArr = this.sM;
            ClassNode[] classNodeArr2 = classNodeArr == null ? null : new ClassNode[classNodeArr.length];
            if (classNodeArr2 != null) {
                int i = 0;
                while (true) {
                    ClassNode[] classNodeArr3 = this.sM;
                    if (i >= classNodeArr3.length) {
                        break;
                    }
                    classNodeArr2[i] = classNodeArr3[i].sG();
                    i++;
                }
            }
            return new LowestUpperBoundClassNode(this.aX, this.QO.sG(), classNodeArr2);
        }
    }

    static {
        Collections.emptyList();
        Collections.unmodifiableMap(new HashMap<ClassNode, Integer>() { // from class: org.codehaus.groovy.ast.tools.WideningCategories.1
            {
                put(ClassHelper.Mr, 0);
                put(ClassHelper.U2, 1);
                put(ClassHelper.aM, 2);
                put(ClassHelper.XL, 3);
                put(ClassHelper.j3, 4);
                put(ClassHelper.QX, 5);
            }
        });
        new Comparator<ClassNode>() { // from class: org.codehaus.groovy.ast.tools.WideningCategories.2
            @Override // java.util.Comparator
            /* renamed from: j6, reason: merged with bridge method [inline-methods] */
            public int compare(ClassNode classNode, ClassNode classNode2) {
                int length = classNode.SI().length;
                int length2 = classNode2.SI().length;
                if (length > length2) {
                    return -1;
                }
                if (length < length2) {
                    return 1;
                }
                int size = classNode.KD().size();
                int size2 = classNode2.KD().size();
                if (size > size2) {
                    return -1;
                }
                if (size < size2) {
                    return 1;
                }
                return classNode.getName().compareTo(classNode2.getName());
            }
        };
    }
}
