package abcd;

/* loaded from: classes.dex */
public final class om extends nm implements Comparable<om> {
    private final hm jw;
    private final vq mb;

    public om(vq vqVar, int i, yj yjVar, hr hrVar) {
        super(i);
        if (vqVar == null) {
            throw new NullPointerException("method == null");
        }
        this.mb = vqVar;
        if (yjVar == null) {
            this.jw = null;
        } else {
            this.jw = new hm(vqVar, yjVar, (i & 8) != 0, hrVar);
        }
    }

    @Override // abcd.nm
    public int DW(km kmVar, ls lsVar, int i, int i2) {
        int iJ3 = kmVar.J8().j3(this.mb);
        int i3 = iJ3 - i;
        int iFH = FH();
        int iJ0 = fn.J0(this.jw);
        if ((iJ0 != 0) != ((iFH & 1280) == 0)) {
            throw new UnsupportedOperationException("code vs. access_flags mismatch");
        }
        if (lsVar.EQ()) {
            lsVar.Hw(0, String.format("  [%x] %s", Integer.valueOf(i2), this.mb.Zo()));
            lsVar.Hw(et.FH(i3), "    method_idx:   " + xs.tp(iJ3));
            lsVar.Hw(et.FH(iFH), "    access_flags: " + bp.EQ(iFH));
            lsVar.Hw(et.FH(iJ0), "    code_off:     " + xs.tp(iJ0));
        }
        lsVar.gn(i3);
        lsVar.gn(iFH);
        lsVar.gn(iJ0);
        return iJ3;
    }

    @Override // abcd.kt
    public final String Zo() {
        return this.mb.Zo();
    }

    public boolean equals(Object obj) {
        return (obj instanceof om) && compareTo((om) obj) == 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(om.class.getName());
        stringBuffer.append('{');
        stringBuffer.append(xs.VH(FH()));
        stringBuffer.append(' ');
        stringBuffer.append(this.mb);
        if (this.jw != null) {
            stringBuffer.append(' ');
            stringBuffer.append(this.jw);
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: tp, reason: merged with bridge method [inline-methods] */
    public int compareTo(om omVar) {
        return this.mb.compareTo(omVar.mb);
    }

    public void v5(km kmVar) {
        dn dnVarJ8 = kmVar.J8();
        en enVarU2 = kmVar.U2();
        dnVarJ8.Mr(this.mb);
        hm hmVar = this.jw;
        if (hmVar != null) {
            enVarU2.XL(hmVar);
        }
    }
}
