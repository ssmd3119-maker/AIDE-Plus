package abcd;

import com.aide.ui.AIDEEditor;

@cy(clazz = -4017425034701772000L, container = -4017425034701772000L, user = true)
/* loaded from: classes.dex */
public class qf {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(qf.class);
    }

    @ey(method = 2589208813969029945L)
    public qf() {
        try {
            if (j6) {
                iy.gn(-4961938369225738495L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4961938369225738495L, null);
            }
            throw th;
        }
    }

    @ey(method = 4846910023700514592L)
    public static boolean DW(AIDEEditor aIDEEditor, int i, int i2, int i3) {
        try {
            if (j6) {
                iy.J0(612751912263510320L, null, aIDEEditor, new Integer(i), new Integer(i2), new Integer(i3));
            }
            int i4 = i;
            while (i4 > 1 && aIDEEditor.eU(i4).trim().length() == 0) {
                i4--;
            }
            int iIW = aIDEEditor.iW(i4);
            String strEU = aIDEEditor.eU(i);
            String strEU2 = aIDEEditor.eU(i4);
            int i5 = i + 1;
            String strEU3 = aIDEEditor.eU(i5);
            if (strEU.endsWith(">") && strEU3.startsWith("</")) {
                aIDEEditor.pO(i5, 1);
                aIDEEditor.Nh(i5, 1);
                aIDEEditor.sE(i5, iIW + i3);
                aIDEEditor.sE(i + 2, iIW);
            } else {
                String strTrim = strEU2.trim();
                if (strTrim.startsWith("<") && !strTrim.startsWith("</")) {
                    int i6 = 0;
                    for (int i7 = 0; i7 < strTrim.length(); i7++) {
                        if (strTrim.charAt(i7) == '>') {
                            i6++;
                        }
                    }
                    if (i6 <= 1) {
                        aIDEEditor.sE(i5, iIW + i3);
                    } else {
                        aIDEEditor.sE(i5, iIW);
                    }
                } else if (!strTrim.endsWith("/>") || strTrim.contains("<")) {
                    aIDEEditor.sE(i5, iIW);
                } else {
                    aIDEEditor.sE(i5, Math.max(0, iIW - i3));
                }
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.a8(th, 612751912263510320L, null, aIDEEditor, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -5387550354125239883L)
    public static boolean j6(AIDEEditor aIDEEditor, char c, int i, int i2) {
        try {
            if (j6) {
                iy.J0(-3378796766957865981L, null, aIDEEditor, new Character(c), new Integer(i), new Integer(i2));
            }
            if (c == '/') {
                return !aIDEEditor.eU(i).substring(0, i2 + (-2)).endsWith("<");
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.a8(th, -3378796766957865981L, null, aIDEEditor, new Character(c), new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
