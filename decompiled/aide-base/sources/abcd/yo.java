package abcd;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class yo extends gt implements Comparable<yo> {
    public static final yo jw;
    private final TreeMap<zq, wo> mb = new TreeMap<>();

    static {
        yo yoVar = new yo();
        jw = yoVar;
        yoVar.Mr();
    }

    public static yo KD(yo yoVar, wo woVar) {
        yo yoVar2 = new yo();
        yoVar2.vy(yoVar);
        yoVar2.BT(woVar);
        yoVar2.Mr();
        return yoVar2;
    }

    public static yo ro(yo yoVar, yo yoVar2) {
        yo yoVar3 = new yo();
        yoVar3.vy(yoVar);
        yoVar3.vy(yoVar2);
        yoVar3.Mr();
        return yoVar3;
    }

    public void BT(wo woVar) {
        a8();
        if (woVar == null) {
            throw new NullPointerException("annotation == null");
        }
        zq zqVarRo = woVar.ro();
        if (!this.mb.containsKey(zqVarRo)) {
            this.mb.put(zqVarRo, woVar);
            return;
        }
        throw new IllegalArgumentException("duplicate type: " + zqVarRo.Zo());
    }

    @Override // java.lang.Comparable
    /* renamed from: cn, reason: merged with bridge method [inline-methods] */
    public int compareTo(yo yoVar) {
        Iterator<wo> it = this.mb.values().iterator();
        Iterator<wo> it2 = yoVar.mb.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iVy = it.next().compareTo(it2.next());
            if (iVy != 0) {
                return iVy;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof yo) {
            return this.mb.equals(((yo) obj).mb);
        }
        return false;
    }

    public int hashCode() {
        return this.mb.hashCode();
    }

    public Collection<wo> sh() {
        return Collections.unmodifiableCollection(this.mb.values());
    }

    public int size() {
        return this.mb.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("annotations{");
        boolean z = true;
        for (wo woVar : this.mb.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(woVar.Zo());
        }
        sb.append("}");
        return sb.toString();
    }

    public void vy(yo yoVar) {
        a8();
        if (yoVar == null) {
            throw new NullPointerException("toAdd == null");
        }
        Iterator<wo> it = yoVar.mb.values().iterator();
        while (it.hasNext()) {
            BT(it.next());
        }
    }
}
