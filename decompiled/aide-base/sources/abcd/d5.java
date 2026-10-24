package abcd;

import abcd.j5;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.Language;
import java.util.Iterator;

@cy(clazz = -4365158556378824136L, container = -4365158556378824136L, user = true)
/* loaded from: classes.dex */
public class d5 {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = -928510673096552481L)
    private final Model j6;

    static {
        iy.Zo(d5.class);
    }

    @ey(method = 869256735217669368L)
    public d5(Model model) {
        try {
            if (DW) {
                iy.tp(5253061026465996645L, null, model);
            }
            this.j6 = model;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 5253061026465996645L, null, model);
            }
            throw th;
        }
    }

    @ey(method = -1675381011459432672L)
    private String DW(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(-644609353930389648L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            String strMr = fileEntry.Mr(i, i2);
            int i3 = 0;
            while (i3 < strMr.length() && Character.isWhitespace(strMr.charAt(i3))) {
                i3++;
            }
            if (i3 == 0) {
                return null;
            }
            int i4 = i3;
            while (i4 < strMr.length() && strMr.charAt(i4) != ':') {
                if (!Character.isLetter(strMr.charAt(i4)) && strMr.charAt(i4) != '-') {
                    return null;
                }
                i4++;
            }
            return strMr.substring(i3, i4);
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, -644609353930389648L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 4612770106162750599L)
    private int FH(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(1644395399593756029L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            String strMr = fileEntry.Mr(i, i2);
            int length = strMr.length() - 1;
            while (length >= 0 && Character.isLetter(strMr.charAt(length)) && strMr.charAt(length) != '-') {
                length--;
            }
            int i3 = length + 2;
            while (length >= 0) {
                if (strMr.charAt(length) != '{' && strMr.charAt(length) != ';') {
                    if (!Character.isWhitespace(strMr.charAt(length))) {
                        return -1;
                    }
                    length--;
                }
            }
            return i3;
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, 1644395399593756029L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 2990287483136363388L)
    private int j6(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(1901101718368157040L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            String strMr = fileEntry.Mr(i, i2);
            int length = strMr.length() - 1;
            while (length > 0) {
                if (Character.isWhitespace(strMr.charAt(length)) || strMr.charAt(length) == ':') {
                    break;
                }
                length--;
            }
            if (length == 0) {
                return -1;
            }
            return length + 2;
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, 1901101718368157040L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 5677740383617833835L)
    public void Hw(SyntaxTree syntaxTree, FileEntry fileEntry, Language language, int i, int i2) {
        try {
            if (DW) {
                iy.J8(-5359159797540016935L, this, syntaxTree, fileEntry, language, new Integer(i), new Integer(i2));
            }
            int iFH = FH(fileEntry, i, i2);
            int i3 = 0;
            if (iFH > 0) {
                this.j6.codeCompleterCallback.j6();
                j5[] j5VarArr = k5.j6;
                int length = j5VarArr.length;
                while (i3 < length) {
                    j5 j5Var = j5VarArr[i3];
                    this.j6.codeCompleterCallback.DW(j5Var.j6 + ":");
                    i3++;
                }
                this.j6.codeCompleterCallback.J8(fileEntry, language, i, i2, iFH, false, false);
                return;
            }
            String strDW = DW(fileEntry, i, i2);
            if (strDW != null) {
                j5[] j5VarArr2 = k5.j6;
                int length2 = j5VarArr2.length;
                while (i3 < length2) {
                    j5 j5Var2 = j5VarArr2[i3];
                    if (j5Var2.j6.equals(strDW) && j5Var2.DW != null) {
                        this.j6.codeCompleterCallback.j6();
                        Iterator<j5.d> it = j5Var2.DW.j6.iterator();
                        while (it.hasNext()) {
                            for (j5.a aVar : it.next().j6) {
                                if (aVar.j6()) {
                                    this.j6.codeCompleterCallback.DW(aVar.j6);
                                }
                            }
                        }
                        this.j6.codeCompleterCallback.J8(fileEntry, language, i, i2, j6(fileEntry, i, i2), false, false);
                        return;
                    }
                    i3++;
                }
            }
            this.j6.codeCompleterCallback.a8(fileEntry, i, i2);
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, -5359159797540016935L, this, syntaxTree, fileEntry, language, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
