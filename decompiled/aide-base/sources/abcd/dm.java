package abcd;

import abcd.uj;
import abcd.vj;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class dm {
    private final yj j6;
    private vj DW = null;
    private byte[] FH = null;
    private int Hw = 0;
    private TreeMap<uj, Integer> v5 = null;

    public dm(yj yjVar) {
        this.j6 = yjVar;
    }

    private void DW(String str, PrintWriter printWriter, ls lsVar) {
        Hw();
        int i = 0;
        boolean z = lsVar != null;
        int i2 = z ? 6 : 0;
        int i3 = z ? 2 : 0;
        int size = this.DW.size();
        String str2 = str + "  ";
        if (z) {
            lsVar.Hw(0, str + "tries:");
        } else {
            printWriter.println(str + "tries:");
        }
        for (int i4 = 0; i4 < size; i4++) {
            vj.a aVarEf = this.DW.ef(i4);
            uj ujVarFH = aVarEf.FH();
            String str3 = str2 + "try " + xs.gn(aVarEf.v5()) + ".." + xs.gn(aVarEf.DW());
            String strG3 = ujVarFH.g3(str2, "");
            if (z) {
                lsVar.Hw(i2, str3);
                lsVar.Hw(i3, strG3);
            } else {
                printWriter.println(str3);
                printWriter.println(strG3);
            }
        }
        if (z) {
            lsVar.Hw(0, str + "handlers:");
            lsVar.Hw(this.Hw, str2 + "size: " + xs.VH(this.v5.size()));
            uj ujVar = null;
            for (Map.Entry<uj, Integer> entry : this.v5.entrySet()) {
                uj key = entry.getKey();
                int iIntValue = entry.getValue().intValue();
                if (ujVar != null) {
                    j6(ujVar, i, iIntValue - i, str2, printWriter, lsVar);
                }
                ujVar = key;
                i = iIntValue;
            }
            j6(ujVar, i, this.FH.length - i, str2, printWriter, lsVar);
        }
    }

    private void Hw() {
        if (this.DW == null) {
            this.DW = this.j6.Hw();
        }
    }

    private static void j6(uj ujVar, int i, int i2, String str, PrintWriter printWriter, ls lsVar) {
        String strG3 = ujVar.g3(str, xs.VH(i) + ": ");
        if (printWriter != null) {
            printWriter.println(strG3);
        }
        lsVar.Hw(i2, strG3);
    }

    public void FH(km kmVar) {
        Hw();
        pn pnVarJ3 = kmVar.j3();
        int size = this.DW.size();
        this.v5 = new TreeMap<>();
        for (int i = 0; i < size; i++) {
            this.v5.put(this.DW.ef(i).FH(), null);
        }
        if (this.v5.size() > 65535) {
            throw new UnsupportedOperationException("too many catch handlers");
        }
        ps psVar = new ps();
        this.Hw = psVar.gn(this.v5.size());
        for (Map.Entry<uj, Integer> entry : this.v5.entrySet()) {
            uj key = entry.getKey();
            int size2 = key.size();
            boolean zSG = key.sG();
            entry.setValue(Integer.valueOf(psVar.FH()));
            if (zSG) {
                psVar.U2(-(size2 - 1));
                size2--;
            } else {
                psVar.U2(size2);
            }
            for (int i2 = 0; i2 < size2; i2++) {
                uj.a aVarSf = key.Sf(i2);
                psVar.gn(pnVarJ3.j3(aVarSf.DW()));
                psVar.gn(aVarSf.FH());
            }
            if (zSG) {
                psVar.gn(key.Sf(size2).FH());
            }
        }
        this.FH = psVar.aM();
    }

    public void VH(km kmVar, ls lsVar) {
        Hw();
        if (lsVar.EQ()) {
            DW("  ", null, lsVar);
        }
        int size = this.DW.size();
        for (int i = 0; i < size; i++) {
            vj.a aVarEf = this.DW.ef(i);
            int iV5 = aVarEf.v5();
            int iDW = aVarEf.DW();
            int i2 = iDW - iV5;
            if (i2 >= 65536) {
                throw new UnsupportedOperationException("bogus exception range: " + xs.tp(iV5) + ".." + xs.tp(iDW));
            }
            lsVar.writeInt(iV5);
            lsVar.writeShort(i2);
            lsVar.writeShort(this.v5.get(aVarEf.FH()).intValue());
        }
        lsVar.write(this.FH);
    }

    public int Zo() {
        return (v5() * 8) + this.FH.length;
    }

    public int v5() {
        Hw();
        return this.DW.size();
    }
}
