package abcd;

import android.app.Activity;

/* loaded from: classes.dex */
public class my {
    private boolean BT;
    private ny DW;
    private boolean EQ;
    private long FH;
    private boolean J0;
    private boolean J8;
    private boolean KD;
    private boolean Mr;
    private boolean P8;
    private boolean QX;
    private boolean SI;
    private boolean U2;
    private boolean VH;
    private boolean Ws;
    private boolean XL;
    private boolean a8;
    private boolean aM;
    private boolean cn;
    private boolean ei;
    private boolean er;
    private boolean gW;
    private boolean gn;
    private boolean j3;
    private mz j6;
    private Class<? extends Activity> lg;
    private boolean nw;
    private boolean ro;
    private boolean tp;
    private boolean u7;
    private long v5;
    private boolean vy;
    private boolean we;
    private boolean yS;
    private long Hw = -1;
    private long Zo = -1;
    private int rN = -1;

    class a implements ny {
        final /* synthetic */ ny j6;

        /* renamed from: abcd.my$a$a, reason: collision with other inner class name */
        class C0007a implements ny {
            public C0007a() {
            }

            @Override // abcd.ny
            public jy j6(mz mzVar, Object[] objArr) {
                return a.this.j6.j6(mzVar, objArr);
            }
        }

        public a(my myVar, ny nyVar) {
            this.j6 = nyVar;
        }

        @Override // abcd.ny
        public jy j6(mz mzVar, Object[] objArr) {
            return zy.lp().yS(mzVar, objArr, objArr[0], new C0007a());
        }
    }

    class b implements ny {
        final /* synthetic */ ny j6;

        class a implements ny {
            public a() {
            }

            @Override // abcd.ny
            public jy j6(mz mzVar, Object[] objArr) {
                return b.this.j6.j6(mzVar, objArr);
            }
        }

        public b(my myVar, ny nyVar) {
            this.j6 = nyVar;
        }

        @Override // abcd.ny
        public jy j6(mz mzVar, Object[] objArr) {
            return zy.lp().yS(mzVar, objArr, objArr[0], new a());
        }
    }

    public my(mz mzVar) {
        this.j6 = mzVar;
    }

    public boolean BT() {
        return this.j3;
    }

    public my CU(ny nyVar) {
        this.cn = true;
        this.DW = nyVar;
        return this;
    }

    public ny DW() {
        return this.DW;
    }

    public boolean EQ() {
        return this.gn;
    }

    public my Eq(ny nyVar) {
        this.yS = true;
        this.DW = nyVar;
        return this;
    }

    public mz FH() {
        return this.j6;
    }

    public String Hw() {
        return FH().FH();
    }

    public my I(ny nyVar) {
        this.ei = true;
        this.DW = nyVar;
        return this;
    }

    public boolean J0() {
        return this.tp;
    }

    public boolean J8() {
        return this.vy;
    }

    public boolean KD() {
        return this.cn;
    }

    public boolean Mr() {
        return this.QX;
    }

