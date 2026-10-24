package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jc extends ec {
    private final ox WB;

    public jc(ox oxVar) {
        this.WB = oxVar;
    }

    private static Bundle CO(String str) throws RemoteException {
        String strValueOf = String.valueOf(str);
        xp.u7(strValueOf.length() != 0 ? "Server parameters: ".concat(strValueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            xp.Hw("", e);
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int k6(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1396342996: goto L29;
                case -1052618729: goto L1f;
                case -239580146: goto L15;
                case 604727084: goto Lb;
                default: goto La;
            }
        La:
            goto L33
        Lb:
            java.lang.String r0 = "interstitial"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L33
            r4 = 1
            goto L34
        L15:
            java.lang.String r0 = "rewarded"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L33
            r4 = 2
            goto L34
        L1f:
            java.lang.String r0 = "native"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L33
            r4 = 3
            goto L34
        L29:
            java.lang.String r0 = "banner"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L33
            r4 = 0
            goto L34
        L33:
            r4 = -1
        L34:
            if (r4 == 0) goto L4d
            if (r4 == r3) goto L4a
            if (r4 == r2) goto L47
            if (r4 != r1) goto L3f
            int r4 = com.google.android.gms.ads.i.Hw
            return r4
        L3f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Internal Error"
            r4.<init>(r0)
            throw r4
        L47:
            int r4 = com.google.android.gms.ads.i.FH
            return r4
        L4a:
            int r4 = com.google.android.gms.ads.i.DW
            return r4
        L4d:
            int r4 = com.google.android.gms.ads.i.j6
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jc.k6(java.lang.String):int");
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final zzans QO() {
        zzans.gn(this.WB.Hw());
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final zzans ZU() {
        zzans.gn(this.WB.FH());
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final void fD(abcd.wu wuVar) {
        this.WB.j6((Context) abcd.xu.g3(wuVar));
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final yx0 getVideoController() {
        Object obj = this.WB;
        if (!(obj instanceof com.google.android.gms.ads.mediation.n)) {
            return null;
        }
        try {
            return ((com.google.android.gms.ads.mediation.n) obj).getVideoController();
        } catch (Throwable th) {
            xp.Hw("", th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final void hl(String str, String str2, Bundle bundle, abcd.wu wuVar, bc bcVar, qa qaVar) throws RemoteException {
        try {
            mc mcVar = new mc(this, bcVar, qaVar);
            ox oxVar = this.WB;
            CO(str2);
            mcVar.j6(String.valueOf(oxVar.getClass().getSimpleName()).concat(" does not support rewarded ads."));
        } catch (Throwable th) {
            xp.Hw("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final void i9(String str, String str2, Bundle bundle, abcd.wu wuVar, zb zbVar, qa qaVar) throws RemoteException {
        try {
            nc ncVar = new nc(this, zbVar, qaVar);
            ox oxVar = this.WB;
            CO(str2);
            ncVar.j6(String.valueOf(oxVar.getClass().getSimpleName()).concat(" does not support native ads."));
        } catch (Throwable th) {
            xp.Hw("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final void iU(String[] strArr, Bundle[] bundleArr) throws RemoteException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            try {
                arrayList.add(new com.google.android.gms.ads.mediation.m(k6(strArr[i]), bundleArr[i]));
            } catch (IndexOutOfBoundsException unused) {
                throw new RemoteException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.oc, com.google.android.gms.internal.ads.qx] */
    @Override // com.google.android.gms.internal.ads.dc
    public final void pl(abcd.wu wuVar, String str, Bundle bundle, Bundle bundle2, zzwf zzwfVar, gc gcVar) throws RemoteException {
        try {
            ?? ocVar = new oc(this, gcVar);
            this.WB.DW(new px((Context) abcd.xu.g3(wuVar), new com.google.android.gms.ads.mediation.m(k6(str), bundle2), bundle, com.google.android.gms.ads.k.j6(zzwfVar.qp, zzwfVar.mb, zzwfVar.WB)), ocVar);
        } catch (Throwable th) {
            xp.Hw("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final void qh(String str, String str2, Bundle bundle, abcd.wu wuVar, xb xbVar, qa qaVar) throws RemoteException {
        try {
            lc lcVar = new lc(this, xbVar, qaVar);
            ox oxVar = this.WB;
            CO(str2);
            lcVar.j6(String.valueOf(oxVar.getClass().getSimpleName()).concat(" does not support interstitial ads."));
        } catch (Throwable th) {
            xp.Hw("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final void sN(String str, String str2, Bundle bundle, abcd.wu wuVar, ub ubVar, qa qaVar, zzwf zzwfVar) throws RemoteException {
        try {
            kc kcVar = new kc(this, ubVar, qaVar);
            ox oxVar = this.WB;
            CO(str2);
            com.google.android.gms.ads.k.j6(zzwfVar.qp, zzwfVar.mb, zzwfVar.WB);
            kcVar.j6(String.valueOf(oxVar.getClass().getSimpleName()).concat(" does not support banner ads."));
        } catch (Throwable th) {
            xp.Hw("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final void showInterstitial() throws RemoteException {
        mx mxVar = null;
        try {
            mxVar.j6();
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final void tS() throws RemoteException {
        nx nxVar = null;
        try {
            nxVar.j6();
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }
}
