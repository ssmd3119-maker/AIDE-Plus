package com.aide.codemodel.language.dtd;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.m4;
import abcd.n5;
import abcd.s5;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.LexerHelper;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeStyles;
import com.aide.codemodel.api.abstraction.CodeModel;
import com.aide.codemodel.api.abstraction.Compiler;
import com.aide.codemodel.api.abstraction.Debugger;
import com.aide.codemodel.api.abstraction.DebuggerResourceProvider;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.abstraction.Preprocessor;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@cy(clazz = -3880325837427718640L, container = -3880325837427718640L, user = true)
/* loaded from: classes.dex */
public class DtdCodeModel implements CodeModel {

    @gy
    private static /* synthetic */ boolean tp;

    @fy
    private static /* synthetic */ boolean u7;

    @dy(field = 1642418632607627735L)
    private final Model DW;

    @dy(field = -2689098624701567628L)
    private final DtdLanguage FH;

    @dy(field = 2472302440013273280L)
    private LexerHelper Hw;

    @dy(field = -3130702664235122284L)
    private m4 VH;

    @dy(field = -2603719316535511969L)
    private s5 Zo;

    @dy(field = -186628273700335320L)
    private SyntaxTree gn;

    @dy(field = -200264897328616072L)
    private Map<String, String> j6;

    @dy(field = -1422967253796294319L)
    private DtdParser v5;

    static {
        iy.Zo(DtdCodeModel.class);
    }

