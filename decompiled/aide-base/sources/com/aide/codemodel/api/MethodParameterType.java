package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.e4;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.ListOf;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;

@cy(clazz = -583003628009824656L, container = -583003628009824656L, user = true)
/* loaded from: classes.dex */
public final class MethodParameterType extends Type {

    @fy
    private static /* synthetic */ boolean lg;

    @gy
    private static /* synthetic */ boolean rN;

    @dy(field = -2550727106430772595L)
    private final EntitySpace EQ;

    @dy(field = -487626009122260008L)
    private ListOf<Type> boundTypes;

    @dy(field = 1876420239687468300L)
    private int declarationNumber;

    @dy(field = 3929614026017319024L)
    private int endColumn;

    @dy(field = -2073595163676673049L)
    private FileEntry file;

    @dy(field = 747376488588133976L)
    private int id;

    @dy(field = 4317284181929146232L)
    private int identifier;

    @dy(field = -2069301111887348377L)
    private int line;

    @dy(field = -2006440509719440704L)
    private Member method;

    @dy(field = 52276989496075552L)
    private int number;

    @dy(field = -1117774567068353481L)
    private int startColumn;

    @dy(field = 572165121199379155L)
    private boolean typesLoaded;

    @dy(field = 1810099806323241473L)
    private final FileSpace we;

    static {
        iy.Zo(MethodParameterType.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -370537915898681073L)
    public MethodParameterType(EntitySpace entitySpace, IdentifierSpace identifierSpace, FileSpace fileSpace) {
        super(fileSpace, entitySpace, 16);
        try {
            if (lg) {
                iy.we(-5418398808552087765L, null, entitySpace, identifierSpace, fileSpace);
            }
            this.EQ = entitySpace;
            this.we = fileSpace;
        } catch (Throwable th) {
            if (rN) {
                iy.U2(th, -5418398808552087765L, null, entitySpace, identifierSpace, fileSpace);
            }
            throw th;
        }
    }

    @ey(method = -3290902080672542575L)
    private void k2() {
        try {
            if (lg) {
                iy.gn(-437262350036097255L, this);
            }
            if (this.typesLoaded) {
                return;
            }
            this.typesLoaded = true;
            if (!getLanguage().getTypeSystem().FH() || this.method.jO().J0() <= 0) {
                this.EQ.e9(getFile(), getLanguage());
                return;
            }
            try {
                Member member = (Member) this.method.jO().Zo();
                MethodParameterType methodParameterTypeJw = jw(member);
                int iYe = methodParameterTypeJw.ye();
                for (int i = 0; i < iYe; i++) {
                    FN(methodParameterTypeJw.Ev(this.method.getEnclosingClassType().u9(), i).aq(this.method, member));
                }
            } catch (e4 unused) {
            }
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -437262350036097255L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 5032565595159071131L)
    public int DW() {
        try {
            if (lg) {
                iy.gn(2532293468951293411L, this);
            }
            return this.declarationNumber;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 2532293468951293411L, this);
            }
            throw th;
        }
    }

