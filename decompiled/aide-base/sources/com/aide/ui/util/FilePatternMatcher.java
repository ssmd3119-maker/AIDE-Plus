package com.aide.ui.util;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = 6961425216133458609L, container = 6961425216133458609L, user = true)
/* loaded from: classes.dex */
public abstract class FilePatternMatcher {

    @dy(field = -3872150778830458320L)
    private static FilePatternMatcher DW;

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -822963041728163184L)
    private static Object j6;

    @cy(clazz = -362198004114028544L, container = 6961425216133458609L, user = true)
    static class a extends FilePatternMatcher {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -1789714355229460531L)
        public a() {
        }

        @Override // com.aide.ui.util.FilePatternMatcher
        @ey(method = -665451922478599980L)
        public boolean DW(String str, String str2) {
            try {
                if (v5) {
                    iy.EQ(2838271493419175280L, this, str, str2);
                }
                return str.toLowerCase().endsWith(str2.substring(1, str2.length()).toLowerCase());
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, 2838271493419175280L, this, str, str2);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(FilePatternMatcher.class);
            if (FH) {
                iy.gn(-1279487899409338355L, null);
            }
            j6 = new Object();
            DW = new a();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1279487899409338355L, null);
            }
            throw th;
        }
    }

    @ey(method = -2331770096599415400L)
    public FilePatternMatcher() {
        try {
            if (FH) {
                iy.gn(-3252117149220783907L, null);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -3252117149220783907L, null);
            }
            throw th;
        }
    }

    @ey(method = -317326605956674523L)
    public static FilePatternMatcher j6() {
        FilePatternMatcher filePatternMatcher;
        try {
            if (FH) {
                iy.gn(3836405997313653904L, null);
            }
            synchronized (j6) {
                filePatternMatcher = DW;
            }
            return filePatternMatcher;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 3836405997313653904L, null);
            }
            throw th;
        }
    }

    @ey(method = -23719748988999687L)
    public abstract boolean DW(String str, String str2);
}
