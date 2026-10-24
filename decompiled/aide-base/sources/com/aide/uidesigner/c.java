package com.aide.uidesigner;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.uidesigner.h;
import java.util.HashMap;
import java.util.Map;

@cy(clazz = 2256145217945788433L, container = 2256145217945788433L, user = true)
/* loaded from: classes.dex */
public class c {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 5111116989851028860L)
    private Map<Class<?>, Object> DW;

    @dy(field = -79251020618016240L)
    public Object j6;

    static {
        iy.Zo(c.class);
    }

    @ey(method = -254326262491143765L)
    public c(Object obj) {
        try {
            if (FH) {
                iy.tp(1580482911114830853L, null, obj);
            }
            this.DW = new HashMap();
            this.j6 = obj;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 1580482911114830853L, null, obj);
            }
            throw th;
        }
    }

    @ey(method = -661936111904265360L)
    public void DW(h.b bVar, Object obj) {
        try {
            if (FH) {
                iy.EQ(464675855987012964L, this, bVar, obj);
            }
            if (obj == null) {
                return;
            }
            try {
                Object objNewInstance = this.j6;
                if (bVar.FH != null && (objNewInstance = this.DW.get(bVar.FH)) == null) {
                    objNewInstance = bVar.FH.getConstructor(Object.class).newInstance(this.j6);
                    this.DW.put(bVar.FH, objNewInstance);
                }
                if (!bVar.DW.endsWith("()")) {
                    objNewInstance.getClass().getField(bVar.DW).set(objNewInstance, obj);
                    return;
                }
                Class<?> cls = bVar.v5.WB;
                if (cls == Enum.class) {
                    cls = bVar.Zo;
                }
                objNewInstance.getClass().getMethod(bVar.DW.substring(0, bVar.DW.length() - 2), cls).invoke(objNewInstance, obj);
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 464675855987012964L, this, bVar, obj);
            }
            throw th;
        }
    }

    @ey(method = -1229411547730340947L)
    public boolean j6(h.b bVar) {
        try {
            if (FH) {
                iy.tp(-455720109614450317L, this, bVar);
            }
            if (bVar.j6 != null) {
                if (bVar.j6.isInstance(this.j6)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -455720109614450317L, this, bVar);
            }
            throw th;
        }
    }
}
