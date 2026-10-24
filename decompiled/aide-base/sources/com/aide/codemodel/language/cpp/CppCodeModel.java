package com.aide.codemodel.language.cpp;

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

@cy(clazz = 1400786892746236824L, container = 1400786892746236824L, user = true)
/* loaded from: classes.dex */
public class CppCodeModel implements CodeModel {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 2512915026456585633L)
    private LexerHelper DW;

    @dy(field = 272273693822924057L)
    private final CppLanguage j6;

    static {
        iy.Zo(CppCodeModel.class);
    }

    @ey(method = 520535294439925520L)
    public CppCodeModel(Model model) {
        try {
            if (FH) {
                iy.tp(-1838827975378558773L, null, model);
            }
            this.j6 = new CppLanguage(model);
            if (model != null) {
                this.DW = new LexerHelper(model.identifierSpace, model.errorTable, this.j6, new CppLexer(null));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -1838827975378558773L, null, model);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -3296782796024332911L)
    public void closeArchive() {
        try {
            if (FH) {
                iy.gn(2652561390273588801L, this);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 2652561390273588801L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -670459218388257091L)
    public void fillSyntaxTree(FileEntry fileEntry, Reader reader, Map<Language, SyntaxTreeStyles> map) {
        try {
            if (FH) {
                iy.we(-932552768815360623L, this, fileEntry, reader, map);
            }
            this.DW.DW(fileEntry, reader, false, false, map.get(this.j6));
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -932552768815360623L, this, fileEntry, reader, map);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -1329604110907685436L)
    public void fillSyntaxTree(FileEntry fileEntry, Reader reader, Map<Language, SyntaxTree> map, boolean z) {
        try {
            if (FH) {
                iy.J0(1035648560303963648L, this, fileEntry, reader, map, new Boolean(z));
            }
            if (map.containsKey(this.j6)) {
                SyntaxTree syntaxTree = map.get(this.j6);
                syntaxTree.U2(syntaxTree.declareNode(0, true, new int[0], 0, 0, 1, 1));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 1035648560303963648L, this, fileEntry, reader, map, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 1840473985209349237L)
    public String[] getArchiveEntries(String str) {
        try {
            if (!FH) {
                return null;
            }
            iy.tp(-3254501230968907367L, this, str);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -3254501230968907367L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -404004222905153148L)
    public Reader getArchiveEntryReader(String str, String str2, String str3) {
        try {
            if (!FH) {
                return null;
            }
            iy.we(2971588647099852160L, this, str, str2, str3);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 2971588647099852160L, this, str, str2, str3);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -2238661230357489983L)
    public long getArchiveVersion(String str) {
        try {
            if (!FH) {
                return 0L;
            }
            iy.tp(-6765166123785771075L, this, str);
            return 0L;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -6765166123785771075L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -2090692570099256064L)
    public Compiler getCompiler() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(-3340496093919218080L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -3340496093919218080L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 749790877300387696L)
    public Debugger getDebugger() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(-874083922840307304L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -874083922840307304L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 61653940334309835L)
    public String[] getDefaultFilePatterns() {
        try {
            if (FH) {
                iy.gn(-3751821775393259913L, this);
            }
            return new String[]{"*.cpp", "*.cc", "*.c", "*.h", "*.hh", "*.hpp", "*.inl", "*.gradle"};
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -3751821775393259913L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 317795703734187052L)
    public String[] getExtendFilePatterns() {
        try {
            if (FH) {
                iy.gn(1303781324614649920L, this);
            }
            return new String[0];
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1303781324614649920L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -3314902247915630256L)
    public List<Language> getLanguages() {
        try {
            if (FH) {
                iy.gn(2624924067834447288L, this);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.j6);
            return arrayList;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 2624924067834447288L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 4094043018736057233L)
    public String getName() {
        try {
            if (!FH) {
                return "C++";
            }
            iy.gn(-4728981447678416435L, this);
            return "C++";
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -4728981447678416435L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 2958366620650538396L)
    public Preprocessor getPreprocessor() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(-3708901743114322080L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -3708901743114322080L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 5854249987644187584L)
    public boolean isSupportArchiveFile() {
        try {
            if (!FH) {
                return false;
            }
            iy.gn(1230499389895354660L, this);
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1230499389895354660L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -2261962940207636008L)
    public void processVersion(FileEntry fileEntry, Language language) {
        try {
            if (FH) {
                iy.EQ(-1745299973853108920L, this, fileEntry, language);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -1745299973853108920L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 2198037707343366000L)
    public boolean u7() {
        try {
            if (!FH) {
                return true;
            }
            iy.gn(-1992949407207825088L, this);
            return true;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1992949407207825088L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 2800283428527664904L)
    public void update() {
        try {
            if (FH) {
                iy.gn(-2013583876481469224L, this);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -2013583876481469224L, this);
            }
            throw th;
        }
    }
}
