package abcd;

/* loaded from: classes.dex */
public final class er extends ws implements hr {
    public static final er BR;
    public static final er Cz;
    public static final er Gj;
    public static final er IS;
    public static final er Jl;
    public static final er Nh;
    public static final er Q6;
    public static final er QO;
    public static final er Z1;
    public static final er a5;
    public static final er aX;
    public static final er cT;
    public static final er e3;
    public static final er e9;
    public static final er eU;
    public static final er fN;
    public static final er gG;
    public static final er iW;
    public static final er kf;
    public static final er n5;
    public static final er oy;
    public static final er pN;
    public static final er pO;
    public static final er q7;
    public static final er sE;
    public static final er sM;
    public static final er sg;
    public static final er ys;
    public static final er jw = new er(0);
    public static final er fY = Mz(fr.n5);
    public static final er qp = Mz(fr.Q6);
    public static final er k2 = Mz(fr.Z1);
    public static final er zh = Mz(fr.q7);
    public static final er AL = Mz(fr.sg);
    public static final er w9 = Mz(fr.eU);
    public static final er hK = Mz(fr.Gj);

    static {
        fr frVar = fr.n5;
        cT = I(frVar, frVar);
        fr frVar2 = fr.Q6;
        q7 = I(frVar2, frVar2);
        fr frVar3 = fr.Z1;
        Z1 = I(frVar3, frVar3);
        fr frVar4 = fr.q7;
        n5 = I(frVar4, frVar4);
        fr frVar5 = fr.sg;
        Q6 = I(frVar5, frVar5);
        kf = I(fr.n5, fr.sg);
        Jl = I(fr.Q6, fr.sg);
        iW = I(fr.Z1, fr.sg);
        eU = I(fr.q7, fr.sg);
        e3 = I(fr.Q6, fr.n5);
        sE = I(fr.Za, fr.n5);
        sg = I(fr.An, fr.n5);
        pO = I(fr.AE, fr.n5);
        fN = I(fr.BR, fr.n5);
        Gj = I(fr.Pa, fr.n5);
        Cz = I(fr.IS, fr.n5);
        pN = I(fr.gG, fr.n5);
        oy = I(fr.Nh, fr.n5);
        aX = I(fr.ce, fr.n5);
        e9 = ca(fr.n5, fr.Za, fr.n5);
        QO = ca(fr.Q6, fr.An, fr.n5);
        sM = ca(fr.Z1, fr.AE, fr.n5);
        a5 = ca(fr.q7, fr.BR, fr.n5);
        ys = ca(fr.sg, fr.Pa, fr.n5);
        IS = ca(fr.n5, fr.IS, fr.n5);
        gG = ca(fr.n5, fr.gG, fr.n5);
        Nh = ca(fr.n5, fr.Nh, fr.n5);
        BR = ca(fr.n5, fr.ce, fr.n5);
    }

    public er(int i) {
        super(i);
    }

    public static er I(fr frVar, fr frVar2) {
        er erVar = new er(2);
        erVar.Qq(0, frVar);
        erVar.Qq(1, frVar2);
        return erVar;
    }

    public static er Mz(fr frVar) {
        er erVar = new er(1);
        erVar.Qq(0, frVar);
        return erVar;
    }

    public static er ca(fr frVar, fr frVar2, fr frVar3) {
        er erVar = new er(3);
        erVar.Qq(0, frVar);
        erVar.Qq(1, frVar2);
        erVar.Qq(2, frVar3);
        return erVar;
    }

    public static boolean ef(hr hrVar, hr hrVar2) {
        int size = hrVar.size();
        if (hrVar2.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!hrVar.v5(i).equals(hrVar2.v5(i))) {
                return false;
            }
        }
        return true;
    }

    public static int g3(hr hrVar) {
        int size = hrVar.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + hrVar.v5(i).hashCode();
        }
        return iHashCode;
    }

    public static int sG(hr hrVar, hr hrVar2) {
        int size = hrVar.size();
        int size2 = hrVar2.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = hrVar.v5(i).compareTo(hrVar2.v5(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static String sy(hr hrVar) {
        int size = hrVar.size();
        if (size == 0) {
            return "<empty>";
        }
        StringBuffer stringBuffer = new StringBuffer(100);
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(hrVar.v5(i).Zo());
        }
        return stringBuffer.toString();
    }

    public static er x9(fr frVar, fr frVar2, fr frVar3, fr frVar4) {
        er erVar = new er(4);
        erVar.Qq(0, frVar);
        erVar.Qq(1, frVar2);
        erVar.Qq(2, frVar3);
        erVar.Qq(3, frVar4);
        return erVar;
    }

    public void Qq(int i, fr frVar) {
        KD(i, frVar);
    }

    public fr Sf(int i) {
        return (fr) BT(i);
    }

    public er aj(fr frVar) {
        int size = size();
        er erVar = new er(size + 1);
        int i = 0;
        erVar.KD(0, frVar);
        while (i < size) {
            int i2 = i + 1;
            erVar.KD(i2, vy(i));
            i = i2;
        }
        return erVar;
    }

    @Override // abcd.hr
    public hr tp(fr frVar) {
        int size = size();
        er erVar = new er(size + 1);
        for (int i = 0; i < size; i++) {
            erVar.KD(i, BT(i));
        }
        erVar.Qq(size, frVar);
        erVar.Mr();
        return erVar;
    }

    @Override // abcd.hr
    public fr v5(int i) {
        return Sf(i);
    }

    public int vJ() {
        int size = size();
        int iTp = 0;
        for (int i = 0; i < size; i++) {
            iTp += Sf(i).tp();
        }
        return iTp;
    }
}
