package com.aide.codemodel.api.callback;

import abcd.cy;
import abcd.ey;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.abstraction.Language;

@cy(clazz = 7102942998393492971L, container = 7102942998393492971L, user = true)
/* loaded from: classes.dex */
public interface StructureCallback {
    @ey(method = 667289445363797299L)
    void DW(String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    @ey(method = 5575204147343468700L)
    void FH(FileEntry fileEntry, int i);

    @ey(method = -5885477382568524580L)
    void Hw(Entity entity, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    @ey(method = -2382714879290673375L)
    void Zo();

    @ey(method = -3764508819064035280L)
    void j6(Language language, int i);

    @ey(method = -1511182150555616049L)
    void v5(Entity entity, int i, int i2, int i3, int i4, int i5, int i6, int i7);
}
