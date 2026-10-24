package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = 4131636004103659128L, container = 4131636004103659128L, user = true)
/* loaded from: classes.dex */
public class FindResult implements Parcelable {

    @gy
    private static /* synthetic */ boolean AL;

    @dy(field = -2782790252798705300L)
    public static final Parcelable.Creator<FindResult> CREATOR;

    @fy
    private static /* synthetic */ boolean zh;

    @dy(field = 2617862716626406025L)
    public String WB;

    @dy(field = -107205695704784385L)
    public int fY;

    @dy(field = 3703044070274384364L)
    public int jw;

    @dy(field = 1615646321512249575L)
    public List<Highlighting> k2;

    @dy(field = -2380112807643626256L)
    public int mb;

    @dy(field = -1066641930878863455L)
    public String qp;

    @cy(clazz = -1512089509385046771L, container = 4131636004103659128L, user = true)
    static class a implements Parcelable.Creator<FindResult> {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 3480553265205300003L)
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = -1297807056677206579L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public FindResult[] newArray(int i) {
            try {
                if (j6) {
                    iy.u7(-4812232963057587945L, this, i);
                }
                return new FindResult[i];
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, -4812232963057587945L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = 4896264561546024448L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public FindResult createFromParcel(Parcel parcel) {
            try {
                if (j6) {
                    iy.tp(1647881562290332400L, this, parcel);
                }
                return new FindResult(parcel);
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, 1647881562290332400L, this, parcel);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(FindResult.class);
            if (zh) {
                iy.gn(308728099723557815L, null);
            }
            CREATOR = new a();
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, 308728099723557815L, null);
            }
            throw th;
        }
    }

    @ey(method = -7846604511277082031L)
    public FindResult(Parcel parcel) {
        try {
            if (zh) {
                iy.tp(181932431539894617L, null, parcel);
            }
            this.WB = parcel.readString();
            this.mb = parcel.readInt();
            this.jw = parcel.readInt();
            this.fY = parcel.readInt();
            this.qp = parcel.readString();
            ArrayList arrayList = new ArrayList();
            this.k2 = arrayList;
            parcel.readList(arrayList, getClass().getClassLoader());
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, 181932431539894617L, null, parcel);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = -2962604997471832000L)
    public int describeContents() {
        try {
            if (!zh) {
                return 0;
            }
            iy.gn(-70955149361103960L, this);
            return 0;
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, -70955149361103960L, this);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = 2729556587282554365L)
    public void writeToParcel(Parcel parcel, int i) {
        try {
            if (zh) {
                iy.EQ(388349969111946051L, this, parcel, new Integer(i));
            }
            parcel.writeString(this.WB);
            parcel.writeInt(this.mb);
            parcel.writeInt(this.jw);
            parcel.writeInt(this.fY);
            parcel.writeString(this.qp);
            parcel.writeList(this.k2);
        } catch (Throwable th) {
            if (AL) {
                iy.Mr(th, 388349969111946051L, this, parcel, new Integer(i));
            }
            throw th;
        }
    }

    @cy(clazz = 778079600968353600L, container = 778079600968353600L, user = true)
    public static class Highlighting implements Parcelable {

        @dy(field = 1904446026936993131L)
        public static final Parcelable.Creator<Highlighting> CREATOR;

        @fy
        private static /* synthetic */ boolean k2;

        @gy
        private static /* synthetic */ boolean zh;

        @dy(field = -3557318452770453705L)
        public int WB;

        @dy(field = 1527972123594074112L)
        public int fY;

        @dy(field = 571173212062556604L)
        public int jw;

        @dy(field = 2224530582588110115L)
        public int mb;

        @dy(field = -1854061788880199023L)
        public SyntaxStyleType qp;

        @cy(clazz = 2217115413842951627L, container = 778079600968353600L, user = true)
        static class a implements Parcelable.Creator<Highlighting> {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 2621303191786311415L)
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @ey(method = 1378543106686640265L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public Highlighting[] newArray(int i) {
                try {
                    if (j6) {
                        iy.u7(3409528117642034160L, this, i);
                    }
                    return new Highlighting[i];
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, 3409528117642034160L, this, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // android.os.Parcelable.Creator
            @ey(method = 5606766511968681264L)
            /* renamed from: j6, reason: merged with bridge method [inline-methods] */
            public Highlighting createFromParcel(Parcel parcel) {
                try {
                    if (j6) {
                        iy.tp(165324712187308739L, this, parcel);
                    }
                    return new Highlighting(parcel);
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, 165324712187308739L, this, parcel);
                    }
                    throw th;
                }
            }
        }

        static {
            try {
                iy.Zo(Highlighting.class);
                if (k2) {
                    iy.gn(805180888632971456L, null);
                }
                CREATOR = new a();
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, 805180888632971456L, null);
                }
                throw th;
            }
        }

        @ey(method = -8623597921319240532L)
        public Highlighting(Parcel parcel) {
            try {
                if (k2) {
                    iy.tp(-1293378443263631312L, null, parcel);
                }
                this.WB = parcel.readInt();
                this.mb = parcel.readInt();
                this.jw = parcel.readInt();
                this.fY = parcel.readInt();
                this.qp = SyntaxStyleType.values()[parcel.readInt()];
            } catch (Throwable th) {
                if (zh) {
                    iy.j3(th, -1293378443263631312L, null, parcel);
                }
                throw th;
            }
        }

        @Override // android.os.Parcelable
        @ey(method = -1435427602069465431L)
        public int describeContents() {
            try {
                if (!k2) {
                    return 0;
                }
                iy.gn(2589123821387588315L, this);
                return 0;
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, 2589123821387588315L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Parcelable
        @ey(method = -853616792778776028L)
        public void writeToParcel(Parcel parcel, int i) {
            try {
                if (k2) {
                    iy.EQ(-82214321625205200L, this, parcel, new Integer(i));
                }
                parcel.writeInt(this.WB);
                parcel.writeInt(this.mb);
                parcel.writeInt(this.jw);
                parcel.writeInt(this.fY);
                parcel.writeInt(this.qp.ordinal());
            } catch (Throwable th) {
                if (zh) {
                    iy.Mr(th, -82214321625205200L, this, parcel, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -5050922791709858525L)
        public Highlighting(SyntaxStyleType syntaxStyleType, int i, int i2, int i3, int i4) {
            try {
                if (k2) {
                    iy.J8(-821666881222878387L, null, syntaxStyleType, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                this.qp = syntaxStyleType;
                this.WB = i;
                this.mb = i2;
                this.jw = i3;
                this.fY = i4;
            } catch (Throwable th) {
                if (zh) {
                    iy.lg(th, -821666881222878387L, null, syntaxStyleType, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }
    }

    @ey(method = -870661448093744460L)
    public FindResult(String str, String str2, List<Highlighting> list, int i, int i2, int i3) {
        try {
            if (zh) {
                iy.QX(4681215780995063664L, null, new Object[]{str, str2, list, new Integer(i), new Integer(i2), new Integer(i3)});
            }
            this.k2 = list;
            this.WB = str;
            this.qp = str2;
            this.mb = i;
            this.jw = i2;
            this.fY = i3;
        } catch (Throwable th) {
            if (AL) {
                iy.rN(th, 4681215780995063664L, null, new Object[]{str, str2, list, new Integer(i), new Integer(i2), new Integer(i3)});
            }
            throw th;
        }
    }
}
