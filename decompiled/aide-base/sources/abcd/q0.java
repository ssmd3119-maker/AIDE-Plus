package abcd;

import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeSpace;

@cy(clazz = 6278987004744662160L, container = 6278987004744662160L, user = true)
/* loaded from: classes.dex */
public class q0 {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = 1497130809243992377L)
    private final EntitySpace DW;

    @dy(field = 1543578175414544328L)
    private final SyntaxTreeSpace FH;

    @dy(field = 1251574424737331796L)
    private final AIDEModel j6;

    static {
        iy.Zo(q0.class);
    }

    @ey(method = -165583085482415965L)
    public q0(AIDEModel aIDEModel) {
        try {
            if (Hw) {
                iy.tp(-2181356747002822320L, null, aIDEModel);
            }
            this.j6 = aIDEModel;
            this.DW = aIDEModel.entitySpace;
            this.FH = aIDEModel.syntaxTreeSpace;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -2181356747002822320L, null, aIDEModel);
            }
            throw th;
        }
    }

    @ey(method = 420409162597755540L)
    private void DW(SyntaxTree syntaxTree, int i) {
        try {
            if (Hw) {
                iy.EQ(-2305932276137642403L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.isMethodDeclarationNode(i)) {
                try {
                    Member memberJw = this.DW.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i));
                    if (memberJw.cT()) {
                        int iQX = memberJw.QX();
                        int iJ8 = memberJw.J8();
                        int iWs = memberJw.Ws();
                        this.j6.errorTable.lg(syntaxTree.getFile(), syntaxTree.getLanguage(), iWs, iQX, iWs, iJ8, "", 91);
                    }
                } catch (e4 unused) {
                }
            }
            if (syntaxTree.isFieldDeclarationNode(i)) {
                try {
                    Member memberJw2 = this.DW.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i));
                    if (memberJw2.cT()) {
                        int iQX2 = memberJw2.QX();
                        int iJ82 = memberJw2.J8();
                        int iWs2 = memberJw2.Ws();
                        this.j6.errorTable.lg(syntaxTree.getFile(), syntaxTree.getLanguage(), iWs2, iQX2, iWs2, iJ82, "", 91);
                    }
                } catch (e4 unused2) {
                }
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                DW(syntaxTree, syntaxTree.getChildNode(i, i2));
            }
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, -2305932276137642403L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -373459676068359424L)
    private int Hw(SyntaxTree syntaxTree, int i, int i2) throws Throwable {
        int iHw;
        try {
            if (Hw) {
                iHw = i2;
                try {
                    iy.we(4781301762269741517L, this, syntaxTree, new Integer(i), new Integer(iHw));
                } catch (Throwable th) {
                    th = th;
                    if (v5) {
                        iy.U2(th, 4781301762269741517L, this, syntaxTree, new Integer(i), new Integer(iHw));
                    }
                    throw th;
                }
            } else {
                iHw = i2;
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i3 = 0; i3 < childCount; i3++) {
                int childNode = syntaxTree.getChildNode(i, i3);
                if (syntaxTree.oh(childNode)) {
                    if (!syntaxTree.isSyntheticNode(childNode) && syntaxTree.getStartLine(childNode) > 0) {
                        int iHw2 = Hw(syntaxTree, childNode, 0);
                        int iOW = syntaxTree.getLanguage().getSyntax().OW(syntaxTree, childNode);
                        if (iOW <= 0) {
                            this.j6.structureCallback.DW(syntaxTree.getStartLine(childNode) + "," + syntaxTree.getStartColumn(childNode), syntaxTree.getLanguage().getSyntax().Sf(syntaxTree, childNode), syntaxTree.getStartLine(childNode), syntaxTree.getStartColumn(childNode), syntaxTree.getStartColumn(childNode), syntaxTree.getStartLine(childNode), syntaxTree.getStartColumn(childNode), syntaxTree.getEndLine(childNode), syntaxTree.getEndColumn(childNode), iHw2);
                        } else {
                            this.j6.structureCallback.DW(this.j6.identifierSpace.getString(syntaxTree.getIdentifier(iOW)), syntaxTree.getLanguage().getSyntax().Sf(syntaxTree, childNode), syntaxTree.getStartLine(iOW), syntaxTree.getStartColumn(iOW), syntaxTree.getEndColumn(iOW), syntaxTree.getStartLine(childNode), syntaxTree.getStartColumn(childNode), syntaxTree.getEndLine(childNode), syntaxTree.getEndColumn(childNode), iHw2);
                        }
                        iHw++;
                    }
                } else if (syntaxTree.isClassDeclarationNode(childNode)) {
                    if (!syntaxTree.isSyntheticNode(childNode) && syntaxTree.getStartLine(childNode) > 0) {
                        int iHw3 = Hw(syntaxTree, childNode, 0);
                        try {
                            ClassType classtype = this.DW.getClasstype(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(childNode));
                            this.j6.structureCallback.Hw(classtype, classtype.Ws(), classtype.QX(), classtype.J8(), classtype.Jm(), classtype.ce(), classtype.Zo(), classtype.v5(), iHw3);
                            iHw++;
                        } catch (e4 unused) {
                        }
                    }
                } else if (syntaxTree.isMethodDeclarationNode(childNode)) {
                    if (!syntaxTree.isSyntheticNode(childNode) && syntaxTree.getStartLine(childNode) > 0) {
                        Member memberJw = this.DW.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(childNode));
                        this.j6.structureCallback.v5(memberJw, memberJw.Ws(), memberJw.QX(), memberJw.J8(), memberJw.Ev(), memberJw.ko(), memberJw.Zo(), memberJw.v5());
                        iHw++;
                    }
                } else if (!syntaxTree.isFieldDeclarationNode(childNode)) {
                    iHw = Hw(syntaxTree, childNode, iHw);
                } else if (!syntaxTree.isSyntheticNode(childNode) && syntaxTree.getStartLine(childNode) > 0) {
                    Member memberJw2 = this.DW.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(childNode));
                    this.j6.structureCallback.v5(memberJw2, memberJw2.Ws(), memberJw2.QX(), memberJw2.J8(), memberJw2.Ev(), memberJw2.ko(), memberJw2.Zo(), memberJw2.v5());
                    iHw++;
                }
            }
            return iHw;
        } catch (Throwable th2) {
            th = th2;
            iHw = i2;
        }
    }

    @ey(method = 4592181860016918120L)
    public void FH(FileEntry fileEntry) {
        try {
            if (Hw) {
                iy.tp(857450650939495415L, this, fileEntry);
            }
            if (fileEntry.getCodeModel() != null) {
                this.j6.structureCallback.Zo();
                int i = 0;
                for (SyntaxTree syntaxTree : this.j6.syntaxTreeSpace.QX(fileEntry)) {
                    int iHw = Hw(syntaxTree, syntaxTree.getRootNode(), 0);
                    if (iHw > 0) {
                        this.j6.structureCallback.j6(syntaxTree.getLanguage(), iHw);
                        i++;
                    }
                    this.FH.releaseSyntaxTree(syntaxTree);
                }
                this.j6.structureCallback.FH(fileEntry, i);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 857450650939495415L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 173436136462970619L)
    public void j6(SyntaxTree syntaxTree) {
        try {
            if (Hw) {
                iy.tp(3024303301771962140L, this, syntaxTree);
            }
            DW(syntaxTree, syntaxTree.getRootNode());
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 3024303301771962140L, this, syntaxTree);
            }
            throw th;
        }
    }
}
