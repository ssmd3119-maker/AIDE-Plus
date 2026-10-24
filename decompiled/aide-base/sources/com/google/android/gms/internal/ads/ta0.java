package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ta0 {
    private final double DW;
    private final double FH;
    private final double Hw;
    private final double VH;
    private final double Zo;
    private final double gn;
    private final double j6;
    private final double u7;
    private final double v5;
    public static final ta0 tp = new ta0(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final ta0 EQ = new ta0(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final ta0 we = new ta0(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final ta0 J0 = new ta0(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    private ta0(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.j6 = d5;
        this.DW = d6;
        this.FH = d7;
        this.Hw = d;
        this.v5 = d2;
        this.Zo = d3;
        this.VH = d4;
        this.gn = d8;
        this.u7 = d9;
    }

    public static ta0 j6(ByteBuffer byteBuffer) {
        double dV5 = tp.v5(byteBuffer);
        double dV52 = tp.v5(byteBuffer);
        double dZo = tp.Zo(byteBuffer);
        return new ta0(dV5, dV52, tp.v5(byteBuffer), tp.v5(byteBuffer), dZo, tp.Zo(byteBuffer), tp.Zo(byteBuffer), tp.v5(byteBuffer), tp.v5(byteBuffer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ta0.class != obj.getClass()) {
            return false;
        }
        ta0 ta0Var = (ta0) obj;
        return Double.compare(ta0Var.Hw, this.Hw) == 0 && Double.compare(ta0Var.v5, this.v5) == 0 && Double.compare(ta0Var.Zo, this.Zo) == 0 && Double.compare(ta0Var.VH, this.VH) == 0 && Double.compare(ta0Var.gn, this.gn) == 0 && Double.compare(ta0Var.u7, this.u7) == 0 && Double.compare(ta0Var.j6, this.j6) == 0 && Double.compare(ta0Var.DW, this.DW) == 0 && Double.compare(ta0Var.FH, this.FH) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.j6);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.DW);
        int i = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.FH);
        int i2 = (i * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.Hw);
        int i3 = (i2 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.v5);
        int i4 = (i3 * 31) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.Zo);
        int i5 = (i4 * 31) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)));
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.VH);
        int i6 = (i5 * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.gn);
        int i7 = (i6 * 31) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)));
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.u7);
        return (i7 * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(tp)) {
            return "Rotate 0°";
        }
        if (equals(EQ)) {
            return "Rotate 90°";
        }
        if (equals(we)) {
            return "Rotate 180°";
        }
        if (equals(J0)) {
            return "Rotate 270°";
        }
        double d = this.j6;
        double d2 = this.DW;
        double d3 = this.FH;
        double d4 = this.Hw;
        double d5 = this.v5;
        double d6 = this.Zo;
        double d7 = this.VH;
        double d8 = this.gn;
        double d9 = this.u7;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
