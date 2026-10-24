package com.aide.ui.util;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.common.AppLog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cy(clazz = -1429123027277193984L, container = -1429123027277193984L, user = true)
/* loaded from: classes.dex */
public class AndroidProprieties extends Configuration<AndroidProprieties> {

    @fy
    private static /* synthetic */ boolean gn;

    @gy
    private static /* synthetic */ boolean u7;

    @dy(field = -2699431963383238656L)
    public List<a> VH;

    @dy(field = -5712552001033153776L)
    public List<a> Zo;

    @cy(clazz = -227906591033410528L, container = -227906591033410528L, user = true)
    public static class a {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -1785712147934139619L)
        public String j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -29614328591457792L)
        public a(String str, boolean z) {
            try {
                if (DW) {
                    iy.EQ(943014598225816909L, null, str, new Boolean(z));
                }
                this.j6 = str;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 943014598225816909L, null, str, new Boolean(z));
                }
                throw th;
            }
        }

        @ey(method = -2003544810036953160L)
        public String j6(String str) {
            try {
                if (DW) {
                    iy.tp(1372488752088498287L, this, str);
                }
                return FileSystem.Qq(str, this.j6);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 1372488752088498287L, this, str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(AndroidProprieties.class);
    }

    @ey(method = -3242933019518288184L)
    public AndroidProprieties() {
        try {
            if (gn) {
                iy.gn(1488114728130320885L, null);
            }
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1488114728130320885L, null);
            }
            throw th;
        }
    }

    @ey(method = 4076382967346108352L)
    public static void FH(String str, String str2, String str3) {
        try {
            if (gn) {
                iy.we(-5033234782933349508L, null, str, str2, str3);
            }
            try {
                FileWriter fileWriter = new FileWriter(str, true);
                fileWriter.write("\n");
                fileWriter.write("android.library.reference.1=" + FileSystem.lp(str2, str3));
                fileWriter.close();
            } catch (IOException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, -5033234782933349508L, null, str, str2, str3);
            }
            throw th;
        }
    }

    @ey(method = 3192325596386047563L)
    private static a Hw(String str) {
        int iLastIndexOf;
        try {
            if (gn) {
                iy.tp(2518063615306500499L, null, str);
            }
            if (!str.startsWith("android.library.reference.") || (iLastIndexOf = str.lastIndexOf(61)) <= 0) {
                return null;
            }
            return new a(str.substring(iLastIndexOf + 1, str.length()).trim(), true);
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 2518063615306500499L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -2215449508312162979L)
    public static void Zo(String str, String str2, String str3) {
        try {
            if (gn) {
                iy.we(-624777007127457831L, null, str, str2, str3);
            }
            try {
                ArrayList arrayList = new ArrayList();
                BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    a aVarHw = Hw(line);
                    if (aVarHw == null || !str3.equals(aVarHw.j6(str2))) {
                        arrayList.add(line);
                    }
                }
                bufferedReader.close();
                FileWriter fileWriter = new FileWriter(str);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fileWriter.write((String) it.next());
                    fileWriter.write("\n");
                }
                fileWriter.close();
            } catch (IOException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, -624777007127457831L, null, str, str2, str3);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.util.Configuration
    @ey(method = -10956983871786075L)
    /* renamed from: v5, reason: merged with bridge method [inline-methods] */
    public AndroidProprieties makeConfiguration(String str) {
        try {
            if (gn) {
                iy.tp(-7340751420185307663L, this, str);
            }
            return new AndroidProprieties(str);
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -7340751420185307663L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -384483565642003344L)
    private AndroidProprieties(String str) {
        String strSubstring;
        try {
            if (gn) {
                iy.tp(3246948332928941223L, null, str);
            }
            this.Zo = new ArrayList();
            this.VH = new ArrayList();
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        a aVarHw = Hw(line);
                        if (aVarHw != null) {
                            this.Zo.add(aVarHw);
                        } else if (line.startsWith("source.dir=")) {
                            for (String str2 : line.substring(11).trim().split(";")) {
                                this.VH.add(new a(str2, false));
                            }
                        } else if (line.startsWith("target=")) {
                            String strTrim = line.substring(7).trim();
                            if (strTrim.startsWith("Google Inc.:Google APIs:")) {
                                strSubstring = strTrim.substring(24);
                            } else {
                                strSubstring = strTrim.startsWith("android-") ? strTrim.substring(8) : null;
                            }
                            if (strSubstring != null) {
                                try {
                                    Integer.parseInt(strSubstring);
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    } else {
                        bufferedReader.close();
                        return;
                    }
                }
            } catch (IOException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 3246948332928941223L, null, str);
            }
            throw th;
        }
    }
}
