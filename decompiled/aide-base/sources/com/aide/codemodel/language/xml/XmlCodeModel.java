package com.aide.codemodel.language.xml;

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

@cy(clazz = -6097528287944028872L, container = -6097528287944028872L, user = true)
/* loaded from: classes.dex */
public class XmlCodeModel implements CodeModel {

    @gy
    private static /* synthetic */ boolean Zo;

    @fy
    private static /* synthetic */ boolean v5;

    @dy(field = 1814192167648963625L)
    private final XmlLanguage DW;

    @dy(field = 264709372156725413L)
    private LexerHelper FH;

    @dy(field = 1674156759804595604L)
    private XmlParser Hw;

    @dy(field = 2458260768306017763L)
    private final Model j6;

    static {
        iy.Zo(XmlCodeModel.class);
    }

    @ey(method = -81005950050495624L)
    public XmlCodeModel(Model model) {
        try {
            if (v5) {
                iy.tp(4234455557774961779L, null, model);
            }
            this.j6 = model;
            this.DW = new XmlLanguage(model, true);
            if (model != null) {
                this.FH = new LexerHelper(model.identifierSpace, model.errorTable, this.DW, new XmlLexer(null));
                this.Hw = new XmlParser((XmlCodeAnalyzer) this.DW.getCodeAnalyzer(), model.identifierSpace, model.errorTable, model.entitySpace, (XmlSyntax) this.DW.getSyntax(), true);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 4234455557774961779L, null, model);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 4336356686219868915L)
    public void closeArchive() {
        try {
            if (v5) {
                iy.gn(-234477040378808469L, this);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -234477040378808469L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -613650659110653825L)
    public void fillSyntaxTree(FileEntry fileEntry, Reader reader, Map<Language, SyntaxTreeStyles> map) {
        try {
            if (v5) {
                iy.we(837685977947731795L, this, fileEntry, reader, map);
            }
            this.FH.DW(fileEntry, reader, false, false, map.get(this.DW));
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, 837685977947731795L, this, fileEntry, reader, map);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -1679374291477672832L)
    public void fillSyntaxTree(FileEntry fileEntry, Reader reader, Map<Language, SyntaxTree> map, boolean z) {
        try {
            if (v5) {
                iy.J0(-652302252067827600L, this, fileEntry, reader, map, new Boolean(z));
            }
            SyntaxTreeStyles syntaxTreeStylesMakeSyntaxTreeStyles = this.j6.U2.makeSyntaxTreeStyles();
            this.FH.DW(fileEntry, reader, z, map.containsKey(this.DW), syntaxTreeStylesMakeSyntaxTreeStyles);
            this.Hw.v5(syntaxTreeStylesMakeSyntaxTreeStyles, fileEntry, z, map.get(this.DW));
            this.j6.U2.DW(syntaxTreeStylesMakeSyntaxTreeStyles);
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, -652302252067827600L, this, fileEntry, reader, map, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -5166019225233356645L)
    public String[] getArchiveEntries(String str) {
        try {
            if (!v5) {
                return null;
            }
            iy.tp(-2556180528625997049L, this, str);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -2556180528625997049L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 1765632171327554760L)
    public Reader getArchiveEntryReader(String str, String str2, String str3) {
        try {
            if (!v5) {
                return null;
            }
            iy.we(-3435565838068433016L, this, str, str2, str3);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, -3435565838068433016L, this, str, str2, str3);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 5852419533384736767L)
    public long getArchiveVersion(String str) {
        try {
            if (!v5) {
                return 0L;
            }
            iy.tp(-6290757679610877837L, this, str);
            return 0L;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -6290757679610877837L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -4047317628976948180L)
    public Compiler getCompiler() {
        try {
            if (!v5) {
                return null;
            }
            iy.gn(-4520928497255102304L, this);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -4520928497255102304L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -1459827035213412096L)
    public Debugger getDebugger() {
        try {
            if (!v5) {
                return null;
            }
            iy.gn(-1908571152626089084L, this);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -1908571152626089084L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -3214346011784262255L)
    public String[] getDefaultFilePatterns() {
        try {
            if (v5) {
                iy.gn(5882592202824787149L, this);
            }
            return new String[]{"*.xml", "*.xsl", "*.xslt", "*.xsd", "*.*proj", "*.resx", "*.settings", "*.config", "*.tld", "*.svg"};
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 5882592202824787149L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 2013764513208834128L)
    public String[] getExtendFilePatterns() {
        try {
            if (v5) {
                iy.gn(-7040807125559185680L, this);
            }
            return new String[0];
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -7040807125559185680L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 4304286147502171116L)
    public List<Language> getLanguages() {
        try {
            if (v5) {
                iy.gn(-256696877670428592L, this);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.DW);
            return arrayList;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -256696877670428592L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 4585451744308014879L)
    public String getName() {
        try {
            if (!v5) {
                return "XML";
            }
            iy.gn(784631694789004147L, this);
            return "XML";
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 784631694789004147L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -3241162704282179544L)
    public Preprocessor getPreprocessor() {
        try {
            if (!v5) {
                return null;
            }
            iy.gn(-5663266990095493560L, this);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -5663266990095493560L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -5963729418740353568L)
    public boolean isSupportArchiveFile() {
        try {
            if (!v5) {
                return false;
            }
            iy.gn(754034127508525896L, this);
            return false;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 754034127508525896L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = 1782040834339287604L)
    public void processVersion(FileEntry fileEntry, Language language) {
        try {
            if (v5) {
                iy.EQ(-1363683621655447776L, this, fileEntry, language);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, -1363683621655447776L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -521174876391244992L)
    public boolean u7() {
        try {
            if (!v5) {
                return true;
            }
            iy.gn(4825028736511867380L, this);
            return true;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 4825028736511867380L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeModel
    @ey(method = -2601308080266361068L)
    public void update() {
        try {
            if (v5) {
                iy.gn(-3001880288370212416L, this);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -3001880288370212416L, this);
            }
            throw th;
        }
    }
}
