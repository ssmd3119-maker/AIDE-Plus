package abcd;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

/* loaded from: classes.dex */
public class jr {
    private static boolean DW;
    private static boolean FH;
    private final ds j6;

    class a implements Comparator<bq> {
        final /* synthetic */ HashMap WB;

        public a(jr jrVar, HashMap map) {
            this.WB = map;
        }

        @Override // java.util.Comparator
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // java.util.Comparator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(bq bqVar, bq bqVar2) {
            int iIntValue = ((Integer) this.WB.get(bqVar2)).intValue() - ((Integer) this.WB.get(bqVar)).intValue();
            return iIntValue == 0 ? bqVar.compareTo(bqVar2) : iIntValue;
        }
    }

    class b extends xr {
        final /* synthetic */ qp DW;
        final /* synthetic */ qp j6;

        public b(qp qpVar, qp qpVar2) {
            this.j6 = qpVar;
            this.DW = qpVar2;
        }

        @Override // abcd.xr
        public qp DW(qp qpVar) {
            return qpVar.Mr() == this.j6.Mr() ? this.DW.Sf(qpVar.QX()) : qpVar;
        }

        @Override // abcd.xr
        public int j6() {
            return jr.this.j6.a8();
        }
    }

    private jr(ds dsVar) {
        this.j6 = dsVar;
    }

    private void DW(qp qpVar, qp qpVar2) {
        for (cs csVar : this.j6.rN(qpVar.Mr())) {
            qp qpVarEQ = csVar.EQ();
            if (qpVarEQ != null && csVar.J8() != null) {
                kp kpVarQX = qpVarEQ.QX();
                csVar.SI(null);
                qpVar2 = qpVar2.Sf(kpVarQX);
                cs csVarBT = cs.BT(new op(vp.rN(qpVar2), wp.Hw, (qp) null, rp.vJ(qpVar2)), csVar.tp());
                ArrayList<cs> arrayListQX = csVar.tp().QX();
                arrayListQX.add(arrayListQX.indexOf(csVar) + 1, csVarBT);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.ArrayList<abcd.br> FH() {
        /*
            r11 = this;
            abcd.ds r0 = r11.j6
            int r0 = r0.a8()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r3 = 0
            r4 = 0
        L12:
            r5 = 1
            if (r4 >= r0) goto Lbf
            abcd.ds r6 = r11.j6
            abcd.cs r6 = r6.Ws(r4)
            if (r6 == 0) goto Lbb
            abcd.tp r7 = r6.we()
            if (r7 != 0) goto L25
            goto Lbb
        L25:
            abcd.qp r7 = r6.J8()
            abcd.gr r8 = r7.a8()
            boolean r9 = r8.XL()
            if (r9 != 0) goto L35
            goto Lbb
        L35:
            abcd.br r8 = (abcd.br) r8
            abcd.tp r9 = r6.we()
            int r9 = r9.Hw()
            r10 = 56
            if (r9 != r10) goto L6a
            abcd.as r6 = r6.tp()
            java.util.BitSet r6 = r6.Mr()
            int r6 = r6.nextSetBit(r3)
            abcd.ds r9 = r11.j6
            java.util.ArrayList r9 = r9.J0()
            java.lang.Object r6 = r9.get(r6)
            abcd.as r6 = (abcd.as) r6
            java.util.ArrayList r6 = r6.QX()
            int r9 = r6.size()
            int r9 = r9 - r5
            java.lang.Object r6 = r6.get(r9)
            abcd.cs r6 = (abcd.cs) r6
        L6a:
            boolean r9 = r6.Hw()
            if (r9 == 0) goto L88
            boolean r9 = r8 instanceof abcd.yq
            if (r9 == 0) goto Lbb
            boolean r9 = abcd.jr.DW
            if (r9 != 0) goto L79
            goto Lbb
        L79:
            abcd.as r6 = r6.tp()
            java.util.BitSet r6 = r6.BT()
            int r6 = r6.cardinality()
            if (r6 <= r5) goto L88
            goto Lbb
        L88:
            abcd.ds r6 = r11.j6
            boolean r6 = r6.yS(r7)
            if (r6 == 0) goto L9f
            boolean r6 = abcd.jr.FH
            if (r6 != 0) goto L95
            goto Lbb
        L95:
            boolean r6 = r2.contains(r8)
            if (r6 == 0) goto L9c
            goto Lbb
        L9c:
            r2.add(r8)
        L9f:
            java.lang.Object r6 = r1.get(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 != 0) goto Laf
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.put(r8, r5)
            goto Lbb
        Laf:
            int r6 = r6.intValue()
            int r6 = r6 + r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r1.put(r8, r5)
        Lbb:
            int r4 = r4 + 1
            goto L12
        Lbf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r2 = r1.entrySet()
            java.util.Iterator r2 = r2.iterator()
        Lcc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lec
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 <= r5) goto Lcc
            java.lang.Object r3 = r3.getKey()
            r0.add(r3)
            goto Lcc
        Lec:
            abcd.jr$a r2 = new abcd.jr$a
            r2.<init>(r11, r1)
            java.util.Collections.sort(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.jr.FH():java.util.ArrayList");
    }

    public static void Hw(ds dsVar) {
        new jr(dsVar).v5();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Zo(java.util.HashMap<abcd.br, abcd.qp> r9, int r10) {
        /*
            r8 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            abcd.ds r1 = r8.j6
            java.util.ArrayList[] r1 = r1.lg()
            r2 = 0
        Lc:
            if (r2 >= r10) goto L8f
            abcd.ds r3 = r8.j6
            abcd.cs r3 = r3.Ws(r2)
            if (r3 != 0) goto L18
            goto L8b
        L18:
            abcd.qp r4 = r3.J8()
            abcd.qp r3 = r3.J8()
            abcd.gr r3 = r3.a8()
            boolean r5 = r3.XL()
            if (r5 != 0) goto L2b
            goto L8b
        L2b:
            abcd.br r3 = (abcd.br) r3
            java.lang.Object r5 = r9.get(r3)
            abcd.qp r5 = (abcd.qp) r5
            if (r5 != 0) goto L36
            goto L8b
        L36:
            abcd.ds r6 = r8.j6
            boolean r6 = r6.yS(r4)
            if (r6 == 0) goto L56
            boolean r6 = abcd.jr.FH
            if (r6 != 0) goto L43
            goto L8b
        L43:
            boolean r6 = r0.contains(r3)
            if (r6 == 0) goto L4a
            goto L8b
        L4a:
            r0.add(r3)
            java.lang.Object r3 = r9.get(r3)
            abcd.qp r3 = (abcd.qp) r3
            r8.DW(r4, r3)
        L56:
            abcd.jr$b r3 = new abcd.jr$b
            r3.<init>(r4, r5)
            int r4 = r4.Mr()
            r4 = r1[r4]
            java.util.Iterator r4 = r4.iterator()
        L65:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8b
            java.lang.Object r5 = r4.next()
            abcd.cs r5 = (abcd.cs) r5
            boolean r6 = r5.Hw()
            if (r6 == 0) goto L87
            abcd.as r6 = r5.tp()
            java.util.BitSet r6 = r6.BT()
            int r6 = r6.cardinality()
            r7 = 1
            if (r6 <= r7) goto L87
            goto L65
        L87:
            r5.ei(r3)
            goto L65
        L8b:
            int r2 = r2 + 1
            goto Lc
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.jr.Zo(java.util.HashMap, int):void");
    }

    private void v5() {
        ArrayList<br> arrayList;
        int i;
        int iA8 = this.j6.a8();
        ArrayList<br> arrayListFH = FH();
        int iMin = Math.min(arrayListFH.size(), 5);
        as asVarQX = this.j6.QX();
        HashMap<br, qp> map = new HashMap<>(iMin);
        int i2 = 0;
        while (i2 < iMin) {
            br brVar = arrayListFH.get(i2);
            qp qpVarRo = qp.ro(this.j6.vy(), brVar);
            tp tpVarVH = vp.VH(brVar);
            if (tpVarVH.DW() == 1) {
                asVarQX.DW(new np(vp.VH(brVar), wp.Hw, qpVarRo, rp.jw, brVar));
                arrayList = arrayListFH;
                i = iMin;
            } else {
                as asVarQX2 = this.j6.QX();
                as asVarU2 = asVarQX2.U2();
                as asVarP8 = asVarQX2.P8(asVarU2);
                arrayList = arrayListFH;
                i = iMin;
                asVarP8.cn(new yp(tpVarVH, wp.Hw, rp.jw, er.jw, brVar));
                asVarP8.P8(asVarU2).DW(new op(vp.vy(qpVarRo.a8()), wp.Hw, qpVarRo, rp.jw));
            }
            map.put(brVar, qpVarRo);
            i2++;
            iMin = i;
            arrayListFH = arrayList;
        }
        Zo(map, iA8);
    }
}
