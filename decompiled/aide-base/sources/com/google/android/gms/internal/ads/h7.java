package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class h7<ReferenceT> {
    private final Map<String, CopyOnWriteArrayList<com.google.android.gms.ads.internal.gmsg.b0<? super ReferenceT>>> WB = new HashMap();
    private ReferenceT mb;

    private final synchronized void gn(String str, final Map<String, String> map) {
        if (xp.DW(2)) {
            String strValueOf = String.valueOf(str);
            sm.we(strValueOf.length() != 0 ? "Received GMSG: ".concat(strValueOf) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                sm.we(sb.toString());
            }
        }
        CopyOnWriteArrayList<com.google.android.gms.ads.internal.gmsg.b0<? super ReferenceT>> copyOnWriteArrayList = this.WB.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator<com.google.android.gms.ads.internal.gmsg.b0<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                final com.google.android.gms.ads.internal.gmsg.b0<? super ReferenceT> next = it.next();
                ar.j6.execute(new Runnable(this, next, map) { // from class: com.google.android.gms.internal.ads.i7
                    private final h7 WB;
                    private final Map jw;
                    private final com.google.android.gms.ads.internal.gmsg.b0 mb;

                    {
                        this.WB = this;
                        this.mb = next;
                        this.jw = map;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.WB.Hw(this.mb, this.jw);
                    }
                });
            }
        }
    }

    public final synchronized void FH() {
        this.WB.clear();
    }

    final /* synthetic */ void Hw(com.google.android.gms.ads.internal.gmsg.b0 b0Var, Map map) {
        b0Var.zza(this.mb, map);
    }

    public final boolean J0(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        String path = uri.getPath();
        com.google.android.gms.ads.internal.w0.v5();
        gn(path, bn.XG(uri));
        return true;
    }

    public final void J8(ReferenceT referencet) {
        this.mb = referencet;
    }

    public final synchronized void g3(String str, com.google.android.gms.ads.internal.gmsg.b0<? super ReferenceT> b0Var) {
        CopyOnWriteArrayList<com.google.android.gms.ads.internal.gmsg.b0<? super ReferenceT>> copyOnWriteArrayList = this.WB.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        copyOnWriteArrayList.remove(b0Var);
    }

    public final synchronized void sh(String str, com.google.android.gms.ads.internal.gmsg.b0<? super ReferenceT> b0Var) {
        CopyOnWriteArrayList<com.google.android.gms.ads.internal.gmsg.b0<? super ReferenceT>> copyOnWriteArrayList = this.WB.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.WB.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(b0Var);
    }

    public final synchronized void ya(String str, com.google.android.gms.common.util.p<com.google.android.gms.ads.internal.gmsg.b0<? super ReferenceT>> pVar) {
        CopyOnWriteArrayList<com.google.android.gms.ads.internal.gmsg.b0<? super ReferenceT>> copyOnWriteArrayList = this.WB.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.internal.gmsg.b0<? super ReferenceT> b0Var = (com.google.android.gms.ads.internal.gmsg.b0) it.next();
            if (pVar.j6(b0Var)) {
                arrayList.add(b0Var);
            }
        }
        copyOnWriteArrayList.removeAll(arrayList);
    }
}
