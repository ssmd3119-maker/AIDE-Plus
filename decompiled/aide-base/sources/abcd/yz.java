package abcd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;

/* loaded from: classes.dex */
public class yz {

    private static class a extends BroadcastReceiver {
        private b j6;

        public a(b bVar) {
            this.j6 = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            this.j6.j6(activeNetworkInfo != null && activeNetworkInfo.isConnected());
        }
    }

    public interface b {
        void j6(boolean z);
    }

    private static int DW(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static boolean FH() {
        return DW(iy.DW(), "android.permission.ACCESS_NETWORK_STATE") == 0;
    }

    public static boolean Hw() {
        return DW(iy.DW(), "android.permission.INTERNET") == 0;
    }

    public static void j6(b bVar) {
        if (FH()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            iy.DW().registerReceiver(new a(bVar), intentFilter);
        }
    }

    public static boolean v5() {
        ConnectivityManager connectivityManager;
        if (!FH() || (connectivityManager = (ConnectivityManager) iy.DW().getSystemService("connectivity")) == null) {
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
