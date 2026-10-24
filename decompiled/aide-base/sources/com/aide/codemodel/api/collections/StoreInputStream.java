package com.aide.codemodel.api.collections;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

@cy(clazz = 99921225958286568L, container = 99921225958286568L, user = true)
/* loaded from: classes.dex */
public class StoreInputStream extends DataInputStream {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(StoreInputStream.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 36872344147934141L)
    public StoreInputStream(String str, Inflater inflater) {
        super(new BufferedInputStream(new InflaterInputStream(new FileInputStream(str), inflater)));
        try {
            if (WB) {
                iy.EQ(3257837242917337560L, null, str, inflater);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.Mr(th, 3257837242917337560L, null, str, inflater);
            }
            throw th;
        }
    }
}
