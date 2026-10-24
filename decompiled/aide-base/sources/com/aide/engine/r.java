package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.util.Iterator;
import java.util.List;

@cy(clazz = -3077738511138984000L, container = -3077738511138984000L, user = true)
/* loaded from: classes.dex */
public class r implements l {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = -2981413012288138571L)
    private final String DW;

    @dy(field = -2255612768569473520L)
    private final String FH;

    @dy(field = 138260020958461672L)
    private final List<l> Hw;

    @dy(field = -1520873204300764084L)
    private final boolean j6;

    @dy(field = 2059369227098108529L)
    private final l v5;

    static {
        iy.Zo(r.class);
    }

    @ey(method = -3604955466744151401L)
    public r(boolean z, String str, String str2, String str3, List<l> list, l lVar) {
        try {
            if (Zo) {
                iy.QX(-2480695073251961676L, null, new Object[]{new Boolean(z), str, str2, str3, list, lVar});
            }
            this.j6 = z;
            this.DW = str;
            this.FH = str2;
            this.Hw = list;
            this.v5 = lVar;
        } catch (Throwable th) {
            if (VH) {
                iy.rN(th, -2480695073251961676L, null, new Object[]{new Boolean(z), str, str2, str3, list, lVar});
            }
            throw th;
        }
    }

    @ey(method = -2457996853094374041L)
    public String toString() {
        String str;
        try {
            if (Zo) {
                iy.gn(-243976993083577568L, this);
            }
            StringBuilder sb = new StringBuilder();
            if (this.j6) {
                str = "";
            } else {
                str = this.v5 + ".";
            }
            sb.append(str);
            sb.append("(");
            sb.append(this.DW);
            sb.append(").");
            sb.append(this.FH);
            sb.append("(");
            String string = sb.toString();
            Iterator<l> it = this.Hw.iterator();
            while (it.hasNext()) {
                string = string + it.next() + ",";
            }
            return string + ")";
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -243976993083577568L, this);
            }
            throw th;
        }
    }
}
