package abcd;

import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.abstraction.CodeAnalyzer;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.ListOf;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.codemodel.api.collections.MapOfIntInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.language.js.JavaScriptCodeModel;
import com.aide.codemodel.language.js.JavaScriptLanguage;
import com.aide.codemodel.language.js.JavaScriptSyntax;
import java.util.Stack;

@cy(clazz = 7795637514067007189L, container = 7795637514067007189L, user = true)
/* loaded from: classes.dex */
public class z6 implements CodeAnalyzer {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = -3030126959388716104L)
    private final JavaScriptLanguage DW;

    @dy(field = -51386189619785040L)
    private Stack<a> FH;

    @dy(field = 2217473673137499951L)
    private final Model j6;

    @cy(clazz = 510521203401123915L, container = 510521203401123915L, user = true)
    private static class a {

        @fy
        private static /* synthetic */ boolean QX;

        @gy
        private static /* synthetic */ boolean XL;

        @dy(field = -2222064989869935552L)
        private final JavaScriptLanguage DW;

        @dy(field = 579981514971732375L)
        private MapOfInt<Member> EQ;

        @dy(field = -288149775626128380L)
        private final z6 FH;

        @dy(field = 4513625951080896512L)
        private int Hw;

        @dy(field = -7073315148962979135L)
        private ListOf<ClassType> J0;

        @dy(field = -3509975592838198425L)
        private SetOf<Member> J8;

        @dy(field = 92147477826826695L)
        private boolean VH;

        @dy(field = 4748172135538911795L)
        private d3 Ws;

        @dy(field = 2498651302016235136L)
        private SyntaxTree Zo;

        @dy(field = -2554810955080435560L)
        private boolean gn;

        @dy(field = 884275320965463405L)
        private final Model j6;

        @dy(field = 1177295032048375144L)
        private u3 tp;

        @dy(field = -640821896377668235L)
        private boolean u7;

        @dy(field = 4849647459908680500L)
        private int v5;

        @dy(field = -3274065294167846511L)
        private MapOfIntInt we;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -1766967511868750208L)
        public a(Model model, JavaScriptLanguage javaScriptLanguage, z6 z6Var) {
            try {
                if (QX) {
                    iy.we(-1833645884084860936L, null, model, javaScriptLanguage, z6Var);
                }
                this.Ws = new d3();
                this.j6 = model;
                this.DW = javaScriptLanguage;
                this.FH = z6Var;
                this.J8 = new SetOf<>(model.entitySpace);
                this.J0 = new ListOf<>(model.entitySpace);
                this.tp = new u3();
                this.we = new MapOfIntInt();
                this.EQ = new MapOfInt<>(model.entitySpace);
                this.Hw = model.identifierSpace.get("Array");
                this.v5 = model.identifierSpace.get("String");
            } catch (Throwable th) {
                if (XL) {
                    iy.U2(th, -1833645884084860936L, null, model, javaScriptLanguage, z6Var);
                }
                throw th;
            }
        }

        @ey(method = -159999341313482188L)
        private void DW(int i, int i2) {
            try {
                if (QX) {
                    iy.EQ(19513573373862792L, this, new Integer(i), new Integer(i2));
                }
                int identifier = this.Zo.getIdentifier(i);
                int iJ8 = this.j6.a8.J8(this.Zo.getFile(), this.Zo.getLanguage(), i2);
                Member memberQX = this.j6.a8.QX(iJ8, identifier);
                if (memberQX != null) {
                    Member memberJw = null;
                    if (((JavaScriptSyntax) this.DW.getSyntax()).Xa(this.Zo, i) || ((JavaScriptSyntax) this.DW.getSyntax()).Eq(this.Zo, i)) {
                        try {
                            memberJw = this.j6.entitySpace.jw(this.Zo.getFile(), this.Zo.getLanguage(), this.Zo.getDeclarationNumber(i));
                        } catch (e4 unused) {
                        }
                    }
                    if (memberQX == memberJw) {
                        this.Zo.declareAttrReferenceKind(i, 19, memberQX);
                        return;
                    } else {
                        this.Zo.declareAttrReferenceKind(i, 20, memberQX);
                        return;
                    }
                }
                long j = (iJ8 << 16) | identifier;
                if (!this.Ws.DW(j)) {
                    this.Ws.Hw(j, i);
                }
                this.Zo.declareAttrReferenceKind(i, 1, this.Ws.FH(j));
                if (this.j6.a8.j3(iJ8, identifier) && this.u7) {
                    this.j6.errorTable.Mr(this.Zo.getFile(), this.Zo.getLanguage(), this.Zo.getStartLine(i), this.Zo.getStartColumn(i), this.Zo.getEndLine(i), this.Zo.getEndColumn(i), "Unknwon member " + this.Zo.getIdentifierString(i), 20);
                }
            } catch (Throwable th) {
                if (XL) {
                    iy.Mr(th, 19513573373862792L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 4288920340911709071L)
        private void Hw(int i) {
            try {
                if (QX) {
                    iy.u7(-4024134090436036875L, this, i);
                }
                int syntaxTag = this.Zo.getSyntaxTag(i);
                if (syntaxTag == 124) {
                    if (this.Zo.getChildCount(i) == 4) {
                        int childNode = this.Zo.getChildNode(i, 1);
                        this.tp.FH(this.Zo.getIdentifier(childNode), childNode);
                        return;
                    }
                    return;
                }
                if (syntaxTag == 125) {
                    try {
                        int childNode2 = this.Zo.getChildNode(i, 1);
                        this.we.tp(this.Zo.getIdentifier(childNode2), childNode2);
                        this.EQ.we(this.Zo.getIdentifier(childNode2), this.j6.entitySpace.jw(this.Zo.getFile(), this.Zo.getLanguage(), this.Zo.getDeclarationNumber(i)));
                        return;
                    } catch (e4 unused) {
                        return;
                    }
                }
                if (syntaxTag == 200) {
                    int childNode3 = this.Zo.getChildNode(i, 0);
                    this.tp.FH(this.Zo.getIdentifier(childNode3), childNode3);
                } else if (syntaxTag == 207) {
                    try {
                        int childNode4 = this.Zo.getChildNode(i, 0);
                        this.we.tp(this.Zo.getIdentifier(childNode4), childNode4);
                        this.EQ.we(this.Zo.getIdentifier(childNode4), this.j6.entitySpace.jw(this.Zo.getFile(), this.Zo.getLanguage(), this.Zo.getDeclarationNumber(i)));
                    } catch (e4 unused2) {
                    }
                }
                int childCount = this.Zo.getChildCount(i);
                for (int i2 = 0; i2 < childCount; i2++) {
                    Hw(this.Zo.getChildNode(i, i2));
                }
            } catch (Throwable th) {
                if (XL) {
                    iy.j3(th, -4024134090436036875L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:264:0x0863  */
        /* JADX WARN: Removed duplicated region for block: B:272:0x08ad A[Catch: all -> 0x0a08, TryCatch #4 {all -> 0x0a08, blocks: (B:262:0x082c, B:266:0x0866, B:268:0x088a, B:269:0x089d, B:270:0x08a2, B:272:0x08ad, B:273:0x08c0, B:275:0x08c4, B:276:0x08db, B:278:0x08f2, B:279:0x0904, B:280:0x091e, B:282:0x0927, B:306:0x09de, B:308:0x09e2, B:310:0x09ff, B:286:0x0940, B:288:0x0949, B:291:0x0959, B:292:0x0973, B:294:0x097c, B:295:0x098f, B:297:0x0993, B:299:0x09a7, B:301:0x09b0, B:302:0x09c5, B:304:0x09c9), top: B:336:0x082c }] */
        /* JADX WARN: Removed duplicated region for block: B:275:0x08c4 A[Catch: all -> 0x0a08, TryCatch #4 {all -> 0x0a08, blocks: (B:262:0x082c, B:266:0x0866, B:268:0x088a, B:269:0x089d, B:270:0x08a2, B:272:0x08ad, B:273:0x08c0, B:275:0x08c4, B:276:0x08db, B:278:0x08f2, B:279:0x0904, B:280:0x091e, B:282:0x0927, B:306:0x09de, B:308:0x09e2, B:310:0x09ff, B:286:0x0940, B:288:0x0949, B:291:0x0959, B:292:0x0973, B:294:0x097c, B:295:0x098f, B:297:0x0993, B:299:0x09a7, B:301:0x09b0, B:302:0x09c5, B:304:0x09c9), top: B:336:0x082c }] */
        /* JADX WARN: Removed duplicated region for block: B:278:0x08f2 A[Catch: all -> 0x0a08, TRY_LEAVE, TryCatch #4 {all -> 0x0a08, blocks: (B:262:0x082c, B:266:0x0866, B:268:0x088a, B:269:0x089d, B:270:0x08a2, B:272:0x08ad, B:273:0x08c0, B:275:0x08c4, B:276:0x08db, B:278:0x08f2, B:279:0x0904, B:280:0x091e, B:282:0x0927, B:306:0x09de, B:308:0x09e2, B:310:0x09ff, B:286:0x0940, B:288:0x0949, B:291:0x0959, B:292:0x0973, B:294:0x097c, B:295:0x098f, B:297:0x0993, B:299:0x09a7, B:301:0x09b0, B:302:0x09c5, B:304:0x09c9), top: B:336:0x082c }] */
        /* JADX WARN: Removed duplicated region for block: B:286:0x0940 A[Catch: all -> 0x0a08, TRY_ENTER, TryCatch #4 {all -> 0x0a08, blocks: (B:262:0x082c, B:266:0x0866, B:268:0x088a, B:269:0x089d, B:270:0x08a2, B:272:0x08ad, B:273:0x08c0, B:275:0x08c4, B:276:0x08db, B:278:0x08f2, B:279:0x0904, B:280:0x091e, B:282:0x0927, B:306:0x09de, B:308:0x09e2, B:310:0x09ff, B:286:0x0940, B:288:0x0949, B:291:0x0959, B:292:0x0973, B:294:0x097c, B:295:0x098f, B:297:0x0993, B:299:0x09a7, B:301:0x09b0, B:302:0x09c5, B:304:0x09c9), top: B:336:0x082c }] */
        /* JADX WARN: Removed duplicated region for block: B:308:0x09e2 A[Catch: all -> 0x0a08, TryCatch #4 {all -> 0x0a08, blocks: (B:262:0x082c, B:266:0x0866, B:268:0x088a, B:269:0x089d, B:270:0x08a2, B:272:0x08ad, B:273:0x08c0, B:275:0x08c4, B:276:0x08db, B:278:0x08f2, B:279:0x0904, B:280:0x091e, B:282:0x0927, B:306:0x09de, B:308:0x09e2, B:310:0x09ff, B:286:0x0940, B:288:0x0949, B:291:0x0959, B:292:0x0973, B:294:0x097c, B:295:0x098f, B:297:0x0993, B:299:0x09a7, B:301:0x09b0, B:302:0x09c5, B:304:0x09c9), top: B:336:0x082c }] */
        /* JADX WARN: Removed duplicated region for block: B:309:0x09fe  */
        /* JADX WARN: Removed duplicated region for block: B:319:0x0a13  */
        /* JADX WARN: Removed duplicated region for block: B:403:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r10v1, types: [com.aide.codemodel.api.SyntaxTree] */
        /* JADX WARN: Type inference failed for: r10v4, types: [com.aide.codemodel.api.SyntaxTree] */
        /* JADX WARN: Type inference failed for: r11v1, types: [com.aide.codemodel.api.SyntaxTree] */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v107 */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r4v18, types: [com.aide.codemodel.api.SyntaxTree] */
        /* JADX WARN: Type inference failed for: r4v22, types: [abcd.s1] */
        /* JADX WARN: Type inference failed for: r4v23, types: [com.aide.codemodel.api.SyntaxTree] */
        /* JADX WARN: Type inference failed for: r4v28, types: [com.aide.codemodel.language.js.JavaScriptSyntax] */
        /* JADX WARN: Type inference failed for: r4v32, types: [abcd.s1] */
        /* JADX WARN: Type inference failed for: r4v8, types: [com.aide.codemodel.language.js.JavaScriptSyntax] */
        /* JADX WARN: Type inference failed for: r5v10, types: [com.aide.codemodel.api.SyntaxTree] */
        /* JADX WARN: Type inference failed for: r5v15, types: [abcd.s1] */
        /* JADX WARN: Type inference failed for: r5v19 */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARN: Type inference failed for: r5v6 */
        /* JADX WARN: Type inference failed for: r5v66 */
        /* JADX WARN: Type inference failed for: r5v67 */
        /* JADX WARN: Type inference failed for: r5v68 */
        /* JADX WARN: Type inference failed for: r5v69 */
        /* JADX WARN: Type inference failed for: r7v13, types: [abcd.s1] */
        /* JADX WARN: Type inference failed for: r7v15, types: [abcd.s1] */
        /* JADX WARN: Type inference failed for: r9v3, types: [com.aide.codemodel.api.SyntaxTree] */
        /* JADX WARN: Type inference failed for: r9v4, types: [com.aide.codemodel.api.SyntaxTree] */
        @abcd.ey(method = -1292447374793973431L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void VH(int r26, int r27, int r28) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 2611
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: abcd.z6.a.VH(int, int, int):void");
        }

        @ey(method = -6966911471847996825L)
        private void Zo(int i, ListOfInt listOfInt) {
            try {
                if (QX) {
                    iy.EQ(3715325391037803565L, this, new Integer(i), listOfInt);
                }
                int syntaxTag = this.Zo.getSyntaxTag(i);
                if (syntaxTag == 124 || syntaxTag == 125) {
                    return;
                }
                if (syntaxTag == 141 && this.Zo.getChildCount(i) == 3) {
                    listOfInt.add(this.Zo.getChildNode(i, 1));
                }
                int childCount = this.Zo.getChildCount(i);
                for (int i2 = 0; i2 < childCount; i2++) {
                    Zo(this.Zo.getChildNode(i, i2), listOfInt);
                }
            } catch (Throwable th) {
                if (XL) {
                    iy.Mr(th, 3715325391037803565L, this, new Integer(i), listOfInt);
                }
                throw th;
            }
        }

        @ey(method = 2109960129700529877L)
        private void gn(SyntaxTree syntaxTree) {
            try {
                if (QX) {
                    iy.tp(-2228368806839687757L, this, syntaxTree);
                }
                this.Ws.j6();
                this.tp.j6();
                this.EQ.Hw();
                this.we.clear();
                this.J0.FH();
                Hw(syntaxTree.getRootNode());
                this.J0.DW(this.FH.we(syntaxTree));
                VH(syntaxTree.getRootNode(), syntaxTree.getRootNode(), -1);
            } catch (Throwable th) {
                if (XL) {
                    iy.j3(th, -2228368806839687757L, this, syntaxTree);
                }
                throw th;
            }
        }

        @ey(method = -152953765133965017L)
        private int v5(int i) {
            try {
                if (QX) {
                    iy.u7(-100532090051122239L, this, i);
                }
                if (this.Zo.getChildCount(i) == 4) {
                    return -1;
                }
                int childNode = this.Zo.getChildNode(i, this.Zo.getChildCount(i) - 1);
                if (this.Zo.getChildCount(childNode) >= 3 && this.Zo.getSyntaxTag(this.Zo.getChildNode(childNode, 1)) == 146) {
                    int childNode2 = this.Zo.getChildNode(this.Zo.getChildNode(childNode, 1), 0);
                    if (this.Zo.getSyntaxTag(childNode2) == 172 && this.Zo.getSyntaxTag(this.Zo.getChildNode(childNode2, 1)) == 17 && this.Zo.getSyntaxTag(this.Zo.getChildNode(childNode2, 0)) == 159 && this.Zo.getSyntaxTag(this.Zo.getChildNode(this.Zo.getChildNode(childNode2, 0), 0)) == 166) {
                        return -1;
                    }
                }
                if (this.Zo.getSyntaxTag(this.Zo.getParentNode(i)) == 140) {
                    return this.Zo.getParentNode(i);
                }
                if (this.Zo.getSyntaxTag(this.Zo.getParentNode(i)) == 172 && this.Zo.getSyntaxTag(this.Zo.getChildNode(this.Zo.getParentNode(i), 1)) == 17 && this.Zo.getChildNode(this.Zo.getParentNode(i), 2) == i) {
                    int childNode3 = this.Zo.getChildNode(this.Zo.getParentNode(i), 0);
                    if (this.Zo.getSyntaxTag(childNode3) == 159) {
                        return this.Zo.getChildNode(childNode3, 0);
                    }
                }
                return -1;
            } catch (Throwable th) {
                if (XL) {
                    iy.j3(th, -100532090051122239L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 841059033128390055L)
        public void FH(SyntaxTree syntaxTree) {
            try {
                if (QX) {
                    iy.tp(703234590385865L, this, syntaxTree);
                }
                this.Zo = syntaxTree;
                this.VH = true;
                this.gn = false;
                this.u7 = false;
                gn(syntaxTree);
                this.Zo = null;
            } catch (Throwable th) {
                if (XL) {
                    iy.j3(th, 703234590385865L, this, syntaxTree);
                }
                throw th;
            }
        }

        @ey(method = -486087543348723179L)
        public void j6(SyntaxTree syntaxTree, boolean z) {
            try {
                if (QX) {
                    iy.EQ(218734501712161783L, this, syntaxTree, new Boolean(z));
                }
                this.Zo = syntaxTree;
                this.VH = false;
                this.gn = true;
                this.u7 = z;
                gn(syntaxTree);
                this.Zo = null;
            } catch (Throwable th) {
                if (XL) {
                    iy.Mr(th, 218734501712161783L, this, syntaxTree, new Boolean(z));
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(z6.class);
    }

    @ey(method = 82238233550468716L)
    public z6(Model model, JavaScriptLanguage javaScriptLanguage) {
        try {
            if (Hw) {
                iy.EQ(-1300431280471130655L, null, model, javaScriptLanguage);
            }
            this.j6 = model;
            this.DW = javaScriptLanguage;
            this.FH = new Stack<>();
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, -1300431280471130655L, null, model, javaScriptLanguage);
            }
            throw th;
        }
    }

    @ey(method = 2093205003080380605L)
    private a J0() {
        try {
            if (Hw) {
                iy.gn(-2590022901294256792L, this);
            }
            return this.FH.size() > 0 ? this.FH.pop() : new a(this.j6, this.DW, this);
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -2590022901294256792L, this);
            }
            throw th;
        }
    }

    @ey(method = -3755064712954703093L)
    private void J8(a aVar) {
        try {
            if (Hw) {
                iy.tp(14945706840148392L, this, aVar);
            }
            this.FH.push(aVar);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 14945706840148392L, this, aVar);
            }
            throw th;
        }
    }

    @ey(method = -1687198383163961648L)
    private void tp(SyntaxTree syntaxTree) {
        try {
            if (Hw) {
                iy.tp(-716409798928988157L, this, syntaxTree);
            }
            if (syntaxTree.getFile().I()) {
                this.j6.a8.er(syntaxTree);
                a aVarJ0 = J0();
                aVarJ0.j6(syntaxTree, false);
                J8(aVarJ0);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -716409798928988157L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = -3322342978450570728L)
    private void u7(FileEntry fileEntry, ListOf<ClassType> listOf) {
        try {
            if (Hw) {
                iy.EQ(-2673362057406397781L, this, fileEntry, listOf);
            }
            if (fileEntry != null && fileEntry.I() && (fileEntry.getCodeModel() instanceof JavaScriptCodeModel)) {
                for (Language language : fileEntry.getCodeModel().getLanguages()) {
                    if (language instanceof JavaScriptLanguage) {
                        try {
                            listOf.j6(this.j6.entitySpace.getClasstype(fileEntry, language, 0));
                        } catch (e4 unused) {
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, -2673362057406397781L, this, fileEntry, listOf);
            }
            throw th;
        }
    }

    @ey(method = -339081910368439875L)
    public void EQ(SyntaxTree syntaxTree) {
        try {
            if (Hw) {
                iy.tp(37394468416796232L, this, syntaxTree);
            }
            if (syntaxTree.getFile().I()) {
                a aVarJ0 = J0();
                aVarJ0.FH(syntaxTree);
                J8(aVarJ0);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 37394468416796232L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = 398375194173751080L)
    public void FH(SyntaxTree syntaxTree) {
        try {
            if (Hw) {
                iy.tp(-4584051637279008893L, this, syntaxTree);
            }
            tp(syntaxTree);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -4584051637279008893L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = -3773863931778237417L)
    public void Hw(SyntaxTree syntaxTree, int i) {
        try {
            if (Hw) {
                iy.EQ(659342725694078316L, this, syntaxTree, new Integer(i));
            }
            tp(syntaxTree);
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 659342725694078316L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = -2790041418676343375L)
    public void VH(SyntaxTree syntaxTree, int i) {
        try {
            if (Hw) {
                iy.EQ(-2368413175856497308L, this, syntaxTree, new Integer(i));
            }
            tp(syntaxTree);
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, -2368413175856497308L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = 3112425932239366400L)
    public void Zo(SyntaxTree syntaxTree) {
        try {
            if (Hw) {
                iy.tp(-3595323517212780639L, this, syntaxTree);
            }
            tp(syntaxTree);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -3595323517212780639L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = -1918565609077895168L)
    public void analyzeEveryIdentifiers(SyntaxTree syntaxTree, SetOfInt setOfInt) {
        try {
            if (Hw) {
                iy.EQ(-2667971161629178953L, this, syntaxTree, setOfInt);
            }
            tp(syntaxTree);
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, -2667971161629178953L, this, syntaxTree, setOfInt);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = -2170141453889823753L)
    public Type analyzeTypeName(SyntaxTree syntaxTree, int i, int i2, String str) {
        try {
            if (!Hw) {
                return null;
            }
            iy.J0(727631124951269632L, this, syntaxTree, new Integer(i), new Integer(i2), str);
            return null;
        } catch (Throwable th) {
            if (v5) {
                iy.a8(th, 727631124951269632L, this, syntaxTree, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = -332731938703215595L)
    public void j6(SyntaxTree syntaxTree, int i) {
        try {
            if (Hw) {
                iy.EQ(-401497585544590964L, this, syntaxTree, new Integer(i));
            }
            tp(syntaxTree);
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, -401497585544590964L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = -3234725651168271021L)
    public void v5(SyntaxTree syntaxTree) {
        try {
            if (Hw) {
                iy.tp(828599269838073888L, this, syntaxTree);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 828599269838073888L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = -355547912553382360L)
    public ListOf<ClassType> we(SyntaxTree syntaxTree) {
        try {
            if (Hw) {
                iy.tp(125278323652489371L, this, syntaxTree);
            }
            ListOf<ClassType> listOf = new ListOf<>(this.j6.entitySpace);
            SetOfFileEntry setOfFileEntry = new SetOfFileEntry(this.j6.fileSpace);
            setOfFileEntry.u7(this.j6.fileSpace.getSolutionFiles());
            setOfFileEntry.j6.init();
            while (setOfFileEntry.j6.hasMoreElements()) {
                u7(setOfFileEntry.j6.nextKey(), listOf);
            }
            return listOf;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 125278323652489371L, this, syntaxTree);
            }
            throw th;
        }
    }
}
