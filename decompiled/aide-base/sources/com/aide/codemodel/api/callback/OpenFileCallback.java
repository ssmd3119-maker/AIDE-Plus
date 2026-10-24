package com.aide.codemodel.api.callback;

import abcd.cy;
import abcd.ey;
import com.aide.codemodel.api.FileEntry;
import java.io.Reader;

@cy(clazz = 3179953925574030640L, container = 3179953925574030640L, user = true)
/* loaded from: classes.dex */
public interface OpenFileCallback {
    @ey(method = -2334384091227670896L)
    long DW(FileEntry fileEntry);

    @ey(method = -4698040321918983879L)
    long getOpenFileSize(FileEntry fileEntry);

    @ey(method = -121572386398956064L)
    boolean isOpenFile(FileEntry fileEntry);

    @ey(method = 4754447203351313251L)
    Reader j6(FileEntry fileEntry);

    @ey(method = 2538150563203844568L)
    void v5();
}
