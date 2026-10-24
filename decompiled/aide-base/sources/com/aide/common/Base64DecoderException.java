package com.aide.common;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = -452902529819866245L, container = -452902529819866245L, user = true)
/* loaded from: classes.dex */
public class Base64DecoderException extends Exception {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(Base64DecoderException.class);
    }

    @ey(method = 978677077395639445L)
    public Base64DecoderException() {
        try {
            if (WB) {
                iy.gn(-7340059951189463736L, null);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, -7340059951189463736L, null);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -193118427991331593L)
    public Base64DecoderException(String str) {
        super(str);
        try {
            if (WB) {
                iy.tp(219178803514370240L, null, str);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, 219178803514370240L, null, str);
            }
            throw th;
        }
    }
}
