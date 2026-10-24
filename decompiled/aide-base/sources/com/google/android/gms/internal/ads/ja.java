package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import java.util.Map;

@jg
/* loaded from: classes.dex */
public final class ja extends la {
    private Map<Class<? extends Object>, Object> WB;

    private final na CO(String str) throws RemoteException {
        try {
            xp.VH("Reflection failed, retrying using direct instantiation");
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            xp.v5(sb.toString(), th);
        }
        if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
            return new ib(new AdMobAdapter());
        }
        if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
            return new ib(new AdUrlAdapter());
        }
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            return new ib(new CustomEventAdapter());
        }
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
            return new nb(customEventAdapter, (com.google.android.gms.ads.mediation.customevent.c) this.WB.get(customEventAdapter.getAdditionalParametersType()));
        }
        throw new RemoteException();
    }

    private final <NetworkExtrasT extends com.google.ads.mediation.f, ServerParametersT extends com.google.ads.mediation.e> na k6(String str) {
        try {
            Class<?> cls = Class.forName(str, false, ja.class.getClassLoader());
            if (com.google.ads.mediation.b.class.isAssignableFrom(cls)) {
                com.google.ads.mediation.b bVar = (com.google.ads.mediation.b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new nb(bVar, (com.google.ads.mediation.f) this.WB.get(bVar.getAdditionalParametersType()));
            }
            if (com.google.android.gms.ads.mediation.b.class.isAssignableFrom(cls)) {
                return new ib((com.google.android.gms.ads.mediation.b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(" (not a valid adapter).");
            xp.u7(sb.toString());
            throw new RemoteException();
        } catch (Throwable unused) {
            return CO(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.ka
    public final boolean GW(String str) {
        try {
            return com.google.android.gms.ads.mediation.customevent.a.class.isAssignableFrom(Class.forName(str, false, ja.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            xp.u7(sb.toString());
            return false;
        }
    }

    public final void MU(Map<Class<? extends Object>, Object> map) {
        this.WB = map;
    }

    @Override // com.google.android.gms.internal.ads.ka
    public final dc MX(String str) {
        return ic.j6(str);
    }

    @Override // com.google.android.gms.internal.ads.ka
    public final na wu(String str) {
        return k6(str);
    }
}
