package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = -2285477669383276535L, container = -2285477669383276535L, user = true)
/* loaded from: classes.dex */
public class x {

    @gy
    private static /* synthetic */ boolean Zo;

    @fy
    private static /* synthetic */ boolean v5;

    @dy(field = 314395962738914052L)
    public List<String> DW;

    @dy(field = 14914431107429715L)
    public List<String> FH;

    @dy(field = -1978763423212146431L)
    public List<String> Hw;

    @dy(field = 610538740938618093L)
    public List<Integer> j6;

    static {
        iy.Zo(x.class);
    }

    @ey(method = 2674256349157297756L)
    public x() {
        try {
            if (v5) {
                iy.gn(-1324306762173092480L, null);
            }
            this.j6 = new ArrayList();
            this.DW = new ArrayList();
            this.FH = new ArrayList();
            this.Hw = new ArrayList();
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -1324306762173092480L, null);
            }
            throw th;
        }
    }
}
