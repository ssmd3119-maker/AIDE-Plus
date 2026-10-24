package abcd;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class zl extends fn {
    private final yl[] k2;
    private final yo qp;

    public zl(yo yoVar) {
        super(4, yS(yoVar));
        this.qp = yoVar;
        this.k2 = new yl[yoVar.size()];
        Iterator<wo> it = yoVar.sh().iterator();
        int i = 0;
        while (it.hasNext()) {
            this.k2[i] = new yl(it.next());
            i++;
        }
    }

    private static int yS(yo yoVar) {
        try {
            return (yoVar.size() * 4) + 4;
        } catch (NullPointerException unused) {
            throw new NullPointerException("list == null");
        }
    }

    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_ANNOTATION_SET_ITEM;
    }

    @Override // abcd.fn
    public void Mr(jn jnVar, int i) {
        yl.vy(this.k2);
    }

    @Override // abcd.fn
    public String a8() {
        return this.qp.toString();
    }

    public int hashCode() {
        return this.qp.hashCode();
    }

    @Override // abcd.wm
    public void j6(km kmVar) {
        en enVarV5 = kmVar.v5();
        int length = this.k2.length;
        for (int i = 0; i < length; i++) {
            yl[] ylVarArr = this.k2;
            ylVarArr[i] = (yl) enVarV5.aM(ylVarArr[i]);
        }
    }

    @Override // abcd.fn
    public void rN(km kmVar, ls lsVar) {
        boolean zEQ = lsVar.EQ();
        int length = this.k2.length;
        if (zEQ) {
            lsVar.Hw(0, XL() + " annotation set");
            lsVar.Hw(4, "  size: " + xs.tp(length));
        }
        lsVar.writeInt(length);
        for (int i = 0; i < length; i++) {
            int iWe = this.k2[i].we();
            if (zEQ) {
                lsVar.Hw(4, "  entries[" + Integer.toHexString(i) + "]: " + xs.tp(iWe));
                this.k2[i].BT(lsVar, "    ");
            }
            lsVar.writeInt(iWe);
        }
    }

    @Override // abcd.fn
    public int tp(fn fnVar) {
        return this.qp.compareTo(((zl) fnVar).qp);
    }
}
