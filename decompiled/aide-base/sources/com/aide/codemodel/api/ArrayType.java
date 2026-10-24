package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;

@cy(clazz = -6584549325578221635L, container = -6584549325578221635L, user = true)
/* loaded from: classes.dex */
public final class ArrayType extends Type {

    @fy
    private static /* synthetic */ boolean J8;

    @gy
    private static /* synthetic */ boolean Ws;

    @dy(field = 817370024639882323L)
    private int EQ;

    @dy(field = 3903166208259581280L)
    private int J0;

    @dy(field = -274033973356127624L)
    private Type elementType;

    @dy(field = -1796754258701687784L)
    private EntitySpace tp;

    static {
        iy.Zo(ArrayType.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -254314059857534637L)
    public ArrayType(FileSpace fileSpace, EntitySpace entitySpace) {
        super(fileSpace, entitySpace, 16);
        try {
            if (J8) {
                iy.EQ(-1837115057129756640L, null, fileSpace, entitySpace);
            }
            this.tp = entitySpace;
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, -1837115057129756640L, null, fileSpace, entitySpace);
            }
            throw th;
        }
    }

    @ey(method = -2241924380081240700L)
    public Type FN() {
        try {
            if (J8) {
                iy.gn(3011536618120921380L, this);
            }
            Type elementType = getElementType();
            while (elementType.isArrayType()) {
                elementType = ((ArrayType) elementType).getElementType();
            }
            return elementType;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 3011536618120921380L, this);
            }
            throw th;
        }
    }

    @ey(method = 1337661834433107435L)
    public Type getElementType() {
        try {
            if (J8) {
                iy.gn(-602593227830165749L, this);
            }
            return this.elementType;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -602593227830165749L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -1994421747651885684L)
    public int getId() {
        try {
            if (J8) {
                iy.gn(-1836129312250467444L, this);
            }
            return this.EQ;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -1836129312250467444L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 1695235624640491665L)
    public Language getLanguage() {
        try {
            if (J8) {
                iy.gn(-3589200714219507135L, this);
            }
            return getElementType().getLanguage();
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -3589200714219507135L, this);
            }
            throw th;
        }
    }

    @ey(method = -4272810270494178591L)
    public int jO() {
        try {
            if (J8) {
                iy.gn(646764683124530873L, this);
            }
            return this.J0;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 646764683124530873L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type, com.aide.codemodel.api.Entity
    @ey(method = -5741290562770675891L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (J8) {
                iy.tp(-4628206455697086059L, this, storeInputStream);
            }
            super.load(storeInputStream);
            this.EQ = storeInputStream.readInt();
            this.elementType = (Type) this.tp.getEntity(storeInputStream.readInt());
            this.J0 = storeInputStream.readInt();
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, -4628206455697086059L, this, storeInputStream);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type, com.aide.codemodel.api.Entity
    @ey(method = 4441505908075640973L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (J8) {
                iy.tp(4868930270849752045L, this, storeOutputStream);
            }
            super.store(storeOutputStream);
            storeOutputStream.writeInt(this.EQ);
            storeOutputStream.writeInt(this.tp.getId(this.elementType));
            storeOutputStream.writeInt(this.J0);
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 4868930270849752045L, this, storeOutputStream);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -3379909634830782096L)
    public ArrayType(FileSpace fileSpace, EntitySpace entitySpace, Type type, int i) {
        super(fileSpace, entitySpace, 16);
        try {
            if (J8) {
                iy.J0(-3121907644743024647L, null, fileSpace, entitySpace, type, new Integer(i));
            }
            this.tp = entitySpace;
            this.EQ = entitySpace.declareEntity(this);
            this.elementType = type;
            this.J0 = i;
        } catch (Throwable th) {
            if (Ws) {
                iy.a8(th, -3121907644743024647L, null, fileSpace, entitySpace, type, new Integer(i));
            }
            throw th;
        }
    }
}
