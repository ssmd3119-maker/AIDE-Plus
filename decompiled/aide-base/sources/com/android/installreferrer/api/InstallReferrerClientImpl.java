package com.android.installreferrer.api;

import abcd.ot;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import java.util.List;

/* loaded from: classes.dex */
public class InstallReferrerClientImpl extends com.android.installreferrer.api.a {
    private final Context DW;
    private IGetInstallReferrerService FH;
    private ServiceConnection Hw;
    private int j6 = 0;

    private final class b implements ServiceConnection {
        private final com.android.installreferrer.api.b WB;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ot.j6("InstallReferrerClient", "Install Referrer service connected.");
            InstallReferrerClientImpl.this.FH = IGetInstallReferrerService.Sub.asInterface(iBinder);
            InstallReferrerClientImpl.this.j6 = 2;
            this.WB.j6(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ot.DW("InstallReferrerClient", "Install Referrer service disconnected.");
            InstallReferrerClientImpl.this.FH = null;
            InstallReferrerClientImpl.this.j6 = 0;
            this.WB.DW();
        }

        private b(com.android.installreferrer.api.b bVar) {
            if (bVar == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.WB = bVar;
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.DW = context.getApplicationContext();
    }

    private boolean VH() {
        try {
            return this.DW.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.android.installreferrer.api.a
    public c DW() throws RemoteException {
        if (!gn()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.DW.getPackageName());
        try {
            return new c(this.FH.KM(bundle));
        } catch (RemoteException e) {
            ot.DW("InstallReferrerClient", "RemoteException getting install referrer information");
            this.j6 = 0;
            throw e;
        }
    }

    @Override // com.android.installreferrer.api.a
    public void Hw(com.android.installreferrer.api.b bVar) {
        ServiceInfo serviceInfo;
        if (gn()) {
            ot.j6("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            bVar.j6(0);
            return;
        }
        int i = this.j6;
        if (i == 1) {
            ot.DW("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            bVar.j6(3);
            return;
        }
        if (i == 3) {
            ot.DW("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            bVar.j6(3);
            return;
        }
        ot.j6("InstallReferrerClient", "Starting install referrer service setup.");
        this.Hw = new b(bVar);
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = this.DW.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.j6 = 0;
            ot.j6("InstallReferrerClient", "Install Referrer service unavailable on device.");
            bVar.j6(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!"com.android.vending".equals(str) || str2 == null || !VH()) {
            ot.DW("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.j6 = 0;
            bVar.j6(2);
        } else {
            if (this.DW.bindService(new Intent(intent), this.Hw, 1)) {
                ot.j6("InstallReferrerClient", "Service was bonded successfully.");
                return;
            }
            ot.DW("InstallReferrerClient", "Connection to service is blocked.");
            this.j6 = 0;
            bVar.j6(1);
        }
    }

    public boolean gn() {
        return (this.j6 != 2 || this.FH == null || this.Hw == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.a
    public void j6() {
        this.j6 = 3;
        if (this.Hw != null) {
            ot.j6("InstallReferrerClient", "Unbinding from service.");
            this.DW.unbindService(this.Hw);
            this.Hw = null;
        }
        this.FH = null;
    }
}
