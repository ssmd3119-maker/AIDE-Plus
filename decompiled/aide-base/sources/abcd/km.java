package abcd;

import abcd.en;
import java.io.Writer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.Adler32;

/* loaded from: classes.dex */
public final class km {
    private final en Hw;
    private int QX;
    private final jn[] Ws;
    private int XL;
    private kj j6;
    private final tm J8 = new tm(this);
    private final en FH = new en(null, this, 4, en.c.NONE);
    private final en DW = new en("word_data", this, 4, en.c.TYPE);
    private final en v5 = new en("string_data", this, 1, en.c.INSTANCE);
    private final en we = new en(null, this, 1, en.c.NONE);
    private final en J0 = new en("byte_data", this, 1, en.c.TYPE);
    private final nn Zo = new nn(this);
    private final pn VH = new pn(this);
    private final in gn = new in(this);
    private final rm u7 = new rm(this);
    private final dn tp = new dn(this);
    private final gm EQ = new gm(this);

    public km(kj kjVar) {
        this.j6 = kjVar;
        en enVar = new en("map", this, 4, en.c.NONE);
        this.Hw = enVar;
        this.Ws = new jn[]{this.J8, this.Zo, this.VH, this.gn, this.u7, this.tp, this.EQ, this.DW, this.FH, this.v5, this.J0, this.we, enVar};
        this.QX = -1;
        this.XL = 79;
    }

    private static void DW(byte[] bArr) {
        Adler32 adler32 = new Adler32();
        adler32.update(bArr, 12, bArr.length - 12);
        int value = (int) adler32.getValue();
        bArr[8] = (byte) value;
        bArr[9] = (byte) (value >> 8);
        bArr[10] = (byte) (value >> 16);
        bArr[11] = (byte) (value >> 24);
    }

    private static void FH(byte[] bArr) throws NoSuchAlgorithmException, DigestException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 32, bArr.length - 32);
            try {
                int iDigest = messageDigest.digest(bArr, 12, 20);
                if (iDigest == 20) {
                    return;
                }
                throw new RuntimeException("unexpected digest write: " + iDigest + " bytes");
            } catch (DigestException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    private ps rN(boolean z, boolean z2) throws NoSuchAlgorithmException, DigestException {
        this.EQ.gn();
        this.we.gn();
        this.DW.gn();
        this.J0.gn();
        this.tp.gn();
        this.u7.gn();
        this.gn.gn();
        this.FH.gn();
        this.VH.gn();
        this.Zo.gn();
        this.v5.gn();
        this.J8.gn();
        int length = this.Ws.length;
        int iJ8 = 0;
        for (int i = 0; i < length; i++) {
            jn jnVar = this.Ws[i];
            int iTp = jnVar.tp(iJ8);
            if (iTp < iJ8) {
                throw new RuntimeException("bogus placement for section " + i);
            }
            try {
                if (jnVar == this.Hw) {
                    ym.yS(this.Ws, this.Hw);
                    this.Hw.gn();
                }
                if (jnVar instanceof en) {
                    ((en) jnVar).j3();
                }
                iJ8 = jnVar.J8() + iTp;
            } catch (RuntimeException e) {
                throw us.DW(e, "...while writing section " + i);
            }
        }
        this.QX = iJ8;
        byte[] bArr = new byte[iJ8];
        ps psVar = new ps(bArr);
        if (z) {
            psVar.J0(this.XL, z2);
        }
        for (int i2 = 0; i2 < length; i2++) {
            try {
                jn jnVar2 = this.Ws[i2];
                int iZo = jnVar2.Zo() - psVar.FH();
                if (iZo < 0) {
                    throw new us("excess write of " + (-iZo));
                }
                psVar.v5(jnVar2.Zo() - psVar.FH());
                jnVar2.Ws(psVar);
            } catch (RuntimeException e2) {
                us usVar = e2 instanceof us ? (us) e2 : new us(e2);
                usVar.j6("...while writing section " + i2);
                throw usVar;
            }
        }
        if (psVar.FH() != this.QX) {
            throw new RuntimeException("foreshortened write");
        }
        FH(bArr);
        DW(bArr);
        if (z) {
            this.DW.Mr(psVar, xm.TYPE_CODE_ITEM, "\nmethod code index:\n\n");
            QX().FH(psVar);
            psVar.Ws();
        }
        return psVar;
    }

    public jn EQ() {
        return this.DW;
    }

    public vm Hw(bq bqVar) {
        if (bqVar instanceof yq) {
            return this.Zo.aM(bqVar);
        }
        if (bqVar instanceof zq) {
            return this.VH.aM(bqVar);
        }
        if (bqVar instanceof fq) {
            return this.tp.aM(bqVar);
        }
        if (bqVar instanceof lq) {
            return this.u7.aM(bqVar);
        }
        return null;
    }

    public en J0() {
        return this.Hw;
    }

    public dn J8() {
        return this.tp;
    }

    public en Mr() {
        return this.FH;
    }

    public kn QX() {
        kn knVar = new kn();
        for (jn jnVar : this.Ws) {
            knVar.DW(jnVar);
        }
        return knVar;
    }

    public en U2() {
        return this.DW;
    }

    public gm VH() {
        return this.EQ;
    }

    public in Ws() {
        return this.gn;
    }

    public en XL() {
        return this.v5;
    }

    public en Zo() {
        return this.we;
    }

    public void a8(bq bqVar) {
        if (bqVar instanceof yq) {
            this.Zo.U2((yq) bqVar);
            return;
        }
        if (bqVar instanceof zq) {
            this.VH.U2((zq) bqVar);
            return;
        }
        if (bqVar instanceof fq) {
            this.tp.Mr((fq) bqVar);
            return;
        }
        if (bqVar instanceof lq) {
            this.u7.Mr((lq) bqVar);
        } else if (bqVar instanceof kq) {
            this.u7.Mr(((kq) bqVar).QX());
        } else if (bqVar == null) {
            throw new NullPointerException("cst == null");
        }
    }

    public nn aM() {
        return this.Zo;
    }

    public kj gn() {
        return this.j6;
    }

    public pn j3() {
        return this.VH;
    }

    public void j6(fm fmVar) {
        this.EQ.aM(fmVar);
    }

    public byte[] lg(Writer writer, boolean z) throws NoSuchAlgorithmException, DigestException {
        boolean z2 = writer != null;
        ps psVarRN = rN(z2, z);
        if (z2) {
            psVarRN.Mr(writer);
        }
        return psVarRN.QX();
    }

    public int tp() {
        int i = this.QX;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("file size not yet known");
    }

    public rm u7() {
        return this.u7;
    }

    public en v5() {
        return this.J0;
    }

    public jn we() {
        return this.Hw;
    }
}
