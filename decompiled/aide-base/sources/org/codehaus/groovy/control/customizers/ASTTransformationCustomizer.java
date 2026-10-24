package org.codehaus.groovy.control.customizers;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.transform.CompilationUnitAware;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

/* loaded from: classes.dex */
public class ASTTransformationCustomizer extends CompilationCustomizer implements CompilationUnitAware, GroovyObject {
    private static /* synthetic */ SoftReference DW;

    public class _setAnnotationParameters_closure1 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "getMethod";
            strArr[1] = "classNode";
            strArr[2] = "annotationNode";
            strArr[3] = "<$constructor$>";
            strArr[4] = AppMeasurementSdk.ConditionalUserProperty.NAME;
            strArr[5] = "classNode";
            strArr[6] = "annotationNode";
            strArr[7] = "<$constructor$>";
            strArr[8] = "plus";
            strArr[9] = "setLineNumber";
            strArr[10] = "setLastLineNumber";
            strArr[11] = "addMember";
            strArr[12] = "annotationNode";
            strArr[13] = "addMember";
            strArr[14] = "annotationNode";
            strArr[15] = "<$constructor$>";
            strArr[16] = "make";
            strArr[17] = "addMember";
            strArr[18] = "annotationNode";
            strArr[19] = "<$constructor$>";
            strArr[20] = "collect";
            strArr[21] = "addMember";
            strArr[22] = "annotationNode";
            strArr[23] = "<$constructor$>";
            strArr[24] = "doCall";
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
            String[] strArr = new String[25];
            DW(strArr);
            return new CallSiteArray(_setAnnotationParameters_closure1.class, strArr);
        }
    }

    public class _setAnnotationParameters_closure1_closure2 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "<$constructor$>";
            strArr[1] = "make";
            strArr[2] = "<$constructor$>";
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
            String[] strArr = new String[3];
            DW(strArr);
            return new CallSiteArray(_setAnnotationParameters_closure1_closure2.class, strArr);
        }
    }

    static {
        v5();
        Long l = 0L;
        l.longValue();
        Long l2 = 1402495627913L;
        l2.longValue();
    }

    private static /* synthetic */ CallSiteArray DW() {
        String[] strArr = new String[71];
        FH(strArr);
        return new CallSiteArray(ASTTransformationCustomizer.class, strArr);
    }

    private static /* synthetic */ void FH(String[] strArr) {
        strArr[0] = "findPhase";
        strArr[1] = "findASTTranformationClass";
        strArr[2] = "newInstance";
        strArr[3] = "<$constructor$>";
        strArr[4] = "make";
        strArr[5] = "classLoader";
        strArr[6] = "findPhase";
        strArr[7] = "findASTTranformationClass";
        strArr[8] = "newInstance";
        strArr[9] = "<$constructor$>";
        strArr[10] = "make";
        strArr[11] = "setAnnotationParameters";
        strArr[12] = "classLoader";
        strArr[13] = "findPhase";
        strArr[14] = "findASTTranformationClass";
        strArr[15] = "newInstance";
        strArr[16] = "<$constructor$>";
        strArr[17] = "make";
        strArr[18] = "classLoader";
        strArr[19] = "findPhase";
        strArr[20] = "findPhase";
        strArr[21] = "findASTTranformationClass";
        strArr[22] = "newInstance";
        strArr[23] = "<$constructor$>";
        strArr[24] = "make";
        strArr[25] = "setAnnotationParameters";
        strArr[26] = "classLoader";
        strArr[27] = "setAnnotationParameters";
        strArr[28] = "getAnnotation";
        strArr[29] = "<$constructor$>";
        strArr[30] = "<$constructor$>";
        strArr[31] = "classes";
        strArr[32] = AppMeasurementSdk.ConditionalUserProperty.VALUE;
        strArr[33] = "plus";
        strArr[34] = "length";
        strArr[35] = "length";
        strArr[36] = "<$constructor$>";
        strArr[37] = "plus";
        strArr[38] = "length";
        strArr[39] = "length";
        strArr[40] = "<$constructor$>";
        strArr[41] = "getAt";
        strArr[42] = "forName";
        strArr[43] = "getAt";
        strArr[44] = "classLoader";
        strArr[45] = "forName";
        strArr[46] = "classLoader";
        strArr[47] = "forName";
        strArr[48] = "classLoader";
        strArr[49] = "<$constructor$>";
        strArr[50] = "<$constructor$>";
        strArr[51] = "class";
        strArr[52] = "getAnnotation";
        strArr[53] = "<$constructor$>";
        strArr[54] = "plus";
        strArr[55] = AppMeasurementSdk.ConditionalUserProperty.NAME;
        strArr[56] = "<$constructor$>";
        strArr[57] = "plus";
        strArr[58] = AppMeasurementSdk.ConditionalUserProperty.NAME;
        strArr[59] = "phase";
        strArr[60] = "findASTTranformationClass";
        strArr[61] = "findPhase";
        strArr[62] = "newInstance";
        strArr[63] = "findASTTranformationClass";
        strArr[64] = "findPhase";
        strArr[65] = "newInstance";
        strArr[66] = "each";
        strArr[67] = "visit";
        strArr[68] = "visit";
        strArr[69] = "visit";
        strArr[70] = "visit";
    }

    private static /* synthetic */ CallSite[] Hw() {
        CallSiteArray callSiteArrayDW;
        SoftReference softReference = DW;
        if (softReference == null || (callSiteArrayDW = (CallSiteArray) softReference.get()) == null) {
            callSiteArrayDW = DW();
            DW = new SoftReference(callSiteArrayDW);
        }
        return callSiteArrayDW.array;
    }

    public static /* synthetic */ void v5() {
        Hw();
        DW = null;
    }
}
