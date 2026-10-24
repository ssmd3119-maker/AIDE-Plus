package abcd;

import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.ArrayType;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.FileSpace;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.ParameterizedType;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeSpace;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.api.collections.SetOfInt;

@cy(clazz = 3759880163513944539L, container = 3759880163513944539L, user = true)
/* loaded from: classes.dex */
public class d0 {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = -3297354211059744577L)
    private final FileSpace DW;

    @dy(field = -623178862047885405L)
    private final EntitySpace FH;

    @dy(field = -577742219567428320L)
    private final SyntaxTreeSpace Hw;

    @dy(field = -884991752254346400L)
    private final AIDEModel j6;

    @dy(field = -1059795212860183445L)
    private final k0 v5;

    static {
        iy.Zo(d0.class);
    }

    @ey(method = 434500062592758995L)
    public d0(AIDEModel aIDEModel) {
        try {
            if (Zo) {
                iy.tp(-1256096129761533405L, null, aIDEModel);
            }
            this.j6 = aIDEModel;
            IdentifierSpace identifierSpace = aIDEModel.identifierSpace;
            this.DW = aIDEModel.fileSpace;
            this.FH = aIDEModel.entitySpace;
            this.Hw = aIDEModel.syntaxTreeSpace;
            this.v5 = aIDEModel.vy;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -1256096129761533405L, null, aIDEModel);
            }
            throw th;
        }
    }

    @ey(method = 3679533286230641476L)
    private boolean EQ(Type type, ClassType classType) {
        try {
            if (Zo) {
                iy.EQ(-836975771980721893L, this, type, classType);
            }
            if (type.XX(classType) || type.x9().XX(classType)) {
                return true;
            }
            if (type.isArrayType()) {
                return EQ(((ArrayType) type).FN(), classType);
            }
            if (type.isParameterizedType()) {
                for (Type type2 : ((ParameterizedType) type).getAbsoluteArgumentTypes()) {
                    if (EQ(type2, classType)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -836975771980721893L, this, type, classType);
            }
            throw th;
        }
    }

    @ey(method = -595890058784609239L)
    private void VH(SyntaxTree syntaxTree, SetOfInt setOfInt, ClassType classType, SetOf<ClassType> setOf, SetOf<ClassType> setOf2, SetOf<ClassType> setOf3, SetOfFileEntry setOfFileEntry, SetOf<Entity> setOf4, boolean z) {
        try {
            if (Zo) {
                iy.QX(-452783270425521408L, this, new Object[]{syntaxTree, setOfInt, classType, setOf, setOf2, setOf3, setOfFileEntry, setOf4, new Boolean(z)});
            }
            setOfFileEntry.j6.init();
            while (setOfFileEntry.j6.hasMoreElements() && !this.j6.stopCallback.FN()) {
                FileEntry fileEntryNextKey = setOfFileEntry.j6.nextKey();
                if ((fileEntryNextKey.vJ() && this.v5.Hw(fileEntryNextKey, setOfInt)) || (!fileEntryNextKey.vJ() && this.v5.VH(fileEntryNextKey, setOfInt))) {
                    SetOf<Entity> setOfFN = this.FH.FN(fileEntryNextKey);
                    setOfFN.DEFAULT_ITERATOR.init();
                    while (setOfFN.DEFAULT_ITERATOR.hasMoreElements()) {
                        Entity entityNextKey = setOfFN.DEFAULT_ITERATOR.nextKey();
                        if (entityNextKey.isClassType()) {
                            ClassType classType2 = (ClassType) entityNextKey;
                            setOf.DEFAULT_ITERATOR.init();
                            while (setOf.DEFAULT_ITERATOR.hasMoreElements()) {
                                if (classType2 != setOf.DEFAULT_ITERATOR.nextKey() && classType2.fN().contains(setOf.DEFAULT_ITERATOR.nextKey()) && !setOf3.contains(classType2)) {
                                    setOf2.put(classType2);
                                    setOf3.put(classType2);
                                }
                            }
                        } else if (entityNextKey.isMember() && ((Member) entityNextKey).e9()) {
                            try {
                                Member member = (Member) entityNextKey;
                                if ((setOf.contains(member.WB().x9()) || EQ(member.WB(), classType)) && !setOf4.contains(member)) {
                                    setOf4.put(member);
                                    this.j6.apiSearcherCallback.DW(member);
                                }
                            } catch (e4 unused) {
                            }
                        } else if (entityNextKey.isMember() && ((Member) entityNextKey).Gj()) {
                            Member member2 = (Member) entityNextKey;
                            if (((member2.sM() && setOf.contains(member2.WB().x9())) || EQ(member2.WB(), classType)) && !setOf4.contains(member2)) {
                                setOf4.put(member2);
                                this.j6.apiSearcherCallback.DW(member2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (VH) {
                iy.rN(th, -452783270425521408L, this, new Object[]{syntaxTree, setOfInt, classType, setOf, setOf2, setOf3, setOfFileEntry, setOf4, new Boolean(z)});
            }
            throw th;
        }
    }

    @ey(method = 428269494419704304L)
    private void Zo(SyntaxTree syntaxTree, int i, ClassType classType, SetOfFileEntry setOfFileEntry, boolean z, boolean z2, boolean z3) {
        try {
            if (Zo) {
                iy.QX(-746674962164500923L, this, new Object[]{syntaxTree, new Integer(i), classType, setOfFileEntry, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            }
            setOfFileEntry.j6.init();
            while (setOfFileEntry.j6.hasMoreElements() && !this.j6.stopCallback.FN()) {
                FileEntry fileEntryNextKey = setOfFileEntry.j6.nextKey();
                if ((fileEntryNextKey.vJ() && this.v5.FH(fileEntryNextKey, i)) || (!fileEntryNextKey.vJ() && this.v5.Zo(fileEntryNextKey, i))) {
                    SetOf<Entity> setOfFN = this.FH.FN(fileEntryNextKey);
                    setOfFN.DEFAULT_ITERATOR.init();
                    while (setOfFN.DEFAULT_ITERATOR.hasMoreElements()) {
                        Entity entityNextKey = setOfFN.DEFAULT_ITERATOR.nextKey();
                        if (entityNextKey.isMember() && ((Member) entityNextKey).e9()) {
                            try {
                                Member member = (Member) entityNextKey;
                                int iOY = member.oY();
                                for (int i2 = 0; i2 < iOY; i2++) {
                                    if (EQ(member.qp(i2), classType) && ((z2 && y1.tp(member.FN(i2))) || y1.QX(member.FN(i2)) || (z3 && !y1.tp(member.FN(i2))))) {
                                        this.j6.apiSearcherCallback.DW(member);
                                    }
                                }
                            } catch (e4 unused) {
                            }
                        } else if (entityNextKey.isMember() && ((Member) entityNextKey).Gj()) {
                            Member member2 = (Member) entityNextKey;
                            if (member2.sM() && member2.IS() && member2.WB().x9().XX(classType)) {
                                this.j6.apiSearcherCallback.DW(member2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (VH) {
                iy.rN(th, -746674962164500923L, this, new Object[]{syntaxTree, new Integer(i), classType, setOfFileEntry, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            }
            throw th;
        }
    }

    @ey(method = 1414712404373959800L)
    private void gn(SetOfInt setOfInt, SetOf<ClassType> setOf, SetOf<ClassType> setOf2, SetOf<ClassType> setOf3, SetOfFileEntry setOfFileEntry, boolean z) {
        try {
            if (Zo) {
                iy.QX(-5485120401291433399L, this, new Object[]{setOfInt, setOf, setOf2, setOf3, setOfFileEntry, new Boolean(z)});
            }
            setOfFileEntry.j6.init();
            while (setOfFileEntry.j6.hasMoreElements() && !this.j6.stopCallback.FN()) {
                FileEntry fileEntryNextKey = setOfFileEntry.j6.nextKey();
                if ((fileEntryNextKey.vJ() && this.v5.Hw(fileEntryNextKey, setOfInt)) || (!fileEntryNextKey.vJ() && this.v5.VH(fileEntryNextKey, setOfInt))) {
                    SetOf<Entity> setOfFN = this.FH.FN(fileEntryNextKey);
                    setOfFN.DEFAULT_ITERATOR.init();
                    while (setOfFN.DEFAULT_ITERATOR.hasMoreElements()) {
                        Entity entityNextKey = setOfFN.DEFAULT_ITERATOR.nextKey();
                        if (entityNextKey.isClassType()) {
                            ClassType classType = (ClassType) entityNextKey;
                            setOf.DEFAULT_ITERATOR.init();
                            while (setOf.DEFAULT_ITERATOR.hasMoreElements()) {
                                if (classType != setOf.DEFAULT_ITERATOR.nextKey() && classType.fN().contains(setOf.DEFAULT_ITERATOR.nextKey()) && !setOf3.contains(classType)) {
                                    this.j6.apiSearcherCallback.DW(classType);
                                    setOf2.put(classType);
                                    setOf3.put(classType);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (VH) {
                iy.rN(th, -5485120401291433399L, this, new Object[]{setOfInt, setOf, setOf2, setOf3, setOfFileEntry, new Boolean(z)});
            }
            throw th;
        }
    }

    @ey(method = 43227628363739448L)
    private SetOfFileEntry tp(boolean z) {
        try {
            if (Zo) {
                iy.Ws(-720247626787709673L, this, z);
            }
            if (z) {
                SetOfFileEntry setOfFileEntry = new SetOfFileEntry(this.DW);
                setOfFileEntry.u7(this.DW.KD());
                return setOfFileEntry;
            }
            SetOfFileEntry setOfFileEntry2 = new SetOfFileEntry(this.DW);
            setOfFileEntry2.u7(this.DW.getSolutionFiles());
            return setOfFileEntry2;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -720247626787709673L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 3683782242036515100L)
    private void v5(SyntaxTree syntaxTree, int i, Entity entity, SetOfFileEntry setOfFileEntry, boolean z) {
        Member member;
        Member member2;
        try {
            if (Zo) {
                iy.J8(-1377753804210256635L, this, syntaxTree, new Integer(i), entity, setOfFileEntry, new Boolean(z));
            }
            setOfFileEntry.j6.init();
            while (setOfFileEntry.j6.hasMoreElements() && !this.j6.stopCallback.FN()) {
                FileEntry fileEntryNextKey = setOfFileEntry.j6.nextKey();
                if ((fileEntryNextKey.vJ() && this.v5.v5(fileEntryNextKey, i)) || (!fileEntryNextKey.vJ() && this.v5.Zo(fileEntryNextKey, i))) {
                    SetOf<Entity> setOfFN = this.FH.FN(fileEntryNextKey);
                    setOfFN.DEFAULT_ITERATOR.init();
                    while (setOfFN.DEFAULT_ITERATOR.hasMoreElements()) {
                        Entity entityNextKey = setOfFN.DEFAULT_ITERATOR.nextKey();
                        if (entityNextKey.isMember() && ((Member) entityNextKey).e9() && (member2 = (Member) entityNextKey) != entity && member2.OW().contains(entity)) {
                            this.j6.apiSearcherCallback.DW(member2);
                        }
                        if (entityNextKey.isMember() && ((Member) entityNextKey).Gj() && (member = (Member) entityNextKey) != entity && member.OW().contains(entity)) {
                            this.j6.apiSearcherCallback.DW(member);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, -1377753804210256635L, this, syntaxTree, new Integer(i), entity, setOfFileEntry, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 3967672711401567909L)
    public void DW(FileEntry fileEntry, int i, int i2, boolean z) {
        try {
            if (Zo) {
                iy.J0(-882633010032976680L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
            this.j6.apiSearcherCallback.j6();
            SyntaxTree syntaxTreeZo = this.Hw.Zo(fileEntry, i, i2);
            int iJO = syntaxTreeZo.jO(i, i2);
            if (iJO != -1) {
                syntaxTreeZo.getLanguage().getCodeAnalyzer().VH(syntaxTreeZo, iJO);
                int identifier = syntaxTreeZo.getIdentifier(iJO);
                if (syntaxTreeZo.sh(iJO) != 0) {
                    Entity attrReferenceEntity = syntaxTreeZo.getAttrReferenceEntity(iJO);
                    if (attrReferenceEntity.isMember() && ((Member) attrReferenceEntity).iW()) {
                        attrReferenceEntity = ((Member) attrReferenceEntity).getEnclosingClassType();
                    }
                    if (attrReferenceEntity.isClassType()) {
                        this.j6.apiSearcherCallback.FH("Methods taking " + attrReferenceEntity.getFullyQualifiedNameString());
                        Zo(syntaxTreeZo, identifier, (ClassType) attrReferenceEntity, tp(attrReferenceEntity.getFile().vJ() || !z), z, false, true);
                    }
                }
            }
            this.Hw.releaseSyntaxTree(syntaxTreeZo);
            this.j6.apiSearcherCallback.Hw();
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, -882633010032976680L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 471775881321481752L)
    public void FH(FileEntry fileEntry, int i, int i2) {
        try {
            if (Zo) {
                iy.we(-211848059725856541L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.j6.apiSearcherCallback.j6();
            SyntaxTree syntaxTreeZo = this.Hw.Zo(fileEntry, i, i2);
            int iJO = syntaxTreeZo.jO(i, i2);
            if (iJO != -1) {
                syntaxTreeZo.getLanguage().getCodeAnalyzer().VH(syntaxTreeZo, iJO);
                syntaxTreeZo.getIdentifier(iJO);
                if (syntaxTreeZo.sh(iJO) != 0) {
                    Entity attrReferenceEntity = syntaxTreeZo.getAttrReferenceEntity(iJO);
                    if (attrReferenceEntity.isMember() && ((Member) attrReferenceEntity).e9()) {
                        this.j6.apiSearcherCallback.FH("Overridden methods of " + attrReferenceEntity.getFullyQualifiedNameString());
                        SetOf<Member> setOfJO = ((Member) attrReferenceEntity).jO();
                        setOfJO.DEFAULT_ITERATOR.init();
                        while (setOfJO.DEFAULT_ITERATOR.hasMoreElements()) {
                            Member member = (Member) setOfJO.DEFAULT_ITERATOR.nextKey();
                            if (member != attrReferenceEntity) {
                                this.j6.apiSearcherCallback.DW(member);
                            }
                        }
                    } else if (attrReferenceEntity.isMember() && ((Member) attrReferenceEntity).Gj()) {
                        this.j6.apiSearcherCallback.FH("Overridden properties of " + attrReferenceEntity.getFullyQualifiedNameString());
                        SetOf<Member> setOfJO2 = ((Member) attrReferenceEntity).jO();
                        setOfJO2.DEFAULT_ITERATOR.init();
                        while (setOfJO2.DEFAULT_ITERATOR.hasMoreElements()) {
                            Member member2 = (Member) setOfJO2.DEFAULT_ITERATOR.nextKey();
                            if (member2 != attrReferenceEntity) {
                                this.j6.apiSearcherCallback.DW(member2);
                            }
                        }
                    }
                }
            }
            this.Hw.releaseSyntaxTree(syntaxTreeZo);
            this.j6.apiSearcherCallback.Hw();
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -211848059725856541L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -731681834403275028L)
    public void Hw(FileEntry fileEntry, int i, int i2, boolean z) {
        try {
            if (Zo) {
                iy.J0(-1886052346286588673L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
            this.j6.apiSearcherCallback.j6();
            SyntaxTree syntaxTreeZo = this.Hw.Zo(fileEntry, i, i2);
            int iJO = syntaxTreeZo.jO(i, i2);
            if (iJO != -1) {
                syntaxTreeZo.getLanguage().getCodeAnalyzer().VH(syntaxTreeZo, iJO);
                int identifier = syntaxTreeZo.getIdentifier(iJO);
                if (syntaxTreeZo.sh(iJO) != 0) {
                    Entity attrReferenceEntity = syntaxTreeZo.getAttrReferenceEntity(iJO);
                    if (attrReferenceEntity.isMember() && ((Member) attrReferenceEntity).e9()) {
                        this.j6.apiSearcherCallback.FH("Methods overriding " + attrReferenceEntity.getFullyQualifiedNameString());
                        v5(syntaxTreeZo, identifier, attrReferenceEntity, tp(attrReferenceEntity.getFile().vJ() || !z), z);
                    } else if (attrReferenceEntity.isMember() && ((Member) attrReferenceEntity).Gj()) {
                        this.j6.apiSearcherCallback.FH("Properties overriding " + attrReferenceEntity.getFullyQualifiedNameString());
                        v5(syntaxTreeZo, identifier, attrReferenceEntity, tp(attrReferenceEntity.getFile().vJ() || !z), z);
                    }
                }
            }
            this.Hw.releaseSyntaxTree(syntaxTreeZo);
            this.j6.apiSearcherCallback.Hw();
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, -1886052346286588673L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -1864512774971215605L)
    public void j6(FileEntry fileEntry, int i, int i2, boolean z) throws Throwable {
        try {
            if (Zo) {
                iy.J0(118702887397009800L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
            this.j6.apiSearcherCallback.j6();
            try {
                SyntaxTree syntaxTreeZo = this.Hw.Zo(fileEntry, i, i2);
                int iJO = syntaxTreeZo.jO(i, i2);
                if (iJO != -1) {
                    syntaxTreeZo.getLanguage().getCodeAnalyzer().VH(syntaxTreeZo, iJO);
                    int iSh = syntaxTreeZo.sh(iJO);
                    int identifier = syntaxTreeZo.getIdentifier(iJO);
                    if (iSh != 0) {
                        Entity attrReferenceEntity = syntaxTreeZo.getAttrReferenceEntity(iJO);
                        if (attrReferenceEntity.isMember() && ((Member) attrReferenceEntity).iW()) {
                            attrReferenceEntity = ((Member) attrReferenceEntity).getEnclosingClassType();
                        }
                        Entity entity = attrReferenceEntity;
                        if (entity.isClassType()) {
                            this.j6.apiSearcherCallback.FH("Methods returning " + entity.getFullyQualifiedNameString());
                            SetOf<Entity> setOf = new SetOf<>(this.j6.entitySpace);
                            SetOfFileEntry setOfFileEntryTp = tp(entity.getFile().vJ() || !z);
                            SetOfInt setOfInt = new SetOfInt();
                            SetOf<ClassType> setOf2 = new SetOf<>(this.FH);
                            SetOf<ClassType> setOf3 = new SetOf<>(this.FH);
                            SetOf<ClassType> setOf4 = new SetOf<>(this.FH);
                            setOf3.put((ClassType) entity);
                            while (true) {
                                setOf4.clear();
                                setOfInt.clear();
                                setOf3.DEFAULT_ITERATOR.init();
                                while (setOf3.DEFAULT_ITERATOR.hasMoreElements()) {
                                    setOfInt.put(((ClassType) setOf3.DEFAULT_ITERATOR.nextKey()).getIdentifier());
                                }
                                SetOf<ClassType> setOf5 = setOf4;
                                SetOf<ClassType> setOf6 = setOf3;
                                SetOf<ClassType> setOf7 = setOf2;
                                SetOfInt setOfInt2 = setOfInt;
                                SetOf<Entity> setOf8 = setOf;
                                VH(syntaxTreeZo, setOfInt, (ClassType) entity, setOf3, setOf4, setOf2, setOfFileEntryTp, setOf, z);
                                setOf6.clear();
                                setOf6.u7(setOf5);
                                if (setOf5.J0() == 0) {
                                    break;
                                }
                                setOf3 = setOf6;
                                setOf4 = setOf5;
                                setOf2 = setOf7;
                                setOfInt = setOfInt2;
                                setOf = setOf8;
                            }
                            Zo(syntaxTreeZo, identifier, (ClassType) entity, setOfFileEntryTp, z, true, false);
                        }
                    }
                }
                this.Hw.releaseSyntaxTree(syntaxTreeZo);
                this.j6.apiSearcherCallback.Hw();
            } catch (Throwable th) {
                th = th;
                if (VH) {
                    iy.a8(th, 118702887397009800L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = 1324318579525699751L)
    public void u7(FileEntry fileEntry, int i, int i2, boolean z) {
        try {
            if (Zo) {
                iy.J0(-5164143301857873240L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
            this.j6.apiSearcherCallback.j6();
            SyntaxTree syntaxTreeZo = this.Hw.Zo(fileEntry, i, i2);
            int iJO = syntaxTreeZo.jO(i, i2);
            if (iJO != -1) {
                syntaxTreeZo.getLanguage().getCodeAnalyzer().VH(syntaxTreeZo, iJO);
                if (syntaxTreeZo.sh(iJO) != 0) {
                    Entity attrReferenceEntity = syntaxTreeZo.getAttrReferenceEntity(iJO);
                    if (attrReferenceEntity.isMember() && ((Member) attrReferenceEntity).iW()) {
                        attrReferenceEntity = ((Member) attrReferenceEntity).getEnclosingClassType();
                    }
                    if (attrReferenceEntity.isClassType()) {
                        this.j6.apiSearcherCallback.FH("Inheritors of " + attrReferenceEntity.getFullyQualifiedNameString());
                        SetOfFileEntry setOfFileEntryTp = tp(attrReferenceEntity.getFile().vJ() || !z);
                        SetOfInt setOfInt = new SetOfInt();
                        SetOf<ClassType> setOf = new SetOf<>(this.FH);
                        SetOf<ClassType> setOf2 = new SetOf<>(this.FH);
                        SetOf<ClassType> setOf3 = new SetOf<>(this.FH);
                        setOf2.put((ClassType) attrReferenceEntity);
                        while (true) {
                            setOf3.clear();
                            setOfInt.clear();
                            setOf2.DEFAULT_ITERATOR.init();
                            while (setOf2.DEFAULT_ITERATOR.hasMoreElements()) {
                                setOfInt.put(((ClassType) setOf2.DEFAULT_ITERATOR.nextKey()).getIdentifier());
                            }
                            SetOf<ClassType> setOf4 = setOf3;
                            SetOf<ClassType> setOf5 = setOf2;
                            gn(setOfInt, setOf2, setOf3, setOf, setOfFileEntryTp, z);
                            setOf5.clear();
                            setOf5.u7(setOf4);
                            if (setOf4.J0() == 0) {
                                break;
                            }
                            setOf2 = setOf5;
                            setOf3 = setOf4;
                        }
                    }
                }
            }
            this.Hw.releaseSyntaxTree(syntaxTreeZo);
            this.j6.apiSearcherCallback.Hw();
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, -5164143301857873240L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }
}
