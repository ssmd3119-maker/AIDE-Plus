package org.codehaus.groovy.ast.builder;

import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

/* loaded from: classes.dex */
public class AstBuilder implements GroovyObject {
    private static /* synthetic */ SoftReference DW;
    private static /* synthetic */ ClassInfo j6;

    public class _buildFromBlock_closure1 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "getAt";
            strArr[1] = "statements";
        }

        private static /* synthetic */ CallSite[] FH() {
            CallSiteArray callSiteArrayJ6;
            SoftReference softReference = j6;
            if (softReference == null || (callSiteArrayJ6 = (CallSiteArray) softReference.get()) == null) {
                callSiteArrayJ6 = j6();
                j6 = new SoftReference(callSiteArrayJ6);
            }
            return callSiteArrayJ6.array;
        }

        public static /* synthetic */ void Hw() {
            FH();
            j6 = null;
        }

        private static /* synthetic */ CallSiteArray j6() {
            String[] strArr = new String[2];
            DW(strArr);
            return new CallSiteArray(_buildFromBlock_closure1.class, strArr);
        }
    }

    static {
        v5();
        Long l = 0L;
        l.longValue();
        Long l2 = 1402495627495L;
        l2.longValue();
    }

    public AstBuilder() {
        FH();
        Hw();
    }

    private static /* synthetic */ void DW(String[] strArr) {
        strArr[0] = "<$constructor$>";
        strArr[1] = "trim";
        strArr[2] = "<$constructor$>";
        strArr[3] = "trim";
        strArr[4] = "<$constructor$>";
        strArr[5] = "compile";
        strArr[6] = "<$constructor$>";
        strArr[7] = "trim";
        strArr[8] = "<$constructor$>";
        strArr[9] = "trim";
        strArr[10] = "<$constructor$>";
        strArr[11] = "plus";
        strArr[12] = "currentTimeMillis";
        strArr[13] = "compile";
        strArr[14] = "<$constructor$>";
        strArr[15] = "collect";
        strArr[16] = "<$constructor$>";
        strArr[17] = "<$constructor$>";
        strArr[18] = "<$constructor$>";
        strArr[19] = "expression";
        strArr[20] = "CLASS_GENERATION";
        strArr[21] = "CLASS_GENERATION";
        strArr[22] = "CLASS_GENERATION";
        strArr[23] = "CLASS_GENERATION";
        strArr[24] = "CLASS_GENERATION";
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
        String[] strArr = new String[25];
        DW(strArr);
        return new CallSiteArray(AstBuilder.class, strArr);
    }

    public static /* synthetic */ void v5() {
        FH();
        DW = null;
    }

    protected /* synthetic */ MetaClass Hw() {
        if (AstBuilder.class != AstBuilder.class) {
            return ScriptBytecodeAdapter.initMetaClass(this);
        }
        ClassInfo classInfoEQ = j6;
        if (classInfoEQ == null) {
            classInfoEQ = ClassInfo.EQ(AstBuilder.class);
            j6 = classInfoEQ;
        }
        return classInfoEQ.J0();
    }
}
