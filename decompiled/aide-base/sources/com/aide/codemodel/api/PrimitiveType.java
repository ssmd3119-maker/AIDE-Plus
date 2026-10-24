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

@cy(clazz = 111105373859989301L, container = 111105373859989301L, user = true)
/* loaded from: classes.dex */
public final class PrimitiveType extends Type {

    @fy
    private static /* synthetic */ boolean EQ;

    @gy
    private static /* synthetic */ boolean we;

    @dy(field = 2025683633587264067L)
    private int tp;

    static {
        iy.Zo(PrimitiveType.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 398049905046692839L)
    public PrimitiveType(EntitySpace entitySpace, FileSpace fileSpace, int i, Language language) {
        super(fileSpace, entitySpace, i);
        try {
            if (EQ) {
                iy.J0(2137121317231212255L, null, entitySpace, fileSpace, new Integer(i), language);
            }
            this.tp = entitySpace.declareEntity(this);
            j6(language);
        } catch (Throwable th) {
            if (we) {
                iy.a8(th, 2137121317231212255L, null, entitySpace, fileSpace, new Integer(i), language);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Entity
    @ey(method = 2212118326904887164L)
    public int getId() {
        try {
            if (EQ) {
                iy.gn(1818744301060422669L, this);
            }
            return this.tp;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 1818744301060422669L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type, com.aide.codemodel.api.Entity
    @ey(method = -1048298075203407603L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (EQ) {
                iy.tp(1486024931137381040L, this, storeInputStream);
            }
            super.load(storeInputStream);
            this.tp = storeInputStream.readInt();
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 1486024931137381040L, this, storeInputStream);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Type, com.aide.codemodel.api.Entity
    @ey(method = -6213588089757868059L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (EQ) {
                iy.tp(4151002238999059392L, this, storeOutputStream);
            }
            super.store(storeOutputStream);
            storeOutputStream.writeInt(this.tp);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 4151002238999059392L, this, storeOutputStream);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -3055888206271953L)
    public PrimitiveType(EntitySpace entitySpace, FileSpace fileSpace) {
        super(fileSpace, entitySpace);
        try {
            if (EQ) {
                iy.EQ(-5090294703215516697L, null, entitySpace, fileSpace);
            }
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, -5090294703215516697L, null, entitySpace, fileSpace);
            }
            throw th;
        }
    }
}
