package abcd;

import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class mb0 {
    private static volatile mb0 QX;
    private static final Random Ws = new Random();
    private static volatile int XL;
    private final int DW;
    private final int EQ;
    private final AtomicLong FH;
    private final AtomicReferenceArray<a> Hw;
    private final AtomicInteger J0;
    private final AtomicLong J8;
    private final int VH;
    private final ReentrantLock Zo;
    private final int gn;
    private final ReferenceQueue<fa0> j6;
    private final boolean tp;
    private final long u7;
    private final b[] v5;
    private final int we;

    private static class a {
        final c DW;
        volatile boolean FH;
        final a j6;

        public a(a aVar, c cVar) {
            this.j6 = aVar;
            this.DW = cVar;
        }

        public final void j6() {
            this.FH = true;
            this.DW.enqueue();
        }
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(b bVar) {
            this();
        }
    }

    private static class c extends SoftReference<fa0> {
        final long DW;
        final int FH;
        long Hw;
        final wa0 j6;
        private boolean v5;

        public c(wa0 wa0Var, long j, fa0 fa0Var, ReferenceQueue<fa0> referenceQueue) {
            super(fa0Var, referenceQueue);
            this.j6 = wa0Var;
            this.DW = j;
            this.FH = fa0Var.Zo();
        }

        public final synchronized boolean j6() {
            if (this.v5) {
                return false;
            }
            this.v5 = true;
            return true;
        }
    }

    static {
        aM(new nb0());
    }

    private mb0(nb0 nb0Var) {
        this.DW = lg(nb0Var);
        int iQX = QX(nb0Var);
        if (this.DW < 1) {
            throw new IllegalArgumentException(JGitText.DW().tSizeMustBeGreaterOrEqual1);
        }
        if (iQX < 1) {
            throw new IllegalArgumentException(JGitText.DW().lockCountMustBeGreaterOrEqual1);
        }
        this.j6 = new ReferenceQueue<>();
        this.FH = new AtomicLong(1L);
        this.Hw = new AtomicReferenceArray<>(this.DW);
        this.v5 = new b[iQX];
        int i = 0;
        while (true) {
            b[] bVarArr = this.v5;
            if (i >= bVarArr.length) {
                break;
            }
            bVarArr[i] = new b(null);
            i++;
        }
        this.Zo = new ReentrantLock();
        double d = this.DW;
        Double.isNaN(d);
        int i2 = (int) (d * 0.1d);
        if (64 < i2) {
            i2 = 64;
        } else if (i2 < 4) {
            i2 = 4;
        }
        int i3 = this.DW;
        this.VH = i3 < i2 ? i3 : i2;
        this.gn = nb0Var.FH();
        this.u7 = nb0Var.DW();
        this.tp = nb0Var.Zo();
        int iJ6 = j6(nb0Var.Hw());
        this.EQ = iJ6;
        this.we = 1 << iJ6;
        this.J0 = new AtomicInteger();
        this.J8 = new AtomicLong();
        if (this.gn < 1) {
            throw new IllegalArgumentException(JGitText.DW().openFilesMustBeAtLeast1);
        }
        if (this.u7 < this.we) {
            throw new IllegalArgumentException(JGitText.DW().windowSizeMustBeLesserThanLimit);
        }
    }

    private static a DW(a aVar) {
        while (aVar != null && aVar.FH) {
            aVar.DW.enqueue();
            aVar = aVar.j6;
        }
        if (aVar == null) {
            return null;
        }
        a aVarDW = DW(aVar.j6);
        return aVarDW == aVar.j6 ? aVar : new a(aVarDW, aVar.DW);
    }

    private int EQ(int i, long j) {
        return i + ((int) (j >>> this.EQ));
    }

    private void FH(c cVar) {
        this.J8.addAndGet(-cVar.FH);
        Hw(cVar.j6);
    }

    private void Hw(wa0 wa0Var) {
        if (wa0Var.j3()) {
            this.J0.decrementAndGet();
        }
    }

    private boolean J0() {
        return this.gn < this.J0.get() || this.u7 < this.J8.get();
    }

    private fa0 J8(wa0 wa0Var, long j) throws IOException {
        if (wa0Var.Hw()) {
            this.J0.incrementAndGet();
        }
        try {
            return this.tp ? wa0Var.vJ(j, this.we) : wa0Var.I(j, this.we);
        } catch (IOException e) {
            Hw(wa0Var);
            throw e;
        } catch (Error e2) {
            Hw(wa0Var);
            throw e2;
        } catch (RuntimeException e3) {
            Hw(wa0Var);
            throw e3;
        }
    }

    private void Mr(wa0 wa0Var) {
        for (int i = 0; i < this.DW; i++) {
            a aVar = this.Hw.get(i);
            boolean z = false;
            for (a aVar2 = aVar; aVar2 != null; aVar2 = aVar2.j6) {
                if (aVar2.DW.j6 == wa0Var) {
                    aVar2.j6();
                } else {
                    if (aVar2.FH) {
                    }
                }
                z = true;
            }
            if (z) {
                this.Hw.compareAndSet(i, aVar, DW(aVar));
            }
        }
        VH();
    }

    private static int QX(nb0 nb0Var) {
        return Math.max(nb0Var.FH(), 32);
    }

    private fa0 U2(a aVar, wa0 wa0Var, long j) {
        while (aVar != null) {
            c cVar = aVar.DW;
            if (cVar.j6 == wa0Var && cVar.DW == j) {
                fa0 fa0Var = cVar.get();
                if (fa0Var != null) {
                    we(cVar);
                    return fa0Var;
                }
                aVar.j6();
                return null;
            }
            aVar = aVar.j6;
        }
        return null;
    }

    private void VH() {
        while (true) {
            c cVar = (c) this.j6.poll();
            if (cVar == null) {
                return;
            }
            if (cVar.j6()) {
                FH(cVar);
                boolean z = false;
                int iA8 = a8(cVar.j6, cVar.DW);
                a aVar = this.Hw.get(iA8);
                a aVar2 = aVar;
                while (true) {
                    if (aVar2 == null) {
                        break;
                    }
                    if (aVar2.DW == cVar) {
                        aVar2.FH = true;
                        z = true;
                        break;
                    }
                    aVar2 = aVar2.j6;
                }
                if (z) {
                    this.Hw.compareAndSet(iA8, aVar, DW(aVar));
                }
            }
        }
    }

    private b Ws(wa0 wa0Var, long j) {
        return this.v5[(EQ(wa0Var.fY, j) >>> 1) % this.v5.length];
    }

    public static final void XL(wa0 wa0Var) {
        QX.Mr(wa0Var);
    }

    private void Zo() {
        while (J0()) {
            int iNextInt = Ws.nextInt(this.DW);
            a aVar = null;
            int i = this.VH - 1;
            int i2 = 0;
            while (i >= 0) {
                if (this.DW <= iNextInt) {
                    iNextInt = 0;
                }
                for (a aVar2 = this.Hw.get(iNextInt); aVar2 != null; aVar2 = aVar2.j6) {
                    if (!aVar2.FH && (aVar == null || aVar2.DW.Hw < aVar.DW.Hw)) {
                        i2 = iNextInt;
                        aVar = aVar2;
                    }
                }
                i--;
                iNextInt++;
            }
            if (aVar != null) {
                aVar.j6();
                VH();
                a aVar3 = this.Hw.get(i2);
                this.Hw.compareAndSet(i2, aVar3, DW(aVar3));
            }
        }
    }

    private int a8(wa0 wa0Var, long j) {
        return (EQ(wa0Var.fY, j) >>> 1) % this.DW;
    }

    public static void aM(nb0 nb0Var) {
        mb0 mb0Var = new mb0(nb0Var);
        mb0 mb0Var2 = QX;
        if (mb0Var2 != null) {
            mb0Var2.j3();
        }
        QX = mb0Var;
        XL = nb0Var.v5();
        ha0.Zo(nb0Var);
    }

    public static final fa0 gn(wa0 wa0Var, long j) {
        mb0 mb0Var = QX;
        fa0 fa0VarU7 = mb0Var.u7(wa0Var, mb0Var.rN(j));
        if (mb0Var != QX) {
            mb0Var.j3();
        }
        return fa0VarU7;
    }

    private void j3() {
        a aVar;
        for (int i = 0; i < this.DW; i++) {
            do {
                aVar = this.Hw.get(i);
                for (a aVar2 = aVar; aVar2 != null; aVar2 = aVar2.j6) {
                    aVar2.j6();
                }
            } while (!this.Hw.compareAndSet(i, aVar, null));
        }
        VH();
    }

    private static final int j6(int i) {
        if (i < 4096) {
            throw new IllegalArgumentException(JGitText.DW().invalidWindowSize);
        }
        if (Integer.bitCount(i) == 1) {
            return Integer.numberOfTrailingZeros(i);
        }
        throw new IllegalArgumentException(JGitText.DW().windowSizeMustBePowerOf2);
    }

    private static int lg(nb0 nb0Var) {
        int iHw = nb0Var.Hw();
        long jDW = nb0Var.DW();
        if (iHw <= 0) {
            throw new IllegalArgumentException(JGitText.DW().invalidWindowSize);
        }
        long j = iHw;
        if (jDW >= j) {
            return (int) Math.min(((jDW / j) * 5) / 2, 2000000000L);
        }
        throw new IllegalArgumentException(JGitText.DW().windowSizeMustBeLesserThanLimit);
    }

    private long rN(long j) {
        int i = this.EQ;
        return (j >>> i) << i;
    }

    public static int tp() {
        return XL;
    }

    private fa0 u7(wa0 wa0Var, long j) {
        fa0 fa0VarU2;
        int iA8 = a8(wa0Var, j);
        a aVar = this.Hw.get(iA8);
        fa0 fa0VarU22 = U2(aVar, wa0Var, j);
        if (fa0VarU22 != null) {
            return fa0VarU22;
        }
        synchronized (Ws(wa0Var, j)) {
            a aVar2 = this.Hw.get(iA8);
            if (aVar2 != aVar && (fa0VarU2 = U2(aVar2, wa0Var, j)) != null) {
                return fa0VarU2;
            }
            fa0 fa0VarJ8 = J8(wa0Var, j);
            c cVarV5 = v5(wa0Var, j, fa0VarJ8);
            we(cVarV5);
            while (!this.Hw.compareAndSet(iA8, aVar2, new a(DW(aVar2), cVarV5))) {
                aVar2 = this.Hw.get(iA8);
            }
            if (this.Zo.tryLock()) {
                try {
                    VH();
                    Zo();
                } finally {
                    this.Zo.unlock();
                }
            }
            return fa0VarJ8;
        }
    }

    private c v5(wa0 wa0Var, long j, fa0 fa0Var) {
        c cVar = new c(wa0Var, j, fa0Var, this.j6);
        this.J8.addAndGet(cVar.FH);
        return cVar;
    }

    private void we(c cVar) {
        long j = this.FH.get();
        this.FH.compareAndSet(j, 1 + j);
        cVar.Hw = j;
    }
}
