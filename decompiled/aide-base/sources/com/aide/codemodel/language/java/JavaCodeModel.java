package com.aide.codemodel.language.java;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.g6;
import abcd.gy;
import abcd.iy;
import abcd.t6;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeStyles;
import com.aide.codemodel.api.abstraction.CodeModel;
import com.aide.codemodel.api.abstraction.Compiler;
import com.aide.codemodel.api.abstraction.Debugger;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.abstraction.Preprocessor;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@cy(clazz = -3844363885030032000L, container = -3844363885030032000L, user = true)
/* loaded from: classes.dex */
public class JavaCodeModel implements CodeModel {

    @gy
    private static /* synthetic */ boolean tp;

    @fy
    private static /* synthetic */ boolean u7;

    @dy(field = 1863720181580300352L)
    private final JavaLanguage DW;

    @dy(field = -558713256507846873L)
    private final JSharpCommentsLanguage FH;

    @dy(field = 1893726370676315791L)
    private JavaCompiler Hw;

    @dy(field = 2602797361612273671L)
    private JavaParser VH;

    @dy(field = -1886156468457403964L)
    private t6 Zo;

    @dy(field = 5757738466325133288L)
    private g6 gn;

    @dy(field = 1247201319453301933L)
    private final Model j6;

    @dy(field = -3659704355356757265L)
    private JavaDebugger v5;

    static {
        iy.Zo(JavaCodeModel.class);
    }

    @ey(method = -448161463647731664L)
    public JavaCodeModel(Model model) {
        try {
            if (u7) {
                iy.tp(-3006025671479164928L, null, model);
            }
            this.j6 = model;
            this.DW = new JavaLanguage(model);
            this.FH = new JSharpCommentsLanguage(model, false);
            if (model != null) {
                this.Hw = new JavaCompiler(model, this.DW);
                this.v5 = new JavaDebugger(model, this.DW, this);
                this.Zo = new t6(model.identifierSpace, model.errorTable, false, this.DW, this.FH);
                this.VH = new JavaParser(model.identifierSpace, model.errorTable, model.entitySpace, (JavaSyntax) this.DW.getSyntax(), false);
                this.gn = new g6(model);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -3006025671479164928L, null, model);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -4954138863552677673L)
    public void closeArchive() {
        try {
            if (u7) {
                iy.gn(2362037693030139565L, this);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 2362037693030139565L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 311510110729037223L)
    public void fillSyntaxTree(FileEntry fileEntry, Reader reader, Map<Language, SyntaxTreeStyles> map) {
        try {
            if (u7) {
                iy.we(-2357062457901840751L, this, fileEntry, reader, map);
            }
            this.Zo.Zo(fileEntry, reader, false, false, false, false, map.get(this.DW), map.get(this.FH));
        } catch (Throwable th) {
            if (tp) {
                iy.U2(th, -2357062457901840751L, this, fileEntry, reader, map);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 1688478291853896168L)
    public void fillSyntaxTree(FileEntry fileEntry, Reader reader, Map<Language, SyntaxTree> map, boolean z) {
        try {
            if (u7) {
                iy.J0(784271987008465436L, this, fileEntry, reader, map, new Boolean(z));
            }
            SyntaxTreeStyles syntaxTreeStylesMakeSyntaxTreeStyles = this.j6.U2.makeSyntaxTreeStyles();
            SyntaxTreeStyles syntaxTreeStylesMakeSyntaxTreeStyles2 = this.j6.U2.makeSyntaxTreeStyles();
            this.Zo.Zo(fileEntry, reader, z && map.containsKey(this.DW), z && map.containsKey(this.FH), map.containsKey(this.DW), map.containsKey(this.FH), syntaxTreeStylesMakeSyntaxTreeStyles, syntaxTreeStylesMakeSyntaxTreeStyles2);
            if (map.containsKey(this.DW)) {
                this.VH.v5(syntaxTreeStylesMakeSyntaxTreeStyles, fileEntry, z, map.get(this.DW));
            }
            this.j6.U2.DW(syntaxTreeStylesMakeSyntaxTreeStyles);
            if (map.containsKey(this.FH)) {
                this.gn.j6(syntaxTreeStylesMakeSyntaxTreeStyles2, fileEntry, z, map.get(this.FH));
            }
            this.j6.U2.DW(syntaxTreeStylesMakeSyntaxTreeStyles2);
        } catch (Throwable th) {
            if (tp) {
                iy.a8(th, 784271987008465436L, this, fileEntry, reader, map, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 966581297037977475L)
    public String[] getArchiveEntries(String str) {
        try {
            if (!u7) {
                return null;
            }
            iy.tp(-1116017847025766607L, this, str);
            return null;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -1116017847025766607L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -2157855899401323376L)
    public Reader getArchiveEntryReader(String str, String str2, String str3) {
        try {
            if (!u7) {
                return null;
            }
            iy.we(-3270367501141238676L, this, str, str2, str3);
            return null;
        } catch (Throwable th) {
            if (tp) {
                iy.U2(th, -3270367501141238676L, this, str, str2, str3);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -2924910001667399569L)
    public long getArchiveVersion(String str) {
        try {
            if (!u7) {
                return 0L;
            }
            iy.tp(-4728263059550402275L, this, str);
            return 0L;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -4728263059550402275L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 2308467009344981040L)
    public Compiler getCompiler() {
        try {
            if (u7) {
                iy.gn(1212439808015892768L, this);
            }
            return this.Hw;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 1212439808015892768L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -4611244882452920500L)
    public Debugger getDebugger() {
        try {
            if (u7) {
                iy.gn(3753125284163806760L, this);
            }
            return this.v5;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 3753125284163806760L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -63002843151904887L)
    public String[] getDefaultFilePatterns() {
        try {
            if (u7) {
                iy.gn(6334764871445597447L, this);
            }
            return new String[]{"*.java"};
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 6334764871445597447L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 5332207902453144L)
    public String[] getExtendFilePatterns() {
        try {
            if (u7) {
                iy.gn(-6377990797241939532L, this);
            }
            return new String[0];
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -6377990797241939532L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -4967405727220544832L)
    public List<Language> getLanguages() {
        try {
            if (u7) {
                iy.gn(2334489221699440784L, this);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.DW);
            arrayList.add(this.FH);
            return arrayList;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 2334489221699440784L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -453407773480860273L)
    public String getName() {
        try {
            if (!u7) {
                return "Java";
            }
            iy.gn(3215765106467840781L, this);
            return "Java";
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 3215765106467840781L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -768611827077047200L)
    public Preprocessor getPreprocessor() {
        try {
            if (!u7) {
                return null;
            }
            iy.gn(-2417512046810867500L, this);
            return null;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -2417512046810867500L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -4029270566210165432L)
    public boolean isSupportArchiveFile() {
        try {
            if (!u7) {
                return false;
            }
            iy.gn(4197284544797178720L, this);
            return false;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 4197284544797178720L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 2287121022557233152L)
    public void processVersion(FileEntry fileEntry, Language language) {
        try {
            if (u7) {
                iy.EQ(-401222028929912856L, this, fileEntry, language);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, -401222028929912856L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 297350075332579580L)
    public boolean u7() {
        try {
            if (!u7) {
                return false;
            }
            iy.gn(-2448938904852503256L, this);
            return false;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -2448938904852503256L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 660069965162749248L)
    public void update() {
        try {
            if (u7) {
                iy.gn(-696175720602914760L, this);
            }
            this.Hw.k4();
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, -696175720602914760L, this);
            }
            throw th;
        }
    }
}
