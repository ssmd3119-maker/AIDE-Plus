package org.codehaus.groovy.vmplugin.v5;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import org.codehaus.groovy.GroovyBugError;
import org.codehaus.groovy.ast.AnnotatedNode;
import org.codehaus.groovy.ast.AnnotationNode;
import org.codehaus.groovy.ast.ClassHelper;
import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.ast.CompileUnit;
import org.codehaus.groovy.ast.FieldNode;
import org.codehaus.groovy.ast.GenericsType;
import org.codehaus.groovy.ast.MethodNode;
import org.codehaus.groovy.ast.PackageNode;
import org.codehaus.groovy.ast.Parameter;
import org.codehaus.groovy.ast.expr.ClassExpression;
import org.codehaus.groovy.ast.expr.ConstantExpression;
import org.codehaus.groovy.ast.expr.Expression;
import org.codehaus.groovy.ast.expr.ListExpression;
import org.codehaus.groovy.ast.expr.PropertyExpression;
import org.codehaus.groovy.ast.stmt.ReturnStatement;
import org.codehaus.groovy.vmplugin.VMPlugin;

/* loaded from: classes.dex */
public class Java5 implements VMPlugin {

    /* renamed from: org.codehaus.groovy.vmplugin.v5.Java5$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] DW;
        static final /* synthetic */ int[] j6;

