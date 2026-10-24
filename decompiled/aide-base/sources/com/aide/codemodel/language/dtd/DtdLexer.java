package com.aide.codemodel.language.dtd;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.Lexer;
import java.io.Reader;

@cy(clazz = -1544218050563929728L, container = -1544218050563929728L, user = true)
/* loaded from: classes.dex */
public class DtdLexer implements Lexer {

    @dy(field = -906607264008198952L)
    private static final String[] Mr;

    @dy(field = -2796428388144830643L)
    private static final char[] QX;

    @dy(field = -3770219587815553740L)
    private static final int[] U2;

    @dy(field = 3137631689391342104L)
    private static final int[] XL;

    @fy
    private static /* synthetic */ boolean a8;

    @dy(field = -111668282242972840L)
    private static final int[] aM;

    @dy(field = -2797821734010489676L)
    private static final int[] j3;

    @gy
    private static /* synthetic */ boolean lg;

    @dy(field = 895163658410377776L)
    private int DW;

    @dy(field = 35602415223044796L)
    private boolean EQ;

    @dy(field = 4106947828183622964L)
    private int FH;

    @dy(field = 2898264610176519295L)
    private char[] Hw;

    @dy(field = -6943104060401631680L)
    private int J0;

    @dy(field = 220431519461647196L)
    private int J8;

    @dy(field = 4722822375958434800L)
    private int VH;

    @dy(field = 4283898050595940580L)
    private boolean Ws;

    @dy(field = -3055202784005635904L)
    private int Zo;

    @dy(field = -3761518107541408293L)
    private int gn;

    @dy(field = -3267854585494839432L)
    private Reader j6;

    @dy(field = 983790817860047931L)
    private int tp;

    @dy(field = 3549662687267097492L)
    private int u7;

    @dy(field = 2246199378455003199L)
    private int v5;

    @dy(field = 4156711898299055253L)
    private int we;

