package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Parcel;
import android.os.Parcelable;

@cy(clazz = 3446723240032844968L, container = 3446723240032844968L, user = true)
/* loaded from: classes.dex */
public class Modification implements Parcelable {

    @dy(field = -3127641330585447087L)
    public static final Parcelable.Creator<Modification> CREATOR;

    @gy
    private static /* synthetic */ boolean Q6;

    @fy
    private static /* synthetic */ boolean n5;

    @dy(field = -1189838247948170320L)
    private String AL;

    @dy(field = -263671182291956439L)
    private int WB;

    @dy(field = -1948889162170754331L)
    private int Z1;

    @dy(field = 1109694614474438669L)
    private boolean cT;

    @dy(field = 2400759611799706056L)
    private int fY;

    @dy(field = -430244653373895144L)
    private String hK;

    @dy(field = -4418014921143542111L)
    private int jw;

    @dy(field = -440346273695956647L)
    private int k2;

    @dy(field = 2020800317398780305L)
    private int mb;

    @dy(field = -3037445608195187200L)
    private int q7;

    @dy(field = -940804129925646672L)
    private int qp;

    @dy(field = -3129670541408719712L)
    private String w9;

    @dy(field = -5145770204395824007L)
    private int zh;

    @cy(clazz = -2243176322285577535L, container = 3446723240032844968L, user = true)
    static class a implements Parcelable.Creator<Modification> {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -941413025082717176L)
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = -1406769442398784800L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public Modification[] newArray(int i) {
            try {
                if (j6) {
                    iy.u7(3558013867217001465L, this, i);
                }
                return new Modification[i];
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, 3558013867217001465L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = 5356604129413258825L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public Modification createFromParcel(Parcel parcel) {
            try {
                if (j6) {
                    iy.tp(-1214700815501502860L, this, parcel);
                }
                return new Modification(parcel);
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, -1214700815501502860L, this, parcel);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(Modification.class);
            if (n5) {
                iy.gn(80242823927111585L, null);
            }
            CREATOR = new a();
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 80242823927111585L, null);
            }
            throw th;
        }
    }

    @ey(method = 2816276772385005696L)
    public Modification(Parcel parcel) {
        try {
            if (n5) {
                iy.tp(-1712026259454585305L, null, parcel);
            }
            this.WB = parcel.readInt();
            this.mb = parcel.readInt();
            this.jw = parcel.readInt();
            this.fY = parcel.readInt();
            this.qp = parcel.readInt();
            this.k2 = parcel.readInt();
            this.zh = parcel.readInt();
            this.AL = parcel.readString();
            this.w9 = parcel.readString();
            this.hK = parcel.readString();
            this.cT = parcel.readInt() != 0;
            this.q7 = parcel.readInt();
            this.Z1 = parcel.readInt();
        } catch (Throwable th) {
            if (Q6) {
                iy.j3(th, -1712026259454585305L, null, parcel);
            }
            throw th;
        }
    }

    @ey(method = -6293754581599609800L)
    public int DW() {
        try {
            if (n5) {
                iy.gn(5578718193115831119L, this);
            }
            return this.k2;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 5578718193115831119L, this);
            }
            throw th;
        }
    }

    @ey(method = 1271676026725884960L)
    public boolean EQ() {
        try {
            if (n5) {
                iy.gn(-727693308391137375L, this);
            }
            return this.cT;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -727693308391137375L, this);
            }
            throw th;
        }
    }

    @ey(method = -4161456293603096859L)
    public int FH() {
        try {
            if (n5) {
                iy.gn(908305281828104340L, this);
            }
            return this.qp;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 908305281828104340L, this);
            }
            throw th;
        }
    }

    @ey(method = 3858411219008033597L)
    public int Hw() {
        try {
            if (n5) {
                iy.gn(-2319853531225700400L, this);
            }
            return this.fY;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -2319853531225700400L, this);
            }
            throw th;
        }
    }

    @ey(method = 389985568342803632L)
    public String VH() {
        try {
            if (n5) {
                iy.gn(-3767446113837180747L, this);
            }
            return this.w9;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -3767446113837180747L, this);
            }
            throw th;
        }
    }

    @ey(method = 3007557622356565125L)
    public int Zo() {
        try {
            if (n5) {
                iy.gn(-1383028879398413676L, this);
            }
            return this.q7;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -1383028879398413676L, this);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = 2903609527884541449L)
    public int describeContents() {
        try {
            if (!n5) {
                return 0;
            }
            iy.gn(-1329501662847133248L, this);
            return 0;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -1329501662847133248L, this);
            }
            throw th;
        }
    }

    @ey(method = 1331274154910754064L)
    public int gn() {
        try {
            if (n5) {
                iy.gn(-2919301001025607125L, this);
            }
            return this.jw;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -2919301001025607125L, this);
            }
            throw th;
        }
    }

    @ey(method = -5490291847290466920L)
    public int j6() {
        try {
            if (n5) {
                iy.gn(-4901128506597037365L, this);
            }
            return this.zh;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -4901128506597037365L, this);
            }
            throw th;
        }
    }

    @ey(method = 3534000152846978808L)
    public String toString() {
        try {
            if (n5) {
                iy.gn(-2289381195449605537L, this);
            }
            int i = this.WB;
            if (i == 0) {
                return "[REPLACE_TEXT_REGION(" + this.AL + ":" + this.mb + ":" + this.jw + ":" + this.fY + ":" + this.qp + ")to(" + this.w9 + ")]";
            }
            if (i == 1) {
                return "[RENAME_FILE_OR_DIRECTORY(" + this.AL + ")to(" + this.w9 + ")]";
            }
            if (i == 4) {
                return "[MOVE_DIRECTORY_TREE_OR_FILE(" + this.AL + ")to(" + this.hK + ")]";
            }
            if (i == 6) {
                return "[COPY_FILE(" + this.AL + ")to(" + this.hK + ")as(" + this.w9 + ")]";
            }
            if (i != 11) {
                return "";
            }
            return "[INDENT_LINE(" + this.AL + ":" + this.mb + " to " + this.q7 + ")]";
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -2289381195449605537L, this);
            }
            throw th;
        }
    }

    @ey(method = -122209370922695140L)
    public int tp() {
        try {
            if (n5) {
                iy.gn(-2944045661750802413L, this);
            }
            return this.WB;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -2944045661750802413L, this);
            }
            throw th;
        }
    }

    @ey(method = -517397352484420800L)
    public int u7() {
        try {
            if (n5) {
                iy.gn(4248009476871497151L, this);
            }
            return this.mb;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 4248009476871497151L, this);
            }
            throw th;
        }
    }

    @ey(method = -2194629616686131901L)
    public String v5() {
        try {
            if (n5) {
                iy.gn(3481684602110801276L, this);
            }
            return this.AL;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 3481684602110801276L, this);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = 3877578405183721920L)
    public void writeToParcel(Parcel parcel, int i) {
        try {
            if (n5) {
                iy.EQ(-3567740682732812411L, this, parcel, new Integer(i));
            }
            parcel.writeInt(this.WB);
            parcel.writeInt(this.mb);
            parcel.writeInt(this.jw);
            parcel.writeInt(this.fY);
            parcel.writeInt(this.qp);
            parcel.writeInt(this.k2);
            parcel.writeInt(this.zh);
            parcel.writeString(this.AL);
            parcel.writeString(this.w9);
            parcel.writeString(this.hK);
            parcel.writeInt(this.cT ? 1 : 0);
            parcel.writeInt(this.q7);
            parcel.writeInt(this.Z1);
        } catch (Throwable th) {
            if (Q6) {
                iy.Mr(th, -3567740682732812411L, this, parcel, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1057989176421396015L)
    protected Modification(String str, int i, int i2, int i3) {
        try {
            if (n5) {
                iy.J0(834969172627123356L, null, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            this.WB = 11;
            this.AL = str;
            this.mb = i;
            this.q7 = i2;
            this.Z1 = i3;
        } catch (Throwable th) {
            if (Q6) {
                iy.a8(th, 834969172627123356L, null, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 3167013945993260227L)
    protected Modification(String str, String str2, boolean z) {
        try {
            if (n5) {
                iy.we(-14702908828930000L, null, str, str2, new Boolean(z));
            }
            this.WB = 4;
            this.AL = str;
            this.hK = str2;
        } catch (Throwable th) {
            if (Q6) {
                iy.U2(th, -14702908828930000L, null, str, str2, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 281883718166827412L)
    protected Modification(String str, String str2) {
        try {
            if (n5) {
                iy.EQ(-951559279593567225L, null, str, str2);
            }
            this.WB = 1;
            this.AL = str;
            this.w9 = str2;
        } catch (Throwable th) {
            if (Q6) {
                iy.Mr(th, -951559279593567225L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 1139470832484212665L)
    protected Modification(String str, String str2, int i) {
        try {
            if (n5) {
                iy.we(-79804833031807744L, null, str, str2, new Integer(i));
            }
            this.WB = 12;
            this.AL = str;
            this.w9 = str2;
        } catch (Throwable th) {
            if (Q6) {
                iy.U2(th, -79804833031807744L, null, str, str2, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 915357009846018304L)
    protected Modification(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        try {
            if (n5) {
                iy.QX(-358896671880917797L, null, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Integer(i5), new Integer(i6)});
            }
            this.WB = 3;
            this.mb = i;
            this.jw = i2;
            this.fY = i3;
            this.qp = i4;
            this.AL = str;
            this.k2 = i5;
            this.zh = i6;
        } catch (Throwable th) {
            if (Q6) {
                iy.rN(th, -358896671880917797L, null, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Integer(i5), new Integer(i6)});
            }
            throw th;
        }
    }

    @ey(method = 55434027703884907L)
    protected Modification(int i, int i2, int i3, int i4, String str, int i5, int i6, boolean z) {
        try {
            if (n5) {
                iy.QX(1084145101682643504L, null, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Integer(i5), new Integer(i6), new Boolean(z)});
            }
            this.WB = 7;
            this.mb = i;
            this.jw = i2;
            this.fY = i3;
            this.qp = i4;
            this.AL = str;
            this.k2 = i5;
            this.zh = i6;
        } catch (Throwable th) {
            if (Q6) {
                iy.rN(th, 1084145101682643504L, null, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Integer(i5), new Integer(i6), new Boolean(z)});
            }
            throw th;
        }
    }

    @ey(method = -2558710788186326400L)
    protected Modification(int i, int i2, String str) {
        try {
            if (n5) {
                iy.we(-3227534486132760529L, null, new Integer(i), new Integer(i2), str);
            }
            this.WB = 2;
            this.mb = i;
            this.fY = i2;
            this.AL = str;
        } catch (Throwable th) {
            if (Q6) {
                iy.U2(th, -3227534486132760529L, null, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }

    @ey(method = -831672762226879281L)
    protected Modification(int i, int i2, int i3, int i4, String str, String str2, boolean z) {
        try {
            if (n5) {
                iy.QX(-5794075806326522736L, null, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, str2, new Boolean(z)});
            }
            this.WB = 0;
            this.mb = i;
            this.jw = i2;
            this.fY = i3;
            this.qp = i4;
            this.AL = str;
            this.w9 = str2;
            this.cT = z;
        } catch (Throwable th) {
            if (Q6) {
                iy.rN(th, -5794075806326522736L, null, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, str2, new Boolean(z)});
            }
            throw th;
        }
    }

    @ey(method = 4216458559956428544L)
    protected Modification(int i, int i2, int i3, int i4, String str) {
        try {
            if (n5) {
                iy.J8(-4681912751140209403L, null, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str);
            }
            this.WB = 8;
            this.mb = i;
            this.jw = i2;
            this.fY = i3;
            this.qp = i4;
            this.AL = str;
        } catch (Throwable th) {
            if (Q6) {
                iy.lg(th, -4681912751140209403L, null, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str);
            }
            throw th;
        }
    }

    @ey(method = 1907059248687630401L)
    protected Modification(int i, int i2, int i3, int i4, String str, boolean z) {
        try {
            if (n5) {
                iy.QX(-5932235823981092L, null, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Boolean(z)});
            }
            this.WB = 10;
            this.mb = i;
            this.jw = i2;
            this.fY = i3;
            this.qp = i4;
            this.AL = str;
        } catch (Throwable th) {
            if (Q6) {
                iy.rN(th, -5932235823981092L, null, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Boolean(z)});
            }
            throw th;
        }
    }

    @ey(method = -171672862815396585L)
    protected Modification(int i, int i2, String str, boolean z) {
        try {
            if (n5) {
                iy.J0(1563271192647920904L, null, new Integer(i), new Integer(i2), str, new Boolean(z));
            }
            this.WB = 9;
            this.k2 = i;
            this.zh = i2;
            this.AL = str;
        } catch (Throwable th) {
            if (Q6) {
                iy.a8(th, 1563271192647920904L, null, new Integer(i), new Integer(i2), str, new Boolean(z));
            }
            throw th;
        }
    }
}
