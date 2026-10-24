package com.aide.codemodel.language.java;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.abstraction.FormatOption;
import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
@cy(clazz = 1094776438864368000L, container = 1094776438864368000L, user = true)
/* loaded from: classes.dex */
public final class JavaFormatOption implements FormatOption {

    @dy(field = -1096680774912437880L)
    public static final JavaFormatOption ADJUST_NEWLINES;

    @dy(field = -4089888624421160112L)
    public static final JavaFormatOption ADJUST_SPACES;

    @gy
    private static /* synthetic */ boolean AE;

    @dy(field = -3528441522065343240L)
    public static final JavaFormatOption ARGUMENTCOMMA_SPACE;

    @dy(field = 2204319240796560679L)
    public static final JavaFormatOption ARGUMENT_INDENT;

    @dy(field = 2208734312584983111L)
    public static final JavaFormatOption ARGUMENT_SPACE;

    @dy(field = -6942493305195166584L)
    public static final JavaFormatOption ARRAYARGUMENT_SPACE;

    @dy(field = -2625259941156597304L)
    public static final JavaFormatOption ARRAYMETHODCALL_SPACE;

    @dy(field = 1656123507491380587L)
    public static final JavaFormatOption ARRAY_INDENT;

    @dy(field = -9927375108120991L)
    public static final JavaFormatOption ASSIGNMENTOPERATOR_SPACE;

    @dy(field = -6323187233167371175L)
    public static final JavaFormatOption BINARYOPERATOR_SPACE;

    @dy(field = -211993827593602941L)
    public static final JavaFormatOption BLOCK_INDENT;

    @dy(field = -3957796410362581277L)
    public static final JavaFormatOption BLOCK_NEWLINE;

    @fy
    private static /* synthetic */ boolean BR;

    @dy(field = -4401625701597234221L)
    public static final JavaFormatOption BRACE_INDENT;

    @dy(field = 3955669189959584487L)
    public static final JavaFormatOption BRACE_SPACE;

    @dy(field = 3163556901967236800L)
    public static final JavaFormatOption CASELABEL_INDENT;

    @dy(field = -1036272236450010560L)
    public static final JavaFormatOption CASE_INDENT;

    @dy(field = -4752945741823863727L)
    public static final JavaFormatOption CATCH_NEWLINE;

    @dy(field = -1644830647311413079L)
    public static final JavaFormatOption CONDITION_SPACE;

    @dy(field = -693420301670610383L)
    public static final JavaFormatOption ELSE_NEWLINE;

    @dy(field = 2604060660808706877L)
    public static final JavaFormatOption FINALLY_NEWLINE;

    @dy(field = -4732263699719269275L)
    public static final JavaFormatOption KEYWORD_SPACE;

    @dy(field = -2505988858971461955L)
    public static final JavaFormatOption LABELLEFT_INDENT;

    @dy(field = 5568695923087265319L)
    public static final JavaFormatOption METHODCALL_SPACE;

    @dy(field = -4964249913126793744L)
    public static final JavaFormatOption METHODNAME_SPACE;

    @dy(field = -664287323002496159L)
    public static final JavaFormatOption METHOD_NEWLINE;

    @dy(field = -2807127941341533023L)
    public static final JavaFormatOption NEXTLINE_INDENT;

    @dy(field = 928327632025838415L)
    private static final /* synthetic */ JavaFormatOption[] Nh;

    @dy(field = 2520890773277628960L)
    public static final JavaFormatOption PARAMETERCOMMA_SPACE;

    @dy(field = 5784225454904108197L)
    public static final JavaFormatOption PARAMETER_INDENT;

    @dy(field = -1655948655177147079L)
    public static final JavaFormatOption PARAMETER_SPACE;

    @dy(field = 47036926190060640L)
    public static final JavaFormatOption PAREN_SPACE;

    @dy(field = -2114306712461458583L)
    public static final JavaFormatOption STATEMENT_WRAP;

    @dy(field = -4393515063248269680L)
    public static final JavaFormatOption TYPE_NEWLINE;

    @dy(field = 3166734490585680477L)
    private final String WB;

    @dy(field = 2510358480665559783L)
    private final String fY;

    @dy(field = 2510266931594833500L)
    private final String jw;

    @dy(field = -1406229274031606336L)
    private final String mb;

