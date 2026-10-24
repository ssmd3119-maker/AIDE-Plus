package abcd;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.probelytics.api.AppInfo;
import com.probelytics.api.Market;

/* loaded from: classes.dex */
public class vy {
    public static void j6(Context context, Intent intent, Bundle bundle) {
        Uri data;
        String queryParameter;
        if (intent.getAction() != "android.intent.action.VIEW" || (data = intent.getData()) == null) {
            return;
        }
        if ((data.toString().startsWith("market://details") || data.toString().startsWith("http://play.google.com/store/apps/details") || data.toString().startsWith("https://play.google.com/store/apps/details")) && (queryParameter = data.getQueryParameter("id")) != null) {
            py.KD(new AppInfo(new Market("com.android.vending"), queryParameter, false));
        }
    }
}
