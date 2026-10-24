package abcd;

/* loaded from: classes.dex */
public final class ar extends gt implements cq {
    private final bq[] mb;

    public ar(int i) {
        super(i > 1);
        if (i < 1) {
            throw new IllegalArgumentException("size < 1");
        }
        this.mb = new bq[i];
    }

    private static bq KD(int i) {
        throw new us("invalid constant pool index " + xs.VH(i));
    }

    public bq BT(int i) {
        try {
            return this.mb[i];
        } catch (IndexOutOfBoundsException unused) {
            KD(i);
            throw null;
        }
    }

    @Override // abcd.cq
    public bq QX(int i) {
        if (i == 0) {
            return null;
        }
        return get(i);
    }

    @Override // abcd.cq
    public bq get(int i) {
        try {
            bq bqVar = this.mb[i];
            if (bqVar != null) {
                return bqVar;
            }
            KD(i);
            throw null;
        } catch (IndexOutOfBoundsException unused) {
            KD(i);
            throw null;
        }
    }

    public void vy(int i, bq bqVar) {
        int i2;
        bq bqVar2;
        a8();
        boolean z = bqVar != null && bqVar.v5();
        if (i < 1) {
            throw new IllegalArgumentException("n < 1");
        }
        if (z) {
            bq[] bqVarArr = this.mb;
            if (i == bqVarArr.length - 1) {
                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
            }
            bqVarArr[i + 1] = null;
        }
        if (bqVar != null) {
            bq[] bqVarArr2 = this.mb;
            if (bqVarArr2[i] == null && (bqVar2 = bqVarArr2[i - 1]) != null && bqVar2.v5()) {
                this.mb[i2] = null;
            }
        }
        this.mb[i] = bqVar;
    }
}
