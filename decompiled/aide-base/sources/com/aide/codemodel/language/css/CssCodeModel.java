package com.aide.codemodel.language.css;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
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
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@cy(clazz = -6425595162002754360L, container = -6425595162002754360L, user = true)
/* loaded from: classes.dex */
public class CssCodeModel implements CodeModel {

    @gy
    private static /* synthetic */ boolean Zo;

    @fy
    private static /* synthetic */ boolean v5;

    @dy(field = 4149201059015026560L)
    private final CssLanguage DW;

    @dy(field = -4162933497845693040L)
    private LexerHelper FH;

    @dy(field = -254987994198366825L)
    private CssParser Hw;

    @dy(field = -161536101880424652L)
    private final Model j6;

    static {
        iy.Zo(CssCodeModel.class);
    }

    @ey(method = -13642268833151241L)
    public CssCodeModel(Model model) {
        try {
            if (v5) {
                iy.tp(-3283626686284764435L, null, model);
            }
            this.j6 = model;
            this.DW = new CssLanguage(model);
            if (model != null) {
                this.FH = new LexerHelper(model.identifierSpace, model.errorTable, this.DW, new CssLexer(null));
                this.Hw = new CssParser(model.identifierSpace, model.errorTable, model.entitySpace, this.DW.getSyntax());
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -3283626686284764435L, null, model);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -1853699800113946224L)
    public void closeArchive() {
        try {
            if (v5) {
                iy.gn(-165505669196277575L, this);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -165505669196277575L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -2111342452043036820L)
    public void fillSyntaxTree(FileEntry fileEntry, Reader reader, Map<Language, SyntaxTreeStyles> map) {
        try {
            if (v5) {
                iy.we(-1501882094031937147L, this, fileEntry, reader, map);
            }
            this.FH.DW(fileEntry, reader, false, false, map.get(this.DW));
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, -1501882094031937147L, this, fileEntry, reader, map);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -330708184864497175L)
    public void fillSyntaxTree(FileEntry fileEntry, Reader reader, Map<Language, SyntaxTree> map, boolean z) {
        try {
            if (v5) {
                iy.J0(1936323198467434868L, this, fileEntry, reader, map, new Boolean(z));
            }
            SyntaxTree syntaxTree = map.get(this.DW);
            if (syntaxTree != null) {
                SyntaxTreeStyles syntaxTreeStylesMakeSyntaxTreeStyles = this.j6.U2.makeSyntaxTreeStyles();
                this.FH.FH(fileEntry, reader, false, true, syntaxTreeStylesMakeSyntaxTreeStyles, false, 1000);
                this.Hw.v5(syntaxTreeStylesMakeSyntaxTreeStyles, fileEntry, z, syntaxTree);
                if (z) {
                    this.DW.getCodeAnalyzer().u7(fileEntry, syntaxTreeStylesMakeSyntaxTreeStyles);
                }
                this.j6.U2.DW(syntaxTreeStylesMakeSyntaxTreeStyles);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, 1936323198467434868L, this, fileEntry, reader, map, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 4813339176830513472L)
    public String[] getArchiveEntries(String str) {
        try {
            if (!v5) {
                return null;
            }
            iy.tp(-1264956309488020275L, this, str);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -1264956309488020275L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -2467367772960722383L)
    public Reader getArchiveEntryReader(String str, String str2, String str3) {
        try {
            if (!v5) {
                return null;
            }
            iy.we(1164542227984959060L, this, str, str2, str3);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, 1164542227984959060L, this, str, str2, str3);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 1185333569734878080L)
    public long getArchiveVersion(String str) {
        try {
            if (!v5) {
                return 0L;
            }
            iy.tp(-4909372705462628935L, this, str);
            return 0L;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -4909372705462628935L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 2558479538860925855L)
    public Compiler getCompiler() {
        try {
            if (!v5) {
                return null;
            }
            iy.gn(4084413414275911248L, this);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 4084413414275911248L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -3975064064018001225L)
    public Debugger getDebugger() {
        try {
            if (!v5) {
                return null;
            }
            iy.gn(-2464152134229130096L, this);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -2464152134229130096L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -173189598697455900L)
    public String[] getDefaultFilePatterns() {
        try {
            if (v5) {
                iy.gn(-3192892750605948381L, this);
            }
            return new String[]{"*.css"};
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -3192892750605948381L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 5033452813068082959L)
    public String[] getExtendFilePatterns() {
        try {
            if (v5) {
                iy.gn(1997289180527943036L, this);
            }
            return new String[0];
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 1997289180527943036L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -1871970039711984115L)
    public List<Language> getLanguages() {
        try {
            if (v5) {
                iy.gn(-187534501995210784L, this);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.DW);
            return arrayList;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -187534501995210784L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -681823682465855872L)
    public String getName() {
        try {
            if (!v5) {
                return "Css";
            }
            iy.gn(2940635358963655625L, this);
            return "Css";
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 2940635358963655625L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 2105271174891542463L)
    public Preprocessor getPreprocessor() {
        try {
            if (!v5) {
                return null;
            }
            iy.gn(-810417293888641012L, this);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -810417293888641012L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -4820659442072124297L)
    public boolean isSupportArchiveFile() {
        try {
            if (!v5) {
                return false;
            }
            iy.gn(-1859869115256692736L, this);
            return false;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -1859869115256692736L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 571831764621054473L)
    public void processVersion(FileEntry fileEntry, Language language) {
        try {
            if (v5) {
                iy.EQ(1870665532981802280L, this, fileEntry, language);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 1870665532981802280L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 3122831887480429941L)
    public boolean u7() {
        try {
            if (!v5) {
                return true;
            }
            iy.gn(4819724193824156176L, this);
            return true;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 4819724193824156176L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 2258329169454971417L)
    public void update() {
        try {
            if (v5) {
                iy.gn(-853338090580712424L, this);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -853338090580712424L, this);
            }
            throw th;
        }
    }
}
