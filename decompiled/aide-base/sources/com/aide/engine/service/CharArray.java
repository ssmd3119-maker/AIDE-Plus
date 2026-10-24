package com.aide.engine.service;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Parcel;
import android.os.Parcelable;

@cy(clazz = 5712312707494178940L, container = 5712312707494178940L, user = true)
/* loaded from: classes.dex */
public class CharArray implements Parcelable {

    @dy(field = -294114715740442288L)
    public static final Parcelable.Creator<CharArray> CREATOR;

    @gy
    private static /* synthetic */ boolean fY;

    @fy
    private static /* synthetic */ boolean jw;

    @dy(field = 1478128127000376291L)
    public char[] data;

    @dy(field = 830362300206494307L)
    public int mb;

    @cy(clazz = -1376350381107133497L, container = 5712312707494178940L, user = true)
    static class a implements Parcelable.Creator<CharArray> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 2208543953474519840L)
        private CharArray j6 = new CharArray();

        static {
            iy.Zo(a.class);
        }

        @ey(method = 1368312585474363648L)
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = 938928761411144480L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public CharArray[] newArray(int i) {
            try {
                if (DW) {
                    iy.u7(1538617312094971491L, this, i);
                }
                return new CharArray[i];
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 1538617312094971491L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = 2968262216383746075L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public CharArray createFromParcel(Parcel parcel) {
            try {
                if (DW) {
                    iy.tp(61520711382206328L, this, parcel);
                }
                this.j6.j6(parcel);
                return this.j6;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 61520711382206328L, this, parcel);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(CharArray.class);
            if (jw) {
                iy.gn(-1270211534238722889L, null);
            }
            CREATOR = new a();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -1270211534238722889L, null);
            }
            throw th;
        }
    }

    @ey(method = 872021602432239620L)
    public CharArray(int i) {
        try {
            if (jw) {
                iy.u7(-1166809972974596949L, null, i);
            }
            this.data = new char[i];
        } catch (Throwable th) {
            if (fY) {
                iy.j3(th, -1166809972974596949L, null, new Integer(i));
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = -4790803522547273272L)
    public int describeContents() {
        try {
            if (!jw) {
                return 0;
            }
            iy.gn(-2308459040777481608L, this);
            return 0;
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -2308459040777481608L, this);
            }
            throw th;
        }
    }

    @ey(method = 3568420734762984168L)
    public void j6(Parcel parcel) {
        try {
            if (jw) {
                iy.tp(-1078930818633315512L, this, parcel);
            }
            int i = parcel.readInt();
            this.mb = i;
            if (this.data == null || this.data.length < i) {
                this.data = new char[Math.max(10000, (this.mb * 5) / 4)];
            }
            int i2 = this.mb;
            char[] cArr = this.data;
            for (int i3 = 0; i3 < i2; i3++) {
                cArr[i3] = (char) parcel.readInt();
            }
        } catch (Throwable th) {
            if (fY) {
                iy.j3(th, -1078930818633315512L, this, parcel);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = -4332365824248433629L)
    public void writeToParcel(Parcel parcel, int i) {
        try {
            if (jw) {
                iy.EQ(3576736412131544475L, this, parcel, new Integer(i));
            }
            parcel.writeInt(this.mb);
            int i2 = this.mb;
            char[] cArr = this.data;
            for (int i3 = 0; i3 < i2; i3++) {
                parcel.writeInt(cArr[i3]);
            }
        } catch (Throwable th) {
            if (fY) {
                iy.Mr(th, 3576736412131544475L, this, parcel, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3073349674196724205L)
    public CharArray() {
        try {
            if (jw) {
                iy.gn(-395255511354242552L, null);
            }
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -395255511354242552L, null);
            }
            throw th;
        }
    }
}
