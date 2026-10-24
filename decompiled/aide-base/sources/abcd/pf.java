package abcd;

import com.aide.ui.AIDEEditor;

@cy(clazz = 2223797919646845897L, container = 2223797919646845897L, user = true)
/* loaded from: classes.dex */
public class pf {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(pf.class);
    }

    @ey(method = -639804259895701536L)
    public pf() {
        try {
            if (j6) {
                iy.gn(-3077007598943625321L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3077007598943625321L, null);
            }
            throw th;
        }
    }

    @ey(method = -5278871664235152777L)
    public static boolean DW(AIDEEditor aIDEEditor, int i, int i2, int i3) {
        try {
            if (j6) {
                iy.J0(3607920665560450591L, null, aIDEEditor, new Integer(i), new Integer(i2), new Integer(i3));
            }
            int i4 = i;
            while (i4 > 1 && (aIDEEditor.eU(i4).trim().length() == 0 || aIDEEditor.eU(i4).startsWith("//"))) {
                i4--;
            }
            int iIW = aIDEEditor.iW(i4);
            String strEU = aIDEEditor.eU(i4);
            int i5 = i + 1;
            String strEU2 = aIDEEditor.eU(i5);
            if (strEU.endsWith("{")) {
                if (strEU2.startsWith("}")) {
                    aIDEEditor.pO(i5, 1);
                    aIDEEditor.Nh(i5, 1);
                    aIDEEditor.sE(i5, iIW + i3);
                    aIDEEditor.sE(i + 2, iIW);
                } else {
                    aIDEEditor.sE(i5, iIW + i3);
                }
            } else if (FH(strEU.trim())) {
                aIDEEditor.sE(i5, iIW + i3);
            } else {
                aIDEEditor.sE(i5, iIW);
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.a8(th, 3607920665560450591L, null, aIDEEditor, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -2293980196192957305L)
    private static boolean FH(String str) {
        try {
            if (j6) {
                iy.tp(3787566987648206415L, null, str);
            }
            if (str.startsWith("if") && str.endsWith(")")) {
                return true;
            }
            if (str.startsWith("else if") && str.endsWith(")")) {
                return true;
            }
            if ((str.startsWith("while") && str.endsWith(")")) || str.equals("else")) {
                return true;
            }
            if (str.startsWith("case")) {
                return str.endsWith(":");
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3787566987648206415L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -2828616926833038396L)
    public static boolean j6(AIDEEditor aIDEEditor, char c, int i, int i2) {
        try {
            if (j6) {
                iy.J0(3709592434438573012L, null, aIDEEditor, new Character(c), new Integer(i), new Integer(i2));
            }
            if (c == '{') {
                aIDEEditor.sg(i2, i, '}');
                aIDEEditor.Nh(i, i2);
                String strEU = aIDEEditor.eU(i);
                if (i2 > 1 && strEU.length() >= i2 && strEU.substring(0, i2 - 2).trim().length() == 0) {
                    if (FH((i > 1 ? aIDEEditor.eU(i - 1) : "").trim())) {
                        aIDEEditor.sE(i, aIDEEditor.iW(i - 1));
                    }
                }
            } else if (c == '}') {
                String strEU2 = aIDEEditor.eU(i);
                if (strEU2.length() >= i2 && strEU2.charAt(i2 - 1) == '}') {
                    aIDEEditor.IS(i2, i);
                }
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.a8(th, 3709592434438573012L, null, aIDEEditor, new Character(c), new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
