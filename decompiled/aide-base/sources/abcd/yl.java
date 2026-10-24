package abcd;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class yl extends fn {
    private static final b AL = new b(null);
    private on k2;
    private final wo qp;
    private byte[] zh;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] j6;

        static {
            int[] iArr = new int[xo.values().length];
            j6 = iArr;
            try {
                iArr[xo.BUILD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                j6[xo.RUNTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                j6[xo.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static class b implements Comparator<yl> {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(yl ylVar, yl ylVar2) {
            int iU7 = ylVar.k2.u7();
            int iU72 = ylVar2.k2.u7();
            if (iU7 < iU72) {
                return -1;
            }
            return iU7 > iU72 ? 1 : 0;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public yl(wo woVar) {
        super(1, -1);
        if (woVar == null) {
            throw new NullPointerException("annotation == null");
        }
        this.qp = woVar;
        this.k2 = null;
        this.zh = null;
    }

    public static void vy(yl[] ylVarArr) {
        Arrays.sort(ylVarArr, AL);
    }

    public void BT(ls lsVar, String str) {
        lsVar.Hw(0, str + "visibility: " + this.qp.cn().Zo());
        lsVar.Hw(0, str + "type: " + this.qp.ro().Zo());
        for (ap apVar : this.qp.KD()) {
            lsVar.Hw(0, str + apVar.DW().Zo() + ": " + tn.FH(apVar.FH()));
        }
    }

    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_ANNOTATION_ITEM;
    }

    @Override // abcd.fn
    public void Mr(jn jnVar, int i) {
        ps psVar = new ps();
        new tn(jnVar.v5(), psVar).v5(this.qp, false);
        byte[] bArrAM = psVar.aM();
        this.zh = bArrAM;
        U2(bArrAM.length + 1);
    }

    @Override // abcd.fn
    public String a8() {
        return this.qp.Zo();
    }

    public int hashCode() {
        return this.qp.hashCode();
    }

    @Override // abcd.wm
    public void j6(km kmVar) {
        this.k2 = kmVar.j3().U2(this.qp.ro());
        tn.j6(kmVar, this.qp);
    }

    @Override // abcd.fn
    public void rN(km kmVar, ls lsVar) {
        boolean zEQ = lsVar.EQ();
        xo xoVarCn = this.qp.cn();
        if (zEQ) {
            lsVar.Hw(0, XL() + " annotation");
            lsVar.Hw(1, "  visibility: VISBILITY_" + xoVarCn);
        }
        int i = a.j6[xoVarCn.ordinal()];
        if (i == 1) {
            lsVar.writeByte(0);
        } else if (i == 2) {
            lsVar.writeByte(1);
        } else {
            if (i != 3) {
                throw new RuntimeException("shouldn't happen");
            }
            lsVar.writeByte(2);
        }
        if (zEQ) {
            new tn(kmVar, lsVar).v5(this.qp, true);
        } else {
            lsVar.write(this.zh);
        }
    }

    @Override // abcd.fn
    public int tp(fn fnVar) {
        return this.qp.compareTo(((yl) fnVar).qp);
    }
}
