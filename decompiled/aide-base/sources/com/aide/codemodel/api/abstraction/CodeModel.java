package com.aide.codemodel.api.abstraction;

import abcd.cy;
import abcd.ey;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeStyles;
import java.io.Reader;
import java.util.List;
import java.util.Map;

@cy(clazz = 1394050126544571804L, container = 1394050126544571804L, user = true)
/* loaded from: classes.dex */
public interface CodeModel {
    @ey(method = 107816236176447456L)
    void closeArchive();

    @ey(method = -1254433848267215920L)
    void fillSyntaxTree(FileEntry fileEntry, Reader reader, Map<Language, SyntaxTreeStyles> map);

    @ey(method = -1662825054835286745L)
    void fillSyntaxTree(FileEntry fileEntry, Reader reader, Map<Language, SyntaxTree> map, boolean z);

    @ey(method = 2636226686694797896L)
    String[] getArchiveEntries(String str);

    @ey(method = 2558765979058796151L)
    Reader getArchiveEntryReader(String str, String str2, String str3);

    @ey(method = -810445835219176832L)
    long getArchiveVersion(String str);

    @ey(method = 1655450760143959197L)
    Compiler getCompiler();

    @ey(method = 4082422919045434425L)
    Debugger getDebugger();

    @ey(method = 4704851337007016648L)
    String[] getDefaultFilePatterns();

    @ey(method = -7679187945678248015L)
    String[] getExtendFilePatterns();

    @ey(method = 86188929872947383L)
    List<Language> getLanguages();

    @ey(method = 1621869681186464976L)
    String getName();

    @ey(method = 2542837484253604745L)
    Preprocessor getPreprocessor();

    @ey(method = 5976852728294287445L)
    boolean isSupportArchiveFile();

    @ey(method = 1179134862946726291L)
    void processVersion(FileEntry fileEntry, Language language);

    @ey(method = -4509918032069376525L)
    boolean u7();

    @ey(method = -2343694398047426605L)
    void update();
}
