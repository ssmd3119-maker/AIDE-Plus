package abcd;

import com.aide.codemodel.api.ErrorTable;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.PositionalReader;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.io.Reader;

@cy(clazz = 1821935073244874656L, container = 1821935073244874656L, user = true)
/* loaded from: classes.dex */
public class t6 {

    @gy
    private static /* synthetic */ boolean QX;

    @fy
    private static /* synthetic */ boolean Ws;

    @dy(field = -1088187337357949565L)
    private IdentifierSpace DW;

    @dy(field = -2270218442420728413L)
    private char[] EQ;

    @dy(field = 1462215734399670677L)
    private final boolean FH;

    @dy(field = 1415597064642712263L)
    private Language Hw;

    @dy(field = 2037098411467510080L)
    private b J0;

    @dy(field = 1849713268060362720L)
    private PositionalReader J8;

    @dy(field = 2624198422627797379L)
    private int[] VH;

    @dy(field = 2596597650376259907L)
    private char[] Zo;

    @dy(field = 2602285523035515671L)
    private FileEntry gn;

    @dy(field = 3564824255220649015L)
    private ErrorTable j6;

    @dy(field = 711878652263548965L)
    private boolean tp;

    @dy(field = -2118726680898397704L)
    private boolean u7;

    @dy(field = 705590362409726976L)
    private Language v5;

    @dy(field = 4144468633718110245L)
    private boolean we;

    static {
        iy.Zo(t6.class);
    }

    @ey(method = -952771928790936384L)
    public t6(IdentifierSpace identifierSpace, ErrorTable errorTable, boolean z, Language language, Language language2) {
        try {
            if (Ws) {
                iy.J8(-3122127835039395775L, null, identifierSpace, errorTable, new Boolean(z), language, language2);
            }
            this.Zo = new char[10000];
            this.VH = new int[10000];
            this.EQ = new char[1000];
            this.we = true;
            this.J0 = new b(null);
            this.J8 = new PositionalReader();
            this.j6 = errorTable;
            this.DW = identifierSpace;
            this.FH = z;
            this.Hw = language;
            this.v5 = language2;
        } catch (Throwable th) {
            if (QX) {
                iy.lg(th, -3122127835039395775L, null, identifierSpace, errorTable, new Boolean(z), language, language2);
            }
            throw th;
        }
    }

