package com.aide.ui.scm;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Parcel;
import android.os.Parcelable;

@cy(clazz = -3685332166428264928L, container = -3685332166428264928L, user = true)
/* loaded from: classes.dex */
public class ModifiedFile implements Parcelable {

    @dy(field = 2508993259945662305L)
    public static final Parcelable.Creator<ModifiedFile> CREATOR;

    @gy
    private static /* synthetic */ boolean fY;

    @fy
    private static /* synthetic */ boolean jw;

    @dy(field = -110429986751788320L)
    public final String WB;

    @dy(field = 98835543939873351L)
    public final int mb;

    @cy(clazz = 5157835694321800413L, container = -3685332166428264928L, user = true)
    static class a implements Parcelable.Creator<ModifiedFile> {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -2057970665038285760L)
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = -1248556244831702120L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public ModifiedFile[] newArray(int i) {
            try {
                if (j6) {
                    iy.u7(-5365741217153926839L, this, i);
                }
                return new ModifiedFile[i];
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, -5365741217153926839L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = 4958151714240089417L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public ModifiedFile createFromParcel(Parcel parcel) {
            try {
                if (j6) {
                    iy.tp(-2188084810835238240L, this, parcel);
                }
                return new ModifiedFile(parcel);
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, -2188084810835238240L, this, parcel);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(ModifiedFile.class);
            if (jw) {
                iy.gn(-2127181596935992395L, null);
            }
            CREATOR = new a();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -2127181596935992395L, null);
            }
            throw th;
        }
    }

    @ey(method = -47103349767776661L)
    public ModifiedFile(String str, int i) {
        try {
            if (jw) {
                iy.EQ(-2713532887566778283L, null, str, new Integer(i));
            }
            this.WB = str;
            this.mb = i;
        } catch (Throwable th) {
            if (fY) {
                iy.Mr(th, -2713532887566778283L, null, str, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1218884958925530480L)
    public boolean DW() {
        try {
            if (jw) {
                iy.gn(1699161796823953605L, this);
            }
            return (this.mb & 1) != 0;
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 1699161796823953605L, this);
            }
            throw th;
        }
    }

    @ey(method = 3146147212551349280L)
    public boolean FH() {
        try {
            if (jw) {
                iy.gn(2341259825944939177L, this);
            }
            return (this.mb & 2) != 0;
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 2341259825944939177L, this);
            }
            throw th;
        }
    }

    @ey(method = 3334936259208520764L)
    public boolean Hw() {
        try {
            if (jw) {
                iy.gn(-2412247080641203701L, this);
            }
            return (this.mb & 64) != 0;
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -2412247080641203701L, this);
            }
            throw th;
        }
    }

    @ey(method = -584722919260626832L)
    public boolean VH() {
        try {
            if (jw) {
                iy.gn(-1244044106580671643L, this);
            }
            return (this.mb & 4) != 0;
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -1244044106580671643L, this);
            }
            throw th;
        }
    }

    @ey(method = 628158254620273833L)
    public boolean Zo() {
        try {
            if (jw) {
                iy.gn(3494945443422642688L, this);
            }
            return (this.mb & 16) != 0;
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 3494945443422642688L, this);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = 2349512137177256725L)
    public int describeContents() {
        try {
            if (!jw) {
                return 0;
            }
            iy.gn(2766844239460399812L, this);
            return 0;
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 2766844239460399812L, this);
            }
            throw th;
        }
    }

    @ey(method = -4179468748946693329L)
    public boolean gn() {
        try {
            if (jw) {
                iy.gn(526371838696924160L, this);
            }
            return (this.mb & 32) != 0;
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 526371838696924160L, this);
            }
            throw th;
        }
    }

    @ey(method = -2247196809007953327L)
    public String j6() {
        try {
            if (jw) {
                iy.gn(-3135486143350736176L, this);
            }
            StringBuilder sb = new StringBuilder();
            if (DW()) {
                sb.append("added, ");
            }
            if (FH()) {
                sb.append("changed, ");
            }
            if (VH()) {
                sb.append("removed, ");
            }
            if (v5()) {
                sb.append("missing, ");
            }
            if (Zo()) {
                sb.append("modified, ");
            }
            if (gn()) {
                sb.append("untracked, ");
            }
            if (Hw()) {
                sb.append("conflicting, ");
            }
            if (sb.length() != 0) {
                sb.setLength(sb.length() - 2);
            }
            return sb.toString();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -3135486143350736176L, this);
            }
            throw th;
        }
    }

    @ey(method = -1924375492568326784L)
    public boolean v5() {
        try {
            if (jw) {
                iy.gn(-2530485829208135817L, this);
            }
            return (this.mb & 8) != 0;
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -2530485829208135817L, this);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = -118199795341376708L)
    public void writeToParcel(Parcel parcel, int i) {
        try {
            if (jw) {
                iy.EQ(-2584402057559894879L, this, parcel, new Integer(i));
            }
            parcel.writeInt(this.mb);
            parcel.writeString(this.WB);
        } catch (Throwable th) {
            if (fY) {
                iy.Mr(th, -2584402057559894879L, this, parcel, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 7594596195676093940L)
    public ModifiedFile(Parcel parcel) {
        try {
            if (jw) {
                iy.tp(-832904971195898640L, null, parcel);
            }
            this.mb = parcel.readInt();
            this.WB = parcel.readString();
        } catch (Throwable th) {
            if (fY) {
                iy.j3(th, -832904971195898640L, null, parcel);
            }
            throw th;
        }
    }
}
