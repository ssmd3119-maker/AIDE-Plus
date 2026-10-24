package org.codehaus.groovy.syntax;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class Types {
    private static final Map<Integer, String> Hw;
    private static final Map<Integer, String> j6 = new HashMap();
    private static final Map<String, Integer> DW = new HashMap();
    private static final Set<String> FH = new HashSet();

    static {
        FH("\n", 5);
        FH("{", 10);
        FH("}", 20);
        FH("[", 30);
        FH("]", 40);
        FH("(", 50);
        FH(")", 60);
        FH(".", 70);
        FH("..", 75);
        FH("...", 77);
        FH("->", 80);
        FH("=~", 90);
        FH("==~", 94);
        FH("~", 97);
        FH("=", 100);
        FH("!=", 120);
        FH("===", 121);
        FH("!==", 122);
        FH("==", 123);
        FH("<", 124);
        FH("<=", 125);
        FH(">", 126);
        FH(">=", 127);
        FH("<=>", 128);
        FH("!", 160);
        FH("||", 162);
        FH("&&", 164);
        FH("||=", 166);
        FH("&&=", 168);
        FH("+", 200);
        FH("-", 201);
        FH("*", 202);
        FH("/", 203);
        FH("\\", 204);
        FH("%", 205);
        FH("**", 206);
        FH("+=", 210);
        FH("-=", 211);
        FH("*=", 212);
        FH("/=", 213);
        FH("\\=", 214);
        FH("%=", 215);
        FH("**=", 216);
        FH("++", 250);
        FH("--", 260);
        FH("<<", 280);
        FH(">>", 281);
        FH(">>>", 282);
        FH("<<=", 285);
        FH(">>=", 286);
        FH(">>>=", 287);
        FH("&", 341);
        FH("^", 342);
        FH("|=", 350);
        FH("&=", 351);
        FH("^=", 352);
        FH(",", 300);
        FH(":", 310);
        FH(";", ModuleDescriptor.MODULE_VERSION);
        FH("?", 330);
        FH("|", 340);
        FH("${}", 903);
        DW("abstract", 510);
        DW("as", 552);
        DW("assert", 585);
        DW("break", 574);
        DW("case", 577);
        DW("catch", 581);
        DW("class", 531);
        DW("const", 700);
        DW("continue", 575);
        DW("def", 530);
        DW("defmacro", 530);
        DW("default", 578);
        DW("do", 570);
        DW("else", 562);
        DW("extends", 541);
        DW("final", 511);
        DW("finally", 582);
        DW("for", 572);
        DW("goto", 701);
        DW("if", 561);
        DW("in", 573);
        DW("implements", 540);
        DW("import", 551);
        DW("instanceof", 544);
        DW("interface", 532);
        DW("mixin", 533);
        DW("native", 512);
        DW("new", 546);
        DW("package", 550);
        DW("private", 500);
        DW("property", 545);
        DW("protected", 501);
        DW("public", 502);
        DW("return", 560);
        DW("static", 521);
        DW("super", 543);
        DW("switch", 576);
        DW("synchronized", 520);
        DW("this", 542);
        DW("throw", 583);
        DW("throws", 584);
        DW("transient", 513);
        DW("try", 580);
        DW("volatile", 514);
        DW("while", 571);
        DW("true", 610);
        DW("false", 611);
        DW("null", 612);
        DW("void", 600);
        DW("boolean", 601);
        DW("byte", 602);
        DW("int", 604);
        DW("short", 603);
        DW("long", 605);
        DW("float", 606);
        DW("double", 607);
        DW("char", 608);
        Hw = new HashMap();
        for (String str : DW.keySet()) {
            j6(DW.get(str).intValue(), str);
        }
        j6(5, "<newline>");
        j6(251, "<prefix ++>");
        j6(252, "<postfix ++>");
        j6(261, "<prefix -->");
        j6(262, "<postfix -->");
        j6(253, "<positive>");
        j6(263, "<negative>");
        j6(400, "<string literal>");
        j6(440, "<identifier>");
        j6(450, "<integer>");
        j6(451, "<decimal>");
        j6(800, "<compilation unit>");
        j6(801, "<class>");
        j6(802, "<interface>");
        j6(803, "<mixin>");
        j6(804, "<method>");
        j6(814, "<method call>");
        j6(805, "<property>");
        j6(806, "<parameter>");
        j6(810, "<list>");
        j6(811, "<map>");
        j6(820, "<tuple>");
        j6(812, "<gstring>");
        j6(815, "<cast>");
        j6(816, "<block>");
        j6(817, "<closure>");
        j6(819, "<ternary>");
        j6(818, "<label>");
        j6(830, "<variable declaration>");
        j6(901, "<start of gstring tokens>");
        j6(902, "<end of gstring tokens>");
        j6(903, "<start of gstring expression>");
        j6(904, "<end of gstring expression>");
        j6(1100, "<assignment operator>");
        j6(1101, "<comparison operator>");
        j6(1102, "<math operator>");
        j6(1103, "<logical operator>");
        j6(1107, "<bitwise operator>");
        j6(1104, "<range operator>");
        j6(1105, "<regex comparison operator>");
        j6(1106, "<dereference operator>");
        j6(1200, "<prefix operator>");
        j6(1210, "<postfix operator>");
        j6(1220, "<infix operator>");
        j6(1300, "<keyword>");
        j6(1310, "<literal>");
        j6(1320, "<number>");
        j6(1330, "<named value>");
        j6(1331, "<truth value>");
        j6(1340, "<primitive type>");
        j6(1341, "<creatable primitive type>");
        j6(1350, "<loop>");
        j6(1360, "<reserved keyword>");
        j6(1370, "<synthetic>");
        j6(1400, "<type declaration>");
        j6(1410, "<declaration modifier>");
        j6(1420, "<type name>");
        j6(1430, "<creatable type name>");
        j6(1500, "<matched container>");
        j6(1501, "<left of matched container>");
        j6(1502, "<right of matched container>");
        j6(2005, "<valid in a switch body>");
    }

    private static void DW(String str, int i) {
        FH.add(str);
        FH(str, i);
    }

    private static void FH(String str, int i) {
        j6.put(Integer.valueOf(i), str);
        DW.put(str, Integer.valueOf(i));
    }

    public static String Hw(int i) {
        return Hw.containsKey(Integer.valueOf(i)) ? Hw.get(Integer.valueOf(i)) : "<>";
    }

    public static int VH(String str) {
        return Zo(str, 1301);
    }

    public static int Zo(String str, int i) {
        if (!DW.containsKey(str)) {
            return 0;
        }
        int iIntValue = DW.get(str).intValue();
        if (i == 0 || gn(iIntValue, i)) {
            return iIntValue;
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean gn(int r16, int r17) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.syntax.Types.gn(int, int):boolean");
    }

    private static void j6(int i, String str) {
        if (str.startsWith("<") && str.endsWith(">")) {
            Hw.put(Integer.valueOf(i), str);
            return;
        }
        Hw.put(Integer.valueOf(i), '\"' + str + '\"');
    }

    public static String v5(int i) {
        return j6.containsKey(Integer.valueOf(i)) ? j6.get(Integer.valueOf(i)) : "";
    }
}
