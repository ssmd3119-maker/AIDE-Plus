package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = 6492191410948779948L, container = 6492191410948779948L, user = true)
/* loaded from: classes.dex */
public class Color {

    @dy(field = -537349335314485064L)
    public static final Color BLACK;

    @dy(field = -184314533036078367L)
    public static final Color BLUE;

    @dy(field = 919673260545776688L)
    public static final Color LIGHT_GRAY;

    @dy(field = 612070294275368832L)
    public static final Color RED;

    @dy(field = -3600810032043555089L)
    public static final Color TRANSPARENT;

    @dy(field = 254355189973469440L)
    public static final Color WHITE;

    @fy
    private static /* synthetic */ boolean gn;

    @gy
    private static /* synthetic */ boolean u7;

    @dy(field = -185066425551304953L)
    private int color;

    static {
        try {
            iy.Zo(Color.class);
            if (gn) {
                iy.gn(-3098658488094903240L, null);
            }
            new Color(-256);
            RED = new Color(-65536);
            new Color(-16711936);
            new Color(-256);
            BLUE = new Color(-16776961);
            BLACK = new Color(-16777216);
            LIGHT_GRAY = new Color(-5592406);
            WHITE = new Color(-1);
            TRANSPARENT = new Color(0);
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -3098658488094903240L, null);
            }
            throw th;
        }
    }

    @ey(method = -8043097216328309511L)
    public Color(int i) {
        try {
            if (gn) {
                iy.u7(-303326007008433040L, null, i);
            }
            this.color = i;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -303326007008433040L, null, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1926665356987114800L)
    public int DW() {
        try {
            if (gn) {
                iy.gn(441344079061245872L, this);
            }
            return android.graphics.Color.blue(this.color);
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 441344079061245872L, this);
            }
            throw th;
        }
    }

    @ey(method = -798994261621720549L)
    public int FH() {
        try {
            if (gn) {
                iy.gn(1082312235448296885L, this);
            }
            return android.graphics.Color.green(this.color);
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1082312235448296885L, this);
            }
            throw th;
        }
    }

    @ey(method = 660208542464966607L)
    public int Hw() {
        try {
            if (gn) {
                iy.gn(-1136188183739628115L, this);
            }
            return android.graphics.Color.red(this.color);
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -1136188183739628115L, this);
            }
            throw th;
        }
    }

    @ey(method = -319192699793507200L)
    public boolean equals(Object obj) {
        try {
            if (gn) {
                iy.tp(-220527811300145816L, this, obj);
            }
            if (obj instanceof Color) {
                if (((Color) obj).color == this.color) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -220527811300145816L, this, obj);
            }
            throw th;
        }
    }

    @ey(method = 1907145539930966636L)
    public int j6() {
        try {
            if (gn) {
                iy.gn(434725182517891456L, this);
            }
            return this.color;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 434725182517891456L, this);
            }
            throw th;
        }
    }

    @ey(method = 1069118389452029379L)
    public Color(int i, int i2, int i3) {
        try {
            if (gn) {
                iy.we(362859759547748232L, null, new Integer(i), new Integer(i2), new Integer(i3));
            }
            this.color = android.graphics.Color.rgb(i, i2, i3);
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, 362859759547748232L, null, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }
}
