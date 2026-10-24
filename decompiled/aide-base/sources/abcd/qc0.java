package abcd;

import abcd.md0;
import abcd.pg0;
import abcd.q60;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class qc0 extends pc0 implements yc0 {
    private static /* synthetic */ int[] KD;
    private boolean BT;
    final m90 Mr;
    private String P8;
    private nd0 SI;
    final m90 U2;
    private final m90 a8;
    private final t90 aM;
    private eb0 ei;
    private boolean er;
    private boolean gW;
    private l90<k90> j3;
    final m90 lg;
    private pg0.c nw;
    private d rN;
    private boolean vy;
    private boolean yS;

    class a extends ba0 {
        public a() {
        }

        @Override // abcd.ba0
        public boolean DW(t90 t90Var, k90 k90Var) {
            boolean zLp = k90Var.lp(qc0.this.U2);
            if (k90Var.lp(qc0.this.lg)) {
                k90Var.x9(qc0.this.U2);
            }
            return !zLp;
        }

        @Override // abcd.ba0
        public boolean FH() {
            return false;
        }

        @Override // abcd.ba0
        /* renamed from: j6 */
        public ba0 clone() {
            return this;
        }
    }

    private static class b extends Exception {
        private b() {
        }

        public /* synthetic */ b(b bVar) {
            this();
        }
    }

    private static class c {
        static final q60.b<c> DW = new a();
        final boolean j6;

        class a implements q60.b<c> {
            @Override // abcd.q60.b
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public c j6(q60 q60Var) {
                return new c(q60Var);
            }
        }

        public c(q60 q60Var) {
            this.j6 = q60Var.J0("repack", "usedeltabaseoffset", true);
        }
    }

    enum d {
        OFF,
        CONTINUE,
        DETAILED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] dVarArrValuesCustom = values();
            int length = dVarArrValuesCustom.length;
            d[] dVarArr = new d[length];
            System.arraycopy(dVarArrValuesCustom, 0, dVarArr, 0, length);
            return dVarArr;
        }
    }

    public qc0(kd0 kd0Var) {
        super(kd0Var);
        this.rN = d.OFF;
        c cVar = (c) this.Hw.gn().tp(c.DW);
        this.gW = this.Zo.Ws() != he0.NO_TAGS;
        this.er = this.Zo.a8();
        this.BT = cVar.j6;
        this.aM = new t90(this.Hw);
        this.j3 = new l90<>();
        this.Mr = this.aM.vJ("REACHABLE");
        this.U2 = this.aM.vJ("COMMON");
        this.a8 = this.aM.vJ("STATE");
        this.lg = this.aM.vJ("ADVERTISED");
        this.aM.EQ(this.U2);
        this.aM.EQ(this.Mr);
        this.aM.EQ(this.lg);
    }

    private void BT(Set<a70> set, int i) {
        for (k70 k70Var : this.Hw.VH().values()) {
            a70 a70VarFH = k70Var.FH();
            if (a70VarFH == null) {
                a70VarFH = k70Var.DW();
            }
            if (a70VarFH != null) {
                SI(a70VarFH);
            }
        }
        Iterator<a70> it = this.Hw.Zo().iterator();
        while (it.hasNext()) {
            SI(it.next());
        }
        Iterator<a70> it2 = set.iterator();
        while (it2.hasNext()) {
            SI(it2.next());
        }
        if (i <= 0) {
            return;
        }
        Date date = new Date(i * 1000);
        this.aM.wc(q90.COMMIT_TIME_DESC);
        this.aM.sG(this.j3);
        this.aM.XG(z90.v5(date));
        while (true) {
            k90 k90VarG3 = this.aM.g3();
            if (k90VarG3 == null) {
                return;
            }
            if (k90VarG3.lp(this.lg) && !k90VarG3.lp(this.U2)) {
                k90VarG3.x9(this.U2);
                k90VarG3.br(this.U2);
                this.j3.add(k90VarG3);
            }
        }
    }

    private void KD(j70 j70Var) {
        InputStream ce0Var = this.tp;
        if (this.yS) {
            ce0Var = new ce0(ce0Var, j70Var, we());
        }
        e70 e70VarEr = this.Hw.er();
        try {
            jd0 jd0VarEQ = e70VarEr.EQ(ce0Var);
            jd0VarEQ.wc(this.er);
            jd0VarEQ.FN(this.Zo.Mr());
            jd0VarEQ.CU(this.P8);
            this.ei = jd0VarEQ.Mz(j70Var);
            e70VarEr.FH();
        } finally {
            e70VarEr.we();
        }
    }

    private int P8(Collection<k70> collection) {
        int iXG;
        Iterator<k70> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                o90 o90VarI = this.aM.I(it.next().DW());
                if ((o90VarI instanceof k90) && i < (iXG = ((k90) o90VarI).XG())) {
                    i = iXG;
                }
            } catch (IOException unused) {
            }
        }
        return i;
    }

    private void SI(a70 a70Var) {
        try {
            k90 k90VarCa = this.aM.ca(a70Var);
            if (k90VarCa.lp(this.Mr)) {
                return;
            }
            k90VarCa.x9(this.Mr);
            this.j3.add(k90VarCa);
        } catch (IOException unused) {
        }
    }

    private void ei(j70 j70Var) throws IOException, b {
        int i;
        w60 w60Var = new w60();
        if (this.Ws) {
            this.nw.Ws(this.EQ, null);
        }
        nw();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            k90 k90VarG3 = this.aM.g3();
            if (k90VarG3 == null) {
                break;
            }
            nd0 nd0Var = this.J0;
            StringBuilder sb = new StringBuilder("have ");
            k90VarG3.sy();
            sb.append(k90VarG3.BT());
            sb.append("\n");
            nd0Var.VH(sb.toString());
            i2++;
            i3++;
            if ((i2 & 31) == 0) {
                if (j70Var.isCancelled()) {
                    throw new b(null);
                }
                this.J0.j6();
                i4++;
                if (i2 != 32 || this.Ws) {
                    do {
                        md0.a aVarJ6 = this.we.j6(w60Var);
                        int i5 = lg()[aVarJ6.ordinal()];
                        if (i5 == 1) {
                            i4--;
                            if (this.vy && z) {
                                break;
                            }
                            if (this.Ws) {
                                this.nw.Ws(this.EQ, null);
                            }
                            if (z2 && i3 > 256) {
                                break;
                            }
                        } else if (i5 == 2) {
                            this.rN = d.OFF;
                            if (this.Ws) {
                                this.nw.Ws(this.EQ, null);
                            }
                            i = 0;
                            z3 = true;
                        } else if (i5 == 3 || i5 == 4 || i5 == 5) {
                            gW(this.aM.I(w60Var), aVarJ6);
                            i3 = 0;
                            if (aVarJ6 == md0.a.ACK_READY) {
                                z = true;
                            }
                            z2 = true;
                            z3 = true;
                        }
                    } while (!j70Var.isCancelled());
                    throw new b(null);
                }
            }
        }
        i = i4;
        if (j70Var.isCancelled()) {
            throw new b(null);
        }
        if (!z || !this.vy) {
            this.J0.VH("done\n");
            this.J0.DW();
        }
        if (!z3) {
            this.rN = d.OFF;
            i++;
        }
        do {
            if (i <= 0 && this.rN == d.OFF) {
                return;
            }
            i--;
            int i6 = lg()[this.we.j6(w60Var).ordinal()];
            if (i6 == 2) {
                return;
            }
            if (i6 != 3 && i6 != 4) {
                if (i6 == 5) {
                }
            }
            this.rN = d.CONTINUE;
        } while (!j70Var.isCancelled());
        throw new b(null);
    }

    private String er() throws y40 {
        StringBuilder sb = new StringBuilder();
        if (this.gW) {
            this.gW = a8(sb, "include-tag");
        }
        if (this.BT) {
            a8(sb, "ofs-delta");
        }
        if (a8(sb, "multi_ack_detailed")) {
            this.rN = d.DETAILED;
            if (this.Ws) {
                this.vy = a8(sb, "no-done");
            }
        } else if (a8(sb, "multi_ack")) {
            this.rN = d.CONTINUE;
        } else {
            this.rN = d.OFF;
        }
        if (this.er) {
            this.er = a8(sb, "thin-pack");
        }
        if (a8(sb, "side-band-64k") || a8(sb, "side-band")) {
            this.yS = true;
        }
        if (!this.Ws || this.rN == d.DETAILED) {
            return sb.toString();
        }
        throw new y40(this.v5, MessageFormat.format(JGitText.DW().statelessRPCRequiresOptionToBeEnabled, "multi_ack_detailed"));
    }

    private void gW(o90 o90Var, md0.a aVar) throws IOException {
        if (this.Ws && aVar == md0.a.ACK_COMMON && !o90Var.lp(this.a8)) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("have ");
            sb.append(o90Var.BT());
            sb.append('\n');
            this.SI.VH(sb.toString());
            o90Var.x9(this.a8);
        }
        o90Var.x9(this.U2);
        if (o90Var instanceof k90) {
            ((k90) o90Var).br(this.U2);
        }
    }

    public static /* synthetic */ int[] lg() {
        int[] iArr = KD;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[md0.a.valuesCustom().length];
        try {
            iArr2[md0.a.ACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[md0.a.ACK_COMMON.ordinal()] = 4;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[md0.a.ACK_CONTINUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[md0.a.ACK_READY.ordinal()] = 5;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[md0.a.NAK.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        KD = iArr2;
        return iArr2;
    }

    private void nw() {
        this.aM.kQ(this.Mr, this.lg);
        this.aM.sG(this.j3);
        this.aM.wc(q90.COMMIT_TIME_DESC);
        this.aM.XG(new a());
    }

    private boolean ro(Collection<k70> collection) throws IOException {
        nd0 nd0Var = this.Ws ? this.SI : this.J0;
        boolean z = true;
        for (k70 k70Var : collection) {
            if (!this.aM.I(k70Var.DW()).lp(this.Mr)) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("want ");
                sb.append(k70Var.DW().BT());
                if (z) {
                    sb.append(er());
                    z = false;
                }
                sb.append('\n');
                nd0Var.VH(sb.toString());
            }
        }
        if (z) {
            return false;
        }
        nd0Var.j6();
        this.J8 = false;
        return true;
    }

    private void vy() {
        for (k70 k70Var : Zo()) {
            yS(k70Var.DW());
            if (k70Var.FH() != null) {
                yS(k70Var.FH());
            }
        }
    }

    private void yS(j60 j60Var) {
        try {
            this.aM.I(j60Var).x9(this.lg);
        } catch (IOException unused) {
        }
    }

    @Override // abcd.yc0
    public void FH(String str) {
        this.P8 = str;
    }

    @Override // abcd.yc0
    public Collection<eb0> VH() {
        eb0 eb0Var = this.ei;
        return eb0Var != null ? Collections.singleton(eb0Var) : Collections.emptyList();
    }

    @Override // abcd.pc0, abcd.tc0
    public void close() {
        this.aM.lp();
        super.close();
    }

    @Override // abcd.yc0
    public boolean gn() {
        return false;
    }

    @Override // abcd.yc0
    public final void j6(j70 j70Var, Collection<k70> collection, Set<a70> set) throws j50 {
        J0();
        rN(j70Var, collection, set);
    }

    public void rN(j70 j70Var, Collection<k70> collection, Set<a70> set) {
        try {
            vy();
            BT(set, P8(collection));
            if (this.Ws) {
                this.nw = new pg0.c(Integer.MAX_VALUE);
                this.SI = new nd0(this.nw);
            }
            if (ro(collection)) {
                ei(j70Var);
                this.aM.QX();
                this.j3 = null;
                this.nw = null;
                this.SI = null;
                KD(j70Var);
            }
        } catch (b unused) {
            close();
        } catch (IOException e) {
            close();
            throw new j50(e.getMessage(), e);
        } catch (RuntimeException e2) {
            close();
            throw new j50(e2.getMessage(), e2);
        }
    }

    @Override // abcd.yc0
    public boolean v5() {
        return false;
    }
}
