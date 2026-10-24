package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.p;
import java.util.Set;

/* loaded from: classes.dex */
public final class a<O extends d> {
    private final String DW;
    private final AbstractC0107a<?, O> j6;

    /* renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0107a<T extends f, O> extends e<T, O> {
        public abstract T j6(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, O o, com.google.android.gms.common.api.f fVar, com.google.android.gms.common.api.g gVar);
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0108a extends d {
            Account n5();
        }

        public interface b extends d {
            GoogleSignInAccount DW();
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        void connect(c.InterfaceC0111c interfaceC0111c);

        void disconnect();

        Feature[] getAvailableFeatures();

        String getEndpointPackageName();

        int getMinApkVersion();

        void getRemoteService(com.google.android.gms.common.internal.j jVar, Set<Scope> set);

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(c.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public interface h<T extends IInterface> extends b {
        T createServiceInterface(IBinder iBinder);

        String getServiceDescriptor();

        String getStartServiceAction();

        void j6(int i, T t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(String str, AbstractC0107a<C, O> abstractC0107a, g<C> gVar) {
        p.tp(abstractC0107a, "Cannot construct an Api with a null ClientBuilder");
        p.tp(gVar, "Cannot construct an Api with a null ClientKey");
        this.DW = str;
        this.j6 = abstractC0107a;
    }

    public final AbstractC0107a<?, O> DW() {
        p.J0(this.j6 != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.j6;
    }

    public final String j6() {
        return this.DW;
    }
}