    public <E extends Throwable> my Mz(long j, long j2, ny nyVar) {
        this.VH = true;
        this.v5 = j;
        this.Zo = j2;
        this.DW = new a(this, nyVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <A extends Activity> my OW(Class<A> cls, int i, ny nyVar) {
        this.Mr = true;
        this.lg = cls;
        this.rN = i;
        this.DW = nyVar;
        return this;
    }

    public boolean P8() {
        return this.J0;
    }

    public boolean QX() {
        return this.Hw != -1;
    }

    public my Qq(ny nyVar) {
        this.er = true;
        this.DW = nyVar;
        return this;
    }

    public boolean SI() {
        return this.ro;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <A extends Activity> my Sf(Class<A> cls, int i, ny nyVar) {
        this.aM = true;
        this.lg = cls;
        this.rN = i;
        this.DW = nyVar;
        return this;
    }

    public boolean U2() {
        return this.er;
    }

    public long VH() {
        return this.Hw;
    }

    public boolean Ws() {
        return this.aM;
    }

    public my XG(ny nyVar) {
        this.J0 = true;
        this.DW = nyVar;
        return this;
    }

    public boolean XL() {
        return this.VH;
    }

    public my XX(ny nyVar) {
        this.gW = true;
        this.DW = nyVar;
        return this;
    }

    public my Xa(ny nyVar) {
        this.Ws = true;
        this.DW = nyVar;
        return this;
    }

    public long Zo() {
        return this.FH;
    }

    public boolean a8() {
        return this.U2;
    }

    public boolean aM() {
        return this.ei;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <A extends Activity> my aj(Class<A> cls, int i, ny nyVar) {
        this.a8 = true;
        this.rN = i;
        this.lg = cls;
        this.DW = nyVar;
        return this;
    }

    public my aq(ny nyVar) {
        this.EQ = true;
        this.DW = nyVar;
        return this;
    }

    public my br(ny nyVar) {
        this.BT = true;
        this.DW = nyVar;
        return this;
    }

    public my ca(ny nyVar) {
        this.P8 = true;
        this.DW = nyVar;
        return this;
    }

    public boolean cb() {
        return this.EQ;
    }

    public boolean cn() {
        return this.yS;
    }

    public my dx(ny nyVar) {
        this.u7 = true;
        this.DW = nyVar;
        return this;
    }

    public my ef(ny nyVar) {
        this.vy = true;
        this.DW = nyVar;
        return this;
    }

    public boolean ei() {
        return this.SI;
    }

    public boolean er() {
        return this.Mr;
    }

    public my et(ny nyVar) {
        this.ro = true;
        this.DW = nyVar;
        return this;
    }

    public my g3(long j, long j2, ny nyVar) {
        this.FH = j;
        this.Hw = j2;
        this.DW = new b(this, nyVar);
        return this;
    }

    public boolean gW() {
        return this.gW;
    }

    public long gn() {
        return this.v5;
    }

    public my hz(ny nyVar) {
        this.we = true;
        this.DW = nyVar;
        return this;
    }

    public boolean j3() {
        return this.P8;
    }

    public Class<? extends Activity> j6() {
        return this.lg;
    }

    public my jJ(ny nyVar) {
        this.SI = true;
        this.DW = nyVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <A extends Activity> my kQ(Class<A> cls, int i, ny nyVar) {
        this.j3 = true;
        this.rN = i;
        this.lg = cls;
        this.DW = nyVar;
        return this;
    }

    public boolean lg() {
        return this.a8;
    }

    public my lp(ny nyVar) {
        this.XL = true;
        this.DW = nyVar;
        return this;
    }

    public boolean nw() {
        return this.KD;
    }

    public boolean rN() {
        return this.XL;
    }

    public boolean ro() {
        return this.Ws;
    }

    public my sG(ny nyVar) {
        this.tp = true;
        this.DW = nyVar;
        return this;
    }

    public boolean sh() {
        return this.we;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <A extends Activity> my sy(Class<A> cls, int i, ny nyVar) {
        this.U2 = true;
        this.rN = i;
        this.lg = cls;
        this.DW = nyVar;
        return this;
    }

    public boolean tp() {
        return this.nw;
    }

    public long u7() {
        return this.Zo;
    }

    public int v5() {
        return this.rN;
    }

    public my vJ(ny nyVar) {
        this.nw = true;
        this.DW = nyVar;
        return this;
    }

    public boolean vy() {
        return this.J8;
    }

    public my wc(ny nyVar) {
        this.KD = true;
        this.DW = nyVar;
        return this;
    }

    public boolean we() {
        return this.u7;
    }

    public my x9(ny nyVar) {
        this.QX = true;
        this.DW = nyVar;
        return this;
    }

    public my yO(ny nyVar) {
        this.J8 = true;
        this.DW = nyVar;
        return this;
    }

    public boolean yS() {
        return this.BT;
    }
}
