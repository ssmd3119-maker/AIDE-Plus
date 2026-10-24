package abcd;

import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.MapOfIntLong;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.language.xml.XmlCodeModel;
import com.aide.codemodel.language.xml.XmlLanguage;
import com.aide.codemodel.language.xml.XmlSyntax;
import java.io.File;
import java.util.Iterator;

@cy(clazz = -3075437118234042009L, container = -3075437118234042009L, user = true)
/* loaded from: classes.dex */
public class s7 {

    @fy
    private static /* synthetic */ boolean EQ;

    @gy
    private static /* synthetic */ boolean we;

    @dy(field = 747234095445587465L)
    private SetOfFileEntry DW;

    @dy(field = -1077603570567575569L)
    private MapOfIntLong FH;

    @dy(field = -2145698413798139225L)
    private m4 Hw;

    @dy(field = 517418586214109192L)
    private int VH;

    @dy(field = -399164968167560424L)
    private int Zo;

    @dy(field = 4325090343638774077L)
    private int gn;

    @dy(field = -823510120927563937L)
    private final Model j6;

    @dy(field = -5082192605490255097L)
    private int tp;

    @dy(field = 5232342682225878055L)
    private int u7;

    @dy(field = -2869455203892718209L)
    private m4 v5;

    static {
        iy.Zo(s7.class);
    }

