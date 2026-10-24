package org.codehaus.groovy.tools;

import groovy.lang.Closure;
import groovy.lang.Script;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

/* loaded from: classes.dex */
public class GrapeMain extends Script {
    private static /* synthetic */ SoftReference Zo;
    Object DW;
    Object FH;
    Object Hw;
    Object j6;
    Object v5;

    class _closure1 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public _closure1(Object obj, Object obj2) {
            super(obj, obj2);
            FH();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "size";
            strArr[1] = "size";
            strArr[2] = "println";
            strArr[3] = "size";
            strArr[4] = "size";
            strArr[5] = "println";
            strArr[6] = "size";
            strArr[7] = "getAt";
            strArr[8] = "size";
            strArr[9] = "getAt";
            strArr[10] = "size";
            strArr[11] = "getAt";
            strArr[12] = "size";
            strArr[13] = "getAt";
            strArr[14] = "getInstance";
            strArr[15] = "setupLogging";
            strArr[16] = "each";
            strArr[17] = "getOptionValues";
            strArr[18] = "grab";
            strArr[19] = "getAt";
            strArr[20] = "getAt";
            strArr[21] = "println";
            strArr[22] = "ex";
            strArr[23] = "doCall";
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
            String[] strArr = new String[24];
            DW(strArr);
            return new CallSiteArray(_closure1.class, strArr);
        }
    }

    public class _closure1_closure9 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "addResolver";
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
            return new CallSiteArray(_closure1_closure9.class, strArr);
        }
    }

    class _closure2 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public _closure2(Object obj, Object obj2) {
            super(obj, obj2);
            FH();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "size";
            strArr[1] = "println";
            strArr[2] = "size";
            strArr[3] = "println";
            strArr[4] = "getAt";
            strArr[5] = "getAt";
            strArr[6] = "getAt";
            strArr[7] = "getInstance";
            strArr[8] = "setupLogging";
            strArr[9] = "find";
            strArr[10] = "enumerateGrapes";
            strArr[11] = "println";
            strArr[12] = "findAll";
            strArr[13] = "enumerateGrapes";
            strArr[14] = "println";
            strArr[15] = "each";
            strArr[16] = "uninstallArtifact";
            strArr[17] = "instance";
            strArr[18] = "doCall";
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
            String[] strArr = new String[19];
            DW(strArr);
            return new CallSiteArray(_closure2.class, strArr);
        }
    }

    public class _closure2_closure10 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "any";
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
            return new CallSiteArray(_closure2_closure10.class, strArr);
        }
    }

    public class _closure2_closure10_closure13 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "doCall";
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
            String[] strArr = new String[1];
            DW(strArr);
            return new CallSiteArray(_closure2_closure10_closure13.class, strArr);
        }
    }

    public class _closure2_closure11 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "any";
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
            return new CallSiteArray(_closure2_closure11.class, strArr);
        }
    }

    public class _closure2_closure11_closure14 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "contains";
            strArr[1] = "contains";
            strArr[2] = "contains";
            strArr[3] = "contains";
            strArr[4] = "contains";
            strArr[5] = "contains";
            strArr[6] = "contains";
            strArr[7] = "contains";
            strArr[8] = "doCall";
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
            String[] strArr = new String[9];
            DW(strArr);
            return new CallSiteArray(_closure2_closure11_closure14.class, strArr);
        }
    }

    public class _closure2_closure12 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "println";
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
            return new CallSiteArray(_closure2_closure12.class, strArr);
        }
    }

    class _closure3 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public _closure3(Object obj, Object obj2) {
            super(obj, obj2);
            FH();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "println";
            strArr[1] = "getInstance";
            strArr[2] = "setupLogging";
            strArr[3] = "each";
            strArr[4] = "enumerateGrapes";
            strArr[5] = "println";
            strArr[6] = "println";
            strArr[7] = "println";
            strArr[8] = "doCall";
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
            String[] strArr = new String[9];
            DW(strArr);
            return new CallSiteArray(_closure3.class, strArr);
        }
    }

    public class _closure3_closure15 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "each";
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
            return new CallSiteArray(_closure3_closure15.class, strArr);
        }
    }

    public class _closure3_closure15_closure16 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "println";
            strArr[1] = "next";
            strArr[2] = "plus";
            strArr[3] = "size";
            strArr[4] = "doCall";
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
            String[] strArr = new String[5];
            DW(strArr);
            return new CallSiteArray(_closure3_closure15_closure16.class, strArr);
        }
    }

    class _closure4 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public _closure4(Object obj, Object obj2) {
            super(obj, obj2);
            FH();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "<$constructor$>";
            strArr[1] = "addOption";
            strArr[2] = "create";
            strArr[3] = "withLongOpt";
            strArr[4] = "hasArg";
            strArr[5] = "addOption";
            strArr[6] = "create";
            strArr[7] = "withLongOpt";
            strArr[8] = "hasArg";
            strArr[9] = "addOption";
            strArr[10] = "create";
            strArr[11] = "withLongOpt";
            strArr[12] = "hasArg";
            strArr[13] = "addOption";
            strArr[14] = "create";
            strArr[15] = "withLongOpt";
            strArr[16] = "hasArg";
            strArr[17] = "parse";
            strArr[18] = "<$constructor$>";
            strArr[19] = "getAt";
            strArr[20] = "args";
            strArr[21] = "getInstance";
            strArr[22] = "setupLogging";
            strArr[23] = "MSG_ERR";
            strArr[24] = "mod";
            strArr[25] = "size";
            strArr[26] = "println";
            strArr[27] = "mod";
            strArr[28] = "size";
            strArr[29] = "println";
            strArr[30] = "size";
            strArr[31] = "args";
            strArr[32] = "println";
            strArr[33] = "size";
            strArr[34] = "args";
            strArr[35] = "println";
            strArr[36] = "hasOption";
            strArr[37] = "hasOption";
            strArr[38] = "hasOption";
            strArr[39] = "hasOption";
            strArr[40] = "iterator";
            strArr[41] = "leftShift";
            strArr[42] = "hasNext";
            strArr[43] = "iter";
            strArr[44] = "add";
            strArr[45] = "next";
            strArr[46] = "iter";
            strArr[47] = "next";
            strArr[48] = "iter";
            strArr[49] = "next";
            strArr[50] = "iter";
            strArr[51] = "resolve";
            strArr[52] = "iterator";
            strArr[53] = "scheme";
            strArr[54] = "plus";
            strArr[55] = "path";
            strArr[56] = "<$constructor$>";
            strArr[57] = "plus";
            strArr[58] = "toASCIIString";
            strArr[59] = "each";
            strArr[60] = "iterator";
            strArr[61] = "scheme";
            strArr[62] = "plus";
            strArr[63] = "path";
            strArr[64] = "<$constructor$>";
            strArr[65] = "plus";
            strArr[66] = "toASCIIString";
            strArr[67] = "each";
            strArr[68] = "println";
            strArr[69] = "join";
            strArr[70] = "println";
            strArr[71] = "println";
            strArr[72] = "message";
            strArr[73] = "message";
            strArr[74] = "println";
            strArr[75] = "doCall";
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
            String[] strArr = new String[76];
            DW(strArr);
            return new CallSiteArray(_closure4.class, strArr);
        }
    }

    public class _closure4_closure17 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "plus";
            strArr[1] = "plus";
            strArr[2] = "plus";
            strArr[3] = "plus";
            strArr[4] = "plus";
            strArr[5] = "plus";
            strArr[6] = "group";
            strArr[7] = "module";
            strArr[8] = "revision";
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
            String[] strArr = new String[9];
            DW(strArr);
            return new CallSiteArray(_closure4_closure17.class, strArr);
        }
    }

    class _closure5 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public _closure5(Object obj, Object obj2) {
            super(obj, obj2);
            FH();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "grapeHelp";
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
            return new CallSiteArray(_closure5.class, strArr);
        }
    }

    class _closure6 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public _closure6(Object obj, Object obj2) {
            super(obj, obj2);
            FH();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "plus";
            strArr[1] = "length";
            strArr[2] = "max";
            strArr[3] = "keySet";
            strArr[4] = "commands";
            strArr[5] = "multiply";
            strArr[6] = "<$constructor$>";
            strArr[7] = "out";
            strArr[8] = "variables";
            strArr[9] = "binding";
            strArr[10] = "out";
            strArr[11] = "printHelp";
            strArr[12] = "<$constructor$>";
            strArr[13] = "options";
            strArr[14] = "flush";
            strArr[15] = "println";
            strArr[16] = "println";
            strArr[17] = "each";
            strArr[18] = "commands";
            strArr[19] = "println";
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
            String[] strArr = new String[20];
            DW(strArr);
            return new CallSiteArray(_closure6.class, strArr);
        }
    }

    public class _closure6_closure18 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "length";
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
            String[] strArr = new String[1];
            DW(strArr);
            return new CallSiteArray(_closure6_closure18.class, strArr);
        }
    }

    public class _closure6_closure19 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "println";
            strArr[1] = "substring";
            strArr[2] = "plus";
            strArr[3] = "shortHelp";
            strArr[4] = "doCall";
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
            String[] strArr = new String[5];
            DW(strArr);
            return new CallSiteArray(_closure6_closure19.class, strArr);
        }
    }

    class _closure7 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public _closure7(Object obj, Object obj2) {
            super(obj, obj2);
            FH();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "hasOption";
            strArr[1] = "cmd";
            strArr[2] = "setDefaultLogger";
            strArr[3] = "<$constructor$>";
            strArr[4] = "MSG_ERR";
            strArr[5] = "hasOption";
            strArr[6] = "cmd";
            strArr[7] = "setDefaultLogger";
            strArr[8] = "<$constructor$>";
            strArr[9] = "MSG_WARN";
            strArr[10] = "hasOption";
            strArr[11] = "cmd";
            strArr[12] = "setDefaultLogger";
            strArr[13] = "<$constructor$>";
            strArr[14] = "MSG_INFO";
            strArr[15] = "hasOption";
            strArr[16] = "cmd";
            strArr[17] = "setDefaultLogger";
            strArr[18] = "<$constructor$>";
            strArr[19] = "MSG_VERBOSE";
            strArr[20] = "hasOption";
            strArr[21] = "cmd";
            strArr[22] = "setDefaultLogger";
            strArr[23] = "<$constructor$>";
            strArr[24] = "MSG_DEBUG";
            strArr[25] = "setDefaultLogger";
            strArr[26] = "<$constructor$>";
            strArr[27] = "doCall";
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
            String[] strArr = new String[28];
            DW(strArr);
            return new CallSiteArray(_closure7.class, strArr);
        }
    }

    public class _run_closure8 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference j6;

        static {
            Hw();
        }

        private static /* synthetic */ void DW(String[] strArr) {
            strArr[0] = "split";
            strArr[1] = "getAt";
            strArr[2] = "getAt";
            strArr[3] = "setProperty";
            strArr[4] = "doCall";
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
            String[] strArr = new String[5];
            DW(strArr);
            return new CallSiteArray(_run_closure8.class, strArr);
        }
    }

    static {
        Hw();
        Long l = 0L;
        l.longValue();
        Long l2 = 1402495627935L;
        l2.longValue();
    }

    public GrapeMain() {
        CallSite[] callSiteArrFH = FH();
        this.j6 = new _closure1(this, this);
        this.DW = new _closure2(this, this);
        this.FH = new _closure3(this, this);
        this.Hw = new _closure4(this, this);
        this.v5 = new _closure5(this, this);
        ScriptBytecodeAdapter.createMap(new Object[]{"install", ScriptBytecodeAdapter.createMap(new Object[]{"closure", this.j6, "shortHelp", "Installs a particular grape"}), "uninstall", ScriptBytecodeAdapter.createMap(new Object[]{"closure", this.DW, "shortHelp", "Uninstalls a particular grape (non-transitively removes the respective jar file from the grape cache)"}), "list", ScriptBytecodeAdapter.createMap(new Object[]{"closure", this.FH, "shortHelp", "Lists all installed grapes"}), "resolve", ScriptBytecodeAdapter.createMap(new Object[]{"closure", this.Hw, "shortHelp", "Enumerates the jars used by a grape"}), "help", ScriptBytecodeAdapter.createMap(new Object[]{"closure", this.v5, "shortHelp", "Usage information"})});
        new _closure6(this, this);
        new _closure7(this, this);
    }

    private static /* synthetic */ void DW(String[] strArr) {
        strArr[0] = "<$constructor$>";
        strArr[1] = "<$constructor$>";
        strArr[2] = "runScript";
        strArr[3] = "addOption";
        strArr[4] = "create";
        strArr[5] = "withArgName";
        strArr[6] = "hasArg";
        strArr[7] = "withDescription";
        strArr[8] = "withLongOpt";
        strArr[9] = "addOption";
        strArr[10] = "create";
        strArr[11] = "withArgName";
        strArr[12] = "hasArg";
        strArr[13] = "withDescription";
        strArr[14] = "withLongOpt";
        strArr[15] = "addOption";
        strArr[16] = "create";
        strArr[17] = "withLongOpt";
        strArr[18] = "withDescription";
        strArr[19] = "hasArg";
        strArr[20] = "addOptionGroup";
        strArr[21] = "addOption";
        strArr[22] = "addOption";
        strArr[23] = "addOption";
        strArr[24] = "addOption";
        strArr[25] = "addOption";
        strArr[26] = "<$constructor$>";
        strArr[27] = "create";
        strArr[28] = "withLongOpt";
        strArr[29] = "withDescription";
        strArr[30] = "hasArg";
        strArr[31] = "create";
        strArr[32] = "withLongOpt";
        strArr[33] = "withDescription";
        strArr[34] = "hasArg";
        strArr[35] = "create";
        strArr[36] = "withLongOpt";
        strArr[37] = "withDescription";
        strArr[38] = "hasArg";
        strArr[39] = "create";
        strArr[40] = "withLongOpt";
        strArr[41] = "withDescription";
        strArr[42] = "hasArg";
        strArr[43] = "create";
        strArr[44] = "withLongOpt";
        strArr[45] = "withDescription";
        strArr[46] = "hasArg";
        strArr[47] = "addOption";
        strArr[48] = "create";
        strArr[49] = "withLongOpt";
        strArr[50] = "withDescription";
        strArr[51] = "hasArg";
        strArr[52] = "parse";
        strArr[53] = "<$constructor$>";
        strArr[54] = "args";
        strArr[55] = "hasOption";
        strArr[56] = "call";
        strArr[57] = "hasOption";
        strArr[58] = "getVersion";
        strArr[59] = "println";
        strArr[60] = "getProperty";
        strArr[61] = "each";
        strArr[62] = "getOptionValues";
        strArr[63] = "args";
        strArr[64] = "length";
        strArr[65] = "call";
        strArr[66] = "containsKey";
        strArr[67] = "getAt";
        strArr[68] = "closure";
        strArr[69] = "getAt";
        strArr[70] = "getAt";
        strArr[71] = "println";
        strArr[72] = "getAt";
        strArr[73] = "length";
        strArr[74] = "call";
        strArr[75] = "containsKey";
        strArr[76] = "closure";
        strArr[77] = "getAt";
        strArr[78] = "println";
    }

    private static /* synthetic */ CallSite[] FH() {
        CallSiteArray callSiteArrayJ6;
        SoftReference softReference = Zo;
        if (softReference == null || (callSiteArrayJ6 = (CallSiteArray) softReference.get()) == null) {
            callSiteArrayJ6 = j6();
            Zo = new SoftReference(callSiteArrayJ6);
        }
        return callSiteArrayJ6.array;
    }

    public static /* synthetic */ void Hw() {
        FH();
        Zo = null;
    }

    private static /* synthetic */ CallSiteArray j6() {
        String[] strArr = new String[79];
        DW(strArr);
        return new CallSiteArray(GrapeMain.class, strArr);
    }
}
