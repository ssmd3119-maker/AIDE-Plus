package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
@TargetApi(21)
/* loaded from: classes.dex */
public final class ml {
    private static final Map<String, String> Hw;
    private final List<String> DW;
    private final zk FH;
    private final Context j6;

    static {
        HashMap map = new HashMap();
        if (com.google.android.gms.common.util.o.gn()) {
            map.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            map.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        Hw = map;
    }

    ml(Context context, List<String> list, zk zkVar) {
        this.j6 = context;
        this.DW = list;
        this.FH = zkVar;
    }

    final List<String> j6(String[] strArr) {
        boolean z;
        boolean z2;
        String strValueOf;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Iterator<String> it = this.DW.iterator();
            do {
                z = true;
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                String next = it.next();
                if (next.equals(str)) {
                    break;
                }
                strValueOf = String.valueOf(next);
            } while (!(strValueOf.length() != 0 ? "android.webkit.resource.".concat(strValueOf) : new String("android.webkit.resource.")).equals(str));
            z2 = true;
            if (z2) {
                if (Hw.containsKey(str)) {
                    com.google.android.gms.ads.internal.w0.v5();
                    if (!bn.Xa(this.j6, Hw.get(str))) {
                        z = false;
                    }
                }
                if (z) {
                    arrayList.add(str);
                } else {
                    this.FH.Hw(str);
                }
            } else {
                this.FH.FH(str);
            }
        }
        return arrayList;
    }
}
