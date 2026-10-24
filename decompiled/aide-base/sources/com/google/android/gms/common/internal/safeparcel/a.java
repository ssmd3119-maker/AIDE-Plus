package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {

    /* renamed from: com.google.android.gms.common.internal.safeparcel.a$a, reason: collision with other inner class name */
    public static class C0113a extends RuntimeException {
        public C0113a(String str, Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int iDataSize = parcel.dataSize();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(iDataPosition);
            sb.append(" size=");
            sb.append(iDataSize);
            super(sb.toString());
        }
    }

    public static int BT(Parcel parcel) {
        return parcel.readInt();
    }

    public static BigDecimal[] DW(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArrCreateByteArray = parcel.createByteArray();
            bigDecimalArr[i3] = new BigDecimal(new BigInteger(bArrCreateByteArray), parcel.readInt());
        }
        parcel.setDataPosition(iDataPosition + iKD);
        return bigDecimalArr;
    }

    public static ArrayList<Integer> EQ(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iKD);
        return arrayList;
    }

    public static BigInteger FH(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iKD);
        return new BigInteger(bArrCreateByteArray);
    }

    public static BigInteger[] Hw(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bigIntegerArr[i3] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(iDataPosition + iKD);
        return bigIntegerArr;
    }

    public static Parcel J0(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(parcel, iDataPosition, iKD);
        parcel.setDataPosition(iDataPosition + iKD);
        return parcelObtain;
    }

    public static Parcel[] J8(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        Parcel[] parcelArr = new Parcel[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = parcel.readInt();
            if (i4 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i4);
                parcelArr[i3] = parcelObtain;
                parcel.setDataPosition(iDataPosition2 + i4);
            } else {
                parcelArr[i3] = null;
            }
        }
        parcel.setDataPosition(iDataPosition + iKD);
        return parcelArr;
    }

    public static int KD(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static <T> ArrayList<T> Mr(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iKD);
        return arrayListCreateTypedArrayList;
    }

    public static int P8(Parcel parcel, int i) {
        sh(parcel, i, 4);
        return parcel.readInt();
    }

    public static String QX(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iKD);
        return string;
    }

    public static Long SI(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        if (iKD == 0) {
            return null;
        }
        cb(parcel, i, iKD, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static void U2(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new C0113a(sb.toString(), parcel);
    }

    public static byte[] VH(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iKD);
        return bArrCreateByteArray;
    }

    public static <T extends Parcelable> T Ws(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iKD);
        return tCreateFromParcel;
    }

    public static String[] XL(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iKD);
        return strArrCreateStringArray;
    }

    public static Bundle Zo(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iKD);
        return bundle;
    }

    public static int a8(int i) {
        return i & 65535;
    }

    public static ArrayList<String> aM(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iKD);
        return arrayListCreateStringArrayList;
    }

    private static void cb(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(i2);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new C0113a(sb.toString(), parcel);
    }

    public static int cn(Parcel parcel) {
        int iBT = BT(parcel);
        int iKD = KD(parcel, iBT);
        int iDataPosition = parcel.dataPosition();
        if (a8(iBT) != 20293) {
            String strValueOf = String.valueOf(Integer.toHexString(iBT));
            throw new C0113a(strValueOf.length() != 0 ? "Expected object header. Got 0x".concat(strValueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = iKD + iDataPosition;
        if (i >= iDataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new C0113a(sb.toString(), parcel);
    }

    public static Integer ei(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        if (iKD == 0) {
            return null;
        }
        cb(parcel, i, iKD, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static Double er(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        if (iKD == 0) {
            return null;
        }
        cb(parcel, i, iKD, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static Float gW(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        if (iKD == 0) {
            return null;
        }
        cb(parcel, i, iKD, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static double[] gn(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        double[] dArrCreateDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(iDataPosition + iKD);
        return dArrCreateDoubleArray;
    }

    public static <T> T[] j3(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iKD);
        return tArr;
    }

    public static BigDecimal j6(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i2 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iKD);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i2);
    }

    public static boolean lg(Parcel parcel, int i) {
        sh(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static long nw(Parcel parcel, int i) {
        sh(parcel, i, 8);
        return parcel.readLong();
    }

    public static double rN(Parcel parcel, int i) {
        sh(parcel, i, 8);
        return parcel.readDouble();
    }

    public static void ro(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + KD(parcel, i));
    }

    private static void sh(Parcel parcel, int i, int i2) {
        int iKD = KD(parcel, i);
        if (iKD == i2) {
            return;
        }
        String hexString = Integer.toHexString(iKD);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(iKD);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new C0113a(sb.toString(), parcel);
    }

    public static int[] tp(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iKD);
        return iArrCreateIntArray;
    }

    public static float[] u7(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iDataPosition + iKD);
        return fArrCreateFloatArray;
    }

    public static boolean[] v5(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(iDataPosition + iKD);
        return zArrCreateBooleanArray;
    }

    public static IBinder vy(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iKD);
        return strongBinder;
    }

    public static long[] we(Parcel parcel, int i) {
        int iKD = KD(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iKD == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iKD);
        return jArrCreateLongArray;
    }

    public static float yS(Parcel parcel, int i) {
        sh(parcel, i, 4);
        return parcel.readFloat();
    }
}
