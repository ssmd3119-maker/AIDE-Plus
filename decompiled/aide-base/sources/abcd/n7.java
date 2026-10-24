package abcd;

import com.aide.codemodel.api.ErrorTable;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.PositionalReader;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.io.Reader;

@cy(clazz = -91091189245934200L, container = -91091189245934200L, user = true)
/* loaded from: classes.dex */
public class n7 {

    @fy
    private static /* synthetic */ boolean J8;

    @gy
    private static /* synthetic */ boolean Ws;

    @dy(field = 2246722125556147984L)
    private IdentifierSpace DW;

    @dy(field = -1187136677198625120L)
    private boolean EQ;

    @dy(field = 4550223245666112L)
    private Language FH;

    @dy(field = 3911059703510540361L)
    private Language Hw;

    @dy(field = -3867199554652496669L)
    private PositionalReader J0;

    @dy(field = -3345973923036561635L)
    private boolean VH;

    @dy(field = 633462943623921600L)
    private int[] Zo;

    @dy(field = -1576693023334380032L)
    private boolean gn;

    @dy(field = -1809753958658943940L)
    private ErrorTable j6;

    @dy(field = 226407298379371200L)
    private char[] tp;

    @dy(field = 616747815422102544L)
    private FileEntry u7;

    @dy(field = 612509797419806080L)
    private char[] v5;

    @dy(field = -2278442846173337207L)
    private b we;

    static {
        iy.Zo(n7.class);
    }

