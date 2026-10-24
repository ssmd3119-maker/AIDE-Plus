package abcd;

import abcd.io;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class so {
    private static final byte[] j6 = new byte[255];

    static /* synthetic */ class a {
        static final /* synthetic */ int[] DW;
        static final /* synthetic */ int[] j6;

        static {
            int[] iArr = new int[lo.values().length];
            DW = iArr;
            try {
                iArr[lo.WB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DW[lo.k2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DW[lo.mb.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DW[lo.fY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                DW[lo.qp.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                DW[lo.jw.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                DW[lo.zh.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                DW[lo.Z1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                DW[lo.q7.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                DW[lo.cT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                DW[lo.hK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                DW[lo.Q6.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                DW[lo.iW.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                DW[lo.Jl.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                DW[lo.kf.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                DW[lo.w9.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                DW[lo.n5.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                DW[lo.AL.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                DW[lo.eU.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                DW[lo.e3.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                DW[lo.sg.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                DW[lo.pO.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                DW[lo.a5.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                DW[lo.sE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                DW[lo.sM.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                DW[lo.Gj.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                DW[lo.oy.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                DW[lo.fN.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                DW[lo.e9.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                DW[lo.aX.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                DW[lo.pN.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                DW[lo.Cz.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                DW[lo.ys.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                DW[lo.IS.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                DW[lo.QO.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                DW[lo.gG.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                DW[lo.Nh.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            int[] iArr2 = new int[go.values().length];
            j6 = iArr2;
            try {
                iArr2[go.TYPE_REF.ordinal()] = 1;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                j6[go.STRING_REF.ordinal()] = 2;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                j6[go.FIELD_REF.ordinal()] = 3;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                j6[go.METHOD_REF.ordinal()] = 4;
            } catch (NoSuchFieldError unused41) {
            }
        }
    }

    static {
        int i;
        for (int i2 = 1; i2 < 255; i2++) {
            try {
                io.a aVarJ6 = io.j6(i2);
                go goVarDW = aVarJ6.DW();
                lo loVarJ6 = aVarJ6.j6();
                if (goVarDW == go.NONE) {
                    j6[i2] = j6(loVarJ6);
                } else {
                    byte bJ6 = j6(loVarJ6);
                    int i3 = a.j6[goVarDW.ordinal()];
                    if (i3 == 1) {
                        i = bJ6 | 16;
                    } else if (i3 == 2) {
                        i = bJ6 | 32;
                    } else if (i3 == 3) {
                        i = bJ6 | 48;
                    } else {
                        if (i3 != 4) {
                            throw new RuntimeException("Unknown index type: " + goVarDW);
                        }
                        i = bJ6 | 64;
                    }
                    j6[i2] = (byte) i;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public static void DW(short[] sArr, qo qoVar) {
        int i;
        int i2;
        byte[] bArr = j6;
        int i3 = 0;
        while (i3 < sArr.length) {
            int i4 = sArr[i3] & 255;
            if (i4 == 0) {
                int i5 = sArr[i3] & 65535;
                if (i5 == 256) {
                    i = (sArr[i3 + 1] & 65535) * 2;
                } else if (i5 == 512) {
                    i2 = ((sArr[i3 + 1] & 65535) * 4) + 1;
                    i3 += i2;
                } else if (i5 == 768) {
                    i = (((sArr[i3 + 1] & 65535) * (sArr[i3 + 2] & 65535)) + 1) / 2;
                }
                i2 = i + 3;
                i3 += i2;
            } else {
                if (i4 == 27) {
                    throw new RuntimeException("Extended opcodes not supported");
                }
                if (i4 == 255) {
                    throw new RuntimeException("Extended opcodes not supported");
                }
                byte b = bArr[i4];
                if (b == 0) {
                    throw new RuntimeException("Opcode size not found for opcode " + Integer.toHexString(i4));
                }
                if (b < 15) {
                    i3 += b - 1;
                } else {
                    int i6 = b & 240;
                    if (i6 == 16) {
                        int i7 = i3 + 1;
                        sArr[i7] = (short) qoVar.er(65535 & sArr[i7]);
                    } else if (i6 == 32) {
                        int i8 = i3 + 1;
                        sArr[i8] = (short) qoVar.rN(65535 & sArr[i8]);
                    } else if (i6 == 48) {
                        int i9 = i3 + 1;
                        sArr[i9] = (short) qoVar.XL(65535 & sArr[i9]);
                    } else {
                        if (i6 != 64) {
                            throw new RuntimeException("Unexpected mask");
                        }
                        int i10 = i3 + 1;
                        sArr[i10] = (short) qoVar.Mr(65535 & sArr[i10]);
                    }
                    i2 = (b & 15) - 1;
                    i3 += i2;
                }
            }
            i3++;
        }
    }

    private static byte j6(lo loVar) {
        switch (a.DW[loVar.ordinal()]) {
            case 1:
                throw new RuntimeException("Unexpected format");
            case 2:
            case 3:
            case 4:
            case 5:
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return (byte) 1;
            case UserTouchAction.CLICK_KIND /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                return (byte) 2;
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
            case 19:
                throw new RuntimeException("Unexpected format");
            case ProxyTextView.INPUTTYPE_date /* 20 */:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                return (byte) 3;
            case 29:
            case 30:
            case 31:
            case 32:
                throw new RuntimeException("Unexpected format");
            case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                throw new RuntimeException("Unexpected format");
            case 34:
                throw new RuntimeException("Jumbo opcodes not supported");
            case 35:
                return (byte) 5;
            case ProxyTextView.INPUTTYPE_time /* 36 */:
            case 37:
                throw new RuntimeException("Jumbo opcodes not supported");
            default:
                throw new RuntimeException("Unknown opcode format");
        }
    }
}
