package abcd;

/* loaded from: classes.dex */
public final class sk extends uk {
    private final wj[] VH;
    private final at Zo;
    private final boolean gn;
    private final wj v5;

    public sk(wp wpVar, wj wjVar, at atVar, wj[] wjVarArr) {
        super(wpVar, rp.jw);
        if (wjVar == null) {
            throw new NullPointerException("user == null");
        }
        if (atVar == null) {
            throw new NullPointerException("cases == null");
        }
        if (wjVarArr == null) {
            throw new NullPointerException("targets == null");
        }
        int size = atVar.size();
        if (size != wjVarArr.length) {
            throw new IllegalArgumentException("cases / targets mismatch");
        }
        if (size > 65535) {
            throw new IllegalArgumentException("too many cases");
        }
        this.v5 = wjVar;
        this.Zo = atVar;
        this.VH = wjVarArr;
        this.gn = yS(atVar);
    }

    private static long er(at atVar) {
        int size = atVar.size();
        long jRo = (((atVar.ro(size - 1) - atVar.ro(0)) + 1) * 2) + 4;
        if (jRo <= 2147483647L) {
            return jRo;
        }
        return -1L;
    }

    private static long gW(at atVar) {
        return (atVar.size() * 4) + 2;
    }

    private static boolean yS(at atVar) {
        if (atVar.size() < 2) {
            return true;
        }
        long jEr = er(atVar);
        return jEr >= 0 && jEr <= (gW(atVar) * 5) / 4;
    }

    @Override // abcd.zj
    public int DW() {
        return (int) (this.gn ? er(this.Zo) : gW(this.Zo));
    }

    @Override // abcd.zj
    public String XL(boolean z) {
        int iZo = this.v5.Zo();
        StringBuffer stringBuffer = new StringBuffer(100);
        int length = this.VH.length;
        stringBuffer.append(this.gn ? "packed" : "sparse");
        stringBuffer.append("-switch-payload // for switch @ ");
        stringBuffer.append(xs.VH(iZo));
        for (int i = 0; i < length; i++) {
            int iZo2 = this.VH[i].Zo();
            stringBuffer.append("\n  ");
            stringBuffer.append(this.Zo.ro(i));
            stringBuffer.append(": ");
            stringBuffer.append(xs.tp(iZo2));
            stringBuffer.append(" // ");
            stringBuffer.append(xs.Hw(iZo2 - iZo));
        }
        return stringBuffer.toString();
    }

    @Override // abcd.zj
    public zj a8(rp rpVar) {
        return new sk(EQ(), this.v5, this.Zo, this.VH);
    }

    @Override // abcd.zj
    public String j6() {
        StringBuffer stringBuffer = new StringBuffer(100);
        int length = this.VH.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append("\n    ");
            stringBuffer.append(this.Zo.ro(i));
            stringBuffer.append(": ");
            stringBuffer.append(this.VH[i]);
        }
        return stringBuffer.toString();
    }

    @Override // abcd.zj
    public void lg(ls lsVar) {
        int iZo;
        int iZo2 = this.v5.Zo();
        int iHw = ck.I.DW().Hw();
        int length = this.VH.length;
        int i = 0;
        if (!this.gn) {
            lsVar.writeShort(512);
            lsVar.writeShort(length);
            for (int i2 = 0; i2 < length; i2++) {
                lsVar.writeInt(this.Zo.ro(i2));
            }
            while (i < length) {
                lsVar.writeInt(this.VH[i].Zo() - iZo2);
                i++;
            }
            return;
        }
        int iRo = length == 0 ? 0 : this.Zo.ro(0);
        int iRo2 = ((length == 0 ? 0 : this.Zo.ro(length - 1)) - iRo) + 1;
        lsVar.writeShort(256);
        lsVar.writeShort(iRo2);
        lsVar.writeInt(iRo);
        int i3 = 0;
        while (i < iRo2) {
            if (this.Zo.ro(i3) > iRo + i) {
                iZo = iHw;
            } else {
                iZo = this.VH[i3].Zo() - iZo2;
                i3++;
            }
            lsVar.writeInt(iZo);
            i++;
        }
    }

    public boolean rN() {
        return this.gn;
    }
}
