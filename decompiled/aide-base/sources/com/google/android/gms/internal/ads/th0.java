package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.internal.ads.zzhp;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class th0 implements dh0 {
    private uo0 BT;
    private final yh0 DW;
    private final ap0 EQ;
    private final SparseArray<wh0> FH;
    private final boolean Hw;
    private int I;
    private final ap0 J0;
    private ByteBuffer J8;
    private int KD;
    private wh0 Mr;
    private byte Mz;
    private boolean P8;
    private long QX;
    private boolean Qq;
    private long SI;
    private boolean Sf;
    private boolean U2;
    private final ap0 VH;
    private long Ws;
    private long XL;
    private final ap0 Zo;
    private int a8;
    private long aM;
    private gh0 aj;
    private int ca;
    private int cb;
    private int[] cn;
    private int dx;
    private boolean ef;
    private int ei;
    private long er;
    private boolean g3;
    private long gW;
    private final ap0 gn;
    private long j3;
    private final rh0 j6;
    private long lg;
    private long nw;
    private boolean rN;
    private int ro;
    private int sG;
    private int sh;
    private boolean sy;
    private final ap0 tp;
    private final ap0 u7;
    private final ap0 v5;
    private boolean vJ;
    private uo0 vy;
    private final ap0 we;
    private int x9;
    private long yS;
    private static final byte[] lp = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] OW = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final UUID br = new UUID(72057594037932032L, -9223371306706625679L);

    public th0() {
        this(0);
    }

    private final void EQ(wh0 wh0Var, long j) {
        byte[] bArrWe;
        if ("S_TEXT/UTF8".equals(wh0Var.j6)) {
            byte[] bArr = this.EQ.j6;
            long j2 = this.SI;
            if (j2 == -9223372036854775807L) {
                bArrWe = OW;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (i * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - (60000000 * i2);
                bArrWe = ip0.we(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf((int) (j4 / 1000000)), Integer.valueOf((int) ((j4 - (1000000 * r4)) / 1000))));
            }
            System.arraycopy(bArrWe, 0, bArr, 19, 12);
            mh0 mh0Var = wh0Var.ef;
            ap0 ap0Var = this.EQ;
            mh0Var.Hw(ap0Var, ap0Var.FH());
            this.x9 += this.EQ.FH();
        }
        wh0Var.ef.FH(j, this.dx, this.x9, 0, wh0Var.VH);
        this.Qq = true;
        j3();
    }

    private final int Hw(fh0 fh0Var, mh0 mh0Var, int i) {
        int iDW;
        int iXL = this.tp.XL();
        if (iXL > 0) {
            iDW = Math.min(i, iXL);
            mh0Var.Hw(this.tp, iDW);
        } else {
            iDW = mh0Var.DW(fh0Var, i, false);
        }
        this.sG += iDW;
        this.x9 += iDW;
        return iDW;
    }

    static int J0(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case ProxyTextView.INPUTTYPE_textWebPassword /* 225 */:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case ProxyTextView.INPUTTYPE_textWebEditText /* 161 */:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    static boolean J8(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    private final void QX(fh0 fh0Var, int i) {
        if (this.VH.FH() >= i) {
            return;
        }
        if (this.VH.j6() < i) {
            ap0 ap0Var = this.VH;
            byte[] bArr = ap0Var.j6;
            ap0Var.Ws(Arrays.copyOf(bArr, Math.max(bArr.length << 1, i)), this.VH.FH());
        }
        ap0 ap0Var2 = this.VH;
        fh0Var.readFully(ap0Var2.j6, ap0Var2.FH(), i - this.VH.FH());
        this.VH.we(i);
    }

    private final long U2(long j) throws af0 {
        long j2 = this.XL;
        if (j2 != -9223372036854775807L) {
            return ip0.Hw(j, j2, 1000L);
        }
        throw new af0("Can't scale timecode prior to timecodeScale being set.");
    }

    private final void j3() {
        this.sG = 0;
        this.x9 = 0;
        this.ca = 0;
        this.ef = false;
        this.Sf = false;
        this.g3 = false;
        this.I = 0;
        this.Mz = (byte) 0;
        this.vJ = false;
        this.tp.u7();
    }

    private final void tp(fh0 fh0Var, wh0 wh0Var, int i) throws af0 {
        int i2;
        if ("S_TEXT/UTF8".equals(wh0Var.j6)) {
            int length = lp.length + i;
            if (this.EQ.j6() < length) {
                this.EQ.j6 = Arrays.copyOf(lp, length + i);
            }
            fh0Var.readFully(this.EQ.j6, lp.length, i);
            this.EQ.EQ(0);
            this.EQ.we(length);
            return;
        }
        mh0 mh0Var = wh0Var.ef;
        if (!this.ef) {
            if (wh0Var.v5) {
                this.dx &= -1073741825;
                if (!this.Sf) {
                    fh0Var.readFully(this.VH.j6, 0, 1);
                    this.sG++;
                    byte[] bArr = this.VH.j6;
                    if ((bArr[0] & 128) == 128) {
                        throw new af0("Extension bit is set in signal byte");
                    }
                    this.Mz = bArr[0];
                    this.Sf = true;
                }
                byte b = this.Mz;
                if ((b & 1) == 1) {
                    boolean z = (b & 2) == 2;
                    this.dx |= 1073741824;
                    if (!this.vJ) {
                        fh0Var.readFully(this.we.j6, 0, 8);
                        this.sG += 8;
                        this.vJ = true;
                        this.VH.j6[0] = (byte) ((z ? 128 : 0) | 8);
                        this.VH.EQ(0);
                        mh0Var.Hw(this.VH, 1);
                        this.x9++;
                        this.we.EQ(0);
                        mh0Var.Hw(this.we, 8);
                        this.x9 += 8;
                    }
                    if (z) {
                        if (!this.g3) {
                            fh0Var.readFully(this.VH.j6, 0, 1);
                            this.sG++;
                            this.VH.EQ(0);
                            this.I = this.VH.VH();
                            this.g3 = true;
                        }
                        int i3 = this.I << 2;
                        this.VH.tp(i3);
                        fh0Var.readFully(this.VH.j6, 0, i3);
                        this.sG += i3;
                        short s = (short) ((this.I / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.J8;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.J8 = ByteBuffer.allocate(i4);
                        }
                        this.J8.position(0);
                        this.J8.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.I;
                            if (i5 >= i2) {
                                break;
                            }
                            int iA8 = this.VH.a8();
                            if (i5 % 2 == 0) {
                                this.J8.putShort((short) (iA8 - i6));
                            } else {
                                this.J8.putInt(iA8 - i6);
                            }
                            i5++;
                            i6 = iA8;
                        }
                        int i7 = (i - this.sG) - i6;
                        if (i2 % 2 == 1) {
                            this.J8.putInt(i7);
                        } else {
                            this.J8.putShort((short) i7);
                            this.J8.putInt(0);
                        }
                        this.J0.Ws(this.J8.array(), i4);
                        mh0Var.Hw(this.J0, i4);
                        this.x9 += i4;
                    }
                }
            } else {
                byte[] bArr2 = wh0Var.Zo;
                if (bArr2 != null) {
                    this.tp.Ws(bArr2, bArr2.length);
                }
            }
            this.ef = true;
        }
        int iFH = i + this.tp.FH();
        if (!"V_MPEG4/ISO/AVC".equals(wh0Var.j6) && !"V_MPEGH/ISO/HEVC".equals(wh0Var.j6)) {
            while (true) {
                int i8 = this.sG;
                if (i8 >= iFH) {
                    break;
                } else {
                    Hw(fh0Var, mh0Var, iFH - i8);
                }
            }
        } else {
            byte[] bArr3 = this.Zo.j6;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i9 = wh0Var.Sf;
            int i10 = 4 - i9;
            while (this.sG < iFH) {
                int i11 = this.ca;
                if (i11 == 0) {
                    int iMin = Math.min(i9, this.tp.XL());
                    fh0Var.readFully(bArr3, i10 + iMin, i9 - iMin);
                    if (iMin > 0) {
                        this.tp.QX(bArr3, i10, iMin);
                    }
                    this.sG += i9;
                    this.Zo.EQ(0);
                    this.ca = this.Zo.a8();
                    this.v5.EQ(0);
                    mh0Var.Hw(this.v5, 4);
                    this.x9 += 4;
                } else {
                    this.ca = i11 - Hw(fh0Var, mh0Var, i11);
                }
            }
        }
        if ("A_VORBIS".equals(wh0Var.j6)) {
            this.gn.EQ(0);
            mh0Var.Hw(this.gn, 4);
            this.x9 += 4;
        }
    }

    private static int[] we(int[] iArr, int i) {
        return iArr == null ? new int[i] : iArr.length >= i ? iArr : new int[Math.max(iArr.length << 1, i)];
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0005 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.dh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int DW(com.google.android.gms.internal.ads.fh0 r9, com.google.android.gms.internal.ads.jh0 r10) {
        /*
            r8 = this;
            r0 = 0
            r8.Qq = r0
            r1 = 1
            r2 = 1
        L5:
            if (r2 == 0) goto L3a
            boolean r3 = r8.Qq
            if (r3 != 0) goto L3a
            com.google.android.gms.internal.ads.rh0 r2 = r8.j6
            boolean r2 = r2.j6(r9)
            if (r2 == 0) goto L5
            long r3 = r9.u7()
            boolean r5 = r8.rN
            if (r5 == 0) goto L25
            r8.yS = r3
            long r3 = r8.er
            r10.j6 = r3
            r8.rN = r0
        L23:
            r3 = 1
            goto L37
        L25:
            boolean r3 = r8.U2
            if (r3 == 0) goto L36
            long r3 = r8.yS
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L36
            r10.j6 = r3
            r8.yS = r5
            goto L23
        L36:
            r3 = 0
        L37:
            if (r3 == 0) goto L5
            return r1
        L3a:
            if (r2 == 0) goto L3d
            return r0
        L3d:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.th0.DW(com.google.android.gms.internal.ads.fh0, com.google.android.gms.internal.ads.jh0):int");
    }

    @Override // com.google.android.gms.internal.ads.dh0
    public final void FH(gh0 gh0Var) {
        this.aj = gh0Var;
    }

    @Override // com.google.android.gms.internal.ads.dh0
    public final boolean VH(fh0 fh0Var) {
        return new xh0().j6(fh0Var);
    }

    final void Ws(int i) {
        kh0 lh0Var;
        uo0 uo0Var;
        uo0 uo0Var2;
        int i2;
        if (i == 160) {
            if (this.ei != 2) {
                return;
            }
            if (!this.sy) {
                this.dx |= 1;
            }
            EQ(this.FH.get(this.sh), this.nw);
            this.ei = 0;
            return;
        }
        if (i == 174) {
            String str = this.Mr.j6;
            if ((("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) ? 1 : 0) != 0) {
                wh0 wh0Var = this.Mr;
                wh0Var.FH(this.aj, wh0Var.DW);
                SparseArray<wh0> sparseArray = this.FH;
                wh0 wh0Var2 = this.Mr;
                sparseArray.put(wh0Var2.DW, wh0Var2);
            }
            this.Mr = null;
            return;
        }
        if (i == 19899) {
            int i3 = this.a8;
            if (i3 != -1) {
                long j = this.lg;
                if (j != -1) {
                    if (i3 == 475249515) {
                        this.er = j;
                        return;
                    }
                    return;
                }
            }
            throw new af0("Mandatory element SeekID or SeekPosition not found");
        }
        if (i == 25152) {
            wh0 wh0Var3 = this.Mr;
            if (wh0Var3.v5) {
                if (wh0Var3.VH == null) {
                    throw new af0("Encrypted Track found but ContentEncKeyID was not found");
                }
                wh0Var3.u7 = new zzhp(new zzhp.zza(ie0.DW, "video/webm", this.Mr.VH.DW));
                return;
            }
            return;
        }
        if (i == 28032) {
            wh0 wh0Var4 = this.Mr;
            if (wh0Var4.v5 && wh0Var4.Zo != null) {
                throw new af0("Combining encryption and compression is not supported");
            }
            return;
        }
        if (i == 357149030) {
            if (this.XL == -9223372036854775807L) {
                this.XL = 1000000L;
            }
            long j2 = this.aM;
            if (j2 != -9223372036854775807L) {
                this.j3 = U2(j2);
                return;
            }
            return;
        }
        if (i == 374648427) {
            if (this.FH.size() == 0) {
                throw new af0("No valid tracks were found");
            }
            this.aj.Hw();
            return;
        }
        if (i == 475249515 && !this.U2) {
            gh0 gh0Var = this.aj;
            if (this.QX == -1 || this.j3 == -9223372036854775807L || (uo0Var = this.BT) == null || uo0Var.FH() == 0 || (uo0Var2 = this.vy) == null || uo0Var2.FH() != this.BT.FH()) {
                this.BT = null;
                this.vy = null;
                lh0Var = new lh0(this.j3);
            } else {
                int iFH = this.BT.FH();
                int[] iArr = new int[iFH];
                long[] jArr = new long[iFH];
                long[] jArr2 = new long[iFH];
                long[] jArr3 = new long[iFH];
                for (int i4 = 0; i4 < iFH; i4++) {
                    jArr3[i4] = this.BT.DW(i4);
                    jArr[i4] = this.QX + this.vy.DW(i4);
                }
                while (true) {
                    i2 = iFH - 1;
                    if (i >= i2) {
                        break;
                    }
                    int i5 = i + 1;
                    iArr[i] = (int) (jArr[i5] - jArr[i]);
                    jArr2[i] = jArr3[i5] - jArr3[i];
                    i = i5;
                }
                iArr[i2] = (int) ((this.QX + this.Ws) - jArr[i2]);
                jArr2[i2] = this.j3 - jArr3[i2];
                this.BT = null;
                this.vy = null;
                lh0Var = new ah0(iArr, jArr, jArr2, jArr3);
            }
            gh0Var.u7(lh0Var);
            this.U2 = true;
        }
    }

    final void XL(int i, long j) {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw new af0(sb.toString());
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw new af0(sb2.toString());
        }
        switch (i) {
            case 131:
                this.Mr.FH = (int) j;
                return;
            case 136:
                this.Mr.cb = j == 1;
                return;
            case 155:
                this.SI = U2(j);
                return;
            case 159:
                this.Mr.SI = (int) j;
                return;
            case 176:
                this.Mr.tp = (int) j;
                return;
            case 179:
                this.BT.j6(U2(j));
                return;
            case 186:
                this.Mr.EQ = (int) j;
                return;
            case 215:
                this.Mr.DW = (int) j;
                return;
            case 231:
                this.gW = U2(j);
                return;
            case 241:
                if (this.P8) {
                    return;
                }
                this.vy.j6(j);
                this.P8 = true;
                return;
            case 251:
                this.sy = true;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw new af0(sb3.toString());
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw new af0(sb4.toString());
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(50);
                sb5.append("EBMLReadVersion ");
                sb5.append(j);
                sb5.append(" not supported");
                throw new af0(sb5.toString());
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(49);
                sb6.append("ContentEncAlgo ");
                sb6.append(j);
                sb6.append(" not supported");
                throw new af0(sb6.toString());
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(56);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j);
                sb7.append(" not supported");
                throw new af0(sb7.toString());
            case 21420:
                this.lg = j + this.QX;
                return;
            case 21432:
                int i2 = (int) j;
                if (i2 == 0) {
                    this.Mr.QX = 0;
                    return;
                }
                if (i2 == 1) {
                    this.Mr.QX = 2;
                    return;
                } else if (i2 == 3) {
                    this.Mr.QX = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.Mr.QX = 3;
                    return;
                }
            case 21680:
                this.Mr.we = (int) j;
                return;
            case 21682:
                this.Mr.J8 = (int) j;
                return;
            case 21690:
                this.Mr.J0 = (int) j;
                return;
            case 21930:
                this.Mr.dx = j == 1;
                return;
            case 22186:
                this.Mr.cn = j;
                return;
            case 22203:
                this.Mr.sh = j;
                return;
            case 25188:
                this.Mr.KD = (int) j;
                return;
            case 2352003:
                this.Mr.Hw = (int) j;
                return;
            case 2807729:
                this.XL = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i3 = (int) j;
                        if (i3 == 1) {
                            this.Mr.Mr = 2;
                            return;
                        } else {
                            if (i3 != 2) {
                                return;
                            }
                            this.Mr.Mr = 1;
                            return;
                        }
                    case 21946:
                        int i4 = (int) j;
                        if (i4 != 1) {
                            if (i4 == 16) {
                                this.Mr.j3 = 6;
                                return;
                            } else if (i4 == 18) {
                                this.Mr.j3 = 7;
                                return;
                            } else if (i4 != 6 && i4 != 7) {
                                return;
                            }
                        }
                        this.Mr.j3 = 3;
                        return;
                    case 21947:
                        wh0 wh0Var = this.Mr;
                        wh0Var.XL = true;
                        int i5 = (int) j;
                        if (i5 == 1) {
                            wh0Var.aM = 1;
                            return;
                        }
                        if (i5 == 9) {
                            wh0Var.aM = 6;
                            return;
                        } else {
                            if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                this.Mr.aM = 2;
                                return;
                            }
                            return;
                        }
                    case 21948:
                        this.Mr.U2 = (int) j;
                        return;
                    case 21949:
                        this.Mr.a8 = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.dh0
    public final void Zo(long j, long j2) {
        this.gW = -9223372036854775807L;
        this.ei = 0;
        this.j6.DW();
        this.DW.j6();
        j3();
    }

    final void aM(int i, long j, long j2) {
        if (i == 160) {
            this.sy = false;
            return;
        }
        if (i == 174) {
            this.Mr = new wh0(null);
            return;
        }
        if (i == 187) {
            this.P8 = false;
            return;
        }
        if (i == 19899) {
            this.a8 = -1;
            this.lg = -1L;
            return;
        }
        if (i == 20533) {
            this.Mr.v5 = true;
            return;
        }
        if (i == 21968) {
            this.Mr.XL = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.QX;
            if (j3 != -1 && j3 != j) {
                throw new af0("Multiple Segment elements not supported");
            }
            this.QX = j;
            this.Ws = j2;
            return;
        }
        if (i == 475249515) {
            this.BT = new uo0();
            this.vy = new uo0();
        } else if (i == 524531317 && !this.U2) {
            if (this.Hw && this.er != -1) {
                this.rN = true;
            } else {
                this.aj.u7(new lh0(this.j3));
                this.U2 = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f0, code lost:
    
        throw new com.google.android.gms.internal.ads.af0("EBML lacing sample size out of range.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void gn(int r20, int r21, com.google.android.gms.internal.ads.fh0 r22) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.th0.gn(int, int, com.google.android.gms.internal.ads.fh0):void");
    }

    @Override // com.google.android.gms.internal.ads.dh0
    public final void j6() {
    }

    final void u7(int i, String str) {
        if (i == 134) {
            this.Mr.j6 = str;
            return;
        }
        if (i != 17026) {
            if (i != 2274716) {
                return;
            }
            this.Mr.sG = str;
        } else {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new af0(sb.toString());
        }
    }

    final void v5(int i, double d) {
        if (i == 181) {
            this.Mr.ro = (int) d;
            return;
        }
        if (i == 17545) {
            this.aM = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                this.Mr.lg = (float) d;
                break;
            case 21970:
                this.Mr.rN = (float) d;
                break;
            case 21971:
                this.Mr.er = (float) d;
                break;
            case 21972:
                this.Mr.yS = (float) d;
                break;
            case 21973:
                this.Mr.gW = (float) d;
                break;
            case 21974:
                this.Mr.BT = (float) d;
                break;
            case 21975:
                this.Mr.vy = (float) d;
                break;
            case 21976:
                this.Mr.P8 = (float) d;
                break;
            case 21977:
                this.Mr.ei = (float) d;
                break;
            case 21978:
                this.Mr.nw = (float) d;
                break;
        }
    }

    public th0(int i) {
        this(new oh0(), i);
    }

    private th0(rh0 rh0Var, int i) {
        this.QX = -1L;
        this.XL = -9223372036854775807L;
        this.aM = -9223372036854775807L;
        this.j3 = -9223372036854775807L;
        this.er = -1L;
        this.yS = -1L;
        this.gW = -9223372036854775807L;
        this.j6 = rh0Var;
        rh0Var.FH(new vh0(this, null));
        this.Hw = (i & 1) == 0;
        this.DW = new yh0();
        this.FH = new SparseArray<>();
        this.VH = new ap0(4);
        this.gn = new ap0(ByteBuffer.allocate(4).putInt(-1).array());
        this.u7 = new ap0(4);
        this.v5 = new ap0(xo0.j6);
        this.Zo = new ap0(4);
        this.tp = new ap0();
        this.EQ = new ap0();
        this.we = new ap0(8);
        this.J0 = new ap0();
    }
}
