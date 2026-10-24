package com.aide.codemodel.language.js;

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
@cy(clazz = 5387811553541438620L, container = 5387811553541438620L, user = true)
/* loaded from: classes.dex */
public final class JavaScriptFormatterOption implements FormatOption {

    @dy(field = 1444469962163064032L)
    public static final JavaScriptFormatterOption ADJUST_NEWLINES;

    @dy(field = 3609904200487876720L)
    public static final JavaScriptFormatterOption ADJUST_SPACES;

    @dy(field = 3911369425466757184L)
    public static final JavaScriptFormatterOption ARGUMENTCOMMA_SPACE;

    @dy(field = 4453446923394455043L)
    public static final JavaScriptFormatterOption ARGUMENT_INDENT;

    @dy(field = -4650538986725273565L)
    public static final JavaScriptFormatterOption ARGUMENT_SPACE;

    @dy(field = 780360350676497400L)
    public static final JavaScriptFormatterOption ARRAYARGUMENT_SPACE;

    @dy(field = 5997854431309816576L)
    public static final JavaScriptFormatterOption ARRAYMETHODCALL_SPACE;

    @dy(field = 2283144389371039775L)
    public static final JavaScriptFormatterOption ARRAY_INDENT;

    @dy(field = -6558599296008471019L)
    public static final JavaScriptFormatterOption ASSIGNMENTOPERATOR_SPACE;

    @dy(field = 4383860417871286941L)
    public static final JavaScriptFormatterOption BINARYOPERATOR_SPACE;

    @dy(field = 589262510609644103L)
    public static final JavaScriptFormatterOption BLOCK_INDENT;

    @dy(field = 3708264098671226655L)
    public static final JavaScriptFormatterOption BLOCK_NEWLINE;

    @dy(field = -3199235288362828305L)
    public static final JavaScriptFormatterOption BRACE_INDENT;

    @dy(field = 1492992155088544275L)
    public static final JavaScriptFormatterOption BRACE_SPACE;

    @dy(field = 4650897351517331280L)
    public static final JavaScriptFormatterOption CASELABEL_INDENT;

    @dy(field = -3004802388592122832L)
    public static final JavaScriptFormatterOption CASE_INDENT;

    @dy(field = 2967913393269815085L)
    public static final JavaScriptFormatterOption CATCH_NEWLINE;

    @dy(field = 934549904405051421L)
    public static final JavaScriptFormatterOption CONDITION_SPACE;

    @dy(field = 158429162624044893L)
    public static final JavaScriptFormatterOption ELSE_NEWLINE;

    @dy(field = 4816841250934983817L)
    public static final JavaScriptFormatterOption FINALLY_NEWLINE;

    @dy(field = -3908345256791336892L)
    public static final JavaScriptFormatterOption FUNCTION_NEWLINE;

    @dy(field = -1266516422484370965L)
    private static final /* synthetic */ JavaScriptFormatterOption[] IS;

    @dy(field = 3070659253276195441L)
    public static final JavaScriptFormatterOption KEYWORD_SPACE;

    @dy(field = -529437986544521535L)
    public static final JavaScriptFormatterOption LABELLEFT_INDENT;

    @dy(field = -4286409785484745797L)
    public static final JavaScriptFormatterOption METHODCALL_SPACE;

    @dy(field = -114916174009232115L)
    public static final JavaScriptFormatterOption NEXTLINE_INDENT;

    @gy
    private static /* synthetic */ boolean Nh;

    @dy(field = -1465804844956865664L)
    public static final JavaScriptFormatterOption PARAMETERCOMMA_SPACE;

    @dy(field = -4108752177206374863L)
    public static final JavaScriptFormatterOption PARAMETER_INDENT;

    @dy(field = 921693816029477621L)
    public static final JavaScriptFormatterOption PARAMETER_SPACE;

    @dy(field = -2041566913906028064L)
    public static final JavaScriptFormatterOption PAREN_SPACE;

    @dy(field = 1370011232313634565L)
    public static final JavaScriptFormatterOption STATEMENT_WRAP;

