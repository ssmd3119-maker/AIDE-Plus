package abcd;

import java.io.IOException;
import java.security.MessageDigest;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public final class ob0 extends g70 implements cc0 {
    private Inflater DW;
    private fa0 FH;
    private ha0 Hw;
    final byte[] j6 = new byte[20];
    final ja0 v5;

    public ob0(ja0 ja0Var) {
        this.v5 = ja0Var;
    }

    private void P8() {
        Inflater inflater = this.DW;
        if (inflater == null) {
            this.DW = v60.j6();
        } else {
            inflater.reset();
        }
    }

    @Override // abcd.cc0
    /* renamed from: BT, reason: merged with bridge method [inline-methods] */
    public ra0 j6(o90 o90Var) {
        return new ra0(o90Var);
    }

    @Override // abcd.cc0
    public void DW(fc0 fc0Var, List<dc0> list) {
        Iterator<dc0> it = list.iterator();
        while (it.hasNext()) {
            fc0Var.we(it.next());
        }
    }

    @Override // abcd.g70
    public boolean EQ(j60 j60Var) {
        return this.v5.FH(j60Var);
    }

    @Override // abcd.cc0
    public void FH(fc0 fc0Var, sb0 sb0Var, boolean z) {
        ((pa0) sb0Var).v5(fc0Var, z, this);
    }

    @Override // abcd.cc0
    public Collection<sb0> Hw() {
        return this.v5.tp();
    }

    @Override // abcd.g70
    public g70 J0() {
        return new ob0(this.v5);
    }

    @Override // abcd.g70
    public f70 QX(j60 j60Var, int i) throws j40, q40 {
        f70 f70VarGW = this.v5.gW(this, j60Var);
        if (f70VarGW == null) {
            if (i == -1) {
                throw new q40(j60Var.Zo(), "unknown");
            }
            throw new q40(j60Var.Zo(), i);
        }
        if (i == -1 || f70VarGW.VH() == i) {
            return f70VarGW;
        }
        throw new j40(j60Var.Zo(), i);
    }

    @Override // abcd.g70
    public void XL() {
        this.FH = null;
        this.Hw = null;
        try {
            v60.FH(this.DW);
        } finally {
            this.DW = null;
        }
    }

    @Override // abcd.cc0
    public void Zo(gc0 gc0Var, j70 j70Var, Iterable<dc0> iterable) {
        Iterator<dc0> it = iterable.iterator();
        while (it.hasNext()) {
            this.v5.KD(gc0Var, it.next(), this);
            j70Var.v5(1);
        }
    }

    public int a8(wa0 wa0Var, long j, byte[] bArr, int i, int i2) {
        long j2 = wa0Var.zh;
        int i3 = i2;
        while (i3 > 0 && j < j2) {
            vy(wa0Var, j);
            int iFH = this.FH.FH(j, bArr, i, i3);
            j += iFH;
            i += iFH;
            i3 -= iFH;
        }
        return i2 - i3;
    }

    @Override // abcd.g70
    public Collection<a70> aM(h60 h60Var) {
        if (h60Var.VH()) {
            return Collections.singleton(h60Var.QX());
        }
        HashSet hashSet = new HashSet(4);
        this.v5.SI(hashSet, h60Var);
        return hashSet;
    }

    public da0 ei(wa0 wa0Var, long j, long j2) {
        vy(wa0Var, j);
        fa0 fa0Var = this.FH;
        if ((fa0Var instanceof da0) && fa0Var.j6(wa0Var, j + (j2 - 1))) {
            return (da0) this.FH;
        }
        return null;
    }

    public int er() {
        return mb0.tp();
    }

    public Inflater gW() {
        P8();
        return this.DW;
    }

    public void lg(wa0 wa0Var, long j, boolean z, fc0 fc0Var) throws IOException {
        MessageDigest messageDigestZo;
        if (z) {
            messageDigestZo = r60.Zo();
            byte[] bArrHw = fc0Var.Hw();
            vy(wa0Var, 0L);
            if (this.FH.DW(0, bArrHw, 0, 12) != 12) {
                wa0Var.aj();
                throw new IOException(JGitText.DW().packfileIsTruncated);
            }
            messageDigestZo.update(bArrHw, 0, 12);
        } else {
            messageDigestZo = null;
        }
        long j2 = 12;
        long j3 = j - 32;
        for (long j4 = 0; j4 < j3; j4 = 0) {
            vy(wa0Var, j2);
            fa0 fa0Var = this.FH;
            int iMin = (int) Math.min(fa0Var.Zo() - ((int) (j2 - fa0Var.DW)), j3);
            this.FH.VH(fc0Var, j2, iMin, messageDigestZo);
            long j5 = iMin;
            j2 += j5;
            j3 -= j5;
        }
        if (messageDigestZo != null) {
            byte[] bArr = new byte[20];
            byte[] bArrDigest = messageDigestZo.digest();
            vy(wa0Var, j2);
            if (this.FH.FH(j2, bArr, 0, 20) != 20) {
                wa0Var.aj();
                throw new IOException(JGitText.DW().packfileIsTruncated);
            }
            if (Arrays.equals(bArrDigest, bArr)) {
                return;
            }
            wa0Var.aj();
            throw new IOException(MessageFormat.format(JGitText.DW().packfileCorruptionDetected, wa0Var.SI().getPath()));
        }
    }

    public ha0 rN() {
        if (this.Hw == null) {
            this.Hw = new ha0();
        }
        return this.Hw;
    }

    @Override // abcd.g70
    public long u7(j60 j60Var, int i) throws q40 {
        long jJ8 = this.v5.J8(this, j60Var);
        if (jJ8 >= 0) {
            return jJ8;
        }
        if (i == -1) {
            throw new q40(j60Var.Zo(), "unknown");
        }
        throw new q40(j60Var.Zo(), i);
    }

    @Override // abcd.cc0
    public void v5(fc0 fc0Var, dc0 dc0Var, boolean z) {
        ra0 ra0Var = (ra0) dc0Var;
        ra0Var.Jl.VH(fc0Var, ra0Var, z, this);
    }

    public void vy(wa0 wa0Var, long j) {
        fa0 fa0Var = this.FH;
        if (fa0Var == null || !fa0Var.j6(wa0Var, j)) {
            this.FH = null;
            this.FH = mb0.gn(wa0Var, j);
        }
    }

    public int yS(wa0 wa0Var, long j, byte[] bArr, int i) throws DataFormatException {
        P8();
        vy(wa0Var, j);
        long jV5 = j + this.FH.v5(j, this.DW);
        do {
            int iInflate = this.DW.inflate(bArr, i, bArr.length - i);
            if (iInflate == 0) {
                if (!this.DW.needsInput()) {
                    if (this.DW.finished()) {
                        return i;
                    }
                    throw new DataFormatException();
                }
                vy(wa0Var, jV5);
                jV5 += this.FH.v5(jV5, this.DW);
            }
            i += iInflate;
        } while (i < bArr.length);
        return i;
    }
}
