package com.aide.codemodel.language.classfile;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.language.java.JavaLanguage;
import com.aide.codemodel.language.java.JavaSignatureAnalyzer;
import com.aide.codemodel.language.java.JavaTypeSystem;

@cy(clazz = -513772379058812832L, container = -513772379058812832L, user = true)
/* loaded from: classes.dex */
public class JavaBinarySignatureAnalyzer extends JavaSignatureAnalyzer {

    @fy
    private static /* synthetic */ boolean XL;

    @gy
    private static /* synthetic */ boolean aM;

    @dy(field = 2480255487950380896L)
    private final Model J0;

    @dy(field = -193134621565374192L)
    private final JavaTypeSystem J8;

    @dy(field = 2499642038751122295L)
    private ListOfInt QX;

    @dy(field = -2367020310169348585L)
    private final JavaLanguage Ws;

    static {
        iy.Zo(JavaBinarySignatureAnalyzer.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -8422308905359030855L)
    public JavaBinarySignatureAnalyzer(Model model, JavaBinaryLanguage javaBinaryLanguage) {
        super(model, javaBinaryLanguage);
        try {
            if (XL) {
                iy.EQ(172246938447311735L, null, model, javaBinaryLanguage);
            }
            this.J0 = model;
            this.Ws = javaBinaryLanguage;
            this.J8 = javaBinaryLanguage.getTypeSystem();
            new SetOfFileEntry(model.fileSpace);
            this.QX = new ListOfInt();
        } catch (Throwable th) {
            if (aM) {
                iy.Mr(th, 172246938447311735L, null, model, javaBinaryLanguage);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.language.java.JavaSignatureAnalyzer, com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 1074258442155719821L)
    public long getClassDeclarationDigest(SyntaxTree syntaxTree) {
        try {
            if (!XL) {
                return 0L;
            }
            iy.tp(-2141794977862123293L, this, syntaxTree);
            return 0L;
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -2141794977862123293L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.language.java.JavaSignatureAnalyzer, com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 8021821926655099605L)
    public long getDeclarationDigest(SyntaxTree syntaxTree) {
        try {
            if (!XL) {
                return 0L;
            }
            iy.tp(5796477585997516495L, this, syntaxTree);
            return 0L;
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, 5796477585997516495L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.language.java.JavaSignatureAnalyzer, com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = -704163416065353120L)
    public long getPublicDeclarationDigest(SyntaxTree syntaxTree) {
        try {
            if (!XL) {
                return 0L;
            }
            iy.tp(-1603456240630352880L, this, syntaxTree);
            return 0L;
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -1603456240630352880L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.language.java.JavaSignatureAnalyzer, com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 5212558323897438624L)
    public void tp(FileEntry fileEntry) {
        try {
            if (XL) {
                iy.tp(-4324578288929117424L, this, fileEntry);
            }
            if (!fileEntry.isArchiveEntry()) {
                super.tp(fileEntry);
                return;
            }
            FileEntry parentArchive = fileEntry.getParentArchive();
            this.QX.clear();
            for (FileEntry parentDirectory = fileEntry.getParentDirectory(); parentDirectory != parentArchive; parentDirectory = parentDirectory.getParentDirectory()) {
                this.QX.add(parentDirectory.QX());
            }
            Namespace namespaceNw = this.J8.nw();
            Namespace namespaceOW = namespaceNw;
            for (int size = this.QX.size() - 1; size >= 0; size--) {
                namespaceOW = namespaceOW.OW(this.QX.get(size));
            }
            this.J0.entitySpace.XL(fileEntry, this.Ws, namespaceOW, fileEntry.getNameIdentifier(), false, -1);
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -4324578288929117424L, this, fileEntry);
            }
            throw th;
        }
    }
}