    static {
        try {
            iy.Zo(JavaFormatOption.class);
            if (BR) {
                iy.gn(540383953189207412L, null);
            }
            BLOCK_INDENT = new JavaFormatOption("BLOCK_INDENT", 0, "Java indentation options", "Indent block contents", "public void f()\n{\n    int i;\n}", "public void f()\n{\nint i;\n}");
            ARRAY_INDENT = new JavaFormatOption("ARRAY_INDENT", 1, "Java indentation options", "Indent array initializer", "int[] arr = new int[]\n{\n    1\n};", "int[] arr = new int[]\n{\n1\n};");
            BRACE_INDENT = new JavaFormatOption("BRACE_INDENT", 2, "Java indentation options", "Indent open and close brace", "public void f()\n    {\n        int i;\n    }", "public void f()\n{\n    int i;\n}");
            CASE_INDENT = new JavaFormatOption("CASE_INDENT", 3, "Java indentation options", "Indent case contents", "switch (x)\n{\n    case 10:\n        return 5;\n}", "switch (x)\n{\n    case 10:\n    return 5;\n}");
            CASELABEL_INDENT = new JavaFormatOption("CASELABEL_INDENT", 4, "Java indentation options", "Indent case labels", "switch (x)\n{\n    case 10:\n        return 5;\n}", "switch (x)\n{\ncase 10:\n    return 5;\n}");
            LABELLEFT_INDENT = new JavaFormatOption("LABELLEFT_INDENT", 5, "Java indentation options", "Indent goto labels in leftmost column", "    goto L;\nL:\n    return;", "    goto L;\n    L:\n    return;");
            NEXTLINE_INDENT = new JavaFormatOption("NEXTLINE_INDENT", 6, "Java indentation options", "Indent lines in multi line statements", "int i = 10 +\n    20;", "int i = 10 +\n20;");
            ARGUMENT_INDENT = new JavaFormatOption("ARGUMENT_INDENT", 7, "Java indentation options", "Align arguments", "System.out.println(\"\",\n                  20);", "System.out.println(\"\",\n    20);");
            PARAMETER_INDENT = new JavaFormatOption("PARAMETER_INDENT", 8, "Java indentation options", "Align parameters", "void foo(int i,\n         int j)\n{\n}", "void foo(int i,\n    int j)\n{\n}");
            ADJUST_NEWLINES = new JavaFormatOption("ADJUST_NEWLINES", 9, "Java new line options", "Adjust lines on autoformat", "", "");
            TYPE_NEWLINE = new JavaFormatOption("TYPE_NEWLINE", 10, "Java new line options", "Place open brace on new line for types", "public class C\n{\n    //...\n}", "public class C {\n    //...\n}");
            METHOD_NEWLINE = new JavaFormatOption("METHOD_NEWLINE", 11, "Java new line options", "Place open brace on new line for methods", "public void f()\n{\n    //...\n}", "public void f() {\n    //...\n}");
            BLOCK_NEWLINE = new JavaFormatOption("BLOCK_NEWLINE", 12, "Java new line options", "Place open brace on new line for control blocks", "public void f()\n{\n    if (a < b)\n    {\n    }\n}", "public void f()\n{\n    if (a < b) {\n    }\n}");
            ELSE_NEWLINE = new JavaFormatOption("ELSE_NEWLINE", 13, "Java new line options", "Place \"else\" on new line", "if (i == 10) {\n    return 10;\n}\nelse {\n    return 0;\n}", "if (i == 10) {\n    return 10;\n} else {\n    return 0;\n}");
            CATCH_NEWLINE = new JavaFormatOption("CATCH_NEWLINE", 14, "Java new line options", "Place \"catch\" on new line", "try {\n}\ncatch {\n}", "try {\n} catch {\n}");
            FINALLY_NEWLINE = new JavaFormatOption("FINALLY_NEWLINE", 15, "Java new line options", "Place \"finally\" on new line", "try {\n}\nfinally {\n}", "try {\n} finally {\n}");
            STATEMENT_WRAP = new JavaFormatOption("STATEMENT_WRAP", 16, "Java wrapping options", "Place statement in a new line if it doesn't fit", "int i;\ni = 10;", "int i; i = 10;");
            ADJUST_SPACES = new JavaFormatOption("ADJUST_SPACES", 17, "Java spacing options", "Adjust spaces on autoformat", "", "");
            BRACE_SPACE = new JavaFormatOption("BRACE_SPACE", 18, "Java spacing options", "Insert space before open brace", "public class C {\n    //...\n}", "public class C{\n    //...\n}");
            METHODNAME_SPACE = new JavaFormatOption("METHODNAME_SPACE", 19, "Java spacing options", "Insert space before parameters", "public void f ()\n{\n}", "public void f()\n{\n}");
            PARAMETER_SPACE = new JavaFormatOption("PARAMETER_SPACE", 20, "Java spacing options", "Insert space within parameter parentheses", "public void f( int i )\n{\n}", "public void f(int i)\n{\n}");
            PARAMETERCOMMA_SPACE = new JavaFormatOption("PARAMETERCOMMA_SPACE", 21, "Java spacing options", "Insert space after each parameter", "public void f(int i, int j)\n{\n}", "public void f(int i,int j)\n{\n}");
            KEYWORD_SPACE = new JavaFormatOption("KEYWORD_SPACE", 22, "Java spacing options", "Insert space after keywords", "if (a == b) return 0;", "if(a == b) return 0;");
            CONDITION_SPACE = new JavaFormatOption("CONDITION_SPACE", 23, "Java spacing options", "Insert space within statement parentheses", "if ( a == b ) return 0;", "if (a == b) return 0;");
            PAREN_SPACE = new JavaFormatOption("PAREN_SPACE", 24, "Java spacing options", "Insert space within parentheses", "int i = ( 10 + 20 ) * 5;", "int i = (10 + 20) * 5;");
            METHODCALL_SPACE = new JavaFormatOption("METHODCALL_SPACE", 25, "Java spacing options", "Insert space before arguments", "System.out.println (10);", "System.out.println(10);");
            ARGUMENT_SPACE = new JavaFormatOption("ARGUMENT_SPACE", 26, "Java spacing options", "Insert space within argument parentheses", "System.out.println( 10 );", "System.out.println(10);");
            ARGUMENTCOMMA_SPACE = new JavaFormatOption("ARGUMENTCOMMA_SPACE", 27, "Java spacing options", "Insert space after each argument", "System.out.println(\"\", 20);", "System.out.println(\"\",20);");
            ARRAYMETHODCALL_SPACE = new JavaFormatOption("ARRAYMETHODCALL_SPACE", 28, "Java spacing options", "Insert space before array brackets", "int i = ai [10];", "int i = ai[10];");
            ARRAYARGUMENT_SPACE = new JavaFormatOption("ARRAYARGUMENT_SPACE", 29, "Java spacing options", "Insert space within array brackets", "int i = ai[ 10 ];", "int i = ai[10];");
            BINARYOPERATOR_SPACE = new JavaFormatOption("BINARYOPERATOR_SPACE", 30, "Java spacing options", "Insert space around binary operator ", "int i;\ni = 10 + 20;", "int i;\ni = 10+20;");
            JavaFormatOption javaFormatOption = new JavaFormatOption("ASSIGNMENTOPERATOR_SPACE", 31, "Java spacing options", "Insert space around assignment operator ", "int i;\ni = 10;", "int i;\ni=10;");
            ASSIGNMENTOPERATOR_SPACE = javaFormatOption;
            Nh = new JavaFormatOption[]{BLOCK_INDENT, ARRAY_INDENT, BRACE_INDENT, CASE_INDENT, CASELABEL_INDENT, LABELLEFT_INDENT, NEXTLINE_INDENT, ARGUMENT_INDENT, PARAMETER_INDENT, ADJUST_NEWLINES, TYPE_NEWLINE, METHOD_NEWLINE, BLOCK_NEWLINE, ELSE_NEWLINE, CATCH_NEWLINE, FINALLY_NEWLINE, STATEMENT_WRAP, ADJUST_SPACES, BRACE_SPACE, METHODNAME_SPACE, PARAMETER_SPACE, PARAMETERCOMMA_SPACE, KEYWORD_SPACE, CONDITION_SPACE, PAREN_SPACE, METHODCALL_SPACE, ARGUMENT_SPACE, ARGUMENTCOMMA_SPACE, ARRAYMETHODCALL_SPACE, ARRAYARGUMENT_SPACE, BINARYOPERATOR_SPACE, javaFormatOption};
        } catch (Throwable th) {
            if (AE) {
                iy.aM(th, 540383953189207412L, null);
            }
            throw th;
        }
    }

