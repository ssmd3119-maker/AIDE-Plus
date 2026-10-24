package abcd;

import com.google.android.gms.ads.d;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@Deprecated
/* loaded from: classes.dex */
public final class ku {
    private final d j6;
    public static final ku DW = new ku(-1, -2, "mb");
    public static final ku FH = new ku(ModuleDescriptor.MODULE_VERSION, 50, "mb");
    public static final ku Hw = new ku(300, 250, "as");
    public static final ku v5 = new ku(468, 60, "as");
    public static final ku Zo = new ku(728, 90, "as");
    public static final ku VH = new ku(160, 600, "as");

    public ku(d dVar) {
        this.j6 = dVar;
    }

    public final int DW() {
        return this.j6.FH();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ku) {
            return this.j6.equals(((ku) obj).j6);
        }
        return false;
    }

    public final int hashCode() {
        return this.j6.hashCode();
    }

    public final int j6() {
        return this.j6.j6();
    }

    public final String toString() {
        return this.j6.toString();
    }

    private ku(int i, int i2, String str) {
        this(new d(i, i2));
    }
}
