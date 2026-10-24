package com.aide.uidesigner;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.uidesigner.h;
import org.w3c.dom.Attr;

@cy(clazz = 7296360088338597184L, container = 7296360088338597184L, user = true)
/* loaded from: classes.dex */
public class a {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = 1918295361551991324L)
    public final String DW;

    @dy(field = -1064840813182964792L)
    public final Attr FH;

    @dy(field = 1950868755682319100L)
    public final h.b j6;

    static {
        iy.Zo(a.class);
    }

    @ey(method = 262908806238190000L)
    public a(h.b bVar, String str) {
        try {
            if (Hw) {
                iy.EQ(1631066828046610500L, null, bVar, str);
            }
            this.j6 = bVar;
            this.DW = str;
            this.FH = null;
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 1631066828046610500L, null, bVar, str);
            }
            throw th;
        }
    }

    @ey(method = -445229524260412389L)
    public static String DW(String str) {
        try {
            if (Hw) {
                iy.tp(1412860264224354480L, null, str);
            }
            if (str == null || str.length() == 0) {
                return str;
            }
            if (str.startsWith("@id/")) {
                return str.substring(4);
            }
            if (str.startsWith("?android:attr/")) {
                str = "Android_" + str.substring(14);
            }
            if (!Character.isLetter(str.charAt(0))) {
                return str;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(Character.toUpperCase(str.charAt(0)));
            boolean z = false;
            for (int i = 1; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (z) {
                    stringBuffer.append(Character.toUpperCase(cCharAt));
                    z = false;
                } else {
                    if (cCharAt == '|') {
                        stringBuffer.append(" | ");
                    } else if (cCharAt == '_') {
                        stringBuffer.append(" ");
                    } else {
                        if (Character.isUpperCase(cCharAt)) {
                            stringBuffer.append(" ");
                        }
                        stringBuffer.append(cCharAt);
                    }
                    z = true;
                }
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 1412860264224354480L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 3899396453581699087L)
    public boolean FH() {
        try {
            if (Hw) {
                iy.gn(1699758629083535104L, this);
            }
            return this.DW != null;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 1699758629083535104L, this);
            }
            throw th;
        }
    }

    @ey(method = -201813252004385535L)
    public boolean Hw() {
        try {
            if (Hw) {
                iy.gn(-1985406047841978912L, this);
            }
            if (FH()) {
                if (this.FH == null) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -1985406047841978912L, this);
            }
            throw th;
        }
    }

    @ey(method = -4950907003762202835L)
    public String j6() {
        try {
            if (Hw) {
                iy.gn(-3502074034501532564L, this);
            }
            if (this.j6.v5 != h.c.Text) {
                return DW(this.DW);
            }
            return "&quot;" + this.DW + "&quot;";
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -3502074034501532564L, this);
            }
            throw th;
        }
    }

    @ey(method = -8924076728275764888L)
    public a(h.b bVar, Attr attr) {
        try {
            if (Hw) {
                iy.EQ(-3859582566492410328L, null, bVar, attr);
            }
            this.j6 = bVar;
            this.DW = attr.getValue();
            this.FH = attr;
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, -3859582566492410328L, null, bVar, attr);
            }
            throw th;
        }
    }

    @ey(method = 112626888330447816L)
    public a(h.b bVar) {
        try {
            if (Hw) {
                iy.tp(-540219804234580872L, null, bVar);
            }
            this.j6 = bVar;
            this.DW = null;
            this.FH = null;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -540219804234580872L, null, bVar);
            }
            throw th;
        }
    }
}
