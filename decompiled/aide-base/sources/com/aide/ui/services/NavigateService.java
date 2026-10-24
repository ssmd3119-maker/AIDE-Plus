package com.aide.ui.services;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.ui.util.FileSpan;
import com.aide.ui.util.FileSystem;
import java.util.Stack;

@cy(clazz = -2568124978831063665L, container = -2568124978831063665L, user = true)
/* loaded from: classes.dex */
public class NavigateService {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = 3534759705357691235L)
    private Stack<FileSpan> DW;

    @dy(field = -2325963860177649055L)
    private boolean FH;

    @dy(field = -1236040073591652185L)
    private Stack<FileSpan> j6;

    static {
        iy.Zo(NavigateService.class);
    }

    @ey(method = -3223920124234446161L)
    public NavigateService() {
        try {
            if (Hw) {
                iy.gn(4401915393407250160L, null);
            }
            this.j6 = new Stack<>();
            this.DW = new Stack<>();
            this.FH = true;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 4401915393407250160L, null);
            }
            throw th;
        }
    }

    @ey(method = 812235824490859288L)
    public boolean DW() {
        try {
            if (Hw) {
                iy.gn(-2611220453372752936L, this);
            }
            return this.j6.size() >= 2;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -2611220453372752936L, this);
            }
            throw th;
        }
    }

    @ey(method = -4856180909657779008L)
    public boolean FH() {
        try {
            if (Hw) {
                iy.gn(-3097916653371787260L, this);
            }
            return !this.DW.isEmpty();
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -3097916653371787260L, this);
            }
            throw th;
        }
    }

    @ey(method = 1100979830155358600L)
    public void Hw() {
        try {
            if (Hw) {
                iy.gn(1800355439682497736L, this);
            }
            this.j6.clear();
            this.DW.clear();
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 1800355439682497736L, this);
            }
            throw th;
        }
    }

    @ey(method = 1724569832312728344L)
    public void VH(FileSpan fileSpan) {
        try {
            if (Hw) {
                iy.tp(1231903758917089272L, this, fileSpan);
            }
            gn(fileSpan, false);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 1231903758917089272L, this, fileSpan);
            }
            throw th;
        }
    }

    @ey(method = 152984282874171503L)
    public boolean Zo() {
        try {
            if (Hw) {
                iy.gn(169832627728397583L, this);
            }
            return this.FH;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 169832627728397583L, this);
            }
            throw th;
        }
    }

    @ey(method = -1621333239241484187L)
    public void gn(FileSpan fileSpan, boolean z) {
        try {
            if (Hw) {
                iy.EQ(-671066657445355075L, this, fileSpan, new Boolean(z));
            }
            if (!this.FH || fileSpan.j6 == null) {
                return;
            }
            if (z || this.j6.empty() || !this.j6.peek().DW(fileSpan)) {
                this.DW.clear();
            } else {
                this.j6.pop();
            }
            this.j6.add(fileSpan);
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, -671066657445355075L, this, fileSpan, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 2205378577469573480L)
    public FileSpan j6() {
        try {
            if (Hw) {
                iy.gn(393906118658419184L, this);
            }
            while (this.j6.size() >= 2) {
                FileSpan fileSpanPop = this.j6.pop();
                FileSpan fileSpanPeek = this.j6.peek();
                if (FileSystem.exists(fileSpanPeek.j6)) {
                    this.DW.push(fileSpanPop);
                    return fileSpanPeek;
                }
            }
            return null;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 393906118658419184L, this);
            }
            throw th;
        }
    }

    @ey(method = 1797374370304190496L)
    public void u7(boolean z) {
        try {
            if (Hw) {
                iy.Ws(-59908897401973256L, this, z);
            }
            this.FH = z;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -59908897401973256L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 566814052308371040L)
    public FileSpan v5() {
        try {
            if (Hw) {
                iy.gn(157743917670144492L, this);
            }
            while (!this.DW.isEmpty()) {
                FileSpan fileSpanPop = this.DW.pop();
                if (FileSystem.exists(fileSpanPop.j6)) {
                    this.j6.add(fileSpanPop);
                    return fileSpanPop;
                }
            }
            return null;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 157743917670144492L, this);
            }
            throw th;
        }
    }
}
