package abcd;

import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.Variable;
import com.aide.codemodel.api.callback.TemplateEvaluatorCallback;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.language.js.JavaScriptLanguage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@cy(clazz = -724108884537179296L, container = -724108884537179296L, user = true)
/* loaded from: classes.dex */
public class e7 {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = -1037007265823759211L)
    private final JavaScriptLanguage DW;

    @dy(field = 2107222207161818880L)
    private TemplateEvaluatorCallback FH;

    @dy(field = 1263128900883492448L)
    private final Model j6;

    static {
        iy.Zo(e7.class);
    }

    @ey(method = 570380778919063749L)
    public e7(Model model, JavaScriptLanguage javaScriptLanguage) {
        try {
            if (Hw) {
                iy.EQ(-4132131443197559032L, null, model, javaScriptLanguage);
            }
            this.j6 = model;
            this.DW = javaScriptLanguage;
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, -4132131443197559032L, null, model, javaScriptLanguage);
            }
            throw th;
        }
    }

    @ey(method = 404107266006601920L)
    private List<Variable> FH(SyntaxTree syntaxTree, int i, int i2, List<String> list) {
        try {
            if (Hw) {
                iy.J0(-806974163480655760L, this, syntaxTree, new Integer(i), new Integer(i2), list);
            }
            ArrayList arrayList = new ArrayList();
            int iSy = syntaxTree.sy(i, i2, i, i2);
            int iMz = syntaxTree.Mz(i, i2, i, i2);
            if (iMz != -1) {
                iSy = iMz;
            }
            SetOfInt setOfInt = new SetOfInt();
            int i3 = iSy;
            for (int i4 = -1; iSy != i4; i4 = -1) {
                if (syntaxTree.getSyntaxTag(iSy) == 133) {
                    int childCount = syntaxTree.getChildCount(iSy) - 1;
                    while (childCount >= 0 && syntaxTree.getChildNode(iSy, childCount) != i3) {
                        childCount--;
                    }
                    for (int i5 = childCount - 1; i5 >= 0; i5--) {
                        int childNode = syntaxTree.getChildNode(iSy, i5);
                        if (syntaxTree.getSyntaxTag(childNode) == 151 || syntaxTree.getSyntaxTag(childNode) == 152) {
                            int childCount2 = syntaxTree.getChildCount(childNode);
                            for (int i6 = 1; i6 < childCount2; i6 += 2) {
                                int childNode2 = syntaxTree.getChildNode(syntaxTree.getChildNode(childNode, i6), 0);
                                int identifier = syntaxTree.getIdentifier(childNode2);
                                if (!setOfInt.contains(identifier) && (syntaxTree.getStartLine(childNode2) != i || syntaxTree.getStartColumn(childNode2) > i2 || syntaxTree.getEndColumn(childNode2) < i2)) {
                                    arrayList.add(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode2), syntaxTree.getStartColumn(childNode2), syntaxTree.getEndColumn(childNode2), identifier, null));
                                }
                            }
                        }
                    }
                } else if (syntaxTree.getSyntaxTag(iSy) == 146 && (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(iSy, 0)) == 124 || syntaxTree.getSyntaxTag(syntaxTree.getChildNode(iSy, 0)) == 125)) {
                    int childNode3 = syntaxTree.getChildNode(syntaxTree.getChildNode(iSy, 0), syntaxTree.getChildCount(iSy) - 2);
                    int childCount3 = syntaxTree.getChildCount(childNode3);
                    for (int i7 = 1; i7 < childCount3 - 1; i7 += 2) {
                        int childNode4 = syntaxTree.getChildNode(syntaxTree.getChildNode(childNode3, i7), 0);
                        int identifier2 = syntaxTree.getIdentifier(childNode4);
                        if (!setOfInt.contains(identifier2)) {
                            arrayList.add(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode4), syntaxTree.getStartColumn(childNode4), syntaxTree.getEndColumn(childNode4), identifier2, null));
                        }
                    }
                } else if (syntaxTree.getSyntaxTag(iSy) == 211) {
                    int childNode5 = syntaxTree.getChildNode(iSy, 2);
                    if (syntaxTree.getSyntaxTag(childNode5) == 151) {
                        int childCount4 = syntaxTree.getChildCount(childNode5);
                        for (int i8 = 1; i8 < childCount4; i8 += 2) {
                            int childNode6 = syntaxTree.getChildNode(syntaxTree.getChildNode(childNode5, i8), 0);
                            int identifier3 = syntaxTree.getIdentifier(childNode6);
                            if (!setOfInt.contains(identifier3)) {
                                arrayList.add(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode6), syntaxTree.getStartColumn(childNode6), syntaxTree.getEndColumn(childNode6), identifier3, null));
                            }
                        }
                    }
                } else if (syntaxTree.getSyntaxTag(iSy) == 149) {
                    int childNode7 = syntaxTree.getChildNode(syntaxTree.getChildNode(iSy, 2), 0);
                    if (syntaxTree.getSyntaxTag(childNode7) == 151) {
                        int childCount5 = syntaxTree.getChildCount(childNode7);
                        for (int i9 = 1; i9 < childCount5; i9 += 2) {
                            int childNode8 = syntaxTree.getChildNode(syntaxTree.getChildNode(childNode7, i9), 0);
                            int identifier4 = syntaxTree.getIdentifier(childNode8);
                            if (!setOfInt.contains(identifier4)) {
                                arrayList.add(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode8), syntaxTree.getStartColumn(childNode8), syntaxTree.getEndColumn(childNode8), identifier4, null));
                            }
                        }
                    }
                }
                int parentNode = syntaxTree.getParentNode(iSy);
                if (parentNode == syntaxTree.getRootNode()) {
                    i3 = iSy;
                    iSy = -1;
                } else {
                    i3 = iSy;
                    iSy = parentNode;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (v5) {
                iy.a8(th, -806974163480655760L, this, syntaxTree, new Integer(i), new Integer(i2), list);
            }
            throw th;
        }
    }

    @ey(method = -3413359591083312240L)
    private void Hw(FileEntry fileEntry, int i, int i2, List<String> list) {
        try {
            if (Hw) {
                iy.J0(-1083079549514130256L, this, fileEntry, new Integer(i), new Integer(i2), list);
            }
            SyntaxTree syntaxTree = this.j6.syntaxTreeSpace.getSyntaxTree(fileEntry, this.DW);
            Iterator<Variable> it = FH(syntaxTree, i, i2, list).iterator();
            while (it.hasNext()) {
                this.FH.v5(it.next());
            }
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
        } catch (Throwable th) {
            if (v5) {
                iy.a8(th, -1083079549514130256L, this, fileEntry, new Integer(i), new Integer(i2), list);
            }
            throw th;
        }
    }

    @ey(method = -115205688356339712L)
    private List<String> j6(String[] strArr) {
        try {
            if (Hw) {
                iy.tp(-5272634895397301376L, this, strArr);
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                arrayList.add(str);
            }
            return arrayList;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -5272634895397301376L, this, strArr);
            }
            throw th;
        }
    }

    @ey(method = 850839367922509185L)
    private void v5(FileEntry fileEntry, int i, int i2, List<String> list) {
        try {
            if (Hw) {
                iy.J0(4184564831656758025L, this, fileEntry, new Integer(i), new Integer(i2), list);
            }
            List<Variable> listFH = FH(this.j6.syntaxTreeSpace.u7(fileEntry, this.DW, i, i2, "i;"), i, i2, Collections.EMPTY_LIST);
            for (String str : list) {
                Iterator<Variable> it = listFH.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().getIdentifier() == this.j6.identifierSpace.get(str)) {
                            break;
                        }
                    } else {
                        this.FH.Hw(str);
                        break;
                    }
                }
            }
        } catch (Throwable th) {
            if (v5) {
                iy.a8(th, 4184564831656758025L, this, fileEntry, new Integer(i), new Integer(i2), list);
            }
            throw th;
        }
    }

    @ey(method = -750141778817659239L)
    public void DW(TemplateEvaluatorCallback templateEvaluatorCallback, FileEntry fileEntry, int i, int i2, String str, List<String> list) {
        try {
            if (Hw) {
                iy.QX(7070324319068347777L, this, new Object[]{templateEvaluatorCallback, fileEntry, new Integer(i), new Integer(i2), str, list});
            }
            this.FH = templateEvaluatorCallback;
            templateEvaluatorCallback.j6();
            if (str.equals("SELECT")) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    templateEvaluatorCallback.Hw(it.next());
                }
            }
            if (str.equals("SELECT_VARIABLE")) {
                Hw(fileEntry, i, i2, list);
            }
            if (str.equals("SUGGEST_NAME")) {
                v5(fileEntry, i, i2, j6(new String[]{"v", "f", "t"}));
            }
            if (str.equals("SUGGEST_ELEMENT_NAME")) {
                if (list.size() == 1) {
                    String str2 = list.get(0);
                    if (str2.endsWith("s")) {
                        v5(fileEntry, i, i2, j6(new String[]{str2.substring(0, str2.length() - 1)}));
                    }
                }
                v5(fileEntry, i, i2, j6(new String[]{"e", "m", "a"}));
            }
            if (str.equals("SUGGEST_INDEX_NAME")) {
                v5(fileEntry, i, i2, j6(new String[]{"i", "j", "k", "n", "z", "l"}));
            }
            if (str.equals("SUGGEST_EXCEPTION_NAME")) {
                v5(fileEntry, i, i2, j6(new String[]{"e", "ex", "e2", "e3", "e4"}));
            }
            templateEvaluatorCallback.FH();
        } catch (Throwable th) {
            if (v5) {
                iy.rN(th, 7070324319068347777L, this, new Object[]{templateEvaluatorCallback, fileEntry, new Integer(i), new Integer(i2), str, list});
            }
            throw th;
        }
    }
}