    @fy
    private static /* synthetic */ boolean gG;

    @dy(field = 3566469282052884865L)
    private final String WB;

    @dy(field = -2857896594869363701L)
    private final String fY;

    @dy(field = -2857780174885238668L)
    private final String jw;

    @dy(field = -434101750134906240L)
    private final String mb;

    static {
        try {
            iy.Zo(JavaScriptFormatterOption.class);
            if (gG) {
                iy.gn(-115988211802466091L, null);
            }
            BLOCK_INDENT = new JavaScriptFormatterOption("BLOCK_INDENT", 0, "JavaScript indentation options", "Indent block contents", "{\n    foo();\n}", "{\nfoo();\n}");
            ARRAY_INDENT = new JavaScriptFormatterOption("ARRAY_INDENT", 1, "JavaScript indentation options", "Indent array/object initializer", "[\n    1\n];", "[\n1\n];");
            BRACE_INDENT = new JavaScriptFormatterOption("BRACE_INDENT", 2, "JavaScript indentation options", "Indent open and close brace", "    {\n        foo();\n    }", "{\n    foo();\n}");
            CASE_INDENT = new JavaScriptFormatterOption("CASE_INDENT", 3, "JavaScript indentation options", "Indent case contents", "switch (x)\n{\n    case 10:\n        return 5;\n}", "switch (x)\n{\n    case 10:\n    return 5;\n}");
            CASELABEL_INDENT = new JavaScriptFormatterOption("CASELABEL_INDENT", 4, "JavaScript indentation options", "Indent case labels", "switch (x)\n{\n    case 10:\n        return 5;\n}", "switch (x)\n{\ncase 10:\n    return 5;\n}");
            LABELLEFT_INDENT = new JavaScriptFormatterOption("LABELLEFT_INDENT", 5, "JavaScript indentation options", "Indent goto labels in leftmost column", "    goto L;\nL:\n    return;", "    goto L;\n    L:\n    return;");
            NEXTLINE_INDENT = new JavaScriptFormatterOption("NEXTLINE_INDENT", 6, "JavaScript indentation options", "Indent lines in multi line statements", "i = 10 +\n    20;", "i = 10 +\n20;");
            ARGUMENT_INDENT = new JavaScriptFormatterOption("ARGUMENT_INDENT", 7, "JavaScript indentation options", "Align arguments", "println(\"\",\n                  20);", "println(\"\",\n    20);");
            PARAMETER_INDENT = new JavaScriptFormatterOption("PARAMETER_INDENT", 8, "JavaScript indentation options", "Align parameters", "foo(i,\n         j)\n{\n}", "foo(i,\n    j)\n{\n}");
            ADJUST_NEWLINES = new JavaScriptFormatterOption("ADJUST_NEWLINES", 9, "JavaScript new line options", "Adjust lines on autoformat", "", "");
            BLOCK_NEWLINE = new JavaScriptFormatterOption("BLOCK_NEWLINE", 10, "JavaScript new line options", "Place open brace on new line for control blocks", "{\n    if (a < b)\n    {\n    }\n}", "{\n    if (a < b) {\n    }\n}");
            FUNCTION_NEWLINE = new JavaScriptFormatterOption("FUNCTION_NEWLINE", 11, "JavaScript new line options", "Place open brace on new line for functions", "function()\n{\n}", "function() {\n}");
            ELSE_NEWLINE = new JavaScriptFormatterOption("ELSE_NEWLINE", 12, "JavaScript new line options", "Place \"else\" on new line", "if (i == 10) {\n    return 10;\n}\nelse {\n    return 0;\n}", "if (i == 10) {\n    return 10;\n} else {\n    return 0;\n}");
            CATCH_NEWLINE = new JavaScriptFormatterOption("CATCH_NEWLINE", 13, "JavaScript new line options", "Place \"catch\" on new line", "try {\n}\ncatch {\n}", "try {\n} catch {\n}");
            FINALLY_NEWLINE = new JavaScriptFormatterOption("FINALLY_NEWLINE", 14, "JavaScript new line options", "Place \"finally\" on new line", "try {\n}\nfinally {\n}", "try {\n} finally {\n}");
            STATEMENT_WRAP = new JavaScriptFormatterOption("STATEMENT_WRAP", 15, "JavaScript wrapping options", "Place statement in a new line if it doesn't fit", "var i = 0;\ni = 10;", "var i = 0; i = 10;");
            ADJUST_SPACES = new JavaScriptFormatterOption("ADJUST_SPACES", 16, "JavaScript spacing options", "Adjust spaces on autoformat", "", "");
            BRACE_SPACE = new JavaScriptFormatterOption("BRACE_SPACE", 17, "JavaScript spacing options", "Insert space before open brace", "if (true) {\n    //...\n}", "if (true){\n    //...\n}");
            PARAMETER_SPACE = new JavaScriptFormatterOption("PARAMETER_SPACE", 18, "JavaScript spacing options", "Insert space within parameter parentheses", "function f( i )\n{\n}", "function f(i)\n{\n}");
            PARAMETERCOMMA_SPACE = new JavaScriptFormatterOption("PARAMETERCOMMA_SPACE", 19, "JavaScript spacing options", "Insert space after each parameter", "function f(i, j)\n{\n}", "function f(i,j)\n{\n}");
            KEYWORD_SPACE = new JavaScriptFormatterOption("KEYWORD_SPACE", 20, "JavaScript spacing options", "Insert space after keywords", "if (a == b) return 0;", "if(a == b) return 0;");
            CONDITION_SPACE = new JavaScriptFormatterOption("CONDITION_SPACE", 21, "JavaScript spacing options", "Insert space within statement parentheses", "if ( a == b ) return 0;", "if (a == b) return 0;");
            PAREN_SPACE = new JavaScriptFormatterOption("PAREN_SPACE", 22, "JavaScript spacing options", "Insert space within parentheses", "i = ( 10 + 20 ) * 5;", "i = (10 + 20) * 5;");
            METHODCALL_SPACE = new JavaScriptFormatterOption("METHODCALL_SPACE", 23, "JavaScript spacing options", "Insert space before arguments", "println (10);", "println(10);");
            ARGUMENT_SPACE = new JavaScriptFormatterOption("ARGUMENT_SPACE", 24, "JavaScript spacing options", "Insert space within argument parentheses", "println( 10 );", "println(10);");
            ARGUMENTCOMMA_SPACE = new JavaScriptFormatterOption("ARGUMENTCOMMA_SPACE", 25, "JavaScript spacing options", "Insert space after each argument", "println(\"\", 20);", "println(\"\",20);");
            ARRAYMETHODCALL_SPACE = new JavaScriptFormatterOption("ARRAYMETHODCALL_SPACE", 26, "JavaScript spacing options", "Insert space before array brackets", "i = ai [10];", "i = ai[10];");
            ARRAYARGUMENT_SPACE = new JavaScriptFormatterOption("ARRAYARGUMENT_SPACE", 27, "JavaScript spacing options", "Insert space within array brackets", "i = ai[ 10 ];", "i = ai[10];");
            BINARYOPERATOR_SPACE = new JavaScriptFormatterOption("BINARYOPERATOR_SPACE", 28, "JavaScript spacing options", "Insert space around binary operator ", "i = 10 + 20;", "i = 10+20;");
            JavaScriptFormatterOption javaScriptFormatterOption = new JavaScriptFormatterOption("ASSIGNMENTOPERATOR_SPACE", 29, "JavaScript spacing options", "Insert space around assignment operator ", "i = 10;", "i=10;");
            ASSIGNMENTOPERATOR_SPACE = javaScriptFormatterOption;
            IS = new JavaScriptFormatterOption[]{BLOCK_INDENT, ARRAY_INDENT, BRACE_INDENT, CASE_INDENT, CASELABEL_INDENT, LABELLEFT_INDENT, NEXTLINE_INDENT, ARGUMENT_INDENT, PARAMETER_INDENT, ADJUST_NEWLINES, BLOCK_NEWLINE, FUNCTION_NEWLINE, ELSE_NEWLINE, CATCH_NEWLINE, FINALLY_NEWLINE, STATEMENT_WRAP, ADJUST_SPACES, BRACE_SPACE, PARAMETER_SPACE, PARAMETERCOMMA_SPACE, KEYWORD_SPACE, CONDITION_SPACE, PAREN_SPACE, METHODCALL_SPACE, ARGUMENT_SPACE, ARGUMENTCOMMA_SPACE, ARRAYMETHODCALL_SPACE, ARRAYARGUMENT_SPACE, BINARYOPERATOR_SPACE, javaScriptFormatterOption};
        } catch (Throwable th) {
            if (Nh) {
                iy.aM(th, -115988211802466091L, null);
            }
            throw th;
        }
    }

