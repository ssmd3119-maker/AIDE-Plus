package androidx.core.os;

import android.os.Build;
import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class a {
    private InterfaceC0029a DW;
    private Object FH;
    private boolean j6;

    /* renamed from: androidx.core.os.a$a, reason: collision with other inner class name */
    public interface InterfaceC0029a {
        void nw();
    }

    public Object DW() {
        Object obj;
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.FH == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.FH = cancellationSignal;
                if (this.j6) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.FH;
        }
        return obj;
    }

    public boolean FH() {
        boolean z;
        synchronized (this) {
            z = this.j6;
        }
        return z;
    }

    public void Hw() {
        if (FH()) {
            throw new c();
        }
    }

    public void j6() {
        synchronized (this) {
            if (this.j6) {
                return;
            }
            this.j6 = true;
            InterfaceC0029a interfaceC0029a = this.DW;
            Object obj = this.FH;
            if (interfaceC0029a != null) {
                try {
                    interfaceC0029a.nw();
                } catch (Throwable th) {
                    synchronized (this) {
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null && Build.VERSION.SDK_INT >= 16) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                notifyAll();
            }
        }
    }
}
