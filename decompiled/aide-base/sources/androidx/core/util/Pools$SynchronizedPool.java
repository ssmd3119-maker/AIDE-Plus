package androidx.core.util;

/* loaded from: classes.dex */
public class Pools$SynchronizedPool<T> extends Pools$SimplePool<T> {
    private final Object FH;

    public Pools$SynchronizedPool(int i) {
        super(i);
        this.FH = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool
    public boolean DW(T t) {
        boolean zDW;
        synchronized (this.FH) {
            zDW = super.DW(t);
        }
        return zDW;
    }
}
