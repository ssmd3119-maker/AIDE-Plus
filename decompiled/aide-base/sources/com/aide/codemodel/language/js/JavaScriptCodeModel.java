package com.aide.codemodel.language.js;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.h7;
import abcd.iy;
import abcd.n7;
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

@cy(clazz = 8051483563953556900L, container = 8051483563953556900L, user = true)
/* loaded from: classes.dex */
public class JavaScriptCodeModel implements CodeModel {

    @fy
    private static /* synthetic */ boolean VH;

    @gy
    private static /* synthetic */ boolean gn;

    @dy(field = -4508782080199255408L)
    private final JavaScriptLanguage DW;

    @dy(field = 467204491066697209L)
    private final JavaScriptCommentsLanguage FH;

    @dy(field = -28983501760058928L)
    private n7 Hw;

    @dy(field = -635034961424225024L)
    private h7 Zo;

    @dy(field = -186594282755035488L)
    private final Model j6;

    @dy(field = -2963602133605255783L)
    private JavaScriptParser v5;

    static {
        iy.Zo(JavaScriptCodeModel.class);
    }

    @ey(method = -546627138525349111L)
    public JavaScriptCodeModel(Model model) {
        try {
            if (VH) {
                iy.tp(108917148475101043L, null, model);
            }
            this.j6 = model;
            this.DW = new JavaScriptLanguage(model);
            this.FH = new JavaScriptCommentsLanguage(model);
            if (model != null) {
                this.Hw = new n7(model.identifierSpace, model.errorTable, this.DW, this.FH);
                this.v5 = new JavaScriptParser(model.identifierSpace, model.errorTable, model.entitySpace, (JavaScriptSyntax) this.DW.getSyntax());
                this.Zo = new h7(model);
            }
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, 108917148475101043L, null, model);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 5302198241360099520L)
    public void closeArchive() {
        try {
            if (VH) {
                iy.gn(-2088301407435598485L, this);
            }
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, -2088301407435598485L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 682264438548783640L)
    public void fillSyntaxTree(FileEntry fileEntry, Reader reader, Map<Language, SyntaxTreeStyles> map) {
        try {
            if (VH) {
                iy.we(-394175721358186873L, this, fileEntry, reader, map);
            }
            this.Hw.v5(fileEntry, reader, false, false, false, false, map.get(this.DW), map.get(this.FH));
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -394175721358186873L, this, fileEntry, reader, map);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -2066484183917151229L)
    public void fillSyntaxTree(FileEntry fileEntry, Reader reader, Map<Language, SyntaxTree> map, boolean z) {
        try {
            if (VH) {
                iy.J0(-1863774090955387488L, this, fileEntry, reader, map, new Boolean(z));
            }
            SyntaxTreeStyles syntaxTreeStylesMakeSyntaxTreeStyles = this.j6.U2.makeSyntaxTreeStyles();
            SyntaxTreeStyles syntaxTreeStylesMakeSyntaxTreeStyles2 = this.j6.U2.makeSyntaxTreeStyles();
            this.Hw.v5(fileEntry, reader, z && map.containsKey(this.DW), z && map.containsKey(this.FH), map.containsKey(this.DW), map.containsKey(this.FH), syntaxTreeStylesMakeSyntaxTreeStyles, syntaxTreeStylesMakeSyntaxTreeStyles2);
            if (map.containsKey(this.DW)) {
                this.v5.v5(syntaxTreeStylesMakeSyntaxTreeStyles, fileEntry, z, map.get(this.DW));
            }
            this.j6.U2.DW(syntaxTreeStylesMakeSyntaxTreeStyles);
            if (map.containsKey(this.FH)) {
                this.Zo.j6(syntaxTreeStylesMakeSyntaxTreeStyles2, fileEntry, z, map.get(this.FH));
            }
            this.j6.U2.DW(syntaxTreeStylesMakeSyntaxTreeStyles2);
        } catch (Throwable th) {
            if (gn) {
                iy.a8(th, -1863774090955387488L, this, fileEntry, reader, map, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -4688483395633478504L)
    public String[] getArchiveEntries(String str) {
        try {
            if (!VH) {
                return null;
            }
            iy.tp(3717649766313309715L, this, str);
            return null;
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, 3717649766313309715L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 3292212746570862819L)
    public Reader getArchiveEntryReader(String str, String str2, String str3) {
        try {
            if (!VH) {
                return null;
            }
            iy.we(-868962277044277176L, this, str, str2, str3);
            return null;
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -868962277044277176L, this, str, str2, str3);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 7642815645288787776L)
    public long getArchiveVersion(String str) {
        try {
            if (!VH) {
                return 0L;
            }
            iy.tp(253433842175877751L, this, str);
            return 0L;
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, 253433842175877751L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 3739431280548447993L)
    public Compiler getCompiler() {
        try {
            if (!VH) {
                return null;
            }
            iy.gn(-1788950599531095204L, this);
            return null;
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, -1788950599531095204L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -3569426265535966115L)
    public Debugger getDebugger() {
        try {
            if (!VH) {
                return null;
            }
            iy.gn(673151463639097600L, this);
            return null;
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, 673151463639097600L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -179843413465951600L)
    public String[] getDefaultFilePatterns() {
        try {
            if (VH) {
                iy.gn(-2021392102938567447L, this);
            }
            return new String[]{"*.js"};
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, -2021392102938567447L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 96394760415642261L)
    public String[] getExtendFilePatterns() {
        try {
            if (VH) {
                iy.gn(3039445136419153904L, this);
            }
            return new String[]{"*.min.js"};
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, 3039445136419153904L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 5266743305752507691L)
    public List<Language> getLanguages() {
        try {
            if (VH) {
                iy.gn(-2105053447863278916L, this);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.DW);
            arrayList.add(this.FH);
            return arrayList;
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, -2105053447863278916L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -1264006295568044240L)
    public String getName() {
        try {
            if (!VH) {
                return "JavaScript";
            }
            iy.gn(-604864966859292585L, this);
            return "JavaScript";
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, -604864966859292585L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -2120038126669116355L)
    public Preprocessor getPreprocessor() {
        try {
            if (!VH) {
                return null;
            }
            iy.gn(3788994682681942888L, this);
            return null;
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, 3788994682681942888L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -2945859916040572687L)
    public boolean isSupportArchiveFile() {
        try {
            if (!VH) {
                return false;
            }
            iy.gn(4959844410817586960L, this);
            return false;
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, 4959844410817586960L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 2565884575733062087L)
    public void processVersion(FileEntry fileEntry, Language language) {
        try {
            if (VH) {
                iy.EQ(-953562388359234908L, this, fileEntry, language);
            }
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, -953562388359234908L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -63025265818512945L)
    public boolean u7() {
        try {
            if (!VH) {
                return true;
            }
            iy.gn(2705158947143785248L, this);
            return true;
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, 2705158947143785248L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -736460751096167065L)
    public void update() {
        try {
            if (VH) {
                iy.gn(-2006223397506555580L, this);
            }
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, -2006223397506555580L, this);
            }
            throw th;
        }
    }
}
