package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();
    FragmentState[] WB;
    int fY;
    BackStackState[] jw;
    int[] mb;
    int qp;

    static class a implements Parcelable.Creator<FragmentManagerState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }
    }

    public FragmentManagerState() {
        this.fY = -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.WB, i);
        parcel.writeIntArray(this.mb);
        parcel.writeTypedArray(this.jw, i);
        parcel.writeInt(this.fY);
        parcel.writeInt(this.qp);
    }

    public FragmentManagerState(Parcel parcel) {
        this.fY = -1;
        this.WB = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.mb = parcel.createIntArray();
        this.jw = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.fY = parcel.readInt();
        this.qp = parcel.readInt();
    }
}
