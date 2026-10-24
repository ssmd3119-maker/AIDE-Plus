package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.o;

/* loaded from: classes.dex */
public class PackageManagerWrapper {
    private final Context j6;

    public PackageManagerWrapper(Context context) {
        this.j6 = context;
    }

    public int DW(String str, String str2) {
        return this.j6.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo FH(String str, int i) {
        return this.j6.getPackageManager().getApplicationInfo(str, i);
    }

    public CharSequence Hw(String str) {
        return this.j6.getPackageManager().getApplicationLabel(this.j6.getPackageManager().getApplicationInfo(str, 0));
    }

    public boolean VH() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.j6(this.j6);
        }
        if (!o.EQ() || (nameForUid = this.j6.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.j6.getPackageManager().isInstantApp(nameForUid);
    }

    public final String[] Zo(int i) {
        return this.j6.getPackageManager().getPackagesForUid(i);
    }

    public final PackageInfo gn(String str, int i, int i2) {
        return this.j6.getPackageManager().getPackageInfo(str, 64);
    }

    public int j6(String str) {
        return this.j6.checkCallingOrSelfPermission(str);
    }

    @TargetApi(19)
    public final boolean u7(int i, String str) {
        if (o.Zo()) {
            try {
                ((AppOpsManager) this.j6.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.j6.getPackageManager().getPackagesForUid(i);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public PackageInfo v5(String str, int i) {
        return this.j6.getPackageManager().getPackageInfo(str, i);
    }
}
