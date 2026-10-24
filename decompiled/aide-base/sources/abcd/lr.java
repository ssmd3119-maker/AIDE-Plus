package abcd;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class lr {
    private static boolean Hw;
    private final ArrayList<as> DW;
    private final a[] FH;
    private final ds j6;

    public static class a {
        public int DW = -1;
        public bt j6;
    }

    public lr(ds dsVar) {
        this.j6 = dsVar;
        ArrayList<as> arrayListJ0 = dsVar.J0();
        this.DW = arrayListJ0;
        int size = arrayListJ0.size();
        this.FH = new a[size];
        for (int i = 0; i < size; i++) {
            this.FH[i] = new a();
        }
    }

    private void DW() {
        int size = this.DW.size();
        for (int i = 0; i < size; i++) {
            as asVar = this.DW.get(i);
            a aVar = this.FH[i];
            BitSet bitSetMr = asVar.Mr();
            if (bitSetMr.cardinality() > 1) {
                for (int iNextSetBit = bitSetMr.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetMr.nextSetBit(iNextSetBit + 1)) {
                    int i2 = iNextSetBit;
                    while (i2 != aVar.DW && i2 != -1) {
                        a aVar2 = this.FH[i2];
                        if (aVar2.j6.FH(i)) {
                            break;
                        }
                        aVar2.j6.add(i);
                        i2 = aVar2.DW;
                    }
                }
            }
        }
    }

    private void FH() {
        int size = this.DW.size();
        for (int i = 0; i < size; i++) {
            as asVar = this.DW.get(i);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('{');
            Iterator<as> it = asVar.J8().iterator();
            boolean z = false;
            while (it.hasNext()) {
                as next = it.next();
                if (z) {
                    stringBuffer.append(',');
                }
                stringBuffer.append(next);
                z = true;
            }
            stringBuffer.append('}');
            System.out.println("domChildren[" + asVar + "]: " + ((Object) stringBuffer));
        }
    }

    private void j6() {
        int size = this.DW.size();
        for (int i = 0; i < size; i++) {
            int i2 = this.FH[i].DW;
            if (i2 != -1) {
                this.DW.get(i2).j6(this.DW.get(i));
            }
        }
    }

    public a[] Hw() {
        int size = this.DW.size();
        if (Hw) {
            for (int i = 0; i < size; i++) {
                as asVar = this.DW.get(i);
                System.out.println("pred[" + i + "]: " + asVar.Mr());
            }
        }
        mr.Zo(this.j6, this.FH, false);
        if (Hw) {
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = this.FH[i2];
                System.out.println("idom[" + i2 + "]: " + aVar.DW);
            }
        }
        j6();
        if (Hw) {
            FH();
        }
        for (int i3 = 0; i3 < size; i3++) {
            this.FH[i3].j6 = zr.j6(size);
        }
        DW();
        if (Hw) {
            for (int i4 = 0; i4 < size; i4++) {
                System.out.println("df[" + i4 + "]: " + this.FH[i4].j6);
            }
        }
        return this.FH;
    }
}
