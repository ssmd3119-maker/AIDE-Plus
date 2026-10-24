package abcd;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rj extends uk {
    private final bq VH;
    private final ArrayList<bq> Zo;
    private final int gn;
    private final int u7;
    private final wj v5;

    public rj(wp wpVar, wj wjVar, ArrayList<bq> arrayList, bq bqVar) {
        super(wpVar, rp.jw);
        if (wjVar == null) {
            throw new NullPointerException("user == null");
        }
        if (arrayList == null) {
            throw new NullPointerException("values == null");
        }
        if (arrayList.size() <= 0) {
            throw new IllegalArgumentException("Illegal number of init values");
        }
        this.VH = bqVar;
        if (bqVar == zq.Q6 || bqVar == zq.n5) {
            this.gn = 1;
        } else if (bqVar == zq.sE || bqVar == zq.kf) {
            this.gn = 2;
        } else if (bqVar == zq.e3 || bqVar == zq.iW) {
            this.gn = 4;
        } else {
            if (bqVar != zq.eU && bqVar != zq.Jl) {
                throw new IllegalArgumentException("Unexpected constant type");
            }
            this.gn = 8;
        }
        this.v5 = wjVar;
        this.Zo = arrayList;
        this.u7 = arrayList.size();
    }

    @Override // abcd.zj
    public int DW() {
        return (((this.u7 * this.gn) + 1) / 2) + 4;
    }

    @Override // abcd.zj
    public String XL(boolean z) {
        int iZo = this.v5.Zo();
        StringBuffer stringBuffer = new StringBuffer(100);
        int size = this.Zo.size();
        stringBuffer.append("fill-array-data-payload // for fill-array-data @ ");
        stringBuffer.append(xs.VH(iZo));
        for (int i = 0; i < size; i++) {
            stringBuffer.append("\n  ");
            stringBuffer.append(i);
            stringBuffer.append(": ");
            stringBuffer.append(this.Zo.get(i).Zo());
        }
        return stringBuffer.toString();
    }

    @Override // abcd.zj
    public zj a8(rp rpVar) {
        return new rj(EQ(), this.v5, this.Zo, this.VH);
    }

    @Override // abcd.zj
    public String j6() {
        StringBuffer stringBuffer = new StringBuffer(100);
        int size = this.Zo.size();
        for (int i = 0; i < size; i++) {
            stringBuffer.append("\n    ");
            stringBuffer.append(i);
            stringBuffer.append(": ");
            stringBuffer.append(this.Zo.get(i).Zo());
        }
        return stringBuffer.toString();
    }

    @Override // abcd.zj
    public void lg(ls lsVar) {
        int size = this.Zo.size();
        lsVar.writeShort(768);
        lsVar.writeShort(this.gn);
        lsVar.writeInt(this.u7);
        int i = this.gn;
        if (i == 1) {
            for (int i2 = 0; i2 < size; i2++) {
                lsVar.writeByte((byte) ((qq) this.Zo.get(i2)).aM());
            }
        } else if (i == 2) {
            for (int i3 = 0; i3 < size; i3++) {
                lsVar.writeShort((short) ((qq) this.Zo.get(i3)).aM());
            }
        } else if (i == 4) {
            for (int i4 = 0; i4 < size; i4++) {
                lsVar.writeInt(((qq) this.Zo.get(i4)).aM());
            }
        } else if (i == 8) {
            for (int i5 = 0; i5 < size; i5++) {
                lsVar.writeLong(((rq) this.Zo.get(i5)).Mr());
            }
        }
        if (this.gn != 1 || size % 2 == 0) {
            return;
        }
        lsVar.writeByte(0);
    }
}
