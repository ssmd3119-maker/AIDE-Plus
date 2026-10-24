package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfs implements Parcelable {
    public static final Parcelable.Creator<zzfs> CREATOR = new we0();
    public final List<byte[]> AL;
    private final int Cz;
    public final String Gj;
    private final zzqi Jl;
    private final int Q6;
    public final String WB;
    public final int Z1;
    public final int cT;
    public final int e3;
    public final int eU;
    public final int fN;
    private final zzki fY;
    public final int hK;
    public final int iW;
    public final String jw;
    public final String k2;
    private final byte[] kf;
    public final int mb;
    public final float n5;
    private int pN;
    public final long pO;
    public final float q7;
    public final String qp;
    private final int sE;
    private final int sg;
    public final zzhp w9;
    public final int zh;

    private zzfs(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zzqi zzqiVar, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, zzhp zzhpVar, zzki zzkiVar) {
        this.WB = str;
        this.qp = str2;
        this.k2 = str3;
        this.jw = str4;
        this.mb = i;
        this.zh = i2;
        this.hK = i3;
        this.cT = i4;
        this.q7 = f;
        this.Z1 = i5;
        this.n5 = f2;
        this.kf = bArr;
        this.Q6 = i6;
        this.Jl = zzqiVar;
        this.iW = i7;
        this.eU = i8;
        this.e3 = i9;
        this.sE = i10;
        this.sg = i11;
        this.fN = i12;
        this.Gj = str5;
        this.Cz = i13;
        this.pO = j;
        this.AL = list == null ? Collections.emptyList() : list;
        this.w9 = zzhpVar;
        this.fY = zzkiVar;
    }

    public static zzfs EQ(String str, String str2, String str3, int i, zzhp zzhpVar) {
        return new zzfs(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, zzhpVar, null);
    }

    public static zzfs J0(String str, String str2, String str3, String str4, int i, int i2, int i3, float f, List<byte[]> list, int i4) {
        return new zzfs(str, str2, str3, str4, i, -1, i2, i3, f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, null, -1, Long.MAX_VALUE, null, null, null);
    }

    public static zzfs J8(String str, String str2, String str3, String str4, int i, int i2, int i3, List<byte[]> list, int i4, String str5) {
        return new zzfs(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, -1, -1, -1, i4, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    public static zzfs QX(String str, String str2, String str3, String str4, int i, int i2, String str5, int i3) {
        return new zzfs(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, i3, Long.MAX_VALUE, null, null, null);
    }

    public static zzfs VH(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, zzhp zzhpVar, int i6, String str4) {
        return new zzfs(str, null, str2, null, -1, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, -1, -1, i6, str4, -1, Long.MAX_VALUE, list, zzhpVar, null);
    }

    public static zzfs Ws(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        return new zzfs(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    @TargetApi(16)
    private static void XL(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static zzfs Zo(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, zzqi zzqiVar, zzhp zzhpVar) {
        return new zzfs(str, null, str2, null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zzqiVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, zzhpVar, null);
    }

    public static zzfs gn(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, zzhp zzhpVar, int i5, String str4) {
        return VH(str, str2, null, -1, -1, i3, i4, -1, null, zzhpVar, 0, str4);
    }

    public static zzfs tp(String str, String str2, String str3, int i, int i2, String str4, zzhp zzhpVar) {
        return u7(str, str2, null, -1, i2, str4, -1, zzhpVar, Long.MAX_VALUE, Collections.emptyList());
    }

    public static zzfs u7(String str, String str2, String str3, int i, int i2, String str4, int i3, zzhp zzhpVar, long j, List<byte[]> list) {
        return new zzfs(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zzhpVar, null);
    }

    public static zzfs v5(String str, String str2, long j) {
        return new zzfs(null, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
    }

    public static zzfs we(String str, String str2, String str3, int i, List<byte[]> list, String str4, zzhp zzhpVar) {
        return new zzfs(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzhpVar, null);
    }

    public final zzfs DW(zzfs zzfsVar) {
        if (this == zzfsVar) {
            return this;
        }
        String str = zzfsVar.WB;
        String str2 = this.jw;
        if (str2 == null) {
            str2 = zzfsVar.jw;
        }
        String str3 = str2;
        int i = this.mb;
        if (i == -1) {
            i = zzfsVar.mb;
        }
        int i2 = i;
        float f = this.q7;
        if (f == -1.0f) {
            f = zzfsVar.q7;
        }
        float f2 = f;
        int i3 = this.fN | zzfsVar.fN;
        String str4 = this.Gj;
        if (str4 == null) {
            str4 = zzfsVar.Gj;
        }
        String str5 = str4;
        zzhp zzhpVar = zzfsVar.w9;
        if (zzhpVar == null) {
            zzhpVar = this.w9;
        }
        return new zzfs(str, this.qp, this.k2, str3, i2, this.zh, this.hK, this.cT, f2, this.Z1, this.n5, this.kf, this.Q6, this.Jl, this.iW, this.eU, this.e3, this.sE, this.sg, i3, str5, this.Cz, this.pO, this.AL, zzhpVar, this.fY);
    }

    public final zzfs FH(zzhp zzhpVar) {
        return new zzfs(this.WB, this.qp, this.k2, this.jw, this.mb, this.zh, this.hK, this.cT, this.q7, this.Z1, this.n5, this.kf, this.Q6, this.Jl, this.iW, this.eU, this.e3, this.sE, this.sg, this.fN, this.Gj, this.Cz, this.pO, this.AL, zzhpVar, this.fY);
    }

    public final zzfs Hw(zzki zzkiVar) {
        return new zzfs(this.WB, this.qp, this.k2, this.jw, this.mb, this.zh, this.hK, this.cT, this.q7, this.Z1, this.n5, this.kf, this.Q6, this.Jl, this.iW, this.eU, this.e3, this.sE, this.sg, this.fN, this.Gj, this.Cz, this.pO, this.AL, this.w9, zzkiVar);
    }

    public final zzfs Mr(int i) {
        return new zzfs(this.WB, this.qp, this.k2, this.jw, this.mb, i, this.hK, this.cT, this.q7, this.Z1, this.n5, this.kf, this.Q6, this.Jl, this.iW, this.eU, this.e3, this.sE, this.sg, this.fN, this.Gj, this.Cz, this.pO, this.AL, this.w9, this.fY);
    }

    public final zzfs U2(long j) {
        return new zzfs(this.WB, this.qp, this.k2, this.jw, this.mb, this.zh, this.hK, this.cT, this.q7, this.Z1, this.n5, this.kf, this.Q6, this.Jl, this.iW, this.eU, this.e3, this.sE, this.sg, this.fN, this.Gj, this.Cz, j, this.AL, this.w9, this.fY);
    }

    public final int aM() {
        int i;
        int i2 = this.hK;
        if (i2 == -1 || (i = this.cT) == -1) {
            return -1;
        }
        return i2 * i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfs.class == obj.getClass()) {
            zzfs zzfsVar = (zzfs) obj;
            if (this.mb == zzfsVar.mb && this.zh == zzfsVar.zh && this.hK == zzfsVar.hK && this.cT == zzfsVar.cT && this.q7 == zzfsVar.q7 && this.Z1 == zzfsVar.Z1 && this.n5 == zzfsVar.n5 && this.Q6 == zzfsVar.Q6 && this.iW == zzfsVar.iW && this.eU == zzfsVar.eU && this.e3 == zzfsVar.e3 && this.sE == zzfsVar.sE && this.sg == zzfsVar.sg && this.pO == zzfsVar.pO && this.fN == zzfsVar.fN && ip0.u7(this.WB, zzfsVar.WB) && ip0.u7(this.Gj, zzfsVar.Gj) && this.Cz == zzfsVar.Cz && ip0.u7(this.qp, zzfsVar.qp) && ip0.u7(this.k2, zzfsVar.k2) && ip0.u7(this.jw, zzfsVar.jw) && ip0.u7(this.w9, zzfsVar.w9) && ip0.u7(this.fY, zzfsVar.fY) && ip0.u7(this.Jl, zzfsVar.Jl) && Arrays.equals(this.kf, zzfsVar.kf) && this.AL.size() == zzfsVar.AL.size()) {
                for (int i = 0; i < this.AL.size(); i++) {
                    if (!Arrays.equals(this.AL.get(i), zzfsVar.AL.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.pN == 0) {
            String str = this.WB;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.qp;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.k2;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.jw;
            int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.mb) * 31) + this.hK) * 31) + this.cT) * 31) + this.iW) * 31) + this.eU) * 31;
            String str5 = this.Gj;
            int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.Cz) * 31;
            zzhp zzhpVar = this.w9;
            int iHashCode6 = (iHashCode5 + (zzhpVar == null ? 0 : zzhpVar.hashCode())) * 31;
            zzki zzkiVar = this.fY;
            this.pN = iHashCode6 + (zzkiVar != null ? zzkiVar.hashCode() : 0);
        }
        return this.pN;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat j3() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.k2);
        String str = this.Gj;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        XL(mediaFormat, "max-input-size", this.zh);
        XL(mediaFormat, "width", this.hK);
        XL(mediaFormat, "height", this.cT);
        float f = this.q7;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        XL(mediaFormat, "rotation-degrees", this.Z1);
        XL(mediaFormat, "channel-count", this.iW);
        XL(mediaFormat, "sample-rate", this.eU);
        XL(mediaFormat, "encoder-delay", this.sE);
        XL(mediaFormat, "encoder-padding", this.sg);
        for (int i = 0; i < this.AL.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.AL.get(i)));
        }
        zzqi zzqiVar = this.Jl;
        if (zzqiVar != null) {
            XL(mediaFormat, "color-transfer", zzqiVar.jw);
            XL(mediaFormat, "color-standard", zzqiVar.WB);
            XL(mediaFormat, "color-range", zzqiVar.mb);
            byte[] bArr = zzqiVar.fY;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final zzfs j6(int i, int i2) {
        return new zzfs(this.WB, this.qp, this.k2, this.jw, this.mb, this.zh, this.hK, this.cT, this.q7, this.Z1, this.n5, this.kf, this.Q6, this.Jl, this.iW, this.eU, this.e3, i, i2, this.fN, this.Gj, this.Cz, this.pO, this.AL, this.w9, this.fY);
    }

    public final String toString() {
        String str = this.WB;
        String str2 = this.qp;
        String str3 = this.k2;
        int i = this.mb;
        String str4 = this.Gj;
        int i2 = this.hK;
        int i3 = this.cT;
        float f = this.q7;
        int i4 = this.iW;
        int i5 = this.eU;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.WB);
        parcel.writeString(this.qp);
        parcel.writeString(this.k2);
        parcel.writeString(this.jw);
        parcel.writeInt(this.mb);
        parcel.writeInt(this.zh);
        parcel.writeInt(this.hK);
        parcel.writeInt(this.cT);
        parcel.writeFloat(this.q7);
        parcel.writeInt(this.Z1);
        parcel.writeFloat(this.n5);
        parcel.writeInt(this.kf != null ? 1 : 0);
        byte[] bArr = this.kf;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.Q6);
        parcel.writeParcelable(this.Jl, i);
        parcel.writeInt(this.iW);
        parcel.writeInt(this.eU);
        parcel.writeInt(this.e3);
        parcel.writeInt(this.sE);
        parcel.writeInt(this.sg);
        parcel.writeInt(this.fN);
        parcel.writeString(this.Gj);
        parcel.writeInt(this.Cz);
        parcel.writeLong(this.pO);
        int size = this.AL.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.AL.get(i2));
        }
        parcel.writeParcelable(this.w9, 0);
        parcel.writeParcelable(this.fY, 0);
    }

    zzfs(Parcel parcel) {
        this.WB = parcel.readString();
        this.qp = parcel.readString();
        this.k2 = parcel.readString();
        this.jw = parcel.readString();
        this.mb = parcel.readInt();
        this.zh = parcel.readInt();
        this.hK = parcel.readInt();
        this.cT = parcel.readInt();
        this.q7 = parcel.readFloat();
        this.Z1 = parcel.readInt();
        this.n5 = parcel.readFloat();
        this.kf = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.Q6 = parcel.readInt();
        this.Jl = (zzqi) parcel.readParcelable(zzqi.class.getClassLoader());
        this.iW = parcel.readInt();
        this.eU = parcel.readInt();
        this.e3 = parcel.readInt();
        this.sE = parcel.readInt();
        this.sg = parcel.readInt();
        this.fN = parcel.readInt();
        this.Gj = parcel.readString();
        this.Cz = parcel.readInt();
        this.pO = parcel.readLong();
        int i = parcel.readInt();
        this.AL = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.AL.add(parcel.createByteArray());
        }
        this.w9 = (zzhp) parcel.readParcelable(zzhp.class.getClassLoader());
        this.fY = (zzki) parcel.readParcelable(zzki.class.getClassLoader());
    }
}
