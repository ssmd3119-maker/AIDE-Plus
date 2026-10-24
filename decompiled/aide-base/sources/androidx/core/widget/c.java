package androidx.core.widget;

import android.os.Build;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class c {
    static final f j6;

    static class a extends f {
        a() {
        }
    }

    static class b extends a {
        b() {
        }
    }

    /* renamed from: androidx.core.widget.c$c, reason: collision with other inner class name */
    static class C0032c extends b {
        C0032c() {
        }
    }

    static class d extends C0032c {
        d() {
        }

        @Override // androidx.core.widget.c.f
        public void j6(TextView textView, int i) {
            textView.setTextAppearance(i);
        }
    }

    static class e extends d {
        e() {
        }
    }

    static class f {
        f() {
        }

        public void j6(TextView textView, int i) {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            j6 = new e();
            return;
        }
        if (i >= 23) {
            j6 = new d();
            return;
        }
        if (i >= 18) {
            j6 = new C0032c();
            return;
        }
        if (i >= 17) {
            j6 = new b();
        } else if (i >= 16) {
            j6 = new a();
        } else {
            j6 = new f();
        }
    }

    public static void j6(TextView textView, int i) {
        j6.j6(textView, i);
    }
}
