package com.aide.ui.util;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = -2158333802730359760L, container = -2158333802730359760L, user = true)
/* loaded from: classes.dex */
public class FileSpan {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = 2302916693867181183L)
    public int DW;

    @dy(field = 2035380178145183787L)
    public int FH;

    @dy(field = 1197842343867573072L)
    public int Hw;

    @dy(field = -2426682681737981380L)
    public String j6;

    @dy(field = -615065882621293740L)
    public int v5;

    static {
        iy.Zo(FileSpan.class);
    }

    @ey(method = 2623337334323367076L)
    public FileSpan(String str, int i, int i2, int i3, int i4) {
        try {
            if (Zo) {
                iy.J8(-415774639461878880L, null, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            this.j6 = str;
            this.DW = i;
            this.FH = i2;
            this.Hw = i3;
            this.v5 = i4;
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, -415774639461878880L, null, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -370486236475719312L)
    public boolean DW(FileSpan fileSpan) {
        try {
            if (Zo) {
                iy.tp(233253864155778200L, this, fileSpan);
            }
            if (fileSpan.j6.equals(this.j6)) {
                return Math.abs(fileSpan.DW - this.DW) < 20;
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 233253864155778200L, this, fileSpan);
            }
            throw th;
        }
    }

    @ey(method = 4546292157964376400L)
    public boolean FH() {
        try {
            if (Zo) {
                iy.gn(-1501909828150693592L, this);
            }
            return this.DW == this.Hw;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -1501909828150693592L, this);
            }
            throw th;
        }
    }

    @ey(method = -465391978751606104L)
    public boolean equals(Object obj) {
        try {
            if (Zo) {
                iy.tp(342990384739897176L, this, obj);
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            FileSpan fileSpan = (FileSpan) obj;
            if (this.v5 != fileSpan.v5 || this.Hw != fileSpan.Hw) {
                return false;
            }
            if (this.j6 == null) {
                if (fileSpan.j6 != null) {
                    return false;
                }
            } else if (!this.j6.equals(fileSpan.j6)) {
                return false;
            }
            if (this.FH != fileSpan.FH) {
                return false;
            }
            return this.DW == fileSpan.DW;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 342990384739897176L, this, obj);
            }
            throw th;
        }
    }

    @ey(method = 1402193000340210393L)
    public int hashCode() {
        try {
            if (Zo) {
                iy.gn(2093363941184924245L, this);
            }
            return ((((((((this.v5 + 31) * 31) + this.Hw) * 31) + (this.j6 == null ? 0 : this.j6.hashCode())) * 31) + this.FH) * 31) + this.DW;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 2093363941184924245L, this);
            }
            throw th;
        }
    }

    @ey(method = 1505431717371324927L)
    public boolean j6() {
        try {
            if (Zo) {
                iy.gn(371353706849630307L, this);
            }
            if (this.DW == this.Hw) {
                if (this.FH == this.v5) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 371353706849630307L, this);
            }
            throw th;
        }
    }

    @ey(method = 2248876296674594300L)
    public String toString() {
        try {
            if (Zo) {
                iy.gn(2910247968380441856L, this);
            }
            return this.j6 + " (" + this.DW + "," + this.FH + "-" + this.Hw + "," + this.v5 + ")";
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 2910247968380441856L, this);
            }
            throw th;
        }
    }
}
