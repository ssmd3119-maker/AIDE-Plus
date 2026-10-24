package com.aide.codemodel.language.html;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.h7;
import abcd.iy;
import abcd.n7;
import abcd.u7;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.LexerHelper;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeStyles;
import com.aide.codemodel.api.abstraction.CodeModel;
import com.aide.codemodel.api.abstraction.Compiler;
import com.aide.codemodel.api.abstraction.Debugger;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.abstraction.Preprocessor;
import com.aide.codemodel.language.js.JavaScriptCommentsLanguage;
import com.aide.codemodel.language.js.JavaScriptLanguage;
import com.aide.codemodel.language.js.JavaScriptParser;
import com.aide.codemodel.language.js.JavaScriptSyntax;
import com.aide.codemodel.language.xml.XmlCodeAnalyzer;
import com.aide.codemodel.language.xml.XmlLanguage;
import com.aide.codemodel.language.xml.XmlLexer;
import com.aide.codemodel.language.xml.XmlParser;
import com.aide.codemodel.language.xml.XmlSyntax;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@cy(clazz = -2300944122742088340L, container = -2300944122742088340L, user = true)
/* loaded from: classes.dex */
public class HtmlCodeModel implements CodeModel {

    @fy
    private static /* synthetic */ boolean J0;

    @gy
    private static /* synthetic */ boolean J8;

    @dy(field = -292945831656860160L)
    private final XmlLanguage DW;

    @dy(field = -4630798707764317935L)
    private XmlParser EQ;

    @dy(field = 2651720887976744220L)
    private final JavaScriptLanguage FH;

    @dy(field = -1514728356975680535L)
    private final JavaScriptCommentsLanguage Hw;

    @dy(field = -1721424904096984944L)
    private n7 VH;

    @dy(field = -1417151991679943925L)
    private u7 Zo;

    @dy(field = 6465022701586396493L)
    private JavaScriptParser gn;

    @dy(field = 1303058145938596080L)
    private final Model j6;

    @dy(field = 2996577405921825096L)
    private LexerHelper tp;

    @dy(field = 402632814509451012L)
    private h7 u7;

    @dy(field = -1365013531441814373L)
    private SyntaxTree v5;

    @dy(field = 2238391871757630556L)
    private HtmlPreprocessor we;

    static {
        iy.Zo(HtmlCodeModel.class);
    }

