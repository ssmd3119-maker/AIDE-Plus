package abcd;

import abcd.hk;
import abcd.nk;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class im {
    private final hk DW;
    private ls EQ;
    private final km Hw;
    private String J0;
    private boolean J8;
    private final dr VH;
    private final hk.b[] Ws;
    private final int Zo;
    private final boolean gn;
    private final nk j6;
    private final int v5;
    private PrintWriter we;
    private int u7 = 0;
    private int tp = 1;
    private final ps FH = new ps();

    class a implements Comparator<nk.a> {
        public a(im imVar) {
        }

        @Override // java.util.Comparator
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // java.util.Comparator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(nk.a aVar, nk.a aVar2) {
            return aVar.j6() - aVar2.j6();
        }
    }

    class b implements Comparator<hk.b> {
        public b(im imVar) {
        }

        @Override // java.util.Comparator
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // java.util.Comparator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(hk.b bVar, hk.b bVar2) {
            return bVar.Zo() - bVar2.Zo();
        }
    }

    public im(nk nkVar, hk hkVar, km kmVar, int i, int i2, boolean z, vq vqVar) {
        this.j6 = nkVar;
        this.DW = hkVar;
        this.Hw = kmVar;
        this.VH = vqVar.aM();
        this.gn = z;
        this.v5 = i;
        this.Zo = i2;
        this.Ws = new hk.b[i2];
    }

    private ArrayList<nk.a> DW() {
        nk nkVar = this.j6;
        int size = nkVar == null ? 0 : nkVar.size();
        ArrayList<nk.a> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(this.j6.sG(i));
        }
        Collections.sort(arrayList, new a(this));
        return arrayList;
    }

    private void EQ(hk.b bVar) {
        int iFH = this.FH.FH();
        this.FH.writeByte(5);
        this.FH.gn(bVar.Zo());
        if (this.EQ == null && this.we == null) {
            return;
        }
        j6(this.FH.FH() - iFH, String.format("%04x: -local %s", Integer.valueOf(this.u7), U2(bVar)));
    }

    private static int FH(int i, int i2) {
        if (i < -4 || i > 10) {
            throw new RuntimeException("Parameter out of range");
        }
        return (i - (-4)) + (i2 * 15) + 10;
    }

    private void J0(hk.b bVar) {
        if (bVar.tp() != null) {
            J8(bVar);
            return;
        }
        int iFH = this.FH.FH();
        this.FH.writeByte(3);
        Mr(bVar.Zo());
        aM(bVar.v5());
        j3(bVar.we());
        if (this.EQ == null && this.we == null) {
            return;
        }
        j6(this.FH.FH() - iFH, String.format("%04x: +local %s", Integer.valueOf(this.u7), U2(bVar)));
    }

    private void J8(hk.b bVar) {
        int iFH = this.FH.FH();
        this.FH.writeByte(4);
        Mr(bVar.Zo());
        aM(bVar.v5());
        j3(bVar.we());
        aM(bVar.tp());
        if (this.EQ == null && this.we == null) {
            return;
        }
        j6(this.FH.FH() - iFH, String.format("%04x: +localx %s", Integer.valueOf(this.u7), U2(bVar)));
    }

    private void Mr(int i) {
        if (i >= 0) {
            this.FH.gn(i);
            return;
        }
        throw new RuntimeException("Signed value where unsigned required: " + i);
    }

    private void QX(nk.a aVar) {
        int iJ6 = aVar.DW().j6();
        int iJ62 = aVar.j6();
        int i = iJ6 - this.tp;
        int i2 = iJ62 - this.u7;
        if (i2 < 0) {
            throw new RuntimeException("Position entries must be in ascending address order");
        }
        if (i < -4 || i > 10) {
            VH(i);
            i = 0;
        }
        int iFH = FH(i, i2);
        if ((iFH & (-256)) > 0) {
            gn(i2);
            iFH = FH(i, 0);
            if ((iFH & (-256)) > 0) {
                VH(i);
                iFH = FH(0, 0);
                i2 = 0;
                i = 0;
            } else {
                i2 = 0;
            }
        }
        this.FH.writeByte(iFH);
        this.tp += i;
        this.u7 += i2;
        if (this.EQ == null && this.we == null) {
            return;
        }
        j6(1, String.format("%04x: line %d", Integer.valueOf(this.u7), Integer.valueOf(this.tp)));
    }

    private String U2(hk.b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("v");
        sb.append(bVar.Zo());
        sb.append(' ');
        yq yqVarV5 = bVar.v5();
        if (yqVarV5 == null) {
            sb.append("null");
        } else {
            sb.append(yqVarV5.Zo());
        }
        sb.append(' ');
        zq zqVarWe = bVar.we();
        if (zqVarWe == null) {
            sb.append("null");
        } else {
            sb.append(zqVarWe.Zo());
        }
        yq yqVarTp = bVar.tp();
        if (yqVarTp != null) {
            sb.append(' ');
            sb.append(yqVarTp.Zo());
        }
        return sb.toString();
    }

    private void VH(int i) {
        int iFH = this.FH.FH();
        this.FH.writeByte(2);
        this.FH.U2(i);
        this.tp += i;
        if (this.EQ == null && this.we == null) {
            return;
        }
        j6(this.FH.FH() - iFH, String.format("line = %d", Integer.valueOf(this.tp)));
    }

    private int Ws(int i) {
        int size = this.DW.size();
        while (i < size && this.DW.sG(i).DW() == this.u7) {
            int i2 = i + 1;
            hk.b bVarSG = this.DW.sG(i);
            int iZo = bVarSG.Zo();
            hk.b[] bVarArr = this.Ws;
            hk.b bVar = bVarArr[iZo];
            if (bVarSG != bVar) {
                bVarArr[iZo] = bVarSG;
                if (bVarSG.J0()) {
                    if (bVar == null || !bVarSG.QX(bVar)) {
                        J0(bVarSG);
                    } else {
                        if (bVar.J0()) {
                            throw new RuntimeException("shouldn't happen");
                        }
                        we(bVarSG);
                    }
                } else if (bVarSG.FH() != hk.a.END_REPLACED) {
                    EQ(bVarSG);
                }
            }
            i = i2;
        }
        return i;
    }

    private int XL(int i, ArrayList<nk.a> arrayList) {
        int size = arrayList.size();
        while (i < size && arrayList.get(i).j6() == this.u7) {
            QX(arrayList.get(i));
            i++;
        }
        return i;
    }

    private ArrayList<hk.b> a8() {
        ArrayList<hk.b> arrayList = new ArrayList<>(this.VH.v5().size());
        int iLg = lg();
        BitSet bitSet = new BitSet(this.Zo - iLg);
        int size = this.DW.size();
        for (int i = 0; i < size; i++) {
            hk.b bVarSG = this.DW.sG(i);
            int iZo = bVarSG.Zo();
            if (iZo >= iLg) {
                int i2 = iZo - iLg;
                if (!bitSet.get(i2)) {
                    bitSet.set(i2);
                    arrayList.add(bVarSG);
                }
            }
        }
        Collections.sort(arrayList, new b(this));
        return arrayList;
    }

    private void aM(yq yqVar) {
        km kmVar;
        if (yqVar == null || (kmVar = this.Hw) == null) {
            this.FH.gn(0);
        } else {
            this.FH.gn(kmVar.aM().j3(yqVar) + 1);
        }
    }

    private void gn(int i) {
        int iFH = this.FH.FH();
        this.FH.writeByte(1);
        this.FH.gn(i);
        this.u7 += i;
        if (this.EQ == null && this.we == null) {
            return;
        }
        j6(this.FH.FH() - iFH, String.format("%04x: advance pc", Integer.valueOf(this.u7)));
    }

    private void j3(zq zqVar) {
        km kmVar;
        if (zqVar == null || (kmVar = this.Hw) == null) {
            this.FH.gn(0);
        } else {
            this.FH.gn(kmVar.j3().j3(zqVar) + 1);
        }
    }

    private void j6(int i, String str) {
        if (this.J0 != null) {
            str = this.J0 + str;
        }
        ls lsVar = this.EQ;
        if (lsVar != null) {
            if (!this.J8) {
                i = 0;
            }
            lsVar.Hw(i, str);
        }
        PrintWriter printWriter = this.we;
        if (printWriter != null) {
            printWriter.println(str);
        }
    }

    private int lg() {
        return (this.Zo - this.VH.v5().vJ()) - (!this.gn ? 1 : 0);
    }

    private void tp(ArrayList<nk.a> arrayList, ArrayList<hk.b> arrayList2) {
        hk.b next;
        boolean z = (this.EQ == null && this.we == null) ? false : true;
        int iFH = this.FH.FH();
        if (arrayList.size() > 0) {
            this.tp = arrayList.get(0).DW().j6();
        }
        this.FH.gn(this.tp);
        if (z) {
            j6(this.FH.FH() - iFH, "line_start: " + this.tp);
        }
        int iLg = lg();
        er erVarV5 = this.VH.v5();
        int size = erVarV5.size();
        if (!this.gn) {
            Iterator<hk.b> it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                hk.b next2 = it.next();
                if (iLg == next2.Zo()) {
                    this.Ws[iLg] = next2;
                    break;
                }
            }
            iLg++;
        }
        int iFH2 = this.FH.FH();
        this.FH.gn(size);
        if (z) {
            j6(this.FH.FH() - iFH2, String.format("parameters_size: %04x", Integer.valueOf(size)));
        }
        for (int i = 0; i < size; i++) {
            fr frVarSf = erVarV5.Sf(i);
            int iFH3 = this.FH.FH();
            Iterator<hk.b> it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (iLg == next.Zo()) {
                    if (next.tp() != null) {
                        aM(null);
                    } else {
                        aM(next.v5());
                    }
                    this.Ws[iLg] = next;
                }
            }
            if (next == null) {
                aM(null);
            }
            if (z) {
                j6(this.FH.FH() - iFH3, "parameter " + ((next == null || next.tp() != null) ? "<unnamed>" : next.v5().Zo()) + " v" + iLg);
            }
            iLg += frVarSf.tp();
        }
        for (hk.b bVar : this.Ws) {
            if (bVar != null && bVar.tp() != null) {
                J8(bVar);
            }
        }
    }

    private void u7() {
        this.FH.writeByte(0);
        if (this.EQ == null && this.we == null) {
            return;
        }
        j6(1, "end sequence");
    }

    private byte[] v5() {
        ArrayList<nk.a> arrayListDW = DW();
        tp(arrayListDW, a8());
        this.FH.writeByte(7);
        int iWs = 0;
        if (this.EQ != null || this.we != null) {
            j6(1, String.format("%04x: prologue end", Integer.valueOf(this.u7)));
        }
        int size = arrayListDW.size();
        int size2 = this.DW.size();
        int iXL = 0;
        while (true) {
            iWs = Ws(iWs);
            iXL = XL(iXL, arrayListDW);
            int iDW = iWs < size2 ? this.DW.sG(iWs).DW() : Integer.MAX_VALUE;
            int iJ6 = iXL < size ? arrayListDW.get(iXL).j6() : Integer.MAX_VALUE;
            int iMin = Math.min(iJ6, iDW);
            if (iMin == Integer.MAX_VALUE || (iMin == this.v5 && iDW == Integer.MAX_VALUE && iJ6 == Integer.MAX_VALUE)) {
                break;
            }
            if (iMin == iJ6) {
                QX(arrayListDW.get(iXL));
                iXL++;
            } else {
                gn(iMin - this.u7);
            }
        }
        u7();
        return this.FH.aM();
    }

    private void we(hk.b bVar) {
        int iFH = this.FH.FH();
        this.FH.writeByte(6);
        Mr(bVar.Zo());
        if (this.EQ == null && this.we == null) {
            return;
        }
        j6(this.FH.FH() - iFH, String.format("%04x: +local restart %s", Integer.valueOf(this.u7), U2(bVar)));
    }

    public byte[] Hw() {
        try {
            return v5();
        } catch (IOException e) {
            throw us.DW(e, "...while encoding debug info");
        }
    }

    public byte[] Zo(String str, PrintWriter printWriter, ls lsVar, boolean z) {
        this.J0 = str;
        this.we = printWriter;
        this.EQ = lsVar;
        this.J8 = z;
        return Hw();
    }
}
