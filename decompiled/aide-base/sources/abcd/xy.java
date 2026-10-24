package abcd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.probelytics.api.AppInfo;
import com.probelytics.api.Market;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class xy {

    static class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                String encodedSchemeSpecificPart = intent.getData().getEncodedSchemeSpecificPart();
                xy.v5(encodedSchemeSpecificPart);
                tz.DW(encodedSchemeSpecificPart);
            } catch (Throwable th) {
                b00.VH("PackageManagerIntegration", th);
            }
        }
    }

    static class b extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                String encodedSchemeSpecificPart = intent.getData().getEncodedSchemeSpecificPart();
                xy.Zo(encodedSchemeSpecificPart);
                tz.lg(encodedSchemeSpecificPart);
            } catch (Throwable th) {
                b00.VH("PackageManagerIntegration", th);
            }
        }
    }

    private static boolean FH(PackageInfo packageInfo, PackageInfo packageInfo2) {
        for (Signature signature : packageInfo.signatures) {
            for (Signature signature2 : packageInfo2.signatures) {
                if (signature.equals(signature2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void Hw() {
        if (by.j6().FH()) {
            try {
                PackageManager packageManager = iy.DW().getPackageManager();
                List<PackageInfo> installedPackages = packageManager.getInstalledPackages(64);
                PackageInfo packageInfo = null;
                for (PackageInfo packageInfo2 : installedPackages) {
                    if (packageInfo2.packageName.equals(iy.DW().getPackageName())) {
                        packageInfo = packageInfo2;
                    }
                }
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                for (PackageInfo packageInfo3 : installedPackages) {
                    if (!packageInfo3.packageName.equals(iy.DW().getPackageName())) {
                        long j = packageInfo3.firstInstallTime;
                        hashSet2.add(packageInfo3.packageName);
                        Market market = new Market(packageManager.getInstallerPackageName(packageInfo3.packageName));
                        boolean zFH = FH(packageInfo, packageInfo3);
                        if (zFH) {
                            hashSet.add(packageInfo3.packageName);
                        }
                        py.ro(j, new AppInfo(market, packageInfo3.packageName, zFH));
                    }
                }
                for (String str : tz.we()) {
                    if (!hashSet2.contains(str)) {
                        Zo(str);
                    }
                }
                tz.j6(hashSet);
                tz.rN(hashSet2);
                IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                iy.DW().registerReceiver(new a(), intentFilter);
                IntentFilter intentFilter2 = new IntentFilter("android.intent.action.PACKAGE_REMOVED");
                intentFilter2.addDataScheme("package");
                iy.DW().registerReceiver(new b(), intentFilter2);
            } catch (Throwable th) {
                b00.VH("PackageManagerIntegration", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Zo(String str) {
        py.cn(new AppInfo(new Market(null), str, tz.XL(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v5(String str) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = iy.DW().getPackageManager();
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
        PackageInfo packageInfo2 = packageManager.getPackageInfo(iy.DW().getPackageName(), 64);
        long j = packageInfo.firstInstallTime;
        Market market = new Market(packageManager.getInstallerPackageName(str));
        boolean zFH = FH(packageInfo2, packageInfo);
        if (zFH) {
            tz.j6(Collections.singleton(str));
        }
        py.ro(j, new AppInfo(market, packageInfo.packageName, zFH));
    }
}
