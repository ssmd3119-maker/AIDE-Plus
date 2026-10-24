package abcd;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class wo extends gt implements Comparable<wo>, kt {
    private final TreeMap<yq, ap> fY;
    private final xo jw;
    private final zq mb;

    public wo(zq zqVar, xo xoVar) {
        if (zqVar == null) {
            throw new NullPointerException("type == null");
        }
        if (xoVar == null) {
            throw new NullPointerException("visibility == null");
        }
        this.mb = zqVar;
        this.jw = xoVar;
        this.fY = new TreeMap<>();
    }

    public void BT(ap apVar) {
        a8();
        if (apVar == null) {
            throw new NullPointerException("pair == null");
        }
        yq yqVarDW = apVar.DW();
        if (this.fY.get(yqVarDW) == null) {
            this.fY.put(yqVarDW, apVar);
            return;
        }
        throw new IllegalArgumentException("name already added: " + yqVarDW);
    }

    public Collection<ap> KD() {
        return Collections.unmodifiableCollection(this.fY.values());
    }

    @Override // abcd.kt
    public String Zo() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.jw.Zo());
        sb.append("-annotation ");
        sb.append(this.mb.Zo());
        sb.append(" {");
        boolean z = true;
        for (ap apVar : this.fY.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(apVar.DW().Zo());
            sb.append(": ");
            sb.append(apVar.FH().Zo());
        }
        sb.append("}");
        return sb.toString();
    }

    public xo cn() {
        return this.jw;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj;
        if (this.mb.equals(woVar.mb) && this.jw == woVar.jw) {
            return this.fY.equals(woVar.fY);
        }
        return false;
    }

    public int hashCode() {
        return (((this.mb.hashCode() * 31) + this.fY.hashCode()) * 31) + this.jw.hashCode();
    }

    public zq ro() {
        return this.mb;
    }

    public void sh(ap apVar) {
        a8();
        if (apVar == null) {
            throw new NullPointerException("pair == null");
        }
        this.fY.put(apVar.DW(), apVar);
    }

    public String toString() {
        return Zo();
    }

    @Override // java.lang.Comparable
    /* renamed from: vy, reason: merged with bridge method [inline-methods] */
    public int compareTo(wo woVar) {
        int iCompareTo = this.mb.compareTo(woVar.mb);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.jw.compareTo(woVar.jw);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        Iterator<ap> it = this.fY.values().iterator();
        Iterator<ap> it2 = woVar.fY.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo3 = it.next().compareTo(it2.next());
            if (iCompareTo3 != 0) {
                return iCompareTo3;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }
}
