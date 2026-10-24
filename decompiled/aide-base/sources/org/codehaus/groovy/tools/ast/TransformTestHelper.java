package org.codehaus.groovy.tools.ast;

import groovy.lang.GroovyObject;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

/* loaded from: classes.dex */
public class TransformTestHelper implements GroovyObject {
    private static /* synthetic */ SoftReference j6;

    static {
        Hw();
        Long l = 0L;
        l.longValue();
        Long l2 = 1402495627510L;
        l2.longValue();
    }

    private static /* synthetic */ void DW(String[] strArr) {
        strArr[0] = "<$constructor$>";
        strArr[1] = "parseClass";
        strArr[2] = "<$constructor$>";
        strArr[3] = "parseClass";
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
        return new CallSiteArray(TransformTestHelper.class, strArr);
    }
}
