package com.google.android.gms.signin.internal;

import abcd.gv;
import abcd.hv;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class e extends gv implements d {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // abcd.gv
    public boolean sh(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            kn((ConnectionResult) hv.j6(parcel, ConnectionResult.CREATOR), (zaa) hv.j6(parcel, zaa.CREATOR));
        } else if (i == 4) {
            SW((Status) hv.j6(parcel, Status.CREATOR));
        } else if (i == 6) {
            uP((Status) hv.j6(parcel, Status.CREATOR));
        } else if (i == 7) {
            wE((Status) hv.j6(parcel, Status.CREATOR), (GoogleSignInAccount) hv.j6(parcel, GoogleSignInAccount.CREATOR));
        } else {
            if (i != 8) {
                return false;
            }
            F3((zaj) hv.j6(parcel, zaj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
