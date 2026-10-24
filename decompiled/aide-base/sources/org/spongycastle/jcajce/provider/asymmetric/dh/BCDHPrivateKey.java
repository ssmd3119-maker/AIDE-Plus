package org.spongycastle.jcajce.provider.asymmetric.dh;

import abcd.bi0;
import abcd.bp0;
import abcd.gl0;
import abcd.hl0;
import abcd.il0;
import abcd.jj0;
import abcd.km0;
import abcd.mh0;
import abcd.mm0;
import abcd.po0;
import abcd.sh0;
import abcd.sl0;
import abcd.vh0;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;

/* loaded from: classes.dex */
public class BCDHPrivateKey implements DHPrivateKey {
    private BigInteger WB;
    private transient bp0 fY = new bp0();
    private transient il0 jw;
    private transient DHParameterSpec mb;

    protected BCDHPrivateKey() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    public mh0 getBagAttribute(jj0 jj0Var) {
        return this.fY.j6(jj0Var);
    }

    public Enumeration getBagAttributeKeys() {
        return this.fY.DW();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return this.jw != null ? this.jw.Zo("DER") : new il0(new sl0(hl0.QX, (mh0) new gl0(this.mb.getP(), this.mb.getG(), this.mb.getL()).DW()), new sh0(getX())).Zo("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.mb;
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return this.WB;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public void setBagAttribute(vh0 vh0Var, mh0 mh0Var) {
        this.fY.FH(vh0Var, mh0Var);
    }

    BCDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.WB = dHPrivateKey.getX();
        this.mb = dHPrivateKey.getParams();
    }

    BCDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.WB = dHPrivateKeySpec.getX();
        this.mb = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public BCDHPrivateKey(il0 il0Var) {
        bi0 bi0VarJ8 = bi0.J8(il0Var.gn().EQ());
        sh0 sh0Var = (sh0) il0Var.u7();
        vh0 vh0VarVH = il0Var.gn().VH();
        this.jw = il0Var;
        this.WB = sh0Var.XL();
        if (vh0VarVH.equals(hl0.QX)) {
            gl0 gl0VarGn = gl0.gn(bi0VarJ8);
            if (gl0VarGn.u7() != null) {
                this.mb = new DHParameterSpec(gl0VarGn.tp(), gl0VarGn.VH(), gl0VarGn.u7().intValue());
                return;
            } else {
                this.mb = new DHParameterSpec(gl0VarGn.tp(), gl0VarGn.VH());
                return;
            }
        }
        if (vh0VarVH.equals(mm0.aM)) {
            km0 km0VarGn = km0.gn(bi0VarJ8);
            this.mb = new DHParameterSpec(km0VarGn.tp().XL(), km0VarGn.VH().XL());
        } else {
            throw new IllegalArgumentException("unknown algorithm type: " + vh0VarVH);
        }
    }

    BCDHPrivateKey(po0 po0Var) {
        this.WB = po0Var.FH();
        this.mb = new DHParameterSpec(po0Var.DW().v5(), po0Var.DW().DW(), po0Var.DW().FH());
    }
}
