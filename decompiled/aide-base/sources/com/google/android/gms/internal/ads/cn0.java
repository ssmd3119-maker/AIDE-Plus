package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes.dex */
public final class cn0 {
    private final int[] DW;
    private final String[] FH;
    private final int Hw;
    private final String[] j6;

    private cn0(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.j6 = strArr;
        this.DW = iArr;
        this.FH = strArr2;
        this.Hw = i;
    }

    public static cn0 DW(String str) {
        String strSubstring;
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int length = 0;
        int i = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            char c = 65535;
            if (iIndexOf == -1) {
                String strValueOf = String.valueOf(strArr[i]);
                String strValueOf2 = String.valueOf(str.substring(length));
                strArr[i] = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                length = str.length();
            } else if (iIndexOf != length) {
                String strValueOf3 = String.valueOf(strArr[i]);
                String strValueOf4 = String.valueOf(str.substring(length, iIndexOf));
                strArr[i] = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                length = iIndexOf;
            } else if (str.startsWith("$$", length)) {
                strArr[i] = String.valueOf(strArr[i]).concat("$");
                length += 2;
            } else {
                int i2 = length + 1;
                int iIndexOf2 = str.indexOf("$", i2);
                String strSubstring2 = str.substring(i2, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    iArr[i] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d")) {
                            strSubstring = String.valueOf(strSubstring).concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    int iHashCode = strSubstring2.hashCode();
                    if (iHashCode != -1950496919) {
                        if (iHashCode != 2606829) {
                            if (iHashCode == 38199441 && strSubstring2.equals("Bandwidth")) {
                                c = 1;
                            }
                        } else if (strSubstring2.equals("Time")) {
                            c = 2;
                        }
                    } else if (strSubstring2.equals("Number")) {
                        c = 0;
                    }
                    if (c == 0) {
                        iArr[i] = 2;
                    } else if (c == 1) {
                        iArr[i] = 3;
                    } else {
                        if (c != 2) {
                            String strValueOf5 = String.valueOf(str);
                            throw new IllegalArgumentException(strValueOf5.length() != 0 ? "Invalid template: ".concat(strValueOf5) : new String("Invalid template: "));
                        }
                        iArr[i] = 4;
                    }
                    strArr2[i] = strSubstring;
                }
                i++;
                strArr[i] = "";
                length = iIndexOf2 + 1;
            }
        }
        return new cn0(strArr, iArr, strArr2, i);
    }

    public final String j6(String str, int i, int i2, long j) {
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            int i4 = this.Hw;
            if (i3 >= i4) {
                sb.append(this.j6[i4]);
                return sb.toString();
            }
            sb.append(this.j6[i3]);
            int[] iArr = this.DW;
            if (iArr[i3] == 1) {
                sb.append(str);
            } else if (iArr[i3] == 2) {
                sb.append(String.format(Locale.US, this.FH[i3], Integer.valueOf(i)));
            } else if (iArr[i3] == 3) {
                sb.append(String.format(Locale.US, this.FH[i3], Integer.valueOf(i2)));
            } else if (iArr[i3] == 4) {
                sb.append(String.format(Locale.US, this.FH[i3], Long.valueOf(j)));
            }
            i3++;
        }
    }
}
