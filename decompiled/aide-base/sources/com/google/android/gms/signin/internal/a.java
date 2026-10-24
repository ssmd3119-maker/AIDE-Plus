package com.google.android.gms.signin.internal;

import abcd.vv;
import abcd.zv;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.p;

/* loaded from: classes.dex */
public class a extends com.google.android.gms.common.internal.g<f> implements zv {
    private final boolean FH;
    private final com.google.android.gms.common.internal.d Hw;
    private Integer Zo;
    private final Bundle v5;

    private a(Context context, Looper looper, boolean z, com.google.android.gms.common.internal.d dVar, Bundle bundle, com.google.android.gms.common.api.f fVar, com.google.android.gms.common.api.g gVar) {
        super(context, looper, 44, dVar, fVar, gVar);
        this.FH = true;
        this.Hw = dVar;
        this.v5 = bundle;
        this.Zo = dVar.Hw();
    }

    public static Bundle gn(com.google.android.gms.common.internal.d dVar) {
        vv vvVarGn = dVar.gn();
        Integer numHw = dVar.Hw();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.j6());
        if (numHw != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numHw.intValue());
        }
        if (vvVarGn != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", vvVarGn.gn());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", vvVarGn.VH());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", vvVarGn.v5());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", vvVarGn.Zo());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", vvVarGn.FH());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", vvVarGn.u7());
            if (vvVarGn.j6() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", vvVarGn.j6().longValue());
            }
            if (vvVarGn.Hw() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", vvVarGn.Hw().longValue());
            }
        }
        return bundle;
    }

    @Override // abcd.zv
    public final void DW() {
        connect(new c.d());
    }

    @Override // abcd.zv
    public final void FH(d dVar) {
        p.tp(dVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountDW = this.Hw.DW();
            ((f) getService()).y6(new zah(new ResolveAccountRequest(accountDW, this.Zo.intValue(), com.google.android.gms.common.internal.c.DEFAULT_ACCOUNT.equals(accountDW.name) ? com.google.android.gms.auth.api.signin.internal.b.j6(getContext()).DW() : null)), dVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                dVar.F3(new zaj(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c
    protected /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // com.google.android.gms.common.internal.c
    protected Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.Hw.Zo())) {
            this.v5.putString("com.google.android.gms.signin.internal.realClientPackageName", this.Hw.Zo());
        }
        return this.v5;
    }

    @Override // com.google.android.gms.common.internal.g, com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.c
    protected String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public boolean requiresSignIn() {
        return this.FH;
    }

    public a(Context context, Looper looper, boolean z, com.google.android.gms.common.internal.d dVar, vv vvVar, com.google.android.gms.common.api.f fVar, com.google.android.gms.common.api.g gVar) {
        this(context, looper, true, dVar, gn(dVar), fVar, gVar);
    }
}
