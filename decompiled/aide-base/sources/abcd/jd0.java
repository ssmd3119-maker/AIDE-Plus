package abcd;

import abcd.b70;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class jd0 {
    private static /* synthetic */ int[] P8;
    private String BT;
    private int EQ;
    private boolean J0;
    private int Mr;
    private boolean QX;
    private int U2;
    private InputStream VH;
    private boolean Ws;
    private long XL;
    private b70<a> a8;
    private ld0[] aM;
    private uf0<ld0> er;
    private g70 gW;
    private d70<a70> j3;
    private final z60 j6;
    private d70<a70> lg;
    private gd0<f> rN;
    private int tp;
    private long u7;
    private long vy;
    private y60 we;
    private c DW = new c();
    private byte[] gn = new byte[8192];
    private byte[] FH = new byte[8192];
    private byte[] Hw = new byte[64];
    private final MessageDigest v5 = r60.Zo();
    private final w60 Zo = new w60();
    private MessageDigest yS = r60.Zo();
    private boolean J8 = true;

    private static class a extends b70.b {
        f cT;

        public a(j60 j60Var) {
            super(j60Var);
        }

        public f Qq() {
            f fVar = this.cT;
            if (fVar != null) {
                this.cT = null;
            }
            return fVar;
        }

        public void x9(f fVar) {
            fVar.FH = this.cT;
            this.cT = fVar;
        }
    }

    public static class d {
        public long DW;
        public int j6;
    }

    public enum e {
        INPUT,
        DATABASE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() {
            e[] eVarArrValuesCustom = values();
            int length = eVarArrValuesCustom.length;
            e[] eVarArr = new e[length];
            System.arraycopy(eVarArrValuesCustom, 0, eVarArr, 0, length);
            return eVarArr;
        }
    }

    public static class f {
        int DW;
        f FH;
        long j6;

        public void DW(int i) {
            this.DW = i;
        }

        public long j6() {
            return this.j6;
        }
    }

    public jd0(z60 z60Var, InputStream inputStream) {
        this.j6 = z60Var.Hw();
        this.VH = inputStream;
        this.gW = this.j6.Zo();
    }

    private boolean BT() {
        return this.j3 != null;
    }

    private void EQ() {
        this.VH = null;
    }

    private void Ev(j60 j60Var, int i, byte[] bArr) throws IOException {
        y60 y60Var = this.we;
        if (y60Var != null) {
            try {
                y60Var.j6(i, bArr);
            } catch (i40 e2) {
                throw new IOException(MessageFormat.format(JGitText.DW().invalidObject, r60.VH(i), j60Var.BT(), e2.getMessage()));
            }
        }
        if (gW()) {
            try {
                if (Arrays.equals(bArr, this.gW.QX(j60Var, i).v5(bArr.length))) {
                } else {
                    throw new IOException(MessageFormat.format(JGitText.DW().collisionOn, j60Var.BT()));
                }
            } catch (q40 unused) {
            }
        }
    }

    private f J0(ld0 ld0Var) {
        f fVar;
        f fVarYO = yO(lp(ld0Var));
        f fVarYO2 = yO(this.rN.Zo(ld0Var.Qq()));
        if (fVarYO == null) {
            return fVarYO2;
        }
        if (fVarYO2 == null) {
            return fVarYO;
        }
        f fVar2 = null;
        f fVar3 = null;
        while (true) {
            if (fVarYO == null && fVarYO2 == null) {
                return fVar2;
            }
            if (fVarYO2 == null || (fVarYO != null && fVarYO.j6 < fVarYO2.j6)) {
                fVar = fVarYO2;
                fVarYO2 = fVarYO;
                fVarYO = fVarYO.FH;
            } else {
                fVar = fVarYO2.FH;
            }
            if (fVar3 != null) {
                fVar3.FH = fVarYO2;
            } else {
                fVar2 = fVarYO2;
            }
            fVarYO2.FH = null;
            fVar3 = fVarYO2;
            fVarYO2 = fVar;
        }
    }

    private void Mr(int i) {
        ld0[] ld0VarArr = new ld0[((int) this.XL) + i];
        System.arraycopy(this.aM, 0, ld0VarArr, 0, this.U2);
        this.aM = ld0VarArr;
    }

    private void OW(j70 j70Var) throws IOException {
        int i = this.U2;
        for (int i2 = 0; i2 < i; i2++) {
            XX(this.aM[i2], j70Var);
            if (j70Var.isCancelled()) {
                throw new IOException(JGitText.DW().downloadCancelledDuringIndexing);
            }
        }
    }

    private void U2() throws IOException {
        long jJO = jO();
        int iX9 = x9(e.INPUT);
        this.Hw[0] = (byte) iX9;
        int i = (iX9 >> 4) & 7;
        long j = iX9 & 15;
        int i2 = 4;
        int i3 = 1;
        while ((iX9 & 128) != 0) {
            iX9 = x9(e.INPUT);
            this.Hw[i3] = (byte) iX9;
            j += (iX9 & 127) << i2;
            i2 += 7;
            i3++;
        }
        u7(i, j);
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            long j2 = j;
            SI(jJO, i, j2);
            dx(e.INPUT, this.Hw, 0, i3);
            ye(jJO, i, j2);
            return;
        }
        if (i != 6) {
            if (i != 7) {
                throw new IOException(MessageFormat.format(JGitText.DW().unknownObjectType, Integer.valueOf(i)));
            }
            int iWe = we(e.INPUT, 20);
            a70 a70VarEf = a70.ef(this.gn, iWe);
            System.arraycopy(this.gn, iWe, this.Hw, i3, 20);
            int i4 = i3 + 20;
            ko(20);
            a aVar = (a) this.a8.Ws(a70VarEf);
            if (aVar == null) {
                aVar = new a(a70VarEf);
                this.a8.v5(aVar);
            }
            a aVar2 = aVar;
            nw(jJO, a70VarEf, j);
            dx(e.INPUT, this.Hw, 0, i4);
            rN(e.INPUT, j);
            f fVarKD = KD();
            fVarKD.j6 = jJO;
            aVar2.x9(fVarKD);
            this.Mr++;
            return;
        }
        int iX92 = x9(e.INPUT);
        int i5 = i3 + 1;
        this.Hw[i3] = (byte) iX92;
        long j3 = iX92 & 127;
        while (true) {
            int i6 = i5;
            if ((iX92 & 128) == 0) {
                long j4 = jJO - j3;
                ei(jJO, j4, j);
                dx(e.INPUT, this.Hw, 0, i6);
                rN(e.INPUT, j);
                f fVarKD2 = KD();
                fVarKD2.j6 = jJO;
                fVarKD2.FH = this.rN.v5(j4, fVarKD2);
                this.Mr++;
                return;
            }
            iX92 = x9(e.INPUT);
            i5 = i6 + 1;
            this.Hw[i6] = (byte) iX92;
            j3 = ((j3 + 1) << 7) + (iX92 & 127);
        }
    }

    private void XX(ld0 ld0Var, j70 j70Var) throws IOException {
        f fVarJ0 = J0(ld0Var);
        if (fVarJ0 == null) {
            return;
        }
        b bVar = new b();
        bVar.v5 = fVarJ0;
        d dVar = new d();
        g3(ld0Var, dVar);
        int i = dVar.j6;
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IOException(MessageFormat.format(JGitText.DW().unknownObjectType, Integer.valueOf(dVar.j6)));
        }
        bVar.FH = lg(e.DATABASE, dVar.DW);
        bVar.DW = ld0Var;
        if (!gn(ld0Var.x9())) {
            throw new IOException(MessageFormat.format(JGitText.DW().corruptionDetectedReReadingAt, Long.valueOf(ld0Var.Qq())));
        }
        br(bVar.j6(), dVar.j6, dVar, j70Var);
    }

    private void Zo(ld0 ld0Var) {
        ld0[] ld0VarArr = this.aM;
        int i = this.U2;
        this.U2 = i + 1;
        ld0VarArr[i] = ld0Var;
        if (BT()) {
            this.j3.Hw(ld0Var);
        }
    }

    private InputStream a8(e eVar, long j) {
        this.DW.j6(eVar, j);
        return this.DW;
    }

    private void aj() throws IOException {
        int length = r60.v5.length + 4 + 4;
        int iWe = we(e.INPUT, length);
        int i = 0;
        while (true) {
            byte[] bArr = r60.v5;
            if (i >= bArr.length) {
                long jHw = ig0.Hw(this.gn, iWe + 4);
                if (jHw != 2 && jHw != 3) {
                    throw new IOException(MessageFormat.format(JGitText.DW().unsupportedPackVersion, Long.valueOf(jHw)));
                }
                this.XL = ig0.Hw(this.gn, iWe + 8);
                ko(length);
                ef(this.XL);
                return;
            }
            if (this.gn[iWe + i] != bArr[i]) {
                throw new IOException(JGitText.DW().notAPACKFile);
            }
            i++;
        }
    }

    private void br(b bVar, int i, d dVar, j70 j70Var) throws IOException {
        do {
            j70Var.v5(1);
            vJ(bVar.j6, dVar);
            int i2 = dVar.j6;
            if (i2 != 6 && i2 != 7) {
                throw new IOException(MessageFormat.format(JGitText.DW().unknownObjectType, Integer.valueOf(dVar.j6)));
            }
            byte[] bArrLg = lg(e.DATABASE, dVar.DW);
            u7(i, rb0.FH(bArrLg));
            bVar.FH = rb0.j6(bVar.Hw.FH, bArrLg);
            if (!gn(bVar.j6.DW)) {
                throw new IOException(MessageFormat.format(JGitText.DW().corruptionDetectedReReadingAt, Long.valueOf(bVar.j6.j6)));
            }
            this.v5.update(r60.v5(i));
            this.v5.update((byte) 32);
            this.v5.update(r60.FH(bVar.FH.length));
            this.v5.update((byte) 0);
            this.v5.update(bVar.FH);
            this.Zo.sG(this.v5.digest(), 0);
            Ev(this.Zo, i, bVar.FH);
            ld0 ld0VarVy = vy(this.Zo, bVar.j6, bVar.Hw.DW);
            ld0VarVy.aj(bVar.j6.j6);
            sh(ld0VarVy, i, bVar.FH);
            Zo(ld0VarVy);
            bVar.DW = ld0VarVy;
            bVar.v5 = J0(ld0VarVy);
            bVar = bVar.j6();
        } while (bVar != null);
    }

    private d g3(ld0 ld0Var, d dVar) {
        this.tp = 0;
        this.EQ = 0;
        jJ(ld0Var, dVar);
        return dVar;
    }

    public static /* synthetic */ int[] j6() {
        int[] iArr = P8;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[e.valuesCustom().length];
        try {
            iArr2[e.DATABASE.ordinal()] = 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[e.INPUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        P8 = iArr2;
        return iArr2;
    }

    private long jO() {
        return this.u7 + this.tp;
    }

    private void kQ(j70 j70Var) throws IOException {
        Mr(this.a8.size());
        if (this.Ws) {
            this.lg = new d70<>();
        }
        ArrayList<a> arrayList = new ArrayList(64);
        Iterator<V> it = this.a8.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.cT != null) {
                if (this.Ws) {
                    this.lg.Hw(aVar);
                }
                try {
                    f70 f70VarWs = this.gW.Ws(aVar);
                    b bVar = new b();
                    bVar.FH = f70VarWs.v5(Integer.MAX_VALUE);
                    bVar.DW = aVar;
                    int iVH = f70VarWs.VH();
                    ld0 ld0VarVy = vy(aVar, null, null);
                    if (P8(iVH, bVar.FH, ld0VarVy)) {
                        ld0[] ld0VarArr = this.aM;
                        int i = this.U2;
                        this.U2 = i + 1;
                        ld0VarArr[i] = ld0VarVy;
                    }
                    bVar.v5 = J0(ld0VarVy);
                    br(bVar.j6(), iVH, new d(), j70Var);
                    if (j70Var.isCancelled()) {
                        throw new IOException(JGitText.DW().downloadCancelledDuringIndexing);
                    }
                } catch (q40 unused) {
                    arrayList.add(aVar);
                }
            }
        }
        for (a aVar2 : arrayList) {
            if (aVar2.cT != null) {
                throw new q40(aVar2, "delta base");
            }
        }
        ro();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ko(int i) {
        this.tp += i;
        this.EQ -= i;
    }

    private byte[] lg(e eVar, long j) throws IOException {
        int i = (int) j;
        byte[] bArr = new byte[i];
        InputStream inputStreamA8 = a8(eVar, j);
        eg0.DW(inputStreamA8, bArr, 0, i);
        inputStreamA8.close();
        return bArr;
    }

    private f lp(j60 j60Var) {
        a aVar = (a) this.a8.Ws(j60Var);
        if (aVar != null) {
            return aVar.Qq();
        }
        return null;
    }

    private void oY() {
        this.yS.update(this.gn, 0, this.tp);
        Sf(this.gn, 0, this.tp);
        int i = this.EQ;
        if (i > 0) {
            byte[] bArr = this.gn;
            System.arraycopy(bArr, this.tp, bArr, 0, i);
        }
        this.u7 += this.tp;
        this.tp = 0;
    }

    private void rN(e eVar, long j) throws IOException {
        InputStream inputStreamA8 = a8(eVar, j);
        eg0.VH(inputStreamA8, j);
        inputStreamA8.close();
    }

    private void sy() throws i40 {
        int i;
        oY();
        byte[] bArrDigest = this.yS.digest();
        byte[] bArr = new byte[20];
        System.arraycopy(this.gn, we(e.INPUT, 20), bArr, 0, 20);
        ko(20);
        if (this.EQ != 0) {
            throw new i40(MessageFormat.format(JGitText.DW().expectedEOFReceived, "\\x" + Integer.toHexString(this.gn[this.tp] & 255)));
        }
        if (!yS() || (i = this.VH.read()) < 0) {
            if (!Arrays.equals(bArrDigest, bArr)) {
                throw new i40(JGitText.DW().corruptObjectPackfileChecksumIncorrect);
            }
            sG(bArr);
        } else {
            throw new i40(MessageFormat.format(JGitText.DW().expectedEOFReceived, "\\x" + Integer.toHexString(i)));
        }
    }

    private void tp() throws IOException {
        byte[] bArrVH = VH();
        byte[] bArr = new byte[bArrVH.length];
        d dVar = new d();
        Iterator<ld0> it = this.er.iterator();
        while (it.hasNext()) {
            ld0 next = it.next();
            g3(next, dVar);
            int i = dVar.j6;
            if (i != 3) {
                throw new IOException(MessageFormat.format(JGitText.DW().unknownObjectType, Integer.valueOf(dVar.j6)));
            }
            h70 h70VarU7 = this.gW.QX(next, i).u7();
            try {
                long j = dVar.DW;
                if (h70VarU7.j6() != j) {
                    throw new IOException(MessageFormat.format(JGitText.DW().collisionOn, next.BT()));
                }
                InputStream inputStreamA8 = a8(e.DATABASE, j);
                while (0 < j) {
                    int iMin = (int) Math.min(bArrVH.length, j);
                    eg0.DW(h70VarU7, bArr, 0, iMin);
                    eg0.DW(inputStreamA8, bArrVH, 0, iMin);
                    for (int i2 = 0; i2 < iMin; i2++) {
                        if (bArr[i2] != bArrVH[i2]) {
                            throw new IOException(MessageFormat.format(JGitText.DW().collisionOn, next.BT()));
                        }
                    }
                    j -= iMin;
                }
                inputStreamA8.close();
            } finally {
                h70VarU7.close();
            }
        }
    }

    private final void u7(int i, long j) throws IOException {
        long j2 = this.vy;
        if (0 >= j2 || j2 >= j) {
            return;
        }
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            throw new f50(j, this.vy);
        }
        if (i != 6 && i != 7) {
            throw new IOException(MessageFormat.format(JGitText.DW().unknownObjectType, Integer.valueOf(i)));
        }
        throw new f50(this.vy);
    }

    private d vJ(f fVar, d dVar) {
        this.tp = 0;
        this.EQ = 0;
        XG(fVar, dVar);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int we(e eVar, int i) throws IOException {
        while (true) {
            int i2 = this.EQ;
            if (i2 >= i) {
                return this.tp;
            }
            int iCa = this.tp + i2;
            int length = this.gn.length - iCa;
            if (i2 + length < i) {
                int i3 = j6()[eVar.ordinal()];
                if (i3 == 1) {
                    oY();
                } else if (i3 == 2) {
                    int i4 = this.EQ;
                    if (i4 > 0) {
                        byte[] bArr = this.gn;
                        System.arraycopy(bArr, this.tp, bArr, 0, i4);
                    }
                    this.tp = 0;
                }
                iCa = this.EQ;
                length = this.gn.length - iCa;
            }
            int i5 = j6()[eVar.ordinal()];
            if (i5 == 1) {
                iCa = this.VH.read(this.gn, iCa, length);
            } else if (i5 == 2) {
                iCa = ca(this.gn, iCa, length);
            }
            if (iCa <= 0) {
                throw new EOFException(JGitText.DW().packfileIsTruncated);
            }
            this.EQ += iCa;
        }
    }

    private int x9(e eVar) throws IOException {
        if (this.EQ == 0) {
            we(eVar, 1);
        }
        this.EQ--;
        byte[] bArr = this.gn;
        int i = this.tp;
        this.tp = i + 1;
        return bArr[i] & 255;
    }

    private static f yO(f fVar) {
        f fVar2 = null;
        while (fVar != null) {
            f fVar3 = fVar.FH;
            fVar.FH = fVar2;
            fVar2 = fVar;
            fVar = fVar3;
        }
        return fVar2;
    }

    private void ye(long j, int i, long j2) throws IOException {
        byte[] bArrLg;
        int i2;
        this.v5.update(r60.v5(i));
        this.v5.update((byte) 32);
        this.v5.update(r60.FH(j2));
        boolean z = false;
        this.v5.update((byte) 0);
        if (i == 3) {
            byte[] bArrVH = VH();
            InputStream inputStreamA8 = a8(e.INPUT, j2);
            long j3 = 0;
            while (j3 < j2 && (i2 = inputStreamA8.read(bArrVH)) > 0) {
                this.v5.update(bArrVH, 0, i2);
                j3 += i2;
            }
            inputStreamA8.close();
            this.Zo.sG(this.v5.digest(), 0);
            if (gW() && this.gW.EQ(this.Zo)) {
                z = true;
            }
            bArrLg = null;
        } else {
            bArrLg = lg(e.INPUT, j2);
            this.v5.update(bArrLg);
            this.Zo.sG(this.v5.digest(), 0);
            Ev(this.Zo, i, bArrLg);
        }
        ld0 ld0VarVy = vy(this.Zo, null, null);
        ld0VarVy.aj(j);
        cn(ld0VarVy);
        if (bArrLg != null) {
            sh(ld0VarVy, i, bArrLg);
        }
        Zo(ld0VarVy);
        if (z) {
            this.er.add(ld0VarVy);
        }
    }

    public void CU(String str) {
        this.BT = str;
    }

    public void Eq(boolean z) {
        this.Ws = z;
    }

    public void FN(boolean z) {
        aq(z ? new y60() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public eb0 I(j70 j70Var, j70 j70Var2) {
        if (j70Var == null) {
            j70Var = x60.j6;
        }
        if (j70Var2 == null) {
            j70Var2 = x60.j6;
        }
        if (j70Var == j70Var2) {
            j70Var.DW(2);
        }
        try {
            aj();
            this.aM = new ld0[(int) this.XL];
            this.a8 = new b70<>();
            this.rN = new gd0<>();
            this.er = new uf0<>();
            j70Var.j6(JGitText.DW().receivingObjects, (int) this.XL);
            for (int i = 0; i < this.XL; i++) {
                try {
                    U2();
                    j70Var.v5(1);
                    if (j70Var.isCancelled()) {
                        throw new IOException(JGitText.DW().downloadCancelled);
                    }
                } finally {
                    j70Var.FH();
                }
            }
            sy();
            EQ();
            j70Var.FH();
            if (!this.er.isEmpty()) {
                tp();
            }
            if (this.Mr > 0) {
                if (j70Var2 instanceof o60) {
                    ((o60) j70Var2).tp(1000L, TimeUnit.MILLISECONDS);
                }
                j70Var2.j6(JGitText.DW().resolvingDeltas, this.Mr);
                OW(j70Var2);
                if (this.U2 < this.XL) {
                    if (!er()) {
                        throw new IOException(MessageFormat.format(JGitText.DW().packHasUnresolvedDeltas, Long.valueOf(this.XL - this.U2)));
                    }
                    kQ(j70Var2);
                    if (this.U2 < this.XL) {
                        throw new IOException(MessageFormat.format(JGitText.DW().packHasUnresolvedDeltas, Long.valueOf(this.XL - this.U2)));
                    }
                }
            }
            this.yS = null;
            this.a8 = null;
            this.rN = null;
            try {
                if (this.gW != null) {
                    this.gW.XL();
                }
                try {
                    this.DW.DW();
                    return null;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                if (this.gW != null) {
                    this.gW.XL();
                }
                try {
                    this.DW.DW();
                    throw th;
                } finally {
                }
            } finally {
            }
        }
    }

    public d70<a70> J8() {
        d70<a70> d70Var = this.lg;
        return d70Var != null ? d70Var : new d70<>();
    }

    public abstract f KD();

    public final eb0 Mz(j70 j70Var) {
        return I(j70Var, j70Var);
    }

    public abstract boolean P8(int i, byte[] bArr, ld0 ld0Var);

    public d70<a70> QX() {
        d70<a70> d70Var = this.j3;
        return d70Var != null ? d70Var : new d70<>();
    }

    public d Qq(d dVar) throws IOException {
        int iX9 = x9(e.DATABASE);
        this.Hw[0] = (byte) iX9;
        dVar.j6 = (iX9 >> 4) & 7;
        long j = iX9 & 15;
        int i = 1;
        int i2 = 4;
        while ((iX9 & 128) != 0) {
            iX9 = x9(e.DATABASE);
            this.Hw[i] = (byte) iX9;
            j += (iX9 & 127) << i2;
            i2 += 7;
            i++;
        }
        dVar.DW = j;
        int i3 = dVar.j6;
        if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
            dx(e.DATABASE, this.Hw, 0, i);
        } else if (i3 == 6) {
            int iX92 = x9(e.DATABASE);
            int i4 = i + 1;
            this.Hw[i] = (byte) iX92;
            while ((iX92 & 128) != 0) {
                iX92 = x9(e.DATABASE);
                this.Hw[i4] = (byte) iX92;
                i4++;
            }
            dx(e.DATABASE, this.Hw, 0, i4);
        } else {
            if (i3 != 7) {
                throw new IOException(MessageFormat.format(JGitText.DW().unknownObjectType, Integer.valueOf(dVar.j6)));
            }
            System.arraycopy(this.gn, we(e.DATABASE, 20), this.Hw, i, 20);
            ko(20);
            dx(e.DATABASE, this.Hw, 0, i + 20);
        }
        return dVar;
    }

    public abstract void SI(long j, int i, long j2);

    public abstract void Sf(byte[] bArr, int i, int i2);

    public byte[] VH() {
        return this.FH;
    }

    public String Ws() {
        return this.BT;
    }

    public abstract d XG(f fVar, d dVar);

    public ld0 XL(int i) {
        return this.aM[i];
    }

    public void Xa(long j) {
        this.vy = j;
    }

    public int aM() {
        return this.U2;
    }

    public void aq(y60 y60Var) {
        this.we = y60Var;
    }

    public abstract int ca(byte[] bArr, int i, int i2);

    public abstract void cb(e eVar, byte[] bArr, int i, int i2);

    public abstract void cn(ld0 ld0Var);

    public abstract void dx(e eVar, byte[] bArr, int i, int i2);

    public abstract void ef(long j);

    public abstract void ei(long j, long j2, long j3);

    public boolean er() {
        return this.J0;
    }

    public void et(boolean z) {
        this.QX = z;
    }

    public boolean gW() {
        return this.J8;
    }

    public abstract boolean gn(int i);

    public void hz(boolean z) {
        if (z) {
            this.j3 = new d70<>();
        } else {
            this.j3 = null;
        }
    }

    public List<ld0> j3(Comparator<ld0> comparator) {
        Arrays.sort(this.aM, 0, this.U2, comparator);
        List<ld0> listAsList = Arrays.asList(this.aM);
        int i = this.U2;
        return i < this.aM.length ? listAsList.subList(0, i) : listAsList;
    }

    public abstract d jJ(ld0 ld0Var, d dVar);

    public abstract void nw(long j, j60 j60Var, long j2);

    public abstract void ro();

    public abstract void sG(byte[] bArr);

    public abstract void sh(ld0 ld0Var, int i, byte[] bArr);

    public ld0 vy(j60 j60Var, f fVar, a70 a70Var) {
        ld0 ld0Var = new ld0(j60Var);
        if (fVar != null) {
            ld0Var.sy(fVar.DW);
        }
        return ld0Var;
    }

    public void wc(boolean z) {
        this.J0 = z;
    }

    public boolean yS() {
        return this.QX;
    }

    private static class b {
        a70 DW;
        byte[] FH;
        b Hw;
        final f j6;
        f v5;

        public b() {
            this.j6 = null;
        }

        public b j6() {
            b bVar = this.Hw;
            if (bVar != null && bVar.v5 == null) {
                bVar.FH = null;
                this.Hw = bVar.Hw;
            }
            if (this.v5 != null) {
                return new b(this);
            }
            b bVar2 = this.Hw;
            if (bVar2 != null) {
                return new b(bVar2);
            }
            return null;
        }

        public b(b bVar) {
            this.Hw = bVar;
            f fVar = bVar.v5;
            this.j6 = fVar;
            bVar.v5 = fVar.FH;
        }
    }

    private class c extends InputStream {
        private long fY;
        private e jw;
        private int k2;
        private long qp;
        private final Inflater WB = v60.j6();
        private final byte[] mb = new byte[512];

        public c() {
        }

        public void DW() {
            this.WB.reset();
            v60.FH(this.WB);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws i40 {
            if (read(this.mb) != -1 || this.qp != this.fY) {
                throw new i40(MessageFormat.format(JGitText.DW().packfileCorruptionDetected, JGitText.DW().wrongDecompressedLength));
            }
            int remaining = jd0.this.EQ - this.WB.getRemaining();
            if (remaining > 0) {
                jd0 jd0Var = jd0.this;
                jd0Var.cb(this.jw, jd0Var.gn, this.k2, remaining);
                jd0.this.ko(remaining);
            }
            this.WB.reset();
        }

        public void j6(e eVar, long j) {
            this.jw = eVar;
            this.fY = j;
            this.qp = 0L;
            this.k2 = jd0.this.we(eVar, 1);
            this.WB.setInput(jd0.this.gn, this.k2, jd0.this.EQ);
        }

        @Override // java.io.InputStream
        public int read() {
            if (read(this.mb, 0, 1) == 1) {
                return this.mb[0] & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public long skip(long j) throws i40, DataFormatException {
            long j2 = 0;
            while (j2 < j) {
                int i = read(this.mb, 0, (int) Math.min(this.mb.length, j - j2));
                if (i <= 0) {
                    break;
                }
                j2 += i;
            }
            return j2;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws i40, DataFormatException {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    int iInflate = this.WB.inflate(bArr, i + i3, i2 - i3);
                    if (iInflate != 0) {
                        i3 += iInflate;
                    } else {
                        if (this.WB.finished()) {
                            break;
                        }
                        if (this.WB.needsInput()) {
                            jd0.this.cb(this.jw, jd0.this.gn, this.k2, jd0.this.EQ);
                            jd0.this.ko(jd0.this.EQ);
                            this.k2 = jd0.this.we(this.jw, 1);
                            this.WB.setInput(jd0.this.gn, this.k2, jd0.this.EQ);
                        } else {
                            throw new i40(MessageFormat.format(JGitText.DW().packfileCorruptionDetected, JGitText.DW().unknownZlibError));
                        }
                    }
                } catch (DataFormatException e) {
                    throw new i40(MessageFormat.format(JGitText.DW().packfileCorruptionDetected, e.getMessage()));
                }
            }
            this.qp += i3;
            if (i3 > 0) {
                return i3;
            }
            return -1;
        }
    }
}
