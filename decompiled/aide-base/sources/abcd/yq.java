package abcd;

import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class yq extends br {
    private final String WB;
    private final os mb;

    static {
        new yq("");
    }

    public yq(String str) {
        if (str == null) {
            throw new NullPointerException("string == null");
        }
        this.WB = str.intern();
        this.mb = new os(Mr(str));
    }

    public static byte[] Mr(String str) {
        int length = str.length();
        byte[] bArr = new byte[length * 3];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != 0 && cCharAt < 128) {
                bArr[i] = (byte) cCharAt;
                i++;
            } else if (cCharAt < 2048) {
                bArr[i] = (byte) (((cCharAt >> 6) & 31) | 192);
                bArr[i + 1] = (byte) ((cCharAt & '?') | 128);
                i += 2;
            } else {
                bArr[i] = (byte) (((cCharAt >> '\f') & 15) | 224);
                bArr[i + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                bArr[i + 2] = (byte) ((cCharAt & '?') | 128);
                i += 3;
            }
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    private static String a8(int i, int i2) {
        throw new IllegalArgumentException("bad utf-8 byte " + xs.Zo(i) + " at offset " + xs.tp(i2));
    }

    public static String vy(os osVar) {
        char c;
        int iXL = osVar.XL();
        char[] cArr = new char[iXL];
        int i = 0;
        int i2 = 0;
        while (iXL > 0) {
            int iWe = osVar.we(i2);
            switch (iWe >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                case UserTouchAction.CLICK_KIND /* 7 */:
                    iXL--;
                    if (iWe == 0) {
                        a8(iWe, i2);
                        throw null;
                    }
                    c = (char) iWe;
                    i2++;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    a8(iWe, i2);
                    throw null;
                case 12:
                case 13:
                    iXL -= 2;
                    if (iXL < 0) {
                        a8(iWe, i2);
                        throw null;
                    }
                    int i3 = i2 + 1;
                    int iWe2 = osVar.we(i3);
                    if ((iWe2 & 192) != 128) {
                        a8(iWe2, i3);
                        throw null;
                    }
                    int i4 = ((iWe & 31) << 6) | (iWe2 & 63);
                    if (i4 != 0 && i4 < 128) {
                        a8(iWe2, i3);
                        throw null;
                    }
                    c = (char) i4;
                    i2 += 2;
                    break;
                case 14:
                    iXL -= 3;
                    if (iXL < 0) {
                        a8(iWe, i2);
                        throw null;
                    }
                    int i5 = i2 + 1;
                    int iWe3 = osVar.we(i5);
                    int i6 = iWe3 & 192;
                    if (i6 != 128) {
                        a8(iWe3, i5);
                        throw null;
                    }
                    int i7 = i2 + 2;
                    int iWe4 = osVar.we(i7);
                    if (i6 != 128) {
                        a8(iWe4, i7);
                        throw null;
                    }
                    int i8 = ((iWe & 15) << 12) | ((iWe3 & 63) << 6) | (iWe4 & 63);
                    if (i8 < 2048) {
                        a8(iWe4, i7);
                        throw null;
                    }
                    c = (char) i8;
                    i2 += 3;
                    break;
            }
            cArr[i] = c;
            i++;
        }
        return new String(cArr, 0, i);
    }

    public String BT(int i) {
        String str;
        String strZo = Zo();
        if (strZo.length() <= i - 2) {
            str = "";
        } else {
            strZo = strZo.substring(0, i - 5);
            str = "...";
        }
        return '\"' + strZo + str + '\"';
    }

    @Override // abcd.bq
    public int FH(bq bqVar) {
        return this.WB.compareTo(((yq) bqVar).WB);
    }

    public String J0() {
        return this.WB;
    }

    public int QX() {
        return this.WB.length();
    }

    @Override // abcd.kt
    public String Zo() {
        int length = this.WB.length();
        StringBuilder sb = new StringBuilder((length * 3) / 2);
        int i = 0;
        while (i < length) {
            char cCharAt = this.WB.charAt(i);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    sb.append('\\');
                }
                sb.append(cCharAt);
            } else if (cCharAt > 127) {
                sb.append("\\u");
                sb.append(Character.forDigit(cCharAt >> '\f', 16));
                sb.append(Character.forDigit((cCharAt >> '\b') & 15, 16));
                sb.append(Character.forDigit((cCharAt >> 4) & 15, 16));
                sb.append(Character.forDigit(cCharAt & 15, 16));
            } else if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt != '\r') {
                char cCharAt2 = i < length + (-1) ? this.WB.charAt(i + 1) : (char) 0;
                boolean z = cCharAt2 >= '0' && cCharAt2 <= '7';
                sb.append('\\');
                for (int i2 = 6; i2 >= 0; i2 -= 3) {
                    char c = (char) (((cCharAt >> i2) & 7) + 48);
                    if (c != '0' || z) {
                        sb.append(c);
                        z = true;
                    }
                }
                if (!z) {
                    sb.append('0');
                }
            } else {
                sb.append("\\r");
            }
            i++;
        }
        return sb.toString();
    }

    public int aM() {
        return this.mb.XL();
    }

    public boolean equals(Object obj) {
        if (obj instanceof yq) {
            return this.WB.equals(((yq) obj).WB);
        }
        return false;
    }

    public int hashCode() {
        return this.WB.hashCode();
    }

    @Override // abcd.gr
    public fr j6() {
        return fr.fN;
    }

    public String toString() {
        return "string{\"" + Zo() + "\"}";
    }

    @Override // abcd.bq
    public String tp() {
        return "utf8";
    }

    @Override // abcd.bq
    public boolean v5() {
        return false;
    }

    public os we() {
        return this.mb;
    }

    public String yS() {
        return '\"' + Zo() + '\"';
    }

    public yq(os osVar) {
        if (osVar != null) {
            this.mb = osVar;
            this.WB = vy(osVar).intern();
            return;
        }
        throw new NullPointerException("bytes == null");
    }
}
