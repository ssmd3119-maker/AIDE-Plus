package abcd;

import abcd.co;
import com.aide.uidesigner.ProxyTextView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lj {
    public int Mr;
    public int U2;
    public final a aM;
    public final a[] j3;
    public final a j6 = new a(0);
    public final a DW = new a(1);
    public final a FH = new a(2);
    public final a Hw = new a(3);
    public final a v5 = new a(4);
    public final a Zo = new a(5);
    public final a VH = new a(6);
    public final a gn = new a(4096);
    public final a u7 = new a(ProxyTextView.INPUTTYPE_textCapCharacters);
    public final a tp = new a(ProxyTextView.INPUTTYPE_numberSigned);
    public final a EQ = new a(4099);
    public final a we = new a(8192);
    public final a J0 = new a(ProxyTextView.INPUTTYPE_textCapWords);
    public final a J8 = new a(ProxyTextView.INPUTTYPE_numberDecimal);
    public final a Ws = new a(8195);
    public final a QX = new a(8196);
    public final a XL = new a(8197);

    public static class a implements Comparable<a> {
        public final short WB;
        public int fY;
        public int mb = 0;
        public int jw = -1;

        public a(int i) {
            this.WB = (short) i;
        }

        public boolean DW() {
            return this.mb > 0;
        }

        @Override // java.lang.Comparable
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int i = this.jw;
            int i2 = aVar.jw;
            if (i != i2) {
                return i < i2 ? -1 : 1;
            }
            return 0;
        }

        public String toString() {
            return String.format("Section[type=%#x,off=%#x,size=%#x]", Short.valueOf(this.WB), Integer.valueOf(this.jw), Integer.valueOf(this.mb));
        }
    }

    public lj() {
        a aVar = new a(8198);
        this.aM = aVar;
        this.j3 = new a[]{this.j6, this.DW, this.FH, this.Hw, this.v5, this.Zo, this.VH, this.gn, this.u7, this.tp, this.EQ, this.we, this.J0, this.J8, this.Ws, this.QX, this.XL, aVar};
    }

    private a DW(short s) {
        for (a aVar : this.j3) {
            if (aVar.WB == s) {
                return aVar;
            }
        }
        throw new IllegalArgumentException("No such map item: " + ((int) s));
    }

    private void Hw(co.g gVar) {
        byte[] bArrLg = gVar.lg(8);
        if (jj.DW(bArrLg) < 0) {
            throw new ts("Unexpected magic: " + Arrays.toString(bArrLg));
        }
        gVar.nw();
        gVar.lg(20);
        gVar.nw();
        int iNw = gVar.nw();
        if (iNw != 112) {
            throw new ts("Unexpected header: 0x" + Integer.toHexString(iNw));
        }
        int iNw2 = gVar.nw();
        if (iNw2 != 305419896) {
            throw new ts("Unexpected endian tag: 0x" + Integer.toHexString(iNw2));
        }
        gVar.nw();
        gVar.nw();
        this.gn.jw = gVar.nw();
        if (this.gn.jw == 0) {
            throw new ts("Cannot merge dex files that do not contain a map");
        }
        this.DW.mb = gVar.nw();
        this.DW.jw = gVar.nw();
        this.FH.mb = gVar.nw();
        this.FH.jw = gVar.nw();
        this.Hw.mb = gVar.nw();
        this.Hw.jw = gVar.nw();
        this.v5.mb = gVar.nw();
        this.v5.jw = gVar.nw();
        this.Zo.mb = gVar.nw();
        this.Zo.jw = gVar.nw();
        this.VH.mb = gVar.nw();
        this.VH.jw = gVar.nw();
        this.Mr = gVar.nw();
        this.U2 = gVar.nw();
    }

    private void v5(co.g gVar) {
        int i;
        int iNw = gVar.nw();
        a aVar = null;
        int i2 = 0;
        while (i2 < iNw) {
            short sCn = gVar.cn();
            gVar.cn();
            a aVarDW = DW(sCn);
            int iNw2 = gVar.nw();
            int iNw3 = gVar.nw();
            int i3 = aVarDW.mb;
            if ((i3 != 0 && i3 != iNw2) || ((i = aVarDW.jw) != -1 && i != iNw3)) {
                throw new ts("Unexpected map value for 0x" + Integer.toHexString(sCn));
            }
            aVarDW.mb = iNw2;
            aVarDW.jw = iNw3;
            if (aVar != null && aVar.jw > iNw3) {
                throw new ts("Map is unsorted at " + aVar + ", " + aVarDW);
            }
            i2++;
            aVar = aVarDW;
        }
        Arrays.sort(this.j3);
    }

    public void FH(co coVar) {
        Hw(coVar.J0(0));
        v5(coVar.J0(this.gn.jw));
        j6();
    }

    public void j6() {
        int i = this.U2 + this.Mr;
        for (int length = this.j3.length - 1; length >= 0; length--) {
            a aVar = this.j3[length];
            int i2 = aVar.jw;
            if (i2 != -1) {
                if (i2 > i) {
                    throw new ts("Map is unsorted at " + aVar);
                }
                aVar.fY = i - i2;
                i = i2;
            }
        }
    }
}
