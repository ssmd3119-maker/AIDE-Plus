package abcd;

import com.probelytics.api.UserTouchAction;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class fr implements gr, Comparable<fr> {
    public static final fr AE;
    public static final fr An;
    public static final fr BR;
    public static final fr Cz;
    public static final fr Gj;
    public static final fr IS;
    public static final fr Nh;
    public static final fr Pa;
    public static final fr QO;
    public static final fr Za;
    public static final fr a5;
    public static final fr aX;
    public static final fr ce;
    public static final fr e3;
    public static final fr e9;
    public static final fr fN;
    public static final fr gG;
    public static final fr oy;
    public static final fr pN;
    public static final fr pO;
    public static final fr sE;
    public static final fr sM;
    public static final fr sg;
    public static final fr ys;
    private final String WB;
    private String fY;
    private final int jw;
    private fr k2;
    private final int mb;
    private fr qp;
    private fr zh;
    private static final HashMap<String, fr> AL = new HashMap<>(500);
    public static final fr w9 = new fr("Z", 1);
    public static final fr hK = new fr("B", 2);
    public static final fr cT = new fr("C", 3);
    public static final fr q7 = new fr("D", 4);
    public static final fr Z1 = new fr("F", 5);
    public static final fr n5 = new fr("I", 6);
    public static final fr Q6 = new fr("J", 7);
    public static final fr kf = new fr("S", 8);
    public static final fr Jl = new fr("V", 0);
    public static final fr iW = new fr("<null>", 9);
    public static final fr eU = new fr("<addr>", 10);

    static {
        ef(w9);
        ef(hK);
        ef(cT);
        ef(q7);
        ef(Z1);
        ef(n5);
        ef(Q6);
        ef(kf);
        a8("Ljava/lang/annotation/Annotation;");
        e3 = a8("Ljava/lang/Class;");
        sE = a8("Ljava/lang/Cloneable;");
        sg = a8("Ljava/lang/Object;");
        pO = a8("Ljava/io/Serializable;");
        fN = a8("Ljava/lang/String;");
        Gj = a8("Ljava/lang/Throwable;");
        Cz = a8("Ljava/lang/Boolean;");
        pN = a8("Ljava/lang/Byte;");
        oy = a8("Ljava/lang/Character;");
        aX = a8("Ljava/lang/Double;");
        e9 = a8("Ljava/lang/Float;");
        QO = a8("Ljava/lang/Integer;");
        sM = a8("Ljava/lang/Long;");
        a5 = a8("Ljava/lang/Short;");
        ys = a8("Ljava/lang/Void;");
        IS = w9.v5();
        gG = hK.v5();
        Nh = cT.v5();
        BR = q7.v5();
        AE = Z1.v5();
        Za = n5.v5();
        An = Q6.v5();
        Pa = sg.v5();
        ce = kf.v5();
    }

    private fr(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (i < 0 || i >= 11) {
            throw new IllegalArgumentException("bad basicType");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("newAt < -1");
        }
        this.WB = str;
        this.mb = i;
        this.jw = i2;
        this.qp = null;
        this.k2 = null;
        this.zh = null;
    }

    public static fr BT(String str) {
        try {
            return str.equals("V") ? Jl : a8(str);
        } catch (NullPointerException unused) {
            throw new NullPointerException("descriptor == null");
        }
    }

    public static fr a8(String str) {
        fr frVar;
        synchronized (AL) {
            frVar = AL.get(str);
        }
        if (frVar != null) {
            return frVar;
        }
        try {
            char cCharAt = str.charAt(0);
            if (cCharAt == '[') {
                return a8(str.substring(1)).v5();
            }
            int length = str.length();
            if (cCharAt == 'L') {
                int i = length - 1;
                if (str.charAt(i) == ';') {
                    for (int i2 = 1; i2 < i; i2++) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 != '(' && cCharAt2 != ')' && cCharAt2 != '.') {
                            if (cCharAt2 == '/') {
                                if (i2 == 1 || i2 == i || str.charAt(i2 - 1) == '/') {
                                    throw new IllegalArgumentException("bad descriptor: " + str);
                                }
                            } else if (cCharAt2 == ';' || cCharAt2 == '[') {
                            }
                        }
                        throw new IllegalArgumentException("bad descriptor: " + str);
                    }
                    return ef(new fr(str, 9));
                }
            }
            throw new IllegalArgumentException("bad descriptor: " + str);
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("descriptor is empty");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("descriptor == null");
        }
    }

    private static fr ef(fr frVar) {
        synchronized (AL) {
            String strQX = frVar.QX();
            fr frVar2 = AL.get(strQX);
            if (frVar2 != null) {
                return frVar2;
            }
            AL.put(strQX, frVar);
            return frVar;
        }
    }

    public static fr yS(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.startsWith("[")) {
            return a8(str);
        }
        return a8('L' + str + ';');
    }

    public fr DW(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newAt < 0");
        }
        if (!dx()) {
            throw new IllegalArgumentException("not a reference type: " + this.WB);
        }
        if (sG()) {
            throw new IllegalArgumentException("already uninitialized: " + this.WB);
        }
        fr frVar = new fr('N' + xs.VH(i) + this.WB, 9, i);
        frVar.zh = this;
        return ef(frVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: FH, reason: merged with bridge method [inline-methods] */
    public int compareTo(fr frVar) {
        return this.WB.compareTo(frVar.WB);
    }

    public fr J0() {
        if (this.k2 == null) {
            if (this.WB.charAt(0) != '[') {
                throw new IllegalArgumentException("not an array type: " + this.WB);
            }
            this.k2 = a8(this.WB.substring(1));
        }
        return this.k2;
    }

    public boolean KD() {
        return vy() || equals(iW);
    }

    public fr Mr() {
        fr frVar = this.zh;
        if (frVar != null) {
            return frVar;
        }
        throw new IllegalArgumentException("initialized type: " + this.WB);
    }

    public String QX() {
        return this.WB;
    }

    @Override // abcd.gr
    public int U2() {
        int i = this.mb;
        if (i == 1 || i == 2 || i == 3 || i == 6 || i == 8) {
            return 6;
        }
        return i;
    }

    @Override // abcd.gr
    public boolean XL() {
        return false;
    }

    @Override // abcd.kt
    public String Zo() {
        switch (this.mb) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "byte";
            case 3:
                return "char";
            case 4:
                return "double";
            case 5:
                return "float";
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return "int";
            case UserTouchAction.CLICK_KIND /* 7 */:
                return "long";
            case 8:
                return "short";
            case 9:
                if (!vy()) {
                    return we().replace("/", ".");
                }
                return J0().Zo() + "[]";
            default:
                return this.WB;
        }
    }

    @Override // abcd.gr
    /* renamed from: aM, reason: merged with bridge method [inline-methods] */
    public fr rN() {
        int i = this.mb;
        return (i == 1 || i == 2 || i == 3 || i == 6 || i == 8) ? n5 : this;
    }

    public boolean cb() {
        switch (this.mb) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
            case UserTouchAction.CLICK_KIND /* 7 */:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public boolean cn() {
        int i = this.mb;
        return i == 4 || i == 7;
    }

    public boolean dx() {
        return this.mb == 9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fr) {
            return this.WB.equals(((fr) obj).WB);
        }
        return false;
    }

    public int hashCode() {
        return this.WB.hashCode();
    }

    @Override // abcd.gr
    public fr j6() {
        return this;
    }

    public boolean ro() {
        int i = this.mb;
        return (i == 4 || i == 7) ? false : true;
    }

    public boolean sG() {
        return this.jw >= 0;
    }

    public boolean sh() {
        int i = this.mb;
        return i == 1 || i == 2 || i == 3 || i == 6 || i == 8;
    }

    public String toString() {
        return this.WB;
    }

    public int tp() {
        int i = this.mb;
        return (i == 4 || i == 7) ? 2 : 1;
    }

    @Override // abcd.gr
    public int u7() {
        return this.mb;
    }

    public fr v5() {
        if (this.qp == null) {
            this.qp = ef(new fr('[' + this.WB, 9));
        }
        return this.qp;
    }

    public boolean vy() {
        return this.WB.charAt(0) == '[';
    }

    public String we() {
        if (this.fY == null) {
            if (!dx()) {
                throw new IllegalArgumentException("not an object type: " + this.WB);
            }
            if (this.WB.charAt(0) == '[') {
                this.fY = this.WB;
            } else {
                String str = this.WB;
                this.fY = str.substring(1, str.length() - 1);
            }
        }
        return this.fY;
    }

    private fr(String str, int i) {
        this(str, i, -1);
    }
}
