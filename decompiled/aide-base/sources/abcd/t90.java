package abcd;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class t90 implements Iterable<k90> {
    final ArrayList<k90> AL;
    final p70 WB;
    private sf0 Z1;
    private final EnumSet<q90> cT;
    b70<o90> fY;
    d90 hK;
    final w60 jw;
    private int k2;
    final g70 mb;
    private boolean n5;
    private ba0 q7;
    private int qp;
    r80 w9;
    int zh;

    class a implements s80 {
        private final /* synthetic */ Iterator j6;

        public a(t90 t90Var, Iterator it) {
            this.j6 = it;
        }

        @Override // abcd.m60
        public void j6() {
        }

        @Override // abcd.s80
        public o90 next() {
            if (this.j6.hasNext()) {
                return (o90) this.j6.next();
            }
            return null;
        }
    }

    class b implements s80 {
        private final /* synthetic */ Iterator DW;
        private final /* synthetic */ k60 FH;

        public b(Iterator it, k60 k60Var) {
            this.DW = it;
            this.FH = k60Var;
        }

        @Override // abcd.m60
        public void j6() {
            this.FH.j6();
        }

        @Override // abcd.s80
        public o90 next() {
            if (this.DW.hasNext()) {
                return (o90) this.DW.next();
            }
            if (!this.FH.next()) {
                return null;
            }
            a70 a70VarDW = this.FH.DW();
            f70 f70VarFH = this.FH.FH();
            o90 o90Var = (o90) t90.this.fY.Ws(a70VarDW);
            if (o90Var == null) {
                return t90.this.Qq(a70VarDW, f70VarFH);
            }
            if (o90Var instanceof k90) {
                ((k90) o90Var).FN(t90.this, f70VarFH.Hw());
                return o90Var;
            }
            if (!(o90Var instanceof r90)) {
                o90Var.cT |= 1;
                return o90Var;
            }
            ((r90) o90Var).XX(t90.this, f70VarFH.Hw());
            return o90Var;
        }
    }

    class c implements Iterator<k90> {
        k90 WB;

        public c(k90 k90Var) {
            this.WB = k90Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.WB != null;
        }

        @Override // java.util.Iterator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public k90 next() {
            try {
                k90 k90Var = this.WB;
                this.WB = t90.this.g3();
                return k90Var;
            } catch (j40 e) {
                throw new b50(e);
            } catch (q40 e2) {
                throw new b50(e2);
            } catch (IOException e3) {
                throw new b50(e3);
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public t90(p70 p70Var) {
        this(p70Var, p70Var.yS());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o90 Qq(j60 j60Var, f70 f70Var) {
        o90 o90Var;
        int iVH = f70Var.VH();
        if (iVH == 1) {
            k90 k90VarWs = Ws(j60Var);
            k90VarWs.FN(this, a8(k90VarWs, f70Var));
            o90Var = k90VarWs;
        } else if (iVH == 2) {
            o90 s90Var = new s90(j60Var);
            s90Var.cT |= 1;
            o90Var = s90Var;
        } else if (iVH == 3) {
            o90 j90Var = new j90(j60Var);
            j90Var.cT |= 1;
            o90Var = j90Var;
        } else {
            if (iVH != 4) {
                throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().badObjectType, Integer.valueOf(iVH)));
            }
            r90 r90Var = new r90(j60Var);
            r90Var.XX(this, a8(r90Var, f70Var));
            o90Var = r90Var;
        }
        this.fY.v5(o90Var);
        return o90Var;
    }

    private void aM() {
        int i = this.k2;
        if (i != 0) {
            this.qp |= i;
            this.zh = (i ^ (-1)) & this.zh;
            this.k2 = 0;
        }
    }

    private boolean ei() {
        return this.hK instanceof w90;
    }

    public g90 CU() {
        g90 g90Var = new g90(this.mb);
        g90Var.fY = this.fY;
        g90Var.qp = this.qp;
        return g90Var;
    }

    public void EQ(m90 m90Var) {
        int i = this.qp;
        int i2 = m90Var.FH;
        if ((i & i2) != 0) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().flagIsDisposed, m90Var.DW));
        }
        if (m90Var.j6 != this) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().flagNotFromThis, m90Var.DW));
        }
        this.zh |= i2;
    }

    public o90 I(j60 j60Var) {
        o90 o90Var = (o90) this.fY.Ws(j60Var);
        if (o90Var == null) {
            return Qq(j60Var, this.mb.Ws(j60Var));
        }
        x9(o90Var);
        return o90Var;
    }

    public void J8(k90 k90Var) {
        int i = k90Var.cT & this.zh;
        if (i != 0) {
            k90.XX(k90Var, i);
        }
    }

    public j90 KD(j60 j60Var) {
        j90 j90Var = (j90) this.fY.Ws(j60Var);
        if (j90Var != null) {
            return j90Var;
        }
        j90 j90Var2 = new j90(j60Var);
        this.fY.v5(j90Var2);
        return j90Var2;
    }

    public byte[] Mr(o90 o90Var) {
        return a8(o90Var, this.mb.QX(o90Var, o90Var.aj()));
    }

    public <T extends a70> s80 Mz(Iterable<T> iterable, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : iterable) {
            o90 o90Var = (o90) this.fY.Ws(t);
            if (o90Var == null || (o90Var.cT & 1) == 0) {
                arrayList.add(t);
            } else {
                arrayList2.add(o90Var);
            }
        }
        Iterator it = arrayList2.iterator();
        return arrayList.isEmpty() ? new a(this, it) : new b(it, this.mb.J8(arrayList, z));
    }

    public final void OW() {
        br(0);
    }

    public boolean P8(k90 k90Var, k90 k90Var2) {
        ba0 ba0Var = this.q7;
        sf0 sf0Var = this.Z1;
        try {
            aM();
            br((this.qp ^ (-1)) & (-64));
            this.q7 = ba0.DW;
            this.Z1 = sf0.j6;
            ef(k90Var2);
            ef(k90Var);
            return g3() == k90Var;
        } finally {
            this.q7 = ba0Var;
            this.Z1 = sf0Var;
        }
    }

    public void QX() {
        this.mb.XL();
        this.qp = -64;
        this.k2 = 0;
        this.zh = 4;
        this.fY.clear();
        this.mb.XL();
        this.AL.clear();
        this.w9 = new w80();
        this.hK = new w90(this);
    }

    public o90 SI(j60 j60Var, int i) {
        o90 s90Var;
        o90 o90VarWs = (o90) this.fY.Ws(j60Var);
        if (o90VarWs == null) {
            if (i != 1) {
                if (i == 2) {
                    s90Var = new s90(j60Var);
                } else if (i == 3) {
                    s90Var = new j90(j60Var);
                } else {
                    if (i != 4) {
                        throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().invalidGitType, Integer.valueOf(i)));
                    }
                    s90Var = new r90(j60Var);
                }
                o90VarWs = s90Var;
            } else {
                o90VarWs = Ws(j60Var);
            }
            this.fY.v5(o90VarWs);
        }
        return o90VarWs;
    }

    public void Sf(k90 k90Var) {
        k90Var.cT |= 4;
        J8(k90Var);
        ef(k90Var);
    }

    public int VH() {
        int i = this.qp;
        if (i == 0) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().flagsAlreadyCreated, 26));
        }
        int iLowestOneBit = Integer.lowestOneBit(i);
        this.qp &= iLowestOneBit ^ (-1);
        return iLowestOneBit;
    }

    public k90 Ws(j60 j60Var) {
        return new k90(j60Var);
    }

    public void XG(ba0 ba0Var) {
        gn();
        if (ba0Var == null) {
            ba0Var = ba0.j6;
        }
        this.q7 = ba0Var;
    }

    public final void XX(n90 n90Var) {
        br(n90Var.WB);
    }

    public byte[] a8(o90 o90Var, f70 f70Var) {
        try {
            return f70Var.v5(5242880);
        } catch (n40 e) {
            e.FH(o90Var);
            throw e;
        }
    }

    public o90 aj(o90 o90Var) {
        while (o90Var instanceof r90) {
            x9(o90Var);
            o90Var = ((r90) o90Var).br();
        }
        x9(o90Var);
        return o90Var;
    }

    public void br(int i) {
        aM();
        int i2 = i | 1;
        int i3 = i2 ^ (-1);
        a90 a90Var = new a90();
        Iterator<k90> it = this.AL.iterator();
        while (it.hasNext()) {
            k90 next = it.next();
            int i4 = next.cT;
            if ((i4 & i3) != 0) {
                next.cT = i4 & i2;
                next.jO();
                a90Var.Hw(next);
            }
        }
        while (true) {
            k90 k90VarJ6 = a90Var.j6();
            if (k90VarJ6 == null) {
                this.AL.clear();
                this.w9 = new w80();
                this.hK = new w90(this);
                return;
            }
            k90[] k90VarArr = k90VarJ6.Z1;
            if (k90VarArr != null) {
                for (k90 k90Var : k90VarArr) {
                    int i5 = k90Var.cT;
                    if ((i5 & i3) != 0) {
                        k90Var.cT = i5 & i2;
                        k90Var.jO();
                        a90Var.Hw(k90Var);
                    }
                }
            }
        }
    }

    public k90 ca(j60 j60Var) throws j40 {
        o90 o90VarAj = aj(I(j60Var));
        if (o90VarAj instanceof k90) {
            return (k90) o90VarAj;
        }
        throw new j40(j60Var.cn(), "commit");
    }

    public o90 cb(j60 j60Var) {
        return (o90) this.fY.Ws(j60Var);
    }

    public s90 dx(j60 j60Var) {
        s90 s90Var = (s90) this.fY.Ws(j60Var);
        if (s90Var != null) {
            return s90Var;
        }
        s90 s90Var2 = new s90(j60Var);
        this.fY.v5(s90Var2);
        return s90Var2;
    }

    public void ef(k90 k90Var) {
        int i = k90Var.cT;
        if ((i & 2) != 0) {
            return;
        }
        if ((i & 1) == 0) {
            k90Var.OW(this);
        }
        k90Var.cT |= 2;
        this.AL.add(k90Var);
        this.w9.Hw(k90Var);
    }

    public ba0 er() {
        return this.q7;
    }

    public void et(q90 q90Var, boolean z) {
        gn();
        if (z) {
            this.cT.add(q90Var);
        } else {
            this.cT.remove(q90Var);
        }
        if (this.cT.size() > 1) {
            this.cT.remove(q90.NONE);
        } else if (this.cT.size() == 0) {
            this.cT.add(q90.NONE);
        }
    }

    public k90 g3() {
        return this.hK.j6();
    }

    public sf0 gW() {
        return this.Z1;
    }

    public void gn() {
        if (!ei()) {
            throw new IllegalStateException(JGitText.DW().outputHasAlreadyBeenStarted);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<k90> iterator() {
        try {
            return new c(g3());
        } catch (j40 e) {
            throw new b50(e);
        } catch (q40 e2) {
            throw new b50(e2);
        } catch (IOException e3) {
            throw new b50(e3);
        }
    }

    public void j3(int i) {
        if (!ei()) {
            this.k2 = i | this.k2;
            return;
        }
        this.qp |= i;
        this.zh = (i ^ (-1)) & this.zh;
    }

    public void jJ(sf0 sf0Var) {
        gn();
        if (sf0Var == null) {
            sf0Var = sf0.j6;
        }
        this.Z1 = sf0Var;
    }

    public final void kQ(m90... m90VarArr) {
        int i = 0;
        for (m90 m90Var : m90VarArr) {
            i |= m90Var.FH;
        }
        br(i);
    }

    public g70 lg() {
        return this.mb;
    }

    public void lp() {
        this.mb.XL();
    }

    public boolean nw() {
        return this.n5;
    }

    public k90 ro(j60 j60Var) {
        k90 k90Var = (k90) this.fY.Ws(j60Var);
        if (k90Var != null) {
            return k90Var;
        }
        k90 k90VarWs = Ws(j60Var);
        this.fY.v5(k90VarWs);
        return k90VarWs;
    }

    public void sG(Collection<k90> collection) {
        Iterator<k90> it = collection.iterator();
        while (it.hasNext()) {
            ef(it.next());
        }
    }

    public s90 sy(j60 j60Var) throws j40 {
        s90 s90VarEq;
        o90 o90VarAj = aj(I(j60Var));
        if (o90VarAj instanceof k90) {
            s90VarEq = ((k90) o90VarAj).Eq();
        } else {
            if (!(o90VarAj instanceof s90)) {
                throw new j40(j60Var.cn(), "tree");
            }
            s90VarEq = (s90) o90VarAj;
        }
        x9(s90VarEq);
        return s90VarEq;
    }

    public m90 vJ(String str) {
        return new m90(this, str, VH());
    }

    public boolean vy(q90 q90Var) {
        return this.cT.contains(q90Var);
    }

    public void wc(q90 q90Var) {
        gn();
        this.cT.clear();
        this.cT.add(q90Var);
    }

    public void x9(o90 o90Var) {
        if ((o90Var.cT & 1) == 0) {
            o90Var.OW(this);
        }
    }

    public void yO(boolean z) {
        this.n5 = z;
    }

    public t90(g70 g70Var) {
        this(null, g70Var);
    }

    private t90(p70 p70Var, g70 g70Var) {
        this.qp = -64;
        this.zh = 4;
        this.WB = p70Var;
        this.mb = g70Var;
        this.jw = new w60();
        this.fY = new b70<>();
        this.AL = new ArrayList<>();
        this.w9 = new w80();
        this.hK = new w90(this);
        this.cT = EnumSet.of(q90.NONE);
        this.q7 = ba0.j6;
        this.Z1 = sf0.j6;
        this.n5 = true;
    }
}
