package com.aide.uidesigner;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.util.Map;

@cy(clazz = -3736683392650432837L, container = -3736683392650432837L, user = true)
/* loaded from: classes.dex */
public class b {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 82906786564078691L)
    public Map<String, String> DW;

    @dy(field = 3671057327791958181L)
    public String j6;

    static {
        iy.Zo(b.class);
    }

    @ey(method = -6455502928453816060L)
    public b(String str, Map<String, String> map) {
        try {
            if (FH) {
                iy.EQ(-700862474932712448L, null, str, map);
            }
            this.j6 = str;
            this.DW = map;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -700862474932712448L, null, str, map);
            }
            throw th;
        }
    }
}