    @ey(method = 578015623927348331L)
    private JavaFormatOption(String str, int i, String str2, String str3, String str4, String str5) {
        try {
            if (BR) {
                iy.QX(-952426344348692451L, null, new Object[]{str, new Integer(i), str2, str3, str4, str5});
            }
            this.WB = str2;
            this.mb = str3;
            this.jw = str4;
            this.fY = str5;
        } catch (Throwable th) {
            if (AE) {
                iy.rN(th, -952426344348692451L, null, new Object[]{str, new Integer(i), str2, str3, str4, str5});
            }
            throw th;
        }
    }

    @ey(method = 4928509135470191895L)
    public static Set<JavaFormatOption> j6() {
        try {
            if (BR) {
                iy.gn(-2382857888498655073L, null);
            }
            HashSet hashSet = new HashSet();
            hashSet.add(ADJUST_NEWLINES);
            hashSet.add(ADJUST_SPACES);
            hashSet.add(TYPE_NEWLINE);
            hashSet.add(METHOD_NEWLINE);
            hashSet.add(BLOCK_NEWLINE);
            hashSet.add(ELSE_NEWLINE);
            hashSet.add(CATCH_NEWLINE);
            hashSet.add(FINALLY_NEWLINE);
            hashSet.add(STATEMENT_WRAP);
            hashSet.add(PARAMETERCOMMA_SPACE);
            hashSet.add(KEYWORD_SPACE);
            hashSet.add(BRACE_SPACE);
            hashSet.add(ARGUMENTCOMMA_SPACE);
            hashSet.add(BINARYOPERATOR_SPACE);
            hashSet.add(ASSIGNMENTOPERATOR_SPACE);
            hashSet.add(BLOCK_INDENT);
            hashSet.add(ARRAY_INDENT);
            hashSet.add(CASE_INDENT);
            hashSet.add(CASELABEL_INDENT);
            hashSet.add(ARGUMENT_INDENT);
            hashSet.add(PARAMETER_INDENT);
            hashSet.add(NEXTLINE_INDENT);
            return hashSet;
        } catch (Throwable th) {
            if (AE) {
                iy.aM(th, -2382857888498655073L, null);
            }
            throw th;
        }
    }