    @ey(method = -28780557566718705L)
    private JavaScriptFormatterOption(String str, int i, String str2, String str3, String str4, String str5) {
        try {
            if (gG) {
                iy.QX(-1284683549143172405L, null, new Object[]{str, new Integer(i), str2, str3, str4, str5});
            }
            this.WB = str2;
            this.mb = str3;
            this.jw = str4;
            this.fY = str5;
        } catch (Throwable th) {
            if (Nh) {
                iy.rN(th, -1284683549143172405L, null, new Object[]{str, new Integer(i), str2, str3, str4, str5});
            }
            throw th;
        }
    }

    @ey(method = -2721166556410056893L)
    public static Set<JavaScriptFormatterOption> j6() {
        try {
            if (gG) {
                iy.gn(3933016721272153044L, null);
            }
            HashSet hashSet = new HashSet();
            hashSet.add(ADJUST_NEWLINES);
            hashSet.add(ADJUST_SPACES);
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
            if (Nh) {
                iy.aM(th, 3933016721272153044L, null);
            }
            throw th;
        }
    }

    @ey(method = -578210757333484960L)
    public static JavaScriptFormatterOption valueOf(String str) {
        try {
            if (gG) {
                iy.tp(50328437752500677L, null, str);
            }
            return (JavaScriptFormatterOption) Enum.valueOf(JavaScriptFormatterOption.class, str);
        } catch (Throwable th) {
            if (Nh) {
                iy.j3(th, 50328437752500677L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 2785286621861328112L)
    public static JavaScriptFormatterOption[] values() {
        try {
            if (gG) {
                iy.gn(2737654238555108955L, null);
            }
            return (JavaScriptFormatterOption[]) IS.clone();
        } catch (Throwable th) {
            if (Nh) {
                iy.aM(th, 2737654238555108955L, null);
            }
            throw th;
        }
    }

    @ey(method = -3735910227181838824L)
    public String DW() {
        try {
            if (gG) {
                iy.gn(3038399496167307399L, this);
            }
            return this.WB;
        } catch (Throwable th) {
            if (Nh) {
                iy.aM(th, 3038399496167307399L, this);
            }
            throw th;
        }
    }

    @ey(method = 2347063507415616063L)
    public String FH() {
        try {
            if (gG) {
                iy.gn(2296097802242336160L, this);
            }
            return "js_" + name();
        } catch (Throwable th) {
            if (Nh) {
                iy.aM(th, 2296097802242336160L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.FormatOption
    @ey(method = 2966707932636312177L)
    public String getName() {
        try {
            if (gG) {
                iy.gn(540114126689509680L, this);
            }
            return this.mb;
        } catch (Throwable th) {
            if (Nh) {
                iy.aM(th, 540114126689509680L, this);
            }
            throw th;
        }
    }

    @ey(method = 486346991016512291L)
    public String v5(boolean z) {
        try {
            if (gG) {
                iy.Ws(678787431545390580L, this, z);
            }
            return z ? this.jw : this.fY;
        } catch (Throwable th) {
            if (Nh) {
                iy.j3(th, 678787431545390580L, this, new Boolean(z));
            }
            throw th;
        }
    }
}
