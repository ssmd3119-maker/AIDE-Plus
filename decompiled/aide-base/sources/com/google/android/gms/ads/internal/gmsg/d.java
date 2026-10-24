package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.w0;
import com.google.android.gms.internal.ads.vb0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {
    private final vb0 DW;
    private final View FH;
    private final Context j6;

    public d(Context context, vb0 vb0Var, View view) {
        this.j6 = context;
        this.DW = vb0Var;
        this.FH = view;
    }

    private final ResolveInfo DW(Intent intent, ArrayList<ResolveInfo> arrayList) {
        PackageManager packageManager;
        ResolveInfo resolveInfo = null;
        try {
            packageManager = this.j6.getPackageManager();
        } catch (Throwable th) {
            w0.u7().v5(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        if (packageManager == null) {
            return null;
        }
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
            int i = 0;
            while (true) {
                if (i >= listQueryIntentActivities.size()) {
                    break;
                }
                ResolveInfo resolveInfo2 = listQueryIntentActivities.get(i);
                if (resolveInfoResolveActivity != null && resolveInfoResolveActivity.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                    resolveInfo = resolveInfoResolveActivity;
                    break;
                }
                i++;
            }
        }
        arrayList.addAll(listQueryIntentActivities);
        return resolveInfo;
    }

    private final ResolveInfo FH(Intent intent) {
        return DW(intent, new ArrayList<>());
    }

    private static Intent Hw(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    private static Intent j6(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent v5(java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.d.v5(java.util.Map):android.content.Intent");
    }
}
