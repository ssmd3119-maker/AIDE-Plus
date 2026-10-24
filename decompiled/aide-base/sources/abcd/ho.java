package abcd;

import abcd.no;

/* loaded from: classes.dex */
public final class ho implements Comparable<ho> {
    private final co WB;
    private final int fY;
    private final int jw;
    private final int mb;

    public ho(co coVar, int i, int i2, int i3) {
        this.WB = coVar;
        this.mb = i;
        this.jw = i2;
        this.fY = i3;
    }

    public int DW() {
        return this.mb;
    }

    public int FH() {
        return this.fY;
    }

    public void Zo(no.b bVar) {
        bVar.sh(this.mb);
        bVar.sh(this.jw);
        bVar.writeInt(this.fY);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ho.class != obj.getClass()) {
            return false;
        }
        ho hoVar = (ho) obj;
        return this.mb == hoVar.mb && this.fY == hoVar.fY && this.jw == hoVar.jw;
    }

    public int hashCode() {
        return ((((this.mb + 31) * 31) + this.fY) * 31) + this.jw;
    }

    @Override // java.lang.Comparable
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public int compareTo(ho hoVar) {
        int i = this.mb;
        int i2 = hoVar.mb;
        if (i != i2) {
            return mt.j6(i, i2);
        }
        int i3 = this.fY;
        int i4 = hoVar.fY;
        return i3 != i4 ? mt.j6(i3, i4) : mt.j6(this.jw, hoVar.jw);
    }

    public String toString() {
        if (this.WB == null) {
            return this.mb + " " + this.jw + " " + this.fY;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.WB.j3().get(this.mb));
        sb.append(".");
        sb.append(this.WB.aM().get(this.fY));
        co coVar = this.WB;
        sb.append(coVar.XL(coVar.J8().get(this.jw).DW()));
        return sb.toString();
    }

    public int v5() {
        return this.jw;
    }
}