    static {
        try {
            iy.Zo(DtdLexer.class);
            if (a8) {
                iy.gn(194383450665166112L, null);
            }
            QX = Ws("\t\u0000\u0001\u0001\u0001\u0001\u0002\u0000\u0001\u0001\u0012\u0000\u0001\u0001\u0001\n\u0001 \u0001\u0006\u0001\u0000\u0001\u0015\u0001\u0005\u0001\u001f\u0001!\u0001\"\u0001#\u0001$\u0001&\u0001\u0004\u0001\u0003\u0001\u0000\n\u0003\u0001\u0002\u0001\u0007\u0001\t\u0001\u0000\u0001\u0018\u0001\u0019\u0001\u0000\u0001\u0012\u0001\u0002\u0001\u001a\u0001\u001c\u0001\u000b\u0001)\u0001\u001d\u0001\u0002\u0001\u000e\u0002\u0002\u0001\u0010\u0001\u0011\u0001\f\u0001\u0014\u0001(\u0001'\u0001\u001e\u0001\u0013\u0001\r\u0001\u001b\u0002\u0002\u0001\b\u0001\u000f\u0001\u0002\u0001\u0016\u0001\u0000\u0001\u0017\u0001\u0000\u0001\u0002\u0001\u0000\u0001\u0012\u0001\u0002\u0001\u001a\u0001\u001c\u0001\u000b\u0001)\u0001\u001d\u0001\u0002\u0001\u000e\u0002\u0002\u0001\u0010\u0001\u0011\u0001\f\u0001\u0014\u0001(\u0001'\u0001\u001e\u0001\u0013\u0001\r\u0001\u001b\u0002\u0002\u0001\b\u0001\u000f\u0001\u0002\u0001\u0000\u0001%:\u0000\u0001\u0003\b\u0000\u0017\u0002\u0001\u0000\u001f\u0002\u0001\u0000\b\u00022\u0002\u0002\u0000\u000b\u0002\u0002\u0000\b\u0002\u0001\u00005\u0002\u0001\u0000D\u0002\t\u0000$\u0002\u0003\u0000\u0002\u0002\u0004\u0000\u001e\u00028\u0000Y\u0002\u0012\u0000\u0007\u0002\u000e\u0000\u0001\u0003\u0001\u0003.\u0000F\u0003\u001a\u0000\u0002\u0003$\u0000\u0001\u0002\u0001\u0003\u0003\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u000b\u0002\u0001\u0002\b\u0002\u0001\u0000\t\u0002\u0001\u0002\u001c\u0002\u0001\u0002\u0002\u0002\u0001\u0002\u0002\u0002\u0001\u0000\u0007\u0002\u0003\u0000\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0012\u0002\r\u0000\f\u0002\u0001\u0000B\u0002\u0001\u0000\f\u0002\u0001\u0000$\u0002\u0001\u0000\u0004\u0003\t\u00005\u0002\u0002\u0000\u0002\u0002\u0002\u0000\u0002\u0002\u0003\u0000\u001c\u0002\u0002\u0000\b\u0002\u0002\u0000\u0002\u00027\u0000&\u0002\u0002\u0000\u0001\u0002\u0007\u0000&\u0002\n\u0000\u0011\u0003\u0001\u0000\u0017\u0003\u0001\u0000\u0003\u0003\u0001\u0000\u0001\u0003\u0001\u0000\u0002\u0003\u0001\u0000\u0001\u0003\u000b\u0000\u001b\u0002\u0005\u0000\u0003\u0002.\u0000\u001a\u0002\u0005\u0000\u0001\u0003\n\u0002\b\u0003\r\u0000\n\u0003\u0006\u0000\u0001\u0003G\u0002\u0002\u0000\u0005\u0002\u0001\u0000\u000f\u0002\u0001\u0000\u0004\u0002\u0001\u0000\u0001\u0002\u0007\u0003\u0003\u0003\u0005\u0003\u0002\u0002\u0002\u0003\u0001\u0000\u0004\u0003\u0002\u0000\n\u0003ȇ\u0000\u0003\u0003\u0001\u00005\u0002\u0002\u0000\u0001\u0003\u0001\u0002\u000f\u0003\u0001\u0003\u0003\u0000\u0004\u0003\u0003\u0000\n\u0002\u0002\u0003\u0002\u0000\n\u0003\u0011\u0000\u0003\u0003\u0001\u0000\b\u0002\u0002\u0000\u0002\u0002\u0002\u0000\u0016\u0002\u0001\u0000\u0007\u0002\u0001\u0000\u0001\u0002\u0003\u0000\u0004\u0002\u0002\u0000\u0001\u0003\u0001\u0000\u0001\u0003\u0001\u0003\u0005\u0003\u0002\u0000\u0002\u0003\u0002\u0000\u0003\u0003\t\u0000\u0001\u0003\u0004\u0000\u0002\u0002\u0001\u0000\u0003\u0002\u0002\u0003\u0002\u0000\n\u0003\u0002\u0002\u0010\u0000\u0001\u0003\u0002\u0000\u0006\u0002\u0004\u0000\u0002\u0002\u0002\u0000\u0016\u0002\u0001\u0000\u0007\u0002\u0001\u0000\u0002\u0002\u0001\u0000\u0002\u0002\u0001\u0000\u0002\u0002\u0002\u0000\u0001\u0003\u0001\u0000\u0001\u0003\u0001\u0003\u0003\u0003\u0004\u0000\u0002\u0003\u0002\u0000\u0003\u0003\u000b\u0000\u0004\u0002\u0001\u0000\u0001\u0002\u0007\u0000\n\u0003\u0002\u0003\u0003\u0002\f\u0000\u0003\u0003\u0001\u0000\u0007\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u0003\u0002\u0001\u0000\u0016\u0002\u0001\u0000\u0007\u0002\u0001\u0000\u0002\u0002\u0001\u0000\u0005\u0002\u0002\u0000\u0001\u0003\u0001\u0002\b\u0003\u0001\u0000\u0003\u0003\u0001\u0000\u0003\u0003\u0012\u0000\u0001\u0002\u0005\u0000\n\u0003\u0011\u0000\u0003\u0003\u0001\u0000\b\u0002\u0002\u0000\u0002\u0002\u0002\u0000\u0016\u0002\u0001\u0000\u0007\u0002\u0001\u0000\u0002\u0002\u0002\u0000\u0004\u0002\u0002\u0000\u0001\u0003\u0001\u0002\u0006\u0003\u0003\u0000\u0002\u0003\u0002\u0000\u0003\u0003\b\u0000\u0002\u0003\u0004\u0000\u0002\u0002\u0001\u0000\u0003\u0002\u0004\u0000\n\u0003\u0012\u0000\u0002\u0003\u0001\u0000\u0006\u0002\u0003\u0000\u0003\u0002\u0001\u0000\u0004\u0002\u0003\u0000\u0002\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u0002\u0002\u0003\u0000\u0002\u0002\u0003\u0000\u0003\u0002\u0003\u0000\b\u0002\u0001\u0000\u0003\u0002\u0004\u0000\u0005\u0003\u0003\u0000\u0003\u0003\u0001\u0000\u0004\u0003\t\u0000\u0001\u0003\u000f\u0000\t\u0003\u0011\u0000\u0003\u0003\u0001\u0000\b\u0002\u0001\u0000\u0003\u0002\u0001\u0000\u0017\u0002\u0001\u0000\n\u0002\u0001\u0000\u0005\u0002\u0004\u0000\u0007\u0003\u0001\u0000\u0003\u0003\u0001\u0000\u0004\u0003\u0007\u0000\u0002\u0003\t\u0000\u0002\u0002\u0004\u0000\n\u0003\u0012\u0000\u0002\u0003\u0001\u0000\b\u0002\u0001\u0000\u0003\u0002\u0001\u0000\u0017\u0002\u0001\u0000\n\u0002\u0001\u0000\u0005\u0002\u0004\u0000\u0007\u0003\u0001\u0000\u0003\u0003\u0001\u0000\u0004\u0003\u0007\u0000\u0002\u0003\u0007\u0000\u0001\u0002\u0001\u0000\u0002\u0002\u0004\u0000\n\u0003\u0012\u0000\u0002\u0003\u0001\u0000\b\u0002\u0001\u0000\u0003\u0002\u0001\u0000\u0017\u0002\u0001\u0000\u0010\u0002\u0004\u0000\u0006\u0003\u0002\u0000\u0003\u0003\u0001\u0000\u0004\u0003\t\u0000\u0001\u0003\b\u0000\u0002\u0002\u0004\u0000\n\u0003\u0091\u0000.\u0002\u0001\u0000\u0001\u0002\u0001\u0003\u0002\u0002\u0007\u0003\u0005\u0000\u0006\u0002\u0001\u0003\b\u0003\u0001\u0000\n\u0003'\u0000\u0002\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0001\u0002\u0006\u0000\u0004\u0002\u0001\u0000\u0007\u0002\u0001\u0000\u0003\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001\u0000\u0002\u0002\u0001\u0000\u0001\u0002\u0001\u0003\u0002\u0002\u0006\u0003\u0001\u0000\u0002\u0003\u0001\u0002\u0002\u0000\u0005\u0002\u0001\u0000\u0001\u0003\u0001\u0000\u0006\u0003\u0002\u0000\n\u0003>\u0000\u0002\u0003\u0006\u0000\n\u0003\u000b\u0000\u0001\u0003\u0001\u0000\u0001\u0003\u0001\u0000\u0001\u0003\u0004\u0000\u0001\u0003\u0001\u0003\b\u0002\u0001\u0000!\u0002\u0007\u0000\u0014\u0003\u0001\u0000\u0006\u0003\u0004\u0000\u0006\u0003\u0001\u0000\u0001\u0003\u0001\u0000\u0015\u0003\u0003\u0000\u0007\u0003\u0001\u0000\u0001\u0003æ\u0000&\u0002\n\u0000'\u0002\t\u0000\u0001\u0002\u0001\u0000\u0002\u0002\u0001\u0000\u0003\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u0002\u0002\u0001\u0000\u0005\u0002)\u0000\u0001\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u0001\u0002\u000b\u0000\u0001\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u0001\u0002\u0003\u0000\u0002\u0002\u0003\u0000\u0001\u0002\u0005\u0000\u0003\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u0001\u0002\u0003\u0000\u0002\u0002\u0003\u0000\u0002\u0002\u0001\u0000\u0001\u0002(\u0000\u0001\u0002\t\u0000\u0001\u0002\u0002\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0007\u0000\u0002\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u0007\u0002(\u0000\u0001\u0002\u0004\u0000\u0001\u0002\b\u0000\u0001\u0002ఆ\u0000\u009c\u0002\u0004\u0000Z\u0002\u0006\u0000\u0016\u0002\u0002\u0000\u0006\u0002\u0002\u0000&\u0002\u0002\u0000\u0006\u0002\u0002\u0000\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0002\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u001f\u0002\u0002\u00005\u0002\u0001\u0000\u0007\u0002\u0001\u0000\u0001\u0002\u0003\u0000\u0003\u0002\u0001\u0000\u0007\u0002\u0003\u0000\u0004\u0002\u0002\u0000\u0006\u0002\u0004\u0000\r\u0002\u0005\u0000\u0003\u0002\u0001\u0000\u0007\u0002Ó\u0000\r\u0003\u0004\u0000\u0001\u0003D\u0000\u0001\u0002\u0003\u0000\u0002\u0002\u0002\u0000\u0001\u0002Q\u0000\u0003\u0002ຂ\u0000\u0001\u0003\u0001\u0000\u0001\u0002\u0019\u0000\t\u0002\u0006\u0003\u0001\u0000\u0005\u0003\u000b\u0000T\u0002\u0004\u0000\u0001\u0003\u0001\u0003\u0002\u0000\u0002\u0003\u0002\u0000Z\u0002\u0001\u0000\u0003\u0003\u0006\u0000(\u0002᳓\u0000冦\u0002ౚ\u0000⮤\u0002\\\u0000ࠀ\u0000῾\u0000\u0002\u0000");
            XL = we();
            aM = XL();
            j3 = j3();
            Mr = new String[]{"Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};
            U2 = J8();
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, 194383450665166112L, null);
            }
            throw th;
        }
    }

    @ey(method = 3125637786029536000L)
    public DtdLexer(Reader reader) {
        try {
            if (a8) {
                iy.tp(-472973320040170368L, null, reader);
            }
            this.FH = 0;
            this.Hw = new char[8192];
            this.we = -1;
            this.J0 = -1;
            this.J8 = 0;
            this.j6 = reader;
        } catch (Throwable th) {
            if (lg) {
                iy.j3(th, -472973320040170368L, null, reader);
            }
            throw th;
        }
    }

    @ey(method = 3003310022554125400L)
    private static int EQ(String str, int i, int[] iArr) {
        int i2;
        try {
            if (a8) {
                iy.we(1144545662728498632L, null, str, new Integer(i), iArr);
            }
            int i3 = 0;
            int length = str.length();
            int i4 = i;
            while (i3 < length) {
                int i5 = i3 + 1;
                int iCharAt = str.charAt(i3);
                int i6 = i5 + 1;
                char cCharAt = str.charAt(i5);
                while (true) {
                    i2 = i4 + 1;
                    iArr[i4] = cCharAt;
                    iCharAt--;
                    if (iCharAt <= 0) {
                        break;
                    }
                    i4 = i2;
                }
                i3 = i6;
                i4 = i2;
            }
            return i4;
        } catch (Throwable th) {
            if (lg) {
                iy.U2(th, 1144545662728498632L, null, str, new Integer(i), iArr);
            }
            throw th;
        }
    }

    @ey(method = 7423600724689527872L)
    private static int J0(String str, int i, int[] iArr) {
        int i2;
        try {
            if (a8) {
                iy.we(-2939326190056005980L, null, str, new Integer(i), iArr);
            }
            int i3 = 0;
            int length = str.length();
            int i4 = i;
            while (i3 < length) {
                int i5 = i3 + 1;
                int iCharAt = str.charAt(i3);
                int i6 = i5 + 1;
                char cCharAt = str.charAt(i5);
                while (true) {
                    i2 = i4 + 1;
                    iArr[i4] = cCharAt;
                    iCharAt--;
                    if (iCharAt <= 0) {
                        break;
                    }
                    i4 = i2;
                }
                i3 = i6;
                i4 = i2;
            }
            return i4;
        } catch (Throwable th) {
            if (lg) {
                iy.U2(th, -2939326190056005980L, null, str, new Integer(i), iArr);
            }
            throw th;
        }
    }

    @ey(method = 2435826583225981416L)
    private static int[] J8() {
        try {
            if (a8) {
                iy.gn(-6274842115918904928L, null);
            }
            int[] iArr = new int[139];
            J0("\u0005\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\t\u0002\u0001\u0001\t\u0001\u0001\u0001\t\u0004\u0001\u0003\t\u0002\u0001\u0004\t\u0003\u0001\u0001\t\u0001\u0001\n\t\u0002\u0001\u0001\t\u0001\u0001\u0002\t\u0003\u0001\u0001\u0000\u0001\u0001\u0002\u0000\u0001\t\u0001\u0000\u0002\u0001\u0004\u0000\u0001\t\u0002\u0001\u0006\u0000\u0001\t\u0001\u0000\u0001\t\u0001\u0000\u0001\t\u0004\u0000\u0002\u0001\u0003\t\t\u0000\u0002\u0001\u0004\u0000\u0001\t\u0004\u0000\u0002\u0001\u0007\u0000\u0001\t\u0002\u0001\u0006\u0000\u0001\t\u0001\u0001\u0001\t\u0003\u0000\u0001\t\u0001\u0000\u0001\t\u0001\u0000\u0003\t", 0, iArr);
            return iArr;
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, -6274842115918904928L, null);
            }
            throw th;
        }
    }

    @ey(method = 2062521935789897712L)
    private static int QX(String str, int i, int[] iArr) {
        try {
            if (a8) {
                iy.we(369561604885581960L, null, str, new Integer(i), iArr);
            }
            int i2 = 0;
            int length = str.length();
            int i3 = i;
            while (i2 < length) {
                int i4 = i2 + 1;
                int i5 = i3 + 1;
                int i6 = i4 + 1;
                iArr[i3] = (str.charAt(i2) << 16) | str.charAt(i4);
                i3 = i5;
                i2 = i6;
            }
            return i3;
        } catch (Throwable th) {
            if (lg) {
                iy.U2(th, 369561604885581960L, null, str, new Integer(i), iArr);
            }
            throw th;
        }
    }

    @ey(method = -3969213754992670107L)
    private static char[] Ws(String str) {
        int i;
        try {
            if (a8) {
                iy.tp(3035745194411115125L, null, str);
            }
            char[] cArr = new char[65536];
            int i2 = 0;
            int i3 = 0;
            while (i2 < 1410) {
                int i4 = i2 + 1;
                int iCharAt = str.charAt(i2);
                int i5 = i4 + 1;
                char cCharAt = str.charAt(i4);
                while (true) {
                    i = i3 + 1;
                    cArr[i3] = cCharAt;
                    iCharAt--;
                    if (iCharAt <= 0) {
                        break;
                    }
                    i3 = i;
                }
                i2 = i5;
                i3 = i;
            }
            return cArr;
        } catch (Throwable th) {
            if (lg) {
                iy.j3(th, 3035745194411115125L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 4764060376489484460L)
    private static int[] XL() {
        try {
            if (a8) {
                iy.gn(-2356158371976786400L, null);
            }
            int[] iArr = new int[139];
            QX("\u0000\u0000\u0000*\u0000T\u0000~\u0000¨\u0000Ò\u0000ü\u0000Ħ\u0000Ő\u0000ź\u0000Ƥ\u0000ǎ\u0000Ǹ\u0000Ƥ\u0000Ȣ\u0000Ƥ\u0000Ɍ\u0000ɶ\u0000ʠ\u0000ˊ\u0000Ƥ\u0000Ƥ\u0000Ƥ\u0000˴\u0000̞\u0000Ƥ\u0000Ƥ\u0000Ƥ\u0000Ƥ\u0000͈\u0000Ͳ\u0000Μ\u0000Ƥ\u0000φ\u0000Ƥ\u0000Ƥ\u0000Ƥ\u0000Ƥ\u0000Ƥ\u0000Ƥ\u0000Ƥ\u0000Ƥ\u0000Ƥ\u0000Ƥ\u0000ϰ\u0000К\u0000Ƥ\u0000ф\u0000Ƥ\u0000Ƥ\u0000Ѯ\u0000Ҙ\u0000ӂ\u0000Ӭ\u0000Ԗ\u0000Հ\u0000ժ\u0000Ƥ\u0000֔\u0000־\u0000Ǹ\u0000ר\u0000ؒ\u0000ؼ\u0000٦\u0000Ƥ\u0000ڐ\u0000ں\u0000ۤ\u0000\u070e\u0000ܸ\u0000ݢ\u0000ތ\u0000\u07b6\u0000Ƥ\u0000ߠ\u0000Ƥ\u0000־\u0000Ƥ\u0000ࠊ\u0000࠴\u0000࡞\u0000࢈\u0000ࢲ\u0000ࣜ\u0000Ƥ\u0000Ƥ\u0000Ƥ\u0000आ\u0000र\u0000ग़\u0000\u0984\u0000ম\u0000\u09d8\u0000ਂ\u0000ਬ\u0000\u0a56\u0000\u0a80\u0000પ\u0000\u0ad4\u0000૾\u0000ନ\u0000\u0b52\u0000Ƥ\u0000\u0b7c\u0000\u0ba6\u0000ௐ\u0000௺\u0000త\u0000\u0c4e\u0000౸\u0000ಢ\u0000ೌ\u0000\u0cf6\u0000ഠ\u0000ൊ\u0000൴\u0000Ƥ\u0000ඞ\u0000К\u0000\u0dc8\u0000ෲ\u0000ผ\u0000ๆ\u0000\u0e70\u0000ບ\u0000Ƥ\u0000К\u0000Ƥ\u0000ໄ\u0000\u0eee\u0000༘\u0000Ƥ\u0000ག\u0000Ƥ\u0000ཬ\u0000Ƥ\u0000Ƥ\u0000Ƥ", 0, iArr);
            return iArr;
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, -2356158371976786400L, null);
            }
            throw th;
        }
    }

    @ey(method = 360609879523538736L)
    private static int aM(String str, int i, int[] iArr) {
        int i2;
        try {
            if (a8) {
                iy.we(-1554743654488878636L, null, str, new Integer(i), iArr);
            }
            int i3 = 0;
            int length = str.length();
            int i4 = i;
            while (i3 < length) {
                int i5 = i3 + 1;
                int iCharAt = str.charAt(i3);
                int i6 = i5 + 1;
                int iCharAt2 = str.charAt(i5) - 1;
                while (true) {
                    i2 = i4 + 1;
                    iArr[i4] = iCharAt2;
                    iCharAt--;
                    if (iCharAt <= 0) {
                        break;
                    }
                    i4 = i2;
                }
                i3 = i6;
                i4 = i2;
            }
            return i4;
        } catch (Throwable th) {
            if (lg) {
                iy.U2(th, -1554743654488878636L, null, str, new Integer(i), iArr);
            }
            throw th;
        }
    }

    @ey(method = -774937182122617680L)
    private static int[] j3() {
        try {
            if (a8) {
                iy.gn(4519666243100272680L, null);
            }
            int[] iArr = new int[3990];
            aM("\u0001\u000b\u0001\f\u0003\r\u0002\u000b\u0001\u000e\u0001\r\u0001\u000f\u0001\u000b\n\r\u0001\u0010\u0001\u000b\u0001\u0011\u0002\u000b\u0005\r\b\u000b\u0003\r*\u000b\u0019\u0012\u0001\u0013\u0010\u0012\u0015\u0014\u0001\u0015\t\u0014\u0001\u0016\u0001\u0017\t\u0014\u0002\u0018\u0001\u0019\u0004\u0018\u0001\u001a\u0001\u0019\u0002\u0018\n\u0019\u0001\u001b\u0004\u0018\u0005\u0019\u0001\u001c\u0001\u001d\u0006\u0018\u0003\u0019\u0004\u001e\u0001\u001f%\u001e\u0001\u000b\u0001\f\u0002\r\u0001 \u0001!\u0001\"\u0001\u000e\u0001\r\u0002\u000b\n\r\u0001\u0010\u0002\u000b\u0001#\u0001$\u0005\r\u0001%\u0001&\u0001'\u0001(\u0001)\u0001*\u0001+\u0001,\u0003\r\u0004\u001e\u0001-%\u001e\u0001\u000b\u0001\f\u0001.\u0004\u000b\u0001/\u0001.\u0002\u000b\u0003.\u00010\u0006.\u00011\u00012\u0003\u000b\u0005.\b\u000b\u0003.\t3\u00014\r3\u00015\u00123+\u0000\u0001\f*\u0000\u0003\r\u0003\u0000\u0001\r\u0002\u0000\n\r\u0005\u0000\u0005\r\b\u0000\u0003\r\n\u0000\u00016\u000e\u0000\u00017'\u0000\u00018\u0012\u0000\u0019\u0012\u00019(\u0012\u0001:\u0011\u0012\u0015\u0014\u0001\u0000\t\u0014\u0002\u0000\t\u0014\u0007\u0018\u0001\u0000\r\u0018\u0001\u0000\t\u0018\u0002\u0000\u000b\u0018\u0003\u0019\u0002\u0018\u0001\u0000\u0001\u0019\u0002\u0018\n\u0019\u0001\u0000\u0004\u0018\u0005\u0019\u0002\u0000\u0006\u0018\u0003\u0019\u0004\u001e\u0001;)\u001e\u0001<%\u001e\u0002\u0000\u0002\r\u0001=\u0003\u0000\u0001\r\u0002\u0000\n\r\u0005\u0000\u0005\r\b\u0000\u0003\r\u000e\u0000\u0001>\u000f\u0000\u0001?\t\u0000\u0001@\u0001A\u0004\u001e\u0001B%\u001e\u0002\u0000\u0003.\u0003\u0000\u0001.\u0002\u0000\n.\u0005\u0000\u0005.\b\u0000\u0003.\u0002\u0000\u0003.\u0003\u0000\u0001.\u0002\u0000\u0001.\u0001C\b.\u0005\u0000\u0003.\u0001D\u0001.\b\u0000\u0003.\t3\u0001\u0000\r3\u0001\u0000\u00123\n\u0000\u0001E6\u0000\u0001F\u0016\u0000\u0001G\u0006\u0000\u0001H\u0001I\u0005\u0000\u0001J\u0003\u0000\u0001K\u001b\u0000\u0001L9\u0000\u0001M\u0011\u0000\u0018\u0012\u0001\u0000\u0011\u0012\u0004\u001e\u0001\u0000%\u001e\u0001\u0000\u0001N\u0016\u0000\u0001O\"\u0000\u0001P#\u0000\u0001Q8\u0000\u0001R\u001d\u0000\u0001S\u001d\u0000\u0003.\u0003\u0000\u0001.\u0002\u0000\n.\u0005\u0000\u0001T\u0004.\b\u0000\u0003.\u0002\u0000\u0003.\u0003\u0000\u0001.\u0002\u0000\u0001.\u0001U\b.\u0005\u0000\u0005.\b\u0000\u0003.\u0016\u0000\u0001V+\u0000\u0001W\u0015\u0000\u0001X1\u0000\u0001Y\u0003\u0000\u0001Z-\u0000\u0001[\"\u0000\u0001\\-\u0000\u0001]@\u0000\u0001^(\u0000\u0001_\u001e\u0000\u0001`\u0015\u0000\u0001a#\u0000\u0003.\u0003\u0000\u0001.\u0002\u0000\u0005.\u0001b\u0004.\u0005\u0000\u0005.\b\u0000\u0003.\u0002\u0000\u0003.\u0003\u0000\u0001.\u0002\u0000\t.\u0001c\u0005\u0000\u0005.\b\u0000\u0003.\r\u0000\u0001d'\u0000\u0001e+\u0000\u0001f)\u0000\u0001g,\u0000\u0001h)\u0000\u0001i4\u0000\u0001j \u0000\u0001k\"\u0000\u0001l \u0000\u0003.\u0003\u0000\u0001.\u0002\u0000\n.\u0005\u0000\u0001.\u0001m\u0003.\b\u0000\u0003.\u0002\u0000\u0003.\u0003\u0000\u0001.\u0002\u0000\n.\u0005\u0000\u0004.\u0001n\b\u0000\u0003.\u000e\u0000\u0001o,\u0000\u0001p*\u0000\u0001q'\u0000\u0001r'\u0000\u0001s)\u0000\u0001t(\u0000\u0001u8\u0000\u0001v\u000f\u0000\u0003.\u0003\u0000\u0001.\u0002\u0000\n.\u0005\u0000\u0002.\u0001w\u0002.\b\u0000\u0003.\u0002\u0000\u0003.\u0003\u0000\u0001.\u0002\u0000\u0001x\t.\u0005\u0000\u0005.\b\u0000\u0003.\r\u0000\u0001y'\u0000\u0001z+\u0000\u0001{*\u0000\u0001|&\u0000\u0001}<\u0000\u0001~\u001d\u0000\u0001\u007f\u0019\u0000\u0003.\u0003\u0000\u0001.\u0002\u0000\u0001\u0080\t.\u0005\u0000\u0005.\b\u0000\u0003.\u000f\u0000\u0001\u0081&\u0000\u0001\u0082+\u0000\u0001\u0083.\u0000\u0001\u00842\u0000\u0001\u0085\u0018\u0000\u0001\u0086+\u0000\u0001\u00870\u0000\u0001\u0088\"\u0000\u0001\u00898\u0000\u0001\u008a\u0019\u0000\u0001\u008b\u001d\u0000", 0, iArr);
            return iArr;
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, 4519666243100272680L, null);
            }
            throw th;
        }
    }

    @ey(method = -2083559821395998904L)
    private void tp(int i) {
        String str;
        try {
            if (a8) {
                iy.u7(879624979037586720L, this, i);
            }
            try {
                str = Mr[i];
            } catch (ArrayIndexOutOfBoundsException unused) {
                str = Mr[0];
            }
            throw new Error(str);
        } catch (Throwable th) {
            if (lg) {
                iy.j3(th, 879624979037586720L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2282053301840359168L)
    private boolean u7() {
        try {
            if (a8) {
                iy.gn(2312800561961528892L, this);
            }
            if (this.gn > 0) {
                System.arraycopy(this.Hw, this.gn, this.Hw, 0, this.u7 - this.gn);
                this.u7 -= this.gn;
                this.VH -= this.gn;
                this.v5 -= this.gn;
                this.Zo -= this.gn;
                this.gn = 0;
            }
            if (this.VH >= this.Hw.length) {
                char[] cArr = new char[this.VH * 2];
                System.arraycopy(this.Hw, 0, cArr, 0, this.Hw.length);
                this.Hw = cArr;
            }
            int i = this.j6.read(this.Hw, this.u7, this.Hw.length - this.u7);
            if (i < 0) {
                return true;
            }
            this.u7 += i;
            return false;
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, 2312800561961528892L, this);
            }
            throw th;
        }
    }

    @ey(method = -2241782160681431452L)
    private static int[] we() {
        try {
            if (a8) {
                iy.gn(2243644801169420800L, null);
            }
            int[] iArr = new int[139];
            EQ("\u0005\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0002\u0001\u0003\u0001\u0004\u0001\u0005\u0001\u0006\u0001\u0003\u0001\u0007\u0001\u0003\u0001\b\u0001\u0003\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0001\u0001\u0003\u0001\u0013\u0001\u0014\u0001\u0003\u0001\u0015\u0001\u0016\u0001\u0017\u0001\u0018\u0001\u0019\u0001\u001a\u0001\u001b\u0001\u001c\u0001\u001d\u0001\u001e\u0001\u0003\u0001\u001f\u0001 \u0001\u001f\u0001!\u0001\"\u0003\u0002\u0001\u0000\u0001#\u0002\u0000\u0001$\u0001\u0000\u0001\u0001\u0001%\u0004\u0000\u0001&\u0002\u001f\u0006\u0000\u0001'\u0001\u0000\u0001(\u0001\u0000\u0001)\u0004\u0000\u0002\u001f\u0001*\u0001+\u0001,\t\u0000\u0002\u001f\u0004\u0000\u0001-\u0004\u0000\u0002\u001f\u0007\u0000\u0001.\u0001\u001f\u0001/\u0006\u0000\u00010\u00011\u00012\u0003\u0000\u00013\u0001\u0000\u00014\u0001\u0000\u00015\u00016\u00017", 0, iArr);
            return iArr;
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, 2243644801169420800L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Lexer
    @ey(method = 2092360941435470808L)
    public char[] DW() {
        try {
            if (a8) {
                iy.gn(1079623862183612056L, this);
            }
            return this.Hw;
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, 1079623862183612056L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Lexer
    @ey(method = -25908759450697728L)
    public final char FH(int i) {
        try {
            if (a8) {
                iy.u7(-44482108335388644L, this, i);
            }
            return this.Hw[this.gn + i];
        } catch (Throwable th) {
            if (lg) {
                iy.j3(th, -44482108335388644L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Lexer
    @ey(method = 191625868383879665L)
    public final void Hw(Reader reader) {
        try {
            if (a8) {
                iy.tp(-20603089589184179L, this, reader);
            }
            this.j6 = reader;
            this.EQ = false;
            this.gn = 0;
            this.u7 = 0;
            this.Zo = 0;
            this.v5 = 0;
            this.VH = 0;
            this.tp = 0;
            this.FH = 0;
        } catch (Throwable th) {
            if (lg) {
                iy.j3(th, -20603089589184179L, this, reader);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Lexer
    @ey(method = 1230124003814125080L)
    public int VH() {
        try {
            if (a8) {
                iy.gn(5518803100935570600L, this);
            }
            return this.gn;
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, 5518803100935570600L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Lexer
    @ey(method = 743648425765085024L)
    public final int Zo() {
        try {
            if (a8) {
                iy.gn(-2184636371564121120L, this);
            }
            return this.v5 - this.gn;
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, -2184636371564121120L, this);
            }
            throw th;
        }
    }

    @ey(method = -17375445314336620L)
    public final void gn(int i) {
        try {
            if (a8) {
                iy.u7(-557535488712665040L, this, i);
            }
            this.FH = i;
        } catch (Throwable th) {
            if (lg) {
                iy.j3(th, -557535488712665040L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Lexer
    @ey(method = 1025730571343731200L)
    public int j6() {
        try {
            if (a8) {
                iy.gn(-3568728843878857692L, this);
            }
            return this.tp;
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, -3568728843878857692L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r9 = 65535;
     */
    @Override // com.aide.codemodel.api.Lexer
    @abcd.ey(method = -1047612709122715263L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int v5() {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.dtd.DtdLexer.v5():int");
    }
}