        static {
            int[] iArr = new int[ElementType.values().length];
            DW = iArr;
            try {
                iArr[ElementType.TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DW[ElementType.CONSTRUCTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DW[ElementType.METHOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DW[ElementType.FIELD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                DW[ElementType.PARAMETER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                DW[ElementType.LOCAL_VARIABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                DW[ElementType.ANNOTATION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                DW[ElementType.PACKAGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[RetentionPolicy.values().length];
            j6 = iArr2;
            try {
                iArr2[RetentionPolicy.RUNTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                j6[RetentionPolicy.SOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                j6[RetentionPolicy.CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private GenericsType EQ(TypeVariable typeVariable) {
        GenericsType genericsType;
        ClassNode classNodeWe = we(typeVariable);
        ClassNode classNodeOW = classNodeWe.OW();
        classNodeWe.yO(null);
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length == 0) {
            genericsType = new GenericsType(classNodeWe);
        } else {
            GenericsType genericsType2 = new GenericsType(classNodeWe, J0(bounds), null);
            genericsType2.aM(classNodeWe.getName());
            genericsType2.j3(true);
            genericsType = genericsType2;
        }
        classNodeWe.yO(classNodeOW);
        return genericsType;
    }

    private Expression FH(Object obj) {
        if (obj == null || (obj instanceof String) || (obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean)) {
            return new ConstantExpression(obj);
        }
        if (obj instanceof Class) {
            return new ClassExpression(ClassHelper.Zo((Class) obj));
        }
        if (!obj.getClass().isArray()) {
            return null;
        }
        ListExpression listExpression = new ListExpression();
        int length = Array.getLength(obj);
        for (int i = 0; i != length; i++) {
            listExpression.j3(FH(Array.get(obj, i)));
        }
        return listExpression;
    }

    private void Hw(AnnotationNode annotationNode, Annotation annotation) throws SecurityException {
        Method[] declaredMethods;
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        if (clsAnnotationType == Retention.class) {
            RetentionPolicy retentionPolicyValue = ((Retention) annotation).value();
            lg(retentionPolicyValue, annotationNode);
            annotationNode.J8(AppMeasurementSdk.ConditionalUserProperty.VALUE, new PropertyExpression(new ClassExpression(ClassHelper.VH(RetentionPolicy.class, false)), retentionPolicyValue.toString()));
            return;
        }
        if (clsAnnotationType == Target.class) {
            ElementType[] elementTypeArrValue = ((Target) annotation).value();
            ListExpression listExpression = new ListExpression();
            for (ElementType elementType : elementTypeArrValue) {
                listExpression.j3(new PropertyExpression(new ClassExpression(ClassHelper.vJ), elementType.name()));
            }
            annotationNode.J8(AppMeasurementSdk.ConditionalUserProperty.VALUE, listExpression);
            return;
        }
        try {
            declaredMethods = clsAnnotationType.getDeclaredMethods();
        } catch (SecurityException unused) {
            declaredMethods = new Method[0];
        }
        for (Method method : declaredMethods) {
            try {
                Expression expressionFH = FH(method.invoke(annotation, new Object[0]));
                if (expressionFH != null) {
                    annotationNode.J8(method.getName(), expressionFH);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }

    private ClassNode[] J0(Type[] typeArr) {
        if (typeArr.length == 0) {
            return null;
        }
        ClassNode[] classNodeArr = new ClassNode[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            classNodeArr[i] = gn(typeArr[i]);
        }
        return classNodeArr;
    }

    private ClassNode J8(WildcardType wildcardType) {
        ClassNode classNodeGn = ClassHelper.gn("?");
        classNodeGn.yO(ClassHelper.FH);
        ClassNode[] classNodeArrJ0 = J0(wildcardType.getLowerBounds());
        GenericsType genericsType = new GenericsType(classNodeGn, J0(wildcardType.getUpperBounds()), classNodeArrJ0 != null ? classNodeArrJ0[0] : null);
        genericsType.Mr(true);
        ClassNode classNodeVH = ClassHelper.VH(Object.class, false);
        classNodeVH.XX(new GenericsType[]{genericsType});
        return classNodeVH;
    }

    private void Mr(Annotation[] annotationArr, AnnotatedNode annotatedNode) throws SecurityException {
        for (Annotation annotation : annotationArr) {
            AnnotationNode annotationNode = new AnnotationNode(ClassHelper.FH(annotation.annotationType()));
            Hw(annotationNode, annotation);
            annotatedNode.EQ(annotationNode);
        }
    }

    private ClassNode[] QX(CompileUnit compileUnit, Type[] typeArr, Class[] clsArr) {
        int length = typeArr.length;
        ClassNode[] classNodeArr = new ClassNode[length];
        for (int i = 0; i < length; i++) {
            classNodeArr[i] = Ws(compileUnit, typeArr[i], clsArr[i]);
        }
        return classNodeArr;
    }

    private void U2(ClassNode classNode) {
        classNode.XX(tp(classNode.Sf().getTypeParameters()));
    }

    private ClassNode VH(ParameterizedType parameterizedType) {
        ClassNode classNodeGn = gn(parameterizedType.getRawType());
        classNodeGn.XX(u7(parameterizedType.getActualTypeArguments()));
        return classNodeGn;
    }

    private ClassNode Ws(CompileUnit compileUnit, Type type, Class cls) {
        ClassNode classNodeDW = compileUnit != null ? compileUnit.DW(cls.getName()) : null;
        if (classNodeDW == null) {
            classNodeDW = ClassHelper.FH(cls);
        }
        if (type instanceof Class) {
            return classNodeDW.sG();
        }
        ClassNode classNodeGn = gn(type);
        classNodeGn.yO(classNodeDW);
        return classNodeGn;
    }

    private void XL(CompileUnit compileUnit, ClassNode classNode, Class cls) {
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces.length == 0) {
            classNode.kQ(ClassNode.pN);
            return;
        }
        ClassNode[] classNodeArr = new ClassNode[genericInterfaces.length];
        for (int i = 0; i < genericInterfaces.length; i++) {
            Type type = genericInterfaces[i];
            while (!(type instanceof Class)) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType == type) {
                    throw new GroovyBugError("Cannot transform generic signature of " + cls + " with generic interface " + genericInterfaces[i] + " to a class.");
                }
                type = rawType;
            }
            classNodeArr[i] = Ws(compileUnit, genericInterfaces[i], (Class) type);
        }
        classNode.kQ(classNodeArr);
    }

    private ClassNode Zo(GenericArrayType genericArrayType) {
        return gn(genericArrayType.getGenericComponentType()).aj();
    }

    private void a8(MethodNode methodNode, Method method) {
        Object defaultValue = method.getDefaultValue();
        ConstantExpression constantExpression = ConstantExpression.AL;
        if (defaultValue != null) {
            constantExpression = new ConstantExpression(defaultValue);
        }
        methodNode.nw(new ReturnStatement(constantExpression));
        methodNode.ei(true);
    }

    private Parameter aM(CompileUnit compileUnit, Type type, Class cls, Annotation[] annotationArr, int i) throws SecurityException {
        Parameter parameter = new Parameter(Ws(compileUnit, type, cls), "param" + i);
        Mr(annotationArr, parameter);
        return parameter;
    }

    private ClassNode gn(Type type) {
        if (type instanceof WildcardType) {
            return J8((WildcardType) type);
        }
        if (type instanceof ParameterizedType) {
            return VH((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return Zo((GenericArrayType) type);
        }
        if (type instanceof TypeVariable) {
            return we((TypeVariable) type);
        }
        if (type instanceof Class) {
            return v5((Class) type);
        }
        if (type == null) {
            throw new GroovyBugError("Type is null. Most probably you let a transform reuse existing ClassNodes with generics information, that is now used in a wrong context.");
        }
        throw new GroovyBugError("unknown type: " + type + " := " + type.getClass());
    }

    private Parameter[] j3(CompileUnit compileUnit, Type[] typeArr, Class[] clsArr, Annotation[][] annotationArr) {
        Parameter[] parameterArr = Parameter.hK;
        if (typeArr.length <= 0) {
            return parameterArr;
        }
        int length = typeArr.length;
        Parameter[] parameterArr2 = new Parameter[length];
        for (int i = 0; i < length; i++) {
            parameterArr2[i] = aM(compileUnit, typeArr[i], clsArr[i], annotationArr[i], i);
        }
        return parameterArr2;
    }

    private void lg(RetentionPolicy retentionPolicy, AnnotationNode annotationNode) {
        int i = AnonymousClass1.j6[retentionPolicy.ordinal()];
        if (i == 1) {
            annotationNode.Ws(true);
            return;
        }
        if (i == 2) {
            annotationNode.QX(true);
        } else {
            if (i == 3) {
                annotationNode.EQ(true);
                return;
            }
            throw new GroovyBugError("unsupported Retention " + retentionPolicy);
        }
    }

    private GenericsType[] tp(TypeVariable[] typeVariableArr) {
        if (typeVariableArr.length == 0) {
            return null;
        }
        GenericsType[] genericsTypeArr = new GenericsType[typeVariableArr.length];
        for (int i = 0; i < typeVariableArr.length; i++) {
            genericsTypeArr[i] = EQ(typeVariableArr[i]);
        }
        return genericsTypeArr;
    }

    private GenericsType[] u7(Type[] typeArr) {
        if (typeArr.length == 0) {
            return null;
        }
        GenericsType[] genericsTypeArr = new GenericsType[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            ClassNode classNodeGn = gn(typeArr[i]);
            if (typeArr[i] instanceof WildcardType) {
                genericsTypeArr[i] = classNodeGn.nw()[0];
            } else {
                genericsTypeArr[i] = new GenericsType(classNodeGn);
            }
        }
        return genericsTypeArr;
    }

    private ClassNode v5(Class cls) {
        return cls.isPrimitive() ? ClassHelper.FH(cls) : ClassHelper.VH(cls, false);
    }

    private ClassNode we(TypeVariable typeVariable) {
        ClassNode classNodeGn = ClassHelper.gn(typeVariable.getName());
        classNodeGn.br(true);
        ClassNode classNodeGn2 = ClassHelper.gn(typeVariable.getName());
        classNodeGn2.br(true);
        classNodeGn.XX(new GenericsType[]{new GenericsType(classNodeGn2)});
        classNodeGn.yO(ClassHelper.FH);
        return classNodeGn;
    }

    @Override // org.codehaus.groovy.vmplugin.VMPlugin
    public void DW(ClassNode classNode) {
        U2(classNode);
    }

    @Override // org.codehaus.groovy.vmplugin.VMPlugin
    public void j6(CompileUnit compileUnit, ClassNode classNode) throws SecurityException {
        try {
            Class clsSf = classNode.Sf();
            for (Field field : clsSf.getDeclaredFields()) {
                FieldNode fieldNode = new FieldNode(field.getName(), field.getModifiers(), Ws(compileUnit, field.getGenericType(), field.getType()), classNode, null);
                Mr(field.getAnnotations(), fieldNode);
                classNode.Mr(fieldNode);
            }
            for (Method method : clsSf.getDeclaredMethods()) {
                MethodNode methodNode = new MethodNode(method.getName(), method.getModifiers(), Ws(compileUnit, method.getGenericReturnType(), method.getReturnType()), j3(compileUnit, method.getGenericParameterTypes(), method.getParameterTypes(), method.getParameterAnnotations()), QX(compileUnit, method.getGenericExceptionTypes(), method.getExceptionTypes()), null);
                methodNode.QX(method.isSynthetic());
                a8(methodNode, method);
                Mr(method.getAnnotations(), methodNode);
                methodNode.SI(tp(method.getTypeParameters()));
                classNode.lg(methodNode);
            }
            for (Constructor<?> constructor : clsSf.getDeclaredConstructors()) {
                classNode.aM(constructor.getModifiers(), j3(compileUnit, constructor.getGenericParameterTypes(), constructor.getParameterTypes(), constructor.getParameterAnnotations()), QX(compileUnit, constructor.getGenericExceptionTypes(), constructor.getExceptionTypes()), null);
            }
            Class superclass = clsSf.getSuperclass();
            if (superclass != null) {
                classNode.XG(Ws(compileUnit, clsSf.getGenericSuperclass(), superclass));
            }
            XL(compileUnit, classNode, clsSf);
            Mr(classNode.Sf().getAnnotations(), classNode);
            PackageNode packageNodeDx = classNode.dx();
            if (packageNodeDx != null) {
                Mr(classNode.Sf().getPackage().getAnnotations(), packageNodeDx);
            }
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError("Unable to load class " + classNode.wc(false) + " due to missing dependency " + e.getMessage());
        }
    }
}
