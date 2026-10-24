package com.aide.ui.scm;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@cy(clazz = -2288539808242855755L, container = -2288539808242855755L, user = true)
/* loaded from: classes.dex */
public class GitStatus implements Parcelable {

    @dy(field = -1454437753111111769L)
    public static final Parcelable.Creator<GitStatus> CREATOR;

    @gy
    private static /* synthetic */ boolean fY;

    @fy
    private static /* synthetic */ boolean jw;

    @dy(field = -1305154832998569076L)
    public final String WB;

    @dy(field = -1172884717841394259L)
    public final List<ModifiedFile> mb;

    @cy(clazz = -3678533772776747448L, container = -2288539808242855755L, user = true)
    static class a implements Parcelable.Creator<GitStatus> {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 1131792812372502217L)
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = 270153697781781183L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public GitStatus[] newArray(int i) {
            try {
                if (j6) {
                    iy.u7(-5351747066410652399L, this, i);
                }
                return new GitStatus[i];
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, -5351747066410652399L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = -3597985030192636776L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public GitStatus createFromParcel(Parcel parcel) {
            try {
                if (j6) {
                    iy.tp(-937600887502647424L, this, parcel);
                }
                return new GitStatus(parcel);
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, -937600887502647424L, this, parcel);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(GitStatus.class);
            if (jw) {
                iy.gn(2848358967180819661L, null);
            }
            CREATOR = new a();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 2848358967180819661L, null);
            }
            throw th;
        }
    }

    @ey(method = 99794737143572L)
    public GitStatus(Parcel parcel) {
        try {
            if (jw) {
                iy.tp(1316280535937052981L, null, parcel);
            }
            ArrayList arrayList = new ArrayList(parcel.readInt());
            parcel.readTypedList(arrayList, ModifiedFile.CREATOR);
            this.mb = Collections.unmodifiableList(arrayList);
            this.WB = parcel.readString();
        } catch (Throwable th) {
            if (fY) {
                iy.j3(th, 1316280535937052981L, null, parcel);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = 2971637608681284741L)
    public int describeContents() {
        try {
            if (!jw) {
                return 0;
            }
            iy.gn(4084759222303630228L, this);
            return 0;
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 4084759222303630228L, this);
            }
            throw th;
        }
    }

    @ey(method = 1201887312315420185L)
    public boolean j6() {
        try {
            if (jw) {
                iy.gn(2182983828349697912L, this);
            }
            return this.mb.isEmpty();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 2182983828349697912L, this);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = -5595380556092814500L)
    public void writeToParcel(Parcel parcel, int i) {
        try {
            if (jw) {
                iy.EQ(-89952901220952711L, this, parcel, new Integer(i));
            }
            parcel.writeInt(this.mb.size());
            parcel.writeTypedList(this.mb);
            parcel.writeString(this.WB);
        } catch (Throwable th) {
            if (fY) {
                iy.Mr(th, -89952901220952711L, this, parcel, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -5660693144671665024L)
    public GitStatus(String str, Collection<ModifiedFile> collection) {
        try {
            if (jw) {
                iy.EQ(1079767636418695311L, null, str, collection);
            }
            this.WB = str;
            this.mb = Collections.unmodifiableList(new ArrayList(collection));
        } catch (Throwable th) {
            if (fY) {
                iy.Mr(th, 1079767636418695311L, null, str, collection);
            }
            throw th;
        }
    }
}
