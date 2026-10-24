package com.aide.codemodel.api.collections;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

@cy(clazz = 717918435269879089L, container = 717918435269879089L, user = true)
/* loaded from: classes.dex */
public class StoreOutputStream extends DataOutputStream {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(StoreOutputStream.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 2375209438719163871L)
    public StoreOutputStream(String str, Deflater deflater) {
        super(new BufferedOutputStream(new DeflaterOutputStream(new FileOutputStream(str), deflater)));
        try {
            if (WB) {
                iy.EQ(134178129447885271L, null, str, deflater);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.Mr(th, 134178129447885271L, null, str, deflater);
            }
            throw th;
        }
    }
}
