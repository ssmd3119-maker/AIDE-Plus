package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.internal.ads.zzki;

/* loaded from: classes.dex */
public final class qi0 {
    private static final int j6 = ip0.Ws("nam");
    private static final int DW = ip0.Ws("trk");
    private static final int FH = ip0.Ws("cmt");
    private static final int Hw = ip0.Ws("day");
    private static final int v5 = ip0.Ws("ART");
    private static final int Zo = ip0.Ws("too");
    private static final int VH = ip0.Ws("alb");
    private static final int gn = ip0.Ws("com");
    private static final int u7 = ip0.Ws("wrt");
    private static final int tp = ip0.Ws("lyr");
    private static final int EQ = ip0.Ws("gen");
    private static final int we = ip0.Ws("covr");
    private static final int J0 = ip0.Ws("gnre");
    private static final int J8 = ip0.Ws("grp");
    private static final int Ws = ip0.Ws("disk");
    private static final int QX = ip0.Ws("trkn");
    private static final int XL = ip0.Ws("tmpo");
    private static final int aM = ip0.Ws("cpil");
    private static final int j3 = ip0.Ws("aART");
    private static final int Mr = ip0.Ws("sonm");
    private static final int U2 = ip0.Ws("soal");
    private static final int a8 = ip0.Ws("soar");
    private static final int lg = ip0.Ws("soaa");
    private static final int rN = ip0.Ws("soco");
    private static final int er = ip0.Ws("rtng");
    private static final int yS = ip0.Ws("pgap");
    private static final int gW = ip0.Ws("sosn");
    private static final int BT = ip0.Ws("tvsh");
    private static final int vy = ip0.Ws("----");
    private static final String[] P8 = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    private static zzkq DW(int i, String str, ap0 ap0Var) {
        int iHw = ap0Var.Hw();
        if (ap0Var.Hw() == zh0.q7) {
            ap0Var.J0(8);
            return new zzkq(str, null, ap0Var.J8(iHw - 16));
        }
        String strValueOf = String.valueOf(zh0.FH(i));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse text attribute: ".concat(strValueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static zzkq FH(int i, String str, ap0 ap0Var) {
        int iHw = ap0Var.Hw();
        if (ap0Var.Hw() == zh0.q7 && iHw >= 22) {
            ap0Var.J0(10);
            int iGn = ap0Var.gn();
            if (iGn > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(iGn);
                String string = sb.toString();
                int iGn2 = ap0Var.gn();
                if (iGn2 > 0) {
                    String strValueOf = String.valueOf(string);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 12);
                    sb2.append(strValueOf);
                    sb2.append("/");
                    sb2.append(iGn2);
                    string = sb2.toString();
                }
                return new zzkq(str, null, string);
            }
        }
        String strValueOf2 = String.valueOf(zh0.FH(i));
        Log.w("MetadataUtil", strValueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(strValueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    public static zzki.zza Hw(ap0 ap0Var) {
        int iDW = ap0Var.DW() + ap0Var.Hw();
        int iHw = ap0Var.Hw();
        int i = iHw >>> 24;
        zzkp zzkmVar = null;
        try {
            if (i == 169 || i == 65533) {
                int i2 = 16777215 & iHw;
                if (i2 == FH) {
                    int iHw2 = ap0Var.Hw();
                    if (ap0Var.Hw() == zh0.q7) {
                        ap0Var.J0(8);
                        String strJ8 = ap0Var.J8(iHw2 - 16);
                        zzkmVar = new zzkm("und", strJ8, strJ8);
                    } else {
                        String strValueOf = String.valueOf(zh0.FH(iHw));
                        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(strValueOf) : new String("Failed to parse comment attribute: "));
                    }
                    return zzkmVar;
                }
                if (i2 != j6 && i2 != DW) {
                    if (i2 != gn && i2 != u7) {
                        if (i2 == Hw) {
                            return DW(iHw, "TDRC", ap0Var);
                        }
                        if (i2 == v5) {
                            return DW(iHw, "TPE1", ap0Var);
                        }
                        if (i2 == Zo) {
                            return DW(iHw, "TSSE", ap0Var);
                        }
                        if (i2 == VH) {
                            return DW(iHw, "TALB", ap0Var);
                        }
                        if (i2 == tp) {
                            return DW(iHw, "USLT", ap0Var);
                        }
                        if (i2 == EQ) {
                            return DW(iHw, "TCON", ap0Var);
                        }
                        if (i2 == J8) {
                            return DW(iHw, "TIT1", ap0Var);
                        }
                    }
                    return DW(iHw, "TCOM", ap0Var);
                }
                return DW(iHw, "TIT2", ap0Var);
            }
            if (iHw == J0) {
                int iV5 = v5(ap0Var);
                String str = (iV5 <= 0 || iV5 > P8.length) ? null : P8[iV5 - 1];
                if (str != null) {
                    zzkmVar = new zzkq("TCON", null, str);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                }
                return zzkmVar;
            }
            if (iHw == Ws) {
                return FH(iHw, "TPOS", ap0Var);
            }
            if (iHw == QX) {
                return FH(iHw, "TRCK", ap0Var);
            }
            if (iHw == XL) {
                return j6(iHw, "TBPM", ap0Var, true, false);
            }
            if (iHw == aM) {
                return j6(iHw, "TCMP", ap0Var, true, true);
            }
            if (iHw == we) {
                int iHw3 = ap0Var.Hw();
                if (ap0Var.Hw() == zh0.q7) {
                    int iDW2 = zh0.DW(ap0Var.Hw());
                    String str2 = iDW2 == 13 ? "image/jpeg" : iDW2 == 14 ? "image/png" : null;
                    if (str2 == null) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Unrecognized cover art flags: ");
                        sb.append(iDW2);
                        Log.w("MetadataUtil", sb.toString());
                    } else {
                        ap0Var.J0(4);
                        int i3 = iHw3 - 16;
                        byte[] bArr = new byte[i3];
                        ap0Var.QX(bArr, 0, i3);
                        zzkmVar = new zzkk(str2, null, 3, bArr);
                    }
                } else {
                    Log.w("MetadataUtil", "Failed to parse cover art attribute");
                }
                return zzkmVar;
            }
            if (iHw == j3) {
                return DW(iHw, "TPE2", ap0Var);
            }
            if (iHw == Mr) {
                return DW(iHw, "TSOT", ap0Var);
            }
            if (iHw == U2) {
                return DW(iHw, "TSO2", ap0Var);
            }
            if (iHw == a8) {
                return DW(iHw, "TSOA", ap0Var);
            }
            if (iHw == lg) {
                return DW(iHw, "TSOP", ap0Var);
            }
            if (iHw == rN) {
                return DW(iHw, "TSOC", ap0Var);
            }
            if (iHw == er) {
                return j6(iHw, "ITUNESADVISORY", ap0Var, false, false);
            }
            if (iHw == yS) {
                return j6(iHw, "ITUNESGAPLESS", ap0Var, false, true);
            }
            if (iHw == gW) {
                return DW(iHw, "TVSHOWSORT", ap0Var);
            }
            if (iHw == BT) {
                return DW(iHw, "TVSHOW", ap0Var);
            }
            if (iHw == vy) {
                String strJ82 = null;
                String strJ83 = null;
                int i4 = -1;
                int i5 = -1;
                while (ap0Var.DW() < iDW) {
                    int iDW3 = ap0Var.DW();
                    int iHw4 = ap0Var.Hw();
                    int iHw5 = ap0Var.Hw();
                    ap0Var.J0(4);
                    if (iHw5 == zh0.hK) {
                        strJ82 = ap0Var.J8(iHw4 - 12);
                    } else if (iHw5 == zh0.cT) {
                        strJ83 = ap0Var.J8(iHw4 - 12);
                    } else {
                        if (iHw5 == zh0.q7) {
                            i4 = iDW3;
                            i5 = iHw4;
                        }
                        ap0Var.J0(iHw4 - 12);
                    }
                }
                if ("com.apple.iTunes".equals(strJ82) && "iTunSMPB".equals(strJ83) && i4 != -1) {
                    ap0Var.EQ(i4);
                    ap0Var.J0(16);
                    zzkmVar = new zzkm("und", strJ83, ap0Var.J8(i5 - 16));
                }
                return zzkmVar;
            }
            String strValueOf2 = String.valueOf(zh0.FH(iHw));
            Log.d("MetadataUtil", strValueOf2.length() != 0 ? "Skipped unknown metadata entry: ".concat(strValueOf2) : new String("Skipped unknown metadata entry: "));
            return null;
        } finally {
            ap0Var.EQ(iDW);
        }
    }

    private static zzkp j6(int i, String str, ap0 ap0Var, boolean z, boolean z2) {
        int iV5 = v5(ap0Var);
        if (z2) {
            iV5 = Math.min(1, iV5);
        }
        if (iV5 >= 0) {
            return z ? new zzkq(str, null, Integer.toString(iV5)) : new zzkm("und", str, Integer.toString(iV5));
        }
        String strValueOf = String.valueOf(zh0.FH(i));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(strValueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static int v5(ap0 ap0Var) {
        ap0Var.J0(4);
        if (ap0Var.Hw() == zh0.q7) {
            ap0Var.J0(8);
            return ap0Var.VH();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
