package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.collections.FunctionOfIntInt;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;

@cy(clazz = -122194371740524675L, container = -122194371740524675L, user = true)
/* loaded from: classes.dex */
public class IdentifierSpace {

    @dy(field = -935927603028133639L)
    private static final int[] J0;

    @fy
    private static /* synthetic */ boolean J8;

    @gy
    private static /* synthetic */ boolean Ws;

    @dy(field = 1303828783504652264L)
    private int[] DW;

    @dy(field = -102722313260346857L)
    private char[] EQ;

    @dy(field = -302910834702503680L)
    private int FH;

    @dy(field = 225440240878487397L)
    private int Hw;

    @dy(field = 3260179818540782679L)
    private int[] VH;

    @dy(field = 2717003800290709696L)
    private int Zo;

    @dy(field = 2427004073091226564L)
    private char[] gn;

    @dy(field = 1763454534026496861L)
    private int[] j6;

    @dy(field = -1459245170108443003L)
    private FunctionOfIntInt tp;

    @dy(field = 2322217670308795116L)
    private FunctionOfIntInt u7;

    @dy(field = 2986085790793717368L)
    private byte[] v5;

    @dy(field = 327509386357912844L)
    private char[] we;

    static {
        try {
            iy.Zo(IdentifierSpace.class);
            if (J8) {
                iy.gn(-2973994432306388845L, null);
            }
            J0 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, ProxyTextView.INPUTTYPE_textAutoComplete, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -2973994432306388845L, null);
            }
            throw th;
        }
    }

    @ey(method = 1822221391864703256L)
    public IdentifierSpace() {
        try {
            if (J8) {
                iy.gn(-3915973153065634720L, null);
            }
            this.u7 = new FunctionOfIntInt();
            this.tp = new FunctionOfIntInt();
            this.EQ = new char[100];
            this.we = new char[1000];
            this.Hw = 0;
            this.j6 = new int[J0[0]];
            this.DW = new int[J0[0]];
            this.FH = 0;
            this.v5 = new byte[10000];
            int i = 1;
            this.Zo = 1;
            this.VH = new int[123];
            int i2 = 97;
            while (i2 <= 122) {
                this.VH[i2] = i;
                i2++;
                i++;
            }
            int i3 = 65;
            while (i3 <= 90) {
                this.VH[i3] = i;
                i3++;
                i++;
            }
            int i4 = 48;
            while (i4 <= 57) {
                this.VH[i4] = i;
                i4++;
                i++;
            }
            this.VH[95] = i;
            this.gn = new char[64];
            for (int i5 = 0; i5 < this.VH.length; i5++) {
                this.gn[this.VH[i5]] = (char) i5;
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -3915973153065634720L, null);
            }
            throw th;
        }
    }

    @ey(method = 3508593175545288724L)
    private boolean DW(int i, char[] cArr, int i2, int i3) {
        int i4;
        try {
            if (J8) {
                iy.J0(-1703708160364776563L, this, new Integer(i), cArr, new Integer(i2), new Integer(i3));
            }
            int i5 = i2 + i3;
            int i6 = i;
            int i7 = i2;
            while (i7 < i5) {
                char c = cArr[i7];
                if (c != 0) {
                    if (c < 1 || c > 127) {
                        break;
                    }
                    byte b = (byte) c;
                    int i8 = i6 + 1;
                    if (b != this.v5[i6]) {
                        return false;
                    }
                    i7++;
                    i6 = i8;
                } else {
                    return false;
                }
            }
            while (i7 < i5) {
                char c2 = cArr[i7];
                if (c2 == 0) {
                    return false;
                }
                if (c2 < 1 || c2 > 127) {
                    if (c2 > 2047) {
                        int i9 = i6 + 1;
                        if (((byte) (((c2 >> '\f') & 15) | 224)) != this.v5[i6]) {
                            return false;
                        }
                        int i10 = i9 + 1;
                        if (((byte) (((c2 >> 6) & 63) | 128)) != this.v5[i9]) {
                            return false;
                        }
                        i4 = i10 + 1;
                        if (((byte) (((c2 >> 0) & 63) | 128)) != this.v5[i10]) {
                            return false;
                        }
                    } else {
                        int i11 = i6 + 1;
                        if (((byte) (((c2 >> 6) & 31) | 192)) != this.v5[i6]) {
                            return false;
                        }
                        i4 = i11 + 1;
                        if (((byte) (((c2 >> 0) & 63) | 128)) != this.v5[i11]) {
                            return false;
                        }
                    }
                    i6 = i4;
                } else {
                    int i12 = i6 + 1;
                    if (((byte) c2) != this.v5[i6]) {
                        return false;
                    }
                    i6 = i12;
                }
                i7++;
            }
            return this.v5[i6] == 0;
        } catch (Throwable th) {
            if (Ws) {
                iy.a8(th, -1703708160364776563L, this, new Integer(i), cArr, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -54663386543517240L)
    private void gn(int i) {
        try {
            if (J8) {
                iy.u7(6680722998743942245L, this, i);
            }
            int i2 = Integer.MAX_VALUE & i;
            int length = i2 % this.j6.length;
            int length2 = (i2 % (this.j6.length - 2)) + 1;
            int i3 = this.j6[length];
            while (i3 != 0) {
                length = (length + length2) % this.j6.length;
                i3 = this.j6[length];
            }
            this.j6[length] = i;
            this.DW[length] = this.Zo;
            int i4 = this.FH + 1;
            this.FH = i4;
            if (i4 * 2 > this.j6.length) {
                we();
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 6680722998743942245L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1193726052961794675L)
    private void u7(char[] cArr, int i, int i2) {
        char c;
        try {
            if (J8) {
                iy.we(-1062328140263910096L, this, cArr, new Integer(i), new Integer(i2));
            }
            while (this.Zo + (i2 * 3) + 1 >= this.v5.length) {
                byte[] bArr = new byte[(this.v5.length * 2) + 1];
                System.arraycopy(this.v5, 0, bArr, 0, this.v5.length);
                this.v5 = bArr;
            }
            int i3 = i + i2;
            int i4 = i;
            while (i4 < i3 && (c = cArr[i4]) >= 1 && c <= 127) {
                byte[] bArr2 = this.v5;
                int i5 = this.Zo;
                this.Zo = i5 + 1;
                bArr2[i5] = (byte) c;
                i4++;
            }
            while (i4 < i3) {
                char c2 = cArr[i4];
                if (c2 >= 1 && c2 <= 127) {
                    byte[] bArr3 = this.v5;
                    int i6 = this.Zo;
                    this.Zo = i6 + 1;
                    bArr3[i6] = (byte) c2;
                } else if (c2 > 2047) {
                    byte[] bArr4 = this.v5;
                    int i7 = this.Zo;
                    int i8 = i7 + 1;
                    this.Zo = i8;
                    bArr4[i7] = (byte) (((c2 >> '\f') & 15) | 224);
                    byte[] bArr5 = this.v5;
                    int i9 = i8 + 1;
                    this.Zo = i9;
                    bArr5[i8] = (byte) (((c2 >> 6) & 63) | 128);
                    byte[] bArr6 = this.v5;
                    this.Zo = i9 + 1;
                    bArr6[i9] = (byte) (((c2 >> 0) & 63) | 128);
                } else {
                    byte[] bArr7 = this.v5;
                    int i10 = this.Zo;
                    int i11 = i10 + 1;
                    this.Zo = i11;
                    bArr7[i10] = (byte) (((c2 >> 6) & 31) | 192);
                    byte[] bArr8 = this.v5;
                    this.Zo = i11 + 1;
                    bArr8[i11] = (byte) (((c2 >> 0) & 63) | 128);
                }
                i4++;
            }
            byte[] bArr9 = this.v5;
            int i12 = this.Zo;
            this.Zo = i12 + 1;
            bArr9[i12] = 0;
        } catch (Throwable th) {
            if (Ws) {
                iy.U2(th, -1062328140263910096L, this, cArr, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 2658449755744136523L)
    private void we() {
        try {
            if (J8) {
                iy.gn(1873173456900017016L, this);
            }
            int i = this.Hw + 1;
            this.Hw = i;
            int i2 = J0[i];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[J0[i]];
            for (int i3 = 0; i3 < this.j6.length; i3++) {
                int i4 = this.j6[i3];
                if (i4 != 0) {
                    int i5 = Integer.MAX_VALUE & i4;
                    int i6 = (i5 % (i2 - 2)) + 1;
                    int i7 = i5 % i2;
                    while (iArr[i7] != 0) {
                        i7 = (i7 + i6) % i2;
                    }
                    iArr[i7] = i4;
                    iArr2[i7] = this.DW[i3];
                }
            }
            this.j6 = iArr;
            this.DW = iArr2;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 1873173456900017016L, this);
            }
            throw th;
        }
    }

    @ey(method = -8424886092176175600L)
    public int Hw(String str, int i, int i2) {
        try {
            if (J8) {
                iy.we(4561575622972308969L, this, str, new Integer(i), new Integer(i2));
            }
            return v5(str.toCharArray(), i, i2);
        } catch (Throwable th) {
            if (Ws) {
                iy.U2(th, 4561575622972308969L, this, str, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -598284160615387360L)
    public int J8(int i, int i2, int i3) {
        try {
            if (J8) {
                iy.we(3449993703319377531L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            while (Zo(i, this.we, 0) == -1) {
                this.we = new char[(this.we.length * 2) + 1];
            }
            return v5(this.we, i2, i3 - i2);
        } catch (Throwable th) {
            if (Ws) {
                iy.U2(th, 3449993703319377531L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 2534060571777679420L)
    public int QX(int i) {
        int iZo;
        try {
            if (J8) {
                iy.u7(-788227650164528319L, this, i);
            }
            int i2 = this.u7.get(i);
            if (i2 != -1) {
                return i2;
            }
            while (true) {
                iZo = Zo(i, this.EQ, 0);
                if (iZo != -1) {
                    break;
                }
                this.EQ = new char[(this.EQ.length * 2) + 1];
            }
            for (int i3 = 0; i3 < iZo; i3++) {
                this.EQ[i3] = Character.toUpperCase(this.EQ[i3]);
            }
            int iV5 = v5(this.EQ, 0, iZo);
            this.u7.Zo(i, iV5);
            return iV5;
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, -788227650164528319L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2214745295052823165L)
    public int Ws(int i) {
        int iZo;
        try {
            if (J8) {
                iy.u7(70610650726928520L, this, i);
            }
            int i2 = this.tp.get(i);
            if (i2 != -1) {
                return i2;
            }
            while (true) {
                iZo = Zo(i, this.EQ, 0);
                if (iZo != -1) {
                    break;
                }
                this.EQ = new char[(this.EQ.length * 2) + 1];
            }
            for (int i3 = 0; i3 < iZo; i3++) {
                this.EQ[i3] = Character.toLowerCase(this.EQ[i3]);
            }
            int iV5 = v5(this.EQ, 0, iZo);
            this.tp.Zo(i, iV5);
            return iV5;
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 70610650726928520L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2777442720734051123L)
    public int Zo(int i, char[] cArr, int i2) throws Throwable {
        Throwable th;
        try {
            if (J8) {
                iy.we(-3314280624181768584L, this, new Integer(i), cArr, new Integer(i2));
            }
            if ((i & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                int i3 = i2 + 1;
                if (i3 >= cArr.length) {
                    return -1;
                }
                try {
                    cArr[i2] = (char) (Integer.MAX_VALUE & i);
                    return i3;
                } catch (Throwable th2) {
                    th = th2;
                    i2 = i3;
                }
            } else {
                if ((i & 1073741824) != 1073741824) {
                    int i4 = i;
                    while (i4 < this.Zo) {
                        int i5 = i4 + 1;
                        int i6 = this.v5[i4] & 255;
                        if (i6 == 0) {
                            return i2;
                        }
                        if (i2 >= cArr.length) {
                            return -1;
                        }
                        switch (i6 >> 4) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                            case UserTouchAction.CLICK_KIND /* 7 */:
                                int i7 = i2 + 1;
                                try {
                                    cArr[i2] = (char) i6;
                                    i2 = i7;
                                    i4 = i5;
                                    continue;
                                } catch (Throwable th3) {
                                    th = th3;
                                    i2 = i7;
                                    break;
                                }
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            default:
                                throw new RuntimeException("Malformed input");
                            case 12:
                            case 13:
                                if (i5 >= this.Zo) {
                                    throw new RuntimeException("End index not on boundary");
                                }
                                int i8 = i5 + 1;
                                int i9 = i2 + 1;
                                try {
                                    cArr[i2] = (char) (((i6 & 31) << 6) | (this.v5[i5] & 255 & 63));
                                    i2 = i9;
                                    i4 = i8;
                                    continue;
                                } catch (Throwable th4) {
                                    th = th4;
                                    i2 = i9;
                                    break;
                                }
                            case 14:
                                int i10 = i5 + 1;
                                if (i10 >= this.Zo) {
                                    throw new RuntimeException("End index not on boundary");
                                }
                                int i11 = i10 + 1;
                                int i12 = i2 + 1;
                                try {
                                    cArr[i2] = (char) (((i6 & 15) << 12) | (((this.v5[i5] & 255) & 63) << 6) | (((this.v5[i10] & 255) & 63) << 0));
                                    i2 = i12;
                                    i4 = i11;
                                    continue;
                                } catch (Throwable th5) {
                                    th = th5;
                                    i2 = i12;
                                    break;
                                }
                        }
                    }
                    return i2;
                }
                int i13 = i & (-1073741825);
                int i14 = i13;
                int i15 = 0;
                for (int i16 = 0; i16 < 5 && i14 != 0; i16++) {
                    i15++;
                    i14 >>= 6;
                }
                int i17 = i2 + i15;
                try {
                    if (i17 >= cArr.length) {
                        return -1;
                    }
                    for (int i18 = 0; i18 < i15; i18++) {
                        int i19 = i13 & 63;
                        if (i19 == 0) {
                            break;
                        }
                        cArr[(i17 - i18) - 1] = this.gn[i19];
                        i13 >>= 6;
                    }
                    return i17;
                } catch (Throwable th6) {
                    th = th6;
                    i = i14;
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
        if (!Ws) {
            throw th;
        }
        iy.U2(th, -3314280624181768584L, this, new Integer(i), cArr, new Integer(i2));
        throw th;
    }

    @ey(method = 1843414505413015324L)
    public int get(String str) {
        try {
            if (J8) {
                iy.tp(-5044843227435787853L, this, str);
            }
            return Hw(str, 0, str.length());
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, -5044843227435787853L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -389364562583431644L)
    public String getString(int i) {
        try {
            if (J8) {
                iy.u7(-1085926640182587315L, this, i);
            }
            if ((i & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                return String.valueOf((char) (Integer.MAX_VALUE & i));
            }
            if ((i & 1073741824) == 1073741824) {
                int i2 = i & (-1073741825);
                char[] cArr = new char[5];
                int i3 = 0;
                for (int i4 = 0; i4 < 5; i4++) {
                    int i5 = i2 & 63;
                    if (i5 == 0) {
                        break;
                    }
                    i3++;
                    cArr[5 - i3] = this.gn[i5];
                    i2 >>= 6;
                }
                return new String(cArr, 5 - i3, i3);
            }
            StringBuffer stringBuffer = new StringBuffer();
            int i6 = i;
            while (i6 < this.Zo) {
                int i7 = i6 + 1;
                int i8 = this.v5[i6] & 255;
                if (i8 == 0) {
                    return stringBuffer.toString();
                }
                switch (i8 >> 4) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    case UserTouchAction.CLICK_KIND /* 7 */:
                        stringBuffer.append((char) i8);
                        i6 = i7;
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    default:
                        throw new RuntimeException("Malformed input");
                    case 12:
                    case 13:
                        if (i7 >= this.Zo) {
                            throw new RuntimeException("End index not on boundary");
                        }
                        stringBuffer.append((char) (((i8 & 31) << 6) | (this.v5[i7] & 255 & 63)));
                        i6 = i7 + 1;
                        break;
                    case 14:
                        int i9 = i7 + 1;
                        if (i9 >= this.Zo) {
                            throw new RuntimeException("End index not on boundary");
                        }
                        stringBuffer.append((char) (((i8 & 15) << 12) | (((this.v5[i7] & 255) & 63) << 6) | (((this.v5[i9] & 255) & 63) << 0)));
                        i6 = i9 + 1;
                        break;
                }
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, -1085926640182587315L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2506523924136975307L)
    public void j6() {
        try {
            if (J8) {
                iy.gn(-637993642939666416L, this);
            }
            if (this.FH > 0) {
                for (int i = 0; i < this.j6.length; i++) {
                    this.j6[i] = 0;
                }
                this.FH = 0;
            }
            this.Zo = 1;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -637993642939666416L, this);
            }
            throw th;
        }
    }

    @ey(method = 1793090009290271328L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (J8) {
                iy.tp(6754926117454839169L, this, storeInputStream);
            }
            this.Hw = storeInputStream.readInt();
            this.FH = storeInputStream.readInt();
            this.j6 = new int[J0[this.Hw]];
            this.DW = new int[J0[this.Hw]];
            for (int i = 0; i < this.j6.length; i++) {
                this.j6[i] = storeInputStream.readInt();
            }
            for (int i2 = 0; i2 < this.j6.length; i2++) {
                this.DW[i2] = storeInputStream.readInt();
            }
            int i3 = storeInputStream.readInt();
            this.Zo = i3;
            this.v5 = new byte[(i3 * 5) / 4];
            for (int i4 = 0; i4 < this.Zo; i4++) {
                this.v5[i4] = storeInputStream.readByte();
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 6754926117454839169L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = 8305918492577391024L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (J8) {
                iy.tp(801570383654669345L, this, storeOutputStream);
            }
            storeOutputStream.writeInt(this.Hw);
            storeOutputStream.writeInt(this.FH);
            for (int i = 0; i < this.j6.length; i++) {
                storeOutputStream.writeInt(this.j6[i]);
            }
            for (int i2 = 0; i2 < this.j6.length; i2++) {
                storeOutputStream.writeInt(this.DW[i2]);
            }
            storeOutputStream.writeInt(this.Zo);
            for (int i3 = 0; i3 < this.Zo; i3++) {
                storeOutputStream.writeByte(this.v5[i3]);
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 801570383654669345L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = 71690894037996975L)
    public int tp(int i) {
        try {
            if (J8) {
                iy.u7(-2454454409732418944L, this, i);
            }
            while (true) {
                int iZo = Zo(i, this.we, 0);
                if (iZo != -1) {
                    return iZo;
                }
                this.we = new char[(this.we.length * 2) + 1];
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, -2454454409732418944L, this, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    @abcd.ey(method = 2710174405692434076L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int v5(char[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.api.IdentifierSpace.v5(char[], int, int):int");
    }
}
