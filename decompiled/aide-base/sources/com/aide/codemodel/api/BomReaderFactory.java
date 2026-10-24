package com.aide.codemodel.api;

import abcd.cy;
import abcd.ey;
import java.io.InputStream;
import java.io.Reader;

@cy(clazz = 806579827203057459L, container = 806579827203057459L, user = true)
/* loaded from: classes.dex */
public interface BomReaderFactory {
    @ey(method = 6558629103729138921L)
    Reader createBomReader(InputStream inputStream, String str);
}
