package abcd;

import android.os.Parcel;

/* loaded from: classes.dex */
public class bv {
    static {
        bv.class.getClassLoader();
    }

    private bv() {
    }

    public static boolean DW(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void j6(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }
}
