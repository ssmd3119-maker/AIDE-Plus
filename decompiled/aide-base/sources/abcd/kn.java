package abcd;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class kn {
    private final HashMap<String, a> j6 = new HashMap<>(50);

    private static class a {
        private int DW;
        private int FH;
        private int Hw;
        private final String j6;
        private int v5;

        public a(wm wmVar, String str) {
            int iV5 = wmVar.v5();
            this.j6 = str;
            this.DW = 1;
            this.FH = iV5;
            this.Hw = iV5;
            this.v5 = iV5;
        }

        public void DW(wm wmVar) {
            int iV5 = wmVar.v5();
            this.DW++;
            this.FH += iV5;
            if (iV5 > this.Hw) {
                this.Hw = iV5;
            }
            if (iV5 < this.v5) {
                this.v5 = iV5;
            }
        }

        public String FH() {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  ");
            sb2.append(this.j6);
            sb2.append(": ");
            sb2.append(this.DW);
            sb2.append(" item");
            sb2.append(this.DW == 1 ? "" : "s");
            sb2.append("; ");
            sb2.append(this.FH);
            sb2.append(" bytes total\n");
            sb.append(sb2.toString());
            if (this.v5 == this.Hw) {
                sb.append("    " + this.v5 + " bytes/item\n");
            } else {
                sb.append("    " + this.v5 + ".." + this.Hw + " bytes/item; average " + (this.FH / this.DW) + "\n");
            }
            return sb.toString();
        }

        public void Hw(ls lsVar) {
            lsVar.j6(FH());
        }
    }

    public void DW(jn jnVar) {
        Iterator<? extends wm> it = jnVar.VH().iterator();
        while (it.hasNext()) {
            j6(it.next());
        }
    }

    public final void FH(ls lsVar) {
        if (this.j6.size() == 0) {
            return;
        }
        lsVar.Hw(0, "\nstatistics:\n");
        TreeMap treeMap = new TreeMap();
        for (a aVar : this.j6.values()) {
            treeMap.put(aVar.j6, aVar);
        }
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            ((a) it.next()).Hw(lsVar);
        }
    }

    public void j6(wm wmVar) {
        String strFH = wmVar.FH();
        a aVar = this.j6.get(strFH);
        if (aVar == null) {
            this.j6.put(strFH, new a(wmVar, strFH));
        } else {
            aVar.DW(wmVar);
        }
    }
}