    @ey(method = 1265984235997715424L)
    public static JavaFormatOption valueOf(String str) {
        try {
            if (BR) {
                iy.tp(607260265734887704L, null, str);
            }
            return (JavaFormatOption) Enum.valueOf(JavaFormatOption.class, str);
        } catch (Throwable th) {
            if (AE) {
                iy.j3(th, 607260265734887704L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -2452104263900856216L)
    public static JavaFormatOption[] values() {
        try {
            if (BR) {
                iy.gn(-1218289662645334608L, null);
            }
            return (JavaFormatOption[]) Nh.clone();
        } catch (Throwable th) {
            if (AE) {
                iy.aM(th, -1218289662645334608L, null);
            }
            throw th;
        }
    }

    @ey(method = 3918358534851162792L)
    public String DW() {
        try {
            if (BR) {
                iy.gn(-2151561888893471040L, this);
            }
            return this.WB;
        } catch (Throwable th) {
            if (AE) {
                iy.aM(th, -2151561888893471040L, this);
            }
            throw th;
        }
    }

    @ey(method = -2907621467162442613L)
    public String FH() {
        try {
            if (BR) {
                iy.gn(-1631640819500988725L, this);
            }
            return "java_" + name();
        } catch (Throwable th) {
            if (AE) {
                iy.aM(th, -1631640819500988725L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.FormatOption
    @ey(method = 2486074521281352645L)
    public String getName() {
        try {
            if (BR) {
                iy.gn(2838098658412436101L, this);
            }
            return this.mb;
        } catch (Throwable th) {
            if (AE) {
                iy.aM(th, 2838098658412436101L, this);
            }
            throw th;
        }
    }

    @ey(method = 1670970256863669783L)
    public String v5(boolean z) {
        try {
            if (BR) {
                iy.Ws(-475037024865059425L, this, z);
            }
            return z ? this.jw : this.fY;
        } catch (Throwable th) {
            if (AE) {
                iy.j3(th, -475037024865059425L, this, new Boolean(z));
            }
            throw th;
        }
    }
}
