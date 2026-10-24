package com.aide.ui.views.editor;

import abcd.cy;
import abcd.ey;
import java.io.Reader;
import java.util.List;

@cy(clazz = 216267711132075273L, container = 216267711132075273L, user = true)
/* loaded from: classes.dex */
public interface Model {
    @ey(method = -135721602005490043L)
    int DW(int i, int i2);

    @ey(method = -3156462807512383229L)
    int EQ();

    @ey(method = 4310061402517253959L)
    int FH();

    @ey(method = 6197995897240537125L)
    int I(int i, int i2);

    @ey(method = 2848584211784183052L)
    boolean KD(int i);

    @ey(method = 1935421912027271115L)
    boolean Mz(int i);

    @ey(method = 196367166563864800L)
    SelectedRegion P8();

    @ey(method = -914074816536111096L)
    boolean QX(int i);

    @ey(method = 2797575190810282533L)
    boolean Sf(int i);

    @ey(method = 1028673763150915200L)
    boolean U2(int i, int i2);

    @ey(method = -3768337932321296056L)
    TextStyle Ws(int i);

    @ey(method = 361292223717153544L)
    void XL(m mVar);

    @ey(method = -862774844827619360L)
    boolean Zo(int i);

    @ey(method = -1596469953025491867L)
    boolean a8(int i, int i2);

    @ey(method = -546300199862808365L)
    void addModelListener(ModelListener modelListener);

    @ey(method = -1710116494413107512L)
    boolean aj(int i, int i2);

    @ey(method = -131245480924225920L)
    char charAtColumnLine(int i, int i2);

    @ey(method = 44597949154318217L)
    boolean dx(int i, int i2);

    @ey(method = 1407231314218907668L)
    boolean ef(int i, int i2);

    @ey(method = -1500996302574664200L)
    int er();

    @ey(method = -1203240482370662625L)
    int getColumnCount(int i);

    @ey(method = 1050568831496462157L)
    int getLineCount();

    @ey(method = 71384313293564040L)
    int getMaxColumnCount();

    @ey(method = -1465487962290498012L)
    SelectedRegion getSelectedRegion();

    @ey(method = -455789287216974511L)
    Reader getSelectedRegionReader(int i, int i2, int i3, int i4, boolean z);

    @ey(method = 2938660619240106279L)
    Reader getSelectedRegionReader(SelectedRegion selectedRegion, String str);

    @ey(method = 9504028710084724L)
    boolean gn(int i, int i2);

    @ey(method = 1916532312004736232L)
    boolean lp(int i, int i2);

    @ey(method = 404717947693376525L)
    boolean rN(int i);

    @ey(method = 807765558836696439L)
    void readLineText(int i, char[] cArr);

    @ey(method = 2148313929390841500L)
    void removeModelListener(ModelListener modelListener);

    @ey(method = -1553310280941300189L)
    void sh(m mVar);

    @ey(method = 7971612277417166796L)
    boolean sy(int i, int i2);

    @ey(method = -3761076386556354480L)
    boolean tp(int i);

    @ey(method = -992199299245928521L)
    boolean u7(int i);

    @ey(method = 2703860005601296692L)
    boolean v5(int i);

    @ey(method = -1389081600852224739L)
    List<SelectedRegion> x9();
}
