package com.google.android.gms.signin.internal;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public interface d extends IInterface {
    void F3(zaj zajVar);

    void SW(Status status);

    void kn(ConnectionResult connectionResult, zaa zaaVar);

    void uP(Status status);

    void wE(Status status, GoogleSignInAccount googleSignInAccount);
}
