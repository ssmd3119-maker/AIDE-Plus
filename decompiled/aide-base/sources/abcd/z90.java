package abcd;

import java.util.Date;

/* loaded from: classes.dex */
public abstract class z90 extends ba0 {
    final int FH;

    private static class a extends z90 {
        public a(long j) {
            super(j);
        }

        @Override // abcd.ba0
        public boolean DW(t90 t90Var, k90 k90Var) {
            if (k90Var.XG() >= this.FH) {
                return true;
            }
            throw d50.WB;
        }

        @Override // abcd.ba0
        public String toString() {
            return String.valueOf(super.toString()) + "(" + new Date(this.FH * 1000) + ")";
        }
    }

    public z90(long j) {
        this.FH = (int) (j / 1000);
    }

    public static final ba0 Hw(long j) {
        return new a(j);
    }

    public static final ba0 v5(Date date) {
        return Hw(date.getTime());
    }

    @Override // abcd.ba0
    public boolean FH() {
        return false;
    }

    @Override // abcd.ba0
    /* renamed from: j6 */
    public ba0 clone() {
        return this;
    }
}
