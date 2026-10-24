package androidx.core.util;

/* loaded from: classes.dex */
public class Pair<F, S> {
    public final S DW;
    public final F j6;

    public Pair(F f, S s) {
        this.j6 = f;
        this.DW = s;
    }

    private static boolean j6(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return j6(pair.j6, this.j6) && j6(pair.DW, this.DW);
    }

    public int hashCode() {
        F f = this.j6;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.DW;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.j6) + " " + String.valueOf(this.DW) + "}";
    }
}
