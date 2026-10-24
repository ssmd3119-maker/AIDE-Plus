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

@cy(clazz = 580387162852182852L, container = 580387162852182852L, user = true)
/* loaded from: classes.dex */
public final class MethodParameterTypeVariable extends Type {

    @fy
    private static /* synthetic */ boolean J0;

    @gy
    private static /* synthetic */ boolean J8;

    @dy(field = -78804554671707644L)
    private int EQ;

    @dy(field = -2376019441425047361L)
    private EntitySpace tp;

    @dy(field = -1286567494882792389L)
    private MethodParameterType we;

    static {
        iy.Zo(MethodParameterTypeVariable.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 11331789559055552L)
    public MethodParameterTypeVariable(FileSpace fileSpace, EntitySpace entitySpace) {
        super(fileSpace, entitySpace, 16);
        try {
            if (J0) {
                iy.EQ(-367282829187612261L, null, fileSpace, entitySpace);
            }
            this.tp = entitySpace;
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, -367282829187612261L, null, fileSpace, entitySpace);
            }
            throw th;
        }
    }

    @ey(method = 112552473317924880L)
    public MethodParameterType FN() {
        try {
            if (J0) {
                iy.gn(5339899499375459347L, this);
            }
            return this.we;
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, 5339899499375459347L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -2573772051320801235L)
    public int getId() {
        try {
            if (J0) {
                iy.gn(-1461455446434569872L, this);
            }
            return this.EQ;
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, -1461455446434569872L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = -205172534113026800L)
    public Language getLanguage() {
        try {
            if (J0) {
                iy.gn(1446016367709257925L, this);
            }
            return FN().getLanguage();
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, 1446016367709257925L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type, com.aide.codemodel.api.Entity
    @ey(method = 7837456490030110688L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (J0) {
                iy.tp(5816126795782554981L, this, storeInputStream);
            }
            super.load(storeInputStream);
            this.EQ = storeInputStream.readInt();
            this.we = (MethodParameterType) this.tp.getEntity(storeInputStream.readInt());
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, 5816126795782554981L, this, storeInputStream);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type, com.aide.codemodel.api.Entity
    @ey(method = 2019175224193632096L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (J0) {
                iy.tp(-6363692536113970631L, this, storeOutputStream);
            }
            super.store(storeOutputStream);
            storeOutputStream.writeInt(this.EQ);
            storeOutputStream.writeInt(this.tp.getId(this.we));
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, -6363692536113970631L, this, storeOutputStream);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -2692074855748236676L)
    public MethodParameterTypeVariable(FileSpace fileSpace, EntitySpace entitySpace, MethodParameterType methodParameterType) {
        super(fileSpace, entitySpace, 16);
        try {
            if (J0) {
                iy.we(410364850268172945L, null, fileSpace, entitySpace, methodParameterType);
            }
            this.tp = entitySpace;
            this.EQ = entitySpace.declareEntity(this);
            this.we = methodParameterType;
        } catch (Throwable th) {
            if (J8) {
                iy.U2(th, 410364850268172945L, null, fileSpace, entitySpace, methodParameterType);
            }
            throw th;
        }
    }
}
