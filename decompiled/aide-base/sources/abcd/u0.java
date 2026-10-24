package abcd;

import abcd.i4;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import java.util.ArrayList;

@cy(clazz = -1437618696918382352L, container = -1437618696918382352L, user = true)
/* loaded from: classes.dex */
public class u0 {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = -1536092930729524260L)
    private i4.b DW;

    @dy(field = -2427617831251808625L)
    private i4.c[] FH;

    @dy(field = 2463938048926756920L)
    private final Model j6;

    static {
        iy.Zo(u0.class);
    }

    @ey(method = 269446998201339875L)
    public u0(Model model) {
        try {
            if (Hw) {
                iy.tp(-1462509327327599120L, null, model);
            }
            this.j6 = model;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -1462509327327599120L, null, model);
            }
            throw th;
        }
    }

    @ey(method = 924603960957199575L)
    private void DW(SyntaxTree syntaxTree, int i) {
        try {
            if (Hw) {
                iy.EQ(1641492710376690600L, this, syntaxTree, new Integer(i));
            }
            FH(syntaxTree, i);
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                DW(syntaxTree, syntaxTree.getChildNode(i, i2));
            }
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 1641492710376690600L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1719718269263126921L)
    private void FH(SyntaxTree syntaxTree, int i) throws Throwable {
        try {
            if (Hw) {
                try {
                    iy.EQ(-12739694918290760L, this, syntaxTree, new Integer(i));
                } catch (Throwable th) {
                    th = th;
                    if (v5) {
                        iy.Mr(th, -12739694918290760L, this, syntaxTree, new Integer(i));
                    }
                    throw th;
                }
            }
            if (syntaxTree.getLanguage().getSyntax().isComment(syntaxTree.getSyntaxTag(i)) && syntaxTree.getLanguage().getSyntax().isLiteral(syntaxTree.getSyntaxTag(i)) && syntaxTree.getStartLine(i) == syntaxTree.getEndLine(i)) {
                int literalOff = syntaxTree.getLiteralOff(i);
                int literalLen = syntaxTree.getLiteralLen(i);
                char[] literalChars = syntaxTree.getLiteralChars(i);
                if (literalLen > 0) {
                    for (int i2 = 0; i2 < this.FH.length; i2++) {
                        i4.c cVar = this.FH[i2];
                        this.DW.j6(literalChars, literalOff, literalLen);
                        cVar.FH(this.DW);
                        if (cVar.DW()) {
                            int startLine = syntaxTree.getStartLine(i);
                            int startColumn = syntaxTree.getStartColumn(i);
                            this.j6.errorTable.a8(syntaxTree.getFile(), syntaxTree.getLanguage(), startLine, startColumn + cVar.start(), startLine, startColumn + cVar.j6(), new String(literalChars, cVar.start() + literalOff, cVar.j6() - cVar.start()), i2);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = 373330790488189248L)
    public void j6(SyntaxTree syntaxTree) {
        try {
            if (Hw) {
                iy.tp(1637418461583244585L, this, syntaxTree);
            }
            if (i4.FH() != null) {
                if (this.FH == null) {
                    String[] strArrAM = this.j6.aM();
                    boolean[] zArrXL = this.j6.XL();
                    ArrayList arrayList = new ArrayList();
                    this.DW = i4.FH().Hw();
                    for (int i = 0; i < strArrAM.length; i++) {
                        try {
                            if (zArrXL[i]) {
                                arrayList.add(i4.FH().j6(strArrAM[i]).j6());
                            } else {
                                arrayList.add(i4.FH().DW(strArrAM[i]).j6());
                            }
                        } catch (i4.a unused) {
                        }
                    }
                    i4.c[] cVarArr = new i4.c[arrayList.size()];
                    this.FH = cVarArr;
                    arrayList.toArray(cVarArr);
                }
                DW(syntaxTree, syntaxTree.getRootNode());
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 1637418461583244585L, this, syntaxTree);
            }
            throw th;
        }
    }
}
