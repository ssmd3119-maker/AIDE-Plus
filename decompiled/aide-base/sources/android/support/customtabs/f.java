package android.support.customtabs;

import android.os.IBinder;

/* loaded from: classes.dex */
public class f {
    private final ICustomTabsCallback j6;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(ICustomTabsCallback iCustomTabsCallback) {
        this.j6 = iCustomTabsCallback;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).j6().equals(this.j6.asBinder());
        }
        return false;
    }

    public int hashCode() {
        return j6().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IBinder j6() {
        return this.j6.asBinder();
    }
}
