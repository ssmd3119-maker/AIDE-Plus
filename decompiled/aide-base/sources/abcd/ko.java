package abcd;

import abcd.no;

/* loaded from: classes.dex */
public final class ko implements Comparable<ko> {
    private final co WB;
    private final int fY;
    private final int jw;
    private final int mb;

    public ko(co coVar, int i, int i2, int i3) {
        this.WB = coVar;
        this.mb = i;
        this.jw = i2;
        this.fY = i3;
    }

    public int DW() {
        return this.fY;
    }

    public int FH() {
        return this.jw;
    }

    public void Zo(no.b bVar) {
        bVar.writeInt(this.mb);
        bVar.writeInt(this.jw);
        bVar.writeInt(this.fY);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ko.class != obj.getClass()) {
            return false;
        }
        ko koVar = (ko) obj;
        return this.fY == koVar.fY && this.jw == koVar.jw && this.mb == koVar.mb;
    }

    public int hashCode() {
        return ((((this.fY + 31) * 31) + this.jw) * 31) + this.mb;
    }

    @Override // java.lang.Comparable
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public int compareTo(ko koVar) {
        int i = this.jw;
        int i2 = koVar.jw;
        return i != i2 ? mt.j6(i, i2) : mt.j6(this.fY, koVar.fY);
    }

    public String toString() {
        if (this.WB == null) {
            return this.mb + " " + this.jw + " " + this.fY;
        }
        return this.WB.aM().get(this.mb) + ": " + this.WB.j3().get(this.jw) + " " + this.WB.XL(this.fY);
    }

    public int v5() {
        return this.mb;
    }
}
