package androidx.core.util;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<T>] */
/* loaded from: classes.dex */
public class Pools$SimplePool<T> {
    private int DW;
    private final Object[] j6;

    public Pools$SimplePool(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.j6 = new Object[i];
    }

    private boolean j6(T t) {
        for (int i = 0; i < this.DW; i++) {
            if (this.j6[i] == t) {
                return true;
            }
        }
        return false;
    }

    public boolean DW(T t) {
        if (j6(t)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i = this.DW;
        Object[] objArr = this.j6;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.DW = i + 1;
        return true;
    }
}
