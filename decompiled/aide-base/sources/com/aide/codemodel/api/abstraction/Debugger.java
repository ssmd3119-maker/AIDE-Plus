package com.aide.codemodel.api.abstraction;

import abcd.cy;
import abcd.ey;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Member;

@cy(clazz = -2424976853528120731L, container = -2424976853528120731L, user = true)
/* loaded from: classes.dex */
public interface Debugger {
    @ey(method = 4683018159451969713L)
    String DW(Entity entity);

    @ey(method = -7696890149348574075L)
    Member FH(String str, String str2, String str3);

    @ey(method = 1853407744678538215L)
    String Hw(Entity entity);

    @ey(method = 245081488773292620L)
    void VH(FileEntry fileEntry, int i, int i2, String str);

    @ey(method = -3959882016732552768L)
    Member Zo(FileEntry fileEntry, int i, int i2);

    @ey(method = 597764535281638021L)
    String gn(Entity entity);

    @ey(method = 4133535068230188471L)
    String j6(Entity entity);

    @ey(method = 3123403493706912584L)
    ClassType u7(String str);

    @ey(method = -1349377692884299932L)
    String v5(ClassType classType);
}
