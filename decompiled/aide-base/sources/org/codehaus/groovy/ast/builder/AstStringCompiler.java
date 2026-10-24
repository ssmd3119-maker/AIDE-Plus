package org.codehaus.groovy.ast.builder;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
public class AstStringCompiler implements GroovyObject {
    private static /* synthetic */ SoftReference DW;
    private static /* synthetic */ ClassInfo j6;

    public class _compile_closure1 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "statementBlock";
            strArr[1] = "add";
            strArr[2] = "statementBlock";
            strArr[3] = "each";
            strArr[4] = "classes";
            strArr[5] = "doCall";
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
            String[] strArr = new String[6];
            DW(strArr);
            return new CallSiteArray(_compile_closure1.class, strArr);
        }
    }

    public class _compile_closure1_closure2 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
            strArr[1] = "leftShift";
            strArr[2] = AppMeasurementSdk.ConditionalUserProperty.NAME;
            strArr[3] = "leftShift";
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
            String[] strArr = new String[4];
            DW(strArr);
            return new CallSiteArray(_compile_closure1_closure2.class, strArr);
        }
    }

    static {
        v5();
        Long l = 0L;
        l.longValue();
        Long l2 = 1402495627465L;
        l2.longValue();
    }

    public AstStringCompiler() {
        FH();
        Hw();
    }

    private static /* synthetic */ void DW(String[] strArr) {
        strArr[0] = "plus";
        strArr[1] = "currentTimeMillis";
        strArr[2] = "<$constructor$>";
        strArr[3] = "<$constructor$>";
        strArr[4] = "plus";
        strArr[5] = "<$constructor$>";
        strArr[6] = "DEFAULT";
        strArr[7] = "codeSource";
        strArr[8] = "addSource";
        strArr[9] = "getName";
        strArr[10] = "compile";
        strArr[11] = "getPhaseNumber";
        strArr[12] = "inject";
        strArr[13] = "modules";
        strArr[14] = "ast";
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
        String[] strArr = new String[15];
        DW(strArr);
        return new CallSiteArray(AstStringCompiler.class, strArr);
    }

    public static /* synthetic */ void v5() {
        FH();
        DW = null;
    }

    protected /* synthetic */ MetaClass Hw() {
        if (AstStringCompiler.class != AstStringCompiler.class) {
            return ScriptBytecodeAdapter.initMetaClass(this);
        }
        ClassInfo classInfoEQ = j6;
        if (classInfoEQ == null) {
            classInfoEQ = ClassInfo.EQ(AstStringCompiler.class);
            j6 = classInfoEQ;
        }
        return classInfoEQ.J0();
    }
}
