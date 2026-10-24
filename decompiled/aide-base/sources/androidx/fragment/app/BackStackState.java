package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.d;
import androidx.core.app.m;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();
    final int AL;
    final int[] WB;
    final ArrayList<String> cT;
    final String fY;
    final ArrayList<String> hK;
    final int jw;
    final int k2;
    final int mb;
    final boolean q7;
    final int qp;
    final CharSequence w9;
    final CharSequence zh;

    static class a implements Parcelable.Creator<BackStackState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }
    }

    public BackStackState(d dVar) {
        int size = dVar.DW.size();
        this.WB = new int[size * 6];
        if (!dVar.u7) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            d.a aVar = dVar.DW.get(i2);
            int[] iArr = this.WB;
            int i3 = i + 1;
            iArr[i] = aVar.j6;
            int i4 = i3 + 1;
            Fragment fragment = aVar.DW;
            iArr[i3] = fragment != null ? fragment.fY : -1;
            int[] iArr2 = this.WB;
            int i5 = i4 + 1;
            iArr2[i4] = aVar.FH;
            int i6 = i5 + 1;
            iArr2[i5] = aVar.Hw;
            int i7 = i6 + 1;
            iArr2[i6] = aVar.v5;
            i = i7 + 1;
            iArr2[i7] = aVar.Zo;
        }
        this.mb = dVar.VH;
        this.jw = dVar.gn;
        this.fY = dVar.tp;
        this.qp = dVar.we;
        this.k2 = dVar.J0;
        this.zh = dVar.J8;
        this.AL = dVar.Ws;
        this.w9 = dVar.QX;
        this.hK = dVar.XL;
        this.cT = dVar.aM;
        this.q7 = dVar.j3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public d j6(m mVar) {
        d dVar = new d(mVar);
        int i = 0;
        int i2 = 0;
        while (i < this.WB.length) {
            d.a aVar = new d.a();
            int i3 = i + 1;
            aVar.j6 = this.WB[i];
            if (m.e9) {
                Log.v("FragmentManager", "Instantiate " + dVar + " op #" + i2 + " base fragment #" + this.WB[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.WB[i3];
            if (i5 >= 0) {
                aVar.DW = mVar.qp.get(i5);
            } else {
                aVar.DW = null;
            }
            int[] iArr = this.WB;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar.FH = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar.Hw = i9;
            int i10 = i8 + 1;
            int i11 = iArr[i8];
            aVar.v5 = i11;
            int i12 = iArr[i10];
            aVar.Zo = i12;
            dVar.FH = i7;
            dVar.Hw = i9;
            dVar.v5 = i11;
            dVar.Zo = i12;
            dVar.we(aVar);
            i2++;
            i = i10 + 1;
        }
        dVar.VH = this.mb;
        dVar.gn = this.jw;
        dVar.tp = this.fY;
        dVar.we = this.qp;
        dVar.u7 = true;
        dVar.J0 = this.k2;
        dVar.J8 = this.zh;
        dVar.Ws = this.AL;
        dVar.QX = this.w9;
        dVar.XL = this.hK;
        dVar.aM = this.cT;
        dVar.j3 = this.q7;
        dVar.J0(1);
        return dVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.WB);
        parcel.writeInt(this.mb);
        parcel.writeInt(this.jw);
        parcel.writeString(this.fY);
        parcel.writeInt(this.qp);
        parcel.writeInt(this.k2);
        TextUtils.writeToParcel(this.zh, parcel, 0);
        parcel.writeInt(this.AL);
        TextUtils.writeToParcel(this.w9, parcel, 0);
        parcel.writeStringList(this.hK);
        parcel.writeStringList(this.cT);
        parcel.writeInt(this.q7 ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.WB = parcel.createIntArray();
        this.mb = parcel.readInt();
        this.jw = parcel.readInt();
        this.fY = parcel.readString();
        this.qp = parcel.readInt();
        this.k2 = parcel.readInt();
        this.zh = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.AL = parcel.readInt();
        this.w9 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.hK = parcel.createStringArrayList();
        this.cT = parcel.createStringArrayList();
        this.q7 = parcel.readInt() != 0;
    }
}
