package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.core.os.IResultReceiver;

/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();
    IResultReceiver jw;
    final boolean WB = false;
    final Handler mb = null;

    static class a implements Parcelable.Creator<ResultReceiver> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }
    }

    class b extends IResultReceiver.Sub {
        b() {
        }

        @Override // androidx.core.os.IResultReceiver
        public void AI(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.mb;
            if (handler != null) {
                handler.post(resultReceiver.new c(i, bundle));
            } else {
                resultReceiver.j6(i, bundle);
            }
        }
    }

    class c implements Runnable {
        final int WB;
        final Bundle mb;

        c(int i, Bundle bundle) {
            this.WB = i;
            this.mb = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.j6(this.WB, this.mb);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.jw = IResultReceiver.Sub.asInterface(parcel.readStrongBinder());
    }

    public void DW(int i, Bundle bundle) {
        if (this.WB) {
            Handler handler = this.mb;
            if (handler != null) {
                handler.post(new c(i, bundle));
                return;
            } else {
                j6(i, bundle);
                return;
            }
        }
        IResultReceiver iResultReceiver = this.jw;
        if (iResultReceiver != null) {
            try {
                iResultReceiver.AI(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected void j6(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.jw == null) {
                this.jw = new b();
            }
            parcel.writeStrongBinder(this.jw.asBinder());
        }
    }
}
