package androidx.core.app;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.ContextCompat;

/* loaded from: classes.dex */
public class ActivityCompat extends ContextCompat {

    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    static class a implements Runnable {
        final /* synthetic */ String[] WB;
        final /* synthetic */ int jw;
        final /* synthetic */ Activity mb;

        a(String[] strArr, Activity activity, int i) {
            this.WB = strArr;
            this.mb = activity;
            this.jw = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.WB.length];
            PackageManager packageManager = this.mb.getPackageManager();
            String packageName = this.mb.getPackageName();
            int length = this.WB.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.WB[i], packageName);
            }
            ((OnRequestPermissionsResultCallback) this.mb).onRequestPermissionsResult(this.jw, this.WB, iArr);
        }
    }

    public interface c {
        void DW(int i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void requestPermissions(Activity activity, String[] strArr, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof c) {
                ((c) activity).DW(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof OnRequestPermissionsResultCallback) {
            new Handler(Looper.getMainLooper()).post(new a(strArr, activity, i));
        }
    }
}
