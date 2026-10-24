package abcd;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class sv extends WeakReference<Throwable> {
    private final int j6;

    public sv(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.j6 = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == sv.class) {
            if (this == obj) {
                return true;
            }
            sv svVar = (sv) obj;
            if (this.j6 == svVar.j6 && get() == svVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.j6;
    }
}
