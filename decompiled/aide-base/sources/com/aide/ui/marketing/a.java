package com.aide.ui.marketing;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.text.TextUtils;
import com.aide.ui.R$drawable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = 3311268933990658443L, container = 3311268933990658443L, user = true)
/* loaded from: classes.dex */
public class a {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = -600600414488716911L)
    static C0072a[] j6;

    @cy(clazz = -571235218108168992L, container = -571235218108168992L, user = true)
    /* renamed from: com.aide.ui.marketing.a$a, reason: collision with other inner class name */
    public static class C0072a {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = 2851907800739178167L)
        public String DW;

        @dy(field = 230520860798998035L)
        public String FH;

        @dy(field = 2825031175972332768L)
        public String Hw;

        @dy(field = 225041442920007853L)
        public int j6;

        @dy(field = -4702108774911868332L)
        public String v5;

        static {
            iy.Zo(C0072a.class);
        }

        @ey(method = -6124647772317593440L)
        public C0072a(int i, String str, String str2, String str3, String str4) {
            try {
                if (Zo) {
                    iy.J8(-1710473834646418725L, null, new Integer(i), str, str2, str3, str4);
                }
                this.j6 = i;
                this.DW = str;
                this.FH = str2;
                this.Hw = str3;
                this.v5 = str4;
            } catch (Throwable th) {
                if (VH) {
                    iy.lg(th, -1710473834646418725L, null, new Integer(i), str, str2, str3, str4);
                }
                throw th;
            }
        }

        @ey(method = 519395161803543376L)
        private List<String> FH(Context context, String str) {
            try {
                if (Zo) {
                    iy.EQ(283828885939543860L, this, context, str);
                }
                ArrayList arrayList = new ArrayList();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        arrayList.add(line);
                    }
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return arrayList;
            } catch (Throwable th) {
                if (VH) {
                    iy.Mr(th, 283828885939543860L, this, context, str);
                }
                throw th;
            }
        }

        @ey(method = -329338034476166100L)
        public String DW(Context context) {
            try {
                if (Zo) {
                    iy.tp(-4614159413425814080L, this, context);
                }
                return TextUtils.join("\n", j6(context));
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, -4614159413425814080L, this, context);
                }
                throw th;
            }
        }

        @ey(method = 2977492742201619576L)
        public List<String> j6(Context context) {
            try {
                if (Zo) {
                    iy.tp(-2020798977753780744L, this, context);
                }
                return FH(context, this.v5);
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, -2020798977753780744L, this, context);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(a.class);
            if (DW) {
                iy.gn(-1688411636032686611L, null);
            }
            j6 = new C0072a[]{new C0072a(2131165304, "com.aide.ui", "AIDE - Android IDE for Java/C++", "Develop programs and apps directly on your Android devices", "whatsnew/aide-whatsnew.txt"), new C0072a(R$drawable.ic_launcher_web, "com.aide.web", "AIDE Web - Html, Css, JavaScript", "Develop websites directly on your Android devices", "whatsnew/aide-web-whatsnew.txt"), new C0072a(R$drawable.ic_launcher_phonegap, "com.aide.phonegap", "AIDE for Phonegap", "Develop Phonegap apps with Html & JavaScript directly on your Android devices", "whatsnew/aide-phonegap-whatsnew.txt")};
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -1688411636032686611L, null);
            }
            throw th;
        }
    }

    @ey(method = -2483811050089703488L)
    public a() {
        try {
            if (DW) {
                iy.gn(-3368114069205758400L, null);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -3368114069205758400L, null);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    @ey(method = 3496920477387478763L)
    public static String j6(Context context) {
        try {
            if (DW) {
                iy.tp(-2240285139720945328L, null, context);
            }
            for (C0072a c0072a : j6) {
                if (c0072a.DW.equals(context.getPackageName())) {
                    context = c0072a.DW(context);
                    return context;
                }
            }
            return "";
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -2240285139720945328L, null, context);
            }
            throw th;
        }
    }
}