    @ey(method = 2208610085862858384L)
    public n7(IdentifierSpace identifierSpace, ErrorTable errorTable, Language language, Language language2) {
        try {
            if (J8) {
                iy.J0(308336545337708272L, null, identifierSpace, errorTable, language, language2);
            }
            this.v5 = new char[10000];
            this.Zo = new int[10000];
            this.tp = new char[1000];
            this.EQ = true;
            this.we = new b(null);
            this.J0 = new PositionalReader();
            this.j6 = errorTable;
            this.DW = identifierSpace;
            this.FH = language;
            this.Hw = language2;
        } catch (Throwable th) {
            if (Ws) {
                iy.a8(th, 308336545337708272L, null, identifierSpace, errorTable, language, language2);
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
    @ey(method = 473970929265087903L)
    private void DW(int i, int i2, int i3) throws Throwable {
        ?? r1;
        int i4;
        try {
            if (J8) {
                r1 = 6691290082670747400;
                iy.we(6691290082670747400L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (this.gn) {
                try {
                    if (i3 == -1) {
                        r1 = i3;
                        i4 = i2;
                        this.j6.j3(this.u7, this.Hw, i, i2, i, i2 + 1, "Unexpected end of file", 0);
                    } else {
                        int i5 = i3;
                        i4 = i2;
                        if (i5 == 10) {
                            this.j6.j3(this.u7, this.Hw, i, i2, i, i4 + 1, "Unexpected end of line", 0);
                            r1 = i5;
                        } else {
                            int i6 = i4 + 1;
                            this.j6.j3(this.u7, this.Hw, i, i2, i, i6, "Unexpected " + (i5 == true ? (char) 1 : (char) 0), 0);
                            this.j6.Ws(this.u7, this.Hw, i, i2, i, i6, "", "Delete");
                            r1 = i5;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (Ws) {
                        iy.U2(th, 6691290082670747400L, this, new Integer(i), new Integer(i4), new Integer((int) r1));
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

    @ey(method = -109449437235804545L)
    private int FH(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        try {
            if (J8) {
                iy.we(-5472278712188666136L, this, cArr, new Integer(i), new Integer(i2));
            }
            if (i2 >= this.tp.length) {
                char[] cArr2 = new char[Math.max((this.tp.length * 2) + 1, i2)];
                System.arraycopy(this.tp, 0, cArr2, 0, this.tp.length);
                this.tp = cArr2;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i + i2) {
                char c = cArr[i5];
                if (c != '\\') {
                    i4 = i6 + 1;
                    this.tp[i6] = c;
                } else {
                    int i7 = i5 + 1;
                    char c2 = cArr[i7];
                    if (c2 == '\"') {
                        i3 = i6 + 1;
                        this.tp[i6] = '\"';
                    } else if (c2 == '\'') {
                        i3 = i6 + 1;
                        this.tp[i6] = '\'';
                    } else if (c2 == '\\') {
                        i4 = i6 + 1;
                        this.tp[i6] = '\\';
                        i5 = i7;
                    } else if (c2 == 'b') {
                        i3 = i6 + 1;
                        this.tp[i6] = '\b';
                    } else if (c2 == 'f') {
                        i3 = i6 + 1;
                        this.tp[i6] = '\f';
                    } else if (c2 == 'n') {
                        i3 = i6 + 1;
                        this.tp[i6] = '\n';
                    } else if (c2 == 'r') {
                        i3 = i6 + 1;
                        this.tp[i6] = '\r';
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
                                    this.tp[i6] = (char) i9;
                                    break;
                                }
                                i4 = i6 + 1;
                                this.tp[i6] = (char) i9;
                                break;
                            default:
                                continue;
                                i5++;
                        }
                    } else {
                        i3 = i6 + 1;
                        this.tp[i6] = '\t';
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
            if (Ws) {
                iy.U2(th, -5472278712188666136L, this, cArr, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -5839956476005329072L)
    private int Hw(char[] cArr, int i, int i2) {
        try {
            if (J8) {
                iy.we(-1952179070349502225L, this, cArr, new Integer(i), new Integer(i2));
            }
            switch (i2) {
                case 2:
                    char c = cArr[i];
                    if (c == 'd') {
                        return cArr[i + 1] != 'o' ? -1 : 54;
                    }
                    if (c != 'i') {
                        return -1;
                    }
                    int i3 = i + 1;
                    if (cArr[i3] == 'f') {
                        return 55;
                    }
                    return cArr[i3] == 'n' ? 114 : -1;
                case 3:
                    char c2 = cArr[i];
                    return c2 != 'f' ? c2 != 'n' ? c2 != 't' ? (c2 == 'v' && cArr[i + 1] == 'a' && cArr[i + 2] == 'r') ? 98 : -1 : (cArr[i + 1] == 'r' && cArr[i + 2] == 'y') ? 59 : -1 : (cArr[i + 1] == 'e' && cArr[i + 2] == 'w') ? 58 : -1 : (cArr[i + 1] == 'o' && cArr[i + 2] == 'r') ? 56 : -1;
                case 4:
                    char c3 = cArr[i];
                    if (c3 == 'c') {
                        return (cArr[i + 1] == 'a' && cArr[i + 2] == 's' && cArr[i + 3] == 'e') ? 61 : -1;
                    }
                    if (c3 == 'e') {
                        return (cArr[i + 1] == 'l' && cArr[i + 2] == 's' && cArr[i + 3] == 'e') ? 63 : -1;
                    }
                    if (c3 == 'g') {
                        return (cArr[i + 1] == 'o' && cArr[i + 2] == 't' && cArr[i + 3] == 'o') ? 64 : -1;
                    }
                    if (c3 == 'n') {
                        return (cArr[i + 1] == 'u' && cArr[i + 2] == 'l' && cArr[i + 3] == 'l') ? 66 : -1;
                    }
                    if (c3 != 't') {
                        return c3 != 'v' ? (c3 == 'w' && cArr[i + 1] == 'i' && cArr[i + 2] == 't' && cArr[i + 3] == 'h') ? 106 : -1 : (cArr[i + 1] == 'o' && cArr[i + 2] == 'i' && cArr[i + 3] == 'd') ? 69 : -1;
                    }
                    char c4 = cArr[i + 1];
                    return c4 != 'h' ? (c4 == 'r' && cArr[i + 2] == 'u' && cArr[i + 3] == 'e') ? 68 : -1 : (cArr[i + 2] == 'i' && cArr[i + 3] == 's') ? 67 : -1;
                case 5:
                    char c5 = cArr[i];
                    if (c5 == 'b') {
                        return (cArr[i + 1] == 'r' && cArr[i + 2] == 'e' && cArr[i + 3] == 'a' && cArr[i + 4] == 'k') ? 70 : -1;
                    }
                    if (c5 == 'c') {
                        return (cArr[i + 1] == 'a' && cArr[i + 2] == 't' && cArr[i + 3] == 'c' && cArr[i + 4] == 'h') ? 71 : -1;
                    }
                    if (c5 != 'f') {
                        return c5 != 't' ? (c5 == 'w' && cArr[i + 1] == 'h' && cArr[i + 2] == 'i' && cArr[i + 3] == 'l' && cArr[i + 4] == 'e') ? 80 : -1 : (cArr[i + 1] == 'h' && cArr[i + 2] == 'r' && cArr[i + 3] == 'o' && cArr[i + 4] == 'w') ? 79 : -1;
                    }
                    char c6 = cArr[i + 1];
                    return c6 != 'a' ? (c6 == 'l' && cArr[i + 2] == 'o' && cArr[i + 3] == 'a' && cArr[i + 4] == 't') ? 76 : -1 : (cArr[i + 2] == 'l' && cArr[i + 3] == 's' && cArr[i + 4] == 'e') ? 74 : -1;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    char c7 = cArr[i];
                    if (c7 == 'd') {
                        return (cArr[i + 1] == 'e' && cArr[i + 2] == 'l' && cArr[i + 3] == 'e' && cArr[i + 4] == 't' && cArr[i + 5] == 'e') ? 118 : -1;
                    }
                    if (c7 == 'i') {
                        return (cArr[i + 1] == 'm' && cArr[i + 2] == 'p' && cArr[i + 3] == 'o' && cArr[i + 4] == 'r' && cArr[i + 5] == 't') ? 82 : -1;
                    }
                    switch (c7) {
                        case 'r':
                            return (cArr[i + 1] == 'e' && cArr[i + 2] == 't' && cArr[i + 3] == 'u' && cArr[i + 4] == 'r' && cArr[i + 5] == 'n') ? 85 : -1;
                        case 's':
                            return (cArr[i + 1] == 'w' && cArr[i + 2] == 'i' && cArr[i + 3] == 't' && cArr[i + 4] == 'c' && cArr[i + 5] == 'h') ? 87 : -1;
                        case 't':
                            return (cArr[i + 1] == 'y' && cArr[i + 2] == 'p' && cArr[i + 3] == 'e' && cArr[i + 4] == 'o' && cArr[i + 5] == 'f') ? 105 : -1;
                        default:
                            return -1;
                    }
                case UserTouchAction.CLICK_KIND /* 7 */:
                    switch (cArr[i]) {
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
                    return (cArr[i] == 'f' && cArr[i + 1] == 'u' && cArr[i + 2] == 'n' && cArr[i + 3] == 'c' && cArr[i + 4] == 't' && cArr[i + 5] == 'i' && cArr[i + 6] == 'o' && cArr[i + 7] == 'n') ? 97 : -1;
                case 9:
                case 11:
                default:
                    return -1;
                case 10:
                    return (cArr[i] == 'i' && cArr[i + 1] == 'n' && cArr[i + 2] == 's' && cArr[i + 3] == 't' && cArr[i + 4] == 'a' && cArr[i + 5] == 'n' && cArr[i + 6] == 'c' && cArr[i + 7] == 'e' && cArr[i + 8] == 'o' && cArr[i + 9] == 'f') ? 103 : -1;
                case 12:
                    return (cArr[i] == 's' && cArr[i + 1] == 'y' && cArr[i + 2] == 'n' && cArr[i + 3] == 'c' && cArr[i + 4] == 'h' && cArr[i + 5] == 'r' && cArr[i + 6] == 'o' && cArr[i + 7] == 'n' && cArr[i + 8] == 'i' && cArr[i + 9] == 'z' && cArr[i + 10] == 'e' && cArr[i + 11] == 'd') ? 104 : -1;
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.U2(th, -1952179070349502225L, this, cArr, new Integer(i), new Integer(i2));
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
    @ey(method = 81511513981277040L)
    private void j6(int i, int i2, int i3) throws Throwable {
        ?? r1;
        int i4;
        try {
            if (J8) {
                r1 = 3937750127273522569;
                iy.we(3937750127273522569L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (this.VH) {
                try {
                    if (i3 == -1) {
                        r1 = i3;
                        i4 = i2;
                        this.j6.j3(this.u7, this.FH, i, i2, i, i2 + 1, "Unexpected end of file", 0);
                    } else {
                        int i5 = i3;
                        i4 = i2;
                        if (i5 == 10) {
                            this.j6.j3(this.u7, this.FH, i, i2, i, i4 + 1, "Unexpected end of line", 0);
                            r1 = i5;
                        } else {
                            int i6 = i4 + 1;
                            this.j6.j3(this.u7, this.FH, i, i2, i, i6, "Unexpected " + (i5 == true ? (char) 1 : (char) 0), 0);
                            this.j6.Ws(this.u7, this.FH, i, i2, i, i6, "", "Delete");
                            r1 = i5;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (Ws) {
                        iy.U2(th, 3937750127273522569L, this, new Integer(i), new Integer(i4), new Integer((int) r1));
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
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
    /* JADX WARN: Failed to find 'out' block for switch in B:424:0x06d2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:445:0x0721. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:446:0x0724. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:429:0x06ed  */
    @abcd.ey(method = 2991886989411980880L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v5(com.aide.codemodel.api.FileEntry r42, java.io.Reader r43, boolean r44, boolean r45, boolean r46, boolean r47, com.aide.codemodel.api.SyntaxTreeStyles r48, com.aide.codemodel.api.SyntaxTreeStyles r49) {
        /*
            Method dump skipped, instructions count: 4106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.n7.v5(com.aide.codemodel.api.FileEntry, java.io.Reader, boolean, boolean, boolean, boolean, com.aide.codemodel.api.SyntaxTreeStyles, com.aide.codemodel.api.SyntaxTreeStyles):void");
    }

    @cy(clazz = 5504005326996060145L, container = 5504005326996060145L, user = true)
    private static class b {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = 2332884344120391408L)
        private char[] DW;

        @dy(field = -2645209814317612695L)
        private int FH;

        @dy(field = -287330387359520184L)
        private int Hw;

        @dy(field = -3813596426542205040L)
        private boolean Zo;

        @dy(field = -2961857244828191745L)
        private Reader j6;

        @dy(field = -2407682063477602356L)
        private int v5;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -66911141581083135L)
        private b() {
            try {
                if (VH) {
                    iy.gn(5916128926693098951L, null);
                }
                this.DW = new char[10000];
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 5916128926693098951L, null);
                }
                throw th;
            }
        }

        @ey(method = 1169903100113056728L)
        public void DW(Reader reader, boolean z) {
            try {
                if (VH) {
                    iy.EQ(5210857146505927715L, this, reader, new Boolean(z));
                }
                this.Zo = z;
                this.j6 = reader;
                this.v5 = 0;
                this.Hw = 0;
                this.FH = 0;
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, 5210857146505927715L, this, reader, new Boolean(z));
                }
                throw th;
            }
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:66:0x0104. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:67:0x0107. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:74:0x0125. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:75:0x0128. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:81:0x0148. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:82:0x014b. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00c4 A[Catch: all -> 0x01a8, FALL_THROUGH, TryCatch #0 {all -> 0x01a8, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0022, B:10:0x0033, B:12:0x003b, B:15:0x0044, B:18:0x0047, B:21:0x0056, B:24:0x005b, B:25:0x0065, B:27:0x006b, B:30:0x0076, B:33:0x0088, B:36:0x0099, B:98:0x0197, B:48:0x00b4, B:49:0x00b6, B:50:0x00b9, B:51:0x00bc, B:52:0x00bf, B:53:0x00c4, B:57:0x00dc, B:62:0x00e6, B:63:0x00f3, B:65:0x0100, B:66:0x0104, B:67:0x0107, B:68:0x010a, B:69:0x010d, B:72:0x0116, B:73:0x0122, B:74:0x0125, B:75:0x0128, B:76:0x012b, B:77:0x012e, B:78:0x0136, B:79:0x0141, B:81:0x0148, B:82:0x014b, B:83:0x014e, B:84:0x0151, B:85:0x0159, B:87:0x0168, B:89:0x016f, B:91:0x017f, B:95:0x018a, B:99:0x01a1), top: B:108:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0116 A[Catch: all -> 0x01a8, FALL_THROUGH, TryCatch #0 {all -> 0x01a8, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0022, B:10:0x0033, B:12:0x003b, B:15:0x0044, B:18:0x0047, B:21:0x0056, B:24:0x005b, B:25:0x0065, B:27:0x006b, B:30:0x0076, B:33:0x0088, B:36:0x0099, B:98:0x0197, B:48:0x00b4, B:49:0x00b6, B:50:0x00b9, B:51:0x00bc, B:52:0x00bf, B:53:0x00c4, B:57:0x00dc, B:62:0x00e6, B:63:0x00f3, B:65:0x0100, B:66:0x0104, B:67:0x0107, B:68:0x010a, B:69:0x010d, B:72:0x0116, B:73:0x0122, B:74:0x0125, B:75:0x0128, B:76:0x012b, B:77:0x012e, B:78:0x0136, B:79:0x0141, B:81:0x0148, B:82:0x014b, B:83:0x014e, B:84:0x0151, B:85:0x0159, B:87:0x0168, B:89:0x016f, B:91:0x017f, B:95:0x018a, B:99:0x01a1), top: B:108:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0136 A[Catch: all -> 0x01a8, FALL_THROUGH, TryCatch #0 {all -> 0x01a8, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0022, B:10:0x0033, B:12:0x003b, B:15:0x0044, B:18:0x0047, B:21:0x0056, B:24:0x005b, B:25:0x0065, B:27:0x006b, B:30:0x0076, B:33:0x0088, B:36:0x0099, B:98:0x0197, B:48:0x00b4, B:49:0x00b6, B:50:0x00b9, B:51:0x00bc, B:52:0x00bf, B:53:0x00c4, B:57:0x00dc, B:62:0x00e6, B:63:0x00f3, B:65:0x0100, B:66:0x0104, B:67:0x0107, B:68:0x010a, B:69:0x010d, B:72:0x0116, B:73:0x0122, B:74:0x0125, B:75:0x0128, B:76:0x012b, B:77:0x012e, B:78:0x0136, B:79:0x0141, B:81:0x0148, B:82:0x014b, B:83:0x014e, B:84:0x0151, B:85:0x0159, B:87:0x0168, B:89:0x016f, B:91:0x017f, B:95:0x018a, B:99:0x01a1), top: B:108:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0159 A[Catch: all -> 0x01a8, FALL_THROUGH, TryCatch #0 {all -> 0x01a8, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0022, B:10:0x0033, B:12:0x003b, B:15:0x0044, B:18:0x0047, B:21:0x0056, B:24:0x005b, B:25:0x0065, B:27:0x006b, B:30:0x0076, B:33:0x0088, B:36:0x0099, B:98:0x0197, B:48:0x00b4, B:49:0x00b6, B:50:0x00b9, B:51:0x00bc, B:52:0x00bf, B:53:0x00c4, B:57:0x00dc, B:62:0x00e6, B:63:0x00f3, B:65:0x0100, B:66:0x0104, B:67:0x0107, B:68:0x010a, B:69:0x010d, B:72:0x0116, B:73:0x0122, B:74:0x0125, B:75:0x0128, B:76:0x012b, B:77:0x012e, B:78:0x0136, B:79:0x0141, B:81:0x0148, B:82:0x014b, B:83:0x014e, B:84:0x0151, B:85:0x0159, B:87:0x0168, B:89:0x016f, B:91:0x017f, B:95:0x018a, B:99:0x01a1), top: B:108:0x0006 }] */
        @abcd.ey(method = 3994069125885230652L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int FH(int[] r19, char[] r20, int r21, int r22) {
            /*
                Method dump skipped, instructions count: 682
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: abcd.n7.b.FH(int[], char[], int, int):int");
        }

        @ey(method = 2591277200337815663L)
        public void j6() {
            try {
                if (VH) {
                    iy.gn(-1017463137570305400L, this);
                }
                this.j6 = null;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -1017463137570305400L, this);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -35851497262301880L)
        public /* synthetic */ b(a aVar) {
            this();
            try {
                if (VH) {
                    iy.tp(363033980906342116L, null, aVar);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 363033980906342116L, null, aVar);
                }
                throw th;
            }
        }
    }
}
