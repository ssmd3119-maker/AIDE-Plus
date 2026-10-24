package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzhp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ni0 implements dh0 {
    private static final int P8 = ip0.Ws("seig");
    private static final byte[] ei = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private mh0[] BT;
    private final SparseArray<pi0> DW;
    private final LinkedList<oi0> EQ;
    private final ap0 FH;
    private final ap0 Hw;
    private int J0;
    private long J8;
    private long Mr;
    private ap0 QX;
    private pi0 U2;
    private final fp0 VH;
    private int Ws;
    private long XL;
    private final ap0 Zo;
    private int a8;
    private int aM;
    private boolean er;
    private mh0 gW;
    private final ap0 gn;
    private long j3;
    private final int j6;
    private int lg;
    private int rN;
    private final Stack<ai0> tp;
    private final byte[] u7;
    private final ap0 v5;
    private boolean vy;
    private int we;
    private gh0 yS;

    public ni0(int i) {
        this(i, null);
    }

    private static void Hw(ap0 ap0Var, int i, xi0 xi0Var) throws af0 {
        ap0Var.EQ(i + 8);
        int iDW = zh0.DW(ap0Var.Hw());
        if ((iDW & 1) != 0) {
            throw new af0("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iDW & 2) != 0;
        int iA8 = ap0Var.a8();
        if (iA8 == xi0Var.Zo) {
            Arrays.fill(xi0Var.J8, 0, iA8, z);
            xi0Var.j6(ap0Var.XL());
            ap0Var.QX(xi0Var.XL.j6, 0, xi0Var.QX);
            xi0Var.XL.EQ(0);
            xi0Var.aM = false;
            return;
        }
        int i2 = xi0Var.Zo;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Length mismatch: ");
        sb.append(iA8);
        sb.append(", ");
        sb.append(i2);
        throw new af0(sb.toString());
    }

    private final void gn() {
        this.we = 0;
        this.Ws = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0686  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u7(long r54) throws com.google.android.gms.internal.ads.af0 {
        /*
            Method dump skipped, instructions count: 1775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ni0.u7(long):void");
    }

    private static zzhp v5(List<bi0> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            bi0 bi0Var = list.get(i);
            if (bi0Var.j6 == zh0.x9) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bi0Var.sg.j6;
                UUID uuidDW = ti0.DW(bArr);
                if (uuidDW == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzhp.zza(uuidDW, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzhp(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c0 A[LOOP:7: B:68:0x01c0->B:70:0x01c6, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01dc  */
    @Override // com.google.android.gms.internal.ads.dh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int DW(com.google.android.gms.internal.ads.fh0 r26, com.google.android.gms.internal.ads.jh0 r27) throws com.google.android.gms.internal.ads.af0 {
        /*
            Method dump skipped, instructions count: 1474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ni0.DW(com.google.android.gms.internal.ads.fh0, com.google.android.gms.internal.ads.jh0):int");
    }

    @Override // com.google.android.gms.internal.ads.dh0
    public final void FH(gh0 gh0Var) {
        this.yS = gh0Var;
    }

    @Override // com.google.android.gms.internal.ads.dh0
    public final boolean VH(fh0 fh0Var) {
        return ui0.DW(fh0Var);
    }

    @Override // com.google.android.gms.internal.ads.dh0
    public final void Zo(long j, long j2) {
        int size = this.DW.size();
        for (int i = 0; i < size; i++) {
            this.DW.valueAt(i).j6();
        }
        this.EQ.clear();
        this.aM = 0;
        this.tp.clear();
        gn();
    }

    @Override // com.google.android.gms.internal.ads.dh0
    public final void j6() {
    }

    private ni0(int i, fp0 fp0Var) {
        this(i, null, null);
    }

    private ni0(int i, fp0 fp0Var, vi0 vi0Var) {
        this.j6 = i;
        this.VH = null;
        this.gn = new ap0(16);
        this.FH = new ap0(xo0.j6);
        this.Hw = new ap0(5);
        this.v5 = new ap0();
        this.Zo = new ap0(1);
        this.u7 = new byte[16];
        this.tp = new Stack<>();
        this.EQ = new LinkedList<>();
        this.DW = new SparseArray<>();
        this.j3 = -9223372036854775807L;
        this.Mr = -9223372036854775807L;
        gn();
    }
}
