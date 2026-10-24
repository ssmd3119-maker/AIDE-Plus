package com.aide.ui.scm;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Parcel;
import android.os.Parcelable;

@cy(clazz = -1458982117399304019L, container = -1458982117399304019L, user = true)
/* loaded from: classes.dex */
public class GitConfiguration implements Parcelable {

    @dy(field = -2250330624680414409L)
    public static final Parcelable.Creator<GitConfiguration> CREATOR;

    @gy
    private static /* synthetic */ boolean k2;

    @fy
    private static /* synthetic */ boolean qp;

    @dy(field = 704316049153402681L)
    public final String WB;

    @dy(field = -41939725413949480L)
    public final boolean fY;

    @dy(field = 1927705098189887457L)
    public final String jw;

    @dy(field = -1761592679286647368L)
    public final String mb;

    @cy(clazz = -5066591561765115200L, container = -1458982117399304019L, user = true)
    static class a implements Parcelable.Creator<GitConfiguration> {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 3296612803728057273L)
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = -357880376341862881L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public GitConfiguration[] newArray(int i) {
            try {
                if (j6) {
                    iy.u7(-4413281326755408075L, this, i);
                }
                return new GitConfiguration[i];
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, -4413281326755408075L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = -748122346556602512L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public GitConfiguration createFromParcel(Parcel parcel) {
            try {
                if (j6) {
                    iy.tp(121103265462682800L, this, parcel);
                }
                return new GitConfiguration(parcel);
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, 121103265462682800L, this, parcel);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(GitConfiguration.class);
            if (qp) {
                iy.gn(185798929975896313L, null);
            }
            CREATOR = new a();
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, 185798929975896313L, null);
            }
            throw th;
        }
    }

    @ey(method = -7238551270743939177L)
    public GitConfiguration(String str, String str2, String str3, boolean z) {
        try {
            if (qp) {
                iy.J0(879103230294466680L, null, str, str2, str3, new Boolean(z));
            }
            this.WB = str;
            this.mb = str2;
            this.jw = str3;
            this.fY = z;
        } catch (Throwable th) {
            if (k2) {
                iy.a8(th, 879103230294466680L, null, str, str2, str3, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = -4133070146400364513L)
    public int describeContents() {
        try {
            if (!qp) {
                return 0;
            }
            iy.gn(-869418057221540036L, this);
            return 0;
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, -869418057221540036L, this);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = 2750439685572124448L)
    public void writeToParcel(Parcel parcel, int i) {
        try {
            if (qp) {
                iy.EQ(-1909739184050860219L, this, parcel, new Integer(i));
            }
            parcel.writeString(this.WB);
            parcel.writeString(this.mb);
            parcel.writeString(this.jw);
            parcel.writeByte(this.fY ? (byte) 1 : (byte) 0);
        } catch (Throwable th) {
            if (k2) {
                iy.Mr(th, -1909739184050860219L, this, parcel, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -7944674061145378320L)
    public GitConfiguration(Parcel parcel) {
        try {
            if (qp) {
                iy.tp(-4127662786821328407L, null, parcel);
            }
            this.WB = parcel.readString();
            this.mb = parcel.readString();
            this.jw = parcel.readString();
            this.fY = parcel.readByte() != 0;
        } catch (Throwable th) {
            if (k2) {
                iy.j3(th, -4127662786821328407L, null, parcel);
            }
            throw th;
        }
    }
}
