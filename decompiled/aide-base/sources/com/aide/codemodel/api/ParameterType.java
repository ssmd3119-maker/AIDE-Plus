package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.ListOf;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;

@cy(clazz = -103979521765673281L, container = -103979521765673281L, user = true)
/* loaded from: classes.dex */
public final class ParameterType extends Type {

    @fy
    private static /* synthetic */ boolean lg;

    @gy
    private static /* synthetic */ boolean rN;

    @dy(field = -574082904185969869L)
    private final EntitySpace EQ;

    @dy(field = -34010174951390631L)
    private FileEntry J0;

    @dy(field = 7090363000833468552L)
    private int J8;

    @dy(field = 1590845107409812020L)
    private int Mr;

    @dy(field = 1710221147477906525L)
    private int QX;

    @dy(field = 1798479496476178320L)
    private int U2;

    @dy(field = -26343606485557431L)
    private int Ws;

    @dy(field = -2451054345838347784L)
    private int XL;

    @dy(field = -2015360145680810325L)
    private ClassType a8;

    @dy(field = -3736127308920098677L)
    private boolean aM;

    @dy(field = -3480973476478230432L)
    private ListOf<Type> j3;

    @dy(field = -442298761204394016L)
    private int tp;

    @dy(field = 4080302040840792615L)
    private final FileSpace we;

