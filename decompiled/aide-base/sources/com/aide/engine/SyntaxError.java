package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Parcel;
import android.os.Parcelable;

@cy(clazz = 4104537337278253029L, container = 4104537337278253029L, user = true)
/* loaded from: classes.dex */
public class SyntaxError implements Parcelable {

    @dy(field = -1395323626920611679L)
    public static final Parcelable.Creator<SyntaxError> CREATOR;

    @fy
    private static /* synthetic */ boolean Q6;

    @gy
    private static /* synthetic */ boolean kf;

    @dy(field = -964735278531601000L)
    public String[] AL;

    @dy(field = -1572117008655751591L)
    public int WB;

    @dy(field = 3765820656980352047L)
    public boolean Z1;

    @dy(field = 2963503323435043620L)
    public int cT;

    @dy(field = 3058409974764498993L)
    public int fY;

    @dy(field = 3426155653738123548L)
    public String hK;

    @dy(field = 1484889909909569345L)
    public int jw;

    @dy(field = -1648082486269394704L)
    public int k2;

    @dy(field = -3259808243377446075L)
    public int mb;

    @dy(field = 3855510595584865540L)
    public int n5;

    @dy(field = -1082283873632374608L)
    public int q7;

    @dy(field = -3014902117840034776L)
    public int qp;

    @dy(field = -3109464457189693052L)
    public String w9;

    @dy(field = -1570824228358263368L)
    public String zh;

    @cy(clazz = -3659255028812824408L, container = 4104537337278253029L, user = true)
    static class a implements Parcelable.Creator<SyntaxError> {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 726441751736467500L)
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = 93723924764031300L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public SyntaxError[] newArray(int i) {
            try {
                if (j6) {
                    iy.u7(-184544536702003933L, this, i);
                }
                return new SyntaxError[i];
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, -184544536702003933L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = 6051057104787417303L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public SyntaxError createFromParcel(Parcel parcel) {
            try {
                if (j6) {
                    iy.tp(-1821511552091659120L, this, parcel);
                }
                return new SyntaxError(parcel);
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, -1821511552091659120L, this, parcel);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(SyntaxError.class);
            if (Q6) {
                iy.gn(-2129579614895116965L, null);
            }
            CREATOR = new a();
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, -2129579614895116965L, null);
            }
            throw th;
        }
    }

    @ey(method = 2298938616219087296L)
    public SyntaxError() {
        try {
            if (Q6) {
                iy.gn(-4169368234520153852L, null);
            }
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, -4169368234520153852L, null);
            }
            throw th;
        }
    }

    @ey(method = -5064215773843817136L)
    public String DW() {
        try {
            if (Q6) {
                iy.gn(-3087337363600242633L, this);
            }
            return this.zh;
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, -3087337363600242633L, this);
            }
            throw th;
        }
    }

    @ey(method = 1343297263984798881L)
    public boolean FH() {
        try {
            if (Q6) {
                iy.gn(668889873980152216L, this);
            }
            return this.WB == 400;
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, 668889873980152216L, this);
            }
            throw th;
        }
    }

    @ey(method = 1452650920628581700L)
    public boolean Hw() {
        try {
            if (Q6) {
                iy.gn(759250274641635327L, this);
            }
            return this.WB == 0;
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, 759250274641635327L, this);
            }
            throw th;
        }
    }

    @ey(method = 364864313708115140L)
    public boolean Zo() {
        try {
            if (Q6) {
                iy.gn(3667319843045641327L, this);
            }
            int i = this.WB;
            if (i == 2 || i == 250 || i == 251) {
                return true;
            }
            switch (i) {
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                    return true;
                default:
                    switch (i) {
                        case 200:
                        case 201:
                        case 202:
                        case 203:
                        case 204:
                            return true;
                        default:
                            return false;
                    }
            }
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, 3667319843045641327L, this);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = 62536701808674015L)
    public int describeContents() {
        try {
            if (!Q6) {
                return 0;
            }
            iy.gn(1883471214711647440L, this);
            return 0;
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, 1883471214711647440L, this);
            }
            throw th;
        }
    }

    @ey(method = -1959157861763457496L)
    public String j6() {
        try {
            if (Q6) {
                iy.gn(3406977644717059875L, this);
            }
            return this.zh.replace("</C>", "'").replace("<//C>", "'");
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, 3406977644717059875L, this);
            }
            throw th;
        }
    }

    @ey(method = 1233507777938079436L)
    public boolean v5() {
        try {
            if (Q6) {
                iy.gn(3715574730199035363L, this);
            }
            return this.WB == 500;
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, 3715574730199035363L, this);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = -3011797041490911120L)
    public void writeToParcel(Parcel parcel, int i) {
        try {
            if (Q6) {
                iy.EQ(3627705125535186759L, this, parcel, new Integer(i));
            }
            parcel.writeInt(this.jw);
            parcel.writeInt(this.fY);
            parcel.writeInt(this.qp);
            parcel.writeInt(this.k2);
            parcel.writeString(this.zh);
            if (this.AL == null || this.AL.length <= 0) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(this.AL.length);
                parcel.writeStringArray(this.AL);
            }
            parcel.writeInt(this.WB);
            parcel.writeInt(this.cT);
            parcel.writeInt(this.q7);
            parcel.writeInt(this.Z1 ? 1 : 0);
            parcel.writeInt(this.n5);
            parcel.writeInt(this.mb);
        } catch (Throwable th) {
            if (kf) {
                iy.Mr(th, 3627705125535186759L, this, parcel, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 516208744156896L)
    public SyntaxError(Parcel parcel) {
        try {
            if (Q6) {
                iy.tp(-425723978459130624L, null, parcel);
            }
            this.jw = parcel.readInt();
            this.fY = parcel.readInt();
            this.qp = parcel.readInt();
            this.k2 = parcel.readInt();
            this.zh = parcel.readString();
            int i = parcel.readInt();
            if (i > 0) {
                String[] strArr = new String[i];
                this.AL = strArr;
                parcel.readStringArray(strArr);
            }
            this.WB = parcel.readInt();
            this.cT = parcel.readInt();
            this.q7 = parcel.readInt();
            this.Z1 = parcel.readInt() != 0;
            this.n5 = parcel.readInt();
            this.mb = parcel.readInt();
        } catch (Throwable th) {
            if (kf) {
                iy.j3(th, -425723978459130624L, null, parcel);
            }
            throw th;
        }
    }
}
