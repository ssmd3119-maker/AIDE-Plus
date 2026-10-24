package org.spongycastle.jcajce.provider.asymmetric.dh;

import abcd.ap0;
import abcd.bi0;
import abcd.gj0;
import abcd.gl0;
import abcd.hl0;
import abcd.km0;
import abcd.mh0;
import abcd.mm0;
import abcd.qo0;
import abcd.sh0;
import abcd.sl0;
import abcd.vh0;
import abcd.yl0;
import java.io.IOException;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

/* loaded from: classes.dex */
public class BCDHPublicKey implements DHPublicKey {
    private BigInteger WB;
    private transient yl0 jw;
    private transient DHParameterSpec mb;

    BCDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.WB = dHPublicKeySpec.getY();
        this.mb = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    private boolean j6(bi0 bi0Var) {
        if (bi0Var.j3() == 2) {
            return true;
        }
        if (bi0Var.j3() > 3) {
            return false;
        }
        return gj0.J8(bi0Var.XL(2)).XL().compareTo(BigInteger.valueOf((long) gj0.J8(bi0Var.XL(0)).XL().bitLength())) <= 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        yl0 yl0Var = this.jw;
        return yl0Var != null ? ap0.DW(yl0Var) : ap0.j6(new sl0(hl0.QX, (mh0) new gl0(this.mb.getP(), this.mb.getG(), this.mb.getL()).DW()), new sh0(this.WB));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.mb;
    }

    @Override // javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.WB;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    BCDHPublicKey(DHPublicKey dHPublicKey) {
        this.WB = dHPublicKey.getY();
        this.mb = dHPublicKey.getParams();
    }

    BCDHPublicKey(qo0 qo0Var) {
        this.WB = qo0Var.FH();
        this.mb = new DHParameterSpec(qo0Var.DW().v5(), qo0Var.DW().DW(), qo0Var.DW().FH());
    }

    BCDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.WB = bigInteger;
        this.mb = dHParameterSpec;
    }

    public BCDHPublicKey(yl0 yl0Var) {
        this.jw = yl0Var;
        try {
            this.WB = ((sh0) yl0Var.u7()).XL();
            bi0 bi0VarJ8 = bi0.J8(yl0Var.VH().EQ());
            vh0 vh0VarVH = yl0Var.VH().VH();
            if (!vh0VarVH.equals(hl0.QX) && !j6(bi0VarJ8)) {
                if (vh0VarVH.equals(mm0.aM)) {
                    km0 km0VarGn = km0.gn(bi0VarJ8);
                    this.mb = new DHParameterSpec(km0VarGn.tp().XL(), km0VarGn.VH().XL());
                    return;
                } else {
                    throw new IllegalArgumentException("unknown algorithm type: " + vh0VarVH);
                }
            }
            gl0 gl0VarGn = gl0.gn(bi0VarJ8);
            if (gl0VarGn.u7() != null) {
                this.mb = new DHParameterSpec(gl0VarGn.tp(), gl0VarGn.VH(), gl0VarGn.u7().intValue());
            } else {
                this.mb = new DHParameterSpec(gl0VarGn.tp(), gl0VarGn.VH());
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DH public key");
        }
    }
}
