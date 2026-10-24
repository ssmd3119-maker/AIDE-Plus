package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public class b {
    public static void DW(Parcel parcel, int i) {
        rN(parcel, i);
    }

    public static void EQ(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                er(parcel, i, 0);
                return;
            }
            return;
        }
        int iA8 = a8(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(list.get(i2).intValue());
        }
        rN(parcel, iA8);
    }

    public static void FH(Parcel parcel, int i, boolean z) {
        er(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void Hw(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                er(parcel, i, 0);
            }
        } else {
            int iA8 = a8(parcel, i);
            parcel.writeBundle(bundle);
            rN(parcel, iA8);
        }
    }

    public static void J0(Parcel parcel, int i, long j) {
        er(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void J8(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            er(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            er(parcel, i, 0);
        }
    }

    public static <T extends Parcelable> void Mr(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                er(parcel, i, 0);
                return;
            }
            return;
        }
        int iA8 = a8(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                lg(parcel, t, i2);
            }
        }
        rN(parcel, iA8);
    }

    public static void QX(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                er(parcel, i, 0);
            }
        } else {
            int iA8 = a8(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            rN(parcel, iA8);
        }
    }

    public static <T extends Parcelable> void U2(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                er(parcel, i, 0);
                return;
            }
            return;
        }
        int iA8 = a8(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                lg(parcel, t, 0);
            }
        }
        rN(parcel, iA8);
    }

    public static void VH(Parcel parcel, int i, float f) {
        er(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void Ws(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 == null) {
            if (z) {
                er(parcel, i, 0);
            }
        } else {
            int iA8 = a8(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            rN(parcel, iA8);
        }
    }

    public static void XL(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                er(parcel, i, 0);
            }
        } else {
            int iA8 = a8(parcel, i);
            parcel.writeString(str);
            rN(parcel, iA8);
        }
    }

    public static void Zo(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            er(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            er(parcel, i, 0);
        }
    }

    private static int a8(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void aM(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                er(parcel, i, 0);
            }
        } else {
            int iA8 = a8(parcel, i);
            parcel.writeStringArray(strArr);
            rN(parcel, iA8);
        }
    }

    private static void er(Parcel parcel, int i, int i2) {
        if (i2 < 65535) {
            parcel.writeInt(i | (i2 << 16));
        } else {
            parcel.writeInt(i | (-65536));
            parcel.writeInt(i2);
        }
    }

    public static void gn(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            er(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            er(parcel, i, 0);
        }
    }

    public static void j3(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                er(parcel, i, 0);
            }
        } else {
            int iA8 = a8(parcel, i);
            parcel.writeStringList(list);
            rN(parcel, iA8);
        }
    }

    public static int j6(Parcel parcel) {
        return a8(parcel, 20293);
    }

    private static <T extends Parcelable> void lg(Parcel parcel, T t, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    private static void rN(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void tp(Parcel parcel, int i, int i2) {
        er(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void u7(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                er(parcel, i, 0);
            }
        } else {
            int iA8 = a8(parcel, i);
            parcel.writeStrongBinder(iBinder);
            rN(parcel, iA8);
        }
    }

    public static void v5(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                er(parcel, i, 0);
            }
        } else {
            int iA8 = a8(parcel, i);
            parcel.writeByteArray(bArr);
            rN(parcel, iA8);
        }
    }

    public static void we(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            er(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            er(parcel, i, 0);
        }
    }
}
