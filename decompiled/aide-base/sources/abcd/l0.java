package abcd;

import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.FileSpace;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeSpace;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.ListOfInt;

@cy(clazz = -1022004820680933677L, container = -1022004820680933677L, user = true)
/* loaded from: classes.dex */
public class l0 {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = -1257127085894192296L)
    private final SyntaxTreeSpace DW;

    @dy(field = -1697616564704916387L)
    private final k0 FH;

    @dy(field = -1537429010292615844L)
    private final AIDEModel j6;

    static {
        iy.Zo(l0.class);
    }

    @ey(method = 12973194298998591L)
    public l0(AIDEModel aIDEModel) {
        try {
            if (Hw) {
                iy.tp(-168535587626226953L, null, aIDEModel);
            }
            this.j6 = aIDEModel;
            IdentifierSpace identifierSpace = aIDEModel.identifierSpace;
            FileSpace fileSpace = aIDEModel.fileSpace;
            EntitySpace entitySpace = aIDEModel.entitySpace;
            this.DW = aIDEModel.syntaxTreeSpace;
            this.FH = aIDEModel.vy;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -168535587626226953L, null, aIDEModel);
            }
            throw th;
        }
    }

    @ey(method = 4836176969170489052L)
    private void j6(Language language, Member member) throws Throwable {
        try {
            if (Hw) {
                try {
                    iy.EQ(-3480418625863918079L, this, language, member);
                } catch (Throwable th) {
                    th = th;
                    if (v5) {
                        iy.Mr(th, -3480418625863918079L, this, language, member);
                    }
                    throw th;
                }
            }
            FileEntry file = member.getFile();
            ListOfInt listOfInt = new ListOfInt();
            ListOfInt listOfInt2 = new ListOfInt();
            ListOfInt listOfInt3 = new ListOfInt();
            ListOfInt listOfInt4 = new ListOfInt();
            ListOfInt listOfInt5 = new ListOfInt();
            if (!language.getTools().U2(member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5)) {
                return;
            }
            this.FH.we(member.getIdentifier());
            while (true) {
                FileEntry fileEntryXL = this.FH.XL();
                if (fileEntryXL == null) {
                    return;
                }
                if (fileEntryXL.getCodeModel() == file.getCodeModel()) {
                    SyntaxTree syntaxTree = this.DW.getSyntaxTree(fileEntryXL, language);
                    FileEntry fileEntry = file;
                    language.getTools().vy(fileEntryXL, member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5);
                    this.DW.releaseSyntaxTree(syntaxTree);
                    file = fileEntry;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = 664965957584230095L)
    public void DW(FileEntry fileEntry, int i, int i2) {
        try {
            if (Hw) {
                iy.we(117844174323046304L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.j6.refactoringCallback.g3();
            SyntaxTree syntaxTreeZo = this.j6.syntaxTreeSpace.Zo(fileEntry, i, i2);
            int iJO = syntaxTreeZo.jO(i, i2);
            if (iJO == -1) {
                this.DW.releaseSyntaxTree(syntaxTreeZo);
                this.j6.refactoringCallback.DW("Select a method to inline.");
                return;
            }
            syntaxTreeZo.getLanguage().getCodeAnalyzer().VH(syntaxTreeZo, iJO);
            int iSh = syntaxTreeZo.sh(iJO);
            if (iSh != 19 && iSh != 20) {
                this.j6.refactoringCallback.DW("Select a method to inline.");
                return;
            }
            j6(syntaxTreeZo.getLanguage(), (Member) syntaxTreeZo.getAttrReferenceEntity(iJO));
            this.j6.refactoringCallback.yS();
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, 117844174323046304L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
