package abcd;

import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.language.xml.XmlLanguage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@cy(clazz = 1889568497783380011L, container = 1889568497783380011L, user = true)
/* loaded from: classes.dex */
public class w7 {

    @fy
    private static /* synthetic */ boolean J0;

    @gy
    private static /* synthetic */ boolean J8;

    @dy(field = -143050422559889432L)
    private Model DW;

    @dy(field = -819963310493086759L)
    private int EQ;

    @dy(field = 95051291743157301L)
    private Set<String> FH;

    @dy(field = 3650690445566726129L)
    private Set<String> Hw;

    @dy(field = -3228583961844183411L)
    private String VH;

    @dy(field = -3228447993324662368L)
    private String Zo;

    @dy(field = -3228719930359641160L)
    private int gn;

    @dy(field = -2355293620078578735L)
    private XmlLanguage j6;

    @dy(field = -2965959974750072928L)
    private StringBuilder tp;

    @dy(field = -3228855898871035615L)
    private Map<String, Integer> u7;

    @dy(field = 1766665944055999641L)
    private Set<String> v5;

    @dy(field = -1550707537506878913L)
    private int we;

    static {
        iy.Zo(w7.class);
    }

    @ey(method = -8745863960018138256L)
    public w7(Model model, XmlLanguage xmlLanguage) {
        try {
            if (J0) {
                iy.EQ(-827652400227847560L, null, model, xmlLanguage);
            }
            this.FH = new HashSet(Arrays.asList("text", "textOff", "textOn", "hint", "summary", "title", "dialogTitle"));
            this.Hw = new HashSet(Arrays.asList("section", "description", "title", "task", "designer_task", "fail", "success", "hint"));
            this.v5 = new HashSet(Arrays.asList("fail", "hint"));
            this.u7 = new HashMap();
            this.DW = model;
            this.j6 = xmlLanguage;
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, -827652400227847560L, null, model, xmlLanguage);
            }
            throw th;
        }
    }

    @ey(method = 1997760525684112875L)
    private void DW(String str, String str2, boolean z) {
        try {
            if (J0) {
                iy.we(3987515566355103685L, this, str, str2, new Boolean(z));
            }
            String str3 = "    <string name=\"" + str + "\">" + str2 + "</string>\n";
            if (z) {
                this.tp.append(str3);
            } else {
                this.tp.insert(0, str3);
            }
        } catch (Throwable th) {
            if (J8) {
                iy.U2(th, 3987515566355103685L, this, str, str2, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -213920511994006155L)
    private String EQ(SyntaxTree syntaxTree, int i) {
        try {
            if (J0) {
                iy.EQ(1688946660744363291L, this, syntaxTree, new Integer(i));
            }
            int childNode = syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1);
            String str = "";
            for (int i2 = 1; i2 < syntaxTree.getChildCount(childNode) - 1; i2++) {
                int childNode2 = syntaxTree.getChildNode(childNode, i2);
                if (syntaxTree.getSyntaxTag(childNode2) == 18) {
                    str = str + syntaxTree.getLiteralString(childNode2);
                } else if (syntaxTree.getSyntaxTag(childNode2) == 20) {
                    str = str + syntaxTree.getLiteralString(childNode2);
                } else if (syntaxTree.getSyntaxTag(childNode2) == 205) {
                    str = str + "&" + syntaxTree.getIdentifierString(syntaxTree.getChildNode(childNode2, 1)) + ";";
                } else {
                    str = str + this.j6.getSyntax().getString(syntaxTree.getSyntaxTag(childNode2));
                }
            }
            return str;
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, 1688946660744363291L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -28112623485808223L)
    private void Hw(SyntaxTree syntaxTree) {
        try {
            if (J0) {
                iy.tp(-179933178743463473L, this, syntaxTree);
            }
            v5(syntaxTree, syntaxTree.getRootNode());
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, -179933178743463473L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = 2796188983176770160L)
    private String J0(String str) {
        try {
            if (J0) {
                iy.tp(-4960966053841759156L, this, str);
            }
            String str2 = "";
            for (int i = 0; i < Math.min(str.length(), 30); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == ' ') {
                    str2 = str2 + "_";
                } else if (Character.isJavaIdentifierPart(cCharAt)) {
                    str2 = str2 + Character.toLowerCase(cCharAt);
                }
            }
            return str2;
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, -4960966053841759156L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -4417395230799612685L)
    private void J8(SyntaxTree syntaxTree, int i, String str) {
        try {
            if (J0) {
                iy.we(644293781725580109L, this, syntaxTree, new Integer(i), str);
            }
            int childNode = syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1);
            this.DW.refactoringCallback.nw(syntaxTree.getFile(), syntaxTree.getStartLine(childNode), syntaxTree.getStartColumn(childNode), syntaxTree.getEndLine(childNode), syntaxTree.getEndColumn(childNode), "\"" + str + "\"");
        } catch (Throwable th) {
            if (J8) {
                iy.U2(th, 644293781725580109L, this, syntaxTree, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = 648098626778725100L)
    private void VH(SyntaxTree syntaxTree) {
        try {
            if (J0) {
                iy.tp(219066447398419736L, this, syntaxTree);
            }
            this.Zo = syntaxTree.getFile().getFullNameString().substring(0, r2.length() - 7);
            this.VH = null;
            this.gn = 0;
            this.u7.clear();
            Zo(syntaxTree, syntaxTree.getRootNode());
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, 219066447398419736L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = -2214683527132104072L)
    private void Zo(SyntaxTree syntaxTree, int i) {
        try {
            if (J0) {
                iy.EQ(677088932257230492L, this, syntaxTree, new Integer(i));
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                Zo(syntaxTree, syntaxTree.getChildNode(i, i2));
            }
            if (syntaxTree.getSyntaxTag(i) != 203 || syntaxTree.getStartLine(i) < this.EQ || syntaxTree.getEndLine(i) > this.we) {
                return;
            }
            String strTp = tp(syntaxTree, i);
            u7(syntaxTree, i);
            if ("title".equals(strTp)) {
                this.gn = 0;
                String strEQ = EQ(syntaxTree, i);
                if (strEQ == null || strEQ.startsWith("@string/")) {
                    this.VH = null;
                } else {
                    this.VH = strEQ.toLowerCase().replace(" ", "_").replace("-", "_");
                    j6("Lesson " + strEQ);
                }
            }
            if ("task".equals(strTp)) {
                this.gn++;
                this.u7.clear();
                Iterator<String> it = this.v5.iterator();
                while (it.hasNext()) {
                    this.u7.put(it.next(), 1);
                }
            }
            if (this.Hw.contains(strTp)) {
                String strEQ2 = EQ(syntaxTree, i);
                if (this.VH != null && !strEQ2.startsWith("@string/")) {
                    String str = this.Zo + "_" + this.VH;
                    if (this.gn > 0) {
                        str = str + "_" + this.gn;
                    }
                    String strSubstring = str + "_" + strTp;
                    if (this.u7.containsKey(strTp)) {
                        strSubstring = strSubstring + "_" + this.u7.get(strTp);
                    }
                    if (strSubstring.endsWith("_title")) {
                        strSubstring = strSubstring.substring(0, strSubstring.length() - 6);
                    }
                    ArrayList arrayList = new ArrayList();
                    String strReplace = gn(strEQ2, arrayList).replace("'", "\\'");
                    String str2 = "@string/" + strSubstring;
                    Iterator<String> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        str2 = str2 + " " + it2.next().replace("_", "__").replace(" ", "_");
                    }
                    J8(syntaxTree, i, str2);
                    DW(strSubstring, strReplace, true);
                }
                if (this.u7.containsKey(strTp)) {
                    this.u7.put(strTp, Integer.valueOf(this.u7.get(strTp).intValue() + 1));
                }
            }
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, 677088932257230492L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 8354497381218406592L)
    private String gn(String str, List<String> list) {
        int iIndexOf;
        try {
            if (J0) {
                iy.EQ(480040065669826312L, this, str, list);
            }
            String str2 = "";
            int i = 1;
            while (true) {
                int iIndexOf2 = str.indexOf("!_");
                int iIndexOf3 = str.indexOf("'_");
                if (iIndexOf2 == -1 && iIndexOf3 == -1) {
                    return str2 + str;
                }
                if (iIndexOf2 == -1 || (iIndexOf3 != -1 && iIndexOf3 <= iIndexOf2)) {
                    iIndexOf = str.indexOf("_'", iIndexOf3 + 2) + 2;
                    iIndexOf2 = iIndexOf3;
                } else {
                    iIndexOf = str.indexOf("_!", iIndexOf2 + 2) + 2;
                }
                if (iIndexOf2 >= iIndexOf) {
                    return str2 + str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(str.substring(0, iIndexOf2));
                sb.append("%");
                int i2 = i + 1;
                sb.append(i);
                sb.append("$s");
                String string = sb.toString();
                list.add(str.substring(iIndexOf2, iIndexOf));
                str = str.substring(iIndexOf);
                i = i2;
                str2 = string;
            }
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, 480040065669826312L, this, str, list);
            }
            throw th;
        }
    }

    @ey(method = 6444564674111654841L)
    private void j6(String str) {
        try {
            if (J0) {
                iy.tp(372438701734311527L, this, str);
            }
            this.tp.append("\n    <!-- " + str + " -->\n");
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, 372438701734311527L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -328784590521474788L)
    private String tp(SyntaxTree syntaxTree, int i) {
        try {
            if (J0) {
                iy.EQ(-3995048202827047608L, this, syntaxTree, new Integer(i));
            }
            return syntaxTree.getIdentifierString(syntaxTree.getChildNode(syntaxTree.getChildNode(i, 0), 2));
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, -3995048202827047608L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -833352509830668705L)
    private String u7(SyntaxTree syntaxTree, int i) {
        try {
            if (J0) {
                iy.EQ(-2940479661247898007L, this, syntaxTree, new Integer(i));
            }
            return syntaxTree.getIdentifierString(syntaxTree.getChildNode(syntaxTree.getChildNode(i, 0), 0));
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, -2940479661247898007L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1989271324506735672L)
    private void v5(SyntaxTree syntaxTree, int i) {
        try {
            if (J0) {
                iy.EQ(1706224228741246908L, this, syntaxTree, new Integer(i));
            }
            for (int childCount = syntaxTree.getChildCount(i) - 1; childCount >= 0; childCount--) {
                v5(syntaxTree, syntaxTree.getChildNode(i, childCount));
            }
            if (syntaxTree.getSyntaxTag(i) != 203 || syntaxTree.getStartLine(i) < this.EQ || syntaxTree.getEndLine(i) > this.we) {
                return;
            }
            String strTp = tp(syntaxTree, i);
            String strU7 = u7(syntaxTree, i);
            if (this.FH.contains(strTp) && "android".equals(strU7)) {
                String strEQ = EQ(syntaxTree, i);
                if (strEQ.startsWith("@string/")) {
                    return;
                }
                String strWe = we(syntaxTree, i, "android", "key");
                String strJ0 = strWe != null ? strWe.toLowerCase() + "_" + strTp : J0(strEQ);
                J8(syntaxTree, i, "@string/" + strJ0);
                DW(strJ0, strEQ, false);
            }
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, 1706224228741246908L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4243265549475866387L)
    private String we(SyntaxTree syntaxTree, int i, String str, String str2) {
        try {
            if (J0) {
                iy.J0(4103800104633401185L, this, syntaxTree, new Integer(i), str, str2);
            }
            int parentNode = syntaxTree.getParentNode(i);
            for (int childCount = syntaxTree.getChildCount(parentNode) - 1; childCount >= 0; childCount--) {
                int childNode = syntaxTree.getChildNode(parentNode, childCount);
                if (syntaxTree.getSyntaxTag(childNode) == 203 && str2.equals(tp(syntaxTree, childNode)) && str.equals(u7(syntaxTree, childNode))) {
                    return EQ(syntaxTree, childNode);
                }
            }
            return null;
        } catch (Throwable th) {
            if (J8) {
                iy.a8(th, 4103800104633401185L, this, syntaxTree, new Integer(i), str, str2);
            }
            throw th;
        }
    }

    @ey(method = -1652518051541669707L)
    public void FH(FileEntry fileEntry, FileEntry fileEntry2, int i, int i2, int i3, int i4) throws Throwable {
        char c;
        boolean z;
        int i5 = 5;
        try {
            if (J0) {
                iy.QX(-1009685744300133945L, this, new Object[]{fileEntry, fileEntry2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            this.DW.refactoringCallback.g3();
            if (i == i3 && i2 == i4) {
                this.EQ = 1;
                this.we = Integer.MAX_VALUE;
            } else {
                this.EQ = Math.min(i, i3);
                this.we = Math.max(i, i3);
            }
            SyntaxTree syntaxTree = this.DW.syntaxTreeSpace.getSyntaxTree(fileEntry, this.j6);
            this.tp = new StringBuilder();
            String fullNameString = fileEntry.getFullNameString();
            if (fullNameString.startsWith("course_") && fullNameString.endsWith("_en.xml")) {
                VH(syntaxTree);
            } else {
                Hw(syntaxTree);
            }
            this.DW.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
            if (this.tp.length() <= 0) {
                i5 = 6;
                c = 1;
            } else if (fileEntry2.exists()) {
                List<String> listA8 = fileEntry2.a8();
                int i6 = 1;
                while (true) {
                    if (i6 >= listA8.size()) {
                        i5 = 6;
                        c = 1;
                        z = false;
                        break;
                    }
                    int iIndexOf = listA8.get(i6).indexOf("<resources>");
                    if (iIndexOf >= 0) {
                        int i7 = iIndexOf + 11 + 1;
                        c = 1;
                        i5 = 6;
                        this.DW.refactoringCallback.nw(fileEntry2, i6, i7, i6, i7, "\n" + this.tp.toString());
                        z = true;
                        break;
                    }
                    try {
                        c = 1;
                        i6++;
                        i5 = 5;
                    } catch (Throwable th) {
                        th = th;
                        if (J8) {
                            Object[] objArr = new Object[i5];
                            objArr[0] = fileEntry;
                            objArr[c] = fileEntry2;
                            objArr[2] = new Integer(i);
                            objArr[3] = new Integer(i2);
                            objArr[4] = new Integer(i3);
                            objArr[5] = new Integer(i4);
                            iy.rN(th, -1009685744300133945L, this, objArr);
                        }
                        throw th;
                    }
                }
                if (!z) {
                    this.DW.refactoringCallback.nw(fileEntry2, 1, 1, 1, 1, this.tp.toString());
                }
            } else {
                this.DW.refactoringCallback.dx(fileEntry2, "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<resources>\n" + this.tp.toString() + "\n</resources>\n");
                i5 = 6;
                c = 1;
            }
            this.DW.refactoringCallback.vJ();
        } catch (Throwable th2) {
            th = th2;
            i5 = 6;
            c = 1;
        }
    }
}
