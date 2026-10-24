package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.core.app.i;
import androidx.core.app.k;
import androidx.core.app.m;
import androidx.core.app.n;

/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();
    final boolean AL;
    final String WB;
    Bundle cT;
    final int fY;
    final boolean hK;
    final boolean jw;
    final String k2;
    final int mb;
    Fragment q7;
    final int qp;
    final Bundle w9;
    final boolean zh;

    static class a implements Parcelable.Creator<FragmentState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }
    }

    public FragmentState(Fragment fragment) {
        this.WB = fragment.getClass().getName();
        this.mb = fragment.fY;
        this.jw = fragment.q7;
        this.fY = fragment.mFragmentId;
        this.qp = fragment.mContainerId;
        this.k2 = fragment.fN;
        this.zh = fragment.pN;
        this.AL = fragment.Cz;
        this.w9 = fragment.k2;
        this.hK = fragment.Gj;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Fragment j6(k kVar, i iVar, Fragment fragment, n nVar) {
        if (this.q7 == null) {
            Context contextU7 = kVar.u7();
            Bundle bundle = this.w9;
            if (bundle != null) {
                bundle.setClassLoader(contextU7.getClassLoader());
            }
            if (iVar != null) {
                this.q7 = iVar.j6(contextU7, this.WB, this.w9);
            } else {
                this.q7 = Fragment.ei(contextU7, this.WB, this.w9);
            }
            Bundle bundle2 = this.cT;
            if (bundle2 != null) {
                bundle2.setClassLoader(contextU7.getClassLoader());
                this.q7.mb = this.cT;
            }
            this.q7.QO(this.mb, fragment);
            Fragment fragment2 = this.q7;
            fragment2.q7 = this.jw;
            fragment2.n5 = true;
            fragment2.mFragmentId = this.fY;
            fragment2.mContainerId = this.qp;
            fragment2.fN = this.k2;
            fragment2.pN = this.zh;
            fragment2.Cz = this.AL;
            fragment2.Gj = this.hK;
            fragment2.Jl = kVar.Hw;
            if (m.e9) {
                Log.v("FragmentManager", "Instantiated fragment " + this.q7);
            }
        }
        Fragment fragment3 = this.q7;
        fragment3.e3 = nVar;
        return fragment3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.WB);
        parcel.writeInt(this.mb);
        parcel.writeInt(this.jw ? 1 : 0);
        parcel.writeInt(this.fY);
        parcel.writeInt(this.qp);
        parcel.writeString(this.k2);
        parcel.writeInt(this.zh ? 1 : 0);
        parcel.writeInt(this.AL ? 1 : 0);
        parcel.writeBundle(this.w9);
        parcel.writeInt(this.hK ? 1 : 0);
        parcel.writeBundle(this.cT);
    }

    public FragmentState(Parcel parcel) {
        this.WB = parcel.readString();
        this.mb = parcel.readInt();
        this.jw = parcel.readInt() != 0;
        this.fY = parcel.readInt();
        this.qp = parcel.readInt();
        this.k2 = parcel.readString();
        this.zh = parcel.readInt() != 0;
        this.AL = parcel.readInt() != 0;
        this.w9 = parcel.readBundle();
        this.hK = parcel.readInt() != 0;
        this.cT = parcel.readBundle();
    }
}
