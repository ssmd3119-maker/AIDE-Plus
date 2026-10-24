package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class EdgeEffectCompat {
    private static final b j6;

    static class a extends b {
        a() {
        }

        @Override // androidx.core.widget.EdgeEffectCompat.b
        public void j6(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    static class b {
        b() {
        }

        public void j6(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            j6 = new a();
        } else {
            j6 = new b();
        }
    }

    @Deprecated
    public EdgeEffectCompat(Context context) {
        new EdgeEffect(context);
    }

    public static void j6(EdgeEffect edgeEffect, float f, float f2) {
        j6.j6(edgeEffect, f, f2);
    }
}
