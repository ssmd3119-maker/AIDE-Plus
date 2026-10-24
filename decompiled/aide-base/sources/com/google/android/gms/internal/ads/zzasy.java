package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.DataInputStream;
import java.io.IOException;

@jg
/* loaded from: classes.dex */
public final class zzasy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasy> CREATOR = new xh();
    private ParcelFileDescriptor WB;
    private boolean jw;
    private Parcelable mb;

    public zzasy(ParcelFileDescriptor parcelFileDescriptor) {
        this.WB = parcelFileDescriptor;
        this.mb = null;
        this.jw = true;
    }

    private final <T> ParcelFileDescriptor EQ(byte[] bArr) throws IOException {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe;
        try {
            parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
        } catch (IOException e) {
            e = e;
            autoCloseOutputStream = null;
        }
        try {
            new Thread(new vh(this, autoCloseOutputStream, bArr)).start();
            return parcelFileDescriptorArrCreatePipe[0];
        } catch (IOException e2) {
            e = e2;
            xp.Hw("Error transporting the ad response", e);
            com.google.android.gms.ads.internal.w0.u7().v5(e, "LargeParcelTeleporter.pipeData.2");
            com.google.android.gms.common.util.k.j6(autoCloseOutputStream);
            return null;
        }
    }

    private final ParcelFileDescriptor J8() {
        if (this.WB == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.mb.writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                this.WB = EQ(bArrMarshall);
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        return this.WB;
    }

    public final <T extends SafeParcelable> T gn(Parcelable.Creator<T> creator) throws IOException {
        if (this.jw) {
            if (this.WB == null) {
                xp.j6("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.WB));
            try {
                try {
                    int i = dataInputStream.readInt();
                    byte[] bArr = new byte[i];
                    dataInputStream.readFully(bArr, 0, i);
                    com.google.android.gms.common.util.k.j6(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i);
                        parcelObtain.setDataPosition(0);
                        this.mb = creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.jw = false;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (IOException e) {
                    xp.Hw("Could not read from parcel file descriptor", e);
                    com.google.android.gms.common.util.k.j6(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                com.google.android.gms.common.util.k.j6(dataInputStream);
                throw th2;
            }
        }
        return (T) this.mb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        J8();
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 2, this.WB, i, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    public zzasy(SafeParcelable safeParcelable) {
        this.WB = null;
        this.mb = safeParcelable;
        this.jw = false;
    }
}
