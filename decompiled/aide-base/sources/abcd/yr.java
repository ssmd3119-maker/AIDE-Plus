package abcd;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class yr {
    private int DW;
    private int[] FH;
    private bq[] Hw;
    private BitSet VH;
    private ArrayList<as> Zo;
    private ArrayList<cs> gn;
    private ds j6;
    private ArrayList<cs> tp;
    private ArrayList<cs> u7;
    private ArrayList<as> v5;

    private yr(ds dsVar) {
        this.j6 = dsVar;
        int iA8 = dsVar.a8();
        this.DW = iA8;
        this.FH = new int[iA8];
        this.Hw = new bq[iA8];
        this.v5 = new ArrayList<>();
        this.Zo = new ArrayList<>();
        this.VH = new BitSet(dsVar.J0().size());
        this.gn = new ArrayList<>();
        this.u7 = new ArrayList<>();
        this.tp = new ArrayList<>();
        for (int i = 0; i < this.DW; i++) {
            this.FH[i] = 0;
            this.Hw[i] = null;
        }
    }

    private void DW(int i, int i2) {
        if (i2 == 2) {
            Iterator<cs> it = this.j6.rN(i).iterator();
            while (it.hasNext()) {
                this.u7.add(it.next());
            }
            return;
        }
        Iterator<cs> it2 = this.j6.rN(i).iterator();
        while (it2.hasNext()) {
            this.gn.add(it2.next());
        }
    }

    private void EQ(vr vrVar) {
        int iMr = vrVar.J8().Mr();
        int i = 2;
        if (this.FH[iMr] == 2) {
            return;
        }
        rp rpVarWs = vrVar.Ws();
        bq bqVar = null;
        int size = rpVarWs.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= size) {
                i = i3;
                break;
            }
            int iEf = vrVar.ef(i2);
            int iMr2 = rpVarWs.sG(i2).Mr();
            int i4 = this.FH[iMr2];
            if (this.VH.get(iEf)) {
                if (i4 != 1) {
                    i = i4;
                    break;
                } else if (bqVar == null) {
                    bqVar = this.Hw[iMr2];
                    i3 = 1;
                } else if (!this.Hw[iMr2].equals(bqVar)) {
                    break;
                }
            }
            i2++;
        }
        if (VH(iMr, i, bqVar)) {
            DW(iMr, i);
        }
    }

    public static void FH(ds dsVar) {
        new yr(dsVar).Zo();
    }

    private void Hw() {
        Iterator<cs> it = this.tp.iterator();
        while (it.hasNext()) {
            cs next = it.next();
            as asVarTp = next.tp();
            int size = asVarTp.gW().size();
            int i = -1;
            for (int i2 = 0; i2 < size; i2++) {
                int iRo = asVarTp.gW().ro(i2);
                if (!this.VH.get(iRo)) {
                    i = iRo;
                }
            }
            if (size == 2 && i != -1) {
                asVarTp.cn(new op(vp.j3, next.J0().we(), (qp) null, rp.jw));
                asVarTp.ro(i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009f A[PHI: r6
      0x009f: PHI (r6v3 abcd.bq) = (r6v0 abcd.bq), (r6v0 abcd.bq), (r6v6 abcd.bq), (r6v0 abcd.bq) binds: [B:33:0x0088, B:29:0x0070, B:26:0x0069, B:23:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void J0(abcd.cs r9) {
        /*
            r8 = this;
            abcd.ip r0 = r9.J0()
            abcd.tp r1 = r0.EQ()
            int r1 = r1.DW()
            r2 = 1
            if (r1 != r2) goto L19
            abcd.tp r1 = r0.EQ()
            boolean r1 = r1.VH()
            if (r1 == 0) goto L1c
        L19:
            r8.u7(r9)
        L1c:
            abcd.tp r1 = r9.we()
            int r1 = r1.Hw()
            abcd.qp r3 = r9.J8()
            r4 = 0
            if (r3 != 0) goto L4b
            r3 = 17
            if (r1 == r3) goto L35
            r3 = 18
            if (r1 != r3) goto L34
            goto L35
        L34:
            return
        L35:
            abcd.as r3 = r9.tp()
            abcd.as r3 = r3.U2()
            java.util.ArrayList r3 = r3.QX()
            java.lang.Object r3 = r3.get(r4)
            abcd.cs r3 = (abcd.cs) r3
            abcd.qp r3 = r3.J8()
        L4b:
            int r5 = r3.Mr()
            r6 = 0
            r7 = 2
            if (r1 == r7) goto L80
            r4 = 5
            if (r1 == r4) goto L79
            r0 = 56
            if (r1 == r0) goto L6c
            switch(r1) {
                case 14: goto L61;
                case 15: goto L61;
                case 16: goto L61;
                case 17: goto L61;
                case 18: goto L61;
                default: goto L5d;
            }
        L5d:
            switch(r1) {
                case 20: goto L61;
                case 21: goto L61;
                case 22: goto L61;
                case 23: goto L61;
                case 24: goto L61;
                case 25: goto L61;
                default: goto L60;
            }
        L60:
            goto L9f
        L61:
            int r0 = r3.u7()
            abcd.bq r6 = r8.tp(r9, r0)
            if (r6 == 0) goto L9f
            goto La0
        L6c:
            int[] r9 = r8.FH
            r0 = r9[r5]
            if (r0 != r2) goto L9f
            r2 = r9[r5]
            abcd.bq[] r9 = r8.Hw
            r6 = r9[r5]
            goto La0
        L79:
            abcd.ep r0 = (abcd.ep) r0
            abcd.bq r6 = r0.a8()
            goto La0
        L80:
            abcd.rp r0 = r9.Ws()
            int r0 = r0.size()
            if (r0 != r2) goto L9f
            abcd.rp r9 = r9.Ws()
            abcd.qp r9 = r9.sG(r4)
            int r9 = r9.Mr()
            int[] r0 = r8.FH
            r2 = r0[r9]
            abcd.bq[] r0 = r8.Hw
            r6 = r0[r9]
            goto La0
        L9f:
            r2 = 2
        La0:
            boolean r9 = r8.VH(r5, r2, r6)
            if (r9 == 0) goto La9
            r8.DW(r5, r2)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.yr.J0(abcd.cs):void");
    }

    private boolean VH(int i, int i2, bq bqVar) {
        if (i2 != 1) {
            int[] iArr = this.FH;
            if (iArr[i] == i2) {
                return false;
            }
            iArr[i] = i2;
            return true;
        }
        if (this.FH[i] == i2 && this.Hw[i].equals(bqVar)) {
            return false;
        }
        this.FH[i] = i2;
        this.Hw[i] = bqVar;
        return true;
    }

    private void Zo() {
        j6(this.j6.QX());
        while (true) {
            if (this.v5.isEmpty() && this.Zo.isEmpty() && this.gn.isEmpty() && this.u7.isEmpty()) {
                v5();
                Hw();
                return;
            }
            while (!this.v5.isEmpty()) {
                gn(this.v5.remove(this.v5.size() - 1));
            }
            while (!this.Zo.isEmpty()) {
                we(this.Zo.remove(this.Zo.size() - 1));
            }
            while (!this.u7.isEmpty()) {
                cs csVarRemove = this.u7.remove(this.u7.size() - 1);
                if (this.VH.get(csVarRemove.tp().Ws())) {
                    if (csVarRemove instanceof vr) {
                        EQ((vr) csVarRemove);
                    } else {
                        J0(csVarRemove);
                    }
                }
            }
            while (!this.gn.isEmpty()) {
                cs csVarRemove2 = this.gn.remove(this.gn.size() - 1);
                if (this.VH.get(csVarRemove2.tp().Ws())) {
                    if (csVarRemove2 instanceof vr) {
                        EQ((vr) csVarRemove2);
                    } else {
                        J0(csVarRemove2);
                    }
                }
            }
        }
    }

    private void gn(as asVar) {
        Iterator<cs> it = asVar.QX().iterator();
        while (it.hasNext()) {
            cs next = it.next();
            if (next instanceof vr) {
                EQ((vr) next);
            } else {
                J0(next);
            }
        }
    }

    private void j6(as asVar) {
        if (this.VH.get(asVar.Ws())) {
            this.Zo.add(asVar);
        } else {
            this.v5.add(asVar);
            this.VH.set(asVar.Ws());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private abcd.bq tp(abcd.cs r8, int r9) {
        /*
            r7 = this;
            abcd.ip r0 = r8.J0()
            abcd.tp r1 = r8.we()
            int r1 = r1.Hw()
            abcd.rp r8 = r8.Ws()
            r2 = 0
            abcd.qp r3 = r8.sG(r2)
            int r3 = r3.Mr()
            int[] r4 = r7.FH
            r4 = r4[r3]
            r5 = 0
            r6 = 1
            if (r4 == r6) goto L23
            r3 = r5
            goto L27
        L23:
            abcd.bq[] r4 = r7.Hw
            r3 = r4[r3]
        L27:
            int r4 = r8.size()
            if (r4 != r6) goto L34
            abcd.ep r0 = (abcd.ep) r0
            abcd.bq r0 = r0.a8()
            goto L48
        L34:
            abcd.qp r0 = r8.sG(r6)
            int r0 = r0.Mr()
            int[] r4 = r7.FH
            r4 = r4[r0]
            if (r4 == r6) goto L44
            r0 = r5
            goto L48
        L44:
            abcd.bq[] r4 = r7.Hw
            r0 = r4[r0]
        L48:
            if (r3 == 0) goto L9d
            if (r0 != 0) goto L4d
            goto L9d
        L4d:
            r4 = 6
            if (r9 == r4) goto L51
            return r5
        L51:
            abcd.nq r3 = (abcd.nq) r3
            int r9 = r3.a8()
            abcd.nq r0 = (abcd.nq) r0
            int r0 = r0.a8()
            switch(r1) {
                case 14: goto L94;
                case 15: goto L89;
                case 16: goto L86;
                case 17: goto L7f;
                case 18: goto L7a;
                case 19: goto L60;
                case 20: goto L77;
                case 21: goto L74;
                case 22: goto L71;
                case 23: goto L6e;
                case 24: goto L6b;
                case 25: goto L68;
                default: goto L60;
            }
        L60:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Unexpected op"
            r8.<init>(r9)
            throw r8
        L68:
            int r8 = r9 >>> r0
            goto L96
        L6b:
            int r8 = r9 >> r0
            goto L96
        L6e:
            int r8 = r9 << r0
            goto L96
        L71:
            r8 = r9 ^ r0
            goto L96
        L74:
            r8 = r9 | r0
            goto L96
        L77:
            r8 = r9 & r0
            goto L96
        L7a:
            if (r0 != 0) goto L7d
            goto L81
        L7d:
            int r9 = r9 % r0
            goto L95
        L7f:
            if (r0 != 0) goto L84
        L81:
            r8 = 0
            r2 = 1
            goto L96
        L84:
            int r9 = r9 / r0
            goto L95
        L86:
            int r9 = r9 * r0
            goto L95
        L89:
            int r8 = r8.size()
            if (r8 != r6) goto L92
            int r0 = r0 - r9
            r8 = r0
            goto L96
        L92:
            int r9 = r9 - r0
            goto L95
        L94:
            int r9 = r9 + r0
        L95:
            r8 = r9
        L96:
            if (r2 == 0) goto L99
            goto L9d
        L99:
            abcd.nq r5 = abcd.nq.yS(r8)
        L9d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.yr.tp(abcd.cs, int):abcd.bq");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
    /* JADX WARN: Type inference failed for: r2v11, types: [abcd.bq[]] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void u7(abcd.cs r10) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.yr.u7(abcd.cs):void");
    }

    private void v5() {
        for (int i = 0; i < this.DW; i++) {
            if (this.FH[i] == 1 && (this.Hw[i] instanceof br)) {
                cs csVarWs = this.j6.Ws(i);
                if (!csVarWs.J8().a8().XL()) {
                    csVarWs.nw(csVarWs.J8().I((br) this.Hw[i]));
                    for (cs csVar : this.j6.rN(i)) {
                        if (!csVar.yS()) {
                            tr trVar = (tr) csVar;
                            rp rpVarWs = csVar.Ws();
                            int iSf = rpVarWs.Sf(i);
                            trVar.sh(iSf, rpVarWs.sG(iSf).I((br) this.Hw[i]));
                        }
                    }
                }
            }
        }
    }

    private void we(as asVar) {
        Iterator<cs> it = asVar.QX().iterator();
        while (it.hasNext()) {
            cs next = it.next();
            if (!(next instanceof vr)) {
                return;
            } else {
                EQ((vr) next);
            }
        }
    }
}
