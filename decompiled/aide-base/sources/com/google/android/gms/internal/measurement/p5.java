package com.google.android.gms.internal.measurement;

import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.internal.measurement.e4;
import com.probelytics.api.UserTouchAction;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class p5<T> implements c6<T> {
    private static final int[] aM = new int[0];
    private static final Unsafe j3 = a7.Sf();
    private final Object[] DW;
    private final int EQ;
    private final int FH;
    private final int Hw;
    private final t5 J0;
    private final v4 J8;
    private final s3<?> QX;
    private final boolean VH;
    private final u6<?, ?> Ws;
    private final g5 XL;
    private final boolean Zo;
    private final boolean gn;
    private final int[] j6;
    private final int[] tp;
    private final boolean u7;
    private final l5 v5;
    private final int we;

    private p5(int[] iArr, Object[] objArr, int i, int i2, l5 l5Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, t5 t5Var, v4 v4Var, u6<?, ?> u6Var, s3<?> s3Var, g5 g5Var) {
        this.j6 = iArr;
        this.DW = objArr;
        this.FH = i;
        this.Hw = i2;
        this.VH = l5Var instanceof e4;
        this.gn = z;
        this.Zo = s3Var != null && s3Var.VH(l5Var);
        this.u7 = false;
        this.tp = iArr2;
        this.EQ = i3;
        this.we = i4;
        this.J0 = t5Var;
        this.J8 = v4Var;
        this.Ws = u6Var;
        this.QX = s3Var;
        this.v5 = l5Var;
        this.XL = g5Var;
    }

    private final Object BT(int i) {
        return this.DW[(i / 3) << 1];
    }

    static <T> p5<T> EQ(Class<T> cls, j5 j5Var, t5 t5Var, v4 v4Var, u6<?, ?> u6Var, s3<?> s3Var, g5 g5Var) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        boolean z;
        int i17;
        a6 a6Var;
        int i18;
        int iObjectFieldOffset;
        int i19;
        int i20;
        Class<?> cls2;
        String str;
        int iObjectFieldOffset2;
        int i21;
        Field fieldJ8;
        int i22;
        char cCharAt9;
        int i23;
        Field fieldJ82;
        Field fieldJ83;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        char cCharAt12;
        int i27;
        char cCharAt13;
        char cCharAt14;
        if (!(j5Var instanceof a6)) {
            ((p6) j5Var).FH();
            throw null;
        }
        a6 a6Var2 = (a6) j5Var;
        int i28 = 0;
        boolean z2 = a6Var2.FH() == e4.e.tp;
        String strHw = a6Var2.Hw();
        int length = strHw.length();
        int iCharAt3 = strHw.charAt(0);
        if (iCharAt3 >= 55296) {
            int i29 = iCharAt3 & 8191;
            int i30 = 1;
            int i31 = 13;
            while (true) {
                i = i30 + 1;
                cCharAt14 = strHw.charAt(i30);
                if (cCharAt14 < 55296) {
                    break;
                }
                i29 |= (cCharAt14 & 8191) << i31;
                i31 += 13;
                i30 = i;
            }
            iCharAt3 = i29 | (cCharAt14 << i31);
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int iCharAt4 = strHw.charAt(i);
        if (iCharAt4 >= 55296) {
            int i33 = iCharAt4 & 8191;
            int i34 = 13;
            while (true) {
                i27 = i32 + 1;
                cCharAt13 = strHw.charAt(i32);
                if (cCharAt13 < 55296) {
                    break;
                }
                i33 |= (cCharAt13 & 8191) << i34;
                i34 += 13;
                i32 = i27;
            }
            iCharAt4 = i33 | (cCharAt13 << i34);
            i32 = i27;
        }
        if (iCharAt4 == 0) {
            iArr = aM;
            i6 = 0;
            i3 = 0;
            iCharAt = 0;
            i4 = 0;
            iCharAt2 = 0;
            i5 = 0;
        } else {
            int i35 = i32 + 1;
            int iCharAt5 = strHw.charAt(i32);
            if (iCharAt5 >= 55296) {
                int i36 = iCharAt5 & 8191;
                int i37 = 13;
                while (true) {
                    i14 = i35 + 1;
                    cCharAt8 = strHw.charAt(i35);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt8 & 8191) << i37;
                    i37 += 13;
                    i35 = i14;
                }
                iCharAt5 = i36 | (cCharAt8 << i37);
                i35 = i14;
            }
            int i38 = i35 + 1;
            int iCharAt6 = strHw.charAt(i35);
            if (iCharAt6 >= 55296) {
                int i39 = iCharAt6 & 8191;
                int i40 = 13;
                while (true) {
                    i13 = i38 + 1;
                    cCharAt7 = strHw.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i13;
                }
                iCharAt6 = i39 | (cCharAt7 << i40);
                i38 = i13;
            }
            int i41 = i38 + 1;
            iCharAt = strHw.charAt(i38);
            if (iCharAt >= 55296) {
                int i42 = iCharAt & 8191;
                int i43 = 13;
                while (true) {
                    i12 = i41 + 1;
                    cCharAt6 = strHw.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i12;
                }
                iCharAt = i42 | (cCharAt6 << i43);
                i41 = i12;
            }
            int i44 = i41 + 1;
            int iCharAt7 = strHw.charAt(i41);
            if (iCharAt7 >= 55296) {
                int i45 = iCharAt7 & 8191;
                int i46 = 13;
                while (true) {
                    i11 = i44 + 1;
                    cCharAt5 = strHw.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i11;
                }
                iCharAt7 = i45 | (cCharAt5 << i46);
                i44 = i11;
            }
            int i47 = i44 + 1;
            iCharAt2 = strHw.charAt(i44);
            if (iCharAt2 >= 55296) {
                int i48 = iCharAt2 & 8191;
                int i49 = 13;
                while (true) {
                    i10 = i47 + 1;
                    cCharAt4 = strHw.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i10;
                }
                iCharAt2 = i48 | (cCharAt4 << i49);
                i47 = i10;
            }
            int i50 = i47 + 1;
            int iCharAt8 = strHw.charAt(i47);
            if (iCharAt8 >= 55296) {
                int i51 = iCharAt8 & 8191;
                int i52 = 13;
                while (true) {
                    i9 = i50 + 1;
                    cCharAt3 = strHw.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i9;
                }
                iCharAt8 = i51 | (cCharAt3 << i52);
                i50 = i9;
            }
            int i53 = i50 + 1;
            int iCharAt9 = strHw.charAt(i50);
            if (iCharAt9 >= 55296) {
                int i54 = iCharAt9 & 8191;
                int i55 = i53;
                int i56 = 13;
                while (true) {
                    i8 = i55 + 1;
                    cCharAt2 = strHw.charAt(i55);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i55 = i8;
                }
                iCharAt9 = i54 | (cCharAt2 << i56);
                i2 = i8;
            } else {
                i2 = i53;
            }
            int i57 = i2 + 1;
            int iCharAt10 = strHw.charAt(i2);
            if (iCharAt10 >= 55296) {
                int i58 = iCharAt10 & 8191;
                int i59 = i57;
                int i60 = 13;
                while (true) {
                    i7 = i59 + 1;
                    cCharAt = strHw.charAt(i59);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i60;
                    i60 += 13;
                    i59 = i7;
                }
                iCharAt10 = i58 | (cCharAt << i60);
                i57 = i7;
            }
            int[] iArr2 = new int[iCharAt10 + iCharAt8 + iCharAt9];
            int i61 = (iCharAt5 << 1) + iCharAt6;
            i3 = iCharAt7;
            i4 = i61;
            i5 = iCharAt10;
            i28 = iCharAt5;
            i32 = i57;
            int i62 = iCharAt8;
            iArr = iArr2;
            i6 = i62;
        }
        Unsafe unsafe = j3;
        Object[] objArrV5 = a6Var2.v5();
        Class<?> cls3 = a6Var2.j6().getClass();
        int i63 = i32;
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr = new Object[iCharAt2 << 1];
        int i64 = i5 + i6;
        int i65 = i5;
        int i66 = i63;
        int i67 = i64;
        int i68 = 0;
        int i69 = 0;
        while (i66 < length) {
            int i70 = i66 + 1;
            int iCharAt11 = strHw.charAt(i66);
            int i71 = length;
            if (iCharAt11 >= 55296) {
                int i72 = iCharAt11 & 8191;
                int i73 = i70;
                int i74 = 13;
                while (true) {
                    i26 = i73 + 1;
                    cCharAt12 = strHw.charAt(i73);
                    i15 = i5;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i72 |= (cCharAt12 & 8191) << i74;
                    i74 += 13;
                    i73 = i26;
                    i5 = i15;
                }
                iCharAt11 = i72 | (cCharAt12 << i74);
                i16 = i26;
            } else {
                i15 = i5;
                i16 = i70;
            }
            int i75 = i16 + 1;
            int iCharAt12 = strHw.charAt(i16);
            if (iCharAt12 >= 55296) {
                int i76 = iCharAt12 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i25 = i77 + 1;
                    cCharAt11 = strHw.charAt(i77);
                    z = z2;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i76 |= (cCharAt11 & 8191) << i78;
                    i78 += 13;
                    i77 = i25;
                    z2 = z;
                }
                iCharAt12 = i76 | (cCharAt11 << i78);
                i17 = i25;
            } else {
                z = z2;
                i17 = i75;
            }
            int i79 = iCharAt12 & 255;
            int i80 = i3;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i81 = iCharAt;
            if (i79 >= 51) {
                int i82 = i17 + 1;
                int iCharAt13 = strHw.charAt(i17);
                char c = 55296;
                if (iCharAt13 >= 55296) {
                    int i83 = iCharAt13 & 8191;
                    int i84 = 13;
                    while (true) {
                        i24 = i82 + 1;
                        cCharAt10 = strHw.charAt(i82);
                        if (cCharAt10 < c) {
                            break;
                        }
                        i83 |= (cCharAt10 & 8191) << i84;
                        i84 += 13;
                        i82 = i24;
                        c = 55296;
                    }
                    iCharAt13 = i83 | (cCharAt10 << i84);
                    i82 = i24;
                }
                int i85 = i79 - 51;
                int i86 = i82;
                if (i85 == 9 || i85 == 17) {
                    objArr[((i69 / 3) << 1) + 1] = objArrV5[i4];
                    i4++;
                } else if (i85 == 12 && (iCharAt3 & 1) == 1) {
                    objArr[((i69 / 3) << 1) + 1] = objArrV5[i4];
                    i4++;
                }
                int i87 = iCharAt13 << 1;
                Object obj = objArrV5[i87];
                if (obj instanceof Field) {
                    fieldJ82 = (Field) obj;
                } else {
                    fieldJ82 = J8(cls3, (String) obj);
                    objArrV5[i87] = fieldJ82;
                }
                a6Var = a6Var2;
                String str2 = strHw;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldJ82);
                int i88 = i87 + 1;
                Object obj2 = objArrV5[i88];
                if (obj2 instanceof Field) {
                    fieldJ83 = (Field) obj2;
                } else {
                    fieldJ83 = J8(cls3, (String) obj2);
                    objArrV5[i88] = fieldJ83;
                }
                cls2 = cls3;
                i19 = i4;
                i17 = i86;
                str = str2;
                i21 = 0;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldJ83);
                i20 = i28;
            } else {
                a6Var = a6Var2;
                String str3 = strHw;
                int i89 = i4 + 1;
                Field fieldJ84 = J8(cls3, (String) objArrV5[i4]);
                if (i79 == 9 || i79 == 17) {
                    i18 = 1;
                    objArr[((i69 / 3) << 1) + 1] = fieldJ84.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        i18 = 1;
                        i23 = i89 + 1;
                        objArr[((i69 / 3) << 1) + 1] = objArrV5[i89];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        i18 = 1;
                        if ((iCharAt3 & 1) == 1) {
                            i23 = i89 + 1;
                            objArr[((i69 / 3) << 1) + 1] = objArrV5[i89];
                        }
                    } else if (i79 == 50) {
                        int i90 = i65 + 1;
                        iArr[i65] = i69;
                        int i91 = (i69 / 3) << 1;
                        int i92 = i89 + 1;
                        objArr[i91] = objArrV5[i89];
                        if ((iCharAt12 & 2048) != 0) {
                            i89 = i92 + 1;
                            objArr[i91 + 1] = objArrV5[i92];
                            i65 = i90;
                            i18 = 1;
                        } else {
                            i89 = i92;
                            i18 = 1;
                            i65 = i90;
                        }
                    } else {
                        i18 = 1;
                    }
                    i89 = i23;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldJ84);
                if ((iCharAt3 & 1) != i18 || i79 > 17) {
                    i19 = i89;
                    i20 = i28;
                    cls2 = cls3;
                    str = str3;
                    iObjectFieldOffset2 = 0;
                    i21 = 0;
                } else {
                    int i93 = i17 + 1;
                    str = str3;
                    int iCharAt14 = str.charAt(i17);
                    if (iCharAt14 >= 55296) {
                        int i94 = iCharAt14 & 8191;
                        int i95 = 13;
                        while (true) {
                            i22 = i93 + 1;
                            cCharAt9 = str.charAt(i93);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i94 |= (cCharAt9 & 8191) << i95;
                            i95 += 13;
                            i93 = i22;
                        }
                        iCharAt14 = i94 | (cCharAt9 << i95);
                        i93 = i22;
                    }
                    int i96 = (i28 << 1) + (iCharAt14 / 32);
                    Object obj3 = objArrV5[i96];
                    i19 = i89;
                    if (obj3 instanceof Field) {
                        fieldJ8 = (Field) obj3;
                    } else {
                        fieldJ8 = J8(cls3, (String) obj3);
                        objArrV5[i96] = fieldJ8;
                    }
                    i20 = i28;
                    cls2 = cls3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldJ8);
                    i21 = iCharAt14 % 32;
                    i17 = i93;
                }
                if (i79 >= 18 && i79 <= 49) {
                    iArr[i67] = iObjectFieldOffset;
                    i67++;
                }
            }
            int i97 = i69 + 1;
            iArr3[i69] = iCharAt11;
            int i98 = i97 + 1;
            iArr3[i97] = iObjectFieldOffset | ((iCharAt12 & 256) != 0 ? 268435456 : 0) | ((iCharAt12 & 512) != 0 ? 536870912 : 0) | (i79 << 20);
            i69 = i98 + 1;
            iArr3[i98] = (i21 << 20) | iObjectFieldOffset2;
            i28 = i20;
            strHw = str;
            i66 = i17;
            cls3 = cls2;
            i3 = i80;
            length = i71;
            i5 = i15;
            z2 = z;
            iCharAt = i81;
            i4 = i19;
            a6Var2 = a6Var;
        }
        return new p5<>(iArr3, objArr, iCharAt, i3, a6Var2.j6(), z2, false, iArr, i5, i64, t5Var, v4Var, u6Var, s3Var, g5Var);
    }

    private final <UT, UB> UB J0(Object obj, int i, UB ub, u6<UT, UB> u6Var) {
        i4 i4VarVy;
        int i2 = this.j6[i];
        Object objP8 = a7.P8(obj, P8(i) & 1048575);
        return (objP8 == null || (i4VarVy = vy(i)) == null) ? ub : (UB) we(i, i2, this.XL.FH(objP8), i4VarVy, ub, u6Var);
    }

    private static Field J8(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }

    private final boolean KD(T t, T t2, int i) {
        return yS(t, i) == yS(t2, i);
    }

    private final boolean Mr(T t, int i, int i2) {
        return a7.U2(t, (long) (ei(i2) & 1048575)) == i;
    }

    private final int P8(int i) {
        return this.j6[i + 1];
    }

    private static <UT, UB> void QX(u6<UT, UB> u6Var, T t, p7 p7Var) {
        u6Var.Hw(u6Var.u7(t), p7Var);
    }

    private final void SI(T t, int i) {
        if (this.gn) {
            return;
        }
        int iEi = ei(i);
        long j = iEi & 1048575;
        a7.J8(t, j, a7.U2(t, j) | (1 << (iEi >>> 20)));
    }

    private final boolean U2(T t, int i, int i2, int i3) {
        return this.gn ? yS(t, i) : (i2 & i3) != 0;
    }

    private static void Ws(int i, Object obj, p7 p7Var) {
        if (obj instanceof String) {
            p7Var.ei(i, (String) obj);
        } else {
            p7Var.BT(i, (u2) obj);
        }
    }

    private final <K, V> void XL(p7 p7Var, int i, Object obj, int i2) {
        if (obj != null) {
            p7Var.dx(i, this.XL.VH(BT(i2)), this.XL.gn(obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a8(Object obj, int i, c6 c6Var) {
        return c6Var.gn(a7.P8(obj, i & 1048575));
    }

    private final void aM(Object obj, int i, b6 b6Var) {
        if (nw(i)) {
            a7.VH(obj, i & 1048575, b6Var.a8());
        } else if (this.VH) {
            a7.VH(obj, i & 1048575, b6Var.u7());
        } else {
            a7.VH(obj, i & 1048575, b6Var.jJ());
        }
    }

    private static <T> int cb(T t, long j) {
        return ((Integer) a7.P8(t, j)).intValue();
    }

    private static <T> double cn(T t, long j) {
        return ((Double) a7.P8(t, j)).doubleValue();
    }

    private static <T> long dx(T t, long j) {
        return ((Long) a7.P8(t, j)).longValue();
    }

    private final int ei(int i) {
        return this.j6[i + 2];
    }

    private final void er(T t, T t2, int i) {
        int iP8 = P8(i);
        int i2 = this.j6[i];
        long j = iP8 & 1048575;
        if (Mr(t2, i2, i)) {
            Object objP8 = a7.P8(t, j);
            Object objP82 = a7.P8(t2, j);
            if (objP8 != null && objP82 != null) {
                a7.VH(t, j, g4.v5(objP8, objP82));
                lg(t, i2, i);
            } else if (objP82 != null) {
                a7.VH(t, j, objP82);
                lg(t, i2, i);
            }
        }
    }

    private final c6 gW(int i) {
        int i2 = (i / 3) << 1;
        c6 c6Var = (c6) this.DW[i2];
        if (c6Var != null) {
            return c6Var;
        }
        c6<T> c6VarDW = y5.FH().DW((Class) this.DW[i2 + 1]);
        this.DW[i2] = c6VarDW;
        return c6VarDW;
    }

    private final void j3(T t, T t2, int i) {
        long jP8 = P8(i) & 1048575;
        if (yS(t2, i)) {
            Object objP8 = a7.P8(t, jP8);
            Object objP82 = a7.P8(t2, jP8);
            if (objP8 != null && objP82 != null) {
                a7.VH(t, jP8, g4.v5(objP8, objP82));
                SI(t, i);
            } else if (objP82 != null) {
                a7.VH(t, jP8, objP82);
                SI(t, i);
            }
        }
    }

    private final void lg(T t, int i, int i2) {
        a7.J8(t, ei(i2) & 1048575, i);
    }

    private static boolean nw(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void rN(T r19, com.google.android.gms.internal.measurement.p7 r20) {
        /*
            Method dump skipped, instructions count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p5.rN(java.lang.Object, com.google.android.gms.internal.measurement.p7):void");
    }

    private static <E> List<E> ro(Object obj, long j) {
        return (List) a7.P8(obj, j);
    }

    private static <T> boolean sG(T t, long j) {
        return ((Boolean) a7.P8(t, j)).booleanValue();
    }

    private static <T> float sh(T t, long j) {
        return ((Float) a7.P8(t, j)).floatValue();
    }

    private static <UT, UB> int tp(u6<UT, UB> u6Var, T t) {
        return u6Var.gn(u6Var.u7(t));
    }

    private final i4 vy(int i) {
        return (i4) this.DW[((i / 3) << 1) + 1];
    }

    private final <K, V, UT, UB> UB we(int i, int i2, Map<K, V> map, i4 i4Var, UB ub, u6<UT, UB> u6Var) {
        e5<?, ?> e5VarVH = this.XL.VH(BT(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!i4Var.j6(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = u6Var.j3();
                }
                b3 b3VarGn = u2.gn(d5.j6(e5VarVH, next.getKey(), next.getValue()));
                try {
                    d5.DW(b3VarGn.DW(), e5VarVH, next.getKey(), next.getValue());
                    u6Var.DW(ub, i2, b3VarGn.j6());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final boolean yS(T t, int i) {
        if (!this.gn) {
            int iEi = ei(i);
            return (a7.U2(t, (long) (iEi & 1048575)) & (1 << (iEi >>> 20))) != 0;
        }
        int iP8 = P8(i);
        long j = iP8 & 1048575;
        switch ((iP8 & 267386880) >>> 20) {
            case 0:
                return a7.vy(t, j) != 0.0d;
            case 1:
                return a7.gW(t, j) != 0.0f;
            case 2:
                return a7.rN(t, j) != 0;
            case 3:
                return a7.rN(t, j) != 0;
            case 4:
                return a7.U2(t, j) != 0;
            case 5:
                return a7.rN(t, j) != 0;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return a7.U2(t, j) != 0;
            case UserTouchAction.CLICK_KIND /* 7 */:
                return a7.yS(t, j);
            case 8:
                Object objP8 = a7.P8(t, j);
                if (objP8 instanceof String) {
                    return !((String) objP8).isEmpty();
                }
                if (objP8 instanceof u2) {
                    return !u2.mb.equals(objP8);
                }
                throw new IllegalArgumentException();
            case 9:
                return a7.P8(t, j) != null;
            case 10:
                return !u2.mb.equals(a7.P8(t, j));
            case 11:
                return a7.U2(t, j) != 0;
            case 12:
                return a7.U2(t, j) != 0;
            case 13:
                return a7.U2(t, j) != 0;
            case 14:
                return a7.rN(t, j) != 0;
            case 15:
                return a7.U2(t, j) != 0;
            case 16:
                return a7.rN(t, j) != 0;
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                return a7.P8(t, j) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // com.google.android.gms.internal.measurement.c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DW(T r13, com.google.android.gms.internal.measurement.p7 r14) {
        /*
            Method dump skipped, instructions count: 2710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p5.DW(java.lang.Object, com.google.android.gms.internal.measurement.p7):void");
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final void FH(T t) {
        int i;
        int i2 = this.EQ;
        while (true) {
            i = this.we;
            if (i2 >= i) {
                break;
            }
            long jP8 = P8(this.tp[i2]) & 1048575;
            Object objP8 = a7.P8(t, jP8);
            if (objP8 != null) {
                a7.VH(t, jP8, this.XL.Hw(objP8));
            }
            i2++;
        }
        int length = this.tp.length;
        while (i < length) {
            this.J8.FH(t, this.tp[i]);
            i++;
        }
        this.Ws.aM(t);
        if (this.Zo) {
            this.QX.tp(t);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c1  */
    @Override // com.google.android.gms.internal.measurement.c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Hw(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p5.Hw(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final int VH(T t) {
        int i;
        int iZo;
        int length = this.j6.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iP8 = P8(i3);
            int i4 = this.j6[i3];
            long j = 1048575 & iP8;
            int iHashCode = 37;
            switch ((iP8 & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    iZo = g4.Zo(Double.doubleToLongBits(a7.vy(t, j)));
                    i2 = i + iZo;
                    break;
                case 1:
                    i = i2 * 53;
                    iZo = Float.floatToIntBits(a7.gW(t, j));
                    i2 = i + iZo;
                    break;
                case 2:
                    i = i2 * 53;
                    iZo = g4.Zo(a7.rN(t, j));
                    i2 = i + iZo;
                    break;
                case 3:
                    i = i2 * 53;
                    iZo = g4.Zo(a7.rN(t, j));
                    i2 = i + iZo;
                    break;
                case 4:
                    i = i2 * 53;
                    iZo = a7.U2(t, j);
                    i2 = i + iZo;
                    break;
                case 5:
                    i = i2 * 53;
                    iZo = g4.Zo(a7.rN(t, j));
                    i2 = i + iZo;
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    i = i2 * 53;
                    iZo = a7.U2(t, j);
                    i2 = i + iZo;
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    i = i2 * 53;
                    iZo = g4.tp(a7.yS(t, j));
                    i2 = i + iZo;
                    break;
                case 8:
                    i = i2 * 53;
                    iZo = ((String) a7.P8(t, j)).hashCode();
                    i2 = i + iZo;
                    break;
                case 9:
                    Object objP8 = a7.P8(t, j);
                    if (objP8 != null) {
                        iHashCode = objP8.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZo = a7.P8(t, j).hashCode();
                    i2 = i + iZo;
                    break;
                case 11:
                    i = i2 * 53;
                    iZo = a7.U2(t, j);
                    i2 = i + iZo;
                    break;
                case 12:
                    i = i2 * 53;
                    iZo = a7.U2(t, j);
                    i2 = i + iZo;
                    break;
                case 13:
                    i = i2 * 53;
                    iZo = a7.U2(t, j);
                    i2 = i + iZo;
                    break;
                case 14:
                    i = i2 * 53;
                    iZo = g4.Zo(a7.rN(t, j));
                    i2 = i + iZo;
                    break;
                case 15:
                    i = i2 * 53;
                    iZo = a7.U2(t, j);
                    i2 = i + iZo;
                    break;
                case 16:
                    i = i2 * 53;
                    iZo = g4.Zo(a7.rN(t, j));
                    i2 = i + iZo;
                    break;
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                    Object objP82 = a7.P8(t, j);
                    if (objP82 != null) {
                        iHashCode = objP82.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                case 19:
                case ProxyTextView.INPUTTYPE_date /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                case 34:
                case 35:
                case ProxyTextView.INPUTTYPE_time /* 36 */:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                    i = i2 * 53;
                    iZo = a7.P8(t, j).hashCode();
                    i2 = i + iZo;
                    break;
                case 50:
                    i = i2 * 53;
                    iZo = a7.P8(t, j).hashCode();
                    i2 = i + iZo;
                    break;
                case 51:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = g4.Zo(Double.doubleToLongBits(cn(t, j)));
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = Float.floatToIntBits(sh(t, j));
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = g4.Zo(dx(t, j));
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = g4.Zo(dx(t, j));
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = cb(t, j);
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = g4.Zo(dx(t, j));
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = cb(t, j);
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = g4.tp(sG(t, j));
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = ((String) a7.P8(t, j)).hashCode();
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = a7.P8(t, j).hashCode();
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = a7.P8(t, j).hashCode();
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = cb(t, j);
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = cb(t, j);
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = cb(t, j);
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
                case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = g4.Zo(dx(t, j));
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = cb(t, j);
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = g4.Zo(dx(t, j));
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (Mr(t, i4, i3)) {
                        i = i2 * 53;
                        iZo = a7.P8(t, j).hashCode();
                        i2 = i + iZo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i2 * 53) + this.Ws.u7(t).hashCode();
        return this.Zo ? (iHashCode2 * 53) + this.QX.gn(t).hashCode() : iHashCode2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0908 A[PHI: r6
      0x0908: PHI (r6v4 int) = 
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v13 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v14 int)
      (r6v1 int)
     binds: [B:256:0x0545, B:460:0x09b6, B:457:0x09ac, B:451:0x0990, B:448:0x097e, B:445:0x096f, B:442:0x0962, B:439:0x0955, B:435:0x094a, B:432:0x093f, B:429:0x0932, B:426:0x0925, B:423:0x0912, B:396:0x081e, B:390:0x0801, B:384:0x07e4, B:378:0x07c7, B:372:0x07a9, B:366:0x078b, B:360:0x076d, B:354:0x074f, B:348:0x0731, B:342:0x0713, B:336:0x06f5, B:330:0x06d7, B:324:0x06b9, B:318:0x069b, B:313:0x0667, B:310:0x065a, B:307:0x064a, B:304:0x063a, B:301:0x062a, B:298:0x061c, B:295:0x060f, B:292:0x0603, B:286:0x05e5, B:283:0x05d1, B:280:0x05bf, B:277:0x05af, B:274:0x059f, B:437:0x0951, B:271:0x0592, B:268:0x0584, B:265:0x0574, B:262:0x0564, B:419:0x0907, B:259:0x054e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Zo(T r20) {
        /*
            Method dump skipped, instructions count: 2904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p5.Zo(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.measurement.c6] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.measurement.c6] */
    @Override // com.google.android.gms.internal.measurement.c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean gn(T r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p5.gn(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final void j6(T t, T t2) {
        if (t2 == null) {
            throw null;
        }
        for (int i = 0; i < this.j6.length; i += 3) {
            int iP8 = P8(i);
            long j = 1048575 & iP8;
            int i2 = this.j6[i];
            switch ((iP8 & 267386880) >>> 20) {
                case 0:
                    if (yS(t2, i)) {
                        a7.Hw(t, j, a7.vy(t2, j));
                        SI(t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (yS(t2, i)) {
                        a7.v5(t, j, a7.gW(t2, j));
                        SI(t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (yS(t2, i)) {
                        a7.Zo(t, j, a7.rN(t2, j));
                        SI(t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (yS(t2, i)) {
                        a7.Zo(t, j, a7.rN(t2, j));
                        SI(t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (yS(t2, i)) {
                        a7.J8(t, j, a7.U2(t2, j));
                        SI(t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (yS(t2, i)) {
                        a7.Zo(t, j, a7.rN(t2, j));
                        SI(t, i);
                        break;
                    } else {
                        break;
                    }
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    if (yS(t2, i)) {
                        a7.J8(t, j, a7.U2(t2, j));
                        SI(t, i);
                        break;
                    } else {
                        break;
                    }
                case UserTouchAction.CLICK_KIND /* 7 */:
                    if (yS(t2, i)) {
                        a7.gn(t, j, a7.yS(t2, j));
                        SI(t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (yS(t2, i)) {
                        a7.VH(t, j, a7.P8(t2, j));
                        SI(t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    j3(t, t2, i);
                    break;
                case 10:
                    if (yS(t2, i)) {
                        a7.VH(t, j, a7.P8(t2, j));
                        SI(t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (yS(t2, i)) {
                        a7.J8(t, j, a7.U2(t2, j));
                        SI(t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (yS(t2, i)) {
                        a7.J8(t, j, a7.U2(t2, j));
                        SI(t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (yS(t2, i)) {
                        a7.J8(t, j, a7.U2(t2, j));
                        SI(t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (yS(t2, i)) {
                        a7.Zo(t, j, a7.rN(t2, j));
                        SI(t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (yS(t2, i)) {
                        a7.J8(t, j, a7.U2(t2, j));
                        SI(t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (yS(t2, i)) {
                        a7.Zo(t, j, a7.rN(t2, j));
                        SI(t, i);
                        break;
                    } else {
                        break;
                    }
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                    j3(t, t2, i);
                    break;
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                case 19:
                case ProxyTextView.INPUTTYPE_date /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                case 34:
                case 35:
                case ProxyTextView.INPUTTYPE_time /* 36 */:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                    this.J8.DW(t, t2, j);
                    break;
                case 50:
                    e6.VH(this.XL, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (Mr(t2, i2, i)) {
                        a7.VH(t, j, a7.P8(t2, j));
                        lg(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    er(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
                case 66:
                case 67:
                    if (Mr(t2, i2, i)) {
                        a7.VH(t, j, a7.P8(t2, j));
                        lg(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    er(t, t2, i);
                    break;
            }
        }
        if (this.gn) {
            return;
        }
        e6.gn(this.Ws, t, t2);
        if (this.Zo) {
            e6.Zo(this.QX, t, t2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x05ca A[LOOP:6: B:174:0x05c6->B:176:0x05ca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05d7  */
    @Override // com.google.android.gms.internal.measurement.c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u7(T r13, com.google.android.gms.internal.measurement.b6 r14, com.google.android.gms.internal.measurement.r3 r15) {
        /*
            Method dump skipped, instructions count: 1644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p5.u7(java.lang.Object, com.google.android.gms.internal.measurement.b6, com.google.android.gms.internal.measurement.r3):void");
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final T v5() {
        return (T) this.J0.j6(this.v5);
    }
}