    static {
        iy.Zo(ParameterType.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 1917546669415564367L)
    public ParameterType(EntitySpace entitySpace, IdentifierSpace identifierSpace, FileSpace fileSpace) {
        super(fileSpace, entitySpace, 16);
        try {
            if (lg) {
                iy.we(91700021376042009L, null, entitySpace, identifierSpace, fileSpace);
            }
            this.EQ = entitySpace;
            this.we = fileSpace;
        } catch (Throwable th) {
            if (rN) {
                iy.U2(th, 91700021376042009L, null, entitySpace, identifierSpace, fileSpace);
            }
            throw th;
        }
    }

    @ey(method = 4442033393971682769L)
    private void fY() {
        try {
            if (lg) {
                iy.gn(2812654569414339424L, this);
            }
            if (this.aM) {
                return;
            }
            this.a8.getAllSuperTypes();
            if (this.a8.areSuperClasstypesLoaded()) {
                qp();
            }
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 2812654569414339424L, this);
            }
            throw th;
        }
    }

    @ey(method = 3763924846648512225L)
    private void qp() {
        try {
            if (lg) {
                iy.gn(1500527513292571340L, this);
            }
            if (this.aM) {
                return;
            }
            this.aM = true;
            if (this.j3 != null) {
                this.EQ.sE(this.a8);
            }
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 1500527513292571340L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 2760024419530269115L)
    public int DW() {
        try {
            if (lg) {
                iy.gn(-2346018093921418632L, this);
            }
            return this.J8;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -2346018093921418632L, this);
            }
            throw th;
        }
    }

    @ey(method = -2829826343182277133L)
    public Type Ev(int i) {
        try {
            if (lg) {
                iy.u7(-2933388147986567936L, this, i);
            }
            fY();
            return (this.j3 == null || this.j3.EQ() <= 0) ? this.EQ.getRootClasstype(getFile(), getLanguage()) : (Type) this.j3.v5(i);
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -2933388147986567936L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4267436842596405336L)
    public void FN(Type type) {
        try {
            if (lg) {
                iy.tp(-5868165192931418025L, this, type);
            }
            if (type != this) {
                this.j3.j6(type);
            }
            this.aM = true;
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -5868165192931418025L, this, type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -283273939726616500L)
    public int J8() {
        try {
            if (lg) {
                iy.gn(-5322222429890594511L, this);
            }
            this.EQ.Cz(getFile(), getLanguage());
            return this.XL;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -5322222429890594511L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 206666094230394831L)
    public int QX() {
        try {
            if (lg) {
                iy.gn(408738378420640840L, this);
            }
            this.EQ.Cz(getFile(), getLanguage());
            return this.QX;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 408738378420640840L, this);
            }
            throw th;
        }
    }

    @ey(method = -1331676725295287040L)
    public ClassType WB() {
        try {
            if (lg) {
                iy.gn(219953478688338927L, this);
            }
            return this.a8;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 219953478688338927L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 5676343735670795299L)
    public int Ws() {
        try {
            if (lg) {
                iy.gn(-4166487061252707456L, this);
            }
            this.EQ.Cz(getFile(), getLanguage());
            return this.Ws;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -4166487061252707456L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -4884579832701901056L)
    public ClassType getEnclosingClassType() {
        try {
            if (lg) {
                iy.gn(2572334282229362001L, this);
            }
            return this.a8;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 2572334282229362001L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -272396337481348808L)
    public FileEntry getFile() {
        try {
            if (lg) {
                iy.gn(1364111916381136317L, this);
            }
            return this.J0;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 1364111916381136317L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 2574239181226297135L)
    public int getId() {
        try {
            if (lg) {
                iy.gn(435479644724093268L, this);
            }
            return this.tp;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 435479644724093268L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 5263349521476633279L)
    public int getIdentifier() {
        try {
            if (lg) {
                iy.gn(322143216542784L, this);
            }
            return this.Mr;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 322143216542784L, this);
            }
            throw th;
        }
    }

    @ey(method = 3346344906080975655L)
    public void invalidate() {
        try {
            if (lg) {
                iy.gn(1870042966438849080L, this);
            }
            if (this.j3 != null) {
                this.j3.FH();
            }
            this.aM = false;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 1870042966438849080L, this);
            }
            throw th;
        }
    }

    @ey(method = 3489417516124946385L)
    public void jO(int i, int i2, int i3) {
        try {
            if (lg) {
                iy.we(-2208005614336964464L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            this.Ws = i;
            this.QX = i2;
            this.XL = i3;
        } catch (Throwable th) {
            if (rN) {
                iy.U2(th, -2208005614336964464L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 6556870936140238560L)
    public int ko() {
        try {
            if (lg) {
                iy.gn(-3410391644946683535L, this);
            }
            return (this.a8.getAbsoluteParametertypeCount() - this.a8.Pa()) + mb();
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -3410391644946683535L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type, com.aide.codemodel.api.Entity
    @ey(method = -13559351209971840L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (lg) {
                iy.tp(-2497675549792041911L, this, storeInputStream);
            }
            super.load(storeInputStream);
            this.Ws = storeInputStream.readInt();
            this.QX = storeInputStream.readInt();
            this.XL = storeInputStream.readInt();
            this.tp = storeInputStream.readInt();
            this.J0 = this.we.getFileEntry(storeInputStream.readInt());
            this.J8 = storeInputStream.readInt();
            this.U2 = storeInputStream.readInt();
            this.Mr = storeInputStream.readInt();
            this.a8 = (ClassType) this.EQ.getEntity(storeInputStream.readInt());
            this.aM = storeInputStream.readBoolean();
            if (storeInputStream.readBoolean()) {
                this.j3 = new ListOf<>(this.EQ, storeInputStream);
            }
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -2497675549792041911L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = 1594412285382397033L)
    public int mb() {
        try {
            if (lg) {
                iy.gn(2050375561390834008L, this);
            }
            return this.U2;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 2050375561390834008L, this);
            }
            throw th;
        }
    }

    @ey(method = 1544906765137222656L)
    public void oY(int i, ClassType classType, int i2) {
        try {
            if (lg) {
                iy.we(-140534711792459525L, this, new Integer(i), classType, new Integer(i2));
            }
            this.U2 = i2;
            this.Mr = i;
            this.a8 = classType;
            if (this.j3 == null) {
                this.j3 = new ListOf<>(this.EQ);
            } else {
                this.j3.FH();
            }
        } catch (Throwable th) {
            if (rN) {
                iy.U2(th, -140534711792459525L, this, new Integer(i), classType, new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type, com.aide.codemodel.api.Entity
    @ey(method = -3734878711276325024L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (lg) {
                iy.tp(7884173085715990305L, this, storeOutputStream);
            }
            super.store(storeOutputStream);
            storeOutputStream.writeInt(this.Ws);
            storeOutputStream.writeInt(this.QX);
            storeOutputStream.writeInt(this.XL);
            storeOutputStream.writeInt(this.tp);
            storeOutputStream.writeInt(this.J0.getId());
            storeOutputStream.writeInt(this.J8);
            storeOutputStream.writeInt(this.U2);
            storeOutputStream.writeInt(this.Mr);
            storeOutputStream.writeInt(this.EQ.getId(this.a8));
            storeOutputStream.writeBoolean(this.aM);
            storeOutputStream.writeBoolean(this.j3 != null);
            if (this.j3 != null) {
                this.j3.store(storeOutputStream);
            }
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, 7884173085715990305L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type
    @ey(method = 754268361206235552L)
    public Type x9() {
        try {
            if (lg) {
                iy.gn(-3921158424877356225L, this);
            }
            fY();
            return (this.j3 == null || this.j3.EQ() <= 0) ? this.EQ.getRootClasstype(getFile(), getLanguage()) : (Type) this.j3.v5(0);
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -3921158424877356225L, this);
            }
            throw th;
        }
    }

    @ey(method = -3900905173448823551L)
    public int ye() {
        try {
            if (lg) {
                iy.gn(390349379287665696L, this);
            }
            fY();
            if (this.j3 != null && this.j3.EQ() != 0) {
                return this.j3.EQ();
            }
            return 1;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 390349379287665696L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -3783193757997293040L)
    public ParameterType(EntitySpace entitySpace, IdentifierSpace identifierSpace, FileSpace fileSpace, FileEntry fileEntry, Language language, int i) {
        super(fileSpace, entitySpace, 16);
        try {
            if (lg) {
                iy.QX(1387177772409877844L, null, new Object[]{entitySpace, identifierSpace, fileSpace, fileEntry, language, new Integer(i)});
            }
            this.EQ = entitySpace;
            this.we = fileSpace;
            this.tp = entitySpace.declareEntity(this);
            this.J0 = fileEntry;
            this.J8 = i;
            this.aM = false;
            j6(language);
        } catch (Throwable th) {
            if (rN) {
                iy.rN(th, 1387177772409877844L, null, new Object[]{entitySpace, identifierSpace, fileSpace, fileEntry, language, new Integer(i)});
            }
            throw th;
        }
    }
}
