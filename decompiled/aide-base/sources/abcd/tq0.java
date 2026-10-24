package abcd;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import tv.ouya.console.api.g;

/* loaded from: classes.dex */
public class tq0<T> {
    private g<T> j6;

    class a implements Runnable {
        final /* synthetic */ Object WB;

        public a(Object obj) {
            this.WB = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            tq0.this.j6.j6(this.WB);
        }
    }

    class b implements Runnable {
        final /* synthetic */ int WB;
        final /* synthetic */ Bundle jw;
        final /* synthetic */ String mb;

        public b(int i, String str, Bundle bundle) {
            this.WB = i;
            this.mb = str;
            this.jw = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            tq0.this.j6.gG(this.WB, this.mb, this.jw);
        }
    }

    class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            tq0.this.j6.nw();
        }
    }

    public tq0(g<T> gVar) {
        this.j6 = gVar;
    }

    public void DW() {
        new Handler(Looper.getMainLooper()).post(new c());
    }

    public void FH(int i, String str, Bundle bundle) {
        new Handler(Looper.getMainLooper()).post(new b(i, str, bundle));
    }

    public void Hw(T t) {
        new Handler(Looper.getMainLooper()).post(new a(t));
    }
}
