package abcd;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ym extends fn {
    private final int AL;
    private final jn k2;
    private final xm qp;
    private final wm zh;

    private ym(xm xmVar, jn jnVar, wm wmVar, wm wmVar2, int i) {
        super(4, 12);
        if (xmVar == null) {
            throw new NullPointerException("type == null");
        }
        if (jnVar == null) {
            throw new NullPointerException("section == null");
        }
        if (wmVar == null) {
            throw new NullPointerException("firstItem == null");
        }
        if (wmVar2 == null) {
            throw new NullPointerException("lastItem == null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("itemCount <= 0");
        }
        this.qp = xmVar;
        this.k2 = jnVar;
        this.zh = wmVar;
        this.AL = i;
    }

    public static void yS(jn[] jnVarArr, en enVar) {
        if (jnVarArr == null) {
            throw new NullPointerException("sections == null");
        }
        if (enVar.VH().size() != 0) {
            throw new IllegalArgumentException("mapSection.items().size() != 0");
        }
        ArrayList arrayList = new ArrayList(50);
        for (jn jnVar : jnVarArr) {
            xm xmVar = null;
            wm wmVar = null;
            wm wmVar2 = null;
            int i = 0;
            for (wm wmVar3 : jnVar.VH()) {
                xm xmVarDW = wmVar3.DW();
                if (xmVarDW != xmVar) {
                    if (i != 0) {
                        arrayList.add(new ym(xmVar, jnVar, wmVar, wmVar2, i));
                    }
                    wmVar = wmVar3;
                    xmVar = xmVarDW;
                    i = 0;
                }
                i++;
                wmVar2 = wmVar3;
            }
            if (i != 0) {
                arrayList.add(new ym(xmVar, jnVar, wmVar, wmVar2, i));
            } else if (jnVar == enVar) {
                arrayList.add(new ym(enVar));
            }
        }
        enVar.XL(new sn(xm.TYPE_MAP_LIST, arrayList));
    }

    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_MAP_ITEM;
    }

    @Override // abcd.fn
    public final String a8() {
        return toString();
    }

    @Override // abcd.wm
    public void j6(km kmVar) {
    }

    @Override // abcd.fn
    public void rN(km kmVar, ls lsVar) {
        int iDW = this.qp.DW();
        wm wmVar = this.zh;
        int iZo = wmVar == null ? this.k2.Zo() : this.k2.DW(wmVar);
        if (lsVar.EQ()) {
            lsVar.Hw(0, XL() + ' ' + this.qp.FH() + " map");
            lsVar.Hw(2, "  type:   " + xs.VH(iDW) + " // " + this.qp.toString());
            lsVar.Hw(2, "  unused: 0");
            StringBuilder sb = new StringBuilder();
            sb.append("  size:   ");
            sb.append(xs.tp(this.AL));
            lsVar.Hw(4, sb.toString());
            lsVar.Hw(4, "  offset: " + xs.tp(iZo));
        }
        lsVar.writeShort(iDW);
        lsVar.writeShort(0);
        lsVar.writeInt(this.AL);
        lsVar.writeInt(iZo);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(ym.class.getName());
        stringBuffer.append('{');
        stringBuffer.append(this.k2.toString());
        stringBuffer.append(' ');
        stringBuffer.append(this.qp.Zo());
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    private ym(jn jnVar) {
        super(4, 12);
        if (jnVar != null) {
            this.qp = xm.TYPE_MAP_LIST;
            this.k2 = jnVar;
            this.zh = null;
            this.AL = 1;
            return;
        }
        throw new NullPointerException("section == null");
    }
}