    @ey(method = -723388201114674461L)
    private void DW(int i, int i2) {
        try {
            if (Ws) {
                iy.EQ(968834855202877472L, this, new Integer(i), new Integer(i2));
            }
            if (this.u7) {
                this.j6.j3(this.gn, this.Hw, i, i2, i, i2 + 1, "Missing .", 0);
            }
        } catch (Throwable th) {
            if (QX) {
                iy.Mr(th, 968834855202877472L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @ey(method = 378219849203080512L)
    private void FH(int i, int i2, int i3) throws Throwable {
        ?? r1;
        int i4;
        try {
            if (Ws) {
                r1 = 8553219442253858185;
                iy.we(8553219442253858185L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (this.tp) {
                try {
                    if (i3 == -1) {
                        r1 = i3;
                        i4 = i2;
                        this.j6.j3(this.gn, this.v5, i, i2, i, i2 + 1, "Unexpected end of file", 0);
                    } else {
                        int i5 = i3;
                        i4 = i2;
                        if (i5 == 10) {
                            this.j6.j3(this.gn, this.v5, i, i2, i, i4 + 1, "Unexpected end of line", 0);
                            r1 = i5;
                        } else {
                            int i6 = i4 + 1;
                            this.j6.j3(this.gn, this.v5, i, i2, i, i6, "Unexpected " + (i5 == true ? (char) 1 : (char) 0), 0);
                            this.j6.Ws(this.gn, this.v5, i, i2, i, i6, "", "Delete");
                            r1 = i5;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (QX) {
                        iy.U2(th, 8553219442253858185L, this, new Integer(i), new Integer(i4), new Integer((int) r1));
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            r1 = i3;
            i4 = i2;
        }
    }

    @ey(method = 335501990157569760L)
    private int Hw(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        try {
            if (Ws) {
                iy.we(-4970000336239906359L, this, cArr, new Integer(i), new Integer(i2));
            }
            if (i2 >= this.EQ.length) {
                char[] cArr2 = new char[Math.max((this.EQ.length * 2) + 1, i2)];
                System.arraycopy(this.EQ, 0, cArr2, 0, this.EQ.length);
                this.EQ = cArr2;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i + i2) {
                char c = cArr[i5];
                if (c != '\\') {
                    i4 = i6 + 1;
                    this.EQ[i6] = c;
                } else {
                    int i7 = i5 + 1;
                    char c2 = cArr[i7];
                    if (c2 == '\"') {
                        i3 = i6 + 1;
                        this.EQ[i6] = '\"';
                    } else if (c2 == '\'') {
                        i3 = i6 + 1;
                        this.EQ[i6] = '\'';
                    } else if (c2 == '\\') {
                        i4 = i6 + 1;
                        this.EQ[i6] = '\\';
                        i5 = i7;
                    } else if (c2 == 'b') {
                        i3 = i6 + 1;
                        this.EQ[i6] = '\b';
                    } else if (c2 == 'f') {
                        i3 = i6 + 1;
                        this.EQ[i6] = '\f';
                    } else if (c2 == 'n') {
                        i3 = i6 + 1;
                        this.EQ[i6] = '\n';
                    } else if (c2 == 'r') {
                        i3 = i6 + 1;
                        this.EQ[i6] = '\r';
                    } else if (c2 != 't') {
                        switch (c2) {
                            case '0':
                            case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                                int i8 = 0;
                                int i9 = 0;
                                while (i8 < 3) {
                                    int i10 = i5 + 1;
                                    char c3 = cArr[i10];
                                    switch (c3) {
                                        case '0':
                                        case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                            i9 = (i9 * 8) + (c3 - '0');
                                            i8++;
                                            i5 = i10;
                                    }
                                    i4 = i6 + 1;
                                    this.EQ[i6] = (char) i9;
                                    break;
                                }
                                i4 = i6 + 1;
                                this.EQ[i6] = (char) i9;
                                break;
                            default:
                                continue;
                                i5++;
                        }
                    } else {
                        i3 = i6 + 1;
                        this.EQ[i6] = '\t';
                    }
                    i5 = i7;
                    i6 = i3;
                    i5++;
                }
                i6 = i4;
                i5++;
            }
            return i6 - 0;
        } catch (Throwable th) {
            if (QX) {
                iy.U2(th, -4970000336239906359L, this, cArr, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @ey(method = -1442034939901030015L)
    private void j6(int i, int i2, int i3) throws Throwable {
        ?? r1;
        int i4;
        try {
            if (Ws) {
                r1 = 747094081999897152;
                iy.we(747094081999897152L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (this.u7) {
                try {
                    if (i3 == -1) {
                        r1 = i3;
                        i4 = i2;
                        this.j6.j3(this.gn, this.Hw, i, i2, i, i2 + 1, "Unexpected end of file", 0);
                    } else {
                        int i5 = i3;
                        i4 = i2;
                        if (i5 == 10) {
                            this.j6.j3(this.gn, this.Hw, i, i2, i, i4 + 1, "Unexpected end of line", 0);
                            r1 = i5;
                        } else {
                            int i6 = i4 + 1;
                            this.j6.j3(this.gn, this.Hw, i, i2, i, i6, "Unexpected " + (i5 == true ? (char) 1 : (char) 0), 0);
                            this.j6.Ws(this.gn, this.Hw, i, i2, i, i6, "", "Delete");
                            r1 = i5;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (QX) {
                        iy.U2(th, 747094081999897152L, this, new Integer(i), new Integer(i4), new Integer((int) r1));
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            r1 = i3;
            i4 = i2;
        }
    }

    @ey(method = 3820352261746933767L)
    private int v5(char[] cArr, int i, int i2) {
        try {
            if (Ws) {
                iy.we(-3769471979557881792L, this, cArr, new Integer(i), new Integer(i2));
            }
            switch (i2) {
                case 2:
                    char c = cArr[i];
                    return c != 'd' ? (c == 'i' && cArr[i + 1] == 'f') ? 55 : -1 : cArr[i + 1] != 'o' ? -1 : 54;
                case 3:
                    char c2 = cArr[i];
                    return c2 != 'f' ? c2 != 'i' ? c2 != 'n' ? (c2 == 't' && cArr[i + 1] == 'r' && cArr[i + 2] == 'y') ? 59 : -1 : (cArr[i + 1] == 'e' && cArr[i + 2] == 'w') ? 58 : -1 : (cArr[i + 1] == 'n' && cArr[i + 2] == 't') ? 57 : -1 : (cArr[i + 1] == 'o' && cArr[i + 2] == 'r') ? 56 : -1;
                case 4:
                    char c3 = cArr[i];
                    if (c3 == 'b') {
                        return (cArr[i + 1] == 'y' && cArr[i + 2] == 't' && cArr[i + 3] == 'e') ? 60 : -1;
                    }
                    if (c3 == 'c') {
                        char c4 = cArr[i + 1];
                        return c4 != 'a' ? (c4 == 'h' && cArr[i + 2] == 'a' && cArr[i + 3] == 'r') ? 62 : -1 : (cArr[i + 2] == 's' && cArr[i + 3] == 'e') ? 61 : -1;
                    }
                    if (c3 == 'e') {
                        return (cArr[i + 1] == 'l' && cArr[i + 2] == 's' && cArr[i + 3] == 'e') ? 63 : -1;
                    }
                    if (c3 == 'g') {
                        return (cArr[i + 1] == 'o' && cArr[i + 2] == 't' && cArr[i + 3] == 'o') ? 64 : -1;
                    }
                    if (c3 == 'l') {
                        return (cArr[i + 1] == 'o' && cArr[i + 2] == 'n' && cArr[i + 3] == 'g') ? 65 : -1;
                    }
                    if (c3 == 'n') {
                        return (cArr[i + 1] == 'u' && cArr[i + 2] == 'l' && cArr[i + 3] == 'l') ? 66 : -1;
                    }
                    if (c3 != 't') {
                        return (c3 == 'v' && cArr[i + 1] == 'o' && cArr[i + 2] == 'i' && cArr[i + 3] == 'd') ? 69 : -1;
                    }
                    char c5 = cArr[i + 1];
                    return c5 != 'h' ? (c5 == 'r' && cArr[i + 2] == 'u' && cArr[i + 3] == 'e') ? 68 : -1 : (cArr[i + 2] == 'i' && cArr[i + 3] == 's') ? 67 : -1;
                case 5:
                    char c6 = cArr[i];
                    if (c6 == 'b') {
                        return (cArr[i + 1] == 'r' && cArr[i + 2] == 'e' && cArr[i + 3] == 'a' && cArr[i + 4] == 'k') ? 70 : -1;
                    }
                    if (c6 == 'c') {
                        char c7 = cArr[i + 1];
                        return c7 != 'a' ? c7 != 'l' ? (c7 == 'o' && cArr[i + 2] == 'n' && cArr[i + 3] == 's' && cArr[i + 4] == 't') ? 73 : -1 : (cArr[i + 2] == 'a' && cArr[i + 3] == 's' && cArr[i + 4] == 's') ? 72 : -1 : (cArr[i + 2] == 't' && cArr[i + 3] == 'c' && cArr[i + 4] == 'h') ? 71 : -1;
                    }
                    if (c6 == 'f') {
                        char c8 = cArr[i + 1];
                        return c8 != 'a' ? c8 != 'i' ? (c8 == 'l' && cArr[i + 2] == 'o' && cArr[i + 3] == 'a' && cArr[i + 4] == 't') ? 76 : -1 : (cArr[i + 2] == 'n' && cArr[i + 3] == 'a' && cArr[i + 4] == 'l') ? 75 : -1 : (cArr[i + 2] == 'l' && cArr[i + 3] == 's' && cArr[i + 4] == 'e') ? 74 : -1;
                    }
                    if (c6 == 'w') {
                        return (cArr[i + 1] == 'h' && cArr[i + 2] == 'i' && cArr[i + 3] == 'l' && cArr[i + 4] == 'e') ? 80 : -1;
                    }
                    switch (c6) {
                        case 's':
                            char c9 = cArr[i + 1];
                            return c9 != 'h' ? (c9 == 'u' && cArr[i + 2] == 'p' && cArr[i + 3] == 'e' && cArr[i + 4] == 'r') ? 78 : -1 : (cArr[i + 2] == 'o' && cArr[i + 3] == 'r' && cArr[i + 4] == 't') ? 77 : -1;
                        case 't':
                            return (cArr[i + 1] == 'h' && cArr[i + 2] == 'r' && cArr[i + 3] == 'o' && cArr[i + 4] == 'w') ? 79 : -1;
                        case 'u':
                            return (this.FH && cArr[i + 1] == 'b' && cArr[i + 2] == 'y' && cArr[i + 3] == 't' && cArr[i + 4] == 'e') ? 114 : -1;
                        default:
                            return -1;
                    }
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    char c10 = cArr[i];
                    if (c10 == 'a') {
                        return (cArr[i + 1] == 's' && cArr[i + 2] == 's' && cArr[i + 3] == 'e' && cArr[i + 4] == 'r' && cArr[i + 5] == 't') ? 105 : -1;
                    }
                    if (c10 == 'd') {
                        return (cArr[i + 1] == 'o' && cArr[i + 2] == 'u' && cArr[i + 3] == 'b' && cArr[i + 4] == 'l' && cArr[i + 5] == 'e') ? 81 : -1;
                    }
                    if (c10 == 'i') {
                        return (cArr[i + 1] == 'm' && cArr[i + 2] == 'p' && cArr[i + 3] == 'o' && cArr[i + 4] == 'r' && cArr[i + 5] == 't') ? 82 : -1;
                    }
                    if (c10 == 'n') {
                        return (cArr[i + 1] == 'a' && cArr[i + 2] == 't' && cArr[i + 3] == 'i' && cArr[i + 4] == 'v' && cArr[i + 5] == 'e') ? 83 : -1;
                    }
                    if (c10 == 'p') {
                        return (cArr[i + 1] == 'u' && cArr[i + 2] == 'b' && cArr[i + 3] == 'l' && cArr[i + 4] == 'i' && cArr[i + 5] == 'c') ? 84 : -1;
                    }
                    switch (c10) {
                        case 'r':
                            return (cArr[i + 1] == 'e' && cArr[i + 2] == 't' && cArr[i + 3] == 'u' && cArr[i + 4] == 'r' && cArr[i + 5] == 'n') ? 85 : -1;
                        case 's':
                            char c11 = cArr[i + 1];
                            return c11 != 't' ? (c11 == 'w' && cArr[i + 2] == 'i' && cArr[i + 3] == 't' && cArr[i + 4] == 'c' && cArr[i + 5] == 'h') ? 87 : -1 : (cArr[i + 2] == 'a' && cArr[i + 3] == 't' && cArr[i + 4] == 'i' && cArr[i + 5] == 'c') ? 86 : -1;
                        case 't':
                            return (cArr[i + 1] == 'h' && cArr[i + 2] == 'r' && cArr[i + 3] == 'o' && cArr[i + 4] == 'w' && cArr[i + 5] == 's') ? 88 : -1;
                        default:
                            return -1;
                    }
                case UserTouchAction.CLICK_KIND /* 7 */:
                    char c12 = cArr[i];
                    if (c12 == 'b') {
                        return (cArr[i + 1] == 'o' && cArr[i + 2] == 'o' && cArr[i + 3] == 'l' && cArr[i + 4] == 'e' && cArr[i + 5] == 'a' && cArr[i + 6] == 'n') ? 89 : -1;
                    }
                    if (c12 == 'p') {
                        char c13 = cArr[i + 1];
                        return c13 != 'a' ? (c13 == 'r' && cArr[i + 2] == 'i' && cArr[i + 3] == 'v' && cArr[i + 4] == 'a' && cArr[i + 5] == 't' && cArr[i + 6] == 'e') ? 94 : -1 : (cArr[i + 2] == 'c' && cArr[i + 3] == 'k' && cArr[i + 4] == 'a' && cArr[i + 5] == 'g' && cArr[i + 6] == 'e') ? 93 : -1;
                    }
                    switch (c12) {
                        case 'd':
                            return (cArr[i + 1] == 'e' && cArr[i + 2] == 'f' && cArr[i + 3] == 'a' && cArr[i + 4] == 'u' && cArr[i + 5] == 'l' && cArr[i + 6] == 't') ? 90 : -1;
                        case 'e':
                            return (cArr[i + 1] == 'x' && cArr[i + 2] == 't' && cArr[i + 3] == 'e' && cArr[i + 4] == 'n' && cArr[i + 5] == 'd' && cArr[i + 6] == 's') ? 91 : -1;
                        case 'f':
                            return (cArr[i + 1] == 'i' && cArr[i + 2] == 'n' && cArr[i + 3] == 'a' && cArr[i + 4] == 'l' && cArr[i + 5] == 'l' && cArr[i + 6] == 'y') ? 92 : -1;
                        default:
                            return -1;
                    }
                case 8:
                    char c14 = cArr[i];
                    return c14 != 'a' ? c14 != 's' ? c14 != 'v' ? c14 != 'c' ? (c14 == 'd' && this.FH && cArr[i + 1] == 'e' && cArr[i + 2] == 'l' && cArr[i + 3] == 'e' && cArr[i + 4] == 'g' && cArr[i + 5] == 'a' && cArr[i + 6] == 't' && cArr[i + 7] == 'e') ? 118 : -1 : (cArr[i + 1] == 'o' && cArr[i + 2] == 'n' && cArr[i + 3] == 't' && cArr[i + 4] == 'i' && cArr[i + 5] == 'n' && cArr[i + 6] == 'u' && cArr[i + 7] == 'e') ? 96 : -1 : (cArr[i + 1] == 'o' && cArr[i + 2] == 'l' && cArr[i + 3] == 'a' && cArr[i + 4] == 't' && cArr[i + 5] == 'i' && cArr[i + 6] == 'l' && cArr[i + 7] == 'e') ? 98 : -1 : (cArr[i + 1] == 't' && cArr[i + 2] == 'r' && cArr[i + 3] == 'i' && cArr[i + 4] == 'c' && cArr[i + 5] == 't' && cArr[i + 6] == 'f' && cArr[i + 7] == 'p') ? 97 : -1 : (cArr[i + 1] == 'b' && cArr[i + 2] == 's' && cArr[i + 3] == 't' && cArr[i + 4] == 'r' && cArr[i + 5] == 'a' && cArr[i + 6] == 'c' && cArr[i + 7] == 't') ? 95 : -1;
                case 9:
                    char c15 = cArr[i];
                    return c15 != 'i' ? c15 != 'm' ? c15 != 'p' ? (c15 == 't' && cArr[i + 1] == 'r' && cArr[i + 2] == 'a' && cArr[i + 3] == 'n' && cArr[i + 4] == 's' && cArr[i + 5] == 'i' && cArr[i + 6] == 'e' && cArr[i + 7] == 'n' && cArr[i + 8] == 't') ? 101 : -1 : (cArr[i + 1] == 'r' && cArr[i + 2] == 'o' && cArr[i + 3] == 't' && cArr[i + 4] == 'e' && cArr[i + 5] == 'c' && cArr[i + 6] == 't' && cArr[i + 7] == 'e' && cArr[i + 8] == 'd') ? 100 : -1 : (this.FH && cArr[i + 1] == 'u' && cArr[i + 2] == 'l' && cArr[i + 3] == 't' && cArr[i + 4] == 'i' && cArr[i + 5] == 'c' && cArr[i + 6] == 'a' && cArr[i + 7] == 's' && cArr[i + 8] == 't') ? 119 : -1 : (cArr[i + 1] == 'n' && cArr[i + 2] == 't' && cArr[i + 3] == 'e' && cArr[i + 4] == 'r' && cArr[i + 5] == 'f' && cArr[i + 6] == 'a' && cArr[i + 7] == 'c' && cArr[i + 8] == 'e') ? 99 : -1;
                case 10:
                    if (cArr[i] != 'i') {
                        return -1;
                    }
                    char c16 = cArr[i + 1];
                    return c16 != 'm' ? (c16 == 'n' && cArr[i + 2] == 's' && cArr[i + 3] == 't' && cArr[i + 4] == 'a' && cArr[i + 5] == 'n' && cArr[i + 6] == 'c' && cArr[i + 7] == 'e' && cArr[i + 8] == 'o' && cArr[i + 9] == 'f') ? 103 : -1 : (cArr[i + 2] == 'p' && cArr[i + 3] == 'l' && cArr[i + 4] == 'e' && cArr[i + 5] == 'm' && cArr[i + 6] == 'e' && cArr[i + 7] == 'n' && cArr[i + 8] == 't' && cArr[i + 9] == 's') ? 102 : -1;
                case 11:
                default:
                    return -1;
                case 12:
                    return (cArr[i] == 's' && cArr[i + 1] == 'y' && cArr[i + 2] == 'n' && cArr[i + 3] == 'c' && cArr[i + 4] == 'h' && cArr[i + 5] == 'r' && cArr[i + 6] == 'o' && cArr[i + 7] == 'n' && cArr[i + 8] == 'i' && cArr[i + 9] == 'z' && cArr[i + 10] == 'e' && cArr[i + 11] == 'd') ? 104 : -1;
            }
        } catch (Throwable th) {
            if (QX) {
                iy.U2(th, -3769471979557881792L, this, cArr, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:444:0x080f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:449:0x082a A[PHI: r11 r38
      0x082a: PHI (r11v16 char[]) = 
      (r11v13 char[])
      (r11v13 char[])
      (r11v13 char[])
      (r11v13 char[])
      (r11v14 char[])
      (r11v14 char[])
      (r11v14 char[])
      (r11v17 char[])
     binds: [B:464:0x08d5, B:466:0x08d9, B:468:0x08dd, B:473:0x08e7, B:444:0x080f, B:445:0x0812, B:447:0x0819, B:423:0x07cd] A[DONT_GENERATE, DONT_INLINE]
      0x082a: PHI (r38v41 int[]) = 
      (r38v38 int[])
      (r38v38 int[])
      (r38v38 int[])
      (r38v38 int[])
      (r38v39 int[])
      (r38v39 int[])
      (r38v39 int[])
      (r38v42 int[])
     binds: [B:464:0x08d5, B:466:0x08d9, B:468:0x08dd, B:473:0x08e7, B:444:0x080f, B:445:0x0812, B:447:0x0819, B:423:0x07cd] A[DONT_GENERATE, DONT_INLINE]] */
    @abcd.ey(method = -6561995193645094875L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Zo(com.aide.codemodel.api.FileEntry r42, java.io.Reader r43, boolean r44, boolean r45, boolean r46, boolean r47, com.aide.codemodel.api.SyntaxTreeStyles r48, com.aide.codemodel.api.SyntaxTreeStyles r49) {
        /*
            Method dump skipped, instructions count: 4434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.t6.Zo(com.aide.codemodel.api.FileEntry, java.io.Reader, boolean, boolean, boolean, boolean, com.aide.codemodel.api.SyntaxTreeStyles, com.aide.codemodel.api.SyntaxTreeStyles):void");
    }

    @cy(clazz = 360067462839075789L, container = 360067462839075789L, user = true)
    private static class b {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = -154935984245502600L)
        private char[] DW;

        @dy(field = -579948697764693891L)
        private int FH;

        @dy(field = 1643712530113753840L)
        private int Hw;

        @dy(field = -780026256647088120L)
        private boolean Zo;

        @dy(field = 1080115843439291395L)
        private Reader j6;

        @dy(field = 1227842092717902740L)
        private int v5;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 590000645075506263L)
        private b() {
            try {
                if (VH) {
                    iy.gn(21467321654305821L, null);
                }
                this.DW = new char[10000];
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 21467321654305821L, null);
                }
                throw th;
            }
        }

        @ey(method = 6376075865391217836L)
        public void DW(Reader reader, boolean z) {
            try {
                if (VH) {
                    iy.EQ(-5234702712596929247L, this, reader, new Boolean(z));
                }
                this.Zo = z;
                this.j6 = reader;
                this.v5 = 0;
                this.Hw = 0;
                this.FH = 0;
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, -5234702712596929247L, this, reader, new Boolean(z));
                }
                throw th;
            }
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:67:0x0105. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0108. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:75:0x0126. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:76:0x0129. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:82:0x0149. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:83:0x014c. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00c5 A[Catch: all -> 0x01a9, FALL_THROUGH, TryCatch #0 {all -> 0x01a9, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0022, B:11:0x0033, B:13:0x003b, B:16:0x0044, B:19:0x0048, B:22:0x0057, B:25:0x005c, B:26:0x0066, B:28:0x006c, B:31:0x0077, B:34:0x0089, B:37:0x009a, B:99:0x0198, B:49:0x00b5, B:50:0x00b7, B:51:0x00ba, B:52:0x00bd, B:53:0x00c0, B:54:0x00c5, B:58:0x00dd, B:63:0x00e7, B:64:0x00f4, B:66:0x0101, B:67:0x0105, B:68:0x0108, B:69:0x010b, B:70:0x010e, B:73:0x0117, B:74:0x0123, B:75:0x0126, B:76:0x0129, B:77:0x012c, B:78:0x012f, B:79:0x0137, B:80:0x0142, B:82:0x0149, B:83:0x014c, B:84:0x014f, B:85:0x0152, B:86:0x015a, B:88:0x0169, B:90:0x0170, B:92:0x0180, B:96:0x018b, B:100:0x01a2), top: B:109:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0117 A[Catch: all -> 0x01a9, FALL_THROUGH, TryCatch #0 {all -> 0x01a9, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0022, B:11:0x0033, B:13:0x003b, B:16:0x0044, B:19:0x0048, B:22:0x0057, B:25:0x005c, B:26:0x0066, B:28:0x006c, B:31:0x0077, B:34:0x0089, B:37:0x009a, B:99:0x0198, B:49:0x00b5, B:50:0x00b7, B:51:0x00ba, B:52:0x00bd, B:53:0x00c0, B:54:0x00c5, B:58:0x00dd, B:63:0x00e7, B:64:0x00f4, B:66:0x0101, B:67:0x0105, B:68:0x0108, B:69:0x010b, B:70:0x010e, B:73:0x0117, B:74:0x0123, B:75:0x0126, B:76:0x0129, B:77:0x012c, B:78:0x012f, B:79:0x0137, B:80:0x0142, B:82:0x0149, B:83:0x014c, B:84:0x014f, B:85:0x0152, B:86:0x015a, B:88:0x0169, B:90:0x0170, B:92:0x0180, B:96:0x018b, B:100:0x01a2), top: B:109:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0137 A[Catch: all -> 0x01a9, FALL_THROUGH, TryCatch #0 {all -> 0x01a9, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0022, B:11:0x0033, B:13:0x003b, B:16:0x0044, B:19:0x0048, B:22:0x0057, B:25:0x005c, B:26:0x0066, B:28:0x006c, B:31:0x0077, B:34:0x0089, B:37:0x009a, B:99:0x0198, B:49:0x00b5, B:50:0x00b7, B:51:0x00ba, B:52:0x00bd, B:53:0x00c0, B:54:0x00c5, B:58:0x00dd, B:63:0x00e7, B:64:0x00f4, B:66:0x0101, B:67:0x0105, B:68:0x0108, B:69:0x010b, B:70:0x010e, B:73:0x0117, B:74:0x0123, B:75:0x0126, B:76:0x0129, B:77:0x012c, B:78:0x012f, B:79:0x0137, B:80:0x0142, B:82:0x0149, B:83:0x014c, B:84:0x014f, B:85:0x0152, B:86:0x015a, B:88:0x0169, B:90:0x0170, B:92:0x0180, B:96:0x018b, B:100:0x01a2), top: B:109:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x015a A[Catch: all -> 0x01a9, FALL_THROUGH, TryCatch #0 {all -> 0x01a9, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0022, B:11:0x0033, B:13:0x003b, B:16:0x0044, B:19:0x0048, B:22:0x0057, B:25:0x005c, B:26:0x0066, B:28:0x006c, B:31:0x0077, B:34:0x0089, B:37:0x009a, B:99:0x0198, B:49:0x00b5, B:50:0x00b7, B:51:0x00ba, B:52:0x00bd, B:53:0x00c0, B:54:0x00c5, B:58:0x00dd, B:63:0x00e7, B:64:0x00f4, B:66:0x0101, B:67:0x0105, B:68:0x0108, B:69:0x010b, B:70:0x010e, B:73:0x0117, B:74:0x0123, B:75:0x0126, B:76:0x0129, B:77:0x012c, B:78:0x012f, B:79:0x0137, B:80:0x0142, B:82:0x0149, B:83:0x014c, B:84:0x014f, B:85:0x0152, B:86:0x015a, B:88:0x0169, B:90:0x0170, B:92:0x0180, B:96:0x018b, B:100:0x01a2), top: B:109:0x0006 }] */
        @abcd.ey(method = 1500114767464306872L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int FH(int[] r19, char[] r20, int r21, int r22) {
            /*
                Method dump skipped, instructions count: 682
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: abcd.t6.b.FH(int[], char[], int, int):int");
        }

        @ey(method = -340038269752885847L)
        public void j6() {
            try {
                if (VH) {
                    iy.gn(-2147383037763470692L, this);
                }
                this.j6 = null;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -2147383037763470692L, this);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -164454873948508804L)
        public /* synthetic */ b(a aVar) {
            this();
            try {
                if (VH) {
                    iy.tp(456488072822823984L, null, aVar);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 456488072822823984L, null, aVar);
                }
                throw th;
            }
        }
    }
}