    @ey(method = -159081939841411980L)
    public s7(Model model) {
        try {
            if (EQ) {
                iy.tp(-4628738713886174811L, null, model);
            }
            this.j6 = model;
            this.DW = new SetOfFileEntry(model.fileSpace);
            this.FH = new MapOfIntLong();
            this.v5 = new m4(model);
            this.Hw = new m4(model);
            this.Zo = model.identifierSpace.get("public");
            this.VH = model.identifierSpace.get("system");
            this.gn = model.identifierSpace.get("uri");
            this.u7 = model.identifierSpace.get("publicId");
            this.tp = model.identifierSpace.get("systemId");
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -4628738713886174811L, null, model);
            }
            throw th;
        }
    }

    @ey(method = 6602718401235587267L)
    private void DW() {
        try {
            if (EQ) {
                iy.gn(-6437917493444122416L, this);
            }
            SetOfFileEntry setOfFileEntryKD = this.j6.fileSpace.KD();
            while (setOfFileEntryKD.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey = setOfFileEntryKD.j6.nextKey();
                if ((fileEntryNextKey.getCodeModel() instanceof XmlCodeModel) && (!this.FH.Hw(fileEntryNextKey.getId()) || fileEntryNextKey.getVersion() != this.FH.v5(fileEntryNextKey.getId()))) {
                    Iterator<Language> it = fileEntryNextKey.getCodeModel().getLanguages().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Language next = it.next();
                            if (next instanceof XmlLanguage) {
                                SyntaxTree syntaxTree = this.j6.syntaxTreeSpace.getSyntaxTree(fileEntryNextKey, next);
                                if (gn(syntaxTree)) {
                                    this.DW.gn(fileEntryNextKey);
                                } else {
                                    this.DW.EQ(fileEntryNextKey);
                                }
                                this.FH.VH(fileEntryNextKey.getId(), fileEntryNextKey.getVersion());
                                this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -6437917493444122416L, this);
            }
            throw th;
        }
    }

    @ey(method = -4434936760977217773L)
    private int FH(SyntaxTree syntaxTree, int i) {
        try {
            if (EQ) {
                iy.EQ(4865054241282890556L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getSyntaxTag(i) == 213) {
                return i;
            }
            for (int i2 = 0; i2 < syntaxTree.getChildCount(i); i2++) {
                int iFH = FH(syntaxTree, syntaxTree.getChildNode(i, i2));
                if (iFH > 0) {
                    return iFH;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, 4865054241282890556L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1873733862807994100L)
    private String VH(SyntaxTree syntaxTree, int i, String str) {
        try {
            if (EQ) {
                iy.we(472122658220348551L, this, syntaxTree, new Integer(i), str);
            }
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            if ((syntaxTag == 200 || syntaxTag == 201) && syntaxTree.getIdentifier(syntaxTree.getChildNode(i, 1)) == this.VH) {
                for (int i2 = 2; i2 < syntaxTree.getChildCount(i) - 1; i2++) {
                    int childNode = syntaxTree.getChildNode(i, i2);
                    if (syntaxTree.getSyntaxTag(childNode) == 203) {
                        int iJJ = XmlSyntax.jJ(syntaxTree, childNode);
                        if (iJJ == this.tp) {
                            j6(syntaxTree, syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 1));
                            if (!this.Hw.we(str)) {
                                break;
                            }
                        }
                        if (iJJ == this.gn) {
                            j6(syntaxTree, syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 1));
                            return this.Hw.toString();
                        }
                    }
                }
            }
            for (int i3 = 0; i3 < syntaxTree.getChildCount(i); i3++) {
                String strVH = VH(syntaxTree, syntaxTree.getChildNode(i, i3), str);
                if (strVH != null) {
                    return strVH;
                }
            }
            return null;
        } catch (Throwable th) {
            if (we) {
                iy.U2(th, 472122658220348551L, this, syntaxTree, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = -210952669783339264L)
    private String Zo(SyntaxTree syntaxTree, int i, String str) {
        try {
            if (EQ) {
                iy.we(-790454056900187045L, this, syntaxTree, new Integer(i), str);
            }
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            if ((syntaxTag == 200 || syntaxTag == 201) && syntaxTree.getIdentifier(syntaxTree.getChildNode(i, 1)) == this.Zo) {
                for (int i2 = 2; i2 < syntaxTree.getChildCount(i) - 1; i2++) {
                    int childNode = syntaxTree.getChildNode(i, i2);
                    if (syntaxTree.getSyntaxTag(childNode) == 203) {
                        int iJJ = XmlSyntax.jJ(syntaxTree, childNode);
                        if (iJJ == this.u7) {
                            j6(syntaxTree, syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 1));
                            if (!this.Hw.we(str)) {
                                break;
                            }
                        }
                        if (iJJ == this.gn) {
                            j6(syntaxTree, syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 1));
                            return this.Hw.toString();
                        }
                    }
                }
            }
            for (int i3 = 0; i3 < syntaxTree.getChildCount(i); i3++) {
                String strZo = Zo(syntaxTree, syntaxTree.getChildNode(i, i3), str);
                if (strZo != null) {
                    return strZo;
                }
            }
            return null;
        } catch (Throwable th) {
            if (we) {
                iy.U2(th, -790454056900187045L, this, syntaxTree, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = 4297673442648298412L)
    private boolean gn(SyntaxTree syntaxTree) {
        try {
            if (EQ) {
                iy.tp(4097376377705883843L, this, syntaxTree);
            }
            int iFH = FH(syntaxTree, syntaxTree.getRootNode());
            if (iFH <= 0 || syntaxTree.getSyntaxTag(syntaxTree.getChildNode(iFH, 2)) != 215) {
                return false;
            }
            int childNode = syntaxTree.getChildNode(syntaxTree.getChildNode(iFH, 2), 1);
            this.v5.u7();
            this.v5.v5(syntaxTree.getLiteralChars(childNode), syntaxTree.getLiteralOff(childNode), syntaxTree.getLiteralLen(childNode));
            return this.v5.we("\"-//OASIS//DTD Entity Resolution XML Catalog V1.0//EN\"");
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 4097376377705883843L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = 6014277116488416525L)
    private void j6(SyntaxTree syntaxTree, int i) {
        try {
            if (EQ) {
                iy.EQ(2534413400886262056L, this, syntaxTree, new Integer(i));
            }
            this.Hw.u7();
            int childNode = syntaxTree.getChildNode(i, 0);
            int syntaxTag = syntaxTree.getSyntaxTag(childNode);
            if (syntaxTag != 16 && syntaxTag != 17) {
                if (syntaxTag == 26 || syntaxTag == 50) {
                    this.Hw.Zo(syntaxTree.getIdentifier(childNode));
                    return;
                }
                return;
            }
            for (int i2 = 1; i2 < syntaxTree.getChildCount(i) - 1; i2++) {
                int childNode2 = syntaxTree.getChildNode(i, i2);
                if (syntaxTree.getSyntaxTag(childNode2) == 18) {
                    this.Hw.v5(syntaxTree.getLiteralChars(childNode2), syntaxTree.getLiteralOff(childNode2), syntaxTree.getLiteralLen(childNode2));
                }
            }
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, 2534413400886262056L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.aide.codemodel.api.FileEntry] */
    @ey(method = -329051745992886024L)
    public FileEntry Hw(String str) {
        try {
            if (EQ) {
                iy.tp(-2101713950058969873L, this, str);
            }
            DW();
            this.DW.j6.init();
            while (this.DW.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey = this.DW.j6.nextKey();
                for (Language language : fileEntryNextKey.getCodeModel().getLanguages()) {
                    if (language instanceof XmlLanguage) {
                        SyntaxTree syntaxTree = this.j6.syntaxTreeSpace.getSyntaxTree(fileEntryNextKey, language);
                        String strZo = Zo(syntaxTree, syntaxTree.getRootNode(), str);
                        if (strZo != null && strZo.startsWith("file:")) {
                            String strSubstring = strZo.substring(5, strZo.length());
                            if (!strSubstring.startsWith("/")) {
                                File file = new File(fileEntryNextKey.getParentDirectory().getPathString(), strSubstring);
                                if (file.isFile() && file.canRead()) {
                                    str = this.j6.fileSpace.lg(file.getPath());
                                    return str;
                                }
                            }
                        }
                        this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -2101713950058969873L, this, str);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.aide.codemodel.api.FileEntry] */
    @ey(method = -962405155140546600L)
    public FileEntry v5(String str) {
        try {
            if (EQ) {
                iy.tp(1862470596706588055L, this, str);
            }
            DW();
            this.DW.j6.init();
            while (this.DW.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey = this.DW.j6.nextKey();
                for (Language language : fileEntryNextKey.getCodeModel().getLanguages()) {
                    if (language instanceof XmlLanguage) {
                        SyntaxTree syntaxTree = this.j6.syntaxTreeSpace.getSyntaxTree(fileEntryNextKey, language);
                        String strVH = VH(syntaxTree, syntaxTree.getRootNode(), str);
                        if (strVH != null && strVH.startsWith("file:")) {
                            String strSubstring = strVH.substring(5, strVH.length());
                            if (!strSubstring.startsWith("/")) {
                                File file = new File(fileEntryNextKey.getParentDirectory().getPathString(), strSubstring);
                                if (file.isFile() && file.canRead()) {
                                    str = this.j6.fileSpace.lg(file.getPath());
                                    return str;
                                }
                            }
                        }
                        this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 1862470596706588055L, this, str);
            }
            throw th;
        }
    }
}
