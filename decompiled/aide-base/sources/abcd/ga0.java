package abcd;

import abcd.b70;
import abcd.ja0;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public class ga0 extends ja0 {
    private static /* synthetic */ int[] Hw;
    private final ta0 DW;
    private ja0.a[] FH;
    private final b70<a> j6 = new b70<>();

    private static class a extends b70.b {
        public a(j60 j60Var) {
            super(j60Var);
        }
    }

    public ga0(ta0 ta0Var) {
        String[] list;
        this.DW = ta0Var;
        File fileWe = ta0Var.we();
        String[] list2 = fileWe.list();
        for (String str : list2 == null ? new String[0] : list2) {
            if (str.length() == 2 && (list = new File(fileWe, str).list()) != null) {
                for (String str2 : list) {
                    if (str2.length() == 38) {
                        try {
                            this.j6.v5(new a(a70.vJ(String.valueOf(str) + str2)));
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
            }
        }
    }

    public static /* synthetic */ int[] cn() {
        int[] iArr = Hw;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[ja0.c.valuesCustom().length];
        try {
            iArr2[ja0.c.EXISTS_LOOSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[ja0.c.EXISTS_PACKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[ja0.c.FAILURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ja0.c.INSERTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        Hw = iArr2;
        return iArr2;
    }

    @Override // abcd.ja0
    public f70 BT(ob0 ob0Var, j60 j60Var) {
        return this.j6.EQ(j60Var) ? this.DW.vy(ob0Var, j60Var.BT(), j60Var) : this.DW.BT(ob0Var, j60Var);
    }

    @Override // abcd.ja0
    public q60 EQ() {
        return this.DW.EQ();
    }

    @Override // abcd.ja0, abcd.z60
    public boolean FH(j60 j60Var) {
        return U2(j60Var);
    }

    @Override // abcd.z60
    public z60 Hw() {
        return this;
    }

    @Override // abcd.ja0
    public wf0 J0() {
        return this.DW.J0();
    }

    @Override // abcd.ja0
    public void KD(gc0 gc0Var, dc0 dc0Var, ob0 ob0Var) {
        this.DW.KD(gc0Var, dc0Var, ob0Var);
    }

    @Override // abcd.ja0
    public boolean Mr(String str) {
        return this.j6.EQ(a70.vJ(str));
    }

    @Override // abcd.ja0
    public long QX(ob0 ob0Var, String str, j60 j60Var) {
        if (this.j6.EQ(j60Var)) {
            return this.DW.QX(ob0Var, str, j60Var);
        }
        return -1L;
    }

    @Override // abcd.ja0
    public void SI(Set<a70> set, h60 h60Var) {
        this.DW.SI(set, h60Var);
    }

    @Override // abcd.ja0
    public long Ws(ob0 ob0Var, j60 j60Var) {
        return this.j6.EQ(j60Var) ? this.DW.QX(ob0Var, j60Var.BT(), j60Var) : this.DW.Ws(ob0Var, j60Var);
    }

    @Override // abcd.ja0
    public ja0 er() {
        return this;
    }

    @Override // abcd.ja0
    public f70 gW(ob0 ob0Var, j60 j60Var) {
        return P8(ob0Var, j60Var);
    }

    @Override // abcd.ja0
    public boolean j3(j60 j60Var) {
        return this.j6.EQ(j60Var) || this.DW.j3(j60Var);
    }

    @Override // abcd.z60
    public void j6() {
    }

    @Override // abcd.ja0
    public ja0.c lg(File file, a70 a70Var, boolean z) throws InterruptedException, IOException {
        ja0.c cVarLg = this.DW.lg(file, a70Var, z);
        int i = cn()[cVarLg.ordinal()];
        if (i == 1 || i == 3) {
            this.j6.VH(new a(a70Var));
        }
        return cVarLg;
    }

    @Override // abcd.ja0
    public wa0 nw(File file, File file2) {
        return this.DW.nw(file, file2);
    }

    @Override // abcd.ja0
    public ja0.a[] rN() {
        if (this.FH == null) {
            ja0.a[] aVarArrRN = this.DW.rN();
            this.FH = new ja0.a[aVarArrRN.length];
            int i = 0;
            while (true) {
                ja0.a[] aVarArr = this.FH;
                if (i >= aVarArr.length) {
                    break;
                }
                aVarArr[i] = new ja0.a(aVarArrRN[i].j6.er());
                i++;
            }
        }
        return this.FH;
    }

    @Override // abcd.ja0
    public boolean ro() {
        return this.DW.ro();
    }

    @Override // abcd.ja0
    public Collection<? extends sb0> tp() {
        return this.DW.tp();
    }

    @Override // abcd.ja0
    public f70 vy(ob0 ob0Var, String str, j60 j60Var) {
        if (this.j6.EQ(j60Var)) {
            return this.DW.vy(ob0Var, str, j60Var);
        }
        return null;
    }

    @Override // abcd.ja0
    public File we() {
        return this.DW.we();
    }
}
