package abcd;

import abcd.no;

/* loaded from: classes.dex */
public final class fo implements Comparable<fo> {
    private final co WB;
    private final int fY;
    private final int jw;
    private final int mb;

    public fo(co coVar, int i, int i2, int i3) {
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
        if (obj == null || fo.class != obj.getClass()) {
            return false;
        }
        fo foVar = (fo) obj;
        return this.mb == foVar.mb && this.fY == foVar.fY && this.jw == foVar.jw;
    }

    public int hashCode() {
        return ((((this.mb + 31) * 31) + this.fY) * 31) + this.jw;
    }

    @Override // java.lang.Comparable
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public int compareTo(fo foVar) {
        int i = this.mb;
        int i2 = foVar.mb;
        if (i != i2) {
            return mt.j6(i, i2);
        }
        int i3 = this.fY;
        int i4 = foVar.fY;
        return i3 != i4 ? mt.j6(i3, i4) : mt.j6(this.jw, foVar.jw);
    }

    public String toString() {
        if (this.WB != null) {
            return this.WB.j3().get(this.jw) + "." + this.WB.aM().get(this.fY);
        }
        return this.mb + " " + this.jw + " " + this.fY;
    }

    public int v5() {
        return this.jw;
    }
}
