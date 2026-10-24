package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes.dex */
public class zh0 {
    public static final int AL;
    public static final int Eq;
    public static final int Ev;
    public static final int FN;
    public static final int Jl;
    public static final int Q6;
    public static final int WB;
    public static final int Z1;
    public static final int aq;
    public static final int cT;
    public static final int e3;
    public static final int eU;
    public static final int fY;
    public static final int hK;
    public static final int hz;
    public static final int iW;
    public static final int jO;
    public static final int jw;
    public static final int k2;
    public static final int kf;
    public static final int ko;
    public static final int mb;
    public static final int n5;
    public static final int oY;
    public static final int q7;
    public static final int qp;
    public static final int sE;
    public static final int w9;
    public static final int ye;
    public static final int zh;
    public final int j6;
    public static final int DW = ip0.Ws("ftyp");
    public static final int FH = ip0.Ws("avc1");
    public static final int Hw = ip0.Ws("avc3");
    public static final int v5 = ip0.Ws("hvc1");
    public static final int Zo = ip0.Ws("hev1");
    public static final int VH = ip0.Ws("s263");
    public static final int gn = ip0.Ws("d263");
    public static final int u7 = ip0.Ws("mdat");
    public static final int tp = ip0.Ws("mp4a");
    public static final int EQ = ip0.Ws(".mp3");
    public static final int we = ip0.Ws("wave");
    public static final int J0 = ip0.Ws("lpcm");
    public static final int J8 = ip0.Ws("sowt");
    public static final int Ws = ip0.Ws("ac-3");
    public static final int QX = ip0.Ws("dac3");
    public static final int XL = ip0.Ws("ec-3");
    public static final int aM = ip0.Ws("dec3");
    public static final int j3 = ip0.Ws("dtsc");
    public static final int Mr = ip0.Ws("dtsh");
    public static final int U2 = ip0.Ws("dtsl");
    public static final int a8 = ip0.Ws("dtse");
    public static final int lg = ip0.Ws("ddts");
    public static final int rN = ip0.Ws("tfdt");
    public static final int er = ip0.Ws("tfhd");
    public static final int yS = ip0.Ws("trex");
    public static final int gW = ip0.Ws("trun");
    public static final int BT = ip0.Ws("sidx");
    public static final int vy = ip0.Ws("moov");
    public static final int P8 = ip0.Ws("mvhd");
    public static final int ei = ip0.Ws("trak");
    public static final int nw = ip0.Ws("mdia");
    public static final int SI = ip0.Ws("minf");
    public static final int KD = ip0.Ws("stbl");
    public static final int ro = ip0.Ws("avcC");
    public static final int cn = ip0.Ws("hvcC");
    public static final int sh = ip0.Ws("esds");
    public static final int cb = ip0.Ws("moof");
    public static final int dx = ip0.Ws("traf");
    public static final int sG = ip0.Ws("mvex");
    public static final int ef = ip0.Ws("mehd");
    public static final int Sf = ip0.Ws("tkhd");
    public static final int vJ = ip0.Ws("edts");
    public static final int g3 = ip0.Ws("elst");
    public static final int Mz = ip0.Ws("mdhd");
    public static final int I = ip0.Ws("hdlr");
    public static final int ca = ip0.Ws("stsd");
    public static final int x9 = ip0.Ws("pssh");
    public static final int Qq = ip0.Ws("sinf");
    public static final int sy = ip0.Ws("schm");
    public static final int aj = ip0.Ws("schi");
    public static final int lp = ip0.Ws("tenc");
    public static final int OW = ip0.Ws("encv");
    public static final int br = ip0.Ws("enca");
    public static final int XX = ip0.Ws("frma");
    public static final int kQ = ip0.Ws("saiz");
    public static final int yO = ip0.Ws("saio");
    public static final int XG = ip0.Ws("sbgp");
    public static final int jJ = ip0.Ws("sgpd");
    public static final int wc = ip0.Ws("uuid");
    public static final int et = ip0.Ws("senc");
    public static final int CU = ip0.Ws("pasp");
    public static final int Xa = ip0.Ws("TTML");

    static {
        ip0.Ws("vmhd");
        Eq = ip0.Ws("mp4v");
        hz = ip0.Ws("stts");
        aq = ip0.Ws("stss");
        FN = ip0.Ws("ctts");
        jO = ip0.Ws("stsc");
        oY = ip0.Ws("stsz");
        ko = ip0.Ws("stz2");
        Ev = ip0.Ws("stco");
        ye = ip0.Ws("co64");
        WB = ip0.Ws("tx3g");
        mb = ip0.Ws("wvtt");
        jw = ip0.Ws("stpp");
        fY = ip0.Ws("c608");
        qp = ip0.Ws("samr");
        k2 = ip0.Ws("sawb");
        zh = ip0.Ws("udta");
        AL = ip0.Ws("meta");
        w9 = ip0.Ws("ilst");
        hK = ip0.Ws("mean");
        cT = ip0.Ws(AppMeasurementSdk.ConditionalUserProperty.NAME);
        q7 = ip0.Ws("data");
        Z1 = ip0.Ws("emsg");
        n5 = ip0.Ws("st3d");
        Q6 = ip0.Ws("sv3d");
        kf = ip0.Ws("proj");
        Jl = ip0.Ws("vp08");
        iW = ip0.Ws("vp09");
        eU = ip0.Ws("vpcC");
        e3 = ip0.Ws("camm");
        sE = ip0.Ws("alac");
    }

    public zh0(int i) {
        this.j6 = i;
    }

    public static int DW(int i) {
        return i & 16777215;
    }

    public static String FH(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) (i >>> 24));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public static int j6(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return FH(this.j6);
    }
}
