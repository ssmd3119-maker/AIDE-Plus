package abcd;

import com.aide.uidesigner.ProxyTextView;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class jg0 {
    public static final b j6 = new b(null);
    public static final a DW = new a();

    public static class a extends jg0 {
        public String j6(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append('\'');
            int i = 0;
            int i2 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '!' || cCharAt == '\'') {
                    sb.append((CharSequence) str, i2, i);
                    sb.append('\'');
                    sb.append('\\');
                    sb.append(str.charAt(i));
                    sb.append('\'');
                    i2 = i + 1;
                }
                i++;
            }
            sb.append((CharSequence) str, i2, i);
            sb.append('\'');
            return sb.toString();
        }
    }

    public static final class b extends jg0 {
        private static final byte[] FH;

        static {
            byte[] bArr = new byte[128];
            FH = bArr;
            Arrays.fill(bArr, (byte) -1);
            for (int i = 48; i <= 57; i++) {
                FH[i] = 0;
            }
            for (int i2 = 97; i2 <= 122; i2++) {
                FH[i2] = 0;
            }
            for (int i3 = 65; i3 <= 90; i3++) {
                FH[i3] = 0;
            }
            byte[] bArr2 = FH;
            bArr2[32] = 0;
            bArr2[36] = 0;
            bArr2[37] = 0;
            bArr2[38] = 0;
            bArr2[42] = 0;
            bArr2[43] = 0;
            bArr2[44] = 0;
            bArr2[45] = 0;
            bArr2[46] = 0;
            bArr2[47] = 0;
            bArr2[58] = 0;
            bArr2[59] = 0;
            bArr2[61] = 0;
            bArr2[63] = 0;
            bArr2[64] = 0;
            bArr2[95] = 0;
            bArr2[94] = 0;
            bArr2[124] = 0;
            bArr2[126] = 0;
            bArr2[7] = 97;
            bArr2[8] = 98;
            bArr2[12] = 102;
            bArr2[10] = 110;
            bArr2[13] = 114;
            bArr2[9] = 116;
            bArr2[11] = 118;
            bArr2[92] = 92;
            bArr2[34] = 34;
        }

        private b() {
        }

        private static String DW(byte[] bArr, int i, int i2) {
            int i3;
            byte b;
            byte[] bArr2 = new byte[i2 - i];
            int i4 = 0;
            while (true) {
                if (i < i2) {
                    int i5 = i + 1;
                    byte b2 = bArr[i];
                    if (b2 != 92) {
                        i3 = i4 + 1;
                        bArr2[i4] = b2;
                        i = i5;
                    } else if (i5 == i2) {
                        bArr2[i4] = 92;
                        i4++;
                    } else {
                        i = i5 + 1;
                        byte b3 = bArr[i5];
                        if (b3 == 34 || b3 == 92) {
                            i3 = i4 + 1;
                            bArr2[i4] = bArr[i - 1];
                        } else if (b3 == 102) {
                            i3 = i4 + 1;
                            bArr2[i4] = 12;
                        } else if (b3 == 110) {
                            i3 = i4 + 1;
                            bArr2[i4] = 10;
                        } else if (b3 == 114) {
                            i3 = i4 + 1;
                            bArr2[i4] = 13;
                        } else if (b3 == 116) {
                            i3 = i4 + 1;
                            bArr2[i4] = 9;
                        } else if (b3 == 118) {
                            i3 = i4 + 1;
                            bArr2[i4] = 11;
                        } else if (b3 == 97) {
                            i3 = i4 + 1;
                            bArr2[i4] = 7;
                        } else if (b3 != 98) {
                            switch (b3) {
                                case 48:
                                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                                case 50:
                                case 51:
                                    int i6 = bArr[i - 1] - 48;
                                    for (int i7 = 1; i7 < 3 && i < i2 && 48 <= (b = bArr[i]) && b <= 55; i7++) {
                                        i6 = (i6 << 3) | (b - 48);
                                        i++;
                                    }
                                    i3 = i4 + 1;
                                    bArr2[i4] = (byte) i6;
                                    break;
                                default:
                                    int i8 = i4 + 1;
                                    bArr2[i4] = 92;
                                    i4 = i8 + 1;
                                    bArr2[i8] = bArr[i - 1];
                                    continue;
                            }
                        } else {
                            i3 = i4 + 1;
                            bArr2[i4] = 8;
                        }
                    }
                    i4 = i3;
                }
            }
            return kg0.Zo(r60.Zo, bArr2, 0, i4);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String FH(java.lang.String r11) {
            /*
                r10 = this;
                int r0 = r11.length()
                if (r0 != 0) goto L9
                java.lang.String r11 = "\"\""
                return r11
            L9:
                byte[] r0 = abcd.r60.DW(r11)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                int r2 = r0.length
                int r2 = r2 + 2
                r1.<init>(r2)
                r2 = 34
                r1.append(r2)
                r3 = 1
                r4 = 0
                r5 = 0
            L1d:
                int r6 = r0.length
                if (r5 < r6) goto L2b
                if (r3 == 0) goto L23
                return r11
            L23:
                r1.append(r2)
                java.lang.String r11 = r1.toString()
                return r11
            L2b:
                r6 = r0[r5]
                r6 = r6 & 255(0xff, float:3.57E-43)
                byte[] r7 = abcd.jg0.b.FH
                int r8 = r7.length
                r9 = 92
                if (r6 >= r8) goto L49
                r7 = r7[r6]
                if (r7 != 0) goto L3f
                char r6 = (char) r6
                r1.append(r6)
                goto L6b
            L3f:
                if (r7 <= 0) goto L49
                r1.append(r9)
                char r3 = (char) r7
                r1.append(r3)
                goto L6a
            L49:
                r1.append(r9)
                int r3 = r6 >> 6
                r3 = r3 & 3
                int r3 = r3 + 48
                char r3 = (char) r3
                r1.append(r3)
                int r3 = r6 >> 3
                r3 = r3 & 7
                int r3 = r3 + 48
                char r3 = (char) r3
                r1.append(r3)
                int r3 = r6 >> 0
                r3 = r3 & 7
                int r3 = r3 + 48
                char r3 = (char) r3
                r1.append(r3)
            L6a:
                r3 = 0
            L6b:
                int r5 = r5 + 1
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: abcd.jg0.b.FH(java.lang.String):java.lang.String");
        }

        public String j6(byte[] bArr, int i, int i2) {
            if (2 <= i2 - i && bArr[i] == 34) {
                int i3 = i2 - 1;
                if (bArr[i3] == 34) {
                    return DW(bArr, i + 1, i3);
                }
            }
            return kg0.Zo(r60.Zo, bArr, i, i2);
        }

        public /* synthetic */ b(b bVar) {
            this();
        }
    }
}
