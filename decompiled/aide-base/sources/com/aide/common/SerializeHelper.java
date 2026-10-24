package com.aide.common;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@cy(clazz = 4303922799090801297L, container = 4303922799090801297L, user = true)
/* loaded from: classes.dex */
public class SerializeHelper {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(SerializeHelper.class);
    }

    @ey(method = -2458394216288344747L)
    public SerializeHelper() {
        try {
            if (j6) {
                iy.gn(4528397624089618344L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4528397624089618344L, null);
            }
            throw th;
        }
    }

    @ey(method = 1055919242513990296L)
    public static String DW(Object obj) {
        try {
            if (j6) {
                iy.tp(1114976387404153443L, null, obj);
            }
            if (obj == null) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(obj);
                objectOutputStream.close();
                return new String(Base64Coder.Hw(byteArrayOutputStream.toByteArray()));
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1114976387404153443L, null, obj);
            }
            throw th;
        }
    }

    @ey(method = 48484983265036353L)
    public static Object j6(String str, Object obj) {
        try {
            if (j6) {
                iy.EQ(-3466118415688901700L, null, str, obj);
            }
            if (str != null) {
                try {
                    Object object = new ObjectInputStream(new ByteArrayInputStream(Base64Coder.j6(str))).readObject();
                    if (object != null) {
                        return object;
                    }
                } catch (Exception unused) {
                }
            }
            return obj;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -3466118415688901700L, null, str, obj);
            }
            throw th;
        }
    }
}
