package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Parcel;
import android.os.Parcelable;
import com.aide.engine.EngineSolution;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = 391151518740039552L, container = 391151518740039552L, user = true)
/* loaded from: classes.dex */
public class EngineSolutionProject implements Parcelable {

    @dy(field = 2465551655512160000L)
    public static final Parcelable.Creator<EngineSolutionProject> CREATOR;

    @gy
    private static /* synthetic */ boolean e3;

    @fy
    private static /* synthetic */ boolean eU;

    @dy(field = -4178124268803884000L)
    final String AL;

    @dy(field = -5090909549022219600L)
    final List<String> Jl;

    @dy(field = -3752871520753642055L)
    final String Q6;

    @dy(field = -3685552844057905725L)
    final boolean Z1;

    @dy(field = -5197613737050178152L)
    final boolean cT;

    @dy(field = 1045174330977364180L)
    final List<EngineSolution.File> fY;

    @dy(field = -5185872104270315585L)
    final String hK;

    @dy(field = 922260892948779735L)
    final List<String> iW;

    @dy(field = -3636871560821791825L)
    final String jw;

    @dy(field = -3019411530363102225L)
    final boolean k2;

    @dy(field = -2185042331979794967L)
    final List<String> kf;

    @dy(field = -620350533856240000L)
    final String mb;

    @dy(field = 5390106072965256180L)
    final boolean n5;

    @dy(field = 1271047730850599840L)
    public final String projectName;

    @dy(field = -136628901621416633L)
    final boolean q7;

    @dy(field = -3096342489270826887L)
    final List<String> qp;

    @dy(field = 7977059701881350784L)
    final String w9;

    @dy(field = 3000432163642673760L)
    final String zh;

    @cy(clazz = -1309651683028731567L, container = 391151518740039552L, user = true)
    static class a implements Parcelable.Creator<EngineSolutionProject> {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -2514856807272023976L)
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = -968667295839216480L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public EngineSolutionProject[] newArray(int i) {
            try {
                if (j6) {
                    iy.u7(4370133248137757009L, this, i);
                }
                return new EngineSolutionProject[i];
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, 4370133248137757009L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = -5250793276520520975L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public EngineSolutionProject createFromParcel(Parcel parcel) {
            try {
                if (j6) {
                    iy.tp(-25947327679206752L, this, parcel);
                }
                return new EngineSolutionProject(parcel);
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, -25947327679206752L, this, parcel);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(EngineSolutionProject.class);
            if (eU) {
                iy.gn(2966433173918126429L, null);
            }
            CREATOR = new a();
        } catch (Throwable th) {
            if (e3) {
                iy.aM(th, 2966433173918126429L, null);
            }
            throw th;
        }
    }

    @ey(method = -7584907126609309504L)
    public EngineSolutionProject(String str, String str2, String str3, List<EngineSolution.File> list, List<String> list2, boolean z, String str4, String str5, String str6, String str7, boolean z2, boolean z3, boolean z4, boolean z5, String str8, List<String> list3, List<String> list4, List<String> list5) {
        List<String> list6;
        String str9;
        if (eU) {
            str9 = str8;
            list6 = list4;
            iy.QX(3401478432796578552L, null, new Object[]{str, str2, str3, list, list2, new Boolean(z), str4, str5, str6, str7, new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5), str9, list3, list6, list5});
        } else {
            list6 = list4;
            str9 = str8;
        }
        this.projectName = str;
        this.mb = str2;
        this.jw = str3;
        this.fY = list;
        this.qp = list2;
        this.k2 = z;
        this.zh = str4;
        this.AL = str5;
        this.w9 = str6;
        this.hK = str7;
        this.cT = z2;
        this.q7 = z3;
        this.Z1 = z4;
        this.n5 = z5;
        this.Q6 = str9;
        this.kf = list3;
        this.Jl = list6;
        this.iW = list5;
    }

    @Override // android.os.Parcelable
    @ey(method = 2242789505791855320L)
    public int describeContents() {
        try {
            if (!eU) {
                return 0;
            }
            iy.gn(-3921742580059231564L, this);
            return 0;
        } catch (Throwable th) {
            if (e3) {
                iy.aM(th, -3921742580059231564L, this);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = -1754616045483368285L)
    public void writeToParcel(Parcel parcel, int i) {
        try {
            if (eU) {
                iy.EQ(-2459182665222252375L, this, parcel, new Integer(i));
            }
            parcel.writeString(this.projectName);
            parcel.writeString(this.mb);
            parcel.writeString(this.jw);
            int i2 = 1;
            parcel.writeInt(this.k2 ? 1 : 0);
            parcel.writeString(this.zh);
            parcel.writeString(this.AL);
            parcel.writeString(this.w9);
            parcel.writeString(this.hK);
            parcel.writeInt(this.cT ? 1 : 0);
            parcel.writeInt(this.q7 ? 1 : 0);
            parcel.writeInt(this.Z1 ? 1 : 0);
            if (!this.n5) {
                i2 = 0;
            }
            parcel.writeInt(i2);
            parcel.writeString(this.Q6);
            parcel.writeList(this.qp);
            parcel.writeList(this.kf);
            parcel.writeList(this.Jl);
            parcel.writeList(this.iW);
            parcel.writeList(this.fY);
        } catch (Throwable th) {
            if (e3) {
                iy.Mr(th, -2459182665222252375L, this, parcel, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -54924251532196657L)
    public EngineSolutionProject(Parcel parcel) {
        try {
            if (eU) {
                iy.tp(5780577176057328785L, null, parcel);
            }
            this.projectName = parcel.readString();
            this.mb = parcel.readString();
            this.jw = parcel.readString();
            boolean z = true;
            this.k2 = parcel.readInt() != 0;
            this.zh = parcel.readString();
            this.AL = parcel.readString();
            this.w9 = parcel.readString();
            this.hK = parcel.readString();
            this.cT = parcel.readInt() != 0;
            this.q7 = parcel.readInt() != 0;
            this.Z1 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            this.n5 = z;
            this.Q6 = parcel.readString();
            ArrayList arrayList = new ArrayList();
            this.qp = arrayList;
            parcel.readList(arrayList, getClass().getClassLoader());
            ArrayList arrayList2 = new ArrayList();
            this.kf = arrayList2;
            parcel.readList(arrayList2, getClass().getClassLoader());
            ArrayList arrayList3 = new ArrayList();
            this.Jl = arrayList3;
            parcel.readList(arrayList3, getClass().getClassLoader());
            ArrayList arrayList4 = new ArrayList();
            this.iW = arrayList4;
            parcel.readList(arrayList4, getClass().getClassLoader());
            ArrayList arrayList5 = new ArrayList();
            this.fY = arrayList5;
            parcel.readList(arrayList5, getClass().getClassLoader());
        } catch (Throwable th) {
            if (e3) {
                iy.j3(th, 5780577176057328785L, null, parcel);
            }
            throw th;
        }
    }
}