    @ey(method = -503183244980281171L)
    public HtmlCodeModel(Model model) {
        try {
            if (J0) {
                iy.tp(1170819307882697408L, null, model);
            }
            this.j6 = model;
            this.DW = new XmlLanguage(model, false);
            this.FH = new JavaScriptLanguage(model);
            this.Hw = new JavaScriptCommentsLanguage(model);
            this.we = new HtmlPreprocessor(model, this.DW);
            if (model != null) {
                XmlLexer xmlLexer = new XmlLexer(null);
                xmlLexer.gn(true);
                this.tp = new LexerHelper(model.identifierSpace, model.errorTable, this.DW, xmlLexer);
                this.EQ = new XmlParser((XmlCodeAnalyzer) this.DW.getCodeAnalyzer(), model.identifierSpace, model.errorTable, model.entitySpace, (XmlSyntax) this.DW.getSyntax(), false);
                this.v5 = new SyntaxTree(model);
                this.Zo = new u7(model);
                this.VH = new n7(model.identifierSpace, model.errorTable, this.FH, this.Hw);
                this.gn = new JavaScriptParser(model.identifierSpace, model.errorTable, model.entitySpace, (JavaScriptSyntax) this.FH.getSyntax());
                this.u7 = new h7(model);
            }
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, 1170819307882697408L, null, model);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 3730187808824273420L)
    public void closeArchive() {
        try {
            if (J0) {
                iy.gn(-2202527766998861512L, this);
            }
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, -2202527766998861512L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -2838193958489372080L)
    public void fillSyntaxTree(FileEntry fileEntry, Reader reader, Map<Language, SyntaxTreeStyles> map) {
        try {
            if (J0) {
                iy.we(2132382866967207264L, this, fileEntry, reader, map);
            }
            this.v5.clear();
            this.v5.lg(fileEntry, this.DW);
            this.tp.DW(fileEntry, reader, false, true, map.get(this.DW));
            this.EQ.v5(map.get(this.DW), fileEntry, false, this.v5);
            this.Zo.u7(this.v5, map.get(this.DW), true);
            this.VH.v5(fileEntry, this.Zo.Hw(), false, false, false, false, map.get(this.FH), map.get(this.Hw));
        } catch (Throwable th) {
            if (J8) {
                iy.U2(th, 2132382866967207264L, this, fileEntry, reader, map);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -978030798257579305L)
    public void fillSyntaxTree(FileEntry fileEntry, Reader reader, Map<Language, SyntaxTree> map, boolean z) throws Throwable {
        boolean z2;
        SyntaxTree syntaxTree;
        try {
            if (J0) {
                iy.J0(1915092999152893721L, this, fileEntry, reader, map, new Boolean(z));
            }
            if (map.containsKey(this.DW)) {
                syntaxTree = map.get(this.DW);
            } else {
                this.v5.clear();
                this.v5.lg(fileEntry, this.DW);
                syntaxTree = this.v5;
            }
            SyntaxTreeStyles syntaxTreeStylesMakeSyntaxTreeStyles = this.j6.U2.makeSyntaxTreeStyles();
            this.tp.DW(fileEntry, reader, z && map.containsKey(this.DW), true, syntaxTreeStylesMakeSyntaxTreeStyles);
            this.EQ.v5(syntaxTreeStylesMakeSyntaxTreeStyles, fileEntry, z && map.containsKey(this.DW), syntaxTree);
            this.j6.U2.DW(syntaxTreeStylesMakeSyntaxTreeStyles);
            if (map.containsKey(this.Hw) || map.containsKey(this.FH)) {
                this.Zo.u7(syntaxTree, null, false);
                SyntaxTreeStyles syntaxTreeStylesMakeSyntaxTreeStyles2 = this.j6.U2.makeSyntaxTreeStyles();
                SyntaxTreeStyles syntaxTreeStylesMakeSyntaxTreeStyles3 = this.j6.U2.makeSyntaxTreeStyles();
                z2 = z;
                try {
                    this.VH.v5(fileEntry, this.Zo.Hw(), z && map.containsKey(this.FH), z && map.containsKey(this.Hw), map.containsKey(this.FH), map.containsKey(this.Hw), syntaxTreeStylesMakeSyntaxTreeStyles2, syntaxTreeStylesMakeSyntaxTreeStyles3);
                    if (map.containsKey(this.FH)) {
                        this.gn.v5(syntaxTreeStylesMakeSyntaxTreeStyles2, fileEntry, z2, map.get(this.FH));
                    }
                    this.j6.U2.DW(syntaxTreeStylesMakeSyntaxTreeStyles2);
                    if (map.containsKey(this.Hw)) {
                        this.u7.j6(syntaxTreeStylesMakeSyntaxTreeStyles3, fileEntry, z2, map.get(this.Hw));
                    }
                    this.j6.U2.DW(syntaxTreeStylesMakeSyntaxTreeStyles3);
                } catch (Throwable th) {
                    th = th;
                    if (J8) {
                        iy.a8(th, 1915092999152893721L, this, fileEntry, reader, map, new Boolean(z2));
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = z;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 6638131699497858280L)
    public String[] getArchiveEntries(String str) {
        try {
            if (!J0) {
                return null;
            }
            iy.tp(6338925938704769292L, this, str);
            return null;
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, 6338925938704769292L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 1450494309472286023L)
    public Reader getArchiveEntryReader(String str, String str2, String str3) {
        try {
            if (!J0) {
                return null;
            }
            iy.we(-245774188382114511L, this, str, str2, str3);
            return null;
        } catch (Throwable th) {
            if (J8) {
                iy.U2(th, -245774188382114511L, this, str, str2, str3);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 2605548944367809640L)
    public long getArchiveVersion(String str) {
        try {
            if (!J0) {
                return 0L;
            }
            iy.tp(2778751354752590388L, this, str);
            return 0L;
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, 2778751354752590388L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 4623963966433685673L)
    public Compiler getCompiler() {
        try {
            if (!J0) {
                return null;
            }
            iy.gn(-3888492332100102621L, this);
            return null;
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, -3888492332100102621L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -2601977243459904403L)
    public Debugger getDebugger() {
        try {
            if (!J0) {
                return null;
            }
            iy.gn(-1340644675400322325L, this);
            return null;
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, -1340644675400322325L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 283259215199731496L)
    public String[] getDefaultFilePatterns() {
        try {
            if (J0) {
                iy.gn(-2064867609730530560L, this);
            }
            return new String[]{"*.html", "*.htm", "*.xhtml"};
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, -2064867609730530560L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -276115401947520591L)
    public String[] getExtendFilePatterns() {
        try {
            if (J0) {
                iy.gn(3096465211705266351L, this);
            }
            return new String[0];
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, 3096465211705266351L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 3698060166219261379L)
    public List<Language> getLanguages() {
        try {
            if (J0) {
                iy.gn(-2219812685373630975L, this);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.FH);
            arrayList.add(this.Hw);
            arrayList.add(this.DW);
            return arrayList;
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, -2219812685373630975L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -5255990191767427016L)
    public String getName() {
        try {
            if (!J0) {
                return "HTML";
            }
            iy.gn(-2329271218580274668L, this);
            return "HTML";
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, -2329271218580274668L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -112277422141615815L)
    public Preprocessor getPreprocessor() {
        try {
            if (J0) {
                iy.gn(2740407270930887327L, this);
            }
            return this.we;
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, 2740407270930887327L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 6592602623242123541L)
    public boolean isSupportArchiveFile() {
        try {
            if (!J0) {
                return false;
            }
            iy.gn(-1142537968216203489L, this);
            return false;
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, -1142537968216203489L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -1674028018210679785L)
    public void processVersion(FileEntry fileEntry, Language language) {
        try {
            if (J0) {
                iy.EQ(985401073895264037L, this, fileEntry, language);
            }
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, 985401073895264037L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -1576852503999393465L)
    public boolean u7() {
        try {
            if (!J0) {
                return true;
            }
            iy.gn(2734391001434262489L, this);
            return true;
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, 2734391001434262489L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 283877474165593399L)
    public void update() {
        try {
            if (J0) {
                iy.gn(549343102804436085L, this);
            }
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, 549343102804436085L, this);
            }
            throw th;
        }
    }
}