    @ey(method = 1524163411762366175L)
    public Type Ev(Type type, int i) {
        try {
            if (lg) {
                iy.EQ(3681759442801918919L, this, type, new Integer(i));
            }
            Type typeKo = ko(i);
            if (type.isClassType()) {
                Type containingTypeOfMember = ((ClassType) type).getContainingTypeOfMember(this.method);
                return containingTypeOfMember.isParameterizedType() ? ((ParameterizedType) containingTypeOfMember).replaceType(typeKo) : typeKo;
            }
            Type containingTypeOfMember2 = ((ParameterizedType) type).getClassType().getContainingTypeOfMember(this.method);
            return !containingTypeOfMember2.isParameterizedType() ? ((ParameterizedType) type).replaceType(typeKo) : ((ParameterizedType) type).replaceType(((ParameterizedType) containingTypeOfMember2).replaceType(typeKo));
        } catch (Throwable th) {
            if (rN) {
                iy.Mr(th, 3681759442801918919L, this, type, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 567892827240557560L)
    public void FN(Type type) {
        try {
            if (lg) {
                iy.tp(-5794829640710114264L, this, type);
            }
            if (type != this) {
                this.boundTypes.j6(type);
            }
            this.typesLoaded = true;
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -5794829640710114264L, this, type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 37172307624620172L)
    public int J8() {
        try {
            if (lg) {
                iy.gn(-3208171581967067716L, this);
            }
            this.EQ.Cz(getFile(), getLanguage());
            return this.endColumn;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -3208171581967067716L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 1034871509324621551L)
    public int QX() {
        try {
            if (lg) {
                iy.gn(190234870850836215L, this);
            }
            this.EQ.Cz(getFile(), getLanguage());
            return this.startColumn;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 190234870850836215L, this);
            }
            throw th;
        }
    }

    @ey(method = 569091318244264361L)
    public Member WB() {
        try {
            if (lg) {
                iy.gn(-3250470716602169135L, this);
            }
            return this.method;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -3250470716602169135L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 2848698728197114275L)
    public int Ws() {
        try {
            if (lg) {
                iy.gn(-4419403968789842085L, this);
            }
            this.EQ.Cz(getFile(), getLanguage());
            return this.line;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -4419403968789842085L, this);
            }
            throw th;
        }
    }

    @ey(method = -615731693178470484L)
    public MethodParameterType fY(Member member) {
        try {
            if (lg) {
                iy.tp(-128665382075745860L, this, member);
            }
            if (member.Eq() > this.number) {
                return member.Xa(this.number);
            }
            throw new e4();
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -128665382075745860L, this, member);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 1876933429383493152L)
    public ClassType getEnclosingClassType() {
        try {
            if (lg) {
                iy.gn(-2171988932459524672L, this);
            }
            return this.method.getEnclosingClassType();
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -2171988932459524672L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -1974982059094492968L)
    public FileEntry getFile() {
        try {
            if (lg) {
                iy.gn(3025238313874751048L, this);
            }
            return this.file;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 3025238313874751048L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -2748905483210807697L)
    public int getId() {
        try {
            if (lg) {
                iy.gn(-577741241277284265L, this);
            }
            return this.id;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -577741241277284265L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 2341215706462170111L)
    public int getIdentifier() {
        try {
            if (lg) {
                iy.gn(2460219016794655927L, this);
            }
            return this.identifier;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 2460219016794655927L, this);
            }
            throw th;
        }
    }

    @ey(method = -4388337941240917369L)
    public void invalidate() {
        try {
            if (lg) {
                iy.gn(-1401479934862935201L, this);
            }
            if (this.boundTypes != null) {
                this.boundTypes.FH();
            }
            this.typesLoaded = false;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -1401479934862935201L, this);
            }
            throw th;
        }
    }

    @ey(method = 4102150345287439025L)
    public void jO(int i, int i2, int i3) {
        try {
            if (lg) {
                iy.we(3494937068958524745L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            this.line = i;
            this.startColumn = i2;
            this.endColumn = i3;
        } catch (Throwable th) {
            if (rN) {
                iy.U2(th, 3494937068958524745L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -200725974708515685L)
    public MethodParameterType jw(Member member) {
        try {
            if (lg) {
                iy.tp(35870144058513043L, this, member);
            }
            if (member.Eq() > this.number) {
                return member.Xa(this.number);
            }
            throw new e4();
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, 35870144058513043L, this, member);
            }
            throw th;
        }
    }

    @ey(method = -462153857417289613L)
    public Type ko(int i) {
        try {
            if (lg) {
                iy.u7(-829328656460393173L, this, i);
            }
            k2();
            return (this.boundTypes == null || this.boundTypes.EQ() <= 0) ? this.EQ.getRootClasstype(getFile(), getLanguage()) : (Type) this.boundTypes.v5(i);
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -829328656460393173L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type, com.aide.codemodel.api.Entity
    @ey(method = -1770256391769813440L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (lg) {
                iy.tp(-5638199226992850944L, this, storeInputStream);
            }
            super.load(storeInputStream);
            this.line = storeInputStream.readInt();
            this.startColumn = storeInputStream.readInt();
            this.endColumn = storeInputStream.readInt();
            this.id = storeInputStream.readInt();
            this.file = this.we.getFileEntry(storeInputStream.readInt());
            this.declarationNumber = storeInputStream.readInt();
            this.identifier = storeInputStream.readInt();
            this.method = (Member) this.EQ.getEntity(storeInputStream.readInt());
            this.number = storeInputStream.readInt();
            this.typesLoaded = storeInputStream.readBoolean();
            if (storeInputStream.readBoolean()) {
                this.boundTypes = new ListOf<>(this.EQ, storeInputStream);
            }
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -5638199226992850944L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = 3171454940752293897L)
    public int mb() {
        try {
            if (lg) {
                iy.gn(-936988140754161423L, this);
            }
            return this.number;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -936988140754161423L, this);
            }
            throw th;
        }
    }

    @ey(method = -12887440418550600L)
    public void oY(int i, Member member, int i2) {
        try {
            if (lg) {
                iy.we(860764207088854440L, this, new Integer(i), member, new Integer(i2));
            }
            this.identifier = i;
            this.method = member;
            this.number = i2;
            if (this.boundTypes == null) {
                this.boundTypes = new ListOf<>(this.EQ);
            } else {
                this.boundTypes.FH();
            }
        } catch (Throwable th) {
            if (rN) {
                iy.U2(th, 860764207088854440L, this, new Integer(i), member, new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type, com.aide.codemodel.api.Entity
    @ey(method = -3962730339559422144L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (lg) {
                iy.tp(3553709583606604080L, this, storeOutputStream);
            }
            super.store(storeOutputStream);
            storeOutputStream.writeInt(this.line);
            storeOutputStream.writeInt(this.startColumn);
            storeOutputStream.writeInt(this.endColumn);
            storeOutputStream.writeInt(this.id);
            storeOutputStream.writeInt(this.file.getId());
            storeOutputStream.writeInt(this.declarationNumber);
            storeOutputStream.writeInt(this.identifier);
            storeOutputStream.writeInt(this.EQ.getId(this.method));
            storeOutputStream.writeInt(this.number);
            storeOutputStream.writeBoolean(this.typesLoaded);
            storeOutputStream.writeBoolean(this.boundTypes != null);
            if (this.boundTypes != null) {
                this.boundTypes.store(storeOutputStream);
            }
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, 3553709583606604080L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type
    @ey(method = -1967483447366444064L)
    public Type x9() {
        try {
            if (lg) {
                iy.gn(-1442841869059774400L, this);
            }
            k2();
            return (this.boundTypes == null || this.boundTypes.EQ() <= 0) ? this.EQ.getRootClasstype(getFile(), getLanguage()) : (Type) this.boundTypes.v5(0);
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -1442841869059774400L, this);
            }
            throw th;
        }
    }

    @ey(method = -6367241646048927519L)
    public int ye() {
        try {
            if (lg) {
                iy.gn(115447039118253753L, this);
            }
            k2();
            if (this.boundTypes != null && this.boundTypes.EQ() != 0) {
                return this.boundTypes.EQ();
            }
            return 1;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 115447039118253753L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 1542618654589282160L)
    public MethodParameterType(EntitySpace entitySpace, IdentifierSpace identifierSpace, FileSpace fileSpace, FileEntry fileEntry, Language language, int i) {
        super(fileSpace, entitySpace, 16);
        try {
            if (lg) {
                iy.QX(3332594839503683096L, null, new Object[]{entitySpace, identifierSpace, fileSpace, fileEntry, language, new Integer(i)});
            }
            this.EQ = entitySpace;
            this.we = fileSpace;
            this.id = entitySpace.declareEntity(this);
            this.file = fileEntry;
            this.declarationNumber = i;
            this.boundTypes = null;
            this.typesLoaded = false;
            j6(language);
        } catch (Throwable th) {
            if (rN) {
                iy.rN(th, 3332594839503683096L, null, new Object[]{entitySpace, identifierSpace, fileSpace, fileEntry, language, new Integer(i)});
            }
            throw th;
        }
    }
}
