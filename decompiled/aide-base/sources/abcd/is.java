package abcd;

import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class is {
    private final BitSet DW;
    private final int FH;
    private final ds Hw;
    private int VH;
    private as Zo;
    private b gn;
    private final BitSet j6;
    private final hs v5;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] j6;

        static {
            int[] iArr = new int[b.values().length];
            j6 = iArr;
            try {
                iArr[b.LIVE_IN_AT_STATEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                j6[b.LIVE_OUT_AT_STATEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                j6[b.LIVE_OUT_AT_BLOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private enum b {
        LIVE_IN_AT_STATEMENT,
        LIVE_OUT_AT_STATEMENT,
        LIVE_OUT_AT_BLOCK,
        DONE
    }

    private is(ds dsVar, int i, hs hsVar) {
        int size = dsVar.J0().size();
        this.Hw = dsVar;
        this.FH = i;
        this.j6 = new BitSet(size);
        this.DW = new BitSet(size);
        this.v5 = hsVar;
    }

    public static hs DW(ds dsVar) {
        int iA8 = dsVar.a8();
        hs hsVar = new hs(iA8);
        for (int i = 0; i < iA8; i++) {
            new is(dsVar, i, hsVar).VH();
        }
        j6(dsVar, hsVar);
        return hsVar;
    }

    private void FH() {
        while (true) {
            b bVar = this.gn;
            if (bVar == b.DONE) {
                return;
            }
            int i = a.j6[bVar.ordinal()];
            if (i == 1) {
                this.gn = b.DONE;
                Hw();
            } else if (i == 2) {
                this.gn = b.DONE;
                Zo();
            } else if (i == 3) {
                this.gn = b.DONE;
                v5();
            }
        }
    }

    private void Hw() {
        int i = this.VH;
        if (i != 0) {
            this.VH = i - 1;
            this.gn = b.LIVE_OUT_AT_STATEMENT;
        } else {
            this.Zo.FH(this.FH);
            this.DW.or(this.Zo.Mr());
        }
    }

    private void Zo() {
        cs csVar = this.Zo.QX().get(this.VH);
        qp qpVarJ8 = csVar.J8();
        if (csVar.gW(this.FH)) {
            return;
        }
        if (qpVarJ8 != null) {
            this.v5.j6(this.FH, qpVarJ8.Mr());
        }
        this.gn = b.LIVE_IN_AT_STATEMENT;
    }

    private static void j6(ds dsVar, hs hsVar) {
        Iterator<as> it = dsVar.J0().iterator();
        while (it.hasNext()) {
            List<cs> listJ3 = it.next().j3();
            int size = listJ3.size();
            for (int i = 0; i < size; i++) {
                for (int i2 = 0; i2 < size; i2++) {
                    if (i != i2) {
                        hsVar.j6(listJ3.get(i).J8().Mr(), listJ3.get(i2).J8().Mr());
                    }
                }
            }
        }
    }

    private void v5() {
        if (this.j6.get(this.Zo.Ws())) {
            return;
        }
        this.j6.set(this.Zo.Ws());
        this.Zo.Hw(this.FH);
        this.VH = this.Zo.QX().size() - 1;
        this.gn = b.LIVE_OUT_AT_STATEMENT;
    }

    public void VH() {
        for (cs csVar : this.Hw.rN(this.FH)) {
            this.gn = b.DONE;
            if (csVar instanceof vr) {
                Iterator<as> it = ((vr) csVar).Sf(this.FH, this.Hw).iterator();
                while (it.hasNext()) {
                    this.Zo = it.next();
                    this.gn = b.LIVE_OUT_AT_BLOCK;
                    FH();
                }
            } else {
                as asVarTp = csVar.tp();
                this.Zo = asVarTp;
                int iIndexOf = asVarTp.QX().indexOf(csVar);
                this.VH = iIndexOf;
                if (iIndexOf < 0) {
                    throw new RuntimeException("insn not found in it's own block");
                }
                this.gn = b.LIVE_IN_AT_STATEMENT;
                FH();
            }
        }
        while (true) {
            int iNextSetBit = this.DW.nextSetBit(0);
            if (iNextSetBit < 0) {
                return;
            }
            this.Zo = this.Hw.J0().get(iNextSetBit);
            this.DW.clear(iNextSetBit);
            this.gn = b.LIVE_OUT_AT_BLOCK;
            FH();
        }
    }
}
