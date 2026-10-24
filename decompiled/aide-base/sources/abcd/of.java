package abcd;

import com.aide.ui.AIDEEditor;

@cy(clazz = 1246809773463033264L, container = 1246809773463033264L, user = true)
/* loaded from: classes.dex */
public class of {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(of.class);
    }

    @ey(method = 163390891878019075L)
    public of() {
        try {
            if (j6) {
                iy.gn(1847650909741426892L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1847650909741426892L, null);
            }
            throw th;
        }
    }

    @ey(method = -4024991360494725040L)
    public static boolean DW(AIDEEditor aIDEEditor, int i, int i2, int i3) {
        try {
            if (j6) {
                iy.J0(1235029394990727013L, null, aIDEEditor, new Integer(i), new Integer(i2), new Integer(i3));
            }
            int i4 = i;
            while (i4 > 1 && aIDEEditor.eU(i4).trim().length() == 0) {
                i4--;
            }
            int iIW = aIDEEditor.iW(i4);
            String strEU = aIDEEditor.eU(i4);
            int i5 = i + 1;
            String strEU2 = aIDEEditor.eU(i5);
            if (!strEU.endsWith("{")) {
                aIDEEditor.sE(i5, iIW);
            } else if (strEU2.startsWith("}")) {
                aIDEEditor.pO(i5, 1);
                aIDEEditor.Nh(i5, 1);
                aIDEEditor.sE(i5, iIW + i3);
                aIDEEditor.sE(i + 2, iIW);
            } else {
                aIDEEditor.sE(i5, iIW + i3);
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.a8(th, 1235029394990727013L, null, aIDEEditor, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 6993240848116240419L)
    public static boolean j6(AIDEEditor aIDEEditor, char c, int i, int i2) {
        try {
            if (j6) {
                iy.J0(2959221165330660072L, null, aIDEEditor, new Character(c), new Integer(i), new Integer(i2));
            }
            if (c != '{') {
                return true;
            }
            aIDEEditor.sg(i2, i, '}');
            aIDEEditor.Nh(i, i2);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.a8(th, 2959221165330660072L, null, aIDEEditor, new Character(c), new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
