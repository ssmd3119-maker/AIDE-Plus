package abcd;

import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class y60 {
    public static final byte[] FH = r60.Hw("tree ");
    public static final byte[] Hw = r60.Hw("parent ");
    public static final byte[] v5 = r60.Hw("author ");
    public static final byte[] Zo = r60.Hw("committer ");
    public static final byte[] VH = r60.Hw("encoding ");
    public static final byte[] gn = r60.Hw("object ");
    public static final byte[] u7 = r60.Hw("type ");
    public static final byte[] tp = r60.Hw("tag ");
    public static final byte[] EQ = r60.Hw("tagger ");
    private final w60 j6 = new w60();
    private final hg0 DW = new hg0();

    private int VH(byte[] bArr, int i) {
        try {
            this.j6.Sf(bArr, i);
            return i + 40;
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    private static boolean Zo(byte[] bArr, int i, int i2) {
        int iU7;
        int length = bArr.length;
        int i3 = i2 + 1 + 20;
        while (true) {
            int i4 = 0;
            while (i3 < length) {
                int i5 = i3 + 1;
                byte b = bArr[i3];
                if (32 == b) {
                    int i6 = i5;
                    while (i6 != length) {
                        int i7 = i6 + 1;
                        if (bArr[i6] != 0) {
                            i6 = i7;
                        } else {
                            if (i5 + 1 == i7 || (iU7 = u7(bArr, i, i2, t60.Hw.Zo(), i5, i7 - 1, i4)) < 0) {
                                return false;
                            }
                            if (iU7 == 0) {
                                return true;
                            }
                            i3 = i7 + 20;
                        }
                    }
                    return false;
                }
                i4 = (i4 << 3) + (b - 48);
                i3 = i5;
            }
            return false;
        }
    }

    private static int gn(int i) {
        return t60.Hw.Hw(i) ? 47 : 0;
    }

    private int tp(byte[] bArr, int i) {
        int iJ3;
        int iJ32 = kg0.j3(bArr, i, '<');
        if (iJ32 != i && bArr[iJ32 - 1] == 60 && (iJ3 = kg0.j3(bArr, iJ32, '>')) != iJ32 && bArr[iJ3 - 1] == 62 && iJ3 != bArr.length && bArr[iJ3] == 32) {
            int i2 = iJ3 + 1;
            kg0.Mr(bArr, i2, this.DW);
            hg0 hg0Var = this.DW;
            int i3 = hg0Var.j6;
            if (i2 != i3 && i3 != bArr.length && bArr[i3] == 32) {
                int i4 = i3 + 1;
                kg0.Mr(bArr, i4, hg0Var);
                int i5 = this.DW.j6;
                if (i4 == i5) {
                    return -1;
                }
                return i5;
            }
        }
        return -1;
    }

    private static int u7(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        while (i < i2 && i4 < i5) {
            int i7 = i + 1;
            int i8 = i4 + 1;
            int i9 = (bArr[i] & 255) - (bArr[i4] & 255);
            if (i9 != 0) {
                return i9;
            }
            i = i7;
            i4 = i8;
        }
        if (i < i2) {
            return (bArr[i] & 255) - gn(i6);
        }
        if (i4 < i5) {
            return gn(i3) - (bArr[i4] & 255);
        }
        return 0;
    }

    public void DW(byte[] bArr) {
    }

    public void FH(byte[] bArr) throws i40 {
        int iQX = kg0.QX(bArr, 0, FH);
        if (iQX < 0) {
            throw new i40("no tree header");
        }
        int iVH = VH(bArr, iQX);
        if (iVH >= 0) {
            int i = iVH + 1;
            if (bArr[iVH] == 10) {
                while (kg0.QX(bArr, i, Hw) >= 0) {
                    int iVH2 = VH(bArr, i + Hw.length);
                    if (iVH2 >= 0) {
                        i = iVH2 + 1;
                        if (bArr[iVH2] == 10) {
                        }
                    }
                    throw new i40("invalid parent");
                }
                int iQX2 = kg0.QX(bArr, i, v5);
                if (iQX2 < 0) {
                    throw new i40("no author");
                }
                int iTp = tp(bArr, iQX2);
                if (iTp >= 0) {
                    int i2 = iTp + 1;
                    if (bArr[iTp] == 10) {
                        int iQX3 = kg0.QX(bArr, i2, Zo);
                        if (iQX3 < 0) {
                            throw new i40("no committer");
                        }
                        int iTp2 = tp(bArr, iQX3);
                        if (iTp2 < 0 || bArr[iTp2] != 10) {
                            throw new i40("invalid committer");
                        }
                        return;
                    }
                }
                throw new i40("invalid author");
            }
        }
        throw new i40("invalid tree");
    }

    public void Hw(byte[] bArr) throws i40 {
        int iQX = kg0.QX(bArr, 0, gn);
        if (iQX < 0) {
            throw new i40("no object header");
        }
        int iVH = VH(bArr, iQX);
        if (iVH >= 0) {
            int i = iVH + 1;
            if (bArr[iVH] == 10) {
                int iQX2 = kg0.QX(bArr, i, u7);
                if (iQX2 < 0) {
                    throw new i40("no type header");
                }
                int iQX3 = kg0.QX(bArr, kg0.aM(bArr, iQX2), tp);
                if (iQX3 < 0) {
                    throw new i40("no tag header");
                }
                int iQX4 = kg0.QX(bArr, kg0.aM(bArr, iQX3), EQ);
                if (iQX4 > 0) {
                    int iTp = tp(bArr, iQX4);
                    if (iTp < 0 || bArr[iTp] != 10) {
                        throw new i40("invalid tagger");
                    }
                    return;
                }
                return;
            }
        }
        throw new i40("invalid object");
    }

    public void j6(int i, byte[] bArr) throws i40 {
        if (i == 1) {
            FH(bArr);
            return;
        }
        if (i == 2) {
            v5(bArr);
        } else if (i == 3) {
            DW(bArr);
        } else {
            if (i != 4) {
                throw new i40(MessageFormat.format(JGitText.DW().corruptObjectInvalidType2, Integer.valueOf(i)));
            }
            Hw(bArr);
        }
    }

    public void v5(byte[] bArr) throws i40 {
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            int i5 = 0;
            while (i != length) {
                int i6 = i + 1;
                byte b = bArr[i];
                if (32 == b) {
                    if (t60.v5(i5).VH() == -1) {
                        throw new i40("invalid mode " + i5);
                    }
                    int i7 = i6;
                    while (i7 != length) {
                        int i8 = i7 + 1;
                        byte b2 = bArr[i7];
                        if (b2 == 0) {
                            int i9 = i6 + 1;
                            if (i9 == i8) {
                                throw new i40("zero length name");
                            }
                            if (bArr[i6] == 46) {
                                int i10 = (i8 - 1) - i6;
                                if (i10 == 1) {
                                    throw new i40("invalid name '.'");
                                }
                                if (i10 == 2 && bArr[i9] == 46) {
                                    throw new i40("invalid name '..'");
                                }
                            }
                            int i11 = i8 - 1;
                            if (Zo(bArr, i6, i11)) {
                                throw new i40("duplicate entry names");
                            }
                            if (i2 != 0 && u7(bArr, i2, i3, i4, i6, i11, i5) > 0) {
                                throw new i40("incorrectly sorted");
                            }
                            int i12 = i8 + 20;
                            if (i12 > length) {
                                throw new i40("truncated in object id");
                            }
                            i3 = i11;
                            i = i12;
                            i4 = i5;
                            i2 = i6;
                        } else {
                            if (b2 == 47) {
                                throw new i40("name contains '/'");
                            }
                            i7 = i8;
                        }
                    }
                    throw new i40("truncated in name");
                }
                if (b < 48 || b > 55) {
                    throw new i40("invalid mode character");
                }
                if (i5 == 0 && b == 48) {
                    throw new i40("mode starts with '0'");
                }
                i5 = (i5 << 3) + (b - 48);
                i = i6;
            }
            throw new i40("truncated in mode");
        }
    }
}
