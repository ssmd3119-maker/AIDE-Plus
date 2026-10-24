package abcd;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class dr implements Comparable<dr> {
    private static final HashMap<String, dr> qp = new HashMap<>(500);
    private final String WB;
    private er fY;
    private final er jw;
    private final fr mb;

    private dr(String str, fr frVar, er erVar) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (frVar == null) {
            throw new NullPointerException("returnType == null");
        }
        if (erVar == null) {
            throw new NullPointerException("parameterTypes == null");
        }
        this.WB = str;
        this.mb = frVar;
        this.jw = erVar;
        this.fY = null;
    }

    private static fr[] J0(String str) {
        int length = str.length();
        int i = 0;
        if (str.charAt(0) != '(') {
            throw new IllegalArgumentException("bad descriptor");
        }
        int i2 = 1;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == ')') {
                i = i2;
                break;
            }
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                i3++;
            }
            i2++;
        }
        if (i == 0 || i == length - 1) {
            throw new IllegalArgumentException("bad descriptor");
        }
        if (str.indexOf(41, i + 1) == -1) {
            return new fr[i3];
        }
        throw new IllegalArgumentException("bad descriptor");
    }

    private static dr QX(dr drVar) {
        synchronized (qp) {
            String strDW = drVar.DW();
            dr drVar2 = qp.get(strDW);
            if (drVar2 != null) {
                return drVar2;
            }
            qp.put(strDW, drVar);
            return drVar;
        }
    }

    public static dr tp(String str, fr frVar, boolean z, boolean z2) {
        dr drVarU7 = u7(str);
        if (z) {
            return drVarU7;
        }
        if (z2) {
            frVar = frVar.DW(Integer.MAX_VALUE);
        }
        return drVarU7.XL(frVar);
    }

    public static dr u7(String str) {
        dr drVar;
        int i;
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        synchronized (qp) {
            drVar = qp.get(str);
        }
        if (drVar != null) {
            return drVar;
        }
        fr[] frVarArrJ0 = J0(str);
        int i2 = 1;
        int i3 = 0;
        while (true) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == ')') {
                fr frVarBT = fr.BT(str.substring(i2 + 1));
                er erVar = new er(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    erVar.Qq(i4, frVarArrJ0[i4]);
                }
                return QX(new dr(str, frVarBT, erVar));
            }
            int i5 = i2;
            while (cCharAt == '[') {
                i5++;
                cCharAt = str.charAt(i5);
            }
            if (cCharAt == 'L') {
                int iIndexOf = str.indexOf(59, i5);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("bad descriptor");
                }
                i = iIndexOf + 1;
            } else {
                i = i5 + 1;
            }
            frVarArrJ0[i3] = fr.a8(str.substring(i2, i));
            i3++;
            i2 = i;
        }
    }

    public static dr we(fr frVar, int i) {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append('(');
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append('I');
        }
        stringBuffer.append(')');
        stringBuffer.append(frVar.QX());
        return u7(stringBuffer.toString());
    }

    public String DW() {
        return this.WB;
    }

    public er FH() {
        if (this.fY == null) {
            int size = this.jw.size();
            er erVar = new er(size);
            boolean z = false;
            for (int i = 0; i < size; i++) {
                fr frVarSf = this.jw.Sf(i);
                if (frVarSf.sh()) {
                    frVarSf = fr.n5;
                    z = true;
                }
                erVar.Qq(i, frVarSf);
            }
            if (!z) {
                erVar = this.jw;
            }
            this.fY = erVar;
        }
        return this.fY;
    }

    public dr XL(fr frVar) {
        String str = "(" + frVar.QX() + this.WB.substring(1);
        er erVarAj = this.jw.aj(frVar);
        erVarAj.Mr();
        return QX(new dr(str, this.mb, erVarAj));
    }

    public fr Zo() {
        return this.mb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dr) {
            return this.WB.equals(((dr) obj).WB);
        }
        return false;
    }

    public int hashCode() {
        return this.WB.hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public int compareTo(dr drVar) {
        if (this == drVar) {
            return 0;
        }
        int iFH = this.mb.compareTo(drVar.mb);
        if (iFH != 0) {
            return iFH;
        }
        int size = this.jw.size();
        int size2 = drVar.jw.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iFH2 = this.jw.Sf(i).compareTo(drVar.jw.Sf(i));
            if (iFH2 != 0) {
                return iFH2;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }

    public String toString() {
        return this.WB;
    }

    public er v5() {
        return this.jw;
    }
}
