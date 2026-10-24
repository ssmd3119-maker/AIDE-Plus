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

@cy(clazz = 5635503140153783283L, container = 5635503140153783283L, user = true)
/* loaded from: classes.dex */
public final class PointerType extends Type {

    @fy
    private static /* synthetic */ boolean J0;

    @gy
    private static /* synthetic */ boolean J8;

    @dy(field = 1975115590987266756L)
    private int EQ;

    @dy(field = 1110600824817025399L)
    private EntitySpace tp;

    @dy(field = 216276370314573101L)
    private Type we;

    static {
        iy.Zo(PointerType.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 54597182471459264L)
    public PointerType(FileSpace fileSpace, EntitySpace entitySpace) {
        super(fileSpace, entitySpace, 16);
        try {
            if (J0) {
                iy.EQ(-3221138652462186877L, null, fileSpace, entitySpace);
            }
            this.tp = entitySpace;
        } catch (Throwable th) {
            if (J8) {
                iy.Mr(th, -3221138652462186877L, null, fileSpace, entitySpace);
            }
            throw th;
        }
    }

    @ey(method = -2411034634084835340L)
    public Type FN() {
        try {
            if (J0) {
                iy.gn(945317995072218480L, this);
            }
            return this.we;
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, 945317995072218480L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 919371357093882277L)
    public int getId() {
        try {
            if (J0) {
                iy.gn(-2376526500105726225L, this);
            }
            return this.EQ;
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, -2376526500105726225L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 1263711884427730416L)
    public Language getLanguage() {
        try {
            if (J0) {
                iy.gn(-3462202918661589200L, this);
            }
            return FN().getLanguage();
        } catch (Throwable th) {
            if (J8) {
                iy.aM(th, -3462202918661589200L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type, com.aide.codemodel.api.Entity
    @ey(method = -3929227917692237712L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (J0) {
                iy.tp(-3710770417751869440L, this, storeInputStream);
            }
            super.load(storeInputStream);
            this.EQ = storeInputStream.readInt();
            this.we = (Type) this.tp.getEntity(storeInputStream.readInt());
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, -3710770417751869440L, this, storeInputStream);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type, com.aide.codemodel.api.Entity
    @ey(method = 8452475287985535520L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (J0) {
                iy.tp(2570932489726923296L, this, storeOutputStream);
            }
            super.store(storeOutputStream);
            storeOutputStream.writeInt(this.EQ);
            storeOutputStream.writeInt(this.tp.getId(this.we));
        } catch (Throwable th) {
            if (J8) {
                iy.j3(th, 2570932489726923296L, this, storeOutputStream);
            }
            throw th;
        }
    }
}
