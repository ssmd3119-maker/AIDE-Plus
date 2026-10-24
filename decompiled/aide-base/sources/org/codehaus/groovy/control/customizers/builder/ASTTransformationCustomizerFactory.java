package org.codehaus.groovy.control.customizers.builder;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.util.AbstractFactory;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

/* loaded from: classes.dex */
public class ASTTransformationCustomizerFactory extends AbstractFactory implements GroovyObject {
    private static /* synthetic */ SoftReference DW;
    private static /* synthetic */ ClassInfo j6;

    static {
        v5();
        Long l = 0L;
        l.longValue();
        Long l2 = 1402495627795L;
        l2.longValue();
    }

    public ASTTransformationCustomizerFactory() {
        FH();
        Hw();
    }

    private static /* synthetic */ void DW(String[] strArr) {
        strArr[0] = "<$constructor$>";
        strArr[1] = "<$constructor$>";
    }

    private static /* synthetic */ CallSite[] FH() {
        CallSiteArray callSiteArrayJ6;
        SoftReference softReference = DW;
        if (softReference == null || (callSiteArrayJ6 = (CallSiteArray) softReference.get()) == null) {
            callSiteArrayJ6 = j6();
            DW = new SoftReference(callSiteArrayJ6);
        }
        return callSiteArrayJ6.array;
    }

    private static /* synthetic */ CallSiteArray j6() {
        String[] strArr = new String[2];
        DW(strArr);
        return new CallSiteArray(ASTTransformationCustomizerFactory.class, strArr);
    }

    public static /* synthetic */ void v5() {
        FH();
        DW = null;
    }

    protected /* synthetic */ MetaClass Hw() {
        if (ASTTransformationCustomizerFactory.class != ASTTransformationCustomizerFactory.class) {
            return ScriptBytecodeAdapter.initMetaClass(this);
        }
        ClassInfo classInfoEQ = j6;
        if (classInfoEQ == null) {
            classInfoEQ = ClassInfo.EQ(ASTTransformationCustomizerFactory.class);
            j6 = classInfoEQ;
        }
        return classInfoEQ.J0();
    }
}
