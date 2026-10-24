package abcd;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class yh extends xh {
    private final ArrayList<xh> jw;
    private final bi mb;

    public yh(int i) {
        super(i != 0);
        this.mb = new bi(i);
        this.jw = new ArrayList<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private abcd.yh Mz(abcd.yh r14) {
        /*
            r13 = this;
            abcd.bi r0 = r13.mb
            abcd.bi r1 = r14.ro()
            abcd.bi r0 = r0.Mz(r1)
            java.util.ArrayList<abcd.xh> r1 = r13.jw
            int r1 = r1.size()
            java.util.ArrayList<abcd.xh> r2 = r14.jw
            int r2 = r2.size()
            int r3 = java.lang.Math.max(r1, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r5 = 0
            r6 = 0
            r7 = 0
        L22:
            if (r6 >= r3) goto L74
            r8 = 0
            if (r6 >= r1) goto L30
            java.util.ArrayList<abcd.xh> r9 = r13.jw
            java.lang.Object r9 = r9.get(r6)
            abcd.xh r9 = (abcd.xh) r9
            goto L31
        L30:
            r9 = r8
        L31:
            if (r6 >= r2) goto L3c
            java.util.ArrayList<abcd.xh> r10 = r14.jw
            java.lang.Object r10 = r10.get(r6)
            abcd.xh r10 = (abcd.xh) r10
            goto L3d
        L3c:
            r10 = r8
        L3d:
            if (r9 != r10) goto L40
            goto L46
        L40:
            if (r9 != 0) goto L44
            r8 = r10
            goto L66
        L44:
            if (r10 != 0) goto L48
        L46:
            r8 = r9
            goto L66
        L48:
            abcd.xh r8 = r9.sh(r10)     // Catch: abcd.fi -> L4d
            goto L66
        L4d:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Merging locals set for caller block "
            r11.append(r12)
            java.lang.String r12 = abcd.xs.VH(r6)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.j6(r11)
        L66:
            if (r7 != 0) goto L6d
            if (r9 == r8) goto L6b
            goto L6d
        L6b:
            r7 = 0
            goto L6e
        L6d:
            r7 = 1
        L6e:
            r4.add(r8)
            int r6 = r6 + 1
            goto L22
        L74:
            abcd.bi r14 = r13.mb
            if (r14 != r0) goto L7b
            if (r7 != 0) goto L7b
            return r13
        L7b:
            abcd.yh r14 = new abcd.yh
            r14.<init>(r0, r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.yh.Mz(abcd.yh):abcd.yh");
    }

    private xh Sf(int i) {
        if (i >= this.jw.size()) {
            return null;
        }
        return this.jw.get(i);
    }

    private yh g3(bi biVar) {
        bi biVar2 = this.mb;
        biVar.ro();
        bi biVarMz = biVar2.Mz(biVar);
        ArrayList arrayList = new ArrayList(this.jw.size());
        int size = this.jw.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            xh xhVar = this.jw.get(i);
            xh xhVarSh = null;
            if (xhVar != null) {
                try {
                    xhVarSh = xhVar.sh(biVar);
                } catch (fi e) {
                    e.j6("Merging one locals against caller block " + xs.VH(i));
                }
            }
            z = z || xhVar != xhVarSh;
            arrayList.add(xhVarSh);
        }
        return (this.mb != biVarMz || z) ? new yh(biVarMz, arrayList) : this;
    }

    @Override // abcd.xh
    public void BT(us usVar) {
        usVar.j6("(locals array set; primary)");
        this.mb.BT(usVar);
        int size = this.jw.size();
        for (int i = 0; i < size; i++) {
            xh xhVar = this.jw.get(i);
            if (xhVar != null) {
                usVar.j6("(locals array set: primary for caller " + xs.VH(i) + ')');
                xhVar.ro().BT(usVar);
            }
        }
    }

    public xh I(int i) {
        return Sf(i);
    }

    @Override // abcd.xh
    public gr KD(int i) {
        return this.mb.KD(i);
    }

    @Override // abcd.gt
    public void Mr() {
        this.mb.Mr();
        Iterator<xh> it = this.jw.iterator();
        while (it.hasNext()) {
            xh next = it.next();
            if (next != null) {
                next.Mr();
            }
        }
        super.Mr();
    }

    @Override // abcd.kt
    public String Zo() {
        StringBuilder sb = new StringBuilder();
        sb.append("(locals array set; primary)\n");
        sb.append(ro().Zo());
        sb.append('\n');
        int size = this.jw.size();
        for (int i = 0; i < size; i++) {
            xh xhVar = this.jw.get(i);
            if (xhVar != null) {
                sb.append("(locals array set: primary for caller " + xs.VH(i) + ")\n");
                sb.append(xhVar.ro().Zo());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    @Override // abcd.xh
    public yh cb(xh xhVar, int i) {
        xh xhVarSf = Sf(i);
        bi biVarMz = this.mb.Mz(xhVar.ro());
        if (xhVarSf == xhVar) {
            xhVar = xhVarSf;
        } else if (xhVarSf != null) {
            xhVar = xhVarSf.sh(xhVar);
        }
        if (xhVar == xhVarSf && biVarMz == this.mb) {
            return this;
        }
        int size = this.jw.size();
        int iMax = Math.max(i + 1, size);
        ArrayList arrayList = new ArrayList(iMax);
        int i2 = 0;
        bi biVarRo = null;
        while (i2 < iMax) {
            xh xhVar2 = i2 == i ? xhVar : i2 < size ? this.jw.get(i2) : null;
            if (xhVar2 != null) {
                biVarRo = biVarRo == null ? xhVar2.ro() : biVarRo.Mz(xhVar2.ro());
            }
            arrayList.add(xhVar2);
            i2++;
        }
        yh yhVar = new yh(biVarRo, arrayList);
        yhVar.Mr();
        return yhVar;
    }

    @Override // abcd.xh
    public void cn(fr frVar) {
        if (this.mb.Sf() == 0) {
            return;
        }
        a8();
        this.mb.cn(frVar);
        Iterator<xh> it = this.jw.iterator();
        while (it.hasNext()) {
            xh next = it.next();
            if (next != null) {
                next.cn(frVar);
            }
        }
    }

    @Override // abcd.xh
    public void dx(int i, gr grVar) {
        a8();
        this.mb.dx(i, grVar);
        Iterator<xh> it = this.jw.iterator();
        while (it.hasNext()) {
            xh next = it.next();
            if (next != null) {
                next.dx(i, grVar);
            }
        }
    }

    public int ef() {
        return this.mb.Sf();
    }

    @Override // abcd.xh
    public bi ro() {
        return this.mb;
    }

    @Override // abcd.xh
    public void sG(qp qpVar) {
        dx(qpVar.Mr(), qpVar);
    }

    @Override // abcd.xh
    /* renamed from: vJ, reason: merged with bridge method [inline-methods] */
    public yh sh(xh xhVar) {
        try {
            yh yhVarMz = xhVar instanceof yh ? Mz((yh) xhVar) : g3((bi) xhVar);
            yhVarMz.Mr();
            return yhVarMz;
        } catch (fi e) {
            e.j6("underlay locals:");
            BT(e);
            e.j6("overlay locals:");
            xhVar.BT(e);
            throw e;
        }
    }

    @Override // abcd.xh
    public xh vy() {
        return new yh(this);
    }

    public yh(bi biVar, ArrayList<xh> arrayList) {
        super(biVar.Sf() > 0);
        this.mb = biVar;
        this.jw = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private yh(yh yhVar) {
        super(yhVar.ef() > 0);
        this.mb = yhVar.mb.vy();
        this.jw = new ArrayList<>(yhVar.jw.size());
        int size = yhVar.jw.size();
        for (int i = 0; i < size; i++) {
            xh xhVar = yhVar.jw.get(i);
            if (xhVar == null) {
                this.jw.add(null);
            } else {
                this.jw.add(xhVar.vy());
            }
        }
    }
}