    @ey(method = 133683008847196452L)
    public DtdCodeModel(Model model) {
        try {
            if (u7) {
                iy.tp(2052654613815856752L, null, model);
            }
            this.DW = model;
            this.FH = new DtdLanguage(model);
            if (model != null) {
                this.Hw = new LexerHelper(model.identifierSpace, model.errorTable, this.FH, new DtdLexer(null));
                this.v5 = new DtdParser(model.identifierSpace, model.errorTable, model.entitySpace, this.FH.getSyntax());
                this.Zo = new s5(model, this, this.FH, this.Hw);
                this.VH = new m4(model);
                this.gn = new SyntaxTree(model);
                this.j6 = new HashMap();
                rN();
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 2052654613815856752L, null, model);
            }
            throw th;
        }
    }

    @ey(method = -5746251676989705625L)
    private void aM(StringReader stringReader) {
        try {
            if (u7) {
                iy.tp(-961651772899366109L, this, stringReader);
            }
            SyntaxTreeStyles syntaxTreeStylesMakeSyntaxTreeStyles = this.DW.U2.makeSyntaxTreeStyles();
            this.Hw.DW(null, stringReader, false, true, syntaxTreeStylesMakeSyntaxTreeStyles);
            this.VH.u7();
            this.Zo.Ws(null, syntaxTreeStylesMakeSyntaxTreeStyles, this.VH, false);
            this.gn.clear();
            this.gn.lg(null, this.FH);
            SyntaxTreeStyles syntaxTreeStylesMakeSyntaxTreeStyles2 = this.DW.U2.makeSyntaxTreeStyles();
            this.Hw.DW(null, this.VH.J0(), false, true, syntaxTreeStylesMakeSyntaxTreeStyles2);
            this.v5.v5(syntaxTreeStylesMakeSyntaxTreeStyles2, null, false, this.gn);
            this.DW.U2.DW(syntaxTreeStylesMakeSyntaxTreeStyles2);
            this.DW.U2.DW(syntaxTreeStylesMakeSyntaxTreeStyles);
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -961651772899366109L, this, stringReader);
            }
            throw th;
        }
    }

    @ey(method = 1394827593293996345L)
    private void lg(String str, String str2) {
        try {
            if (u7) {
                iy.EQ(405938682044757549L, this, str, str2);
            }
            try {
                InputStream resourceInputStream = DebuggerResourceProvider.getDefProvider().getResourceInputStream("dtds/" + str2);
                if (resourceInputStream == null) {
                    return;
                }
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(resourceInputStream, "UTF-8");
                    StringWriter stringWriter = new StringWriter();
                    char[] cArr = new char[4096];
                    while (true) {
                        int i = inputStreamReader.read(cArr);
                        if (i == -1) {
                            stringWriter.close();
                            this.j6.put(str, stringWriter.toString());
                            resourceInputStream.close();
                            return;
                        }
                        stringWriter.write(cArr, 0, i);
                    }
                } catch (Throwable th) {
                    resourceInputStream.close();
                    throw th;
                }
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            if (tp) {
                iy.Mr(th2, 405938682044757549L, this, str, str2);
            }
            throw th2;
        }
    }

    @ey(method = 2437735597603239199L)
    private void rN() {
        try {
            if (u7) {
                iy.gn(4330615072223659347L, this);
            }
            lg("-//W3C//DTD XHTML 1.0 Strict//EN", "xhtml1-strict.dtd");
            lg("-//W3C//DTD XHTML 1.0 Transitional//EN", "xhtml1-transitional.dtd");
            lg("-//W3C//DTD XHTML 1.0 Frameset//EN", "xhtml1-frameset.dtd");
            lg("-//W3C//ENTITIES Latin 1 for XHTML//EN", "xhtml-lat1.ent");
            lg("-//W3C//ENTITIES Symbols for XHTML//EN", "xhtml-symbol.ent");
            lg("-//W3C//ENTITIES Special for XHTML//EN", "xhtml-special.ent");
            lg("-//W3C//DTD HTML 4.01//EN", "strict.dtd");
            lg("-//W3C//DTD HTML 4.01 Transitional//EN", "loose.dtd");
            lg("-//W3C//DTD HTML 4.01 Frameset//EN", "frameset.dtd");
            lg("-//W3C//ENTITIES Latin1//EN//HTML", "HTMLlat1.ent");
            lg("-//W3C//ENTITIES Symbols//EN//HTML", "HTMLsymbol.ent");
            lg("-//W3C//ENTITIES Special//EN//HTML", "HTMLspecial.ent");
            lg("-//HTML 5", "html5.dtd");
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 4330615072223659347L, this);
            }
            throw th;
        }
    }

    @ey(method = -1371761739739923528L)
    public FileEntry Mr(String str) {
        try {
            if (!u7) {
                return null;
            }
            iy.tp(57780158738464584L, this, str);
            return null;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 57780158738464584L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2849221916459215920L)
    public n5 U2(String str) {
        try {
            if (u7) {
                iy.tp(2247743001423053904L, this, str);
            }
            if (!this.j6.containsKey(str)) {
                return null;
            }
            try {
                aM(new StringReader(this.j6.get(str)));
                boolean z = true;
                if (str.indexOf("HTML") != -1 && str.indexOf("XHTML") == -1) {
                    z = false;
                }
                return new n5(this.DW, this.gn, z);
            } catch (IOException unused) {
                return null;
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 2247743001423053904L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 465263395372407511L)
    public Reader a8(String str) {
        try {
            if (u7) {
                iy.tp(2061559239045796315L, this, str);
            }
            if (this.j6.containsKey(str)) {
                return new StringReader(this.j6.get(str));
            }
            return null;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 2061559239045796315L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 4508453775881029737L)
    public void closeArchive() {
        try {
            if (u7) {
                iy.gn(4337741932171101765L, this);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 4337741932171101765L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -2519224261110385983L)
    public void fillSyntaxTree(FileEntry fileEntry, Reader reader, Map<Language, SyntaxTreeStyles> map) {
        try {
            if (u7) {
                iy.we(-1358236150016391123L, this, fileEntry, reader, map);
            }
            SyntaxTreeStyles syntaxTreeStylesMakeSyntaxTreeStyles = this.DW.U2.makeSyntaxTreeStyles();
            this.VH.u7();
            this.Hw.DW(fileEntry, reader, false, true, syntaxTreeStylesMakeSyntaxTreeStyles);
            this.Zo.Ws(fileEntry, syntaxTreeStylesMakeSyntaxTreeStyles, this.VH, false);
            this.Hw.DW(fileEntry, this.VH.J0(), false, false, map.get(this.FH));
        } catch (Throwable th) {
            if (tp) {
                iy.U2(th, -1358236150016391123L, this, fileEntry, reader, map);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 3485539571850679168L)
    public void fillSyntaxTree(FileEntry fileEntry, Reader reader, Map<Language, SyntaxTree> map, boolean z) {
        try {
            if (u7) {
                iy.J0(1104341348954731056L, this, fileEntry, reader, map, new Boolean(z));
            }
            SyntaxTreeStyles syntaxTreeStylesMakeSyntaxTreeStyles = this.DW.U2.makeSyntaxTreeStyles();
            this.Hw.DW(fileEntry, reader, false, true, syntaxTreeStylesMakeSyntaxTreeStyles);
            this.VH.u7();
            this.Zo.Ws(fileEntry, syntaxTreeStylesMakeSyntaxTreeStyles, this.VH, z);
            SyntaxTreeStyles syntaxTreeStylesMakeSyntaxTreeStyles2 = this.DW.U2.makeSyntaxTreeStyles();
            this.Hw.DW(fileEntry, this.VH.J0(), z, map.containsKey(this.FH), syntaxTreeStylesMakeSyntaxTreeStyles2);
            this.v5.v5(syntaxTreeStylesMakeSyntaxTreeStyles2, fileEntry, z, map.get(this.FH));
            this.DW.U2.DW(syntaxTreeStylesMakeSyntaxTreeStyles2);
            this.DW.U2.DW(syntaxTreeStylesMakeSyntaxTreeStyles);
        } catch (Throwable th) {
            if (tp) {
                iy.a8(th, 1104341348954731056L, this, fileEntry, reader, map, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -2383016148459475095L)
    public String[] getArchiveEntries(String str) {
        try {
            if (!u7) {
                return null;
            }
            iy.tp(2046405660810391485L, this, str);
            return null;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 2046405660810391485L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 500517424201683200L)
    public Reader getArchiveEntryReader(String str, String str2, String str3) {
        try {
            if (!u7) {
                return null;
            }
            iy.we(2462431710511052800L, this, str, str2, str3);
            return null;
        } catch (Throwable th) {
            if (tp) {
                iy.U2(th, 2462431710511052800L, this, str, str2, str3);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -6323386520155612131L)
    public long getArchiveVersion(String str) {
        try {
            if (!u7) {
                return 0L;
            }
            iy.tp(-1621319402684813663L, this, str);
            return 0L;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -1621319402684813663L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 3861723935890438200L)
    public Compiler getCompiler() {
        try {
            if (!u7) {
                return null;
            }
            iy.gn(1878598685774922664L, this);
            return null;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 1878598685774922664L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -3107106333514980384L)
    public Debugger getDebugger() {
        try {
            if (!u7) {
                return null;
            }
            iy.gn(4447166220827836792L, this);
            return null;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 4447166220827836792L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -148770462811822905L)
    public String[] getDefaultFilePatterns() {
        try {
            if (u7) {
                iy.gn(-4859413946788237653L, this);
            }
            return new String[]{"*.dtd"};
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -4859413946788237653L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -65702193026152032L)
    public String[] getExtendFilePatterns() {
        try {
            if (u7) {
                iy.gn(359212485585275952L, this);
            }
            return new String[0];
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 359212485585275952L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 4475274810818852880L)
    public List<Language> getLanguages() {
        try {
            if (u7) {
                iy.gn(4305653429883816240L, this);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.FH);
            return arrayList;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 4305653429883816240L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 2591829424893750445L)
    public String getName() {
        try {
            if (!u7) {
                return "DTD";
            }
            iy.gn(4471190433233783377L, this);
            return "DTD";
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 4471190433233783377L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 5418384014016685152L)
    public Preprocessor getPreprocessor() {
        try {
            if (!u7) {
                return null;
            }
            iy.gn(4137195153436838528L, this);
            return null;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 4137195153436838528L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -1892596730417653340L)
    public boolean isSupportArchiveFile() {
        try {
            if (!u7) {
                return false;
            }
            iy.gn(709638365970742284L, this);
            return false;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 709638365970742284L, this);
            }
            throw th;
        }
    }

    @ey(method = -1785012453194320647L)
    public String j3() {
        try {
            if (!u7) {
                return "-//HTML 5";
            }
            iy.gn(-2404261657895084235L, this);
            return "-//HTML 5";
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -2404261657895084235L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 2151762292012757200L)
    public void processVersion(FileEntry fileEntry, Language language) {
        try {
            if (u7) {
                iy.EQ(-2047957409131385808L, this, fileEntry, language);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, -2047957409131385808L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -617848045960322360L)
    public boolean u7() {
        try {
            if (!u7) {
                return true;
            }
            iy.gn(-525342405325897936L, this);
            return true;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -525342405325897936L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 285695275013085088L)
    public void update() {
        try {
            if (u7) {
                iy.gn(2612152919975587552L, this);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 2612152919975587552L, this);
            }
            throw th;
        }
    }
}
