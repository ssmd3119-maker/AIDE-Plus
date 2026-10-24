package abcd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class hk extends ws {
    public static final hk jw = new hk(0);

    public enum a {
        START,
        END_SIMPLY,
        END_REPLACED,
        END_MOVED,
        END_CLOBBERED_BY_PREV,
        END_CLOBBERED_BY_NEXT
    }

    public static class b implements Comparable<b> {
        private final int WB;
        private final zq fY;
        private final qp jw;
        private final a mb;

        public b(int i, a aVar, qp qpVar) {
            if (i < 0) {
                throw new IllegalArgumentException("address < 0");
            }
            if (aVar == null) {
                throw new NullPointerException("disposition == null");
            }
            try {
                if (qpVar.QX() == null) {
                    throw new NullPointerException("spec.getLocalItem() == null");
                }
                this.WB = i;
                this.mb = aVar;
                this.jw = qpVar;
                this.fY = zq.aM(qpVar.j6());
            } catch (NullPointerException unused) {
                throw new NullPointerException("spec == null");
            }
        }

        public int DW() {
            return this.WB;
        }

        public a FH() {
            return this.mb;
        }

        public boolean J0() {
            return this.mb == a.START;
        }

        public boolean QX(b bVar) {
            return XL(bVar.jw);
        }

        public boolean XL(qp qpVar) {
            return this.jw.we(qpVar);
        }

        public int Zo() {
            return this.jw.Mr();
        }

        public b aM(a aVar) {
            return aVar == this.mb ? this : new b(this.WB, aVar, this.jw);
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && compareTo((b) obj) == 0;
        }

        @Override // java.lang.Comparable
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int i = this.WB;
            int i2 = bVar.WB;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            boolean zJ0 = J0();
            return zJ0 != bVar.J0() ? zJ0 ? 1 : -1 : this.jw.compareTo(bVar.jw);
        }

        public String toString() {
            return Integer.toHexString(this.WB) + " " + this.mb + " " + this.jw;
        }

        public yq tp() {
            return this.jw.QX().v5();
        }

        public qp u7() {
            return this.jw;
        }

        public yq v5() {
            return this.jw.QX().FH();
        }

        public zq we() {
            return this.fY;
        }
    }

    public static class c {
        private final ArrayList<b> j6;
        private int DW = 0;
        private sp FH = null;
        private int[] Hw = null;
        private int v5 = 0;

        public c(int i) {
            this.j6 = new ArrayList<>(i);
        }

        private void DW(int i, a aVar, qp qpVar) {
            int iMr = qpVar.Mr();
            this.j6.add(new b(i, aVar, qpVar));
            if (aVar == a.START) {
                this.FH.dx(qpVar);
                this.Hw[iMr] = -1;
            } else {
                this.FH.ef(qpVar);
                this.Hw[iMr] = this.j6.size() - 1;
            }
        }

        private void FH(int i, a aVar, qp qpVar) {
            if (aVar == a.START) {
                throw new RuntimeException("shouldn't happen");
            }
            int i2 = this.Hw[qpVar.Mr()];
            if (i2 >= 0) {
                b bVar = this.j6.get(i2);
                if (bVar.DW() == i && bVar.u7().equals(qpVar)) {
                    this.j6.set(i2, bVar.aM(aVar));
                    this.FH.ef(qpVar);
                    return;
                }
            }
            Zo(i, qpVar, aVar);
        }

        private boolean Hw(int i, qp qpVar) {
            boolean z;
            int size = this.j6.size() - 1;
            while (true) {
                z = false;
                if (size < 0) {
                    break;
                }
                b bVar = this.j6.get(size);
                if (bVar != null) {
                    if (bVar.DW() != i) {
                        return false;
                    }
                    if (bVar.XL(qpVar)) {
                        break;
                    }
                }
                size--;
            }
            this.FH.ef(qpVar);
            b bVar2 = null;
            this.j6.set(size, null);
            this.DW++;
            int iMr = qpVar.Mr();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                bVar2 = this.j6.get(size);
                if (bVar2 != null && bVar2.u7().Mr() == iMr) {
                    z = true;
                    break;
                }
            }
            if (z) {
                this.Hw[iMr] = size;
                if (bVar2.DW() == i) {
                    this.j6.set(size, bVar2.aM(a.END_SIMPLY));
                }
            }
            return true;
        }

        private static qp VH(qp qpVar) {
            return (qpVar == null || qpVar.j6() != fr.iW) ? qpVar : qpVar.I(fr.sg);
        }

        private void j6(int i, int i2) {
            boolean z = this.Hw == null;
            if (i != this.v5 || z) {
                if (i < this.v5) {
                    throw new RuntimeException("shouldn't happen");
                }
                if (z || i2 >= this.Hw.length) {
                    int i3 = i2 + 1;
                    sp spVar = new sp(i3);
                    int[] iArr = new int[i3];
                    Arrays.fill(iArr, -1);
                    if (!z) {
                        spVar.sG(this.FH);
                        int[] iArr2 = this.Hw;
                        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                    }
                    this.FH = spVar;
                    this.Hw = iArr;
                }
            }
        }

        public void Zo(int i, qp qpVar, a aVar) {
            int iMr = qpVar.Mr();
            qp qpVarVH = VH(qpVar);
            j6(i, iMr);
            if (this.Hw[iMr] < 0 && !Hw(i, qpVarVH)) {
                DW(i, aVar, qpVarVH);
            }
        }

        public hk gn() {
            j6(Integer.MAX_VALUE, 0);
            int size = this.j6.size();
            int i = size - this.DW;
            if (i == 0) {
                return hk.jw;
            }
            b[] bVarArr = new b[i];
            if (size == i) {
                this.j6.toArray(bVarArr);
            } else {
                Iterator<b> it = this.j6.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    b next = it.next();
                    if (next != null) {
                        bVarArr[i2] = next;
                        i2++;
                    }
                }
            }
            Arrays.sort(bVarArr);
            hk hkVar = new hk(i);
            for (int i3 = 0; i3 < i; i3++) {
                hkVar.Sf(i3, bVarArr[i3]);
            }
            hkVar.Mr();
            return hkVar;
        }

        public void tp(int i, qp qpVar) {
            qp qpVarVy;
            qp qpVarVy2;
            int iMr = qpVar.Mr();
            qp qpVarVH = VH(qpVar);
            j6(i, iMr);
            qp qpVarVy3 = this.FH.vy(iMr);
            if (qpVarVH.we(qpVarVy3)) {
                return;
            }
            qp qpVarBT = this.FH.BT(qpVarVH);
            if (qpVarBT != null) {
                FH(i, a.END_MOVED, qpVarBT);
            }
            int i2 = this.Hw[iMr];
            if (qpVarVy3 != null) {
                DW(i, a.END_REPLACED, qpVarVy3);
            } else if (i2 >= 0) {
                b bVar = this.j6.get(i2);
                if (bVar.DW() == i) {
                    if (bVar.XL(qpVarVH)) {
                        this.j6.set(i2, null);
                        this.DW++;
                        this.FH.dx(qpVarVH);
                        this.Hw[iMr] = -1;
                        return;
                    }
                    this.j6.set(i2, bVar.aM(a.END_REPLACED));
                }
            }
            if (iMr > 0 && (qpVarVy2 = this.FH.vy(iMr - 1)) != null && qpVarVy2.KD()) {
                FH(i, a.END_CLOBBERED_BY_NEXT, qpVarVy2);
            }
            if (qpVarVH.KD() && (qpVarVy = this.FH.vy(iMr + 1)) != null) {
                FH(i, a.END_CLOBBERED_BY_PREV, qpVarVy);
            }
            DW(i, a.START, qpVarVH);
        }

        public void u7(int i, sp spVar) {
            int iRo = spVar.ro();
            j6(i, iRo - 1);
            for (int i2 = 0; i2 < iRo; i2++) {
                qp qpVarVy = this.FH.vy(i2);
                qp qpVarVH = VH(spVar.vy(i2));
                if (qpVarVy == null) {
                    if (qpVarVH != null) {
                        tp(i, qpVarVH);
                    }
                } else if (qpVarVH == null) {
                    v5(i, qpVarVy);
                } else if (!qpVarVH.we(qpVarVy)) {
                    v5(i, qpVarVy);
                    tp(i, qpVarVH);
                }
            }
        }

        public void v5(int i, qp qpVar) {
            Zo(i, qpVar, a.END_SIMPLY);
        }
    }

    public hk(int i) {
        super(i);
    }

    public static hk ef(ak akVar) {
        int size = akVar.size();
        c cVar = new c(size);
        for (int i = 0; i < size; i++) {
            zj zjVarEf = akVar.ef(i);
            if (zjVarEf instanceof ik) {
                cVar.u7(zjVarEf.Zo(), ((ik) zjVarEf).rN());
            } else if (zjVarEf instanceof jk) {
                cVar.tp(zjVarEf.Zo(), ((jk) zjVarEf).rN());
            } else if (zjVarEf instanceof gk) {
                cVar.v5(zjVarEf.Zo(), ((gk) zjVarEf).rN());
            }
        }
        return cVar.gn();
    }

    public void Sf(int i, b bVar) {
        KD(i, bVar);
    }

    public b sG(int i) {
        return (b) BT(i);
    }
}
