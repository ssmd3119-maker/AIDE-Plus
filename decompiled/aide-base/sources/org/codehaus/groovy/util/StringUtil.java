package org.codehaus.groovy.util;

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
public class StringUtil implements GroovyObject {
    private static /* synthetic */ SoftReference DW;
    private static /* synthetic */ ClassInfo j6;

    public class _expandHyphen_closure2 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "join";
            strArr[1] = "doCall";
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
            return new CallSiteArray(_expandHyphen_closure2.class, strArr);
        }
    }

    public class _tr_closure1 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "contains";
            strArr[1] = "getAt";
            strArr[2] = "lastIndexOf";
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
            return new CallSiteArray(_tr_closure1.class, strArr);
        }
    }

    static {
        v5();
        Long l = 0L;
        l.longValue();
        Long l2 = 1402495627145L;
        l2.longValue();
    }

    public StringUtil() {
        FH();
        Hw();
    }

    private static /* synthetic */ void DW(String[] strArr) {
        strArr[0] = "expandHyphen";
        strArr[1] = "expandHyphen";
        strArr[2] = "padRight";
        strArr[3] = "size";
        strArr[4] = "getAt";
        strArr[5] = "minus";
        strArr[6] = "size";
        strArr[7] = "join";
        strArr[8] = "collect";
        strArr[9] = "contains";
        strArr[10] = "replaceAll";
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
        String[] strArr = new String[11];
        DW(strArr);
        return new CallSiteArray(StringUtil.class, strArr);
    }

    public static /* synthetic */ void v5() {
        FH();
        DW = null;
    }

    protected /* synthetic */ MetaClass Hw() {
        if (StringUtil.class != StringUtil.class) {
            return ScriptBytecodeAdapter.initMetaClass(this);
        }
        ClassInfo classInfoEQ = j6;
        if (classInfoEQ == null) {
            classInfoEQ = ClassInfo.EQ(StringUtil.class);
            j6 = classInfoEQ;
        }
        return classInfoEQ.J0();
    }
}
