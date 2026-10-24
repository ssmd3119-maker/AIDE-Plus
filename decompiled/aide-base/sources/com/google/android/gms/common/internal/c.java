package com.google.android.gms.common.internal;

import abcd.nv;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public abstract class c<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private final Context mContext;
    final Handler mHandler;
    private final Object mLock;
    private int zzbt;
    private long zzbu;
    private long zzbv;
    private int zzbw;
    private long zzbx;
    private h0 zzby;
    private final Looper zzbz;
    private final com.google.android.gms.common.internal.h zzca;
    private final com.google.android.gms.common.c zzcb;
    private final Object zzcc;

    @GuardedBy("mServiceBrokerLock")
    private m zzcd;
    protected InterfaceC0111c zzce;

    @GuardedBy("mLock")
    private T zzcf;
    private final ArrayList<h<?>> zzcg;

    @GuardedBy("mLock")
    private j zzch;

    @GuardedBy("mLock")
    private int zzci;
    private final a zzcj;
    private final b zzck;
    private final int zzcl;
    private final String zzcm;
    private ConnectionResult zzcn;
    private boolean zzco;
    private volatile zzb zzcp;
    protected AtomicInteger zzcq;
    private static final Feature[] zzbs = new Feature[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface b {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c, reason: collision with other inner class name */
    public interface InterfaceC0111c {
        void j6(ConnectionResult connectionResult);
    }

    protected class d implements InterfaceC0111c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.c.InterfaceC0111c
        public void j6(ConnectionResult connectionResult) {
            if (connectionResult.QX()) {
                c cVar = c.this;
                cVar.getRemoteService(null, cVar.getScopes());
            } else if (c.this.zzck != null) {
                c.this.zzck.onConnectionFailed(connectionResult);
            }
        }
    }

    public interface e {
        void j6();
    }

    private abstract class f extends h<Boolean> {
        private final int Hw;
        private final Bundle v5;

        protected f(int i, Bundle bundle) {
            super(Boolean.TRUE);
            this.Hw = i;
            this.v5 = bundle;
        }

        @Override // com.google.android.gms.common.internal.c.h
        protected final /* synthetic */ void FH(Boolean bool) {
            if (bool == null) {
                c.this.zza(1, (int) null);
                return;
            }
            int i = this.Hw;
            if (i == 0) {
                if (VH()) {
                    return;
                }
                c.this.zza(1, (int) null);
                Zo(new ConnectionResult(8, null));
                return;
            }
            if (i == 10) {
                c.this.zza(1, (int) null);
                throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", getClass().getSimpleName(), c.this.getStartServiceAction(), c.this.getServiceDescriptor()));
            }
            c.this.zza(1, (int) null);
            Bundle bundle = this.v5;
            Zo(new ConnectionResult(this.Hw, bundle != null ? (PendingIntent) bundle.getParcelable(c.KEY_PENDING_INTENT) : null));
        }

        @Override // com.google.android.gms.common.internal.c.h
        protected final void Hw() {
        }

        protected abstract boolean VH();

        protected abstract void Zo(ConnectionResult connectionResult);
    }

    final class g extends nv {
        public g(Looper looper) {
            super(looper);
        }

        private static boolean DW(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        private static void j6(Message message) {
            h hVar = (h) message.obj;
            hVar.Hw();
            hVar.DW();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (c.this.zzcq.get() != message.arg1) {
                if (DW(message)) {
                    j6(message);
                    return;
                }
                return;
            }
            int i = message.what;
            if ((i == 1 || i == 7 || i == 4 || i == 5) && !c.this.isConnecting()) {
                j6(message);
                return;
            }
            int i2 = message.what;
            if (i2 == 4) {
                c.this.zzcn = new ConnectionResult(message.arg2);
                if (c.this.zzl() && !c.this.zzco) {
                    c.this.zza(3, (int) null);
                    return;
                }
                ConnectionResult connectionResult = c.this.zzcn != null ? c.this.zzcn : new ConnectionResult(8);
                c.this.zzce.j6(connectionResult);
                c.this.onConnectionFailed(connectionResult);
                return;
            }
            if (i2 == 5) {
                ConnectionResult connectionResult2 = c.this.zzcn != null ? c.this.zzcn : new ConnectionResult(8);
                c.this.zzce.j6(connectionResult2);
                c.this.onConnectionFailed(connectionResult2);
                return;
            }
            if (i2 == 3) {
                Object obj = message.obj;
                ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
                c.this.zzce.j6(connectionResult3);
                c.this.onConnectionFailed(connectionResult3);
                return;
            }
            if (i2 == 6) {
                c.this.zza(5, (int) null);
                if (c.this.zzcj != null) {
                    c.this.zzcj.onConnectionSuspended(message.arg2);
                }
                c.this.onConnectionSuspended(message.arg2);
                c.this.zza(5, 1, (int) null);
                return;
            }
            if (i2 == 2 && !c.this.isConnected()) {
                j6(message);
                return;
            }
            if (DW(message)) {
                ((h) message.obj).v5();
                return;
            }
            int i3 = message.what;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i3);
            Log.wtf("GmsClient", sb.toString(), new Exception());
        }
    }

    protected abstract class h<TListener> {
        private boolean DW = false;
        private TListener j6;

        public h(TListener tlistener) {
            this.j6 = tlistener;
        }

        public final void DW() {
            j6();
            synchronized (c.this.zzcg) {
                c.this.zzcg.remove(this);
            }
        }

        protected abstract void FH(TListener tlistener);

        protected abstract void Hw();

        public final void j6() {
            synchronized (this) {
                this.j6 = null;
            }
        }

        public final void v5() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.j6;
                if (this.DW) {
                    String strValueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(strValueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    FH(tlistener);
                } catch (RuntimeException e) {
                    Hw();
                    throw e;
                }
            } else {
                Hw();
            }
            synchronized (this) {
                this.DW = true;
            }
            DW();
        }
    }

    public static final class i extends k.a {
        private c WB;
        private final int mb;

        public i(c cVar, int i) {
            this.WB = cVar;
            this.mb = i;
        }

        @Override // com.google.android.gms.common.internal.k
        public final void TL(int i, IBinder iBinder, Bundle bundle) {
            p.tp(this.WB, "onPostInitComplete can be called only once per call to getRemoteService");
            this.WB.onPostInitHandler(i, iBinder, bundle, this.mb);
            this.WB = null;
        }

        @Override // com.google.android.gms.common.internal.k
        public final void YZ(int i, IBinder iBinder, zzb zzbVar) {
            p.tp(this.WB, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            p.u7(zzbVar);
            this.WB.zza(zzbVar);
            TL(i, iBinder, zzbVar.WB);
        }

        @Override // com.google.android.gms.common.internal.k
        public final void e6(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }
    }

    public final class j implements ServiceConnection {
        private final int WB;

        public j(int i) {
            this.WB = i;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            m lVar;
            if (iBinder == null) {
                c.this.zzb(16);
                return;
            }
            synchronized (c.this.zzcc) {
                c cVar = c.this;
                if (iBinder == null) {
                    lVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    lVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof m)) ? new com.google.android.gms.common.internal.l(iBinder) : (m) iInterfaceQueryLocalInterface;
                }
                cVar.zzcd = lVar;
            }
            c.this.zza(0, (Bundle) null, this.WB);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (c.this.zzcc) {
                c.this.zzcd = null;
            }
            Handler handler = c.this.mHandler;
            handler.sendMessage(handler.obtainMessage(6, this.WB, 1));
        }
    }

    protected final class k extends f {
        private final IBinder VH;

        public k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.VH = iBinder;
        }

        @Override // com.google.android.gms.common.internal.c.f
        protected final boolean VH() throws RemoteException {
            try {
                String interfaceDescriptor = this.VH.getInterfaceDescriptor();
                if (!c.this.getServiceDescriptor().equals(interfaceDescriptor)) {
                    String serviceDescriptor = c.this.getServiceDescriptor();
                    StringBuilder sb = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(serviceDescriptor);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface iInterfaceCreateServiceInterface = c.this.createServiceInterface(this.VH);
                if (iInterfaceCreateServiceInterface == null || !(c.this.zza(2, 4, (int) iInterfaceCreateServiceInterface) || c.this.zza(3, 4, (int) iInterfaceCreateServiceInterface))) {
                    return false;
                }
                c.this.zzcn = null;
                Bundle connectionHint = c.this.getConnectionHint();
                if (c.this.zzcj == null) {
                    return true;
                }
                c.this.zzcj.onConnected(connectionHint);
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }

        @Override // com.google.android.gms.common.internal.c.f
        protected final void Zo(ConnectionResult connectionResult) {
            if (c.this.zzck != null) {
                c.this.zzck.onConnectionFailed(connectionResult);
            }
            c.this.onConnectionFailed(connectionResult);
        }
    }

    protected final class l extends f {
        public l(int i, Bundle bundle) {
            super(i, null);
        }

        @Override // com.google.android.gms.common.internal.c.f
        protected final boolean VH() {
            c.this.zzce.j6(ConnectionResult.qp);
            return true;
        }

        @Override // com.google.android.gms.common.internal.c.f
        protected final void Zo(ConnectionResult connectionResult) {
            c.this.zzce.j6(connectionResult);
            c.this.onConnectionFailed(connectionResult);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected c(Context context, Looper looper, int i2, a aVar, b bVar, String str) {
        com.google.android.gms.common.internal.h hVarJ6 = com.google.android.gms.common.internal.h.j6(context);
        com.google.android.gms.common.c cVarVH = com.google.android.gms.common.c.VH();
        p.u7(aVar);
        p.u7(bVar);
        this(context, looper, hVarJ6, cVarVH, i2, aVar, bVar, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzb zzbVar) {
        this.zzcp = zzbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(int i2) {
        int i3;
        if (zzk()) {
            i3 = 5;
            this.zzco = true;
        } else {
            i3 = 4;
        }
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(i3, this.zzcq.get(), 16));
    }

    private final String zzj() {
        String str = this.zzcm;
        return str == null ? this.mContext.getClass().getName() : str;
    }

    private final boolean zzk() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzci == 3;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzl() throws ClassNotFoundException {
        if (this.zzco || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public void checkAvailabilityAndConnect() {
        int iU7 = this.zzcb.u7(this.mContext, getMinApkVersion());
        if (iU7 == 0) {
            connect(new d());
        } else {
            zza(1, (int) null);
            triggerNotAvailable(new d(), iU7, null);
        }
    }

    protected final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(InterfaceC0111c interfaceC0111c) {
        p.tp(interfaceC0111c, "Connection progress callbacks cannot be null.");
        this.zzce = interfaceC0111c;
        zza(2, (int) null);
    }

    protected abstract T createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzcq.incrementAndGet();
        synchronized (this.zzcg) {
            int size = this.zzcg.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.zzcg.get(i2).j6();
            }
            this.zzcg.clear();
        }
        synchronized (this.zzcc) {
            this.zzcd = null;
        }
        zza(1, (int) null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i2;
        T t;
        m mVar;
        synchronized (this.mLock) {
            i2 = this.zzci;
            t = this.zzcf;
        }
        synchronized (this.zzcc) {
            mVar = this.zzcd;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i2 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i2 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i2 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i2 == 4) {
            printWriter.print("CONNECTED");
        } else if (i2 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (mVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(mVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzbv > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.zzbv;
            String str2 = simpleDateFormat.format(new Date(this.zzbv));
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 21);
            sb.append(j2);
            sb.append(" ");
            sb.append(str2);
            printWriterAppend.println(sb.toString());
        }
        if (this.zzbu > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i3 = this.zzbt;
            if (i3 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i3 != 2) {
                printWriter.append((CharSequence) String.valueOf(i3));
            } else {
                printWriter.append("CAUSE_NETWORK_LOST");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.zzbu;
            String str3 = simpleDateFormat.format(new Date(this.zzbu));
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 21);
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(str3);
            printWriterAppend2.println(sb2.toString());
        }
        if (this.zzbx > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.d.j6(this.zzbw));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j4 = this.zzbx;
            String str4 = simpleDateFormat.format(new Date(this.zzbx));
            StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 21);
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(str4);
            printWriterAppend3.println(sb3.toString());
        }
    }

    public Account getAccount() {
        return null;
    }

    public Feature[] getApiFeatures() {
        return zzbs;
    }

    public final Feature[] getAvailableFeatures() {
        zzb zzbVar = this.zzcp;
        if (zzbVar == null) {
            return null;
        }
        return zzbVar.mb;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.mContext;
    }

    public String getEndpointPackageName() {
        h0 h0Var;
        if (!isConnected() || (h0Var = this.zzby) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return h0Var.j6();
    }

    protected Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    protected String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzbz;
    }

    public int getMinApkVersion() {
        return com.google.android.gms.common.c.j6;
    }

    public void getRemoteService(com.google.android.gms.common.internal.j jVar, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.zzcl);
        getServiceRequest.fY = this.mContext.getPackageName();
        getServiceRequest.zh = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.k2 = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (requiresSignIn()) {
            getServiceRequest.AL = getAccount() != null ? getAccount() : new Account(DEFAULT_ACCOUNT, "com.google");
            if (jVar != null) {
                getServiceRequest.qp = jVar.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.AL = getAccount();
        }
        getServiceRequest.w9 = zzbs;
        getServiceRequest.hK = getApiFeatures();
        try {
            synchronized (this.zzcc) {
                if (this.zzcd != null) {
                    this.zzcd.UF(new i(this, this.zzcq.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            triggerConnectionSuspended(1);
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzcq.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzcq.get());
        }
    }

    protected Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    public final T getService() {
        T t;
        synchronized (this.mLock) {
            if (this.zzci == 5) {
                throw new DeadObjectException();
            }
            checkConnected();
            p.J0(this.zzcf != null, "Client is connected but service is null");
            t = this.zzcf;
        }
        return t;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzcc) {
            if (this.zzcd == null) {
                return null;
            }
            return this.zzcd.asBinder();
        }
    }

    protected abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    protected abstract String getStartServiceAction();

    protected String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzci == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzci == 2 || this.zzci == 3;
        }
        return z;
    }

    protected void onConnectedLocked(T t) {
        this.zzbv = System.currentTimeMillis();
    }

    protected void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzbw = connectionResult.gn();
        this.zzbx = System.currentTimeMillis();
    }

    protected void onConnectionSuspended(int i2) {
        this.zzbt = i2;
        this.zzbu = System.currentTimeMillis();
    }

    protected void onPostInitHandler(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new k(i2, iBinder, bundle)));
    }

    void onSetConnectState(int i2, T t) {
    }

    public void onUserSignOut(e eVar) {
        eVar.j6();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void triggerConnectionSuspended(int i2) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(6, this.zzcq.get(), i2));
    }

    protected void triggerNotAvailable(InterfaceC0111c interfaceC0111c, int i2, PendingIntent pendingIntent) {
        p.tp(interfaceC0111c, "Connection progress callbacks cannot be null.");
        this.zzce = interfaceC0111c;
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(3, this.zzcq.get(), i2, pendingIntent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i2, T t) {
        p.j6((i2 == 4) == (t != null));
        synchronized (this.mLock) {
            this.zzci = i2;
            this.zzcf = t;
            onSetConnectState(i2, t);
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    if (this.zzch != null && this.zzby != null) {
                        String strFH = this.zzby.FH();
                        String strJ6 = this.zzby.j6();
                        StringBuilder sb = new StringBuilder(String.valueOf(strFH).length() + 70 + String.valueOf(strJ6).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(strFH);
                        sb.append(" on ");
                        sb.append(strJ6);
                        Log.e("GmsClient", sb.toString());
                        this.zzca.DW(this.zzby.FH(), this.zzby.j6(), this.zzby.DW(), this.zzch, zzj());
                        this.zzcq.incrementAndGet();
                    }
                    this.zzch = new j(this.zzcq.get());
                    h0 h0Var = (this.zzci != 3 || getLocalStartServiceAction() == null) ? new h0(getStartServicePackage(), getStartServiceAction(), false, ProxyTextView.INPUTTYPE_textPassword) : new h0(getContext().getPackageName(), getLocalStartServiceAction(), true, ProxyTextView.INPUTTYPE_textPassword);
                    this.zzby = h0Var;
                    if (!this.zzca.FH(new h.a(h0Var.FH(), this.zzby.j6(), this.zzby.DW()), this.zzch, zzj())) {
                        String strFH2 = this.zzby.FH();
                        String strJ62 = this.zzby.j6();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strFH2).length() + 34 + String.valueOf(strJ62).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(strFH2);
                        sb2.append(" on ");
                        sb2.append(strJ62);
                        Log.e("GmsClient", sb2.toString());
                        zza(16, (Bundle) null, this.zzcq.get());
                    }
                } else if (i2 == 4) {
                    onConnectedLocked(t);
                }
            } else if (this.zzch != null) {
                this.zzca.DW(getStartServiceAction(), getStartServicePackage(), ProxyTextView.INPUTTYPE_textPassword, this.zzch, zzj());
                this.zzch = null;
            }
        }
    }

    protected c(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.c cVar, int i2, a aVar, b bVar, String str) {
        this.mLock = new Object();
        this.zzcc = new Object();
        this.zzcg = new ArrayList<>();
        this.zzci = 1;
        this.zzcn = null;
        this.zzco = false;
        this.zzcp = null;
        this.zzcq = new AtomicInteger(0);
        p.tp(context, "Context must not be null");
        this.mContext = context;
        p.tp(looper, "Looper must not be null");
        this.zzbz = looper;
        p.tp(hVar, "Supervisor must not be null");
        this.zzca = hVar;
        p.tp(cVar, "API availability must not be null");
        this.zzcb = cVar;
        this.mHandler = new g(looper);
        this.zzcl = i2;
        this.zzcj = aVar;
        this.zzck = bVar;
        this.zzcm = str;
    }

    protected c(Context context, Handler handler, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.c cVar, int i2, a aVar, b bVar) {
        this.mLock = new Object();
        this.zzcc = new Object();
        this.zzcg = new ArrayList<>();
        this.zzci = 1;
        this.zzcn = null;
        this.zzco = false;
        this.zzcp = null;
        this.zzcq = new AtomicInteger(0);
        p.tp(context, "Context must not be null");
        this.mContext = context;
        p.tp(handler, "Handler must not be null");
        this.mHandler = handler;
        this.zzbz = handler.getLooper();
        p.tp(hVar, "Supervisor must not be null");
        this.zzca = hVar;
        p.tp(cVar, "API availability must not be null");
        this.zzcb = cVar;
        this.zzcl = i2;
        this.zzcj = aVar;
        this.zzck = bVar;
        this.zzcm = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zza(int i2, int i3, T t) {
        synchronized (this.mLock) {
            if (this.zzci != i2) {
                return false;
            }
            zza(i3, (int) t);
            return true;
        }
    }

    protected final void zza(int i2, Bundle bundle, int i3) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new l(i2, null)));
    }
}
